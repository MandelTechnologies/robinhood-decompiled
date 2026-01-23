package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.rosetta.eventlogging.AdvancedChartsContext;
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

/* compiled from: AdvancedChartsContext.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 !\"B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext;", "Lcom/squareup/wire/Message;", "", "span_selected", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "chart_type", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$ChartType;", "extended_hours_enabled", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "technical_indicators", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$ChartType;Lcom/robinhood/rosetta/eventlogging/Boolean;Ljava/lang/String;Lokio/ByteString;)V", "getSpan_selected", "()Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "getChart_type", "()Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$ChartType;", "getExtended_hours_enabled", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getTechnical_indicators", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Span", "ChartType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class AdvancedChartsContext extends Message {

    @JvmField
    public static final ProtoAdapter<AdvancedChartsContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AdvancedChartsContext$ChartType#ADAPTER", jsonName = "chartType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ChartType chart_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "extendedHoursEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Boolean extended_hours_enabled;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AdvancedChartsContext$Span#ADAPTER", jsonName = "spanSelected", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Span span_selected;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "technicalIndicators", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String technical_indicators;

    public AdvancedChartsContext() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23999newBuilder();
    }

    public final Span getSpan_selected() {
        return this.span_selected;
    }

    public /* synthetic */ AdvancedChartsContext(Span span, ChartType chartType, Boolean r3, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Span.ONE_DAY : span, (i & 2) != 0 ? ChartType.LINE : chartType, (i & 4) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ChartType getChart_type() {
        return this.chart_type;
    }

    public final Boolean getExtended_hours_enabled() {
        return this.extended_hours_enabled;
    }

    public final String getTechnical_indicators() {
        return this.technical_indicators;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedChartsContext(Span span_selected, ChartType chart_type, Boolean extended_hours_enabled, String technical_indicators, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(span_selected, "span_selected");
        Intrinsics.checkNotNullParameter(chart_type, "chart_type");
        Intrinsics.checkNotNullParameter(extended_hours_enabled, "extended_hours_enabled");
        Intrinsics.checkNotNullParameter(technical_indicators, "technical_indicators");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.span_selected = span_selected;
        this.chart_type = chart_type;
        this.extended_hours_enabled = extended_hours_enabled;
        this.technical_indicators = technical_indicators;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23999newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvancedChartsContext)) {
            return false;
        }
        AdvancedChartsContext advancedChartsContext = (AdvancedChartsContext) other;
        return Intrinsics.areEqual(unknownFields(), advancedChartsContext.unknownFields()) && this.span_selected == advancedChartsContext.span_selected && this.chart_type == advancedChartsContext.chart_type && this.extended_hours_enabled == advancedChartsContext.extended_hours_enabled && Intrinsics.areEqual(this.technical_indicators, advancedChartsContext.technical_indicators);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.span_selected.hashCode()) * 37) + this.chart_type.hashCode()) * 37) + this.extended_hours_enabled.hashCode()) * 37) + this.technical_indicators.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("span_selected=" + this.span_selected);
        arrayList.add("chart_type=" + this.chart_type);
        arrayList.add("extended_hours_enabled=" + this.extended_hours_enabled);
        arrayList.add("technical_indicators=" + Internal.sanitize(this.technical_indicators));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvancedChartsContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvancedChartsContext copy$default(AdvancedChartsContext advancedChartsContext, Span span, ChartType chartType, Boolean r3, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            span = advancedChartsContext.span_selected;
        }
        if ((i & 2) != 0) {
            chartType = advancedChartsContext.chart_type;
        }
        if ((i & 4) != 0) {
            r3 = advancedChartsContext.extended_hours_enabled;
        }
        if ((i & 8) != 0) {
            str = advancedChartsContext.technical_indicators;
        }
        if ((i & 16) != 0) {
            byteString = advancedChartsContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        Boolean r5 = r3;
        return advancedChartsContext.copy(span, chartType, r5, str, byteString2);
    }

    public final AdvancedChartsContext copy(Span span_selected, ChartType chart_type, Boolean extended_hours_enabled, String technical_indicators, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(span_selected, "span_selected");
        Intrinsics.checkNotNullParameter(chart_type, "chart_type");
        Intrinsics.checkNotNullParameter(extended_hours_enabled, "extended_hours_enabled");
        Intrinsics.checkNotNullParameter(technical_indicators, "technical_indicators");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvancedChartsContext(span_selected, chart_type, extended_hours_enabled, technical_indicators, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvancedChartsContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvancedChartsContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.AdvancedChartsContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvancedChartsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSpan_selected() != AdvancedChartsContext.Span.ONE_DAY) {
                    size += AdvancedChartsContext.Span.ADAPTER.encodedSizeWithTag(1, value.getSpan_selected());
                }
                if (value.getChart_type() != AdvancedChartsContext.ChartType.LINE) {
                    size += AdvancedChartsContext.ChartType.ADAPTER.encodedSizeWithTag(2, value.getChart_type());
                }
                if (value.getExtended_hours_enabled() != Boolean.BOOLEAN_UNSPECIFIED) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(3, value.getExtended_hours_enabled());
                }
                return !Intrinsics.areEqual(value.getTechnical_indicators(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTechnical_indicators()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvancedChartsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSpan_selected() != AdvancedChartsContext.Span.ONE_DAY) {
                    AdvancedChartsContext.Span.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpan_selected());
                }
                if (value.getChart_type() != AdvancedChartsContext.ChartType.LINE) {
                    AdvancedChartsContext.ChartType.ADAPTER.encodeWithTag(writer, 2, (int) value.getChart_type());
                }
                if (value.getExtended_hours_enabled() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getExtended_hours_enabled());
                }
                if (!Intrinsics.areEqual(value.getTechnical_indicators(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTechnical_indicators());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvancedChartsContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTechnical_indicators(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTechnical_indicators());
                }
                if (value.getExtended_hours_enabled() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getExtended_hours_enabled());
                }
                if (value.getChart_type() != AdvancedChartsContext.ChartType.LINE) {
                    AdvancedChartsContext.ChartType.ADAPTER.encodeWithTag(writer, 2, (int) value.getChart_type());
                }
                if (value.getSpan_selected() != AdvancedChartsContext.Span.ONE_DAY) {
                    AdvancedChartsContext.Span.ADAPTER.encodeWithTag(writer, 1, (int) value.getSpan_selected());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvancedChartsContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AdvancedChartsContext.Span spanDecode = AdvancedChartsContext.Span.ONE_DAY;
                AdvancedChartsContext.ChartType chartType = AdvancedChartsContext.ChartType.LINE;
                Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Boolean booleanDecode = r2;
                AdvancedChartsContext.ChartType chartTypeDecode = chartType;
                while (true) {
                    AdvancedChartsContext.Span span = spanDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new AdvancedChartsContext(span, chartTypeDecode, booleanDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                spanDecode = AdvancedChartsContext.Span.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                chartTypeDecode = AdvancedChartsContext.ChartType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                booleanDecode = Boolean.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvancedChartsContext redact(AdvancedChartsContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AdvancedChartsContext.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvancedChartsContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ONE_DAY", "ONE_WEEK", "ONE_MONTH", "THREE_MONTHS", "ONE_YEAR", "FIVE_YEAR", "ONE_HOUR", "FOUR_HOUR", "YEAR_TO_DATE", DisplaySpans.ALL, "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Span implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Span[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Span> ADAPTER;
        public static final Span ALL;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Span FIVE_YEAR;
        public static final Span FOUR_HOUR;
        public static final Span ONE_DAY;
        public static final Span ONE_HOUR;
        public static final Span ONE_MONTH;
        public static final Span ONE_WEEK;
        public static final Span ONE_YEAR;
        public static final Span THREE_MONTHS;
        public static final Span YEAR_TO_DATE;
        private final int value;

        private static final /* synthetic */ Span[] $values() {
            return new Span[]{ONE_DAY, ONE_WEEK, ONE_MONTH, THREE_MONTHS, ONE_YEAR, FIVE_YEAR, ONE_HOUR, FOUR_HOUR, YEAR_TO_DATE, ALL};
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
            final Span span = new Span("ONE_DAY", 0, 0);
            ONE_DAY = span;
            ONE_WEEK = new Span("ONE_WEEK", 1, 1);
            ONE_MONTH = new Span("ONE_MONTH", 2, 2);
            THREE_MONTHS = new Span("THREE_MONTHS", 3, 3);
            ONE_YEAR = new Span("ONE_YEAR", 4, 4);
            FIVE_YEAR = new Span("FIVE_YEAR", 5, 5);
            ONE_HOUR = new Span("ONE_HOUR", 6, 6);
            FOUR_HOUR = new Span("FOUR_HOUR", 7, 7);
            YEAR_TO_DATE = new Span("YEAR_TO_DATE", 8, 8);
            ALL = new Span(DisplaySpans.ALL, 9, 9);
            Span[] spanArr$values = $values();
            $VALUES = spanArr$values;
            $ENTRIES = EnumEntries2.enumEntries(spanArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Span.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Span>(orCreateKotlinClass, syntax, span) { // from class: com.robinhood.rosetta.eventlogging.AdvancedChartsContext$Span$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public AdvancedChartsContext.Span fromValue(int value) {
                    return AdvancedChartsContext.Span.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: AdvancedChartsContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$Span;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                        return Span.ONE_DAY;
                    case 1:
                        return Span.ONE_WEEK;
                    case 2:
                        return Span.ONE_MONTH;
                    case 3:
                        return Span.THREE_MONTHS;
                    case 4:
                        return Span.ONE_YEAR;
                    case 5:
                        return Span.FIVE_YEAR;
                    case 6:
                        return Span.ONE_HOUR;
                    case 7:
                        return Span.FOUR_HOUR;
                    case 8:
                        return Span.YEAR_TO_DATE;
                    case 9:
                        return Span.ALL;
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
    /* compiled from: AdvancedChartsContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$ChartType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LINE", "CANDLESTICK", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChartType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChartType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ChartType> ADAPTER;
        public static final ChartType CANDLESTICK;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ChartType LINE;
        private final int value;

        private static final /* synthetic */ ChartType[] $values() {
            return new ChartType[]{LINE, CANDLESTICK};
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
            final ChartType chartType = new ChartType("LINE", 0, 0);
            LINE = chartType;
            CANDLESTICK = new ChartType("CANDLESTICK", 1, 1);
            ChartType[] chartTypeArr$values = $values();
            $VALUES = chartTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(chartTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ChartType>(orCreateKotlinClass, syntax, chartType) { // from class: com.robinhood.rosetta.eventlogging.AdvancedChartsContext$ChartType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public AdvancedChartsContext.ChartType fromValue(int value) {
                    return AdvancedChartsContext.ChartType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: AdvancedChartsContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$ChartType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsContext$ChartType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ChartType fromValue(int value) {
                if (value == 0) {
                    return ChartType.LINE;
                }
                if (value != 1) {
                    return null;
                }
                return ChartType.CANDLESTICK;
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
