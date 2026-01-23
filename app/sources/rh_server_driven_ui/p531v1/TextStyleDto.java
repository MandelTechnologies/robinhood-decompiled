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
/* compiled from: TextStyleDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u001d"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextStyleDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/TextStyle;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_STYLE_UNSPECIFIED", "TEXT_STYLE_TEXT_SMALL", "TEXT_STYLE_TEXT_SMALL_BOLD", "TEXT_STYLE_TEXT_MEDIUM", "TEXT_STYLE_TEXT_MEDIUM_BOLD", "TEXT_STYLE_TEXT_LARGE", "TEXT_STYLE_TEXT_LARGE_BOLD", "TEXT_STYLE_DISPLAY_SMALL", "TEXT_STYLE_DISPLAY_MEDIUM", "TEXT_STYLE_DISPLAY_LARGE", "TEXT_STYLE_BOOK_COVER_SMALL", "TEXT_STYLE_BOOK_COVER_MEDIUM", "TEXT_STYLE_BOOK_COVER_LARGE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class TextStyleDto implements Dto2<TextStyle>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextStyleDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TextStyleDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TextStyleDto, TextStyle>> binaryBase64Serializer$delegate;
    public static final TextStyleDto TEXT_STYLE_UNSPECIFIED = new TextStyleDto("TEXT_STYLE_UNSPECIFIED", 0) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_UNSPECIFIED;
        }
    };
    public static final TextStyleDto TEXT_STYLE_TEXT_SMALL = new TextStyleDto("TEXT_STYLE_TEXT_SMALL", 1) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_TEXT_SMALL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_TEXT_SMALL;
        }
    };
    public static final TextStyleDto TEXT_STYLE_TEXT_SMALL_BOLD = new TextStyleDto("TEXT_STYLE_TEXT_SMALL_BOLD", 2) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_TEXT_SMALL_BOLD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_TEXT_SMALL_BOLD;
        }
    };
    public static final TextStyleDto TEXT_STYLE_TEXT_MEDIUM = new TextStyleDto("TEXT_STYLE_TEXT_MEDIUM", 3) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_TEXT_MEDIUM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_TEXT_MEDIUM;
        }
    };
    public static final TextStyleDto TEXT_STYLE_TEXT_MEDIUM_BOLD = new TextStyleDto("TEXT_STYLE_TEXT_MEDIUM_BOLD", 4) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_TEXT_MEDIUM_BOLD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_TEXT_MEDIUM_BOLD;
        }
    };
    public static final TextStyleDto TEXT_STYLE_TEXT_LARGE = new TextStyleDto("TEXT_STYLE_TEXT_LARGE", 5) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_TEXT_LARGE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_TEXT_LARGE;
        }
    };
    public static final TextStyleDto TEXT_STYLE_TEXT_LARGE_BOLD = new TextStyleDto("TEXT_STYLE_TEXT_LARGE_BOLD", 6) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_TEXT_LARGE_BOLD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_TEXT_LARGE_BOLD;
        }
    };
    public static final TextStyleDto TEXT_STYLE_DISPLAY_SMALL = new TextStyleDto("TEXT_STYLE_DISPLAY_SMALL", 7) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_DISPLAY_SMALL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_DISPLAY_SMALL;
        }
    };
    public static final TextStyleDto TEXT_STYLE_DISPLAY_MEDIUM = new TextStyleDto("TEXT_STYLE_DISPLAY_MEDIUM", 8) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_DISPLAY_MEDIUM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_DISPLAY_MEDIUM;
        }
    };
    public static final TextStyleDto TEXT_STYLE_DISPLAY_LARGE = new TextStyleDto("TEXT_STYLE_DISPLAY_LARGE", 9) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_DISPLAY_LARGE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_DISPLAY_LARGE;
        }
    };
    public static final TextStyleDto TEXT_STYLE_BOOK_COVER_SMALL = new TextStyleDto("TEXT_STYLE_BOOK_COVER_SMALL", 10) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_BOOK_COVER_SMALL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_BOOK_COVER_SMALL;
        }
    };
    public static final TextStyleDto TEXT_STYLE_BOOK_COVER_MEDIUM = new TextStyleDto("TEXT_STYLE_BOOK_COVER_MEDIUM", 11) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_BOOK_COVER_MEDIUM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_BOOK_COVER_MEDIUM;
        }
    };
    public static final TextStyleDto TEXT_STYLE_BOOK_COVER_LARGE = new TextStyleDto("TEXT_STYLE_BOOK_COVER_LARGE", 12) { // from class: rh_server_driven_ui.v1.TextStyleDto.TEXT_STYLE_BOOK_COVER_LARGE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TextStyle toProto() {
            return TextStyle.TEXT_STYLE_BOOK_COVER_LARGE;
        }
    };

    private static final /* synthetic */ TextStyleDto[] $values() {
        return new TextStyleDto[]{TEXT_STYLE_UNSPECIFIED, TEXT_STYLE_TEXT_SMALL, TEXT_STYLE_TEXT_SMALL_BOLD, TEXT_STYLE_TEXT_MEDIUM, TEXT_STYLE_TEXT_MEDIUM_BOLD, TEXT_STYLE_TEXT_LARGE, TEXT_STYLE_TEXT_LARGE_BOLD, TEXT_STYLE_DISPLAY_SMALL, TEXT_STYLE_DISPLAY_MEDIUM, TEXT_STYLE_DISPLAY_LARGE, TEXT_STYLE_BOOK_COVER_SMALL, TEXT_STYLE_BOOK_COVER_MEDIUM, TEXT_STYLE_BOOK_COVER_LARGE};
    }

    public /* synthetic */ TextStyleDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<TextStyleDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TextStyleDto(String str, int i) {
    }

    static {
        TextStyleDto[] textStyleDtoArr$values = $values();
        $VALUES = textStyleDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(textStyleDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextStyleDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextStyleDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TextStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextStyleDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TextStyleDto;", "Lrh_server_driven_ui/v1/TextStyle;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextStyleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TextStyleDto, TextStyle> {

        /* compiled from: TextStyleDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TextStyle.values().length];
                try {
                    iArr[TextStyle.TEXT_STYLE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TextStyle.TEXT_STYLE_TEXT_SMALL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TextStyle.TEXT_STYLE_TEXT_SMALL_BOLD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TextStyle.TEXT_STYLE_TEXT_MEDIUM.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TextStyle.TEXT_STYLE_TEXT_MEDIUM_BOLD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TextStyle.TEXT_STYLE_TEXT_LARGE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TextStyle.TEXT_STYLE_TEXT_LARGE_BOLD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[TextStyle.TEXT_STYLE_DISPLAY_SMALL.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[TextStyle.TEXT_STYLE_DISPLAY_MEDIUM.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[TextStyle.TEXT_STYLE_DISPLAY_LARGE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[TextStyle.TEXT_STYLE_BOOK_COVER_SMALL.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[TextStyle.TEXT_STYLE_BOOK_COVER_MEDIUM.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[TextStyle.TEXT_STYLE_BOOK_COVER_LARGE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TextStyleDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TextStyleDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TextStyleDto> getBinaryBase64Serializer() {
            return (KSerializer) TextStyleDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TextStyle> getProtoAdapter() {
            return TextStyle.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TextStyleDto getZeroValue() {
            return TextStyleDto.TEXT_STYLE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TextStyleDto fromProto(TextStyle proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TextStyleDto.TEXT_STYLE_UNSPECIFIED;
                case 2:
                    return TextStyleDto.TEXT_STYLE_TEXT_SMALL;
                case 3:
                    return TextStyleDto.TEXT_STYLE_TEXT_SMALL_BOLD;
                case 4:
                    return TextStyleDto.TEXT_STYLE_TEXT_MEDIUM;
                case 5:
                    return TextStyleDto.TEXT_STYLE_TEXT_MEDIUM_BOLD;
                case 6:
                    return TextStyleDto.TEXT_STYLE_TEXT_LARGE;
                case 7:
                    return TextStyleDto.TEXT_STYLE_TEXT_LARGE_BOLD;
                case 8:
                    return TextStyleDto.TEXT_STYLE_DISPLAY_SMALL;
                case 9:
                    return TextStyleDto.TEXT_STYLE_DISPLAY_MEDIUM;
                case 10:
                    return TextStyleDto.TEXT_STYLE_DISPLAY_LARGE;
                case 11:
                    return TextStyleDto.TEXT_STYLE_BOOK_COVER_SMALL;
                case 12:
                    return TextStyleDto.TEXT_STYLE_BOOK_COVER_MEDIUM;
                case 13:
                    return TextStyleDto.TEXT_STYLE_BOOK_COVER_LARGE;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TextStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextStyleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextStyleDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<TextStyleDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TextStyleDto, TextStyle> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.TextStyle", TextStyleDto.getEntries(), TextStyleDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TextStyleDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TextStyleDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TextStyleDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TextStyleDto valueOf(String str) {
        return (TextStyleDto) Enum.valueOf(TextStyleDto.class, str);
    }

    public static TextStyleDto[] values() {
        return (TextStyleDto[]) $VALUES.clone();
    }
}
