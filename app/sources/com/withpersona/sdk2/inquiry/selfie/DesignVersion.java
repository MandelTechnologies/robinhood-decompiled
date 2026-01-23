package com.withpersona.sdk2.inquiry.selfie;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DesignVersion.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/DesignVersion;", "", "<init>", "(Ljava/lang/String;I)V", "V0", "V1", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DesignVersion {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DesignVersion[] $VALUES;

    /* renamed from: V0 */
    public static final DesignVersion f6512V0 = new DesignVersion("V0", 0);

    /* renamed from: V1 */
    public static final DesignVersion f6513V1 = new DesignVersion("V1", 1);

    private static final /* synthetic */ DesignVersion[] $values() {
        return new DesignVersion[]{f6512V0, f6513V1};
    }

    public static EnumEntries<DesignVersion> getEntries() {
        return $ENTRIES;
    }

    private DesignVersion(String str, int i) {
    }

    static {
        DesignVersion[] designVersionArr$values = $values();
        $VALUES = designVersionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(designVersionArr$values);
    }

    public static DesignVersion valueOf(String str) {
        return (DesignVersion) Enum.valueOf(DesignVersion.class, str);
    }

    public static DesignVersion[] values() {
        return (DesignVersion[]) $VALUES.clone();
    }
}
