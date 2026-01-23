package nummus.p512v1;

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
/* compiled from: FeeTierSourceDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0019\u001aB\u001d\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001b"}, m3636d2 = {"Lnummus/v1/FeeTierSourceDto;", "Lcom/robinhood/idl/EnumDto;", "Lnummus/v1/FeeTierSource;", "Landroid/os/Parcelable;", "", "json_value", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "getDisplay_name", "FEE_TIER_SOURCE_UNSPECIFIED", "FEE_TIER_SOURCE_TRADING_VOLUME", "FEE_TIER_SOURCE_DEPOSIT_INCENTIVE", "FEE_TIER_SOURCE_RH_EMPLOYEE", "FEE_TIER_SOURCE_INTRODUCTORY_PROMO", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public abstract class FeeTierSourceDto implements Dto2<FeeTierSource>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeeTierSourceDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<FeeTierSourceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeeTierSourceDto, FeeTierSource>> binaryBase64Serializer$delegate;
    private final String display_name;
    private final String json_value;
    public static final FeeTierSourceDto FEE_TIER_SOURCE_UNSPECIFIED = new FeeTierSourceDto("FEE_TIER_SOURCE_UNSPECIFIED", 0) { // from class: nummus.v1.FeeTierSourceDto.FEE_TIER_SOURCE_UNSPECIFIED
        {
            String str = "Unspecified";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "Unspecified";
        }

        @Override // com.robinhood.idl.Dto
        public FeeTierSource toProto() {
            return FeeTierSource.FEE_TIER_SOURCE_UNSPECIFIED;
        }
    };
    public static final FeeTierSourceDto FEE_TIER_SOURCE_TRADING_VOLUME = new FeeTierSourceDto("FEE_TIER_SOURCE_TRADING_VOLUME", 1) { // from class: nummus.v1.FeeTierSourceDto.FEE_TIER_SOURCE_TRADING_VOLUME
        {
            String str = "Trading Volume";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "trading_volume";
        }

        @Override // com.robinhood.idl.Dto
        public FeeTierSource toProto() {
            return FeeTierSource.FEE_TIER_SOURCE_TRADING_VOLUME;
        }
    };
    public static final FeeTierSourceDto FEE_TIER_SOURCE_DEPOSIT_INCENTIVE = new FeeTierSourceDto("FEE_TIER_SOURCE_DEPOSIT_INCENTIVE", 2) { // from class: nummus.v1.FeeTierSourceDto.FEE_TIER_SOURCE_DEPOSIT_INCENTIVE
        {
            String str = "Deposit Incentive";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "deposit_incentive";
        }

        @Override // com.robinhood.idl.Dto
        public FeeTierSource toProto() {
            return FeeTierSource.FEE_TIER_SOURCE_DEPOSIT_INCENTIVE;
        }
    };
    public static final FeeTierSourceDto FEE_TIER_SOURCE_RH_EMPLOYEE = new FeeTierSourceDto("FEE_TIER_SOURCE_RH_EMPLOYEE", 3) { // from class: nummus.v1.FeeTierSourceDto.FEE_TIER_SOURCE_RH_EMPLOYEE
        {
            String str = "RH Employee";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "rh_employee";
        }

        @Override // com.robinhood.idl.Dto
        public FeeTierSource toProto() {
            return FeeTierSource.FEE_TIER_SOURCE_RH_EMPLOYEE;
        }
    };
    public static final FeeTierSourceDto FEE_TIER_SOURCE_INTRODUCTORY_PROMO = new FeeTierSourceDto("FEE_TIER_SOURCE_INTRODUCTORY_PROMO", 4) { // from class: nummus.v1.FeeTierSourceDto.FEE_TIER_SOURCE_INTRODUCTORY_PROMO
        {
            String str = "Introductory Promo";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "introductory_promo";
        }

        @Override // com.robinhood.idl.Dto
        public FeeTierSource toProto() {
            return FeeTierSource.FEE_TIER_SOURCE_INTRODUCTORY_PROMO;
        }
    };

    private static final /* synthetic */ FeeTierSourceDto[] $values() {
        return new FeeTierSourceDto[]{FEE_TIER_SOURCE_UNSPECIFIED, FEE_TIER_SOURCE_TRADING_VOLUME, FEE_TIER_SOURCE_DEPOSIT_INCENTIVE, FEE_TIER_SOURCE_RH_EMPLOYEE, FEE_TIER_SOURCE_INTRODUCTORY_PROMO};
    }

    public /* synthetic */ FeeTierSourceDto(String str, int i, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3);
    }

    public static EnumEntries<FeeTierSourceDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeeTierSourceDto(String str, int i, String str2, String str3) {
        this.json_value = str2;
        this.display_name = str3;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    static {
        FeeTierSourceDto[] feeTierSourceDtoArr$values = $values();
        $VALUES = feeTierSourceDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(feeTierSourceDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.FeeTierSourceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeeTierSourceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: FeeTierSourceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/FeeTierSourceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lnummus/v1/FeeTierSourceDto;", "Lnummus/v1/FeeTierSource;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/FeeTierSourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<FeeTierSourceDto, FeeTierSource> {

        /* compiled from: FeeTierSourceDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FeeTierSource.values().length];
                try {
                    iArr[FeeTierSource.FEE_TIER_SOURCE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FeeTierSource.FEE_TIER_SOURCE_TRADING_VOLUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FeeTierSource.FEE_TIER_SOURCE_DEPOSIT_INCENTIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FeeTierSource.FEE_TIER_SOURCE_RH_EMPLOYEE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FeeTierSource.FEE_TIER_SOURCE_INTRODUCTORY_PROMO.ordinal()] = 5;
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

        public final KSerializer<FeeTierSourceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeTierSourceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeTierSourceDto> getBinaryBase64Serializer() {
            return (KSerializer) FeeTierSourceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FeeTierSource> getProtoAdapter() {
            return FeeTierSource.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeTierSourceDto getZeroValue() {
            return FeeTierSourceDto.FEE_TIER_SOURCE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeTierSourceDto fromProto(FeeTierSource proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return FeeTierSourceDto.FEE_TIER_SOURCE_UNSPECIFIED;
            }
            if (i == 2) {
                return FeeTierSourceDto.FEE_TIER_SOURCE_TRADING_VOLUME;
            }
            if (i == 3) {
                return FeeTierSourceDto.FEE_TIER_SOURCE_DEPOSIT_INCENTIVE;
            }
            if (i == 4) {
                return FeeTierSourceDto.FEE_TIER_SOURCE_RH_EMPLOYEE;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return FeeTierSourceDto.FEE_TIER_SOURCE_INTRODUCTORY_PROMO;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeeTierSourceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lnummus/v1/FeeTierSourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/FeeTierSourceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FeeTierSourceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<FeeTierSourceDto, FeeTierSource> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/nummus.v1.FeeTierSource", FeeTierSourceDto.getEntries(), FeeTierSourceDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public FeeTierSourceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (FeeTierSourceDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeeTierSourceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static FeeTierSourceDto valueOf(String str) {
        return (FeeTierSourceDto) Enum.valueOf(FeeTierSourceDto.class, str);
    }

    public static FeeTierSourceDto[] values() {
        return (FeeTierSourceDto[]) $VALUES.clone();
    }
}
