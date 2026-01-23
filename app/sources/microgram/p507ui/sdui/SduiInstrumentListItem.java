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
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBs\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÁ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010 R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010,\u001a\u0004\b1\u00102R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010 R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b9\u0010,\u001a\u0004\b7\u00108R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010:\u0012\u0004\b=\u0010,\u001a\u0004\b;\u0010<R$\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010>\u0012\u0004\bA\u0010,\u001a\u0004\b?\u0010@¨\u0006D"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInstrumentListItem;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiInstrumentDisplayType;", "displayType", "", "instrumentID", "Lmicrogram/ui/sdui/SduiInstrumentType;", "instrumentType", "loggingIdentifier", "", "pollingRate", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "tapAction", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiInstrumentDisplayType;Ljava/lang/String;Lmicrogram/ui/sdui/SduiInstrumentType;Ljava/lang/String;DLmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiInstrumentListItem;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiInstrumentDisplayType;", "getDisplayType", "()Lmicrogram/ui/sdui/SduiInstrumentDisplayType;", "getDisplayType$annotations", "()V", "Ljava/lang/String;", "getInstrumentID", "getInstrumentID$annotations", "Lmicrogram/ui/sdui/SduiInstrumentType;", "getInstrumentType", "()Lmicrogram/ui/sdui/SduiInstrumentType;", "getInstrumentType$annotations", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "D", "getPollingRate", "()D", "getPollingRate$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiAction;", "getTapAction", "()Lmicrogram/ui/sdui/SduiAction;", "getTapAction$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiInstrumentListItem extends SduiComponent {
    private final SduiInstrumentDisplayType displayType;
    private final String instrumentID;
    private final SduiInstrumentType instrumentType;
    private final String loggingIdentifier;
    private final double pollingRate;
    private final SduiComponentType sduiComponentType;
    private final SduiAction tapAction;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiInstrumentDisplayType.INSTANCE.serializer(), null, SduiInstrumentType.INSTANCE.serializer(), null, null, SduiComponentType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiInstrumentListItem)) {
            return false;
        }
        SduiInstrumentListItem sduiInstrumentListItem = (SduiInstrumentListItem) other;
        return this.displayType == sduiInstrumentListItem.displayType && Intrinsics.areEqual(this.instrumentID, sduiInstrumentListItem.instrumentID) && this.instrumentType == sduiInstrumentListItem.instrumentType && Intrinsics.areEqual(this.loggingIdentifier, sduiInstrumentListItem.loggingIdentifier) && Double.compare(this.pollingRate, sduiInstrumentListItem.pollingRate) == 0 && this.sduiComponentType == sduiInstrumentListItem.sduiComponentType && Intrinsics.areEqual(this.tapAction, sduiInstrumentListItem.tapAction);
    }

    public int hashCode() {
        int iHashCode = ((((this.displayType.hashCode() * 31) + this.instrumentID.hashCode()) * 31) + this.instrumentType.hashCode()) * 31;
        String str = this.loggingIdentifier;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.pollingRate)) * 31) + this.sduiComponentType.hashCode()) * 31) + this.tapAction.hashCode();
    }

    public String toString() {
        return "SduiInstrumentListItem(displayType=" + this.displayType + ", instrumentID=" + this.instrumentID + ", instrumentType=" + this.instrumentType + ", loggingIdentifier=" + this.loggingIdentifier + ", pollingRate=" + this.pollingRate + ", sduiComponentType=" + this.sduiComponentType + ", tapAction=" + this.tapAction + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInstrumentListItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiInstrumentListItem;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiInstrumentListItem> serializer() {
            return SduiInstrumentListItem$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiInstrumentListItem(int i, @SerialName("display_type") SduiInstrumentDisplayType sduiInstrumentDisplayType, @SerialName("instrument_id") String str, @SerialName("instrument_type") SduiInstrumentType sduiInstrumentType, @SerialName("logging_identifier") String str2, @SerialName("polling_rate") double d, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("tap_action") SduiAction sduiAction, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (87 != (i & 87)) {
            PluginExceptions.throwMissingFieldException(i, 87, SduiInstrumentListItem$$serializer.INSTANCE.getDescriptor());
        }
        this.displayType = sduiInstrumentDisplayType;
        this.instrumentID = str;
        this.instrumentType = sduiInstrumentType;
        if ((i & 8) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str2;
        }
        this.pollingRate = d;
        if ((i & 32) == 0) {
            this.sduiComponentType = SduiComponentType.INSTRUMENT_LIST_ITEM;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.tapAction = sduiAction;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiInstrumentListItem self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.displayType);
        output.encodeStringElement(serialDesc, 1, self.instrumentID);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.instrumentType);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        output.encodeDoubleElement(serialDesc, 4, self.pollingRate);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.sduiComponentType != SduiComponentType.INSTRUMENT_LIST_ITEM) {
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.sduiComponentType);
        }
        output.encodeSerializableElement(serialDesc, 6, SduiAction2.INSTANCE, self.tapAction);
    }
}
