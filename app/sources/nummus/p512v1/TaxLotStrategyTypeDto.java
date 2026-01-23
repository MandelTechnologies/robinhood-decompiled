package nummus.p512v1;

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
/* compiled from: TaxLotStrategyTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0018\u0019B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/TaxLotStrategyTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lnummus/v1/TaxLotStrategyType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "TAX_LOT_STRATEGY_TYPE_UNSPECIFIED", "TAX_LOT_STRATEGY_TYPE_FIRST_IN", "TAX_LOT_STRATEGY_TYPE_LAST_IN", "TAX_LOT_STRATEGY_TYPE_HIGHEST_COST", "TAX_LOT_STRATEGY_TYPE_LOWEST_COST", "TAX_LOT_STRATEGY_TYPE_CUSTOM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class TaxLotStrategyTypeDto implements Dto2<TaxLotStrategyType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TaxLotStrategyTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TaxLotStrategyTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLotStrategyTypeDto, TaxLotStrategyType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final TaxLotStrategyTypeDto TAX_LOT_STRATEGY_TYPE_UNSPECIFIED = new TaxLotStrategyTypeDto("TAX_LOT_STRATEGY_TYPE_UNSPECIFIED", 0) { // from class: nummus.v1.TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaxLotStrategyType toProto() {
            return TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED;
        }
    };
    public static final TaxLotStrategyTypeDto TAX_LOT_STRATEGY_TYPE_FIRST_IN = new TaxLotStrategyTypeDto("TAX_LOT_STRATEGY_TYPE_FIRST_IN", 1) { // from class: nummus.v1.TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_FIRST_IN
        {
            String str = "first_in";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaxLotStrategyType toProto() {
            return TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_FIRST_IN;
        }
    };
    public static final TaxLotStrategyTypeDto TAX_LOT_STRATEGY_TYPE_LAST_IN = new TaxLotStrategyTypeDto("TAX_LOT_STRATEGY_TYPE_LAST_IN", 2) { // from class: nummus.v1.TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_LAST_IN
        {
            String str = "last_in";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaxLotStrategyType toProto() {
            return TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_LAST_IN;
        }
    };
    public static final TaxLotStrategyTypeDto TAX_LOT_STRATEGY_TYPE_HIGHEST_COST = new TaxLotStrategyTypeDto("TAX_LOT_STRATEGY_TYPE_HIGHEST_COST", 3) { // from class: nummus.v1.TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_HIGHEST_COST
        {
            String str = "highest_cost";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaxLotStrategyType toProto() {
            return TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_HIGHEST_COST;
        }
    };
    public static final TaxLotStrategyTypeDto TAX_LOT_STRATEGY_TYPE_LOWEST_COST = new TaxLotStrategyTypeDto("TAX_LOT_STRATEGY_TYPE_LOWEST_COST", 4) { // from class: nummus.v1.TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_LOWEST_COST
        {
            String str = "lowest_cost";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaxLotStrategyType toProto() {
            return TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_LOWEST_COST;
        }
    };
    public static final TaxLotStrategyTypeDto TAX_LOT_STRATEGY_TYPE_CUSTOM = new TaxLotStrategyTypeDto("TAX_LOT_STRATEGY_TYPE_CUSTOM", 5) { // from class: nummus.v1.TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_CUSTOM
        {
            String str = "custom";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TaxLotStrategyType toProto() {
            return TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_CUSTOM;
        }
    };

    private static final /* synthetic */ TaxLotStrategyTypeDto[] $values() {
        return new TaxLotStrategyTypeDto[]{TAX_LOT_STRATEGY_TYPE_UNSPECIFIED, TAX_LOT_STRATEGY_TYPE_FIRST_IN, TAX_LOT_STRATEGY_TYPE_LAST_IN, TAX_LOT_STRATEGY_TYPE_HIGHEST_COST, TAX_LOT_STRATEGY_TYPE_LOWEST_COST, TAX_LOT_STRATEGY_TYPE_CUSTOM};
    }

    public /* synthetic */ TaxLotStrategyTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<TaxLotStrategyTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLotStrategyTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        TaxLotStrategyTypeDto[] taxLotStrategyTypeDtoArr$values = $values();
        $VALUES = taxLotStrategyTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(taxLotStrategyTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.TaxLotStrategyTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLotStrategyTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TaxLotStrategyTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/TaxLotStrategyTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lnummus/v1/TaxLotStrategyTypeDto;", "Lnummus/v1/TaxLotStrategyType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/TaxLotStrategyTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TaxLotStrategyTypeDto, TaxLotStrategyType> {

        /* compiled from: TaxLotStrategyTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TaxLotStrategyType.values().length];
                try {
                    iArr[TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_FIRST_IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_LAST_IN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_HIGHEST_COST.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_LOWEST_COST.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_CUSTOM.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLotStrategyTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotStrategyTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotStrategyTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLotStrategyTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLotStrategyType> getProtoAdapter() {
            return TaxLotStrategyType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotStrategyTypeDto getZeroValue() {
            return TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotStrategyTypeDto fromProto(TaxLotStrategyType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED;
                case 2:
                    return TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_FIRST_IN;
                case 3:
                    return TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_LAST_IN;
                case 4:
                    return TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_HIGHEST_COST;
                case 5:
                    return TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_LOWEST_COST;
                case 6:
                    return TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_CUSTOM;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxLotStrategyTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lnummus/v1/TaxLotStrategyTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/TaxLotStrategyTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<TaxLotStrategyTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TaxLotStrategyTypeDto, TaxLotStrategyType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/nummus.v1.TaxLotStrategyType", TaxLotStrategyTypeDto.getEntries(), TaxLotStrategyTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TaxLotStrategyTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TaxLotStrategyTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLotStrategyTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TaxLotStrategyTypeDto valueOf(String str) {
        return (TaxLotStrategyTypeDto) Enum.valueOf(TaxLotStrategyTypeDto.class, str);
    }

    public static TaxLotStrategyTypeDto[] values() {
        return (TaxLotStrategyTypeDto[]) $VALUES.clone();
    }
}
