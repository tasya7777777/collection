<template>
    <div class="all_stickers ">
        <div class="breadcrumbs"></div>
        <div class="cards-wrapper">
            <aside class="cards-filter">
                <ul>
                    <li><a href="#" class="creator-button">Виробник</a>
                        <ul>
                            <li value="kent"><a href="#"> Кент</a></li>
                            <li value="neptun"><a href="#"> Нептун</a></li>
                            <li value="jurmel"><a href="#"> Юрмел</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Статус власника</a>
                        <ul>
                            <li value="verified"><a href="#"> Verified</a></li>
                            <li value="banned"><a href="#"> Banned</a></li>
                            <li value="deleted"><a href="#"> Deleted</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Фільтр 1</a></li>
                    <li><a href="#">Фільтр 2</a></li>
                </ul>
            </aside>
            <main class="cards-items">
                <div class="card-ticket ">
                    <img src="http://placehold.it/250x150 " alt=" ">
                    <div class="card-content">
                        <div class="card-name ">Featured One</div>
                        <div class="card-status">Обмін</div>
                        <div class="card-price">700 грн</div>
                    </div>
                </div>
                <div class="card-ticket ">
                    <img src="http://placehold.it/250x150 " alt=" ">
                    <div class="card-content">
                        <div class="card-name ">Featured One</div>
                        <div class="card-status">Обмін</div>
                        <div class="card-price">700 грн</div>
                    </div>
                </div>
                <div class="card-ticket ">
                    <img src="http://placehold.it/250x150 " alt=" ">
                    <div class="card-content">
                        <div class="card-name ">Featured One</div>
                        <div class="card-status">Обмін</div>
                        <div class="card-price">700 грн</div>
                    </div>
                </div>
                <div class="card-ticket ">
                    <img src="http://placehold.it/250x150 " alt=" ">
                    <div class="card-content">
                        <div class="card-name ">Featured One</div>
                        <div class="card-status">Обмін</div>
                        <div class="card-price">700 грн</div>
                    </div>
                </div>
                <div class="card-ticket ">
                    <img src="http://placehold.it/250x150 " alt=" ">
                    <div class="card-content">
                        <div class="card-name ">Featured One</div>
                        <div class="card-status">Обмін</div>
                        <div class="card-price">700 грн</div>
                    </div>
                </div>
            </main>
        </div>
    </div>
</template>

<script>
    export default {
        name: "stickers.vue",
        props: ["stickers"],
    }
</script>

<style scoped>
    .cards-wrapper{
        display: flex;
    }
    .cards-filter{
        width: 240px;
        display: block;
    }
    .cards-filter ul{
        list-style: none;
        display: block;
    }
    .cards-filter > ul li a{
        display: block;
        background: #ececed;
        padding: 15px 30px 15px 40px;
        font-size: 14px;
        color: #454547;
        text-decoration: none;
        text-transform:uppercase;
        margin-right: 10px;
        margin-bottom: 5px;
        transition: all 0.3s ease;
    }
    .cards-filter li ul{
        min-width: 150px;
        display: block; /*якщо вписати none - буде розгортатися список на секунду*/
    }
    .creator-button{
        display: none;
    }
    .cards-filter li > ul li a{
        padding: 10px;
        text-transform: none;
    }
    .cards-filter li:active > ul{
        display: block;
    }
    .cards-filter li a:hover{
        background: #454547;
        color: #ffffff;
        box-shadow: 1px 5px 10px -5px black;
        transition: all 0.3s ease;
    }

    .cards-items{
        flex: 1 0 auto;
    }
    .cards-items .card-ticket{
        display: flex;
        margin-bottom: 20px;
        padding-bottom: 20px;
        border-bottom: 1px solid #e0e3e4;
    }
    .card-ticket img{
        margin-right: 10px;
    }
</style>