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

/* compiled from: TopAnalystPriceTargets.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016JJ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargets;", "Lcom/squareup/wire/Message;", "", "total_analysts", "", "highest", "", "Lcom/robinhood/copilot/proto/v1/AnalystPriceTarget;", "median", "lowest", "unknownFields", "Lokio/ByteString;", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getTotal_analysts", "()I", "getHighest", "()Ljava/util/List;", "getMedian", "getLowest", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class TopAnalystPriceTargets extends Message {

    @JvmField
    public static final ProtoAdapter<TopAnalystPriceTargets> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.AnalystPriceTarget#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<AnalystPriceTarget> highest;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.AnalystPriceTarget#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<AnalystPriceTarget> lowest;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.AnalystPriceTarget#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<AnalystPriceTarget> median;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalAnalysts", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int total_analysts;

    public TopAnalystPriceTargets() {
        this(0, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22175newBuilder();
    }

    public final int getTotal_analysts() {
        return this.total_analysts;
    }

    public /* synthetic */ TopAnalystPriceTargets(int i, List list, List list2, List list3, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list3, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAnalystPriceTargets(int i, List<AnalystPriceTarget> highest, List<AnalystPriceTarget> median, List<AnalystPriceTarget> lowest, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(highest, "highest");
        Intrinsics.checkNotNullParameter(median, "median");
        Intrinsics.checkNotNullParameter(lowest, "lowest");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_analysts = i;
        this.highest = Internal.immutableCopyOf("highest", highest);
        this.median = Internal.immutableCopyOf("median", median);
        this.lowest = Internal.immutableCopyOf("lowest", lowest);
    }

    public final List<AnalystPriceTarget> getHighest() {
        return this.highest;
    }

    public final List<AnalystPriceTarget> getMedian() {
        return this.median;
    }

    public final List<AnalystPriceTarget> getLowest() {
        return this.lowest;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22175newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TopAnalystPriceTargets)) {
            return false;
        }
        TopAnalystPriceTargets topAnalystPriceTargets = (TopAnalystPriceTargets) other;
        return Intrinsics.areEqual(unknownFields(), topAnalystPriceTargets.unknownFields()) && this.total_analysts == topAnalystPriceTargets.total_analysts && Intrinsics.areEqual(this.highest, topAnalystPriceTargets.highest) && Intrinsics.areEqual(this.median, topAnalystPriceTargets.median) && Intrinsics.areEqual(this.lowest, topAnalystPriceTargets.lowest);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.total_analysts)) * 37) + this.highest.hashCode()) * 37) + this.median.hashCode()) * 37) + this.lowest.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("total_analysts=" + this.total_analysts);
        if (!this.highest.isEmpty()) {
            arrayList.add("highest=" + this.highest);
        }
        if (!this.median.isEmpty()) {
            arrayList.add("median=" + this.median);
        }
        if (!this.lowest.isEmpty()) {
            arrayList.add("lowest=" + this.lowest);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TopAnalystPriceTargets{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TopAnalystPriceTargets copy$default(TopAnalystPriceTargets topAnalystPriceTargets, int i, List list, List list2, List list3, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = topAnalystPriceTargets.total_analysts;
        }
        if ((i2 & 2) != 0) {
            list = topAnalystPriceTargets.highest;
        }
        if ((i2 & 4) != 0) {
            list2 = topAnalystPriceTargets.median;
        }
        if ((i2 & 8) != 0) {
            list3 = topAnalystPriceTargets.lowest;
        }
        if ((i2 & 16) != 0) {
            byteString = topAnalystPriceTargets.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list4 = list2;
        return topAnalystPriceTargets.copy(i, list, list4, list3, byteString2);
    }

    public final TopAnalystPriceTargets copy(int total_analysts, List<AnalystPriceTarget> highest, List<AnalystPriceTarget> median, List<AnalystPriceTarget> lowest, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(highest, "highest");
        Intrinsics.checkNotNullParameter(median, "median");
        Intrinsics.checkNotNullParameter(lowest, "lowest");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TopAnalystPriceTargets(total_analysts, highest, median, lowest, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TopAnalystPriceTargets.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TopAnalystPriceTargets>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.TopAnalystPriceTargets$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TopAnalystPriceTargets value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTotal_analysts() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getTotal_analysts()));
                }
                ProtoAdapter<AnalystPriceTarget> protoAdapter = AnalystPriceTarget.ADAPTER;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getHighest()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getMedian()) + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getLowest());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TopAnalystPriceTargets value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTotal_analysts() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTotal_analysts()));
                }
                ProtoAdapter<AnalystPriceTarget> protoAdapter = AnalystPriceTarget.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getHighest());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getMedian());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getLowest());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TopAnalystPriceTargets value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<AnalystPriceTarget> protoAdapter = AnalystPriceTarget.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getLowest());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getMedian());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getHighest());
                if (value.getTotal_analysts() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTotal_analysts()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TopAnalystPriceTargets decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TopAnalystPriceTargets(iIntValue, arrayList, arrayList2, arrayList3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        arrayList.add(AnalystPriceTarget.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList2.add(AnalystPriceTarget.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        arrayList3.add(AnalystPriceTarget.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TopAnalystPriceTargets redact(TopAnalystPriceTargets value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<AnalystPriceTarget> highest = value.getHighest();
                ProtoAdapter<AnalystPriceTarget> protoAdapter = AnalystPriceTarget.ADAPTER;
                return TopAnalystPriceTargets.copy$default(value, 0, Internal.m26823redactElements(highest, protoAdapter), Internal.m26823redactElements(value.getMedian(), protoAdapter), Internal.m26823redactElements(value.getLowest(), protoAdapter), ByteString.EMPTY, 1, null);
            }
        };
    }
}
