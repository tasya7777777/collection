<template>
  <div v-if="this.user">
    <h4>User</h4>
    <div>
      <label>Name: </label> {{this.user.name}}
    </div>
    <div>
      <label>Age: </label> {{this.user.age}}
    </div>
    <div>
      <label>Active: </label> {{this.user.active}}
    </div>
  
    <span v-if="this.user.active"
      v-on:click="updateActive(false)"
      class="button is-small btn-primary">Inactive</span>
    <span v-else
      v-on:click="updateActive(true)"
      class="button is-small btn-primary">Active</span>
  
    <span class="button is-small btn-danger" v-on:click="deleteUser()">Delete</span>
  </div>
  <div v-else>
    <br/>
    <p>Please click on a user...</p>
  </div>
</template>

<script>
import http from "../http-common";

export default {
  name: "user",
  props: ["user"],
  methods: {
    /* eslint-disable no-console */
    updateActive(status) {
      var data = {
        id: this.user.id,
        name: this.user.name
      };

      http
        .put("/user/" + this.user.id, data)
        .then(response => {
          this.user.active = response.data.active;
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    },
    deleteUser() {
      http
        .delete("/user/" + this.user.id)
        .then(response => {
          console.log(response.data);
          this.$emit("refreshData");
          this.$router.push('/');
        })
        .catch(e => {
          console.log(e);
        });
    }
    /* eslint-enable no-console */
  }
};
</script>