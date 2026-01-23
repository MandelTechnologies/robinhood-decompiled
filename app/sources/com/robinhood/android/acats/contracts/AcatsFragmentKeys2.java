package com.robinhood.android.acats.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/acats/contracts/AcatsDetail;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "<init>", "()V", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "AcatsIn", "AcatsOut", "Lcom/robinhood/android/acats/contracts/AcatsDetail$AcatsIn;", "Lcom/robinhood/android/acats/contracts/AcatsDetail$AcatsOut;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.contracts.AcatsDetail, reason: use source file name */
/* loaded from: classes17.dex */
public abstract class AcatsFragmentKeys2 implements FragmentKey, TabFragmentKey {
    public /* synthetic */ AcatsFragmentKeys2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AcatsFragmentKeys2() {
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.ACCOUNT;
    }

    /* compiled from: AcatsFragmentKeys.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/acats/contracts/AcatsDetail$AcatsIn;", "Lcom/robinhood/android/acats/contracts/AcatsDetail;", "acatsInTransferId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getAcatsInTransferId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acats.contracts.AcatsDetail$AcatsIn */
    public static final class AcatsIn extends AcatsFragmentKeys2 {
        public static final Parcelable.Creator<AcatsIn> CREATOR = new Creator();
        private final UUID acatsInTransferId;

        /* compiled from: AcatsFragmentKeys.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acats.contracts.AcatsDetail$AcatsIn$Creator */
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<AcatsIn> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AcatsIn createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcatsIn((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AcatsIn[] newArray(int i) {
                return new AcatsIn[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.acatsInTransferId);
        }

        public final UUID getAcatsInTransferId() {
            return this.acatsInTransferId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AcatsIn(UUID acatsInTransferId) {
            super(null);
            Intrinsics.checkNotNullParameter(acatsInTransferId, "acatsInTransferId");
            this.acatsInTransferId = acatsInTransferId;
        }
    }

    /* compiled from: AcatsFragmentKeys.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/acats/contracts/AcatsDetail$AcatsOut;", "Lcom/robinhood/android/acats/contracts/AcatsDetail;", "rhsAccountNumber", "", "<init>", "(Ljava/lang/String;)V", "getRhsAccountNumber", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acats.contracts.AcatsDetail$AcatsOut */
    public static final class AcatsOut extends AcatsFragmentKeys2 {
        public static final Parcelable.Creator<AcatsOut> CREATOR = new Creator();
        private final String rhsAccountNumber;

        /* compiled from: AcatsFragmentKeys.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acats.contracts.AcatsDetail$AcatsOut$Creator */
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<AcatsOut> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AcatsOut createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcatsOut(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AcatsOut[] newArray(int i) {
                return new AcatsOut[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.rhsAccountNumber);
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public AcatsOut(String str) {
            super(null);
            this.rhsAccountNumber = str;
        }
    }
}
