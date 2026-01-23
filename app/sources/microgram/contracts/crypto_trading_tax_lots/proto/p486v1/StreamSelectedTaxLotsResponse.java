package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

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
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamSelectedTaxLotsResponse;
import okio.ByteString;

/* compiled from: StreamSelectedTaxLotsResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002()BC\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJI\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse;", "Lcom/squareup/wire/Message;", "", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/SelectedTaxLot;", "selected_tax_lots", "", "total_quantity", "estimated_gain_loss_quote_amount", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent;", "estimated_gain_loss_content", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent;Lokio/ByteString;)Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse;", "Ljava/lang/String;", "getTotal_quantity", "getEstimated_gain_loss_quote_amount", "getEstimated_gain_loss_quote_amount$annotations", "()V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent;", "getEstimated_gain_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent;", "Ljava/util/List;", "getSelected_tax_lots", "()Ljava/util/List;", "Companion", "GainLossContent", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class StreamSelectedTaxLotsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamSelectedTaxLotsResponse> ADAPTER;

    @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamSelectedTaxLotsResponse$GainLossContent#ADAPTER", jsonName = "estimatedGainLossContent", schemaIndex = 3, tag = 4)
    private final GainLossContent estimated_gain_loss_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedGainLossQuoteAmount", schemaIndex = 2, tag = 3)
    private final String estimated_gain_loss_quote_amount;

    @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.SelectedTaxLot#ADAPTER", jsonName = "selectedTaxLots", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<SelectedTaxLot> selected_tax_lots;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String total_quantity;

    public StreamSelectedTaxLotsResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29002newBuilder();
    }

    public /* synthetic */ StreamSelectedTaxLotsResponse(List list, String str, String str2, GainLossContent gainLossContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : gainLossContent, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTotal_quantity() {
        return this.total_quantity;
    }

    public final String getEstimated_gain_loss_quote_amount() {
        return this.estimated_gain_loss_quote_amount;
    }

    public final GainLossContent getEstimated_gain_loss_content() {
        return this.estimated_gain_loss_content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamSelectedTaxLotsResponse(List<SelectedTaxLot> selected_tax_lots, String total_quantity, String str, GainLossContent gainLossContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(selected_tax_lots, "selected_tax_lots");
        Intrinsics.checkNotNullParameter(total_quantity, "total_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_quantity = total_quantity;
        this.estimated_gain_loss_quote_amount = str;
        this.estimated_gain_loss_content = gainLossContent;
        this.selected_tax_lots = Internal.immutableCopyOf("selected_tax_lots", selected_tax_lots);
    }

    public final List<SelectedTaxLot> getSelected_tax_lots() {
        return this.selected_tax_lots;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29002newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamSelectedTaxLotsResponse)) {
            return false;
        }
        StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse = (StreamSelectedTaxLotsResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamSelectedTaxLotsResponse.unknownFields()) && Intrinsics.areEqual(this.selected_tax_lots, streamSelectedTaxLotsResponse.selected_tax_lots) && Intrinsics.areEqual(this.total_quantity, streamSelectedTaxLotsResponse.total_quantity) && Intrinsics.areEqual(this.estimated_gain_loss_quote_amount, streamSelectedTaxLotsResponse.estimated_gain_loss_quote_amount) && Intrinsics.areEqual(this.estimated_gain_loss_content, streamSelectedTaxLotsResponse.estimated_gain_loss_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.selected_tax_lots.hashCode()) * 37) + this.total_quantity.hashCode()) * 37;
        String str = this.estimated_gain_loss_quote_amount;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        GainLossContent gainLossContent = this.estimated_gain_loss_content;
        int iHashCode3 = iHashCode2 + (gainLossContent != null ? gainLossContent.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.selected_tax_lots.isEmpty()) {
            arrayList.add("selected_tax_lots=" + this.selected_tax_lots);
        }
        arrayList.add("total_quantity=" + Internal.sanitize(this.total_quantity));
        String str = this.estimated_gain_loss_quote_amount;
        if (str != null) {
            arrayList.add("estimated_gain_loss_quote_amount=" + Internal.sanitize(str));
        }
        GainLossContent gainLossContent = this.estimated_gain_loss_content;
        if (gainLossContent != null) {
            arrayList.add("estimated_gain_loss_content=" + gainLossContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamSelectedTaxLotsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamSelectedTaxLotsResponse copy$default(StreamSelectedTaxLotsResponse streamSelectedTaxLotsResponse, List list, String str, String str2, GainLossContent gainLossContent, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = streamSelectedTaxLotsResponse.selected_tax_lots;
        }
        if ((i & 2) != 0) {
            str = streamSelectedTaxLotsResponse.total_quantity;
        }
        if ((i & 4) != 0) {
            str2 = streamSelectedTaxLotsResponse.estimated_gain_loss_quote_amount;
        }
        if ((i & 8) != 0) {
            gainLossContent = streamSelectedTaxLotsResponse.estimated_gain_loss_content;
        }
        if ((i & 16) != 0) {
            byteString = streamSelectedTaxLotsResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return streamSelectedTaxLotsResponse.copy(list, str, str3, gainLossContent, byteString2);
    }

    public final StreamSelectedTaxLotsResponse copy(List<SelectedTaxLot> selected_tax_lots, String total_quantity, String estimated_gain_loss_quote_amount, GainLossContent estimated_gain_loss_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(selected_tax_lots, "selected_tax_lots");
        Intrinsics.checkNotNullParameter(total_quantity, "total_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamSelectedTaxLotsResponse(selected_tax_lots, total_quantity, estimated_gain_loss_quote_amount, estimated_gain_loss_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamSelectedTaxLotsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamSelectedTaxLotsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamSelectedTaxLotsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamSelectedTaxLotsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + SelectedTaxLot.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getSelected_tax_lots());
                if (!Intrinsics.areEqual(value.getTotal_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTotal_quantity());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getEstimated_gain_loss_quote_amount()) + StreamSelectedTaxLotsResponse.GainLossContent.ADAPTER.encodedSizeWithTag(4, value.getEstimated_gain_loss_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamSelectedTaxLotsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                SelectedTaxLot.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getSelected_tax_lots());
                if (!Intrinsics.areEqual(value.getTotal_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTotal_quantity());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEstimated_gain_loss_quote_amount());
                StreamSelectedTaxLotsResponse.GainLossContent.ADAPTER.encodeWithTag(writer, 4, (int) value.getEstimated_gain_loss_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamSelectedTaxLotsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                StreamSelectedTaxLotsResponse.GainLossContent.ADAPTER.encodeWithTag(writer, 4, (int) value.getEstimated_gain_loss_content());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getEstimated_gain_loss_quote_amount());
                if (!Intrinsics.areEqual(value.getTotal_quantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTotal_quantity());
                }
                SelectedTaxLot.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getSelected_tax_lots());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamSelectedTaxLotsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                StreamSelectedTaxLotsResponse.GainLossContent gainLossContentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamSelectedTaxLotsResponse(arrayList, strDecode, strDecode2, gainLossContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(SelectedTaxLot.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        gainLossContentDecode = StreamSelectedTaxLotsResponse.GainLossContent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamSelectedTaxLotsResponse redact(StreamSelectedTaxLotsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getSelected_tax_lots(), SelectedTaxLot.ADAPTER);
                StreamSelectedTaxLotsResponse.GainLossContent estimated_gain_loss_content = value.getEstimated_gain_loss_content();
                return StreamSelectedTaxLotsResponse.copy$default(value, listM26823redactElements, null, null, estimated_gain_loss_content != null ? StreamSelectedTaxLotsResponse.GainLossContent.ADAPTER.redact(estimated_gain_loss_content) : null, ByteString.EMPTY, 6, null);
            }
        };
    }

    /* compiled from: StreamSelectedTaxLotsResponse.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent;", "Lcom/squareup/wire/Message;", "", "estimated_gain_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent$EstimatedGainContent;", "estimated_loss_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent$EstimatedLossContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent$EstimatedGainContent;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent$EstimatedLossContent;Lokio/ByteString;)V", "getEstimated_gain_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent$EstimatedGainContent;", "getEstimated_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent$EstimatedLossContent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EstimatedGainContent", "EstimatedLossContent", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GainLossContent extends Message {

        @JvmField
        public static final ProtoAdapter<GainLossContent> ADAPTER;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamSelectedTaxLotsResponse$GainLossContent$EstimatedGainContent#ADAPTER", jsonName = "estimatedGainContent", oneofName = "type", schemaIndex = 0, tag = 1)
        private final EstimatedGainContent estimated_gain_content;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamSelectedTaxLotsResponse$GainLossContent$EstimatedLossContent#ADAPTER", jsonName = "estimatedLossContent", oneofName = "type", schemaIndex = 1, tag = 2)
        private final EstimatedLossContent estimated_loss_content;

        public GainLossContent() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29003newBuilder();
        }

        public final EstimatedGainContent getEstimated_gain_content() {
            return this.estimated_gain_content;
        }

        public final EstimatedLossContent getEstimated_loss_content() {
            return this.estimated_loss_content;
        }

        public /* synthetic */ GainLossContent(EstimatedGainContent estimatedGainContent, EstimatedLossContent estimatedLossContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : estimatedGainContent, (i & 2) != 0 ? null : estimatedLossContent, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GainLossContent(EstimatedGainContent estimatedGainContent, EstimatedLossContent estimatedLossContent, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.estimated_gain_content = estimatedGainContent;
            this.estimated_loss_content = estimatedLossContent;
            if (Internal.countNonNull(estimatedGainContent, estimatedLossContent) > 1) {
                throw new IllegalArgumentException("At most one of estimated_gain_content, estimated_loss_content may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29003newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof GainLossContent)) {
                return false;
            }
            GainLossContent gainLossContent = (GainLossContent) other;
            return Intrinsics.areEqual(unknownFields(), gainLossContent.unknownFields()) && Intrinsics.areEqual(this.estimated_gain_content, gainLossContent.estimated_gain_content) && Intrinsics.areEqual(this.estimated_loss_content, gainLossContent.estimated_loss_content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            EstimatedGainContent estimatedGainContent = this.estimated_gain_content;
            int iHashCode2 = (iHashCode + (estimatedGainContent != null ? estimatedGainContent.hashCode() : 0)) * 37;
            EstimatedLossContent estimatedLossContent = this.estimated_loss_content;
            int iHashCode3 = iHashCode2 + (estimatedLossContent != null ? estimatedLossContent.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            EstimatedGainContent estimatedGainContent = this.estimated_gain_content;
            if (estimatedGainContent != null) {
                arrayList.add("estimated_gain_content=" + estimatedGainContent);
            }
            EstimatedLossContent estimatedLossContent = this.estimated_loss_content;
            if (estimatedLossContent != null) {
                arrayList.add("estimated_loss_content=" + estimatedLossContent);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GainLossContent{", "}", 0, null, null, 56, null);
        }

        public final GainLossContent copy(EstimatedGainContent estimated_gain_content, EstimatedLossContent estimated_loss_content, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new GainLossContent(estimated_gain_content, estimated_loss_content, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GainLossContent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<GainLossContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamSelectedTaxLotsResponse$GainLossContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(StreamSelectedTaxLotsResponse.GainLossContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent.ADAPTER.encodedSizeWithTag(1, value.getEstimated_gain_content()) + StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent.ADAPTER.encodedSizeWithTag(2, value.getEstimated_loss_content());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, StreamSelectedTaxLotsResponse.GainLossContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getEstimated_gain_content());
                    StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getEstimated_loss_content());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, StreamSelectedTaxLotsResponse.GainLossContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getEstimated_loss_content());
                    StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getEstimated_gain_content());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamSelectedTaxLotsResponse.GainLossContent redact(StreamSelectedTaxLotsResponse.GainLossContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent estimated_gain_content = value.getEstimated_gain_content();
                    StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent estimatedGainContentRedact = estimated_gain_content != null ? StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent.ADAPTER.redact(estimated_gain_content) : null;
                    StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent estimated_loss_content = value.getEstimated_loss_content();
                    return value.copy(estimatedGainContentRedact, estimated_loss_content != null ? StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent.ADAPTER.redact(estimated_loss_content) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamSelectedTaxLotsResponse.GainLossContent decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent estimatedGainContentDecode = null;
                    StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent estimatedLossContentDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new StreamSelectedTaxLotsResponse.GainLossContent(estimatedGainContentDecode, estimatedLossContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            estimatedGainContentDecode = StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            estimatedLossContentDecode = StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }

        /* compiled from: StreamSelectedTaxLotsResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent$EstimatedGainContent;", "Lcom/squareup/wire/Message;", "", "estimated_gain_quote_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getEstimated_gain_quote_amount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EstimatedGainContent extends Message {

            @JvmField
            public static final ProtoAdapter<EstimatedGainContent> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedGainQuoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String estimated_gain_quote_amount;

            /* JADX WARN: Multi-variable type inference failed */
            public EstimatedGainContent() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29004newBuilder();
            }

            public final String getEstimated_gain_quote_amount() {
                return this.estimated_gain_quote_amount;
            }

            public /* synthetic */ EstimatedGainContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EstimatedGainContent(String estimated_gain_quote_amount, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(estimated_gain_quote_amount, "estimated_gain_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.estimated_gain_quote_amount = estimated_gain_quote_amount;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29004newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EstimatedGainContent)) {
                    return false;
                }
                EstimatedGainContent estimatedGainContent = (EstimatedGainContent) other;
                return Intrinsics.areEqual(unknownFields(), estimatedGainContent.unknownFields()) && Intrinsics.areEqual(this.estimated_gain_quote_amount, estimatedGainContent.estimated_gain_quote_amount);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + this.estimated_gain_quote_amount.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("estimated_gain_quote_amount=" + Internal.sanitize(this.estimated_gain_quote_amount));
                return CollectionsKt.joinToString$default(arrayList, ", ", "EstimatedGainContent{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ EstimatedGainContent copy$default(EstimatedGainContent estimatedGainContent, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = estimatedGainContent.estimated_gain_quote_amount;
                }
                if ((i & 2) != 0) {
                    byteString = estimatedGainContent.unknownFields();
                }
                return estimatedGainContent.copy(str, byteString);
            }

            public final EstimatedGainContent copy(String estimated_gain_quote_amount, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(estimated_gain_quote_amount, "estimated_gain_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new EstimatedGainContent(estimated_gain_quote_amount, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EstimatedGainContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<EstimatedGainContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamSelectedTaxLotsResponse$GainLossContent$EstimatedGainContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return !Intrinsics.areEqual(value.getEstimated_gain_quote_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEstimated_gain_quote_amount()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getEstimated_gain_quote_amount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_gain_quote_amount());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (Intrinsics.areEqual(value.getEstimated_gain_quote_amount(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_gain_quote_amount());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent redact(StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamSelectedTaxLotsResponse.GainLossContent.EstimatedGainContent(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                };
            }
        }

        /* compiled from: StreamSelectedTaxLotsResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponse$GainLossContent$EstimatedLossContent;", "Lcom/squareup/wire/Message;", "", "estimated_loss_quote_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getEstimated_loss_quote_amount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EstimatedLossContent extends Message {

            @JvmField
            public static final ProtoAdapter<EstimatedLossContent> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedLossQuoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String estimated_loss_quote_amount;

            /* JADX WARN: Multi-variable type inference failed */
            public EstimatedLossContent() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29005newBuilder();
            }

            public final String getEstimated_loss_quote_amount() {
                return this.estimated_loss_quote_amount;
            }

            public /* synthetic */ EstimatedLossContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EstimatedLossContent(String estimated_loss_quote_amount, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(estimated_loss_quote_amount, "estimated_loss_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.estimated_loss_quote_amount = estimated_loss_quote_amount;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29005newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EstimatedLossContent)) {
                    return false;
                }
                EstimatedLossContent estimatedLossContent = (EstimatedLossContent) other;
                return Intrinsics.areEqual(unknownFields(), estimatedLossContent.unknownFields()) && Intrinsics.areEqual(this.estimated_loss_quote_amount, estimatedLossContent.estimated_loss_quote_amount);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + this.estimated_loss_quote_amount.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("estimated_loss_quote_amount=" + Internal.sanitize(this.estimated_loss_quote_amount));
                return CollectionsKt.joinToString$default(arrayList, ", ", "EstimatedLossContent{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ EstimatedLossContent copy$default(EstimatedLossContent estimatedLossContent, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = estimatedLossContent.estimated_loss_quote_amount;
                }
                if ((i & 2) != 0) {
                    byteString = estimatedLossContent.unknownFields();
                }
                return estimatedLossContent.copy(str, byteString);
            }

            public final EstimatedLossContent copy(String estimated_loss_quote_amount, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(estimated_loss_quote_amount, "estimated_loss_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new EstimatedLossContent(estimated_loss_quote_amount, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EstimatedLossContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<EstimatedLossContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamSelectedTaxLotsResponse$GainLossContent$EstimatedLossContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return !Intrinsics.areEqual(value.getEstimated_loss_quote_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEstimated_loss_quote_amount()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getEstimated_loss_quote_amount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_loss_quote_amount());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (Intrinsics.areEqual(value.getEstimated_loss_quote_amount(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_loss_quote_amount());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent redact(StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return StreamSelectedTaxLotsResponse.GainLossContent.EstimatedLossContent.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }
    }
}
