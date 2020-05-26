package com.gateway.jwt;
import com.base.common.model.BaseUser;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.HashMap;

/**
 * Created by Administrator on 2019/9/6 0006.
 * 自定义的token
 */
public class MyJwtAccessTokenConverter extends JwtAccessTokenConverter {

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        if (accessToken instanceof DefaultOAuth2AccessToken) {
            // ((DefaultOAuth2AccessToken) accessToken).setRefreshToken();
            Object principal = authentication.getPrincipal();
            if (principal instanceof BaseUser) {
                BaseUser user = (BaseUser) principal;
                HashMap<String, Object> map = new HashMap<>();
//                map.put("user_id", user.getBaseOperator().getUserid());
//                map.put("phone", user.getBaseOperator().getTelphonenum());
                ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(map);
            }
        }
        return super.enhance(accessToken, authentication);
    }
}