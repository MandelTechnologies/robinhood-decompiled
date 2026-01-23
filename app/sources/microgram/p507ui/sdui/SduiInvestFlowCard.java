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
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLB\u008f\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÁ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010%R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b6\u00102\u001a\u0004\b4\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u00109R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010:\u0012\u0004\b<\u00102\u001a\u0004\b\u000e\u0010;R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010=\u0012\u0004\b@\u00102\u001a\u0004\b>\u0010?R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010=\u0012\u0004\bB\u00102\u001a\u0004\bA\u0010?R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010C\u0012\u0004\bF\u00102\u001a\u0004\bD\u0010ER \u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010G\u0012\u0004\bJ\u00102\u001a\u0004\bH\u0010IR\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\bK\u0010?¨\u0006N"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInvestFlowCard;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "", "assetUUID", "Lmicrogram/ui/sdui/SduiThemedColor;", "backgroundColor", "Lmicrogram/ui/sdui/SduiIcon;", "icon", "", "isSelected", "Lmicrogram/ui/sdui/SduiMarkdownText;", "metadata1", "metadata2", "", "pollInterval", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Ljava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiIcon;ZLmicrogram/ui/sdui/SduiMarkdownText;Lmicrogram/ui/sdui/SduiMarkdownText;DLmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiMarkdownText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiInvestFlowCard;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Ljava/lang/String;", "getAssetUUID", "getAssetUUID$annotations", "()V", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor$annotations", "Lmicrogram/ui/sdui/SduiIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "Z", "()Z", "isSelected$annotations", "Lmicrogram/ui/sdui/SduiMarkdownText;", "getMetadata1", "()Lmicrogram/ui/sdui/SduiMarkdownText;", "getMetadata1$annotations", "getMetadata2", "getMetadata2$annotations", "D", "getPollInterval", "()D", "getPollInterval$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiInvestFlowCard extends SduiComponent {
    private final SduiAction action;
    private final String assetUUID;
    private final SduiThemedColor backgroundColor;
    private final SduiIcon icon;
    private final boolean isSelected;
    private final SduiMarkdownText metadata1;
    private final SduiMarkdownText metadata2;
    private final double pollInterval;
    private final SduiComponentType sduiComponentType;
    private final SduiMarkdownText title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiIcon.INSTANCE.serializer(), null, null, null, null, SduiComponentType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiInvestFlowCard)) {
            return false;
        }
        SduiInvestFlowCard sduiInvestFlowCard = (SduiInvestFlowCard) other;
        return Intrinsics.areEqual(this.action, sduiInvestFlowCard.action) && Intrinsics.areEqual(this.assetUUID, sduiInvestFlowCard.assetUUID) && Intrinsics.areEqual(this.backgroundColor, sduiInvestFlowCard.backgroundColor) && this.icon == sduiInvestFlowCard.icon && this.isSelected == sduiInvestFlowCard.isSelected && Intrinsics.areEqual(this.metadata1, sduiInvestFlowCard.metadata1) && Intrinsics.areEqual(this.metadata2, sduiInvestFlowCard.metadata2) && Double.compare(this.pollInterval, sduiInvestFlowCard.pollInterval) == 0 && this.sduiComponentType == sduiInvestFlowCard.sduiComponentType && Intrinsics.areEqual(this.title, sduiInvestFlowCard.title);
    }

    public int hashCode() {
        int iHashCode = ((((this.action.hashCode() * 31) + this.assetUUID.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31;
        SduiIcon sduiIcon = this.icon;
        int iHashCode2 = (((iHashCode + (sduiIcon == null ? 0 : sduiIcon.hashCode())) * 31) + Boolean.hashCode(this.isSelected)) * 31;
        SduiMarkdownText sduiMarkdownText = this.metadata1;
        int iHashCode3 = (iHashCode2 + (sduiMarkdownText == null ? 0 : sduiMarkdownText.hashCode())) * 31;
        SduiMarkdownText sduiMarkdownText2 = this.metadata2;
        return ((((((iHashCode3 + (sduiMarkdownText2 != null ? sduiMarkdownText2.hashCode() : 0)) * 31) + Double.hashCode(this.pollInterval)) * 31) + this.sduiComponentType.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiInvestFlowCard(action=" + this.action + ", assetUUID=" + this.assetUUID + ", backgroundColor=" + this.backgroundColor + ", icon=" + this.icon + ", isSelected=" + this.isSelected + ", metadata1=" + this.metadata1 + ", metadata2=" + this.metadata2 + ", pollInterval=" + this.pollInterval + ", sduiComponentType=" + this.sduiComponentType + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInvestFlowCard$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiInvestFlowCard;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiInvestFlowCard> serializer() {
            return SduiInvestFlowCard$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiInvestFlowCard(int i, SduiAction sduiAction, @SerialName("asset_uuid") String str, @SerialName("background_color") SduiThemedColor sduiThemedColor, SduiIcon sduiIcon, @SerialName("is_selected") boolean z, @SerialName("metadata_1") SduiMarkdownText sduiMarkdownText, @SerialName("metadata_2") SduiMarkdownText sduiMarkdownText2, @SerialName("poll_interval") double d, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiMarkdownText sduiMarkdownText3, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (515 != (i & 515)) {
            PluginExceptions.throwMissingFieldException(i, 515, SduiInvestFlowCard$$serializer.INSTANCE.getDescriptor());
        }
        this.action = sduiAction;
        this.assetUUID = str;
        if ((i & 4) == 0) {
            SduiColor sduiColor = SduiColor.f7092BG;
            this.backgroundColor = new SduiThemedColor(sduiColor, sduiColor);
        } else {
            this.backgroundColor = sduiThemedColor;
        }
        if ((i & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = sduiIcon;
        }
        if ((i & 16) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z;
        }
        if ((i & 32) == 0) {
            this.metadata1 = null;
        } else {
            this.metadata1 = sduiMarkdownText;
        }
        if ((i & 64) == 0) {
            this.metadata2 = null;
        } else {
            this.metadata2 = sduiMarkdownText2;
        }
        if ((i & 128) == 0) {
            this.pollInterval = 10.0d;
        } else {
            this.pollInterval = d;
        }
        if ((i & 256) == 0) {
            this.sduiComponentType = SduiComponentType.INVEST_FLOW_CARD;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.title = sduiMarkdownText3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiInvestFlowCard self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        output.encodeStringElement(serialDesc, 1, self.assetUUID);
        if (output.shouldEncodeElementDefault(serialDesc, 2)) {
            output.encodeSerializableElement(serialDesc, 2, SduiThemedColor$$serializer.INSTANCE, self.backgroundColor);
        } else {
            SduiThemedColor sduiThemedColor = self.backgroundColor;
            SduiColor sduiColor = SduiColor.f7092BG;
            if (!Intrinsics.areEqual(sduiThemedColor, new SduiThemedColor(sduiColor, sduiColor))) {
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.isSelected) {
            output.encodeBooleanElement(serialDesc, 4, self.isSelected);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.metadata1 != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, SduiMarkdownText$$serializer.INSTANCE, self.metadata1);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.metadata2 != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, SduiMarkdownText$$serializer.INSTANCE, self.metadata2);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || Double.compare(self.pollInterval, 10.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 7, self.pollInterval);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.sduiComponentType != SduiComponentType.INVEST_FLOW_CARD) {
            output.encodeSerializableElement(serialDesc, 8, kSerializerArr[8], self.sduiComponentType);
        }
        output.encodeSerializableElement(serialDesc, 9, SduiMarkdownText$$serializer.INSTANCE, self.title);
    }
}
