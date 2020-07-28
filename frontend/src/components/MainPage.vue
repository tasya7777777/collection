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
export default {
  name: "main"
};
</script>