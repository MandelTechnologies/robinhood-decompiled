package cbc.service.p048v1;

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
/* compiled from: TermTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001b\u001cB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u001d"}, m3636d2 = {"Lcbc/service/v1/TermTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcbc/service/v1/TermType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "TERM_TYPE_UNSPECIFIED", "TERM_TYPE_LT", "TERM_TYPE_ST", "TERM_TYPE_ST40LT60", "TERM_TYPE_LT_OR", "TERM_TYPE_MIXED", "TERM_TYPE_OR", "TERM_TYPE_ST_OR", "TERM_TYPE_UNKNOWN", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public abstract class TermTypeDto implements Dto2<TermType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TermTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TermTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TermTypeDto, TermType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final TermTypeDto TERM_TYPE_UNSPECIFIED = new TermTypeDto("TERM_TYPE_UNSPECIFIED", 0) { // from class: cbc.service.v1.TermTypeDto.TERM_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TermType toProto() {
            return TermType.TERM_TYPE_UNSPECIFIED;
        }
    };
    public static final TermTypeDto TERM_TYPE_LT = new TermTypeDto("TERM_TYPE_LT", 1) { // from class: cbc.service.v1.TermTypeDto.TERM_TYPE_LT
        {
            String str = "lt";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TermType toProto() {
            return TermType.TERM_TYPE_LT;
        }
    };
    public static final TermTypeDto TERM_TYPE_ST = new TermTypeDto("TERM_TYPE_ST", 2) { // from class: cbc.service.v1.TermTypeDto.TERM_TYPE_ST
        {
            String str = "st";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TermType toProto() {
            return TermType.TERM_TYPE_ST;
        }
    };
    public static final TermTypeDto TERM_TYPE_ST40LT60 = new TermTypeDto("TERM_TYPE_ST40LT60", 3) { // from class: cbc.service.v1.TermTypeDto.TERM_TYPE_ST40LT60
        {
            String str = "st40lt60";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TermType toProto() {
            return TermType.TERM_TYPE_ST40LT60;
        }
    };
    public static final TermTypeDto TERM_TYPE_LT_OR = new TermTypeDto("TERM_TYPE_LT_OR", 4) { // from class: cbc.service.v1.TermTypeDto.TERM_TYPE_LT_OR
        {
            String str = "lt-or";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TermType toProto() {
            return TermType.TERM_TYPE_LT_OR;
        }
    };
    public static final TermTypeDto TERM_TYPE_MIXED = new TermTypeDto("TERM_TYPE_MIXED", 5) { // from class: cbc.service.v1.TermTypeDto.TERM_TYPE_MIXED
        {
            String str = "mixed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TermType toProto() {
            return TermType.TERM_TYPE_MIXED;
        }
    };
    public static final TermTypeDto TERM_TYPE_OR = new TermTypeDto("TERM_TYPE_OR", 6) { // from class: cbc.service.v1.TermTypeDto.TERM_TYPE_OR
        {
            String str = "or";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TermType toProto() {
            return TermType.TERM_TYPE_OR;
        }
    };
    public static final TermTypeDto TERM_TYPE_ST_OR = new TermTypeDto("TERM_TYPE_ST_OR", 7) { // from class: cbc.service.v1.TermTypeDto.TERM_TYPE_ST_OR
        {
            String str = "st-or";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TermType toProto() {
            return TermType.TERM_TYPE_ST_OR;
        }
    };
    public static final TermTypeDto TERM_TYPE_UNKNOWN = new TermTypeDto("TERM_TYPE_UNKNOWN", 8) { // from class: cbc.service.v1.TermTypeDto.TERM_TYPE_UNKNOWN
        {
            String str = "unknown";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TermType toProto() {
            return TermType.TERM_TYPE_UNKNOWN;
        }
    };

    private static final /* synthetic */ TermTypeDto[] $values() {
        return new TermTypeDto[]{TERM_TYPE_UNSPECIFIED, TERM_TYPE_LT, TERM_TYPE_ST, TERM_TYPE_ST40LT60, TERM_TYPE_LT_OR, TERM_TYPE_MIXED, TERM_TYPE_OR, TERM_TYPE_ST_OR, TERM_TYPE_UNKNOWN};
    }

    public /* synthetic */ TermTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<TermTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TermTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        TermTypeDto[] termTypeDtoArr$values = $values();
        $VALUES = termTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(termTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: cbc.service.v1.TermTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TermTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TermTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcbc/service/v1/TermTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcbc/service/v1/TermTypeDto;", "Lcbc/service/v1/TermType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcbc/service/v1/TermTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TermTypeDto, TermType> {

        /* compiled from: TermTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TermType.values().length];
                try {
                    iArr[TermType.TERM_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TermType.TERM_TYPE_LT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TermType.TERM_TYPE_ST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TermType.TERM_TYPE_ST40LT60.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TermType.TERM_TYPE_LT_OR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TermType.TERM_TYPE_MIXED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TermType.TERM_TYPE_OR.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[TermType.TERM_TYPE_ST_OR.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[TermType.TERM_TYPE_UNKNOWN.ordinal()] = 9;
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

        public final KSerializer<TermTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TermTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TermTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) TermTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TermType> getProtoAdapter() {
            return TermType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TermTypeDto getZeroValue() {
            return TermTypeDto.TERM_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TermTypeDto fromProto(TermType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TermTypeDto.TERM_TYPE_UNSPECIFIED;
                case 2:
                    return TermTypeDto.TERM_TYPE_LT;
                case 3:
                    return TermTypeDto.TERM_TYPE_ST;
                case 4:
                    return TermTypeDto.TERM_TYPE_ST40LT60;
                case 5:
                    return TermTypeDto.TERM_TYPE_LT_OR;
                case 6:
                    return TermTypeDto.TERM_TYPE_MIXED;
                case 7:
                    return TermTypeDto.TERM_TYPE_OR;
                case 8:
                    return TermTypeDto.TERM_TYPE_ST_OR;
                case 9:
                    return TermTypeDto.TERM_TYPE_UNKNOWN;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TermTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcbc/service/v1/TermTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcbc/service/v1/TermTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<TermTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TermTypeDto, TermType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/cbc.service.v1.TermType", TermTypeDto.getEntries(), TermTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TermTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TermTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TermTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TermTypeDto valueOf(String str) {
        return (TermTypeDto) Enum.valueOf(TermTypeDto.class, str);
    }

    public static TermTypeDto[] values() {
        return (TermTypeDto[]) $VALUES.clone();
    }
}
