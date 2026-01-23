package com.twilio.conversations;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.twilio.conversations.Conversation;
import com.twilio.conversations.Messages;
import com.twilio.conversations.content.ContentTemplateVariable;
import com.twilio.conversations.internal.CallbackListenerForwarder;
import com.twilio.conversations.internal.MediaUploadListenerForwarder;
import com.twilio.conversations.media.MediaClient;
import com.twilio.conversations.media.MediaUploadItem;
import com.twilio.util.ErrorInfo;
import com.twilio.util.InternalUtils3;
import com.twilio.util.TwilioException;
import com.twilio.util.TwilioException2;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import io.ktor.utils.p478io.core.Input;
import io.ktor.utils.p478io.streams.Input4;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* compiled from: Messages.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\u0003:;<B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082@¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002J\t\u0010\"\u001a\u00020#H\u0086 J\t\u0010$\u001a\u00020%H\u0086 J\u001f\u0010&\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086 J\u0019\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020)H\u0086 J-\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020-2\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0.0\u001bH\u0086 J-\u0010/\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020-2\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0.0\u001bH\u0086 J%\u00100\u001a\u00020\u00192\u0006\u0010,\u001a\u00020-2\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0.0\u001bH\u0086 J\u001f\u00101\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086 J\u0010\u00102\u001a\u0004\u0018\u00010\u0003H\u0086 ¢\u0006\u0002\u00103J\u001f\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0086 J\u001f\u00106\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0086 J\u0017\u00107\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0086 J\u0017\u00108\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0086 J\t\u00109\u001a\u00020\u0019H\u0086 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, m3636d2 = {"Lcom/twilio/conversations/Messages;", "Lcom/twilio/conversations/Disposable;", "nativeHandle", "", "<init>", "(J)V", "mediaClient", "Lcom/twilio/conversations/media/MediaClient;", "getMediaClient", "()Lcom/twilio/conversations/media/MediaClient;", "mediaClient$delegate", "Lkotlin/Lazy;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "kotlin.jvm.PlatformType", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope$delegate", "isDisposed", "", "checkMessageExceedsLimits", "Lcom/twilio/util/ErrorInfo;", "messageDescriptor", "Lcom/twilio/conversations/Messages$MessageDescriptor;", "sendMessage", "", "listener", "Lcom/twilio/conversations/CallbackListener;", "Lcom/twilio/conversations/Message;", "(Lcom/twilio/conversations/Messages$MessageDescriptor;Lcom/twilio/conversations/CallbackListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "checkDisposed", "method", "", "nativeGetConversationsClient", "Lcom/twilio/conversations/ConversationsClientImpl;", "nativeGetConversation", "Lcom/twilio/conversations/ConversationImpl;", "nativeSendMessage", "nativeRemoveMessage", "message", "Lcom/twilio/conversations/StatusListener;", "nativeGetMessagesBefore", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "count", "", "", "nativeGetMessagesAfter", "nativeGetLastMessages", "nativeGetMessageByIndex", "nativeGetLastConsumedMessageIndex", "()Ljava/lang/Long;", "nativeSetLastConsumedMessageIndexWithResult", "lastConsumedMessageIndex", "nativeAdvanceLastConsumedMessageIndexWithResult", "nativeSetAllMessagesConsumedWithResult", "nativeSetNoMessagesConsumedWithResult", "nativeDispose", "MessageDescriptor", "MessageBuilderImpl", "UnsentMessageImpl", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class Messages implements Disposable {
    private boolean isDisposed;
    private long nativeHandle;

    /* renamed from: mediaClient$delegate, reason: from kotlin metadata */
    private final Lazy mediaClient = LazyKt.lazy(new Function0() { // from class: com.twilio.conversations.Messages$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Messages.mediaClient_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: coroutineScope$delegate, reason: from kotlin metadata */
    private final Lazy coroutineScope = LazyKt.lazy(new Function0() { // from class: com.twilio.conversations.Messages$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Messages.coroutineScope_delegate$lambda$1(this.f$0);
        }
    });

    /* compiled from: Messages.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TwilioException2.values().length];
            try {
                iArr[TwilioException2.Cancelled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Messages.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.Messages", m3645f = "Messages.kt", m3646l = {96, 99}, m3647m = "sendMessage")
    /* renamed from: com.twilio.conversations.Messages$sendMessage$1 */
    static final class C433351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C433351(Continuation<? super C433351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Messages.this.sendMessage(null, null, this);
        }
    }

    public final native void nativeAdvanceLastConsumedMessageIndexWithResult(long lastConsumedMessageIndex, CallbackListener<Long> listener);

    public final native void nativeDispose();

    public final native ConversationImpl nativeGetConversation();

    public final native ConversationsClientImpl nativeGetConversationsClient();

    public final native Long nativeGetLastConsumedMessageIndex();

    public final native void nativeGetLastMessages(int count, CallbackListener<List<Message>> listener);

    public final native void nativeGetMessageByIndex(long index, CallbackListener<Message> listener);

    public final native void nativeGetMessagesAfter(long index, int count, CallbackListener<List<Message>> listener);

    public final native void nativeGetMessagesBefore(long index, int count, CallbackListener<List<Message>> listener);

    public final native void nativeRemoveMessage(Message message, StatusListener listener);

    public final native void nativeSendMessage(MessageDescriptor messageDescriptor, CallbackListener<Message> listener);

    public final native void nativeSetAllMessagesConsumedWithResult(CallbackListener<Long> listener);

    public final native void nativeSetLastConsumedMessageIndexWithResult(long lastConsumedMessageIndex, CallbackListener<Long> listener);

    public final native void nativeSetNoMessagesConsumedWithResult(CallbackListener<Long> listener);

    public Messages(long j) {
        this.nativeHandle = j;
    }

    private final MediaClient getMediaClient() {
        Object value = this.mediaClient.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MediaClient) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaClient mediaClient_delegate$lambda$0(Messages this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.nativeGetConversationsClient().getMediaClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope coroutineScope_delegate$lambda$1(Messages this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.nativeGetConversationsClient().getCoroutineScope();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope getCoroutineScope() {
        return (CoroutineScope) this.coroutineScope.getValue();
    }

    private final ErrorInfo checkMessageExceedsLimits(MessageDescriptor messageDescriptor) {
        ConversationLimits limits = nativeGetConversation().getLimits();
        if (limits == null) {
            return null;
        }
        Set setSubtract = CollectionsKt.subtract(messageDescriptor.getEmailBodies().keySet(), limits.getEmailBodiesAllowedContentTypes());
        if (!setSubtract.isEmpty()) {
            TwilioLogger.e$default(TwilioLogger3.getLogger(this), setSubtract + " are not allowed email body types. See ConversationLimits.emailBodiesAllowedContentTypes.", (Throwable) null, 2, (Object) null);
            return new ErrorInfo(TwilioException2.UnsupportedEmailBodyContentType, 0, ErrorInfo.INSTANCE.getUNSUPPORTED_EMAIL_BODY_CONTENT_TYPE(), "Unsupported email body content type(s) " + setSubtract, (String) null, 18, (DefaultConstructorMarker) null);
        }
        Set setSubtract2 = CollectionsKt.subtract(messageDescriptor.getEmailHistories().keySet(), limits.getEmailHistoriesAllowedContentTypes());
        if (!setSubtract2.isEmpty()) {
            TwilioLogger.e$default(TwilioLogger3.getLogger(this), setSubtract2 + " are not allowed email history types. See ConversationLimits.emailHistoriesAllowedContentTypes.", (Throwable) null, 2, (Object) null);
            return new ErrorInfo(TwilioException2.UnsupportedEmailHistoryContentType, 0, ErrorInfo.INSTANCE.getUNSUPPORTED_EMAIL_HISTORY_CONTENT_TYPE(), "Unsupported email history content type(s) " + setSubtract2, (String) null, 18, (DefaultConstructorMarker) null);
        }
        int size = messageDescriptor.getAllMedias().size();
        if (size <= limits.getMediaAttachmentsCountLimit()) {
            return null;
        }
        TwilioLogger.e$default(TwilioLogger3.getLogger(this), "Attachments count (" + size + ") exceeds maximum attachments count limit (" + limits.getMediaAttachmentsCountLimit() + "). See ConversationLimits.mediaAttachmentsCountLimit.", (Throwable) null, 2, (Object) null);
        return new ErrorInfo(TwilioException2.TooManyAttachments, 0, ErrorInfo.INSTANCE.getTOO_MANY_ATTACHMENTS(), "Too many media attachments in the message (" + size + " > " + limits.getMediaAttachmentsCountLimit() + ')', (String) null, 18, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendMessage(MessageDescriptor messageDescriptor, CallbackListener<Message> callbackListener, Continuation<? super Unit> continuation) {
        C433351 c433351;
        MessageDescriptor messageDescriptor2;
        Messages messages;
        MessageDescriptor messageDescriptor3;
        Messages messages2;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        Messages messages3;
        TwilioException twilioException;
        ErrorInfo errorInfo;
        CallbackListener<Message> callbackListener2 = callbackListener;
        if (continuation instanceof C433351) {
            c433351 = (C433351) continuation;
            int i = c433351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c433351.label = i - Integer.MIN_VALUE;
            } else {
                c433351 = new C433351(continuation);
            }
        }
        Object objUpload = c433351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c433351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpload);
            ErrorInfo errorInfoCheckMessageExceedsLimits = checkMessageExceedsLimits(messageDescriptor);
            if (errorInfoCheckMessageExceedsLimits != null) {
                callbackListener2.onError(errorInfoCheckMessageExceedsLimits);
                return Unit.INSTANCE;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                MediaClient mediaClient = getMediaClient();
                List<MediaUploadItem> allMedias = messageDescriptor.getAllMedias();
                c433351.L$0 = this;
                messageDescriptor2 = messageDescriptor;
                try {
                    c433351.L$1 = messageDescriptor2;
                    c433351.L$2 = callbackListener2;
                    c433351.label = 1;
                    objUpload = mediaClient.upload(allMedias, c433351);
                    if (objUpload != coroutine_suspended) {
                        messageDescriptor3 = messageDescriptor2;
                        messages2 = this;
                    }
                } catch (Throwable th) {
                    th = th;
                    messages = this;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl != null) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                messageDescriptor2 = messageDescriptor;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            callbackListener2 = (CallbackListener) c433351.L$1;
            messages3 = (Messages) c433351.L$0;
            ResultKt.throwOnFailure(objUpload);
            twilioException = (TwilioException) objUpload;
            if (WhenMappings.$EnumSwitchMapping$0[twilioException.getErrorInfo().getReason().ordinal()] != 1) {
                errorInfo = new ErrorInfo(TwilioException2.Cancelled, 0, 0, "Message sending has been cancelled", (String) null, 22, (DefaultConstructorMarker) null);
            } else {
                errorInfo = new ErrorInfo(TwilioException2.MediaUploadError, 0, ErrorInfo.INSTANCE.getMEDIA_UPLOAD_ERROR(), "Cannot upload one or more media files", (String) null, 18, (DefaultConstructorMarker) null);
            }
            TwilioLogger3.getLogger(messages3).m3192e(String.valueOf(errorInfo), twilioException);
            callbackListener2.onError(errorInfo);
            return Unit.INSTANCE;
        }
        callbackListener2 = (CallbackListener) c433351.L$2;
        messageDescriptor3 = (MessageDescriptor) c433351.L$1;
        messages2 = (Messages) c433351.L$0;
        try {
            ResultKt.throwOnFailure(objUpload);
        } catch (Throwable th3) {
            th = th3;
            Messages messages4 = messages2;
            messageDescriptor2 = messageDescriptor3;
            messages = messages4;
            Result.Companion companion22 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
            }
        }
        objM28550constructorimpl = Result.m28550constructorimpl((List) objUpload);
        Messages messages5 = messages2;
        messageDescriptor2 = messageDescriptor3;
        messages = messages5;
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            TwilioException2 twilioException2 = TwilioException2.MediaUploadError;
            c433351.L$0 = messages;
            c433351.L$1 = callbackListener2;
            c433351.L$2 = null;
            c433351.label = 2;
            objUpload = InternalUtils3.toTwilioException(thM28553exceptionOrNullimpl, twilioException2, c433351);
            if (objUpload != coroutine_suspended) {
                messages3 = messages;
                twilioException = (TwilioException) objUpload;
                if (WhenMappings.$EnumSwitchMapping$0[twilioException.getErrorInfo().getReason().ordinal()] != 1) {
                }
                TwilioLogger3.getLogger(messages3).m3192e(String.valueOf(errorInfo), twilioException);
                callbackListener2.onError(errorInfo);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        messages.checkDisposed("sendMessage");
        messages.nativeSendMessage(MessageDescriptor.copy$default(messageDescriptor2, null, null, null, null, null, null, (String[]) ((List) objM28550constructorimpl).toArray(new String[0]), null, null, 447, null), callbackListener2);
        return Unit.INSTANCE;
    }

    @Override // com.twilio.conversations.Disposable
    public void dispose() {
        synchronized (this) {
            try {
                checkDisposed("dispose");
                if (!this.isDisposed) {
                    nativeDispose();
                }
                this.nativeHandle = 0L;
                this.isDisposed = true;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void checkDisposed(String method) {
        if (this.isDisposed) {
            TwilioLogger.e$default(TwilioLogger3.getLogger(this), "Attempt to use disposed object in Messages#" + method, (Throwable) null, 2, (Object) null);
        }
    }

    /* compiled from: Messages.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\fHÆ\u0003J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fHÆ\u0003J\u009a\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0013\u0010%\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\f8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001d¨\u0006:"}, m3636d2 = {"Lcom/twilio/conversations/Messages$MessageDescriptor;", "", CarResultComposable2.BODY, "", "subject", "attributes", "Lcom/twilio/conversations/Attributes;", "emailBodies", "", "Lcom/twilio/conversations/media/MediaUploadItem;", "emailHistories", "attachedMedias", "", "mediaSids", "", "contentSid", "contentVariables", "Lcom/twilio/conversations/content/ContentTemplateVariable;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/twilio/conversations/Attributes;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;[Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBody", "()Ljava/lang/String;", "getSubject", "getAttributes", "()Lcom/twilio/conversations/Attributes;", "getEmailBodies", "()Ljava/util/Map;", "getEmailHistories", "getAttachedMedias", "()Ljava/util/List;", "getMediaSids", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getContentSid", "getContentVariables", "attributesAsString", "getAttributesAsString", "contentVariablesAsString", "getContentVariablesAsString", "allMedias", "getAllMedias", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/twilio/conversations/Attributes;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;[Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/twilio/conversations/Messages$MessageDescriptor;", "equals", "", "other", "hashCode", "", "toString", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class MessageDescriptor {
        private final List<MediaUploadItem> attachedMedias;
        private final Attributes attributes;
        private final String body;
        private final String contentSid;
        private final List<ContentTemplateVariable> contentVariables;
        private final Map<String, MediaUploadItem> emailBodies;
        private final Map<String, MediaUploadItem> emailHistories;
        private final String[] mediaSids;
        private final String subject;

        public MessageDescriptor() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public static /* synthetic */ MessageDescriptor copy$default(MessageDescriptor messageDescriptor, String str, String str2, Attributes attributes, Map map, Map map2, List list, String[] strArr, String str3, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageDescriptor.body;
            }
            if ((i & 2) != 0) {
                str2 = messageDescriptor.subject;
            }
            if ((i & 4) != 0) {
                attributes = messageDescriptor.attributes;
            }
            if ((i & 8) != 0) {
                map = messageDescriptor.emailBodies;
            }
            if ((i & 16) != 0) {
                map2 = messageDescriptor.emailHistories;
            }
            if ((i & 32) != 0) {
                list = messageDescriptor.attachedMedias;
            }
            if ((i & 64) != 0) {
                strArr = messageDescriptor.mediaSids;
            }
            if ((i & 128) != 0) {
                str3 = messageDescriptor.contentSid;
            }
            if ((i & 256) != 0) {
                list2 = messageDescriptor.contentVariables;
            }
            String str4 = str3;
            List list3 = list2;
            List list4 = list;
            String[] strArr2 = strArr;
            Map map3 = map2;
            Attributes attributes2 = attributes;
            return messageDescriptor.copy(str, str2, attributes2, map, map3, list4, strArr2, str4, list3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubject() {
            return this.subject;
        }

        /* renamed from: component3, reason: from getter */
        public final Attributes getAttributes() {
            return this.attributes;
        }

        public final Map<String, MediaUploadItem> component4() {
            return this.emailBodies;
        }

        public final Map<String, MediaUploadItem> component5() {
            return this.emailHistories;
        }

        public final List<MediaUploadItem> component6() {
            return this.attachedMedias;
        }

        /* renamed from: component7, reason: from getter */
        public final String[] getMediaSids() {
            return this.mediaSids;
        }

        /* renamed from: component8, reason: from getter */
        public final String getContentSid() {
            return this.contentSid;
        }

        public final List<ContentTemplateVariable> component9() {
            return this.contentVariables;
        }

        public final MessageDescriptor copy(String body, String subject, Attributes attributes, Map<String, MediaUploadItem> emailBodies, Map<String, MediaUploadItem> emailHistories, List<MediaUploadItem> attachedMedias, String[] mediaSids, String contentSid, List<ContentTemplateVariable> contentVariables) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(emailBodies, "emailBodies");
            Intrinsics.checkNotNullParameter(emailHistories, "emailHistories");
            Intrinsics.checkNotNullParameter(attachedMedias, "attachedMedias");
            Intrinsics.checkNotNullParameter(mediaSids, "mediaSids");
            return new MessageDescriptor(body, subject, attributes, emailBodies, emailHistories, attachedMedias, mediaSids, contentSid, contentVariables);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageDescriptor)) {
                return false;
            }
            MessageDescriptor messageDescriptor = (MessageDescriptor) other;
            return Intrinsics.areEqual(this.body, messageDescriptor.body) && Intrinsics.areEqual(this.subject, messageDescriptor.subject) && Intrinsics.areEqual(this.attributes, messageDescriptor.attributes) && Intrinsics.areEqual(this.emailBodies, messageDescriptor.emailBodies) && Intrinsics.areEqual(this.emailHistories, messageDescriptor.emailHistories) && Intrinsics.areEqual(this.attachedMedias, messageDescriptor.attachedMedias) && Intrinsics.areEqual(this.mediaSids, messageDescriptor.mediaSids) && Intrinsics.areEqual(this.contentSid, messageDescriptor.contentSid) && Intrinsics.areEqual(this.contentVariables, messageDescriptor.contentVariables);
        }

        public int hashCode() {
            String str = this.body;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subject;
            int iHashCode2 = (((((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.attributes.hashCode()) * 31) + this.emailBodies.hashCode()) * 31) + this.emailHistories.hashCode()) * 31) + this.attachedMedias.hashCode()) * 31) + Arrays.hashCode(this.mediaSids)) * 31;
            String str3 = this.contentSid;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<ContentTemplateVariable> list = this.contentVariables;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "MessageDescriptor(body=" + this.body + ", subject=" + this.subject + ", attributes=" + this.attributes + ", emailBodies=" + this.emailBodies + ", emailHistories=" + this.emailHistories + ", attachedMedias=" + this.attachedMedias + ", mediaSids=" + Arrays.toString(this.mediaSids) + ", contentSid=" + this.contentSid + ", contentVariables=" + this.contentVariables + ')';
        }

        public MessageDescriptor(String str, String str2, Attributes attributes, Map<String, MediaUploadItem> emailBodies, Map<String, MediaUploadItem> emailHistories, List<MediaUploadItem> attachedMedias, String[] mediaSids, String str3, List<ContentTemplateVariable> list) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(emailBodies, "emailBodies");
            Intrinsics.checkNotNullParameter(emailHistories, "emailHistories");
            Intrinsics.checkNotNullParameter(attachedMedias, "attachedMedias");
            Intrinsics.checkNotNullParameter(mediaSids, "mediaSids");
            this.body = str;
            this.subject = str2;
            this.attributes = attributes;
            this.emailBodies = emailBodies;
            this.emailHistories = emailHistories;
            this.attachedMedias = attachedMedias;
            this.mediaSids = mediaSids;
            this.contentSid = str3;
            this.contentVariables = list;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getSubject() {
            return this.subject;
        }

        public /* synthetic */ MessageDescriptor(String str, String str2, Attributes attributes, Map map, Map map2, List list, String[] strArr, String str3, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Attributes.DEFAULT : attributes, (i & 8) != 0 ? new LinkedHashMap() : map, (i & 16) != 0 ? new LinkedHashMap() : map2, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? new String[0] : strArr, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : list2);
        }

        public final Attributes getAttributes() {
            return this.attributes;
        }

        public final Map<String, MediaUploadItem> getEmailBodies() {
            return this.emailBodies;
        }

        public final Map<String, MediaUploadItem> getEmailHistories() {
            return this.emailHistories;
        }

        public final List<MediaUploadItem> getAttachedMedias() {
            return this.attachedMedias;
        }

        public final String[] getMediaSids() {
            return this.mediaSids;
        }

        public final String getContentSid() {
            return this.contentSid;
        }

        public final List<ContentTemplateVariable> getContentVariables() {
            return this.contentVariables;
        }

        public final String getAttributesAsString() {
            return String.valueOf(this.attributes);
        }

        public final String getContentVariablesAsString() {
            List<ContentTemplateVariable> list = this.contentVariables;
            if (list == null) {
                return null;
            }
            List<ContentTemplateVariable> list2 = list;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
            for (ContentTemplateVariable contentTemplateVariable : list2) {
                Tuples2 tuples2M3642to = Tuples4.m3642to(contentTemplateVariable.getName(), contentTemplateVariable.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            Json json = InternalUtils3.getJson();
            json.getSerializersModule();
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return json.encodeToString(new LinkedHashMapSerializer(stringSerializer, stringSerializer), linkedHashMap);
        }

        public final List<MediaUploadItem> getAllMedias() {
            return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) this.attachedMedias, (Iterable) this.emailBodies.values()), (Iterable) this.emailHistories.values());
        }
    }

    /* compiled from: Messages.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00060\u0000R\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0016\u0010\n\u001a\u00060\u0000R\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u0010\f\u001a\u00060\u0000R\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00060\u0000R\u00020\u00072\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016J&\u0010\u000f\u001a\u00060\u0000R\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00060\u0000R\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016J&\u0010\u0016\u001a\u00060\u0000R\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J0\u0010\u0018\u001a\u00060\u0000R\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0016\u0010\u001a\u001a\u00060\u0000R\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u001a\u001a\u00060\u0000R\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0016J\f\u0010\u001f\u001a\u00060 R\u00020\u0007H\u0016J\u0018\u0010!\u001a\u00020\"2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/twilio/conversations/Messages$MessageBuilderImpl;", "Lcom/twilio/conversations/Conversation$MessageBuilder;", "<init>", "(Lcom/twilio/conversations/Messages;)V", "messageDescriptor", "Lcom/twilio/conversations/Messages$MessageDescriptor;", "setBody", "Lcom/twilio/conversations/Messages;", CarResultComposable2.BODY, "", "setSubject", "subject", "setAttributes", "attributes", "Lcom/twilio/conversations/Attributes;", "setEmailBody", "emailBody", "contentType", "inputStream", "Ljava/io/InputStream;", "uploadListener", "Lcom/twilio/conversations/MediaUploadListener;", "setEmailHistory", "emailHistory", "addMedia", "filename", "setContentTemplate", "contentTemplateSid", "variables", "", "Lcom/twilio/conversations/content/ContentTemplateVariable;", "build", "Lcom/twilio/conversations/Messages$UnsentMessageImpl;", "buildAndSend", "Lcom/twilio/conversations/CancellationToken;", "listener", "Lcom/twilio/conversations/CallbackListener;", "Lcom/twilio/conversations/Message;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public final class MessageBuilderImpl implements Conversation.MessageBuilder {
        private MessageDescriptor messageDescriptor = new MessageDescriptor(null, null, null, null, null, null, null, null, null, 511, null);

        public MessageBuilderImpl() {
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public /* bridge */ /* synthetic */ Conversation.MessageBuilder setContentTemplate(String str, List list) {
            return setContentTemplate(str, (List<ContentTemplateVariable>) list);
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public MessageBuilderImpl setBody(String body) {
            this.messageDescriptor = MessageDescriptor.copy$default(this.messageDescriptor, body, null, null, null, null, null, null, null, null, 510, null);
            return this;
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public MessageBuilderImpl setSubject(String subject) {
            this.messageDescriptor = MessageDescriptor.copy$default(this.messageDescriptor, null, subject, null, null, null, null, null, null, null, 509, null);
            return this;
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public MessageBuilderImpl setAttributes(Attributes attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.messageDescriptor = MessageDescriptor.copy$default(this.messageDescriptor, null, null, attributes, null, null, null, null, null, null, 507, null);
            return this;
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public MessageBuilderImpl setEmailBody(String emailBody, String contentType) {
            Intrinsics.checkNotNullParameter(emailBody, "emailBody");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Map<String, MediaUploadItem> emailBodies = this.messageDescriptor.getEmailBodies();
            byte[] bytes = emailBody.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            MediaCategory mediaCategory = MediaCategory.BODY;
            Input inputAsInput$default = Input4.asInput$default(byteArrayInputStream, null, 1, null);
            MediaUploadListener2 mediaUploadListener2 = new MediaUploadListener2();
            Unit unit = Unit.INSTANCE;
            emailBodies.put(contentType, new MediaUploadItem(inputAsInput$default, contentType, mediaCategory, "", mediaUploadListener2.build()));
            return this;
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public MessageBuilderImpl setEmailBody(InputStream inputStream, String contentType, MediaUploadListener uploadListener) {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            this.messageDescriptor.getEmailBodies().put(contentType, new MediaUploadItem(Input4.asInput$default(inputStream, null, 1, null), contentType, MediaCategory.BODY, null, new MediaUploadListenerForwarder(uploadListener), 8, null));
            return this;
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public MessageBuilderImpl setEmailHistory(String emailHistory, String contentType) {
            Intrinsics.checkNotNullParameter(emailHistory, "emailHistory");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Map<String, MediaUploadItem> emailHistories = this.messageDescriptor.getEmailHistories();
            byte[] bytes = emailHistory.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            MediaCategory mediaCategory = MediaCategory.HISTORY;
            Input inputAsInput$default = Input4.asInput$default(byteArrayInputStream, null, 1, null);
            MediaUploadListener2 mediaUploadListener2 = new MediaUploadListener2();
            Unit unit = Unit.INSTANCE;
            emailHistories.put(contentType, new MediaUploadItem(inputAsInput$default, contentType, mediaCategory, "", mediaUploadListener2.build()));
            return this;
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public MessageBuilderImpl setEmailHistory(InputStream inputStream, String contentType, MediaUploadListener uploadListener) {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            this.messageDescriptor.getEmailHistories().put(contentType, new MediaUploadItem(Input4.asInput$default(inputStream, null, 1, null), contentType, MediaCategory.HISTORY, null, new MediaUploadListenerForwarder(uploadListener), 8, null));
            return this;
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public MessageBuilderImpl addMedia(InputStream inputStream, String contentType, String filename, MediaUploadListener uploadListener) {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            this.messageDescriptor = MessageDescriptor.copy$default(this.messageDescriptor, null, null, null, null, null, CollectionsKt.plus((Collection<? extends MediaUploadItem>) this.messageDescriptor.getAttachedMedias(), new MediaUploadItem(Input4.asInput$default(inputStream, null, 1, null), contentType, MediaCategory.MEDIA, filename, new MediaUploadListenerForwarder(uploadListener))), null, null, null, 479, null);
            return this;
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public MessageBuilderImpl setContentTemplate(String contentTemplateSid) {
            return setContentTemplate(contentTemplateSid, (List<ContentTemplateVariable>) null);
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public MessageBuilderImpl setContentTemplate(String contentTemplateSid, List<ContentTemplateVariable> variables) {
            this.messageDescriptor = MessageDescriptor.copy$default(this.messageDescriptor, null, null, null, null, null, null, null, contentTemplateSid, variables, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            return this;
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public UnsentMessageImpl build() {
            return new UnsentMessageImpl(Messages.this, this.messageDescriptor);
        }

        @Override // com.twilio.conversations.Conversation.MessageBuilder
        public CancellationToken buildAndSend(CallbackListener<Message> listener) {
            return build().send(listener);
        }
    }

    /* compiled from: Messages.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m3636d2 = {"Lcom/twilio/conversations/Messages$UnsentMessageImpl;", "Lcom/twilio/conversations/Conversation$UnsentMessage;", "messageDescriptor", "Lcom/twilio/conversations/Messages$MessageDescriptor;", "<init>", "(Lcom/twilio/conversations/Messages;Lcom/twilio/conversations/Messages$MessageDescriptor;)V", "getMessageDescriptor", "()Lcom/twilio/conversations/Messages$MessageDescriptor;", "send", "Lcom/twilio/conversations/CancellationToken;", "listener", "Lcom/twilio/conversations/CallbackListener;", "Lcom/twilio/conversations/Message;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public final class UnsentMessageImpl implements Conversation.UnsentMessage {
        private final MessageDescriptor messageDescriptor;
        final /* synthetic */ Messages this$0;

        public UnsentMessageImpl(Messages messages, MessageDescriptor messageDescriptor) {
            Intrinsics.checkNotNullParameter(messageDescriptor, "messageDescriptor");
            this.this$0 = messages;
            this.messageDescriptor = messageDescriptor;
        }

        public final MessageDescriptor getMessageDescriptor() {
            return this.messageDescriptor;
        }

        @Override // com.twilio.conversations.Conversation.UnsentMessage
        public CancellationToken send(CallbackListener<Message> listener) {
            CallbackListenerForwarder callbackListenerForwarder = new CallbackListenerForwarder(listener);
            CoroutineScope coroutineScope = this.this$0.getCoroutineScope();
            Intrinsics.checkNotNullExpressionValue(coroutineScope, "access$getCoroutineScope(...)");
            final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new Messages3(this.this$0, this, callbackListenerForwarder, null), 3, null);
            return new CancellationToken() { // from class: com.twilio.conversations.Messages$UnsentMessageImpl$$ExternalSyntheticLambda0
                @Override // com.twilio.conversations.CancellationToken
                public final void cancel() {
                    Messages.UnsentMessageImpl.send$lambda$0(jobLaunch$default);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void send$lambda$0(Job job) {
            Intrinsics.checkNotNullParameter(job, "$job");
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }
}
