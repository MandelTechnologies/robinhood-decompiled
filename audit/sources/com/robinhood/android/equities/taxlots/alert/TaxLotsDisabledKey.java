package com.robinhood.android.equities.taxlots.alert;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsDisabledKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/alert/TaxLotsDisabledKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "equityOrderContext", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;)V", "getEquityOrderContext", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TaxLotsDisabledKey implements DialogFragmentKey, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TaxLotsDisabledKey> CREATOR = new Creator();
    private final EquityOrderContext equityOrderContext;

    /* compiled from: TaxLotsDisabledKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<TaxLotsDisabledKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaxLotsDisabledKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxLotsDisabledKey((EquityOrderContext) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaxLotsDisabledKey[] newArray(int i) {
            return new TaxLotsDisabledKey[i];
        }
    }

    public static /* synthetic */ TaxLotsDisabledKey copy$default(TaxLotsDisabledKey taxLotsDisabledKey, EquityOrderContext equityOrderContext, int i, Object obj) {
        if ((i & 1) != 0) {
            equityOrderContext = taxLotsDisabledKey.equityOrderContext;
        }
        return taxLotsDisabledKey.copy(equityOrderContext);
    }

    /* renamed from: component1, reason: from getter */
    public final EquityOrderContext getEquityOrderContext() {
        return this.equityOrderContext;
    }

    public final TaxLotsDisabledKey copy(EquityOrderContext equityOrderContext) {
        Intrinsics.checkNotNullParameter(equityOrderContext, "equityOrderContext");
        return new TaxLotsDisabledKey(equityOrderContext);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TaxLotsDisabledKey) && Intrinsics.areEqual(this.equityOrderContext, ((TaxLotsDisabledKey) other).equityOrderContext);
    }

    public int hashCode() {
        return this.equityOrderContext.hashCode();
    }

    public String toString() {
        return "TaxLotsDisabledKey(equityOrderContext=" + this.equityOrderContext + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.equityOrderContext);
    }

    public TaxLotsDisabledKey(EquityOrderContext equityOrderContext) {
        Intrinsics.checkNotNullParameter(equityOrderContext, "equityOrderContext");
        this.equityOrderContext = equityOrderContext;
    }

    public final EquityOrderContext getEquityOrderContext() {
        return this.equityOrderContext;
    }
}
