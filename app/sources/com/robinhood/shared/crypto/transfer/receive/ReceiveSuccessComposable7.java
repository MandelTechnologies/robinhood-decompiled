package com.robinhood.shared.crypto.transfer.receive;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
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
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$MemoBanner$1$1$1", m3645f = "ReceiveSuccessComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.receive.ReceiveSuccessComposableKt$MemoBanner$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ReceiveSuccessComposable7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $addressTag;
    final /* synthetic */ ClipboardUtil $clipboardUtil;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ UserInteractionEventDescriptor $userInteractionEventDescriptor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReceiveSuccessComposable7(ClipboardUtil clipboardUtil, String str, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Continuation<? super ReceiveSuccessComposable7> continuation) {
        super(2, continuation);
        this.$clipboardUtil = clipboardUtil;
        this.$addressTag = str;
        this.$userInteractionEventDescriptor = userInteractionEventDescriptor;
        this.$eventLogger = eventLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReceiveSuccessComposable7(this.$clipboardUtil, this.$addressTag, this.$userInteractionEventDescriptor, this.$eventLogger, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReceiveSuccessComposable7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ReceiveSuccessComposable7 receiveSuccessComposable7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ClipboardUtil clipboardUtil = this.$clipboardUtil;
            String str = this.$addressTag;
            this.label = 1;
            receiveSuccessComposable7 = this;
            if (ClipboardUtil.copyToClipboardWithHapticFeedback$default(clipboardUtil, str, false, receiveSuccessComposable7, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            receiveSuccessComposable7 = this;
        }
        Component component = new Component(Component.ComponentType.INFO_BANNER, "copy_memo_banner", null, 4, null);
        EventLogger.DefaultImpls.logUserInteractionEvent$default(receiveSuccessComposable7.$eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(receiveSuccessComposable7.$userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.COPY, null, component, null, 43, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        return Unit.INSTANCE;
    }
}
