package com.robinhood.android.acatsin.agreement;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsFlowStep2;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.utils.Either;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAgreementContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementContract;", "", "<init>", "()V", "Key", "Callbacks", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInAgreementContract {
    public static final int $stable = 0;
    public static final AcatsInAgreementContract INSTANCE = new AcatsInAgreementContract();

    private AcatsInAgreementContract() {
    }

    /* compiled from: AcatsInAgreementContract.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003JX\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÀ\u0001¢\u0006\u0002\b$J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "rhsAccountNumber", "", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "isAcatsRetry", "", "acatsFlow", "Lcom/robinhood/android/acatsin/util/AcatsFlow;", "acatsId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;Lcom/robinhood/utils/Either;ZLcom/robinhood/android/acatsin/util/AcatsFlow;Ljava/util/UUID;)V", "getRhsAccountNumber", "()Ljava/lang/String;", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "()Z", "getAcatsFlow", "()Lcom/robinhood/android/acatsin/util/AcatsFlow;", "getAcatsId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "copy$lib_acats_ui_externalDebug", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final AcatsFlowStep2 acatsFlow;
        private final UUID acatsId;
        private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
        private final boolean isAcatsRetry;
        private final String rhsAccountNumber;
        private final AcatsInScreenContext screenContext;

        /* compiled from: AcatsInAgreementContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key(parcel.readString(), AcatsInScreenContext.CREATOR.createFromParcel(parcel), EitherParceler.INSTANCE.m23663create(parcel), parcel.readInt() != 0, AcatsFlowStep2.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$lib_acats_ui_externalDebug$default(Key key, String str, AcatsInScreenContext acatsInScreenContext, Either either, boolean z, AcatsFlowStep2 acatsFlowStep2, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = key.rhsAccountNumber;
            }
            if ((i & 2) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            if ((i & 4) != 0) {
                either = key.brokerageOrDtcNumber;
            }
            if ((i & 8) != 0) {
                z = key.isAcatsRetry;
            }
            if ((i & 16) != 0) {
                acatsFlowStep2 = key.acatsFlow;
            }
            if ((i & 32) != 0) {
                uuid = key.acatsId;
            }
            AcatsFlowStep2 acatsFlowStep22 = acatsFlowStep2;
            UUID uuid2 = uuid;
            return key.copy$lib_acats_ui_externalDebug(str, acatsInScreenContext, either, z, acatsFlowStep22, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Either<ApiBrokerage, String> component3() {
            return this.brokerageOrDtcNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsAcatsRetry() {
            return this.isAcatsRetry;
        }

        /* renamed from: component5, reason: from getter */
        public final AcatsFlowStep2 getAcatsFlow() {
            return this.acatsFlow;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getAcatsId() {
            return this.acatsId;
        }

        public final Key copy$lib_acats_ui_externalDebug(String rhsAccountNumber, AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, boolean isAcatsRetry, AcatsFlowStep2 acatsFlow, UUID acatsId) {
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(acatsFlow, "acatsFlow");
            return new Key(rhsAccountNumber, screenContext, brokerageOrDtcNumber, isAcatsRetry, acatsFlow, acatsId);
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
            return Intrinsics.areEqual(this.rhsAccountNumber, key.rhsAccountNumber) && Intrinsics.areEqual(this.screenContext, key.screenContext) && Intrinsics.areEqual(this.brokerageOrDtcNumber, key.brokerageOrDtcNumber) && this.isAcatsRetry == key.isAcatsRetry && this.acatsFlow == key.acatsFlow && Intrinsics.areEqual(this.acatsId, key.acatsId);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.rhsAccountNumber.hashCode() * 31) + this.screenContext.hashCode()) * 31) + this.brokerageOrDtcNumber.hashCode()) * 31) + Boolean.hashCode(this.isAcatsRetry)) * 31) + this.acatsFlow.hashCode()) * 31;
            UUID uuid = this.acatsId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "Key(rhsAccountNumber=" + this.rhsAccountNumber + ", screenContext=" + this.screenContext + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", isAcatsRetry=" + this.isAcatsRetry + ", acatsFlow=" + this.acatsFlow + ", acatsId=" + this.acatsId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.rhsAccountNumber);
            this.screenContext.writeToParcel(dest, flags);
            EitherParceler.INSTANCE.write((Either<?, ?>) this.brokerageOrDtcNumber, dest, flags);
            dest.writeInt(this.isAcatsRetry ? 1 : 0);
            dest.writeString(this.acatsFlow.name());
            dest.writeSerializable(this.acatsId);
        }

        public Key(String rhsAccountNumber, AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, boolean z, AcatsFlowStep2 acatsFlow, UUID uuid) {
            Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            Intrinsics.checkNotNullParameter(acatsFlow, "acatsFlow");
            this.rhsAccountNumber = rhsAccountNumber;
            this.screenContext = screenContext;
            this.brokerageOrDtcNumber = brokerageOrDtcNumber;
            this.isAcatsRetry = z;
            this.acatsFlow = acatsFlow;
            this.acatsId = uuid;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
            return this.brokerageOrDtcNumber;
        }

        public final boolean isAcatsRetry() {
            return this.isAcatsRetry;
        }

        public /* synthetic */ Key(String str, AcatsInScreenContext acatsInScreenContext, Either either, boolean z, AcatsFlowStep2 acatsFlowStep2, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, acatsInScreenContext, either, (i & 8) != 0 ? false : z, (i & 16) != 0 ? AcatsFlowStep2.ACATS_IN_PRIMARY : acatsFlowStep2, (i & 32) != 0 ? null : uuid);
        }

        public final AcatsFlowStep2 getAcatsFlow() {
            return this.acatsFlow;
        }

        public final UUID getAcatsId() {
            return this.acatsId;
        }
    }

    /* compiled from: AcatsInAgreementContract.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&JL\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementContract$Callbacks;", "", "onSlipAgreementsUpdated", "", "slipAgreements", "", "Lcom/robinhood/models/ui/UiSlipAgreements$Agreement;", "onAgreementAccepted", "buildAgreementContract", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementContract$Key;", "rhsAccountNumber", "", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "isAcatsRetry", "", "acatsFlow", "Lcom/robinhood/android/acatsin/util/AcatsFlow;", "acatsId", "Ljava/util/UUID;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        Key buildAgreementContract(String rhsAccountNumber, AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, boolean isAcatsRetry, AcatsFlowStep2 acatsFlow, UUID acatsId);

        void onAgreementAccepted();

        void onSlipAgreementsUpdated(List<UiSlipAgreements.Agreement> slipAgreements);

        /* compiled from: AcatsInAgreementContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ Key buildAgreementContract$default(Callbacks callbacks, String str, AcatsInScreenContext acatsInScreenContext, Either either, boolean z, AcatsFlowStep2 acatsFlowStep2, UUID uuid, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildAgreementContract");
                }
                if ((i & 8) != 0) {
                    z = false;
                }
                boolean z2 = z;
                if ((i & 16) != 0) {
                    acatsFlowStep2 = AcatsFlowStep2.ACATS_IN_PRIMARY;
                }
                AcatsFlowStep2 acatsFlowStep22 = acatsFlowStep2;
                if ((i & 32) != 0) {
                    uuid = null;
                }
                return callbacks.buildAgreementContract(str, acatsInScreenContext, either, z2, acatsFlowStep22, uuid);
            }

            public static Key buildAgreementContract(Callbacks callbacks, String rhsAccountNumber, AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, boolean z, AcatsFlowStep2 acatsFlow, UUID uuid) {
                Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
                Intrinsics.checkNotNullParameter(screenContext, "screenContext");
                Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
                Intrinsics.checkNotNullParameter(acatsFlow, "acatsFlow");
                return new Key(rhsAccountNumber, screenContext, brokerageOrDtcNumber, z, acatsFlow, uuid);
            }
        }
    }
}
