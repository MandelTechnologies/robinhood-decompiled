package com.robinhood.shared.portfolio.listsswipenux;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeContext.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/listsswipenux/SwipeContext;", "", "prefixKey", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPrefixKey", "()Ljava/lang/String;", "EQUITY_WATCHLIST", "FUTURES_POSITIONS", "lib-lists-swipe-nux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SwipeContext {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SwipeContext[] $VALUES;
    public static final SwipeContext EQUITY_WATCHLIST = new SwipeContext("EQUITY_WATCHLIST", 0, "equity_watchlist");
    public static final SwipeContext FUTURES_POSITIONS = new SwipeContext("FUTURES_POSITIONS", 1, "futures_positions");
    private final String prefixKey;

    private static final /* synthetic */ SwipeContext[] $values() {
        return new SwipeContext[]{EQUITY_WATCHLIST, FUTURES_POSITIONS};
    }

    public static EnumEntries<SwipeContext> getEntries() {
        return $ENTRIES;
    }

    private SwipeContext(String str, int i, String str2) {
        this.prefixKey = str2;
    }

    public final String getPrefixKey() {
        return this.prefixKey;
    }

    static {
        SwipeContext[] swipeContextArr$values = $values();
        $VALUES = swipeContextArr$values;
        $ENTRIES = EnumEntries2.enumEntries(swipeContextArr$values);
    }

    public static SwipeContext valueOf(String str) {
        return (SwipeContext) Enum.valueOf(SwipeContext.class, str);
    }

    public static SwipeContext[] values() {
        return (SwipeContext[]) $VALUES.clone();
    }
}
