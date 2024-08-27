- ubuntu 22.04 安裝 tomcat 9 發現他只支援到 java 11 怎麼辦?解法如下

- vim /usr/libexec/tomcat9/tomcat-locate-java.sh

- 把裡面的版本迴圈加上 17 重開就可以了，但別忘記一開始要先裝好 java 17 jdk

- jar cvf web.war WEB-INF 打包命令，記得 lib 也要在 WEB-INF 裡面

- sudo cp web.war /var/lib/tomcat9/webapps/

還是用 maven + spring boot 吧......依賴都要自己手動複製 jar 處理太麻煩了吧


vscode settings.json 如下
```
{
    "java.project.sourcePaths": ["src"],
    "java.project.outputPath": "WEB-INF/classes",
    "java.project.referencedLibraries": [
        "lib/**/*.jar"
    ]
}
```
