package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GpsPrecisionAuthorization.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionAuthorization;", "", "<init>", "(Ljava/lang/String;I)V", "ROUGH", "PRECISE", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GpsPrecisionAuthorization {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GpsPrecisionAuthorization[] $VALUES;
    public static final GpsPrecisionAuthorization ROUGH = new GpsPrecisionAuthorization("ROUGH", 0);
    public static final GpsPrecisionAuthorization PRECISE = new GpsPrecisionAuthorization("PRECISE", 1);

    private static final /* synthetic */ GpsPrecisionAuthorization[] $values() {
        return new GpsPrecisionAuthorization[]{ROUGH, PRECISE};
    }

    public static EnumEntries<GpsPrecisionAuthorization> getEntries() {
        return $ENTRIES;
    }

    private GpsPrecisionAuthorization(String str, int i) {
    }

    static {
        GpsPrecisionAuthorization[] gpsPrecisionAuthorizationArr$values = $values();
        $VALUES = gpsPrecisionAuthorizationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(gpsPrecisionAuthorizationArr$values);
    }

    public static GpsPrecisionAuthorization valueOf(String str) {
        return (GpsPrecisionAuthorization) Enum.valueOf(GpsPrecisionAuthorization.class, str);
    }

    public static GpsPrecisionAuthorization[] values() {
        return (GpsPrecisionAuthorization[]) $VALUES.clone();
    }
}
