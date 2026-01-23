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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMB\u0099\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fHÁ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b6\u00104\u001a\u0004\b5\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u00109R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\b<\u00104\u001a\u0004\b;\u0010&R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\b?\u00104\u001a\u0004\b\u000f\u0010>R \u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010=\u0012\u0004\b@\u00104\u001a\u0004\b\u0010\u0010>R\"\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010:\u0012\u0004\bB\u00104\u001a\u0004\bA\u0010&R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010C\u0012\u0004\bF\u00104\u001a\u0004\bD\u0010ER\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bK\u0010L¨\u0006O"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiIconButton;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "Lmicrogram/ui/sdui/SduiThemedColor;", "backgroundColor", "foregroundColor", "Lmicrogram/ui/sdui/SduiIcon;", "icon", "", "iconAltText", "", "isEnabled", "isLoading", "loggingIdentifier", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiIconButtonSize;", "size", "Lmicrogram/ui/sdui/SduiButtonType;", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiIcon;Ljava/lang/String;ZZLjava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiIconButtonSize;Lmicrogram/ui/sdui/SduiButtonType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiIconButton;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor$annotations", "()V", "getForegroundColor", "getForegroundColor$annotations", "Lmicrogram/ui/sdui/SduiIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "Ljava/lang/String;", "getIconAltText", "getIconAltText$annotations", "Z", "()Z", "isEnabled$annotations", "isLoading$annotations", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiIconButtonSize;", "getSize", "()Lmicrogram/ui/sdui/SduiIconButtonSize;", "Lmicrogram/ui/sdui/SduiButtonType;", "getType", "()Lmicrogram/ui/sdui/SduiButtonType;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiIconButton extends SduiComponent {
    private final SduiAction action;
    private final SduiThemedColor backgroundColor;
    private final SduiThemedColor foregroundColor;
    private final SduiIcon icon;
    private final String iconAltText;
    private final boolean isEnabled;
    private final boolean isLoading;
    private final String loggingIdentifier;
    private final SduiComponentType sduiComponentType;
    private final SduiIconButtonSize size;
    private final SduiButtonType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiIcon.INSTANCE.serializer(), null, null, null, null, SduiComponentType.INSTANCE.serializer(), SduiIconButtonSize.INSTANCE.serializer(), SduiButtonType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiIconButton)) {
            return false;
        }
        SduiIconButton sduiIconButton = (SduiIconButton) other;
        return Intrinsics.areEqual(this.action, sduiIconButton.action) && Intrinsics.areEqual(this.backgroundColor, sduiIconButton.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, sduiIconButton.foregroundColor) && this.icon == sduiIconButton.icon && Intrinsics.areEqual(this.iconAltText, sduiIconButton.iconAltText) && this.isEnabled == sduiIconButton.isEnabled && this.isLoading == sduiIconButton.isLoading && Intrinsics.areEqual(this.loggingIdentifier, sduiIconButton.loggingIdentifier) && this.sduiComponentType == sduiIconButton.sduiComponentType && this.size == sduiIconButton.size && this.type == sduiIconButton.type;
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        SduiThemedColor sduiThemedColor = this.backgroundColor;
        int iHashCode2 = (iHashCode + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31;
        SduiThemedColor sduiThemedColor2 = this.foregroundColor;
        int iHashCode3 = (((iHashCode2 + (sduiThemedColor2 == null ? 0 : sduiThemedColor2.hashCode())) * 31) + this.icon.hashCode()) * 31;
        String str = this.iconAltText;
        int iHashCode4 = (((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        String str2 = this.loggingIdentifier;
        return ((((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.sduiComponentType.hashCode()) * 31) + this.size.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SduiIconButton(action=" + this.action + ", backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ", icon=" + this.icon + ", iconAltText=" + this.iconAltText + ", isEnabled=" + this.isEnabled + ", isLoading=" + this.isLoading + ", loggingIdentifier=" + this.loggingIdentifier + ", sduiComponentType=" + this.sduiComponentType + ", size=" + this.size + ", type=" + this.type + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiIconButton$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiIconButton;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiIconButton> serializer() {
            return SduiIconButton$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiIconButton(int i, SduiAction sduiAction, @SerialName("background_color") SduiThemedColor sduiThemedColor, @SerialName("foreground_color") SduiThemedColor sduiThemedColor2, SduiIcon sduiIcon, @SerialName("icon_alt_text") String str, @SerialName("is_enabled") boolean z, @SerialName("is_loading") boolean z2, @SerialName("logging_identifier") String str2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiIconButtonSize sduiIconButtonSize, SduiButtonType sduiButtonType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (9 != (i & 9)) {
            PluginExceptions.throwMissingFieldException(i, 9, SduiIconButton$$serializer.INSTANCE.getDescriptor());
        }
        this.action = sduiAction;
        if ((i & 2) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = sduiThemedColor;
        }
        if ((i & 4) == 0) {
            this.foregroundColor = null;
        } else {
            this.foregroundColor = sduiThemedColor2;
        }
        this.icon = sduiIcon;
        if ((i & 16) == 0) {
            this.iconAltText = null;
        } else {
            this.iconAltText = str;
        }
        if ((i & 32) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z;
        }
        if ((i & 64) == 0) {
            this.isLoading = false;
        } else {
            this.isLoading = z2;
        }
        if ((i & 128) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str2;
        }
        if ((i & 256) == 0) {
            this.sduiComponentType = SduiComponentType.ICON_BUTTON;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 512) == 0) {
            this.size = SduiIconButtonSize.MEDIUM;
        } else {
            this.size = sduiIconButtonSize;
        }
        if ((i & 1024) == 0) {
            this.type = SduiButtonType.PRIMARY;
        } else {
            this.type = sduiButtonType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiIconButton self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.backgroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.backgroundColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.foregroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiThemedColor$$serializer.INSTANCE, self.foregroundColor);
        }
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.icon);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.iconAltText != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.iconAltText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 5, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.isLoading) {
            output.encodeBooleanElement(serialDesc, 6, self.isLoading);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.sduiComponentType != SduiComponentType.ICON_BUTTON) {
            output.encodeSerializableElement(serialDesc, 8, kSerializerArr[8], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.size != SduiIconButtonSize.MEDIUM) {
            output.encodeSerializableElement(serialDesc, 9, kSerializerArr[9], self.size);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.type == SduiButtonType.PRIMARY) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 10, kSerializerArr[10], self.type);
    }
}
