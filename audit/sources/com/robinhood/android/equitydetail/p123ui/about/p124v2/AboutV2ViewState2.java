package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AboutV2ViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/about/v2/ExpandBtnColor;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "NONE", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.about.v2.ExpandBtnColor, reason: use source file name */
/* loaded from: classes3.dex */
public final class AboutV2ViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AboutV2ViewState2[] $VALUES;
    public static final AboutV2ViewState2 POSITIVE = new AboutV2ViewState2("POSITIVE", 0);
    public static final AboutV2ViewState2 NEGATIVE = new AboutV2ViewState2("NEGATIVE", 1);
    public static final AboutV2ViewState2 NONE = new AboutV2ViewState2("NONE", 2);

    private static final /* synthetic */ AboutV2ViewState2[] $values() {
        return new AboutV2ViewState2[]{POSITIVE, NEGATIVE, NONE};
    }

    public static EnumEntries<AboutV2ViewState2> getEntries() {
        return $ENTRIES;
    }

    private AboutV2ViewState2(String str, int i) {
    }

    static {
        AboutV2ViewState2[] aboutV2ViewState2Arr$values = $values();
        $VALUES = aboutV2ViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(aboutV2ViewState2Arr$values);
    }

    public static AboutV2ViewState2 valueOf(String str) {
        return (AboutV2ViewState2) Enum.valueOf(AboutV2ViewState2.class, str);
    }

    public static AboutV2ViewState2[] values() {
        return (AboutV2ViewState2[]) $VALUES.clone();
    }
}
