package com.robinhood.android.event.gamedetail.p130ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeltaDirection.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/DeltaDirection;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "NEUTRAL", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class DeltaDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeltaDirection[] $VALUES;
    public static final DeltaDirection POSITIVE = new DeltaDirection("POSITIVE", 0);
    public static final DeltaDirection NEGATIVE = new DeltaDirection("NEGATIVE", 1);
    public static final DeltaDirection NEUTRAL = new DeltaDirection("NEUTRAL", 2);

    private static final /* synthetic */ DeltaDirection[] $values() {
        return new DeltaDirection[]{POSITIVE, NEGATIVE, NEUTRAL};
    }

    public static EnumEntries<DeltaDirection> getEntries() {
        return $ENTRIES;
    }

    private DeltaDirection(String str, int i) {
    }

    static {
        DeltaDirection[] deltaDirectionArr$values = $values();
        $VALUES = deltaDirectionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(deltaDirectionArr$values);
    }

    public static DeltaDirection valueOf(String str) {
        return (DeltaDirection) Enum.valueOf(DeltaDirection.class, str);
    }

    public static DeltaDirection[] values() {
        return (DeltaDirection[]) $VALUES.clone();
    }
}
