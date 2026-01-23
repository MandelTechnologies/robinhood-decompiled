package com.robinhood.android.crypto.costbasis.details.entry;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
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

/* compiled from: CryptoCostBasisEntryComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$InputRow$3$1", m3645f = "CryptoCostBasisEntryComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CryptoCostBasisEntryComposableKt$InputRow$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $currentContext;
    final /* synthetic */ UserInteractionEventDescriptor $descriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ String $inlineError;
    final /* synthetic */ InputRow $inputRow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCostBasisEntryComposableKt$InputRow$3$1(String str, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, InputRow inputRow, Context context, Continuation<? super CryptoCostBasisEntryComposableKt$InputRow$3$1> continuation) {
        super(2, continuation);
        this.$inlineError = str;
        this.$eventLogger = eventLogger;
        this.$descriptor = userInteractionEventDescriptor;
        this.$inputRow = inputRow;
        this.$currentContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoCostBasisEntryComposableKt$InputRow$3$1(this.$inlineError, this.$eventLogger, this.$descriptor, this.$inputRow, this.$currentContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoCostBasisEntryComposableKt$InputRow$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01ff  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Context context;
        CryptoTransferContext cryptoTransferContextCopy;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$inlineError != null) {
            EventLogger eventLogger = this.$eventLogger;
            UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
            Component component = new Component(Component.ComponentType.TEXT_FIELD, this.$inputRow.getType().getLoggingIdentifier(), null, 4, null);
            Context context2 = this.$currentContext;
            if (context2 != null) {
                CryptoTransferContext crypto_transfer_context = context2.getCrypto_transfer_context();
                if (crypto_transfer_context != null) {
                    cryptoTransferContextCopy = crypto_transfer_context.copy((16367 & 1) != 0 ? crypto_transfer_context.currency_id : null, (16367 & 2) != 0 ? crypto_transfer_context.session_id : null, (16367 & 4) != 0 ? crypto_transfer_context.withdrawal_id : null, (16367 & 8) != 0 ? crypto_transfer_context.amount : 0.0d, (16367 & 16) != 0 ? crypto_transfer_context.error_code : null, (16367 & 32) != 0 ? crypto_transfer_context.title : null, (16367 & 64) != 0 ? crypto_transfer_context.completed_kyc : null, (16367 & 128) != 0 ? crypto_transfer_context.completed_mfa : null, (16367 & 256) != 0 ? crypto_transfer_context.security_context : null, (16367 & 512) != 0 ? crypto_transfer_context.transfer_id : null, (16367 & 1024) != 0 ? crypto_transfer_context.party_selection : null, (16367 & 2048) != 0 ? crypto_transfer_context.wallet_selection : null, (16367 & 4096) != 0 ? crypto_transfer_context.error_message : this.$inlineError, (16367 & 8192) != 0 ? crypto_transfer_context.unknownFields() : null);
                } else {
                    cryptoTransferContextCopy = null;
                }
                Context contextCopy$default = Context.copy$default(context2, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null);
                if (contextCopy$default != null) {
                    context = contextCopy$default;
                }
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, context, component, null, 39, null)), UserInteractionEventData.EventType.APPEAR), false, false, 6, null);
            } else {
                context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoTransferContext(null, null, null, 0.0d, null, null, null, null, null, null, null, null, this.$inlineError, null, 12287, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -257, -1, -1, -1, 16383, null);
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, context, component, null, 39, null)), UserInteractionEventData.EventType.APPEAR), false, false, 6, null);
            }
        }
        return Unit.INSTANCE;
    }
}
