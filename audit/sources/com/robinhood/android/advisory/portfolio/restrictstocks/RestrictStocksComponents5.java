package com.robinhood.android.advisory.portfolio.restrictstocks;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RestrictStocksComponents.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/SwipeAction;", "", "<init>", "(Ljava/lang/String;I)V", "ALLOW", "RESTRICT", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.portfolio.restrictstocks.SwipeAction, reason: use source file name */
/* loaded from: classes7.dex */
public final class RestrictStocksComponents5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RestrictStocksComponents5[] $VALUES;
    public static final RestrictStocksComponents5 ALLOW = new RestrictStocksComponents5("ALLOW", 0);
    public static final RestrictStocksComponents5 RESTRICT = new RestrictStocksComponents5("RESTRICT", 1);

    private static final /* synthetic */ RestrictStocksComponents5[] $values() {
        return new RestrictStocksComponents5[]{ALLOW, RESTRICT};
    }

    public static EnumEntries<RestrictStocksComponents5> getEntries() {
        return $ENTRIES;
    }

    private RestrictStocksComponents5(String str, int i) {
    }

    static {
        RestrictStocksComponents5[] restrictStocksComponents5Arr$values = $values();
        $VALUES = restrictStocksComponents5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(restrictStocksComponents5Arr$values);
    }

    public static RestrictStocksComponents5 valueOf(String str) {
        return (RestrictStocksComponents5) Enum.valueOf(RestrictStocksComponents5.class, str);
    }

    public static RestrictStocksComponents5[] values() {
        return (RestrictStocksComponents5[]) $VALUES.clone();
    }
}
