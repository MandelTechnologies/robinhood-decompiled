package bff_money_movement.service.p019v1;

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

/* compiled from: InvestmentsTrackerComponentPerformanceGraphData.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphData;", "Lcom/squareup/wire/Message;", "", "type", "Lbff_money_movement/service/v1/InvestmentsTrackerGraphType;", "lines", "", "Lbff_money_movement/service/v1/InvestmentsTrackerPerformanceChartLine;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerGraphType;Ljava/util/List;Lokio/ByteString;)V", "getType", "()Lbff_money_movement/service/v1/InvestmentsTrackerGraphType;", "getLines", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentPerformanceGraphData extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponentPerformanceGraphData> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerPerformanceChartLine#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<InvestmentsTrackerPerformanceChartLine> lines;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerGraphType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final InvestmentsTrackerGraphType type;

    public InvestmentsTrackerComponentPerformanceGraphData() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8463newBuilder();
    }

    public final InvestmentsTrackerGraphType getType() {
        return this.type;
    }

    public /* synthetic */ InvestmentsTrackerComponentPerformanceGraphData(InvestmentsTrackerGraphType investmentsTrackerGraphType, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InvestmentsTrackerGraphType.GRAPH_UNSPECIFIED : investmentsTrackerGraphType, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentPerformanceGraphData(InvestmentsTrackerGraphType type2, List<InvestmentsTrackerPerformanceChartLine> lines, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.lines = Internal.immutableCopyOf("lines", lines);
    }

    public final List<InvestmentsTrackerPerformanceChartLine> getLines() {
        return this.lines;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8463newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerComponentPerformanceGraphData)) {
            return false;
        }
        InvestmentsTrackerComponentPerformanceGraphData investmentsTrackerComponentPerformanceGraphData = (InvestmentsTrackerComponentPerformanceGraphData) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerComponentPerformanceGraphData.unknownFields()) && this.type == investmentsTrackerComponentPerformanceGraphData.type && Intrinsics.areEqual(this.lines, investmentsTrackerComponentPerformanceGraphData.lines);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.lines.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        if (!this.lines.isEmpty()) {
            arrayList.add("lines=" + this.lines);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerComponentPerformanceGraphData{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestmentsTrackerComponentPerformanceGraphData copy$default(InvestmentsTrackerComponentPerformanceGraphData investmentsTrackerComponentPerformanceGraphData, InvestmentsTrackerGraphType investmentsTrackerGraphType, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerGraphType = investmentsTrackerComponentPerformanceGraphData.type;
        }
        if ((i & 2) != 0) {
            list = investmentsTrackerComponentPerformanceGraphData.lines;
        }
        if ((i & 4) != 0) {
            byteString = investmentsTrackerComponentPerformanceGraphData.unknownFields();
        }
        return investmentsTrackerComponentPerformanceGraphData.copy(investmentsTrackerGraphType, list, byteString);
    }

    public final InvestmentsTrackerComponentPerformanceGraphData copy(InvestmentsTrackerGraphType type2, List<InvestmentsTrackerPerformanceChartLine> lines, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerComponentPerformanceGraphData(type2, lines, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponentPerformanceGraphData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerComponentPerformanceGraphData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentPerformanceGraphData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerComponentPerformanceGraphData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != InvestmentsTrackerGraphType.GRAPH_UNSPECIFIED) {
                    size += InvestmentsTrackerGraphType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                return size + InvestmentsTrackerPerformanceChartLine.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getLines());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerComponentPerformanceGraphData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != InvestmentsTrackerGraphType.GRAPH_UNSPECIFIED) {
                    InvestmentsTrackerGraphType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                InvestmentsTrackerPerformanceChartLine.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getLines());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerComponentPerformanceGraphData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                InvestmentsTrackerPerformanceChartLine.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getLines());
                if (value.getType() != InvestmentsTrackerGraphType.GRAPH_UNSPECIFIED) {
                    InvestmentsTrackerGraphType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentPerformanceGraphData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InvestmentsTrackerGraphType investmentsTrackerGraphTypeDecode = InvestmentsTrackerGraphType.GRAPH_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerComponentPerformanceGraphData(investmentsTrackerGraphTypeDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            investmentsTrackerGraphTypeDecode = InvestmentsTrackerGraphType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        arrayList.add(InvestmentsTrackerPerformanceChartLine.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentPerformanceGraphData redact(InvestmentsTrackerComponentPerformanceGraphData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerComponentPerformanceGraphData.copy$default(value, null, Internal.m26823redactElements(value.getLines(), InvestmentsTrackerPerformanceChartLine.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
