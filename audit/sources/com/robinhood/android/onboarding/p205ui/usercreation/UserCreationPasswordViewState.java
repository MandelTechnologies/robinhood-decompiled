package com.robinhood.android.onboarding.p205ui.usercreation;

import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationPasswordViewState4;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationPasswordViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState;", "", "<init>", "()V", "continueEnabled", "", "getContinueEnabled", "()Z", "Initial", "Typing", "Loading", "Result", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState$Initial;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState$Loading;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState$Result;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState$Typing;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class UserCreationPasswordViewState {
    public static final int $stable = 0;

    public /* synthetic */ UserCreationPasswordViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UserCreationPasswordViewState() {
    }

    /* compiled from: UserCreationPasswordViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState$Initial;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Initial extends UserCreationPasswordViewState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        public boolean equals(Object other) {
            return this == other || (other instanceof Initial);
        }

        public int hashCode() {
            return -1504848620;
        }

        public String toString() {
            return "Initial";
        }

        private Initial() {
            super(null);
        }
    }

    /* compiled from: UserCreationPasswordViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState$Typing;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState;", "validationState", "Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState;", "<init>", "(Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState;)V", "getValidationState", "()Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Typing extends UserCreationPasswordViewState {
        public static final int $stable = 0;
        private final UserCreationPasswordViewState4 validationState;

        public static /* synthetic */ Typing copy$default(Typing typing, UserCreationPasswordViewState4 userCreationPasswordViewState4, int i, Object obj) {
            if ((i & 1) != 0) {
                userCreationPasswordViewState4 = typing.validationState;
            }
            return typing.copy(userCreationPasswordViewState4);
        }

        /* renamed from: component1, reason: from getter */
        public final UserCreationPasswordViewState4 getValidationState() {
            return this.validationState;
        }

        public final Typing copy(UserCreationPasswordViewState4 validationState) {
            Intrinsics.checkNotNullParameter(validationState, "validationState");
            return new Typing(validationState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Typing) && Intrinsics.areEqual(this.validationState, ((Typing) other).validationState);
        }

        public int hashCode() {
            return this.validationState.hashCode();
        }

        public String toString() {
            return "Typing(validationState=" + this.validationState + ")";
        }

        public final UserCreationPasswordViewState4 getValidationState() {
            return this.validationState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Typing(UserCreationPasswordViewState4 validationState) {
            super(null);
            Intrinsics.checkNotNullParameter(validationState, "validationState");
            this.validationState = validationState;
        }
    }

    /* compiled from: UserCreationPasswordViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState$Loading;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends UserCreationPasswordViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1178427148;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: UserCreationPasswordViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState$Result;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordViewState;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Result extends UserCreationPasswordViewState {
        public static final int $stable = 8;
        private final UiEvent<UserCreationPasswordViewState3> event;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Result copy$default(Result result, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = result.event;
            }
            return result.copy(uiEvent);
        }

        public final UiEvent<UserCreationPasswordViewState3> component1() {
            return this.event;
        }

        public final Result copy(UiEvent<UserCreationPasswordViewState3> event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return new Result(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && Intrinsics.areEqual(this.event, ((Result) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "Result(event=" + this.event + ")";
        }

        public final UiEvent<UserCreationPasswordViewState3> getEvent() {
            return this.event;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Result(UiEvent<UserCreationPasswordViewState3> event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }
    }

    public final boolean getContinueEnabled() {
        Typing typing = this instanceof Typing ? (Typing) this : null;
        return Intrinsics.areEqual(typing != null ? typing.getValidationState() : null, UserCreationPasswordViewState4.Acceptable.INSTANCE);
    }
}
