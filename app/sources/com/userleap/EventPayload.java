package com.userleap;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010)\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017¨\u0006."}, m3636d2 = {"Lcom/userleap/EventPayload;", "", "event", "", "userId", "partnerAnonymousId", "properties", "", "callback", "Lkotlin/Function1;", "Lcom/userleap/SurveyState;", "", "shouldShowSurveyCallback", "Lkotlin/Function0;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "setCallback", "(Lkotlin/jvm/functions/Function1;)V", "getEvent", "()Ljava/lang/String;", "setEvent", "(Ljava/lang/String;)V", "getPartnerAnonymousId", "setPartnerAnonymousId", "getProperties", "()Ljava/util/Map;", "setProperties", "(Ljava/util/Map;)V", "getShouldShowSurveyCallback", "()Lkotlin/jvm/functions/Function0;", "getUserId", "setUserId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class EventPayload {
    private Function1<? super SurveyState, Unit> callback;
    private String event;
    private String partnerAnonymousId;
    private Map<String, ? extends Object> properties;
    private final Function0<Boolean> shouldShowSurveyCallback;
    private String userId;

    public EventPayload(String event, String str, String str2, Map<String, ? extends Object> map, Function1<? super SurveyState, Unit> function1, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.event = event;
        this.userId = str;
        this.partnerAnonymousId = str2;
        this.properties = map;
        this.callback = function1;
        this.shouldShowSurveyCallback = function0;
    }

    public static /* synthetic */ EventPayload copy$default(EventPayload eventPayload, String str, String str2, String str3, Map map, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventPayload.event;
        }
        if ((i & 2) != 0) {
            str2 = eventPayload.userId;
        }
        if ((i & 4) != 0) {
            str3 = eventPayload.partnerAnonymousId;
        }
        if ((i & 8) != 0) {
            map = eventPayload.properties;
        }
        if ((i & 16) != 0) {
            function1 = eventPayload.callback;
        }
        if ((i & 32) != 0) {
            function0 = eventPayload.shouldShowSurveyCallback;
        }
        Function1 function12 = function1;
        Function0 function02 = function0;
        return eventPayload.copy(str, str2, str3, map, function12, function02);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPartnerAnonymousId() {
        return this.partnerAnonymousId;
    }

    public final Map<String, Object> component4() {
        return this.properties;
    }

    public final Function1<SurveyState, Unit> component5() {
        return this.callback;
    }

    public final Function0<Boolean> component6() {
        return this.shouldShowSurveyCallback;
    }

    public final EventPayload copy(String event, String userId, String partnerAnonymousId, Map<String, ? extends Object> properties, Function1<? super SurveyState, Unit> callback, Function0<Boolean> shouldShowSurveyCallback) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new EventPayload(event, userId, partnerAnonymousId, properties, callback, shouldShowSurveyCallback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventPayload)) {
            return false;
        }
        EventPayload eventPayload = (EventPayload) other;
        return Intrinsics.areEqual(this.event, eventPayload.event) && Intrinsics.areEqual(this.userId, eventPayload.userId) && Intrinsics.areEqual(this.partnerAnonymousId, eventPayload.partnerAnonymousId) && Intrinsics.areEqual(this.properties, eventPayload.properties) && Intrinsics.areEqual(this.callback, eventPayload.callback) && Intrinsics.areEqual(this.shouldShowSurveyCallback, eventPayload.shouldShowSurveyCallback);
    }

    public final Function1<SurveyState, Unit> getCallback() {
        return this.callback;
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getPartnerAnonymousId() {
        return this.partnerAnonymousId;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public final Function0<Boolean> getShouldShowSurveyCallback() {
        return this.shouldShowSurveyCallback;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.event.hashCode() * 31;
        String str = this.userId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.partnerAnonymousId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, ? extends Object> map = this.properties;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Function1<? super SurveyState, Unit> function1 = this.callback;
        int iHashCode5 = (iHashCode4 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function0<Boolean> function0 = this.shouldShowSurveyCallback;
        return iHashCode5 + (function0 != null ? function0.hashCode() : 0);
    }

    public final void setCallback(Function1<? super SurveyState, Unit> function1) {
        this.callback = function1;
    }

    public final void setEvent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.event = str;
    }

    public final void setPartnerAnonymousId(String str) {
        this.partnerAnonymousId = str;
    }

    public final void setProperties(Map<String, ? extends Object> map) {
        this.properties = map;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return "EventPayload(event=" + this.event + ", userId=" + this.userId + ", partnerAnonymousId=" + this.partnerAnonymousId + ", properties=" + this.properties + ", callback=" + this.callback + ", shouldShowSurveyCallback=" + this.shouldShowSurveyCallback + ')';
    }

    public /* synthetic */ EventPayload(String str, String str2, String str3, Map map, Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : function1, (i & 32) != 0 ? null : function0);
    }
}
