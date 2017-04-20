package com.andrnhd.mvptest.bean;

/**
 * 登录返回
 * Created by nhd on 2017/3/31.
 */

public class LoginBean {

    /**
     * refresh_token : 84e4f5774aa9c2a910bbf861af0a6b78
     * info : {"vip_lvl":0,"is_yacht_owner":true,"sex":1,"mobile":"181****9549","id_card":"514***********4656","avatar":"","identity_verif_type":1,"yalln_id":"y11247401310","is_chauffeur":false,"is_merchant":false,"nim_token":"01dc57e6b8e6c09fb4281408ccec3496JW0RvYBCmwPxD","nick_name":"qwerqwer","whats_up":"asdas","vip_detail":{"vip_desc":"普通用户","vip_lvl":0},"id":8,"email":"","status":0}
     * token : 5cdbb5e2d48e02ad356d10b870538f6f
     */

    private String refresh_token;
    private InfoBean info;
    private String token;

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class InfoBean {
        /**
         * vip_lvl : 0
         * is_yacht_owner : true
         * sex : 1
         * mobile : 181****9549
         * id_card : 514***********4656
         * avatar :
         * identity_verif_type : 1
         * yalln_id : y11247401310
         * is_chauffeur : false
         * is_merchant : false
         * nim_token : 01dc57e6b8e6c09fb4281408ccec3496JW0RvYBCmwPxD
         * nick_name : qwerqwer
         * whats_up : asdas
         * vip_detail : {"vip_desc":"普通用户","vip_lvl":0}
         * id : 8
         * email :
         * status : 0
         */

        private int vip_lvl;
        private boolean is_yacht_owner;
        private int sex;
        private String mobile;
        private String id_card;
        private String avatar;
        private int identity_verif_type;
        private String yalln_id;
        private boolean is_chauffeur;
        private boolean is_merchant;
        private String nim_token;
        private String nick_name;
        private String whats_up;
        private VipDetailBean vip_detail;
        private int id;
        private String email;
        private int status;

        public int getVip_lvl() {
            return vip_lvl;
        }

        public void setVip_lvl(int vip_lvl) {
            this.vip_lvl = vip_lvl;
        }

        public boolean isIs_yacht_owner() {
            return is_yacht_owner;
        }

        public void setIs_yacht_owner(boolean is_yacht_owner) {
            this.is_yacht_owner = is_yacht_owner;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getId_card() {
            return id_card;
        }

        public void setId_card(String id_card) {
            this.id_card = id_card;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getIdentity_verif_type() {
            return identity_verif_type;
        }

        public void setIdentity_verif_type(int identity_verif_type) {
            this.identity_verif_type = identity_verif_type;
        }

        public String getYalln_id() {
            return yalln_id;
        }

        public void setYalln_id(String yalln_id) {
            this.yalln_id = yalln_id;
        }

        public boolean isIs_chauffeur() {
            return is_chauffeur;
        }

        public void setIs_chauffeur(boolean is_chauffeur) {
            this.is_chauffeur = is_chauffeur;
        }

        public boolean isIs_merchant() {
            return is_merchant;
        }

        public void setIs_merchant(boolean is_merchant) {
            this.is_merchant = is_merchant;
        }

        public String getNim_token() {
            return nim_token;
        }

        public void setNim_token(String nim_token) {
            this.nim_token = nim_token;
        }

        public String getNick_name() {
            return nick_name;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }

        public String getWhats_up() {
            return whats_up;
        }

        public void setWhats_up(String whats_up) {
            this.whats_up = whats_up;
        }

        public VipDetailBean getVip_detail() {
            return vip_detail;
        }

        public void setVip_detail(VipDetailBean vip_detail) {
            this.vip_detail = vip_detail;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public static class VipDetailBean {
            /**
             * vip_desc : 普通用户
             * vip_lvl : 0
             */

            private String vip_desc;
            private int vip_lvl;

            public String getVip_desc() {
                return vip_desc;
            }

            public void setVip_desc(String vip_desc) {
                this.vip_desc = vip_desc;
            }

            public int getVip_lvl() {
                return vip_lvl;
            }

            public void setVip_lvl(int vip_lvl) {
                this.vip_lvl = vip_lvl;
            }
        }
    }
}
