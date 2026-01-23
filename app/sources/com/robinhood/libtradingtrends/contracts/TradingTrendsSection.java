package com.robinhood.libtradingtrends.contracts;

import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.sdui.SduiChartGroup;
import microgram.p507ui.sdui.SduiChartGroup$$serializer;

/* compiled from: TradingTrendsSection.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223Be\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011BI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J&\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200HÁ\u0001¢\u0006\u0002\b1R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u00064"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "", "seen1", "", "title", "", "segmentedControlOptions", "", "Lcom/robinhood/libtradingtrends/contracts/SegmentedControlOption;", "selectedType", "chart", "Lmicrogram/ui/sdui/SduiChartGroup;", "expandButtonAccessibilityLabel", "insightsPanelText", "sourceText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lmicrogram/ui/sdui/SduiChartGroup;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lmicrogram/ui/sdui/SduiChartGroup;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChart", "()Lmicrogram/ui/sdui/SduiChartGroup;", "getExpandButtonAccessibilityLabel", "()Ljava/lang/String;", "getInsightsPanelText", "getSegmentedControlOptions", "()Ljava/util/List;", "getSelectedType", "getSourceText", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes13.dex */
public final /* data */ class TradingTrendsSection {
    private final SduiChartGroup chart;
    private final String expandButtonAccessibilityLabel;
    private final String insightsPanelText;
    private final List<SegmentedControlOption> segmentedControlOptions;
    private final String selectedType;
    private final String sourceText;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SegmentedControlOption2.INSTANCE), null, null, null, null, null};

    public static /* synthetic */ TradingTrendsSection copy$default(TradingTrendsSection tradingTrendsSection, String str, List list, String str2, SduiChartGroup sduiChartGroup, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradingTrendsSection.title;
        }
        if ((i & 2) != 0) {
            list = tradingTrendsSection.segmentedControlOptions;
        }
        if ((i & 4) != 0) {
            str2 = tradingTrendsSection.selectedType;
        }
        if ((i & 8) != 0) {
            sduiChartGroup = tradingTrendsSection.chart;
        }
        if ((i & 16) != 0) {
            str3 = tradingTrendsSection.expandButtonAccessibilityLabel;
        }
        if ((i & 32) != 0) {
            str4 = tradingTrendsSection.insightsPanelText;
        }
        if ((i & 64) != 0) {
            str5 = tradingTrendsSection.sourceText;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str2;
        return tradingTrendsSection.copy(str, list, str9, sduiChartGroup, str8, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<SegmentedControlOption> component2() {
        return this.segmentedControlOptions;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedType() {
        return this.selectedType;
    }

    /* renamed from: component4, reason: from getter */
    public final SduiChartGroup getChart() {
        return this.chart;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExpandButtonAccessibilityLabel() {
        return this.expandButtonAccessibilityLabel;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInsightsPanelText() {
        return this.insightsPanelText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSourceText() {
        return this.sourceText;
    }

    public final TradingTrendsSection copy(String title, List<SegmentedControlOption> segmentedControlOptions, String selectedType, SduiChartGroup chart, String expandButtonAccessibilityLabel, String insightsPanelText, String sourceText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(segmentedControlOptions, "segmentedControlOptions");
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        Intrinsics.checkNotNullParameter(chart, "chart");
        return new TradingTrendsSection(title, segmentedControlOptions, selectedType, chart, expandButtonAccessibilityLabel, insightsPanelText, sourceText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradingTrendsSection)) {
            return false;
        }
        TradingTrendsSection tradingTrendsSection = (TradingTrendsSection) other;
        return Intrinsics.areEqual(this.title, tradingTrendsSection.title) && Intrinsics.areEqual(this.segmentedControlOptions, tradingTrendsSection.segmentedControlOptions) && Intrinsics.areEqual(this.selectedType, tradingTrendsSection.selectedType) && Intrinsics.areEqual(this.chart, tradingTrendsSection.chart) && Intrinsics.areEqual(this.expandButtonAccessibilityLabel, tradingTrendsSection.expandButtonAccessibilityLabel) && Intrinsics.areEqual(this.insightsPanelText, tradingTrendsSection.insightsPanelText) && Intrinsics.areEqual(this.sourceText, tradingTrendsSection.sourceText);
    }

    public int hashCode() {
        int iHashCode = ((((((this.title.hashCode() * 31) + this.segmentedControlOptions.hashCode()) * 31) + this.selectedType.hashCode()) * 31) + this.chart.hashCode()) * 31;
        String str = this.expandButtonAccessibilityLabel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.insightsPanelText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceText;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "TradingTrendsSection(title=" + this.title + ", segmentedControlOptions=" + this.segmentedControlOptions + ", selectedType=" + this.selectedType + ", chart=" + this.chart + ", expandButtonAccessibilityLabel=" + this.expandButtonAccessibilityLabel + ", insightsPanelText=" + this.insightsPanelText + ", sourceText=" + this.sourceText + ")";
    }

    /* compiled from: TradingTrendsSection.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TradingTrendsSection> serializer() {
            return TradingTrendsSection2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ TradingTrendsSection(int i, String str, List list, String str2, SduiChartGroup sduiChartGroup, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE)) {
            PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, TradingTrendsSection2.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.segmentedControlOptions = list;
        this.selectedType = str2;
        this.chart = sduiChartGroup;
        this.expandButtonAccessibilityLabel = str3;
        this.insightsPanelText = str4;
        this.sourceText = str5;
    }

    public TradingTrendsSection(String title, List<SegmentedControlOption> segmentedControlOptions, String selectedType, SduiChartGroup chart, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(segmentedControlOptions, "segmentedControlOptions");
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.title = title;
        this.segmentedControlOptions = segmentedControlOptions;
        this.selectedType = selectedType;
        this.chart = chart;
        this.expandButtonAccessibilityLabel = str;
        this.insightsPanelText = str2;
        this.sourceText = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(TradingTrendsSection self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.segmentedControlOptions);
        output.encodeStringElement(serialDesc, 2, self.selectedType);
        output.encodeSerializableElement(serialDesc, 3, SduiChartGroup$$serializer.INSTANCE, self.chart);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.expandButtonAccessibilityLabel);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.insightsPanelText);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.sourceText);
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<SegmentedControlOption> getSegmentedControlOptions() {
        return this.segmentedControlOptions;
    }

    public final String getSelectedType() {
        return this.selectedType;
    }

    public final SduiChartGroup getChart() {
        return this.chart;
    }

    public final String getExpandButtonAccessibilityLabel() {
        return this.expandButtonAccessibilityLabel;
    }

    public final String getInsightsPanelText() {
        return this.insightsPanelText;
    }

    public final String getSourceText() {
        return this.sourceText;
    }
}
