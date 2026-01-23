package com.robinhood.compose.bento.component;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TopBarScrollState.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.compose.bento.component.TopBarScrollStateKt$scrollableTopBarState$1$1$1", m3645f = "TopBarScrollState.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.TopBarScrollStateKt$scrollableTopBarState$1$1$1, reason: use source file name */
/* loaded from: classes15.dex */
final class TopBarScrollState4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ SnapshotState<Integer> $topBarHeight$delegate;
    final /* synthetic */ TopBarScrollState $topBarScrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TopBarScrollState4(ScrollState scrollState, TopBarScrollState topBarScrollState, SnapshotState<Integer> snapshotState, Continuation<? super TopBarScrollState4> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$topBarScrollState = topBarScrollState;
        this.$topBarHeight$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopBarScrollState4(this.$scrollState, this.$topBarScrollState, this.$topBarHeight$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TopBarScrollState4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Integer numBoxInt = boxing.boxInt(this.$scrollState.getMaxValue());
        int iIntValue = numBoxInt.intValue();
        Integer numInvoke$lambda$1 = null;
        if (iIntValue <= 0 || iIntValue >= Integer.MAX_VALUE) {
            numBoxInt = null;
        }
        if (numBoxInt != null) {
            Integer numInvoke$lambda$12 = TopBarScrollState3.C325331.invoke$lambda$1(this.$topBarHeight$delegate);
            if (numInvoke$lambda$12 != null) {
                numInvoke$lambda$1 = boxing.boxInt(RangesKt.coerceAtMost(numInvoke$lambda$12.intValue(), numBoxInt.intValue()));
            }
        } else {
            numInvoke$lambda$1 = TopBarScrollState3.C325331.invoke$lambda$1(this.$topBarHeight$delegate);
        }
        this.$topBarScrollState.setValue(TopBarScrollState3.deriveTopBarValue(this.$scrollState.getValue(), numInvoke$lambda$1));
        return Unit.INSTANCE;
    }
}
