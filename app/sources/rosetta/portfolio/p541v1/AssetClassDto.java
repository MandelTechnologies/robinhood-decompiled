package rosetta.portfolio.p541v1;

import android.os.Parcel;
import android.os.Parcelable;
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
/* compiled from: AssetClassDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lrosetta/portfolio/v1/AssetClassDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/portfolio/v1/AssetClass;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ASSET_CLASS_UNSPECIFIED", "ASSET_CLASS_EQUITY", "ASSET_CLASS_OPTION", "ASSET_CLASS_FOREX", "ASSET_CLASS_FUTURES", "ASSET_CLASS_EVENTCONTRACT", "ASSET_CLASS_TOKENIZED_STOCK", "ASSET_CLASS_CRYPTO_PERPETUALS", "ASSET_CLASS_CASH", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class AssetClassDto implements Dto2<AssetClass>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetClassDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AssetClassDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AssetClassDto, AssetClass>> binaryBase64Serializer$delegate;
    public static final AssetClassDto ASSET_CLASS_UNSPECIFIED = new AssetClassDto("ASSET_CLASS_UNSPECIFIED", 0) { // from class: rosetta.portfolio.v1.AssetClassDto.ASSET_CLASS_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClass toProto() {
            return AssetClass.ASSET_CLASS_UNSPECIFIED;
        }
    };
    public static final AssetClassDto ASSET_CLASS_EQUITY = new AssetClassDto("ASSET_CLASS_EQUITY", 1) { // from class: rosetta.portfolio.v1.AssetClassDto.ASSET_CLASS_EQUITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClass toProto() {
            return AssetClass.ASSET_CLASS_EQUITY;
        }
    };
    public static final AssetClassDto ASSET_CLASS_OPTION = new AssetClassDto("ASSET_CLASS_OPTION", 2) { // from class: rosetta.portfolio.v1.AssetClassDto.ASSET_CLASS_OPTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClass toProto() {
            return AssetClass.ASSET_CLASS_OPTION;
        }
    };
    public static final AssetClassDto ASSET_CLASS_FOREX = new AssetClassDto("ASSET_CLASS_FOREX", 3) { // from class: rosetta.portfolio.v1.AssetClassDto.ASSET_CLASS_FOREX
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClass toProto() {
            return AssetClass.ASSET_CLASS_FOREX;
        }
    };
    public static final AssetClassDto ASSET_CLASS_FUTURES = new AssetClassDto("ASSET_CLASS_FUTURES", 4) { // from class: rosetta.portfolio.v1.AssetClassDto.ASSET_CLASS_FUTURES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClass toProto() {
            return AssetClass.ASSET_CLASS_FUTURES;
        }
    };
    public static final AssetClassDto ASSET_CLASS_EVENTCONTRACT = new AssetClassDto("ASSET_CLASS_EVENTCONTRACT", 5) { // from class: rosetta.portfolio.v1.AssetClassDto.ASSET_CLASS_EVENTCONTRACT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClass toProto() {
            return AssetClass.ASSET_CLASS_EVENTCONTRACT;
        }
    };
    public static final AssetClassDto ASSET_CLASS_TOKENIZED_STOCK = new AssetClassDto("ASSET_CLASS_TOKENIZED_STOCK", 6) { // from class: rosetta.portfolio.v1.AssetClassDto.ASSET_CLASS_TOKENIZED_STOCK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClass toProto() {
            return AssetClass.ASSET_CLASS_TOKENIZED_STOCK;
        }
    };
    public static final AssetClassDto ASSET_CLASS_CRYPTO_PERPETUALS = new AssetClassDto("ASSET_CLASS_CRYPTO_PERPETUALS", 7) { // from class: rosetta.portfolio.v1.AssetClassDto.ASSET_CLASS_CRYPTO_PERPETUALS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClass toProto() {
            return AssetClass.ASSET_CLASS_CRYPTO_PERPETUALS;
        }
    };
    public static final AssetClassDto ASSET_CLASS_CASH = new AssetClassDto("ASSET_CLASS_CASH", 8) { // from class: rosetta.portfolio.v1.AssetClassDto.ASSET_CLASS_CASH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClass toProto() {
            return AssetClass.ASSET_CLASS_CASH;
        }
    };

    private static final /* synthetic */ AssetClassDto[] $values() {
        return new AssetClassDto[]{ASSET_CLASS_UNSPECIFIED, ASSET_CLASS_EQUITY, ASSET_CLASS_OPTION, ASSET_CLASS_FOREX, ASSET_CLASS_FUTURES, ASSET_CLASS_EVENTCONTRACT, ASSET_CLASS_TOKENIZED_STOCK, ASSET_CLASS_CRYPTO_PERPETUALS, ASSET_CLASS_CASH};
    }

    public /* synthetic */ AssetClassDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<AssetClassDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AssetClassDto(String str, int i) {
    }

    static {
        AssetClassDto[] assetClassDtoArr$values = $values();
        $VALUES = assetClassDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetClassDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.portfolio.v1.AssetClassDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetClassDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AssetClassDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/portfolio/v1/AssetClassDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/portfolio/v1/AssetClassDto;", "Lrosetta/portfolio/v1/AssetClass;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/portfolio/v1/AssetClassDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AssetClassDto, AssetClass> {

        /* compiled from: AssetClassDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AssetClass.values().length];
                try {
                    iArr[AssetClass.ASSET_CLASS_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AssetClass.ASSET_CLASS_EQUITY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AssetClass.ASSET_CLASS_OPTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AssetClass.ASSET_CLASS_FOREX.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AssetClass.ASSET_CLASS_FUTURES.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AssetClass.ASSET_CLASS_EVENTCONTRACT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AssetClass.ASSET_CLASS_TOKENIZED_STOCK.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AssetClass.ASSET_CLASS_CRYPTO_PERPETUALS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AssetClass.ASSET_CLASS_CASH.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AssetClassDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetClassDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetClassDto> getBinaryBase64Serializer() {
            return (KSerializer) AssetClassDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AssetClass> getProtoAdapter() {
            return AssetClass.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetClassDto getZeroValue() {
            return AssetClassDto.ASSET_CLASS_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetClassDto fromProto(AssetClass proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AssetClassDto.ASSET_CLASS_UNSPECIFIED;
                case 2:
                    return AssetClassDto.ASSET_CLASS_EQUITY;
                case 3:
                    return AssetClassDto.ASSET_CLASS_OPTION;
                case 4:
                    return AssetClassDto.ASSET_CLASS_FOREX;
                case 5:
                    return AssetClassDto.ASSET_CLASS_FUTURES;
                case 6:
                    return AssetClassDto.ASSET_CLASS_EVENTCONTRACT;
                case 7:
                    return AssetClassDto.ASSET_CLASS_TOKENIZED_STOCK;
                case 8:
                    return AssetClassDto.ASSET_CLASS_CRYPTO_PERPETUALS;
                case 9:
                    return AssetClassDto.ASSET_CLASS_CASH;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AssetClassDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/portfolio/v1/AssetClassDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/portfolio/v1/AssetClassDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AssetClassDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AssetClassDto, AssetClass> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.portfolio.v1.AssetClass", AssetClassDto.getEntries(), AssetClassDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AssetClassDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AssetClassDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AssetClassDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AssetClassDto valueOf(String str) {
        return (AssetClassDto) Enum.valueOf(AssetClassDto.class, str);
    }

    public static AssetClassDto[] values() {
        return (AssetClassDto[]) $VALUES.clone();
    }
}
