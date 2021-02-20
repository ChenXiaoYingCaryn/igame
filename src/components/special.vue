<template>
    <div class="specialArea">
        <div class="videoAdvise">
            <div class="specialTitle">
                <span>手游专区</span>
                <a href="#"><span>更多>></span></a>
            </div>
            <div class="specialVideo">
                <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
                <div><a href="#"><img src="../assets/picture/1.jpg" width="100%" height="100%"></a></div>
            </div>
        </div>
        <div class="gameRanking">
            <div class="gameRankingTitle">
                <span>排行榜</span>
            </div>
            <div class="Rankingpic">
                <div class="block">
            <!-- <span class="demonstration">默认 Hover 指示器触发</span> -->
            <el-carousel height="400px">
                <el-carousel-item v-for="item in RankingGame" :key="item.id">
                    <!-- <h3 class="small">{{ item }}</h3> -->
                    <img v-bind:src="item.url" width="100%">
                </el-carousel-item>
            </el-carousel>
        </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: "special",
    data(){
        return{
            RankingGame:[
                {id:0,url:require("../assets/picture/8.webp")},
                {id:1,url:require("../assets/picture/7.webp")},
                {id:2,url:require("../assets/picture/9.webp")},
            ]
        }
    }
}
</script>

<style scoped>
    .specialArea{
        width: 80%;
        margin: 0 auto;
        display: grid;
        grid-template-columns: 3fr 1fr;
        /* place-items: center center; */
        grid-column-gap: 3%;

    }
    .videoAdvise{
        display: grid;
        grid-template-rows: 1fr 5fr;
        background-color: #302F2D;
        place-items: center center;
    }
    .specialTitle{
        width: 95%;
        color: #EFCD6D;
        font-weight: 900;
        font-size: 26px;
        margin: 5px 0;
    }
    .specialTitle a span{
        float: right;
        color: #EFCD6D;
    }
    .specialVideo{
        width: 95%;
        margin: 0 0 20px 0;
        display: grid;
        grid-template-columns: 1fr 1fr 1fr;
        grid-template-rows: 1fr 1fr;
        place-items: center center;
        /* grid-row-gap: 30px; */
        grid-row-gap: 3%;
        /* grid-column-gap: 65px; */
        grid-column-gap: 2%;
    }
    .specialVideo div a img{
        border-radius: 15px;
    }
    .gameRanking{
        display: grid;
        grid-template-rows: 1fr 5fr;
        background-color: #302F2D;
        place-items: center center;
    }
    .gameRankingTitle{
        width: 95%;
        color: #EFCD6D;
        font-weight: 900;
        font-size: 26px;
        margin: 5px 0;
    }
    .Rankingpic{
        width: 90%;
        display: grid;
        /* place-items: center center; */
    }
    .el-carousel-item h3{
    color: #475669;
    font-size: 14px;
    opacity: 0.75;
    line-height: 150px;
    margin: 0;
   }

   .el-carousel-item:nth-child(2n) {
    background-color: #99a9bf;
   }
  
  .el-carousel-item:nth-child(2n+1) {
    background-color: #d3dce6;
   }
   .el-carousel-item img{
        border-radius: 15px;
   }
</style>