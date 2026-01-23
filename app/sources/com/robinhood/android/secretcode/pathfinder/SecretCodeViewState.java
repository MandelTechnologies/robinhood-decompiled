package com.robinhood.android.secretcode.pathfinder;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecretCodeViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/secretcode/pathfinder/SecretCodeViewState;", "", "state", "Lcom/robinhood/android/secretcode/pathfinder/SecretCodeViewState$State;", "<init>", "(Lcom/robinhood/android/secretcode/pathfinder/SecretCodeViewState$State;)V", "showLoading", "", "getShowLoading", "()Z", "showError", "getShowError", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "State", "feature-secret-code_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SecretCodeViewState {
    public static final int $stable = 0;
    private final boolean showError;
    private final boolean showLoading;
    private final State state;

    /* JADX WARN: Multi-variable type inference failed */
    public SecretCodeViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final State getState() {
        return this.state;
    }

    public static /* synthetic */ SecretCodeViewState copy$default(SecretCodeViewState secretCodeViewState, State state, int i, Object obj) {
        if ((i & 1) != 0) {
            state = secretCodeViewState.state;
        }
        return secretCodeViewState.copy(state);
    }

    public final SecretCodeViewState copy(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new SecretCodeViewState(state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SecretCodeViewState) && Intrinsics.areEqual(this.state, ((SecretCodeViewState) other).state);
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        return "SecretCodeViewState(state=" + this.state + ")";
    }

    public SecretCodeViewState(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.showLoading = state instanceof State.Loading;
        this.showError = state instanceof State.Failed;
    }

    public /* synthetic */ SecretCodeViewState(State state, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? State.Loading.INSTANCE : state);
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    /* compiled from: SecretCodeViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/secretcode/pathfinder/SecretCodeViewState$State;", "", "<init>", "()V", "Loading", "Failed", "Lcom/robinhood/android/secretcode/pathfinder/SecretCodeViewState$State$Failed;", "Lcom/robinhood/android/secretcode/pathfinder/SecretCodeViewState$State$Loading;", "feature-secret-code_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: SecretCodeViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/secretcode/pathfinder/SecretCodeViewState$State$Loading;", "Lcom/robinhood/android/secretcode/pathfinder/SecretCodeViewState$State;", "<init>", "()V", "feature-secret-code_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends State {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private State() {
        }

        /* compiled from: SecretCodeViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/secretcode/pathfinder/SecretCodeViewState$State$Failed;", "Lcom/robinhood/android/secretcode/pathfinder/SecretCodeViewState$State;", "<init>", "()V", "feature-secret-code_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Failed extends State {
            public static final int $stable = 0;
            public static final Failed INSTANCE = new Failed();

            private Failed() {
                super(null);
            }
        }
    }
}
