package com.robinhood.utils.extensions;

import android.view.View;
import android.view.ViewGroup;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMarkers4;

/* compiled from: ViewGroups.kt */
@Metadata(m3635d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"com/robinhood/utils/extensions/ViewGroupsKt$childrenReversed$1$iterator$1", "", "Landroid/view/View;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "hasNext", "", "next", "remove", "", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.ViewGroupsKt$childrenReversed$1$iterator$1, reason: use source file name */
/* loaded from: classes12.dex */
public final class ViewGroups3 implements Iterator<View>, KMarkers4 {
    final /* synthetic */ ViewGroup $this_childrenReversed;
    private int index;

    ViewGroups3(ViewGroup viewGroup) {
        this.$this_childrenReversed = viewGroup;
        this.index = viewGroup.getChildCount() - 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index >= 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public View next() {
        ViewGroup viewGroup = this.$this_childrenReversed;
        int i = this.index;
        this.index = i - 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public void remove() {
        ViewGroup viewGroup = this.$this_childrenReversed;
        int i = this.index + 1;
        this.index = i;
        viewGroup.removeViewAt(i);
    }
}
