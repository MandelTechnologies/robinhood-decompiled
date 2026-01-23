package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.rosetta.eventlogging.WiresContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Wires.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/Wires;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "direction", "Lcom/robinhood/rosetta/eventlogging/WiresContext$WiresDirection;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/WiresContext$EntryPoint;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/WiresContext$WiresDirection;Lcom/robinhood/rosetta/eventlogging/WiresContext$EntryPoint;)V", "getDirection", "()Lcom/robinhood/rosetta/eventlogging/WiresContext$WiresDirection;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/WiresContext$EntryPoint;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class Wires implements IntentKey, Parcelable {
    public static final Parcelable.Creator<Wires> CREATOR = new Creator();
    private final WiresContext.WiresDirection direction;
    private final WiresContext.EntryPoint entryPoint;

    /* compiled from: Wires.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<Wires> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Wires createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Wires(WiresContext.WiresDirection.valueOf(parcel.readString()), WiresContext.EntryPoint.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Wires[] newArray(int i) {
            return new Wires[i];
        }
    }

    public static /* synthetic */ Wires copy$default(Wires wires, WiresContext.WiresDirection wiresDirection, WiresContext.EntryPoint entryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            wiresDirection = wires.direction;
        }
        if ((i & 2) != 0) {
            entryPoint = wires.entryPoint;
        }
        return wires.copy(wiresDirection, entryPoint);
    }

    /* renamed from: component1, reason: from getter */
    public final WiresContext.WiresDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component2, reason: from getter */
    public final WiresContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final Wires copy(WiresContext.WiresDirection direction, WiresContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new Wires(direction, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Wires)) {
            return false;
        }
        Wires wires = (Wires) other;
        return this.direction == wires.direction && this.entryPoint == wires.entryPoint;
    }

    public int hashCode() {
        return (this.direction.hashCode() * 31) + this.entryPoint.hashCode();
    }

    public String toString() {
        return "Wires(direction=" + this.direction + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.direction.name());
        dest.writeString(this.entryPoint.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public Wires(WiresContext.WiresDirection direction, WiresContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.direction = direction;
        this.entryPoint = entryPoint;
    }

    public final WiresContext.WiresDirection getDirection() {
        return this.direction;
    }

    public /* synthetic */ Wires(WiresContext.WiresDirection wiresDirection, WiresContext.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiresDirection, (i & 2) != 0 ? WiresContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint);
    }

    public final WiresContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }
}
