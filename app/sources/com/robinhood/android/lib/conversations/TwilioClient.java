package com.robinhood.android.lib.conversations;

import android.content.Context;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.conversations.ClientEvent;
import com.robinhood.android.lib.conversations.ClientEvent2;
import com.robinhood.android.lib.conversations.ClientEvent3;
import com.robinhood.android.lib.conversations.ClientEvent5;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Maybes2;
import com.robinhood.utils.extensions.MaybesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.twilio.conversations.Conversation;
import com.twilio.conversations.ConversationsClient;
import com.twilio.conversations.ConversationsClientListener;
import com.twilio.conversations.User;
import com.twilio.util.ErrorInfo;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.concurrent.TimeUnit;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import timber.log.Timber;

/* compiled from: TwilioClient.kt */
@Metadata(m3635d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u0017H\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u001eH\u0016J\u0018\u0010(\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u001eH\u0016J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u001eH\u0016J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u0002022\u0006\u0010)\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020\u00172\u0006\u00101\u001a\u000202H\u0016J\u0010\u00105\u001a\u00020\u00172\u0006\u00101\u001a\u000202H\u0016J\u0010\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u001aH\u0016J\b\u00108\u001a\u00020\u0017H\u0016J\b\u00109\u001a\u00020\u0017H\u0016J$\u0010:\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010;\u001a\u0004\u0018\u00010!2\u0006\u0010<\u001a\u00020=H\u0016J\u0012\u0010>\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u0010?\u001a\u00020\u0017H\u0016J\u0012\u0010@\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010A\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0014\u0010B\u001a\u0004\u0018\u00010C*\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J#\u0010D\u001a\b\u0012\u0004\u0012\u0002HE0\u0012\"\b\b\u0000\u0010E*\u00020F*\b\u0012\u0004\u0012\u0002HE0GH\u0096\u0001J'\u0010H\u001a\b\u0012\u0004\u0012\u0002HE0\u0012\"\b\b\u0000\u0010E*\u00020F2\f\u0010I\u001a\b\u0012\u0004\u0012\u0002HE0GH\u0096\u0001J?\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2'\u0010N\u001a#\b\u0001\u0012\u0004\u0012\u00020P\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170Q\u0012\u0006\u0012\u0004\u0018\u00010F0O¢\u0006\u0002\bRH\u0096\u0001¢\u0006\u0002\u0010SJS\u0010T\u001a\b\u0012\u0004\u0012\u0002HE0U\"\n\b\u0000\u0010E*\u0004\u0018\u00010F2\u0006\u0010L\u001a\u00020M2)\u0010N\u001a%\b\u0001\u0012\u0004\u0012\u00020P\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001HE0Q\u0012\u0006\u0012\u0004\u0018\u00010F0O¢\u0006\u0002\bRH\u0096\u0001¢\u0006\u0002\u0010VJW\u0010W\u001a\b\u0012\u0004\u0012\u0002HE0\u0012\"\b\b\u0000\u0010E*\u00020F2\u0006\u0010L\u001a\u00020M2/\b\u0001\u0010N\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002HE0X\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170Q\u0012\u0006\u0012\u0004\u0018\u00010F0O¢\u0006\u0002\bRH\u0096\u0001¢\u0006\u0002\u0010YJO\u0010Z\u001a\b\u0012\u0004\u0012\u0002HE0[\"\b\b\u0000\u0010E*\u00020F2\u0006\u0010L\u001a\u00020M2'\u0010N\u001a#\b\u0001\u0012\u0004\u0012\u00020P\u0012\n\u0012\b\u0012\u0004\u0012\u0002HE0Q\u0012\u0006\u0012\u0004\u0018\u00010F0O¢\u0006\u0002\bRH\u0096\u0001¢\u0006\u0002\u0010\\R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0011\u001a&\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00100\u0010 \u0013*\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u00120\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006^"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/TwilioClient;", "Lcom/twilio/conversations/ConversationsClientListener;", "Lcom/robinhood/coroutines/rx/RxFactory;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "chatTokenManager", "Lcom/robinhood/android/lib/conversations/ChatTokenManager;", "chatClientLogger", "Lcom/robinhood/android/lib/conversations/ChatClientLogger;", "rxFactory", "appContext", "Landroid/content/Context;", "<init>", "(Lcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/android/lib/conversations/ChatTokenManager;Lcom/robinhood/android/lib/conversations/ChatClientLogger;Lcom/robinhood/coroutines/rx/RxFactory;Landroid/content/Context;)V", "clientEventRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/lib/conversations/ClientEvent;", "connectionObservable", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "getClientStateObs", "Lcom/robinhood/android/lib/conversations/ClientEvent$Started;", "initialize", "", "shutdown", "currentConnectionState", "Lcom/twilio/conversations/ConversationsClient$ConnectionState;", "getCurrentConnectionState", "()Lcom/twilio/conversations/ConversationsClient$ConnectionState;", "streamReadMessageIndexChanges", "Lcom/twilio/conversations/Conversation;", "getConversation", "conversationSid", "", "refreshAccessToken", "onClientSynchronization", "status", "Lcom/twilio/conversations/ConversationsClient$SynchronizationStatus;", "onConversationAdded", "conversation", "onConversationUpdated", "reason", "Lcom/twilio/conversations/Conversation$UpdateReason;", "onConversationDeleted", "onConversationSynchronizationChange", "onError", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "onUserUpdated", "user", "Lcom/twilio/conversations/User;", "Lcom/twilio/conversations/User$UpdateReason;", "onUserSubscribed", "onUserUnsubscribed", "onConnectionStateChange", "state", "onTokenAboutToExpire", "onTokenExpired", "onNewMessageNotification", "messageSid", "messageIndex", "", "onNotificationFailed", "onNotificationSubscribed", "onAddedToConversationNotification", "onRemovedFromConversationNotification", "getClient", "Lcom/twilio/conversations/ConversationsClient;", "asObservable", "T", "", "Lkotlinx/coroutines/flow/Flow;", "convertToObservable", "flow", "rxCompletable", "Lio/reactivex/Completable;", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Completable;", "rxMaybe", "Lio/reactivex/Maybe;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Maybe;", "rxObservable", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "rxSingle", "Lio/reactivex/Single;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Single;", "Companion", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TwilioClient implements ConversationsClientListener, RxFactory {
    private static final long CLIENT_DISPOSAL_TIMEOUT_S = 5;
    private final Context appContext;
    private final ChatClientLogger chatClientLogger;
    private final ChatTokenManager chatTokenManager;
    private final BehaviorRelay<ClientEvent> clientEventRelay;
    private final Observable<ClientEvent> connectionObservable;
    private final LogoutKillswitch logoutKillswitch;
    private final RxFactory rxFactory;

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return this.rxFactory.asObservable(flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> convertToObservable(Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        return this.rxFactory.convertToObservable(flow);
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onAddedToConversationNotification(String conversationSid) {
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onNewMessageNotification(String conversationSid, String messageSid, long messageIndex) {
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onNotificationFailed(ErrorInfo errorInfo) {
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onNotificationSubscribed() {
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onRemovedFromConversationNotification(String conversationSid) {
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public Completable rxCompletable(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.rxFactory.rxCompletable(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Maybe<T> rxMaybe(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.rxFactory.rxMaybe(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> rxObservable(CoroutineContext context, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.rxFactory.rxObservable(context, block);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Single<T> rxSingle(CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        return this.rxFactory.rxSingle(context, block);
    }

    public TwilioClient(LogoutKillswitch logoutKillswitch, ChatTokenManager chatTokenManager, ChatClientLogger chatClientLogger, RxFactory rxFactory, Context appContext) {
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(chatTokenManager, "chatTokenManager");
        Intrinsics.checkNotNullParameter(chatClientLogger, "chatClientLogger");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.logoutKillswitch = logoutKillswitch;
        this.chatTokenManager = chatTokenManager;
        this.chatClientLogger = chatClientLogger;
        this.rxFactory = rxFactory;
        this.appContext = appContext;
        BehaviorRelay<ClientEvent> behaviorRelayCreateDefault = BehaviorRelay.createDefault(ClientEvent.NotStarted.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.clientEventRelay = behaviorRelayCreateDefault;
        ConversationsClient.setLogLevel(ConversationsClient.LogLevel.SILENT);
        Observable<ClientEvent> observableDistinctUntilChanged = behaviorRelayCreateDefault.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedSubscriptionKt.subscribeIn(observableDistinctUntilChanged, logoutKillswitch.getLoggedInScope(), new Function1() { // from class: com.robinhood.android.lib.conversations.TwilioClient$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwilioClient._init_$lambda$0(this.f$0, (ClientEvent) obj);
            }
        });
        this.connectionObservable = behaviorRelayCreateDefault.doOnSubscribe(new Consumer() { // from class: com.robinhood.android.lib.conversations.TwilioClient$connectionObservable$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                this.this$0.initialize();
            }
        }).subscribeOn(AndroidSchedulers.mainThread()).doOnDispose(new Action() { // from class: com.robinhood.android.lib.conversations.TwilioClient$connectionObservable$2
            @Override // io.reactivex.functions.Action
            public final void run() {
                this.this$0.shutdown();
            }
        }).unsubscribeOn(AndroidSchedulers.mainThread()).replay(1).refCount(5L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(TwilioClient twilioClient, ClientEvent clientEvent) {
        ChatClientLogger chatClientLogger = twilioClient.chatClientLogger;
        Intrinsics.checkNotNull(clientEvent);
        chatClientLogger.logClientEvent$lib_conversations_externalDebug(clientEvent);
        return Unit.INSTANCE;
    }

    private final synchronized Observable<ClientEvent.Started> getClientStateObs() {
        Observable<ClientEvent.Started> observableHide;
        Observable<R> observableFlatMap = this.connectionObservable.flatMap(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioClient.getClientStateObs.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ClientEvent> apply(ClientEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                Timber.INSTANCE.mo3356i("Chat status - client state change : " + event.getClass().getSimpleName(), new Object[0]);
                if (event instanceof ClientEvent.Failed) {
                    return Observable.error(((ClientEvent.Failed) event).getException());
                }
                return Observable.just(event);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        Observable observableOfType = observableFlatMap.ofType(ClientEvent.Started.class);
        Intrinsics.checkExpressionValueIsNotNull(observableOfType, "ofType(R::class.java)");
        observableHide = observableOfType.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initialize() {
        if ((this.clientEventRelay.getValue() instanceof ClientEvent.Started) || (this.clientEventRelay.getValue() instanceof ClientEvent.Starting)) {
            return;
        }
        Single singleDoOnSubscribe = SinglesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxSingle$default(this, null, new C202431(null), 1, null)).flatMap(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioClient.initialize.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends ConversationsClient> apply(String token) {
                Intrinsics.checkNotNullParameter(token, "token");
                return ConversationsClients.createConversationsClient(TwilioClient.this.appContext, token);
            }
        }).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.lib.conversations.TwilioClient.initialize.3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                TwilioClient.this.clientEventRelay.accept(ClientEvent.Starting.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        ScopedSubscriptionKt.subscribeIn(singleDoOnSubscribe, this.logoutKillswitch.getLoggedInScope(), new Function1() { // from class: com.robinhood.android.lib.conversations.TwilioClient$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwilioClient.initialize$lambda$1(this.f$0, (ConversationsClient) obj);
            }
        }, (Function1<? super Throwable, Unit>) new Function1() { // from class: com.robinhood.android.lib.conversations.TwilioClient$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwilioClient.initialize$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: TwilioClient.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.conversations.TwilioClient$initialize$1", m3645f = "TwilioClient.kt", m3646l = {83}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.conversations.TwilioClient$initialize$1 */
    static final class C202431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int label;

        C202431(Continuation<? super C202431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TwilioClient.this.new C202431(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C202431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ChatTokenManager chatTokenManager = TwilioClient.this.chatTokenManager;
            this.label = 1;
            Object objRefreshAccessToken = chatTokenManager.refreshAccessToken(false, this);
            return objRefreshAccessToken == coroutine_suspended ? coroutine_suspended : objRefreshAccessToken;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$1(TwilioClient twilioClient, ConversationsClient conversationsClient) {
        BehaviorRelay<ClientEvent> behaviorRelay = twilioClient.clientEventRelay;
        Intrinsics.checkNotNull(conversationsClient);
        behaviorRelay.accept(new ClientEvent.Started.Ready(conversationsClient));
        conversationsClient.addListener(twilioClient);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$2(TwilioClient twilioClient, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        twilioClient.clientEventRelay.accept(new ClientEvent.Failed(new ChatException(null, t)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void shutdown() {
        ConversationsClient client;
        try {
            Timber.Companion companion = Timber.INSTANCE;
            companion.mo3356i("Chat status - Shutting down the SDK", new Object[0]);
            ClientEvent value = this.clientEventRelay.getValue();
            ClientEvent.Started started = value instanceof ClientEvent.Started ? (ClientEvent.Started) value : null;
            if (started != null && (client = started.getClient()) != null) {
                this.chatClientLogger.logShutdown$lib_conversations_externalDebug();
                client.removeAllListeners();
                client.shutdown();
                companion.mo3356i("Chat status - Shutdown the SDK", new Object[0]);
            }
            this.clientEventRelay.accept(ClientEvent.NotStarted.INSTANCE);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final ConversationsClient.ConnectionState getCurrentConnectionState() {
        ConversationsClient client;
        ClientEvent value = this.clientEventRelay.getValue();
        ClientEvent.Started started = value instanceof ClientEvent.Started ? (ClientEvent.Started) value : null;
        if (started == null || (client = started.getClient()) == null) {
            return null;
        }
        return client.getConnectionState();
    }

    public final Observable<Conversation> streamReadMessageIndexChanges() {
        Observable<U> observableOfType = getClientStateObs().ofType(ClientEvent3.Updated.class);
        Intrinsics.checkExpressionValueIsNotNull(observableOfType, "ofType(R::class.java)");
        Observable<Conversation> observableHide = observableOfType.filter(new Predicate() { // from class: com.robinhood.android.lib.conversations.TwilioClient.streamReadMessageIndexChanges.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(ClientEvent3.Updated event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return event.getReason() == Conversation.UpdateReason.LAST_READ_MESSAGE_INDEX || event.getReason() == Conversation.UpdateReason.LAST_MESSAGE;
            }
        }).map(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioClient.streamReadMessageIndexChanges.2
            @Override // io.reactivex.functions.Function
            public final Conversation apply(ClientEvent3.Updated event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return event.getConversation();
            }
        }).hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    public final Observable<Conversation> getConversation(final String conversationSid) {
        Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
        Observable<Conversation> observableDoOnNext = getClientStateObs().distinctUntilChanged(new BiPredicate() { // from class: com.robinhood.android.lib.conversations.TwilioClient.getConversation.1
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(ClientEvent.Started a, ClientEvent.Started b) {
                Intrinsics.checkNotNullParameter(a, "a");
                Intrinsics.checkNotNullParameter(b, "b");
                return Intrinsics.areEqual(a.getClient(), b.getClient());
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioClient.getConversation.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Conversation> apply(ClientEvent.Started it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ConversationsClients.getConversation(it.getClient(), conversationSid).toObservable();
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.android.lib.conversations.TwilioClient.getConversation.3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Conversation conversation) {
                TwilioClient.this.chatClientLogger.logConversationLoad$lib_conversations_externalDebug();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    /* compiled from: TwilioClient.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.conversations.TwilioClient$refreshAccessToken$1", m3645f = "TwilioClient.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.conversations.TwilioClient$refreshAccessToken$1 */
    static final class C202461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int label;

        C202461(Continuation<? super C202461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TwilioClient.this.new C202461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C202461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ChatTokenManager chatTokenManager = TwilioClient.this.chatTokenManager;
            this.label = 1;
            Object objRefreshAccessToken = chatTokenManager.refreshAccessToken(true, this);
            return objRefreshAccessToken == coroutine_suspended ? coroutine_suspended : objRefreshAccessToken;
        }
    }

    private final void refreshAccessToken() {
        Single map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C202461(null), 1, null).map(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioClient.refreshAccessToken.2
            @Override // io.reactivex.functions.Function
            public final Optional<Tuples2<ConversationsClient, String>> apply(String token) {
                Intrinsics.checkNotNullParameter(token, "token");
                TwilioClient twilioClient = TwilioClient.this;
                ConversationsClient client = twilioClient.getClient(twilioClient.clientEventRelay);
                return Optional3.asOptional(client != null ? Tuples4.m3642to(client, token) : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Maybe maybeFlatMapSingleElement = MaybesAndroid.observeOnMainThread(SinglesKt.unwrapOptional(map)).flatMapSingleElement(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioClient.refreshAccessToken.3
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Unit> apply(Tuples2<? extends ConversationsClient, String> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                ConversationsClient conversationsClientComponent1 = tuples2.component1();
                String strComponent2 = tuples2.component2();
                Intrinsics.checkNotNullExpressionValue(strComponent2, "component2(...)");
                return ConversationsClients.updateToken(conversationsClientComponent1, strComponent2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeFlatMapSingleElement, "flatMapSingleElement(...)");
        ScopedSubscriptionKt.subscribeIn(RxErrorExtensions.ignoreChatException(Maybes2.ignoreNetworkExceptions(maybeFlatMapSingleElement)), this.logoutKillswitch.getLoggedInScope());
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onClientSynchronization(ConversationsClient.SynchronizationStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        ConversationsClient client = getClient(this.clientEventRelay);
        if (client != null) {
            this.clientEventRelay.accept(new ClientEvent2.Synchronization(client, status));
        }
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onConversationAdded(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        ConversationsClient client = getClient(this.clientEventRelay);
        if (client != null) {
            this.clientEventRelay.accept(new ClientEvent3.Added(client, conversation));
        }
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onConversationUpdated(Conversation conversation, Conversation.UpdateReason reason) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(reason, "reason");
        ConversationsClient client = getClient(this.clientEventRelay);
        if (client != null) {
            this.clientEventRelay.accept(new ClientEvent3.Updated(client, conversation, reason));
        }
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onConversationDeleted(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        ConversationsClient client = getClient(this.clientEventRelay);
        if (client != null) {
            new ClientEvent3.Deleted(client, conversation);
        }
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onConversationSynchronizationChange(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        ConversationsClient client = getClient(this.clientEventRelay);
        if (client != null) {
            this.clientEventRelay.accept(new ClientEvent3.SynchronizationChange(client, conversation));
        }
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onError(ErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        ConversationsClient client = getClient(this.clientEventRelay);
        if (client != null) {
            this.clientEventRelay.accept(new ClientEvent4(client, new ChatException(errorInfo, null, 2, null)));
        }
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onUserUpdated(User user, User.UpdateReason reason) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(reason, "reason");
        ConversationsClient client = getClient(this.clientEventRelay);
        if (client != null) {
            this.clientEventRelay.accept(new ClientEvent5.Updated(client, user, reason));
        }
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onUserSubscribed(User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        ConversationsClient client = getClient(this.clientEventRelay);
        if (client != null) {
            this.clientEventRelay.accept(new ClientEvent5.Subscribed(client, user));
        }
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onUserUnsubscribed(User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        ConversationsClient client = getClient(this.clientEventRelay);
        if (client != null) {
            this.clientEventRelay.accept(new ClientEvent5.Unsubscribed(client, user));
        }
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onConnectionStateChange(ConversationsClient.ConnectionState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ConversationsClient client = getClient(this.clientEventRelay);
        if (client != null) {
            this.clientEventRelay.accept(new ClientEvent2.ConnectionStateChange(client, state));
        }
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onTokenAboutToExpire() {
        this.chatClientLogger.logTokenEvent$lib_conversations_externalDebug(getCurrentConnectionState(), false);
        refreshAccessToken();
    }

    @Override // com.twilio.conversations.ConversationsClientListener
    public void onTokenExpired() {
        this.chatClientLogger.logTokenEvent$lib_conversations_externalDebug(getCurrentConnectionState(), true);
        refreshAccessToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConversationsClient getClient(BehaviorRelay<ClientEvent> behaviorRelay) {
        ClientEvent value = behaviorRelay.getValue();
        Intrinsics.checkNotNull(value);
        ClientEvent.Started started = value instanceof ClientEvent.Started ? (ClientEvent.Started) value : null;
        if (started != null) {
            return started.getClient();
        }
        return null;
    }
}
