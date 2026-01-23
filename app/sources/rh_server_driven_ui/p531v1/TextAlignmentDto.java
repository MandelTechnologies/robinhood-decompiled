package rh_server_driven_ui.p531v1;

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
/* compiled from: TextAlignmentDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextAlignmentDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/TextAlignment;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_ALIGNMENT_UNSPECIFIED", "TEXT_ALIGNMENT_START", "TEXT_ALIGNMENT_END", "TEXT_ALIGNMENT_CENTER", "TEXT_ALIGNMENT_RIGHT", "TEXT_ALIGNMENT_JUSTIFIED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class TextAlignmentDto implements Dto2<TextAlignment>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextAlignmentDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TextAlignmentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TextAlignmentDto, TextAlignment>> binaryBase64Serializer$delegate;
    public static final TextAlignmentDto TEXT_ALIGNMENT_UNSPECIFIED = new TextAlignmentDto("TEXT_ALIGNMENT_UNSPECIFIED", 0) { // from class: rh_server_driven_ui.v1.TextAlignmentDto.TEXT_ALIGNMENT_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextAlignment toProto() {
            return TextAlignment.TEXT_ALIGNMENT_UNSPECIFIED;
        }
    };
    public static final TextAlignmentDto TEXT_ALIGNMENT_START = new TextAlignmentDto("TEXT_ALIGNMENT_START", 1) { // from class: rh_server_driven_ui.v1.TextAlignmentDto.TEXT_ALIGNMENT_START
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextAlignment toProto() {
            return TextAlignment.TEXT_ALIGNMENT_START;
        }
    };
    public static final TextAlignmentDto TEXT_ALIGNMENT_END = new TextAlignmentDto("TEXT_ALIGNMENT_END", 2) { // from class: rh_server_driven_ui.v1.TextAlignmentDto.TEXT_ALIGNMENT_END
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextAlignment toProto() {
            return TextAlignment.TEXT_ALIGNMENT_END;
        }
    };
    public static final TextAlignmentDto TEXT_ALIGNMENT_CENTER = new TextAlignmentDto("TEXT_ALIGNMENT_CENTER", 3) { // from class: rh_server_driven_ui.v1.TextAlignmentDto.TEXT_ALIGNMENT_CENTER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextAlignment toProto() {
            return TextAlignment.TEXT_ALIGNMENT_CENTER;
        }
    };
    public static final TextAlignmentDto TEXT_ALIGNMENT_RIGHT = new TextAlignmentDto("TEXT_ALIGNMENT_RIGHT", 4) { // from class: rh_server_driven_ui.v1.TextAlignmentDto.TEXT_ALIGNMENT_RIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextAlignment toProto() {
            return TextAlignment.TEXT_ALIGNMENT_RIGHT;
        }
    };
    public static final TextAlignmentDto TEXT_ALIGNMENT_JUSTIFIED = new TextAlignmentDto("TEXT_ALIGNMENT_JUSTIFIED", 5) { // from class: rh_server_driven_ui.v1.TextAlignmentDto.TEXT_ALIGNMENT_JUSTIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextAlignment toProto() {
            return TextAlignment.TEXT_ALIGNMENT_JUSTIFIED;
        }
    };

    private static final /* synthetic */ TextAlignmentDto[] $values() {
        return new TextAlignmentDto[]{TEXT_ALIGNMENT_UNSPECIFIED, TEXT_ALIGNMENT_START, TEXT_ALIGNMENT_END, TEXT_ALIGNMENT_CENTER, TEXT_ALIGNMENT_RIGHT, TEXT_ALIGNMENT_JUSTIFIED};
    }

    public /* synthetic */ TextAlignmentDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<TextAlignmentDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TextAlignmentDto(String str, int i) {
    }

    static {
        TextAlignmentDto[] textAlignmentDtoArr$values = $values();
        $VALUES = textAlignmentDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(textAlignmentDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextAlignmentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextAlignmentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TextAlignmentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextAlignmentDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TextAlignmentDto;", "Lrh_server_driven_ui/v1/TextAlignment;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextAlignmentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TextAlignmentDto, TextAlignment> {

        /* compiled from: TextAlignmentDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TextAlignment.values().length];
                try {
                    iArr[TextAlignment.TEXT_ALIGNMENT_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TextAlignment.TEXT_ALIGNMENT_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TextAlignment.TEXT_ALIGNMENT_END.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TextAlignment.TEXT_ALIGNMENT_CENTER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TextAlignment.TEXT_ALIGNMENT_RIGHT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TextAlignment.TEXT_ALIGNMENT_JUSTIFIED.ordinal()] = 6;
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

        public final KSerializer<TextAlignmentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TextAlignmentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TextAlignmentDto> getBinaryBase64Serializer() {
            return (KSerializer) TextAlignmentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TextAlignment> getProtoAdapter() {
            return TextAlignment.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TextAlignmentDto getZeroValue() {
            return TextAlignmentDto.TEXT_ALIGNMENT_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TextAlignmentDto fromProto(TextAlignment proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TextAlignmentDto.TEXT_ALIGNMENT_UNSPECIFIED;
                case 2:
                    return TextAlignmentDto.TEXT_ALIGNMENT_START;
                case 3:
                    return TextAlignmentDto.TEXT_ALIGNMENT_END;
                case 4:
                    return TextAlignmentDto.TEXT_ALIGNMENT_CENTER;
                case 5:
                    return TextAlignmentDto.TEXT_ALIGNMENT_RIGHT;
                case 6:
                    return TextAlignmentDto.TEXT_ALIGNMENT_JUSTIFIED;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TextAlignmentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextAlignmentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextAlignmentDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<TextAlignmentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TextAlignmentDto, TextAlignment> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.TextAlignment", TextAlignmentDto.getEntries(), TextAlignmentDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TextAlignmentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TextAlignmentDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TextAlignmentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TextAlignmentDto valueOf(String str) {
        return (TextAlignmentDto) Enum.valueOf(TextAlignmentDto.class, str);
    }

    public static TextAlignmentDto[] values() {
        return (TextAlignmentDto[]) $VALUES.clone();
    }
}
