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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB\u0081\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÁ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00104\u0012\u0004\b6\u00107\u001a\u0004\b\f\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010$R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010:\u0012\u0004\b=\u00107\u001a\u0004\b;\u0010<R\"\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00108\u0012\u0004\b?\u00107\u001a\u0004\b>\u0010$R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010@\u0012\u0004\bC\u00107\u001a\u0004\bA\u0010BR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bE\u0010F¨\u0006I"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextButton;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "Lmicrogram/ui/sdui/SduiThemedColor;", ResourceTypes.COLOR, "Lmicrogram/ui/sdui/SduiButtonIcon;", "icon", "", "isEnabled", "", AnnotatedPrivateKey.LABEL, "", "loggingActionIdentifier", "loggingIdentifier", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTextButtonSize;", "size", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiButtonIcon;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTextButtonSize;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTextButton;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiThemedColor;", "getColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "Lmicrogram/ui/sdui/SduiButtonIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiButtonIcon;", "Z", "()Z", "isEnabled$annotations", "()V", "Ljava/lang/String;", "getLabel", "Ljava/lang/Long;", "getLoggingActionIdentifier", "()Ljava/lang/Long;", "getLoggingActionIdentifier$annotations", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiTextButtonSize;", "getSize", "()Lmicrogram/ui/sdui/SduiTextButtonSize;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTextButton extends SduiComponent {
    private final SduiAction action;
    private final SduiThemedColor color;
    private final SduiButtonIcon icon;
    private final boolean isEnabled;
    private final String label;
    private final Long loggingActionIdentifier;
    private final String loggingIdentifier;
    private final SduiComponentType sduiComponentType;
    private final SduiTextButtonSize size;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, SduiComponentType.INSTANCE.serializer(), SduiTextButtonSize.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTextButton)) {
            return false;
        }
        SduiTextButton sduiTextButton = (SduiTextButton) other;
        return Intrinsics.areEqual(this.action, sduiTextButton.action) && Intrinsics.areEqual(this.color, sduiTextButton.color) && Intrinsics.areEqual(this.icon, sduiTextButton.icon) && this.isEnabled == sduiTextButton.isEnabled && Intrinsics.areEqual(this.label, sduiTextButton.label) && Intrinsics.areEqual(this.loggingActionIdentifier, sduiTextButton.loggingActionIdentifier) && Intrinsics.areEqual(this.loggingIdentifier, sduiTextButton.loggingIdentifier) && this.sduiComponentType == sduiTextButton.sduiComponentType && this.size == sduiTextButton.size;
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        SduiThemedColor sduiThemedColor = this.color;
        int iHashCode2 = (iHashCode + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31;
        SduiButtonIcon sduiButtonIcon = this.icon;
        int iHashCode3 = (((((iHashCode2 + (sduiButtonIcon == null ? 0 : sduiButtonIcon.hashCode())) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.label.hashCode()) * 31;
        Long l = this.loggingActionIdentifier;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.loggingIdentifier;
        return ((((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.sduiComponentType.hashCode()) * 31) + this.size.hashCode();
    }

    public String toString() {
        return "SduiTextButton(action=" + this.action + ", color=" + this.color + ", icon=" + this.icon + ", isEnabled=" + this.isEnabled + ", label=" + this.label + ", loggingActionIdentifier=" + this.loggingActionIdentifier + ", loggingIdentifier=" + this.loggingIdentifier + ", sduiComponentType=" + this.sduiComponentType + ", size=" + this.size + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextButton$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTextButton;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTextButton> serializer() {
            return SduiTextButton$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiTextButton(int i, SduiAction sduiAction, SduiThemedColor sduiThemedColor, SduiButtonIcon sduiButtonIcon, @SerialName("is_enabled") boolean z, String str, @SerialName("logging_action_identifier") Long l, @SerialName("logging_identifier") String str2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiTextButtonSize sduiTextButtonSize, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (17 != (i & 17)) {
            PluginExceptions.throwMissingFieldException(i, 17, SduiTextButton$$serializer.INSTANCE.getDescriptor());
        }
        this.action = sduiAction;
        if ((i & 2) == 0) {
            this.color = null;
        } else {
            this.color = sduiThemedColor;
        }
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = sduiButtonIcon;
        }
        if ((i & 8) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z;
        }
        this.label = str;
        if ((i & 32) == 0) {
            this.loggingActionIdentifier = null;
        } else {
            this.loggingActionIdentifier = l;
        }
        if ((i & 64) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str2;
        }
        if ((i & 128) == 0) {
            this.sduiComponentType = SduiComponentType.TEXT_BUTTON;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 256) == 0) {
            this.size = SduiTextButtonSize.MEDIUM;
        } else {
            this.size = sduiTextButtonSize;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTextButton self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.color != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.color);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiButtonIcon$$serializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 3, self.isEnabled);
        }
        output.encodeStringElement(serialDesc, 4, self.label);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.loggingActionIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.loggingActionIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.sduiComponentType != SduiComponentType.TEXT_BUTTON) {
            output.encodeSerializableElement(serialDesc, 7, kSerializerArr[7], self.sduiComponentType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.size == SduiTextButtonSize.MEDIUM) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 8, kSerializerArr[8], self.size);
    }
}
