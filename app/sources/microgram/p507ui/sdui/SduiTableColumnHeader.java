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
import microgram.p507ui.sdui.SduiIcon;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B{\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00101\u0012\u0004\b:\u00108\u001a\u0004\b9\u00103R(\u0010\u0010\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010(\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010*R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010!¨\u0006A"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTableColumnHeader;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "", "active", "Lmicrogram/ui/sdui/SduiChartLayeredStackHorizontalEdge;", "alignment", "Lmicrogram/ui/sdui/SduiIcon;", "icon", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "secondaryIcon", "secondaryIconAction", "", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;ZLmicrogram/ui/sdui/SduiChartLayeredStackHorizontalEdge;Lmicrogram/ui/sdui/SduiIcon;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiIcon;Lmicrogram/ui/sdui/SduiAction;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTableColumnHeader;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Z", "getActive", "()Z", "Lmicrogram/ui/sdui/SduiChartLayeredStackHorizontalEdge;", "getAlignment", "()Lmicrogram/ui/sdui/SduiChartLayeredStackHorizontalEdge;", "Lmicrogram/ui/sdui/SduiIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "()V", "getSecondaryIcon", "getSecondaryIcon$annotations", "getSecondaryIconAction", "getSecondaryIconAction$annotations", "Ljava/lang/String;", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTableColumnHeader extends SduiComponent {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiAction action;
    private final boolean active;
    private final SduiChartLayeredStackHorizontalEdge alignment;
    private final SduiIcon icon;
    private final SduiComponentType sduiComponentType;
    private final SduiIcon secondaryIcon;
    private final SduiAction secondaryIconAction;
    private final String title;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTableColumnHeader)) {
            return false;
        }
        SduiTableColumnHeader sduiTableColumnHeader = (SduiTableColumnHeader) other;
        return Intrinsics.areEqual(this.action, sduiTableColumnHeader.action) && this.active == sduiTableColumnHeader.active && this.alignment == sduiTableColumnHeader.alignment && this.icon == sduiTableColumnHeader.icon && this.sduiComponentType == sduiTableColumnHeader.sduiComponentType && this.secondaryIcon == sduiTableColumnHeader.secondaryIcon && Intrinsics.areEqual(this.secondaryIconAction, sduiTableColumnHeader.secondaryIconAction) && Intrinsics.areEqual(this.title, sduiTableColumnHeader.title);
    }

    public int hashCode() {
        SduiAction sduiAction = this.action;
        int iHashCode = (((((sduiAction == null ? 0 : sduiAction.hashCode()) * 31) + Boolean.hashCode(this.active)) * 31) + this.alignment.hashCode()) * 31;
        SduiIcon sduiIcon = this.icon;
        int iHashCode2 = (((iHashCode + (sduiIcon == null ? 0 : sduiIcon.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiIcon sduiIcon2 = this.secondaryIcon;
        int iHashCode3 = (iHashCode2 + (sduiIcon2 == null ? 0 : sduiIcon2.hashCode())) * 31;
        SduiAction sduiAction2 = this.secondaryIconAction;
        return ((iHashCode3 + (sduiAction2 != null ? sduiAction2.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiTableColumnHeader(action=" + this.action + ", active=" + this.active + ", alignment=" + this.alignment + ", icon=" + this.icon + ", sduiComponentType=" + this.sduiComponentType + ", secondaryIcon=" + this.secondaryIcon + ", secondaryIconAction=" + this.secondaryIconAction + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTableColumnHeader$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTableColumnHeader;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTableColumnHeader> serializer() {
            return SduiTableColumnHeader$$serializer.INSTANCE;
        }
    }

    static {
        KSerializer<SduiChartLayeredStackHorizontalEdge> kSerializerSerializer = SduiChartLayeredStackHorizontalEdge.INSTANCE.serializer();
        SduiIcon.Companion companion = SduiIcon.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, kSerializerSerializer, companion.serializer(), SduiComponentType.INSTANCE.serializer(), companion.serializer(), null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiTableColumnHeader(int i, SduiAction sduiAction, boolean z, SduiChartLayeredStackHorizontalEdge sduiChartLayeredStackHorizontalEdge, SduiIcon sduiIcon, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("secondary_icon") SduiIcon sduiIcon2, @SerialName("secondary_icon_action") SduiAction sduiAction2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (128 != (i & 128)) {
            PluginExceptions.throwMissingFieldException(i, 128, SduiTableColumnHeader$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.action = null;
        } else {
            this.action = sduiAction;
        }
        if ((i & 2) == 0) {
            this.active = false;
        } else {
            this.active = z;
        }
        if ((i & 4) == 0) {
            this.alignment = SduiChartLayeredStackHorizontalEdge.LEFT;
        } else {
            this.alignment = sduiChartLayeredStackHorizontalEdge;
        }
        if ((i & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = sduiIcon;
        }
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.TABLE_COLUMN_HEADER;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 32) == 0) {
            this.secondaryIcon = null;
        } else {
            this.secondaryIcon = sduiIcon2;
        }
        if ((i & 64) == 0) {
            this.secondaryIconAction = null;
        } else {
            this.secondaryIconAction = sduiAction2;
        }
        this.title = str;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTableColumnHeader self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.active) {
            output.encodeBooleanElement(serialDesc, 1, self.active);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.alignment != SduiChartLayeredStackHorizontalEdge.LEFT) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.alignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sduiComponentType != SduiComponentType.TABLE_COLUMN_HEADER) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.secondaryIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, kSerializerArr[5], self.secondaryIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.secondaryIconAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, SduiAction2.INSTANCE, self.secondaryIconAction);
        }
        output.encodeStringElement(serialDesc, 7, self.title);
    }
}
