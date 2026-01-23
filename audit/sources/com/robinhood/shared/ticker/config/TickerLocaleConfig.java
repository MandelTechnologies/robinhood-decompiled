package com.robinhood.shared.ticker.config;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

/* compiled from: TickerLocaleConfig.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\f\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/ticker/config/TickerLocaleConfig;", "", "groupingSeparator", "", "getGroupingSeparator", "()C", "decimalSeparator", "getDecimalSeparator", "monetaryDecimalSeparator", "getMonetaryDecimalSeparator", "monetaryGroupingSeparator", "getMonetaryGroupingSeparator", "percentSymbol", "getPercentSymbol", "moneyCharacters", "", "getMoneyCharacters", "()Ljava/util/Set;", "lib-ticker-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface TickerLocaleConfig {
    char getDecimalSeparator();

    char getGroupingSeparator();

    char getMonetaryDecimalSeparator();

    char getMonetaryGroupingSeparator();

    Set<Character> getMoneyCharacters();

    char getPercentSymbol();

    /* compiled from: TickerLocaleConfig.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Set<Character> getMoneyCharacters(TickerLocaleConfig tickerLocaleConfig) {
            return SetsKt.setOf((Object[]) new Character[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', Character.valueOf(tickerLocaleConfig.getDecimalSeparator()), Character.valueOf(tickerLocaleConfig.getMonetaryDecimalSeparator()), Character.valueOf(tickerLocaleConfig.getGroupingSeparator()), Character.valueOf(tickerLocaleConfig.getMonetaryGroupingSeparator())});
        }
    }
}
