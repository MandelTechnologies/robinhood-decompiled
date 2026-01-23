package com.robinhood.shared.crypto.staking.staking.history;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoStakingHistoryDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$3$1", m3645f = "CryptoStakingHistoryDetailComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailComposableKt$CryptoStakingHistoryDetailComposable$3$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoStakingHistoryDetailComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserInteractionEventDescriptor $descriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ CryptoStakingContext $loggingContext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoStakingHistoryDetailComposable4(CryptoStakingContext cryptoStakingContext, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Continuation<? super CryptoStakingHistoryDetailComposable4> continuation) {
        super(2, continuation);
        this.$loggingContext = cryptoStakingContext;
        this.$eventLogger = eventLogger;
        this.$descriptor = userInteractionEventDescriptor;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoStakingHistoryDetailComposable4(this.$loggingContext, this.$eventLogger, this.$descriptor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoStakingHistoryDetailComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$loggingContext != null) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(this.$eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(this.$descriptor, new UserInteractionEventDescriptor(null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$loggingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -536870913, -1, 16383, null), new Component(null, "page", null, 5, null), null, 39, null)), UserInteractionEventData.EventType.APPEAR), false, false, 6, null);
        }
        return Unit.INSTANCE;
    }
}
