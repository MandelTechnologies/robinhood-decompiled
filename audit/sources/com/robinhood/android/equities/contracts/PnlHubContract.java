package com.robinhood.android.equities.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlHubContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/PnlHubContract;", "", "Key", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface PnlHubContract {

    /* compiled from: PnlHubContract.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0014\u0015\u0016B7\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/PnlHubContract$Key;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "source", "", "selectedAssetTypes", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "scrollToSymbol", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/android/navigation/keys/FragmentTab;)V", "getSource", "()Ljava/lang/String;", "getSelectedAssetTypes", "()Ljava/util/List;", "getScrollToSymbol", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "ScrollToSymbol", "AccountNumberKey", "AccountTypeKey", "Lcom/robinhood/android/equities/contracts/PnlHubContract$Key$AccountNumberKey;", "Lcom/robinhood/android/equities/contracts/PnlHubContract$Key$AccountTypeKey;", "Lcom/robinhood/android/equities/contracts/PnlHubContract$Key$ScrollToSymbol;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static abstract class Key implements Parcelable, TabFragmentKey {
        private final FragmentTab defaultTab;
        private final String scrollToSymbol;
        private final List<AssetClass> selectedAssetTypes;
        private final String source;

        public /* synthetic */ Key(String str, List list, String str2, FragmentTab fragmentTab, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, str2, fragmentTab);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Key(String str, List<? extends AssetClass> list, String str2, FragmentTab fragmentTab) {
            this.source = str;
            this.selectedAssetTypes = list;
            this.scrollToSymbol = str2;
            this.defaultTab = fragmentTab;
        }

        public String getSource() {
            return this.source;
        }

        public /* synthetic */ Key(String str, List list, String str2, FragmentTab fragmentTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? FragmentTab.HOME : fragmentTab, null);
        }

        public List<AssetClass> getSelectedAssetTypes() {
            return this.selectedAssetTypes;
        }

        public String getScrollToSymbol() {
            return this.scrollToSymbol;
        }

        @Override // com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return this.defaultTab;
        }

        /* compiled from: PnlHubContract.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/PnlHubContract$Key$ScrollToSymbol;", "Lcom/robinhood/android/equities/contracts/PnlHubContract$Key;", "accountNumber", "", "source", "selectedAssetTypes", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "scrollToSymbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/navigation/keys/FragmentTab;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getSource", "getSelectedAssetTypes", "()Ljava/util/List;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "getScrollToSymbol", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ScrollToSymbol extends Key {
            public static final Parcelable.Creator<ScrollToSymbol> CREATOR = new Creator();
            private final String accountNumber;
            private final FragmentTab defaultTab;
            private final String scrollToSymbol;
            private final List<AssetClass> selectedAssetTypes;
            private final String source;

            /* compiled from: PnlHubContract.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes3.dex */
            public static final class Creator implements Parcelable.Creator<ScrollToSymbol> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ScrollToSymbol createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(AssetClass.valueOf(parcel.readString()));
                    }
                    return new ScrollToSymbol(string2, string3, arrayList, FragmentTab.valueOf(parcel.readString()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ScrollToSymbol[] newArray(int i) {
                    return new ScrollToSymbol[i];
                }
            }

            public static /* synthetic */ ScrollToSymbol copy$default(ScrollToSymbol scrollToSymbol, String str, String str2, List list, FragmentTab fragmentTab, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = scrollToSymbol.accountNumber;
                }
                if ((i & 2) != 0) {
                    str2 = scrollToSymbol.source;
                }
                if ((i & 4) != 0) {
                    list = scrollToSymbol.selectedAssetTypes;
                }
                if ((i & 8) != 0) {
                    fragmentTab = scrollToSymbol.defaultTab;
                }
                if ((i & 16) != 0) {
                    str3 = scrollToSymbol.scrollToSymbol;
                }
                String str4 = str3;
                List list2 = list;
                return scrollToSymbol.copy(str, str2, list2, fragmentTab, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            public final List<AssetClass> component3() {
                return this.selectedAssetTypes;
            }

            /* renamed from: component4, reason: from getter */
            public final FragmentTab getDefaultTab() {
                return this.defaultTab;
            }

            /* renamed from: component5, reason: from getter */
            public final String getScrollToSymbol() {
                return this.scrollToSymbol;
            }

            public final ScrollToSymbol copy(String accountNumber, String source, List<? extends AssetClass> selectedAssetTypes, FragmentTab defaultTab, String scrollToSymbol) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(selectedAssetTypes, "selectedAssetTypes");
                Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                return new ScrollToSymbol(accountNumber, source, selectedAssetTypes, defaultTab, scrollToSymbol);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScrollToSymbol)) {
                    return false;
                }
                ScrollToSymbol scrollToSymbol = (ScrollToSymbol) other;
                return Intrinsics.areEqual(this.accountNumber, scrollToSymbol.accountNumber) && Intrinsics.areEqual(this.source, scrollToSymbol.source) && Intrinsics.areEqual(this.selectedAssetTypes, scrollToSymbol.selectedAssetTypes) && this.defaultTab == scrollToSymbol.defaultTab && Intrinsics.areEqual(this.scrollToSymbol, scrollToSymbol.scrollToSymbol);
            }

            public int hashCode() {
                int iHashCode = ((((((this.accountNumber.hashCode() * 31) + this.source.hashCode()) * 31) + this.selectedAssetTypes.hashCode()) * 31) + this.defaultTab.hashCode()) * 31;
                String str = this.scrollToSymbol;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "ScrollToSymbol(accountNumber=" + this.accountNumber + ", source=" + this.source + ", selectedAssetTypes=" + this.selectedAssetTypes + ", defaultTab=" + this.defaultTab + ", scrollToSymbol=" + this.scrollToSymbol + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
                dest.writeString(this.source);
                List<AssetClass> list = this.selectedAssetTypes;
                dest.writeInt(list.size());
                Iterator<AssetClass> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next().name());
                }
                dest.writeString(this.defaultTab.name());
                dest.writeString(this.scrollToSymbol);
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            @Override // com.robinhood.android.equities.contracts.PnlHubContract.Key
            public String getSource() {
                return this.source;
            }

            public /* synthetic */ ScrollToSymbol(String str, String str2, List list, FragmentTab fragmentTab, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? FragmentTab.HOME : fragmentTab, (i & 16) != 0 ? null : str3);
            }

            @Override // com.robinhood.android.equities.contracts.PnlHubContract.Key
            public List<AssetClass> getSelectedAssetTypes() {
                return this.selectedAssetTypes;
            }

            @Override // com.robinhood.android.equities.contracts.PnlHubContract.Key, com.robinhood.android.navigation.keys.TabFragmentKey
            public FragmentTab getDefaultTab() {
                return this.defaultTab;
            }

            @Override // com.robinhood.android.equities.contracts.PnlHubContract.Key
            public String getScrollToSymbol() {
                return this.scrollToSymbol;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ScrollToSymbol(String accountNumber, String source, List<? extends AssetClass> selectedAssetTypes, FragmentTab defaultTab, String str) {
                super(source, selectedAssetTypes, str, defaultTab, null);
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(selectedAssetTypes, "selectedAssetTypes");
                Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                this.accountNumber = accountNumber;
                this.source = source;
                this.selectedAssetTypes = selectedAssetTypes;
                this.defaultTab = defaultTab;
                this.scrollToSymbol = str;
            }
        }

        /* compiled from: PnlHubContract.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/PnlHubContract$Key$AccountNumberKey;", "Lcom/robinhood/android/equities/contracts/PnlHubContract$Key;", "accountNumber", "", "source", "selectedAssetTypes", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/navigation/keys/FragmentTab;)V", "getAccountNumber", "()Ljava/lang/String;", "getSource", "getSelectedAssetTypes", "()Ljava/util/List;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountNumberKey extends Key {
            public static final Parcelable.Creator<AccountNumberKey> CREATOR = new Creator();
            private final String accountNumber;
            private final FragmentTab defaultTab;
            private final List<AssetClass> selectedAssetTypes;
            private final String source;

            /* compiled from: PnlHubContract.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes3.dex */
            public static final class Creator implements Parcelable.Creator<AccountNumberKey> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AccountNumberKey createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(AssetClass.valueOf(parcel.readString()));
                    }
                    return new AccountNumberKey(string2, string3, arrayList, FragmentTab.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AccountNumberKey[] newArray(int i) {
                    return new AccountNumberKey[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AccountNumberKey copy$default(AccountNumberKey accountNumberKey, String str, String str2, List list, FragmentTab fragmentTab, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = accountNumberKey.accountNumber;
                }
                if ((i & 2) != 0) {
                    str2 = accountNumberKey.source;
                }
                if ((i & 4) != 0) {
                    list = accountNumberKey.selectedAssetTypes;
                }
                if ((i & 8) != 0) {
                    fragmentTab = accountNumberKey.defaultTab;
                }
                return accountNumberKey.copy(str, str2, list, fragmentTab);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            public final List<AssetClass> component3() {
                return this.selectedAssetTypes;
            }

            /* renamed from: component4, reason: from getter */
            public final FragmentTab getDefaultTab() {
                return this.defaultTab;
            }

            public final AccountNumberKey copy(String accountNumber, String source, List<? extends AssetClass> selectedAssetTypes, FragmentTab defaultTab) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(selectedAssetTypes, "selectedAssetTypes");
                Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                return new AccountNumberKey(accountNumber, source, selectedAssetTypes, defaultTab);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccountNumberKey)) {
                    return false;
                }
                AccountNumberKey accountNumberKey = (AccountNumberKey) other;
                return Intrinsics.areEqual(this.accountNumber, accountNumberKey.accountNumber) && Intrinsics.areEqual(this.source, accountNumberKey.source) && Intrinsics.areEqual(this.selectedAssetTypes, accountNumberKey.selectedAssetTypes) && this.defaultTab == accountNumberKey.defaultTab;
            }

            public int hashCode() {
                return (((((this.accountNumber.hashCode() * 31) + this.source.hashCode()) * 31) + this.selectedAssetTypes.hashCode()) * 31) + this.defaultTab.hashCode();
            }

            public String toString() {
                return "AccountNumberKey(accountNumber=" + this.accountNumber + ", source=" + this.source + ", selectedAssetTypes=" + this.selectedAssetTypes + ", defaultTab=" + this.defaultTab + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
                dest.writeString(this.source);
                List<AssetClass> list = this.selectedAssetTypes;
                dest.writeInt(list.size());
                Iterator<AssetClass> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next().name());
                }
                dest.writeString(this.defaultTab.name());
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            @Override // com.robinhood.android.equities.contracts.PnlHubContract.Key
            public String getSource() {
                return this.source;
            }

            public /* synthetic */ AccountNumberKey(String str, String str2, List list, FragmentTab fragmentTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? FragmentTab.HOME : fragmentTab);
            }

            @Override // com.robinhood.android.equities.contracts.PnlHubContract.Key
            public List<AssetClass> getSelectedAssetTypes() {
                return this.selectedAssetTypes;
            }

            @Override // com.robinhood.android.equities.contracts.PnlHubContract.Key, com.robinhood.android.navigation.keys.TabFragmentKey
            public FragmentTab getDefaultTab() {
                return this.defaultTab;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AccountNumberKey(String accountNumber, String source, List<? extends AssetClass> selectedAssetTypes, FragmentTab defaultTab) {
                super(source, selectedAssetTypes, null, defaultTab, 4, null);
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(selectedAssetTypes, "selectedAssetTypes");
                Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                this.accountNumber = accountNumber;
                this.source = source;
                this.selectedAssetTypes = selectedAssetTypes;
                this.defaultTab = defaultTab;
            }
        }

        /* compiled from: PnlHubContract.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/PnlHubContract$Key$AccountTypeKey;", "Lcom/robinhood/android/equities/contracts/PnlHubContract$Key;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "source", "", "selectedAssetTypes", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/navigation/keys/FragmentTab;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSource", "()Ljava/lang/String;", "getSelectedAssetTypes", "()Ljava/util/List;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountTypeKey extends Key {
            public static final Parcelable.Creator<AccountTypeKey> CREATOR = new Creator();
            private final BrokerageAccountType accountType;
            private final FragmentTab defaultTab;
            private final List<AssetClass> selectedAssetTypes;
            private final String source;

            /* compiled from: PnlHubContract.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes3.dex */
            public static final class Creator implements Parcelable.Creator<AccountTypeKey> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AccountTypeKey createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    BrokerageAccountType brokerageAccountTypeValueOf = BrokerageAccountType.valueOf(parcel.readString());
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(AssetClass.valueOf(parcel.readString()));
                    }
                    return new AccountTypeKey(brokerageAccountTypeValueOf, string2, arrayList, FragmentTab.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AccountTypeKey[] newArray(int i) {
                    return new AccountTypeKey[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AccountTypeKey copy$default(AccountTypeKey accountTypeKey, BrokerageAccountType brokerageAccountType, String str, List list, FragmentTab fragmentTab, int i, Object obj) {
                if ((i & 1) != 0) {
                    brokerageAccountType = accountTypeKey.accountType;
                }
                if ((i & 2) != 0) {
                    str = accountTypeKey.source;
                }
                if ((i & 4) != 0) {
                    list = accountTypeKey.selectedAssetTypes;
                }
                if ((i & 8) != 0) {
                    fragmentTab = accountTypeKey.defaultTab;
                }
                return accountTypeKey.copy(brokerageAccountType, str, list, fragmentTab);
            }

            /* renamed from: component1, reason: from getter */
            public final BrokerageAccountType getAccountType() {
                return this.accountType;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            public final List<AssetClass> component3() {
                return this.selectedAssetTypes;
            }

            /* renamed from: component4, reason: from getter */
            public final FragmentTab getDefaultTab() {
                return this.defaultTab;
            }

            public final AccountTypeKey copy(BrokerageAccountType accountType, String source, List<? extends AssetClass> selectedAssetTypes, FragmentTab defaultTab) {
                Intrinsics.checkNotNullParameter(accountType, "accountType");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(selectedAssetTypes, "selectedAssetTypes");
                Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                return new AccountTypeKey(accountType, source, selectedAssetTypes, defaultTab);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccountTypeKey)) {
                    return false;
                }
                AccountTypeKey accountTypeKey = (AccountTypeKey) other;
                return this.accountType == accountTypeKey.accountType && Intrinsics.areEqual(this.source, accountTypeKey.source) && Intrinsics.areEqual(this.selectedAssetTypes, accountTypeKey.selectedAssetTypes) && this.defaultTab == accountTypeKey.defaultTab;
            }

            public int hashCode() {
                return (((((this.accountType.hashCode() * 31) + this.source.hashCode()) * 31) + this.selectedAssetTypes.hashCode()) * 31) + this.defaultTab.hashCode();
            }

            public String toString() {
                return "AccountTypeKey(accountType=" + this.accountType + ", source=" + this.source + ", selectedAssetTypes=" + this.selectedAssetTypes + ", defaultTab=" + this.defaultTab + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountType.name());
                dest.writeString(this.source);
                List<AssetClass> list = this.selectedAssetTypes;
                dest.writeInt(list.size());
                Iterator<AssetClass> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next().name());
                }
                dest.writeString(this.defaultTab.name());
            }

            public final BrokerageAccountType getAccountType() {
                return this.accountType;
            }

            @Override // com.robinhood.android.equities.contracts.PnlHubContract.Key
            public String getSource() {
                return this.source;
            }

            public /* synthetic */ AccountTypeKey(BrokerageAccountType brokerageAccountType, String str, List list, FragmentTab fragmentTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(brokerageAccountType, str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? FragmentTab.HOME : fragmentTab);
            }

            @Override // com.robinhood.android.equities.contracts.PnlHubContract.Key
            public List<AssetClass> getSelectedAssetTypes() {
                return this.selectedAssetTypes;
            }

            @Override // com.robinhood.android.equities.contracts.PnlHubContract.Key, com.robinhood.android.navigation.keys.TabFragmentKey
            public FragmentTab getDefaultTab() {
                return this.defaultTab;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AccountTypeKey(BrokerageAccountType accountType, String source, List<? extends AssetClass> selectedAssetTypes, FragmentTab defaultTab) {
                super(source, selectedAssetTypes, null, defaultTab, 4, null);
                Intrinsics.checkNotNullParameter(accountType, "accountType");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(selectedAssetTypes, "selectedAssetTypes");
                Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
                this.accountType = accountType;
                this.source = source;
                this.selectedAssetTypes = selectedAssetTypes;
                this.defaultTab = defaultTab;
            }
        }
    }
}
