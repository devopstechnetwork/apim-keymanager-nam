package org.wso2.nam.client;

public class NAMConstants {
    public static final String UTF_8 = "UTF-8";
    public static final String CLIENT_ENDPOINT = "/nidp/oauth/nam/clients";
    public static final String INTROSPECT_ENDPOINT = "/v1/introspect";
    public static final String TOKEN_ENDPOINT = "/nidp/oauth/nam/token";
    public static final String TOKEN_INFO_ENDPOINT = "/nidp/oauth/nam/tokeninfo";
    public static final String USER_INFO_ENDPOINT = "/nidp/oauth/nam/userinfo";
    public static final String REVOKE_ENDPOINT = "/nidp/oauth/nam/revoke";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON = "application/json";
    public static final String APPLICATIN_FORM_URL_ENCODED = "application/x-www-form-urlencoded";
    public static final String AUTHORIZATION = "Authorization";
    public static final String AUTHENTICATION_BASIC = "Basic ";
    public static final String PASSWORD = "password";
    public static final String USERNAME = "usrename";
    public static final String REGISTRAION_API_KEY = "apiKey";
    public static final String AUTHENTICATION_SSWS = "SSWS ";
    public static final String OAUTH2 = "/oauth2/";
    public static final String BEARER = "Bearer ";

    public static final String CLIENT_ID = "client_id";
    public static final String CLIENT_NAME = "client_name";
    public static final String CLIENT_SECRET = "client_secret";
    public static final String APPLICATION_TYPE = "application_type";
    public static final String VERSION = "version";
    public static final String CLIENT_SECRET_EXPIRES_AT = "client_secret_expires_at";
    public static final String ENABLE_NATIVE_SSO = "enableNativeSSO";
    public static final String GRANT_TYPE = "grant_type";
    public static final String GRANT_TYPES = "grant_types";
    public static final String RESPONSE_TYPES = "response_types";
    public static final String REDIRECTION_URI = "redirection_uri";
    public static final String ALWAYS_ISSUE_NEW_REFRESH_TOKEN = "alwaysIssueNewRefreshToken";
    public static final String AUTH_CODE_TTL =  "authzCodeTTL";
    public static final String ACCESS_TOKEN_TTL = "accessTokenTTL";
    public static final String REFRESH_TOKEN_TTL = "refreshTokenTTL";
    public static final String CORS_DOMAINS = "corsdomains";
    public static final String LOGO_URI = "logo_uri";
    public static final String POLICY_URI = "policy_uri";
    public static final String TOS_URI = "tos_uri";
    public static final String CONTACTS = "contacts";
    public static final String JWKS_URI = "jwks_uri";
    public static final String ID_TOKEN_SIGNED_RESPONSE_ALG = "id_token_signed_response_alg";
    public static final String ID_TOKEN_ENCRYPTED_RESPONSE_ALG = "id_token_encrypted_response_alg";
    public static final String ID_TOKEN_ENCRYPTED_RESPONSE_ENC = "id_token_encrypted_response_enc";
    public static final String REDIRECT_URIS = "redirect_uris";
    public static final String DEVELOPER_DN = "developerDn";
    public static final String TOKEN = "token";
    public static final String TOKEN_TYPE = "token_type";
    public static final String TOKEN_TYPE_HINT = "token_type_hint";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String SCOPE = "scope";
    public static final String RESOURCE_SERVER = "resourceServer";
    public static final String ACR_VALUES = "acr_values";
    public static final String EXPIRES_IN = "expires_in";
    public static final String ACTIVE = "active";
    public static final String ACCESS_TOKEN_EXPIRY = "exp";
    public static final String REFRESH_TOKEN = "refresh_token";


    public static final String NAM_INSTANCE_URL = "namInstanceUrl";

    public static final String NULL_STRING = "null";

    public static final String ERROR_WHILE_PARSE_RESPONSE = "Error while parsing response json";
    public static final String ERROR_ENCODING_METHOD_NOT_SUPPORTED = "Encoding method is not supported";
    public static final String ERROR_COULD_NOT_READ_HTTP_ENTITY = "Could not read http entity for response";
    public static final String STRING_FORMAT = "%s %s";
    public static final String ERROR_OCCURRED_WHILE_READ_OR_CLOSE_BUFFER_READER = "Error has occurred while reading " +
            "or closing buffer reader";
    public static final String ERROR_CLIENT_PROTOCOL =
            "HTTP error has occurred while sending request to OAuth Provider.";

    public static final String DEFAULT_GRANT_TYPE = PASSWORD;


}
