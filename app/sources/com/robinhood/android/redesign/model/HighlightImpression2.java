package com.robinhood.android.redesign.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HighlightImpression.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/redesign/model/ImpressionType;", "", "<init>", "(Ljava/lang/String;I)V", "BADGE", "HIGHLIGHT", "lib-db-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesign.model.ImpressionType, reason: use source file name */
/* loaded from: classes5.dex */
public final class HighlightImpression2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HighlightImpression2[] $VALUES;
    public static final HighlightImpression2 BADGE = new HighlightImpression2("BADGE", 0);
    public static final HighlightImpression2 HIGHLIGHT = new HighlightImpression2("HIGHLIGHT", 1);

    private static final /* synthetic */ HighlightImpression2[] $values() {
        return new HighlightImpression2[]{BADGE, HIGHLIGHT};
    }

    public static EnumEntries<HighlightImpression2> getEntries() {
        return $ENTRIES;
    }

    private HighlightImpression2(String str, int i) {
    }

    static {
        HighlightImpression2[] highlightImpression2Arr$values = $values();
        $VALUES = highlightImpression2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(highlightImpression2Arr$values);
    }

    public static HighlightImpression2 valueOf(String str) {
        return (HighlightImpression2) Enum.valueOf(HighlightImpression2.class, str);
    }

    public static HighlightImpression2[] values() {
        return (HighlightImpression2[]) $VALUES.clone();
    }
}
