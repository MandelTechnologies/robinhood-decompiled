package com.robinhood.copilot.proto.p286v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: GetPortfolioDigestsChartParamsInternalResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BE\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JK\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponse;", "Lcom/squareup/wire/Message;", "", "", "", "benchmark_ids", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "chart_starting_ts", "chart_ending_ts", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/GetPortfolioDigestsChartParamsInternalResponse;", "Lj$/time/Instant;", "getChart_starting_ts", "()Lj$/time/Instant;", "getChart_ending_ts", "Ljava/util/List;", "getBenchmark_ids", "()Ljava/util/List;", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetPortfolioDigestsChartParamsInternalResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetPortfolioDigestsChartParamsInternalResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "benchmarkIds", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> benchmark_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "chartEndingTs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant chart_ending_ts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "chartStartingTs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant chart_starting_ts;

    public GetPortfolioDigestsChartParamsInternalResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22140newBuilder();
    }

    public /* synthetic */ GetPortfolioDigestsChartParamsInternalResponse(List list, Instant instant, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getChart_starting_ts() {
        return this.chart_starting_ts;
    }

    public final Instant getChart_ending_ts() {
        return this.chart_ending_ts;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPortfolioDigestsChartParamsInternalResponse(List<String> benchmark_ids, Instant instant, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(benchmark_ids, "benchmark_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.chart_starting_ts = instant;
        this.chart_ending_ts = instant2;
        this.benchmark_ids = Internal.immutableCopyOf("benchmark_ids", benchmark_ids);
    }

    public final List<String> getBenchmark_ids() {
        return this.benchmark_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22140newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetPortfolioDigestsChartParamsInternalResponse)) {
            return false;
        }
        GetPortfolioDigestsChartParamsInternalResponse getPortfolioDigestsChartParamsInternalResponse = (GetPortfolioDigestsChartParamsInternalResponse) other;
        return Intrinsics.areEqual(unknownFields(), getPortfolioDigestsChartParamsInternalResponse.unknownFields()) && Intrinsics.areEqual(this.benchmark_ids, getPortfolioDigestsChartParamsInternalResponse.benchmark_ids) && Intrinsics.areEqual(this.chart_starting_ts, getPortfolioDigestsChartParamsInternalResponse.chart_starting_ts) && Intrinsics.areEqual(this.chart_ending_ts, getPortfolioDigestsChartParamsInternalResponse.chart_ending_ts);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.benchmark_ids.hashCode()) * 37;
        Instant instant = this.chart_starting_ts;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.chart_ending_ts;
        int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.benchmark_ids.isEmpty()) {
            arrayList.add("benchmark_ids=" + Internal.sanitize(this.benchmark_ids));
        }
        Instant instant = this.chart_starting_ts;
        if (instant != null) {
            arrayList.add("chart_starting_ts=" + instant);
        }
        Instant instant2 = this.chart_ending_ts;
        if (instant2 != null) {
            arrayList.add("chart_ending_ts=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPortfolioDigestsChartParamsInternalResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetPortfolioDigestsChartParamsInternalResponse copy$default(GetPortfolioDigestsChartParamsInternalResponse getPortfolioDigestsChartParamsInternalResponse, List list, Instant instant, Instant instant2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getPortfolioDigestsChartParamsInternalResponse.benchmark_ids;
        }
        if ((i & 2) != 0) {
            instant = getPortfolioDigestsChartParamsInternalResponse.chart_starting_ts;
        }
        if ((i & 4) != 0) {
            instant2 = getPortfolioDigestsChartParamsInternalResponse.chart_ending_ts;
        }
        if ((i & 8) != 0) {
            byteString = getPortfolioDigestsChartParamsInternalResponse.unknownFields();
        }
        return getPortfolioDigestsChartParamsInternalResponse.copy(list, instant, instant2, byteString);
    }

    public final GetPortfolioDigestsChartParamsInternalResponse copy(List<String> benchmark_ids, Instant chart_starting_ts, Instant chart_ending_ts, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(benchmark_ids, "benchmark_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetPortfolioDigestsChartParamsInternalResponse(benchmark_ids, chart_starting_ts, chart_ending_ts, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetPortfolioDigestsChartParamsInternalResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetPortfolioDigestsChartParamsInternalResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetPortfolioDigestsChartParamsInternalResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetPortfolioDigestsChartParamsInternalResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.getBenchmark_ids());
                if (value.getChart_starting_ts() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getChart_starting_ts());
                }
                return value.getChart_ending_ts() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getChart_ending_ts()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetPortfolioDigestsChartParamsInternalResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getBenchmark_ids());
                if (value.getChart_starting_ts() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getChart_starting_ts());
                }
                if (value.getChart_ending_ts() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getChart_ending_ts());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetPortfolioDigestsChartParamsInternalResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getChart_ending_ts() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getChart_ending_ts());
                }
                if (value.getChart_starting_ts() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getChart_starting_ts());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getBenchmark_ids());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetPortfolioDigestsChartParamsInternalResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetPortfolioDigestsChartParamsInternalResponse(arrayList, instantDecode, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetPortfolioDigestsChartParamsInternalResponse redact(GetPortfolioDigestsChartParamsInternalResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant chart_starting_ts = value.getChart_starting_ts();
                Instant instantRedact = chart_starting_ts != null ? ProtoAdapter.INSTANT.redact(chart_starting_ts) : null;
                Instant chart_ending_ts = value.getChart_ending_ts();
                return GetPortfolioDigestsChartParamsInternalResponse.copy$default(value, null, instantRedact, chart_ending_ts != null ? ProtoAdapter.INSTANT.redact(chart_ending_ts) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
