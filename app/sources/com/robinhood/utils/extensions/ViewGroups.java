package com.robinhood.utils.extensions;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: ViewGroups.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0017\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0086\b\u001a3\u0010\n\u001a\u00020\b*\u00020\u00022!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\fH\u0086\bø\u0001\u0000\"\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, m3636d2 = {"inflate", "Landroid/view/View;", "Landroid/view/ViewGroup;", "id", "", "attachToRoot", "", "inflateInto", "", "resId", "forEachChild", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "child", "childrenReversed", "Lkotlin/sequences/Sequence;", "getChildrenReversed", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.ViewGroupsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class ViewGroups {
    public static /* synthetic */ View inflate$default(ViewGroup viewGroup, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return inflate(viewGroup, i, z);
    }

    public static final View inflate(ViewGroup viewGroup, int i, boolean z) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(i, viewGroup, z);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public static final void inflateInto(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        inflate(viewGroup, i, true);
    }

    public static final void forEachChild(ViewGroup viewGroup, Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            action.invoke(childAt);
        }
    }

    public static final Sequence<View> getChildrenReversed(final ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return new Sequence<View>() { // from class: com.robinhood.utils.extensions.ViewGroupsKt$childrenReversed$1
            @Override // kotlin.sequences.Sequence
            /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
            public Iterator<View> iterator2() {
                return new ViewGroups3(viewGroup);
            }
        };
    }
}
