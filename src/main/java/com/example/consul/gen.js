let build = new Build();
function Build() {
    /**
     * @param json
     * @param isMock
     * @returns {boolean}
     */
    this.buildboolean=function (json,isMock = false) {
        if(json==null) return false;
        if(json=='1'||json=='true'||json==1||json==true) return true;
        return false;
    };
    /**
     * @param json
     * @param isMock
     * @returns {Array.<boolean>}
     */
    this.buildboolean_array=function (json,isMock = false) {
        let result = [];
        if(json==null) {
            if(isMock){
                return [false,false,false];
            }else{
                return result;
            }
        }
        for (let k = 0, length = json.length; k < length; k++) {
            result[k] = this.buildbool(json[k],isMock);
        }
        return result;
    };
    /**
     * @param json
     * @param isMock
     * @returns {int}
     */
    this.buildint=function (json,isMock = false) {
        if(json==null) return 0;
        return parseInt(json)
    };
    /**
     * @param json
     * @param isMock
     * @returns {Array.<int>}
     */
    this.buildint_array=function (json,isMock = false) {
        let result = [];
        if(json==null) {
            if(isMock){
                return [0,1,2];
            }else{
                return result;
            }
        }
        for (let k = 0, length = json.length; k < length; k++) {
            result[k] = this.buildint(json[k],isMock);
        }
        return result;
    };
    /**
     * @param json
     * @param isMock
     * @returns {string}
     */
    this.buildstring=function(json,isMock = false) {
        if(json==null) return "";
        return String(json);
    };
    /**
     * @param json
     * @param isMock
     * @returns {Array.<string>}
     */
    this.buildstring_array=function (json,isMock = false) {
        let result = [];
        if(json==null) {
            if(isMock){
                return ["test1","test2","test3"];
            }else{
                return result;
            }
        }
        for (let k = 0, length = json.length; k < length; k++) {
            result[k] = this.buildstring(json[k],isMock);
        }
        return result;
    };
    /**
     * @param json
     * @param isMock
     * @returns {HttpResult_ReportPeople}
     */
    this.buildHttpResult_ReportPeople=function (json,isMock = false) {
        if(json==null) {
            if(isMock){
                return new HttpResult_ReportPeople(null,isMock);
            }else{
                return null;
            }
        }
        return new HttpResult_ReportPeople(json);
    };
    /**
     * @param json
     * @param isMock
     * @returns {Array.<HttpResult_ReportPeople>}
     */
    this.buildHttpResult_ReportPeople_array=function (json,isMock = false) {
        let result = [];
        if(json==null) {
            if(isMock){
                return [new HttpResult_ReportPeople(null),new HttpResult_ReportPeople(null),new HttpResult_ReportPeople(null)];
            }else{
                return result;
            }
        }
        for (let k = 0, length = json.length; k < length; k++) {
            result[k] = this.buildHttpResult_ReportPeople(json[k]);
        }
        return result;
    };
}
/** HttpResult **/
function HttpResult_ReportPeople(json,isMock=false){
    /**
     * clientType
     * @param isMock
     * @type {int}
     */
    this.clientType = build.buildint(json&&(json.clientType!=null)?json.clientType:null,isMock);
    /**
     * huidrKey
     * @param isMock
     * @type {string}
     */
    this.huidrKey = build.buildstring(json&&(json.huidrKey!=null)?json.huidrKey:null,isMock);
    /**
     * seq
     * @param isMock
     * @type {int}
     */
    this.seq = build.buildint(json&&(json.seq!=null)?json.seq:null,isMock);
    /**
     * status
     * @param isMock
     * @type {int}
     */
    this.status = build.buildint(json&&(json.status!=null)?json.status:null,isMock);
    /**
     * desc
     * @param isMock
     * @type {string}
     */
    this.desc = build.buildstring(json&&(json.desc!=null)?json.desc:null,isMock);
    /**
     * sid
     * @param isMock
     * @type {string}
     */
    this.sid = build.buildstring(json&&(json.sid!=null)?json.sid:null,isMock);
    /**
     * token
     * @param isMock
     * @type {string}
     */
    this.token = build.buildstring(json&&(json.token!=null)?json.token:null,isMock);
    /**
     * currPage
     * @param isMock
     * @type {int}
     */
    this.currPage = build.buildint(json&&(json.currPage!=null)?json.currPage:null,isMock);
    /**
     * pageSize
     * @param isMock
     * @type {int}
     */
    this.pageSize = build.buildint(json&&(json.pageSize!=null)?json.pageSize:null,isMock);
    /**
     * serverTime
     * @param isMock
     * @type {string}
     */
    this.serverTime = build.buildstring(json&&(json.serverTime!=null)?json.serverTime:null,isMock);
    /**
     * retValue
     * @param isMock
     * @type {ReportPeople}
     */
    this.retValue = build.buildReportPeople(json&&(json.retValue!=null)?json.retValue:null,isMock);
}

let MyMarco = {
    /**
     * 公猫
     * @type {int}
     */
    SEX_MALE:1,
    /**
     * 母猫
     * @type {int}
     */
    SEX_FEMALE:2
}

function sendAjax(ajax) {
    return new Promise(function (resolve, reject) {
        $.ajax({
                "url": ajax.url,
                "type": ajax.type,
                "dataType": ajax.dataType,
                "contentType": ajax.contentType,
                "timeout": ajax.timeout,
                "cache": ajax.cache,
                "global": ajax.global,
                "hearders": ajax.hearders,
                "ifModified": ajax.ifModified,
                "data": ajax.data(),
                "success": function(result){
                        resolve(result);
                    },
                "error": function (result) {
                        reject(result);
                    }
                })
        });
}

function Huidr_getNewReportImages() {
    /**
    * parameter huidrKey
    * @type {string}
    */
    this.p_huidrKey = build.buildstring(null);
    /**
    * parameter seq
    * @type {string}
    */
    this.p_seq = build.buildstring(null);
    /**
    * parameter sid
    * @type {string}
    */
    this.p_sid = build.buildstring(null);
    /**
     * parameter 报告id
     * @type {string}
     */
    this.p_reportId = build.buildstring(null);
    /**
     * parameter 报告类型，0.患者上传 1.检查报告 2.检验报告
     * @type {string}
     */
    this.p_type = build.buildstring(null);
    /**
     * parameter 就诊id
     * @type {string}
     */
    this.p_visitingId = build.buildstring(null);
    this.url = "http://localhost:8080/huidrRESTful/getNewReportImages";
    this.type = "POST";
    this.dataType = "json";
    this.contentType = "application/json";
    this.timeout = 5000;
    this.cache = false;
    this.global = false;
    this.ifModified = false;
    this.hearders = {};
    this.data = function(){
        return JSON.stringify({
            huidrKey:this.p_huidrKey,
            seq:this.p_seq,
            sid:this.p_sid,
            reportId:this.p_reportId,
            type:this.p_type,
            visitingId:this.p_visitingId,
        })
    }
    this.mock = build.buildHttpResult_ReportPeople(null,true);
    this.testMock = false;
    this.result = null;
    let self = this;
    this.send = async function () {
        if(self.testMock){
            self.result = self.mock;
            return;
        }
        try {
            let data = await sendAjax(self);
            self.result = new HttpResult_ReportPeople(data);
        }catch (e) {
            console.error("[curl error]"+self.url);
            console.error(e);
            self.result = self.mock;
        }
    }
}