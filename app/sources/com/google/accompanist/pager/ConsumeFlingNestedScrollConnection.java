package com.google.accompanist.pager;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier8;
import androidx.compose.p011ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pager.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J#\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m3636d2 = {"Lcom/google/accompanist/pager/ConsumeFlingNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "consumeHorizontal", "", "consumeVertical", "pagerState", "Lcom/google/accompanist/pager/PagerState;", "(ZZLcom/google/accompanist/pager/PagerState;)V", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "pager_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
final class ConsumeFlingNestedScrollConnection implements NestedScrollModifier {
    private final boolean consumeHorizontal;
    private final boolean consumeVertical;
    private final PagerState pagerState;

    public ConsumeFlingNestedScrollConnection(boolean z, boolean z2, PagerState pagerState) {
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        this.consumeHorizontal = z;
        this.consumeVertical = z2;
        this.pagerState = pagerState;
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo5024onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (NestedScrollModifier8.m7133equalsimpl0(source, NestedScrollModifier8.INSTANCE.m7134getFlingWNlRxjI())) {
            return Pager.m9195consume9KIMszo(available, this.consumeHorizontal, this.consumeVertical);
        }
        return Offset.INSTANCE.m6553getZeroF1C5BW0();
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        long jM8109getZero9UxMQ8M;
        if (this.pagerState.getCurrentPageOffset() == 0.0f) {
            jM8109getZero9UxMQ8M = Pager.m9196consumeBMRW4eQ(j2, this.consumeHorizontal, this.consumeVertical);
        } else {
            jM8109getZero9UxMQ8M = Velocity.INSTANCE.m8109getZero9UxMQ8M();
        }
        return Velocity.m8095boximpl(jM8109getZero9UxMQ8M);
    }
}
