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
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BY\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104¨\u00068"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiIconWithAction;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "Lmicrogram/ui/sdui/SduiIcon;", "icon", "", "iconAltText", "Lmicrogram/ui/sdui/SduiThemedColor;", "iconColorOverride", "Lmicrogram/ui/sdui/SduiWebPopover;", "webPopover", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiIcon;Ljava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiWebPopover;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiIconWithAction;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "Ljava/lang/String;", "getIconAltText", "getIconAltText$annotations", "()V", "Lmicrogram/ui/sdui/SduiThemedColor;", "getIconColorOverride", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getIconColorOverride$annotations", "Lmicrogram/ui/sdui/SduiWebPopover;", "getWebPopover", "()Lmicrogram/ui/sdui/SduiWebPopover;", "getWebPopover$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiIconWithAction {
    private final SduiAction action;
    private final SduiIcon icon;
    private final String iconAltText;
    private final SduiThemedColor iconColorOverride;
    private final SduiWebPopover webPopover;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiIcon.INSTANCE.serializer(), null, null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiIconWithAction)) {
            return false;
        }
        SduiIconWithAction sduiIconWithAction = (SduiIconWithAction) other;
        return Intrinsics.areEqual(this.action, sduiIconWithAction.action) && this.icon == sduiIconWithAction.icon && Intrinsics.areEqual(this.iconAltText, sduiIconWithAction.iconAltText) && Intrinsics.areEqual(this.iconColorOverride, sduiIconWithAction.iconColorOverride) && Intrinsics.areEqual(this.webPopover, sduiIconWithAction.webPopover);
    }

    public int hashCode() {
        int iHashCode = ((((this.action.hashCode() * 31) + this.icon.hashCode()) * 31) + this.iconAltText.hashCode()) * 31;
        SduiThemedColor sduiThemedColor = this.iconColorOverride;
        int iHashCode2 = (iHashCode + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31;
        SduiWebPopover sduiWebPopover = this.webPopover;
        return iHashCode2 + (sduiWebPopover != null ? sduiWebPopover.hashCode() : 0);
    }

    public String toString() {
        return "SduiIconWithAction(action=" + this.action + ", icon=" + this.icon + ", iconAltText=" + this.iconAltText + ", iconColorOverride=" + this.iconColorOverride + ", webPopover=" + this.webPopover + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiIconWithAction$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiIconWithAction;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiIconWithAction> serializer() {
            return SduiIconWithAction$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiIconWithAction(int i, SduiAction sduiAction, SduiIcon sduiIcon, @SerialName("icon_alt_text") String str, @SerialName("icon_color_override") SduiThemedColor sduiThemedColor, @SerialName("web_popover") SduiWebPopover sduiWebPopover, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, SduiIconWithAction$$serializer.INSTANCE.getDescriptor());
        }
        this.action = sduiAction;
        this.icon = sduiIcon;
        this.iconAltText = str;
        if ((i & 8) == 0) {
            this.iconColorOverride = null;
        } else {
            this.iconColorOverride = sduiThemedColor;
        }
        if ((i & 16) == 0) {
            this.webPopover = null;
        } else {
            this.webPopover = sduiWebPopover;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiIconWithAction self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.icon);
        output.encodeStringElement(serialDesc, 2, self.iconAltText);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.iconColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, SduiThemedColor$$serializer.INSTANCE, self.iconColorOverride);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.webPopover == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, SduiWebPopover$$serializer.INSTANCE, self.webPopover);
    }
}
