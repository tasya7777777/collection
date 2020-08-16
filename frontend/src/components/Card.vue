<template>
        <div class="item-wrapper">
                <aside class="card_media">
                    <img src="https://st.violity.com/auction/big/auctions/98/20/62/98206237.jpg">
                </aside>
                <main class ="item_info">
                    <div class="card_title_wrapper">
                        <h2 class = "card_title">
                            {{this.card.name}}
                        </h2>
                    </div>
                    <div class ="card_id">
                        <h6 class="card_id">Номер картки:
                            {{this.card.id}}
                        </h6>
                    </div>
                    <div class ="card_lot_id">
                        <h6 class="card_lot_id">Номер лота:
                            {{this.card.lotId}}
                        </h6>
                    </div>
                    <div class="card_type">
                        <h5> Тип:
                            <span class="offer_card_type"> наклейка</span>
                        </h5>
                    </div>
                    <div class="card_status">
                        <h5> Статус:
                            <span class="card_status"> на обмін </span>
                        </h5>
                    </div>
                    <div class ="card_description">
                        <p>Ця наклейка була випущена в 70х роках.
                        Далі продовжується текст
                        Текст
                        Текст</p>
                    </div>
                    <div class="contact-buttons">
                        <div class ="contact_seller">
                            <button type="button" class="button1"><h6>Зв'язатися з продавцем</h6></button>
                        </div>
                        <div class ="propose_seller">
                            <button type="button" class="button2"><h6>Зробити пропозицію</h6></button>
                        </div>
                    </div>
                </main>
        </div>
  
</template>



<style scoped>
   
.item-wrapper{
    display:flex;
}

.card_media {
    display: block;
    margin: 10px 10px 10px 10px;
}
.card_media img{
    width: 600px;
    height: 500px;
}

.item_info {
    display: block;
    padding: 10px 10px 10px 10px;
    margin: 10px 10px;
    width: 319px;

    border:1px solid silver;
}
.contact-buttons{
    display: flex;
}
.button1{
    display:flex;
    margin-right: 10px;
}
.button2{
    display: flex;
}
   
    
</style>



<script>


export default {
  name: "card",
  props: ["card"],
  
};
</script>

