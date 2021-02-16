<template>
    <el-container class="topNav">
        <el-contaniner class="navContent">
            <!-- logo区域 -->
            <div class="logo">
                <a href="#"><img src="../assets/团队logo.png" alt="logo"></a>
                <span>iGame</span>
            </div>
            <!-- 菜单区域 -->
            <div class="menuList">
                <a href="#"><span class="list">游戏</span></a>
                <a href="#"><span class="list">资讯</span></a>
                <a href="#"><span class="list">关于我们</span></a>
                <a href="#"><span class="list">帮助反馈</span></a>
            </div>
        </el-contaniner>
    </el-container>
</template>

<script>

export default {
    name: 'topNav',

}
</script>

<style scoped>
    a,a:hover,a:active,a:link,a:focus,a:visited{
        text-decoration: none;
    }
    .topNav{
        background-color: black;
        color: rgb(119, 126, 133);
    }
    .navContent{
        /* background-color: blanchedalmond; */
        width: 1440px;
        height: auto;
        margin: 0 auto;

        display:grid;
        grid-template-columns: 1fr 3fr;
    }
    .logo img{
        width: 50px;
        height: 50px;
        margin: 15px 0 15px 30px;
    }
    .logo span{
        font-size: 18px;
        position: absolute;
        top: 35px;
    }
    .menuList{
        /* background-color:skyblue; */
        display: grid;
        grid-template-columns: 1fr 1fr 1fr 1fr;
        place-items: center center;
        font-size: 18px;
    }
    .menuList a span{
        color: rgb(119, 126, 133);
        font-weight: 800;
    }
</style>