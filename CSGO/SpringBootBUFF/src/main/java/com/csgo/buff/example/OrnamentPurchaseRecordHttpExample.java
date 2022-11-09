package com.csgo.buff.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "ornament-purchase-record")
@Component
public class OrnamentPurchaseRecordHttpExample extends BasicHttpExample{

}
