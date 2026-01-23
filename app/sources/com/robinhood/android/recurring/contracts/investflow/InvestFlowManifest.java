package com.robinhood.android.recurring.contracts.investflow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowIntentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowManifest;", "Landroid/os/Parcelable;", "instrumentIds", "", "Ljava/util/UUID;", "<init>", "(Ljava/util/List;)V", "getInstrumentIds", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InvestFlowManifest implements Parcelable {
    public static final Parcelable.Creator<InvestFlowManifest> CREATOR = new Creator();
    private final List<UUID> instrumentIds;

    /* compiled from: InvestFlowIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InvestFlowManifest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowManifest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            return new InvestFlowManifest(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestFlowManifest[] newArray(int i) {
            return new InvestFlowManifest[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestFlowManifest copy$default(InvestFlowManifest investFlowManifest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investFlowManifest.instrumentIds;
        }
        return investFlowManifest.copy(list);
    }

    public final List<UUID> component1() {
        return this.instrumentIds;
    }

    public final InvestFlowManifest copy(List<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        return new InvestFlowManifest(instrumentIds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InvestFlowManifest) && Intrinsics.areEqual(this.instrumentIds, ((InvestFlowManifest) other).instrumentIds);
    }

    public int hashCode() {
        return this.instrumentIds.hashCode();
    }

    public String toString() {
        return "InvestFlowManifest(instrumentIds=" + this.instrumentIds + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<UUID> list = this.instrumentIds;
        dest.writeInt(list.size());
        Iterator<UUID> it = list.iterator();
        while (it.hasNext()) {
            dest.writeSerializable(it.next());
        }
    }

    public InvestFlowManifest(List<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        this.instrumentIds = instrumentIds;
    }

    public final List<UUID> getInstrumentIds() {
        return this.instrumentIds;
    }
}
