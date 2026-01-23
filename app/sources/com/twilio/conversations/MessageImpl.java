package com.twilio.conversations;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.twilio.conversations.content.ContentData;
import com.twilio.conversations.content.ContentExtensions;
import com.twilio.conversations.extensions.MediaClientExtensions;
import com.twilio.conversations.internal.CallbackListenerForwarder;
import com.twilio.conversations.internal.DateUtils;
import com.twilio.conversations.internal.StatusListenerForwarder;
import com.twilio.conversations.media.MediaClient;
import com.twilio.util.ErrorInfo;
import com.twilio.util.InternalUtils3;
import com.twilio.util.TwilioException;
import com.twilio.util.TwilioException2;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement6;
import org.json.JSONException;

/* compiled from: MessageImpl.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001cB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0015\u001a\u00020\u0016H\u0096 J\t\u0010\u0017\u001a\u00020\u0016H\u0096 J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0016J\t\u0010\u0019\u001a\u00020\u0016H\u0096 J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0016H\u0096 J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0016H\u0096 J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u0016H\u0016J\u0016\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016J\u000e\u0010&\u001a\u00020%H\u0082@¢\u0006\u0002\u0010'J\u001c\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u00162\b\u0010#\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u0016H\u0016J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0016H\u0016J\b\u00100\u001a\u000201H\u0016J\t\u00102\u001a\u00020\u0004H\u0096 J\b\u00103\u001a\u000204H\u0016J\u001a\u00105\u001a\u00020)2\u0006\u00106\u001a\u0002042\b\u0010#\u001a\u0004\u0018\u00010+H\u0016J\b\u00107\u001a\u000208H\u0016J\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=H\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020;0:H\u0016J\n\u0010@\u001a\u0004\u0018\u00010;H\u0016J\u0012\u0010@\u001a\u0004\u0018\u00010;2\u0006\u0010A\u001a\u00020\u0016H\u0016J\n\u0010B\u001a\u0004\u0018\u00010;H\u0016J\u0012\u0010B\u001a\u0004\u0018\u00010;2\u0006\u0010A\u001a\u00020\u0016H\u0016J\"\u0010C\u001a\u00020\"2\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160D0$H\u0016J0\u0010E\u001a\u00020\"2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020;0:2\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160D0$H\u0016J0\u0010G\u001a\u00020\"2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00160:2\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160D0$H\u0016J\u001e\u0010I\u001a\u00020)2\u0014\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0:\u0018\u00010$H\u0016J\b\u0010K\u001a\u00020)H\u0016J\u001e\u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160$H\u0002J\u0010\u0010N\u001a\u00020)2\u0006\u0010O\u001a\u00020\u0016H\u0002J\t\u0010P\u001a\u00020QH\u0082 J\t\u0010R\u001a\u00020\u0016H\u0082 J\t\u0010S\u001a\u00020.H\u0082 J\t\u0010T\u001a\u00020\u0016H\u0082 J\t\u0010U\u001a\u000201H\u0082 J\u000b\u0010V\u001a\u0004\u0018\u00010\u0016H\u0082 J\u000b\u0010W\u001a\u0004\u0018\u00010\u0016H\u0082 J\t\u0010X\u001a\u00020\u0016H\u0082 J\u001b\u0010Y\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020+H\u0082 J\u0019\u0010Z\u001a\u00020)2\u0006\u0010[\u001a\u00020\u00162\u0006\u0010#\u001a\u00020+H\u0082 J\t\u0010\\\u001a\u00020\u0016H\u0082 J\t\u0010]\u001a\u000208H\u0082 J\u001d\u0010^\u001a\u00020)2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0:0$H\u0082 J\"\u0010_\u001a\b\u0012\u0004\u0012\u00020;0:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00160`H\u0082 ¢\u0006\u0002\u0010aJ\t\u0010b\u001a\u00020)H\u0082 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006d"}, m3636d2 = {"Lcom/twilio/conversations/MessageImpl;", "Lcom/twilio/conversations/Message;", "Lcom/twilio/conversations/Disposable;", "nativeHandle", "", "<init>", "(J)V", "isDisposed", "", "mediaClient", "Lcom/twilio/conversations/media/MediaClient;", "getMediaClient", "()Lcom/twilio/conversations/media/MediaClient;", "mediaClient$delegate", "Lkotlin/Lazy;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "kotlin.jvm.PlatformType", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope$delegate", "getSid", "", "getAuthor", "getSubject", "getDateCreated", "getDateCreatedAsDate", "Ljava/util/Date;", "getDateUpdated", "getDateUpdatedAsDate", "getLastUpdatedBy", "getBody", "getContentSid", "getContentData", "Lcom/twilio/conversations/CancellationToken;", "listener", "Lcom/twilio/conversations/CallbackListener;", "Lcom/twilio/conversations/content/ContentData;", "downloadContentData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBody", "", CarResultComposable2.BODY, "Lcom/twilio/conversations/StatusListener;", "getConversationSid", "getConversation", "Lcom/twilio/conversations/Conversation;", "getParticipantSid", "getParticipant", "Lcom/twilio/conversations/Participant;", "getMessageIndex", "getAttributes", "Lcom/twilio/conversations/Attributes;", "setAttributes", "attributes", "getAggregatedDeliveryReceipt", "Lcom/twilio/conversations/AggregatedDeliveryReceipt;", "getMediaByCategories", "", "Lcom/twilio/conversations/Media;", "categories", "", "Lcom/twilio/conversations/MediaCategory;", "getAttachedMedia", "getEmailBody", "contentType", "getEmailHistory", "getTemporaryContentUrlsForAttachedMedia", "", "getTemporaryContentUrlsForMedia", "media", "getTemporaryContentUrlsForMediaSids", "mediaSids", "getDetailedDeliveryReceiptList", "Lcom/twilio/conversations/DetailedDeliveryReceipt;", "dispose", "getTemporaryContentUrl", "mediaSid", "checkDisposed", "method", "nativeGetConversationsClient", "Lcom/twilio/conversations/ConversationsClientImpl;", "nativeGetChannelSid", "nativeGetChannel", "nativeGetMemberSid", "nativeGetMember", "nativeGetSubject", "nativeGetContentSid", "nativeGetMessageBody", "nativeUpdateMessageBody", "nativeUpdateAttributes", "attrString", "nativeGetAttributes", "nativeGetAggregatedDelivery", "nativeGetDetailedDeliveryReceiptList", "nativeGetMediaByCategories", "", "([Ljava/lang/String;)Ljava/util/List;", "nativeDispose", "MediaImpl", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class MessageImpl implements Message, Disposable {
    private boolean isDisposed;
    private long nativeHandle;

    /* renamed from: mediaClient$delegate, reason: from kotlin metadata */
    private final Lazy mediaClient = LazyKt.lazy(new Function0() { // from class: com.twilio.conversations.MessageImpl$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MessageImpl.mediaClient_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: coroutineScope$delegate, reason: from kotlin metadata */
    private final Lazy coroutineScope = LazyKt.lazy(new Function0() { // from class: com.twilio.conversations.MessageImpl$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MessageImpl.coroutineScope_delegate$lambda$1(this.f$0);
        }
    });

    /* compiled from: MessageImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.MessageImpl", m3645f = "MessageImpl.kt", m3646l = {114}, m3647m = "downloadContentData")
    /* renamed from: com.twilio.conversations.MessageImpl$downloadContentData$1 */
    static final class C433341 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C433341(Continuation<? super C433341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageImpl.this.downloadContentData(this);
        }
    }

    private final native void nativeDispose();

    private final native AggregatedDeliveryReceipt nativeGetAggregatedDelivery();

    private final native String nativeGetAttributes();

    private final native Conversation nativeGetChannel();

    private final native String nativeGetChannelSid();

    private final native String nativeGetContentSid();

    private final native ConversationsClientImpl nativeGetConversationsClient();

    private final native void nativeGetDetailedDeliveryReceiptList(CallbackListener<List<DetailedDeliveryReceipt>> listener);

    private final native List<Media> nativeGetMediaByCategories(String[] categories);

    private final native Participant nativeGetMember();

    private final native String nativeGetMemberSid();

    private final native String nativeGetMessageBody();

    private final native String nativeGetSubject();

    private final native void nativeUpdateAttributes(String attrString, StatusListener listener);

    private final native void nativeUpdateMessageBody(String body, StatusListener listener);

    @Override // com.twilio.conversations.Message
    public native String getAuthor();

    @Override // com.twilio.conversations.Message
    public native String getDateCreated();

    @Override // com.twilio.conversations.Message
    public native String getDateUpdated();

    @Override // com.twilio.conversations.Message
    public native String getLastUpdatedBy();

    @Override // com.twilio.conversations.Message
    public native long getMessageIndex();

    @Override // com.twilio.conversations.Message
    public native String getSid();

    protected MessageImpl(long j) {
        this.nativeHandle = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaClient getMediaClient() {
        Object value = this.mediaClient.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MediaClient) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaClient mediaClient_delegate$lambda$0(MessageImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.nativeGetConversationsClient().getMediaClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope coroutineScope_delegate$lambda$1(MessageImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.nativeGetConversationsClient().getCoroutineScope();
    }

    private final CoroutineScope getCoroutineScope() {
        return (CoroutineScope) this.coroutineScope.getValue();
    }

    /* compiled from: MessageImpl.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m3636d2 = {"Lcom/twilio/conversations/MessageImpl$MediaImpl;", "Lcom/twilio/conversations/Media;", "message", "Lcom/twilio/conversations/MessageImpl;", "sid", "", "contentType", RhGcmListenerService.EXTRA_CATEGORY, "filename", "size", "", "<init>", "(Lcom/twilio/conversations/MessageImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getSid", "()Ljava/lang/String;", "getContentType", "getFilename", "getSize", "()J", "Lcom/twilio/conversations/MediaCategory;", "getCategory", "()Lcom/twilio/conversations/MediaCategory;", "getTemporaryContentUrl", "Lcom/twilio/conversations/CancellationToken;", "listener", "Lcom/twilio/conversations/CallbackListener;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    private static final class MediaImpl implements Media {
        private final MediaCategory category;
        private final String contentType;
        private final String filename;
        private final MessageImpl message;
        private final String sid;
        private final long size;

        public MediaImpl(MessageImpl message, String sid, String contentType, String category, String str, long j) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(sid, "sid");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(category, "category");
            this.message = message;
            this.sid = sid;
            this.contentType = contentType;
            this.filename = str;
            this.size = j;
            this.category = MediaCategory.INSTANCE.fromString(category);
        }

        @Override // com.twilio.conversations.Media
        public String getSid() {
            return this.sid;
        }

        @Override // com.twilio.conversations.Media
        public String getContentType() {
            return this.contentType;
        }

        @Override // com.twilio.conversations.Media
        public String getFilename() {
            return this.filename;
        }

        @Override // com.twilio.conversations.Media
        public long getSize() {
            return this.size;
        }

        @Override // com.twilio.conversations.Media
        public MediaCategory getCategory() {
            return this.category;
        }

        @Override // com.twilio.conversations.Media
        public CancellationToken getTemporaryContentUrl(CallbackListener<String> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            return this.message.getTemporaryContentUrl(getSid(), listener);
        }
    }

    @Override // com.twilio.conversations.Message
    public String getSubject() {
        checkDisposed("getSubject");
        return nativeGetSubject();
    }

    @Override // com.twilio.conversations.Message
    public Date getDateCreatedAsDate() {
        checkDisposed("getDateCreatedAsDate");
        Date iso8601DateTime = DateUtils.parseIso8601DateTime(getDateCreated());
        Intrinsics.checkNotNullExpressionValue(iso8601DateTime, "parseIso8601DateTime(...)");
        return iso8601DateTime;
    }

    @Override // com.twilio.conversations.Message
    public Date getDateUpdatedAsDate() {
        checkDisposed("getDateUpdatedAsDate");
        Date iso8601DateTime = DateUtils.parseIso8601DateTime(getDateUpdated());
        Intrinsics.checkNotNullExpressionValue(iso8601DateTime, "parseIso8601DateTime(...)");
        return iso8601DateTime;
    }

    @Override // com.twilio.conversations.Message
    public String getBody() {
        checkDisposed("getMessageBody");
        return nativeGetMessageBody();
    }

    @Override // com.twilio.conversations.Message
    public String getContentSid() {
        checkDisposed("getContentSid");
        return nativeGetContentSid();
    }

    @Override // com.twilio.conversations.Message
    public CancellationToken getContentData(CallbackListener<ContentData> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CallbackListenerForwarder callbackListenerForwarder = new CallbackListenerForwarder(listener);
        CoroutineScope coroutineScope = getCoroutineScope();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "<get-coroutineScope>(...)");
        final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MessageImpl2(callbackListenerForwarder, this, null), 3, null);
        return new CancellationToken() { // from class: com.twilio.conversations.MessageImpl$$ExternalSyntheticLambda0
            @Override // com.twilio.conversations.CancellationToken
            public final void cancel() {
                MessageImpl.getContentData$lambda$2(jobLaunch$default);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getContentData$lambda$2(Job job) {
        Intrinsics.checkNotNullParameter(job, "$job");
        Job.DefaultImpls.cancel$default(job, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadContentData(Continuation<? super ContentData> continuation) throws TwilioException {
        C433341 c433341;
        Media media;
        String str;
        if (continuation instanceof C433341) {
            c433341 = (C433341) continuation;
            int i = c433341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c433341.label = i - Integer.MIN_VALUE;
            } else {
                c433341 = new C433341(continuation);
            }
        }
        Object objDownloadJsonMediaAsText = c433341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c433341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDownloadJsonMediaAsText);
            if (getContentSid() == null) {
                throw new TwilioException(new ErrorInfo(TwilioException2.NoContentSid, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null), null, 2, null);
            }
            for (Media media2 : getMediaByCategories(SetsKt.setOf(MediaCategory.BODY))) {
                if (StringsKt.startsWith$default(media2.getContentType(), "application/x-vnd.com.twilio.rich.", false, 2, (Object) null)) {
                    MediaClient mediaClient = getMediaClient();
                    String sid = media2.getSid();
                    c433341.L$0 = "application/x-vnd.com.twilio.rich.";
                    c433341.L$1 = media2;
                    c433341.label = 1;
                    objDownloadJsonMediaAsText = mediaClient.downloadJsonMediaAsText(sid, c433341);
                    if (objDownloadJsonMediaAsText == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    media = media2;
                    str = "application/x-vnd.com.twilio.rich.";
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        media = (Media) c433341.L$1;
        str = (String) c433341.L$0;
        ResultKt.throwOnFailure(objDownloadJsonMediaAsText);
        Json json = InternalUtils3.getJson();
        json.getSerializersModule();
        return ContentExtensions.toContentData(JsonElement3.getJsonObject((JsonElement) CollectionsKt.first(((JsonElement6) json.decodeFromString(JsonElement6.INSTANCE.serializer(), (String) objDownloadJsonMediaAsText)).values())), StringsKt.replace$default(StringsKt.removePrefix(media.getContentType(), str), '.', '/', false, 4, (Object) null));
    }

    @Override // com.twilio.conversations.Message
    public void updateBody(String body, StatusListener listener) {
        checkDisposed("updateMessageBody");
        nativeUpdateMessageBody(body, new StatusListenerForwarder(listener));
    }

    @Override // com.twilio.conversations.Message
    public String getConversationSid() {
        checkDisposed("getConversationSid");
        return nativeGetChannelSid();
    }

    @Override // com.twilio.conversations.Message
    public Conversation getConversation() {
        checkDisposed("getConversation");
        return nativeGetChannel();
    }

    @Override // com.twilio.conversations.Message
    public String getParticipantSid() {
        checkDisposed("getParticipantSid");
        return nativeGetMemberSid();
    }

    @Override // com.twilio.conversations.Message
    public Participant getParticipant() {
        checkDisposed("getParticipant");
        return nativeGetMember();
    }

    @Override // com.twilio.conversations.Message
    public Attributes getAttributes() {
        checkDisposed("getAttributes");
        try {
            return Attributes.parse(nativeGetAttributes());
        } catch (JSONException e) {
            TwilioLogger3.getLogger(this).m3192e("Unable to parse message attributes", e);
            return Attributes.DEFAULT;
        }
    }

    @Override // com.twilio.conversations.Message
    public void setAttributes(Attributes attributes, StatusListener listener) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        checkDisposed("setAttributes");
        nativeUpdateAttributes(String.valueOf(attributes), new StatusListenerForwarder(listener));
    }

    @Override // com.twilio.conversations.Message
    public AggregatedDeliveryReceipt getAggregatedDeliveryReceipt() {
        checkDisposed("getAggregatedDeliveryReceipt");
        return nativeGetAggregatedDelivery();
    }

    @Override // com.twilio.conversations.Message
    public List<Media> getMediaByCategories(Set<? extends MediaCategory> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        checkDisposed("getMediaByCategories");
        Set<? extends MediaCategory> set = categories;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaCategory) it.next()).getValue());
        }
        return nativeGetMediaByCategories((String[]) arrayList.toArray(new String[0]));
    }

    @Override // com.twilio.conversations.Message
    public List<Media> getAttachedMedia() {
        return getMediaByCategories(SetsKt.setOf(MediaCategory.MEDIA));
    }

    @Override // com.twilio.conversations.Message
    public Media getEmailBody() {
        return getEmailBody("text/plain");
    }

    @Override // com.twilio.conversations.Message
    public Media getEmailBody(String contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Object obj = null;
        if (!getConversation().getLimits().getEmailBodiesAllowedContentTypes().contains(contentType)) {
            return null;
        }
        Iterator<T> it = getMediaByCategories(SetsKt.setOf(MediaCategory.BODY)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((Media) next).getContentType(), contentType)) {
                obj = next;
                break;
            }
        }
        return (Media) obj;
    }

    @Override // com.twilio.conversations.Message
    public Media getEmailHistory() {
        return getEmailHistory("text/plain");
    }

    @Override // com.twilio.conversations.Message
    public Media getEmailHistory(String contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Object obj = null;
        if (!getConversation().getLimits().getEmailHistoriesAllowedContentTypes().contains(contentType)) {
            return null;
        }
        Iterator<T> it = getMediaByCategories(SetsKt.setOf(MediaCategory.HISTORY)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((Media) next).getContentType(), contentType)) {
                obj = next;
                break;
            }
        }
        return (Media) obj;
    }

    @Override // com.twilio.conversations.Message
    public CancellationToken getTemporaryContentUrlsForAttachedMedia(CallbackListener<Map<String, String>> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return getTemporaryContentUrlsForMedia(getAttachedMedia(), listener);
    }

    @Override // com.twilio.conversations.Message
    public CancellationToken getTemporaryContentUrlsForMedia(List<? extends Media> media, CallbackListener<Map<String, String>> listener) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(listener, "listener");
        MediaClient mediaClient = getMediaClient();
        CoroutineScope coroutineScope = getCoroutineScope();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "<get-coroutineScope>(...)");
        return MediaClientExtensions.getTemporaryContentUrlsForMedia(mediaClient, coroutineScope, media, listener);
    }

    @Override // com.twilio.conversations.Message
    public CancellationToken getTemporaryContentUrlsForMediaSids(List<String> mediaSids, CallbackListener<Map<String, String>> listener) {
        Intrinsics.checkNotNullParameter(mediaSids, "mediaSids");
        Intrinsics.checkNotNullParameter(listener, "listener");
        MediaClient mediaClient = getMediaClient();
        CoroutineScope coroutineScope = getCoroutineScope();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "<get-coroutineScope>(...)");
        return MediaClientExtensions.getTemporaryContentUrlsForMediaSids(mediaClient, coroutineScope, mediaSids, listener);
    }

    @Override // com.twilio.conversations.Message
    public void getDetailedDeliveryReceiptList(CallbackListener<List<DetailedDeliveryReceipt>> listener) {
        checkDisposed("getDetailedDeliveryReceiptList");
        nativeGetDetailedDeliveryReceiptList(new CallbackListenerForwarder(listener));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final CancellationToken getTemporaryContentUrl(String mediaSid, CallbackListener<String> listener) {
        CallbackListenerForwarder callbackListenerForwarder = new CallbackListenerForwarder(listener);
        CoroutineScope coroutineScope = getCoroutineScope();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "<get-coroutineScope>(...)");
        final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MessageImpl3(callbackListenerForwarder, this, mediaSid, null), 3, null);
        return new CancellationToken() { // from class: com.twilio.conversations.MessageImpl$$ExternalSyntheticLambda1
            @Override // com.twilio.conversations.CancellationToken
            public final void cancel() {
                MessageImpl.getTemporaryContentUrl$lambda$8(jobLaunch$default);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getTemporaryContentUrl$lambda$8(Job job) {
        Intrinsics.checkNotNullParameter(job, "$job");
        Job.DefaultImpls.cancel$default(job, null, 1, null);
    }

    private final void checkDisposed(String method) {
        if (this.isDisposed) {
            TwilioLogger.e$default(TwilioLogger3.getLogger(this), "Attempt to use disposed object in Message#" + method, (Throwable) null, 2, (Object) null);
        }
    }
}
