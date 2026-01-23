package black_widow.contracts.mobile_app_chart.proto.p024v1;

import android.os.Parcel;
import android.os.Parcelable;
import black_widow.contracts.mobile_app_chart.proto.p024v1.DifferenceCloudDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.LineColorDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: LineValueDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005! \"#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006%"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValue;", "Landroid/os/Parcelable;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$Surrogate;)V", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto;", "value", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto;)V", "toProto", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValue;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$Surrogate;", "Companion", "Surrogate", "ValueDto", "Serializer", "MultibindingModule", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class LineValueDto implements Dto3<LineValue>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LineValueDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LineValueDto, LineValue>> binaryBase64Serializer$delegate;
    private static final LineValueDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LineValueDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LineValueDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LineValueDto(ValueDto valueDto) {
        ValueDto.Thickness thickness = valueDto instanceof ValueDto.Thickness ? (ValueDto.Thickness) valueDto : null;
        Integer numValueOf = thickness != null ? Integer.valueOf(thickness.getValue()) : null;
        ValueDto.Colors colors = valueDto instanceof ValueDto.Colors ? (ValueDto.Colors) valueDto : null;
        LineColorDto value = colors != null ? colors.getValue() : null;
        ValueDto.Visible visible = valueDto instanceof ValueDto.Visible ? (ValueDto.Visible) valueDto : null;
        Boolean boolValueOf = visible != null ? Boolean.valueOf(visible.getValue()) : null;
        ValueDto.LineDisplayTypeValue lineDisplayTypeValue = valueDto instanceof ValueDto.LineDisplayTypeValue ? (ValueDto.LineDisplayTypeValue) valueDto : null;
        String value2 = lineDisplayTypeValue != null ? lineDisplayTypeValue.getValue() : null;
        ValueDto.DifferenceCloud differenceCloud = valueDto instanceof ValueDto.DifferenceCloud ? (ValueDto.DifferenceCloud) valueDto : null;
        this(new Surrogate(numValueOf, value, boolValueOf, value2, differenceCloud != null ? differenceCloud.getValue() : null));
    }

    public /* synthetic */ LineValueDto(ValueDto valueDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : valueDto);
    }

    @Override // com.robinhood.idl.Dto
    public LineValue toProto() {
        Integer thickness = this.surrogate.getThickness();
        LineColorDto colors = this.surrogate.getColors();
        LineColor proto = colors != null ? colors.toProto() : null;
        Boolean visible = this.surrogate.getVisible();
        String line_display_type_value = this.surrogate.getLine_display_type_value();
        DifferenceCloudDto difference_cloud = this.surrogate.getDifference_cloud();
        return new LineValue(thickness, proto, visible, line_display_type_value, difference_cloud != null ? difference_cloud.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[LineValueDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LineValueDto) && Intrinsics.areEqual(((LineValueDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LineValueDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0083\b\u0018\u0000 92\u00020\u0001:\u0002:9BR\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010BM\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b4\u0010)\u001a\u0004\b3\u0010\u001fR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00105\u0012\u0004\b8\u0010)\u001a\u0004\b6\u00107¨\u0006;"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "thickness", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "colors", "", "visible", "", "line_display_type_value", "Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;", "difference_cloud", "<init>", "(Ljava/lang/Integer;Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;Ljava/lang/Boolean;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;Ljava/lang/Boolean;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$black_widow_mobile_chart_externalRelease", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getThickness", "()Ljava/lang/Integer;", "getThickness$annotations", "()V", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "getColors", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "getColors$annotations", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "getVisible$annotations", "Ljava/lang/String;", "getLine_display_type_value", "getLine_display_type_value$annotations", "Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;", "getDifference_cloud", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;", "getDifference_cloud$annotations", "Companion", "$serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final LineColorDto colors;
        private final DifferenceCloudDto difference_cloud;
        private final String line_display_type_value;
        private final Integer thickness;
        private final Boolean visible;

        public Surrogate() {
            this((Integer) null, (LineColorDto) null, (Boolean) null, (String) null, (DifferenceCloudDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.thickness, surrogate.thickness) && Intrinsics.areEqual(this.colors, surrogate.colors) && Intrinsics.areEqual(this.visible, surrogate.visible) && Intrinsics.areEqual(this.line_display_type_value, surrogate.line_display_type_value) && Intrinsics.areEqual(this.difference_cloud, surrogate.difference_cloud);
        }

        public int hashCode() {
            Integer num = this.thickness;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            LineColorDto lineColorDto = this.colors;
            int iHashCode2 = (iHashCode + (lineColorDto == null ? 0 : lineColorDto.hashCode())) * 31;
            Boolean bool = this.visible;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.line_display_type_value;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            DifferenceCloudDto differenceCloudDto = this.difference_cloud;
            return iHashCode4 + (differenceCloudDto != null ? differenceCloudDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(thickness=" + this.thickness + ", colors=" + this.colors + ", visible=" + this.visible + ", line_display_type_value=" + this.line_display_type_value + ", difference_cloud=" + this.difference_cloud + ")";
        }

        /* compiled from: LineValueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$Surrogate;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LineValueDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, Integer num, LineColorDto lineColorDto, Boolean bool, String str, DifferenceCloudDto differenceCloudDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.thickness = null;
            } else {
                this.thickness = num;
            }
            if ((i & 2) == 0) {
                this.colors = null;
            } else {
                this.colors = lineColorDto;
            }
            if ((i & 4) == 0) {
                this.visible = null;
            } else {
                this.visible = bool;
            }
            if ((i & 8) == 0) {
                this.line_display_type_value = null;
            } else {
                this.line_display_type_value = str;
            }
            if ((i & 16) == 0) {
                this.difference_cloud = null;
            } else {
                this.difference_cloud = differenceCloudDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_mobile_chart_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Integer num = self.thickness;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            LineColorDto lineColorDto = self.colors;
            if (lineColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, LineColorDto.Serializer.INSTANCE, lineColorDto);
            }
            Boolean bool = self.visible;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, bool);
            }
            String str = self.line_display_type_value;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            DifferenceCloudDto differenceCloudDto = self.difference_cloud;
            if (differenceCloudDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DifferenceCloudDto.Serializer.INSTANCE, differenceCloudDto);
            }
        }

        public Surrogate(Integer num, LineColorDto lineColorDto, Boolean bool, String str, DifferenceCloudDto differenceCloudDto) {
            this.thickness = num;
            this.colors = lineColorDto;
            this.visible = bool;
            this.line_display_type_value = str;
            this.difference_cloud = differenceCloudDto;
        }

        public /* synthetic */ Surrogate(Integer num, LineColorDto lineColorDto, Boolean bool, String str, DifferenceCloudDto differenceCloudDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : lineColorDto, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : differenceCloudDto);
        }

        public final Integer getThickness() {
            return this.thickness;
        }

        public final LineColorDto getColors() {
            return this.colors;
        }

        public final Boolean getVisible() {
            return this.visible;
        }

        public final String getLine_display_type_value() {
            return this.line_display_type_value;
        }

        public final DifferenceCloudDto getDifference_cloud() {
            return this.difference_cloud;
        }
    }

    /* compiled from: LineValueDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValue;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LineValueDto, LineValue> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LineValueDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LineValueDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LineValueDto> getBinaryBase64Serializer() {
            return (KSerializer) LineValueDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LineValue> getProtoAdapter() {
            return LineValue.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LineValueDto getZeroValue() {
            return LineValueDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LineValueDto fromProto(LineValue proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Integer thickness = proto.getThickness();
            LineColor colors = proto.getColors();
            DefaultConstructorMarker defaultConstructorMarker = null;
            LineColorDto lineColorDtoFromProto = colors != null ? LineColorDto.INSTANCE.fromProto(colors) : null;
            Boolean visible = proto.getVisible();
            String line_display_type_value = proto.getLine_display_type_value();
            DifferenceCloud difference_cloud = proto.getDifference_cloud();
            return new LineValueDto(new Surrogate(thickness, lineColorDtoFromProto, visible, line_display_type_value, difference_cloud != null ? DifferenceCloudDto.INSTANCE.fromProto(difference_cloud) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.LineValueDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LineValueDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new LineValueDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LineValueDto.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Thickness", "Colors", "Visible", "LineDisplayTypeValue", "DifferenceCloud", "Companion", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto$Colors;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto$DifferenceCloud;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto$LineDisplayTypeValue;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto$Thickness;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto$Visible;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ValueDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ValueDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ValueDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: LineValueDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto$Thickness;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto;", "", "value", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getValue", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Thickness extends ValueDto {
            private final int value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Thickness) && this.value == ((Thickness) other).value;
            }

            public int hashCode() {
                return Integer.hashCode(this.value);
            }

            public String toString() {
                return "Thickness(value=" + this.value + ")";
            }

            public final int getValue() {
                return this.value;
            }

            public Thickness(int i) {
                super(null);
                this.value = i;
            }
        }

        /* compiled from: LineValueDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto$Colors;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Colors extends ValueDto {
            private final LineColorDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Colors) && Intrinsics.areEqual(this.value, ((Colors) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Colors(value=" + this.value + ")";
            }

            public final LineColorDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Colors(LineColorDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: LineValueDto.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto$Visible;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto;", "", "value", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getValue", "()Z", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Visible extends ValueDto {
            private final boolean value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Visible) && this.value == ((Visible) other).value;
            }

            public int hashCode() {
                return Boolean.hashCode(this.value);
            }

            public String toString() {
                return "Visible(value=" + this.value + ")";
            }

            public final boolean getValue() {
                return this.value;
            }

            public Visible(boolean z) {
                super(null);
                this.value = z;
            }
        }

        /* compiled from: LineValueDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto$LineDisplayTypeValue;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LineDisplayTypeValue extends ValueDto {
            private final String value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LineDisplayTypeValue) && Intrinsics.areEqual(this.value, ((LineDisplayTypeValue) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "LineDisplayTypeValue(value=" + this.value + ")";
            }

            public final String getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LineDisplayTypeValue(String value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: LineValueDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto$DifferenceCloud;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;", "value", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloudDto;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DifferenceCloud extends ValueDto {
            private final DifferenceCloudDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DifferenceCloud) && Intrinsics.areEqual(this.value, ((DifferenceCloud) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DifferenceCloud(value=" + this.value + ")";
            }

            public final DifferenceCloudDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DifferenceCloud(DifferenceCloudDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: LineValueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$ValueDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValue;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ValueDto, LineValue> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<LineValue> getProtoAdapter() {
                return LineValue.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ValueDto fromProto(LineValue proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getThickness() != null) {
                    return new Thickness(proto.getThickness().intValue());
                }
                if (proto.getColors() != null) {
                    return new Colors(LineColorDto.INSTANCE.fromProto(proto.getColors()));
                }
                if (proto.getVisible() != null) {
                    return new Visible(proto.getVisible().booleanValue());
                }
                if (proto.getLine_display_type_value() != null) {
                    return new LineDisplayTypeValue(proto.getLine_display_type_value());
                }
                if (proto.getDifference_cloud() != null) {
                    return new DifferenceCloud(DifferenceCloudDto.INSTANCE.fromProto(proto.getDifference_cloud()));
                }
                return null;
            }
        }
    }

    /* compiled from: LineValueDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<LineValueDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow.contracts.mobile_app_chart.proto.v1.LineValue", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LineValueDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LineValueDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LineValueDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LineValueDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValueDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "black_widow.contracts.mobile_app_chart.proto.v1.LineValueDto";
        }
    }
}
