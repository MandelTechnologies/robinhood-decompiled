package com.google.maps.android.compose;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Marker.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/google/maps/android/compose/DragState;", "", "(Ljava/lang/String;I)V", "START", "DRAG", "END", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DragState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DragState[] $VALUES;
    public static final DragState START = new DragState("START", 0);
    public static final DragState DRAG = new DragState("DRAG", 1);
    public static final DragState END = new DragState("END", 2);

    private static final /* synthetic */ DragState[] $values() {
        return new DragState[]{START, DRAG, END};
    }

    public static EnumEntries<DragState> getEntries() {
        return $ENTRIES;
    }

    public static DragState valueOf(String str) {
        return (DragState) Enum.valueOf(DragState.class, str);
    }

    public static DragState[] values() {
        return (DragState[]) $VALUES.clone();
    }

    private DragState(String str, int i) {
    }

    static {
        DragState[] dragStateArr$values = $values();
        $VALUES = dragStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(dragStateArr$values);
    }
}
