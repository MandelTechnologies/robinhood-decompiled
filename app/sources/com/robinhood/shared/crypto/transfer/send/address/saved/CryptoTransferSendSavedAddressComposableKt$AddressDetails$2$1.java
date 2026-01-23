package com.robinhood.shared.crypto.transfer.send.address.saved;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
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

/* compiled from: CryptoTransferSendSavedAddressComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt$AddressDetails$2$1", m3645f = "CryptoTransferSendSavedAddressComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CryptoTransferSendSavedAddressComposableKt$AddressDetails$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Boolean> $shouldLogFirstAddressInput$delegate;
    final /* synthetic */ UserInteractionEventDescriptor $userInteractionEventData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTransferSendSavedAddressComposableKt$AddressDetails$2$1(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, SnapshotState<Boolean> snapshotState, Continuation<? super CryptoTransferSendSavedAddressComposableKt$AddressDetails$2$1> continuation) {
        super(2, continuation);
        this.$userInteractionEventData = userInteractionEventDescriptor;
        this.$eventLogger = eventLogger;
        this.$shouldLogFirstAddressInput$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoTransferSendSavedAddressComposableKt$AddressDetails$2$1(this.$userInteractionEventData, this.$eventLogger, this.$shouldLogFirstAddressInput$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoTransferSendSavedAddressComposableKt$AddressDetails$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!CryptoTransferSendSavedAddressComposableKt.AddressDetails$lambda$9(this.$shouldLogFirstAddressInput$delegate)) {
                return Unit.INSTANCE;
            }
            Screen screen = this.$userInteractionEventData.getScreen();
            Context context = this.$userInteractionEventData.getContext();
            Component component = new Component(Component.ComponentType.TEXT_FIELD, null, null, 6, null);
            EventLogger.DefaultImpls.logTap$default(this.$eventLogger, UserInteractionEventData.Action.ENTER_TRANSFER_ADDRESS, screen, component, null, context, false, 40, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
