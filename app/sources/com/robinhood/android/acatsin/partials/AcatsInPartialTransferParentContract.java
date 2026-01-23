package com.robinhood.android.acatsin.partials;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.utils.Either;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPartialTransferParentContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentContract;", "", "<init>", "()V", "Key", "Callbacks", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInPartialTransferParentContract {
    public static final int $stable = 0;
    public static final AcatsInPartialTransferParentContract INSTANCE = new AcatsInPartialTransferParentContract();

    /* compiled from: AcatsInPartialTransferParentContract.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentContract$Callbacks;", "", "onBuildPartialTransferComplete", "", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBuildPartialTransferComplete(List<? extends UiAcatsAsset> assets);
    }

    private AcatsInPartialTransferParentContract() {
    }

    /* compiled from: AcatsInPartialTransferParentContract.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010+\u001a\u00020\u0004HÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\t\u00104\u001a\u00020\u0016HÆ\u0003J\t\u00105\u001a\u00020\u0016HÆ\u0003J\u0099\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001J\u0006\u00107\u001a\u000208J\u0013\u00109\u001a\u00020\u00162\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u000208HÖ\u0001J\t\u0010=\u001a\u00020\bHÖ\u0001J\u0016\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000208R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010)R\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/AcatsInPartialTransferParentContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "rhsAccountNumber", "accountNumber", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "rhsAccountTitle", "supportedContentTypes", "", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse$SupportedContentType;", "buildPartialBannerContentfulId", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "isAcatsRetry", "", "hasSubzeroExperiment", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;Lcom/robinhood/utils/Either;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/List;ZZ)V", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getRhsAccountNumber", "()Ljava/lang/String;", "getAccountNumber", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getRhsAccountTitle", "getSupportedContentTypes", "()Ljava/util/Set;", "getBuildPartialBannerContentfulId", "getAssets", "()Ljava/util/List;", "()Z", "getHasSubzeroExperiment", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final String accountNumber;
        private final List<UiAcatsAsset> assets;
        private final BrokerageAccountType brokerageAccountType;
        private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
        private final String buildPartialBannerContentfulId;
        private final boolean hasSubzeroExperiment;
        private final boolean isAcatsRetry;
        private final String rhsAccountNumber;
        private final String rhsAccountTitle;
        private final AcatsInScreenContext screenContext;
        private final Set<ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes;

        /* compiled from: AcatsInPartialTransferParentContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                AcatsInScreenContext acatsInScreenContextCreateFromParcel = AcatsInScreenContext.CREATOR.createFromParcel(parcel);
                Either<?, ?> eitherM23663create = EitherParceler.INSTANCE.m23663create(parcel);
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                BrokerageAccountType brokerageAccountTypeValueOf = parcel.readInt() == 0 ? null : BrokerageAccountType.valueOf(parcel.readString());
                String string4 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(ApiAcatsAccountContentsResponse.SupportedContentType.valueOf(parcel.readString()));
                }
                String string5 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(parcel.readParcelable(Key.class.getClassLoader()));
                }
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                return new Key(acatsInScreenContextCreateFromParcel, eitherM23663create, string2, string3, brokerageAccountTypeValueOf, string4, linkedHashSet, string5, arrayList, z2, parcel.readInt() != 0 ? z : false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, AcatsInScreenContext acatsInScreenContext, Either either, String str, String str2, BrokerageAccountType brokerageAccountType, String str3, Set set, String str4, List list, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            if ((i & 2) != 0) {
                either = key.brokerageOrDtcNumber;
            }
            if ((i & 4) != 0) {
                str = key.rhsAccountNumber;
            }
            if ((i & 8) != 0) {
                str2 = key.accountNumber;
            }
            if ((i & 16) != 0) {
                brokerageAccountType = key.brokerageAccountType;
            }
            if ((i & 32) != 0) {
                str3 = key.rhsAccountTitle;
            }
            if ((i & 64) != 0) {
                set = key.supportedContentTypes;
            }
            if ((i & 128) != 0) {
                str4 = key.buildPartialBannerContentfulId;
            }
            if ((i & 256) != 0) {
                list = key.assets;
            }
            if ((i & 512) != 0) {
                z = key.isAcatsRetry;
            }
            if ((i & 1024) != 0) {
                z2 = key.hasSubzeroExperiment;
            }
            boolean z3 = z;
            boolean z4 = z2;
            String str5 = str4;
            List list2 = list;
            String str6 = str3;
            Set set2 = set;
            BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
            String str7 = str;
            return key.copy(acatsInScreenContext, either, str7, str2, brokerageAccountType2, str6, set2, str5, list2, z3, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsAcatsRetry() {
            return this.isAcatsRetry;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getHasSubzeroExperiment() {
            return this.hasSubzeroExperiment;
        }

        public final Either<ApiBrokerage, String> component2() {
            return this.brokerageOrDtcNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRhsAccountTitle() {
            return this.rhsAccountTitle;
        }

        public final Set<ApiAcatsAccountContentsResponse.SupportedContentType> component7() {
            return this.supportedContentTypes;
        }

        /* renamed from: component8, reason: from getter */
        public final String getBuildPartialBannerContentfulId() {
            return this.buildPartialBannerContentfulId;
        }

        public final List<UiAcatsAsset> component9() {
            return this.assets;
        }

        public final Key copy(AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, String rhsAccountNumber, String accountNumber, BrokerageAccountType brokerageAccountType, String rhsAccountTitle, Set<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, String buildPartialBannerContentfulId, List<? extends UiAcatsAsset> assets, boolean isAcatsRetry, boolean hasSubzeroExperiment) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
            Intrinsics.checkNotNullParameter(assets, "assets");
            return new Key(screenContext, brokerageOrDtcNumber, rhsAccountNumber, accountNumber, brokerageAccountType, rhsAccountTitle, supportedContentTypes, buildPartialBannerContentfulId, assets, isAcatsRetry, hasSubzeroExperiment);
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
            return Intrinsics.areEqual(this.screenContext, key.screenContext) && Intrinsics.areEqual(this.brokerageOrDtcNumber, key.brokerageOrDtcNumber) && Intrinsics.areEqual(this.rhsAccountNumber, key.rhsAccountNumber) && Intrinsics.areEqual(this.accountNumber, key.accountNumber) && this.brokerageAccountType == key.brokerageAccountType && Intrinsics.areEqual(this.rhsAccountTitle, key.rhsAccountTitle) && Intrinsics.areEqual(this.supportedContentTypes, key.supportedContentTypes) && Intrinsics.areEqual(this.buildPartialBannerContentfulId, key.buildPartialBannerContentfulId) && Intrinsics.areEqual(this.assets, key.assets) && this.isAcatsRetry == key.isAcatsRetry && this.hasSubzeroExperiment == key.hasSubzeroExperiment;
        }

        public int hashCode() {
            int iHashCode = ((this.screenContext.hashCode() * 31) + this.brokerageOrDtcNumber.hashCode()) * 31;
            String str = this.rhsAccountNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.accountNumber;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
            int iHashCode4 = (iHashCode3 + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
            String str3 = this.rhsAccountTitle;
            int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.supportedContentTypes.hashCode()) * 31;
            String str4 = this.buildPartialBannerContentfulId;
            return ((((((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.assets.hashCode()) * 31) + Boolean.hashCode(this.isAcatsRetry)) * 31) + Boolean.hashCode(this.hasSubzeroExperiment);
        }

        public String toString() {
            return "Key(screenContext=" + this.screenContext + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", rhsAccountNumber=" + this.rhsAccountNumber + ", accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", rhsAccountTitle=" + this.rhsAccountTitle + ", supportedContentTypes=" + this.supportedContentTypes + ", buildPartialBannerContentfulId=" + this.buildPartialBannerContentfulId + ", assets=" + this.assets + ", isAcatsRetry=" + this.isAcatsRetry + ", hasSubzeroExperiment=" + this.hasSubzeroExperiment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.screenContext.writeToParcel(dest, flags);
            EitherParceler.INSTANCE.write((Either<?, ?>) this.brokerageOrDtcNumber, dest, flags);
            dest.writeString(this.rhsAccountNumber);
            dest.writeString(this.accountNumber);
            BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
            if (brokerageAccountType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(brokerageAccountType.name());
            }
            dest.writeString(this.rhsAccountTitle);
            Set<ApiAcatsAccountContentsResponse.SupportedContentType> set = this.supportedContentTypes;
            dest.writeInt(set.size());
            Iterator<ApiAcatsAccountContentsResponse.SupportedContentType> it = set.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeString(this.buildPartialBannerContentfulId);
            List<UiAcatsAsset> list = this.assets;
            dest.writeInt(list.size());
            Iterator<UiAcatsAsset> it2 = list.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.isAcatsRetry ? 1 : 0);
            dest.writeInt(this.hasSubzeroExperiment ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Key(AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, String str, String str2, BrokerageAccountType brokerageAccountType, String str3, Set<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, String str4, List<? extends UiAcatsAsset> assets, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
            Intrinsics.checkNotNullParameter(assets, "assets");
            this.screenContext = screenContext;
            this.brokerageOrDtcNumber = brokerageOrDtcNumber;
            this.rhsAccountNumber = str;
            this.accountNumber = str2;
            this.brokerageAccountType = brokerageAccountType;
            this.rhsAccountTitle = str3;
            this.supportedContentTypes = supportedContentTypes;
            this.buildPartialBannerContentfulId = str4;
            this.assets = assets;
            this.isAcatsRetry = z;
            this.hasSubzeroExperiment = z2;
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
            return this.brokerageOrDtcNumber;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final String getRhsAccountTitle() {
            return this.rhsAccountTitle;
        }

        public final Set<ApiAcatsAccountContentsResponse.SupportedContentType> getSupportedContentTypes() {
            return this.supportedContentTypes;
        }

        public final String getBuildPartialBannerContentfulId() {
            return this.buildPartialBannerContentfulId;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Key(com.robinhood.android.acatsin.util.AcatsInScreenContext r15, com.robinhood.utils.Either r16, java.lang.String r17, java.lang.String r18, com.robinhood.models.api.BrokerageAccountType r19, java.lang.String r20, java.util.Set r21, java.lang.String r22, java.util.List r23, boolean r24, boolean r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto Lc
                java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
                r11 = r1
                goto Le
            Lc:
                r11 = r23
            Le:
                r1 = r0 & 512(0x200, float:7.175E-43)
                r2 = 0
                if (r1 == 0) goto L15
                r12 = r2
                goto L17
            L15:
                r12 = r24
            L17:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L2d
                r13 = r2
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r2 = r14
                goto L3f
            L2d:
                r13 = r25
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
            L3f:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.acatsin.partials.AcatsInPartialTransferParentContract.Key.<init>(com.robinhood.android.acatsin.util.AcatsInScreenContext, com.robinhood.utils.Either, java.lang.String, java.lang.String, com.robinhood.models.api.BrokerageAccountType, java.lang.String, java.util.Set, java.lang.String, java.util.List, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<UiAcatsAsset> getAssets() {
            return this.assets;
        }

        public final boolean isAcatsRetry() {
            return this.isAcatsRetry;
        }

        public final boolean getHasSubzeroExperiment() {
            return this.hasSubzeroExperiment;
        }
    }
}
