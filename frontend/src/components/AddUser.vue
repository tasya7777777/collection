<template>
  <div class="submitform">
    <div v-if="!submitted">
        <div class="form-group">
          <label for="name">Name</label>
          <input type="text" class="form-control" id="name" required v-model="user.name" name="name">
        </div>
    

    
        <button v-on:click="saveUser" class="btn btn-success">Submit</button>
    </div>
    
    <div v-else>
      <h4>You submitted successfully!</h4>
      <button class="btn btn-success" v-on:click="newUser">Add</button>
    </div>
  </div>
</template>

<script>
import http from "../http-common";

export default {
  name: "add-user",
  data() {
    return {
      user: {
        id: 0,
        name: ""
      },
      submitted: false
    };
  },
  methods: {
    /* eslint-disable no-console */
    saveUser() {
      var data = {
        name: this.user.name
      };

      http
        .post("/user", data)
        .then(response => {
          this.user.id = response.data.id;
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });

      this.submitted = true;
    },
    newUser() {
      this.submitted = false;
      this.user = {};
    }
    /* eslint-enable no-console */
  }
};
</script>

<style>
.submitform {
  max-width: 300px;
  margin: auto;
}
</style>
