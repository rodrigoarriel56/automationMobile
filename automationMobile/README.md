### Iniciando a Automação de Testes com Appium. O Appium foi desenvolvido pelo mesmo grupo do Selenium, vou citar alguém em especial "Kazuaki MATSUO", apelido de KazuCocoa, como eu acompanho direto a comunidade ele é o cara que dar manutenção no Appium Client. Atualmente implementou várias novidades, uma delas é Opencv dentro do Appium.

#### Pre-conditions (Precisamos primeiro instalar as Ferramentas/Softwares):

JAVA - Linguagem de Programação que vamos usar.
JAVA - Version i.8

-> Windows (https://www.java.com/pt_BR/) 
    Abra o Internet Explorer(ou seu navegador de preferencia) e acesse Java.com
	Clique no botão Download gratuito do Java e, depois, em Concordar e Iniciar o Download Gratuito.
 	Se for solicitada uma senha de administrador ou confirmação, digite a senha ou confirme.
	Na Barra de notificação, clique em Executar. Se for solicitada uma senha de administrador ou confirmação,
	digite a senha ou confirme.
	Selecione Instalar > Fechar.
	Se você estiver tendo problemas para instalar ou usar o Java, procure por respostas na Central de Ajuda do Java.
	 
Observação
	Em computadores com o Windows 8.1, o Java só funcionará no Internet Explorer para área de trabalho.

-> Linux (sudo apt-get install java)
	Altere o diretório para o local onde você gostaria que o JRE fosse instalado. cd / directory_path_name. Por exemplo, 
	para instalar o software no diretório /usr/java: ...
	Mova os binários de arquivo compactado . tar. ...
	Descompacte o tarball (arquivo compactado TAR) e instale o Java. Em processadores SPARC de 64 bits:
    
    
-> MAC (brew install java)
	Faça download do arquivo jre-8u65-macosx-x64.dmg.
	Revise e concorde com os termos do contrato de licença antes de fazer o download do arquivo.
	Clique duas vezes no arquivo .dmg para inicializá-lo
	Clique duas vezes no ícone do pacote para iniciar o Assistente de instalação

->Install Git (https://git-scm.com/downloads)

->Install nodejs (https://nodejs.org/en/download/)

## Repositorio

-> Git - Nosso projeto será versionado, ou seja o código fonte vai ser armazendo em versões (distributed version control system).  
-> Nodejs - O Appium Server é puro JavaScript e algumas partes em Java, algumas coisas estão em .jar como alguns drivers.  


## Appium-doctor
Verifica se todas as dependências do Appium são atendidas e se todas as dependências estão configuradas corretamente. Para instalar o appium-doctor basta colar no seu terminal:

npm install -g appium-doctor  # instalar o appium-doctor
```
Uma vez que o node.js, npm e o appium-doctor estão instalados, você pode usar o comando abaixo para verificar se todas as dependências do appium são atendidas:

appium-doctor             # verificar todas as dependencias necessárias para usar o appium
appium-doctor --android   # verificar as dependências somente para android
appium-doctor --ios       # verificar as dependências somente para ios
```

## Instalando o Appium

### Appium Server
O Appium posso dizer que é dividido em duas partes Client e Server. O Client que é a Biblioteca que vai desenvolver os comandos, a mesma é dividido em duas (appium_lib, appium_lib_core), appium_lib ela depende do appium_lib_core, e a appium_lib_core depede do selenium-webdriver. Podemos afirmar que existe várias dependencias uma vez instalada da forma errada vai dar problema no Appium.

Execute o comando abaixo para instalar o Appium:
```bash
npm install -g appium
```

Após o término, vamos iniciar o servidor do Appium. No linux é indicado usar o Sudo para dar as devidas permissões.

No Windows abra o terminal como Admin e digite o comamdo abaixo: 
```bash
appium
```

Linux:
```bash
sudo appium
```

> Para atualizar o Appium, você precisará executar `npm update -g appium`.

## Agora vamos ao Projeto de Fato:

### 1. Download Project



### 2. Installing depencias
Instalação e configuração do projeto, encontra-se toda no arquivo pom.xml


### 3. Run Tests: 
Execução dos testes: Como se trata de um projeto em Appium + Cucumber + Java, para a execução dos testes, devemos seguir o seguinte caminho: /automationMobile/src/test/java/tests/cucumber/StartTest.java

Nesta classe devemos acionar a execução com Junit 


### Run with tags
Type this in the tests folder:
```shell
bundle exec cucumber --tags @run
```
Or
```shell
bundle exec cucumber -t @run
```

### Basic Structure Project:

**Specfications:** Where is the functionality of the project.

**Steps Definitions:** Where the actual tests are performed.

**Pages:** Where the elements and methods of a particular page are mapped.

**Support:** Where is the project settings.

**Results:** Where is the result of the tests and reports.

**Data:** Mass of Data for tests.

 **Framework:** The framework folder contains classes or modules with global functions to reduce code in Pages.


### Basic BDD:
Cucumber executes executable specifications written in plain language and produces reports indicating whether the software behaves according to the specification or not.
- **Feature** The purpose of the Feature keyword is to provide a high-level description of a software feature, and to group related scenarios.
- **Scenario** is a written example to illustrate a specific aspect of application behavior.
- Each step starts with Given, When, Then, And, or But. 
- **Given** steps are used to describe the initial context of the system.  
- **When** steps are used to describe an event, or an action.  
- **Then** steps are used to describe an expected outcome, or result.  
- **And, But** use If you have several Given’s, When’s, or Thens.
- **Data Tables** are handy for passing a list of values to a step definition.

**To know if your bdd is long, it should contain up to 5 steps of the same type.**


### Logs:  
In computing, data logging is an expression used to describe the process of recording relevant events in a computer system.  

- Generates Cucumber HTML Report with logs.  
- Get the browser and Selenium logs.  

### References:
https://github.com/appium/ruby_lib  
https://github.com/appium/ruby_lib_core/  
https://docs.cucumber.io/gherkin/reference/