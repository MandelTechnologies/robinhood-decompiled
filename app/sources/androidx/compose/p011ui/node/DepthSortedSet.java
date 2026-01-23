package androidx.compose.p011ui.node;

import androidx.collection.ObjectIntMap2;
import androidx.collection.ObjectIntMap3;
import androidx.compose.p011ui.internal.InlineClassHelper4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DepthSortedSet.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/node/LayoutNode;", "safeMapOfOriginalDepth", "()Landroidx/collection/MutableObjectIntMap;", "node", "contains", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", "add", "(Landroidx/compose/ui/node/LayoutNode;)V", "remove", "pop", "()Landroidx/compose/ui/node/LayoutNode;", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "Z", "mapOfOriginalDepth", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/node/TreeSet;", "set", "Landroidx/compose/ui/node/TreeSet;", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DepthSortedSet {
    private final boolean extraAssertions;
    private ObjectIntMap2<LayoutNode> mapOfOriginalDepth;
    private final TreeSet<LayoutNode> set = new TreeSet<>(DepthSortedSet2.DepthComparator);

    public DepthSortedSet(boolean z) {
        this.extraAssertions = z;
    }

    public final boolean contains(LayoutNode node) {
        boolean zContains = this.set.contains(node);
        if (this.extraAssertions) {
            if (!(zContains == safeMapOfOriginalDepth().containsKey(node))) {
                InlineClassHelper4.throwIllegalStateException("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final void add(LayoutNode node) {
        if (!node.isAttached()) {
            InlineClassHelper4.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            ObjectIntMap2<LayoutNode> objectIntMap2SafeMapOfOriginalDepth = safeMapOfOriginalDepth();
            int orDefault = objectIntMap2SafeMapOfOriginalDepth.getOrDefault(node, Integer.MAX_VALUE);
            if (orDefault == Integer.MAX_VALUE) {
                objectIntMap2SafeMapOfOriginalDepth.set(node, node.getDepth());
            } else {
                if (!(orDefault == node.getDepth())) {
                    InlineClassHelper4.throwIllegalStateException("invalid node depth");
                }
            }
        }
        this.set.add(node);
    }

    public final boolean remove(LayoutNode node) {
        if (!node.isAttached()) {
            InlineClassHelper4.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(node);
        if (this.extraAssertions) {
            ObjectIntMap2<LayoutNode> objectIntMap2SafeMapOfOriginalDepth = safeMapOfOriginalDepth();
            if (objectIntMap2SafeMapOfOriginalDepth.containsKey(node)) {
                int i = objectIntMap2SafeMapOfOriginalDepth.get(node);
                objectIntMap2SafeMapOfOriginalDepth.remove(node);
                if (!(i == (zRemove ? node.getDepth() : Integer.MAX_VALUE))) {
                    InlineClassHelper4.throwIllegalStateException("invalid node depth");
                }
            }
        }
        return zRemove;
    }

    public final LayoutNode pop() {
        LayoutNode layoutNodeFirst = this.set.first();
        remove(layoutNodeFirst);
        return layoutNodeFirst;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    private final ObjectIntMap2<LayoutNode> safeMapOfOriginalDepth() {
        if (this.mapOfOriginalDepth == null) {
            this.mapOfOriginalDepth = ObjectIntMap3.mutableObjectIntMapOf();
        }
        ObjectIntMap2<LayoutNode> objectIntMap2 = this.mapOfOriginalDepth;
        Intrinsics.checkNotNull(objectIntMap2);
        return objectIntMap2;
    }

    public String toString() {
        return this.set.toString();
    }
}
