package com.robinhood.android.internalassettransfers.accountselection;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState;", "", "Loading", "Loaded", "Error", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState$Error;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState$Loaded;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState$Loading;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface AccountSelectionViewState {

    /* compiled from: AccountSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState$Loading;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AccountSelectionViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1754735247;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AccountSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState$Loaded;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState;", "accountSelectionRows", "", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionRowState;", "buttonState", "Lcom/robinhood/android/internalassettransfers/accountselection/ButtonState;", "dialogError", "", "<init>", "(Ljava/util/List;Lcom/robinhood/android/internalassettransfers/accountselection/ButtonState;Ljava/lang/Throwable;)V", "getAccountSelectionRows", "()Ljava/util/List;", "getButtonState", "()Lcom/robinhood/android/internalassettransfers/accountselection/ButtonState;", "getDialogError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AccountSelectionViewState {
        public static final int $stable = 8;
        private final List<AccountSelectionRowState> accountSelectionRows;
        private final AccountSelectionViewState3 buttonState;
        private final Throwable dialogError;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, AccountSelectionViewState3 accountSelectionViewState3, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loaded.accountSelectionRows;
            }
            if ((i & 2) != 0) {
                accountSelectionViewState3 = loaded.buttonState;
            }
            if ((i & 4) != 0) {
                th = loaded.dialogError;
            }
            return loaded.copy(list, accountSelectionViewState3, th);
        }

        public final List<AccountSelectionRowState> component1() {
            return this.accountSelectionRows;
        }

        /* renamed from: component2, reason: from getter */
        public final AccountSelectionViewState3 getButtonState() {
            return this.buttonState;
        }

        /* renamed from: component3, reason: from getter */
        public final Throwable getDialogError() {
            return this.dialogError;
        }

        public final Loaded copy(List<AccountSelectionRowState> accountSelectionRows, AccountSelectionViewState3 buttonState, Throwable dialogError) {
            Intrinsics.checkNotNullParameter(accountSelectionRows, "accountSelectionRows");
            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
            return new Loaded(accountSelectionRows, buttonState, dialogError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.accountSelectionRows, loaded.accountSelectionRows) && Intrinsics.areEqual(this.buttonState, loaded.buttonState) && Intrinsics.areEqual(this.dialogError, loaded.dialogError);
        }

        public int hashCode() {
            int iHashCode = ((this.accountSelectionRows.hashCode() * 31) + this.buttonState.hashCode()) * 31;
            Throwable th = this.dialogError;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return "Loaded(accountSelectionRows=" + this.accountSelectionRows + ", buttonState=" + this.buttonState + ", dialogError=" + this.dialogError + ")";
        }

        public Loaded(List<AccountSelectionRowState> accountSelectionRows, AccountSelectionViewState3 buttonState, Throwable th) {
            Intrinsics.checkNotNullParameter(accountSelectionRows, "accountSelectionRows");
            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
            this.accountSelectionRows = accountSelectionRows;
            this.buttonState = buttonState;
            this.dialogError = th;
        }

        public final List<AccountSelectionRowState> getAccountSelectionRows() {
            return this.accountSelectionRows;
        }

        public final AccountSelectionViewState3 getButtonState() {
            return this.buttonState;
        }

        public final Throwable getDialogError() {
            return this.dialogError;
        }
    }

    /* compiled from: AccountSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState$Error;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState;", "networkError", "", "<init>", "(Ljava/lang/Throwable;)V", "getNetworkError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements AccountSelectionViewState {
        public static final int $stable = 8;
        private final Throwable networkError;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.networkError;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getNetworkError() {
            return this.networkError;
        }

        public final Error copy(Throwable networkError) {
            Intrinsics.checkNotNullParameter(networkError, "networkError");
            return new Error(networkError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.networkError, ((Error) other).networkError);
        }

        public int hashCode() {
            return this.networkError.hashCode();
        }

        public String toString() {
            return "Error(networkError=" + this.networkError + ")";
        }

        public Error(Throwable networkError) {
            Intrinsics.checkNotNullParameter(networkError, "networkError");
            this.networkError = networkError;
        }

        public final Throwable getNetworkError() {
            return this.networkError;
        }
    }
}
