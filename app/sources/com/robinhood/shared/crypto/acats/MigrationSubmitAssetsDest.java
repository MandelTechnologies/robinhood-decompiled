package com.robinhood.shared.crypto.acats;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import crypto_portkey.service.p443v1.ProcessMigrationAuthedResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAcatsDestinations.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/MigrationSubmitAssetsDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/shared/crypto/acats/MigrationSubmitAssetsDest$Args;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Args", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MigrationSubmitAssetsDest extends ComposableDestinationWithArgs<Args> {
    public static final MigrationSubmitAssetsDest INSTANCE = new MigrationSubmitAssetsDest();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<MigrationSubmitAssetsDest> CREATOR = new Creator();

    /* compiled from: CryptoAcatsDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MigrationSubmitAssetsDest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MigrationSubmitAssetsDest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return MigrationSubmitAssetsDest.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MigrationSubmitAssetsDest[] newArray(int i) {
            return new MigrationSubmitAssetsDest[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private MigrationSubmitAssetsDest() {
        super("migration_submit_assets_dest", Args.class, null, null, null, 28, null);
    }

    /* compiled from: CryptoAcatsDestinations.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/MigrationSubmitAssetsDest$Args;", "Landroid/os/Parcelable;", "migrationResponse", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "refId", "", "<init>", "(Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;Ljava/lang/String;)V", "getMigrationResponse", "()Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "getRefId", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ProcessMigrationAuthedResponseDto migrationResponse;
        private final String refId;

        /* compiled from: CryptoAcatsDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ProcessMigrationAuthedResponseDto) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                processMigrationAuthedResponseDto = args.migrationResponse;
            }
            if ((i & 2) != 0) {
                str = args.refId;
            }
            return args.copy(processMigrationAuthedResponseDto, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ProcessMigrationAuthedResponseDto getMigrationResponse() {
            return this.migrationResponse;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRefId() {
            return this.refId;
        }

        public final Args copy(ProcessMigrationAuthedResponseDto migrationResponse, String refId) {
            Intrinsics.checkNotNullParameter(migrationResponse, "migrationResponse");
            Intrinsics.checkNotNullParameter(refId, "refId");
            return new Args(migrationResponse, refId);
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
            return Intrinsics.areEqual(this.migrationResponse, args.migrationResponse) && Intrinsics.areEqual(this.refId, args.refId);
        }

        public int hashCode() {
            return (this.migrationResponse.hashCode() * 31) + this.refId.hashCode();
        }

        public String toString() {
            return "Args(migrationResponse=" + this.migrationResponse + ", refId=" + this.refId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.migrationResponse, flags);
            dest.writeString(this.refId);
        }

        public Args(ProcessMigrationAuthedResponseDto migrationResponse, String refId) {
            Intrinsics.checkNotNullParameter(migrationResponse, "migrationResponse");
            Intrinsics.checkNotNullParameter(refId, "refId");
            this.migrationResponse = migrationResponse;
            this.refId = refId;
        }

        public final ProcessMigrationAuthedResponseDto getMigrationResponse() {
            return this.migrationResponse;
        }

        public final String getRefId() {
            return this.refId;
        }
    }
}
