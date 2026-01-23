package com.robinhood.android.options.sharedui.components.banners;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InfoBannerComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/sharedui/components/banners/GradientOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "lib-options-shared-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.sharedui.components.banners.GradientOrientation, reason: use source file name */
/* loaded from: classes11.dex */
public final class InfoBannerComposable2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InfoBannerComposable2[] $VALUES;
    public static final InfoBannerComposable2 HORIZONTAL = new InfoBannerComposable2("HORIZONTAL", 0);
    public static final InfoBannerComposable2 VERTICAL = new InfoBannerComposable2("VERTICAL", 1);

    private static final /* synthetic */ InfoBannerComposable2[] $values() {
        return new InfoBannerComposable2[]{HORIZONTAL, VERTICAL};
    }

    public static EnumEntries<InfoBannerComposable2> getEntries() {
        return $ENTRIES;
    }

    private InfoBannerComposable2(String str, int i) {
    }

    static {
        InfoBannerComposable2[] infoBannerComposable2Arr$values = $values();
        $VALUES = infoBannerComposable2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(infoBannerComposable2Arr$values);
    }

    public static InfoBannerComposable2 valueOf(String str) {
        return (InfoBannerComposable2) Enum.valueOf(InfoBannerComposable2.class, str);
    }

    public static InfoBannerComposable2[] values() {
        return (InfoBannerComposable2[]) $VALUES.clone();
    }
}
