package microgram.contracts.invest_tab_highlights.proto.p494v1;

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
/* compiled from: HighlightTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001b"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "HIGHLIGHT_TYPE_UNSPECIFIED", "TOP_MOVER", "EARNINGS", "EQUITY_PRICE_ALERT", "CRYPTO_PRICE_ALERT", "INCREASED_VOLATILITY", "YEAR_HIGH_LOW", "EC_EVENT", "EC_RESERVED", "FUTURES_TOP_MOVER", "CORTEX_PORTFOLIO_DIGEST", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public abstract class HighlightTypeDto implements Dto2<HighlightType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HighlightTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<HighlightTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<HighlightTypeDto, HighlightType>> binaryBase64Serializer$delegate;
    public static final HighlightTypeDto HIGHLIGHT_TYPE_UNSPECIFIED = new HighlightTypeDto("HIGHLIGHT_TYPE_UNSPECIFIED", 0) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightTypeDto.HIGHLIGHT_TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HighlightType toProto() {
            return HighlightType.HIGHLIGHT_TYPE_UNSPECIFIED;
        }
    };
    public static final HighlightTypeDto TOP_MOVER = new HighlightTypeDto("TOP_MOVER", 1) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightTypeDto.TOP_MOVER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HighlightType toProto() {
            return HighlightType.TOP_MOVER;
        }
    };
    public static final HighlightTypeDto EARNINGS = new HighlightTypeDto("EARNINGS", 2) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightTypeDto.EARNINGS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HighlightType toProto() {
            return HighlightType.EARNINGS;
        }
    };
    public static final HighlightTypeDto EQUITY_PRICE_ALERT = new HighlightTypeDto("EQUITY_PRICE_ALERT", 3) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightTypeDto.EQUITY_PRICE_ALERT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HighlightType toProto() {
            return HighlightType.EQUITY_PRICE_ALERT;
        }
    };
    public static final HighlightTypeDto CRYPTO_PRICE_ALERT = new HighlightTypeDto("CRYPTO_PRICE_ALERT", 4) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightTypeDto.CRYPTO_PRICE_ALERT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HighlightType toProto() {
            return HighlightType.CRYPTO_PRICE_ALERT;
        }
    };
    public static final HighlightTypeDto INCREASED_VOLATILITY = new HighlightTypeDto("INCREASED_VOLATILITY", 5) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightTypeDto.INCREASED_VOLATILITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HighlightType toProto() {
            return HighlightType.INCREASED_VOLATILITY;
        }
    };
    public static final HighlightTypeDto YEAR_HIGH_LOW = new HighlightTypeDto("YEAR_HIGH_LOW", 6) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightTypeDto.YEAR_HIGH_LOW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HighlightType toProto() {
            return HighlightType.YEAR_HIGH_LOW;
        }
    };
    public static final HighlightTypeDto EC_EVENT = new HighlightTypeDto("EC_EVENT", 7) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightTypeDto.EC_EVENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HighlightType toProto() {
            return HighlightType.EC_EVENT;
        }
    };
    public static final HighlightTypeDto EC_RESERVED = new HighlightTypeDto("EC_RESERVED", 8) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightTypeDto.EC_RESERVED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HighlightType toProto() {
            return HighlightType.EC_RESERVED;
        }
    };
    public static final HighlightTypeDto FUTURES_TOP_MOVER = new HighlightTypeDto("FUTURES_TOP_MOVER", 9) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightTypeDto.FUTURES_TOP_MOVER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HighlightType toProto() {
            return HighlightType.FUTURES_TOP_MOVER;
        }
    };
    public static final HighlightTypeDto CORTEX_PORTFOLIO_DIGEST = new HighlightTypeDto("CORTEX_PORTFOLIO_DIGEST", 10) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightTypeDto.CORTEX_PORTFOLIO_DIGEST
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HighlightType toProto() {
            return HighlightType.CORTEX_PORTFOLIO_DIGEST;
        }
    };

    private static final /* synthetic */ HighlightTypeDto[] $values() {
        return new HighlightTypeDto[]{HIGHLIGHT_TYPE_UNSPECIFIED, TOP_MOVER, EARNINGS, EQUITY_PRICE_ALERT, CRYPTO_PRICE_ALERT, INCREASED_VOLATILITY, YEAR_HIGH_LOW, EC_EVENT, EC_RESERVED, FUTURES_TOP_MOVER, CORTEX_PORTFOLIO_DIGEST};
    }

    public /* synthetic */ HighlightTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<HighlightTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HighlightTypeDto(String str, int i) {
    }

    static {
        HighlightTypeDto[] highlightTypeDtoArr$values = $values();
        $VALUES = highlightTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(highlightTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HighlightTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: HighlightTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<HighlightTypeDto, HighlightType> {

        /* compiled from: HighlightTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HighlightType.values().length];
                try {
                    iArr[HighlightType.HIGHLIGHT_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HighlightType.TOP_MOVER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HighlightType.EARNINGS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HighlightType.EQUITY_PRICE_ALERT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[HighlightType.CRYPTO_PRICE_ALERT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[HighlightType.INCREASED_VOLATILITY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[HighlightType.YEAR_HIGH_LOW.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[HighlightType.EC_EVENT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[HighlightType.EC_RESERVED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[HighlightType.FUTURES_TOP_MOVER.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[HighlightType.CORTEX_PORTFOLIO_DIGEST.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HighlightTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HighlightTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HighlightTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) HighlightTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<HighlightType> getProtoAdapter() {
            return HighlightType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HighlightTypeDto getZeroValue() {
            return HighlightTypeDto.HIGHLIGHT_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HighlightTypeDto fromProto(HighlightType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return HighlightTypeDto.HIGHLIGHT_TYPE_UNSPECIFIED;
                case 2:
                    return HighlightTypeDto.TOP_MOVER;
                case 3:
                    return HighlightTypeDto.EARNINGS;
                case 4:
                    return HighlightTypeDto.EQUITY_PRICE_ALERT;
                case 5:
                    return HighlightTypeDto.CRYPTO_PRICE_ALERT;
                case 6:
                    return HighlightTypeDto.INCREASED_VOLATILITY;
                case 7:
                    return HighlightTypeDto.YEAR_HIGH_LOW;
                case 8:
                    return HighlightTypeDto.EC_EVENT;
                case 9:
                    return HighlightTypeDto.EC_RESERVED;
                case 10:
                    return HighlightTypeDto.FUTURES_TOP_MOVER;
                case 11:
                    return HighlightTypeDto.CORTEX_PORTFOLIO_DIGEST;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: HighlightTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<HighlightTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<HighlightTypeDto, HighlightType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/microgram.contracts.invest_tab_highlights.proto.v1.HighlightType", HighlightTypeDto.getEntries(), HighlightTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public HighlightTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (HighlightTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, HighlightTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static HighlightTypeDto valueOf(String str) {
        return (HighlightTypeDto) Enum.valueOf(HighlightTypeDto.class, str);
    }

    public static HighlightTypeDto[] values() {
        return (HighlightTypeDto[]) $VALUES.clone();
    }
}
