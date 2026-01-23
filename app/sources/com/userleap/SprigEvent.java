package com.userleap;

import androidx.annotation.Keep;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import sprig.p544b.C48991a;

@Keep
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m3636d2 = {"Lcom/userleap/SprigEvent;", "", "Lcom/userleap/EventName;", "component1", "Lorg/json/JSONObject;", "component2", "name", WebsocketGatewayConstants.DATA_KEY, "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/userleap/EventName;", "getName", "()Lcom/userleap/EventName;", "Lorg/json/JSONObject;", "getData", "()Lorg/json/JSONObject;", "<init>", "(Lcom/userleap/EventName;Lorg/json/JSONObject;)V", "Companion", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* loaded from: classes11.dex */
public final /* data */ class SprigEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final JSONObject data;
    private final EventName name;

    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\t"}, m3636d2 = {"Lcom/userleap/SprigEvent$a;", "", "", "name", "event", "Lcom/userleap/SprigEvent;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: com.userleap.SprigEvent$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SprigEvent m3205a(String name, String event) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(event, "event");
            EventName eventNameM3204a = EventName.INSTANCE.m3204a(name);
            if (eventNameM3204a != null) {
                return new SprigEvent(eventNameM3204a, C48991a.m4023b(event));
            }
            return null;
        }
    }

    public SprigEvent(EventName name, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.data = jSONObject;
    }

    public static /* synthetic */ SprigEvent copy$default(SprigEvent sprigEvent, EventName eventName, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            eventName = sprigEvent.name;
        }
        if ((i & 2) != 0) {
            jSONObject = sprigEvent.data;
        }
        return sprigEvent.copy(eventName, jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final EventName getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final JSONObject getData() {
        return this.data;
    }

    public final SprigEvent copy(EventName name, JSONObject data) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new SprigEvent(name, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SprigEvent)) {
            return false;
        }
        SprigEvent sprigEvent = (SprigEvent) other;
        return this.name == sprigEvent.name && Intrinsics.areEqual(this.data, sprigEvent.data);
    }

    public final JSONObject getData() {
        return this.data;
    }

    public final EventName getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        JSONObject jSONObject = this.data;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "SprigEvent(name=" + this.name + ", data=" + this.data + ')';
    }
}
