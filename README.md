# GitHub Copilot Agent mode - Spring Boot

This repository is a sample project for GitHub Copilot Agent mode. It is a Spring Boot application that uses GitHub Copilot to generate code.

![Image](https://github.com/user-attachments/assets/b027bc53-2178-4b78-b466-7616c7d5fbd9)

## Description

### 1. What is GitHub Copilot Agent mode?

GitHub Copilot Agent mode is a new feature of GitHub Copilot that allows you to use GitHub Copilot as an agent to generate code. GitHub Copilot's Agent Mode was introduced in February 2025 as an innovative feature that ushers in a new era of AI-assisted development. This feature goes beyond traditional code completion tools to enable autonomous task execution throughout the development process.

## 2. Task Execution Engine
The true innovation of Agent Mode is its task execution capability, which goes beyond code generation. Whereas the previous Copilot was simply a “Code Completion Tool,” Agent Mode employs a completely task-oriented architecture. The task execution engine consists of the following major components

- **Task decomposition engine**: analyzes the user's natural language instructions and automatically decomposes the necessary subtasks

- **Dependency mapper**: real-time analysis of file dependencies within a project

- **Execution Context Manager**: Continuously monitors the state of the development environment (open files, running processes, etc.)

- **Self-healing module**: Loop mechanism that detects runtime errors and attempts to automatically correct them

Of particular note is the self-healing function, which has the ability to analyze the error trace in the event of a test failure and simultaneously fix multiple related files. For example, if the front end needs to be adjusted due to a change in API endpoints, an integrated response is possible, fixing both back-end and front-end code simultaneously.

## 3. Comparison with Traditional Copilot Development

The fundamental difference between traditional Copilot development (Development as Copilot) and Agent Mode development (Development as Agent) is the level of AI involvement and the changing role of the developer. The following comparison table clearly illustrates the differences between the two:

|Comparison Item|Conventional Copilot Development|Agent Mode Development|
|---|---|---|
|Task Scope|Single file/current line|Entire project|
|Execution unit|Code snippet|Complete functional implementation|
|Error handling|Developer dependencies|Automatic diagnosis and correction|
|Developer Role|Key Implementer|Supervisor/Designer|
|Feedback loop|Manual testing|Automated CI/CD coordination|
|Context dependency|Current edit position|Project-wide context

## 4. Advantages of Agent Mode

The benefits of the GitHub Copilot Agent Mode go beyond mere productivity gains to promote an essential transformation of software development. From a technical perspective, it has achieved a multidimensional evolution in quality assurance through multi-file processing and self-healing capabilities; from a process perspective, it has optimized the entire development lifecycle; and from an organizational perspective, it has enhanced technical debt management and compliance handling. As AI and humans collaborate more deeply in the future, the role of developers is expected to shift from “code writers” to “those who design systems and direct AI. Utilizing this technology under appropriate governance will further democratize software development and accelerate technological innovation.

## Demo

## 1. First prompt for GitHub Copilot Agent mode

```text
I am creating a web application to manage users. We would like to fulfill the following requirements

- Register new users, browse all users, browse individual users, change registration information, delete all registration information, and delete individual registration information.
- Each operation by REST API
- Operation from a browser
- UI is created using Thymeleaf
- UI should be designed using CSS
- Use H2 database for data storage

Create your application based on these requirements.
```


## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## References

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/f3ac65a05ed8c8ea70b653875ccac0c6dbc10ba1/LICENSE)

## Author

- github: <https://github.com/shinyay>
- twitter: <https://twitter.com/yanashin18618>
- mastodon: <https://mastodon.social/@yanashin>
