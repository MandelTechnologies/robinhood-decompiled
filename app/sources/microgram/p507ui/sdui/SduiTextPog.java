package microgram.p507ui.sdui;

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
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:Bg\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010'R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b/\u0010)\u001a\u0004\b-\u0010.R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b0\u0010)\u001a\u0004\b\t\u0010.R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b4\u0010)\u001a\u0004\b2\u00103R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010\u001e¨\u0006<"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextPog;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", "backgroundColorOverride", "foregroundColorOverride", "", "hasBorder", "isEnabled", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTextPogSize;", "size", "", "text", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;ZZLmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTextPogSize;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTextPog;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColorOverride", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColorOverride$annotations", "()V", "getForegroundColorOverride", "getForegroundColorOverride$annotations", "Z", "getHasBorder", "()Z", "getHasBorder$annotations", "isEnabled$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiTextPogSize;", "getSize", "()Lmicrogram/ui/sdui/SduiTextPogSize;", "Ljava/lang/String;", "getText", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTextPog extends SduiComponent {
    private final SduiThemedColor backgroundColorOverride;
    private final SduiThemedColor foregroundColorOverride;
    private final boolean hasBorder;
    private final boolean isEnabled;
    private final SduiComponentType sduiComponentType;
    private final SduiTextPogSize size;
    private final String text;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, SduiComponentType.INSTANCE.serializer(), SduiTextPogSize.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTextPog)) {
            return false;
        }
        SduiTextPog sduiTextPog = (SduiTextPog) other;
        return Intrinsics.areEqual(this.backgroundColorOverride, sduiTextPog.backgroundColorOverride) && Intrinsics.areEqual(this.foregroundColorOverride, sduiTextPog.foregroundColorOverride) && this.hasBorder == sduiTextPog.hasBorder && this.isEnabled == sduiTextPog.isEnabled && this.sduiComponentType == sduiTextPog.sduiComponentType && this.size == sduiTextPog.size && Intrinsics.areEqual(this.text, sduiTextPog.text);
    }

    public int hashCode() {
        SduiThemedColor sduiThemedColor = this.backgroundColorOverride;
        int iHashCode = (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode()) * 31;
        SduiThemedColor sduiThemedColor2 = this.foregroundColorOverride;
        return ((((((((((iHashCode + (sduiThemedColor2 != null ? sduiThemedColor2.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasBorder)) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.sduiComponentType.hashCode()) * 31) + this.size.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "SduiTextPog(backgroundColorOverride=" + this.backgroundColorOverride + ", foregroundColorOverride=" + this.foregroundColorOverride + ", hasBorder=" + this.hasBorder + ", isEnabled=" + this.isEnabled + ", sduiComponentType=" + this.sduiComponentType + ", size=" + this.size + ", text=" + this.text + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextPog$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTextPog;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTextPog> serializer() {
            return SduiTextPog$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiTextPog(int i, @SerialName("background_color_override") SduiThemedColor sduiThemedColor, @SerialName("foreground_color_override") SduiThemedColor sduiThemedColor2, @SerialName("has_border") boolean z, @SerialName("is_enabled") boolean z2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiTextPogSize sduiTextPogSize, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (96 != (i & 96)) {
            PluginExceptions.throwMissingFieldException(i, 96, SduiTextPog$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.backgroundColorOverride = null;
        } else {
            this.backgroundColorOverride = sduiThemedColor;
        }
        if ((i & 2) == 0) {
            this.foregroundColorOverride = null;
        } else {
            this.foregroundColorOverride = sduiThemedColor2;
        }
        if ((i & 4) == 0) {
            this.hasBorder = false;
        } else {
            this.hasBorder = z;
        }
        if ((i & 8) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z2;
        }
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.TEXT_POG;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.size = sduiTextPogSize;
        this.text = str;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTextPog self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.backgroundColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.backgroundColorOverride);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.foregroundColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.foregroundColorOverride);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.hasBorder) {
            output.encodeBooleanElement(serialDesc, 2, self.hasBorder);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 3, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sduiComponentType != SduiComponentType.TEXT_POG) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
        }
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.size);
        output.encodeStringElement(serialDesc, 6, self.text);
    }
}
