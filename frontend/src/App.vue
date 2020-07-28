<template>
    <div id="App">
        <router-view/>
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

.adress_company,
.companyName {
    text-align: center;
}
</style>
