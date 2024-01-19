package com.example.consumingrest;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SteamService {
    public static final String URL = "https://api.steampowered.com/IPlayerService/GetOwnedGames/v1/?access_token=37c34f7fc13ce00bd5efacb6477ab1ac&steamid=76561198136764695&include_appinfo=true";
    RestTemplate rootTemplate = new RestTemplate();

    public Root getRoot(){
        return rootTemplate.getForObject(URL, Root.class);
    }
}
