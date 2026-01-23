package com.robinhood.android.acatsin.agreement;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AcatsInAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$AcatsInAgreementComposable$3$1", m3645f = "AcatsInAgreementComposable.kt", m3646l = {82}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$AcatsInAgreementComposable$3$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInAgreementComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $hasScrolledToBottom$delegate;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInAgreementComposable4(LazyListState lazyListState, SnapshotState<Boolean> snapshotState, Continuation<? super AcatsInAgreementComposable4> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$hasScrolledToBottom$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsInAgreementComposable4(this.$listState, this.$hasScrolledToBottom$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AcatsInAgreementComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$AcatsInAgreementComposable$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return lazyListState.getLayoutInfo();
                }
            });
            final SnapshotState<Boolean> snapshotState = this.$hasScrolledToBottom$delegate;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$AcatsInAgreementComposable$3$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((LazyListLayoutInfo) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(LazyListLayoutInfo lazyListLayoutInfo, Continuation<? super Unit> continuation) {
                    int viewportEndOffset = lazyListLayoutInfo.getViewportEndOffset() + lazyListLayoutInfo.getViewportStartOffset();
                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) lazyListLayoutInfo.getVisibleItemsInfo());
                    int index = lazyListItemInfo != null ? lazyListItemInfo.getIndex() : -1;
                    boolean z = lazyListItemInfo == null || lazyListItemInfo.getSize() + lazyListItemInfo.getOffset() <= viewportEndOffset;
                    if (index == lazyListLayoutInfo.getTotalItemsCount() - 1 && z && !AcatsInAgreementComposable.AcatsInAgreementComposable$lambda$4(snapshotState)) {
                        AcatsInAgreementComposable.AcatsInAgreementComposable$lambda$5(snapshotState, true);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
