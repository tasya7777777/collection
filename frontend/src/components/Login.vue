<template>
    <div>
       <div class="imgcontainer">
          <img src="img_avatar2.png" alt="Avatar" class="avatar">
       </div>
        <form action="" class="piy">
            <h3 class="h3"> Please sign in</h3>
            <input id="userName" type="text" placeholder="name" class="box">
            <input id="userPassword" type="password" placeholder="password" class="box">
            <div class="checkbox">
                <label><input type="checkbox" value="remember-me"> Remember me</label>
            </div>
            <button>Log in</button>
        </form>
   </div>
</template>

<script>
import http from "../http-common";

export default {
  name: "login"
};
</script>

<style>
.piy{
   margin:  auto;
   width: 20rem;
   padding: 1rem;
   box-shadow: 0 1px 4px rgba(0,0,0,0.3);
   border-radius: 5px;

}
.piy .box{
box-sizing: border-box;
display: block;
margin-bottom: .5rem;
width: 100%;
border-radius: 2px;
outline: 0 none;
border: 1px solid lightgray;
padding: 5px 10px;
}
.piy button{
    display: block;
    background-color: rgb(131, 197, 17);
    color: rgb(255, 255, 255);
    border-radius: 5px;
    outline: 0 none;
    border: 0 none;
    margin: auto;
    padding: 10px 25px;
}
.piy button:hover {
    background-color: #2ae085; /* Green */
    color: white;
  }
html{
height: 100%    ;
}
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

/* Avatar image */
img.avatar {
    width: 40%;
    border-radius: 50%;
}
.checkbox{
    text-align: left;
}
</style>