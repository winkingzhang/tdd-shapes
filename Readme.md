# Introduction

## TDD Shapes exercise

To start, run through the "Getting Started" steps below for either CSharp, Kotlin or Typescript (whichever you are most comfortable working with).

When everything is installed and you have a failing test, you are ready to pair up and work on the next steps. Fixing the test is part of the workshop, we will go through it together.

_This workshop assumes that you're using a *Macbook*. Steps will vary for Windows and Linux users._

# Getting Started: CSharp

First, you will need:

- dotnet 6.0 SDK or newer
  - `brew install dotnet`
- A Javascript IDE (like Visual Studio Code)
  - `brew install --cask visual-studio-code`

Clone this repository, then use `dotnet` to build the project. You should see a single test failure.
```sh
$ cd path/to/tdd-shapes
tdd-shapes$ dotnet test
```

# Getting Started: Kotlin

First, you will need:

- Java 11 or later
  - `brew install openjdk-11`
- A Java IDE (like IntelliJ)
  - `brew install --cask intellij-idea-ce`
- gradle
  - `brew install gradle`

Clone this repository, then use `gradle` to build the project. You should see a single test failure.
```sh
$ cd path/to/tdd-shapes
tdd-shapes$ gradle build
```

# Getting Started: Typescript

First, you will need:

- Node.js 14 or newer
  - `brew install node@14`
- A Javascript IDE (like Visual Studio Code)
  - `brew install --cask visual-studio-code`

Clone this repository, then use `npm` to build the project. You should see a single test failure.
```sh
$ cd path/to/tdd-shapes
tdd-shapes$ npm i
tdd-shapes$ npm test
```
