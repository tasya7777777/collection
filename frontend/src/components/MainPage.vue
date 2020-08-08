<template>
  <div>
    
   
    <content class="content">
      <div class="content_header">
        <h2 class="start_header">Tagline With Your Unique Selling Proposition</h2>
        <p
          class="conternt_header_text"
        >Lorem, ipsum dolor sit amet consectetur adipisicing elit. Optio quisquam, at libero a, error voluptates obcaecati sequi reiciendis, repellendus ipsa quaerat non similique natus amet quae doloribus tempore repudiandae porro.</p>
      </div>
      <div class="cards">
        <h3 class="cards_header">Останні додані</h3>
        <div class="card_carusel">
          <div class="card" v-for="(card, index) in cards" :key="index" >
            <router-link
              :to="{name: 'card',
                    params: { card: card, id: card.id }}">
              <img src="http://placehold.it/250x150 " alt=" " />
              <h4 class="card_name"  >{{card.name}}</h4>
              <p class="card_text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod, ullam.</p>
            </router-link>
          </div>
        </div>
        <div>
          <router-view @refreshData="refreshList"></router-view>
        </div>
        <h3 class="cards_header_seen">Останні переглянуті</h3>
        <div class="card_carusel">
          <div class="card">
            <img src="http://placehold.it/250x150 " alt=" " />
            <h4 class="card_name">Featured One</h4>
            <p
              class="card_text"
            >Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod, ullam.</p>
          </div>
          <div class="card">
            <img src="http://placehold.it/250x150 " alt=" " />
            <h4 class="card_name">Featured One</h4>
            <p
              class="card_text"
            >Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod, ullam.</p>
          </div>
          <div class="card">
            <img src="http://placehold.it/250x150 " alt=" " />
            <h4 class="card_name">Featured One</h4>
            <p
              class="card_text"
            >Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod, ullam.</p>
          </div>
        </div>
      </div>
    </content>
   
  </div>
</template>

<script>
import http from "../http-common";

export default {
  name: "cards-list",
  data() {
    return {
      cards: [],
    };
  },
  methods: {
    /* eslint-disable no-console */
    retrieveCards() {
      http
        .get("/cards")
        .then((response) => {
          console.log("response: ", response.data);
          this.cards = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    refreshList() {
      this.retrieveCards();
    },
    /* eslint-enable no-console */
  },
  mounted() {
    this.retrieveCards();
  },
};
</script>

<style>
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
  border-bottom: 2px solid rgba(102, 97, 97, 0.3);
}

.cards_header {
  text-align: center;
  font-size: 30px;
}

.card_carusel {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  overflow-x: auto;
}

.card {
  min-width: 400px;
  margin-right: 30px;
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
  border-top: 2px solid rgba(102, 97, 97, 0.3);
}

</style>