package com.robinhood.android.common.banner;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MainBannerAppearance.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/banner/BannerStatusBarStyle;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO", "INVERTED", "LIGHT", "DARK", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.banner.BannerStatusBarStyle, reason: use source file name */
/* loaded from: classes2.dex */
public final class MainBannerAppearance2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MainBannerAppearance2[] $VALUES;
    public static final MainBannerAppearance2 AUTO = new MainBannerAppearance2("AUTO", 0);
    public static final MainBannerAppearance2 INVERTED = new MainBannerAppearance2("INVERTED", 1);
    public static final MainBannerAppearance2 LIGHT = new MainBannerAppearance2("LIGHT", 2);
    public static final MainBannerAppearance2 DARK = new MainBannerAppearance2("DARK", 3);

    private static final /* synthetic */ MainBannerAppearance2[] $values() {
        return new MainBannerAppearance2[]{AUTO, INVERTED, LIGHT, DARK};
    }

    public static EnumEntries<MainBannerAppearance2> getEntries() {
        return $ENTRIES;
    }

    private MainBannerAppearance2(String str, int i) {
    }

    static {
        MainBannerAppearance2[] mainBannerAppearance2Arr$values = $values();
        $VALUES = mainBannerAppearance2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(mainBannerAppearance2Arr$values);
    }

    public static MainBannerAppearance2 valueOf(String str) {
        return (MainBannerAppearance2) Enum.valueOf(MainBannerAppearance2.class, str);
    }

    public static MainBannerAppearance2[] values() {
        return (MainBannerAppearance2[]) $VALUES.clone();
    }
}
