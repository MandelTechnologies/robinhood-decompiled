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
/* compiled from: DisplaySpanDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001b"}, m3636d2 = {"Lrh_server_driven_ui/v1/DisplaySpanDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/DisplaySpan;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DISPLAY_SPAN_UNSPECIFIED", "DISPLAY_SPAN_HOUR", "DISPLAY_SPAN_FOUR_HOURS", "DISPLAY_SPAN_DAY", "DISPLAY_SPAN_WEEK", "DISPLAY_SPAN_MONTH", "DISPLAY_SPAN_THREE_MONTHS", "DISPLAY_SPAN_YTD", "DISPLAY_SPAN_YEAR", "DISPLAY_SPAN_FIVE_YEARS", "DISPLAY_SPAN_ALL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public abstract class DisplaySpanDto implements Dto2<DisplaySpan>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisplaySpanDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<DisplaySpanDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DisplaySpanDto, DisplaySpan>> binaryBase64Serializer$delegate;
    public static final DisplaySpanDto DISPLAY_SPAN_UNSPECIFIED = new DisplaySpanDto("DISPLAY_SPAN_UNSPECIFIED", 0) { // from class: rh_server_driven_ui.v1.DisplaySpanDto.DISPLAY_SPAN_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisplaySpan toProto() {
            return DisplaySpan.DISPLAY_SPAN_UNSPECIFIED;
        }
    };
    public static final DisplaySpanDto DISPLAY_SPAN_HOUR = new DisplaySpanDto("DISPLAY_SPAN_HOUR", 1) { // from class: rh_server_driven_ui.v1.DisplaySpanDto.DISPLAY_SPAN_HOUR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisplaySpan toProto() {
            return DisplaySpan.DISPLAY_SPAN_HOUR;
        }
    };
    public static final DisplaySpanDto DISPLAY_SPAN_FOUR_HOURS = new DisplaySpanDto("DISPLAY_SPAN_FOUR_HOURS", 2) { // from class: rh_server_driven_ui.v1.DisplaySpanDto.DISPLAY_SPAN_FOUR_HOURS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisplaySpan toProto() {
            return DisplaySpan.DISPLAY_SPAN_FOUR_HOURS;
        }
    };
    public static final DisplaySpanDto DISPLAY_SPAN_DAY = new DisplaySpanDto("DISPLAY_SPAN_DAY", 3) { // from class: rh_server_driven_ui.v1.DisplaySpanDto.DISPLAY_SPAN_DAY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisplaySpan toProto() {
            return DisplaySpan.DISPLAY_SPAN_DAY;
        }
    };
    public static final DisplaySpanDto DISPLAY_SPAN_WEEK = new DisplaySpanDto("DISPLAY_SPAN_WEEK", 4) { // from class: rh_server_driven_ui.v1.DisplaySpanDto.DISPLAY_SPAN_WEEK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisplaySpan toProto() {
            return DisplaySpan.DISPLAY_SPAN_WEEK;
        }
    };
    public static final DisplaySpanDto DISPLAY_SPAN_MONTH = new DisplaySpanDto("DISPLAY_SPAN_MONTH", 5) { // from class: rh_server_driven_ui.v1.DisplaySpanDto.DISPLAY_SPAN_MONTH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisplaySpan toProto() {
            return DisplaySpan.DISPLAY_SPAN_MONTH;
        }
    };
    public static final DisplaySpanDto DISPLAY_SPAN_THREE_MONTHS = new DisplaySpanDto("DISPLAY_SPAN_THREE_MONTHS", 6) { // from class: rh_server_driven_ui.v1.DisplaySpanDto.DISPLAY_SPAN_THREE_MONTHS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisplaySpan toProto() {
            return DisplaySpan.DISPLAY_SPAN_THREE_MONTHS;
        }
    };
    public static final DisplaySpanDto DISPLAY_SPAN_YTD = new DisplaySpanDto("DISPLAY_SPAN_YTD", 7) { // from class: rh_server_driven_ui.v1.DisplaySpanDto.DISPLAY_SPAN_YTD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisplaySpan toProto() {
            return DisplaySpan.DISPLAY_SPAN_YTD;
        }
    };
    public static final DisplaySpanDto DISPLAY_SPAN_YEAR = new DisplaySpanDto("DISPLAY_SPAN_YEAR", 8) { // from class: rh_server_driven_ui.v1.DisplaySpanDto.DISPLAY_SPAN_YEAR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisplaySpan toProto() {
            return DisplaySpan.DISPLAY_SPAN_YEAR;
        }
    };
    public static final DisplaySpanDto DISPLAY_SPAN_FIVE_YEARS = new DisplaySpanDto("DISPLAY_SPAN_FIVE_YEARS", 9) { // from class: rh_server_driven_ui.v1.DisplaySpanDto.DISPLAY_SPAN_FIVE_YEARS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisplaySpan toProto() {
            return DisplaySpan.DISPLAY_SPAN_FIVE_YEARS;
        }
    };
    public static final DisplaySpanDto DISPLAY_SPAN_ALL = new DisplaySpanDto("DISPLAY_SPAN_ALL", 10) { // from class: rh_server_driven_ui.v1.DisplaySpanDto.DISPLAY_SPAN_ALL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisplaySpan toProto() {
            return DisplaySpan.DISPLAY_SPAN_ALL;
        }
    };

    private static final /* synthetic */ DisplaySpanDto[] $values() {
        return new DisplaySpanDto[]{DISPLAY_SPAN_UNSPECIFIED, DISPLAY_SPAN_HOUR, DISPLAY_SPAN_FOUR_HOURS, DISPLAY_SPAN_DAY, DISPLAY_SPAN_WEEK, DISPLAY_SPAN_MONTH, DISPLAY_SPAN_THREE_MONTHS, DISPLAY_SPAN_YTD, DISPLAY_SPAN_YEAR, DISPLAY_SPAN_FIVE_YEARS, DISPLAY_SPAN_ALL};
    }

    public /* synthetic */ DisplaySpanDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<DisplaySpanDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DisplaySpanDto(String str, int i) {
    }

    static {
        DisplaySpanDto[] displaySpanDtoArr$values = $values();
        $VALUES = displaySpanDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(displaySpanDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.DisplaySpanDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DisplaySpanDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: DisplaySpanDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/DisplaySpanDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/DisplaySpanDto;", "Lrh_server_driven_ui/v1/DisplaySpan;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/DisplaySpanDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<DisplaySpanDto, DisplaySpan> {

        /* compiled from: DisplaySpanDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DisplaySpan.values().length];
                try {
                    iArr[DisplaySpan.DISPLAY_SPAN_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DisplaySpan.DISPLAY_SPAN_HOUR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DisplaySpan.DISPLAY_SPAN_FOUR_HOURS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DisplaySpan.DISPLAY_SPAN_DAY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DisplaySpan.DISPLAY_SPAN_WEEK.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DisplaySpan.DISPLAY_SPAN_MONTH.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[DisplaySpan.DISPLAY_SPAN_THREE_MONTHS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[DisplaySpan.DISPLAY_SPAN_YTD.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[DisplaySpan.DISPLAY_SPAN_YEAR.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[DisplaySpan.DISPLAY_SPAN_FIVE_YEARS.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[DisplaySpan.DISPLAY_SPAN_ALL.ordinal()] = 11;
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

        public final KSerializer<DisplaySpanDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DisplaySpanDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DisplaySpanDto> getBinaryBase64Serializer() {
            return (KSerializer) DisplaySpanDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DisplaySpan> getProtoAdapter() {
            return DisplaySpan.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DisplaySpanDto getZeroValue() {
            return DisplaySpanDto.DISPLAY_SPAN_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DisplaySpanDto fromProto(DisplaySpan proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return DisplaySpanDto.DISPLAY_SPAN_UNSPECIFIED;
                case 2:
                    return DisplaySpanDto.DISPLAY_SPAN_HOUR;
                case 3:
                    return DisplaySpanDto.DISPLAY_SPAN_FOUR_HOURS;
                case 4:
                    return DisplaySpanDto.DISPLAY_SPAN_DAY;
                case 5:
                    return DisplaySpanDto.DISPLAY_SPAN_WEEK;
                case 6:
                    return DisplaySpanDto.DISPLAY_SPAN_MONTH;
                case 7:
                    return DisplaySpanDto.DISPLAY_SPAN_THREE_MONTHS;
                case 8:
                    return DisplaySpanDto.DISPLAY_SPAN_YTD;
                case 9:
                    return DisplaySpanDto.DISPLAY_SPAN_YEAR;
                case 10:
                    return DisplaySpanDto.DISPLAY_SPAN_FIVE_YEARS;
                case 11:
                    return DisplaySpanDto.DISPLAY_SPAN_ALL;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DisplaySpanDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/DisplaySpanDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/DisplaySpanDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<DisplaySpanDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<DisplaySpanDto, DisplaySpan> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.DisplaySpan", DisplaySpanDto.getEntries(), DisplaySpanDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public DisplaySpanDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (DisplaySpanDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DisplaySpanDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static DisplaySpanDto valueOf(String str) {
        return (DisplaySpanDto) Enum.valueOf(DisplaySpanDto.class, str);
    }

    public static DisplaySpanDto[] values() {
        return (DisplaySpanDto[]) $VALUES.clone();
    }
}
