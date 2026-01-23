package com.robinhood.shared.history.contracts.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.singular.sdk.internal.Constants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountsHistoryContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract;", "", "Key", "InstrumentFilter", "InstrumentFilterType", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface AccountsHistoryContract {

    /* compiled from: AccountsHistoryContract.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003JK\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\nHÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "accountTypeFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryAccountTypeFilter;", "transactionTypeFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "instrumentFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$InstrumentFilter;", "accountNumber", "", "hasTransactions", "", "overrideTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "<init>", "(Lcom/robinhood/shared/history/contracts/account/AccountsHistoryAccountTypeFilter;Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$InstrumentFilter;Ljava/lang/String;ZLcom/robinhood/android/navigation/keys/FragmentTab;)V", "getAccountTypeFilter", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryAccountTypeFilter;", "getTransactionTypeFilter", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "getInstrumentFilter", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$InstrumentFilter;", "getAccountNumber", "()Ljava/lang/String;", "getHasTransactions", "()Z", "getOverrideTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "defaultTab", "getDefaultTab", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes21.dex */
    public static final /* data */ class Key implements FragmentKey, TabFragmentKey {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final String accountNumber;
        private final AccountsHistoryAccountTypeFilter accountTypeFilter;
        private final boolean hasTransactions;
        private final InstrumentFilter instrumentFilter;
        private final FragmentTab overrideTab;
        private final AccountsHistoryTransactionTypeFilter transactionTypeFilter;

        /* compiled from: AccountsHistoryContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key(AccountsHistoryAccountTypeFilter.CREATOR.createFromParcel(parcel), AccountsHistoryTransactionTypeFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InstrumentFilter.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? FragmentTab.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public Key() {
            this(null, null, null, null, false, null, 63, null);
        }

        public static /* synthetic */ Key copy$default(Key key, AccountsHistoryAccountTypeFilter accountsHistoryAccountTypeFilter, AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter, InstrumentFilter instrumentFilter, String str, boolean z, FragmentTab fragmentTab, int i, Object obj) {
            if ((i & 1) != 0) {
                accountsHistoryAccountTypeFilter = key.accountTypeFilter;
            }
            if ((i & 2) != 0) {
                accountsHistoryTransactionTypeFilter = key.transactionTypeFilter;
            }
            if ((i & 4) != 0) {
                instrumentFilter = key.instrumentFilter;
            }
            if ((i & 8) != 0) {
                str = key.accountNumber;
            }
            if ((i & 16) != 0) {
                z = key.hasTransactions;
            }
            if ((i & 32) != 0) {
                fragmentTab = key.overrideTab;
            }
            boolean z2 = z;
            FragmentTab fragmentTab2 = fragmentTab;
            return key.copy(accountsHistoryAccountTypeFilter, accountsHistoryTransactionTypeFilter, instrumentFilter, str, z2, fragmentTab2);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountsHistoryAccountTypeFilter getAccountTypeFilter() {
            return this.accountTypeFilter;
        }

        /* renamed from: component2, reason: from getter */
        public final AccountsHistoryTransactionTypeFilter getTransactionTypeFilter() {
            return this.transactionTypeFilter;
        }

        /* renamed from: component3, reason: from getter */
        public final InstrumentFilter getInstrumentFilter() {
            return this.instrumentFilter;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasTransactions() {
            return this.hasTransactions;
        }

        /* renamed from: component6, reason: from getter */
        public final FragmentTab getOverrideTab() {
            return this.overrideTab;
        }

        public final Key copy(AccountsHistoryAccountTypeFilter accountTypeFilter, AccountsHistoryTransactionTypeFilter transactionTypeFilter, InstrumentFilter instrumentFilter, String accountNumber, boolean hasTransactions, FragmentTab overrideTab) {
            Intrinsics.checkNotNullParameter(accountTypeFilter, "accountTypeFilter");
            Intrinsics.checkNotNullParameter(transactionTypeFilter, "transactionTypeFilter");
            return new Key(accountTypeFilter, transactionTypeFilter, instrumentFilter, accountNumber, hasTransactions, overrideTab);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return this.accountTypeFilter == key.accountTypeFilter && this.transactionTypeFilter == key.transactionTypeFilter && Intrinsics.areEqual(this.instrumentFilter, key.instrumentFilter) && Intrinsics.areEqual(this.accountNumber, key.accountNumber) && this.hasTransactions == key.hasTransactions && this.overrideTab == key.overrideTab;
        }

        public int hashCode() {
            int iHashCode = ((this.accountTypeFilter.hashCode() * 31) + this.transactionTypeFilter.hashCode()) * 31;
            InstrumentFilter instrumentFilter = this.instrumentFilter;
            int iHashCode2 = (iHashCode + (instrumentFilter == null ? 0 : instrumentFilter.hashCode())) * 31;
            String str = this.accountNumber;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hasTransactions)) * 31;
            FragmentTab fragmentTab = this.overrideTab;
            return iHashCode3 + (fragmentTab != null ? fragmentTab.hashCode() : 0);
        }

        public String toString() {
            return "Key(accountTypeFilter=" + this.accountTypeFilter + ", transactionTypeFilter=" + this.transactionTypeFilter + ", instrumentFilter=" + this.instrumentFilter + ", accountNumber=" + this.accountNumber + ", hasTransactions=" + this.hasTransactions + ", overrideTab=" + this.overrideTab + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.accountTypeFilter.writeToParcel(dest, flags);
            this.transactionTypeFilter.writeToParcel(dest, flags);
            InstrumentFilter instrumentFilter = this.instrumentFilter;
            if (instrumentFilter == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                instrumentFilter.writeToParcel(dest, flags);
            }
            dest.writeString(this.accountNumber);
            dest.writeInt(this.hasTransactions ? 1 : 0);
            FragmentTab fragmentTab = this.overrideTab;
            if (fragmentTab == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(fragmentTab.name());
            }
        }

        public Key(AccountsHistoryAccountTypeFilter accountTypeFilter, AccountsHistoryTransactionTypeFilter transactionTypeFilter, InstrumentFilter instrumentFilter, String str, boolean z, FragmentTab fragmentTab) {
            Intrinsics.checkNotNullParameter(accountTypeFilter, "accountTypeFilter");
            Intrinsics.checkNotNullParameter(transactionTypeFilter, "transactionTypeFilter");
            this.accountTypeFilter = accountTypeFilter;
            this.transactionTypeFilter = transactionTypeFilter;
            this.instrumentFilter = instrumentFilter;
            this.accountNumber = str;
            this.hasTransactions = z;
            this.overrideTab = fragmentTab;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Key(com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter r2, com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter r3, com.robinhood.shared.history.contracts.account.AccountsHistoryContract.InstrumentFilter r4, java.lang.String r5, boolean r6, com.robinhood.android.navigation.keys.FragmentTab r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L6
                com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter r2 = com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter.ALL
            L6:
                r9 = r8 & 2
                if (r9 == 0) goto Lc
                com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter r3 = com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter.ALL
            Lc:
                r9 = r8 & 4
                r0 = 0
                if (r9 == 0) goto L12
                r4 = r0
            L12:
                r9 = r8 & 8
                if (r9 == 0) goto L17
                r5 = r0
            L17:
                r9 = r8 & 16
                if (r9 == 0) goto L1c
                r6 = 0
            L1c:
                r8 = r8 & 32
                if (r8 == 0) goto L28
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L2f
            L28:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L2f:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.history.contracts.account.AccountsHistoryContract.Key.<init>(com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter, com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter, com.robinhood.shared.history.contracts.account.AccountsHistoryContract$InstrumentFilter, java.lang.String, boolean, com.robinhood.android.navigation.keys.FragmentTab, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final AccountsHistoryAccountTypeFilter getAccountTypeFilter() {
            return this.accountTypeFilter;
        }

        public final AccountsHistoryTransactionTypeFilter getTransactionTypeFilter() {
            return this.transactionTypeFilter;
        }

        public final InstrumentFilter getInstrumentFilter() {
            return this.instrumentFilter;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getHasTransactions() {
            return this.hasTransactions;
        }

        public final FragmentTab getOverrideTab() {
            return this.overrideTab;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            FragmentTab fragmentTab = this.overrideTab;
            return fragmentTab == null ? FragmentTab.SPENDING : fragmentTab;
        }
    }

    /* compiled from: AccountsHistoryContract.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$InstrumentFilter;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "type", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$InstrumentFilterType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$InstrumentFilterType;)V", "getId", "()Ljava/util/UUID;", "getType", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$InstrumentFilterType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InstrumentFilter implements Parcelable {
        public static final Parcelable.Creator<InstrumentFilter> CREATOR = new Creator();
        private final UUID id;
        private final InstrumentFilterType type;

        /* compiled from: AccountsHistoryContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InstrumentFilter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstrumentFilter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstrumentFilter((UUID) parcel.readSerializable(), InstrumentFilterType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstrumentFilter[] newArray(int i) {
                return new InstrumentFilter[i];
            }
        }

        public static /* synthetic */ InstrumentFilter copy$default(InstrumentFilter instrumentFilter, UUID uuid, InstrumentFilterType instrumentFilterType, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = instrumentFilter.id;
            }
            if ((i & 2) != 0) {
                instrumentFilterType = instrumentFilter.type;
            }
            return instrumentFilter.copy(uuid, instrumentFilterType);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final InstrumentFilterType getType() {
            return this.type;
        }

        public final InstrumentFilter copy(UUID id, InstrumentFilterType type2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new InstrumentFilter(id, type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstrumentFilter)) {
                return false;
            }
            InstrumentFilter instrumentFilter = (InstrumentFilter) other;
            return Intrinsics.areEqual(this.id, instrumentFilter.id) && this.type == instrumentFilter.type;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            return "InstrumentFilter(id=" + this.id + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            dest.writeString(this.type.name());
        }

        public InstrumentFilter(UUID id, InstrumentFilterType type2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.id = id;
            this.type = type2;
        }

        public final UUID getId() {
            return this.id;
        }

        public final InstrumentFilterType getType() {
            return this.type;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountsHistoryContract.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$InstrumentFilterType;", "", "<init>", "(Ljava/lang/String;I)V", "CRYPTO", "EQUITY", "FUTURES", Constants.API_TYPE_EVENT, "PERPETUALS", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InstrumentFilterType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InstrumentFilterType[] $VALUES;
        public static final InstrumentFilterType CRYPTO = new InstrumentFilterType("CRYPTO", 0);
        public static final InstrumentFilterType EQUITY = new InstrumentFilterType("EQUITY", 1);
        public static final InstrumentFilterType FUTURES = new InstrumentFilterType("FUTURES", 2);
        public static final InstrumentFilterType EVENT = new InstrumentFilterType(Constants.API_TYPE_EVENT, 3);
        public static final InstrumentFilterType PERPETUALS = new InstrumentFilterType("PERPETUALS", 4);

        private static final /* synthetic */ InstrumentFilterType[] $values() {
            return new InstrumentFilterType[]{CRYPTO, EQUITY, FUTURES, EVENT, PERPETUALS};
        }

        public static EnumEntries<InstrumentFilterType> getEntries() {
            return $ENTRIES;
        }

        private InstrumentFilterType(String str, int i) {
        }

        static {
            InstrumentFilterType[] instrumentFilterTypeArr$values = $values();
            $VALUES = instrumentFilterTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(instrumentFilterTypeArr$values);
        }

        public static InstrumentFilterType valueOf(String str) {
            return (InstrumentFilterType) Enum.valueOf(InstrumentFilterType.class, str);
        }

        public static InstrumentFilterType[] values() {
            return (InstrumentFilterType[]) $VALUES.clone();
        }
    }
}
