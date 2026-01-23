package com.robinhood.android.crypto.costbasis.details.list;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoCostBasisDetailsListComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$4$1", m3645f = "CryptoCostBasisDetailsListComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt$CryptoCostBasisDetailsListComposableContent$4$1 */
/* loaded from: classes2.dex */
final class C12858xf6519a7b extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserInteractionEventDescriptor $descriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Boolean> $savedIsCompleted$delegate;
    final /* synthetic */ CryptoCostBasisDetailsListViewState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C12858xf6519a7b(CryptoCostBasisDetailsListViewState cryptoCostBasisDetailsListViewState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState<Boolean> snapshotState, Continuation<? super C12858xf6519a7b> continuation) {
        super(2, continuation);
        this.$state = cryptoCostBasisDetailsListViewState;
        this.$eventLogger = eventLogger;
        this.$descriptor = userInteractionEventDescriptor;
        this.$savedIsCompleted$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C12858xf6519a7b(this.$state, this.$eventLogger, this.$descriptor, this.$savedIsCompleted$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C12858xf6519a7b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual(this.$state.isCompleted(), boxing.boxBoolean(true)) && Intrinsics.areEqual(CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposableContent$lambda$11(this.$savedIsCompleted$delegate), boxing.boxBoolean(false))) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(this.$eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(this.$descriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CRYPTO_TRANSFER_ADD_COST_BASIS_COMPLETED, null, null, null, 59, null)), UserInteractionEventData.EventType.EVENT_TYPE_UNSPECIFIED), false, false, 6, null);
        }
        this.$savedIsCompleted$delegate.setValue(this.$state.isCompleted());
        return Unit.INSTANCE;
    }
}
