package microgram.p507ui.sdui;

import com.plaid.internal.EnumC7081g;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB}\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÁ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b6\u0010.\u001a\u0004\b4\u00105R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010*\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010,R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\b<\u0010.\u001a\u0004\b:\u0010;R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010\"R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\bC\u00105R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010F¨\u0006I"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiGradientAnimationChartFillStyle;", "Lmicrogram/ui/sdui/SduiChartFillStyle;", "", "seen1", "Lmicrogram/ui/sdui/SduiGradientChartFillStyle;", "afterPivotGradient", "Lmicrogram/ui/sdui/SduiThemedColor;", "baseColor", "", "baseColorOpacity", "beforePivotGradient", "Lmicrogram/ui/sdui/SduiCornerRadiusInfo;", "cornerRadiusInfo", "Lmicrogram/ui/sdui/SduiGradientStyle;", "gradientStyle", "", "id", "speed", "Lmicrogram/ui/sdui/SduiChartFillType;", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiGradientChartFillStyle;Lmicrogram/ui/sdui/SduiThemedColor;DLmicrogram/ui/sdui/SduiGradientChartFillStyle;Lmicrogram/ui/sdui/SduiCornerRadiusInfo;Lmicrogram/ui/sdui/SduiGradientStyle;Ljava/lang/String;DLmicrogram/ui/sdui/SduiChartFillType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiGradientAnimationChartFillStyle;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiGradientChartFillStyle;", "getAfterPivotGradient", "()Lmicrogram/ui/sdui/SduiGradientChartFillStyle;", "getAfterPivotGradient$annotations", "()V", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBaseColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBaseColor$annotations", "D", "getBaseColorOpacity", "()D", "getBaseColorOpacity$annotations", "getBeforePivotGradient", "getBeforePivotGradient$annotations", "Lmicrogram/ui/sdui/SduiCornerRadiusInfo;", "getCornerRadiusInfo", "()Lmicrogram/ui/sdui/SduiCornerRadiusInfo;", "getCornerRadiusInfo$annotations", "Lmicrogram/ui/sdui/SduiGradientStyle;", "getGradientStyle", "()Lmicrogram/ui/sdui/SduiGradientStyle;", "getGradientStyle$annotations", "Ljava/lang/String;", "getId", "getSpeed", "Lmicrogram/ui/sdui/SduiChartFillType;", "getType", "()Lmicrogram/ui/sdui/SduiChartFillType;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiGradientAnimationChartFillStyle extends SduiChartFillStyle {
    private final SduiGradientChartFillStyle afterPivotGradient;
    private final SduiThemedColor baseColor;
    private final double baseColorOpacity;
    private final SduiGradientChartFillStyle beforePivotGradient;
    private final SduiCornerRadiusInfo cornerRadiusInfo;
    private final SduiGradientStyle gradientStyle;
    private final String id;
    private final double speed;
    private final SduiChartFillType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, SduiGradientStyle.INSTANCE.serializer(), null, null, SduiChartFillType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiGradientAnimationChartFillStyle)) {
            return false;
        }
        SduiGradientAnimationChartFillStyle sduiGradientAnimationChartFillStyle = (SduiGradientAnimationChartFillStyle) other;
        return Intrinsics.areEqual(this.afterPivotGradient, sduiGradientAnimationChartFillStyle.afterPivotGradient) && Intrinsics.areEqual(this.baseColor, sduiGradientAnimationChartFillStyle.baseColor) && Double.compare(this.baseColorOpacity, sduiGradientAnimationChartFillStyle.baseColorOpacity) == 0 && Intrinsics.areEqual(this.beforePivotGradient, sduiGradientAnimationChartFillStyle.beforePivotGradient) && Intrinsics.areEqual(this.cornerRadiusInfo, sduiGradientAnimationChartFillStyle.cornerRadiusInfo) && this.gradientStyle == sduiGradientAnimationChartFillStyle.gradientStyle && Intrinsics.areEqual(this.id, sduiGradientAnimationChartFillStyle.id) && Double.compare(this.speed, sduiGradientAnimationChartFillStyle.speed) == 0 && this.type == sduiGradientAnimationChartFillStyle.type;
    }

    public int hashCode() {
        int iHashCode = ((((((this.afterPivotGradient.hashCode() * 31) + this.baseColor.hashCode()) * 31) + Double.hashCode(this.baseColorOpacity)) * 31) + this.beforePivotGradient.hashCode()) * 31;
        SduiCornerRadiusInfo sduiCornerRadiusInfo = this.cornerRadiusInfo;
        int iHashCode2 = (((iHashCode + (sduiCornerRadiusInfo == null ? 0 : sduiCornerRadiusInfo.hashCode())) * 31) + this.gradientStyle.hashCode()) * 31;
        String str = this.id;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Double.hashCode(this.speed)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SduiGradientAnimationChartFillStyle(afterPivotGradient=" + this.afterPivotGradient + ", baseColor=" + this.baseColor + ", baseColorOpacity=" + this.baseColorOpacity + ", beforePivotGradient=" + this.beforePivotGradient + ", cornerRadiusInfo=" + this.cornerRadiusInfo + ", gradientStyle=" + this.gradientStyle + ", id=" + this.id + ", speed=" + this.speed + ", type=" + this.type + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiGradientAnimationChartFillStyle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiGradientAnimationChartFillStyle;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiGradientAnimationChartFillStyle> serializer() {
            return SduiGradientAnimationChartFillStyle$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiGradientAnimationChartFillStyle(int i, @SerialName("after_pivot_gradient") SduiGradientChartFillStyle sduiGradientChartFillStyle, @SerialName("base_color") SduiThemedColor sduiThemedColor, @SerialName("base_color_opacity") double d, @SerialName("before_pivot_gradient") SduiGradientChartFillStyle sduiGradientChartFillStyle2, @SerialName("corner_radius_info") SduiCornerRadiusInfo sduiCornerRadiusInfo, @SerialName("gradient_style") SduiGradientStyle sduiGradientStyle, String str, double d2, SduiChartFillType sduiChartFillType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (139 != (i & EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE)) {
            PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, SduiGradientAnimationChartFillStyle$$serializer.INSTANCE.getDescriptor());
        }
        this.afterPivotGradient = sduiGradientChartFillStyle;
        this.baseColor = sduiThemedColor;
        if ((i & 4) == 0) {
            this.baseColorOpacity = 1.0d;
        } else {
            this.baseColorOpacity = d;
        }
        this.beforePivotGradient = sduiGradientChartFillStyle2;
        if ((i & 16) == 0) {
            this.cornerRadiusInfo = null;
        } else {
            this.cornerRadiusInfo = sduiCornerRadiusInfo;
        }
        if ((i & 32) == 0) {
            this.gradientStyle = SduiGradientStyle.TOP_TO_BOTTOM;
        } else {
            this.gradientStyle = sduiGradientStyle;
        }
        if ((i & 64) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.speed = d2;
        if ((i & 256) == 0) {
            this.type = SduiChartFillType.GRADIENT_ANIMATION;
        } else {
            this.type = sduiChartFillType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiGradientAnimationChartFillStyle self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        SduiGradientChartFillStyle$$serializer sduiGradientChartFillStyle$$serializer = SduiGradientChartFillStyle$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, sduiGradientChartFillStyle$$serializer, self.afterPivotGradient);
        output.encodeSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.baseColor);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Double.compare(self.baseColorOpacity, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 2, self.baseColorOpacity);
        }
        output.encodeSerializableElement(serialDesc, 3, sduiGradientChartFillStyle$$serializer, self.beforePivotGradient);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.cornerRadiusInfo != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SduiCornerRadiusInfo$$serializer.INSTANCE, self.cornerRadiusInfo);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.gradientStyle != SduiGradientStyle.TOP_TO_BOTTOM) {
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.gradientStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.id);
        }
        output.encodeDoubleElement(serialDesc, 7, self.speed);
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.type == SduiChartFillType.GRADIENT_ANIMATION) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 8, kSerializerArr[8], self.type);
    }
}
