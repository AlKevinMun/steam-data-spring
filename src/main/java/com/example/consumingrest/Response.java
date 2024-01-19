package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public record Response(
         int game_count,
         ArrayList<Game> games
){}