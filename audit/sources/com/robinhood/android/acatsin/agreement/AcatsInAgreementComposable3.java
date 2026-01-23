package com.robinhood.android.acatsin.agreement;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsInAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$AcatsInAgreementComposable$2$1", m3645f = "AcatsInAgreementComposable.kt", m3646l = {77}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$AcatsInAgreementComposable$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInAgreementComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ SnapshotState<Boolean> $shouldScrollToBottom$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInAgreementComposable3(LazyListState lazyListState, SnapshotState<Boolean> snapshotState, Continuation<? super AcatsInAgreementComposable3> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$shouldScrollToBottom$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsInAgreementComposable3(this.$listState, this.$shouldScrollToBottom$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AcatsInAgreementComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        AcatsInAgreementComposable3 acatsInAgreementComposable3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!AcatsInAgreementComposable.AcatsInAgreementComposable$lambda$1(this.$shouldScrollToBottom$delegate)) {
                return Unit.INSTANCE;
            }
            LazyListState lazyListState = this.$listState;
            int totalItemsCount = lazyListState.getLayoutInfo().getTotalItemsCount();
            this.label = 1;
            acatsInAgreementComposable3 = this;
            if (LazyListState.animateScrollToItem$default(lazyListState, totalItemsCount, 0, acatsInAgreementComposable3, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            acatsInAgreementComposable3 = this;
        }
        AcatsInAgreementComposable.AcatsInAgreementComposable$lambda$2(acatsInAgreementComposable3.$shouldScrollToBottom$delegate, false);
        return Unit.INSTANCE;
    }
}
