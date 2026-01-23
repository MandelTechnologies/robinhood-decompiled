package com.robinhood.android.transfers.pathfinder.p269ui.transferfunds;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderTransferFundsViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState;", "", "state", "Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState$State;", "<init>", "(Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState$State;)V", "getState", "()Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState$State;", "showLoadingView", "", "getShowLoadingView", "()Z", "showErrorView", "getShowErrorView", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "State", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PathfinderTransferFundsViewState {
    public static final int $stable = 0;
    private final boolean showErrorView;
    private final boolean showLoadingView;
    private final State state;

    /* JADX WARN: Multi-variable type inference failed */
    public PathfinderTransferFundsViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PathfinderTransferFundsViewState copy$default(PathfinderTransferFundsViewState pathfinderTransferFundsViewState, State state, int i, Object obj) {
        if ((i & 1) != 0) {
            state = pathfinderTransferFundsViewState.state;
        }
        return pathfinderTransferFundsViewState.copy(state);
    }

    /* renamed from: component1, reason: from getter */
    public final State getState() {
        return this.state;
    }

    public final PathfinderTransferFundsViewState copy(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new PathfinderTransferFundsViewState(state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PathfinderTransferFundsViewState) && Intrinsics.areEqual(this.state, ((PathfinderTransferFundsViewState) other).state);
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        return "PathfinderTransferFundsViewState(state=" + this.state + ")";
    }

    public PathfinderTransferFundsViewState(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.showLoadingView = Intrinsics.areEqual(state, State.Loading.INSTANCE);
        this.showErrorView = Intrinsics.areEqual(state, State.Failed.INSTANCE);
    }

    public /* synthetic */ PathfinderTransferFundsViewState(State state, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? State.Loading.INSTANCE : state);
    }

    public final State getState() {
        return this.state;
    }

    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    public final boolean getShowErrorView() {
        return this.showErrorView;
    }

    /* compiled from: PathfinderTransferFundsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState$State;", "", "<init>", "()V", "Loading", "Failed", "Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState$State$Failed;", "Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState$State$Loading;", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: PathfinderTransferFundsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState$State$Loading;", "Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState$State;", "<init>", "()V", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends State {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private State() {
        }

        /* compiled from: PathfinderTransferFundsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState$State$Failed;", "Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState$State;", "<init>", "()V", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Failed extends State {
            public static final int $stable = 0;
            public static final Failed INSTANCE = new Failed();

            private Failed() {
                super(null);
            }
        }
    }
}
