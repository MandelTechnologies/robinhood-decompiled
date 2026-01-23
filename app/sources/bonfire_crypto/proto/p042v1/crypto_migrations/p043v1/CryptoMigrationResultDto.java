package bonfire_crypto.proto.p042v1.crypto_migrations.p043v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.MigrationStateDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;

/* compiled from: CryptoMigrationResultDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BU\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0016¨\u00061"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResult;", "Landroid/os/Parcelable;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto$Surrogate;", "surrogate", "<init>", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto$Surrogate;)V", "", "id", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationStateDto;", "state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "started_at", "completed_at", "partner", "failure_reason", "(Ljava/lang/String;Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationStateDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResult;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto$Surrogate;", "getId", "getState", "()Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationStateDto;", "getStarted_at", "()Lj$/time/Instant;", "getPartner", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class CryptoMigrationResultDto implements Dto3<CryptoMigrationResult>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoMigrationResultDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoMigrationResultDto, CryptoMigrationResult>> binaryBase64Serializer$delegate;
    private static final CryptoMigrationResultDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoMigrationResultDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoMigrationResultDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final MigrationStateDto getState() {
        return this.surrogate.getState();
    }

    public final Instant getStarted_at() {
        return this.surrogate.getStarted_at();
    }

    public final String getPartner() {
        return this.surrogate.getPartner();
    }

    public /* synthetic */ CryptoMigrationResultDto(String str, MigrationStateDto migrationStateDto, Instant instant, Instant instant2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MigrationStateDto.INSTANCE.getZeroValue() : migrationStateDto, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoMigrationResultDto(String id, MigrationStateDto state, Instant instant, Instant instant2, String partner, String failure_reason) {
        this(new Surrogate(id, state, instant, instant2, partner, failure_reason));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(partner, "partner");
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CryptoMigrationResult toProto() {
        return new CryptoMigrationResult(this.surrogate.getId(), (MigrationState) this.surrogate.getState().toProto(), this.surrogate.getStarted_at(), this.surrogate.getCompleted_at(), this.surrogate.getPartner(), this.surrogate.getFailure_reason(), null, 64, null);
    }

    public String toString() {
        return "[CryptoMigrationResultDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoMigrationResultDto) && Intrinsics.areEqual(((CryptoMigrationResultDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoMigrationResultDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 92\u00020\u0001:\u0002:9B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010BW\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-RF\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101RF\u0010\f\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010/\u0012\u0004\b4\u0010*\u001a\u0004\b3\u00101R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010'\u0012\u0004\b6\u0010*\u001a\u0004\b5\u0010 R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010'\u0012\u0004\b8\u0010*\u001a\u0004\b7\u0010 ¨\u0006;"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto$Surrogate;", "", "", "id", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationStateDto;", "state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "started_at", "completed_at", "partner", "failure_reason", "<init>", "(Ljava/lang/String;Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationStateDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationStateDto;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_crypto_proto_v1_crypto_migrations_externalRelease", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationStateDto;", "getState", "()Lbonfire_crypto/proto/v1/crypto_migrations/v1/MigrationStateDto;", "getState$annotations", "Lj$/time/Instant;", "getStarted_at", "()Lj$/time/Instant;", "getStarted_at$annotations", "getCompleted_at", "getCompleted_at$annotations", "getPartner", "getPartner$annotations", "getFailure_reason", "getFailure_reason$annotations", "Companion", "$serializer", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Instant completed_at;
        private final String failure_reason;
        private final String id;
        private final String partner;
        private final Instant started_at;
        private final MigrationStateDto state;

        public Surrogate() {
            this((String) null, (MigrationStateDto) null, (Instant) null, (Instant) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.state == surrogate.state && Intrinsics.areEqual(this.started_at, surrogate.started_at) && Intrinsics.areEqual(this.completed_at, surrogate.completed_at) && Intrinsics.areEqual(this.partner, surrogate.partner) && Intrinsics.areEqual(this.failure_reason, surrogate.failure_reason);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.state.hashCode()) * 31;
            Instant instant = this.started_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.completed_at;
            return ((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.partner.hashCode()) * 31) + this.failure_reason.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", state=" + this.state + ", started_at=" + this.started_at + ", completed_at=" + this.completed_at + ", partner=" + this.partner + ", failure_reason=" + this.failure_reason + ")";
        }

        /* compiled from: CryptoMigrationResultDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto$Surrogate;", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoMigrationResultDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, MigrationStateDto migrationStateDto, Instant instant, Instant instant2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.state = MigrationStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = migrationStateDto;
            }
            if ((i & 4) == 0) {
                this.started_at = null;
            } else {
                this.started_at = instant;
            }
            if ((i & 8) == 0) {
                this.completed_at = null;
            } else {
                this.completed_at = instant2;
            }
            if ((i & 16) == 0) {
                this.partner = "";
            } else {
                this.partner = str2;
            }
            if ((i & 32) == 0) {
                this.failure_reason = "";
            } else {
                this.failure_reason = str3;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$bonfire_crypto_proto_v1_crypto_migrations_externalRelease */
        public static final /* synthetic */ void m742xd7d33af6(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (self.state != MigrationStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, MigrationStateDto.Serializer.INSTANCE, self.state);
            }
            Instant instant = self.started_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.completed_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.partner, "")) {
                output.encodeStringElement(serialDesc, 4, self.partner);
            }
            if (Intrinsics.areEqual(self.failure_reason, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.failure_reason);
        }

        public Surrogate(String id, MigrationStateDto state, Instant instant, Instant instant2, String partner, String failure_reason) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(partner, "partner");
            Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
            this.id = id;
            this.state = state;
            this.started_at = instant;
            this.completed_at = instant2;
            this.partner = partner;
            this.failure_reason = failure_reason;
        }

        public /* synthetic */ Surrogate(String str, MigrationStateDto migrationStateDto, Instant instant, Instant instant2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MigrationStateDto.INSTANCE.getZeroValue() : migrationStateDto, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3);
        }

        public final String getId() {
            return this.id;
        }

        public final MigrationStateDto getState() {
            return this.state;
        }

        public final Instant getStarted_at() {
            return this.started_at;
        }

        public final Instant getCompleted_at() {
            return this.completed_at;
        }

        public final String getPartner() {
            return this.partner;
        }

        public final String getFailure_reason() {
            return this.failure_reason;
        }
    }

    /* compiled from: CryptoMigrationResultDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResult;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CryptoMigrationResultDto, CryptoMigrationResult> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoMigrationResultDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoMigrationResultDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoMigrationResultDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoMigrationResultDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoMigrationResult> getProtoAdapter() {
            return CryptoMigrationResult.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoMigrationResultDto getZeroValue() {
            return CryptoMigrationResultDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoMigrationResultDto fromProto(CryptoMigrationResult proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CryptoMigrationResultDto(new Surrogate(proto.getId(), MigrationStateDto.INSTANCE.fromProto(proto.getState()), proto.getStarted_at(), proto.getCompleted_at(), proto.getPartner(), proto.getFailure_reason()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationResultDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoMigrationResultDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoMigrationResultDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoMigrationResultDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CryptoMigrationResultDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationResult", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoMigrationResultDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoMigrationResultDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoMigrationResultDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoMigrationResultDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationResultDto";
        }
    }
}
