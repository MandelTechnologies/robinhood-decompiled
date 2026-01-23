package com.robinhood.shared.crypto.acats;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoAcatsDestinations.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/MigrationAssetsListDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/shared/crypto/acats/MigrationAssetsListDest$Args;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Args", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MigrationAssetsListDest extends ComposableDestinationWithArgs<Args> {
    public static final MigrationAssetsListDest INSTANCE = new MigrationAssetsListDest();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<MigrationAssetsListDest> CREATOR = new Creator();

    /* compiled from: CryptoAcatsDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MigrationAssetsListDest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MigrationAssetsListDest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return MigrationAssetsListDest.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MigrationAssetsListDest[] newArray(int i) {
            return new MigrationAssetsListDest[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private MigrationAssetsListDest() {
        super("migration_assets_list_dest", Args.class, null, null, null, 28, null);
    }

    /* compiled from: CryptoAcatsDestinations.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/MigrationAssetsListDest$Args;", "Landroid/os/Parcelable;", "assetListType", "Lcom/robinhood/shared/crypto/acats/AssetListType;", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/acats/AssetRowText;", "<init>", "(Lcom/robinhood/shared/crypto/acats/AssetListType;Lkotlinx/collections/immutable/ImmutableList;)V", "getAssetListType", "()Lcom/robinhood/shared/crypto/acats/AssetListType;", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AssetListType assetListType;
        private final ImmutableList<AssetRowText> rows;

        /* compiled from: CryptoAcatsDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                AssetListType assetListTypeValueOf = AssetListType.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AssetRowText.CREATOR.createFromParcel(parcel));
                }
                return new Args(assetListTypeValueOf, extensions2.toPersistentList(arrayList));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, AssetListType assetListType, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                assetListType = args.assetListType;
            }
            if ((i & 2) != 0) {
                immutableList = args.rows;
            }
            return args.copy(assetListType, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final AssetListType getAssetListType() {
            return this.assetListType;
        }

        public final ImmutableList<AssetRowText> component2() {
            return this.rows;
        }

        public final Args copy(AssetListType assetListType, ImmutableList<AssetRowText> rows) {
            Intrinsics.checkNotNullParameter(assetListType, "assetListType");
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new Args(assetListType, rows);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.assetListType == args.assetListType && Intrinsics.areEqual(this.rows, args.rows);
        }

        public int hashCode() {
            return (this.assetListType.hashCode() * 31) + this.rows.hashCode();
        }

        public String toString() {
            return "Args(assetListType=" + this.assetListType + ", rows=" + this.rows + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.assetListType.name());
            ImmutableList<AssetRowText> immutableList = this.rows;
            dest.writeInt(immutableList.size());
            Iterator<AssetRowText> it = immutableList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }

        public Args(AssetListType assetListType, ImmutableList<AssetRowText> rows) {
            Intrinsics.checkNotNullParameter(assetListType, "assetListType");
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.assetListType = assetListType;
            this.rows = rows;
        }

        public final AssetListType getAssetListType() {
            return this.assetListType;
        }

        public final ImmutableList<AssetRowText> getRows() {
            return this.rows;
        }
    }
}
