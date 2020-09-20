import Vue from "vue";
import Router from "vue-router";
import MainPage from "./components/MainPage.vue";
import Login from "./components/Login.vue";
import Register from "./components/Register.vue";
import Card from "./components/Card.vue";
import Stickers from "./components/Stickers.vue";

Vue.use(Router);

export default new Router({
  mode: "history",
  routes: [
    {
          path: "",
          name: "main",
          component: MainPage
      },
    {
        path: "/login",
        name: "login",
        component: Login
    },
    {
            path: "/register",
            name: "register",
            component: Register
        },
    {
        path: "/card/:id",
        name: "card",
        component: Card,
        props: true
    },
      {
          path: "/stickers",
          name: "stickers",
          component: Stickers,
          props: true
      }
  ]
});