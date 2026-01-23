package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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
import kotlinx.serialization.internal.StringSerializer;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotSelectionFooterResponse;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotSelectionFooterResponseDto;

/* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006-,./01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00062"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$Surrogate;)V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto;", "estimated_gain_loss_content", "Lcom/robinhood/idl/IdlDecimal;", "quantity", "", "is_cta_enabled", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto;", "error_content", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto;Lcom/robinhood/idl/IdlDecimal;ZLmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$Surrogate;", "getEstimated_gain_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "()Z", "getError_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto;", "Companion", "Surrogate", "ErrorContentDto", "EstimatedGainLossContentDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class StreamTaxLotSelectionFooterResponseDto implements Dto3<StreamTaxLotSelectionFooterResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamTaxLotSelectionFooterResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamTaxLotSelectionFooterResponseDto, StreamTaxLotSelectionFooterResponse>> binaryBase64Serializer$delegate;
    private static final StreamTaxLotSelectionFooterResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamTaxLotSelectionFooterResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamTaxLotSelectionFooterResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final EstimatedGainLossContentDto getEstimated_gain_loss_content() {
        return this.surrogate.getEstimated_gain_loss_content();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final boolean is_cta_enabled() {
        return this.surrogate.getIs_cta_enabled();
    }

    public final ErrorContentDto getError_content() {
        return this.surrogate.getError_content();
    }

    public /* synthetic */ StreamTaxLotSelectionFooterResponseDto(EstimatedGainLossContentDto estimatedGainLossContentDto, IdlDecimal idlDecimal, boolean z, ErrorContentDto errorContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : estimatedGainLossContentDto, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : errorContentDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotSelectionFooterResponseDto(EstimatedGainLossContentDto estimatedGainLossContentDto, IdlDecimal quantity, boolean z, ErrorContentDto errorContentDto) {
        this(new Surrogate(estimatedGainLossContentDto, quantity, z, errorContentDto));
        Intrinsics.checkNotNullParameter(quantity, "quantity");
    }

    @Override // com.robinhood.idl.Dto
    public StreamTaxLotSelectionFooterResponse toProto() {
        EstimatedGainLossContentDto estimated_gain_loss_content = this.surrogate.getEstimated_gain_loss_content();
        StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent proto = estimated_gain_loss_content != null ? estimated_gain_loss_content.toProto() : null;
        String stringValue = this.surrogate.getQuantity().getStringValue();
        boolean is_cta_enabled = this.surrogate.getIs_cta_enabled();
        ErrorContentDto error_content = this.surrogate.getError_content();
        return new StreamTaxLotSelectionFooterResponse(proto, stringValue, is_cta_enabled, error_content != null ? error_content.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[StreamTaxLotSelectionFooterResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamTaxLotSelectionFooterResponseDto) && Intrinsics.areEqual(((StreamTaxLotSelectionFooterResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265BB\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBA\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b0\u0010)\u001a\u0004\b\n\u0010/R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00101\u0012\u0004\b4\u0010)\u001a\u0004\b2\u00103¨\u00067"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$Surrogate;", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto;", "estimated_gain_loss_content", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity", "", "is_cta_enabled", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto;", "error_content", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto;Lcom/robinhood/idl/IdlDecimal;ZLmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto;Lcom/robinhood/idl/IdlDecimal;ZLmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto;", "getEstimated_gain_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto;", "getEstimated_gain_loss_content$annotations", "()V", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity$annotations", "Z", "()Z", "is_cta_enabled$annotations", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto;", "getError_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto;", "getError_content$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ErrorContentDto error_content;
        private final EstimatedGainLossContentDto estimated_gain_loss_content;
        private final boolean is_cta_enabled;
        private final IdlDecimal quantity;

        public Surrogate() {
            this((EstimatedGainLossContentDto) null, (IdlDecimal) null, false, (ErrorContentDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.estimated_gain_loss_content, surrogate.estimated_gain_loss_content) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && this.is_cta_enabled == surrogate.is_cta_enabled && Intrinsics.areEqual(this.error_content, surrogate.error_content);
        }

        public int hashCode() {
            EstimatedGainLossContentDto estimatedGainLossContentDto = this.estimated_gain_loss_content;
            int iHashCode = (((((estimatedGainLossContentDto == null ? 0 : estimatedGainLossContentDto.hashCode()) * 31) + this.quantity.hashCode()) * 31) + Boolean.hashCode(this.is_cta_enabled)) * 31;
            ErrorContentDto errorContentDto = this.error_content;
            return iHashCode + (errorContentDto != null ? errorContentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(estimated_gain_loss_content=" + this.estimated_gain_loss_content + ", quantity=" + this.quantity + ", is_cta_enabled=" + this.is_cta_enabled + ", error_content=" + this.error_content + ")";
        }

        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamTaxLotSelectionFooterResponseDto7.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EstimatedGainLossContentDto estimatedGainLossContentDto, IdlDecimal idlDecimal, boolean z, ErrorContentDto errorContentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.estimated_gain_loss_content = null;
            } else {
                this.estimated_gain_loss_content = estimatedGainLossContentDto;
            }
            if ((i & 2) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.is_cta_enabled = false;
            } else {
                this.is_cta_enabled = z;
            }
            if ((i & 8) == 0) {
                this.error_content = null;
            } else {
                this.error_content = errorContentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            EstimatedGainLossContentDto estimatedGainLossContentDto = self.estimated_gain_loss_content;
            if (estimatedGainLossContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, EstimatedGainLossContentDto.Serializer.INSTANCE, estimatedGainLossContentDto);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            boolean z = self.is_cta_enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            ErrorContentDto errorContentDto = self.error_content;
            if (errorContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ErrorContentDto.Serializer.INSTANCE, errorContentDto);
            }
        }

        public Surrogate(EstimatedGainLossContentDto estimatedGainLossContentDto, IdlDecimal quantity, boolean z, ErrorContentDto errorContentDto) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.estimated_gain_loss_content = estimatedGainLossContentDto;
            this.quantity = quantity;
            this.is_cta_enabled = z;
            this.error_content = errorContentDto;
        }

        public final EstimatedGainLossContentDto getEstimated_gain_loss_content() {
            return this.estimated_gain_loss_content;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public /* synthetic */ Surrogate(EstimatedGainLossContentDto estimatedGainLossContentDto, IdlDecimal idlDecimal, boolean z, ErrorContentDto errorContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : estimatedGainLossContentDto, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : errorContentDto);
        }

        /* renamed from: is_cta_enabled, reason: from getter */
        public final boolean getIs_cta_enabled() {
            return this.is_cta_enabled;
        }

        public final ErrorContentDto getError_content() {
            return this.error_content;
        }
    }

    /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamTaxLotSelectionFooterResponseDto, StreamTaxLotSelectionFooterResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamTaxLotSelectionFooterResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamTaxLotSelectionFooterResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamTaxLotSelectionFooterResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamTaxLotSelectionFooterResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamTaxLotSelectionFooterResponse> getProtoAdapter() {
            return StreamTaxLotSelectionFooterResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamTaxLotSelectionFooterResponseDto getZeroValue() {
            return StreamTaxLotSelectionFooterResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamTaxLotSelectionFooterResponseDto fromProto(StreamTaxLotSelectionFooterResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent estimated_gain_loss_content = proto.getEstimated_gain_loss_content();
            DefaultConstructorMarker defaultConstructorMarker = null;
            EstimatedGainLossContentDto estimatedGainLossContentDtoFromProto = estimated_gain_loss_content != null ? EstimatedGainLossContentDto.INSTANCE.fromProto(estimated_gain_loss_content) : null;
            IdlDecimal idlDecimal = new IdlDecimal(proto.getQuantity());
            boolean is_cta_enabled = proto.getIs_cta_enabled();
            StreamTaxLotSelectionFooterResponse.ErrorContent error_content = proto.getError_content();
            return new StreamTaxLotSelectionFooterResponseDto(new Surrogate(estimatedGainLossContentDtoFromProto, idlDecimal, is_cta_enabled, error_content != null ? ErrorContentDto.INSTANCE.fromProto(error_content) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamTaxLotSelectionFooterResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamTaxLotSelectionFooterResponseDto(null, null, false, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006#\"$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006("}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$Surrogate;)V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$TypeDto;", "type", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$TypeDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$Surrogate;", "getType", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$TypeDto;", "Companion", "Surrogate", "TypeDto", "InputQuantityExceedsAvailableQuantityDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ErrorContentDto implements Dto3<StreamTaxLotSelectionFooterResponse.ErrorContent>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ErrorContentDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ErrorContentDto, StreamTaxLotSelectionFooterResponse.ErrorContent>> binaryBase64Serializer$delegate;
        private static final ErrorContentDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ErrorContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ErrorContentDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final TypeDto getType() {
            if (this.surrogate.getInput_quantity_exceeds_available_quantity() != null) {
                return new TypeDto.InputQuantityExceedsAvailableQuantity(this.surrogate.getInput_quantity_exceeds_available_quantity());
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ErrorContentDto(TypeDto typeDto) {
            TypeDto.InputQuantityExceedsAvailableQuantity inputQuantityExceedsAvailableQuantity = typeDto instanceof TypeDto.InputQuantityExceedsAvailableQuantity ? (TypeDto.InputQuantityExceedsAvailableQuantity) typeDto : null;
            this(new Surrogate(inputQuantityExceedsAvailableQuantity != null ? inputQuantityExceedsAvailableQuantity.getValue() : null));
        }

        public /* synthetic */ ErrorContentDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : typeDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public StreamTaxLotSelectionFooterResponse.ErrorContent toProto() {
            InputQuantityExceedsAvailableQuantityDto input_quantity_exceeds_available_quantity = this.surrogate.getInput_quantity_exceeds_available_quantity();
            return new StreamTaxLotSelectionFooterResponse.ErrorContent(input_quantity_exceeds_available_quantity != null ? input_quantity_exceeds_available_quantity.toProto() : null, null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[ErrorContentDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ErrorContentDto) && Intrinsics.areEqual(((ErrorContentDto) other).surrogate, this.surrogate);
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
        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$Surrogate;", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;", "input_quantity_exceeds_available_quantity", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;", "getInput_quantity_exceeds_available_quantity", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;", "getInput_quantity_exceeds_available_quantity$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final InputQuantityExceedsAvailableQuantityDto input_quantity_exceeds_available_quantity;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((InputQuantityExceedsAvailableQuantityDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.input_quantity_exceeds_available_quantity, ((Surrogate) other).input_quantity_exceeds_available_quantity);
            }

            public int hashCode() {
                InputQuantityExceedsAvailableQuantityDto inputQuantityExceedsAvailableQuantityDto = this.input_quantity_exceeds_available_quantity;
                if (inputQuantityExceedsAvailableQuantityDto == null) {
                    return 0;
                }
                return inputQuantityExceedsAvailableQuantityDto.hashCode();
            }

            public String toString() {
                return "Surrogate(input_quantity_exceeds_available_quantity=" + this.input_quantity_exceeds_available_quantity + ")";
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return StreamTaxLotSelectionFooterResponseDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, InputQuantityExceedsAvailableQuantityDto inputQuantityExceedsAvailableQuantityDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.input_quantity_exceeds_available_quantity = null;
                } else {
                    this.input_quantity_exceeds_available_quantity = inputQuantityExceedsAvailableQuantityDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                InputQuantityExceedsAvailableQuantityDto inputQuantityExceedsAvailableQuantityDto = self.input_quantity_exceeds_available_quantity;
                if (inputQuantityExceedsAvailableQuantityDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, InputQuantityExceedsAvailableQuantityDto.Serializer.INSTANCE, inputQuantityExceedsAvailableQuantityDto);
                }
            }

            public Surrogate(InputQuantityExceedsAvailableQuantityDto inputQuantityExceedsAvailableQuantityDto) {
                this.input_quantity_exceeds_available_quantity = inputQuantityExceedsAvailableQuantityDto;
            }

            public /* synthetic */ Surrogate(InputQuantityExceedsAvailableQuantityDto inputQuantityExceedsAvailableQuantityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : inputQuantityExceedsAvailableQuantityDto);
            }

            public final InputQuantityExceedsAvailableQuantityDto getInput_quantity_exceeds_available_quantity() {
                return this.input_quantity_exceeds_available_quantity;
            }
        }

        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ErrorContentDto, StreamTaxLotSelectionFooterResponse.ErrorContent> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ErrorContentDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorContentDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorContentDto> getBinaryBase64Serializer() {
                return (KSerializer) ErrorContentDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<StreamTaxLotSelectionFooterResponse.ErrorContent> getProtoAdapter() {
                return StreamTaxLotSelectionFooterResponse.ErrorContent.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorContentDto getZeroValue() {
                return ErrorContentDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorContentDto fromProto(StreamTaxLotSelectionFooterResponse.ErrorContent proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity input_quantity_exceeds_available_quantity = proto.getInput_quantity_exceeds_available_quantity();
                return new ErrorContentDto(new Surrogate(input_quantity_exceeds_available_quantity != null ? InputQuantityExceedsAvailableQuantityDto.INSTANCE.fromProto(input_quantity_exceeds_available_quantity) : null), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamTaxLotSelectionFooterResponseDto.ErrorContentDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ErrorContentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "InputQuantityExceedsAvailableQuantity", "Companion", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$TypeDto$InputQuantityExceedsAvailableQuantity;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @RhGenerated
        public static abstract class TypeDto implements Dto4 {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TypeDto() {
            }

            @Override // com.robinhood.idl.Dto
            public Void toProto() {
                return Dto4.DefaultImpls.toProto(this);
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$TypeDto$InputQuantityExceedsAvailableQuantity;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class InputQuantityExceedsAvailableQuantity extends TypeDto {
                private final InputQuantityExceedsAvailableQuantityDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof InputQuantityExceedsAvailableQuantity) && Intrinsics.areEqual(this.value, ((InputQuantityExceedsAvailableQuantity) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "InputQuantityExceedsAvailableQuantity(value=" + this.value + ")";
                }

                public final InputQuantityExceedsAvailableQuantityDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public InputQuantityExceedsAvailableQuantity(InputQuantityExceedsAvailableQuantityDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto4.Creator<TypeDto, StreamTaxLotSelectionFooterResponse.ErrorContent> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.idl.Dto.Creator
                public Void getZeroValue() {
                    return Dto4.Creator.DefaultImpls.getZeroValue(this);
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamTaxLotSelectionFooterResponse.ErrorContent> getProtoAdapter() {
                    return StreamTaxLotSelectionFooterResponse.ErrorContent.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TypeDto fromProto(StreamTaxLotSelectionFooterResponse.ErrorContent proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getInput_quantity_exceeds_available_quantity() != null) {
                        return new InputQuantityExceedsAvailableQuantity(InputQuantityExceedsAvailableQuantityDto.INSTANCE.fromProto(proto.getInput_quantity_exceeds_available_quantity()));
                    }
                    return null;
                }
            }
        }

        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent$InputQuantityExceedsAvailableQuantity;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "available_quantity", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent$InputQuantityExceedsAvailableQuantity;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto$Surrogate;", "getAvailable_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class InputQuantityExceedsAvailableQuantityDto implements Dto3<StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<InputQuantityExceedsAvailableQuantityDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<InputQuantityExceedsAvailableQuantityDto, StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity>> binaryBase64Serializer$delegate;
            private static final InputQuantityExceedsAvailableQuantityDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ InputQuantityExceedsAvailableQuantityDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private InputQuantityExceedsAvailableQuantityDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final IdlDecimal getAvailable_quantity() {
                return this.surrogate.getAvailable_quantity();
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public InputQuantityExceedsAvailableQuantityDto(IdlDecimal available_quantity) {
                this(new Surrogate(available_quantity));
                Intrinsics.checkNotNullParameter(available_quantity, "available_quantity");
            }

            public /* synthetic */ InputQuantityExceedsAvailableQuantityDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity toProto() {
                return new StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity(this.surrogate.getAvailable_quantity().getStringValue(), null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[InputQuantityExceedsAvailableQuantityDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof InputQuantityExceedsAvailableQuantityDto) && Intrinsics.areEqual(((InputQuantityExceedsAvailableQuantityDto) other).surrogate, this.surrogate);
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
            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B \u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "available_quantity", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getAvailable_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getAvailable_quantity$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal available_quantity;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.available_quantity, ((Surrogate) other).available_quantity);
                }

                public int hashCode() {
                    return this.available_quantity.hashCode();
                }

                public String toString() {
                    return "Surrogate(available_quantity=" + this.available_quantity + ")";
                }

                /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return StreamTaxLotSelectionFooterResponseDto2.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.available_quantity = new IdlDecimal("");
                    } else {
                        this.available_quantity = idlDecimal;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (Intrinsics.areEqual(self.available_quantity, new IdlDecimal(""))) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.available_quantity);
                }

                public Surrogate(IdlDecimal available_quantity) {
                    Intrinsics.checkNotNullParameter(available_quantity, "available_quantity");
                    this.available_quantity = available_quantity;
                }

                public final IdlDecimal getAvailable_quantity() {
                    return this.available_quantity;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                }
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent$InputQuantityExceedsAvailableQuantity;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<InputQuantityExceedsAvailableQuantityDto, StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<InputQuantityExceedsAvailableQuantityDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<InputQuantityExceedsAvailableQuantityDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<InputQuantityExceedsAvailableQuantityDto> getBinaryBase64Serializer() {
                    return (KSerializer) InputQuantityExceedsAvailableQuantityDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity> getProtoAdapter() {
                    return StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public InputQuantityExceedsAvailableQuantityDto getZeroValue() {
                    return InputQuantityExceedsAvailableQuantityDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public InputQuantityExceedsAvailableQuantityDto fromProto(StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new InputQuantityExceedsAvailableQuantityDto(new Surrogate(new IdlDecimal(proto.getAvailable_quantity())), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreamTaxLotSelectionFooterResponseDto.ErrorContentDto.InputQuantityExceedsAvailableQuantityDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new InputQuantityExceedsAvailableQuantityDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<InputQuantityExceedsAvailableQuantityDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, InputQuantityExceedsAvailableQuantityDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public InputQuantityExceedsAvailableQuantityDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new InputQuantityExceedsAvailableQuantityDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4188_4)
                public final String provideIntoMap() {
                    return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$InputQuantityExceedsAvailableQuantityDto";
                }
            }
        }

        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ErrorContentDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse.ErrorContent", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ErrorContentDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ErrorContentDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ErrorContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$ErrorContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto$ErrorContentDto";
            }
        }
    }

    /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007#\"$%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006)"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$Surrogate;)V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto;", "content", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$Surrogate;", "getContent", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto;", "Companion", "Surrogate", "ContentDto", "EstimatedGainContentDto", "EstimatedLossContentDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EstimatedGainLossContentDto implements Dto3<StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<EstimatedGainLossContentDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EstimatedGainLossContentDto, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent>> binaryBase64Serializer$delegate;
        private static final EstimatedGainLossContentDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ EstimatedGainLossContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private EstimatedGainLossContentDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final ContentDto getContent() {
            if (this.surrogate.getEstimated_gain_content() != null) {
                return new ContentDto.EstimatedGainContent(this.surrogate.getEstimated_gain_content());
            }
            if (this.surrogate.getEstimated_loss_content() != null) {
                return new ContentDto.EstimatedLossContent(this.surrogate.getEstimated_loss_content());
            }
            if (this.surrogate.getText_content() != null) {
                return new ContentDto.TextContent(this.surrogate.getText_content());
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public EstimatedGainLossContentDto(ContentDto contentDto) {
            ContentDto.EstimatedGainContent estimatedGainContent = contentDto instanceof ContentDto.EstimatedGainContent ? (ContentDto.EstimatedGainContent) contentDto : null;
            EstimatedGainContentDto value = estimatedGainContent != null ? estimatedGainContent.getValue() : null;
            ContentDto.EstimatedLossContent estimatedLossContent = contentDto instanceof ContentDto.EstimatedLossContent ? (ContentDto.EstimatedLossContent) contentDto : null;
            EstimatedLossContentDto value2 = estimatedLossContent != null ? estimatedLossContent.getValue() : null;
            ContentDto.TextContent textContent = contentDto instanceof ContentDto.TextContent ? (ContentDto.TextContent) contentDto : null;
            this(new Surrogate(value, value2, textContent != null ? textContent.getValue() : null));
        }

        public /* synthetic */ EstimatedGainLossContentDto(ContentDto contentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : contentDto);
        }

        @Override // com.robinhood.idl.Dto
        public StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent toProto() {
            EstimatedGainContentDto estimated_gain_content = this.surrogate.getEstimated_gain_content();
            StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent proto = estimated_gain_content != null ? estimated_gain_content.toProto() : null;
            EstimatedLossContentDto estimated_loss_content = this.surrogate.getEstimated_loss_content();
            return new StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent(proto, estimated_loss_content != null ? estimated_loss_content.toProto() : null, this.surrogate.getText_content(), null, 8, null);
        }

        public String toString() {
            return "[EstimatedGainLossContentDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof EstimatedGainLossContentDto) && Intrinsics.areEqual(((EstimatedGainLossContentDto) other).surrogate, this.surrogate);
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
        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b+\u0010$\u001a\u0004\b*\u0010\u0019¨\u0006."}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$Surrogate;", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;", "estimated_gain_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;", "estimated_loss_content", "", "text_content", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;", "getEstimated_gain_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;", "getEstimated_gain_content$annotations", "()V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;", "getEstimated_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;", "getEstimated_loss_content$annotations", "Ljava/lang/String;", "getText_content", "getText_content$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final EstimatedGainContentDto estimated_gain_content;
            private final EstimatedLossContentDto estimated_loss_content;
            private final String text_content;

            public Surrogate() {
                this((EstimatedGainContentDto) null, (EstimatedLossContentDto) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.estimated_gain_content, surrogate.estimated_gain_content) && Intrinsics.areEqual(this.estimated_loss_content, surrogate.estimated_loss_content) && Intrinsics.areEqual(this.text_content, surrogate.text_content);
            }

            public int hashCode() {
                EstimatedGainContentDto estimatedGainContentDto = this.estimated_gain_content;
                int iHashCode = (estimatedGainContentDto == null ? 0 : estimatedGainContentDto.hashCode()) * 31;
                EstimatedLossContentDto estimatedLossContentDto = this.estimated_loss_content;
                int iHashCode2 = (iHashCode + (estimatedLossContentDto == null ? 0 : estimatedLossContentDto.hashCode())) * 31;
                String str = this.text_content;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(estimated_gain_content=" + this.estimated_gain_content + ", estimated_loss_content=" + this.estimated_loss_content + ", text_content=" + this.text_content + ")";
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return StreamTaxLotSelectionFooterResponseDto6.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, EstimatedGainContentDto estimatedGainContentDto, EstimatedLossContentDto estimatedLossContentDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.estimated_gain_content = null;
                } else {
                    this.estimated_gain_content = estimatedGainContentDto;
                }
                if ((i & 2) == 0) {
                    this.estimated_loss_content = null;
                } else {
                    this.estimated_loss_content = estimatedLossContentDto;
                }
                if ((i & 4) == 0) {
                    this.text_content = null;
                } else {
                    this.text_content = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                EstimatedGainContentDto estimatedGainContentDto = self.estimated_gain_content;
                if (estimatedGainContentDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, EstimatedGainContentDto.Serializer.INSTANCE, estimatedGainContentDto);
                }
                EstimatedLossContentDto estimatedLossContentDto = self.estimated_loss_content;
                if (estimatedLossContentDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, EstimatedLossContentDto.Serializer.INSTANCE, estimatedLossContentDto);
                }
                String str = self.text_content;
                if (str != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
                }
            }

            public Surrogate(EstimatedGainContentDto estimatedGainContentDto, EstimatedLossContentDto estimatedLossContentDto, String str) {
                this.estimated_gain_content = estimatedGainContentDto;
                this.estimated_loss_content = estimatedLossContentDto;
                this.text_content = str;
            }

            public /* synthetic */ Surrogate(EstimatedGainContentDto estimatedGainContentDto, EstimatedLossContentDto estimatedLossContentDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : estimatedGainContentDto, (i & 2) != 0 ? null : estimatedLossContentDto, (i & 4) != 0 ? null : str);
            }

            public final EstimatedGainContentDto getEstimated_gain_content() {
                return this.estimated_gain_content;
            }

            public final EstimatedLossContentDto getEstimated_loss_content() {
                return this.estimated_loss_content;
            }

            public final String getText_content() {
                return this.text_content;
            }
        }

        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<EstimatedGainLossContentDto, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EstimatedGainLossContentDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EstimatedGainLossContentDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EstimatedGainLossContentDto> getBinaryBase64Serializer() {
                return (KSerializer) EstimatedGainLossContentDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent> getProtoAdapter() {
                return StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EstimatedGainLossContentDto getZeroValue() {
                return EstimatedGainLossContentDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EstimatedGainLossContentDto fromProto(StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent estimated_gain_content = proto.getEstimated_gain_content();
                DefaultConstructorMarker defaultConstructorMarker = null;
                EstimatedGainContentDto estimatedGainContentDtoFromProto = estimated_gain_content != null ? EstimatedGainContentDto.INSTANCE.fromProto(estimated_gain_content) : null;
                StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent estimated_loss_content = proto.getEstimated_loss_content();
                return new EstimatedGainLossContentDto(new Surrogate(estimatedGainContentDtoFromProto, estimated_loss_content != null ? EstimatedLossContentDto.INSTANCE.fromProto(estimated_loss_content) : null, proto.getText_content()), defaultConstructorMarker);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamTaxLotSelectionFooterResponseDto.EstimatedGainLossContentDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new EstimatedGainLossContentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "EstimatedGainContent", "EstimatedLossContent", "TextContent", "Companion", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto$EstimatedGainContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto$EstimatedLossContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto$TextContent;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @RhGenerated
        public static abstract class ContentDto implements Dto4 {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ ContentDto(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ContentDto() {
            }

            @Override // com.robinhood.idl.Dto
            public Void toProto() {
                return Dto4.DefaultImpls.toProto(this);
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto$EstimatedGainContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class EstimatedGainContent extends ContentDto {
                private final EstimatedGainContentDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof EstimatedGainContent) && Intrinsics.areEqual(this.value, ((EstimatedGainContent) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "EstimatedGainContent(value=" + this.value + ")";
                }

                public final EstimatedGainContentDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public EstimatedGainContent(EstimatedGainContentDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto$EstimatedLossContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class EstimatedLossContent extends ContentDto {
                private final EstimatedLossContentDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof EstimatedLossContent) && Intrinsics.areEqual(this.value, ((EstimatedLossContent) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "EstimatedLossContent(value=" + this.value + ")";
                }

                public final EstimatedLossContentDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public EstimatedLossContent(EstimatedLossContentDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto$TextContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class TextContent extends ContentDto {
                private final String value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TextContent) && Intrinsics.areEqual(this.value, ((TextContent) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "TextContent(value=" + this.value + ")";
                }

                public final String getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TextContent(String value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$ContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto4.Creator<ContentDto, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.idl.Dto.Creator
                public Void getZeroValue() {
                    return Dto4.Creator.DefaultImpls.getZeroValue(this);
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent> getProtoAdapter() {
                    return StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ContentDto fromProto(StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getEstimated_gain_content() != null) {
                        return new EstimatedGainContent(EstimatedGainContentDto.INSTANCE.fromProto(proto.getEstimated_gain_content()));
                    }
                    if (proto.getEstimated_loss_content() != null) {
                        return new EstimatedLossContent(EstimatedLossContentDto.INSTANCE.fromProto(proto.getEstimated_loss_content()));
                    }
                    if (proto.getText_content() != null) {
                        return new TextContent(proto.getText_content());
                    }
                    return null;
                }
            }
        }

        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedGainContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "estimated_gain_quote_amount", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedGainContent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto$Surrogate;", "getEstimated_gain_quote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class EstimatedGainContentDto implements Dto3<StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<EstimatedGainContentDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<EstimatedGainContentDto, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent>> binaryBase64Serializer$delegate;
            private static final EstimatedGainContentDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ EstimatedGainContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private EstimatedGainContentDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final IdlDecimal getEstimated_gain_quote_amount() {
                return this.surrogate.getEstimated_gain_quote_amount();
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public EstimatedGainContentDto(IdlDecimal estimated_gain_quote_amount) {
                this(new Surrogate(estimated_gain_quote_amount));
                Intrinsics.checkNotNullParameter(estimated_gain_quote_amount, "estimated_gain_quote_amount");
            }

            public /* synthetic */ EstimatedGainContentDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent toProto() {
                return new StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent(this.surrogate.getEstimated_gain_quote_amount().getStringValue(), null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[EstimatedGainContentDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof EstimatedGainContentDto) && Intrinsics.areEqual(((EstimatedGainContentDto) other).surrogate, this.surrogate);
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
            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B \u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "estimated_gain_quote_amount", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getEstimated_gain_quote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getEstimated_gain_quote_amount$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal estimated_gain_quote_amount;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.estimated_gain_quote_amount, ((Surrogate) other).estimated_gain_quote_amount);
                }

                public int hashCode() {
                    return this.estimated_gain_quote_amount.hashCode();
                }

                public String toString() {
                    return "Surrogate(estimated_gain_quote_amount=" + this.estimated_gain_quote_amount + ")";
                }

                /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return StreamTaxLotSelectionFooterResponseDto4.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.estimated_gain_quote_amount = new IdlDecimal("");
                    } else {
                        this.estimated_gain_quote_amount = idlDecimal;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (Intrinsics.areEqual(self.estimated_gain_quote_amount, new IdlDecimal(""))) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.estimated_gain_quote_amount);
                }

                public Surrogate(IdlDecimal estimated_gain_quote_amount) {
                    Intrinsics.checkNotNullParameter(estimated_gain_quote_amount, "estimated_gain_quote_amount");
                    this.estimated_gain_quote_amount = estimated_gain_quote_amount;
                }

                public final IdlDecimal getEstimated_gain_quote_amount() {
                    return this.estimated_gain_quote_amount;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                }
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedGainContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<EstimatedGainContentDto, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<EstimatedGainContentDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<EstimatedGainContentDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<EstimatedGainContentDto> getBinaryBase64Serializer() {
                    return (KSerializer) EstimatedGainContentDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent> getProtoAdapter() {
                    return StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public EstimatedGainContentDto getZeroValue() {
                    return EstimatedGainContentDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public EstimatedGainContentDto fromProto(StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new EstimatedGainContentDto(new Surrogate(new IdlDecimal(proto.getEstimated_gain_quote_amount())), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreamTaxLotSelectionFooterResponseDto.EstimatedGainLossContentDto.EstimatedGainContentDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new EstimatedGainContentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<EstimatedGainContentDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, EstimatedGainContentDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public EstimatedGainContentDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new EstimatedGainContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4188_4)
                public final String provideIntoMap() {
                    return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedGainContentDto";
                }
            }
        }

        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedLossContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "estimated_loss_quote_amount", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedLossContent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto$Surrogate;", "getEstimated_loss_quote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class EstimatedLossContentDto implements Dto3<StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<EstimatedLossContentDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<EstimatedLossContentDto, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent>> binaryBase64Serializer$delegate;
            private static final EstimatedLossContentDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ EstimatedLossContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private EstimatedLossContentDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final IdlDecimal getEstimated_loss_quote_amount() {
                return this.surrogate.getEstimated_loss_quote_amount();
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public EstimatedLossContentDto(IdlDecimal estimated_loss_quote_amount) {
                this(new Surrogate(estimated_loss_quote_amount));
                Intrinsics.checkNotNullParameter(estimated_loss_quote_amount, "estimated_loss_quote_amount");
            }

            public /* synthetic */ EstimatedLossContentDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent toProto() {
                return new StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent(this.surrogate.getEstimated_loss_quote_amount().getStringValue(), null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[EstimatedLossContentDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof EstimatedLossContentDto) && Intrinsics.areEqual(((EstimatedLossContentDto) other).surrogate, this.surrogate);
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
            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B \u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "estimated_loss_quote_amount", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getEstimated_loss_quote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getEstimated_loss_quote_amount$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal estimated_loss_quote_amount;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.estimated_loss_quote_amount, ((Surrogate) other).estimated_loss_quote_amount);
                }

                public int hashCode() {
                    return this.estimated_loss_quote_amount.hashCode();
                }

                public String toString() {
                    return "Surrogate(estimated_loss_quote_amount=" + this.estimated_loss_quote_amount + ")";
                }

                /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return StreamTaxLotSelectionFooterResponseDto5.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.estimated_loss_quote_amount = new IdlDecimal("");
                    } else {
                        this.estimated_loss_quote_amount = idlDecimal;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (Intrinsics.areEqual(self.estimated_loss_quote_amount, new IdlDecimal(""))) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.estimated_loss_quote_amount);
                }

                public Surrogate(IdlDecimal estimated_loss_quote_amount) {
                    Intrinsics.checkNotNullParameter(estimated_loss_quote_amount, "estimated_loss_quote_amount");
                    this.estimated_loss_quote_amount = estimated_loss_quote_amount;
                }

                public final IdlDecimal getEstimated_loss_quote_amount() {
                    return this.estimated_loss_quote_amount;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                }
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedLossContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<EstimatedLossContentDto, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<EstimatedLossContentDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<EstimatedLossContentDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<EstimatedLossContentDto> getBinaryBase64Serializer() {
                    return (KSerializer) EstimatedLossContentDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent> getProtoAdapter() {
                    return StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public EstimatedLossContentDto getZeroValue() {
                    return EstimatedLossContentDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public EstimatedLossContentDto fromProto(StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new EstimatedLossContentDto(new Surrogate(new IdlDecimal(proto.getEstimated_loss_quote_amount())), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreamTaxLotSelectionFooterResponseDto.EstimatedGainLossContentDto.EstimatedLossContentDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new EstimatedLossContentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<EstimatedLossContentDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, EstimatedLossContentDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public EstimatedLossContentDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new EstimatedLossContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4190_6)
                public final String provideIntoMap() {
                    return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$EstimatedLossContentDto";
                }
            }
        }

        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<EstimatedGainLossContentDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EstimatedGainLossContentDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public EstimatedGainLossContentDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new EstimatedGainLossContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4191_7)
            public final String provideIntoMap() {
                return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto$EstimatedGainLossContentDto";
            }
        }
    }

    /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamTaxLotSelectionFooterResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamTaxLotSelectionFooterResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamTaxLotSelectionFooterResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamTaxLotSelectionFooterResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamTaxLotSelectionFooterResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponseDto";
        }
    }
}
