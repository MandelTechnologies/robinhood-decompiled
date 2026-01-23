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
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B_\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b\n\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001eR \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00101\u0012\u0004\b4\u0010.\u001a\u0004\b2\u00103R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b5\u0010\u001e¨\u00068"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSettingsRowCondensed;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "Lmicrogram/ui/sdui/SduiIcon;", "icon", "", "isEnabled", "", AnnotatedPrivateKey.LABEL, "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "value", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiIcon;ZLjava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiSettingsRowCondensed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "Z", "()Z", "isEnabled$annotations", "()V", "Ljava/lang/String;", "getLabel", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getValue", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiSettingsRowCondensed extends SduiComponent {
    private final SduiAction action;
    private final SduiIcon icon;
    private final boolean isEnabled;
    private final String label;
    private final SduiComponentType sduiComponentType;
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiIcon.INSTANCE.serializer(), null, null, SduiComponentType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiSettingsRowCondensed)) {
            return false;
        }
        SduiSettingsRowCondensed sduiSettingsRowCondensed = (SduiSettingsRowCondensed) other;
        return Intrinsics.areEqual(this.action, sduiSettingsRowCondensed.action) && this.icon == sduiSettingsRowCondensed.icon && this.isEnabled == sduiSettingsRowCondensed.isEnabled && Intrinsics.areEqual(this.label, sduiSettingsRowCondensed.label) && this.sduiComponentType == sduiSettingsRowCondensed.sduiComponentType && Intrinsics.areEqual(this.value, sduiSettingsRowCondensed.value);
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        SduiIcon sduiIcon = this.icon;
        return ((((((((iHashCode + (sduiIcon == null ? 0 : sduiIcon.hashCode())) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.label.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "SduiSettingsRowCondensed(action=" + this.action + ", icon=" + this.icon + ", isEnabled=" + this.isEnabled + ", label=" + this.label + ", sduiComponentType=" + this.sduiComponentType + ", value=" + this.value + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSettingsRowCondensed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiSettingsRowCondensed;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiSettingsRowCondensed> serializer() {
            return SduiSettingsRowCondensed$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiSettingsRowCondensed(int i, SduiAction sduiAction, SduiIcon sduiIcon, @SerialName("is_enabled") boolean z, String str, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (41 != (i & 41)) {
            PluginExceptions.throwMissingFieldException(i, 41, SduiSettingsRowCondensed$$serializer.INSTANCE.getDescriptor());
        }
        this.action = sduiAction;
        if ((i & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = sduiIcon;
        }
        if ((i & 4) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z;
        }
        this.label = str;
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.SETTINGS_ROW_CONDENSED;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.value = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiSettingsRowCondensed self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 2, self.isEnabled);
        }
        output.encodeStringElement(serialDesc, 3, self.label);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sduiComponentType != SduiComponentType.SETTINGS_ROW_CONDENSED) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
        }
        output.encodeStringElement(serialDesc, 5, self.value);
    }
}
