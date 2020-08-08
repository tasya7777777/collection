import Vue from "vue";
import Router from "vue-router";
import MainPage from "./components/MainPage.vue";
import Login from "./components/Login.vue";

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
    }
  ]
});