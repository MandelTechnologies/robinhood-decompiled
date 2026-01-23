package com.twilio.conversations;

import com.plaid.internal.EnumC7081g;
import com.twilio.conversations.internal.CallbackListenerForwarder;
import com.twilio.conversations.media.MediaClient;
import com.twilio.util.InternalUtils3;
import com.twilio.util.TwilioException;
import com.twilio.util.TwilioException2;
import com.twilio.util.TwilioLogger3;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MessageImpl.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.conversations.MessageImpl$getTemporaryContentUrl$job$1", m3645f = "MessageImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.twilio.conversations.MessageImpl$getTemporaryContentUrl$job$1, reason: use source file name */
/* loaded from: classes12.dex */
final class MessageImpl3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CallbackListenerForwarder<String> $listenerForwarder;
    final /* synthetic */ String $mediaSid;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MessageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageImpl3(CallbackListenerForwarder<String> callbackListenerForwarder, MessageImpl messageImpl, String str, Continuation<? super MessageImpl3> continuation) {
        super(2, continuation);
        this.$listenerForwarder = callbackListenerForwarder;
        this.this$0 = messageImpl;
        this.$mediaSid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageImpl3 messageImpl3 = new MessageImpl3(this.$listenerForwarder, this.this$0, this.$mediaSid, continuation);
        messageImpl3.L$0 = obj;
        return messageImpl3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageImpl3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        ?? r1;
        CoroutineScope coroutineScope;
        String str;
        CallbackListenerForwarder<String> callbackListenerForwarder;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            r1 = i;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ?? r12 = (CoroutineScope) this.L$0;
            MessageImpl messageImpl = this.this$0;
            String str2 = this.$mediaSid;
            Result.Companion companion2 = Result.INSTANCE;
            MediaClient mediaClient = messageImpl.getMediaClient();
            this.L$0 = r12;
            this.label = 1;
            obj = mediaClient.getTemporaryContentUrl(str2, this);
            i = r12;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                callbackListenerForwarder = (CallbackListenerForwarder) this.L$2;
                str = (String) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                TwilioException twilioException = (TwilioException) obj;
                TwilioLogger3.getLogger(coroutineScope).m3192e("Error getting temporary url for media: " + str, twilioException);
                callbackListenerForwarder.onError(twilioException.getErrorInfo());
                return Unit.INSTANCE;
            }
            ?? r13 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = r13;
        }
        objM28550constructorimpl = Result.m28550constructorimpl((String) obj);
        r1 = i;
        String str3 = this.$mediaSid;
        CallbackListenerForwarder<String> callbackListenerForwarder2 = this.$listenerForwarder;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            TwilioException2 twilioException2 = TwilioException2.MediaFetchError;
            this.L$0 = r1;
            this.L$1 = str3;
            this.L$2 = callbackListenerForwarder2;
            this.label = 2;
            obj = InternalUtils3.toTwilioException(thM28553exceptionOrNullimpl, twilioException2, this);
            if (obj != coroutine_suspended) {
                coroutineScope = r1;
                str = str3;
                callbackListenerForwarder = callbackListenerForwarder2;
                TwilioException twilioException3 = (TwilioException) obj;
                TwilioLogger3.getLogger(coroutineScope).m3192e("Error getting temporary url for media: " + str, twilioException3);
                callbackListenerForwarder.onError(twilioException3.getErrorInfo());
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        this.$listenerForwarder.onSuccess((String) objM28550constructorimpl);
        return Unit.INSTANCE;
    }
}
