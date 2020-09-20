<template>
    <div id="App">
      <header class="header">
         <router-link to="/">
          <img src="http://placehold.it/50x50" alt=" " class="logo_img" />
         </router-link>
        <i class="material-icons">search</i>
        <input class="start_page_search" type="search " placeholder=" search " />
        <router-link class="login" to="/login">login</router-link>
        <router-link class="register" to="/register">register</router-link>

      </header>
       <nav class="nav_bar">
        <a href="# " class="nav_link">Вкладиші</a>
        <a href="# " class="nav_link">
            <router-link class ="stickers" to="/stickers"> Наклейки
            </router-link>
        </a>
        <a href="# " class="nav_link">Картинки</a>
        <a href="# " class="nav_link">Жувальні гумки</a>
        <a href="# " class="nav_link">Обгортки</a>
        <a href="# " class="nav_link">Альбоми</a>
      </nav>
      <router-view/>
       <footer class="footer">
        <nav class="footer_nav_bar">
          <a href="# " class="nav_link">Features</a>
          <a href="# " class="nav_link">About</a>
          <a href="# " class="nav_link">Tutorials</a>
          <a href="# " class="nav_link">Contact</a>
          <a href="# " class="nav_link">Downloads</a>
        </nav>
        <p class="adress_company">Some Address</p>
        <p class="companyName">© My Company Name</p>
      </footer>
    </div>
</template>

<script>
export default {
  name: "app"
};
</script>

<style>
body {
  box-sizing: border-box;
  margin: 0 auto;
  width: 80%;
}

.header {
  display: flex;
  align-items: center;
  margin: 0 auto;
  justify-content: space-between;
}

.header img {
  margin-right: 5%;
}

.start_page_search {
  width: 70%;
  margin: 0 25px;
  height: 25px;
  border-radius: 20px;
  outline: none;
  position: relative;
}

header a {
  width: 10%;
  text-decoration: none;
  color: black;
  text-align: center;
}

.register {
  border-left: 1px solid black;
}

.nav_bar {
  display: flex;
  flex-direction: row;
  margin-top: 30px;
  margin-bottom: 30px;
}

.nav_link {
  margin: 0 auto;
  display: block;
  text-decoration: none;
  color: black;
  text-align: center;
  width: 15%;
  border-left: 1px solid black;
}

.nav_link:first-child {
  border-left: none;
}

.footer_nav_bar {
  margin: 0 auto;
  width: 70%;
  display: flex;
  flex-direction: row;
  margin-top: 30px;
  margin-bottom: 70px;
}

.adress_company,
.companyName {
  text-align: center;
}
</style>
