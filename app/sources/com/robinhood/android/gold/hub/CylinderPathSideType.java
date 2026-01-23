package com.robinhood.android.gold.hub;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GoldHubCylinderChartComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/CylinderPathSideType;", "", "<init>", "(Ljava/lang/String;I)V", "CONVEX", "FLAT", "CONCAVE", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class CylinderPathSideType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CylinderPathSideType[] $VALUES;
    public static final CylinderPathSideType CONVEX = new CylinderPathSideType("CONVEX", 0);
    public static final CylinderPathSideType FLAT = new CylinderPathSideType("FLAT", 1);
    public static final CylinderPathSideType CONCAVE = new CylinderPathSideType("CONCAVE", 2);

    private static final /* synthetic */ CylinderPathSideType[] $values() {
        return new CylinderPathSideType[]{CONVEX, FLAT, CONCAVE};
    }

    public static EnumEntries<CylinderPathSideType> getEntries() {
        return $ENTRIES;
    }

    private CylinderPathSideType(String str, int i) {
    }

    static {
        CylinderPathSideType[] cylinderPathSideTypeArr$values = $values();
        $VALUES = cylinderPathSideTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cylinderPathSideTypeArr$values);
    }

    public static CylinderPathSideType valueOf(String str) {
        return (CylinderPathSideType) Enum.valueOf(CylinderPathSideType.class, str);
    }

    public static CylinderPathSideType[] values() {
        return (CylinderPathSideType[]) $VALUES.clone();
    }
}
