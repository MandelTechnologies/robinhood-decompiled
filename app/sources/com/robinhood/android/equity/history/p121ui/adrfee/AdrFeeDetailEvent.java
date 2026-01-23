package com.robinhood.android.equity.history.p121ui.adrfee;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdrFeeDetailEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailEvent;", "", "FetchResponseError", "NavigateToInstrumentDetailFragment", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailEvent$FetchResponseError;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailEvent$NavigateToInstrumentDetailFragment;", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface AdrFeeDetailEvent {

    /* compiled from: AdrFeeDetailEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailEvent$FetchResponseError;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FetchResponseError implements AdrFeeDetailEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ FetchResponseError copy$default(FetchResponseError fetchResponseError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = fetchResponseError.throwable;
            }
            return fetchResponseError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final FetchResponseError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new FetchResponseError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FetchResponseError) && Intrinsics.areEqual(this.throwable, ((FetchResponseError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "FetchResponseError(throwable=" + this.throwable + ")";
        }

        public FetchResponseError(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: AdrFeeDetailEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailEvent$NavigateToInstrumentDetailFragment;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailEvent;", "instrumentSymbol", "", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInstrumentSymbol", "()Ljava/lang/String;", "getAccountNumber", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToInstrumentDetailFragment implements AdrFeeDetailEvent {
        public static final int $stable = 0;
        private final String accountNumber;
        private final String instrumentSymbol;

        public static /* synthetic */ NavigateToInstrumentDetailFragment copy$default(NavigateToInstrumentDetailFragment navigateToInstrumentDetailFragment, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToInstrumentDetailFragment.instrumentSymbol;
            }
            if ((i & 2) != 0) {
                str2 = navigateToInstrumentDetailFragment.accountNumber;
            }
            return navigateToInstrumentDetailFragment.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentSymbol() {
            return this.instrumentSymbol;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final NavigateToInstrumentDetailFragment copy(String instrumentSymbol, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new NavigateToInstrumentDetailFragment(instrumentSymbol, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToInstrumentDetailFragment)) {
                return false;
            }
            NavigateToInstrumentDetailFragment navigateToInstrumentDetailFragment = (NavigateToInstrumentDetailFragment) other;
            return Intrinsics.areEqual(this.instrumentSymbol, navigateToInstrumentDetailFragment.instrumentSymbol) && Intrinsics.areEqual(this.accountNumber, navigateToInstrumentDetailFragment.accountNumber);
        }

        public int hashCode() {
            return (this.instrumentSymbol.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "NavigateToInstrumentDetailFragment(instrumentSymbol=" + this.instrumentSymbol + ", accountNumber=" + this.accountNumber + ")";
        }

        public NavigateToInstrumentDetailFragment(String instrumentSymbol, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.instrumentSymbol = instrumentSymbol;
            this.accountNumber = accountNumber;
        }

        public final String getInstrumentSymbol() {
            return this.instrumentSymbol;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }
}
