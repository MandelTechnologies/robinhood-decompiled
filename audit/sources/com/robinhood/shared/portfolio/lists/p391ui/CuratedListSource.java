package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CuratedListSource.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/CuratedListSource;", "", "<init>", "(Ljava/lang/String;I)V", "INVEST_TAB", "WATCHLIST_TAB", "CRYPTO_TAB", EducationTourScreenNames.UNSPECIFIED_SCREEN, "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CuratedListSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CuratedListSource[] $VALUES;
    public static final CuratedListSource INVEST_TAB = new CuratedListSource("INVEST_TAB", 0);
    public static final CuratedListSource WATCHLIST_TAB = new CuratedListSource("WATCHLIST_TAB", 1);
    public static final CuratedListSource CRYPTO_TAB = new CuratedListSource("CRYPTO_TAB", 2);
    public static final CuratedListSource UNSPECIFIED = new CuratedListSource(EducationTourScreenNames.UNSPECIFIED_SCREEN, 3);

    private static final /* synthetic */ CuratedListSource[] $values() {
        return new CuratedListSource[]{INVEST_TAB, WATCHLIST_TAB, CRYPTO_TAB, UNSPECIFIED};
    }

    public static EnumEntries<CuratedListSource> getEntries() {
        return $ENTRIES;
    }

    private CuratedListSource(String str, int i) {
    }

    static {
        CuratedListSource[] curatedListSourceArr$values = $values();
        $VALUES = curatedListSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(curatedListSourceArr$values);
    }

    public static CuratedListSource valueOf(String str) {
        return (CuratedListSource) Enum.valueOf(CuratedListSource.class, str);
    }

    public static CuratedListSource[] values() {
        return (CuratedListSource[]) $VALUES.clone();
    }
}
