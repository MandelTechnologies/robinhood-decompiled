package com.robinhood.android.snacks.p257ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnacksSubscribeViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState;", "", "email", "", "status", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status;)V", "getEmail", "()Ljava/lang/String;", "getStatus", "()Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SnacksSubscribeViewState {
    public static final int $stable = 0;
    private final String email;
    private final Status status;

    /* JADX WARN: Multi-variable type inference failed */
    public SnacksSubscribeViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SnacksSubscribeViewState copy$default(SnacksSubscribeViewState snacksSubscribeViewState, String str, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            str = snacksSubscribeViewState.email;
        }
        if ((i & 2) != 0) {
            status = snacksSubscribeViewState.status;
        }
        return snacksSubscribeViewState.copy(str, status);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final SnacksSubscribeViewState copy(String email, Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new SnacksSubscribeViewState(email, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnacksSubscribeViewState)) {
            return false;
        }
        SnacksSubscribeViewState snacksSubscribeViewState = (SnacksSubscribeViewState) other;
        return Intrinsics.areEqual(this.email, snacksSubscribeViewState.email) && Intrinsics.areEqual(this.status, snacksSubscribeViewState.status);
    }

    public int hashCode() {
        String str = this.email;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "SnacksSubscribeViewState(email=" + this.email + ", status=" + this.status + ")";
    }

    public SnacksSubscribeViewState(String str, Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.email = str;
        this.status = status;
    }

    public final String getEmail() {
        return this.email;
    }

    public /* synthetic */ SnacksSubscribeViewState(String str, Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? Status.Loading.INSTANCE : status);
    }

    public final Status getStatus() {
        return this.status;
    }

    /* compiled from: SnacksSubscribeViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status;", "", "<init>", "()V", "Loading", "Subscribed", "AlreadySubscribed", "Failure", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status$AlreadySubscribed;", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status$Failure;", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status$Loading;", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status$Subscribed;", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Status {
        public static final int $stable = 0;

        public /* synthetic */ Status(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: SnacksSubscribeViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status$Loading;", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status;", "<init>", "()V", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends Status {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private Status() {
        }

        /* compiled from: SnacksSubscribeViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status$Subscribed;", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status;", "<init>", "()V", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Subscribed extends Status {
            public static final int $stable = 0;
            public static final Subscribed INSTANCE = new Subscribed();

            private Subscribed() {
                super(null);
            }
        }

        /* compiled from: SnacksSubscribeViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status$AlreadySubscribed;", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status;", "<init>", "()V", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AlreadySubscribed extends Status {
            public static final int $stable = 0;
            public static final AlreadySubscribed INSTANCE = new AlreadySubscribed();

            private AlreadySubscribed() {
                super(null);
            }
        }

        /* compiled from: SnacksSubscribeViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status$Failure;", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState$Status;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Failure extends Status {
            public static final int $stable = 8;
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }
}
