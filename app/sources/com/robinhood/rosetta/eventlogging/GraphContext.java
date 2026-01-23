package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.rosetta.eventlogging.GraphContext;
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

/* compiled from: GraphContext.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContext;", "Lcom/squareup/wire/Message;", "", "graph_type", "Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType;", "interval", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType;Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;Lokio/ByteString;)V", "getGraph_type", "()Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType;", "getInterval", "()Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "GraphType", "Interval", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class GraphContext extends Message {

    @JvmField
    public static final ProtoAdapter<GraphContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.GraphContext$GraphType#ADAPTER", jsonName = "graphType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final GraphType graph_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.GraphContext$Interval#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Interval interval;

    public GraphContext() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24294newBuilder();
    }

    public final GraphType getGraph_type() {
        return this.graph_type;
    }

    public /* synthetic */ GraphContext(GraphType graphType, Interval interval, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GraphType.LINE : graphType, (i & 2) != 0 ? Interval.HOUR : interval, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Interval getInterval() {
        return this.interval;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphContext(GraphType graph_type, Interval interval, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(graph_type, "graph_type");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.graph_type = graph_type;
        this.interval = interval;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24294newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GraphContext)) {
            return false;
        }
        GraphContext graphContext = (GraphContext) other;
        return Intrinsics.areEqual(unknownFields(), graphContext.unknownFields()) && this.graph_type == graphContext.graph_type && this.interval == graphContext.interval;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.graph_type.hashCode()) * 37) + this.interval.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("graph_type=" + this.graph_type);
        arrayList.add("interval=" + this.interval);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GraphContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GraphContext copy$default(GraphContext graphContext, GraphType graphType, Interval interval, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            graphType = graphContext.graph_type;
        }
        if ((i & 2) != 0) {
            interval = graphContext.interval;
        }
        if ((i & 4) != 0) {
            byteString = graphContext.unknownFields();
        }
        return graphContext.copy(graphType, interval, byteString);
    }

    public final GraphContext copy(GraphType graph_type, Interval interval, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(graph_type, "graph_type");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GraphContext(graph_type, interval, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GraphContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GraphContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.GraphContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GraphContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getGraph_type() != GraphContext.GraphType.LINE) {
                    size += GraphContext.GraphType.ADAPTER.encodedSizeWithTag(1, value.getGraph_type());
                }
                return value.getInterval() != GraphContext.Interval.HOUR ? size + GraphContext.Interval.ADAPTER.encodedSizeWithTag(2, value.getInterval()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GraphContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getGraph_type() != GraphContext.GraphType.LINE) {
                    GraphContext.GraphType.ADAPTER.encodeWithTag(writer, 1, (int) value.getGraph_type());
                }
                if (value.getInterval() != GraphContext.Interval.HOUR) {
                    GraphContext.Interval.ADAPTER.encodeWithTag(writer, 2, (int) value.getInterval());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GraphContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInterval() != GraphContext.Interval.HOUR) {
                    GraphContext.Interval.ADAPTER.encodeWithTag(writer, 2, (int) value.getInterval());
                }
                if (value.getGraph_type() != GraphContext.GraphType.LINE) {
                    GraphContext.GraphType.ADAPTER.encodeWithTag(writer, 1, (int) value.getGraph_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GraphContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                GraphContext.GraphType graphTypeDecode = GraphContext.GraphType.LINE;
                GraphContext.Interval intervalDecode = GraphContext.Interval.HOUR;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GraphContext(graphTypeDecode, intervalDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            graphTypeDecode = GraphContext.GraphType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            intervalDecode = GraphContext.Interval.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GraphContext redact(GraphContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GraphContext.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GraphContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LINE", "CANDLESTICK", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GraphType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GraphType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<GraphType> ADAPTER;
        public static final GraphType CANDLESTICK;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final GraphType LINE;
        private final int value;

        private static final /* synthetic */ GraphType[] $values() {
            return new GraphType[]{LINE, CANDLESTICK};
        }

        @JvmStatic
        public static final GraphType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<GraphType> getEntries() {
            return $ENTRIES;
        }

        private GraphType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final GraphType graphType = new GraphType("LINE", 0, 0);
            LINE = graphType;
            CANDLESTICK = new GraphType("CANDLESTICK", 1, 1);
            GraphType[] graphTypeArr$values = $values();
            $VALUES = graphTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(graphTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GraphType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<GraphType>(orCreateKotlinClass, syntax, graphType) { // from class: com.robinhood.rosetta.eventlogging.GraphContext$GraphType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public GraphContext.GraphType fromValue(int value) {
                    return GraphContext.GraphType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: GraphContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/GraphContext$GraphType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final GraphType fromValue(int value) {
                if (value == 0) {
                    return GraphType.LINE;
                }
                if (value != 1) {
                    return null;
                }
                return GraphType.CANDLESTICK;
            }
        }

        public static GraphType valueOf(String str) {
            return (GraphType) Enum.valueOf(GraphType.class, str);
        }

        public static GraphType[] values() {
            return (GraphType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GraphContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "HOUR", "DAY", "WEEK", "MONTH", "THREE_MONTHS", "YEAR", "FIVE_YEARS", DisplaySpans.ALL, "YEAR_TO_DATE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Interval implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Interval[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Interval> ADAPTER;
        public static final Interval ALL;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Interval DAY;
        public static final Interval FIVE_YEARS;
        public static final Interval HOUR;
        public static final Interval MONTH;
        public static final Interval THREE_MONTHS;
        public static final Interval WEEK;
        public static final Interval YEAR;
        public static final Interval YEAR_TO_DATE;
        private final int value;

        private static final /* synthetic */ Interval[] $values() {
            return new Interval[]{HOUR, DAY, WEEK, MONTH, THREE_MONTHS, YEAR, FIVE_YEARS, ALL, YEAR_TO_DATE};
        }

        @JvmStatic
        public static final Interval fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Interval> getEntries() {
            return $ENTRIES;
        }

        private Interval(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Interval interval = new Interval("HOUR", 0, 0);
            HOUR = interval;
            DAY = new Interval("DAY", 1, 1);
            WEEK = new Interval("WEEK", 2, 3);
            MONTH = new Interval("MONTH", 3, 4);
            THREE_MONTHS = new Interval("THREE_MONTHS", 4, 5);
            YEAR = new Interval("YEAR", 5, 6);
            FIVE_YEARS = new Interval("FIVE_YEARS", 6, 7);
            ALL = new Interval(DisplaySpans.ALL, 7, 8);
            YEAR_TO_DATE = new Interval("YEAR_TO_DATE", 8, 9);
            Interval[] intervalArr$values = $values();
            $VALUES = intervalArr$values;
            $ENTRIES = EnumEntries2.enumEntries(intervalArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Interval.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Interval>(orCreateKotlinClass, syntax, interval) { // from class: com.robinhood.rosetta.eventlogging.GraphContext$Interval$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public GraphContext.Interval fromValue(int value) {
                    return GraphContext.Interval.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: GraphContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/GraphContext$Interval;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Interval fromValue(int value) {
                switch (value) {
                    case 0:
                        return Interval.HOUR;
                    case 1:
                        return Interval.DAY;
                    case 2:
                    default:
                        return null;
                    case 3:
                        return Interval.WEEK;
                    case 4:
                        return Interval.MONTH;
                    case 5:
                        return Interval.THREE_MONTHS;
                    case 6:
                        return Interval.YEAR;
                    case 7:
                        return Interval.FIVE_YEARS;
                    case 8:
                        return Interval.ALL;
                    case 9:
                        return Interval.YEAR_TO_DATE;
                }
            }
        }

        public static Interval valueOf(String str) {
            return (Interval) Enum.valueOf(Interval.class, str);
        }

        public static Interval[] values() {
            return (Interval[]) $VALUES.clone();
        }
    }
}
