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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BK\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b-\u0010&\u001a\u0004\b+\u0010,R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b1\u0010&\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTableWeeklyPriceChangeItem;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiPriceChangeDefaultValue;", "defaultValue", "", "instrumentID", "", "priceBaseline", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiPriceChangeDefaultValue;Ljava/lang/String;Ljava/lang/Double;Lmicrogram/ui/sdui/SduiComponentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTableWeeklyPriceChangeItem;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiPriceChangeDefaultValue;", "getDefaultValue", "()Lmicrogram/ui/sdui/SduiPriceChangeDefaultValue;", "getDefaultValue$annotations", "()V", "Ljava/lang/String;", "getInstrumentID", "getInstrumentID$annotations", "Ljava/lang/Double;", "getPriceBaseline", "()Ljava/lang/Double;", "getPriceBaseline$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTableWeeklyPriceChangeItem extends SduiComponent {
    private final SduiPriceChangeDefaultValue defaultValue;
    private final String instrumentID;
    private final Double priceBaseline;
    private final SduiComponentType sduiComponentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiComponentType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTableWeeklyPriceChangeItem)) {
            return false;
        }
        SduiTableWeeklyPriceChangeItem sduiTableWeeklyPriceChangeItem = (SduiTableWeeklyPriceChangeItem) other;
        return Intrinsics.areEqual(this.defaultValue, sduiTableWeeklyPriceChangeItem.defaultValue) && Intrinsics.areEqual(this.instrumentID, sduiTableWeeklyPriceChangeItem.instrumentID) && Intrinsics.areEqual((Object) this.priceBaseline, (Object) sduiTableWeeklyPriceChangeItem.priceBaseline) && this.sduiComponentType == sduiTableWeeklyPriceChangeItem.sduiComponentType;
    }

    public int hashCode() {
        SduiPriceChangeDefaultValue sduiPriceChangeDefaultValue = this.defaultValue;
        int iHashCode = (((sduiPriceChangeDefaultValue == null ? 0 : sduiPriceChangeDefaultValue.hashCode()) * 31) + this.instrumentID.hashCode()) * 31;
        Double d = this.priceBaseline;
        return ((iHashCode + (d != null ? d.hashCode() : 0)) * 31) + this.sduiComponentType.hashCode();
    }

    public String toString() {
        return "SduiTableWeeklyPriceChangeItem(defaultValue=" + this.defaultValue + ", instrumentID=" + this.instrumentID + ", priceBaseline=" + this.priceBaseline + ", sduiComponentType=" + this.sduiComponentType + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTableWeeklyPriceChangeItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTableWeeklyPriceChangeItem;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTableWeeklyPriceChangeItem> serializer() {
            return SduiTableWeeklyPriceChangeItem$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiTableWeeklyPriceChangeItem(int i, @SerialName("default_value") SduiPriceChangeDefaultValue sduiPriceChangeDefaultValue, @SerialName("instrument_id") String str, @SerialName("price_baseline") Double d, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (2 != (i & 2)) {
            PluginExceptions.throwMissingFieldException(i, 2, SduiTableWeeklyPriceChangeItem$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.defaultValue = null;
        } else {
            this.defaultValue = sduiPriceChangeDefaultValue;
        }
        this.instrumentID = str;
        if ((i & 4) == 0) {
            this.priceBaseline = null;
        } else {
            this.priceBaseline = d;
        }
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.TABLE_1_W_CHANGE_ITEM;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTableWeeklyPriceChangeItem self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.defaultValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiPriceChangeDefaultValue$$serializer.INSTANCE, self.defaultValue);
        }
        output.encodeStringElement(serialDesc, 1, self.instrumentID);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.priceBaseline != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, DoubleSerializer.INSTANCE, self.priceBaseline);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.sduiComponentType == SduiComponentType.TABLE_1_W_CHANGE_ITEM) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
    }
}
