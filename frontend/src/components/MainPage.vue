<template>
    <div>
        <header class="header">
            <img src="http://placehold.it/50x50" alt=" " class="logo_img ">
            <i class="material-icons ">search</i>
            <input class="start_page_search " type="search " placeholder=" search ">
            <router-link class="login" to="/login">login</router-link>
            <a href="# " class="register ">register</a>
        </header>
        <nav class="nav_bar ">
            <a href="# " class="nav_link ">Вкладиші</a>
            <a href="# " class="nav_link ">Наклейки</a>
            <a href="# " class="nav_link ">Картинки</a>
            <a href="# " class="nav_link ">Жувальні гумки</a>
            <a href="# " class="nav_link ">Обгортки</a>
            <a href="# " class="nav_link ">Альбоми</a>
        </nav>
        <content class="content ">
            <div class="content_header ">
                <h2 class="start_header ">Tagline With Your Unique Selling Proposition</h2>
                <p class="conternt_header_text ">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Optio quisquam, at libero a, error voluptates obcaecati sequi reiciendis, repellendus ipsa quaerat non similique natus amet quae doloribus tempore repudiandae porro.</p>
            </div>
            <div class="cards ">
                <h3 class="cards_header ">Останні додані</h3>
                <div class="card_carusel ">
                
                
                
                
                
                
                
                                    <div class="card " v-for="(card, index) in cards" :key="index">
                                        <router-link :to="{
                                                name: 'card-details',
                                                params: { card: card, id: card.id }
                                            }">
                        <img src="http://placehold.it/250x150 " alt=" ">
                        <h4 class="card_name ">{{card.name}}</h4>
                        <p class="card_text ">Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod, ullam.</p>
                                                
                                        </router-link>
                                    </div>
                                </div>
                                        <div >
                                            <router-view @refreshData="refreshList"></router-view>
                                        </div>
                <h3 class="cards_header_seen ">Останні переглянуті</h3>
                <div class="card_carusel ">
                    <div class="card ">
                        <img src="http://placehold.it/250x150 " alt=" ">
                        <h4 class="card_name ">Featured One</h4>
                        <p class="card_text ">Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod, ullam.</p>
                    </div>
                    <div class="card ">
                        <img src="http://placehold.it/250x150 " alt=" ">
                        <h4 class="card_name ">Featured One</h4>
                        <p class="card_text ">Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod, ullam.</p>
                    </div>
                    <div class="card ">
                        <img src="http://placehold.it/250x150 " alt=" ">
                        <h4 class="card_name ">Featured One</h4>
                        <p class="card_text ">Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod, ullam.</p>
                    </div>
                </div>
            </div>
        </content>
        <footer class="footer ">
            <nav class="footer_nav_bar ">
                <a href="# " class="nav_link ">Features</a>
                <a href="# " class="nav_link ">About</a>
                <a href="# " class="nav_link ">Tutorials</a>
                <a href="# " class="nav_link ">Contact</a>
                <a href="# " class="nav_link ">Downloads</a>
            </nav>
            <p class="adress_company ">Some Address</p>
            <p class="companyName ">© My Company Name</p>
        </footer>
    </div>
</template>

<script>

import http from "../http-common";

export default {
  name: "cards-list",
  data() {
    return {
      cards: []
    };
  },
  methods: {
    /* eslint-disable no-console */
    retrieveCards() {
      http
        .get("/cards")
        .then(response => {
            console.log("response: ", response.data);
          this.cards = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    },
    refreshList() {
      this.retrieveCards();
    }
    /* eslint-enable no-console */
  },
  mounted() {
    this.retrieveCards();
  }
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

.content_header {
    background-image: url(http://placehold.it/450x200);
    background-repeat: no-repeat;
    background-size: cover;
}

.start_header {
    margin-top: 60px;
    font-weight: 200;
    font-size: 50px;
    text-align: center;
}

.conternt_header_text {
    font-size: 25px;
    text-align: center;
    line-height: 2;
    height: 28vh;
}

.content_header {
    text-align: center;
}

.cards {
    margin-bottom: 40px;
    padding-bottom: 50px;
    border-bottom: 2px solid rgba(102, 97, 97, .3);
}

.cards_header {
    text-align: center;
    font-size: 30px;
}

.card_carusel {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
}

.card {
    width: 28%;
}

.card img {
    width: 100%;
    border-radius: 5px;
}

.card_name {
    margin: 0;
    text-align: center;
    font-size: 20px;
}

.card_text {
    margin: 0;
    text-align: center;
    font-size: 15px;
}

.cards_header_seen {
    text-align: center;
    font-size: 30px;
    padding-top: 50px;
    border-top: 2px solid rgba(102, 97, 97, .3);
}

.footer_nav_bar {
    margin: 0 auto;
    width: 70%;
    display: flex;
    flex-direction: row;
    margin-top: 30px;
    margin-bottom: 70px;
}

.adress_company, .companyName {
    text-align: center;
}
</style>