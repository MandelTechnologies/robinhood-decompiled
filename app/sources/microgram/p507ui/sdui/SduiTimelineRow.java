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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9Bw\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R(\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b1\u0010*\u001a\u0004\b/\u00100R \u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010+\u0012\u0004\b3\u0010*\u001a\u0004\b2\u0010\u001eR \u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010+\u0012\u0004\b5\u0010*\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108¨\u0006;"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTimelineRow;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "detailAction", "", "detailText", "Lmicrogram/ui/sdui/SduiInfoIcon;", "infoIcon", "primaryInformation", "secondaryInformation", "Lmicrogram/ui/sdui/SduiTimelineRowState;", "state", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiAction;Ljava/lang/String;Lmicrogram/ui/sdui/SduiInfoIcon;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiTimelineRowState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTimelineRow;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "getDetailAction", "getDetailAction$annotations", "()V", "Ljava/lang/String;", "getDetailText", "getDetailText$annotations", "Lmicrogram/ui/sdui/SduiInfoIcon;", "getInfoIcon", "()Lmicrogram/ui/sdui/SduiInfoIcon;", "getInfoIcon$annotations", "getPrimaryInformation", "getPrimaryInformation$annotations", "getSecondaryInformation", "getSecondaryInformation$annotations", "Lmicrogram/ui/sdui/SduiTimelineRowState;", "getState", "()Lmicrogram/ui/sdui/SduiTimelineRowState;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTimelineRow {
    private final SduiAction action;
    private final SduiAction detailAction;
    private final String detailText;
    private final SduiInfoIcon infoIcon;
    private final String primaryInformation;
    private final String secondaryInformation;
    private final SduiTimelineRowState state;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiInfoIcon.INSTANCE.serializer(), null, null, SduiTimelineRowState.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTimelineRow)) {
            return false;
        }
        SduiTimelineRow sduiTimelineRow = (SduiTimelineRow) other;
        return Intrinsics.areEqual(this.action, sduiTimelineRow.action) && Intrinsics.areEqual(this.detailAction, sduiTimelineRow.detailAction) && Intrinsics.areEqual(this.detailText, sduiTimelineRow.detailText) && this.infoIcon == sduiTimelineRow.infoIcon && Intrinsics.areEqual(this.primaryInformation, sduiTimelineRow.primaryInformation) && Intrinsics.areEqual(this.secondaryInformation, sduiTimelineRow.secondaryInformation) && this.state == sduiTimelineRow.state;
    }

    public int hashCode() {
        SduiAction sduiAction = this.action;
        int iHashCode = (sduiAction == null ? 0 : sduiAction.hashCode()) * 31;
        SduiAction sduiAction2 = this.detailAction;
        int iHashCode2 = (iHashCode + (sduiAction2 == null ? 0 : sduiAction2.hashCode())) * 31;
        String str = this.detailText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SduiInfoIcon sduiInfoIcon = this.infoIcon;
        return ((((((iHashCode3 + (sduiInfoIcon != null ? sduiInfoIcon.hashCode() : 0)) * 31) + this.primaryInformation.hashCode()) * 31) + this.secondaryInformation.hashCode()) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "SduiTimelineRow(action=" + this.action + ", detailAction=" + this.detailAction + ", detailText=" + this.detailText + ", infoIcon=" + this.infoIcon + ", primaryInformation=" + this.primaryInformation + ", secondaryInformation=" + this.secondaryInformation + ", state=" + this.state + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTimelineRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTimelineRow;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTimelineRow> serializer() {
            return SduiTimelineRow$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiTimelineRow(int i, SduiAction sduiAction, @SerialName("detail_action") SduiAction sduiAction2, @SerialName("detail_text") String str, @SerialName("info_icon") SduiInfoIcon sduiInfoIcon, @SerialName("primary_information") String str2, @SerialName("secondary_information") String str3, SduiTimelineRowState sduiTimelineRowState, SerializationConstructorMarker serializationConstructorMarker) {
        if (112 != (i & 112)) {
            PluginExceptions.throwMissingFieldException(i, 112, SduiTimelineRow$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.action = null;
        } else {
            this.action = sduiAction;
        }
        if ((i & 2) == 0) {
            this.detailAction = null;
        } else {
            this.detailAction = sduiAction2;
        }
        if ((i & 4) == 0) {
            this.detailText = null;
        } else {
            this.detailText = str;
        }
        if ((i & 8) == 0) {
            this.infoIcon = null;
        } else {
            this.infoIcon = sduiInfoIcon;
        }
        this.primaryInformation = str2;
        this.secondaryInformation = str3;
        this.state = sduiTimelineRowState;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTimelineRow self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.detailAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiAction2.INSTANCE, self.detailAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.detailText != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.detailText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.infoIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.infoIcon);
        }
        output.encodeStringElement(serialDesc, 4, self.primaryInformation);
        output.encodeStringElement(serialDesc, 5, self.secondaryInformation);
        output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.state);
    }
}
