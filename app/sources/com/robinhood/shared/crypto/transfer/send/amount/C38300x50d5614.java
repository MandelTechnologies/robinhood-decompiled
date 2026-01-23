package com.robinhood.shared.crypto.transfer.send.amount;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTransferSendAmountComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$3$3$1", m3645f = "CryptoTransferSendAmountComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$2$3$3$1 */
/* loaded from: classes6.dex */
final class C38300x50d5614 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Boolean> $shouldLogFirstInput$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C38300x50d5614(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, SnapshotState<Boolean> snapshotState, Continuation<? super C38300x50d5614> continuation) {
        super(2, continuation);
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$eventLogger = eventLogger;
        this.$shouldLogFirstInput$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C38300x50d5614(this.$eventDescriptor, this.$eventLogger, this.$shouldLogFirstInput$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C38300x50d5614) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!CryptoTransferSendAmountComposableKt.C382952.AnonymousClass3.invoke$lambda$1(this.$shouldLogFirstInput$delegate)) {
                return Unit.INSTANCE;
            }
            Screen screen = this.$eventDescriptor.getScreen();
            Context context = this.$eventDescriptor.getContext();
            EventLogger.DefaultImpls.logTap$default(this.$eventLogger, UserInteractionEventData.Action.ENTER_TRANSFER_AMOUNT, screen, new Component(Component.ComponentType.TEXT_FIELD, "source_keypad", null, 4, null), null, context, false, 40, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
