package com.robinhood.android.futures.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.store.linking.LinkingGroup;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesLadderFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "futuresContractId", "Ljava/util/UUID;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "mobileLinkingGroup", "Lcom/robinhood/android/store/linking/LinkingGroup;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/store/linking/LinkingGroup;)V", "getFuturesContractId", "()Ljava/util/UUID;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getMobileLinkingGroup", "()Lcom/robinhood/android/store/linking/LinkingGroup;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesLadderFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<FuturesLadderFragmentKey> CREATOR = new Creator();
    private final UUID futuresContractId;
    private final LinkingGroup mobileLinkingGroup;
    private final Screen sourceScreen;

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<FuturesLadderFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesLadderFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesLadderFragmentKey((UUID) parcel.readSerializable(), (Screen) parcel.readSerializable(), (LinkingGroup) parcel.readParcelable(FuturesLadderFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesLadderFragmentKey[] newArray(int i) {
            return new FuturesLadderFragmentKey[i];
        }
    }

    public static /* synthetic */ FuturesLadderFragmentKey copy$default(FuturesLadderFragmentKey futuresLadderFragmentKey, UUID uuid, Screen screen, LinkingGroup linkingGroup, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = futuresLadderFragmentKey.futuresContractId;
        }
        if ((i & 2) != 0) {
            screen = futuresLadderFragmentKey.sourceScreen;
        }
        if ((i & 4) != 0) {
            linkingGroup = futuresLadderFragmentKey.mobileLinkingGroup;
        }
        return futuresLadderFragmentKey.copy(uuid, screen, linkingGroup);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getFuturesContractId() {
        return this.futuresContractId;
    }

    /* renamed from: component2, reason: from getter */
    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    /* renamed from: component3, reason: from getter */
    public final LinkingGroup getMobileLinkingGroup() {
        return this.mobileLinkingGroup;
    }

    public final FuturesLadderFragmentKey copy(UUID futuresContractId, Screen sourceScreen, LinkingGroup mobileLinkingGroup) {
        Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        return new FuturesLadderFragmentKey(futuresContractId, sourceScreen, mobileLinkingGroup);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesLadderFragmentKey)) {
            return false;
        }
        FuturesLadderFragmentKey futuresLadderFragmentKey = (FuturesLadderFragmentKey) other;
        return Intrinsics.areEqual(this.futuresContractId, futuresLadderFragmentKey.futuresContractId) && Intrinsics.areEqual(this.sourceScreen, futuresLadderFragmentKey.sourceScreen) && Intrinsics.areEqual(this.mobileLinkingGroup, futuresLadderFragmentKey.mobileLinkingGroup);
    }

    public int hashCode() {
        int iHashCode = ((this.futuresContractId.hashCode() * 31) + this.sourceScreen.hashCode()) * 31;
        LinkingGroup linkingGroup = this.mobileLinkingGroup;
        return iHashCode + (linkingGroup == null ? 0 : linkingGroup.hashCode());
    }

    public String toString() {
        return "FuturesLadderFragmentKey(futuresContractId=" + this.futuresContractId + ", sourceScreen=" + this.sourceScreen + ", mobileLinkingGroup=" + this.mobileLinkingGroup + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.futuresContractId);
        dest.writeSerializable(this.sourceScreen);
        dest.writeParcelable(this.mobileLinkingGroup, flags);
    }

    public FuturesLadderFragmentKey(UUID futuresContractId, Screen sourceScreen, LinkingGroup linkingGroup) {
        Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        this.futuresContractId = futuresContractId;
        this.sourceScreen = sourceScreen;
        this.mobileLinkingGroup = linkingGroup;
    }

    public /* synthetic */ FuturesLadderFragmentKey(UUID uuid, Screen screen, LinkingGroup linkingGroup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, screen, (i & 4) != 0 ? null : linkingGroup);
    }

    public final UUID getFuturesContractId() {
        return this.futuresContractId;
    }

    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    public final LinkingGroup getMobileLinkingGroup() {
        return this.mobileLinkingGroup;
    }
}
