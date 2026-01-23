package rosetta.midas.p538v1;

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
/* compiled from: FuturesDiscountFeatureDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\u001d\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lrosetta/midas/v1/FuturesDiscountFeatureDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/midas/v1/FuturesDiscountFeature;", "Landroid/os/Parcelable;", "", "json_value", "", "db_enum", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "getDb_enum", "FUTURES_DISCOUNT_FEATURE_DISABLED", "FUTURES_DISCOUNT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class FuturesDiscountFeatureDto implements Dto2<FuturesDiscountFeature>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FuturesDiscountFeatureDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<FuturesDiscountFeatureDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesDiscountFeatureDto, FuturesDiscountFeature>> binaryBase64Serializer$delegate;
    private final String db_enum;
    private final String json_value;
    public static final FuturesDiscountFeatureDto FUTURES_DISCOUNT_FEATURE_DISABLED = new FuturesDiscountFeatureDto("FUTURES_DISCOUNT_FEATURE_DISABLED", 0) { // from class: rosetta.midas.v1.FuturesDiscountFeatureDto.FUTURES_DISCOUNT_FEATURE_DISABLED
        {
            String str = "index_options_discount_feature_disabled";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "futures_discount_feature_disabled";
        }

        @Override // com.robinhood.idl.Dto
        public FuturesDiscountFeature toProto() {
            return FuturesDiscountFeature.FUTURES_DISCOUNT_FEATURE_DISABLED;
        }
    };
    public static final FuturesDiscountFeatureDto FUTURES_DISCOUNT = new FuturesDiscountFeatureDto("FUTURES_DISCOUNT", 1) { // from class: rosetta.midas.v1.FuturesDiscountFeatureDto.FUTURES_DISCOUNT
        {
            String str = "index_options_discount";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "futures_discount";
        }

        @Override // com.robinhood.idl.Dto
        public FuturesDiscountFeature toProto() {
            return FuturesDiscountFeature.FUTURES_DISCOUNT;
        }
    };

    private static final /* synthetic */ FuturesDiscountFeatureDto[] $values() {
        return new FuturesDiscountFeatureDto[]{FUTURES_DISCOUNT_FEATURE_DISABLED, FUTURES_DISCOUNT};
    }

    public /* synthetic */ FuturesDiscountFeatureDto(String str, int i, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3);
    }

    public static EnumEntries<FuturesDiscountFeatureDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesDiscountFeatureDto(String str, int i, String str2, String str3) {
        this.json_value = str2;
        this.db_enum = str3;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    public final String getDb_enum() {
        return this.db_enum;
    }

    static {
        FuturesDiscountFeatureDto[] futuresDiscountFeatureDtoArr$values = $values();
        $VALUES = futuresDiscountFeatureDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(futuresDiscountFeatureDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.FuturesDiscountFeatureDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesDiscountFeatureDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: FuturesDiscountFeatureDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/FuturesDiscountFeatureDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/midas/v1/FuturesDiscountFeatureDto;", "Lrosetta/midas/v1/FuturesDiscountFeature;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/FuturesDiscountFeatureDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<FuturesDiscountFeatureDto, FuturesDiscountFeature> {

        /* compiled from: FuturesDiscountFeatureDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FuturesDiscountFeature.values().length];
                try {
                    iArr[FuturesDiscountFeature.FUTURES_DISCOUNT_FEATURE_DISABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FuturesDiscountFeature.FUTURES_DISCOUNT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesDiscountFeatureDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesDiscountFeatureDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesDiscountFeatureDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesDiscountFeatureDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesDiscountFeature> getProtoAdapter() {
            return FuturesDiscountFeature.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesDiscountFeatureDto getZeroValue() {
            return FuturesDiscountFeatureDto.FUTURES_DISCOUNT_FEATURE_DISABLED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesDiscountFeatureDto fromProto(FuturesDiscountFeature proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return FuturesDiscountFeatureDto.FUTURES_DISCOUNT_FEATURE_DISABLED;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return FuturesDiscountFeatureDto.FUTURES_DISCOUNT;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesDiscountFeatureDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/midas/v1/FuturesDiscountFeatureDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/FuturesDiscountFeatureDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<FuturesDiscountFeatureDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<FuturesDiscountFeatureDto, FuturesDiscountFeature> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.midas.v1.FuturesDiscountFeature", FuturesDiscountFeatureDto.getEntries(), FuturesDiscountFeatureDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public FuturesDiscountFeatureDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (FuturesDiscountFeatureDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesDiscountFeatureDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static FuturesDiscountFeatureDto valueOf(String str) {
        return (FuturesDiscountFeatureDto) Enum.valueOf(FuturesDiscountFeatureDto.class, str);
    }

    public static FuturesDiscountFeatureDto[] values() {
        return (FuturesDiscountFeatureDto[]) $VALUES.clone();
    }
}
