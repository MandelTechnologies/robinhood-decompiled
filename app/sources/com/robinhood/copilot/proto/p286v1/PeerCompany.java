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

/* compiled from: PeerCompany.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PeerCompany;", "Lcom/squareup/wire/Message;", "", "name", "", "market_cap", "valuation_metrics", "", "Lcom/robinhood/copilot/proto/v1/CompanyMetric;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getName", "()Ljava/lang/String;", "getMarket_cap", "getValuation_metrics", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PeerCompany extends Message {

    @JvmField
    public static final ProtoAdapter<PeerCompany> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "marketCap", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String market_cap;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String name;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.CompanyMetric#ADAPTER", jsonName = "valuationMetrics", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<CompanyMetric> valuation_metrics;

    public PeerCompany() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ PeerCompany(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22153newBuilder();
    }

    public final String getName() {
        return this.name;
    }

    public final String getMarket_cap() {
        return this.market_cap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerCompany(String name, String market_cap, List<CompanyMetric> valuation_metrics, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(market_cap, "market_cap");
        Intrinsics.checkNotNullParameter(valuation_metrics, "valuation_metrics");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name = name;
        this.market_cap = market_cap;
        this.valuation_metrics = Internal.immutableCopyOf("valuation_metrics", valuation_metrics);
    }

    public final List<CompanyMetric> getValuation_metrics() {
        return this.valuation_metrics;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22153newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PeerCompany)) {
            return false;
        }
        PeerCompany peerCompany = (PeerCompany) other;
        return Intrinsics.areEqual(unknownFields(), peerCompany.unknownFields()) && Intrinsics.areEqual(this.name, peerCompany.name) && Intrinsics.areEqual(this.market_cap, peerCompany.market_cap) && Intrinsics.areEqual(this.valuation_metrics, peerCompany.valuation_metrics);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.market_cap.hashCode()) * 37) + this.valuation_metrics.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("market_cap=" + Internal.sanitize(this.market_cap));
        if (!this.valuation_metrics.isEmpty()) {
            arrayList.add("valuation_metrics=" + this.valuation_metrics);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PeerCompany{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PeerCompany copy$default(PeerCompany peerCompany, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerCompany.name;
        }
        if ((i & 2) != 0) {
            str2 = peerCompany.market_cap;
        }
        if ((i & 4) != 0) {
            list = peerCompany.valuation_metrics;
        }
        if ((i & 8) != 0) {
            byteString = peerCompany.unknownFields();
        }
        return peerCompany.copy(str, str2, list, byteString);
    }

    public final PeerCompany copy(String name, String market_cap, List<CompanyMetric> valuation_metrics, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(market_cap, "market_cap");
        Intrinsics.checkNotNullParameter(valuation_metrics, "valuation_metrics");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PeerCompany(name, market_cap, valuation_metrics, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PeerCompany.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PeerCompany>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.PeerCompany$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PeerCompany value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                }
                if (!Intrinsics.areEqual(value.getMarket_cap(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMarket_cap());
                }
                return size + CompanyMetric.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getValuation_metrics());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PeerCompany value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getMarket_cap(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMarket_cap());
                }
                CompanyMetric.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getValuation_metrics());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PeerCompany value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                CompanyMetric.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getValuation_metrics());
                if (!Intrinsics.areEqual(value.getMarket_cap(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMarket_cap());
                }
                if (Intrinsics.areEqual(value.getName(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PeerCompany decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PeerCompany(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(CompanyMetric.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PeerCompany redact(PeerCompany value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PeerCompany.copy$default(value, null, null, Internal.m26823redactElements(value.getValuation_metrics(), CompanyMetric.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}
