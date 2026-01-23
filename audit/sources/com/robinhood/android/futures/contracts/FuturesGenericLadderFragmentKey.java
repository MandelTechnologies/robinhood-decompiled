package com.robinhood.android.futures.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesGenericLadderFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "futuresContractId", "Ljava/util/UUID;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getFuturesContractId", "()Ljava/util/UUID;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesGenericLadderFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<FuturesGenericLadderFragmentKey> CREATOR = new Creator();
    private final UUID futuresContractId;
    private final Screen sourceScreen;

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<FuturesGenericLadderFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesGenericLadderFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesGenericLadderFragmentKey((UUID) parcel.readSerializable(), (Screen) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesGenericLadderFragmentKey[] newArray(int i) {
            return new FuturesGenericLadderFragmentKey[i];
        }
    }

    public static /* synthetic */ FuturesGenericLadderFragmentKey copy$default(FuturesGenericLadderFragmentKey futuresGenericLadderFragmentKey, UUID uuid, Screen screen, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = futuresGenericLadderFragmentKey.futuresContractId;
        }
        if ((i & 2) != 0) {
            screen = futuresGenericLadderFragmentKey.sourceScreen;
        }
        return futuresGenericLadderFragmentKey.copy(uuid, screen);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getFuturesContractId() {
        return this.futuresContractId;
    }

    /* renamed from: component2, reason: from getter */
    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    public final FuturesGenericLadderFragmentKey copy(UUID futuresContractId, Screen sourceScreen) {
        Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        return new FuturesGenericLadderFragmentKey(futuresContractId, sourceScreen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesGenericLadderFragmentKey)) {
            return false;
        }
        FuturesGenericLadderFragmentKey futuresGenericLadderFragmentKey = (FuturesGenericLadderFragmentKey) other;
        return Intrinsics.areEqual(this.futuresContractId, futuresGenericLadderFragmentKey.futuresContractId) && Intrinsics.areEqual(this.sourceScreen, futuresGenericLadderFragmentKey.sourceScreen);
    }

    public int hashCode() {
        return (this.futuresContractId.hashCode() * 31) + this.sourceScreen.hashCode();
    }

    public String toString() {
        return "FuturesGenericLadderFragmentKey(futuresContractId=" + this.futuresContractId + ", sourceScreen=" + this.sourceScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.futuresContractId);
        dest.writeSerializable(this.sourceScreen);
    }

    public FuturesGenericLadderFragmentKey(UUID futuresContractId, Screen sourceScreen) {
        Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        this.futuresContractId = futuresContractId;
        this.sourceScreen = sourceScreen;
    }

    public final UUID getFuturesContractId() {
        return this.futuresContractId;
    }

    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }
}
