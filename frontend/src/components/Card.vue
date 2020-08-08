<template>
    <div v-if="this.card">
        <div class="product_item">
            <div class="card_media">
                <img src="https://st.violity.com/auction/big/auctions/98/20/62/98206237.jpg">
            </div>
            <div class ="item_info">
                <div class="card_title_wrapper">
                    <h1 class = "card_title">
                        <span class ="base" data_ui-id = "page_title_wrapper" itemprop="name"> Наклейка Сімпсони</span>
                    </h1>
                </div>
                <div class ="card_id">
                    <h3 class="card_id">
                        <span class ="base" itemprop="card_id">{{this.card.id}}</span>
                    </h3>
                </div>
                <div class ="card_lot_id">
                    <h3 class="card_lot_id">
                        <span class ="base" itemprop="card_lot_id">001</span>
                    </h3>
                </div>
                <div class="card_type">
                    <h3> Тип:
                        <span class="offer_card_type"> наклейка</span>
                    </h3>
                </div>
                <div class="card_status">
                    <h3> Статус:
                        <span class="card_status"> на обмін </span>
                    </h3>
                </div>
                <div class ="card_description">
                    <p>Ця наклейка була випущена в 70х роках.
                    Далі продовжується текст
                    Текст
                    Текст</p>
                </div>
                <div class ="contact_seller">
                <button type="button" class="button1"><h3>Зв'язатися з продавцем</h3></button>
                </div>
                <div class ="propose_seller">
                <button type="button" class="button2"><h3>Зробити пропозицію</h3></button>
                </div>

            </div>
            </div>
   </div>
   <div v-else>
    <br/>
    <p>Please click on a card...</p>
  </div>
</template>



<style scoped>
   
.product_item{
display:block;
margin-top:20px;
}

.card_media img {
  width: 50%;
  min-width:768px;
  max-width: 50px;
  height:30%;
  float:left;
  margin-top: 30px;
  margin-bottom: 300px;
  position:left;
  -webkit-box-shadow: 3px 3px 6px 4px #888;
  -moz-box-shadow: 3px 3px 6px 4px #888;
}

.item_info {
  width: 30%;
  height:auto;
  margin: 0 auto;
  padding: 10px 10px 5px 10px;
  border: 1px solid #eee;
  background: white;
  font-family: "Open Sans";
  overflow: hidden;
  transition: .4s linear;
  float: right;
  margin-top: 30px;

}

.button1{
  background-color: #4CAF50;
  float:left;
  display:inline-block;
  margin: 4px 2px;
  font-size: 10px;
  border:none;
  cursor:pointer;
}

.button2{
  background:#FFFF00;
  align:top;
  display:inline-block;
  margin: 4px 2px;
  font-size: 10px;
  float: right;
  border:none;
  cursor:pointer;
}
   
    
</style>



<script>


export default {
  name: "card",
  props: ["card"]
};
</script>

