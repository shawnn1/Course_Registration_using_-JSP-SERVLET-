<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  </head>
  <body>
  <script>
   $(document).ready(function() {
      $("#signup-btn").click(function() {
         $("#signup-modal").show();
      });
   });
</script>
  <div id="signup-modal" style="display: none;">
   <div id="signup-form">
      <form action="<%= request.getContextPath()%>/signup" method="post">
      <div class="mb-3">
        <label class="form-label">Role:</label>
        <input class="form-control" type="text" id="role" name="role">
      </div>
      <div class="mb-3">
        <label class="form-label">User Name:</label>
        <input class="form-control" type="text" id="username" name="username">
      </div>
      <div class="mb-3">
        <label class="form-label">Password:</label>
        <input class="form-control" type="password" id="password" name="password">
      </div>
      
      <input type="submit" class="btn btn-primary ">
     </form>
   </div>
</div>
<style>
   #signup-modal {
      position: fixed;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      background-color: rgba(0, 0, 0, 0.5);
      z-index: 9999;
      display: none;
   }
   #signup-btn{
   
 
  width:100px;
 
 
   }

   #signup-form {
      position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      background-color: white;
      width: 50%;
      padding: 20px;
   }
</style>








  
     <div class="container-fluid">
      
      <div class="d-flex justify-content-center align-items-center min-vh-100">
        <div>
        <div class="row">
      
        <h1 class="bg-primary">COURSE REGISTRATION</h1>
        
         
        </div>
        <div class="row">
        
        <a href="login.jsp" class="col-6"><button type="button" class="btn btn-primary btn-lg">LOG IN</button></a>
        <button type="button" id="signup-btn" class="btn btn-primary btn-lg">SignUp</button>
       
        </div>
        </div>
        
      </div>
     </div>
  
  
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  </body>
</html>