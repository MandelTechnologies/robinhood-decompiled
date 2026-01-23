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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.p507ui.sdui.SduiIcon;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJB\u008f\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÁ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b8\u00105\u001a\u0004\b\u000b\u00107R \u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b9\u00105\u001a\u0004\b\f\u00107R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010:\u0012\u0004\b=\u00105\u001a\u0004\b;\u0010<R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010>\u0012\u0004\bA\u00105\u001a\u0004\b?\u0010@R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010B\u0012\u0004\bE\u00105\u001a\u0004\bC\u0010DR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010$R\"\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010:\u0012\u0004\bI\u00105\u001a\u0004\bH\u0010<¨\u0006L"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChip;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "", "count", "", "hasDropdown", "isEnabled", "isSelected", "Lmicrogram/ui/sdui/SduiIcon;", "leadingIcon", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiChipSelectedStyle;", "selectedBackgroundStyle", "", "title", "trailingIcon", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Ljava/lang/Long;Ljava/lang/Boolean;ZZLmicrogram/ui/sdui/SduiIcon;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiChipSelectedStyle;Ljava/lang/String;Lmicrogram/ui/sdui/SduiIcon;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiChip;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Ljava/lang/Long;", "getCount", "()Ljava/lang/Long;", "Ljava/lang/Boolean;", "getHasDropdown", "()Ljava/lang/Boolean;", "getHasDropdown$annotations", "()V", "Z", "()Z", "isEnabled$annotations", "isSelected$annotations", "Lmicrogram/ui/sdui/SduiIcon;", "getLeadingIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "getLeadingIcon$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiChipSelectedStyle;", "getSelectedBackgroundStyle", "()Lmicrogram/ui/sdui/SduiChipSelectedStyle;", "getSelectedBackgroundStyle$annotations", "Ljava/lang/String;", "getTitle", "getTrailingIcon", "getTrailingIcon$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiChip extends SduiComponent {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiAction action;
    private final Long count;
    private final Boolean hasDropdown;
    private final boolean isEnabled;
    private final boolean isSelected;
    private final SduiIcon leadingIcon;
    private final SduiComponentType sduiComponentType;
    private final SduiChipSelectedStyle selectedBackgroundStyle;
    private final String title;
    private final SduiIcon trailingIcon;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiChip)) {
            return false;
        }
        SduiChip sduiChip = (SduiChip) other;
        return Intrinsics.areEqual(this.action, sduiChip.action) && Intrinsics.areEqual(this.count, sduiChip.count) && Intrinsics.areEqual(this.hasDropdown, sduiChip.hasDropdown) && this.isEnabled == sduiChip.isEnabled && this.isSelected == sduiChip.isSelected && this.leadingIcon == sduiChip.leadingIcon && this.sduiComponentType == sduiChip.sduiComponentType && this.selectedBackgroundStyle == sduiChip.selectedBackgroundStyle && Intrinsics.areEqual(this.title, sduiChip.title) && this.trailingIcon == sduiChip.trailingIcon;
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        Long l = this.count;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasDropdown;
        int iHashCode3 = (((((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isSelected)) * 31;
        SduiIcon sduiIcon = this.leadingIcon;
        int iHashCode4 = (((((((iHashCode3 + (sduiIcon == null ? 0 : sduiIcon.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31) + this.selectedBackgroundStyle.hashCode()) * 31) + this.title.hashCode()) * 31;
        SduiIcon sduiIcon2 = this.trailingIcon;
        return iHashCode4 + (sduiIcon2 != null ? sduiIcon2.hashCode() : 0);
    }

    public String toString() {
        return "SduiChip(action=" + this.action + ", count=" + this.count + ", hasDropdown=" + this.hasDropdown + ", isEnabled=" + this.isEnabled + ", isSelected=" + this.isSelected + ", leadingIcon=" + this.leadingIcon + ", sduiComponentType=" + this.sduiComponentType + ", selectedBackgroundStyle=" + this.selectedBackgroundStyle + ", title=" + this.title + ", trailingIcon=" + this.trailingIcon + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChip$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiChip;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiChip> serializer() {
            return SduiChip$$serializer.INSTANCE;
        }
    }

    static {
        SduiIcon.Companion companion = SduiIcon.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, companion.serializer(), SduiComponentType.INSTANCE.serializer(), SduiChipSelectedStyle.INSTANCE.serializer(), null, companion.serializer()};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiChip(int i, SduiAction sduiAction, Long l, @SerialName("has_dropdown") Boolean bool, @SerialName("is_enabled") boolean z, @SerialName("is_selected") boolean z2, @SerialName("leading_icon") SduiIcon sduiIcon, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("selected_background_style") SduiChipSelectedStyle sduiChipSelectedStyle, String str, @SerialName("trailing_icon") SduiIcon sduiIcon2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (257 != (i & EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE)) {
            PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, SduiChip$$serializer.INSTANCE.getDescriptor());
        }
        this.action = sduiAction;
        if ((i & 2) == 0) {
            this.count = null;
        } else {
            this.count = l;
        }
        if ((i & 4) == 0) {
            this.hasDropdown = Boolean.FALSE;
        } else {
            this.hasDropdown = bool;
        }
        if ((i & 8) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z;
        }
        if ((i & 16) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z2;
        }
        if ((i & 32) == 0) {
            this.leadingIcon = null;
        } else {
            this.leadingIcon = sduiIcon;
        }
        if ((i & 64) == 0) {
            this.sduiComponentType = SduiComponentType.CHIP;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 128) == 0) {
            this.selectedBackgroundStyle = SduiChipSelectedStyle.DEFAULT;
        } else {
            this.selectedBackgroundStyle = sduiChipSelectedStyle;
        }
        this.title = str;
        if ((i & 512) == 0) {
            this.trailingIcon = null;
        } else {
            this.trailingIcon = sduiIcon2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiChip self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.count != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.count);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.hasDropdown, Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.hasDropdown);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 3, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.isSelected) {
            output.encodeBooleanElement(serialDesc, 4, self.isSelected);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.leadingIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, kSerializerArr[5], self.leadingIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.sduiComponentType != SduiComponentType.CHIP) {
            output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.selectedBackgroundStyle != SduiChipSelectedStyle.DEFAULT) {
            output.encodeSerializableElement(serialDesc, 7, kSerializerArr[7], self.selectedBackgroundStyle);
        }
        output.encodeStringElement(serialDesc, 8, self.title);
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.trailingIcon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, kSerializerArr[9], self.trailingIcon);
    }
}
