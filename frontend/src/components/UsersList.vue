<template>
    <div class="list row">
        <div class="col-md-6">
            <h4>Users List</h4>
            <ul>
                <li v-for="(user, index) in users" :key="index">
                    <router-link :to="{
                            name: 'user-details',
                            params: { user: user, id: user.id }
                        }">
                            {{user.name}}
                    </router-link>
                </li>
            </ul>
        </div>
        <div class="col-md-6">
            <router-view @refreshData="refreshList"></router-view>
        </div>
    </div>
</template>

<script>
import http from "../http-common";

export default {
  name: "users-list",
  data() {
    return {
      users: []
    };
  },
  methods: {
    /* eslint-disable no-console */
    retrieveUsers() {
      http
        .get("/users")
        .then(response => {
          this.users = response.data; // JSON are parsed automatically.
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    },
    refreshList() {
      this.retrieveUsers();
    }
    /* eslint-enable no-console */
  },
  mounted() {
    this.retrieveUsers();
  }
};
</script>

<style>
.list {
  text-align: left;
  max-width: 450px;
  margin: auto;
}
</style>
