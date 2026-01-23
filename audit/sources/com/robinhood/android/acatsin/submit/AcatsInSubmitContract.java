package com.robinhood.android.acatsin.submit;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.utils.Either;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInSubmitContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitContract;", "", "<init>", "()V", "Key", "Callbacks", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInSubmitContract {
    public static final int $stable = 0;
    public static final AcatsInSubmitContract INSTANCE = new AcatsInSubmitContract();

    /* compiled from: AcatsInSubmitContract.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitContract$Callbacks;", "", "onAssetsClicked", "", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "onAcatsSubmitted", "acatsTransferId", "Ljava/util/UUID;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAcatsSubmitted(UUID acatsTransferId);

        void onAssetsClicked(List<? extends UiAcatsAsset> assets);
    }

    private AcatsInSubmitContract() {
    }

    /* compiled from: AcatsInSubmitContract.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00104\u001a\u00020\u0013HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000eHÆ\u0003J\t\u00106\u001a\u00020\u0017HÆ\u0003J\u0097\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001J\u0006\u00108\u001a\u000209J\u0013\u0010:\u001a\u00020\u00172\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u000209HÖ\u0001J\t\u0010>\u001a\u00020\bHÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000209R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "rhsAccountType", "contraAccountNumber", "accountNames", "Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "rhsAccountNumber", "taxableAccountBonusRateString", "selectedAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "slipAgreements", "Lcom/robinhood/models/ui/UiSlipAgreements$Agreement;", "requiresCoOwnerSignature", "", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;Lcom/robinhood/utils/Either;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/List;Z)V", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getRhsAccountType", "()Ljava/lang/String;", "getContraAccountNumber", "getAccountNames", "()Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "getAssets", "()Ljava/util/List;", "getRhsAccountNumber", "getTaxableAccountBonusRateString", "getSelectedAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getSlipAgreements", "getRequiresCoOwnerSignature", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final NamesOnAccount accountNames;
        private final List<UiAcatsAsset> assets;
        private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
        private final String contraAccountNumber;
        private final boolean requiresCoOwnerSignature;
        private final String rhsAccountNumber;
        private final String rhsAccountType;
        private final AcatsInScreenContext screenContext;
        private final BrokerageAccountType selectedAccountType;
        private final List<UiSlipAgreements.Agreement> slipAgreements;
        private final String taxableAccountBonusRateString;

        /* compiled from: AcatsInSubmitContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                AcatsInScreenContext acatsInScreenContext = (AcatsInScreenContext) parcel.readParcelable(Key.class.getClassLoader());
                Either<?, ?> eitherM23663create = EitherParceler.INSTANCE.m23663create(parcel);
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                NamesOnAccount namesOnAccount = (NamesOnAccount) parcel.readParcelable(Key.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(Key.class.getClassLoader()));
                    }
                }
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                BrokerageAccountType brokerageAccountTypeValueOf = BrokerageAccountType.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i3 = parcel.readInt();
                    arrayList2 = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList2.add(parcel.readParcelable(Key.class.getClassLoader()));
                    }
                }
                return new Key(acatsInScreenContext, eitherM23663create, string2, string3, namesOnAccount, arrayList, string4, string5, brokerageAccountTypeValueOf, arrayList2, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, AcatsInScreenContext acatsInScreenContext, Either either, String str, String str2, NamesOnAccount namesOnAccount, List list, String str3, String str4, BrokerageAccountType brokerageAccountType, List list2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            if ((i & 2) != 0) {
                either = key.brokerageOrDtcNumber;
            }
            if ((i & 4) != 0) {
                str = key.rhsAccountType;
            }
            if ((i & 8) != 0) {
                str2 = key.contraAccountNumber;
            }
            if ((i & 16) != 0) {
                namesOnAccount = key.accountNames;
            }
            if ((i & 32) != 0) {
                list = key.assets;
            }
            if ((i & 64) != 0) {
                str3 = key.rhsAccountNumber;
            }
            if ((i & 128) != 0) {
                str4 = key.taxableAccountBonusRateString;
            }
            if ((i & 256) != 0) {
                brokerageAccountType = key.selectedAccountType;
            }
            if ((i & 512) != 0) {
                list2 = key.slipAgreements;
            }
            if ((i & 1024) != 0) {
                z = key.requiresCoOwnerSignature;
            }
            List list3 = list2;
            boolean z2 = z;
            String str5 = str4;
            BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
            List list4 = list;
            String str6 = str3;
            NamesOnAccount namesOnAccount2 = namesOnAccount;
            String str7 = str;
            return key.copy(acatsInScreenContext, either, str7, str2, namesOnAccount2, list4, str6, str5, brokerageAccountType2, list3, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final List<UiSlipAgreements.Agreement> component10() {
            return this.slipAgreements;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getRequiresCoOwnerSignature() {
            return this.requiresCoOwnerSignature;
        }

        public final Either<ApiBrokerage, String> component2() {
            return this.brokerageOrDtcNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRhsAccountType() {
            return this.rhsAccountType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContraAccountNumber() {
            return this.contraAccountNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final NamesOnAccount getAccountNames() {
            return this.accountNames;
        }

        public final List<UiAcatsAsset> component6() {
            return this.assets;
        }

        /* renamed from: component7, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTaxableAccountBonusRateString() {
            return this.taxableAccountBonusRateString;
        }

        /* renamed from: component9, reason: from getter */
        public final BrokerageAccountType getSelectedAccountType() {
            return this.selectedAccountType;
        }

        public final Key copy(AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, String rhsAccountType, String contraAccountNumber, NamesOnAccount accountNames, List<? extends UiAcatsAsset> assets, String rhsAccountNumber, String taxableAccountBonusRateString, BrokerageAccountType selectedAccountType, List<UiSlipAgreements.Agreement> slipAgreements, boolean requiresCoOwnerSignature) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
            Intrinsics.checkNotNullParameter(accountNames, "accountNames");
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
            return new Key(screenContext, brokerageOrDtcNumber, rhsAccountType, contraAccountNumber, accountNames, assets, rhsAccountNumber, taxableAccountBonusRateString, selectedAccountType, slipAgreements, requiresCoOwnerSignature);
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
            return Intrinsics.areEqual(this.screenContext, key.screenContext) && Intrinsics.areEqual(this.brokerageOrDtcNumber, key.brokerageOrDtcNumber) && Intrinsics.areEqual(this.rhsAccountType, key.rhsAccountType) && Intrinsics.areEqual(this.contraAccountNumber, key.contraAccountNumber) && Intrinsics.areEqual(this.accountNames, key.accountNames) && Intrinsics.areEqual(this.assets, key.assets) && Intrinsics.areEqual(this.rhsAccountNumber, key.rhsAccountNumber) && Intrinsics.areEqual(this.taxableAccountBonusRateString, key.taxableAccountBonusRateString) && this.selectedAccountType == key.selectedAccountType && Intrinsics.areEqual(this.slipAgreements, key.slipAgreements) && this.requiresCoOwnerSignature == key.requiresCoOwnerSignature;
        }

        public int hashCode() {
            int iHashCode = ((this.screenContext.hashCode() * 31) + this.brokerageOrDtcNumber.hashCode()) * 31;
            String str = this.rhsAccountType;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contraAccountNumber.hashCode()) * 31) + this.accountNames.hashCode()) * 31;
            List<UiAcatsAsset> list = this.assets;
            int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.rhsAccountNumber.hashCode()) * 31;
            String str2 = this.taxableAccountBonusRateString;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.selectedAccountType.hashCode()) * 31;
            List<UiSlipAgreements.Agreement> list2 = this.slipAgreements;
            return ((iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31) + Boolean.hashCode(this.requiresCoOwnerSignature);
        }

        public String toString() {
            return "Key(screenContext=" + this.screenContext + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", rhsAccountType=" + this.rhsAccountType + ", contraAccountNumber=" + this.contraAccountNumber + ", accountNames=" + this.accountNames + ", assets=" + this.assets + ", rhsAccountNumber=" + this.rhsAccountNumber + ", taxableAccountBonusRateString=" + this.taxableAccountBonusRateString + ", selectedAccountType=" + this.selectedAccountType + ", slipAgreements=" + this.slipAgreements + ", requiresCoOwnerSignature=" + this.requiresCoOwnerSignature + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.screenContext, flags);
            EitherParceler.INSTANCE.write((Either<?, ?>) this.brokerageOrDtcNumber, dest, flags);
            dest.writeString(this.rhsAccountType);
            dest.writeString(this.contraAccountNumber);
            dest.writeParcelable(this.accountNames, flags);
            List<UiAcatsAsset> list = this.assets;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<UiAcatsAsset> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            dest.writeString(this.rhsAccountNumber);
            dest.writeString(this.taxableAccountBonusRateString);
            dest.writeString(this.selectedAccountType.name());
            List<UiSlipAgreements.Agreement> list2 = this.slipAgreements;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<UiSlipAgreements.Agreement> it2 = list2.iterator();
                while (it2.hasNext()) {
                    dest.writeParcelable(it2.next(), flags);
                }
            }
            dest.writeInt(this.requiresCoOwnerSignature ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Key(AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, String str, String contraAccountNumber, NamesOnAccount accountNames, List<? extends UiAcatsAsset> list, String rhsAccountNumber, String str2, BrokerageAccountType selectedAccountType, List<UiSlipAgreements.Agreement> list2, boolean z) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
            Intrinsics.checkNotNullParameter(accountNames, "accountNames");
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
            this.screenContext = screenContext;
            this.brokerageOrDtcNumber = brokerageOrDtcNumber;
            this.rhsAccountType = str;
            this.contraAccountNumber = contraAccountNumber;
            this.accountNames = accountNames;
            this.assets = list;
            this.rhsAccountNumber = rhsAccountNumber;
            this.taxableAccountBonusRateString = str2;
            this.selectedAccountType = selectedAccountType;
            this.slipAgreements = list2;
            this.requiresCoOwnerSignature = z;
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
            return this.brokerageOrDtcNumber;
        }

        public final String getRhsAccountType() {
            return this.rhsAccountType;
        }

        public final String getContraAccountNumber() {
            return this.contraAccountNumber;
        }

        public final NamesOnAccount getAccountNames() {
            return this.accountNames;
        }

        public final List<UiAcatsAsset> getAssets() {
            return this.assets;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final String getTaxableAccountBonusRateString() {
            return this.taxableAccountBonusRateString;
        }

        public final BrokerageAccountType getSelectedAccountType() {
            return this.selectedAccountType;
        }

        public final List<UiSlipAgreements.Agreement> getSlipAgreements() {
            return this.slipAgreements;
        }

        public final boolean getRequiresCoOwnerSignature() {
            return this.requiresCoOwnerSignature;
        }
    }
}
