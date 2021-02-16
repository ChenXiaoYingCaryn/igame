<template>
    <div class="infoContainer">
        <div class="infoTitleContainer">
            <div class="infoTitle">
                <span>资讯专栏</span>
                <a href="#"><span>更多>></span></a>
            </div>
         </div>
        <div class="infoContentContainer">
            <div class="infoContent">
                <div class="specialInfo">
                    <div class="specialInfoTitle"><span>手游</span></div>
                    <div class="specialInfoContent">
                        <a href="#">
                            <div class="infoItem">
                                <div class="itemPic"><img src="../assets/团队logo.png" alt="" width="100%" height="100%"></div>
                                <div class="itemTxt">1231</div>
                            </div>
                        </a>
                        <div class="infoItem">
                            <div class="itemPic"><img src="../assets/团队logo.png" alt="" width="100%" height="100%"></div>
                            <div class="itemTxt">123</div>
                        </div>
                        <div class="infoItem">
                            <div class="itemPic"><img src="../assets/团队logo.png" alt="" width="100%" height="100%"></div>
                            <div class="itemTxt">123</div>
                        </div>
                    </div>
                </div>
                 <div class="specialInfo">
                    <div class="specialInfoTitle"><span>手游</span></div>
                    <div class="specialInfoContent">
                        <a href="#">
                            <div class="infoItem">
                                <div class="itemPic"><img src="../assets/团队logo.png" alt="" width="100%" height="100%" ></div>
                                <div class="itemTxt">1231</div>
                            </div>
                        </a>
                        <div class="infoItem">
                            <div class="itemPic"><img src="" alt="" width="100%" height="100%"></div>
                            <div class="itemTxt">123</div>
                        </div>
                        <div class="infoItem">
                            <div class="itemPic"><img src=" " alt="" width="100%" height="100%"></div>
                            <div class="itemTxt">123</div>
                        </div>
                    </div>
                </div>
                 <div class="specialInfo">
                    <div class="specialInfoTitle"><span>手游</span></div>
                    <div class="specialInfoContent">
                        <a href="#">
                            <div class="infoItem">
                                <div class="itemPic"><img src="../assets/团队logo.png" alt="" width="100%" height="100%"></div>
                                <div class="itemTxt">1231</div>
                            </div>
                        </a>
                        <div class="infoItem">
                            <div class="itemPic"><img src="" alt=""></div>
                            <div class="itemTxt">123</div>
                        </div>
                        <div class="infoItem">
                            <div class="itemPic"><img src="" alt=""></div>
                            <div class="itemTxt">123</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name:"info",
}
</script>

<style scoped>
    .infoContainer{
        width: 80%;
        margin: 0 auto;
        display: grid;
        grid-template-rows: 1fr 5fr;
        /* place-items: center center; */
        background-color: #302F2D;
        grid-row-gap: 10px;
    }
    .infoTitleContainer{
        display: grid;
        place-items: center center;
    }
    .infoTitle{
        width: 95%;
        color: #EFCD6D;
        font-weight: 900;
        font-size: 26px;
        margin: 5px 0;
        /* border: #EFCD6D solid 2px; */
        padding: 15px 20px;
        /* border-radius: 10px; */
    }
    .infoTitle a span{
        float: right;
        color: #EFCD6D;
    }
    .infoContentContainer{
        width: 95%;
        margin: 0 auto;
    }
    .infoContent{
        display: grid;
        grid-template-columns: 1fr 1fr 1fr;
        grid-column-gap: 10px;
    }
    /* .infoContent .specialInfo:nth-child(2){
        border-left: #EFCD6D ridge;
    } */
    .specialInfo{
        display: grid;
        grid-template-rows: 1fr 4fr;
        /* border: #EFCD6D solid 2px; */
        padding: 15px 20px;
        border-radius: 10px;
        place-items: center center;
        grid-row-gap: 10px;

    }
    .specialInfoTitle span{
        border: #232322 solid 2px;
        border-radius: 10px;
        font-size: 24px;
        font-weight: 600;
        padding: 10px 60px;
        margin: 30px 0;
        background-color: #BD9764;
    }
    .specialInfoContent{
        display: grid;
        grid-template-rows: 1fr 1fr 1fr;
        width: 98%;
        grid-row-gap: 10px;
    }
    .infoItem{
        padding: 15px 20px;
        display: grid;
        grid-template-columns: 1fr 4fr;
        background-color: #302F2D;
        color: ivory;
        grid-column-gap: 15px;
        /* background-size: contain; */
    }
    .itemPic{
        background-size: cover;
    }
</style>