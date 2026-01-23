package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VerticalScrollbarIndicator.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"verticalScrollIndicator", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "width", "Landroidx/compose/ui/unit/Dp;", "offsetX", "verticalScrollIndicator-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;FF)Landroidx/compose/ui/Modifier;", "payments-ui_release", "visibleItemsSize", "", "scrollbarOffsetY", "", "offsetY", "alpha"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.VerticalScrollbarIndicatorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class VerticalScrollbarIndicator {
    /* renamed from: verticalScrollIndicator-4j6BHR0, reason: not valid java name */
    public static final Modifier m27051verticalScrollIndicator4j6BHR0(Modifier verticalScrollIndicator, LazyListState state, float f, float f2) {
        Intrinsics.checkNotNullParameter(verticalScrollIndicator, "$this$verticalScrollIndicator");
        Intrinsics.checkNotNullParameter(state, "state");
        return ComposedModifier2.composed$default(verticalScrollIndicator, null, new VerticalScrollbarIndicator2(state, f, f2), 1, null);
    }

    /* renamed from: verticalScrollIndicator-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27052verticalScrollIndicator4j6BHR0$default(Modifier modifier, LazyListState lazyListState, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = C2002Dp.m7995constructorimpl(4);
        }
        if ((i & 4) != 0) {
            f2 = C2002Dp.m7995constructorimpl(3);
        }
        return m27051verticalScrollIndicator4j6BHR0(modifier, lazyListState, f, f2);
    }
}
