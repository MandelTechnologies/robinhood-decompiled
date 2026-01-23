package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.rosetta.eventlogging.PerformanceChartContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PerformanceChartContext.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004#$%&BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\nH\u0016JB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext;", "Lcom/squareup/wire/Message;", "", "span_selected", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "selected_chart_View", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView;", "chart_type", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "returns_comparison_symbols", "", "has_privacy_enabled", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView;Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;Ljava/lang/String;ZLokio/ByteString;)V", "getSpan_selected", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "getSelected_chart_View", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView;", "getChart_type", "()Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "getReturns_comparison_symbols", "()Ljava/lang/String;", "getHas_privacy_enabled", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "Span", "ChartView", "ChartType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PerformanceChartContext extends Message {

    @JvmField
    public static final ProtoAdapter<PerformanceChartContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceChartContext$ChartType#ADAPTER", jsonName = "chartType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ChartType chart_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasPrivacyEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean has_privacy_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "returnsComparisonSymbols", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String returns_comparison_symbols;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceChartContext$ChartView#ADAPTER", jsonName = "selectedChartView", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ChartView selected_chart_View;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceChartContext$Span#ADAPTER", jsonName = "spanSelected", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Span span_selected;

    public PerformanceChartContext() {
        this(null, null, null, null, false, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24471newBuilder();
    }

    public final Span getSpan_selected() {
        return this.span_selected;
    }

    public /* synthetic */ PerformanceChartContext(Span span, ChartView chartView, ChartType chartType, String str, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Span.SPAN_UNSPECIFIED : span, (i & 2) != 0 ? ChartView.CHART_VIEW_UNSPECIFIED : chartView, (i & 4) != 0 ? ChartType.CHART_TYPE_UNSPECIFIED : chartType, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ChartView getSelected_chart_View() {
        return this.selected_chart_View;
    }

    public final ChartType getChart_type() {
        return this.chart_type;
    }

    public final String getReturns_comparison_symbols() {
        return this.returns_comparison_symbols;
    }

    public final boolean getHas_privacy_enabled() {
        return this.has_privacy_enabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceChartContext(Span span_selected, ChartView selected_chart_View, ChartType chart_type, String returns_comparison_symbols, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(span_selected, "span_selected");
        Intrinsics.checkNotNullParameter(selected_chart_View, "selected_chart_View");
        Intrinsics.checkNotNullParameter(chart_type, "chart_type");
        Intrinsics.checkNotNullParameter(returns_comparison_symbols, "returns_comparison_symbols");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.span_selected = span_selected;
        this.selected_chart_View = selected_chart_View;
        this.chart_type = chart_type;
        this.returns_comparison_symbols = returns_comparison_symbols;
        this.has_privacy_enabled = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24471newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PerformanceChartContext)) {
            return false;
        }
        PerformanceChartContext performanceChartContext = (PerformanceChartContext) other;
        return Intrinsics.areEqual(unknownFields(), performanceChartContext.unknownFields()) && this.span_selected == performanceChartContext.span_selected && this.selected_chart_View == performanceChartContext.selected_chart_View && this.chart_type == performanceChartContext.chart_type && Intrinsics.areEqual(this.returns_comparison_symbols, performanceChartContext.returns_comparison_symbols) && this.has_privacy_enabled == performanceChartContext.has_privacy_enabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.span_selected.hashCode()) * 37) + this.selected_chart_View.hashCode()) * 37) + this.chart_type.hashCode()) * 37) + this.returns_comparison_symbols.hashCode()) * 37) + java.lang.Boolean.hashCode(this.has_privacy_enabled);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("span_selected=" + this.span_selected);
        arrayList.add("selected_chart_View=" + this.selected_chart_View);
        arrayList.add("chart_type=" + this.chart_type);
        arrayList.add("returns_comparison_symbols=" + Internal.sanitize(this.returns_comparison_symbols));
        arrayList.add("has_privacy_enabled=" + this.has_privacy_enabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerformanceChartContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PerformanceChartContext copy$default(PerformanceChartContext performanceChartContext, Span span, ChartView chartView, ChartType chartType, String str, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            span = performanceChartContext.span_selected;
        }
        if ((i & 2) != 0) {
            chartView = performanceChartContext.selected_chart_View;
        }
        if ((i & 4) != 0) {
            chartType = performanceChartContext.chart_type;
        }
        if ((i & 8) != 0) {
            str = performanceChartContext.returns_comparison_symbols;
        }
        if ((i & 16) != 0) {
            z = performanceChartContext.has_privacy_enabled;
        }
        if ((i & 32) != 0) {
            byteString = performanceChartContext.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        return performanceChartContext.copy(span, chartView, chartType, str, z2, byteString2);
    }

    public final PerformanceChartContext copy(Span span_selected, ChartView selected_chart_View, ChartType chart_type, String returns_comparison_symbols, boolean has_privacy_enabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(span_selected, "span_selected");
        Intrinsics.checkNotNullParameter(selected_chart_View, "selected_chart_View");
        Intrinsics.checkNotNullParameter(chart_type, "chart_type");
        Intrinsics.checkNotNullParameter(returns_comparison_symbols, "returns_comparison_symbols");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PerformanceChartContext(span_selected, selected_chart_View, chart_type, returns_comparison_symbols, has_privacy_enabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerformanceChartContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PerformanceChartContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerformanceChartContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PerformanceChartContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSpan_selected() != PerformanceChartContext.Span.SPAN_UNSPECIFIED) {
                    size += PerformanceChartContext.Span.ADAPTER.encodedSizeWithTag(1, value.getSpan_selected());
                }
                if (value.getSelected_chart_View() != PerformanceChartContext.ChartView.CHART_VIEW_UNSPECIFIED) {
                    size += PerformanceChartContext.ChartView.ADAPTER.encodedSizeWithTag(2, value.getSelected_chart_View());
                }
                if (value.getChart_type() != PerformanceChartContext.ChartType.CHART_TYPE_UNSPECIFIED) {
                    size += PerformanceChartContext.ChartType.ADAPTER.encodedSizeWithTag(3, value.getChart_type());
                }
                if (!Intrinsics.areEqual(value.getReturns_comparison_symbols(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getReturns_comparison_symbols());
                }
                return value.getHas_privacy_enabled() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(5, java.lang.Boolean.valueOf(value.getHas_privacy_enabled())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PerformanceChartContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSpan_selected() != PerformanceChartContext.Span.SPAN_UNSPECIFIED) {
                    PerformanceChartContext.Span.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpan_selected());
                }
                if (value.getSelected_chart_View() != PerformanceChartContext.ChartView.CHART_VIEW_UNSPECIFIED) {
                    PerformanceChartContext.ChartView.ADAPTER.encodeWithTag(writer, 2, (int) value.getSelected_chart_View());
                }
                if (value.getChart_type() != PerformanceChartContext.ChartType.CHART_TYPE_UNSPECIFIED) {
                    PerformanceChartContext.ChartType.ADAPTER.encodeWithTag(writer, 3, (int) value.getChart_type());
                }
                if (!Intrinsics.areEqual(value.getReturns_comparison_symbols(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getReturns_comparison_symbols());
                }
                if (value.getHas_privacy_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) java.lang.Boolean.valueOf(value.getHas_privacy_enabled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PerformanceChartContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHas_privacy_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) java.lang.Boolean.valueOf(value.getHas_privacy_enabled()));
                }
                if (!Intrinsics.areEqual(value.getReturns_comparison_symbols(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getReturns_comparison_symbols());
                }
                if (value.getChart_type() != PerformanceChartContext.ChartType.CHART_TYPE_UNSPECIFIED) {
                    PerformanceChartContext.ChartType.ADAPTER.encodeWithTag(writer, 3, (int) value.getChart_type());
                }
                if (value.getSelected_chart_View() != PerformanceChartContext.ChartView.CHART_VIEW_UNSPECIFIED) {
                    PerformanceChartContext.ChartView.ADAPTER.encodeWithTag(writer, 2, (int) value.getSelected_chart_View());
                }
                if (value.getSpan_selected() != PerformanceChartContext.Span.SPAN_UNSPECIFIED) {
                    PerformanceChartContext.Span.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpan_selected());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PerformanceChartContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PerformanceChartContext.Span spanDecode = PerformanceChartContext.Span.SPAN_UNSPECIFIED;
                PerformanceChartContext.ChartView chartView = PerformanceChartContext.ChartView.CHART_VIEW_UNSPECIFIED;
                PerformanceChartContext.ChartType chartType = PerformanceChartContext.ChartType.CHART_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                String strDecode = "";
                PerformanceChartContext.ChartType chartTypeDecode = chartType;
                PerformanceChartContext.ChartView chartViewDecode = chartView;
                while (true) {
                    PerformanceChartContext.Span span = spanDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PerformanceChartContext(span, chartViewDecode, chartTypeDecode, strDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                spanDecode = PerformanceChartContext.Span.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                chartViewDecode = PerformanceChartContext.ChartView.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                chartTypeDecode = PerformanceChartContext.ChartType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PerformanceChartContext redact(PerformanceChartContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PerformanceChartContext.copy$default(value, null, null, null, null, false, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceChartContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SPAN_UNSPECIFIED", "LIVE", "ONE_DAY", "ONE_WEEK", "ONE_MONTH", "THREE_MONTHS", DisplaySpans.YTD, "ONE_YEAR", DisplaySpans.ALL, "FOUR_HOUR", "UNKNOWN", "ONE_HOUR", "FIVE_YEARS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Span implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Span[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Span> ADAPTER;
        public static final Span ALL;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Span FIVE_YEARS;
        public static final Span FOUR_HOUR;
        public static final Span LIVE;
        public static final Span ONE_DAY;
        public static final Span ONE_HOUR;
        public static final Span ONE_MONTH;
        public static final Span ONE_WEEK;
        public static final Span ONE_YEAR;
        public static final Span SPAN_UNSPECIFIED;
        public static final Span THREE_MONTHS;
        public static final Span UNKNOWN;
        public static final Span YTD;
        private final int value;

        private static final /* synthetic */ Span[] $values() {
            return new Span[]{SPAN_UNSPECIFIED, LIVE, ONE_DAY, ONE_WEEK, ONE_MONTH, THREE_MONTHS, YTD, ONE_YEAR, ALL, FOUR_HOUR, UNKNOWN, ONE_HOUR, FIVE_YEARS};
        }

        @JvmStatic
        public static final Span fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Span> getEntries() {
            return $ENTRIES;
        }

        private Span(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Span span = new Span("SPAN_UNSPECIFIED", 0, 0);
            SPAN_UNSPECIFIED = span;
            LIVE = new Span("LIVE", 1, 1);
            ONE_DAY = new Span("ONE_DAY", 2, 2);
            ONE_WEEK = new Span("ONE_WEEK", 3, 3);
            ONE_MONTH = new Span("ONE_MONTH", 4, 4);
            THREE_MONTHS = new Span("THREE_MONTHS", 5, 5);
            YTD = new Span(DisplaySpans.YTD, 6, 6);
            ONE_YEAR = new Span("ONE_YEAR", 7, 7);
            ALL = new Span(DisplaySpans.ALL, 8, 8);
            FOUR_HOUR = new Span("FOUR_HOUR", 9, 9);
            UNKNOWN = new Span("UNKNOWN", 10, 10);
            ONE_HOUR = new Span("ONE_HOUR", 11, 11);
            FIVE_YEARS = new Span("FIVE_YEARS", 12, 12);
            Span[] spanArr$values = $values();
            $VALUES = spanArr$values;
            $ENTRIES = EnumEntries2.enumEntries(spanArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Span.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Span>(orCreateKotlinClass, syntax, span) { // from class: com.robinhood.rosetta.eventlogging.PerformanceChartContext$Span$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerformanceChartContext.Span fromValue(int value) {
                    return PerformanceChartContext.Span.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerformanceChartContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$Span;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Span fromValue(int value) {
                switch (value) {
                    case 0:
                        return Span.SPAN_UNSPECIFIED;
                    case 1:
                        return Span.LIVE;
                    case 2:
                        return Span.ONE_DAY;
                    case 3:
                        return Span.ONE_WEEK;
                    case 4:
                        return Span.ONE_MONTH;
                    case 5:
                        return Span.THREE_MONTHS;
                    case 6:
                        return Span.YTD;
                    case 7:
                        return Span.ONE_YEAR;
                    case 8:
                        return Span.ALL;
                    case 9:
                        return Span.FOUR_HOUR;
                    case 10:
                        return Span.UNKNOWN;
                    case 11:
                        return Span.ONE_HOUR;
                    case 12:
                        return Span.FIVE_YEARS;
                    default:
                        return null;
                }
            }
        }

        public static Span valueOf(String str) {
            return (Span) Enum.valueOf(Span.class, str);
        }

        public static Span[] values() {
            return (Span[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceChartContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHART_VIEW_UNSPECIFIED", "PERFORMANCE", "CONTRIBUTION", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChartView implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChartView[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ChartView> ADAPTER;
        public static final ChartView CHART_VIEW_UNSPECIFIED;
        public static final ChartView CONTRIBUTION;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ChartView PERFORMANCE;
        private final int value;

        private static final /* synthetic */ ChartView[] $values() {
            return new ChartView[]{CHART_VIEW_UNSPECIFIED, PERFORMANCE, CONTRIBUTION};
        }

        @JvmStatic
        public static final ChartView fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ChartView> getEntries() {
            return $ENTRIES;
        }

        private ChartView(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ChartView chartView = new ChartView("CHART_VIEW_UNSPECIFIED", 0, 0);
            CHART_VIEW_UNSPECIFIED = chartView;
            PERFORMANCE = new ChartView("PERFORMANCE", 1, 1);
            CONTRIBUTION = new ChartView("CONTRIBUTION", 2, 2);
            ChartView[] chartViewArr$values = $values();
            $VALUES = chartViewArr$values;
            $ENTRIES = EnumEntries2.enumEntries(chartViewArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartView.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ChartView>(orCreateKotlinClass, syntax, chartView) { // from class: com.robinhood.rosetta.eventlogging.PerformanceChartContext$ChartView$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerformanceChartContext.ChartView fromValue(int value) {
                    return PerformanceChartContext.ChartView.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerformanceChartContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartView;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ChartView fromValue(int value) {
                if (value == 0) {
                    return ChartView.CHART_VIEW_UNSPECIFIED;
                }
                if (value == 1) {
                    return ChartView.PERFORMANCE;
                }
                if (value != 2) {
                    return null;
                }
                return ChartView.CONTRIBUTION;
            }
        }

        public static ChartView valueOf(String str) {
            return (ChartView) Enum.valueOf(ChartView.class, str);
        }

        public static ChartView[] values() {
            return (ChartView[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceChartContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHART_TYPE_UNSPECIFIED", "EQUITY", "CRYPTO", "OPTIONS", "HISTORICAL_PORTFOLIO", "ADVISORY_INSIGHT", "FUTURES", "EVENT_CONTRACT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChartType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChartType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ChartType> ADAPTER;
        public static final ChartType ADVISORY_INSIGHT;
        public static final ChartType CHART_TYPE_UNSPECIFIED;
        public static final ChartType CRYPTO;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ChartType EQUITY;
        public static final ChartType EVENT_CONTRACT;
        public static final ChartType FUTURES;
        public static final ChartType HISTORICAL_PORTFOLIO;
        public static final ChartType OPTIONS;
        private final int value;

        private static final /* synthetic */ ChartType[] $values() {
            return new ChartType[]{CHART_TYPE_UNSPECIFIED, EQUITY, CRYPTO, OPTIONS, HISTORICAL_PORTFOLIO, ADVISORY_INSIGHT, FUTURES, EVENT_CONTRACT};
        }

        @JvmStatic
        public static final ChartType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ChartType> getEntries() {
            return $ENTRIES;
        }

        private ChartType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ChartType chartType = new ChartType("CHART_TYPE_UNSPECIFIED", 0, 0);
            CHART_TYPE_UNSPECIFIED = chartType;
            EQUITY = new ChartType("EQUITY", 1, 1);
            CRYPTO = new ChartType("CRYPTO", 2, 2);
            OPTIONS = new ChartType("OPTIONS", 3, 3);
            HISTORICAL_PORTFOLIO = new ChartType("HISTORICAL_PORTFOLIO", 4, 4);
            ADVISORY_INSIGHT = new ChartType("ADVISORY_INSIGHT", 5, 5);
            FUTURES = new ChartType("FUTURES", 6, 6);
            EVENT_CONTRACT = new ChartType("EVENT_CONTRACT", 7, 7);
            ChartType[] chartTypeArr$values = $values();
            $VALUES = chartTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(chartTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ChartType>(orCreateKotlinClass, syntax, chartType) { // from class: com.robinhood.rosetta.eventlogging.PerformanceChartContext$ChartType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerformanceChartContext.ChartType fromValue(int value) {
                    return PerformanceChartContext.ChartType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerformanceChartContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerformanceChartContext$ChartType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ChartType fromValue(int value) {
                switch (value) {
                    case 0:
                        return ChartType.CHART_TYPE_UNSPECIFIED;
                    case 1:
                        return ChartType.EQUITY;
                    case 2:
                        return ChartType.CRYPTO;
                    case 3:
                        return ChartType.OPTIONS;
                    case 4:
                        return ChartType.HISTORICAL_PORTFOLIO;
                    case 5:
                        return ChartType.ADVISORY_INSIGHT;
                    case 6:
                        return ChartType.FUTURES;
                    case 7:
                        return ChartType.EVENT_CONTRACT;
                    default:
                        return null;
                }
            }
        }

        public static ChartType valueOf(String str) {
            return (ChartType) Enum.valueOf(ChartType.class, str);
        }

        public static ChartType[] values() {
            return (ChartType[]) $VALUES.clone();
        }
    }
}
