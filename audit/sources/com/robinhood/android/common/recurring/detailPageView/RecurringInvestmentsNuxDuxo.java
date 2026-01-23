package com.robinhood.android.common.recurring.detailPageView;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.app.type.AppType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringInvestmentsNuxDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0012\u0013B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDataState;", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "InitArgs", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringInvestmentsNuxDuxo extends BaseDuxo<RecurringInvestmentsNuxDataState, RecurringInvestmentsNuxViewState> implements HasArgs<InitArgs> {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringInvestmentsNuxDuxo(AppType appType, DuxoBundle duxoBundle, RecurringInvestmentsNuxStateProvider stateProvider, SavedStateHandle savedStateHandle) {
        super(new RecurringInvestmentsNuxDataState((InitArgs) INSTANCE.getArgs(savedStateHandle), appType), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: RecurringInvestmentsNuxDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs;", "Landroid/os/Parcelable;", "<init>", "()V", "Crypto", "Equity", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs$Crypto;", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs$Equity;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class InitArgs implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ InitArgs(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private InitArgs() {
        }

        /* compiled from: RecurringInvestmentsNuxDuxo.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs$Crypto;", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Crypto extends InitArgs {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Crypto> CREATOR = new Creator();
            private final UiCurrencyPair currencyPair;

            /* compiled from: RecurringInvestmentsNuxDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Crypto> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Crypto createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Crypto((UiCurrencyPair) parcel.readParcelable(Crypto.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Crypto[] newArray(int i) {
                    return new Crypto[i];
                }
            }

            public static /* synthetic */ Crypto copy$default(Crypto crypto2, UiCurrencyPair uiCurrencyPair, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCurrencyPair = crypto2.currencyPair;
                }
                return crypto2.copy(uiCurrencyPair);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            public final Crypto copy(UiCurrencyPair currencyPair) {
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                return new Crypto(currencyPair);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Crypto) && Intrinsics.areEqual(this.currencyPair, ((Crypto) other).currencyPair);
            }

            public int hashCode() {
                return this.currencyPair.hashCode();
            }

            public String toString() {
                return "Crypto(currencyPair=" + this.currencyPair + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.currencyPair, flags);
            }

            public final UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Crypto(UiCurrencyPair currencyPair) {
                super(null);
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                this.currencyPair = currencyPair;
            }
        }

        /* compiled from: RecurringInvestmentsNuxDuxo.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs$Equity;", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs;", "id", "Ljava/util/UUID;", "symbol", "", "accountNumber", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getSymbol", "()Ljava/lang/String;", "getAccountNumber", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Equity extends InitArgs {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Equity> CREATOR = new Creator();
            private final String accountNumber;
            private final UUID id;
            private final String symbol;

            /* compiled from: RecurringInvestmentsNuxDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Equity> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Equity createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Equity((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Equity[] newArray(int i) {
                    return new Equity[i];
                }
            }

            public static /* synthetic */ Equity copy$default(Equity equity, UUID uuid, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = equity.id;
                }
                if ((i & 2) != 0) {
                    str = equity.symbol;
                }
                if ((i & 4) != 0) {
                    str2 = equity.accountNumber;
                }
                return equity.copy(uuid, str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            /* renamed from: component3, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final Equity copy(UUID id, String symbol, String accountNumber) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return new Equity(id, symbol, accountNumber);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Equity)) {
                    return false;
                }
                Equity equity = (Equity) other;
                return Intrinsics.areEqual(this.id, equity.id) && Intrinsics.areEqual(this.symbol, equity.symbol) && Intrinsics.areEqual(this.accountNumber, equity.accountNumber);
            }

            public int hashCode() {
                return (((this.id.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.accountNumber.hashCode();
            }

            public String toString() {
                return "Equity(id=" + this.id + ", symbol=" + this.symbol + ", accountNumber=" + this.accountNumber + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.id);
                dest.writeString(this.symbol);
                dest.writeString(this.accountNumber);
            }

            public final UUID getId() {
                return this.id;
            }

            public final String getSymbol() {
                return this.symbol;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Equity(UUID id, String symbol, String accountNumber) {
                super(null);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                this.id = id;
                this.symbol = symbol;
                this.accountNumber = accountNumber;
            }
        }
    }

    /* compiled from: RecurringInvestmentsNuxDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo;", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<RecurringInvestmentsNuxDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(RecurringInvestmentsNuxDuxo recurringInvestmentsNuxDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, recurringInvestmentsNuxDuxo);
        }
    }
}
