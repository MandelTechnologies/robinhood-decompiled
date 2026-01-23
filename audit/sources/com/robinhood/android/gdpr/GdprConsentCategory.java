package com.robinhood.android.gdpr;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GdprConsentCategory.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/gdpr/GdprConsentCategory;", "", "<init>", "(Ljava/lang/String;I)V", "FUNCTIONAL", "MARKETING", "PERFORMANCE", "lib-gdpr_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GdprConsentCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GdprConsentCategory[] $VALUES;
    public static final GdprConsentCategory FUNCTIONAL = new GdprConsentCategory("FUNCTIONAL", 0);
    public static final GdprConsentCategory MARKETING = new GdprConsentCategory("MARKETING", 1);
    public static final GdprConsentCategory PERFORMANCE = new GdprConsentCategory("PERFORMANCE", 2);

    private static final /* synthetic */ GdprConsentCategory[] $values() {
        return new GdprConsentCategory[]{FUNCTIONAL, MARKETING, PERFORMANCE};
    }

    public static EnumEntries<GdprConsentCategory> getEntries() {
        return $ENTRIES;
    }

    private GdprConsentCategory(String str, int i) {
    }

    static {
        GdprConsentCategory[] gdprConsentCategoryArr$values = $values();
        $VALUES = gdprConsentCategoryArr$values;
        $ENTRIES = EnumEntries2.enumEntries(gdprConsentCategoryArr$values);
    }

    public static GdprConsentCategory valueOf(String str) {
        return (GdprConsentCategory) Enum.valueOf(GdprConsentCategory.class, str);
    }

    public static GdprConsentCategory[] values() {
        return (GdprConsentCategory[]) $VALUES.clone();
    }
}
