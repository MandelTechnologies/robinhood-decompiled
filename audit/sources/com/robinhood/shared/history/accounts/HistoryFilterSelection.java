package com.robinhood.shared.history.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeSubFilter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: HistoryFilterSelection.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/HistoryFilterSelection;", "Landroid/os/Parcelable;", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "TransactionFilter", "TransactionSubFilter", "Lcom/robinhood/shared/history/accounts/HistoryFilterSelection$TransactionFilter;", "Lcom/robinhood/shared/history/accounts/HistoryFilterSelection$TransactionSubFilter;", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class HistoryFilterSelection implements Parcelable {
    public static final int $stable = StringResource.$stable;
    private final StringResource label;

    public /* synthetic */ HistoryFilterSelection(StringResource stringResource, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource);
    }

    private HistoryFilterSelection(StringResource stringResource) {
        this.label = stringResource;
    }

    public final StringResource getLabel() {
        return this.label;
    }

    /* compiled from: HistoryFilterSelection.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/HistoryFilterSelection$TransactionFilter;", "Lcom/robinhood/shared/history/accounts/HistoryFilterSelection;", "filter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "inEtfRegionGate", "", "<init>", "(Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;Z)V", "getFilter", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "getInEtfRegionGate", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransactionFilter extends HistoryFilterSelection {
        public static final int $stable = StringResource.$stable;
        public static final Parcelable.Creator<TransactionFilter> CREATOR = new Creator();
        private final AccountsHistoryTransactionTypeFilter filter;
        private final boolean inEtfRegionGate;

        /* compiled from: HistoryFilterSelection.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<TransactionFilter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionFilter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionFilter((AccountsHistoryTransactionTypeFilter) parcel.readParcelable(TransactionFilter.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionFilter[] newArray(int i) {
                return new TransactionFilter[i];
            }
        }

        public static /* synthetic */ TransactionFilter copy$default(TransactionFilter transactionFilter, AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                accountsHistoryTransactionTypeFilter = transactionFilter.filter;
            }
            if ((i & 2) != 0) {
                z = transactionFilter.inEtfRegionGate;
            }
            return transactionFilter.copy(accountsHistoryTransactionTypeFilter, z);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountsHistoryTransactionTypeFilter getFilter() {
            return this.filter;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getInEtfRegionGate() {
            return this.inEtfRegionGate;
        }

        public final TransactionFilter copy(AccountsHistoryTransactionTypeFilter filter, boolean inEtfRegionGate) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            return new TransactionFilter(filter, inEtfRegionGate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionFilter)) {
                return false;
            }
            TransactionFilter transactionFilter = (TransactionFilter) other;
            return this.filter == transactionFilter.filter && this.inEtfRegionGate == transactionFilter.inEtfRegionGate;
        }

        public int hashCode() {
            return (this.filter.hashCode() * 31) + Boolean.hashCode(this.inEtfRegionGate);
        }

        public String toString() {
            return "TransactionFilter(filter=" + this.filter + ", inEtfRegionGate=" + this.inEtfRegionGate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.filter, flags);
            dest.writeInt(this.inEtfRegionGate ? 1 : 0);
        }

        public final AccountsHistoryTransactionTypeFilter getFilter() {
            return this.filter;
        }

        public final boolean getInEtfRegionGate() {
            return this.inEtfRegionGate;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionFilter(AccountsHistoryTransactionTypeFilter filter, boolean z) {
            super(StringResource.INSTANCE.invoke(AccountFilterStrings.getLabelRes(filter, z), new Object[0]), null);
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.filter = filter;
            this.inEtfRegionGate = z;
        }
    }

    /* compiled from: HistoryFilterSelection.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/HistoryFilterSelection$TransactionSubFilter;", "Lcom/robinhood/shared/history/accounts/HistoryFilterSelection;", "filter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;", "<init>", "(Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;)V", "getFilter", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransactionSubFilter extends HistoryFilterSelection {
        public static final int $stable = StringResource.$stable;
        public static final Parcelable.Creator<TransactionSubFilter> CREATOR = new Creator();
        private final AccountsHistoryTransactionTypeSubFilter filter;

        /* compiled from: HistoryFilterSelection.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<TransactionSubFilter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionSubFilter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionSubFilter((AccountsHistoryTransactionTypeSubFilter) parcel.readParcelable(TransactionSubFilter.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionSubFilter[] newArray(int i) {
                return new TransactionSubFilter[i];
            }
        }

        public static /* synthetic */ TransactionSubFilter copy$default(TransactionSubFilter transactionSubFilter, AccountsHistoryTransactionTypeSubFilter accountsHistoryTransactionTypeSubFilter, int i, Object obj) {
            if ((i & 1) != 0) {
                accountsHistoryTransactionTypeSubFilter = transactionSubFilter.filter;
            }
            return transactionSubFilter.copy(accountsHistoryTransactionTypeSubFilter);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountsHistoryTransactionTypeSubFilter getFilter() {
            return this.filter;
        }

        public final TransactionSubFilter copy(AccountsHistoryTransactionTypeSubFilter filter) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            return new TransactionSubFilter(filter);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TransactionSubFilter) && this.filter == ((TransactionSubFilter) other).filter;
        }

        public int hashCode() {
            return this.filter.hashCode();
        }

        public String toString() {
            return "TransactionSubFilter(filter=" + this.filter + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.filter, flags);
        }

        public final AccountsHistoryTransactionTypeSubFilter getFilter() {
            return this.filter;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionSubFilter(AccountsHistoryTransactionTypeSubFilter filter) {
            super(StringResource.INSTANCE.invoke(AccountFilterStrings.getLabelRes(filter), new Object[0]), null);
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.filter = filter;
        }
    }
}
