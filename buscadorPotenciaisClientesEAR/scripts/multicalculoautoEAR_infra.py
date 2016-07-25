# Assegurar que o diretorio %WAS_HOME%\scriptLibraries\utilities\V70 contenha o arquivo WasCdsUtilities$py.class
# Executar o comando wsadmin.bat (.sh) -lang jython -f nomeDoArquivo.py no diretorio %WAS_HOME%\profiles\NomeDoProfile\bin
# Apos a execucao do script, reinicar o servidor. Este script não reinicia automaticamente pois outros scripts podem ser executados

import WasCdsUtilities

################################ AJUSTES MANUAIS ################################
propertiesDir = "" 
propertiesFile = "config-buscadorPotenciaisClientesEAR_infra-desenv.properties" 

################################ LEITURA DE PROPRIEDADES ################################
print "Iniciando leitura de arquivo de propriedades... \n" 
serverName = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "serverName")
informixLibPath = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "informixLibPath")
oracleLibPath = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "oracleLibPath")
heapStartSize = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "heapStartSize")
heapMaxSize = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "heapMaxSize")
osbautoCertKeyStore = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "osbautoCertKeyStore")
osbautoCertHost = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "osbautoCertHost")
osbautoCertPort = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "osbautoCertPort")
osbcorpCertKeyStore = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "osbcorpCertKeyStore")
osbcorpCertHost = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "osbcorpCertHost")
osbcorpCertPort = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "osbcorpCertPort")

print "serverName: " + serverName
print "informixLibPath: " + informixLibPath
print "oracleLibPath: " + oracleLibPath
print "heapStartSize: " + heapStartSize
print "heapMaxSize: " + heapMaxSize
print "osbautoCertKeyStore: " + osbautoCertKeyStore
print "osbautoCertHost: " + osbautoCertHost
print "osbautoCertPort: " + osbautoCertPort
print "osbcorpCertKeyStore: " + osbcorpCertKeyStore
print "osbcorpCertHost: " + osbcorpCertHost
print "osbcorpCertPort: " + osbcorpCertPort + "\n" 

###############################################################################################
######################################## CONFIGURACOES ########################################
###############################################################################################
print "Iniciando configuracoes de infra estrutura... \n" 

################################ BIBLIOTECAS JDBC ################################
print "Registrando caminhos das bibliotecas JDBC... \n" 
WasCdsUtilities.setupInformixJdbcDriverPath(serverName, informixLibPath)
WasCdsUtilities.setupOracleJdbcDriverPath(serverName, oracleLibPath)

################################ PROVEDORES JDBC ################################
print "Criando provedores JDBC... \n" 
WasCdsUtilities.createInformixJDBCProvider(serverName)
WasCdsUtilities.createOracleJDBCProvider(serverName)

################################ CERTIFICADOS SOA ################################
print "Importando certificados SOA... \n" 
WasCdsUtilities.importCertifiedFromPort(osbautoCertHost, osbautoCertPort, osbautoCertKeyStore, "osbauto")
WasCdsUtilities.importCertifiedFromPort(osbcorpCertHost, osbcorpCertPort, osbcorpCertKeyStore, "osbcorp")

################################ MQ ADAPTER RECENTE ################################
print "\nAlterando WebSphere MQ resource adapter, para utilizar a versao mais recente... \n" 
WasCdsUtilities.setupWebSphereMQResourceAdapter()

################################ TAMANHO DA HEAP ################################
print "\nConfigurando tamanho da Heap... \n" 
WasCdsUtilities.setupHeapSize(serverName, heapStartSize, heapMaxSize)
