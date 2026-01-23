package yoda.service.dashboard;

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

/* compiled from: ProjectedValues.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBQ\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016JP\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lyoda/service/dashboard/ProjectedValues;", "Lcom/squareup/wire/Message;", "", "percentile_5", "", "Lyoda/service/dashboard/YearlyProjectedValues;", "median", "percentile_95", "net_deposits", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getPercentile_5", "()Ljava/util/List;", "getMedian", "getPercentile_95", "getNet_deposits", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ProjectedValues extends Message {

    @JvmField
    public static final ProtoAdapter<ProjectedValues> ADAPTER;

    @WireField(adapter = "yoda.service.dashboard.YearlyProjectedValues#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<YearlyProjectedValues> median;

    @WireField(adapter = "yoda.service.dashboard.YearlyProjectedValues#ADAPTER", jsonName = "netDeposits", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<YearlyProjectedValues> net_deposits;

    @WireField(adapter = "yoda.service.dashboard.YearlyProjectedValues#ADAPTER", jsonName = "percentile5", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<YearlyProjectedValues> percentile_5;

    @WireField(adapter = "yoda.service.dashboard.YearlyProjectedValues#ADAPTER", jsonName = "percentile95", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<YearlyProjectedValues> percentile_95;

    public ProjectedValues() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30104newBuilder();
    }

    public /* synthetic */ ProjectedValues(List list, List list2, List list3, List list4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt.emptyList() : list4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProjectedValues(List<YearlyProjectedValues> percentile_5, List<YearlyProjectedValues> median, List<YearlyProjectedValues> percentile_95, List<YearlyProjectedValues> net_deposits, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(percentile_5, "percentile_5");
        Intrinsics.checkNotNullParameter(median, "median");
        Intrinsics.checkNotNullParameter(percentile_95, "percentile_95");
        Intrinsics.checkNotNullParameter(net_deposits, "net_deposits");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.percentile_5 = Internal.immutableCopyOf("percentile_5", percentile_5);
        this.median = Internal.immutableCopyOf("median", median);
        this.percentile_95 = Internal.immutableCopyOf("percentile_95", percentile_95);
        this.net_deposits = Internal.immutableCopyOf("net_deposits", net_deposits);
    }

    public final List<YearlyProjectedValues> getPercentile_5() {
        return this.percentile_5;
    }

    public final List<YearlyProjectedValues> getMedian() {
        return this.median;
    }

    public final List<YearlyProjectedValues> getPercentile_95() {
        return this.percentile_95;
    }

    public final List<YearlyProjectedValues> getNet_deposits() {
        return this.net_deposits;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30104newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ProjectedValues)) {
            return false;
        }
        ProjectedValues projectedValues = (ProjectedValues) other;
        return Intrinsics.areEqual(unknownFields(), projectedValues.unknownFields()) && Intrinsics.areEqual(this.percentile_5, projectedValues.percentile_5) && Intrinsics.areEqual(this.median, projectedValues.median) && Intrinsics.areEqual(this.percentile_95, projectedValues.percentile_95) && Intrinsics.areEqual(this.net_deposits, projectedValues.net_deposits);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.percentile_5.hashCode()) * 37) + this.median.hashCode()) * 37) + this.percentile_95.hashCode()) * 37) + this.net_deposits.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.percentile_5.isEmpty()) {
            arrayList.add("percentile_5=" + this.percentile_5);
        }
        if (!this.median.isEmpty()) {
            arrayList.add("median=" + this.median);
        }
        if (!this.percentile_95.isEmpty()) {
            arrayList.add("percentile_95=" + this.percentile_95);
        }
        if (!this.net_deposits.isEmpty()) {
            arrayList.add("net_deposits=" + this.net_deposits);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProjectedValues{", "}", 0, null, null, 56, null);
    }

    public final ProjectedValues copy(List<YearlyProjectedValues> percentile_5, List<YearlyProjectedValues> median, List<YearlyProjectedValues> percentile_95, List<YearlyProjectedValues> net_deposits, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(percentile_5, "percentile_5");
        Intrinsics.checkNotNullParameter(median, "median");
        Intrinsics.checkNotNullParameter(percentile_95, "percentile_95");
        Intrinsics.checkNotNullParameter(net_deposits, "net_deposits");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ProjectedValues(percentile_5, median, percentile_95, net_deposits, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ProjectedValues.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ProjectedValues>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: yoda.service.dashboard.ProjectedValues$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ProjectedValues value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<YearlyProjectedValues> protoAdapter = YearlyProjectedValues.ADAPTER;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getPercentile_5()) + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getMedian()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getPercentile_95()) + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getNet_deposits());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ProjectedValues value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<YearlyProjectedValues> protoAdapter = YearlyProjectedValues.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getPercentile_5());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getMedian());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getPercentile_95());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getNet_deposits());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ProjectedValues value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<YearlyProjectedValues> protoAdapter = YearlyProjectedValues.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getNet_deposits());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getPercentile_95());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getMedian());
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getPercentile_5());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ProjectedValues decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ProjectedValues(arrayList, arrayList2, arrayList3, arrayList4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(YearlyProjectedValues.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        arrayList2.add(YearlyProjectedValues.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList3.add(YearlyProjectedValues.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        arrayList4.add(YearlyProjectedValues.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ProjectedValues redact(ProjectedValues value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<YearlyProjectedValues> percentile_5 = value.getPercentile_5();
                ProtoAdapter<YearlyProjectedValues> protoAdapter = YearlyProjectedValues.ADAPTER;
                return value.copy(Internal.m26823redactElements(percentile_5, protoAdapter), Internal.m26823redactElements(value.getMedian(), protoAdapter), Internal.m26823redactElements(value.getPercentile_95(), protoAdapter), Internal.m26823redactElements(value.getNet_deposits(), protoAdapter), ByteString.EMPTY);
            }
        };
    }
}
