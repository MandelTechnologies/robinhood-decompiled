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

/* compiled from: InvestmentsTrackerComponentPerformanceChartDetails.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\fH\u0016JV\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006#"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceChartDetails;", "Lcom/squareup/wire/Message;", "", "primary_graph_data", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphData;", "scrub_points", "", "Lbff_money_movement/service/v1/InvestmentsTrackerScrubPoint;", "rule_marks", "Lbff_money_movement/service/v1/InvestmentsTrackerRuleMark;", "dynamic_graph_data", "span", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getPrimary_graph_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentPerformanceGraphData;", "getSpan", "()Ljava/lang/String;", "getScrub_points", "()Ljava/util/List;", "getRule_marks", "getDynamic_graph_data", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentPerformanceChartDetails extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponentPerformanceChartDetails> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentPerformanceGraphData#ADAPTER", jsonName = "dynamicGraphData", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<InvestmentsTrackerComponentPerformanceGraphData> dynamic_graph_data;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentPerformanceGraphData#ADAPTER", jsonName = "primaryGraphData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final InvestmentsTrackerComponentPerformanceGraphData primary_graph_data;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerRuleMark#ADAPTER", jsonName = "ruleMarks", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<InvestmentsTrackerRuleMark> rule_marks;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerScrubPoint#ADAPTER", jsonName = "scrubPoints", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<InvestmentsTrackerScrubPoint> scrub_points;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String span;

    public InvestmentsTrackerComponentPerformanceChartDetails() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8462newBuilder();
    }

    public final InvestmentsTrackerComponentPerformanceGraphData getPrimary_graph_data() {
        return this.primary_graph_data;
    }

    public /* synthetic */ InvestmentsTrackerComponentPerformanceChartDetails(InvestmentsTrackerComponentPerformanceGraphData investmentsTrackerComponentPerformanceGraphData, List list, List list2, List list3, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investmentsTrackerComponentPerformanceGraphData, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getSpan() {
        return this.span;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentPerformanceChartDetails(InvestmentsTrackerComponentPerformanceGraphData investmentsTrackerComponentPerformanceGraphData, List<InvestmentsTrackerScrubPoint> scrub_points, List<InvestmentsTrackerRuleMark> rule_marks, List<InvestmentsTrackerComponentPerformanceGraphData> dynamic_graph_data, String span, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(scrub_points, "scrub_points");
        Intrinsics.checkNotNullParameter(rule_marks, "rule_marks");
        Intrinsics.checkNotNullParameter(dynamic_graph_data, "dynamic_graph_data");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.primary_graph_data = investmentsTrackerComponentPerformanceGraphData;
        this.span = span;
        this.scrub_points = Internal.immutableCopyOf("scrub_points", scrub_points);
        this.rule_marks = Internal.immutableCopyOf("rule_marks", rule_marks);
        this.dynamic_graph_data = Internal.immutableCopyOf("dynamic_graph_data", dynamic_graph_data);
    }

    public final List<InvestmentsTrackerScrubPoint> getScrub_points() {
        return this.scrub_points;
    }

    public final List<InvestmentsTrackerRuleMark> getRule_marks() {
        return this.rule_marks;
    }

    public final List<InvestmentsTrackerComponentPerformanceGraphData> getDynamic_graph_data() {
        return this.dynamic_graph_data;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8462newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerComponentPerformanceChartDetails)) {
            return false;
        }
        InvestmentsTrackerComponentPerformanceChartDetails investmentsTrackerComponentPerformanceChartDetails = (InvestmentsTrackerComponentPerformanceChartDetails) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerComponentPerformanceChartDetails.unknownFields()) && Intrinsics.areEqual(this.primary_graph_data, investmentsTrackerComponentPerformanceChartDetails.primary_graph_data) && Intrinsics.areEqual(this.scrub_points, investmentsTrackerComponentPerformanceChartDetails.scrub_points) && Intrinsics.areEqual(this.rule_marks, investmentsTrackerComponentPerformanceChartDetails.rule_marks) && Intrinsics.areEqual(this.dynamic_graph_data, investmentsTrackerComponentPerformanceChartDetails.dynamic_graph_data) && Intrinsics.areEqual(this.span, investmentsTrackerComponentPerformanceChartDetails.span);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        InvestmentsTrackerComponentPerformanceGraphData investmentsTrackerComponentPerformanceGraphData = this.primary_graph_data;
        int iHashCode2 = ((((((((iHashCode + (investmentsTrackerComponentPerformanceGraphData != null ? investmentsTrackerComponentPerformanceGraphData.hashCode() : 0)) * 37) + this.scrub_points.hashCode()) * 37) + this.rule_marks.hashCode()) * 37) + this.dynamic_graph_data.hashCode()) * 37) + this.span.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        InvestmentsTrackerComponentPerformanceGraphData investmentsTrackerComponentPerformanceGraphData = this.primary_graph_data;
        if (investmentsTrackerComponentPerformanceGraphData != null) {
            arrayList.add("primary_graph_data=" + investmentsTrackerComponentPerformanceGraphData);
        }
        if (!this.scrub_points.isEmpty()) {
            arrayList.add("scrub_points=" + this.scrub_points);
        }
        if (!this.rule_marks.isEmpty()) {
            arrayList.add("rule_marks=" + this.rule_marks);
        }
        if (!this.dynamic_graph_data.isEmpty()) {
            arrayList.add("dynamic_graph_data=" + this.dynamic_graph_data);
        }
        arrayList.add("span=" + Internal.sanitize(this.span));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerComponentPerformanceChartDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerComponentPerformanceChartDetails copy$default(InvestmentsTrackerComponentPerformanceChartDetails investmentsTrackerComponentPerformanceChartDetails, InvestmentsTrackerComponentPerformanceGraphData investmentsTrackerComponentPerformanceGraphData, List list, List list2, List list3, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentsTrackerComponentPerformanceGraphData = investmentsTrackerComponentPerformanceChartDetails.primary_graph_data;
        }
        if ((i & 2) != 0) {
            list = investmentsTrackerComponentPerformanceChartDetails.scrub_points;
        }
        if ((i & 4) != 0) {
            list2 = investmentsTrackerComponentPerformanceChartDetails.rule_marks;
        }
        if ((i & 8) != 0) {
            list3 = investmentsTrackerComponentPerformanceChartDetails.dynamic_graph_data;
        }
        if ((i & 16) != 0) {
            str = investmentsTrackerComponentPerformanceChartDetails.span;
        }
        if ((i & 32) != 0) {
            byteString = investmentsTrackerComponentPerformanceChartDetails.unknownFields();
        }
        String str2 = str;
        ByteString byteString2 = byteString;
        return investmentsTrackerComponentPerformanceChartDetails.copy(investmentsTrackerComponentPerformanceGraphData, list, list2, list3, str2, byteString2);
    }

    public final InvestmentsTrackerComponentPerformanceChartDetails copy(InvestmentsTrackerComponentPerformanceGraphData primary_graph_data, List<InvestmentsTrackerScrubPoint> scrub_points, List<InvestmentsTrackerRuleMark> rule_marks, List<InvestmentsTrackerComponentPerformanceGraphData> dynamic_graph_data, String span, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(scrub_points, "scrub_points");
        Intrinsics.checkNotNullParameter(rule_marks, "rule_marks");
        Intrinsics.checkNotNullParameter(dynamic_graph_data, "dynamic_graph_data");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerComponentPerformanceChartDetails(primary_graph_data, scrub_points, rule_marks, dynamic_graph_data, span, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponentPerformanceChartDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerComponentPerformanceChartDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentPerformanceChartDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerComponentPerformanceChartDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPrimary_graph_data() != null) {
                    size += InvestmentsTrackerComponentPerformanceGraphData.ADAPTER.encodedSizeWithTag(1, value.getPrimary_graph_data());
                }
                int iEncodedSizeWithTag = size + InvestmentsTrackerScrubPoint.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getScrub_points()) + InvestmentsTrackerRuleMark.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getRule_marks()) + InvestmentsTrackerComponentPerformanceGraphData.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getDynamic_graph_data());
                return !Intrinsics.areEqual(value.getSpan(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSpan()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerComponentPerformanceChartDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPrimary_graph_data() != null) {
                    InvestmentsTrackerComponentPerformanceGraphData.ADAPTER.encodeWithTag(writer, 1, (int) value.getPrimary_graph_data());
                }
                InvestmentsTrackerScrubPoint.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getScrub_points());
                InvestmentsTrackerRuleMark.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getRule_marks());
                InvestmentsTrackerComponentPerformanceGraphData.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getDynamic_graph_data());
                if (!Intrinsics.areEqual(value.getSpan(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSpan());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerComponentPerformanceChartDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSpan(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSpan());
                }
                ProtoAdapter<InvestmentsTrackerComponentPerformanceGraphData> protoAdapter = InvestmentsTrackerComponentPerformanceGraphData.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getDynamic_graph_data());
                InvestmentsTrackerRuleMark.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getRule_marks());
                InvestmentsTrackerScrubPoint.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getScrub_points());
                if (value.getPrimary_graph_data() != null) {
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getPrimary_graph_data());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentPerformanceChartDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                InvestmentsTrackerComponentPerformanceGraphData investmentsTrackerComponentPerformanceGraphDataDecode = null;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerComponentPerformanceChartDetails(investmentsTrackerComponentPerformanceGraphDataDecode, arrayList, arrayList2, arrayList3, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        investmentsTrackerComponentPerformanceGraphDataDecode = InvestmentsTrackerComponentPerformanceGraphData.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(InvestmentsTrackerScrubPoint.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList2.add(InvestmentsTrackerRuleMark.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        arrayList3.add(InvestmentsTrackerComponentPerformanceGraphData.ADAPTER.decode(reader));
                    } else if (iNextTag == 5) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentPerformanceChartDetails redact(InvestmentsTrackerComponentPerformanceChartDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                InvestmentsTrackerComponentPerformanceGraphData primary_graph_data = value.getPrimary_graph_data();
                return InvestmentsTrackerComponentPerformanceChartDetails.copy$default(value, primary_graph_data != null ? InvestmentsTrackerComponentPerformanceGraphData.ADAPTER.redact(primary_graph_data) : null, Internal.m26823redactElements(value.getScrub_points(), InvestmentsTrackerScrubPoint.ADAPTER), Internal.m26823redactElements(value.getRule_marks(), InvestmentsTrackerRuleMark.ADAPTER), Internal.m26823redactElements(value.getDynamic_graph_data(), InvestmentsTrackerComponentPerformanceGraphData.ADAPTER), null, ByteString.EMPTY, 16, null);
            }
        };
    }
}
