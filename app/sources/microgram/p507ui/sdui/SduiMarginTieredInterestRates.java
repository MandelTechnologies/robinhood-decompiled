package microgram.p507ui.sdui;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>Bc\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÁ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00103\u0012\u0004\b6\u00102\u001a\u0004\b4\u00105R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010:\u0012\u0004\b=\u00102\u001a\u0004\b;\u0010<¨\u0006@"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarginTieredInterestRates;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiMarginTieredRateTableCallout;", "callout", "Lmicrogram/ui/sdui/SduiMarginRateHeader;", "header", "Lmicrogram/ui/sdui/SduiThemedColor;", "highlightedBackgroundColor", "", "highlightedRowIndex", "", "Lmicrogram/ui/sdui/SduiMarginRateRow;", "rates", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiMarginTieredRateTableCallout;Lmicrogram/ui/sdui/SduiMarginRateHeader;Lmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/Long;Ljava/util/List;Lmicrogram/ui/sdui/SduiComponentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiMarginTieredInterestRates;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiMarginTieredRateTableCallout;", "getCallout", "()Lmicrogram/ui/sdui/SduiMarginTieredRateTableCallout;", "Lmicrogram/ui/sdui/SduiMarginRateHeader;", "getHeader", "()Lmicrogram/ui/sdui/SduiMarginRateHeader;", "Lmicrogram/ui/sdui/SduiThemedColor;", "getHighlightedBackgroundColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getHighlightedBackgroundColor$annotations", "()V", "Ljava/lang/Long;", "getHighlightedRowIndex", "()Ljava/lang/Long;", "getHighlightedRowIndex$annotations", "Ljava/util/List;", "getRates", "()Ljava/util/List;", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiMarginTieredInterestRates extends SduiComponent {
    private final SduiMarginTieredRateTableCallout callout;
    private final SduiMarginRateHeader header;
    private final SduiThemedColor highlightedBackgroundColor;
    private final Long highlightedRowIndex;
    private final List<SduiMarginRateRow> rates;
    private final SduiComponentType sduiComponentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(SduiMarginRateRow$$serializer.INSTANCE), SduiComponentType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiMarginTieredInterestRates)) {
            return false;
        }
        SduiMarginTieredInterestRates sduiMarginTieredInterestRates = (SduiMarginTieredInterestRates) other;
        return Intrinsics.areEqual(this.callout, sduiMarginTieredInterestRates.callout) && Intrinsics.areEqual(this.header, sduiMarginTieredInterestRates.header) && Intrinsics.areEqual(this.highlightedBackgroundColor, sduiMarginTieredInterestRates.highlightedBackgroundColor) && Intrinsics.areEqual(this.highlightedRowIndex, sduiMarginTieredInterestRates.highlightedRowIndex) && Intrinsics.areEqual(this.rates, sduiMarginTieredInterestRates.rates) && this.sduiComponentType == sduiMarginTieredInterestRates.sduiComponentType;
    }

    public int hashCode() {
        SduiMarginTieredRateTableCallout sduiMarginTieredRateTableCallout = this.callout;
        int iHashCode = (((sduiMarginTieredRateTableCallout == null ? 0 : sduiMarginTieredRateTableCallout.hashCode()) * 31) + this.header.hashCode()) * 31;
        SduiThemedColor sduiThemedColor = this.highlightedBackgroundColor;
        int iHashCode2 = (iHashCode + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31;
        Long l = this.highlightedRowIndex;
        return ((((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31) + this.rates.hashCode()) * 31) + this.sduiComponentType.hashCode();
    }

    public String toString() {
        return "SduiMarginTieredInterestRates(callout=" + this.callout + ", header=" + this.header + ", highlightedBackgroundColor=" + this.highlightedBackgroundColor + ", highlightedRowIndex=" + this.highlightedRowIndex + ", rates=" + this.rates + ", sduiComponentType=" + this.sduiComponentType + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarginTieredInterestRates$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiMarginTieredInterestRates;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiMarginTieredInterestRates> serializer() {
            return SduiMarginTieredInterestRates$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiMarginTieredInterestRates(int i, SduiMarginTieredRateTableCallout sduiMarginTieredRateTableCallout, SduiMarginRateHeader sduiMarginRateHeader, @SerialName("highlighted_background_color") SduiThemedColor sduiThemedColor, @SerialName("highlighted_row_index") Long l, List list, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (18 != (i & 18)) {
            PluginExceptions.throwMissingFieldException(i, 18, SduiMarginTieredInterestRates$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.callout = null;
        } else {
            this.callout = sduiMarginTieredRateTableCallout;
        }
        this.header = sduiMarginRateHeader;
        if ((i & 4) == 0) {
            this.highlightedBackgroundColor = null;
        } else {
            this.highlightedBackgroundColor = sduiThemedColor;
        }
        if ((i & 8) == 0) {
            this.highlightedRowIndex = null;
        } else {
            this.highlightedRowIndex = l;
        }
        this.rates = list;
        if ((i & 32) == 0) {
            this.sduiComponentType = SduiComponentType.MARGIN_TIERED_INTEREST_RATES;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiMarginTieredInterestRates self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.callout != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiMarginTieredRateTableCallout$$serializer.INSTANCE, self.callout);
        }
        output.encodeSerializableElement(serialDesc, 1, SduiMarginRateHeader$$serializer.INSTANCE, self.header);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.highlightedBackgroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiThemedColor$$serializer.INSTANCE, self.highlightedBackgroundColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.highlightedRowIndex != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.highlightedRowIndex);
        }
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.rates);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.sduiComponentType == SduiComponentType.MARGIN_TIERED_INTEREST_RATES) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.sduiComponentType);
    }
}
