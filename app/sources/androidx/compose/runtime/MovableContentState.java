package androidx.compose.runtime;

import androidx.collection.ObjectList;
import androidx.collection.ObjectList2;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMap6;
import androidx.collection.ScatterMap7;
import androidx.compose.runtime.collection.ExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Composer.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J3\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0000¢\u0006\u0002\b\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m3636d2 = {"Landroidx/compose/runtime/MovableContentState;", "", "slotTable", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "extractNestedStates", "Landroidx/collection/ScatterMap;", "Landroidx/compose/runtime/MovableContentStateReference;", "applier", "Landroidx/compose/runtime/Applier;", "references", "Landroidx/collection/ObjectList;", "extractNestedStates$runtime_release", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MovableContentState {
    private final SlotTable slotTable;

    public final ScatterMap<MovableContentStateReference, MovableContentState> extractNestedStates$runtime_release(Applier<?> applier, ObjectList<MovableContentStateReference> references) {
        Object[] objArr = references.content;
        int i = references._size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            if (this.slotTable.ownsAnchor(((MovableContentStateReference) objArr[i2]).getAnchor())) {
                i2++;
            } else {
                ObjectList2 objectList2 = new ObjectList2(0, 1, null);
                Object[] objArr2 = references.content;
                int i3 = references._size;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object obj = objArr2[i4];
                    if (this.slotTable.ownsAnchor(((MovableContentStateReference) obj).getAnchor())) {
                        objectList2.add(obj);
                    }
                }
                references = objectList2;
            }
        }
        ObjectList objectListSortedBy = ExtensionsKt.sortedBy(references, new Function1<MovableContentStateReference, Integer>() { // from class: androidx.compose.runtime.MovableContentState$extractNestedStates$referencesToExtract$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(MovableContentStateReference movableContentStateReference) {
                return Integer.valueOf(this.this$0.getSlotTable().anchorIndex(movableContentStateReference.getAnchor()));
            }
        });
        if (objectListSortedBy.isEmpty()) {
            return ScatterMap7.emptyScatterMap();
        }
        ScatterMap6 scatterMap6MutableScatterMapOf = ScatterMap7.mutableScatterMapOf();
        SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
        try {
            Object[] objArr3 = objectListSortedBy.content;
            int i5 = objectListSortedBy._size;
            for (int i6 = 0; i6 < i5; i6++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr3[i6];
                int iAnchorIndex = slotWriterOpenWriter.anchorIndex(movableContentStateReference.getAnchor());
                int iParent = slotWriterOpenWriter.parent(iAnchorIndex);
                extractNestedStates$lambda$3$closeToGroupContaining(slotWriterOpenWriter, iParent);
                extractNestedStates$lambda$3$openParent(slotWriterOpenWriter, iParent);
                slotWriterOpenWriter.advanceBy(iAnchorIndex - slotWriterOpenWriter.getCurrentGroup());
                scatterMap6MutableScatterMapOf.set(movableContentStateReference, ComposerKt.extractMovableContentAtCurrent(movableContentStateReference.getComposition(), movableContentStateReference, slotWriterOpenWriter, applier));
            }
            extractNestedStates$lambda$3$closeToGroupContaining(slotWriterOpenWriter, Integer.MAX_VALUE);
            Unit unit = Unit.INSTANCE;
            slotWriterOpenWriter.close(true);
            return scatterMap6MutableScatterMapOf;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    public MovableContentState(SlotTable slotTable) {
        this.slotTable = slotTable;
    }

    /* renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    private static final void extractNestedStates$lambda$3$closeToGroupContaining(SlotWriter slotWriter, int i) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i) {
            slotWriter.skipToGroupEnd();
            slotWriter.endGroup();
        }
    }

    private static final void extractNestedStates$lambda$3$openParent(SlotWriter slotWriter, int i) {
        extractNestedStates$lambda$3$closeToGroupContaining(slotWriter, i);
        while (slotWriter.getCurrentGroup() != i && !slotWriter.isGroupEnd()) {
            if (i < ComposerKt.getNextGroup(slotWriter)) {
                slotWriter.startGroup();
            } else {
                slotWriter.skipGroup();
            }
        }
        if (!(slotWriter.getCurrentGroup() == i)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure");
        }
        slotWriter.startGroup();
    }
}
