package androidx.compose.p011ui.node;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TraversableNode.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"androidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction", "", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "<init>", "(Ljava/lang/String;I)V", "ContinueTraversal", "SkipSubtreeAndContinueTraversal", "CancelTraversal", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction, reason: use source file name */
/* loaded from: classes4.dex */
public final class TraversableNode2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TraversableNode2[] $VALUES;
    public static final TraversableNode2 ContinueTraversal = new TraversableNode2("ContinueTraversal", 0);
    public static final TraversableNode2 SkipSubtreeAndContinueTraversal = new TraversableNode2("SkipSubtreeAndContinueTraversal", 1);
    public static final TraversableNode2 CancelTraversal = new TraversableNode2("CancelTraversal", 2);

    private static final /* synthetic */ TraversableNode2[] $values() {
        return new TraversableNode2[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
    }

    public static EnumEntries<TraversableNode2> getEntries() {
        return $ENTRIES;
    }

    public static TraversableNode2 valueOf(String str) {
        return (TraversableNode2) Enum.valueOf(TraversableNode2.class, str);
    }

    public static TraversableNode2[] values() {
        return (TraversableNode2[]) $VALUES.clone();
    }

    private TraversableNode2(String str, int i) {
    }

    static {
        TraversableNode2[] traversableNode2Arr$values = $values();
        $VALUES = traversableNode2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(traversableNode2Arr$values);
    }
}
