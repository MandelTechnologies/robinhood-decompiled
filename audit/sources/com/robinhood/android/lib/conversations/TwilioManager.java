package com.robinhood.android.lib.conversations;

import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.robinhood.utils.moshi.LazyMoshi;
import com.twilio.conversations.Conversation;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;
import timber.log.Timber;

/* compiled from: TwilioManager.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\nJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u000e\u001a\u00020\nJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u000e\u001a\u00020\nJ&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u00130\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u000e\u001a\u00020\nJ&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u00130\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/TwilioManager;", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "twilioClient", "Lcom/robinhood/android/lib/conversations/TwilioClient;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/lib/conversations/TwilioClient;)V", "sidToConversationHelperObs", "", "", "Lio/reactivex/Observable;", "Lcom/robinhood/android/lib/conversations/ConversationHelper;", "getConversationHelper", "conversationSid", "getConversationHelperFlow", "Lkotlinx/coroutines/flow/Flow;", "streamUnreadMessageCount", "", "", "conversationSids", "", "streamPreviewMessage", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "streamPreviewMessages", "Companion", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TwilioManager {
    private static final long CONVERSATION_DISPOSAL_TIMEOUT_S = 10;
    private final LazyMoshi moshi;
    private final Map<String, Observable<ConversationHelper>> sidToConversationHelperObs;
    private final TwilioClient twilioClient;

    public TwilioManager(LazyMoshi moshi, TwilioClient twilioClient) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(twilioClient, "twilioClient");
        this.moshi = moshi;
        this.twilioClient = twilioClient;
        this.sidToConversationHelperObs = new LinkedHashMap();
    }

    public final Observable<ConversationHelper> getConversationHelper(final String conversationSid) {
        Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
        Map<String, Observable<ConversationHelper>> map = this.sidToConversationHelperObs;
        Observable<ConversationHelper> observableRefCount = map.get(conversationSid);
        if (observableRefCount == null) {
            observableRefCount = this.twilioClient.getConversation(conversationSid).map(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioManager$getConversationHelper$1$1
                @Override // io.reactivex.functions.Function
                public final ConversationHelper apply(Conversation it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new ConversationHelper(it, this.this$0.moshi);
                }
            }).doOnError(new Consumer() { // from class: com.robinhood.android.lib.conversations.TwilioManager$getConversationHelper$1$2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Throwable th) {
                    this.this$0.sidToConversationHelperObs.remove(conversationSid);
                }
            }).doOnDispose(new Action() { // from class: com.robinhood.android.lib.conversations.TwilioManager$getConversationHelper$1$3
                @Override // io.reactivex.functions.Action
                public final void run() {
                    Timber.INSTANCE.mo3356i("Chat status - Disposing conversation", new Object[0]);
                    this.this$0.sidToConversationHelperObs.remove(conversationSid);
                }
            }).replay(1).refCount(10L, TimeUnit.SECONDS);
            Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
            map.put(conversationSid, observableRefCount);
        }
        return observableRefCount;
    }

    public final Flow<ConversationHelper> getConversationHelperFlow(String conversationSid) {
        Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
        return Context7.buffer$default(RxConvert.asFlow(getConversationHelper(conversationSid)), Integer.MAX_VALUE, null, 2, null);
    }

    public final Observable<Long> streamUnreadMessageCount(final String conversationSid) {
        Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
        Observable<Long> observableSwitchMapSingle = getConversationHelper(conversationSid).switchMap(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamUnreadMessageCount.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ConversationHelper> apply(final ConversationHelper helper) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Observable<Conversation> observableStreamReadMessageIndexChanges = TwilioManager.this.twilioClient.streamReadMessageIndexChanges();
                final String str = conversationSid;
                return observableStreamReadMessageIndexChanges.filter(new Predicate() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamUnreadMessageCount.1.1
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(Conversation conversation) {
                        Intrinsics.checkNotNullParameter(conversation, "conversation");
                        return conversation.getSynchronizationStatus() == Conversation.SynchronizationStatus.ALL && Intrinsics.areEqual(str, conversation.getSid());
                    }
                }).map(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamUnreadMessageCount.1.2
                    @Override // io.reactivex.functions.Function
                    public final ConversationHelper apply(Conversation it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return helper;
                    }
                }).startWith((Observable<R>) helper);
            }
        }).switchMapSingle(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamUnreadMessageCount.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Long> apply(ConversationHelper helper) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                return helper.getUnreadMessageCount();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        return observableSwitchMapSingle;
    }

    public final Observable<Map<String, Long>> streamUnreadMessageCount(List<String> conversationSids) {
        Intrinsics.checkNotNullParameter(conversationSids, "conversationSids");
        Observable<Map<String, Long>> observableSkip = Observable.fromIterable(conversationSids).flatMap(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamUnreadMessageCount.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<String, Long>> apply(final String sid) {
                Intrinsics.checkNotNullParameter(sid, "sid");
                return TwilioManager.this.streamUnreadMessageCount(sid).map(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamUnreadMessageCount.3.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<String, Long> apply(Long message) {
                        Intrinsics.checkNotNullParameter(message, "message");
                        return Tuples4.m3642to(sid, message);
                    }
                });
            }
        }).scan(MapsKt.emptyMap(), new BiFunction() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamUnreadMessageCount.4
            @Override // io.reactivex.functions.BiFunction
            public final Map<String, Long> apply(Map<String, Long> sidToUnreadMessageCounts, Tuples2<String, Long> sidToUnreadMessageCount) {
                Intrinsics.checkNotNullParameter(sidToUnreadMessageCounts, "sidToUnreadMessageCounts");
                Intrinsics.checkNotNullParameter(sidToUnreadMessageCount, "sidToUnreadMessageCount");
                return MapsKt.plus(sidToUnreadMessageCounts, sidToUnreadMessageCount);
            }
        }).skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        return observableSkip;
    }

    public final Observable<SocketChatMessage> streamPreviewMessage(final String conversationSid) {
        Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
        Observable<SocketChatMessage> observableSwitchMapMaybe = getConversationHelper(conversationSid).switchMap(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamPreviewMessage.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ConversationHelper> apply(final ConversationHelper helper) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Observable<Conversation> observableStreamReadMessageIndexChanges = TwilioManager.this.twilioClient.streamReadMessageIndexChanges();
                final String str = conversationSid;
                return observableStreamReadMessageIndexChanges.filter(new Predicate() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamPreviewMessage.1.1
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(Conversation conversation) {
                        Intrinsics.checkNotNullParameter(conversation, "conversation");
                        return conversation.getSynchronizationStatus() == Conversation.SynchronizationStatus.ALL && Intrinsics.areEqual(str, conversation.getSid());
                    }
                }).map(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamPreviewMessage.1.2
                    @Override // io.reactivex.functions.Function
                    public final ConversationHelper apply(Conversation it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return helper;
                    }
                }).startWith((Observable<R>) helper);
            }
        }).switchMapMaybe(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamPreviewMessage.2
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends SocketChatMessage> apply(ConversationHelper helper) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                return helper.getLastMessages(1).flatMapMaybe(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamPreviewMessage.2.1
                    @Override // io.reactivex.functions.Function
                    public final MaybeSource<? extends SocketChatMessage> apply(List<SocketChatMessage> lastMessages) {
                        Maybe maybeJust;
                        Intrinsics.checkNotNullParameter(lastMessages, "lastMessages");
                        SocketChatMessage socketChatMessage = (SocketChatMessage) CollectionsKt.firstOrNull((List) lastMessages);
                        return (socketChatMessage == null || (maybeJust = Maybe.just(socketChatMessage)) == null) ? Maybe.empty() : maybeJust;
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapMaybe, "switchMapMaybe(...)");
        return observableSwitchMapMaybe;
    }

    public final Observable<Map<String, SocketChatMessage>> streamPreviewMessages(List<String> conversationSids) {
        Intrinsics.checkNotNullParameter(conversationSids, "conversationSids");
        Observable<Map<String, SocketChatMessage>> observableSkip = Observable.fromIterable(conversationSids).flatMap(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamPreviewMessages.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<String, SocketChatMessage>> apply(final String sid) {
                Intrinsics.checkNotNullParameter(sid, "sid");
                return TwilioManager.this.streamPreviewMessage(sid).map(new Function() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamPreviewMessages.1.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<String, SocketChatMessage> apply(SocketChatMessage message) {
                        Intrinsics.checkNotNullParameter(message, "message");
                        return Tuples4.m3642to(sid, message);
                    }
                });
            }
        }).scan(MapsKt.emptyMap(), new BiFunction() { // from class: com.robinhood.android.lib.conversations.TwilioManager.streamPreviewMessages.2
            @Override // io.reactivex.functions.BiFunction
            public final Map<String, SocketChatMessage> apply(Map<String, SocketChatMessage> map, Tuples2<String, SocketChatMessage> sidToPreviewMessage) {
                Intrinsics.checkNotNullParameter(map, "map");
                Intrinsics.checkNotNullParameter(sidToPreviewMessage, "sidToPreviewMessage");
                return MapsKt.plus(map, sidToPreviewMessage);
            }
        }).skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        return observableSkip;
    }
}
