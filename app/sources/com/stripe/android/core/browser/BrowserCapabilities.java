package com.stripe.android.core.browser;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BrowserCapabilities.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/core/browser/BrowserCapabilities;", "", "(Ljava/lang/String;I)V", "CustomTabs", "Unknown", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class BrowserCapabilities {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BrowserCapabilities[] $VALUES;
    public static final BrowserCapabilities CustomTabs = new BrowserCapabilities("CustomTabs", 0);
    public static final BrowserCapabilities Unknown = new BrowserCapabilities("Unknown", 1);

    private static final /* synthetic */ BrowserCapabilities[] $values() {
        return new BrowserCapabilities[]{CustomTabs, Unknown};
    }

    public static EnumEntries<BrowserCapabilities> getEntries() {
        return $ENTRIES;
    }

    public static BrowserCapabilities valueOf(String str) {
        return (BrowserCapabilities) Enum.valueOf(BrowserCapabilities.class, str);
    }

    public static BrowserCapabilities[] values() {
        return (BrowserCapabilities[]) $VALUES.clone();
    }

    private BrowserCapabilities(String str, int i) {
    }

    static {
        BrowserCapabilities[] browserCapabilitiesArr$values = $values();
        $VALUES = browserCapabilitiesArr$values;
        $ENTRIES = EnumEntries2.enumEntries(browserCapabilitiesArr$values);
    }
}
