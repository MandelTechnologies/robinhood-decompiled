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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>Bu\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b\n\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b4\u0010!R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00105\u0012\u0004\b8\u00101\u001a\u0004\b6\u00107R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00109\u0012\u0004\b<\u00101\u001a\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b=\u0010!¨\u0006@"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSettingsRowStacked;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "Lmicrogram/ui/sdui/SduiIcon;", "icon", "", "isEnabled", "", AnnotatedPrivateKey.LABEL, "metadata", "Lmicrogram/ui/sdui/SduiThemedColor;", "metadataColor", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "value", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiIcon;ZLjava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiComponentType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiSettingsRowStacked;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "Z", "()Z", "isEnabled$annotations", "()V", "Ljava/lang/String;", "getLabel", "getMetadata", "Lmicrogram/ui/sdui/SduiThemedColor;", "getMetadataColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getMetadataColor$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getValue", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiSettingsRowStacked extends SduiComponent {
    private final SduiAction action;
    private final SduiIcon icon;
    private final boolean isEnabled;
    private final String label;
    private final String metadata;
    private final SduiThemedColor metadataColor;
    private final SduiComponentType sduiComponentType;
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiIcon.INSTANCE.serializer(), null, null, null, null, SduiComponentType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiSettingsRowStacked)) {
            return false;
        }
        SduiSettingsRowStacked sduiSettingsRowStacked = (SduiSettingsRowStacked) other;
        return Intrinsics.areEqual(this.action, sduiSettingsRowStacked.action) && this.icon == sduiSettingsRowStacked.icon && this.isEnabled == sduiSettingsRowStacked.isEnabled && Intrinsics.areEqual(this.label, sduiSettingsRowStacked.label) && Intrinsics.areEqual(this.metadata, sduiSettingsRowStacked.metadata) && Intrinsics.areEqual(this.metadataColor, sduiSettingsRowStacked.metadataColor) && this.sduiComponentType == sduiSettingsRowStacked.sduiComponentType && Intrinsics.areEqual(this.value, sduiSettingsRowStacked.value);
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        SduiIcon sduiIcon = this.icon;
        int iHashCode2 = (((((iHashCode + (sduiIcon == null ? 0 : sduiIcon.hashCode())) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.label.hashCode()) * 31;
        String str = this.metadata;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.metadataColor.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "SduiSettingsRowStacked(action=" + this.action + ", icon=" + this.icon + ", isEnabled=" + this.isEnabled + ", label=" + this.label + ", metadata=" + this.metadata + ", metadataColor=" + this.metadataColor + ", sduiComponentType=" + this.sduiComponentType + ", value=" + this.value + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSettingsRowStacked$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiSettingsRowStacked;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiSettingsRowStacked> serializer() {
            return SduiSettingsRowStacked$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiSettingsRowStacked(int i, SduiAction sduiAction, SduiIcon sduiIcon, @SerialName("is_enabled") boolean z, String str, String str2, @SerialName("metadata_color") SduiThemedColor sduiThemedColor, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (137 != (i & EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE)) {
            PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, SduiSettingsRowStacked$$serializer.INSTANCE.getDescriptor());
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
            this.metadata = null;
        } else {
            this.metadata = str2;
        }
        if ((i & 32) == 0) {
            SduiColor sduiColor = SduiColor.f7102FG;
            this.metadataColor = new SduiThemedColor(sduiColor, sduiColor);
        } else {
            this.metadataColor = sduiThemedColor;
        }
        if ((i & 64) == 0) {
            this.sduiComponentType = SduiComponentType.SETTINGS_ROW_STACKED;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.value = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiSettingsRowStacked self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 2, self.isEnabled);
        }
        output.encodeStringElement(serialDesc, 3, self.label);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.metadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.metadata);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5)) {
            output.encodeSerializableElement(serialDesc, 5, SduiThemedColor$$serializer.INSTANCE, self.metadataColor);
        } else {
            SduiThemedColor sduiThemedColor = self.metadataColor;
            SduiColor sduiColor = SduiColor.f7102FG;
            if (!Intrinsics.areEqual(sduiThemedColor, new SduiThemedColor(sduiColor, sduiColor))) {
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.sduiComponentType != SduiComponentType.SETTINGS_ROW_STACKED) {
            output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.sduiComponentType);
        }
        output.encodeStringElement(serialDesc, 7, self.value);
    }
}
