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
/* compiled from: CurrencyPairTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lrosetta/mainst/CurrencyPairTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/mainst/CurrencyPairType;", "Landroid/os/Parcelable;", "", "db_enum", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDb_enum", "()Ljava/lang/String;", "CURRENCY_PAIR_TYPE_UNSPECIFIED", "CURRENCY_PAIR_FOREX", "CURRENCY_PAIR_CRYPTO", "CURRENCY_PAIR_CRYPTO_PERPETUAL", "CURRENCY_PAIR_TOKENIZED_STOCK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class CurrencyPairTypeDto implements Dto2<CurrencyPairType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CurrencyPairTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<CurrencyPairTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CurrencyPairTypeDto, CurrencyPairType>> binaryBase64Serializer$delegate;
    private final String db_enum;
    public static final CurrencyPairTypeDto CURRENCY_PAIR_TYPE_UNSPECIFIED = new CurrencyPairTypeDto("CURRENCY_PAIR_TYPE_UNSPECIFIED", 0) { // from class: rosetta.mainst.CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CurrencyPairType toProto() {
            return CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED;
        }
    };
    public static final CurrencyPairTypeDto CURRENCY_PAIR_FOREX = new CurrencyPairTypeDto("CURRENCY_PAIR_FOREX", 1) { // from class: rosetta.mainst.CurrencyPairTypeDto.CURRENCY_PAIR_FOREX
        {
            String str = "forex";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CurrencyPairType toProto() {
            return CurrencyPairType.CURRENCY_PAIR_FOREX;
        }
    };
    public static final CurrencyPairTypeDto CURRENCY_PAIR_CRYPTO = new CurrencyPairTypeDto("CURRENCY_PAIR_CRYPTO", 2) { // from class: rosetta.mainst.CurrencyPairTypeDto.CURRENCY_PAIR_CRYPTO
        {
            String str = AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CurrencyPairType toProto() {
            return CurrencyPairType.CURRENCY_PAIR_CRYPTO;
        }
    };
    public static final CurrencyPairTypeDto CURRENCY_PAIR_CRYPTO_PERPETUAL = new CurrencyPairTypeDto("CURRENCY_PAIR_CRYPTO_PERPETUAL", 3) { // from class: rosetta.mainst.CurrencyPairTypeDto.CURRENCY_PAIR_CRYPTO_PERPETUAL
        {
            String str = "crypto_perpetual";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CurrencyPairType toProto() {
            return CurrencyPairType.CURRENCY_PAIR_CRYPTO_PERPETUAL;
        }
    };
    public static final CurrencyPairTypeDto CURRENCY_PAIR_TOKENIZED_STOCK = new CurrencyPairTypeDto("CURRENCY_PAIR_TOKENIZED_STOCK", 4) { // from class: rosetta.mainst.CurrencyPairTypeDto.CURRENCY_PAIR_TOKENIZED_STOCK
        {
            String str = "tokenized_stock";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public CurrencyPairType toProto() {
            return CurrencyPairType.CURRENCY_PAIR_TOKENIZED_STOCK;
        }
    };

    private static final /* synthetic */ CurrencyPairTypeDto[] $values() {
        return new CurrencyPairTypeDto[]{CURRENCY_PAIR_TYPE_UNSPECIFIED, CURRENCY_PAIR_FOREX, CURRENCY_PAIR_CRYPTO, CURRENCY_PAIR_CRYPTO_PERPETUAL, CURRENCY_PAIR_TOKENIZED_STOCK};
    }

    public /* synthetic */ CurrencyPairTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<CurrencyPairTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CurrencyPairTypeDto(String str, int i, String str2) {
        this.db_enum = str2;
    }

    public final String getDb_enum() {
        return this.db_enum;
    }

    static {
        CurrencyPairTypeDto[] currencyPairTypeDtoArr$values = $values();
        $VALUES = currencyPairTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(currencyPairTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.mainst.CurrencyPairTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyPairTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: CurrencyPairTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/mainst/CurrencyPairTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/mainst/CurrencyPairTypeDto;", "Lrosetta/mainst/CurrencyPairType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/mainst/CurrencyPairTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<CurrencyPairTypeDto, CurrencyPairType> {

        /* compiled from: CurrencyPairTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CurrencyPairType.values().length];
                try {
                    iArr[CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CurrencyPairType.CURRENCY_PAIR_FOREX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CurrencyPairType.CURRENCY_PAIR_CRYPTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CurrencyPairType.CURRENCY_PAIR_CRYPTO_PERPETUAL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CurrencyPairType.CURRENCY_PAIR_TOKENIZED_STOCK.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CurrencyPairTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyPairTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyPairTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) CurrencyPairTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CurrencyPairType> getProtoAdapter() {
            return CurrencyPairType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyPairTypeDto getZeroValue() {
            return CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyPairTypeDto fromProto(CurrencyPairType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_UNSPECIFIED;
            }
            if (i == 2) {
                return CurrencyPairTypeDto.CURRENCY_PAIR_FOREX;
            }
            if (i == 3) {
                return CurrencyPairTypeDto.CURRENCY_PAIR_CRYPTO;
            }
            if (i == 4) {
                return CurrencyPairTypeDto.CURRENCY_PAIR_CRYPTO_PERPETUAL;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return CurrencyPairTypeDto.CURRENCY_PAIR_TOKENIZED_STOCK;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CurrencyPairTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/mainst/CurrencyPairTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/mainst/CurrencyPairTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<CurrencyPairTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<CurrencyPairTypeDto, CurrencyPairType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.mainst.CurrencyPairType", CurrencyPairTypeDto.getEntries(), CurrencyPairTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public CurrencyPairTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (CurrencyPairTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CurrencyPairTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static CurrencyPairTypeDto valueOf(String str) {
        return (CurrencyPairTypeDto) Enum.valueOf(CurrencyPairTypeDto.class, str);
    }

    public static CurrencyPairTypeDto[] values() {
        return (CurrencyPairTypeDto[]) $VALUES.clone();
    }
}
