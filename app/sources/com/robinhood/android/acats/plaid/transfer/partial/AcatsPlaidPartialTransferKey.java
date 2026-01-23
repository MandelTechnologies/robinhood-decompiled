package com.robinhood.android.acats.plaid.transfer.partial;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.utils.Either;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsPlaidPartialTransferKey.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J\t\u0010%\u001a\u00020\u0010HÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020(HÖ\u0001J\t\u0010-\u001a\u00020\u0004HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020(R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "rhsAccountNumber", "", "contraAccountNumber", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "plaidAccessTokenId", "supportedContentTypes", "", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse$SupportedContentType;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "hasSubZero", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/Either;Ljava/lang/String;Ljava/util/Set;Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;Z)V", "getRhsAccountNumber", "()Ljava/lang/String;", "getContraAccountNumber", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getPlaidAccessTokenId", "getSupportedContentTypes", "()Ljava/util/Set;", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getHasSubZero", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AcatsPlaidPartialTransferKey implements FragmentKey, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AcatsPlaidPartialTransferKey> CREATOR = new Creator();
    private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
    private final String contraAccountNumber;
    private final boolean hasSubZero;
    private final String plaidAccessTokenId;
    private final String rhsAccountNumber;
    private final AcatsInScreenContext screenContext;
    private final Set<ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes;

    /* compiled from: AcatsPlaidPartialTransferKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<AcatsPlaidPartialTransferKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcatsPlaidPartialTransferKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Either<?, ?> eitherM23663create = EitherParceler.INSTANCE.m23663create(parcel);
            String string4 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(ApiAcatsAccountContentsResponse.SupportedContentType.valueOf(parcel.readString()));
            }
            return new AcatsPlaidPartialTransferKey(string2, string3, eitherM23663create, string4, linkedHashSet, (AcatsInScreenContext) parcel.readParcelable(AcatsPlaidPartialTransferKey.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcatsPlaidPartialTransferKey[] newArray(int i) {
            return new AcatsPlaidPartialTransferKey[i];
        }
    }

    public static /* synthetic */ AcatsPlaidPartialTransferKey copy$default(AcatsPlaidPartialTransferKey acatsPlaidPartialTransferKey, String str, String str2, Either either, String str3, Set set, AcatsInScreenContext acatsInScreenContext, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acatsPlaidPartialTransferKey.rhsAccountNumber;
        }
        if ((i & 2) != 0) {
            str2 = acatsPlaidPartialTransferKey.contraAccountNumber;
        }
        if ((i & 4) != 0) {
            either = acatsPlaidPartialTransferKey.brokerageOrDtcNumber;
        }
        if ((i & 8) != 0) {
            str3 = acatsPlaidPartialTransferKey.plaidAccessTokenId;
        }
        if ((i & 16) != 0) {
            set = acatsPlaidPartialTransferKey.supportedContentTypes;
        }
        if ((i & 32) != 0) {
            acatsInScreenContext = acatsPlaidPartialTransferKey.screenContext;
        }
        if ((i & 64) != 0) {
            z = acatsPlaidPartialTransferKey.hasSubZero;
        }
        AcatsInScreenContext acatsInScreenContext2 = acatsInScreenContext;
        boolean z2 = z;
        Set set2 = set;
        Either either2 = either;
        return acatsPlaidPartialTransferKey.copy(str, str2, either2, str3, set2, acatsInScreenContext2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContraAccountNumber() {
        return this.contraAccountNumber;
    }

    public final Either<ApiBrokerage, String> component3() {
        return this.brokerageOrDtcNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPlaidAccessTokenId() {
        return this.plaidAccessTokenId;
    }

    public final Set<ApiAcatsAccountContentsResponse.SupportedContentType> component5() {
        return this.supportedContentTypes;
    }

    /* renamed from: component6, reason: from getter */
    public final AcatsInScreenContext getScreenContext() {
        return this.screenContext;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasSubZero() {
        return this.hasSubZero;
    }

    public final AcatsPlaidPartialTransferKey copy(String rhsAccountNumber, String contraAccountNumber, Either<ApiBrokerage, String> brokerageOrDtcNumber, String plaidAccessTokenId, Set<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, AcatsInScreenContext screenContext, boolean hasSubZero) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
        Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
        Intrinsics.checkNotNullParameter(plaidAccessTokenId, "plaidAccessTokenId");
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        Intrinsics.checkNotNullParameter(screenContext, "screenContext");
        return new AcatsPlaidPartialTransferKey(rhsAccountNumber, contraAccountNumber, brokerageOrDtcNumber, plaidAccessTokenId, supportedContentTypes, screenContext, hasSubZero);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsPlaidPartialTransferKey)) {
            return false;
        }
        AcatsPlaidPartialTransferKey acatsPlaidPartialTransferKey = (AcatsPlaidPartialTransferKey) other;
        return Intrinsics.areEqual(this.rhsAccountNumber, acatsPlaidPartialTransferKey.rhsAccountNumber) && Intrinsics.areEqual(this.contraAccountNumber, acatsPlaidPartialTransferKey.contraAccountNumber) && Intrinsics.areEqual(this.brokerageOrDtcNumber, acatsPlaidPartialTransferKey.brokerageOrDtcNumber) && Intrinsics.areEqual(this.plaidAccessTokenId, acatsPlaidPartialTransferKey.plaidAccessTokenId) && Intrinsics.areEqual(this.supportedContentTypes, acatsPlaidPartialTransferKey.supportedContentTypes) && Intrinsics.areEqual(this.screenContext, acatsPlaidPartialTransferKey.screenContext) && this.hasSubZero == acatsPlaidPartialTransferKey.hasSubZero;
    }

    public int hashCode() {
        return (((((((((((this.rhsAccountNumber.hashCode() * 31) + this.contraAccountNumber.hashCode()) * 31) + this.brokerageOrDtcNumber.hashCode()) * 31) + this.plaidAccessTokenId.hashCode()) * 31) + this.supportedContentTypes.hashCode()) * 31) + this.screenContext.hashCode()) * 31) + Boolean.hashCode(this.hasSubZero);
    }

    public String toString() {
        return "AcatsPlaidPartialTransferKey(rhsAccountNumber=" + this.rhsAccountNumber + ", contraAccountNumber=" + this.contraAccountNumber + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", plaidAccessTokenId=" + this.plaidAccessTokenId + ", supportedContentTypes=" + this.supportedContentTypes + ", screenContext=" + this.screenContext + ", hasSubZero=" + this.hasSubZero + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.rhsAccountNumber);
        dest.writeString(this.contraAccountNumber);
        EitherParceler.INSTANCE.write((Either<?, ?>) this.brokerageOrDtcNumber, dest, flags);
        dest.writeString(this.plaidAccessTokenId);
        Set<ApiAcatsAccountContentsResponse.SupportedContentType> set = this.supportedContentTypes;
        dest.writeInt(set.size());
        Iterator<ApiAcatsAccountContentsResponse.SupportedContentType> it = set.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        dest.writeParcelable(this.screenContext, flags);
        dest.writeInt(this.hasSubZero ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsPlaidPartialTransferKey(String rhsAccountNumber, String contraAccountNumber, Either<ApiBrokerage, String> brokerageOrDtcNumber, String plaidAccessTokenId, Set<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, AcatsInScreenContext screenContext, boolean z) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(contraAccountNumber, "contraAccountNumber");
        Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
        Intrinsics.checkNotNullParameter(plaidAccessTokenId, "plaidAccessTokenId");
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        Intrinsics.checkNotNullParameter(screenContext, "screenContext");
        this.rhsAccountNumber = rhsAccountNumber;
        this.contraAccountNumber = contraAccountNumber;
        this.brokerageOrDtcNumber = brokerageOrDtcNumber;
        this.plaidAccessTokenId = plaidAccessTokenId;
        this.supportedContentTypes = supportedContentTypes;
        this.screenContext = screenContext;
        this.hasSubZero = z;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final String getContraAccountNumber() {
        return this.contraAccountNumber;
    }

    public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
        return this.brokerageOrDtcNumber;
    }

    public final String getPlaidAccessTokenId() {
        return this.plaidAccessTokenId;
    }

    public final Set<ApiAcatsAccountContentsResponse.SupportedContentType> getSupportedContentTypes() {
        return this.supportedContentTypes;
    }

    public final AcatsInScreenContext getScreenContext() {
        return this.screenContext;
    }

    public final boolean getHasSubZero() {
        return this.hasSubZero;
    }
}
