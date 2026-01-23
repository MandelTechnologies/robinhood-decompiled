package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionHandles.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "", "(Ljava/lang/String;I)V", "Left", "Middle", "Right", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.SelectionHandleAnchor, reason: use source file name */
/* loaded from: classes4.dex */
public final class SelectionHandles3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SelectionHandles3[] $VALUES;
    public static final SelectionHandles3 Left = new SelectionHandles3("Left", 0);
    public static final SelectionHandles3 Middle = new SelectionHandles3("Middle", 1);
    public static final SelectionHandles3 Right = new SelectionHandles3("Right", 2);

    private static final /* synthetic */ SelectionHandles3[] $values() {
        return new SelectionHandles3[]{Left, Middle, Right};
    }

    public static EnumEntries<SelectionHandles3> getEntries() {
        return $ENTRIES;
    }

    public static SelectionHandles3 valueOf(String str) {
        return (SelectionHandles3) Enum.valueOf(SelectionHandles3.class, str);
    }

    public static SelectionHandles3[] values() {
        return (SelectionHandles3[]) $VALUES.clone();
    }

    private SelectionHandles3(String str, int i) {
    }

    static {
        SelectionHandles3[] selectionHandles3Arr$values = $values();
        $VALUES = selectionHandles3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(selectionHandles3Arr$values);
    }
}
