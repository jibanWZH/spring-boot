<html>
<head><title>展示用户数据</title>
  <meta charset="UTF-8"></meta>
</head>
  <body>
      <table border="1" align="center" width="50%">
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Age</th>
        </tr>
          <#list List as user >
            <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
          </tr>
          </#list>
      </table>
  </body>
</html>