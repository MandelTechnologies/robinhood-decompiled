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
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bs\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001eR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u001eR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u001eR \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001eR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00100\u0012\u0004\b3\u0010)\u001a\u0004\b1\u00102R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00104\u0012\u0004\b7\u0010)\u001a\u0004\b5\u00106R$\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00108\u0012\u0004\b;\u0010)\u001a\u0004\b9\u0010:¨\u0006>"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiPositionListItem;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "accountNumber", "displayType", "instrumentID", "instrumentType", "", "pollingRate", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "tapAction", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiPositionListItem;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "getAccountNumber$annotations", "()V", "getDisplayType", "getDisplayType$annotations", "getInstrumentID", "getInstrumentID$annotations", "getInstrumentType", "getInstrumentType$annotations", "D", "getPollingRate", "()D", "getPollingRate$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiAction;", "getTapAction", "()Lmicrogram/ui/sdui/SduiAction;", "getTapAction$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiPositionListItem extends SduiComponent {
    private final String accountNumber;
    private final String displayType;
    private final String instrumentID;
    private final String instrumentType;
    private final double pollingRate;
    private final SduiComponentType sduiComponentType;
    private final SduiAction tapAction;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, SduiComponentType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiPositionListItem)) {
            return false;
        }
        SduiPositionListItem sduiPositionListItem = (SduiPositionListItem) other;
        return Intrinsics.areEqual(this.accountNumber, sduiPositionListItem.accountNumber) && Intrinsics.areEqual(this.displayType, sduiPositionListItem.displayType) && Intrinsics.areEqual(this.instrumentID, sduiPositionListItem.instrumentID) && Intrinsics.areEqual(this.instrumentType, sduiPositionListItem.instrumentType) && Double.compare(this.pollingRate, sduiPositionListItem.pollingRate) == 0 && this.sduiComponentType == sduiPositionListItem.sduiComponentType && Intrinsics.areEqual(this.tapAction, sduiPositionListItem.tapAction);
    }

    public int hashCode() {
        return (((((((((((this.accountNumber.hashCode() * 31) + this.displayType.hashCode()) * 31) + this.instrumentID.hashCode()) * 31) + this.instrumentType.hashCode()) * 31) + Double.hashCode(this.pollingRate)) * 31) + this.sduiComponentType.hashCode()) * 31) + this.tapAction.hashCode();
    }

    public String toString() {
        return "SduiPositionListItem(accountNumber=" + this.accountNumber + ", displayType=" + this.displayType + ", instrumentID=" + this.instrumentID + ", instrumentType=" + this.instrumentType + ", pollingRate=" + this.pollingRate + ", sduiComponentType=" + this.sduiComponentType + ", tapAction=" + this.tapAction + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiPositionListItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiPositionListItem;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiPositionListItem> serializer() {
            return SduiPositionListItem$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiPositionListItem(int i, @SerialName("account_number") String str, @SerialName("display_type") String str2, @SerialName("instrument_id") String str3, @SerialName("instrument_type") String str4, @SerialName("polling_rate") double d, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("tap_action") SduiAction sduiAction, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (95 != (i & 95)) {
            PluginExceptions.throwMissingFieldException(i, 95, SduiPositionListItem$$serializer.INSTANCE.getDescriptor());
        }
        this.accountNumber = str;
        this.displayType = str2;
        this.instrumentID = str3;
        this.instrumentType = str4;
        this.pollingRate = d;
        if ((i & 32) == 0) {
            this.sduiComponentType = SduiComponentType.POSITION_LIST_ITEM;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.tapAction = sduiAction;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiPositionListItem self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.accountNumber);
        output.encodeStringElement(serialDesc, 1, self.displayType);
        output.encodeStringElement(serialDesc, 2, self.instrumentID);
        output.encodeStringElement(serialDesc, 3, self.instrumentType);
        output.encodeDoubleElement(serialDesc, 4, self.pollingRate);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.sduiComponentType != SduiComponentType.POSITION_LIST_ITEM) {
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.sduiComponentType);
        }
        output.encodeSerializableElement(serialDesc, 6, SduiAction2.INSTANCE, self.tapAction);
    }
}
