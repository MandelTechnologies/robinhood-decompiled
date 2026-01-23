package com.robinhood.android.onboarding.p205ui.usercreation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationFullNameViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameEvent;", "", "<init>", "()V", "UserCreationSuccessEvent", "UserCreationErrorEvent", "UserCreationEvent", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameEvent$UserCreationErrorEvent;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameEvent$UserCreationEvent;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameEvent$UserCreationSuccessEvent;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameEvent, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class UserCreationFullNameViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ UserCreationFullNameViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: UserCreationFullNameViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameEvent$UserCreationSuccessEvent;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameEvent$UserCreationSuccessEvent */
    public static final /* data */ class UserCreationSuccessEvent extends UserCreationFullNameViewState2 {
        public static final int $stable = 0;
        public static final UserCreationSuccessEvent INSTANCE = new UserCreationSuccessEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof UserCreationSuccessEvent);
        }

        public int hashCode() {
            return 144856418;
        }

        public String toString() {
            return "UserCreationSuccessEvent";
        }

        private UserCreationSuccessEvent() {
            super(null);
        }
    }

    private UserCreationFullNameViewState2() {
    }

    /* compiled from: UserCreationFullNameViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameEvent$UserCreationErrorEvent;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameEvent$UserCreationErrorEvent, reason: from toString */
    public static final /* data */ class UserCreationErrorEvent extends UserCreationFullNameViewState2 {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ UserCreationErrorEvent copy$default(UserCreationErrorEvent userCreationErrorEvent, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = userCreationErrorEvent.error;
            }
            return userCreationErrorEvent.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final UserCreationErrorEvent copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new UserCreationErrorEvent(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserCreationErrorEvent) && Intrinsics.areEqual(this.error, ((UserCreationErrorEvent) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "UserCreationErrorEvent(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserCreationErrorEvent(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: UserCreationFullNameViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameEvent$UserCreationEvent;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationFullNameEvent$UserCreationEvent */
    public static final /* data */ class UserCreationEvent extends UserCreationFullNameViewState2 {
        public static final int $stable = 0;
        public static final UserCreationEvent INSTANCE = new UserCreationEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof UserCreationEvent);
        }

        public int hashCode() {
            return 954085359;
        }

        public String toString() {
            return "UserCreationEvent";
        }

        private UserCreationEvent() {
            super(null);
        }
    }
}
