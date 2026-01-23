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
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/BK\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0019R \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010!\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010#R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010+\u0012\u0004\b.\u0010%\u001a\u0004\b,\u0010-¨\u00061"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarginHubBufferView;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiMoney;", "marginBufferAmount", "", "marginBufferPercentage", "portfolioValue", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiMoney;Ljava/lang/String;Lmicrogram/ui/sdui/SduiMoney;Lmicrogram/ui/sdui/SduiComponentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiMarginHubBufferView;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiMoney;", "getMarginBufferAmount", "()Lmicrogram/ui/sdui/SduiMoney;", "getMarginBufferAmount$annotations", "()V", "Ljava/lang/String;", "getMarginBufferPercentage", "getMarginBufferPercentage$annotations", "getPortfolioValue", "getPortfolioValue$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiMarginHubBufferView extends SduiComponent {
    private final SduiMoney marginBufferAmount;
    private final String marginBufferPercentage;
    private final SduiMoney portfolioValue;
    private final SduiComponentType sduiComponentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiComponentType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiMarginHubBufferView)) {
            return false;
        }
        SduiMarginHubBufferView sduiMarginHubBufferView = (SduiMarginHubBufferView) other;
        return Intrinsics.areEqual(this.marginBufferAmount, sduiMarginHubBufferView.marginBufferAmount) && Intrinsics.areEqual(this.marginBufferPercentage, sduiMarginHubBufferView.marginBufferPercentage) && Intrinsics.areEqual(this.portfolioValue, sduiMarginHubBufferView.portfolioValue) && this.sduiComponentType == sduiMarginHubBufferView.sduiComponentType;
    }

    public int hashCode() {
        return (((((this.marginBufferAmount.hashCode() * 31) + this.marginBufferPercentage.hashCode()) * 31) + this.portfolioValue.hashCode()) * 31) + this.sduiComponentType.hashCode();
    }

    public String toString() {
        return "SduiMarginHubBufferView(marginBufferAmount=" + this.marginBufferAmount + ", marginBufferPercentage=" + this.marginBufferPercentage + ", portfolioValue=" + this.portfolioValue + ", sduiComponentType=" + this.sduiComponentType + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarginHubBufferView$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiMarginHubBufferView;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiMarginHubBufferView> serializer() {
            return SduiMarginHubBufferView$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiMarginHubBufferView(int i, @SerialName("margin_buffer_amount") SduiMoney sduiMoney, @SerialName("margin_buffer_percentage") String str, @SerialName("portfolio_value") SduiMoney sduiMoney2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, SduiMarginHubBufferView$$serializer.INSTANCE.getDescriptor());
        }
        this.marginBufferAmount = sduiMoney;
        this.marginBufferPercentage = str;
        this.portfolioValue = sduiMoney2;
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.MARGIN_HUB_BUFFER_VIEW;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiMarginHubBufferView self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        SduiMoney$$serializer sduiMoney$$serializer = SduiMoney$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, sduiMoney$$serializer, self.marginBufferAmount);
        output.encodeStringElement(serialDesc, 1, self.marginBufferPercentage);
        output.encodeSerializableElement(serialDesc, 2, sduiMoney$$serializer, self.portfolioValue);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.sduiComponentType == SduiComponentType.MARGIN_HUB_BUFFER_VIEW) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
    }
}
