package microgram.p507ui.sdui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010!¨\u0006*"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiPriceChartData;", "", "Lmicrogram/ui/sdui/SduiMoney;", "dollarValue", "dollarValueForRateOfReturn", "dollarValueForReturn", "<init>", "(Lmicrogram/ui/sdui/SduiMoney;Lmicrogram/ui/sdui/SduiMoney;Lmicrogram/ui/sdui/SduiMoney;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiMoney;Lmicrogram/ui/sdui/SduiMoney;Lmicrogram/ui/sdui/SduiMoney;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiPriceChartData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiMoney;", "getDollarValue", "()Lmicrogram/ui/sdui/SduiMoney;", "getDollarValue$annotations", "()V", "getDollarValueForRateOfReturn", "getDollarValueForRateOfReturn$annotations", "getDollarValueForReturn", "getDollarValueForReturn$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiPriceChartData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiMoney dollarValue;
    private final SduiMoney dollarValueForRateOfReturn;
    private final SduiMoney dollarValueForReturn;

    public SduiPriceChartData() {
        this((SduiMoney) null, (SduiMoney) null, (SduiMoney) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiPriceChartData)) {
            return false;
        }
        SduiPriceChartData sduiPriceChartData = (SduiPriceChartData) other;
        return Intrinsics.areEqual(this.dollarValue, sduiPriceChartData.dollarValue) && Intrinsics.areEqual(this.dollarValueForRateOfReturn, sduiPriceChartData.dollarValueForRateOfReturn) && Intrinsics.areEqual(this.dollarValueForReturn, sduiPriceChartData.dollarValueForReturn);
    }

    public int hashCode() {
        SduiMoney sduiMoney = this.dollarValue;
        int iHashCode = (sduiMoney == null ? 0 : sduiMoney.hashCode()) * 31;
        SduiMoney sduiMoney2 = this.dollarValueForRateOfReturn;
        int iHashCode2 = (iHashCode + (sduiMoney2 == null ? 0 : sduiMoney2.hashCode())) * 31;
        SduiMoney sduiMoney3 = this.dollarValueForReturn;
        return iHashCode2 + (sduiMoney3 != null ? sduiMoney3.hashCode() : 0);
    }

    public String toString() {
        return "SduiPriceChartData(dollarValue=" + this.dollarValue + ", dollarValueForRateOfReturn=" + this.dollarValueForRateOfReturn + ", dollarValueForReturn=" + this.dollarValueForReturn + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiPriceChartData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiPriceChartData;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiPriceChartData> serializer() {
            return SduiPriceChartData$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiPriceChartData(int i, @SerialName("dollar_value") SduiMoney sduiMoney, @SerialName("dollar_value_for_rate_of_return") SduiMoney sduiMoney2, @SerialName("dollar_value_for_return") SduiMoney sduiMoney3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.dollarValue = null;
        } else {
            this.dollarValue = sduiMoney;
        }
        if ((i & 2) == 0) {
            this.dollarValueForRateOfReturn = null;
        } else {
            this.dollarValueForRateOfReturn = sduiMoney2;
        }
        if ((i & 4) == 0) {
            this.dollarValueForReturn = null;
        } else {
            this.dollarValueForReturn = sduiMoney3;
        }
    }

    public SduiPriceChartData(SduiMoney sduiMoney, SduiMoney sduiMoney2, SduiMoney sduiMoney3) {
        this.dollarValue = sduiMoney;
        this.dollarValueForRateOfReturn = sduiMoney2;
        this.dollarValueForReturn = sduiMoney3;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiPriceChartData self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.dollarValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiMoney$$serializer.INSTANCE, self.dollarValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.dollarValueForRateOfReturn != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiMoney$$serializer.INSTANCE, self.dollarValueForRateOfReturn);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.dollarValueForReturn == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, SduiMoney$$serializer.INSTANCE, self.dollarValueForReturn);
    }

    public /* synthetic */ SduiPriceChartData(SduiMoney sduiMoney, SduiMoney sduiMoney2, SduiMoney sduiMoney3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sduiMoney, (i & 2) != 0 ? null : sduiMoney2, (i & 4) != 0 ? null : sduiMoney3);
    }
}
