package com.robinhood.copilot.proto.p286v1;

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
/* compiled from: PortfolioDigestSectionTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0019\u001aB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED", "PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER", "PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER", "PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER", "PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING", "PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS", "PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class PortfolioDigestSectionTypeDto implements Dto2<PortfolioDigestSectionType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PortfolioDigestSectionTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<PortfolioDigestSectionTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PortfolioDigestSectionTypeDto, PortfolioDigestSectionType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final PortfolioDigestSectionTypeDto PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED = new PortfolioDigestSectionTypeDto("PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED", 0) { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED
        {
            String str = "unspecified";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PortfolioDigestSectionType toProto() {
            return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED;
        }
    };
    public static final PortfolioDigestSectionTypeDto PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER = new PortfolioDigestSectionTypeDto("PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER", 1) { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER
        {
            String str = "market driver";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PortfolioDigestSectionType toProto() {
            return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER;
        }
    };
    public static final PortfolioDigestSectionTypeDto PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER = new PortfolioDigestSectionTypeDto("PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER", 2) { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER
        {
            String str = "return driver";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PortfolioDigestSectionType toProto() {
            return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER;
        }
    };
    public static final PortfolioDigestSectionTypeDto PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER = new PortfolioDigestSectionTypeDto("PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER", 3) { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER
        {
            String str = "top mover";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PortfolioDigestSectionType toProto() {
            return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER;
        }
    };
    public static final PortfolioDigestSectionTypeDto PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING = new PortfolioDigestSectionTypeDto("PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING", 4) { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING
        {
            String str = "breaking";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PortfolioDigestSectionType toProto() {
            return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING;
        }
    };
    public static final PortfolioDigestSectionTypeDto PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS = new PortfolioDigestSectionTypeDto("PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS", 5) { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS
        {
            String str = "events";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PortfolioDigestSectionType toProto() {
            return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS;
        }
    };
    public static final PortfolioDigestSectionTypeDto PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER = new PortfolioDigestSectionTypeDto("PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER", 6) { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER
        {
            String str = "revenue driver";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PortfolioDigestSectionType toProto() {
            return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER;
        }
    };

    private static final /* synthetic */ PortfolioDigestSectionTypeDto[] $values() {
        return new PortfolioDigestSectionTypeDto[]{PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED, PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER, PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER, PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER, PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING, PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS, PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER};
    }

    public /* synthetic */ PortfolioDigestSectionTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<PortfolioDigestSectionTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PortfolioDigestSectionTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        PortfolioDigestSectionTypeDto[] portfolioDigestSectionTypeDtoArr$values = $values();
        $VALUES = portfolioDigestSectionTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(portfolioDigestSectionTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestSectionTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioDigestSectionTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: PortfolioDigestSectionTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<PortfolioDigestSectionTypeDto, PortfolioDigestSectionType> {

        /* compiled from: PortfolioDigestSectionTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PortfolioDigestSectionType.values().length];
                try {
                    iArr[PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PortfolioDigestSectionTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioDigestSectionTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioDigestSectionTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) PortfolioDigestSectionTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PortfolioDigestSectionType> getProtoAdapter() {
            return PortfolioDigestSectionType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioDigestSectionTypeDto getZeroValue() {
            return PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioDigestSectionTypeDto fromProto(PortfolioDigestSectionType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED;
                case 2:
                    return PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER;
                case 3:
                    return PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER;
                case 4:
                    return PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER;
                case 5:
                    return PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING;
                case 6:
                    return PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS;
                case 7:
                    return PortfolioDigestSectionTypeDto.PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PortfolioDigestSectionTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PortfolioDigestSectionTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<PortfolioDigestSectionTypeDto, PortfolioDigestSectionType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/copilot.service.v1.PortfolioDigestSectionType", PortfolioDigestSectionTypeDto.getEntries(), PortfolioDigestSectionTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public PortfolioDigestSectionTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (PortfolioDigestSectionTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PortfolioDigestSectionTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static PortfolioDigestSectionTypeDto valueOf(String str) {
        return (PortfolioDigestSectionTypeDto) Enum.valueOf(PortfolioDigestSectionTypeDto.class, str);
    }

    public static PortfolioDigestSectionTypeDto[] values() {
        return (PortfolioDigestSectionTypeDto[]) $VALUES.clone();
    }
}
