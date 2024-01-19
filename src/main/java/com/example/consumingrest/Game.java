package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public record Game(
    int appid,
    String name,
    int playtime_forever,
    String img_icon_url,
    boolean has_community_visible_stats,
    ArrayList<Integer> content_descriptorids,
    boolean has_leaderboards,
    int playtime_2weeks
){ }