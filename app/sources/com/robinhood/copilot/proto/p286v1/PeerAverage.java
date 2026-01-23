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

/* compiled from: PeerAverage.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J4\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PeerAverage;", "Lcom/squareup/wire/Message;", "", "valuation_metric", "", "total_peers", "", "companies", "", "Lcom/robinhood/copilot/proto/v1/PeerCompany;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ILjava/util/List;Lokio/ByteString;)V", "getValuation_metric", "()Ljava/lang/String;", "getTotal_peers", "()I", "getCompanies", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PeerAverage extends Message {

    @JvmField
    public static final ProtoAdapter<PeerAverage> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.PeerCompany#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<PeerCompany> companies;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalPeers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int total_peers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "valuationMetric", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String valuation_metric;

    public PeerAverage() {
        this(null, 0, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22152newBuilder();
    }

    public final String getValuation_metric() {
        return this.valuation_metric;
    }

    public /* synthetic */ PeerAverage(String str, int i, List list, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getTotal_peers() {
        return this.total_peers;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerAverage(String valuation_metric, int i, List<PeerCompany> companies, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(valuation_metric, "valuation_metric");
        Intrinsics.checkNotNullParameter(companies, "companies");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.valuation_metric = valuation_metric;
        this.total_peers = i;
        this.companies = Internal.immutableCopyOf("companies", companies);
    }

    public final List<PeerCompany> getCompanies() {
        return this.companies;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22152newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PeerAverage)) {
            return false;
        }
        PeerAverage peerAverage = (PeerAverage) other;
        return Intrinsics.areEqual(unknownFields(), peerAverage.unknownFields()) && Intrinsics.areEqual(this.valuation_metric, peerAverage.valuation_metric) && this.total_peers == peerAverage.total_peers && Intrinsics.areEqual(this.companies, peerAverage.companies);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.valuation_metric.hashCode()) * 37) + Integer.hashCode(this.total_peers)) * 37) + this.companies.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("valuation_metric=" + Internal.sanitize(this.valuation_metric));
        arrayList.add("total_peers=" + this.total_peers);
        if (!this.companies.isEmpty()) {
            arrayList.add("companies=" + this.companies);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PeerAverage{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PeerAverage copy$default(PeerAverage peerAverage, String str, int i, List list, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = peerAverage.valuation_metric;
        }
        if ((i2 & 2) != 0) {
            i = peerAverage.total_peers;
        }
        if ((i2 & 4) != 0) {
            list = peerAverage.companies;
        }
        if ((i2 & 8) != 0) {
            byteString = peerAverage.unknownFields();
        }
        return peerAverage.copy(str, i, list, byteString);
    }

    public final PeerAverage copy(String valuation_metric, int total_peers, List<PeerCompany> companies, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(valuation_metric, "valuation_metric");
        Intrinsics.checkNotNullParameter(companies, "companies");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PeerAverage(valuation_metric, total_peers, companies, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PeerAverage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PeerAverage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.PeerAverage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PeerAverage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getValuation_metric(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getValuation_metric());
                }
                if (value.getTotal_peers() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getTotal_peers()));
                }
                return size + PeerCompany.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getCompanies());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PeerAverage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getValuation_metric(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getValuation_metric());
                }
                if (value.getTotal_peers() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTotal_peers()));
                }
                PeerCompany.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getCompanies());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PeerAverage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PeerCompany.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getCompanies());
                if (value.getTotal_peers() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTotal_peers()));
                }
                if (Intrinsics.areEqual(value.getValuation_metric(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getValuation_metric());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PeerAverage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PeerAverage(strDecode, iIntValue, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 3) {
                        arrayList.add(PeerCompany.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PeerAverage redact(PeerAverage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PeerAverage.copy$default(value, null, 0, Internal.m26823redactElements(value.getCompanies(), PeerCompany.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}
