package com.robinhood.shared.trading.tradecomponentscompose.bottomsheets;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Location.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trading/tradecomponentscompose/bottomsheets/Location;", "", "<init>", "(Ljava/lang/String;I)V", "LADDER", "MAC", "lib-trade-components-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Location {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Location[] $VALUES;
    public static final Location LADDER = new Location("LADDER", 0);
    public static final Location MAC = new Location("MAC", 1);

    private static final /* synthetic */ Location[] $values() {
        return new Location[]{LADDER, MAC};
    }

    public static EnumEntries<Location> getEntries() {
        return $ENTRIES;
    }

    private Location(String str, int i) {
    }

    static {
        Location[] locationArr$values = $values();
        $VALUES = locationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(locationArr$values);
    }

    public static Location valueOf(String str) {
        return (Location) Enum.valueOf(Location.class, str);
    }

    public static Location[] values() {
        return (Location[]) $VALUES.clone();
    }
}
