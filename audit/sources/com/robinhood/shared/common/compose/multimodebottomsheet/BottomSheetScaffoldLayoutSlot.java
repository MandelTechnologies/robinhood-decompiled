package com.robinhood.shared.common.compose.multimodebottomsheet;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MultiModeBottomSheetScaffold.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/common/compose/multimodebottomsheet/BottomSheetScaffoldLayoutSlot;", "", "<init>", "(Ljava/lang/String;I)V", "TopBar", "Body", "Sheet", "Snackbar", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
final class BottomSheetScaffoldLayoutSlot {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BottomSheetScaffoldLayoutSlot[] $VALUES;
    public static final BottomSheetScaffoldLayoutSlot TopBar = new BottomSheetScaffoldLayoutSlot("TopBar", 0);
    public static final BottomSheetScaffoldLayoutSlot Body = new BottomSheetScaffoldLayoutSlot("Body", 1);
    public static final BottomSheetScaffoldLayoutSlot Sheet = new BottomSheetScaffoldLayoutSlot("Sheet", 2);
    public static final BottomSheetScaffoldLayoutSlot Snackbar = new BottomSheetScaffoldLayoutSlot("Snackbar", 3);

    private static final /* synthetic */ BottomSheetScaffoldLayoutSlot[] $values() {
        return new BottomSheetScaffoldLayoutSlot[]{TopBar, Body, Sheet, Snackbar};
    }

    public static EnumEntries<BottomSheetScaffoldLayoutSlot> getEntries() {
        return $ENTRIES;
    }

    static {
        BottomSheetScaffoldLayoutSlot[] bottomSheetScaffoldLayoutSlotArr$values = $values();
        $VALUES = bottomSheetScaffoldLayoutSlotArr$values;
        $ENTRIES = EnumEntries2.enumEntries(bottomSheetScaffoldLayoutSlotArr$values);
    }

    private BottomSheetScaffoldLayoutSlot(String str, int i) {
    }

    public static BottomSheetScaffoldLayoutSlot valueOf(String str) {
        return (BottomSheetScaffoldLayoutSlot) Enum.valueOf(BottomSheetScaffoldLayoutSlot.class, str);
    }

    public static BottomSheetScaffoldLayoutSlot[] values() {
        return (BottomSheetScaffoldLayoutSlot[]) $VALUES.clone();
    }
}
