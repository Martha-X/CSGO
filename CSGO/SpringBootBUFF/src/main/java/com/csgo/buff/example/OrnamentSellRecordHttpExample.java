package com.csgo.buff.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "ornament-sell-record")
@Component
public class OrnamentSellRecordHttpExample extends BasicHttpExample{
}
