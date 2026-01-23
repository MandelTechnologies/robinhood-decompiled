package com.robinhood.prediction_markets.proto.p361v1.combo;

import com.robinhood.prediction_markets.proto.p361v1.idl.ComboProposal;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetComboProposalsResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponse;", "Lcom/squareup/wire/Message;", "", "best_yes_bid", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposal;", "best_no_bid", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposal;Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposal;Lokio/ByteString;)V", "getBest_yes_bid", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposal;", "getBest_no_bid", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GetComboProposalsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetComboProposalsResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ComboProposal#ADAPTER", jsonName = "bestNoBid", schemaIndex = 1, tag = 2)
    private final ComboProposal best_no_bid;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ComboProposal#ADAPTER", jsonName = "bestYesBid", schemaIndex = 0, tag = 1)
    private final ComboProposal best_yes_bid;

    public GetComboProposalsResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23762newBuilder();
    }

    public final ComboProposal getBest_yes_bid() {
        return this.best_yes_bid;
    }

    public final ComboProposal getBest_no_bid() {
        return this.best_no_bid;
    }

    public /* synthetic */ GetComboProposalsResponse(ComboProposal comboProposal, ComboProposal comboProposal2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : comboProposal, (i & 2) != 0 ? null : comboProposal2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetComboProposalsResponse(ComboProposal comboProposal, ComboProposal comboProposal2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.best_yes_bid = comboProposal;
        this.best_no_bid = comboProposal2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23762newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetComboProposalsResponse)) {
            return false;
        }
        GetComboProposalsResponse getComboProposalsResponse = (GetComboProposalsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getComboProposalsResponse.unknownFields()) && Intrinsics.areEqual(this.best_yes_bid, getComboProposalsResponse.best_yes_bid) && Intrinsics.areEqual(this.best_no_bid, getComboProposalsResponse.best_no_bid);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ComboProposal comboProposal = this.best_yes_bid;
        int iHashCode2 = (iHashCode + (comboProposal != null ? comboProposal.hashCode() : 0)) * 37;
        ComboProposal comboProposal2 = this.best_no_bid;
        int iHashCode3 = iHashCode2 + (comboProposal2 != null ? comboProposal2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ComboProposal comboProposal = this.best_yes_bid;
        if (comboProposal != null) {
            arrayList.add("best_yes_bid=" + comboProposal);
        }
        ComboProposal comboProposal2 = this.best_no_bid;
        if (comboProposal2 != null) {
            arrayList.add("best_no_bid=" + comboProposal2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetComboProposalsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetComboProposalsResponse copy$default(GetComboProposalsResponse getComboProposalsResponse, ComboProposal comboProposal, ComboProposal comboProposal2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            comboProposal = getComboProposalsResponse.best_yes_bid;
        }
        if ((i & 2) != 0) {
            comboProposal2 = getComboProposalsResponse.best_no_bid;
        }
        if ((i & 4) != 0) {
            byteString = getComboProposalsResponse.unknownFields();
        }
        return getComboProposalsResponse.copy(comboProposal, comboProposal2, byteString);
    }

    public final GetComboProposalsResponse copy(ComboProposal best_yes_bid, ComboProposal best_no_bid, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetComboProposalsResponse(best_yes_bid, best_no_bid, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetComboProposalsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetComboProposalsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.combo.GetComboProposalsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetComboProposalsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<ComboProposal> protoAdapter = ComboProposal.ADAPTER;
                return size + protoAdapter.encodedSizeWithTag(1, value.getBest_yes_bid()) + protoAdapter.encodedSizeWithTag(2, value.getBest_no_bid());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetComboProposalsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<ComboProposal> protoAdapter = ComboProposal.ADAPTER;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getBest_yes_bid());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getBest_no_bid());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetComboProposalsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<ComboProposal> protoAdapter = ComboProposal.ADAPTER;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getBest_no_bid());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getBest_yes_bid());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetComboProposalsResponse redact(GetComboProposalsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ComboProposal best_yes_bid = value.getBest_yes_bid();
                ComboProposal comboProposalRedact = best_yes_bid != null ? ComboProposal.ADAPTER.redact(best_yes_bid) : null;
                ComboProposal best_no_bid = value.getBest_no_bid();
                return value.copy(comboProposalRedact, best_no_bid != null ? ComboProposal.ADAPTER.redact(best_no_bid) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetComboProposalsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ComboProposal comboProposalDecode = null;
                ComboProposal comboProposalDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetComboProposalsResponse(comboProposalDecode, comboProposalDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        comboProposalDecode = ComboProposal.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        comboProposalDecode2 = ComboProposal.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
