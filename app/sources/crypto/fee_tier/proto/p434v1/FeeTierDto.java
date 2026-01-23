package crypto.fee_tier.proto.p434v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: FeeTierDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006'"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto/fee_tier/proto/v1/FeeTier;", "Landroid/os/Parcelable;", "Lcrypto/fee_tier/proto/v1/FeeTierDto$Surrogate;", "surrogate", "<init>", "(Lcrypto/fee_tier/proto/v1/FeeTierDto$Surrogate;)V", "", "tier_id", "Lcom/robinhood/idl/IdlDecimal;", "fee_ratio", "max_volume", "min_volume", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcrypto/fee_tier/proto/v1/FeeTier;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto/fee_tier/proto/v1/FeeTierDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class FeeTierDto implements Dto3<FeeTier>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FeeTierDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeeTierDto, FeeTier>> binaryBase64Serializer$delegate;
    private static final FeeTierDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FeeTierDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeeTierDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ FeeTierDto(String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? null : idlDecimal2, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeeTierDto(String tier_id, IdlDecimal fee_ratio, IdlDecimal idlDecimal, IdlDecimal min_volume) {
        this(new Surrogate(tier_id, fee_ratio, idlDecimal, min_volume));
        Intrinsics.checkNotNullParameter(tier_id, "tier_id");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(min_volume, "min_volume");
    }

    @Override // com.robinhood.idl.Dto
    public FeeTier toProto() {
        String tier_id = this.surrogate.getTier_id();
        String stringValue = this.surrogate.getFee_ratio().getStringValue();
        IdlDecimal max_volume = this.surrogate.getMax_volume();
        return new FeeTier(tier_id, stringValue, max_volume != null ? max_volume.getStringValue() : null, this.surrogate.getMin_volume().getStringValue(), null, 16, null);
    }

    public String toString() {
        return "[FeeTierDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FeeTierDto) && Intrinsics.areEqual(((FeeTierDto) other).surrogate, this.surrogate);
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
    /* compiled from: FeeTierDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B^\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007¢\u0006\u0004\b\u000b\u0010\fBC\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R1\u0010\t\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010)R/\u0010\n\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010'\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010)¨\u00061"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierDto$Surrogate;", "", "", "tier_id", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "fee_ratio", "max_volume", "min_volume", "<init>", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_fee_tier_proto_v1_externalRelease", "(Lcrypto/fee_tier/proto/v1/FeeTierDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTier_id", "getTier_id$annotations", "()V", "Lcom/robinhood/idl/IdlDecimal;", "getFee_ratio", "()Lcom/robinhood/idl/IdlDecimal;", "getFee_ratio$annotations", "getMax_volume", "getMax_volume$annotations", "getMin_volume", "getMin_volume$annotations", "Companion", "$serializer", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal fee_ratio;
        private final IdlDecimal max_volume;
        private final IdlDecimal min_volume;
        private final String tier_id;

        public Surrogate() {
            this((String) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.tier_id, surrogate.tier_id) && Intrinsics.areEqual(this.fee_ratio, surrogate.fee_ratio) && Intrinsics.areEqual(this.max_volume, surrogate.max_volume) && Intrinsics.areEqual(this.min_volume, surrogate.min_volume);
        }

        public int hashCode() {
            int iHashCode = ((this.tier_id.hashCode() * 31) + this.fee_ratio.hashCode()) * 31;
            IdlDecimal idlDecimal = this.max_volume;
            return ((iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31) + this.min_volume.hashCode();
        }

        public String toString() {
            return "Surrogate(tier_id=" + this.tier_id + ", fee_ratio=" + this.fee_ratio + ", max_volume=" + this.max_volume + ", min_volume=" + this.min_volume + ")";
        }

        /* compiled from: FeeTierDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto/fee_tier/proto/v1/FeeTierDto$Surrogate;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FeeTierDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.tier_id = "";
            } else {
                this.tier_id = str;
            }
            if ((i & 2) == 0) {
                this.fee_ratio = new IdlDecimal("");
            } else {
                this.fee_ratio = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.max_volume = null;
            } else {
                this.max_volume = idlDecimal2;
            }
            if ((i & 8) == 0) {
                this.min_volume = new IdlDecimal("");
            } else {
                this.min_volume = idlDecimal3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_fee_tier_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.tier_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.tier_id);
            }
            if (!Intrinsics.areEqual(self.fee_ratio, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.fee_ratio);
            }
            IdlDecimal idlDecimal = self.max_volume;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            if (Intrinsics.areEqual(self.min_volume, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.min_volume);
        }

        public Surrogate(String tier_id, IdlDecimal fee_ratio, IdlDecimal idlDecimal, IdlDecimal min_volume) {
            Intrinsics.checkNotNullParameter(tier_id, "tier_id");
            Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
            Intrinsics.checkNotNullParameter(min_volume, "min_volume");
            this.tier_id = tier_id;
            this.fee_ratio = fee_ratio;
            this.max_volume = idlDecimal;
            this.min_volume = min_volume;
        }

        public /* synthetic */ Surrogate(String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? null : idlDecimal2, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal3);
        }

        public final String getTier_id() {
            return this.tier_id;
        }

        public final IdlDecimal getFee_ratio() {
            return this.fee_ratio;
        }

        public final IdlDecimal getMax_volume() {
            return this.max_volume;
        }

        public final IdlDecimal getMin_volume() {
            return this.min_volume;
        }
    }

    /* compiled from: FeeTierDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto/fee_tier/proto/v1/FeeTierDto;", "Lcrypto/fee_tier/proto/v1/FeeTier;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto/fee_tier/proto/v1/FeeTierDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FeeTierDto, FeeTier> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeeTierDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeTierDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeTierDto> getBinaryBase64Serializer() {
            return (KSerializer) FeeTierDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FeeTier> getProtoAdapter() {
            return FeeTier.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeTierDto getZeroValue() {
            return FeeTierDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeTierDto fromProto(FeeTier proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String tier_id = proto.getTier_id();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getFee_ratio());
            String max_volume = proto.getMax_volume();
            return new FeeTierDto(new Surrogate(tier_id, idlDecimal, max_volume != null ? new IdlDecimal(max_volume) : null, new IdlDecimal(proto.getMin_volume())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto.fee_tier.proto.v1.FeeTierDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeeTierDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FeeTierDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeeTierDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto/fee_tier/proto/v1/FeeTierDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto/fee_tier/proto/v1/FeeTierDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FeeTierDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto.fee_tier.proto.v1.FeeTier", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeeTierDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FeeTierDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FeeTierDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FeeTierDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "crypto.fee_tier.proto.v1.FeeTierDto";
        }
    }
}
