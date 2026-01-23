package microgram.p507ui.sdui;

import com.robinhood.android.equity.history.p121ui.adrfee.AdrFeeDetailComposable4;
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
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bo\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÁ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u001fR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00100\u0012\u0004\b3\u0010-\u001a\u0004\b1\u00102R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00100\u0012\u0004\b5\u0010-\u001a\u0004\b4\u00102R \u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00100\u0012\u0004\b7\u0010-\u001a\u0004\b6\u00102R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00108\u0012\u0004\b;\u0010-\u001a\u0004\b9\u0010:¨\u0006>"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInvestFlowSingleInstrument;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "", "addedToList", "", "id", "Lmicrogram/ui/sdui/SduiInstrumentText;", "instrumentLabel", "instrumentName", "instrumentPercentChange", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;ZLjava/lang/String;Lmicrogram/ui/sdui/SduiInstrumentText;Lmicrogram/ui/sdui/SduiInstrumentText;Lmicrogram/ui/sdui/SduiInstrumentText;Lmicrogram/ui/sdui/SduiComponentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiInvestFlowSingleInstrument;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Z", "getAddedToList", "()Z", "getAddedToList$annotations", "()V", "Ljava/lang/String;", "getId", "Lmicrogram/ui/sdui/SduiInstrumentText;", "getInstrumentLabel", "()Lmicrogram/ui/sdui/SduiInstrumentText;", "getInstrumentLabel$annotations", "getInstrumentName", "getInstrumentName$annotations", "getInstrumentPercentChange", "getInstrumentPercentChange$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiInvestFlowSingleInstrument extends SduiComponent {
    private final SduiAction action;
    private final boolean addedToList;
    private final String id;
    private final SduiInstrumentText instrumentLabel;
    private final SduiInstrumentText instrumentName;
    private final SduiInstrumentText instrumentPercentChange;
    private final SduiComponentType sduiComponentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, SduiComponentType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiInvestFlowSingleInstrument)) {
            return false;
        }
        SduiInvestFlowSingleInstrument sduiInvestFlowSingleInstrument = (SduiInvestFlowSingleInstrument) other;
        return Intrinsics.areEqual(this.action, sduiInvestFlowSingleInstrument.action) && this.addedToList == sduiInvestFlowSingleInstrument.addedToList && Intrinsics.areEqual(this.id, sduiInvestFlowSingleInstrument.id) && Intrinsics.areEqual(this.instrumentLabel, sduiInvestFlowSingleInstrument.instrumentLabel) && Intrinsics.areEqual(this.instrumentName, sduiInvestFlowSingleInstrument.instrumentName) && Intrinsics.areEqual(this.instrumentPercentChange, sduiInvestFlowSingleInstrument.instrumentPercentChange) && this.sduiComponentType == sduiInvestFlowSingleInstrument.sduiComponentType;
    }

    public int hashCode() {
        return (((((((((((this.action.hashCode() * 31) + Boolean.hashCode(this.addedToList)) * 31) + this.id.hashCode()) * 31) + this.instrumentLabel.hashCode()) * 31) + this.instrumentName.hashCode()) * 31) + this.instrumentPercentChange.hashCode()) * 31) + this.sduiComponentType.hashCode();
    }

    public String toString() {
        return "SduiInvestFlowSingleInstrument(action=" + this.action + ", addedToList=" + this.addedToList + ", id=" + this.id + ", instrumentLabel=" + this.instrumentLabel + ", instrumentName=" + this.instrumentName + ", instrumentPercentChange=" + this.instrumentPercentChange + ", sduiComponentType=" + this.sduiComponentType + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInvestFlowSingleInstrument$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiInvestFlowSingleInstrument;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiInvestFlowSingleInstrument> serializer() {
            return SduiInvestFlowSingleInstrument$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiInvestFlowSingleInstrument(int i, SduiAction sduiAction, @SerialName("added_to_list") boolean z, String str, @SerialName("instrument_label") SduiInstrumentText sduiInstrumentText, @SerialName(AdrFeeDetailComposable4.INSTRUMENT_NAME) SduiInstrumentText sduiInstrumentText2, @SerialName("instrument_percent_change") SduiInstrumentText sduiInstrumentText3, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (63 != (i & 63)) {
            PluginExceptions.throwMissingFieldException(i, 63, SduiInvestFlowSingleInstrument$$serializer.INSTANCE.getDescriptor());
        }
        this.action = sduiAction;
        this.addedToList = z;
        this.id = str;
        this.instrumentLabel = sduiInstrumentText;
        this.instrumentName = sduiInstrumentText2;
        this.instrumentPercentChange = sduiInstrumentText3;
        if ((i & 64) == 0) {
            this.sduiComponentType = SduiComponentType.INVEST_FLOW_SINGLE_INSTRUMENT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiInvestFlowSingleInstrument self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        output.encodeBooleanElement(serialDesc, 1, self.addedToList);
        output.encodeStringElement(serialDesc, 2, self.id);
        SduiInstrumentText$$serializer sduiInstrumentText$$serializer = SduiInstrumentText$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 3, sduiInstrumentText$$serializer, self.instrumentLabel);
        output.encodeSerializableElement(serialDesc, 4, sduiInstrumentText$$serializer, self.instrumentName);
        output.encodeSerializableElement(serialDesc, 5, sduiInstrumentText$$serializer, self.instrumentPercentChange);
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.sduiComponentType == SduiComponentType.INVEST_FLOW_SINGLE_INSTRUMENT) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.sduiComponentType);
    }
}
