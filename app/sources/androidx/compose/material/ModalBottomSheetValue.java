package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ModalBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "", "(Ljava/lang/String;I)V", "Hidden", "Expanded", "HalfExpanded", "material_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class ModalBottomSheetValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ModalBottomSheetValue[] $VALUES;
    public static final ModalBottomSheetValue Hidden = new ModalBottomSheetValue("Hidden", 0);
    public static final ModalBottomSheetValue Expanded = new ModalBottomSheetValue("Expanded", 1);
    public static final ModalBottomSheetValue HalfExpanded = new ModalBottomSheetValue("HalfExpanded", 2);

    private static final /* synthetic */ ModalBottomSheetValue[] $values() {
        return new ModalBottomSheetValue[]{Hidden, Expanded, HalfExpanded};
    }

    public static EnumEntries<ModalBottomSheetValue> getEntries() {
        return $ENTRIES;
    }

    public static ModalBottomSheetValue valueOf(String str) {
        return (ModalBottomSheetValue) Enum.valueOf(ModalBottomSheetValue.class, str);
    }

    public static ModalBottomSheetValue[] values() {
        return (ModalBottomSheetValue[]) $VALUES.clone();
    }

    private ModalBottomSheetValue(String str, int i) {
    }

    static {
        ModalBottomSheetValue[] modalBottomSheetValueArr$values = $values();
        $VALUES = modalBottomSheetValueArr$values;
        $ENTRIES = EnumEntries2.enumEntries(modalBottomSheetValueArr$values);
    }
}
