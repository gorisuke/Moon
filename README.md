# Scpipts Repository

## Install
1. Install by below methods
    - Using brew
        1. Install by brew
            - ```brew install Virtuslab/scala-cli/scala-cli```
    - Using Curl
        1. Fetch and Exec
            - ```curl -sSLf https://virtuslab.github.io/scala-cli-packages/scala-setup.sh | sh```
    - Using Git Source
        1. Fetch by git
            - ```curl -fL https://github.com/Virtuslab/scala-cli/releases/latest/download/scala-cli-x86_64-pc-linux.gz | gzip -d > scala-cli```
        2. Add exec permission
            - ```chmod +x scala-cli```
        3. Move to application dir
            - ```sudo mv scala-cli /usr/local/bin/scala-cli```
2. Check working
    - ```scala-cli --version```
    - ```OutPuts
      Scala CLI version: 0.1.18
      Scala version (default): 3.2.1
      ```

## Commands
- Format
  - ```scala-cli fmt .```
- Run
  - ```scala-cli sample.scala  -- arg```
- Package
  - ```scala-cli package sample.scala```