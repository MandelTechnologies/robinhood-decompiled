package com.robinhood.lib.transfers.nonoriginated;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonOriginatedAccountInfoViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState;", "", "Loading", "Error", "Loaded", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState$Error;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState$Loaded;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState$Loading;", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface NonOriginatedAccountInfoViewState {

    /* compiled from: NonOriginatedAccountInfoViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState$Loading;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements NonOriginatedAccountInfoViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1806619497;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: NonOriginatedAccountInfoViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState$Error;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements NonOriginatedAccountInfoViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 1086732323;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: NonOriginatedAccountInfoViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState$Loaded;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState;", "state", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoState;", "<init>", "(Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoState;)V", "getState", "()Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements NonOriginatedAccountInfoViewState {
        public static final int $stable = 8;
        private final NonOriginatedAccountInfoState state;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, NonOriginatedAccountInfoState nonOriginatedAccountInfoState, int i, Object obj) {
            if ((i & 1) != 0) {
                nonOriginatedAccountInfoState = loaded.state;
            }
            return loaded.copy(nonOriginatedAccountInfoState);
        }

        /* renamed from: component1, reason: from getter */
        public final NonOriginatedAccountInfoState getState() {
            return this.state;
        }

        public final Loaded copy(NonOriginatedAccountInfoState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Loaded(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.state, ((Loaded) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Loaded(state=" + this.state + ")";
        }

        public Loaded(NonOriginatedAccountInfoState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final NonOriginatedAccountInfoState getState() {
            return this.state;
        }
    }
}
