package rosetta.instrument;

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
/* compiled from: IPOAccessStatusDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001a\u001bB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001c"}, m3636d2 = {"Lrosetta/instrument/IPOAccessStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/instrument/IPOAccessStatus;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "IPO_ACCESS_STATUS_UNSPECIFIED", "IPO_ACCESS_STATUS_EMPTY", "IPO_ACCESS_STATUS_S1_FILED", "IPO_ACCESS_STATUS_PRICE_INITIALIZED", "IPO_ACCESS_STATUS_PRICE_FINALIZED", "IPO_ACCESS_STATUS_PUBLIC", "IPO_ACCESS_STATUS_CANCELED", "IPO_ACCESS_STATUS_DELAYED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.instrument_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public abstract class IPOAccessStatusDto implements Dto2<IPOAccessStatus>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IPOAccessStatusDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<IPOAccessStatusDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IPOAccessStatusDto, IPOAccessStatus>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final IPOAccessStatusDto IPO_ACCESS_STATUS_UNSPECIFIED = new IPOAccessStatusDto("IPO_ACCESS_STATUS_UNSPECIFIED", 0) { // from class: rosetta.instrument.IPOAccessStatusDto.IPO_ACCESS_STATUS_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IPOAccessStatus toProto() {
            return IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED;
        }
    };
    public static final IPOAccessStatusDto IPO_ACCESS_STATUS_EMPTY = new IPOAccessStatusDto("IPO_ACCESS_STATUS_EMPTY", 1) { // from class: rosetta.instrument.IPOAccessStatusDto.IPO_ACCESS_STATUS_EMPTY
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IPOAccessStatus toProto() {
            return IPOAccessStatus.IPO_ACCESS_STATUS_EMPTY;
        }
    };
    public static final IPOAccessStatusDto IPO_ACCESS_STATUS_S1_FILED = new IPOAccessStatusDto("IPO_ACCESS_STATUS_S1_FILED", 2) { // from class: rosetta.instrument.IPOAccessStatusDto.IPO_ACCESS_STATUS_S1_FILED
        {
            String str = "s1_filed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IPOAccessStatus toProto() {
            return IPOAccessStatus.IPO_ACCESS_STATUS_S1_FILED;
        }
    };
    public static final IPOAccessStatusDto IPO_ACCESS_STATUS_PRICE_INITIALIZED = new IPOAccessStatusDto("IPO_ACCESS_STATUS_PRICE_INITIALIZED", 3) { // from class: rosetta.instrument.IPOAccessStatusDto.IPO_ACCESS_STATUS_PRICE_INITIALIZED
        {
            String str = "price_initialized";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IPOAccessStatus toProto() {
            return IPOAccessStatus.IPO_ACCESS_STATUS_PRICE_INITIALIZED;
        }
    };
    public static final IPOAccessStatusDto IPO_ACCESS_STATUS_PRICE_FINALIZED = new IPOAccessStatusDto("IPO_ACCESS_STATUS_PRICE_FINALIZED", 4) { // from class: rosetta.instrument.IPOAccessStatusDto.IPO_ACCESS_STATUS_PRICE_FINALIZED
        {
            String str = "price_finalized";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IPOAccessStatus toProto() {
            return IPOAccessStatus.IPO_ACCESS_STATUS_PRICE_FINALIZED;
        }
    };
    public static final IPOAccessStatusDto IPO_ACCESS_STATUS_PUBLIC = new IPOAccessStatusDto("IPO_ACCESS_STATUS_PUBLIC", 5) { // from class: rosetta.instrument.IPOAccessStatusDto.IPO_ACCESS_STATUS_PUBLIC
        {
            String str = "public";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IPOAccessStatus toProto() {
            return IPOAccessStatus.IPO_ACCESS_STATUS_PUBLIC;
        }
    };
    public static final IPOAccessStatusDto IPO_ACCESS_STATUS_CANCELED = new IPOAccessStatusDto("IPO_ACCESS_STATUS_CANCELED", 6) { // from class: rosetta.instrument.IPOAccessStatusDto.IPO_ACCESS_STATUS_CANCELED
        {
            String str = "canceled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IPOAccessStatus toProto() {
            return IPOAccessStatus.IPO_ACCESS_STATUS_CANCELED;
        }
    };
    public static final IPOAccessStatusDto IPO_ACCESS_STATUS_DELAYED = new IPOAccessStatusDto("IPO_ACCESS_STATUS_DELAYED", 7) { // from class: rosetta.instrument.IPOAccessStatusDto.IPO_ACCESS_STATUS_DELAYED
        {
            String str = "delayed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IPOAccessStatus toProto() {
            return IPOAccessStatus.IPO_ACCESS_STATUS_DELAYED;
        }
    };

    private static final /* synthetic */ IPOAccessStatusDto[] $values() {
        return new IPOAccessStatusDto[]{IPO_ACCESS_STATUS_UNSPECIFIED, IPO_ACCESS_STATUS_EMPTY, IPO_ACCESS_STATUS_S1_FILED, IPO_ACCESS_STATUS_PRICE_INITIALIZED, IPO_ACCESS_STATUS_PRICE_FINALIZED, IPO_ACCESS_STATUS_PUBLIC, IPO_ACCESS_STATUS_CANCELED, IPO_ACCESS_STATUS_DELAYED};
    }

    public /* synthetic */ IPOAccessStatusDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<IPOAccessStatusDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IPOAccessStatusDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        IPOAccessStatusDto[] iPOAccessStatusDtoArr$values = $values();
        $VALUES = iPOAccessStatusDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(iPOAccessStatusDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.instrument.IPOAccessStatusDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IPOAccessStatusDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: IPOAccessStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/instrument/IPOAccessStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/instrument/IPOAccessStatusDto;", "Lrosetta/instrument/IPOAccessStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/instrument/IPOAccessStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.instrument_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<IPOAccessStatusDto, IPOAccessStatus> {

        /* compiled from: IPOAccessStatusDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IPOAccessStatus.values().length];
                try {
                    iArr[IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IPOAccessStatus.IPO_ACCESS_STATUS_EMPTY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IPOAccessStatus.IPO_ACCESS_STATUS_S1_FILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[IPOAccessStatus.IPO_ACCESS_STATUS_PRICE_INITIALIZED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[IPOAccessStatus.IPO_ACCESS_STATUS_PRICE_FINALIZED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[IPOAccessStatus.IPO_ACCESS_STATUS_PUBLIC.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[IPOAccessStatus.IPO_ACCESS_STATUS_CANCELED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[IPOAccessStatus.IPO_ACCESS_STATUS_DELAYED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IPOAccessStatusDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IPOAccessStatusDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IPOAccessStatusDto> getBinaryBase64Serializer() {
            return (KSerializer) IPOAccessStatusDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IPOAccessStatus> getProtoAdapter() {
            return IPOAccessStatus.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IPOAccessStatusDto getZeroValue() {
            return IPOAccessStatusDto.IPO_ACCESS_STATUS_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IPOAccessStatusDto fromProto(IPOAccessStatus proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return IPOAccessStatusDto.IPO_ACCESS_STATUS_UNSPECIFIED;
                case 2:
                    return IPOAccessStatusDto.IPO_ACCESS_STATUS_EMPTY;
                case 3:
                    return IPOAccessStatusDto.IPO_ACCESS_STATUS_S1_FILED;
                case 4:
                    return IPOAccessStatusDto.IPO_ACCESS_STATUS_PRICE_INITIALIZED;
                case 5:
                    return IPOAccessStatusDto.IPO_ACCESS_STATUS_PRICE_FINALIZED;
                case 6:
                    return IPOAccessStatusDto.IPO_ACCESS_STATUS_PUBLIC;
                case 7:
                    return IPOAccessStatusDto.IPO_ACCESS_STATUS_CANCELED;
                case 8:
                    return IPOAccessStatusDto.IPO_ACCESS_STATUS_DELAYED;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IPOAccessStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/instrument/IPOAccessStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/instrument/IPOAccessStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.instrument_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IPOAccessStatusDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<IPOAccessStatusDto, IPOAccessStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.instrument.IPOAccessStatus", IPOAccessStatusDto.getEntries(), IPOAccessStatusDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public IPOAccessStatusDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (IPOAccessStatusDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IPOAccessStatusDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static IPOAccessStatusDto valueOf(String str) {
        return (IPOAccessStatusDto) Enum.valueOf(IPOAccessStatusDto.class, str);
    }

    public static IPOAccessStatusDto[] values() {
        return (IPOAccessStatusDto[]) $VALUES.clone();
    }
}
