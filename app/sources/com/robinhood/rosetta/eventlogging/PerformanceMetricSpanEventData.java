package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData;
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

/* compiled from: PerformanceMetricSpanEventData.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JD\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData;", "Lcom/squareup/wire/Message;", "", "metric_id", "", "name", "duration", "", "status", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "context", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;Lokio/ByteString;)V", "getMetric_id", "()Ljava/lang/String;", "getName", "getDuration", "()D", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Status", "Context", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PerformanceMetricSpanEventData extends Message {

    @JvmField
    public static final ProtoAdapter<PerformanceMetricSpanEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData$Context#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Context context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "metricId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String metric_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData$Status#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Status status;

    public PerformanceMetricSpanEventData() {
        this(null, null, 0.0d, null, null, null, 63, null);
    }

    public /* synthetic */ PerformanceMetricSpanEventData(String str, String str2, double d, Status status, Context context, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED : status, (i & 16) != 0 ? null : context, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24484newBuilder();
    }

    public final String getMetric_id() {
        return this.metric_id;
    }

    public final String getName() {
        return this.name;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceMetricSpanEventData(String metric_id, String name, double d, Status status, Context context, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(metric_id, "metric_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.metric_id = metric_id;
        this.name = name;
        this.duration = d;
        this.status = status;
        this.context = context;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24484newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PerformanceMetricSpanEventData)) {
            return false;
        }
        PerformanceMetricSpanEventData performanceMetricSpanEventData = (PerformanceMetricSpanEventData) other;
        return Intrinsics.areEqual(unknownFields(), performanceMetricSpanEventData.unknownFields()) && Intrinsics.areEqual(this.metric_id, performanceMetricSpanEventData.metric_id) && Intrinsics.areEqual(this.name, performanceMetricSpanEventData.name) && this.duration == performanceMetricSpanEventData.duration && this.status == performanceMetricSpanEventData.status && Intrinsics.areEqual(this.context, performanceMetricSpanEventData.context);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.metric_id.hashCode()) * 37) + this.name.hashCode()) * 37) + Double.hashCode(this.duration)) * 37) + this.status.hashCode()) * 37;
        Context context = this.context;
        int iHashCode2 = iHashCode + (context != null ? context.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("metric_id=" + Internal.sanitize(this.metric_id));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("duration=" + this.duration);
        arrayList.add("status=" + this.status);
        Context context = this.context;
        if (context != null) {
            arrayList.add("context=" + context);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerformanceMetricSpanEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PerformanceMetricSpanEventData copy$default(PerformanceMetricSpanEventData performanceMetricSpanEventData, String str, String str2, double d, Status status, Context context, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = performanceMetricSpanEventData.metric_id;
        }
        if ((i & 2) != 0) {
            str2 = performanceMetricSpanEventData.name;
        }
        if ((i & 4) != 0) {
            d = performanceMetricSpanEventData.duration;
        }
        if ((i & 8) != 0) {
            status = performanceMetricSpanEventData.status;
        }
        if ((i & 16) != 0) {
            context = performanceMetricSpanEventData.context;
        }
        if ((i & 32) != 0) {
            byteString = performanceMetricSpanEventData.unknownFields();
        }
        ByteString byteString2 = byteString;
        Status status2 = status;
        double d2 = d;
        return performanceMetricSpanEventData.copy(str, str2, d2, status2, context, byteString2);
    }

    public final PerformanceMetricSpanEventData copy(String metric_id, String name, double duration, Status status, Context context, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(metric_id, "metric_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PerformanceMetricSpanEventData(metric_id, name, duration, status, context, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerformanceMetricSpanEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PerformanceMetricSpanEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PerformanceMetricSpanEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getMetric_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMetric_id());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                }
                if (!Double.valueOf(value.getDuration()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getDuration()));
                }
                if (value.getStatus() != PerformanceMetricSpanEventData.Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED) {
                    size += PerformanceMetricSpanEventData.Status.ADAPTER.encodedSizeWithTag(4, value.getStatus());
                }
                return value.getContext() != null ? size + PerformanceMetricSpanEventData.Context.ADAPTER.encodedSizeWithTag(5, value.getContext()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PerformanceMetricSpanEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getMetric_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMetric_id());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (!Double.valueOf(value.getDuration()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getDuration()));
                }
                if (value.getStatus() != PerformanceMetricSpanEventData.Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED) {
                    PerformanceMetricSpanEventData.Status.ADAPTER.encodeWithTag(writer, 4, (int) value.getStatus());
                }
                if (value.getContext() != null) {
                    PerformanceMetricSpanEventData.Context.ADAPTER.encodeWithTag(writer, 5, (int) value.getContext());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PerformanceMetricSpanEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getContext() != null) {
                    PerformanceMetricSpanEventData.Context.ADAPTER.encodeWithTag(writer, 5, (int) value.getContext());
                }
                if (value.getStatus() != PerformanceMetricSpanEventData.Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED) {
                    PerformanceMetricSpanEventData.Status.ADAPTER.encodeWithTag(writer, 4, (int) value.getStatus());
                }
                if (!Double.valueOf(value.getDuration()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getDuration()));
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (Intrinsics.areEqual(value.getMetric_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMetric_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PerformanceMetricSpanEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PerformanceMetricSpanEventData.Status statusDecode = PerformanceMetricSpanEventData.Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                PerformanceMetricSpanEventData.Context contextDecode = null;
                double dDoubleValue = 0.0d;
                String strDecode = "";
                String strDecode2 = strDecode;
                while (true) {
                    PerformanceMetricSpanEventData.Status status = statusDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PerformanceMetricSpanEventData(strDecode, strDecode2, dDoubleValue, status, contextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 4) {
                            try {
                                statusDecode = PerformanceMetricSpanEventData.Status.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 5) {
                            contextDecode = PerformanceMetricSpanEventData.Context.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PerformanceMetricSpanEventData redact(PerformanceMetricSpanEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PerformanceMetricSpanEventData.Context context = value.getContext();
                return PerformanceMetricSpanEventData.copy$default(value, null, null, 0.0d, null, context != null ? PerformanceMetricSpanEventData.Context.ADAPTER.redact(context) : null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceMetricSpanEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED", "COMPLETED", "FAILED", "ABORTED", "SKIPPED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Status implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status ABORTED;

        @JvmField
        public static final ProtoAdapter<Status> ADAPTER;
        public static final Status COMPLETED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Status FAILED;
        public static final Status PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED;
        public static final Status SKIPPED;
        private final int value;

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED, COMPLETED, FAILED, ABORTED, SKIPPED};
        }

        @JvmStatic
        public static final Status fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Status status = new Status("PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED", 0, 0);
            PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED = status;
            COMPLETED = new Status("COMPLETED", 1, 1);
            FAILED = new Status("FAILED", 2, 2);
            ABORTED = new Status("ABORTED", 3, 3);
            SKIPPED = new Status("SKIPPED", 4, 4);
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Status.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Status>(orCreateKotlinClass, syntax, status) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData$Status$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerformanceMetricSpanEventData.Status fromValue(int value) {
                    return PerformanceMetricSpanEventData.Status.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerformanceMetricSpanEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Status fromValue(int value) {
                if (value == 0) {
                    return Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return Status.COMPLETED;
                }
                if (value == 2) {
                    return Status.FAILED;
                }
                if (value == 3) {
                    return Status.ABORTED;
                }
                if (value != 4) {
                    return null;
                }
                return Status.SKIPPED;
            }
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* compiled from: PerformanceMetricSpanEventData.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\u0002H\u0017J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "Lcom/squareup/wire/Message;", "", "is_fresh", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLokio/ByteString;)V", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Context extends Message {

        @JvmField
        public static final ProtoAdapter<Context> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isFresh", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final boolean is_fresh;

        /* JADX WARN: Multi-variable type inference failed */
        public Context() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24485newBuilder();
        }

        /* renamed from: is_fresh, reason: from getter */
        public final boolean getIs_fresh() {
            return this.is_fresh;
        }

        public /* synthetic */ Context(boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Context(boolean z, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.is_fresh = z;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24485newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Context)) {
                return false;
            }
            Context context = (Context) other;
            return Intrinsics.areEqual(unknownFields(), context.unknownFields()) && this.is_fresh == context.is_fresh;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + java.lang.Boolean.hashCode(this.is_fresh);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("is_fresh=" + this.is_fresh);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Context{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Context copy$default(Context context, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                z = context.is_fresh;
            }
            if ((i & 2) != 0) {
                byteString = context.unknownFields();
            }
            return context.copy(z, byteString);
        }

        public final Context copy(boolean is_fresh, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Context(is_fresh, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Context.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Context>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData$Context$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PerformanceMetricSpanEventData.Context value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getIs_fresh() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(1, java.lang.Boolean.valueOf(value.getIs_fresh())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PerformanceMetricSpanEventData.Context value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getIs_fresh()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getIs_fresh()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PerformanceMetricSpanEventData.Context value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getIs_fresh()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getIs_fresh()));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PerformanceMetricSpanEventData.Context redact(PerformanceMetricSpanEventData.Context value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return PerformanceMetricSpanEventData.Context.copy$default(value, false, ByteString.EMPTY, 1, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public PerformanceMetricSpanEventData.Context decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    boolean zBooleanValue = false;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PerformanceMetricSpanEventData.Context(zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
