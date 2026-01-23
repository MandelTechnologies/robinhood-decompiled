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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b(\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QPB\u0099\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 HÁ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u00103R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b6\u00107\u001a\u0004\b\n\u00105R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010'R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\b;\u00107\u001a\u0004\b:\u0010'R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010<\u0012\u0004\b?\u00107\u001a\u0004\b=\u0010>R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010BR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010C\u0012\u0004\bF\u00107\u001a\u0004\bD\u0010ER\"\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010C\u0012\u0004\bH\u00107\u001a\u0004\bG\u0010ER\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010KR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010L\u0012\u0004\bO\u00107\u001a\u0004\bM\u0010N¨\u0006R"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiButton;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "Lmicrogram/ui/sdui/SduiButtonIcon;", "icon", "", "isEnabled", "", AnnotatedPrivateKey.LABEL, "loggingIdentifier", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiButtonState;", "state", "Lmicrogram/ui/sdui/SduiThemedColor;", "textColor", "tintColor", "Lmicrogram/ui/sdui/SduiButtonType;", "type", "Lmicrogram/ui/sdui/SduiWebButtonWidth;", "webWidth", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiButtonIcon;ZLjava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiButtonState;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiButtonType;Lmicrogram/ui/sdui/SduiWebButtonWidth;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiButton;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiButtonIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiButtonIcon;", "Z", "()Z", "isEnabled$annotations", "()V", "Ljava/lang/String;", "getLabel", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiButtonState;", "getState", "()Lmicrogram/ui/sdui/SduiButtonState;", "Lmicrogram/ui/sdui/SduiThemedColor;", "getTextColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getTextColor$annotations", "getTintColor", "getTintColor$annotations", "Lmicrogram/ui/sdui/SduiButtonType;", "getType", "()Lmicrogram/ui/sdui/SduiButtonType;", "Lmicrogram/ui/sdui/SduiWebButtonWidth;", "getWebWidth", "()Lmicrogram/ui/sdui/SduiWebButtonWidth;", "getWebWidth$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiButton extends SduiComponent {
    private final SduiAction action;
    private final SduiButtonIcon icon;
    private final boolean isEnabled;
    private final String label;
    private final String loggingIdentifier;
    private final SduiComponentType sduiComponentType;
    private final SduiButtonState state;
    private final SduiThemedColor textColor;
    private final SduiThemedColor tintColor;
    private final SduiButtonType type;
    private final SduiWebButtonWidth webWidth;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, SduiComponentType.INSTANCE.serializer(), SduiButtonState.INSTANCE.serializer(), null, null, SduiButtonType.INSTANCE.serializer(), SduiWebButtonWidth.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiButton)) {
            return false;
        }
        SduiButton sduiButton = (SduiButton) other;
        return Intrinsics.areEqual(this.action, sduiButton.action) && Intrinsics.areEqual(this.icon, sduiButton.icon) && this.isEnabled == sduiButton.isEnabled && Intrinsics.areEqual(this.label, sduiButton.label) && Intrinsics.areEqual(this.loggingIdentifier, sduiButton.loggingIdentifier) && this.sduiComponentType == sduiButton.sduiComponentType && this.state == sduiButton.state && Intrinsics.areEqual(this.textColor, sduiButton.textColor) && Intrinsics.areEqual(this.tintColor, sduiButton.tintColor) && this.type == sduiButton.type && this.webWidth == sduiButton.webWidth;
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        SduiButtonIcon sduiButtonIcon = this.icon;
        int iHashCode2 = (((((((((iHashCode + (sduiButtonIcon == null ? 0 : sduiButtonIcon.hashCode())) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.label.hashCode()) * 31) + this.loggingIdentifier.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiButtonState sduiButtonState = this.state;
        int iHashCode3 = (iHashCode2 + (sduiButtonState == null ? 0 : sduiButtonState.hashCode())) * 31;
        SduiThemedColor sduiThemedColor = this.textColor;
        int iHashCode4 = (iHashCode3 + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31;
        SduiThemedColor sduiThemedColor2 = this.tintColor;
        int iHashCode5 = (((iHashCode4 + (sduiThemedColor2 == null ? 0 : sduiThemedColor2.hashCode())) * 31) + this.type.hashCode()) * 31;
        SduiWebButtonWidth sduiWebButtonWidth = this.webWidth;
        return iHashCode5 + (sduiWebButtonWidth != null ? sduiWebButtonWidth.hashCode() : 0);
    }

    public String toString() {
        return "SduiButton(action=" + this.action + ", icon=" + this.icon + ", isEnabled=" + this.isEnabled + ", label=" + this.label + ", loggingIdentifier=" + this.loggingIdentifier + ", sduiComponentType=" + this.sduiComponentType + ", state=" + this.state + ", textColor=" + this.textColor + ", tintColor=" + this.tintColor + ", type=" + this.type + ", webWidth=" + this.webWidth + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiButton$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiButton;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiButton> serializer() {
            return SduiButton$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiButton(int i, SduiAction sduiAction, SduiButtonIcon sduiButtonIcon, @SerialName("is_enabled") boolean z, String str, @SerialName("logging_identifier") String str2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiButtonState sduiButtonState, @SerialName("text_color") SduiThemedColor sduiThemedColor, @SerialName("tint_color") SduiThemedColor sduiThemedColor2, SduiButtonType sduiButtonType, @SerialName("web_width") SduiWebButtonWidth sduiWebButtonWidth, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (9 != (i & 9)) {
            PluginExceptions.throwMissingFieldException(i, 9, SduiButton$$serializer.INSTANCE.getDescriptor());
        }
        this.action = sduiAction;
        if ((i & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = sduiButtonIcon;
        }
        if ((i & 4) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z;
        }
        this.label = str;
        if ((i & 16) == 0) {
            this.loggingIdentifier = "";
        } else {
            this.loggingIdentifier = str2;
        }
        if ((i & 32) == 0) {
            this.sduiComponentType = SduiComponentType.BUTTON;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 64) == 0) {
            this.state = null;
        } else {
            this.state = sduiButtonState;
        }
        if ((i & 128) == 0) {
            this.textColor = null;
        } else {
            this.textColor = sduiThemedColor;
        }
        if ((i & 256) == 0) {
            this.tintColor = null;
        } else {
            this.tintColor = sduiThemedColor2;
        }
        if ((i & 512) == 0) {
            this.type = SduiButtonType.PRIMARY;
        } else {
            this.type = sduiButtonType;
        }
        if ((i & 1024) == 0) {
            this.webWidth = null;
        } else {
            this.webWidth = sduiWebButtonWidth;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiButton self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiButtonIcon$$serializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 2, self.isEnabled);
        }
        output.encodeStringElement(serialDesc, 3, self.label);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.loggingIdentifier, "")) {
            output.encodeStringElement(serialDesc, 4, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.sduiComponentType != SduiComponentType.BUTTON) {
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.state != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, kSerializerArr[6], self.state);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.textColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, SduiThemedColor$$serializer.INSTANCE, self.textColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.tintColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, SduiThemedColor$$serializer.INSTANCE, self.tintColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.type != SduiButtonType.PRIMARY) {
            output.encodeSerializableElement(serialDesc, 9, kSerializerArr[9], self.type);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.webWidth == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, kSerializerArr[10], self.webWidth);
    }
}
