package com.google.maps.android.compose;

import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MapType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/google/maps/android/compose/MapType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", TransferContext3.NORMAL, "SATELLITE", "TERRAIN", "HYBRID", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class MapType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MapType[] $VALUES;
    private final int value;
    public static final MapType NONE = new MapType("NONE", 0, 0);
    public static final MapType NORMAL = new MapType(TransferContext3.NORMAL, 1, 1);
    public static final MapType SATELLITE = new MapType("SATELLITE", 2, 2);
    public static final MapType TERRAIN = new MapType("TERRAIN", 3, 3);
    public static final MapType HYBRID = new MapType("HYBRID", 4, 4);

    private static final /* synthetic */ MapType[] $values() {
        return new MapType[]{NONE, NORMAL, SATELLITE, TERRAIN, HYBRID};
    }

    public static EnumEntries<MapType> getEntries() {
        return $ENTRIES;
    }

    public static MapType valueOf(String str) {
        return (MapType) Enum.valueOf(MapType.class, str);
    }

    public static MapType[] values() {
        return (MapType[]) $VALUES.clone();
    }

    private MapType(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        MapType[] mapTypeArr$values = $values();
        $VALUES = mapTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(mapTypeArr$values);
    }
}
