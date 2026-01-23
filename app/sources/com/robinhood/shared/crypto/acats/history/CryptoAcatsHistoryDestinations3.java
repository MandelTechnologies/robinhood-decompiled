package com.robinhood.shared.crypto.acats.history;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsDetailAssetsResponseDto;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAcatsHistoryDestinations.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/history/CryptoMigrationsDetailAssetsDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponseDto;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsDest, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAcatsHistoryDestinations3 extends ComposableDestinationWithArgs<CryptoMigrationsDetailAssetsResponseDto> {
    public static final CryptoAcatsHistoryDestinations3 INSTANCE = new CryptoAcatsHistoryDestinations3();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<CryptoAcatsHistoryDestinations3> CREATOR = new Creator();

    /* compiled from: CryptoAcatsHistoryDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.acats.history.CryptoMigrationsDetailAssetsDest$Creator */
    public static final class Creator implements Parcelable.Creator<CryptoAcatsHistoryDestinations3> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAcatsHistoryDestinations3 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CryptoAcatsHistoryDestinations3.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAcatsHistoryDestinations3[] newArray(int i) {
            return new CryptoAcatsHistoryDestinations3[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private CryptoAcatsHistoryDestinations3() {
        super("crypto_migrations_detail_assets", CryptoMigrationsDetailAssetsResponseDto.class, null, null, null, 28, null);
    }
}
