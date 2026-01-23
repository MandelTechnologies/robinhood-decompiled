package androidx.compose.foundation.layout;

import androidx.compose.p011ui.layout.Measurable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMarkers;

/* compiled from: ContextualFlowLayout.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fRJ\u0010\u0015\u001a8\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Landroidx/compose/foundation/layout/ContextualFlowItemIterator;", "", "Landroidx/compose/ui/layout/Measurable;", "", "hasNext", "()Z", "next", "()Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/foundation/layout/FlowLineInfo;", SduiFeatureDiscovery3.INFO_TAG, "getNext$foundation_layout_release", "(Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;", "getNext", "", "itemCount", "I", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "getMeasurables", "Lkotlin/jvm/functions/Function2;", "", "_list", "Ljava/util/List;", "itemIndex", "listIndex", "getList", "()Ljava/util/List;", "list", "foundation-layout_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.layout.ContextualFlowItemIterator, reason: use source file name */
/* loaded from: classes4.dex */
public final class ContextualFlowLayout implements Iterator<Measurable>, KMarkers {
    private final List<Measurable> _list;
    private final Function2<Integer, ContextualFlowLayout2, List<Measurable>> getMeasurables;
    private final int itemCount;
    private int itemIndex;
    private int listIndex;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<Measurable> getList() {
        return this._list;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.listIndex < getList().size() || this.itemIndex < this.itemCount;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Measurable next() {
        return getNext$foundation_layout_release$default(this, null, 1, null);
    }

    public static /* synthetic */ Measurable getNext$foundation_layout_release$default(ContextualFlowLayout contextualFlowLayout, ContextualFlowLayout2 contextualFlowLayout2, int i, Object obj) {
        if ((i & 1) != 0) {
            contextualFlowLayout2 = new ContextualFlowLayout2(0, 0, 0.0f, 0.0f, 15, null);
        }
        return contextualFlowLayout.getNext$foundation_layout_release(contextualFlowLayout2);
    }

    public final Measurable getNext$foundation_layout_release(ContextualFlowLayout2 info) {
        if (this.listIndex < getList().size()) {
            Measurable measurable = getList().get(this.listIndex);
            this.listIndex++;
            return measurable;
        }
        int i = this.itemIndex;
        if (i < this.itemCount) {
            List<Measurable> listInvoke = this.getMeasurables.invoke(Integer.valueOf(i), info);
            this.itemIndex++;
            if (listInvoke.isEmpty()) {
                return next();
            }
            Measurable measurable2 = (Measurable) CollectionsKt.first((List) listInvoke);
            this._list.addAll(listInvoke);
            this.listIndex++;
            return measurable2;
        }
        throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.itemIndex);
    }
}
