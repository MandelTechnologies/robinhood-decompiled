package com.robinhood.android.lib.conversations;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChatMessageCache.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tJ\u001c\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bR&\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ChatMessageCache;", "", "<init>", "()V", "conversationSidToMessages", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "", "", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "messagesObs", "Lio/reactivex/Observable;", "getMessagesObs", "()Lio/reactivex/Observable;", "insertMessage", "", "conversationSid", "message", "insertMessages", "newMessages", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ChatMessageCache {
    public static final ChatMessageCache INSTANCE = new ChatMessageCache();
    private static final BehaviorRelay<Map<String, List<SocketChatMessage>>> conversationSidToMessages;
    private static final Observable<Map<String, List<SocketChatMessage>>> messagesObs;

    private ChatMessageCache() {
    }

    static {
        BehaviorRelay<Map<String, List<SocketChatMessage>>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(MapsKt.emptyMap());
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        conversationSidToMessages = behaviorRelayCreateDefault;
        Observable<Map<String, List<SocketChatMessage>>> observableHide = behaviorRelayCreateDefault.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        messagesObs = observableHide;
    }

    public final Observable<Map<String, List<SocketChatMessage>>> getMessagesObs() {
        return messagesObs;
    }

    public final void insertMessage(String conversationSid, SocketChatMessage message) {
        Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
        Intrinsics.checkNotNullParameter(message, "message");
        BehaviorRelay<Map<String, List<SocketChatMessage>>> behaviorRelay = conversationSidToMessages;
        Map<String, List<SocketChatMessage>> value = behaviorRelay.getValue();
        Intrinsics.checkNotNull(value);
        Map<String, List<SocketChatMessage>> map = value;
        List<SocketChatMessage> listEmptyList = map.get(conversationSid);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        behaviorRelay.accept(MapsKt.plus(map, Tuples4.m3642to(conversationSid, CollectionsKt.sortedWith(CollectionsKt.plus((Collection<? extends SocketChatMessage>) listEmptyList, message), new Comparator() { // from class: com.robinhood.android.lib.conversations.ChatMessageCache$insertMessage$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SocketChatMessage) t).getIndex()), Long.valueOf(((SocketChatMessage) t2).getIndex()));
            }
        }))));
    }

    public final void insertMessages(String conversationSid, List<SocketChatMessage> newMessages) {
        Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
        Intrinsics.checkNotNullParameter(newMessages, "newMessages");
        BehaviorRelay<Map<String, List<SocketChatMessage>>> behaviorRelay = conversationSidToMessages;
        Map<String, List<SocketChatMessage>> value = behaviorRelay.getValue();
        Intrinsics.checkNotNull(value);
        Map<String, List<SocketChatMessage>> map = value;
        List<SocketChatMessage> listEmptyList = map.get(conversationSid);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        behaviorRelay.accept(MapsKt.plus(map, Tuples4.m3642to(conversationSid, CollectionsKt.sortedWith(CollectionsKt.plus((Collection) listEmptyList, (Iterable) newMessages), new Comparator() { // from class: com.robinhood.android.lib.conversations.ChatMessageCache$insertMessages$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SocketChatMessage) t).getIndex()), Long.valueOf(((SocketChatMessage) t2).getIndex()));
            }
        }))));
    }
}
