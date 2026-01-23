package com.robinhood.android.lib.conversations;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.lib.conversations.ConversationEvent;
import com.robinhood.android.lib.conversations.ConversationEvent2;
import com.robinhood.android.lib.conversations.ConversationEvent3;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.supportchat.api.ApiSocketChatMessage2;
import com.robinhood.models.supportchat.api.ApiSocketChatMessageAttributes;
import com.robinhood.models.supportchat.api.ApiSocketSenderAttribute;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.robinhood.shared.models.chat.common.api.ParticipantType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import com.twilio.conversations.Attributes;
import com.twilio.conversations.Conversation;
import com.twilio.conversations.ConversationListener;
import com.twilio.conversations.Message;
import com.twilio.conversations.Participant;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import org.json.JSONObject;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: ConversationHelper.kt */
@Metadata(m3635d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0$0\f2\u0006\u0010#\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J*\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010#\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020'0\f¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020'0\f¢\u0006\u0004\b-\u0010,J\u001f\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020/0.0\u0015¢\u0006\u0004\b0\u0010\u0017J\u0013\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0015¢\u0006\u0004\b2\u0010\u0017J\r\u00104\u001a\u000203¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u0002032\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u0002032\u0006\u00107\u001a\u0002062\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u0002032\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b>\u00109J\u0017\u0010A\u001a\u0002032\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u0002032\u0006\u0010@\u001a\u00020?2\u0006\u0010;\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u0002032\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bF\u0010BJ\u001f\u0010G\u001a\u0002032\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u0002032\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bI\u0010HJ\u0017\u0010J\u001a\u0002032\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010OR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020S0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\r0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006^"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ConversationHelper;", "Lcom/twilio/conversations/ConversationListener;", "Lcom/twilio/conversations/Conversation;", "conversation", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "<init>", "(Lcom/twilio/conversations/Conversation;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "", CarResultComposable2.BODY, "Lcom/robinhood/models/supportchat/api/ApiSocketChatMessageAttributes;", "attrs", "Lio/reactivex/Single;", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "sendMessageInternal", "(Ljava/lang/String;Lcom/robinhood/models/supportchat/api/ApiSocketChatMessageAttributes;)Lio/reactivex/Single;", "waitForSynchronization", "(Lcom/twilio/conversations/Conversation;)Lio/reactivex/Single;", "Lkotlinx/coroutines/flow/Flow;", "streamMessages", "()Lkotlinx/coroutines/flow/Flow;", "Lio/reactivex/Observable;", "streamNewMessage", "()Lio/reactivex/Observable;", "messageBody", "localSid", "sendTextMessage", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "Ljava/util/UUID;", "documentId", "", "originalWidth", "originalHeight", "sendImageMessage", "(Ljava/util/UUID;IILjava/lang/String;)Lio/reactivex/Single;", "count", "", "getLastMessages", "(I)Lio/reactivex/Single;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getMessagesBefore", "(Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnreadMessageCount", "()Lio/reactivex/Single;", "setAllMessagesRead", "Lkotlin/Pair;", "j$/time/Instant", "streamLastAgentReadMessageData", "", "streamTyping", "", "signalTyping", "()V", "Lcom/twilio/conversations/Message;", "message", "onMessageAdded", "(Lcom/twilio/conversations/Message;)V", "Lcom/twilio/conversations/Message$UpdateReason;", "reason", "onMessageUpdated", "(Lcom/twilio/conversations/Message;Lcom/twilio/conversations/Message$UpdateReason;)V", "onMessageDeleted", "Lcom/twilio/conversations/Participant;", "participant", "onParticipantAdded", "(Lcom/twilio/conversations/Participant;)V", "Lcom/twilio/conversations/Participant$UpdateReason;", "onParticipantUpdated", "(Lcom/twilio/conversations/Participant;Lcom/twilio/conversations/Participant$UpdateReason;)V", "onParticipantDeleted", "onTypingStarted", "(Lcom/twilio/conversations/Conversation;Lcom/twilio/conversations/Participant;)V", "onTypingEnded", "onSynchronizationChanged", "(Lcom/twilio/conversations/Conversation;)V", "Lcom/twilio/conversations/Conversation;", "Lcom/squareup/moshi/JsonAdapter;", "messageAttrAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/supportchat/api/ApiSocketSenderAttribute;", "senderAttrAdapter", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/lib/conversations/ConversationEvent;", "eventRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/lib/conversations/ConversationEvent$SynchronizationChanged;", "syncStatusRelay", "eventObs", "Lio/reactivex/Observable;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "messagesStateFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Companion", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ConversationHelper implements ConversationListener {
    private static final String IMAGE_MESSAGE_BODY = "<image>";
    private final Conversation conversation;
    private final Observable<ConversationEvent> eventObs;
    private final BehaviorRelay<ConversationEvent> eventRelay;
    private final JsonAdapter<ApiSocketChatMessageAttributes> messageAttrAdapter;
    private final SharedFlow2<SocketChatMessage> messagesStateFlow;
    private final JsonAdapter<ApiSocketSenderAttribute> senderAttrAdapter;
    private final BehaviorRelay<ConversationEvent.SynchronizationChanged> syncStatusRelay;

    /* compiled from: ConversationHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.conversations.ConversationHelper", m3645f = "ConversationHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "getMessagesBefore")
    /* renamed from: com.robinhood.android.lib.conversations.ConversationHelper$getMessagesBefore$1 */
    static final class C202161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C202161(Continuation<? super C202161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationHelper.this.getMessagesBefore(null, 0, this);
        }
    }

    public ConversationHelper(Conversation conversation, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.conversation = conversation;
        Types types = Types.INSTANCE;
        this.messageAttrAdapter = moshi.adapter(new TypeToken<ApiSocketChatMessageAttributes>() { // from class: com.robinhood.android.lib.conversations.ConversationHelper$special$$inlined$getAdapter$1
        }.getType());
        this.senderAttrAdapter = moshi.adapter(new TypeToken<ApiSocketSenderAttribute>() { // from class: com.robinhood.android.lib.conversations.ConversationHelper$special$$inlined$getAdapter$2
        }.getType());
        BehaviorRelay<ConversationEvent> behaviorRelayCreateDefault = BehaviorRelay.createDefault(ConversationEvent.None.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.eventRelay = behaviorRelayCreateDefault;
        BehaviorRelay<ConversationEvent.SynchronizationChanged> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.syncStatusRelay = behaviorRelayCreate;
        Observable<ConversationEvent> observableRefCount = behaviorRelayCreateDefault.doOnSubscribe(new Consumer() { // from class: com.robinhood.android.lib.conversations.ConversationHelper$eventObs$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                Timber.INSTANCE.mo3356i("Chat status - Registering conversation listener", new Object[0]);
                this.this$0.conversation.addListener(this.this$0);
            }
        }).doOnDispose(new Action() { // from class: com.robinhood.android.lib.conversations.ConversationHelper$eventObs$2
            @Override // io.reactivex.functions.Action
            public final void run() {
                Timber.INSTANCE.mo3356i("Chat status - Unregistering conversation listener", new Object[0]);
                this.this$0.conversation.removeListener(this.this$0);
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        this.eventObs = observableRefCount;
        this.messagesStateFlow = SharedFlow4.MutableSharedFlow$default(0, 0, null, 6, null);
    }

    public final Flow<SocketChatMessage> streamMessages() {
        SharedFlow2<SocketChatMessage> sharedFlow2 = this.messagesStateFlow;
        final Flow<Message> flowStreamNewMessages = ConversationFlows.streamNewMessages(this.conversation);
        return FlowKt.merge(sharedFlow2, new Flow<SocketChatMessage>() { // from class: com.robinhood.android.lib.conversations.ConversationHelper$streamMessages$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.lib.conversations.ConversationHelper$streamMessages$$inlined$map$1$2 */
            public static final class C202132<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ConversationHelper this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.lib.conversations.ConversationHelper$streamMessages$$inlined$map$1$2", m3645f = "ConversationHelper.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.lib.conversations.ConversationHelper$streamMessages$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C202132.this.emit(null, this);
                    }
                }

                public C202132(FlowCollector flowCollector, ConversationHelper conversationHelper) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = conversationHelper;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws IOException {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        SocketChatMessage uiModel = Messages2.toUiModel((Message) obj, (JsonAdapter<ApiSocketChatMessageAttributes>) this.this$0.messageAttrAdapter);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(uiModel, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super SocketChatMessage> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamNewMessages.collect(new C202132(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    public final Observable<SocketChatMessage> streamNewMessage() {
        Observable<U> observableOfType = this.eventObs.ofType(ConversationEvent2.Added.class);
        Intrinsics.checkExpressionValueIsNotNull(observableOfType, "ofType(R::class.java)");
        Observable<SocketChatMessage> map = observableOfType.map(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.streamNewMessage.1
            @Override // io.reactivex.functions.Function
            public final SocketChatMessage apply(ConversationEvent2.Added event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return Messages2.toUiModel(event.getMessage(), (JsonAdapter<ApiSocketChatMessageAttributes>) ConversationHelper.this.messageAttrAdapter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Single<SocketChatMessage> sendTextMessage(String messageBody, String localSid) {
        Intrinsics.checkNotNullParameter(messageBody, "messageBody");
        Intrinsics.checkNotNullParameter(localSid, "localSid");
        return sendMessageInternal(messageBody, new ApiSocketChatMessageAttributes(new ApiSocketChatMessage2.Text(StringsKt.toUuid(localSid), ParticipantType.USER, null, new ApiSocketChatMessage2.Text.Extras(), 4, null)));
    }

    public final Single<SocketChatMessage> sendImageMessage(UUID documentId, int originalWidth, int originalHeight, String localSid) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(localSid, "localSid");
        return sendMessageInternal(IMAGE_MESSAGE_BODY, new ApiSocketChatMessageAttributes(new ApiSocketChatMessage2.Image(StringsKt.toUuid(localSid), ParticipantType.USER, null, new ApiSocketChatMessage2.Image.Extras(documentId, originalWidth, originalHeight), 4, null)));
    }

    private final Single<SocketChatMessage> sendMessageInternal(final String body, final ApiSocketChatMessageAttributes attrs) {
        Single<SocketChatMessage> map = waitForSynchronization(this.conversation).flatMap(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.sendMessageInternal.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Message> apply(Conversation conversation) {
                Conversation.MessageBuilder attributes;
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                Conversation.MessageBuilder body2 = conversation.prepareMessage().setBody(body);
                String json = this.messageAttrAdapter.toJson(attrs);
                if (json != null && (attributes = body2.setAttributes(new Attributes(new JSONObject(json)))) != null) {
                    body2 = attributes;
                }
                Intrinsics.checkNotNullExpressionValue(body2, "optRun(...)");
                return Conversations2.buildAndSend(body2);
            }
        }).map(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.sendMessageInternal.2
            @Override // io.reactivex.functions.Function
            public final SocketChatMessage apply(Message message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return Messages2.toUiModel(message, (JsonAdapter<ApiSocketChatMessageAttributes>) ConversationHelper.this.messageAttrAdapter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Single<List<SocketChatMessage>> getLastMessages(final int count) {
        Single<List<SocketChatMessage>> map = waitForSynchronization(this.conversation).flatMap(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.getLastMessages.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends List<Message>> apply(Conversation conversation) {
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                return Conversations2.getLastMessages(conversation, count);
            }
        }).map(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.getLastMessages.2
            @Override // io.reactivex.functions.Function
            public final List<SocketChatMessage> apply(List<? extends Message> messages) {
                Intrinsics.checkNotNullParameter(messages, "messages");
                return Messages2.toUiModel(messages, (JsonAdapter<ApiSocketChatMessageAttributes>) ConversationHelper.this.messageAttrAdapter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static /* synthetic */ Object getMessagesBefore$default(ConversationHelper conversationHelper, Long l, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = null;
        }
        return conversationHelper.getMessagesBefore(l, i, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getMessagesBefore(final Long l, final int i, Continuation<? super List<SocketChatMessage>> continuation) {
        C202161 c202161;
        Iterator it;
        List list;
        if (continuation instanceof C202161) {
            c202161 = (C202161) continuation;
            int i2 = c202161.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c202161.label = i2 - Integer.MIN_VALUE;
            } else {
                c202161 = new C202161(continuation);
            }
        }
        Object objAwait = c202161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c202161.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwait);
            Single map = waitForSynchronization(this.conversation).flatMap(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper$getMessagesBefore$messages$1
                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends List<Message>> apply(Conversation conversation) {
                    Intrinsics.checkNotNullParameter(conversation, "conversation");
                    Long l2 = l;
                    if (l2 == null) {
                        return Conversations2.getLastMessages(conversation, i);
                    }
                    return Conversations2.getMessagesBefore(conversation, l2.longValue(), i);
                }
            }).map(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper$getMessagesBefore$messages$2
                @Override // io.reactivex.functions.Function
                public final List<SocketChatMessage> apply(List<? extends Message> messages) {
                    Intrinsics.checkNotNullParameter(messages, "messages");
                    return Messages2.toUiModel(messages, (JsonAdapter<ApiSocketChatMessageAttributes>) this.this$0.messageAttrAdapter);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            c202161.label = 1;
            objAwait = RxAwait3.await(map, c202161);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c202161.L$1;
                list = (List) c202161.L$0;
                ResultKt.throwOnFailure(objAwait);
                while (it.hasNext()) {
                    SocketChatMessage socketChatMessage = (SocketChatMessage) it.next();
                    SharedFlow2<SocketChatMessage> sharedFlow2 = this.messagesStateFlow;
                    c202161.L$0 = list;
                    c202161.L$1 = it;
                    c202161.label = 2;
                    if (sharedFlow2.emit(socketChatMessage, c202161) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Intrinsics.checkNotNull(list);
                return list;
            }
            ResultKt.throwOnFailure(objAwait);
        }
        List list2 = (List) objAwait;
        Intrinsics.checkNotNull(list2);
        it = list2.iterator();
        list = list2;
        while (it.hasNext()) {
        }
        Intrinsics.checkNotNull(list);
        return list;
    }

    public final Single<Long> getUnreadMessageCount() {
        Single<Long> singleFlatMap = waitForSynchronization(this.conversation).flatMap(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.getUnreadMessageCount.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<Long>> apply(Conversation conversation) {
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                return Conversations2.getUnreadMessagesCount(conversation);
            }
        }).flatMap(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.getUnreadMessageCount.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Long> apply(Optional<Long> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Long lComponent1 = optional.component1();
                if (lComponent1 == null) {
                    return Conversations2.getMessagesCount(ConversationHelper.this.conversation);
                }
                Single singleJust = Single.just(lComponent1);
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final Single<Long> setAllMessagesRead() {
        Single singleFlatMap = waitForSynchronization(this.conversation).flatMap(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.setAllMessagesRead.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Long> apply(Conversation conversation) {
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                return Conversations2.setAllMessagesRead(conversation);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final Observable<Tuples2<Long, Instant>> streamLastAgentReadMessageData() {
        Observable observable = waitForSynchronization(this.conversation).map(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper$streamLastAgentReadMessageData$initial$1
            @Override // io.reactivex.functions.Function
            public final Optional<Tuples2<Long, Instant>> apply(Conversation conversation) {
                T next;
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                List<Participant> participantsList = conversation.getParticipantsList();
                Intrinsics.checkNotNullExpressionValue(participantsList, "getParticipantsList(...)");
                ConversationHelper conversationHelper = this.this$0;
                Iterator<T> it = participantsList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Participant participant = (Participant) next;
                    Intrinsics.checkNotNull(participant);
                    if (Participants2.isAgent(participant, conversationHelper.senderAttrAdapter)) {
                        break;
                    }
                }
                Participant participant2 = (Participant) next;
                return Optional3.asOptional(participant2 != null ? Participants2.getLastReadDataPair(participant2) : null);
            }
        }).toObservable();
        Observable<U> observableOfType = this.eventObs.ofType(ConversationEvent3.Updated.class);
        Intrinsics.checkExpressionValueIsNotNull(observableOfType, "ofType(R::class.java)");
        Observable observableConcat = Observable.concat(observable, observableOfType.filter(new Predicate() { // from class: com.robinhood.android.lib.conversations.ConversationHelper$streamLastAgentReadMessageData$stream$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(ConversationEvent3.Updated event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return event.getReason() == Participant.UpdateReason.LAST_READ_MESSAGE_INDEX && Participants2.isAgent(event.getParticipant(), this.this$0.senderAttrAdapter);
            }
        }).map(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper$streamLastAgentReadMessageData$stream$2
            @Override // io.reactivex.functions.Function
            public final Optional<Tuples2<Long, Instant>> apply(ConversationEvent3.Updated it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(Participants2.getLastReadDataPair(it.getParticipant()));
            }
        }));
        Intrinsics.checkNotNullExpressionValue(observableConcat, "concat(...)");
        return ObservablesKt.filterIsPresent(observableConcat);
    }

    public final Observable<Boolean> streamTyping() {
        Observable<U> observableOfType = this.eventObs.ofType(ConversationEvent3.Typing.class);
        Intrinsics.checkExpressionValueIsNotNull(observableOfType, "ofType(R::class.java)");
        Observable<Boolean> map = observableOfType.filter(new Predicate() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.streamTyping.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(ConversationEvent3.Typing it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Participants2.isAgent(it.getParticipant(), ConversationHelper.this.senderAttrAdapter);
            }
        }).map(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.streamTyping.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(ConversationEvent3.Typing it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getKind() == ConversationEvent3.Typing.Kind.STARTED);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void signalTyping() {
        this.conversation.typing();
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onMessageAdded(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.eventRelay.accept(new ConversationEvent2.Added(message));
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onMessageUpdated(Message message, Message.UpdateReason reason) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.eventRelay.accept(new ConversationEvent2.Updated(message, reason));
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onMessageDeleted(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.eventRelay.accept(new ConversationEvent2.Deleted(message));
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onParticipantAdded(Participant participant) {
        Intrinsics.checkNotNullParameter(participant, "participant");
        this.eventRelay.accept(new ConversationEvent3.Added(participant));
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onParticipantUpdated(Participant participant, Participant.UpdateReason reason) {
        Intrinsics.checkNotNullParameter(participant, "participant");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.eventRelay.accept(new ConversationEvent3.Updated(participant, reason));
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onParticipantDeleted(Participant participant) {
        Intrinsics.checkNotNullParameter(participant, "participant");
        this.eventRelay.accept(new ConversationEvent3.Deleted(participant));
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onTypingStarted(Conversation conversation, Participant participant) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(participant, "participant");
        this.eventRelay.accept(new ConversationEvent3.Typing(conversation, participant, ConversationEvent3.Typing.Kind.STARTED));
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onTypingEnded(Conversation conversation, Participant participant) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(participant, "participant");
        this.eventRelay.accept(new ConversationEvent3.Typing(conversation, participant, ConversationEvent3.Typing.Kind.ENDED));
    }

    @Override // com.twilio.conversations.ConversationListener
    public void onSynchronizationChanged(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        this.syncStatusRelay.accept(new ConversationEvent.SynchronizationChanged(conversation));
    }

    private final Single<Conversation> waitForSynchronization(final Conversation conversation) {
        Single<Conversation> singleFirstOrError = this.eventObs.switchMap(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.waitForSynchronization.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ConversationEvent.SynchronizationChanged> apply(ConversationEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ConversationHelper.this.syncStatusRelay;
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.waitForSynchronization.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(ConversationEvent.SynchronizationChanged status) {
                Intrinsics.checkNotNullParameter(status, "status");
                return status.getConversation().getSynchronizationStatus() == Conversation.SynchronizationStatus.ALL;
            }
        }).map(new Function() { // from class: com.robinhood.android.lib.conversations.ConversationHelper.waitForSynchronization.3
            @Override // io.reactivex.functions.Function
            public final Conversation apply(ConversationEvent.SynchronizationChanged it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return conversation;
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        return singleFirstOrError;
    }
}
