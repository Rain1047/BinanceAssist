package com.rain.config;

public class PrivateConfig {
        private PrivateConfig() {
        }
        public static final String BASE_URL = "https://testnet.binance.vision";
        public static final String API_KEY = "iBco530HGop2Xoz06DDLnWVarESfefiLLc3sBjgSoHBsQNXuKaZmYb6dG6Igz6G1";
        public static final String SECRET_KEY = "Se9DGLXUSugjb06e7HkmoIEyimuQZe6nSpzxZniuwhl15crx86iyj4ZhpvRkXPwD";
        // Unnecessary if PRIVATE_KEY_PATH is used
        public static final String PRIVATE_KEY_PATH = ""; // Key must be PKCS#8 standard

        public static final String TESTNET_API_KEY = "";
        public static final String TESTNET_SECRET_KEY = ""; // Unnecessary if TESTNET_PRIVATE_KEY_PATH is used
        public static final String TESTNET_PRIVATE_KEY_PATH = ""; //Key must be PKCS#8 standard

}
