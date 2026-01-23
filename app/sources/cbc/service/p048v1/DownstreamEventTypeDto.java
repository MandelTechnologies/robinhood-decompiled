package cbc.service.p048v1;

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
/* compiled from: DownstreamEventTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0019\u001aB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001b"}, m3636d2 = {"Lcbc/service/v1/DownstreamEventTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcbc/service/v1/DownstreamEventType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "DOWNSTREAM_EVENT_TYPE_UNSPECIFIED", "DOWNSTREAM_EVENT_TYPE_EQUITY", "DOWNSTREAM_EVENT_TYPE_OPTION", "DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION", "DOWNSTREAM_EVENT_TYPE_CRYPTO", "DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER", "DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public abstract class DownstreamEventTypeDto implements Dto2<DownstreamEventType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DownstreamEventTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<DownstreamEventTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DownstreamEventTypeDto, DownstreamEventType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final DownstreamEventTypeDto DOWNSTREAM_EVENT_TYPE_UNSPECIFIED = new DownstreamEventTypeDto("DOWNSTREAM_EVENT_TYPE_UNSPECIFIED", 0) { // from class: cbc.service.v1.DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DownstreamEventType toProto() {
            return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_UNSPECIFIED;
        }
    };
    public static final DownstreamEventTypeDto DOWNSTREAM_EVENT_TYPE_EQUITY = new DownstreamEventTypeDto("DOWNSTREAM_EVENT_TYPE_EQUITY", 1) { // from class: cbc.service.v1.DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_EQUITY
        {
            String str = ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DownstreamEventType toProto() {
            return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_EQUITY;
        }
    };
    public static final DownstreamEventTypeDto DOWNSTREAM_EVENT_TYPE_OPTION = new DownstreamEventTypeDto("DOWNSTREAM_EVENT_TYPE_OPTION", 2) { // from class: cbc.service.v1.DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_OPTION
        {
            String str = AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DownstreamEventType toProto() {
            return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_OPTION;
        }
    };
    public static final DownstreamEventTypeDto DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION = new DownstreamEventTypeDto("DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION", 3) { // from class: cbc.service.v1.DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION
        {
            String str = "equity_and_option";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DownstreamEventType toProto() {
            return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION;
        }
    };
    public static final DownstreamEventTypeDto DOWNSTREAM_EVENT_TYPE_CRYPTO = new DownstreamEventTypeDto("DOWNSTREAM_EVENT_TYPE_CRYPTO", 4) { // from class: cbc.service.v1.DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_CRYPTO
        {
            String str = AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DownstreamEventType toProto() {
            return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_CRYPTO;
        }
    };
    public static final DownstreamEventTypeDto DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER = new DownstreamEventTypeDto("DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER", 5) { // from class: cbc.service.v1.DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER
        {
            String str = "equity_and_option_trailer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DownstreamEventType toProto() {
            return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER;
        }
    };
    public static final DownstreamEventTypeDto DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER = new DownstreamEventTypeDto("DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER", 6) { // from class: cbc.service.v1.DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER
        {
            String str = "crypto_trailer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DownstreamEventType toProto() {
            return DownstreamEventType.DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER;
        }
    };

    private static final /* synthetic */ DownstreamEventTypeDto[] $values() {
        return new DownstreamEventTypeDto[]{DOWNSTREAM_EVENT_TYPE_UNSPECIFIED, DOWNSTREAM_EVENT_TYPE_EQUITY, DOWNSTREAM_EVENT_TYPE_OPTION, DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION, DOWNSTREAM_EVENT_TYPE_CRYPTO, DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER, DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER};
    }

    public /* synthetic */ DownstreamEventTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<DownstreamEventTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DownstreamEventTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        DownstreamEventTypeDto[] downstreamEventTypeDtoArr$values = $values();
        $VALUES = downstreamEventTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(downstreamEventTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: cbc.service.v1.DownstreamEventTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DownstreamEventTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: DownstreamEventTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcbc/service/v1/DownstreamEventTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcbc/service/v1/DownstreamEventTypeDto;", "Lcbc/service/v1/DownstreamEventType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcbc/service/v1/DownstreamEventTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<DownstreamEventTypeDto, DownstreamEventType> {

        /* compiled from: DownstreamEventTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DownstreamEventType.values().length];
                try {
                    iArr[DownstreamEventType.DOWNSTREAM_EVENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DownstreamEventType.DOWNSTREAM_EVENT_TYPE_EQUITY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DownstreamEventType.DOWNSTREAM_EVENT_TYPE_OPTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DownstreamEventType.DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DownstreamEventType.DOWNSTREAM_EVENT_TYPE_CRYPTO.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DownstreamEventType.DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[DownstreamEventType.DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER.ordinal()] = 7;
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

        public final KSerializer<DownstreamEventTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DownstreamEventTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DownstreamEventTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) DownstreamEventTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DownstreamEventType> getProtoAdapter() {
            return DownstreamEventType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DownstreamEventTypeDto getZeroValue() {
            return DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DownstreamEventTypeDto fromProto(DownstreamEventType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_UNSPECIFIED;
                case 2:
                    return DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_EQUITY;
                case 3:
                    return DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_OPTION;
                case 4:
                    return DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION;
                case 5:
                    return DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_CRYPTO;
                case 6:
                    return DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_EQUITY_AND_OPTION_TRAILER;
                case 7:
                    return DownstreamEventTypeDto.DOWNSTREAM_EVENT_TYPE_CRYPTO_TRAILER;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DownstreamEventTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcbc/service/v1/DownstreamEventTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcbc/service/v1/DownstreamEventTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<DownstreamEventTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<DownstreamEventTypeDto, DownstreamEventType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/cbc.service.v1.DownstreamEventType", DownstreamEventTypeDto.getEntries(), DownstreamEventTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public DownstreamEventTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (DownstreamEventTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DownstreamEventTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static DownstreamEventTypeDto valueOf(String str) {
        return (DownstreamEventTypeDto) Enum.valueOf(DownstreamEventTypeDto.class, str);
    }

    public static DownstreamEventTypeDto[] values() {
        return (DownstreamEventTypeDto[]) $VALUES.clone();
    }
}
