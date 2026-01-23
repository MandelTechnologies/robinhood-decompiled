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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?Bu\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010!R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b6\u00105R$\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00107\u0012\u0004\b:\u00102\u001a\u0004\b8\u00109R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b;\u00105R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiStockListItem;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiStockListItemChart;", "chart", "", "id", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiStockListItemText;", "subtitle", "subvalue", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "tapAction", "title", "Lmicrogram/ui/sdui/SduiStockListItemValue;", "value", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiStockListItemChart;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiStockListItemText;Lmicrogram/ui/sdui/SduiStockListItemText;Lmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiStockListItemText;Lmicrogram/ui/sdui/SduiStockListItemValue;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiStockListItem;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiStockListItemChart;", "getChart", "()Lmicrogram/ui/sdui/SduiStockListItemChart;", "Ljava/lang/String;", "getId", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "()V", "Lmicrogram/ui/sdui/SduiStockListItemText;", "getSubtitle", "()Lmicrogram/ui/sdui/SduiStockListItemText;", "getSubvalue", "Lmicrogram/ui/sdui/SduiAction;", "getTapAction", "()Lmicrogram/ui/sdui/SduiAction;", "getTapAction$annotations", "getTitle", "Lmicrogram/ui/sdui/SduiStockListItemValue;", "getValue", "()Lmicrogram/ui/sdui/SduiStockListItemValue;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiStockListItem extends SduiComponent {
    private final SduiStockListItemChart chart;
    private final String id;
    private final SduiComponentType sduiComponentType;
    private final SduiStockListItemText subtitle;
    private final SduiStockListItemText subvalue;
    private final SduiAction tapAction;
    private final SduiStockListItemText title;
    private final SduiStockListItemValue value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, SduiComponentType.INSTANCE.serializer(), null, null, null, null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiStockListItem)) {
            return false;
        }
        SduiStockListItem sduiStockListItem = (SduiStockListItem) other;
        return Intrinsics.areEqual(this.chart, sduiStockListItem.chart) && Intrinsics.areEqual(this.id, sduiStockListItem.id) && this.sduiComponentType == sduiStockListItem.sduiComponentType && Intrinsics.areEqual(this.subtitle, sduiStockListItem.subtitle) && Intrinsics.areEqual(this.subvalue, sduiStockListItem.subvalue) && Intrinsics.areEqual(this.tapAction, sduiStockListItem.tapAction) && Intrinsics.areEqual(this.title, sduiStockListItem.title) && Intrinsics.areEqual(this.value, sduiStockListItem.value);
    }

    public int hashCode() {
        return (((((((((((((this.chart.hashCode() * 31) + this.id.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.subvalue.hashCode()) * 31) + this.tapAction.hashCode()) * 31) + this.title.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "SduiStockListItem(chart=" + this.chart + ", id=" + this.id + ", sduiComponentType=" + this.sduiComponentType + ", subtitle=" + this.subtitle + ", subvalue=" + this.subvalue + ", tapAction=" + this.tapAction + ", title=" + this.title + ", value=" + this.value + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiStockListItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiStockListItem;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiStockListItem> serializer() {
            return SduiStockListItem$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiStockListItem(int i, SduiStockListItemChart sduiStockListItemChart, String str, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiStockListItemText sduiStockListItemText, SduiStockListItemText sduiStockListItemText2, @SerialName("tap_action") SduiAction sduiAction, SduiStockListItemText sduiStockListItemText3, SduiStockListItemValue sduiStockListItemValue, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (251 != (i & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE)) {
            PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, SduiStockListItem$$serializer.INSTANCE.getDescriptor());
        }
        this.chart = sduiStockListItemChart;
        this.id = str;
        if ((i & 4) == 0) {
            this.sduiComponentType = SduiComponentType.STOCK_LIST_ITEM;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.subtitle = sduiStockListItemText;
        this.subvalue = sduiStockListItemText2;
        this.tapAction = sduiAction;
        this.title = sduiStockListItemText3;
        this.value = sduiStockListItemValue;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiStockListItem self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiStockListItemChart$$serializer.INSTANCE, self.chart);
        output.encodeStringElement(serialDesc, 1, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.sduiComponentType != SduiComponentType.STOCK_LIST_ITEM) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.sduiComponentType);
        }
        SduiStockListItemText$$serializer sduiStockListItemText$$serializer = SduiStockListItemText$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 3, sduiStockListItemText$$serializer, self.subtitle);
        output.encodeSerializableElement(serialDesc, 4, sduiStockListItemText$$serializer, self.subvalue);
        output.encodeSerializableElement(serialDesc, 5, SduiAction2.INSTANCE, self.tapAction);
        output.encodeSerializableElement(serialDesc, 6, sduiStockListItemText$$serializer, self.title);
        output.encodeSerializableElement(serialDesc, 7, SduiStockListItemValue$$serializer.INSTANCE, self.value);
    }
}
