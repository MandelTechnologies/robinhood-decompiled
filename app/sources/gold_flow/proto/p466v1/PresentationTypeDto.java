package gold_flow.proto.p466v1;

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
/* compiled from: PresentationTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lgold_flow/proto/v1/PresentationTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lgold_flow/proto/v1/PresentationType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "PRESENTATION_UNSPECIFIED", "PUSH", "MODAL", "REPLACE", "DEFAULT", "LISTEN_FOR_ACTIVITY_RESULT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public abstract class PresentationTypeDto implements Dto2<PresentationType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PresentationTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<PresentationTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PresentationTypeDto, PresentationType>> binaryBase64Serializer$delegate;
    public static final PresentationTypeDto PRESENTATION_UNSPECIFIED = new PresentationTypeDto("PRESENTATION_UNSPECIFIED", 0) { // from class: gold_flow.proto.v1.PresentationTypeDto.PRESENTATION_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PresentationType toProto() {
            return PresentationType.PRESENTATION_UNSPECIFIED;
        }
    };
    public static final PresentationTypeDto PUSH = new PresentationTypeDto("PUSH", 1) { // from class: gold_flow.proto.v1.PresentationTypeDto.PUSH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PresentationType toProto() {
            return PresentationType.PUSH;
        }
    };
    public static final PresentationTypeDto MODAL = new PresentationTypeDto("MODAL", 2) { // from class: gold_flow.proto.v1.PresentationTypeDto.MODAL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PresentationType toProto() {
            return PresentationType.MODAL;
        }
    };
    public static final PresentationTypeDto REPLACE = new PresentationTypeDto("REPLACE", 3) { // from class: gold_flow.proto.v1.PresentationTypeDto.REPLACE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PresentationType toProto() {
            return PresentationType.REPLACE;
        }
    };
    public static final PresentationTypeDto DEFAULT = new PresentationTypeDto("DEFAULT", 4) { // from class: gold_flow.proto.v1.PresentationTypeDto.DEFAULT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PresentationType toProto() {
            return PresentationType.DEFAULT;
        }
    };
    public static final PresentationTypeDto LISTEN_FOR_ACTIVITY_RESULT = new PresentationTypeDto("LISTEN_FOR_ACTIVITY_RESULT", 5) { // from class: gold_flow.proto.v1.PresentationTypeDto.LISTEN_FOR_ACTIVITY_RESULT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PresentationType toProto() {
            return PresentationType.LISTEN_FOR_ACTIVITY_RESULT;
        }
    };

    private static final /* synthetic */ PresentationTypeDto[] $values() {
        return new PresentationTypeDto[]{PRESENTATION_UNSPECIFIED, PUSH, MODAL, REPLACE, DEFAULT, LISTEN_FOR_ACTIVITY_RESULT};
    }

    public /* synthetic */ PresentationTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<PresentationTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PresentationTypeDto(String str, int i) {
    }

    static {
        PresentationTypeDto[] presentationTypeDtoArr$values = $values();
        $VALUES = presentationTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(presentationTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.PresentationTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PresentationTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: PresentationTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/PresentationTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lgold_flow/proto/v1/PresentationTypeDto;", "Lgold_flow/proto/v1/PresentationType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/PresentationTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<PresentationTypeDto, PresentationType> {

        /* compiled from: PresentationTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PresentationType.values().length];
                try {
                    iArr[PresentationType.PRESENTATION_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PresentationType.PUSH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PresentationType.MODAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PresentationType.REPLACE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PresentationType.DEFAULT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PresentationType.LISTEN_FOR_ACTIVITY_RESULT.ordinal()] = 6;
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

        public final KSerializer<PresentationTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PresentationTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PresentationTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) PresentationTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PresentationType> getProtoAdapter() {
            return PresentationType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PresentationTypeDto getZeroValue() {
            return PresentationTypeDto.PRESENTATION_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PresentationTypeDto fromProto(PresentationType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return PresentationTypeDto.PRESENTATION_UNSPECIFIED;
                case 2:
                    return PresentationTypeDto.PUSH;
                case 3:
                    return PresentationTypeDto.MODAL;
                case 4:
                    return PresentationTypeDto.REPLACE;
                case 5:
                    return PresentationTypeDto.DEFAULT;
                case 6:
                    return PresentationTypeDto.LISTEN_FOR_ACTIVITY_RESULT;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PresentationTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lgold_flow/proto/v1/PresentationTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/PresentationTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<PresentationTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<PresentationTypeDto, PresentationType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/gold_flow.proto.v1.PresentationType", PresentationTypeDto.getEntries(), PresentationTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public PresentationTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (PresentationTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PresentationTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static PresentationTypeDto valueOf(String str) {
        return (PresentationTypeDto) Enum.valueOf(PresentationTypeDto.class, str);
    }

    public static PresentationTypeDto[] values() {
        return (PresentationTypeDto[]) $VALUES.clone();
    }
}
