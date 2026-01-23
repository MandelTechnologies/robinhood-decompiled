package com.robinhood.shared.ticker.config;

import android.icu.text.DecimalFormatSymbols;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.shared.ticker.config.TickerLocaleConfig;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalizedTickerLocaleConfig.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/ticker/config/LocalizedTickerLocaleConfig;", "Lcom/robinhood/shared/ticker/config/TickerLocaleConfig;", "<init>", "()V", "symbols", "Landroid/icu/text/DecimalFormatSymbols;", "getSymbols", "()Landroid/icu/text/DecimalFormatSymbols;", "symbols$delegate", "Lkotlin/Lazy;", "groupingSeparator", "", "getGroupingSeparator", "()C", "decimalSeparator", "getDecimalSeparator", "monetaryDecimalSeparator", "getMonetaryDecimalSeparator", "monetaryGroupingSeparator", "getMonetaryGroupingSeparator", "percentSymbol", "getPercentSymbol", "lib-ticker-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class LocalizedTickerLocaleConfig implements TickerLocaleConfig {
    public static final LocalizedTickerLocaleConfig INSTANCE = new LocalizedTickerLocaleConfig();

    /* renamed from: symbols$delegate, reason: from kotlin metadata */
    private static final Lazy symbols = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.ticker.config.LocalizedTickerLocaleConfig$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalizedTickerLocaleConfig.symbols_delegate$lambda$0();
        }
    });
    public static final int $stable = 8;

    private LocalizedTickerLocaleConfig() {
    }

    @Override // com.robinhood.shared.ticker.config.TickerLocaleConfig
    public Set<Character> getMoneyCharacters() {
        return TickerLocaleConfig.DefaultImpls.getMoneyCharacters(this);
    }

    private final DecimalFormatSymbols getSymbols() {
        Object value = symbols.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DecimalFormatSymbols) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecimalFormatSymbols symbols_delegate$lambda$0() {
        return DecimalFormatSymbols.getInstance(CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale());
    }

    @Override // com.robinhood.shared.ticker.config.TickerLocaleConfig
    public char getGroupingSeparator() {
        return getSymbols().getGroupingSeparator();
    }

    @Override // com.robinhood.shared.ticker.config.TickerLocaleConfig
    public char getDecimalSeparator() {
        return getSymbols().getDecimalSeparator();
    }

    @Override // com.robinhood.shared.ticker.config.TickerLocaleConfig
    public char getMonetaryDecimalSeparator() {
        return getSymbols().getMonetaryDecimalSeparator();
    }

    @Override // com.robinhood.shared.ticker.config.TickerLocaleConfig
    public char getMonetaryGroupingSeparator() {
        return getSymbols().getMonetaryGroupingSeparator();
    }

    @Override // com.robinhood.shared.ticker.config.TickerLocaleConfig
    public char getPercentSymbol() {
        return getSymbols().getPercent();
    }
}
