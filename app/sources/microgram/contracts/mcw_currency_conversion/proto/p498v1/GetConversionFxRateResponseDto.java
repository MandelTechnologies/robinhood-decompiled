package microgram.contracts.mcw_currency_conversion.proto.p498v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import microgram.contracts.mcw_currency_conversion.proto.p498v1.ConversionFxRateDto;

/* compiled from: GetConversionFxRateResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto$Surrogate;)V", "", "symbol_id", "symbol", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConversionFxRateDto;", "fx_rate", "(Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConversionFxRateDto;)V", "toProto", "()Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto$Surrogate;", "getSymbol_id", "getSymbol", "getFx_rate", "()Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConversionFxRateDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class GetConversionFxRateResponseDto implements Dto3<GetConversionFxRateResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetConversionFxRateResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetConversionFxRateResponseDto, GetConversionFxRateResponse>> binaryBase64Serializer$delegate;
    private static final GetConversionFxRateResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetConversionFxRateResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetConversionFxRateResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getSymbol_id() {
        return this.surrogate.getSymbol_id();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final ConversionFxRateDto getFx_rate() {
        return this.surrogate.getFx_rate();
    }

    public /* synthetic */ GetConversionFxRateResponseDto(String str, String str2, ConversionFxRateDto conversionFxRateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : conversionFxRateDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetConversionFxRateResponseDto(String symbol_id, String symbol, ConversionFxRateDto conversionFxRateDto) {
        this(new Surrogate(symbol_id, symbol, conversionFxRateDto));
        Intrinsics.checkNotNullParameter(symbol_id, "symbol_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
    }

    @Override // com.robinhood.idl.Dto
    public GetConversionFxRateResponse toProto() {
        String symbol_id = this.surrogate.getSymbol_id();
        String symbol = this.surrogate.getSymbol();
        ConversionFxRateDto fx_rate = this.surrogate.getFx_rate();
        return new GetConversionFxRateResponse(symbol_id, symbol, fx_rate != null ? fx_rate.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[GetConversionFxRateResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetConversionFxRateResponseDto) && Intrinsics.areEqual(((GetConversionFxRateResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetConversionFxRateResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010\"\u001a\u0004\b&\u0010'¨\u0006+"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto$Surrogate;", "", "", "symbol_id", "symbol", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConversionFxRateDto;", "fx_rate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConversionFxRateDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConversionFxRateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_mcw_currency_conversion_proto_v1_externalRelease", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSymbol_id", "getSymbol_id$annotations", "()V", "getSymbol", "getSymbol$annotations", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConversionFxRateDto;", "getFx_rate", "()Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConversionFxRateDto;", "getFx_rate$annotations", "Companion", "$serializer", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ConversionFxRateDto fx_rate;
        private final String symbol;
        private final String symbol_id;

        public Surrogate() {
            this((String) null, (String) null, (ConversionFxRateDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.symbol_id, surrogate.symbol_id) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.fx_rate, surrogate.fx_rate);
        }

        public int hashCode() {
            int iHashCode = ((this.symbol_id.hashCode() * 31) + this.symbol.hashCode()) * 31;
            ConversionFxRateDto conversionFxRateDto = this.fx_rate;
            return iHashCode + (conversionFxRateDto == null ? 0 : conversionFxRateDto.hashCode());
        }

        public String toString() {
            return "Surrogate(symbol_id=" + this.symbol_id + ", symbol=" + this.symbol + ", fx_rate=" + this.fx_rate + ")";
        }

        /* compiled from: GetConversionFxRateResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto$Surrogate;", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetConversionFxRateResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, ConversionFxRateDto conversionFxRateDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.symbol_id = "";
            } else {
                this.symbol_id = str;
            }
            if ((i & 2) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str2;
            }
            if ((i & 4) == 0) {
                this.fx_rate = null;
            } else {
                this.fx_rate = conversionFxRateDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_mcw_currency_conversion_proto_v1_externalRelease */
        public static final /* synthetic */ void m3784x2cc4d99d(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.symbol_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.symbol_id);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 1, self.symbol);
            }
            ConversionFxRateDto conversionFxRateDto = self.fx_rate;
            if (conversionFxRateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ConversionFxRateDto.Serializer.INSTANCE, conversionFxRateDto);
            }
        }

        public Surrogate(String symbol_id, String symbol, ConversionFxRateDto conversionFxRateDto) {
            Intrinsics.checkNotNullParameter(symbol_id, "symbol_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol_id = symbol_id;
            this.symbol = symbol;
            this.fx_rate = conversionFxRateDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, ConversionFxRateDto conversionFxRateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : conversionFxRateDto);
        }

        public final String getSymbol_id() {
            return this.symbol_id;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final ConversionFxRateDto getFx_rate() {
            return this.fx_rate;
        }
    }

    /* compiled from: GetConversionFxRateResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetConversionFxRateResponseDto, GetConversionFxRateResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetConversionFxRateResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetConversionFxRateResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetConversionFxRateResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetConversionFxRateResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetConversionFxRateResponse> getProtoAdapter() {
            return GetConversionFxRateResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetConversionFxRateResponseDto getZeroValue() {
            return GetConversionFxRateResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetConversionFxRateResponseDto fromProto(GetConversionFxRateResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String symbol_id = proto.getSymbol_id();
            String symbol = proto.getSymbol();
            ConversionFxRate fx_rate = proto.getFx_rate();
            return new GetConversionFxRateResponseDto(new Surrogate(symbol_id, symbol, fx_rate != null ? ConversionFxRateDto.INSTANCE.fromProto(fx_rate) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.mcw_currency_conversion.proto.v1.GetConversionFxRateResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetConversionFxRateResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetConversionFxRateResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetConversionFxRateResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetConversionFxRateResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.mcw_currency_conversion.proto.v1.GetConversionFxRateResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetConversionFxRateResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetConversionFxRateResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetConversionFxRateResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetConversionFxRateResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "microgram.contracts.mcw_currency_conversion.proto.v1.GetConversionFxRateResponseDto";
        }
    }
}
