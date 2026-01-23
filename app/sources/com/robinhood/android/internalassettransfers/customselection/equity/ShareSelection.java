package com.robinhood.android.internalassettransfers.customselection.equity;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderFragment;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareSelection.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", "Landroid/os/Parcelable;", "AllShares", "SpecificShares", "Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection$AllShares;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection$SpecificShares;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface ShareSelection extends Parcelable {

    /* compiled from: ShareSelection.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection$AllShares;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AllShares implements ShareSelection {
        public static final int $stable = 0;
        public static final AllShares INSTANCE = new AllShares();
        public static final Parcelable.Creator<AllShares> CREATOR = new Creator();

        /* compiled from: ShareSelection.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AllShares> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllShares createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AllShares.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllShares[] newArray(int i) {
                return new AllShares[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AllShares);
        }

        public int hashCode() {
            return -570706459;
        }

        public String toString() {
            return "AllShares";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private AllShares() {
        }
    }

    /* compiled from: ShareSelection.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection$SpecificShares;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", EquityShareOrderFragment.ARG_SHARES, "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getShares", "()Ljava/math/BigDecimal;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SpecificShares implements ShareSelection {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SpecificShares> CREATOR = new Creator();
        private final BigDecimal shares;

        /* compiled from: ShareSelection.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SpecificShares> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpecificShares createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SpecificShares((BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpecificShares[] newArray(int i) {
                return new SpecificShares[i];
            }
        }

        public static /* synthetic */ SpecificShares copy$default(SpecificShares specificShares, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = specificShares.shares;
            }
            return specificShares.copy(bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getShares() {
            return this.shares;
        }

        public final SpecificShares copy(BigDecimal shares) {
            Intrinsics.checkNotNullParameter(shares, "shares");
            return new SpecificShares(shares);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SpecificShares) && Intrinsics.areEqual(this.shares, ((SpecificShares) other).shares);
        }

        public int hashCode() {
            return this.shares.hashCode();
        }

        public String toString() {
            return "SpecificShares(shares=" + this.shares + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.shares);
        }

        public SpecificShares(BigDecimal shares) {
            Intrinsics.checkNotNullParameter(shares, "shares");
            this.shares = shares;
        }

        public final BigDecimal getShares() {
            return this.shares;
        }
    }
}
