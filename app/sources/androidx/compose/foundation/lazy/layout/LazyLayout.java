package androidx.compose.foundation.lazy.layout;

import androidx.collection.ObjectIntMap2;
import androidx.collection.ObjectIntMap3;
import androidx.compose.p011ui.layout.SubcomposeSlotReusePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyLayout.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "factory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;)V", "countPerType", "Landroidx/collection/MutableObjectIntMap;", "", "areCompatible", "", "slotId", "reusableSlotId", "getSlotsToRetain", "", "slotIds", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemReusePolicy, reason: use source file name */
/* loaded from: classes4.dex */
final class LazyLayout implements SubcomposeSlotReusePolicy {
    private final ObjectIntMap2<Object> countPerType = ObjectIntMap3.mutableObjectIntMapOf();
    private final LazyLayoutItemContentFactory factory;

    public LazyLayout(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        this.factory = lazyLayoutItemContentFactory;
    }

    @Override // androidx.compose.p011ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIds) {
        this.countPerType.clear();
        for (Object obj : slotIds) {
            Object contentType = this.factory.getContentType(obj);
            int orDefault = this.countPerType.getOrDefault(contentType, 0);
            if (orDefault == 7) {
                slotIds.remove(obj);
            } else {
                this.countPerType.set(contentType, orDefault + 1);
            }
        }
    }

    @Override // androidx.compose.p011ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object slotId, Object reusableSlotId) {
        return Intrinsics.areEqual(this.factory.getContentType(slotId), this.factory.getContentType(reusableSlotId));
    }
}
