<template>
  <div class="searchform">
    <h4>Find by Age</h4>
    <div class="form-group">
      <input type="number" class="form-control" id="age" required v-model="age" name="age">
    </div>
 
    <div class="btn-group">
      <button v-on:click="searchUsers" class="btn btn-success">Search</button>
    </div>

    <ul class="search-result">
      <li v-for="(user, index) in users" :key="index">
        <h6>{{user.name}} ({{user.age}})</h6>
      </li>
    </ul>
  </div>
</template>

<script>
import http from "../http-common";

export default {
  name: "search-user",
  data() {
    return {
      age: 0,
      users: []
    };
  },
  methods: {
    /* eslint-disable no-console */
    searchUsers() {
      http
        .get("/users/age/" + this.age)
        .then(response => {
          this.users = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    }
    /* eslint-enable no-console */
  }
};
</script>

<style>
.searchform {
  max-width: 300px;
  margin: auto;
}
.search-result {
  margin-top: 20px;
  text-align: left;
}
</style>