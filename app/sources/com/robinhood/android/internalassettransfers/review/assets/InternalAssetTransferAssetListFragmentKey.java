package com.robinhood.android.internalassettransfers.review.assets;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferAssetListFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/assets/InternalAssetTransferAssetListFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "assets", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "source", "", "fromHistory", "", "<init>", "(Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Ljava/lang/String;Z)V", "getAssets", "()Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "getSource", "()Ljava/lang/String;", "getFromHistory", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InternalAssetTransferAssetListFragmentKey implements FragmentKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<InternalAssetTransferAssetListFragmentKey> CREATOR = new Creator();
    private final UiAssets assets;
    private final boolean fromHistory;
    private final String source;

    /* compiled from: InternalAssetTransferAssetListFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<InternalAssetTransferAssetListFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalAssetTransferAssetListFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InternalAssetTransferAssetListFragmentKey(UiAssets.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalAssetTransferAssetListFragmentKey[] newArray(int i) {
            return new InternalAssetTransferAssetListFragmentKey[i];
        }
    }

    public static /* synthetic */ InternalAssetTransferAssetListFragmentKey copy$default(InternalAssetTransferAssetListFragmentKey internalAssetTransferAssetListFragmentKey, UiAssets uiAssets, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uiAssets = internalAssetTransferAssetListFragmentKey.assets;
        }
        if ((i & 2) != 0) {
            str = internalAssetTransferAssetListFragmentKey.source;
        }
        if ((i & 4) != 0) {
            z = internalAssetTransferAssetListFragmentKey.fromHistory;
        }
        return internalAssetTransferAssetListFragmentKey.copy(uiAssets, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UiAssets getAssets() {
        return this.assets;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFromHistory() {
        return this.fromHistory;
    }

    public final InternalAssetTransferAssetListFragmentKey copy(UiAssets assets, String source, boolean fromHistory) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(source, "source");
        return new InternalAssetTransferAssetListFragmentKey(assets, source, fromHistory);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferAssetListFragmentKey)) {
            return false;
        }
        InternalAssetTransferAssetListFragmentKey internalAssetTransferAssetListFragmentKey = (InternalAssetTransferAssetListFragmentKey) other;
        return Intrinsics.areEqual(this.assets, internalAssetTransferAssetListFragmentKey.assets) && Intrinsics.areEqual(this.source, internalAssetTransferAssetListFragmentKey.source) && this.fromHistory == internalAssetTransferAssetListFragmentKey.fromHistory;
    }

    public int hashCode() {
        return (((this.assets.hashCode() * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.fromHistory);
    }

    public String toString() {
        return "InternalAssetTransferAssetListFragmentKey(assets=" + this.assets + ", source=" + this.source + ", fromHistory=" + this.fromHistory + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.assets.writeToParcel(dest, flags);
        dest.writeString(this.source);
        dest.writeInt(this.fromHistory ? 1 : 0);
    }

    public InternalAssetTransferAssetListFragmentKey(UiAssets assets, String source, boolean z) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(source, "source");
        this.assets = assets;
        this.source = source;
        this.fromHistory = z;
    }

    public final UiAssets getAssets() {
        return this.assets;
    }

    public /* synthetic */ InternalAssetTransferAssetListFragmentKey(UiAssets uiAssets, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiAssets, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z);
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getFromHistory() {
        return this.fromHistory;
    }
}
