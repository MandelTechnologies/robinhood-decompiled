package microgram.p507ui.sdui;

import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ActionButton;
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
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCB\u0089\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R$\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b3\u0010-\u001a\u0004\b2\u00100R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010!R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00104\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010!R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\b<\u0010-\u001a\u0004\b:\u0010;R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010?R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010.\u0012\u0004\bA\u0010-\u001a\u0004\b@\u00100R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\bB\u0010?¨\u0006E"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiNavigationRowWithEndButton;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "buttonAction", "Lmicrogram/ui/sdui/SduiThemedColor;", "buttonBackgroundColor", "buttonForegroundColor", "", "buttonLabel", "loggingIdentifier", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiText;", "subtitle", "textColor", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiText;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiNavigationRowWithEndButton;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getButtonAction", "()Lmicrogram/ui/sdui/SduiAction;", "getButtonAction$annotations", "()V", "Lmicrogram/ui/sdui/SduiThemedColor;", "getButtonBackgroundColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getButtonBackgroundColor$annotations", "getButtonForegroundColor", "getButtonForegroundColor$annotations", "Ljava/lang/String;", "getButtonLabel", "getButtonLabel$annotations", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiText;", "getSubtitle", "()Lmicrogram/ui/sdui/SduiText;", "getTextColor", "getTextColor$annotations", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiNavigationRowWithEndButton extends SduiComponent {
    private final SduiAction buttonAction;
    private final SduiThemedColor buttonBackgroundColor;
    private final SduiThemedColor buttonForegroundColor;
    private final String buttonLabel;
    private final String loggingIdentifier;
    private final SduiComponentType sduiComponentType;
    private final SduiText subtitle;
    private final SduiThemedColor textColor;
    private final SduiText title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, SduiComponentType.INSTANCE.serializer(), null, null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiNavigationRowWithEndButton)) {
            return false;
        }
        SduiNavigationRowWithEndButton sduiNavigationRowWithEndButton = (SduiNavigationRowWithEndButton) other;
        return Intrinsics.areEqual(this.buttonAction, sduiNavigationRowWithEndButton.buttonAction) && Intrinsics.areEqual(this.buttonBackgroundColor, sduiNavigationRowWithEndButton.buttonBackgroundColor) && Intrinsics.areEqual(this.buttonForegroundColor, sduiNavigationRowWithEndButton.buttonForegroundColor) && Intrinsics.areEqual(this.buttonLabel, sduiNavigationRowWithEndButton.buttonLabel) && Intrinsics.areEqual(this.loggingIdentifier, sduiNavigationRowWithEndButton.loggingIdentifier) && this.sduiComponentType == sduiNavigationRowWithEndButton.sduiComponentType && Intrinsics.areEqual(this.subtitle, sduiNavigationRowWithEndButton.subtitle) && Intrinsics.areEqual(this.textColor, sduiNavigationRowWithEndButton.textColor) && Intrinsics.areEqual(this.title, sduiNavigationRowWithEndButton.title);
    }

    public int hashCode() {
        int iHashCode = this.buttonAction.hashCode() * 31;
        SduiThemedColor sduiThemedColor = this.buttonBackgroundColor;
        int iHashCode2 = (iHashCode + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31;
        SduiThemedColor sduiThemedColor2 = this.buttonForegroundColor;
        int iHashCode3 = (((iHashCode2 + (sduiThemedColor2 == null ? 0 : sduiThemedColor2.hashCode())) * 31) + this.buttonLabel.hashCode()) * 31;
        String str = this.loggingIdentifier;
        int iHashCode4 = (((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
        SduiThemedColor sduiThemedColor3 = this.textColor;
        return ((iHashCode4 + (sduiThemedColor3 != null ? sduiThemedColor3.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiNavigationRowWithEndButton(buttonAction=" + this.buttonAction + ", buttonBackgroundColor=" + this.buttonBackgroundColor + ", buttonForegroundColor=" + this.buttonForegroundColor + ", buttonLabel=" + this.buttonLabel + ", loggingIdentifier=" + this.loggingIdentifier + ", sduiComponentType=" + this.sduiComponentType + ", subtitle=" + this.subtitle + ", textColor=" + this.textColor + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiNavigationRowWithEndButton$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiNavigationRowWithEndButton;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiNavigationRowWithEndButton> serializer() {
            return SduiNavigationRowWithEndButton$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiNavigationRowWithEndButton(int i, @SerialName(ActionButton.f10629type) SduiAction sduiAction, @SerialName("button_background_color") SduiThemedColor sduiThemedColor, @SerialName("button_foreground_color") SduiThemedColor sduiThemedColor2, @SerialName("button_label") String str, @SerialName("logging_identifier") String str2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiText sduiText, @SerialName("text_color") SduiThemedColor sduiThemedColor3, SduiText sduiText2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (329 != (i & EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE)) {
            PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE, SduiNavigationRowWithEndButton$$serializer.INSTANCE.getDescriptor());
        }
        this.buttonAction = sduiAction;
        if ((i & 2) == 0) {
            this.buttonBackgroundColor = null;
        } else {
            this.buttonBackgroundColor = sduiThemedColor;
        }
        if ((i & 4) == 0) {
            this.buttonForegroundColor = null;
        } else {
            this.buttonForegroundColor = sduiThemedColor2;
        }
        this.buttonLabel = str;
        if ((i & 16) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str2;
        }
        if ((i & 32) == 0) {
            this.sduiComponentType = SduiComponentType.NAVIGATION_ROW_WITH_END_BUTTON;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.subtitle = sduiText;
        if ((i & 128) == 0) {
            this.textColor = null;
        } else {
            this.textColor = sduiThemedColor3;
        }
        this.title = sduiText2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiNavigationRowWithEndButton self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.buttonAction);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.buttonBackgroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.buttonBackgroundColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.buttonForegroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiThemedColor$$serializer.INSTANCE, self.buttonForegroundColor);
        }
        output.encodeStringElement(serialDesc, 3, self.buttonLabel);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.sduiComponentType != SduiComponentType.NAVIGATION_ROW_WITH_END_BUTTON) {
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.sduiComponentType);
        }
        SduiText$$serializer sduiText$$serializer = SduiText$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 6, sduiText$$serializer, self.subtitle);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.textColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, SduiThemedColor$$serializer.INSTANCE, self.textColor);
        }
        output.encodeSerializableElement(serialDesc, 8, sduiText$$serializer, self.title);
    }
}
