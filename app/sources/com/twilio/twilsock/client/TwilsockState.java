package com.twilio.twilsock.client;

import com.twilio.util.ErrorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* compiled from: Twilsock.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockState;", "", "()V", "Connected", "Connecting", "Disconnected", "Initializing", "Throttling", "WaitAndReconnect", "Lcom/twilio/twilsock/client/TwilsockState$Connected;", "Lcom/twilio/twilsock/client/TwilsockState$Connecting;", "Lcom/twilio/twilsock/client/TwilsockState$Disconnected;", "Lcom/twilio/twilsock/client/TwilsockState$Initializing;", "Lcom/twilio/twilsock/client/TwilsockState$Throttling;", "Lcom/twilio/twilsock/client/TwilsockState$WaitAndReconnect;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class TwilsockState {
    public /* synthetic */ TwilsockState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockState$Disconnected;", "Lcom/twilio/twilsock/client/TwilsockState;", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "(Lcom/twilio/util/ErrorInfo;)V", "getErrorInfo", "()Lcom/twilio/util/ErrorInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Disconnected extends TwilsockState {
        private final ErrorInfo errorInfo;

        public static /* synthetic */ Disconnected copy$default(Disconnected disconnected, ErrorInfo errorInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                errorInfo = disconnected.errorInfo;
            }
            return disconnected.copy(errorInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }

        public final Disconnected copy(ErrorInfo errorInfo) {
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            return new Disconnected(errorInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Disconnected) && Intrinsics.areEqual(this.errorInfo, ((Disconnected) other).errorInfo);
        }

        public int hashCode() {
            return this.errorInfo.hashCode();
        }

        public String toString() {
            return "Disconnected(errorInfo=" + this.errorInfo + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disconnected(ErrorInfo errorInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            this.errorInfo = errorInfo;
        }

        public final ErrorInfo getErrorInfo() {
            return this.errorInfo;
        }
    }

    private TwilsockState() {
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockState$Connecting;", "Lcom/twilio/twilsock/client/TwilsockState;", "()V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Connecting extends TwilsockState {
        public static final Connecting INSTANCE = new Connecting();

        private Connecting() {
            super(null);
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockState$Initializing;", "Lcom/twilio/twilsock/client/TwilsockState;", "()V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Initializing extends TwilsockState {
        public static final Initializing INSTANCE = new Initializing();

        private Initializing() {
            super(null);
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockState$Connected;", "Lcom/twilio/twilsock/client/TwilsockState;", "()V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Connected extends TwilsockState {
        public static final Connected INSTANCE = new Connected();

        private Connected() {
            super(null);
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001ø\u0001\u0000¢\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockState$WaitAndReconnect;", "Lcom/twilio/twilsock/client/TwilsockState;", "waitTime", "Lkotlin/time/Duration;", "(Lkotlin/time/Duration;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getWaitTime-FghU774", "()Lkotlin/time/Duration;", "component1", "component1-FghU774", "copy", "copy-BwNAW2A", "equals", "", "other", "", "hashCode", "", "toString", "", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class WaitAndReconnect extends TwilsockState {
        private final Duration waitTime;

        public /* synthetic */ WaitAndReconnect(Duration duration, DefaultConstructorMarker defaultConstructorMarker) {
            this(duration);
        }

        /* renamed from: copy-BwNAW2A$default, reason: not valid java name */
        public static /* synthetic */ WaitAndReconnect m27217copyBwNAW2A$default(WaitAndReconnect waitAndReconnect, Duration duration, int i, Object obj) {
            if ((i & 1) != 0) {
                duration = waitAndReconnect.waitTime;
            }
            return waitAndReconnect.m27219copyBwNAW2A(duration);
        }

        /* renamed from: component1-FghU774, reason: not valid java name and from getter */
        public final Duration getWaitTime() {
            return this.waitTime;
        }

        /* renamed from: copy-BwNAW2A, reason: not valid java name */
        public final WaitAndReconnect m27219copyBwNAW2A(Duration waitTime) {
            return new WaitAndReconnect(waitTime, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WaitAndReconnect) && Intrinsics.areEqual(this.waitTime, ((WaitAndReconnect) other).waitTime);
        }

        public int hashCode() {
            Duration duration = this.waitTime;
            if (duration == null) {
                return 0;
            }
            return Duration.m28747hashCodeimpl(duration.getRawValue());
        }

        public String toString() {
            return "WaitAndReconnect(waitTime=" + this.waitTime + ')';
        }

        private WaitAndReconnect(Duration duration) {
            super(null);
            this.waitTime = duration;
        }

        public /* synthetic */ WaitAndReconnect(Duration duration, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : duration, null);
        }

        /* renamed from: getWaitTime-FghU774, reason: not valid java name */
        public final Duration m27220getWaitTimeFghU774() {
            return this.waitTime;
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockState$Throttling;", "Lcom/twilio/twilsock/client/TwilsockState;", "waitTime", "Lkotlin/time/Duration;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getWaitTime-UwyO8pc", "()J", "J", "component1", "component1-UwyO8pc", "copy", "copy-LRDsOJo", "(J)Lcom/twilio/twilsock/client/TwilsockState$Throttling;", "equals", "", "other", "", "hashCode", "", "toString", "", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Throttling extends TwilsockState {
        private final long waitTime;

        public /* synthetic */ Throttling(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: copy-LRDsOJo$default, reason: not valid java name */
        public static /* synthetic */ Throttling m27213copyLRDsOJo$default(Throttling throttling, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = throttling.waitTime;
            }
            return throttling.m27215copyLRDsOJo(j);
        }

        /* renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
        public final long getWaitTime() {
            return this.waitTime;
        }

        /* renamed from: copy-LRDsOJo, reason: not valid java name */
        public final Throttling m27215copyLRDsOJo(long waitTime) {
            return new Throttling(waitTime, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Throttling) && Duration.m28733equalsimpl0(this.waitTime, ((Throttling) other).waitTime);
        }

        public int hashCode() {
            return Duration.m28747hashCodeimpl(this.waitTime);
        }

        public String toString() {
            return "Throttling(waitTime=" + ((Object) Duration.m28761toStringimpl(this.waitTime)) + ')';
        }

        private Throttling(long j) {
            super(null);
            this.waitTime = j;
        }

        /* renamed from: getWaitTime-UwyO8pc, reason: not valid java name */
        public final long m27216getWaitTimeUwyO8pc() {
            return this.waitTime;
        }
    }
}
