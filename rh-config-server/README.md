## OBS: 

### For this project, it was created a public project in git hub with the properties: 
* rh-trabalhador-test.properties
* rh-trapalhador.properties

In the following url:
https://github.com/danielPaulinoMesquita/curso-springcloud-config/tree/main

Now, that repository is private to avoid configs and enviorements, to discovers and sees the configs it was necessary declare 
new values from spring cloud git in properties. like:
spring.cloud.config.server.git.username=${GITHUB_USER}
spring.cloud.config.server.git.password=${GITHUB_PRIVATE_KEY}

these ${} are variables declared in IDE or could be declared in envs at server.
