package rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InstrumentTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001e\u001fB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006 "}, m3636d2 = {"Lrosetta/mainst/InstrumentTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/mainst/InstrumentType;", "Landroid/os/Parcelable;", "", "db_enum", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDb_enum", "()Ljava/lang/String;", "INSTRUMENT_TYPE_UNSPECIFIED", "EQUITY", "OPTION", "CRYPTO", "FOREX", "CURRENCY", "FUTURES", "INDEX", "EVENT_CONTRACT", "CRYPTO_PERPETUAL", "INSTRUMENT_TYPE_FIAT", "OPTION_CHAIN", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class InstrumentTypeDto implements Dto2<InstrumentType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstrumentTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<InstrumentTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InstrumentTypeDto, InstrumentType>> binaryBase64Serializer$delegate;
    private final String db_enum;
    public static final InstrumentTypeDto INSTRUMENT_TYPE_UNSPECIFIED = new InstrumentTypeDto("INSTRUMENT_TYPE_UNSPECIFIED", 0) { // from class: rosetta.mainst.InstrumentTypeDto.INSTRUMENT_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InstrumentType toProto() {
            return InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
        }
    };
    public static final InstrumentTypeDto EQUITY = new InstrumentTypeDto("EQUITY", 1) { // from class: rosetta.mainst.InstrumentTypeDto.EQUITY
        {
            String str = ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InstrumentType toProto() {
            return InstrumentType.EQUITY;
        }
    };
    public static final InstrumentTypeDto OPTION = new InstrumentTypeDto("OPTION", 2) { // from class: rosetta.mainst.InstrumentTypeDto.OPTION
        {
            String str = AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InstrumentType toProto() {
            return InstrumentType.OPTION;
        }
    };
    public static final InstrumentTypeDto CRYPTO = new InstrumentTypeDto("CRYPTO", 3) { // from class: rosetta.mainst.InstrumentTypeDto.CRYPTO
        {
            String str = AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InstrumentType toProto() {
            return InstrumentType.CRYPTO;
        }
    };
    public static final InstrumentTypeDto FOREX = new InstrumentTypeDto("FOREX", 4) { // from class: rosetta.mainst.InstrumentTypeDto.FOREX
        {
            String str = "forex";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InstrumentType toProto() {
            return InstrumentType.FOREX;
        }
    };
    public static final InstrumentTypeDto CURRENCY = new InstrumentTypeDto("CURRENCY", 5) { // from class: rosetta.mainst.InstrumentTypeDto.CURRENCY
        {
            String str = "currency";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InstrumentType toProto() {
            return InstrumentType.CURRENCY;
        }
    };
    public static final InstrumentTypeDto FUTURES = new InstrumentTypeDto("FUTURES", 6) { // from class: rosetta.mainst.InstrumentTypeDto.FUTURES
        {
            String str = "futures";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InstrumentType toProto() {
            return InstrumentType.FUTURES;
        }
    };
    public static final InstrumentTypeDto INDEX = new InstrumentTypeDto("INDEX", 7) { // from class: rosetta.mainst.InstrumentTypeDto.INDEX
        {
            String str = ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InstrumentType toProto() {
            return InstrumentType.INDEX;
        }
    };
    public static final InstrumentTypeDto EVENT_CONTRACT = new InstrumentTypeDto("EVENT_CONTRACT", 8) { // from class: rosetta.mainst.InstrumentTypeDto.EVENT_CONTRACT
        {
            String str = "event_contract";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InstrumentType toProto() {
            return InstrumentType.EVENT_CONTRACT;
        }
    };
    public static final InstrumentTypeDto CRYPTO_PERPETUAL = new InstrumentTypeDto("CRYPTO_PERPETUAL", 9) { // from class: rosetta.mainst.InstrumentTypeDto.CRYPTO_PERPETUAL
        {
            String str = "crypto_perpetual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InstrumentType toProto() {
            return InstrumentType.CRYPTO_PERPETUAL;
        }
    };
    public static final InstrumentTypeDto INSTRUMENT_TYPE_FIAT = new InstrumentTypeDto("INSTRUMENT_TYPE_FIAT", 10) { // from class: rosetta.mainst.InstrumentTypeDto.INSTRUMENT_TYPE_FIAT
        {
            String str = "instrument_type_fiat";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InstrumentType toProto() {
            return InstrumentType.INSTRUMENT_TYPE_FIAT;
        }
    };
    public static final InstrumentTypeDto OPTION_CHAIN = new InstrumentTypeDto("OPTION_CHAIN", 11) { // from class: rosetta.mainst.InstrumentTypeDto.OPTION_CHAIN
        {
            String str = "option_chain";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public InstrumentType toProto() {
            return InstrumentType.OPTION_CHAIN;
        }
    };

    private static final /* synthetic */ InstrumentTypeDto[] $values() {
        return new InstrumentTypeDto[]{INSTRUMENT_TYPE_UNSPECIFIED, EQUITY, OPTION, CRYPTO, FOREX, CURRENCY, FUTURES, INDEX, EVENT_CONTRACT, CRYPTO_PERPETUAL, INSTRUMENT_TYPE_FIAT, OPTION_CHAIN};
    }

    public /* synthetic */ InstrumentTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<InstrumentTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InstrumentTypeDto(String str, int i, String str2) {
        this.db_enum = str2;
    }

    public final String getDb_enum() {
        return this.db_enum;
    }

    static {
        InstrumentTypeDto[] instrumentTypeDtoArr$values = $values();
        $VALUES = instrumentTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(instrumentTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.mainst.InstrumentTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: InstrumentTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/mainst/InstrumentTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/mainst/InstrumentTypeDto;", "Lrosetta/mainst/InstrumentType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/mainst/InstrumentTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<InstrumentTypeDto, InstrumentType> {

        /* compiled from: InstrumentTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InstrumentType.values().length];
                try {
                    iArr[InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InstrumentType.EQUITY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InstrumentType.OPTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InstrumentType.CRYPTO.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[InstrumentType.FOREX.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[InstrumentType.CURRENCY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[InstrumentType.FUTURES.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[InstrumentType.INDEX.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[InstrumentType.EVENT_CONTRACT.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[InstrumentType.CRYPTO_PERPETUAL.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[InstrumentType.INSTRUMENT_TYPE_FIAT.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[InstrumentType.OPTION_CHAIN.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InstrumentTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InstrumentTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InstrumentTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) InstrumentTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InstrumentType> getProtoAdapter() {
            return InstrumentType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InstrumentTypeDto getZeroValue() {
            return InstrumentTypeDto.INSTRUMENT_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InstrumentTypeDto fromProto(InstrumentType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return InstrumentTypeDto.INSTRUMENT_TYPE_UNSPECIFIED;
                case 2:
                    return InstrumentTypeDto.EQUITY;
                case 3:
                    return InstrumentTypeDto.OPTION;
                case 4:
                    return InstrumentTypeDto.CRYPTO;
                case 5:
                    return InstrumentTypeDto.FOREX;
                case 6:
                    return InstrumentTypeDto.CURRENCY;
                case 7:
                    return InstrumentTypeDto.FUTURES;
                case 8:
                    return InstrumentTypeDto.INDEX;
                case 9:
                    return InstrumentTypeDto.EVENT_CONTRACT;
                case 10:
                    return InstrumentTypeDto.CRYPTO_PERPETUAL;
                case 11:
                    return InstrumentTypeDto.INSTRUMENT_TYPE_FIAT;
                case 12:
                    return InstrumentTypeDto.OPTION_CHAIN;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InstrumentTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/mainst/InstrumentTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/mainst/InstrumentTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InstrumentTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<InstrumentTypeDto, InstrumentType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.mainst.InstrumentType", InstrumentTypeDto.getEntries(), InstrumentTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public InstrumentTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (InstrumentTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InstrumentTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static InstrumentTypeDto valueOf(String str) {
        return (InstrumentTypeDto) Enum.valueOf(InstrumentTypeDto.class, str);
    }

    public static InstrumentTypeDto[] values() {
        return (InstrumentTypeDto[]) $VALUES.clone();
    }
}
