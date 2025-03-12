const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootyiny8vh/",
            name: "springbootyiny8vh",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootyiny8vh/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "宠物共享平台"
        } 
    }
}
export default base
