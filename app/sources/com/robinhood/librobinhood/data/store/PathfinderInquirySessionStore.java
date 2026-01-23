package com.robinhood.librobinhood.data.store;

import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PathfinderInquirySessionStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\b\b\u0000\u0010\r*\u00020\n2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\tR&\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PathfinderInquirySessionStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/store/StoreBundle;)V", WebsocketGatewayConstants.DATA_KEY, "", "Ljava/util/UUID;", "", "", "getItem", "Lcom/robinhood/librobinhood/data/store/PathfinderInquirySessionStore$SessionItem;", "T", "inquiryId", "key", "SessionItem", "lib-store-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PathfinderInquirySessionStore extends Store {
    private final Map<UUID, Map<String, Object>> data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathfinderInquirySessionStore(StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.data = new LinkedHashMap();
    }

    public final <T> SessionItem<T> getItem(UUID inquiryId, String key) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<UUID, Map<String, Object>> map = this.data;
        Map<String, Object> linkedHashMap = map.get(inquiryId);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            map.put(inquiryId, linkedHashMap);
        }
        return new SessionItem<>(linkedHashMap, key);
    }

    /* compiled from: PathfinderInquirySessionStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\nJ\r\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PathfinderInquirySessionStore$SessionItem;", "T", "", WebsocketGatewayConstants.DATA_KEY, "", "", "key", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "set", "", "value", "(Ljava/lang/Object;)V", "remove", "get", "()Ljava/lang/Object;", "lib-store-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SessionItem<T> {
        private final Map<String, Object> data;
        private final String key;

        public SessionItem(Map<String, Object> data, String key) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(key, "key");
            this.data = data;
            this.key = key;
        }

        public final void set(T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.data.put(this.key, value);
        }

        public final void remove() {
            this.data.remove(this.key);
        }

        public final T get() {
            return (T) this.data.get(this.key);
        }
    }
}
