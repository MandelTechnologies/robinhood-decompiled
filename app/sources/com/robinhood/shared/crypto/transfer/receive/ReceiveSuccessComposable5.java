package com.robinhood.shared.crypto.transfer.receive;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveViewState;
import com.robinhood.utils.compose.ClipboardUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReceiveSuccessComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$BottomBar$1$1$1", m3645f = "ReceiveSuccessComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$BottomBar$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ReceiveSuccessComposable5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ClipboardUtil $clipboardUtil;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ String $primaryButtonText;
    final /* synthetic */ CryptoTransferReceiveViewState.Success $state;
    final /* synthetic */ UserInteractionEventDescriptor $userInteractionEventDescriptor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReceiveSuccessComposable5(ClipboardUtil clipboardUtil, CryptoTransferReceiveViewState.Success success, UserInteractionEventDescriptor userInteractionEventDescriptor, String str, EventLogger eventLogger, Continuation<? super ReceiveSuccessComposable5> continuation) {
        super(2, continuation);
        this.$clipboardUtil = clipboardUtil;
        this.$state = success;
        this.$userInteractionEventDescriptor = userInteractionEventDescriptor;
        this.$primaryButtonText = str;
        this.$eventLogger = eventLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReceiveSuccessComposable5(this.$clipboardUtil, this.$state, this.$userInteractionEventDescriptor, this.$primaryButtonText, this.$eventLogger, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReceiveSuccessComposable5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ClipboardUtil clipboardUtil = this.$clipboardUtil;
            String address = this.$state.getAddress();
            this.label = 1;
            if (ClipboardUtil.copyToClipboardWithHapticFeedback$default(clipboardUtil, address, false, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Screen screen = this.$userInteractionEventDescriptor.getScreen();
        Context context = this.$userInteractionEventDescriptor.getContext();
        Context contextCopy$default = context != null ? Context.copy$default(context, 0, 0, 0, this.$primaryButtonText, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null) : null;
        EventLogger.DefaultImpls.logTap$default(this.$eventLogger, UserInteractionEventData.Action.COPY, screen, new Component(Component.ComponentType.BUTTON, this.$primaryButtonText, null, 4, null), null, contextCopy$default, false, 40, null);
        return Unit.INSTANCE;
    }
}
