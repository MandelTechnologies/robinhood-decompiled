package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.BE\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u001a¨\u00060"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiIconDisplayText;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", ResourceTypes.COLOR, "Lmicrogram/ui/sdui/SduiLinearGradientColor;", "gradientColor", "Lmicrogram/ui/sdui/SduiIcon;", "icon", "", "value", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiLinearGradientColor;Lmicrogram/ui/sdui/SduiIcon;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiIconDisplayText;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "Lmicrogram/ui/sdui/SduiLinearGradientColor;", "getGradientColor", "()Lmicrogram/ui/sdui/SduiLinearGradientColor;", "getGradientColor$annotations", "()V", "Lmicrogram/ui/sdui/SduiIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "Ljava/lang/String;", "getValue", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiIconDisplayText {
    private final SduiThemedColor color;
    private final SduiLinearGradientColor gradientColor;
    private final SduiIcon icon;
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, SduiIcon.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiIconDisplayText)) {
            return false;
        }
        SduiIconDisplayText sduiIconDisplayText = (SduiIconDisplayText) other;
        return Intrinsics.areEqual(this.color, sduiIconDisplayText.color) && Intrinsics.areEqual(this.gradientColor, sduiIconDisplayText.gradientColor) && this.icon == sduiIconDisplayText.icon && Intrinsics.areEqual(this.value, sduiIconDisplayText.value);
    }

    public int hashCode() {
        int iHashCode = this.color.hashCode() * 31;
        SduiLinearGradientColor sduiLinearGradientColor = this.gradientColor;
        int iHashCode2 = (iHashCode + (sduiLinearGradientColor == null ? 0 : sduiLinearGradientColor.hashCode())) * 31;
        SduiIcon sduiIcon = this.icon;
        return ((iHashCode2 + (sduiIcon != null ? sduiIcon.hashCode() : 0)) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "SduiIconDisplayText(color=" + this.color + ", gradientColor=" + this.gradientColor + ", icon=" + this.icon + ", value=" + this.value + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiIconDisplayText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiIconDisplayText;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiIconDisplayText> serializer() {
            return SduiIconDisplayText$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiIconDisplayText(int i, SduiThemedColor sduiThemedColor, @SerialName("gradient_color") SduiLinearGradientColor sduiLinearGradientColor, SduiIcon sduiIcon, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (9 != (i & 9)) {
            PluginExceptions.throwMissingFieldException(i, 9, SduiIconDisplayText$$serializer.INSTANCE.getDescriptor());
        }
        this.color = sduiThemedColor;
        if ((i & 2) == 0) {
            this.gradientColor = null;
        } else {
            this.gradientColor = sduiLinearGradientColor;
        }
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = sduiIcon;
        }
        this.value = str;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiIconDisplayText self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.color);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.gradientColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiLinearGradientColor$$serializer.INSTANCE, self.gradientColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.icon);
        }
        output.encodeStringElement(serialDesc, 3, self.value);
    }
}
