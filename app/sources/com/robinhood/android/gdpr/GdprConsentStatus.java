package com.robinhood.android.gdpr;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GdprConsentStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gdpr/GdprConsentStatus;", "", "isEnabled", "", "isCollected", "<init>", "(Ljava/lang/String;IZZ)V", "()Z", "GRANTED", "REJECTED", "UNKNOWN", "lib-gdpr_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GdprConsentStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GdprConsentStatus[] $VALUES;
    public static final GdprConsentStatus GRANTED = new GdprConsentStatus("GRANTED", 0, true, true);
    public static final GdprConsentStatus REJECTED = new GdprConsentStatus("REJECTED", 1, false, true);
    public static final GdprConsentStatus UNKNOWN = new GdprConsentStatus("UNKNOWN", 2, false, false);
    private final boolean isCollected;
    private final boolean isEnabled;

    private static final /* synthetic */ GdprConsentStatus[] $values() {
        return new GdprConsentStatus[]{GRANTED, REJECTED, UNKNOWN};
    }

    public static EnumEntries<GdprConsentStatus> getEntries() {
        return $ENTRIES;
    }

    private GdprConsentStatus(String str, int i, boolean z, boolean z2) {
        this.isEnabled = z;
        this.isCollected = z2;
    }

    /* renamed from: isCollected, reason: from getter */
    public final boolean getIsCollected() {
        return this.isCollected;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    static {
        GdprConsentStatus[] gdprConsentStatusArr$values = $values();
        $VALUES = gdprConsentStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(gdprConsentStatusArr$values);
    }

    public static GdprConsentStatus valueOf(String str) {
        return (GdprConsentStatus) Enum.valueOf(GdprConsentStatus.class, str);
    }

    public static GdprConsentStatus[] values() {
        return (GdprConsentStatus[]) $VALUES.clone();
    }
}
