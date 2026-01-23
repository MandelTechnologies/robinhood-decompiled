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
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBu\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÁ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00103\u0012\u0004\b5\u0010/\u001a\u0004\b\f\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00109\u0012\u0004\b<\u0010/\u001a\u0004\b:\u0010;R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010=\u0012\u0004\b@\u0010/\u001a\u0004\b>\u0010?R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\bA\u00108¨\u0006D"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInvestFlowChip;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "", "assetUUID", "Lmicrogram/ui/sdui/SduiIcon;", "icon", "", "isSelected", "Lmicrogram/ui/sdui/SduiMarkdownText;", "metadata", "", "pollInterval", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Ljava/lang/String;Lmicrogram/ui/sdui/SduiIcon;ZLmicrogram/ui/sdui/SduiMarkdownText;DLmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiMarkdownText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiInvestFlowChip;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Ljava/lang/String;", "getAssetUUID", "getAssetUUID$annotations", "()V", "Lmicrogram/ui/sdui/SduiIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "Z", "()Z", "isSelected$annotations", "Lmicrogram/ui/sdui/SduiMarkdownText;", "getMetadata", "()Lmicrogram/ui/sdui/SduiMarkdownText;", "D", "getPollInterval", "()D", "getPollInterval$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiInvestFlowChip extends SduiComponent {
    private final SduiAction action;
    private final String assetUUID;
    private final SduiIcon icon;
    private final boolean isSelected;
    private final SduiMarkdownText metadata;
    private final double pollInterval;
    private final SduiComponentType sduiComponentType;
    private final SduiMarkdownText title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, SduiIcon.INSTANCE.serializer(), null, null, null, SduiComponentType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiInvestFlowChip)) {
            return false;
        }
        SduiInvestFlowChip sduiInvestFlowChip = (SduiInvestFlowChip) other;
        return Intrinsics.areEqual(this.action, sduiInvestFlowChip.action) && Intrinsics.areEqual(this.assetUUID, sduiInvestFlowChip.assetUUID) && this.icon == sduiInvestFlowChip.icon && this.isSelected == sduiInvestFlowChip.isSelected && Intrinsics.areEqual(this.metadata, sduiInvestFlowChip.metadata) && Double.compare(this.pollInterval, sduiInvestFlowChip.pollInterval) == 0 && this.sduiComponentType == sduiInvestFlowChip.sduiComponentType && Intrinsics.areEqual(this.title, sduiInvestFlowChip.title);
    }

    public int hashCode() {
        int iHashCode = ((this.action.hashCode() * 31) + this.assetUUID.hashCode()) * 31;
        SduiIcon sduiIcon = this.icon;
        int iHashCode2 = (((iHashCode + (sduiIcon == null ? 0 : sduiIcon.hashCode())) * 31) + Boolean.hashCode(this.isSelected)) * 31;
        SduiMarkdownText sduiMarkdownText = this.metadata;
        return ((((((iHashCode2 + (sduiMarkdownText != null ? sduiMarkdownText.hashCode() : 0)) * 31) + Double.hashCode(this.pollInterval)) * 31) + this.sduiComponentType.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiInvestFlowChip(action=" + this.action + ", assetUUID=" + this.assetUUID + ", icon=" + this.icon + ", isSelected=" + this.isSelected + ", metadata=" + this.metadata + ", pollInterval=" + this.pollInterval + ", sduiComponentType=" + this.sduiComponentType + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInvestFlowChip$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiInvestFlowChip;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiInvestFlowChip> serializer() {
            return SduiInvestFlowChip$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiInvestFlowChip(int i, SduiAction sduiAction, @SerialName("asset_uuid") String str, SduiIcon sduiIcon, @SerialName("is_selected") boolean z, SduiMarkdownText sduiMarkdownText, @SerialName("poll_interval") double d, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiMarkdownText sduiMarkdownText2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (131 != (i & 131)) {
            PluginExceptions.throwMissingFieldException(i, 131, SduiInvestFlowChip$$serializer.INSTANCE.getDescriptor());
        }
        this.action = sduiAction;
        this.assetUUID = str;
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = sduiIcon;
        }
        if ((i & 8) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z;
        }
        if ((i & 16) == 0) {
            this.metadata = null;
        } else {
            this.metadata = sduiMarkdownText;
        }
        if ((i & 32) == 0) {
            this.pollInterval = 10.0d;
        } else {
            this.pollInterval = d;
        }
        if ((i & 64) == 0) {
            this.sduiComponentType = SduiComponentType.INVEST_FLOW_CHIP;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.title = sduiMarkdownText2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiInvestFlowChip self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        output.encodeStringElement(serialDesc, 1, self.assetUUID);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.isSelected) {
            output.encodeBooleanElement(serialDesc, 3, self.isSelected);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.metadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SduiMarkdownText$$serializer.INSTANCE, self.metadata);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || Double.compare(self.pollInterval, 10.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 5, self.pollInterval);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.sduiComponentType != SduiComponentType.INVEST_FLOW_CHIP) {
            output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.sduiComponentType);
        }
        output.encodeSerializableElement(serialDesc, 7, SduiMarkdownText$$serializer.INSTANCE, self.title);
    }
}
