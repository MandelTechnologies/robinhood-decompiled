package com.robinhood.shared.store.chat.common;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.jakewharton.rxrelay2.Relay;
import com.robinhood.shared.models.chat.common.UnsentInput;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.Some;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChatCache.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\b\"\b\b\u0000\u0010\n*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\b2\u0006\u0010\u000e\u001a\u00020\u0006J \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00100\b2\u0006\u0010\u000e\u001a\u00020\u0006R,\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/store/chat/common/ChatCache;", "", "<init>", "()V", "cachedData", "", "Ljava/util/UUID;", "", "Lcom/robinhood/shared/store/chat/common/ChatCache$Item;", "getItem", "T", "issueId", "key", "getInputDraftItem", "id", "getUnsentInputsItem", "", "Lcom/robinhood/shared/models/chat/common/UnsentInput;", "Item", "lib-store-chat-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ChatCache {
    private final Map<UUID, Map<String, Item<Object>>> cachedData = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> Item<T> getItem(UUID issueId, String key) {
        Map<UUID, Map<String, Item<Object>>> map = this.cachedData;
        Object linkedHashMap = map.get(issueId);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            map.put(issueId, linkedHashMap);
        }
        Map map2 = (Map) linkedHashMap;
        Object item = map2.get(key);
        if (item == null) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            item = new Item(defaultConstructorMarker, 1, defaultConstructorMarker);
            map2.put(key, item);
        }
        return (Item) item;
    }

    /* compiled from: ChatCache.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0011\u001a\u00020\u000fJ\r\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0013R\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u000b*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/store/chat/common/ChatCache$Item;", "T", "", WebsocketGatewayConstants.DATA_KEY, "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "lock", "relay", "Lcom/jakewharton/rxrelay2/Relay;", "Lcom/robinhood/utils/Optional;", "kotlin.jvm.PlatformType", "changes", "Lio/reactivex/Observable;", "set", "", "value", "remove", "get", "()Ljava/lang/Object;", "lib-store-chat-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Item<T> {
        private T data;
        private final Object lock;
        private final Relay<Optional<T>> relay;

        /* JADX WARN: Illegal instructions before constructor call */
        public Item() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            this(defaultConstructorMarker, 1, defaultConstructorMarker);
        }

        public Item(T t) {
            this.data = t;
            this.lock = new Object();
            Relay<T> serialized = BehaviorRelay.createDefault(Optional3.asOptional(t)).toSerialized();
            Intrinsics.checkNotNullExpressionValue(serialized, "toSerialized(...)");
            this.relay = serialized;
        }

        public /* synthetic */ Item(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj);
        }

        public final Observable<Optional<T>> changes() {
            Observable<Optional<T>> observableHide = this.relay.hide();
            Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
            return observableHide;
        }

        public final void set(T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            synchronized (this.lock) {
                this.data = value;
                Unit unit = Unit.INSTANCE;
            }
            this.relay.accept(new Some(value));
        }

        public final void remove() {
            synchronized (this.lock) {
                this.data = null;
                Unit unit = Unit.INSTANCE;
            }
            this.relay.accept(Optional2.INSTANCE);
        }

        public final T get() {
            T t;
            synchronized (this.lock) {
                t = this.data;
            }
            return t;
        }
    }

    public final Item<String> getInputDraftItem(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return getItem(id, "key_chat_input_draft");
    }

    public final Item<Map<String, UnsentInput>> getUnsentInputsItem(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return getItem(id, "key_chat_unsent_inputs");
    }
}
