package com.robinhood.android.acatsin.confirmeligible;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInConfirmEligibleContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmeligible/AcatsInConfirmEligibleContract;", "", "<init>", "()V", "Key", "Callbacks", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInConfirmEligibleContract {
    public static final int $stable = 0;
    public static final AcatsInConfirmEligibleContract INSTANCE = new AcatsInConfirmEligibleContract();

    /* compiled from: AcatsInConfirmEligibleContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmeligible/AcatsInConfirmEligibleContract$Callbacks;", "", "onFullTransferSelected", "", "onPartialTransferSelected", "onPlaidPartialTransferSelected", "onFullTransferReselected", "onShowBorrowingFeeDetails", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFullTransferReselected();

        void onFullTransferSelected();

        void onPartialTransferSelected();

        void onPlaidPartialTransferSelected();

        void onShowBorrowingFeeDetails();
    }

    private AcatsInConfirmEligibleContract() {
    }

    /* compiled from: AcatsInConfirmEligibleContract.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmeligible/AcatsInConfirmEligibleContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "hasPlaidAssets", "", "isReconfirmation", "showSupportLink", "hasShortEquityPositions", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;Lcom/robinhood/utils/Either;ZZZZ)V", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getHasPlaidAssets", "()Z", "getShowSupportLink", "getHasShortEquityPositions", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
        private final boolean hasPlaidAssets;
        private final boolean hasShortEquityPositions;
        private final boolean isReconfirmation;
        private final AcatsInScreenContext screenContext;
        private final boolean showSupportLink;

        /* compiled from: AcatsInConfirmEligibleContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                AcatsInScreenContext acatsInScreenContext = (AcatsInScreenContext) parcel.readParcelable(Key.class.getClassLoader());
                Either<?, ?> eitherM23663create = EitherParceler.INSTANCE.m23663create(parcel);
                boolean z4 = false;
                boolean z5 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Key(acatsInScreenContext, eitherM23663create, z4, z5, z2, z3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, AcatsInScreenContext acatsInScreenContext, Either either, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            if ((i & 2) != 0) {
                either = key.brokerageOrDtcNumber;
            }
            if ((i & 4) != 0) {
                z = key.hasPlaidAssets;
            }
            if ((i & 8) != 0) {
                z2 = key.isReconfirmation;
            }
            if ((i & 16) != 0) {
                z3 = key.showSupportLink;
            }
            if ((i & 32) != 0) {
                z4 = key.hasShortEquityPositions;
            }
            boolean z5 = z3;
            boolean z6 = z4;
            return key.copy(acatsInScreenContext, either, z, z2, z5, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Either<ApiBrokerage, String> component2() {
            return this.brokerageOrDtcNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasPlaidAssets() {
            return this.hasPlaidAssets;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsReconfirmation() {
            return this.isReconfirmation;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowSupportLink() {
            return this.showSupportLink;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHasShortEquityPositions() {
            return this.hasShortEquityPositions;
        }

        public final Key copy(AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, boolean hasPlaidAssets, boolean isReconfirmation, boolean showSupportLink, boolean hasShortEquityPositions) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            return new Key(screenContext, brokerageOrDtcNumber, hasPlaidAssets, isReconfirmation, showSupportLink, hasShortEquityPositions);
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
            return Intrinsics.areEqual(this.screenContext, key.screenContext) && Intrinsics.areEqual(this.brokerageOrDtcNumber, key.brokerageOrDtcNumber) && this.hasPlaidAssets == key.hasPlaidAssets && this.isReconfirmation == key.isReconfirmation && this.showSupportLink == key.showSupportLink && this.hasShortEquityPositions == key.hasShortEquityPositions;
        }

        public int hashCode() {
            return (((((((((this.screenContext.hashCode() * 31) + this.brokerageOrDtcNumber.hashCode()) * 31) + Boolean.hashCode(this.hasPlaidAssets)) * 31) + Boolean.hashCode(this.isReconfirmation)) * 31) + Boolean.hashCode(this.showSupportLink)) * 31) + Boolean.hashCode(this.hasShortEquityPositions);
        }

        public String toString() {
            return "Key(screenContext=" + this.screenContext + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", hasPlaidAssets=" + this.hasPlaidAssets + ", isReconfirmation=" + this.isReconfirmation + ", showSupportLink=" + this.showSupportLink + ", hasShortEquityPositions=" + this.hasShortEquityPositions + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.screenContext, flags);
            EitherParceler.INSTANCE.write((Either<?, ?>) this.brokerageOrDtcNumber, dest, flags);
            dest.writeInt(this.hasPlaidAssets ? 1 : 0);
            dest.writeInt(this.isReconfirmation ? 1 : 0);
            dest.writeInt(this.showSupportLink ? 1 : 0);
            dest.writeInt(this.hasShortEquityPositions ? 1 : 0);
        }

        public Key(AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            this.screenContext = screenContext;
            this.brokerageOrDtcNumber = brokerageOrDtcNumber;
            this.hasPlaidAssets = z;
            this.isReconfirmation = z2;
            this.showSupportLink = z3;
            this.hasShortEquityPositions = z4;
        }

        public /* synthetic */ Key(AcatsInScreenContext acatsInScreenContext, Either either, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(acatsInScreenContext, either, z, z2, z3, (i & 32) != 0 ? false : z4);
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
            return this.brokerageOrDtcNumber;
        }

        public final boolean getHasPlaidAssets() {
            return this.hasPlaidAssets;
        }

        public final boolean isReconfirmation() {
            return this.isReconfirmation;
        }

        public final boolean getShowSupportLink() {
            return this.showSupportLink;
        }

        public final boolean getHasShortEquityPositions() {
            return this.hasShortEquityPositions;
        }
    }
}
