package com.twilio.twilsock.client;

import com.twilio.util.ErrorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* compiled from: Twilsock.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\r\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent;", "", "()V", "OnConnect", "OnDisconnect", "OnFatalError", "OnInitMessageReceived", "OnMessageReceived", "OnNetworkBecameReachable", "OnNetworkBecameUnreachable", "OnNonFatalError", "OnSendRequest", "OnTimeout", "OnTooManyRequests", "OnTransportConnected", "OnUpdateToken", "Lcom/twilio/twilsock/client/TwilsockEvent$OnConnect;", "Lcom/twilio/twilsock/client/TwilsockEvent$OnDisconnect;", "Lcom/twilio/twilsock/client/TwilsockEvent$OnFatalError;", "Lcom/twilio/twilsock/client/TwilsockEvent$OnInitMessageReceived;", "Lcom/twilio/twilsock/client/TwilsockEvent$OnMessageReceived;", "Lcom/twilio/twilsock/client/TwilsockEvent$OnNetworkBecameReachable;", "Lcom/twilio/twilsock/client/TwilsockEvent$OnNetworkBecameUnreachable;", "Lcom/twilio/twilsock/client/TwilsockEvent$OnNonFatalError;", "Lcom/twilio/twilsock/client/TwilsockEvent$OnSendRequest;", "Lcom/twilio/twilsock/client/TwilsockEvent$OnTimeout;", "Lcom/twilio/twilsock/client/TwilsockEvent$OnTooManyRequests;", "Lcom/twilio/twilsock/client/TwilsockEvent$OnTransportConnected;", "Lcom/twilio/twilsock/client/TwilsockEvent$OnUpdateToken;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
abstract class TwilsockEvent {
    public /* synthetic */ TwilsockEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnConnect;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "()V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class OnConnect extends TwilsockEvent {
        public static final OnConnect INSTANCE = new OnConnect();

        private OnConnect() {
            super(null);
        }
    }

    private TwilsockEvent() {
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnDisconnect;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "()V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class OnDisconnect extends TwilsockEvent {
        public static final OnDisconnect INSTANCE = new OnDisconnect();

        private OnDisconnect() {
            super(null);
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnUpdateToken;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "token", "", "request", "Lcom/twilio/twilsock/client/TwilsockRequest;", "(Ljava/lang/String;Lcom/twilio/twilsock/client/TwilsockRequest;)V", "getRequest", "()Lcom/twilio/twilsock/client/TwilsockRequest;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class OnUpdateToken extends TwilsockEvent {
        private final TwilsockRequest request;
        private final String token;

        public static /* synthetic */ OnUpdateToken copy$default(OnUpdateToken onUpdateToken, String str, TwilsockRequest twilsockRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onUpdateToken.token;
            }
            if ((i & 2) != 0) {
                twilsockRequest = onUpdateToken.request;
            }
            return onUpdateToken.copy(str, twilsockRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        /* renamed from: component2, reason: from getter */
        public final TwilsockRequest getRequest() {
            return this.request;
        }

        public final OnUpdateToken copy(String token, TwilsockRequest request) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(request, "request");
            return new OnUpdateToken(token, request);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnUpdateToken)) {
                return false;
            }
            OnUpdateToken onUpdateToken = (OnUpdateToken) other;
            return Intrinsics.areEqual(this.token, onUpdateToken.token) && Intrinsics.areEqual(this.request, onUpdateToken.request);
        }

        public int hashCode() {
            return (this.token.hashCode() * 31) + this.request.hashCode();
        }

        public String toString() {
            return "OnUpdateToken(token=" + this.token + ", request=" + this.request + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUpdateToken(String token, TwilsockRequest request) {
            super(null);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(request, "request");
            this.token = token;
            this.request = request;
        }

        public final TwilsockRequest getRequest() {
            return this.request;
        }

        public final String getToken() {
            return this.token;
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnSendRequest;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "request", "Lcom/twilio/twilsock/client/TwilsockRequest;", "(Lcom/twilio/twilsock/client/TwilsockRequest;)V", "getRequest", "()Lcom/twilio/twilsock/client/TwilsockRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class OnSendRequest extends TwilsockEvent {
        private final TwilsockRequest request;

        public static /* synthetic */ OnSendRequest copy$default(OnSendRequest onSendRequest, TwilsockRequest twilsockRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                twilsockRequest = onSendRequest.request;
            }
            return onSendRequest.copy(twilsockRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final TwilsockRequest getRequest() {
            return this.request;
        }

        public final OnSendRequest copy(TwilsockRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new OnSendRequest(request);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnSendRequest) && Intrinsics.areEqual(this.request, ((OnSendRequest) other).request);
        }

        public int hashCode() {
            return this.request.hashCode();
        }

        public String toString() {
            return "OnSendRequest(request=" + this.request + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSendRequest(TwilsockRequest request) {
            super(null);
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
        }

        public final TwilsockRequest getRequest() {
            return this.request;
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnTransportConnected;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "()V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class OnTransportConnected extends TwilsockEvent {
        public static final OnTransportConnected INSTANCE = new OnTransportConnected();

        private OnTransportConnected() {
            super(null);
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnInitMessageReceived;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "()V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class OnInitMessageReceived extends TwilsockEvent {
        public static final OnInitMessageReceived INSTANCE = new OnInitMessageReceived();

        private OnInitMessageReceived() {
            super(null);
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnTooManyRequests;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "waitTime", "Lkotlin/time/Duration;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getWaitTime-UwyO8pc", "()J", "J", "component1", "component1-UwyO8pc", "copy", "copy-LRDsOJo", "(J)Lcom/twilio/twilsock/client/TwilsockEvent$OnTooManyRequests;", "equals", "", "other", "", "hashCode", "", "toString", "", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class OnTooManyRequests extends TwilsockEvent {
        private final long waitTime;

        public /* synthetic */ OnTooManyRequests(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: copy-LRDsOJo$default, reason: not valid java name */
        public static /* synthetic */ OnTooManyRequests m27201copyLRDsOJo$default(OnTooManyRequests onTooManyRequests, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = onTooManyRequests.waitTime;
            }
            return onTooManyRequests.m27203copyLRDsOJo(j);
        }

        /* renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
        public final long getWaitTime() {
            return this.waitTime;
        }

        /* renamed from: copy-LRDsOJo, reason: not valid java name */
        public final OnTooManyRequests m27203copyLRDsOJo(long waitTime) {
            return new OnTooManyRequests(waitTime, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnTooManyRequests) && Duration.m28733equalsimpl0(this.waitTime, ((OnTooManyRequests) other).waitTime);
        }

        public int hashCode() {
            return Duration.m28747hashCodeimpl(this.waitTime);
        }

        public String toString() {
            return "OnTooManyRequests(waitTime=" + ((Object) Duration.m28761toStringimpl(this.waitTime)) + ')';
        }

        private OnTooManyRequests(long j) {
            super(null);
            this.waitTime = j;
        }

        /* renamed from: getWaitTime-UwyO8pc, reason: not valid java name */
        public final long m27204getWaitTimeUwyO8pc() {
            return this.waitTime;
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnNetworkBecameReachable;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "()V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class OnNetworkBecameReachable extends TwilsockEvent {
        public static final OnNetworkBecameReachable INSTANCE = new OnNetworkBecameReachable();

        private OnNetworkBecameReachable() {
            super(null);
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnNetworkBecameUnreachable;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "()V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class OnNetworkBecameUnreachable extends TwilsockEvent {
        public static final OnNetworkBecameUnreachable INSTANCE = new OnNetworkBecameUnreachable();

        private OnNetworkBecameUnreachable() {
            super(null);
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnTimeout;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "()V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class OnTimeout extends TwilsockEvent {
        public static final OnTimeout INSTANCE = new OnTimeout();

        private OnTimeout() {
            super(null);
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnNonFatalError;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "(Lcom/twilio/util/ErrorInfo;)V", "getErrorInfo", "()Lcom/twilio/util/ErrorInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class OnNonFatalError extends TwilsockEvent {
        private final ErrorInfo errorInfo;

        public static /* synthetic */ OnNonFatalError copy$default(OnNonFatalError onNonFatalError, ErrorInfo errorInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                errorInfo = onNonFatalError.errorInfo;
            }
            return onNonFatalError.copy(errorInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        public final OnNonFatalError copy(ErrorInfo errorInfo) {
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            return new OnNonFatalError(errorInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnNonFatalError) && Intrinsics.areEqual(this.errorInfo, ((OnNonFatalError) other).errorInfo);
        }

        public int hashCode() {
            return this.errorInfo.hashCode();
        }

        public String toString() {
            return "OnNonFatalError(errorInfo=" + this.errorInfo + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnNonFatalError(ErrorInfo errorInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            this.errorInfo = errorInfo;
        }

        public final ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnFatalError;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "(Lcom/twilio/util/ErrorInfo;)V", "getErrorInfo", "()Lcom/twilio/util/ErrorInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class OnFatalError extends TwilsockEvent {
        private final ErrorInfo errorInfo;

        public static /* synthetic */ OnFatalError copy$default(OnFatalError onFatalError, ErrorInfo errorInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                errorInfo = onFatalError.errorInfo;
            }
            return onFatalError.copy(errorInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        public final OnFatalError copy(ErrorInfo errorInfo) {
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            return new OnFatalError(errorInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnFatalError) && Intrinsics.areEqual(this.errorInfo, ((OnFatalError) other).errorInfo);
        }

        public int hashCode() {
            return this.errorInfo.hashCode();
        }

        public String toString() {
            return "OnFatalError(errorInfo=" + this.errorInfo + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFatalError(ErrorInfo errorInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            this.errorInfo = errorInfo;
        }

        public final ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockEvent$OnMessageReceived;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "message", "Lcom/twilio/twilsock/client/TwilsockMessage;", "(Lcom/twilio/twilsock/client/TwilsockMessage;)V", "getMessage", "()Lcom/twilio/twilsock/client/TwilsockMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class OnMessageReceived extends TwilsockEvent {
        private final TwilsockMessage message;

        public static /* synthetic */ OnMessageReceived copy$default(OnMessageReceived onMessageReceived, TwilsockMessage twilsockMessage, int i, Object obj) {
            if ((i & 1) != 0) {
                twilsockMessage = onMessageReceived.message;
            }
            return onMessageReceived.copy(twilsockMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final TwilsockMessage getMessage() {
            return this.message;
        }

        public final OnMessageReceived copy(TwilsockMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new OnMessageReceived(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnMessageReceived) && Intrinsics.areEqual(this.message, ((OnMessageReceived) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "OnMessageReceived(message=" + this.message + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnMessageReceived(TwilsockMessage message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final TwilsockMessage getMessage() {
            return this.message;
        }
    }
}
