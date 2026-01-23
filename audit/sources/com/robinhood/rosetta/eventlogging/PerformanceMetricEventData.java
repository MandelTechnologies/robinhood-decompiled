package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
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
import rosetta.option.OptionType;
import rosetta.option.StrategyName;
import rosetta.order.Side;

/* compiled from: PerformanceMetricEventData.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005()*+,BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016JN\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData;", "Lcom/squareup/wire/Message;", "", "id", "", "name", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "duration", "", "context", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "status", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "source", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;DLcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getName", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "getDuration", "()D", "getContext", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "getSource", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Name", "Status", "Context", "Source", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PerformanceMetricEventData extends Message {

    @JvmField
    public static final ProtoAdapter<PerformanceMetricEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Context context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Name#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Name name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Source#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Source source;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Status#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Status status;

    public PerformanceMetricEventData() {
        this(null, null, 0.0d, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24473newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ PerformanceMetricEventData(String str, Name name, double d, Context context, Status status, Source source, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Name.LOCAL_AUTH : name, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? null : context, (i & 16) != 0 ? Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED : status, (i & 32) != 0 ? Source.SOURCE_UNSPECIFIED : source, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Name getName() {
        return this.name;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Source getSource() {
        return this.source;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceMetricEventData(String id, Name name, double d, Context context, Status status, Source source, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.name = name;
        this.duration = d;
        this.context = context;
        this.status = status;
        this.source = source;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24473newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PerformanceMetricEventData)) {
            return false;
        }
        PerformanceMetricEventData performanceMetricEventData = (PerformanceMetricEventData) other;
        return Intrinsics.areEqual(unknownFields(), performanceMetricEventData.unknownFields()) && Intrinsics.areEqual(this.id, performanceMetricEventData.id) && this.name == performanceMetricEventData.name && this.duration == performanceMetricEventData.duration && Intrinsics.areEqual(this.context, performanceMetricEventData.context) && this.status == performanceMetricEventData.status && this.source == performanceMetricEventData.source;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.name.hashCode()) * 37) + Double.hashCode(this.duration)) * 37;
        Context context = this.context;
        int iHashCode2 = ((((iHashCode + (context != null ? context.hashCode() : 0)) * 37) + this.status.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("name=" + this.name);
        arrayList.add("duration=" + this.duration);
        Context context = this.context;
        if (context != null) {
            arrayList.add("context=" + context);
        }
        arrayList.add("status=" + this.status);
        arrayList.add("source=" + this.source);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerformanceMetricEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PerformanceMetricEventData copy$default(PerformanceMetricEventData performanceMetricEventData, String str, Name name, double d, Context context, Status status, Source source, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = performanceMetricEventData.id;
        }
        if ((i & 2) != 0) {
            name = performanceMetricEventData.name;
        }
        if ((i & 4) != 0) {
            d = performanceMetricEventData.duration;
        }
        if ((i & 8) != 0) {
            context = performanceMetricEventData.context;
        }
        if ((i & 16) != 0) {
            status = performanceMetricEventData.status;
        }
        if ((i & 32) != 0) {
            source = performanceMetricEventData.source;
        }
        if ((i & 64) != 0) {
            byteString = performanceMetricEventData.unknownFields();
        }
        double d2 = d;
        return performanceMetricEventData.copy(str, name, d2, context, status, source, byteString);
    }

    public final PerformanceMetricEventData copy(String id, Name name, double duration, Context context, Status status, Source source, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PerformanceMetricEventData(id, name, duration, context, status, source, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerformanceMetricEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PerformanceMetricEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PerformanceMetricEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getName() != PerformanceMetricEventData.Name.LOCAL_AUTH) {
                    size += PerformanceMetricEventData.Name.ADAPTER.encodedSizeWithTag(2, value.getName());
                }
                if (!Double.valueOf(value.getDuration()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getDuration()));
                }
                if (value.getContext() != null) {
                    size += PerformanceMetricEventData.Context.ADAPTER.encodedSizeWithTag(4, value.getContext());
                }
                if (value.getStatus() != PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED) {
                    size += PerformanceMetricEventData.Status.ADAPTER.encodedSizeWithTag(5, value.getStatus());
                }
                return value.getSource() != PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED ? size + PerformanceMetricEventData.Source.ADAPTER.encodedSizeWithTag(6, value.getSource()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PerformanceMetricEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getName() != PerformanceMetricEventData.Name.LOCAL_AUTH) {
                    PerformanceMetricEventData.Name.ADAPTER.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (!Double.valueOf(value.getDuration()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getDuration()));
                }
                if (value.getContext() != null) {
                    PerformanceMetricEventData.Context.ADAPTER.encodeWithTag(writer, 4, (int) value.getContext());
                }
                if (value.getStatus() != PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED) {
                    PerformanceMetricEventData.Status.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
                }
                if (value.getSource() != PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED) {
                    PerformanceMetricEventData.Source.ADAPTER.encodeWithTag(writer, 6, (int) value.getSource());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PerformanceMetricEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSource() != PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED) {
                    PerformanceMetricEventData.Source.ADAPTER.encodeWithTag(writer, 6, (int) value.getSource());
                }
                if (value.getStatus() != PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED) {
                    PerformanceMetricEventData.Status.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
                }
                if (value.getContext() != null) {
                    PerformanceMetricEventData.Context.ADAPTER.encodeWithTag(writer, 4, (int) value.getContext());
                }
                if (!Double.valueOf(value.getDuration()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getDuration()));
                }
                if (value.getName() != PerformanceMetricEventData.Name.LOCAL_AUTH) {
                    PerformanceMetricEventData.Name.ADAPTER.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PerformanceMetricEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PerformanceMetricEventData.Name nameDecode = PerformanceMetricEventData.Name.LOCAL_AUTH;
                PerformanceMetricEventData.Status status = PerformanceMetricEventData.Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
                PerformanceMetricEventData.Source source = PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                PerformanceMetricEventData.Context contextDecode = null;
                double dDoubleValue = 0.0d;
                String strDecode = "";
                PerformanceMetricEventData.Source sourceDecode = source;
                PerformanceMetricEventData.Status statusDecode = status;
                while (true) {
                    PerformanceMetricEventData.Name name = nameDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        nameDecode = PerformanceMetricEventData.Name.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 4:
                                    contextDecode = PerformanceMetricEventData.Context.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    try {
                                        statusDecode = PerformanceMetricEventData.Status.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 6:
                                    try {
                                        sourceDecode = PerformanceMetricEventData.Source.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new PerformanceMetricEventData(strDecode, name, dDoubleValue, contextDecode, statusDecode, sourceDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PerformanceMetricEventData redact(PerformanceMetricEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PerformanceMetricEventData.Context context = value.getContext();
                return PerformanceMetricEventData.copy$default(value, null, null, 0.0d, context != null ? PerformanceMetricEventData.Context.ADAPTER.redact(context) : null, null, null, ByteString.EMPTY, 55, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b6\b\u0086\u0081\u0002\u0018\u0000 92\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u00019B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOCAL_AUTH", "HOME", "STOCK_DETAIL", "OPTIONS_CHAIN", "OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE", "OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE", "OPTIONS_CHAIN_DIFFERENT_SIDE", "OPTIONS_CHAIN_SELECT_CONTRACT", "OPTIONS_ORDER_REVIEW", "LOCAL_AUTHENTICATION", "BROWSE_NEWSFEED", "OPTIONS_ORDER_SUBMIT", "OPTION_PROFIT_AND_LOSS_CHART", "OPTION_SHOPPING_CART", "OPTION_ORDER", "MESSAGE", "MESSAGE_THREAD", "OPTIONS_WATCHLIST_HUB", "OPTIONS_WATCHLIST_HUB_SORT", "OPTIONS_STRATEGY_CHAIN", "OPTIONS_STRATEGY_CHAIN_NEAR_FILTER", "OPTIONS_STRATEGY_CHAIN_FAR_FILTER", "OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER", "OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER", "OPTIONS_SIMULATED_RETURNS", "APP_LAUNCH", "HOME_SETUP_POST_LAUNCH", "HOME_INSTRUMENT_ROW_TRADE_BAR", "TRADE_BUTTON_EXPANSION", "TRADE_OPTIONS_STRATEGY_BUILDER", "OPTIONS_CONTRACT_DATE_CONTRACTS", "OPTIONS_CONTRACT_BUY_BUTTON", "BUY_OPTION_TRADE_DETAILS", "REVIEW_OPTION_SWIPE_TO_SUBMIT", "SWIPE_TO_SUBMIT_OPTION_CONFIRMATION", "ACTION_COMPLETION", "SCREEN_LOAD", "STREAM_LOAD", "COMPONENT_LOAD", "BUY_EQUITY_TRADE_FLOW", "REVIEW_EQUITY_SWIPE_TO_SUBMIT", "SWIPE_TO_SUBMIT_EQUITY_CONFIRM", "TRANSFER_DEEPLINK_HANDLER", "MICROGRAM_LOAD", "GOLD_LEGACY_FLOW", "GOLD_UNIFIED_FLOW", "OPTIONS_SIDE_BY_SIDE_CHAIN", "MOBILE_ADVANCED_CHARTS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Name implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;
        public static final Name ACTION_COMPLETION;

        @JvmField
        public static final ProtoAdapter<Name> ADAPTER;
        public static final Name APP_LAUNCH;
        public static final Name BROWSE_NEWSFEED;
        public static final Name BUY_EQUITY_TRADE_FLOW;
        public static final Name BUY_OPTION_TRADE_DETAILS;
        public static final Name COMPONENT_LOAD;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Name GOLD_LEGACY_FLOW;
        public static final Name GOLD_UNIFIED_FLOW;
        public static final Name HOME;
        public static final Name HOME_INSTRUMENT_ROW_TRADE_BAR;
        public static final Name HOME_SETUP_POST_LAUNCH;
        public static final Name LOCAL_AUTH;
        public static final Name LOCAL_AUTHENTICATION;
        public static final Name MESSAGE;
        public static final Name MESSAGE_THREAD;
        public static final Name MICROGRAM_LOAD;
        public static final Name MOBILE_ADVANCED_CHARTS;
        public static final Name OPTIONS_CHAIN;
        public static final Name OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE;
        public static final Name OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE;
        public static final Name OPTIONS_CHAIN_DIFFERENT_SIDE;
        public static final Name OPTIONS_CHAIN_SELECT_CONTRACT;
        public static final Name OPTIONS_CONTRACT_BUY_BUTTON;
        public static final Name OPTIONS_CONTRACT_DATE_CONTRACTS;
        public static final Name OPTIONS_ORDER_REVIEW;
        public static final Name OPTIONS_ORDER_SUBMIT;
        public static final Name OPTIONS_SIDE_BY_SIDE_CHAIN;
        public static final Name OPTIONS_SIMULATED_RETURNS;
        public static final Name OPTIONS_STRATEGY_CHAIN;
        public static final Name OPTIONS_STRATEGY_CHAIN_FAR_FILTER;
        public static final Name OPTIONS_STRATEGY_CHAIN_NEAR_FILTER;
        public static final Name OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER;
        public static final Name OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER;
        public static final Name OPTIONS_WATCHLIST_HUB;
        public static final Name OPTIONS_WATCHLIST_HUB_SORT;
        public static final Name OPTION_ORDER;
        public static final Name OPTION_PROFIT_AND_LOSS_CHART;
        public static final Name OPTION_SHOPPING_CART;
        public static final Name REVIEW_EQUITY_SWIPE_TO_SUBMIT;
        public static final Name REVIEW_OPTION_SWIPE_TO_SUBMIT;
        public static final Name SCREEN_LOAD;
        public static final Name STOCK_DETAIL;
        public static final Name STREAM_LOAD;
        public static final Name SWIPE_TO_SUBMIT_EQUITY_CONFIRM;
        public static final Name SWIPE_TO_SUBMIT_OPTION_CONFIRMATION;
        public static final Name TRADE_BUTTON_EXPANSION;
        public static final Name TRADE_OPTIONS_STRATEGY_BUILDER;
        public static final Name TRANSFER_DEEPLINK_HANDLER;
        private final int value;

        private static final /* synthetic */ Name[] $values() {
            return new Name[]{LOCAL_AUTH, HOME, STOCK_DETAIL, OPTIONS_CHAIN, OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE, OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE, OPTIONS_CHAIN_DIFFERENT_SIDE, OPTIONS_CHAIN_SELECT_CONTRACT, OPTIONS_ORDER_REVIEW, LOCAL_AUTHENTICATION, BROWSE_NEWSFEED, OPTIONS_ORDER_SUBMIT, OPTION_PROFIT_AND_LOSS_CHART, OPTION_SHOPPING_CART, OPTION_ORDER, MESSAGE, MESSAGE_THREAD, OPTIONS_WATCHLIST_HUB, OPTIONS_WATCHLIST_HUB_SORT, OPTIONS_STRATEGY_CHAIN, OPTIONS_STRATEGY_CHAIN_NEAR_FILTER, OPTIONS_STRATEGY_CHAIN_FAR_FILTER, OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER, OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER, OPTIONS_SIMULATED_RETURNS, APP_LAUNCH, HOME_SETUP_POST_LAUNCH, HOME_INSTRUMENT_ROW_TRADE_BAR, TRADE_BUTTON_EXPANSION, TRADE_OPTIONS_STRATEGY_BUILDER, OPTIONS_CONTRACT_DATE_CONTRACTS, OPTIONS_CONTRACT_BUY_BUTTON, BUY_OPTION_TRADE_DETAILS, REVIEW_OPTION_SWIPE_TO_SUBMIT, SWIPE_TO_SUBMIT_OPTION_CONFIRMATION, ACTION_COMPLETION, SCREEN_LOAD, STREAM_LOAD, COMPONENT_LOAD, BUY_EQUITY_TRADE_FLOW, REVIEW_EQUITY_SWIPE_TO_SUBMIT, SWIPE_TO_SUBMIT_EQUITY_CONFIRM, TRANSFER_DEEPLINK_HANDLER, MICROGRAM_LOAD, GOLD_LEGACY_FLOW, GOLD_UNIFIED_FLOW, OPTIONS_SIDE_BY_SIDE_CHAIN, MOBILE_ADVANCED_CHARTS};
        }

        @JvmStatic
        public static final Name fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Name> getEntries() {
            return $ENTRIES;
        }

        private Name(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Name name = new Name("LOCAL_AUTH", 0, 0);
            LOCAL_AUTH = name;
            HOME = new Name("HOME", 1, 1);
            STOCK_DETAIL = new Name("STOCK_DETAIL", 2, 2);
            OPTIONS_CHAIN = new Name("OPTIONS_CHAIN", 3, 3);
            OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE = new Name("OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE", 4, 4);
            OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE = new Name("OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE", 5, 5);
            OPTIONS_CHAIN_DIFFERENT_SIDE = new Name("OPTIONS_CHAIN_DIFFERENT_SIDE", 6, 6);
            OPTIONS_CHAIN_SELECT_CONTRACT = new Name("OPTIONS_CHAIN_SELECT_CONTRACT", 7, 7);
            OPTIONS_ORDER_REVIEW = new Name("OPTIONS_ORDER_REVIEW", 8, 8);
            LOCAL_AUTHENTICATION = new Name("LOCAL_AUTHENTICATION", 9, 9);
            BROWSE_NEWSFEED = new Name("BROWSE_NEWSFEED", 10, 10);
            OPTIONS_ORDER_SUBMIT = new Name("OPTIONS_ORDER_SUBMIT", 11, 11);
            OPTION_PROFIT_AND_LOSS_CHART = new Name("OPTION_PROFIT_AND_LOSS_CHART", 12, 12);
            OPTION_SHOPPING_CART = new Name("OPTION_SHOPPING_CART", 13, 13);
            OPTION_ORDER = new Name("OPTION_ORDER", 14, 14);
            MESSAGE = new Name("MESSAGE", 15, 15);
            MESSAGE_THREAD = new Name("MESSAGE_THREAD", 16, 16);
            OPTIONS_WATCHLIST_HUB = new Name("OPTIONS_WATCHLIST_HUB", 17, 17);
            OPTIONS_WATCHLIST_HUB_SORT = new Name("OPTIONS_WATCHLIST_HUB_SORT", 18, 18);
            OPTIONS_STRATEGY_CHAIN = new Name("OPTIONS_STRATEGY_CHAIN", 19, 19);
            OPTIONS_STRATEGY_CHAIN_NEAR_FILTER = new Name("OPTIONS_STRATEGY_CHAIN_NEAR_FILTER", 20, 20);
            OPTIONS_STRATEGY_CHAIN_FAR_FILTER = new Name("OPTIONS_STRATEGY_CHAIN_FAR_FILTER", 21, 21);
            OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER = new Name("OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER", 22, 22);
            OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER = new Name("OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER", 23, 23);
            OPTIONS_SIMULATED_RETURNS = new Name("OPTIONS_SIMULATED_RETURNS", 24, 24);
            APP_LAUNCH = new Name("APP_LAUNCH", 25, 25);
            HOME_SETUP_POST_LAUNCH = new Name("HOME_SETUP_POST_LAUNCH", 26, 26);
            HOME_INSTRUMENT_ROW_TRADE_BAR = new Name("HOME_INSTRUMENT_ROW_TRADE_BAR", 27, 27);
            TRADE_BUTTON_EXPANSION = new Name("TRADE_BUTTON_EXPANSION", 28, 28);
            TRADE_OPTIONS_STRATEGY_BUILDER = new Name("TRADE_OPTIONS_STRATEGY_BUILDER", 29, 29);
            OPTIONS_CONTRACT_DATE_CONTRACTS = new Name("OPTIONS_CONTRACT_DATE_CONTRACTS", 30, 30);
            OPTIONS_CONTRACT_BUY_BUTTON = new Name("OPTIONS_CONTRACT_BUY_BUTTON", 31, 31);
            BUY_OPTION_TRADE_DETAILS = new Name("BUY_OPTION_TRADE_DETAILS", 32, 32);
            REVIEW_OPTION_SWIPE_TO_SUBMIT = new Name("REVIEW_OPTION_SWIPE_TO_SUBMIT", 33, 33);
            SWIPE_TO_SUBMIT_OPTION_CONFIRMATION = new Name("SWIPE_TO_SUBMIT_OPTION_CONFIRMATION", 34, 34);
            ACTION_COMPLETION = new Name("ACTION_COMPLETION", 35, 35);
            SCREEN_LOAD = new Name("SCREEN_LOAD", 36, 36);
            STREAM_LOAD = new Name("STREAM_LOAD", 37, 37);
            COMPONENT_LOAD = new Name("COMPONENT_LOAD", 38, 38);
            BUY_EQUITY_TRADE_FLOW = new Name("BUY_EQUITY_TRADE_FLOW", 39, 39);
            REVIEW_EQUITY_SWIPE_TO_SUBMIT = new Name("REVIEW_EQUITY_SWIPE_TO_SUBMIT", 40, 40);
            SWIPE_TO_SUBMIT_EQUITY_CONFIRM = new Name("SWIPE_TO_SUBMIT_EQUITY_CONFIRM", 41, 41);
            TRANSFER_DEEPLINK_HANDLER = new Name("TRANSFER_DEEPLINK_HANDLER", 42, 42);
            MICROGRAM_LOAD = new Name("MICROGRAM_LOAD", 43, 43);
            GOLD_LEGACY_FLOW = new Name("GOLD_LEGACY_FLOW", 44, 44);
            GOLD_UNIFIED_FLOW = new Name("GOLD_UNIFIED_FLOW", 45, 45);
            OPTIONS_SIDE_BY_SIDE_CHAIN = new Name("OPTIONS_SIDE_BY_SIDE_CHAIN", 46, 46);
            MOBILE_ADVANCED_CHARTS = new Name("MOBILE_ADVANCED_CHARTS", 47, 47);
            Name[] nameArr$values = $values();
            $VALUES = nameArr$values;
            $ENTRIES = EnumEntries2.enumEntries(nameArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Name.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Name>(orCreateKotlinClass, syntax, name) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Name$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerformanceMetricEventData.Name fromValue(int value) {
                    return PerformanceMetricEventData.Name.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerformanceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Name fromValue(int value) {
                switch (value) {
                    case 0:
                        return Name.LOCAL_AUTH;
                    case 1:
                        return Name.HOME;
                    case 2:
                        return Name.STOCK_DETAIL;
                    case 3:
                        return Name.OPTIONS_CHAIN;
                    case 4:
                        return Name.OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE;
                    case 5:
                        return Name.OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE;
                    case 6:
                        return Name.OPTIONS_CHAIN_DIFFERENT_SIDE;
                    case 7:
                        return Name.OPTIONS_CHAIN_SELECT_CONTRACT;
                    case 8:
                        return Name.OPTIONS_ORDER_REVIEW;
                    case 9:
                        return Name.LOCAL_AUTHENTICATION;
                    case 10:
                        return Name.BROWSE_NEWSFEED;
                    case 11:
                        return Name.OPTIONS_ORDER_SUBMIT;
                    case 12:
                        return Name.OPTION_PROFIT_AND_LOSS_CHART;
                    case 13:
                        return Name.OPTION_SHOPPING_CART;
                    case 14:
                        return Name.OPTION_ORDER;
                    case 15:
                        return Name.MESSAGE;
                    case 16:
                        return Name.MESSAGE_THREAD;
                    case 17:
                        return Name.OPTIONS_WATCHLIST_HUB;
                    case 18:
                        return Name.OPTIONS_WATCHLIST_HUB_SORT;
                    case 19:
                        return Name.OPTIONS_STRATEGY_CHAIN;
                    case 20:
                        return Name.OPTIONS_STRATEGY_CHAIN_NEAR_FILTER;
                    case 21:
                        return Name.OPTIONS_STRATEGY_CHAIN_FAR_FILTER;
                    case 22:
                        return Name.OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER;
                    case 23:
                        return Name.OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER;
                    case 24:
                        return Name.OPTIONS_SIMULATED_RETURNS;
                    case 25:
                        return Name.APP_LAUNCH;
                    case 26:
                        return Name.HOME_SETUP_POST_LAUNCH;
                    case 27:
                        return Name.HOME_INSTRUMENT_ROW_TRADE_BAR;
                    case 28:
                        return Name.TRADE_BUTTON_EXPANSION;
                    case 29:
                        return Name.TRADE_OPTIONS_STRATEGY_BUILDER;
                    case 30:
                        return Name.OPTIONS_CONTRACT_DATE_CONTRACTS;
                    case 31:
                        return Name.OPTIONS_CONTRACT_BUY_BUTTON;
                    case 32:
                        return Name.BUY_OPTION_TRADE_DETAILS;
                    case 33:
                        return Name.REVIEW_OPTION_SWIPE_TO_SUBMIT;
                    case 34:
                        return Name.SWIPE_TO_SUBMIT_OPTION_CONFIRMATION;
                    case 35:
                        return Name.ACTION_COMPLETION;
                    case 36:
                        return Name.SCREEN_LOAD;
                    case 37:
                        return Name.STREAM_LOAD;
                    case 38:
                        return Name.COMPONENT_LOAD;
                    case 39:
                        return Name.BUY_EQUITY_TRADE_FLOW;
                    case 40:
                        return Name.REVIEW_EQUITY_SWIPE_TO_SUBMIT;
                    case 41:
                        return Name.SWIPE_TO_SUBMIT_EQUITY_CONFIRM;
                    case 42:
                        return Name.TRANSFER_DEEPLINK_HANDLER;
                    case 43:
                        return Name.MICROGRAM_LOAD;
                    case 44:
                        return Name.GOLD_LEGACY_FLOW;
                    case 45:
                        return Name.GOLD_UNIFIED_FLOW;
                    case 46:
                        return Name.OPTIONS_SIDE_BY_SIDE_CHAIN;
                    case 47:
                        return Name.MOBILE_ADVANCED_CHARTS;
                    default:
                        return null;
                }
            }
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PERFORMANCE_METRIC_STATUS_UNSPECIFIED", "COMPLETED", "FAILED", "ABORTED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
        public static final Status PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PERFORMANCE_METRIC_STATUS_UNSPECIFIED, COMPLETED, FAILED, ABORTED};
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
            final Status status = new Status("PERFORMANCE_METRIC_STATUS_UNSPECIFIED", 0, 0);
            PERFORMANCE_METRIC_STATUS_UNSPECIFIED = status;
            COMPLETED = new Status("COMPLETED", 1, 1);
            FAILED = new Status("FAILED", 2, 2);
            ABORTED = new Status("ABORTED", 3, 3);
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Status.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Status>(orCreateKotlinClass, syntax, status) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Status$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerformanceMetricEventData.Status fromValue(int value) {
                    return PerformanceMetricEventData.Status.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerformanceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Status fromValue(int value) {
                if (value == 0) {
                    return Status.PERFORMANCE_METRIC_STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return Status.COMPLETED;
                }
                if (value == 2) {
                    return Status.FAILED;
                }
                if (value != 3) {
                    return null;
                }
                return Status.ABORTED;
            }
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* compiled from: PerformanceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0007:;<=>?@B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u00101\u001a\u00020\u0002H\u0017J\u0013\u00102\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000208H\u0016J\u008e\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006A"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "Lcom/squareup/wire/Message;", "", "from_cold_start", "", "requires_local_auth", "symbol", "options", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$Options;", "lists_context", "Lcom/robinhood/rosetta/eventlogging/ListsContext;", "list_sort", "Lcom/robinhood/rosetta/eventlogging/ListSort;", "action", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$Action;", "screen_load", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$ScreenLoad;", "stream_load", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$StreamLoad;", "component_load", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$ComponentLoad;", "microgram_load", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZZLcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$Options;Lcom/robinhood/rosetta/eventlogging/ListsContext;Lcom/robinhood/rosetta/eventlogging/ListSort;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$Action;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$ScreenLoad;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$StreamLoad;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$ComponentLoad;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad;Lokio/ByteString;)V", "getFrom_cold_start", "()Z", "getRequires_local_auth", "getSymbol$annotations", "()V", "getSymbol", "getOptions", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$Options;", "getLists_context", "()Lcom/robinhood/rosetta/eventlogging/ListsContext;", "getList_sort", "()Lcom/robinhood/rosetta/eventlogging/ListSort;", "getAction", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$Action;", "getScreen_load", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$ScreenLoad;", "getStream_load", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$StreamLoad;", "getComponent_load", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$ComponentLoad;", "getMicrogram_load", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Options", "Action", "ScreenLoad", "StreamLoad", "ComponentLoad", "MicrogramLoad", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Context extends Message {

        @JvmField
        public static final ProtoAdapter<Context> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$Action#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final Action action;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$ComponentLoad#ADAPTER", jsonName = "componentLoad", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
        private final ComponentLoad component_load;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "fromColdStart", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final boolean from_cold_start;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.ListSort#ADAPTER", jsonName = "listSort", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final ListSort list_sort;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.ListsContext#ADAPTER", jsonName = "listsContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final ListsContext lists_context;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$MicrogramLoad#ADAPTER", jsonName = "microgramLoad", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
        private final MicrogramLoad microgram_load;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$Options#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final Options options;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "requiresLocalAuth", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final boolean requires_local_auth;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$ScreenLoad#ADAPTER", jsonName = "screenLoad", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
        private final ScreenLoad screen_load;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$StreamLoad#ADAPTER", jsonName = "streamLoad", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
        private final StreamLoad stream_load;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final boolean symbol;

        public Context() {
            this(false, false, false, null, null, null, null, null, null, null, null, null, 4095, null);
        }

        @Deprecated
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24474newBuilder();
        }

        public final boolean getFrom_cold_start() {
            return this.from_cold_start;
        }

        public final boolean getRequires_local_auth() {
            return this.requires_local_auth;
        }

        public final boolean getSymbol() {
            return this.symbol;
        }

        public final Options getOptions() {
            return this.options;
        }

        public final ListsContext getLists_context() {
            return this.lists_context;
        }

        public final ListSort getList_sort() {
            return this.list_sort;
        }

        public final Action getAction() {
            return this.action;
        }

        public final ScreenLoad getScreen_load() {
            return this.screen_load;
        }

        public final StreamLoad getStream_load() {
            return this.stream_load;
        }

        public final ComponentLoad getComponent_load() {
            return this.component_load;
        }

        public final MicrogramLoad getMicrogram_load() {
            return this.microgram_load;
        }

        public /* synthetic */ Context(boolean z, boolean z2, boolean z3, Options options, ListsContext listsContext, ListSort listSort, Action action, ScreenLoad screenLoad, StreamLoad streamLoad, ComponentLoad componentLoad, MicrogramLoad microgramLoad, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : options, (i & 16) != 0 ? null : listsContext, (i & 32) != 0 ? null : listSort, (i & 64) != 0 ? null : action, (i & 128) != 0 ? null : screenLoad, (i & 256) != 0 ? null : streamLoad, (i & 512) != 0 ? null : componentLoad, (i & 1024) != 0 ? null : microgramLoad, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Context(boolean z, boolean z2, boolean z3, Options options, ListsContext listsContext, ListSort listSort, Action action, ScreenLoad screenLoad, StreamLoad streamLoad, ComponentLoad componentLoad, MicrogramLoad microgramLoad, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.from_cold_start = z;
            this.requires_local_auth = z2;
            this.symbol = z3;
            this.options = options;
            this.lists_context = listsContext;
            this.list_sort = listSort;
            this.action = action;
            this.screen_load = screenLoad;
            this.stream_load = streamLoad;
            this.component_load = componentLoad;
            this.microgram_load = microgramLoad;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24474newBuilder() {
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
            return Intrinsics.areEqual(unknownFields(), context.unknownFields()) && this.from_cold_start == context.from_cold_start && this.requires_local_auth == context.requires_local_auth && this.symbol == context.symbol && Intrinsics.areEqual(this.options, context.options) && Intrinsics.areEqual(this.lists_context, context.lists_context) && Intrinsics.areEqual(this.list_sort, context.list_sort) && Intrinsics.areEqual(this.action, context.action) && Intrinsics.areEqual(this.screen_load, context.screen_load) && Intrinsics.areEqual(this.stream_load, context.stream_load) && Intrinsics.areEqual(this.component_load, context.component_load) && Intrinsics.areEqual(this.microgram_load, context.microgram_load);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((((unknownFields().hashCode() * 37) + java.lang.Boolean.hashCode(this.from_cold_start)) * 37) + java.lang.Boolean.hashCode(this.requires_local_auth)) * 37) + java.lang.Boolean.hashCode(this.symbol)) * 37;
            Options options = this.options;
            int iHashCode2 = (iHashCode + (options != null ? options.hashCode() : 0)) * 37;
            ListsContext listsContext = this.lists_context;
            int iHashCode3 = (iHashCode2 + (listsContext != null ? listsContext.hashCode() : 0)) * 37;
            ListSort listSort = this.list_sort;
            int iHashCode4 = (iHashCode3 + (listSort != null ? listSort.hashCode() : 0)) * 37;
            Action action = this.action;
            int iHashCode5 = (iHashCode4 + (action != null ? action.hashCode() : 0)) * 37;
            ScreenLoad screenLoad = this.screen_load;
            int iHashCode6 = (iHashCode5 + (screenLoad != null ? screenLoad.hashCode() : 0)) * 37;
            StreamLoad streamLoad = this.stream_load;
            int iHashCode7 = (iHashCode6 + (streamLoad != null ? streamLoad.hashCode() : 0)) * 37;
            ComponentLoad componentLoad = this.component_load;
            int iHashCode8 = (iHashCode7 + (componentLoad != null ? componentLoad.hashCode() : 0)) * 37;
            MicrogramLoad microgramLoad = this.microgram_load;
            int iHashCode9 = iHashCode8 + (microgramLoad != null ? microgramLoad.hashCode() : 0);
            this.hashCode = iHashCode9;
            return iHashCode9;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("from_cold_start=" + this.from_cold_start);
            arrayList.add("requires_local_auth=" + this.requires_local_auth);
            arrayList.add("symbol=" + this.symbol);
            Options options = this.options;
            if (options != null) {
                arrayList.add("options=" + options);
            }
            ListsContext listsContext = this.lists_context;
            if (listsContext != null) {
                arrayList.add("lists_context=" + listsContext);
            }
            ListSort listSort = this.list_sort;
            if (listSort != null) {
                arrayList.add("list_sort=" + listSort);
            }
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            ScreenLoad screenLoad = this.screen_load;
            if (screenLoad != null) {
                arrayList.add("screen_load=" + screenLoad);
            }
            StreamLoad streamLoad = this.stream_load;
            if (streamLoad != null) {
                arrayList.add("stream_load=" + streamLoad);
            }
            ComponentLoad componentLoad = this.component_load;
            if (componentLoad != null) {
                arrayList.add("component_load=" + componentLoad);
            }
            MicrogramLoad microgramLoad = this.microgram_load;
            if (microgramLoad != null) {
                arrayList.add("microgram_load=" + microgramLoad);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Context{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Context copy$default(Context context, boolean z, boolean z2, boolean z3, Options options, ListsContext listsContext, ListSort listSort, Action action, ScreenLoad screenLoad, StreamLoad streamLoad, ComponentLoad componentLoad, MicrogramLoad microgramLoad, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                z = context.from_cold_start;
            }
            if ((i & 2) != 0) {
                z2 = context.requires_local_auth;
            }
            if ((i & 4) != 0) {
                z3 = context.symbol;
            }
            if ((i & 8) != 0) {
                options = context.options;
            }
            if ((i & 16) != 0) {
                listsContext = context.lists_context;
            }
            if ((i & 32) != 0) {
                listSort = context.list_sort;
            }
            if ((i & 64) != 0) {
                action = context.action;
            }
            if ((i & 128) != 0) {
                screenLoad = context.screen_load;
            }
            if ((i & 256) != 0) {
                streamLoad = context.stream_load;
            }
            if ((i & 512) != 0) {
                componentLoad = context.component_load;
            }
            if ((i & 1024) != 0) {
                microgramLoad = context.microgram_load;
            }
            if ((i & 2048) != 0) {
                byteString = context.unknownFields();
            }
            MicrogramLoad microgramLoad2 = microgramLoad;
            ByteString byteString2 = byteString;
            StreamLoad streamLoad2 = streamLoad;
            ComponentLoad componentLoad2 = componentLoad;
            Action action2 = action;
            ScreenLoad screenLoad2 = screenLoad;
            ListsContext listsContext2 = listsContext;
            ListSort listSort2 = listSort;
            return context.copy(z, z2, z3, options, listsContext2, listSort2, action2, screenLoad2, streamLoad2, componentLoad2, microgramLoad2, byteString2);
        }

        public final Context copy(boolean from_cold_start, boolean requires_local_auth, boolean symbol, Options options, ListsContext lists_context, ListSort list_sort, Action action, ScreenLoad screen_load, StreamLoad stream_load, ComponentLoad component_load, MicrogramLoad microgram_load, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Context(from_cold_start, requires_local_auth, symbol, options, lists_context, list_sort, action, screen_load, stream_load, component_load, microgram_load, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Context.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Context>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public PerformanceMetricEventData.Context decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    PerformanceMetricEventData.Context.Options optionsDecode = null;
                    boolean zBooleanValue = false;
                    boolean zBooleanValue2 = false;
                    boolean zBooleanValue3 = false;
                    ListsContext listsContextDecode = null;
                    ListSort listSortDecode = null;
                    PerformanceMetricEventData.Context.Action actionDecode = null;
                    PerformanceMetricEventData.Context.ScreenLoad screenLoadDecode = null;
                    PerformanceMetricEventData.Context.StreamLoad streamLoadDecode = null;
                    PerformanceMetricEventData.Context.ComponentLoad componentLoadDecode = null;
                    PerformanceMetricEventData.Context.MicrogramLoad microgramLoadDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 2:
                                    zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 3:
                                    zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 4:
                                    optionsDecode = PerformanceMetricEventData.Context.Options.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    listsContextDecode = ListsContext.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    listSortDecode = ListSort.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    actionDecode = PerformanceMetricEventData.Context.Action.ADAPTER.decode(reader);
                                    break;
                                case 8:
                                    screenLoadDecode = PerformanceMetricEventData.Context.ScreenLoad.ADAPTER.decode(reader);
                                    break;
                                case 9:
                                    streamLoadDecode = PerformanceMetricEventData.Context.StreamLoad.ADAPTER.decode(reader);
                                    break;
                                case 10:
                                    componentLoadDecode = PerformanceMetricEventData.Context.ComponentLoad.ADAPTER.decode(reader);
                                    break;
                                case 11:
                                    microgramLoadDecode = PerformanceMetricEventData.Context.MicrogramLoad.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new PerformanceMetricEventData.Context(zBooleanValue, zBooleanValue2, zBooleanValue3, optionsDecode, listsContextDecode, listSortDecode, actionDecode, screenLoadDecode, streamLoadDecode, componentLoadDecode, microgramLoadDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PerformanceMetricEventData.Context value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getFrom_cold_start()) {
                        size += ProtoAdapter.BOOL.encodedSizeWithTag(1, java.lang.Boolean.valueOf(value.getFrom_cold_start()));
                    }
                    if (value.getRequires_local_auth()) {
                        size += ProtoAdapter.BOOL.encodedSizeWithTag(2, java.lang.Boolean.valueOf(value.getRequires_local_auth()));
                    }
                    if (value.getSymbol()) {
                        size += ProtoAdapter.BOOL.encodedSizeWithTag(3, java.lang.Boolean.valueOf(value.getSymbol()));
                    }
                    if (value.getOptions() != null) {
                        size += PerformanceMetricEventData.Context.Options.ADAPTER.encodedSizeWithTag(4, value.getOptions());
                    }
                    if (value.getLists_context() != null) {
                        size += ListsContext.ADAPTER.encodedSizeWithTag(5, value.getLists_context());
                    }
                    if (value.getList_sort() != null) {
                        size += ListSort.ADAPTER.encodedSizeWithTag(6, value.getList_sort());
                    }
                    if (value.getAction() != null) {
                        size += PerformanceMetricEventData.Context.Action.ADAPTER.encodedSizeWithTag(7, value.getAction());
                    }
                    if (value.getScreen_load() != null) {
                        size += PerformanceMetricEventData.Context.ScreenLoad.ADAPTER.encodedSizeWithTag(8, value.getScreen_load());
                    }
                    if (value.getStream_load() != null) {
                        size += PerformanceMetricEventData.Context.StreamLoad.ADAPTER.encodedSizeWithTag(9, value.getStream_load());
                    }
                    if (value.getComponent_load() != null) {
                        size += PerformanceMetricEventData.Context.ComponentLoad.ADAPTER.encodedSizeWithTag(10, value.getComponent_load());
                    }
                    return value.getMicrogram_load() != null ? size + PerformanceMetricEventData.Context.MicrogramLoad.ADAPTER.encodedSizeWithTag(11, value.getMicrogram_load()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PerformanceMetricEventData.Context value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getFrom_cold_start()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getFrom_cold_start()));
                    }
                    if (value.getRequires_local_auth()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getRequires_local_auth()));
                    }
                    if (value.getSymbol()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getSymbol()));
                    }
                    if (value.getOptions() != null) {
                        PerformanceMetricEventData.Context.Options.ADAPTER.encodeWithTag(writer, 4, (int) value.getOptions());
                    }
                    if (value.getLists_context() != null) {
                        ListsContext.ADAPTER.encodeWithTag(writer, 5, (int) value.getLists_context());
                    }
                    if (value.getList_sort() != null) {
                        ListSort.ADAPTER.encodeWithTag(writer, 6, (int) value.getList_sort());
                    }
                    if (value.getAction() != null) {
                        PerformanceMetricEventData.Context.Action.ADAPTER.encodeWithTag(writer, 7, (int) value.getAction());
                    }
                    if (value.getScreen_load() != null) {
                        PerformanceMetricEventData.Context.ScreenLoad.ADAPTER.encodeWithTag(writer, 8, (int) value.getScreen_load());
                    }
                    if (value.getStream_load() != null) {
                        PerformanceMetricEventData.Context.StreamLoad.ADAPTER.encodeWithTag(writer, 9, (int) value.getStream_load());
                    }
                    if (value.getComponent_load() != null) {
                        PerformanceMetricEventData.Context.ComponentLoad.ADAPTER.encodeWithTag(writer, 10, (int) value.getComponent_load());
                    }
                    if (value.getMicrogram_load() != null) {
                        PerformanceMetricEventData.Context.MicrogramLoad.ADAPTER.encodeWithTag(writer, 11, (int) value.getMicrogram_load());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PerformanceMetricEventData.Context value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getMicrogram_load() != null) {
                        PerformanceMetricEventData.Context.MicrogramLoad.ADAPTER.encodeWithTag(writer, 11, (int) value.getMicrogram_load());
                    }
                    if (value.getComponent_load() != null) {
                        PerformanceMetricEventData.Context.ComponentLoad.ADAPTER.encodeWithTag(writer, 10, (int) value.getComponent_load());
                    }
                    if (value.getStream_load() != null) {
                        PerformanceMetricEventData.Context.StreamLoad.ADAPTER.encodeWithTag(writer, 9, (int) value.getStream_load());
                    }
                    if (value.getScreen_load() != null) {
                        PerformanceMetricEventData.Context.ScreenLoad.ADAPTER.encodeWithTag(writer, 8, (int) value.getScreen_load());
                    }
                    if (value.getAction() != null) {
                        PerformanceMetricEventData.Context.Action.ADAPTER.encodeWithTag(writer, 7, (int) value.getAction());
                    }
                    if (value.getList_sort() != null) {
                        ListSort.ADAPTER.encodeWithTag(writer, 6, (int) value.getList_sort());
                    }
                    if (value.getLists_context() != null) {
                        ListsContext.ADAPTER.encodeWithTag(writer, 5, (int) value.getLists_context());
                    }
                    if (value.getOptions() != null) {
                        PerformanceMetricEventData.Context.Options.ADAPTER.encodeWithTag(writer, 4, (int) value.getOptions());
                    }
                    if (value.getSymbol()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getSymbol()));
                    }
                    if (value.getRequires_local_auth()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getRequires_local_auth()));
                    }
                    if (value.getFrom_cold_start()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getFrom_cold_start()));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PerformanceMetricEventData.Context redact(PerformanceMetricEventData.Context value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    PerformanceMetricEventData.Context.Options options = value.getOptions();
                    PerformanceMetricEventData.Context.Options optionsRedact = options != null ? PerformanceMetricEventData.Context.Options.ADAPTER.redact(options) : null;
                    ListsContext lists_context = value.getLists_context();
                    ListsContext listsContextRedact = lists_context != null ? ListsContext.ADAPTER.redact(lists_context) : null;
                    ListSort list_sort = value.getList_sort();
                    ListSort listSortRedact = list_sort != null ? ListSort.ADAPTER.redact(list_sort) : null;
                    PerformanceMetricEventData.Context.Action action = value.getAction();
                    PerformanceMetricEventData.Context.Action actionRedact = action != null ? PerformanceMetricEventData.Context.Action.ADAPTER.redact(action) : null;
                    PerformanceMetricEventData.Context.ScreenLoad screen_load = value.getScreen_load();
                    PerformanceMetricEventData.Context.ScreenLoad screenLoadRedact = screen_load != null ? PerformanceMetricEventData.Context.ScreenLoad.ADAPTER.redact(screen_load) : null;
                    PerformanceMetricEventData.Context.StreamLoad stream_load = value.getStream_load();
                    PerformanceMetricEventData.Context.StreamLoad streamLoadRedact = stream_load != null ? PerformanceMetricEventData.Context.StreamLoad.ADAPTER.redact(stream_load) : null;
                    PerformanceMetricEventData.Context.ComponentLoad component_load = value.getComponent_load();
                    PerformanceMetricEventData.Context.ComponentLoad componentLoadRedact = component_load != null ? PerformanceMetricEventData.Context.ComponentLoad.ADAPTER.redact(component_load) : null;
                    PerformanceMetricEventData.Context.MicrogramLoad microgram_load = value.getMicrogram_load();
                    return PerformanceMetricEventData.Context.copy$default(value, false, false, false, optionsRedact, listsContextRedact, listSortRedact, actionRedact, screenLoadRedact, streamLoadRedact, componentLoadRedact, microgram_load != null ? PerformanceMetricEventData.Context.MicrogramLoad.ADAPTER.redact(microgram_load) : null, ByteString.EMPTY, 7, null);
                }
            };
        }

        /* compiled from: PerformanceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\nH\u0016JL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$Options;", "Lcom/squareup/wire/Message;", "", "option_type", "Lrosetta/option/OptionType;", "order_side", "Lrosetta/order/Side;", "has_contract_selections", "", "chain_id", "", "chain_symbol", "strategy", "Lrosetta/option/StrategyName;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/option/OptionType;Lrosetta/order/Side;ZLjava/lang/String;Ljava/lang/String;Lrosetta/option/StrategyName;Lokio/ByteString;)V", "getOption_type", "()Lrosetta/option/OptionType;", "getOrder_side", "()Lrosetta/order/Side;", "getHas_contract_selections", "()Z", "getChain_id", "()Ljava/lang/String;", "getChain_symbol", "getStrategy", "()Lrosetta/option/StrategyName;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Options extends Message {

            @JvmField
            public static final ProtoAdapter<Options> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chainId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
            private final String chain_id;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chainSymbol", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
            private final String chain_symbol;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasContractSelections", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final boolean has_contract_selections;

            @WireField(adapter = "rosetta.option.OptionType#ADAPTER", jsonName = "optionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final OptionType option_type;

            @WireField(adapter = "rosetta.order.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final Side order_side;

            @WireField(adapter = "rosetta.option.StrategyName#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
            private final StrategyName strategy;

            public Options() {
                this(null, null, false, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m24478newBuilder();
            }

            public final OptionType getOption_type() {
                return this.option_type;
            }

            public /* synthetic */ Options(OptionType optionType, Side side, boolean z, String str, String str2, StrategyName strategyName, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? OptionType.OPTION_TYPE_UNSPECIFIED : optionType, (i & 2) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? StrategyName.STRATEGY_NAME_UNSPECIFIED : strategyName, (i & 64) != 0 ? ByteString.EMPTY : byteString);
            }

            public final Side getOrder_side() {
                return this.order_side;
            }

            public final boolean getHas_contract_selections() {
                return this.has_contract_selections;
            }

            public final String getChain_id() {
                return this.chain_id;
            }

            public final String getChain_symbol() {
                return this.chain_symbol;
            }

            public final StrategyName getStrategy() {
                return this.strategy;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Options(OptionType option_type, Side order_side, boolean z, String chain_id, String chain_symbol, StrategyName strategy, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(option_type, "option_type");
                Intrinsics.checkNotNullParameter(order_side, "order_side");
                Intrinsics.checkNotNullParameter(chain_id, "chain_id");
                Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
                Intrinsics.checkNotNullParameter(strategy, "strategy");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.option_type = option_type;
                this.order_side = order_side;
                this.has_contract_selections = z;
                this.chain_id = chain_id;
                this.chain_symbol = chain_symbol;
                this.strategy = strategy;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m24478newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Options)) {
                    return false;
                }
                Options options = (Options) other;
                return Intrinsics.areEqual(unknownFields(), options.unknownFields()) && this.option_type == options.option_type && this.order_side == options.order_side && this.has_contract_selections == options.has_contract_selections && Intrinsics.areEqual(this.chain_id, options.chain_id) && Intrinsics.areEqual(this.chain_symbol, options.chain_symbol) && this.strategy == options.strategy;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.option_type.hashCode()) * 37) + this.order_side.hashCode()) * 37) + java.lang.Boolean.hashCode(this.has_contract_selections)) * 37) + this.chain_id.hashCode()) * 37) + this.chain_symbol.hashCode()) * 37) + this.strategy.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("option_type=" + this.option_type);
                arrayList.add("order_side=" + this.order_side);
                arrayList.add("has_contract_selections=" + this.has_contract_selections);
                arrayList.add("chain_id=" + Internal.sanitize(this.chain_id));
                arrayList.add("chain_symbol=" + Internal.sanitize(this.chain_symbol));
                arrayList.add("strategy=" + this.strategy);
                return CollectionsKt.joinToString$default(arrayList, ", ", "Options{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Options copy$default(Options options, OptionType optionType, Side side, boolean z, String str, String str2, StrategyName strategyName, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    optionType = options.option_type;
                }
                if ((i & 2) != 0) {
                    side = options.order_side;
                }
                if ((i & 4) != 0) {
                    z = options.has_contract_selections;
                }
                if ((i & 8) != 0) {
                    str = options.chain_id;
                }
                if ((i & 16) != 0) {
                    str2 = options.chain_symbol;
                }
                if ((i & 32) != 0) {
                    strategyName = options.strategy;
                }
                if ((i & 64) != 0) {
                    byteString = options.unknownFields();
                }
                StrategyName strategyName2 = strategyName;
                ByteString byteString2 = byteString;
                String str3 = str2;
                boolean z2 = z;
                return options.copy(optionType, side, z2, str, str3, strategyName2, byteString2);
            }

            public final Options copy(OptionType option_type, Side order_side, boolean has_contract_selections, String chain_id, String chain_symbol, StrategyName strategy, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(option_type, "option_type");
                Intrinsics.checkNotNullParameter(order_side, "order_side");
                Intrinsics.checkNotNullParameter(chain_id, "chain_id");
                Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
                Intrinsics.checkNotNullParameter(strategy, "strategy");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Options(option_type, order_side, has_contract_selections, chain_id, chain_symbol, strategy, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Options.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Options>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$Options$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PerformanceMetricEventData.Context.Options value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (value.getOption_type() != OptionType.OPTION_TYPE_UNSPECIFIED) {
                            size += OptionType.ADAPTER.encodedSizeWithTag(1, value.getOption_type());
                        }
                        if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                            size += Side.ADAPTER.encodedSizeWithTag(2, value.getOrder_side());
                        }
                        if (value.getHas_contract_selections()) {
                            size += ProtoAdapter.BOOL.encodedSizeWithTag(3, java.lang.Boolean.valueOf(value.getHas_contract_selections()));
                        }
                        if (!Intrinsics.areEqual(value.getChain_id(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getChain_id());
                        }
                        if (!Intrinsics.areEqual(value.getChain_symbol(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getChain_symbol());
                        }
                        return value.getStrategy() != StrategyName.STRATEGY_NAME_UNSPECIFIED ? size + StrategyName.ADAPTER.encodedSizeWithTag(6, value.getStrategy()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PerformanceMetricEventData.Context.Options value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getOption_type() != OptionType.OPTION_TYPE_UNSPECIFIED) {
                            OptionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getOption_type());
                        }
                        if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                            Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_side());
                        }
                        if (value.getHas_contract_selections()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getHas_contract_selections()));
                        }
                        if (!Intrinsics.areEqual(value.getChain_id(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getChain_id());
                        }
                        if (!Intrinsics.areEqual(value.getChain_symbol(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getChain_symbol());
                        }
                        if (value.getStrategy() != StrategyName.STRATEGY_NAME_UNSPECIFIED) {
                            StrategyName.ADAPTER.encodeWithTag(writer, 6, (int) value.getStrategy());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PerformanceMetricEventData.Context.Options value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getStrategy() != StrategyName.STRATEGY_NAME_UNSPECIFIED) {
                            StrategyName.ADAPTER.encodeWithTag(writer, 6, (int) value.getStrategy());
                        }
                        if (!Intrinsics.areEqual(value.getChain_symbol(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getChain_symbol());
                        }
                        if (!Intrinsics.areEqual(value.getChain_id(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getChain_id());
                        }
                        if (value.getHas_contract_selections()) {
                            ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getHas_contract_selections()));
                        }
                        if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                            Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_side());
                        }
                        if (value.getOption_type() != OptionType.OPTION_TYPE_UNSPECIFIED) {
                            OptionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getOption_type());
                        }
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public PerformanceMetricEventData.Context.Options decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        OptionType optionTypeDecode = OptionType.OPTION_TYPE_UNSPECIFIED;
                        Side side = Side.SIDE_UNSPECIFIED;
                        StrategyName strategyName = StrategyName.STRATEGY_NAME_UNSPECIFIED;
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        boolean zBooleanValue = false;
                        String strDecode2 = "";
                        StrategyName strategyNameDecode = strategyName;
                        Side sideDecode = side;
                        while (true) {
                            OptionType optionType = optionTypeDecode;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new PerformanceMetricEventData.Context.Options(optionType, sideDecode, zBooleanValue, strDecode, strDecode2, strategyNameDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                switch (iNextTag) {
                                    case 1:
                                        try {
                                            optionTypeDecode = OptionType.ADAPTER.decode(reader);
                                            break;
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                            break;
                                        }
                                    case 2:
                                        try {
                                            sideDecode = Side.ADAPTER.decode(reader);
                                            break;
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                            break;
                                        }
                                    case 3:
                                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                        break;
                                    case 4:
                                        strDecode = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 5:
                                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 6:
                                        try {
                                            strategyNameDecode = StrategyName.ADAPTER.decode(reader);
                                            break;
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                            break;
                                        }
                                    default:
                                        reader.readUnknownField(iNextTag);
                                        break;
                                }
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PerformanceMetricEventData.Context.Options redact(PerformanceMetricEventData.Context.Options value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return PerformanceMetricEventData.Context.Options.copy$default(value, null, null, false, null, null, null, ByteString.EMPTY, 63, null);
                    }
                };
            }
        }

        /* compiled from: PerformanceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$Action;", "Lcom/squareup/wire/Message;", "", "event", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;Lokio/ByteString;)V", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Action extends Message {

            @JvmField
            public static final ProtoAdapter<Action> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.robinhood.rosetta.eventlogging.UserInteractionEventData#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final UserInteractionEventData event;

            /* JADX WARN: Multi-variable type inference failed */
            public Action() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m24475newBuilder();
            }

            public final UserInteractionEventData getEvent() {
                return this.event;
            }

            public /* synthetic */ Action(UserInteractionEventData userInteractionEventData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : userInteractionEventData, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Action(UserInteractionEventData userInteractionEventData, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.event = userInteractionEventData;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m24475newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Action)) {
                    return false;
                }
                Action action = (Action) other;
                return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.event, action.event);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                UserInteractionEventData userInteractionEventData = this.event;
                int iHashCode2 = iHashCode + (userInteractionEventData != null ? userInteractionEventData.hashCode() : 0);
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                UserInteractionEventData userInteractionEventData = this.event;
                if (userInteractionEventData != null) {
                    arrayList.add("event=" + userInteractionEventData);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Action copy$default(Action action, UserInteractionEventData userInteractionEventData, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    userInteractionEventData = action.event;
                }
                if ((i & 2) != 0) {
                    byteString = action.unknownFields();
                }
                return action.copy(userInteractionEventData, byteString);
            }

            public final Action copy(UserInteractionEventData event, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Action(event, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Action.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Action>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$Action$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public PerformanceMetricEventData.Context.Action decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        UserInteractionEventData userInteractionEventDataDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new PerformanceMetricEventData.Context.Action(userInteractionEventDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                userInteractionEventDataDecode = UserInteractionEventData.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PerformanceMetricEventData.Context.Action value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return value.getEvent() != null ? size + UserInteractionEventData.ADAPTER.encodedSizeWithTag(1, value.getEvent()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PerformanceMetricEventData.Context.Action value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getEvent() != null) {
                            UserInteractionEventData.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PerformanceMetricEventData.Context.Action value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getEvent() != null) {
                            UserInteractionEventData.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent());
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PerformanceMetricEventData.Context.Action redact(PerformanceMetricEventData.Context.Action value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        UserInteractionEventData event = value.getEvent();
                        return value.copy(event != null ? UserInteractionEventData.ADAPTER.redact(event) : null, ByteString.EMPTY);
                    }
                };
            }
        }

        /* compiled from: PerformanceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$ScreenLoad;", "Lcom/squareup/wire/Message;", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Lokio/ByteString;)V", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ScreenLoad extends Message {

            @JvmField
            public static final ProtoAdapter<ScreenLoad> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.robinhood.rosetta.eventlogging.Context#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final com.robinhood.rosetta.eventlogging.Context context;

            @WireField(adapter = "com.robinhood.rosetta.eventlogging.Screen#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final Screen screen;

            public ScreenLoad() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m24479newBuilder();
            }

            public final Screen getScreen() {
                return this.screen;
            }

            public final com.robinhood.rosetta.eventlogging.Context getContext() {
                return this.context;
            }

            public /* synthetic */ ScreenLoad(Screen screen, com.robinhood.rosetta.eventlogging.Context context, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : screen, (i & 2) != 0 ? null : context, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScreenLoad(Screen screen, com.robinhood.rosetta.eventlogging.Context context, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.screen = screen;
                this.context = context;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m24479newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ScreenLoad)) {
                    return false;
                }
                ScreenLoad screenLoad = (ScreenLoad) other;
                return Intrinsics.areEqual(unknownFields(), screenLoad.unknownFields()) && Intrinsics.areEqual(this.screen, screenLoad.screen) && Intrinsics.areEqual(this.context, screenLoad.context);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                Screen screen = this.screen;
                int iHashCode2 = (iHashCode + (screen != null ? screen.hashCode() : 0)) * 37;
                com.robinhood.rosetta.eventlogging.Context context = this.context;
                int iHashCode3 = iHashCode2 + (context != null ? context.hashCode() : 0);
                this.hashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                Screen screen = this.screen;
                if (screen != null) {
                    arrayList.add("screen=" + screen);
                }
                com.robinhood.rosetta.eventlogging.Context context = this.context;
                if (context != null) {
                    arrayList.add("context=" + context);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenLoad{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ ScreenLoad copy$default(ScreenLoad screenLoad, Screen screen, com.robinhood.rosetta.eventlogging.Context context, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    screen = screenLoad.screen;
                }
                if ((i & 2) != 0) {
                    context = screenLoad.context;
                }
                if ((i & 4) != 0) {
                    byteString = screenLoad.unknownFields();
                }
                return screenLoad.copy(screen, context, byteString);
            }

            public final ScreenLoad copy(Screen screen, com.robinhood.rosetta.eventlogging.Context context, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new ScreenLoad(screen, context, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ScreenLoad.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<ScreenLoad>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$ScreenLoad$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public PerformanceMetricEventData.Context.ScreenLoad decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        Screen screenDecode = null;
                        Context contextDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new PerformanceMetricEventData.Context.ScreenLoad(screenDecode, contextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                screenDecode = Screen.ADAPTER.decode(reader);
                            } else if (iNextTag == 2) {
                                contextDecode = Context.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PerformanceMetricEventData.Context.ScreenLoad value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (value.getScreen() != null) {
                            size += Screen.ADAPTER.encodedSizeWithTag(1, value.getScreen());
                        }
                        return value.getContext() != null ? size + Context.ADAPTER.encodedSizeWithTag(2, value.getContext()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PerformanceMetricEventData.Context.ScreenLoad value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getScreen() != null) {
                            Screen.ADAPTER.encodeWithTag(writer, 1, (int) value.getScreen());
                        }
                        if (value.getContext() != null) {
                            Context.ADAPTER.encodeWithTag(writer, 2, (int) value.getContext());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PerformanceMetricEventData.Context.ScreenLoad value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getContext() != null) {
                            Context.ADAPTER.encodeWithTag(writer, 2, (int) value.getContext());
                        }
                        if (value.getScreen() != null) {
                            Screen.ADAPTER.encodeWithTag(writer, 1, (int) value.getScreen());
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PerformanceMetricEventData.Context.ScreenLoad redact(PerformanceMetricEventData.Context.ScreenLoad value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        Screen screen = value.getScreen();
                        Screen screenRedact = screen != null ? Screen.ADAPTER.redact(screen) : null;
                        Context context = value.getContext();
                        return value.copy(screenRedact, context != null ? Context.ADAPTER.redact(context) : null, ByteString.EMPTY);
                    }
                };
            }
        }

        /* compiled from: PerformanceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$StreamLoad;", "Lcom/squareup/wire/Message;", "", "name", "", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Context;Lokio/ByteString;)V", "getName", "()Ljava/lang/String;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class StreamLoad extends Message {

            @JvmField
            public static final ProtoAdapter<StreamLoad> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.robinhood.rosetta.eventlogging.Context#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final com.robinhood.rosetta.eventlogging.Context context;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String name;

            public StreamLoad() {
                this(null, null, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m24480newBuilder();
            }

            public final String getName() {
                return this.name;
            }

            public /* synthetic */ StreamLoad(String str, com.robinhood.rosetta.eventlogging.Context context, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : context, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public final com.robinhood.rosetta.eventlogging.Context getContext() {
                return this.context;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StreamLoad(String name, com.robinhood.rosetta.eventlogging.Context context, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.name = name;
                this.context = context;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m24480newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof StreamLoad)) {
                    return false;
                }
                StreamLoad streamLoad = (StreamLoad) other;
                return Intrinsics.areEqual(unknownFields(), streamLoad.unknownFields()) && Intrinsics.areEqual(this.name, streamLoad.name) && Intrinsics.areEqual(this.context, streamLoad.context);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = ((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37;
                com.robinhood.rosetta.eventlogging.Context context = this.context;
                int iHashCode2 = iHashCode + (context != null ? context.hashCode() : 0);
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("name=" + Internal.sanitize(this.name));
                com.robinhood.rosetta.eventlogging.Context context = this.context;
                if (context != null) {
                    arrayList.add("context=" + context);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "StreamLoad{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ StreamLoad copy$default(StreamLoad streamLoad, String str, com.robinhood.rosetta.eventlogging.Context context, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = streamLoad.name;
                }
                if ((i & 2) != 0) {
                    context = streamLoad.context;
                }
                if ((i & 4) != 0) {
                    byteString = streamLoad.unknownFields();
                }
                return streamLoad.copy(str, context, byteString);
            }

            public final StreamLoad copy(String name, com.robinhood.rosetta.eventlogging.Context context, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new StreamLoad(name, context, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamLoad.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<StreamLoad>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$StreamLoad$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public PerformanceMetricEventData.Context.StreamLoad decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        Context contextDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new PerformanceMetricEventData.Context.StreamLoad(strDecode, contextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                contextDecode = Context.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PerformanceMetricEventData.Context.StreamLoad value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getName(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                        }
                        return value.getContext() != null ? size + Context.ADAPTER.encodedSizeWithTag(2, value.getContext()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PerformanceMetricEventData.Context.StreamLoad value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getName(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                        }
                        if (value.getContext() != null) {
                            Context.ADAPTER.encodeWithTag(writer, 2, (int) value.getContext());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PerformanceMetricEventData.Context.StreamLoad value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getContext() != null) {
                            Context.ADAPTER.encodeWithTag(writer, 2, (int) value.getContext());
                        }
                        if (Intrinsics.areEqual(value.getName(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PerformanceMetricEventData.Context.StreamLoad redact(PerformanceMetricEventData.Context.StreamLoad value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        Context context = value.getContext();
                        return PerformanceMetricEventData.Context.StreamLoad.copy$default(value, null, context != null ? Context.ADAPTER.redact(context) : null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }

        /* compiled from: PerformanceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$ComponentLoad;", "Lcom/squareup/wire/Message;", "", "event", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;Lokio/ByteString;)V", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ComponentLoad extends Message {

            @JvmField
            public static final ProtoAdapter<ComponentLoad> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.robinhood.rosetta.eventlogging.UserInteractionEventData#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final UserInteractionEventData event;

            /* JADX WARN: Multi-variable type inference failed */
            public ComponentLoad() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m24476newBuilder();
            }

            public final UserInteractionEventData getEvent() {
                return this.event;
            }

            public /* synthetic */ ComponentLoad(UserInteractionEventData userInteractionEventData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : userInteractionEventData, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ComponentLoad(UserInteractionEventData userInteractionEventData, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.event = userInteractionEventData;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m24476newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ComponentLoad)) {
                    return false;
                }
                ComponentLoad componentLoad = (ComponentLoad) other;
                return Intrinsics.areEqual(unknownFields(), componentLoad.unknownFields()) && Intrinsics.areEqual(this.event, componentLoad.event);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                UserInteractionEventData userInteractionEventData = this.event;
                int iHashCode2 = iHashCode + (userInteractionEventData != null ? userInteractionEventData.hashCode() : 0);
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                UserInteractionEventData userInteractionEventData = this.event;
                if (userInteractionEventData != null) {
                    arrayList.add("event=" + userInteractionEventData);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ComponentLoad{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ ComponentLoad copy$default(ComponentLoad componentLoad, UserInteractionEventData userInteractionEventData, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    userInteractionEventData = componentLoad.event;
                }
                if ((i & 2) != 0) {
                    byteString = componentLoad.unknownFields();
                }
                return componentLoad.copy(userInteractionEventData, byteString);
            }

            public final ComponentLoad copy(UserInteractionEventData event, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new ComponentLoad(event, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ComponentLoad.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<ComponentLoad>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$ComponentLoad$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public PerformanceMetricEventData.Context.ComponentLoad decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        UserInteractionEventData userInteractionEventDataDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new PerformanceMetricEventData.Context.ComponentLoad(userInteractionEventDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                userInteractionEventDataDecode = UserInteractionEventData.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PerformanceMetricEventData.Context.ComponentLoad value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return value.getEvent() != null ? size + UserInteractionEventData.ADAPTER.encodedSizeWithTag(1, value.getEvent()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PerformanceMetricEventData.Context.ComponentLoad value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getEvent() != null) {
                            UserInteractionEventData.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PerformanceMetricEventData.Context.ComponentLoad value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getEvent() != null) {
                            UserInteractionEventData.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent());
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PerformanceMetricEventData.Context.ComponentLoad redact(PerformanceMetricEventData.Context.ComponentLoad value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        UserInteractionEventData event = value.getEvent();
                        return value.copy(event != null ? UserInteractionEventData.ADAPTER.redact(event) : null, ByteString.EMPTY);
                    }
                };
            }
        }

        /* compiled from: PerformanceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad;", "Lcom/squareup/wire/Message;", "", "app_id", "", "microgram_app_version", "load_source", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad$LoadSource;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad$LoadSource;Lokio/ByteString;)V", "getApp_id", "()Ljava/lang/String;", "getMicrogram_app_version", "getLoad_source", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad$LoadSource;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "LoadSource", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MicrogramLoad extends Message {

            @JvmField
            public static final ProtoAdapter<MicrogramLoad> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String app_id;

            @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$MicrogramLoad$LoadSource#ADAPTER", jsonName = "loadSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final LoadSource load_source;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "microgramAppVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final String microgram_app_version;

            public MicrogramLoad() {
                this(null, null, null, null, 15, null);
            }

            public /* synthetic */ MicrogramLoad(String str, String str2, LoadSource loadSource, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? LoadSource.LOAD_SOURCE_UNSPECIFIED : loadSource, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m24477newBuilder();
            }

            public final String getApp_id() {
                return this.app_id;
            }

            public final String getMicrogram_app_version() {
                return this.microgram_app_version;
            }

            public final LoadSource getLoad_source() {
                return this.load_source;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MicrogramLoad(String app_id, String microgram_app_version, LoadSource load_source, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(app_id, "app_id");
                Intrinsics.checkNotNullParameter(microgram_app_version, "microgram_app_version");
                Intrinsics.checkNotNullParameter(load_source, "load_source");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.app_id = app_id;
                this.microgram_app_version = microgram_app_version;
                this.load_source = load_source;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m24477newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof MicrogramLoad)) {
                    return false;
                }
                MicrogramLoad microgramLoad = (MicrogramLoad) other;
                return Intrinsics.areEqual(unknownFields(), microgramLoad.unknownFields()) && Intrinsics.areEqual(this.app_id, microgramLoad.app_id) && Intrinsics.areEqual(this.microgram_app_version, microgramLoad.microgram_app_version) && this.load_source == microgramLoad.load_source;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((((unknownFields().hashCode() * 37) + this.app_id.hashCode()) * 37) + this.microgram_app_version.hashCode()) * 37) + this.load_source.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("app_id=" + Internal.sanitize(this.app_id));
                arrayList.add("microgram_app_version=" + Internal.sanitize(this.microgram_app_version));
                arrayList.add("load_source=" + this.load_source);
                return CollectionsKt.joinToString$default(arrayList, ", ", "MicrogramLoad{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ MicrogramLoad copy$default(MicrogramLoad microgramLoad, String str, String str2, LoadSource loadSource, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = microgramLoad.app_id;
                }
                if ((i & 2) != 0) {
                    str2 = microgramLoad.microgram_app_version;
                }
                if ((i & 4) != 0) {
                    loadSource = microgramLoad.load_source;
                }
                if ((i & 8) != 0) {
                    byteString = microgramLoad.unknownFields();
                }
                return microgramLoad.copy(str, str2, loadSource, byteString);
            }

            public final MicrogramLoad copy(String app_id, String microgram_app_version, LoadSource load_source, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(app_id, "app_id");
                Intrinsics.checkNotNullParameter(microgram_app_version, "microgram_app_version");
                Intrinsics.checkNotNullParameter(load_source, "load_source");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new MicrogramLoad(app_id, microgram_app_version, load_source, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MicrogramLoad.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<MicrogramLoad>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$MicrogramLoad$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PerformanceMetricEventData.Context.MicrogramLoad value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getApp_id(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getApp_id());
                        }
                        if (!Intrinsics.areEqual(value.getMicrogram_app_version(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMicrogram_app_version());
                        }
                        return value.getLoad_source() != PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.LOAD_SOURCE_UNSPECIFIED ? size + PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.ADAPTER.encodedSizeWithTag(3, value.getLoad_source()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PerformanceMetricEventData.Context.MicrogramLoad value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getApp_id(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getApp_id());
                        }
                        if (!Intrinsics.areEqual(value.getMicrogram_app_version(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMicrogram_app_version());
                        }
                        if (value.getLoad_source() != PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.LOAD_SOURCE_UNSPECIFIED) {
                            PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.ADAPTER.encodeWithTag(writer, 3, (int) value.getLoad_source());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PerformanceMetricEventData.Context.MicrogramLoad value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getLoad_source() != PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.LOAD_SOURCE_UNSPECIFIED) {
                            PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.ADAPTER.encodeWithTag(writer, 3, (int) value.getLoad_source());
                        }
                        if (!Intrinsics.areEqual(value.getMicrogram_app_version(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMicrogram_app_version());
                        }
                        if (Intrinsics.areEqual(value.getApp_id(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getApp_id());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public PerformanceMetricEventData.Context.MicrogramLoad decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        PerformanceMetricEventData.Context.MicrogramLoad.LoadSource loadSourceDecode = PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.LOAD_SOURCE_UNSPECIFIED;
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        String strDecode2 = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new PerformanceMetricEventData.Context.MicrogramLoad(strDecode, strDecode2, loadSourceDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                try {
                                    loadSourceDecode = PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PerformanceMetricEventData.Context.MicrogramLoad redact(PerformanceMetricEventData.Context.MicrogramLoad value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return PerformanceMetricEventData.Context.MicrogramLoad.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }
                };
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: PerformanceMetricEventData.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad$LoadSource;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOAD_SOURCE_UNSPECIFIED", "REMOTE", "CACHED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class LoadSource implements WireEnum {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ LoadSource[] $VALUES;

                @JvmField
                public static final ProtoAdapter<LoadSource> ADAPTER;
                public static final LoadSource CACHED;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final LoadSource LOAD_SOURCE_UNSPECIFIED;
                public static final LoadSource REMOTE;
                private final int value;

                private static final /* synthetic */ LoadSource[] $values() {
                    return new LoadSource[]{LOAD_SOURCE_UNSPECIFIED, REMOTE, CACHED};
                }

                @JvmStatic
                public static final LoadSource fromValue(int i) {
                    return INSTANCE.fromValue(i);
                }

                public static EnumEntries<LoadSource> getEntries() {
                    return $ENTRIES;
                }

                private LoadSource(String str, int i, int i2) {
                    this.value = i2;
                }

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                static {
                    final LoadSource loadSource = new LoadSource("LOAD_SOURCE_UNSPECIFIED", 0, 0);
                    LOAD_SOURCE_UNSPECIFIED = loadSource;
                    REMOTE = new LoadSource("REMOTE", 1, 1);
                    CACHED = new LoadSource("CACHED", 2, 2);
                    LoadSource[] loadSourceArr$values = $values();
                    $VALUES = loadSourceArr$values;
                    $ENTRIES = EnumEntries2.enumEntries(loadSourceArr$values);
                    INSTANCE = new Companion(null);
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LoadSource.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new EnumAdapter<LoadSource>(orCreateKotlinClass, syntax, loadSource) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Context$MicrogramLoad$LoadSource$Companion$ADAPTER$1
                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.squareup.wire.EnumAdapter
                        public PerformanceMetricEventData.Context.MicrogramLoad.LoadSource fromValue(int value) {
                            return PerformanceMetricEventData.Context.MicrogramLoad.LoadSource.INSTANCE.fromValue(value);
                        }
                    };
                }

                /* compiled from: PerformanceMetricEventData.kt */
                @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad$LoadSource$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context$MicrogramLoad$LoadSource;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    @JvmStatic
                    public final LoadSource fromValue(int value) {
                        if (value == 0) {
                            return LoadSource.LOAD_SOURCE_UNSPECIFIED;
                        }
                        if (value == 1) {
                            return LoadSource.REMOTE;
                        }
                        if (value != 2) {
                            return null;
                        }
                        return LoadSource.CACHED;
                    }
                }

                public static LoadSource valueOf(String str) {
                    return (LoadSource) Enum.valueOf(LoadSource.class, str);
                }

                public static LoadSource[] values() {
                    return (LoadSource[]) $VALUES.clone();
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SOURCE_UNSPECIFIED", "SOURCE_HOME", "SOURCE_SEARCH", "SOURCE_STOCK_DETAIL", "SOURCE_DEEPLINK", "SOURCE_PUSH_NOTIFICATION", "SOURCE_OPTION_CHAIN", "SOURCE_OPTION_ORDER_FORM", "SOURCE_OPTION_WATCHLIST_HUB", "SOURCE_OPTION_STRATEGY_CHAIN", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Source implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Source> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Source SOURCE_DEEPLINK;
        public static final Source SOURCE_HOME;
        public static final Source SOURCE_OPTION_CHAIN;
        public static final Source SOURCE_OPTION_ORDER_FORM;
        public static final Source SOURCE_OPTION_STRATEGY_CHAIN;
        public static final Source SOURCE_OPTION_WATCHLIST_HUB;
        public static final Source SOURCE_PUSH_NOTIFICATION;
        public static final Source SOURCE_SEARCH;
        public static final Source SOURCE_STOCK_DETAIL;
        public static final Source SOURCE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{SOURCE_UNSPECIFIED, SOURCE_HOME, SOURCE_SEARCH, SOURCE_STOCK_DETAIL, SOURCE_DEEPLINK, SOURCE_PUSH_NOTIFICATION, SOURCE_OPTION_CHAIN, SOURCE_OPTION_ORDER_FORM, SOURCE_OPTION_WATCHLIST_HUB, SOURCE_OPTION_STRATEGY_CHAIN};
        }

        @JvmStatic
        public static final Source fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Source> getEntries() {
            return $ENTRIES;
        }

        private Source(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Source source = new Source("SOURCE_UNSPECIFIED", 0, 0);
            SOURCE_UNSPECIFIED = source;
            SOURCE_HOME = new Source("SOURCE_HOME", 1, 1);
            SOURCE_SEARCH = new Source("SOURCE_SEARCH", 2, 2);
            SOURCE_STOCK_DETAIL = new Source("SOURCE_STOCK_DETAIL", 3, 3);
            SOURCE_DEEPLINK = new Source("SOURCE_DEEPLINK", 4, 4);
            SOURCE_PUSH_NOTIFICATION = new Source("SOURCE_PUSH_NOTIFICATION", 5, 5);
            SOURCE_OPTION_CHAIN = new Source("SOURCE_OPTION_CHAIN", 6, 6);
            SOURCE_OPTION_ORDER_FORM = new Source("SOURCE_OPTION_ORDER_FORM", 7, 7);
            SOURCE_OPTION_WATCHLIST_HUB = new Source("SOURCE_OPTION_WATCHLIST_HUB", 8, 8);
            SOURCE_OPTION_STRATEGY_CHAIN = new Source("SOURCE_OPTION_STRATEGY_CHAIN", 9, 9);
            Source[] sourceArr$values = $values();
            $VALUES = sourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Source.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Source>(orCreateKotlinClass, syntax, source) { // from class: com.robinhood.rosetta.eventlogging.PerformanceMetricEventData$Source$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerformanceMetricEventData.Source fromValue(int value) {
                    return PerformanceMetricEventData.Source.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerformanceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Source fromValue(int value) {
                switch (value) {
                    case 0:
                        return Source.SOURCE_UNSPECIFIED;
                    case 1:
                        return Source.SOURCE_HOME;
                    case 2:
                        return Source.SOURCE_SEARCH;
                    case 3:
                        return Source.SOURCE_STOCK_DETAIL;
                    case 4:
                        return Source.SOURCE_DEEPLINK;
                    case 5:
                        return Source.SOURCE_PUSH_NOTIFICATION;
                    case 6:
                        return Source.SOURCE_OPTION_CHAIN;
                    case 7:
                        return Source.SOURCE_OPTION_ORDER_FORM;
                    case 8:
                        return Source.SOURCE_OPTION_WATCHLIST_HUB;
                    case 9:
                        return Source.SOURCE_OPTION_STRATEGY_CHAIN;
                    default:
                        return null;
                }
            }
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }
}
