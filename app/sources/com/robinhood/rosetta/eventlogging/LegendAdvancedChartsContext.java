package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartActionsRow;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo;
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: LegendAdvancedChartsContext.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003567B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010-\u001a\u00020\u0002H\u0017J\u0013\u0010.\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u0004H\u0016J\u009c\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext;", "Lcom/squareup/wire/Message;", "", FuturesAssetHomeChartDuxo.ARG_SELECTED_SPAN, "", "selected_interval", "selected_template", "active_indicators", "", "instrument_id", "trade_amount", "", "auto_send_enabled", "", "indicator_id", "set_id", "indicator_settings", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$IndicatorSettings;", "chart_settings", "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$ChartSettings;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "ref_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;DZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$IndicatorSettings;Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$ChartSettings;DLjava/lang/String;Lokio/ByteString;)V", "getSelected_span", "()Ljava/lang/String;", "getSelected_interval", "getSelected_template", "getInstrument_id", "getTrade_amount", "()D", "getAuto_send_enabled", "()Z", "getIndicator_id", "getSet_id", "getIndicator_settings", "()Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$IndicatorSettings;", "getChart_settings", "()Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$ChartSettings;", "getPrice", "getRef_id", "getActive_indicators", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "IndicatorSettings", ChartActionsRow.CHART_SETTINGS, "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class LegendAdvancedChartsContext extends Message {

    @JvmField
    public static final ProtoAdapter<LegendAdvancedChartsContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "activeIndicators", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final java.util.List<String> active_indicators;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSendEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean auto_send_enabled;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext$ChartSettings#ADAPTER", jsonName = "chartSettings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final ChartSettings chart_settings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "indicatorId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String indicator_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext$IndicatorSettings#ADAPTER", jsonName = "indicatorSettings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final IndicatorSettings indicator_settings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final double price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedInterval", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String selected_interval;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedSpan", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String selected_span;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedTemplate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String selected_template;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "setId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String set_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "tradeAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double trade_amount;

    public LegendAdvancedChartsContext() {
        this(null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, null, 16383, null);
    }

    public /* synthetic */ LegendAdvancedChartsContext(String str, String str2, String str3, java.util.List list, String str4, double d, boolean z, String str5, String str6, IndicatorSettings indicatorSettings, ChartSettings chartSettings, double d2, String str7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? false : z, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? null : indicatorSettings, (i & 1024) == 0 ? chartSettings : null, (i & 2048) != 0 ? 0.0d : d2, (i & 4096) == 0 ? str7 : "", (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24338newBuilder();
    }

    public final String getSelected_span() {
        return this.selected_span;
    }

    public final String getSelected_interval() {
        return this.selected_interval;
    }

    public final String getSelected_template() {
        return this.selected_template;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final double getTrade_amount() {
        return this.trade_amount;
    }

    public final boolean getAuto_send_enabled() {
        return this.auto_send_enabled;
    }

    public final String getIndicator_id() {
        return this.indicator_id;
    }

    public final String getSet_id() {
        return this.set_id;
    }

    public final IndicatorSettings getIndicator_settings() {
        return this.indicator_settings;
    }

    public final ChartSettings getChart_settings() {
        return this.chart_settings;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegendAdvancedChartsContext(String selected_span, String selected_interval, String selected_template, java.util.List<String> active_indicators, String instrument_id, double d, boolean z, String indicator_id, String set_id, IndicatorSettings indicatorSettings, ChartSettings chartSettings, double d2, String ref_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(selected_span, "selected_span");
        Intrinsics.checkNotNullParameter(selected_interval, "selected_interval");
        Intrinsics.checkNotNullParameter(selected_template, "selected_template");
        Intrinsics.checkNotNullParameter(active_indicators, "active_indicators");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(indicator_id, "indicator_id");
        Intrinsics.checkNotNullParameter(set_id, "set_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.selected_span = selected_span;
        this.selected_interval = selected_interval;
        this.selected_template = selected_template;
        this.instrument_id = instrument_id;
        this.trade_amount = d;
        this.auto_send_enabled = z;
        this.indicator_id = indicator_id;
        this.set_id = set_id;
        this.indicator_settings = indicatorSettings;
        this.chart_settings = chartSettings;
        this.price = d2;
        this.ref_id = ref_id;
        this.active_indicators = Internal.immutableCopyOf("active_indicators", active_indicators);
    }

    public final java.util.List<String> getActive_indicators() {
        return this.active_indicators;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24338newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LegendAdvancedChartsContext)) {
            return false;
        }
        LegendAdvancedChartsContext legendAdvancedChartsContext = (LegendAdvancedChartsContext) other;
        return Intrinsics.areEqual(unknownFields(), legendAdvancedChartsContext.unknownFields()) && Intrinsics.areEqual(this.selected_span, legendAdvancedChartsContext.selected_span) && Intrinsics.areEqual(this.selected_interval, legendAdvancedChartsContext.selected_interval) && Intrinsics.areEqual(this.selected_template, legendAdvancedChartsContext.selected_template) && Intrinsics.areEqual(this.active_indicators, legendAdvancedChartsContext.active_indicators) && Intrinsics.areEqual(this.instrument_id, legendAdvancedChartsContext.instrument_id) && this.trade_amount == legendAdvancedChartsContext.trade_amount && this.auto_send_enabled == legendAdvancedChartsContext.auto_send_enabled && Intrinsics.areEqual(this.indicator_id, legendAdvancedChartsContext.indicator_id) && Intrinsics.areEqual(this.set_id, legendAdvancedChartsContext.set_id) && Intrinsics.areEqual(this.indicator_settings, legendAdvancedChartsContext.indicator_settings) && Intrinsics.areEqual(this.chart_settings, legendAdvancedChartsContext.chart_settings) && this.price == legendAdvancedChartsContext.price && Intrinsics.areEqual(this.ref_id, legendAdvancedChartsContext.ref_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((unknownFields().hashCode() * 37) + this.selected_span.hashCode()) * 37) + this.selected_interval.hashCode()) * 37) + this.selected_template.hashCode()) * 37) + this.active_indicators.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + Double.hashCode(this.trade_amount)) * 37) + java.lang.Boolean.hashCode(this.auto_send_enabled)) * 37) + this.indicator_id.hashCode()) * 37) + this.set_id.hashCode()) * 37;
        IndicatorSettings indicatorSettings = this.indicator_settings;
        int iHashCode2 = (iHashCode + (indicatorSettings != null ? indicatorSettings.hashCode() : 0)) * 37;
        ChartSettings chartSettings = this.chart_settings;
        int iHashCode3 = ((((iHashCode2 + (chartSettings != null ? chartSettings.hashCode() : 0)) * 37) + Double.hashCode(this.price)) * 37) + this.ref_id.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("selected_span=" + Internal.sanitize(this.selected_span));
        arrayList.add("selected_interval=" + Internal.sanitize(this.selected_interval));
        arrayList.add("selected_template=" + Internal.sanitize(this.selected_template));
        if (!this.active_indicators.isEmpty()) {
            arrayList.add("active_indicators=" + Internal.sanitize(this.active_indicators));
        }
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("trade_amount=" + this.trade_amount);
        arrayList.add("auto_send_enabled=" + this.auto_send_enabled);
        arrayList.add("indicator_id=" + Internal.sanitize(this.indicator_id));
        arrayList.add("set_id=" + Internal.sanitize(this.set_id));
        IndicatorSettings indicatorSettings = this.indicator_settings;
        if (indicatorSettings != null) {
            arrayList.add("indicator_settings=" + indicatorSettings);
        }
        ChartSettings chartSettings = this.chart_settings;
        if (chartSettings != null) {
            arrayList.add("chart_settings=" + chartSettings);
        }
        arrayList.add("price=" + this.price);
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "LegendAdvancedChartsContext{", "}", 0, null, null, 56, null);
    }

    public final LegendAdvancedChartsContext copy(String selected_span, String selected_interval, String selected_template, java.util.List<String> active_indicators, String instrument_id, double trade_amount, boolean auto_send_enabled, String indicator_id, String set_id, IndicatorSettings indicator_settings, ChartSettings chart_settings, double price, String ref_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(selected_span, "selected_span");
        Intrinsics.checkNotNullParameter(selected_interval, "selected_interval");
        Intrinsics.checkNotNullParameter(selected_template, "selected_template");
        Intrinsics.checkNotNullParameter(active_indicators, "active_indicators");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(indicator_id, "indicator_id");
        Intrinsics.checkNotNullParameter(set_id, "set_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LegendAdvancedChartsContext(selected_span, selected_interval, selected_template, active_indicators, instrument_id, trade_amount, auto_send_enabled, indicator_id, set_id, indicator_settings, chart_settings, price, ref_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LegendAdvancedChartsContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LegendAdvancedChartsContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LegendAdvancedChartsContext value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSelected_span(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSelected_span());
                }
                if (!Intrinsics.areEqual(value.getSelected_interval(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSelected_interval());
                }
                if (!Intrinsics.areEqual(value.getSelected_template(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSelected_template());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getActive_indicators());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getInstrument_id());
                }
                if (!Double.valueOf(value.getTrade_amount()).equals(dValueOf)) {
                    iEncodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getTrade_amount()));
                }
                if (value.getAuto_send_enabled()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(7, java.lang.Boolean.valueOf(value.getAuto_send_enabled()));
                }
                if (!Intrinsics.areEqual(value.getIndicator_id(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getIndicator_id());
                }
                if (!Intrinsics.areEqual(value.getSet_id(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(9, value.getSet_id());
                }
                if (value.getIndicator_settings() != null) {
                    iEncodedSizeWithTag += LegendAdvancedChartsContext.IndicatorSettings.ADAPTER.encodedSizeWithTag(10, value.getIndicator_settings());
                }
                if (value.getChart_settings() != null) {
                    iEncodedSizeWithTag += LegendAdvancedChartsContext.ChartSettings.ADAPTER.encodedSizeWithTag(11, value.getChart_settings());
                }
                if (!Double.valueOf(value.getPrice()).equals(dValueOf)) {
                    iEncodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(12, Double.valueOf(value.getPrice()));
                }
                return !Intrinsics.areEqual(value.getRef_id(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(13, value.getRef_id()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LegendAdvancedChartsContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSelected_span(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSelected_span());
                }
                if (!Intrinsics.areEqual(value.getSelected_interval(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSelected_interval());
                }
                if (!Intrinsics.areEqual(value.getSelected_template(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSelected_template());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getActive_indicators());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getInstrument_id());
                }
                if (!Double.valueOf(value.getTrade_amount()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getTrade_amount()));
                }
                if (value.getAuto_send_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) java.lang.Boolean.valueOf(value.getAuto_send_enabled()));
                }
                if (!Intrinsics.areEqual(value.getIndicator_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getIndicator_id());
                }
                if (!Intrinsics.areEqual(value.getSet_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getSet_id());
                }
                if (value.getIndicator_settings() != null) {
                    LegendAdvancedChartsContext.IndicatorSettings.ADAPTER.encodeWithTag(writer, 10, (int) value.getIndicator_settings());
                }
                if (value.getChart_settings() != null) {
                    LegendAdvancedChartsContext.ChartSettings.ADAPTER.encodeWithTag(writer, 11, (int) value.getChart_settings());
                }
                if (!Double.valueOf(value.getPrice()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, (int) Double.valueOf(value.getPrice()));
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 13, (int) value.getRef_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LegendAdvancedChartsContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getRef_id());
                }
                if (!Double.valueOf(value.getPrice()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, (int) Double.valueOf(value.getPrice()));
                }
                if (value.getChart_settings() != null) {
                    LegendAdvancedChartsContext.ChartSettings.ADAPTER.encodeWithTag(writer, 11, (int) value.getChart_settings());
                }
                if (value.getIndicator_settings() != null) {
                    LegendAdvancedChartsContext.IndicatorSettings.ADAPTER.encodeWithTag(writer, 10, (int) value.getIndicator_settings());
                }
                if (!Intrinsics.areEqual(value.getSet_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getSet_id());
                }
                if (!Intrinsics.areEqual(value.getIndicator_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getIndicator_id());
                }
                if (value.getAuto_send_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) java.lang.Boolean.valueOf(value.getAuto_send_enabled()));
                }
                if (!Double.valueOf(value.getTrade_amount()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getTrade_amount()));
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getInstrument_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getActive_indicators());
                if (!Intrinsics.areEqual(value.getSelected_template(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getSelected_template());
                }
                if (!Intrinsics.areEqual(value.getSelected_interval(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSelected_interval());
                }
                if (Intrinsics.areEqual(value.getSelected_span(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getSelected_span());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LegendAdvancedChartsContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                boolean zBooleanValue = false;
                LegendAdvancedChartsContext.IndicatorSettings indicatorSettingsDecode = null;
                LegendAdvancedChartsContext.ChartSettings chartSettingsDecode = null;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode4;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 5:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 7:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 8:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                indicatorSettingsDecode = LegendAdvancedChartsContext.IndicatorSettings.ADAPTER.decode(reader);
                                break;
                            case 11:
                                chartSettingsDecode = LegendAdvancedChartsContext.ChartSettings.ADAPTER.decode(reader);
                                break;
                            case 12:
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 13:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode4 = str;
                    } else {
                        return new LegendAdvancedChartsContext(strDecode3, str, strDecode5, arrayList, strDecode6, dDoubleValue, zBooleanValue, strDecode7, strDecode, indicatorSettingsDecode, chartSettingsDecode, dDoubleValue2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LegendAdvancedChartsContext redact(LegendAdvancedChartsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                LegendAdvancedChartsContext.IndicatorSettings indicator_settings = value.getIndicator_settings();
                LegendAdvancedChartsContext.IndicatorSettings indicatorSettingsRedact = indicator_settings != null ? LegendAdvancedChartsContext.IndicatorSettings.ADAPTER.redact(indicator_settings) : null;
                LegendAdvancedChartsContext.ChartSettings chart_settings = value.getChart_settings();
                return value.copy((6655 & 1) != 0 ? value.selected_span : null, (6655 & 2) != 0 ? value.selected_interval : null, (6655 & 4) != 0 ? value.selected_template : null, (6655 & 8) != 0 ? value.active_indicators : null, (6655 & 16) != 0 ? value.instrument_id : null, (6655 & 32) != 0 ? value.trade_amount : 0.0d, (6655 & 64) != 0 ? value.auto_send_enabled : false, (6655 & 128) != 0 ? value.indicator_id : null, (6655 & 256) != 0 ? value.set_id : null, (6655 & 512) != 0 ? value.indicator_settings : indicatorSettingsRedact, (6655 & 1024) != 0 ? value.chart_settings : chart_settings != null ? LegendAdvancedChartsContext.ChartSettings.ADAPTER.redact(chart_settings) : null, (6655 & 2048) != 0 ? value.price : 0.0d, (6655 & 4096) != 0 ? value.ref_id : null, (6655 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* compiled from: LegendAdvancedChartsContext.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$IndicatorSettings;", "Lcom/squareup/wire/Message;", "", "parameter_id", "", "line_title", "value", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getParameter_id", "()Ljava/lang/String;", "getLine_title", "getValue", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IndicatorSettings extends Message {

        @JvmField
        public static final ProtoAdapter<IndicatorSettings> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lineTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String line_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "parameterId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String parameter_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String value;

        public IndicatorSettings() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ IndicatorSettings(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24340newBuilder();
        }

        public final String getParameter_id() {
            return this.parameter_id;
        }

        public final String getLine_title() {
            return this.line_title;
        }

        public final String getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IndicatorSettings(String parameter_id, String line_title, String value, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(parameter_id, "parameter_id");
            Intrinsics.checkNotNullParameter(line_title, "line_title");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.parameter_id = parameter_id;
            this.line_title = line_title;
            this.value = value;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24340newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof IndicatorSettings)) {
                return false;
            }
            IndicatorSettings indicatorSettings = (IndicatorSettings) other;
            return Intrinsics.areEqual(unknownFields(), indicatorSettings.unknownFields()) && Intrinsics.areEqual(this.parameter_id, indicatorSettings.parameter_id) && Intrinsics.areEqual(this.line_title, indicatorSettings.line_title) && Intrinsics.areEqual(this.value, indicatorSettings.value);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.parameter_id.hashCode()) * 37) + this.line_title.hashCode()) * 37) + this.value.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("parameter_id=" + Internal.sanitize(this.parameter_id));
            arrayList.add("line_title=" + Internal.sanitize(this.line_title));
            arrayList.add("value=" + Internal.sanitize(this.value));
            return CollectionsKt.joinToString$default(arrayList, ", ", "IndicatorSettings{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ IndicatorSettings copy$default(IndicatorSettings indicatorSettings, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = indicatorSettings.parameter_id;
            }
            if ((i & 2) != 0) {
                str2 = indicatorSettings.line_title;
            }
            if ((i & 4) != 0) {
                str3 = indicatorSettings.value;
            }
            if ((i & 8) != 0) {
                byteString = indicatorSettings.unknownFields();
            }
            return indicatorSettings.copy(str, str2, str3, byteString);
        }

        public final IndicatorSettings copy(String parameter_id, String line_title, String value, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(parameter_id, "parameter_id");
            Intrinsics.checkNotNullParameter(line_title, "line_title");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new IndicatorSettings(parameter_id, line_title, value, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndicatorSettings.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<IndicatorSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext$IndicatorSettings$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public LegendAdvancedChartsContext.IndicatorSettings decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    String strDecode3 = strDecode2;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new LegendAdvancedChartsContext.IndicatorSettings(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LegendAdvancedChartsContext.IndicatorSettings value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getParameter_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getParameter_id());
                    }
                    if (!Intrinsics.areEqual(value.getLine_title(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLine_title());
                    }
                    return !Intrinsics.areEqual(value.getValue(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getValue()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LegendAdvancedChartsContext.IndicatorSettings value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getParameter_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getParameter_id());
                    }
                    if (!Intrinsics.areEqual(value.getLine_title(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLine_title());
                    }
                    if (!Intrinsics.areEqual(value.getValue(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LegendAdvancedChartsContext.IndicatorSettings value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getValue(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getValue());
                    }
                    if (!Intrinsics.areEqual(value.getLine_title(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLine_title());
                    }
                    if (Intrinsics.areEqual(value.getParameter_id(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getParameter_id());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LegendAdvancedChartsContext.IndicatorSettings redact(LegendAdvancedChartsContext.IndicatorSettings value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return LegendAdvancedChartsContext.IndicatorSettings.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }
            };
        }
    }

    /* compiled from: LegendAdvancedChartsContext.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext$ChartSettings;", "Lcom/squareup/wire/Message;", "", "key", "", "value", "state", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getKey", "()Ljava/lang/String;", "getValue", "getState", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChartSettings extends Message {

        @JvmField
        public static final ProtoAdapter<ChartSettings> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String key;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final boolean state;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String value;

        public ChartSettings() {
            this(null, null, false, null, 15, null);
        }

        public /* synthetic */ ChartSettings(String str, String str2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24339newBuilder();
        }

        public final String getKey() {
            return this.key;
        }

        public final String getValue() {
            return this.value;
        }

        public final boolean getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChartSettings(String key, String value, boolean z, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.key = key;
            this.value = value;
            this.state = z;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24339newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ChartSettings)) {
                return false;
            }
            ChartSettings chartSettings = (ChartSettings) other;
            return Intrinsics.areEqual(unknownFields(), chartSettings.unknownFields()) && Intrinsics.areEqual(this.key, chartSettings.key) && Intrinsics.areEqual(this.value, chartSettings.value) && this.state == chartSettings.state;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.value.hashCode()) * 37) + java.lang.Boolean.hashCode(this.state);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("key=" + Internal.sanitize(this.key));
            arrayList.add("value=" + Internal.sanitize(this.value));
            arrayList.add("state=" + this.state);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ChartSettings{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ChartSettings copy$default(ChartSettings chartSettings, String str, String str2, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chartSettings.key;
            }
            if ((i & 2) != 0) {
                str2 = chartSettings.value;
            }
            if ((i & 4) != 0) {
                z = chartSettings.state;
            }
            if ((i & 8) != 0) {
                byteString = chartSettings.unknownFields();
            }
            return chartSettings.copy(str, str2, z, byteString);
        }

        public final ChartSettings copy(String key, String value, boolean state, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ChartSettings(key, value, state, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartSettings.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ChartSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext$ChartSettings$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public LegendAdvancedChartsContext.ChartSettings decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    boolean zBooleanValue = false;
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new LegendAdvancedChartsContext.ChartSettings(strDecode, strDecode2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LegendAdvancedChartsContext.ChartSettings value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getKey(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getKey());
                    }
                    if (!Intrinsics.areEqual(value.getValue(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getValue());
                    }
                    return value.getState() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, java.lang.Boolean.valueOf(value.getState())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LegendAdvancedChartsContext.ChartSettings value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getKey(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getKey());
                    }
                    if (!Intrinsics.areEqual(value.getValue(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getValue());
                    }
                    if (value.getState()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getState()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LegendAdvancedChartsContext.ChartSettings value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getState()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getState()));
                    }
                    if (!Intrinsics.areEqual(value.getValue(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getValue());
                    }
                    if (Intrinsics.areEqual(value.getKey(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getKey());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LegendAdvancedChartsContext.ChartSettings redact(LegendAdvancedChartsContext.ChartSettings value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return LegendAdvancedChartsContext.ChartSettings.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
                }
            };
        }
    }
}
