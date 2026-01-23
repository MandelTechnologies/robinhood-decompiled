package microgram.p507ui.sdui;

import com.plaid.internal.EnumC7081g;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rBm\b\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b4\u0010,\u001a\u0004\b2\u00103R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010'R\"\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b8\u0010,\u001a\u0004\b7\u00103¨\u0006;"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiCursorData;", "", "Lmicrogram/ui/sdui/SduiDisplayText;", AnnotatedPrivateKey.LABEL, "Lmicrogram/ui/sdui/SduiPriceChartData;", "priceChartData", "primaryValue", "secondaryLabel", "Lmicrogram/ui/sdui/SduiSubDisplayText;", "secondaryValue", "tertiaryLabel", "tertiaryValue", "<init>", "(Lmicrogram/ui/sdui/SduiDisplayText;Lmicrogram/ui/sdui/SduiPriceChartData;Lmicrogram/ui/sdui/SduiDisplayText;Lmicrogram/ui/sdui/SduiDisplayText;Lmicrogram/ui/sdui/SduiSubDisplayText;Lmicrogram/ui/sdui/SduiDisplayText;Lmicrogram/ui/sdui/SduiSubDisplayText;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiDisplayText;Lmicrogram/ui/sdui/SduiPriceChartData;Lmicrogram/ui/sdui/SduiDisplayText;Lmicrogram/ui/sdui/SduiDisplayText;Lmicrogram/ui/sdui/SduiSubDisplayText;Lmicrogram/ui/sdui/SduiDisplayText;Lmicrogram/ui/sdui/SduiSubDisplayText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiCursorData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiDisplayText;", "getLabel", "()Lmicrogram/ui/sdui/SduiDisplayText;", "Lmicrogram/ui/sdui/SduiPriceChartData;", "getPriceChartData", "()Lmicrogram/ui/sdui/SduiPriceChartData;", "getPriceChartData$annotations", "()V", "getPrimaryValue", "getPrimaryValue$annotations", "getSecondaryLabel", "getSecondaryLabel$annotations", "Lmicrogram/ui/sdui/SduiSubDisplayText;", "getSecondaryValue", "()Lmicrogram/ui/sdui/SduiSubDisplayText;", "getSecondaryValue$annotations", "getTertiaryLabel", "getTertiaryLabel$annotations", "getTertiaryValue", "getTertiaryValue$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiCursorData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiDisplayText label;
    private final SduiPriceChartData priceChartData;
    private final SduiDisplayText primaryValue;
    private final SduiDisplayText secondaryLabel;
    private final SduiSubDisplayText secondaryValue;
    private final SduiDisplayText tertiaryLabel;
    private final SduiSubDisplayText tertiaryValue;

    public SduiCursorData() {
        this((SduiDisplayText) null, (SduiPriceChartData) null, (SduiDisplayText) null, (SduiDisplayText) null, (SduiSubDisplayText) null, (SduiDisplayText) null, (SduiSubDisplayText) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiCursorData)) {
            return false;
        }
        SduiCursorData sduiCursorData = (SduiCursorData) other;
        return Intrinsics.areEqual(this.label, sduiCursorData.label) && Intrinsics.areEqual(this.priceChartData, sduiCursorData.priceChartData) && Intrinsics.areEqual(this.primaryValue, sduiCursorData.primaryValue) && Intrinsics.areEqual(this.secondaryLabel, sduiCursorData.secondaryLabel) && Intrinsics.areEqual(this.secondaryValue, sduiCursorData.secondaryValue) && Intrinsics.areEqual(this.tertiaryLabel, sduiCursorData.tertiaryLabel) && Intrinsics.areEqual(this.tertiaryValue, sduiCursorData.tertiaryValue);
    }

    public int hashCode() {
        SduiDisplayText sduiDisplayText = this.label;
        int iHashCode = (sduiDisplayText == null ? 0 : sduiDisplayText.hashCode()) * 31;
        SduiPriceChartData sduiPriceChartData = this.priceChartData;
        int iHashCode2 = (iHashCode + (sduiPriceChartData == null ? 0 : sduiPriceChartData.hashCode())) * 31;
        SduiDisplayText sduiDisplayText2 = this.primaryValue;
        int iHashCode3 = (iHashCode2 + (sduiDisplayText2 == null ? 0 : sduiDisplayText2.hashCode())) * 31;
        SduiDisplayText sduiDisplayText3 = this.secondaryLabel;
        int iHashCode4 = (iHashCode3 + (sduiDisplayText3 == null ? 0 : sduiDisplayText3.hashCode())) * 31;
        SduiSubDisplayText sduiSubDisplayText = this.secondaryValue;
        int iHashCode5 = (iHashCode4 + (sduiSubDisplayText == null ? 0 : sduiSubDisplayText.hashCode())) * 31;
        SduiDisplayText sduiDisplayText4 = this.tertiaryLabel;
        int iHashCode6 = (iHashCode5 + (sduiDisplayText4 == null ? 0 : sduiDisplayText4.hashCode())) * 31;
        SduiSubDisplayText sduiSubDisplayText2 = this.tertiaryValue;
        return iHashCode6 + (sduiSubDisplayText2 != null ? sduiSubDisplayText2.hashCode() : 0);
    }

    public String toString() {
        return "SduiCursorData(label=" + this.label + ", priceChartData=" + this.priceChartData + ", primaryValue=" + this.primaryValue + ", secondaryLabel=" + this.secondaryLabel + ", secondaryValue=" + this.secondaryValue + ", tertiaryLabel=" + this.tertiaryLabel + ", tertiaryValue=" + this.tertiaryValue + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiCursorData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiCursorData;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiCursorData> serializer() {
            return SduiCursorData$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiCursorData(int i, SduiDisplayText sduiDisplayText, @SerialName("price_chart_data") SduiPriceChartData sduiPriceChartData, @SerialName("primary_value") SduiDisplayText sduiDisplayText2, @SerialName("secondary_label") SduiDisplayText sduiDisplayText3, @SerialName("secondary_value") SduiSubDisplayText sduiSubDisplayText, @SerialName("tertiary_label") SduiDisplayText sduiDisplayText4, @SerialName("tertiary_value") SduiSubDisplayText sduiSubDisplayText2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.label = null;
        } else {
            this.label = sduiDisplayText;
        }
        if ((i & 2) == 0) {
            this.priceChartData = null;
        } else {
            this.priceChartData = sduiPriceChartData;
        }
        if ((i & 4) == 0) {
            this.primaryValue = null;
        } else {
            this.primaryValue = sduiDisplayText2;
        }
        if ((i & 8) == 0) {
            this.secondaryLabel = null;
        } else {
            this.secondaryLabel = sduiDisplayText3;
        }
        if ((i & 16) == 0) {
            this.secondaryValue = null;
        } else {
            this.secondaryValue = sduiSubDisplayText;
        }
        if ((i & 32) == 0) {
            this.tertiaryLabel = null;
        } else {
            this.tertiaryLabel = sduiDisplayText4;
        }
        if ((i & 64) == 0) {
            this.tertiaryValue = null;
        } else {
            this.tertiaryValue = sduiSubDisplayText2;
        }
    }

    public SduiCursorData(SduiDisplayText sduiDisplayText, SduiPriceChartData sduiPriceChartData, SduiDisplayText sduiDisplayText2, SduiDisplayText sduiDisplayText3, SduiSubDisplayText sduiSubDisplayText, SduiDisplayText sduiDisplayText4, SduiSubDisplayText sduiSubDisplayText2) {
        this.label = sduiDisplayText;
        this.priceChartData = sduiPriceChartData;
        this.primaryValue = sduiDisplayText2;
        this.secondaryLabel = sduiDisplayText3;
        this.secondaryValue = sduiSubDisplayText;
        this.tertiaryLabel = sduiDisplayText4;
        this.tertiaryValue = sduiSubDisplayText2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiCursorData self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.label != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiDisplayText$$serializer.INSTANCE, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.priceChartData != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiPriceChartData$$serializer.INSTANCE, self.priceChartData);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.primaryValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiDisplayText$$serializer.INSTANCE, self.primaryValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.secondaryLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, SduiDisplayText$$serializer.INSTANCE, self.secondaryLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.secondaryValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SduiSubDisplayText$$serializer.INSTANCE, self.secondaryValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.tertiaryLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, SduiDisplayText$$serializer.INSTANCE, self.tertiaryLabel);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.tertiaryValue == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, SduiSubDisplayText$$serializer.INSTANCE, self.tertiaryValue);
    }

    public /* synthetic */ SduiCursorData(SduiDisplayText sduiDisplayText, SduiPriceChartData sduiPriceChartData, SduiDisplayText sduiDisplayText2, SduiDisplayText sduiDisplayText3, SduiSubDisplayText sduiSubDisplayText, SduiDisplayText sduiDisplayText4, SduiSubDisplayText sduiSubDisplayText2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sduiDisplayText, (i & 2) != 0 ? null : sduiPriceChartData, (i & 4) != 0 ? null : sduiDisplayText2, (i & 8) != 0 ? null : sduiDisplayText3, (i & 16) != 0 ? null : sduiSubDisplayText, (i & 32) != 0 ? null : sduiDisplayText4, (i & 64) != 0 ? null : sduiSubDisplayText2);
    }
}
