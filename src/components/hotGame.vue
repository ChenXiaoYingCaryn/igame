<template>
    <div class="hotGame">
        <!-- 游戏推荐 -->
        <div class="gameAdvise">
            <!-- 标题 -->
            <div class="title">
                <span>热门游戏推荐</span>
            </div>
            <!-- 游戏推荐 -->
            <div class="games">
                <!-- <a href="#" v-for="item in gamesBox" :key="item.id">
                    <img :src="item.url">
                </a> -->
                <div class="gamesBox">
                    <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                    <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                    <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                    <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                    <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                    <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                    <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                    <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                </div>
            </div>
        </div>

        <!-- 游戏分区 -->
        <div class="gamepart">
            <div class="gamepart-box">
                <!-- <div class="box-top"><a href="#"><img src="../assets/团队logo.png" alt=""></a></div>
                <div class="box-right"><img src="../assets/团队logo.png" alt=""></div>
                <div class="box-bottom"><img src="../assets/团队logo.png" alt=""></div>
                <div class="box-left"><img src="../assets/团队logo.png" alt=""></div> -->
                <div class="box-top"><span class="box-span">1</span></div>
                <div class="box-right"><span class="box-span" style="left: 75%;">2</span></div>
                <div class="box-bottom"><span class="box-span">3</span></div>
                <div class="box-left"><span class="box-span">4</span></div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: "hotGame",
    // data(){
    //     return{
    //         gamesBox:[
    //             {id:0,url:require("../assets/picture/1.jpg")},
    //             {id:1,url:require("../assets/picture/2.jpg")},
    //             {id:2,url:require("../assets/picture/3.jpg")},
    //             {id:3,url:require("../assets/picture/4.jpg")},
    //             {id:4,url:require("../assets/picture/1.jpg")},
    //             {id:5,url:require("../assets/picture/2.jpg")},
    //             {id:6,url:require("../assets/picture/3.jpg")},
    //             {id:7,url:require("../assets/picture/4.jpg")},
    //         ]
    //     }
    // }
}
</script>

<style scoped>
    .hotGame{
        width: 80%;
        margin: 0 auto;
        /* background-color: silver; */
        display: grid;
        grid-template-columns: 3fr 1fr;
        grid-column-gap: 3%;
    }
    .gameAdvise{
        width: 100%;
        /* height: 400px; */
        display: grid;
        grid-auto-rows: 1fr 3fr;
        background-color: #302F2D;
    }
    .title{
        display: grid;
        place-items: center center;
    }
    .title span{
        border: #232322 solid 2px;
        border-radius: 15px;
        font-size: 24px;
        font-weight: 600;
        padding: 10px 150px;
        margin: 30px 0;
        background-color: #BD9764;
    }
    .games{
        display: grid;
        place-items: center center;
    }
    .gamesBox{
        width: 95%;
        display: grid;
        grid-template-columns: 1fr 1fr 1fr 1fr;
        grid-template-rows: 1fr 1fr;
        place-items: center center;
        grid-row-gap: 10px;
        grid-column-gap: 15px;
    }

    .gamepart-box {
    width: 85%; 
    height: 80%;
    /* background-color: aqua; */
    margin: 0 auto;
    position: relative;
    overflow: hidden;
    top: 10%;
    }
    .box-top {
    position: absolute;
    top: 0;
    width: 100%;
    height: 50%;
    clip-path: polygon(0 0,100% 0,50% 100%);
    background: url("../assets/picture/8.webp") top right / cover no-repeat;
    }

    .box-right {
        position: absolute;
        right: 0;
        width: 100%;
        height: 100%;
        clip-path: polygon(100% 0,50% 50%,100% 100%);
        background-color: yellow;
        background: url("../assets/picture/7.webp") top right / cover no-repeat;
    }

    .box-bottom {
        position: absolute;
        bottom: 0;
        width: 100%;
        height: 50%;
        clip-path: polygon(0 100%,50% 0,100% 100%);
        background-color: pink;
        background: url("../assets/picture/9.webp") bottom right / cover no-repeat;
    }

    .box-left {
        position: absolute;
        left: 0;
        width: 50%;
        height: 100%;
        clip-path: polygon(0 0,100% 50%,0 100%);
        background-color: red;
        background: url("../assets/picture/7.webp") bottom left / cover no-repeat;
    }

    .box-span {
        font-size: 30px;
        font-weight: bold;
        color: #fff;
        text-shadow: 0px 0px 7px rgba(0, 0, 0, .8);
        position: absolute;
        top: 50%;
        left: 50%;
    }
</style>