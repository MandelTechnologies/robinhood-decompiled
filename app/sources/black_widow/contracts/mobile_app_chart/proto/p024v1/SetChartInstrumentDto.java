package black_widow.contracts.mobile_app_chart.proto.p024v1;

import android.os.Parcel;
import android.os.Parcelable;
import black_widow.contracts.mobile_app_chart.proto.p024v1.CryptoCurrencyPairDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EquityInstrumentDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.FuturesContractDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.FuturesProductDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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

/* compiled from: SetChartInstrumentDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005! \"#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006%"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrument;", "Landroid/os/Parcelable;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$Surrogate;)V", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "instrument", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;)V", "toProto", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrument;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$Surrogate;", "Companion", "Surrogate", "InstrumentDto", "Serializer", "MultibindingModule", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class SetChartInstrumentDto implements Dto3<SetChartInstrument>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SetChartInstrumentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SetChartInstrumentDto, SetChartInstrument>> binaryBase64Serializer$delegate;
    private static final SetChartInstrumentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SetChartInstrumentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SetChartInstrumentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SetChartInstrumentDto(InstrumentDto instrumentDto) {
        InstrumentDto.EquityInstrument equityInstrument = instrumentDto instanceof InstrumentDto.EquityInstrument ? (InstrumentDto.EquityInstrument) instrumentDto : null;
        EquityInstrumentDto value = equityInstrument != null ? equityInstrument.getValue() : null;
        InstrumentDto.CryptoCurrencyPair cryptoCurrencyPair = instrumentDto instanceof InstrumentDto.CryptoCurrencyPair ? (InstrumentDto.CryptoCurrencyPair) instrumentDto : null;
        CryptoCurrencyPairDto value2 = cryptoCurrencyPair != null ? cryptoCurrencyPair.getValue() : null;
        InstrumentDto.FuturesContract futuresContract = instrumentDto instanceof InstrumentDto.FuturesContract ? (InstrumentDto.FuturesContract) instrumentDto : null;
        FuturesContractDto value3 = futuresContract != null ? futuresContract.getValue() : null;
        InstrumentDto.FuturesProduct futuresProduct = instrumentDto instanceof InstrumentDto.FuturesProduct ? (InstrumentDto.FuturesProduct) instrumentDto : null;
        this(new Surrogate(value, value2, value3, futuresProduct != null ? futuresProduct.getValue() : null));
    }

    public /* synthetic */ SetChartInstrumentDto(InstrumentDto instrumentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instrumentDto);
    }

    @Override // com.robinhood.idl.Dto
    public SetChartInstrument toProto() {
        EquityInstrumentDto equity_instrument = this.surrogate.getEquity_instrument();
        EquityInstrument proto = equity_instrument != null ? equity_instrument.toProto() : null;
        CryptoCurrencyPairDto crypto_currency_pair = this.surrogate.getCrypto_currency_pair();
        CryptoCurrencyPair proto2 = crypto_currency_pair != null ? crypto_currency_pair.toProto() : null;
        FuturesContractDto futures_contract = this.surrogate.getFutures_contract();
        FuturesContract proto3 = futures_contract != null ? futures_contract.toProto() : null;
        FuturesProductDto futures_product = this.surrogate.getFutures_product();
        return new SetChartInstrument(proto, proto2, proto3, futures_product != null ? futures_product.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[SetChartInstrumentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SetChartInstrumentDto) && Intrinsics.areEqual(((SetChartInstrumentDto) other).surrogate, this.surrogate);
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
    /* compiled from: SetChartInstrumentDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$Surrogate;", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquityInstrumentDto;", "equity_instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CryptoCurrencyPairDto;", "crypto_currency_pair", "Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesContractDto;", "futures_contract", "Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesProductDto;", "futures_product", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquityInstrumentDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/CryptoCurrencyPairDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesContractDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesProductDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILblack_widow/contracts/mobile_app_chart/proto/v1/EquityInstrumentDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/CryptoCurrencyPairDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesContractDto;Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesProductDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$black_widow_mobile_chart_externalRelease", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquityInstrumentDto;", "getEquity_instrument", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquityInstrumentDto;", "getEquity_instrument$annotations", "()V", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CryptoCurrencyPairDto;", "getCrypto_currency_pair", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/CryptoCurrencyPairDto;", "getCrypto_currency_pair$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesContractDto;", "getFutures_contract", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesContractDto;", "getFutures_contract$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesProductDto;", "getFutures_product", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesProductDto;", "getFutures_product$annotations", "Companion", "$serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CryptoCurrencyPairDto crypto_currency_pair;
        private final EquityInstrumentDto equity_instrument;
        private final FuturesContractDto futures_contract;
        private final FuturesProductDto futures_product;

        public Surrogate() {
            this((EquityInstrumentDto) null, (CryptoCurrencyPairDto) null, (FuturesContractDto) null, (FuturesProductDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.equity_instrument, surrogate.equity_instrument) && Intrinsics.areEqual(this.crypto_currency_pair, surrogate.crypto_currency_pair) && Intrinsics.areEqual(this.futures_contract, surrogate.futures_contract) && Intrinsics.areEqual(this.futures_product, surrogate.futures_product);
        }

        public int hashCode() {
            EquityInstrumentDto equityInstrumentDto = this.equity_instrument;
            int iHashCode = (equityInstrumentDto == null ? 0 : equityInstrumentDto.hashCode()) * 31;
            CryptoCurrencyPairDto cryptoCurrencyPairDto = this.crypto_currency_pair;
            int iHashCode2 = (iHashCode + (cryptoCurrencyPairDto == null ? 0 : cryptoCurrencyPairDto.hashCode())) * 31;
            FuturesContractDto futuresContractDto = this.futures_contract;
            int iHashCode3 = (iHashCode2 + (futuresContractDto == null ? 0 : futuresContractDto.hashCode())) * 31;
            FuturesProductDto futuresProductDto = this.futures_product;
            return iHashCode3 + (futuresProductDto != null ? futuresProductDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(equity_instrument=" + this.equity_instrument + ", crypto_currency_pair=" + this.crypto_currency_pair + ", futures_contract=" + this.futures_contract + ", futures_product=" + this.futures_product + ")";
        }

        /* compiled from: SetChartInstrumentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$Surrogate;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SetChartInstrumentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EquityInstrumentDto equityInstrumentDto, CryptoCurrencyPairDto cryptoCurrencyPairDto, FuturesContractDto futuresContractDto, FuturesProductDto futuresProductDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.equity_instrument = null;
            } else {
                this.equity_instrument = equityInstrumentDto;
            }
            if ((i & 2) == 0) {
                this.crypto_currency_pair = null;
            } else {
                this.crypto_currency_pair = cryptoCurrencyPairDto;
            }
            if ((i & 4) == 0) {
                this.futures_contract = null;
            } else {
                this.futures_contract = futuresContractDto;
            }
            if ((i & 8) == 0) {
                this.futures_product = null;
            } else {
                this.futures_product = futuresProductDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_mobile_chart_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            EquityInstrumentDto equityInstrumentDto = self.equity_instrument;
            if (equityInstrumentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, EquityInstrumentDto.Serializer.INSTANCE, equityInstrumentDto);
            }
            CryptoCurrencyPairDto cryptoCurrencyPairDto = self.crypto_currency_pair;
            if (cryptoCurrencyPairDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CryptoCurrencyPairDto.Serializer.INSTANCE, cryptoCurrencyPairDto);
            }
            FuturesContractDto futuresContractDto = self.futures_contract;
            if (futuresContractDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, FuturesContractDto.Serializer.INSTANCE, futuresContractDto);
            }
            FuturesProductDto futuresProductDto = self.futures_product;
            if (futuresProductDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, FuturesProductDto.Serializer.INSTANCE, futuresProductDto);
            }
        }

        public Surrogate(EquityInstrumentDto equityInstrumentDto, CryptoCurrencyPairDto cryptoCurrencyPairDto, FuturesContractDto futuresContractDto, FuturesProductDto futuresProductDto) {
            this.equity_instrument = equityInstrumentDto;
            this.crypto_currency_pair = cryptoCurrencyPairDto;
            this.futures_contract = futuresContractDto;
            this.futures_product = futuresProductDto;
        }

        public /* synthetic */ Surrogate(EquityInstrumentDto equityInstrumentDto, CryptoCurrencyPairDto cryptoCurrencyPairDto, FuturesContractDto futuresContractDto, FuturesProductDto futuresProductDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : equityInstrumentDto, (i & 2) != 0 ? null : cryptoCurrencyPairDto, (i & 4) != 0 ? null : futuresContractDto, (i & 8) != 0 ? null : futuresProductDto);
        }

        public final EquityInstrumentDto getEquity_instrument() {
            return this.equity_instrument;
        }

        public final CryptoCurrencyPairDto getCrypto_currency_pair() {
            return this.crypto_currency_pair;
        }

        public final FuturesContractDto getFutures_contract() {
            return this.futures_contract;
        }

        public final FuturesProductDto getFutures_product() {
            return this.futures_product;
        }
    }

    /* compiled from: SetChartInstrumentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrument;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SetChartInstrumentDto, SetChartInstrument> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SetChartInstrumentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SetChartInstrumentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SetChartInstrumentDto> getBinaryBase64Serializer() {
            return (KSerializer) SetChartInstrumentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SetChartInstrument> getProtoAdapter() {
            return SetChartInstrument.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SetChartInstrumentDto getZeroValue() {
            return SetChartInstrumentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SetChartInstrumentDto fromProto(SetChartInstrument proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            EquityInstrument equity_instrument = proto.getEquity_instrument();
            DefaultConstructorMarker defaultConstructorMarker = null;
            EquityInstrumentDto equityInstrumentDtoFromProto = equity_instrument != null ? EquityInstrumentDto.INSTANCE.fromProto(equity_instrument) : null;
            CryptoCurrencyPair crypto_currency_pair = proto.getCrypto_currency_pair();
            CryptoCurrencyPairDto cryptoCurrencyPairDtoFromProto = crypto_currency_pair != null ? CryptoCurrencyPairDto.INSTANCE.fromProto(crypto_currency_pair) : null;
            FuturesContract futures_contract = proto.getFutures_contract();
            FuturesContractDto futuresContractDtoFromProto = futures_contract != null ? FuturesContractDto.INSTANCE.fromProto(futures_contract) : null;
            FuturesProduct futures_product = proto.getFutures_product();
            return new SetChartInstrumentDto(new Surrogate(equityInstrumentDtoFromProto, cryptoCurrencyPairDtoFromProto, futuresContractDtoFromProto, futures_product != null ? FuturesProductDto.INSTANCE.fromProto(futures_product) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.SetChartInstrumentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SetChartInstrumentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SetChartInstrumentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SetChartInstrumentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "EquityInstrument", "CryptoCurrencyPair", "FuturesContract", "FuturesProduct", "Companion", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto$CryptoCurrencyPair;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto$EquityInstrument;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto$FuturesContract;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto$FuturesProduct;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class InstrumentDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ InstrumentDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private InstrumentDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: SetChartInstrumentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto$EquityInstrument;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquityInstrumentDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquityInstrumentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquityInstrumentDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquityInstrumentDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EquityInstrument extends InstrumentDto {
            private final EquityInstrumentDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EquityInstrument) && Intrinsics.areEqual(this.value, ((EquityInstrument) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EquityInstrument(value=" + this.value + ")";
            }

            public final EquityInstrumentDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EquityInstrument(EquityInstrumentDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SetChartInstrumentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto$CryptoCurrencyPair;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CryptoCurrencyPairDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/CryptoCurrencyPairDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CryptoCurrencyPairDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/CryptoCurrencyPairDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CryptoCurrencyPair extends InstrumentDto {
            private final CryptoCurrencyPairDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CryptoCurrencyPair) && Intrinsics.areEqual(this.value, ((CryptoCurrencyPair) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CryptoCurrencyPair(value=" + this.value + ")";
            }

            public final CryptoCurrencyPairDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CryptoCurrencyPair(CryptoCurrencyPairDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SetChartInstrumentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto$FuturesContract;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesContractDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesContractDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesContractDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesContractDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FuturesContract extends InstrumentDto {
            private final FuturesContractDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FuturesContract) && Intrinsics.areEqual(this.value, ((FuturesContract) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "FuturesContract(value=" + this.value + ")";
            }

            public final FuturesContractDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FuturesContract(FuturesContractDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SetChartInstrumentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto$FuturesProduct;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesProductDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesProductDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesProductDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/FuturesProductDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FuturesProduct extends InstrumentDto {
            private final FuturesProductDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FuturesProduct) && Intrinsics.areEqual(this.value, ((FuturesProduct) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "FuturesProduct(value=" + this.value + ")";
            }

            public final FuturesProductDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FuturesProduct(FuturesProductDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: SetChartInstrumentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrument;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<InstrumentDto, SetChartInstrument> {
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
            public ProtoAdapter<SetChartInstrument> getProtoAdapter() {
                return SetChartInstrument.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InstrumentDto fromProto(SetChartInstrument proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getEquity_instrument() != null) {
                    return new EquityInstrument(EquityInstrumentDto.INSTANCE.fromProto(proto.getEquity_instrument()));
                }
                if (proto.getCrypto_currency_pair() != null) {
                    return new CryptoCurrencyPair(CryptoCurrencyPairDto.INSTANCE.fromProto(proto.getCrypto_currency_pair()));
                }
                if (proto.getFutures_contract() != null) {
                    return new FuturesContract(FuturesContractDto.INSTANCE.fromProto(proto.getFutures_contract()));
                }
                if (proto.getFutures_product() != null) {
                    return new FuturesProduct(FuturesProductDto.INSTANCE.fromProto(proto.getFutures_product()));
                }
                return null;
            }
        }
    }

    /* compiled from: SetChartInstrumentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SetChartInstrumentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow.contracts.mobile_app_chart.proto.v1.SetChartInstrument", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SetChartInstrumentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SetChartInstrumentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SetChartInstrumentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SetChartInstrumentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "black_widow.contracts.mobile_app_chart.proto.v1.SetChartInstrumentDto";
        }
    }
}
