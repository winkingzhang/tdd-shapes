# Introduction

## TDD Shapes exercise

To start, run through the "Getting Started" steps below for either CSharp, Kotlin or Typescript (whichever you are most comfortable working with).

When everything is installed and you have a failing test, you are ready to pair up and work on the next steps. Fixing the test is part of the workshop, we will go through it together.

_This workshop assumes that you're using a *Windows*. Steps will vary for Macbook and Linux users._

## Pre-requirements

Please make sure install [`choco`](https://chocolatey.org/install) first, otherwise you have to install everything manually
```powershell
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
```

# Getting Started: CSharp

First, you will need:

- dotnet 6.0 SDK or newer
  - `choco install dotnet-sdk -y`
- A Javascript IDE (like Visual Studio 2022 Community)
  - `choco install visualstudio2022community -y`

Clone this repository, then use `dotnet` to build the project. You should see a single test failure.
```cmd
%windir%> cd path/to/tdd-shapes
tdd-shapes> dotnet test
```

# Getting Started: Kotlin

First, you will need:

- Java 11 or later
  - `choco install openjdk11 -y`
- A Java IDE (like IntelliJ)
  - `choco install intellijidea-community -y`
- gradle
  - `choco install gradle -y`

Clone this repository, then use `gradle` to build the project. You should see a single test failure.
```cmd
%windir%> cd path/to/tdd-shapes
tdd-shapes>  gradle build
```

# Getting Started: Typescript

First, you will need:

- Node.js 14 or newer
  - `choco install nodejs-lts --version=14.19.1 -y`
- A Javascript IDE (like Visual Studio Code)
  - `choco install vscode -y`

Clone this repository, then use `npm` to build the project. You should see a single test failure.
```cmd
%windir%> cd path/to/tdd-shapes
tdd-shapes> npm i
tdd-shapes> npm test
```
