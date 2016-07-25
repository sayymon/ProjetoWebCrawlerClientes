# Assegurar que o diretorio %WAS_HOME%\scriptLibraries\utilities\V70 contenha o arquivo WasCdsUtilities$py.class
# Executar o comando wsadmin.bat (.sh) -lang jython -f nomeDoArquivo.py no diretorio %WAS_HOME%\profiles\NomeDoProfile\bin
# Apos a execucao do script, reinicar o servidor. Este script não reinicia automaticamente pois outros scripts podem ser executados

import WasCdsUtilities

################################ AJUSTES MANUAIS ################################
propertiesDir = "" 
propertiesFile = "config-buscadorPotenciaisClientesEAR-desenv.properties" 

################################ LEITURA DE PROPRIEDADES ################################
print "Iniciando leitura de arquivo de propriedades... \n" 
serverName = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "serverName")
applicationName = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "applicationName")

jdbc_buscadorPotenciaisClientes_u01Alias = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u01Alias")
jdbc_buscadorPotenciaisClientes_u01User = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u01User")
jdbc_buscadorPotenciaisClientes_u01Password = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u01Password")
jdbc_buscadorPotenciaisClientes_u01Host = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u01Host")
jdbc_buscadorPotenciaisClientes_u01Server = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u01Server")
jdbc_buscadorPotenciaisClientes_u01Database = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u01Database")
jdbc_buscadorPotenciaisClientes_u01Port = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u01Port")

jdbc_buscadorPotenciaisClientes_pol1Alias = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_pol1Alias")
jdbc_buscadorPotenciaisClientes_pol1User = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_pol1User")
jdbc_buscadorPotenciaisClientes_pol1Password = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_pol1Password")
jdbc_buscadorPotenciaisClientes_pol1Host = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_pol1Host")
jdbc_buscadorPotenciaisClientes_pol1Server = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_pol1Server")
jdbc_buscadorPotenciaisClientes_pol1Database = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_pol1Database")
jdbc_buscadorPotenciaisClientes_pol1Port = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_pol1Port")

jdbc_buscadorPotenciaisClientes_u18Alias = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u18Alias")
jdbc_buscadorPotenciaisClientes_u18User = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u18User")
jdbc_buscadorPotenciaisClientes_u18Password = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u18Password")
jdbc_buscadorPotenciaisClientes_u18Host = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u18Host")
jdbc_buscadorPotenciaisClientes_u18Server = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u18Server")
jdbc_buscadorPotenciaisClientes_u18Database = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u18Database")
jdbc_buscadorPotenciaisClientes_u18Port = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_u18Port")

jdbc_buscadorPotenciaisClientes_orclAlias = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_orclAlias")
jdbc_buscadorPotenciaisClientes_orclUser = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_orclUser")
jdbc_buscadorPotenciaisClientes_orclPassword = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_orclPassword")
jdbc_buscadorPotenciaisClientes_orclUrl = WasCdsUtilities.readPropertyFile(propertiesDir + propertiesFile, "jdbc_buscadorPotenciaisClientes_orclUrl")

print "serverName: " + serverName
print "applicationName: " + applicationName + "\n"

print "jdbc_buscadorPotenciaisClientes_u01Alias: " + jdbc_buscadorPotenciaisClientes_u01Alias
print "jdbc_buscadorPotenciaisClientes_u01User: " + jdbc_buscadorPotenciaisClientes_u01User
print "jdbc_buscadorPotenciaisClientes_u01Password: " + jdbc_buscadorPotenciaisClientes_u01Password
print "jdbc_buscadorPotenciaisClientes_u01Host: " + jdbc_buscadorPotenciaisClientes_u01Host
print "jdbc_buscadorPotenciaisClientes_u01Server: " + jdbc_buscadorPotenciaisClientes_u01Server
print "jdbc_buscadorPotenciaisClientes_u01Database: " + jdbc_buscadorPotenciaisClientes_u01Database
print "jdbc_buscadorPotenciaisClientes_u01Port: " + jdbc_buscadorPotenciaisClientes_u01Port + "\n"

print "jdbc_buscadorPotenciaisClientes_pol1Alias: " + jdbc_buscadorPotenciaisClientes_pol1Alias
print "jdbc_buscadorPotenciaisClientes_pol1User: " + jdbc_buscadorPotenciaisClientes_pol1User
print "jdbc_buscadorPotenciaisClientes_pol1Password: " + jdbc_buscadorPotenciaisClientes_pol1Password
print "jdbc_buscadorPotenciaisClientes_pol1Host: " + jdbc_buscadorPotenciaisClientes_pol1Host
print "jdbc_buscadorPotenciaisClientes_pol1Server: " + jdbc_buscadorPotenciaisClientes_pol1Server
print "jdbc_buscadorPotenciaisClientes_pol1Database: " + jdbc_buscadorPotenciaisClientes_pol1Database
print "jdbc_buscadorPotenciaisClientes_pol1Port: " + jdbc_buscadorPotenciaisClientes_pol1Port + "\n"

print "jdbc_buscadorPotenciaisClientes_u18Alias: " + jdbc_buscadorPotenciaisClientes_u18Alias
print "jdbc_buscadorPotenciaisClientes_u18User: " + jdbc_buscadorPotenciaisClientes_u18User
print "jdbc_buscadorPotenciaisClientes_u18Password: " + jdbc_buscadorPotenciaisClientes_u18Password
print "jdbc_buscadorPotenciaisClientes_u18Host: " + jdbc_buscadorPotenciaisClientes_u18Host
print "jdbc_buscadorPotenciaisClientes_u18Server: " + jdbc_buscadorPotenciaisClientes_u18Server
print "jdbc_buscadorPotenciaisClientes_u18Database: " + jdbc_buscadorPotenciaisClientes_u18Database
print "jdbc_buscadorPotenciaisClientes_u18Port: " + jdbc_buscadorPotenciaisClientes_u18Port + "\n"

print "jdbc_buscadorPotenciaisClientes_orclAlias: " + jdbc_buscadorPotenciaisClientes_orclAlias
print "jdbc_buscadorPotenciaisClientes_orclUser: " + jdbc_buscadorPotenciaisClientes_orclUser
print "jdbc_buscadorPotenciaisClientes_orclPassword: " + jdbc_buscadorPotenciaisClientes_orclPassword
print "jdbc_buscadorPotenciaisClientes_orclUrl: " + jdbc_buscadorPotenciaisClientes_orclUrl + "\n"

###############################################################################################
######################################## CONFIGURACOES ########################################
###############################################################################################
print "Iniciando configuracao WAS para a aplicacao " + applicationName + "... \n" 

################################ ALIAS DE AUTENTICACAO ################################
print "\nCriando alias de autenticacao... \n" 
WasCdsUtilities.createJAASAuthData(jdbc_buscadorPotenciaisClientes_u01Alias, jdbc_buscadorPotenciaisClientes_u01User, jdbc_buscadorPotenciaisClientes_u01Password)
WasCdsUtilities.createJAASAuthData(jdbc_buscadorPotenciaisClientes_pol1Alias, jdbc_buscadorPotenciaisClientes_pol1User, jdbc_buscadorPotenciaisClientes_pol1Password)
WasCdsUtilities.createJAASAuthData(jdbc_buscadorPotenciaisClientes_u18Alias, jdbc_buscadorPotenciaisClientes_u18User, jdbc_buscadorPotenciaisClientes_u18Password)
WasCdsUtilities.createJAASAuthData(jdbc_buscadorPotenciaisClientes_orclAlias, jdbc_buscadorPotenciaisClientes_orclUser, jdbc_buscadorPotenciaisClientes_orclPassword)

################################ DATASOURCES ################################
print "\nCriando datasources... \n" 
WasCdsUtilities.createInformixDataSource(serverName, jdbc_buscadorPotenciaisClientes_u01Alias, "jdbc_buscadorPotenciaisClientes_u01", "jdbc/novo_buscadorPotenciaisClientes_u01", jdbc_buscadorPotenciaisClientes_u01Host, jdbc_buscadorPotenciaisClientes_u01Server, jdbc_buscadorPotenciaisClientes_u01Database, jdbc_buscadorPotenciaisClientes_u01Port)
WasCdsUtilities.createInformixDataSource(serverName, jdbc_buscadorPotenciaisClientes_pol1Alias, "jdbc_buscadorPotenciaisClientes_pol1", "jdbc/novo_buscadorPotenciaisClientes_pol1", jdbc_buscadorPotenciaisClientes_pol1Host, jdbc_buscadorPotenciaisClientes_pol1Server, jdbc_buscadorPotenciaisClientes_pol1Database, jdbc_buscadorPotenciaisClientes_pol1Port)
WasCdsUtilities.createInformixDataSource(serverName, jdbc_buscadorPotenciaisClientes_u18Alias, "jdbc_buscadorPotenciaisClientes_u18", "jdbc/novo_buscadorPotenciaisClientes_u18", jdbc_buscadorPotenciaisClientes_u18Host, jdbc_buscadorPotenciaisClientes_u18Server, jdbc_buscadorPotenciaisClientes_u18Database, jdbc_buscadorPotenciaisClientes_u18Port)
WasCdsUtilities.createOracleDataSource(serverName, jdbc_buscadorPotenciaisClientes_orclAlias, "jdbc_buscadorPotenciaisClientes_orcl", "jdbc/novo_buscadorPotenciaisClientes_orcl", jdbc_buscadorPotenciaisClientes_orclUrl)
