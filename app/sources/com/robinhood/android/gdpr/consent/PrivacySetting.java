package com.robinhood.android.gdpr.consent;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrivacySetting.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gdpr/consent/PrivacySetting;", "", "analyticsIdentifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsIdentifier", "()Ljava/lang/String;", "STRICTLY_NECESSARY", "FUNCTIONAL", "MARKETING", "PERFORMANCE", "feature-gdpr-consent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PrivacySetting {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PrivacySetting[] $VALUES;
    private final String analyticsIdentifier;
    public static final PrivacySetting STRICTLY_NECESSARY = new PrivacySetting("STRICTLY_NECESSARY", 0, "strictly_necessary");
    public static final PrivacySetting FUNCTIONAL = new PrivacySetting("FUNCTIONAL", 1, "functional");
    public static final PrivacySetting MARKETING = new PrivacySetting("MARKETING", 2, "marketing");
    public static final PrivacySetting PERFORMANCE = new PrivacySetting("PERFORMANCE", 3, "performance");

    private static final /* synthetic */ PrivacySetting[] $values() {
        return new PrivacySetting[]{STRICTLY_NECESSARY, FUNCTIONAL, MARKETING, PERFORMANCE};
    }

    public static EnumEntries<PrivacySetting> getEntries() {
        return $ENTRIES;
    }

    private PrivacySetting(String str, int i, String str2) {
        this.analyticsIdentifier = str2;
    }

    public final String getAnalyticsIdentifier() {
        return this.analyticsIdentifier;
    }

    static {
        PrivacySetting[] privacySettingArr$values = $values();
        $VALUES = privacySettingArr$values;
        $ENTRIES = EnumEntries2.enumEntries(privacySettingArr$values);
    }

    public static PrivacySetting valueOf(String str) {
        return (PrivacySetting) Enum.valueOf(PrivacySetting.class, str);
    }

    public static PrivacySetting[] values() {
        return (PrivacySetting[]) $VALUES.clone();
    }
}
