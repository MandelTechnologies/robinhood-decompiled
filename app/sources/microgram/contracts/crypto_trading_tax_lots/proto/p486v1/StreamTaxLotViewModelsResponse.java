package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

import cbc.service.p048v1.TermType;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotViewModelsResponse;
import nummus.p512v1.SortDirection;
import nummus.p512v1.TaxLotSortType;
import okio.ByteString;

/* compiled from: StreamTaxLotViewModelsResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB;\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J:\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse;", "Lcom/squareup/wire/Message;", "", "headers", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header;", "tax_lot_rows", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow;", "has_next", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;ZLokio/ByteString;)V", "getHas_next", "()Z", "getHeaders", "()Ljava/util/List;", "getTax_lot_rows", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Header", "TaxLotRow", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class StreamTaxLotViewModelsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamTaxLotViewModelsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasNext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean has_next;

    @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$Header#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<Header> headers;

    @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow#ADAPTER", jsonName = "taxLotRows", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<TaxLotRow> tax_lot_rows;

    public StreamTaxLotViewModelsResponse() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29021newBuilder();
    }

    public /* synthetic */ StreamTaxLotViewModelsResponse(List list, List list2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getHas_next() {
        return this.has_next;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotViewModelsResponse(List<Header> headers, List<TaxLotRow> tax_lot_rows, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tax_lot_rows, "tax_lot_rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.has_next = z;
        this.headers = Internal.immutableCopyOf("headers", headers);
        this.tax_lot_rows = Internal.immutableCopyOf("tax_lot_rows", tax_lot_rows);
    }

    public final List<Header> getHeaders() {
        return this.headers;
    }

    public final List<TaxLotRow> getTax_lot_rows() {
        return this.tax_lot_rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29021newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamTaxLotViewModelsResponse)) {
            return false;
        }
        StreamTaxLotViewModelsResponse streamTaxLotViewModelsResponse = (StreamTaxLotViewModelsResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamTaxLotViewModelsResponse.unknownFields()) && Intrinsics.areEqual(this.headers, streamTaxLotViewModelsResponse.headers) && Intrinsics.areEqual(this.tax_lot_rows, streamTaxLotViewModelsResponse.tax_lot_rows) && this.has_next == streamTaxLotViewModelsResponse.has_next;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.headers.hashCode()) * 37) + this.tax_lot_rows.hashCode()) * 37) + Boolean.hashCode(this.has_next);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.headers.isEmpty()) {
            arrayList.add("headers=" + this.headers);
        }
        if (!this.tax_lot_rows.isEmpty()) {
            arrayList.add("tax_lot_rows=" + this.tax_lot_rows);
        }
        arrayList.add("has_next=" + this.has_next);
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamTaxLotViewModelsResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StreamTaxLotViewModelsResponse copy$default(StreamTaxLotViewModelsResponse streamTaxLotViewModelsResponse, List list, List list2, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = streamTaxLotViewModelsResponse.headers;
        }
        if ((i & 2) != 0) {
            list2 = streamTaxLotViewModelsResponse.tax_lot_rows;
        }
        if ((i & 4) != 0) {
            z = streamTaxLotViewModelsResponse.has_next;
        }
        if ((i & 8) != 0) {
            byteString = streamTaxLotViewModelsResponse.unknownFields();
        }
        return streamTaxLotViewModelsResponse.copy(list, list2, z, byteString);
    }

    public final StreamTaxLotViewModelsResponse copy(List<Header> headers, List<TaxLotRow> tax_lot_rows, boolean has_next, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tax_lot_rows, "tax_lot_rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamTaxLotViewModelsResponse(headers, tax_lot_rows, has_next, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamTaxLotViewModelsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamTaxLotViewModelsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamTaxLotViewModelsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + StreamTaxLotViewModelsResponse.Header.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getHeaders()) + StreamTaxLotViewModelsResponse.TaxLotRow.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getTax_lot_rows());
                return value.getHas_next() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getHas_next())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                StreamTaxLotViewModelsResponse.Header.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getHeaders());
                StreamTaxLotViewModelsResponse.TaxLotRow.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getTax_lot_rows());
                if (value.getHas_next()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getHas_next()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHas_next()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getHas_next()));
                }
                StreamTaxLotViewModelsResponse.TaxLotRow.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getTax_lot_rows());
                StreamTaxLotViewModelsResponse.Header.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getHeaders());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotViewModelsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamTaxLotViewModelsResponse(arrayList, arrayList2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(StreamTaxLotViewModelsResponse.Header.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        arrayList2.add(StreamTaxLotViewModelsResponse.TaxLotRow.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotViewModelsResponse redact(StreamTaxLotViewModelsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamTaxLotViewModelsResponse.copy$default(value, Internal.m26823redactElements(value.getHeaders(), StreamTaxLotViewModelsResponse.Header.ADAPTER), Internal.m26823redactElements(value.getTax_lot_rows(), StreamTaxLotViewModelsResponse.TaxLotRow.ADAPTER), false, ByteString.EMPTY, 4, null);
            }
        };
    }

    /* compiled from: StreamTaxLotViewModelsResponse.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header;", "Lcom/squareup/wire/Message;", "", "sortable", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$Sortable;", "non_sortable", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$NonSortable;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$Sortable;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$NonSortable;Lokio/ByteString;)V", "getSortable", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$Sortable;", "getNon_sortable", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$NonSortable;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Sortable", "NonSortable", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Header extends Message {

        @JvmField
        public static final ProtoAdapter<Header> ADAPTER;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$Header$NonSortable#ADAPTER", jsonName = "nonSortable", oneofName = "type", schemaIndex = 1, tag = 2)
        private final NonSortable non_sortable;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$Header$Sortable#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
        private final Sortable sortable;

        public Header() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29022newBuilder();
        }

        public final Sortable getSortable() {
            return this.sortable;
        }

        public final NonSortable getNon_sortable() {
            return this.non_sortable;
        }

        public /* synthetic */ Header(Sortable sortable, NonSortable nonSortable, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : sortable, (i & 2) != 0 ? null : nonSortable, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(Sortable sortable, NonSortable nonSortable, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.sortable = sortable;
            this.non_sortable = nonSortable;
            if (Internal.countNonNull(sortable, nonSortable) > 1) {
                throw new IllegalArgumentException("At most one of sortable, non_sortable may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29022newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.areEqual(unknownFields(), header.unknownFields()) && Intrinsics.areEqual(this.sortable, header.sortable) && Intrinsics.areEqual(this.non_sortable, header.non_sortable);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Sortable sortable = this.sortable;
            int iHashCode2 = (iHashCode + (sortable != null ? sortable.hashCode() : 0)) * 37;
            NonSortable nonSortable = this.non_sortable;
            int iHashCode3 = iHashCode2 + (nonSortable != null ? nonSortable.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Sortable sortable = this.sortable;
            if (sortable != null) {
                arrayList.add("sortable=" + sortable);
            }
            NonSortable nonSortable = this.non_sortable;
            if (nonSortable != null) {
                arrayList.add("non_sortable=" + nonSortable);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Header{", "}", 0, null, null, 56, null);
        }

        public final Header copy(Sortable sortable, NonSortable non_sortable, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Header(sortable, non_sortable, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Header.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Header>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$Header$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(StreamTaxLotViewModelsResponse.Header value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + StreamTaxLotViewModelsResponse.Header.Sortable.ADAPTER.encodedSizeWithTag(1, value.getSortable()) + StreamTaxLotViewModelsResponse.Header.NonSortable.ADAPTER.encodedSizeWithTag(2, value.getNon_sortable());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.Header value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamTaxLotViewModelsResponse.Header.Sortable.ADAPTER.encodeWithTag(writer, 1, (int) value.getSortable());
                    StreamTaxLotViewModelsResponse.Header.NonSortable.ADAPTER.encodeWithTag(writer, 2, (int) value.getNon_sortable());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.Header value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    StreamTaxLotViewModelsResponse.Header.NonSortable.ADAPTER.encodeWithTag(writer, 2, (int) value.getNon_sortable());
                    StreamTaxLotViewModelsResponse.Header.Sortable.ADAPTER.encodeWithTag(writer, 1, (int) value.getSortable());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamTaxLotViewModelsResponse.Header redact(StreamTaxLotViewModelsResponse.Header value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamTaxLotViewModelsResponse.Header.Sortable sortable = value.getSortable();
                    StreamTaxLotViewModelsResponse.Header.Sortable sortableRedact = sortable != null ? StreamTaxLotViewModelsResponse.Header.Sortable.ADAPTER.redact(sortable) : null;
                    StreamTaxLotViewModelsResponse.Header.NonSortable non_sortable = value.getNon_sortable();
                    return value.copy(sortableRedact, non_sortable != null ? StreamTaxLotViewModelsResponse.Header.NonSortable.ADAPTER.redact(non_sortable) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamTaxLotViewModelsResponse.Header decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    StreamTaxLotViewModelsResponse.Header.Sortable sortableDecode = null;
                    StreamTaxLotViewModelsResponse.Header.NonSortable nonSortableDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new StreamTaxLotViewModelsResponse.Header(sortableDecode, nonSortableDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            sortableDecode = StreamTaxLotViewModelsResponse.Header.Sortable.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            nonSortableDecode = StreamTaxLotViewModelsResponse.Header.NonSortable.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }

        /* compiled from: StreamTaxLotViewModelsResponse.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016J:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$Sortable;", "Lcom/squareup/wire/Message;", "", "sort_type", "Lnummus/v1/TaxLotSortType;", "sort_direction", "Lnummus/v1/SortDirection;", "next_sort_direction", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lnummus/v1/TaxLotSortType;Lnummus/v1/SortDirection;Lnummus/v1/SortDirection;Ljava/lang/String;Lokio/ByteString;)V", "getSort_type", "()Lnummus/v1/TaxLotSortType;", "getSort_direction", "()Lnummus/v1/SortDirection;", "getNext_sort_direction", "getDisplay_name", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Sortable extends Message {

            @JvmField
            public static final ProtoAdapter<Sortable> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
            private final String display_name;

            @WireField(adapter = "nummus.v1.SortDirection#ADAPTER", jsonName = "nextSortDirection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final SortDirection next_sort_direction;

            @WireField(adapter = "nummus.v1.SortDirection#ADAPTER", jsonName = "sortDirection", schemaIndex = 1, tag = 2)
            private final SortDirection sort_direction;

            @WireField(adapter = "nummus.v1.TaxLotSortType#ADAPTER", jsonName = "sortType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final TaxLotSortType sort_type;

            public Sortable() {
                this(null, null, null, null, null, 31, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29024newBuilder();
            }

            public final TaxLotSortType getSort_type() {
                return this.sort_type;
            }

            public /* synthetic */ Sortable(TaxLotSortType taxLotSortType, SortDirection sortDirection, SortDirection sortDirection2, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? TaxLotSortType.TAX_LOT_SORT_TYPE_UNSPECIFIED : taxLotSortType, (i & 2) != 0 ? null : sortDirection, (i & 4) != 0 ? SortDirection.SORT_DIRECTION_UNSPECIFIED : sortDirection2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public final SortDirection getSort_direction() {
                return this.sort_direction;
            }

            public final SortDirection getNext_sort_direction() {
                return this.next_sort_direction;
            }

            public final String getDisplay_name() {
                return this.display_name;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Sortable(TaxLotSortType sort_type, SortDirection sortDirection, SortDirection next_sort_direction, String display_name, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(sort_type, "sort_type");
                Intrinsics.checkNotNullParameter(next_sort_direction, "next_sort_direction");
                Intrinsics.checkNotNullParameter(display_name, "display_name");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.sort_type = sort_type;
                this.sort_direction = sortDirection;
                this.next_sort_direction = next_sort_direction;
                this.display_name = display_name;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29024newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Sortable)) {
                    return false;
                }
                Sortable sortable = (Sortable) other;
                return Intrinsics.areEqual(unknownFields(), sortable.unknownFields()) && this.sort_type == sortable.sort_type && this.sort_direction == sortable.sort_direction && this.next_sort_direction == sortable.next_sort_direction && Intrinsics.areEqual(this.display_name, sortable.display_name);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = ((unknownFields().hashCode() * 37) + this.sort_type.hashCode()) * 37;
                SortDirection sortDirection = this.sort_direction;
                int iHashCode2 = ((((iHashCode + (sortDirection != null ? sortDirection.hashCode() : 0)) * 37) + this.next_sort_direction.hashCode()) * 37) + this.display_name.hashCode();
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("sort_type=" + this.sort_type);
                SortDirection sortDirection = this.sort_direction;
                if (sortDirection != null) {
                    arrayList.add("sort_direction=" + sortDirection);
                }
                arrayList.add("next_sort_direction=" + this.next_sort_direction);
                arrayList.add("display_name=" + Internal.sanitize(this.display_name));
                return CollectionsKt.joinToString$default(arrayList, ", ", "Sortable{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Sortable copy$default(Sortable sortable, TaxLotSortType taxLotSortType, SortDirection sortDirection, SortDirection sortDirection2, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    taxLotSortType = sortable.sort_type;
                }
                if ((i & 2) != 0) {
                    sortDirection = sortable.sort_direction;
                }
                if ((i & 4) != 0) {
                    sortDirection2 = sortable.next_sort_direction;
                }
                if ((i & 8) != 0) {
                    str = sortable.display_name;
                }
                if ((i & 16) != 0) {
                    byteString = sortable.unknownFields();
                }
                ByteString byteString2 = byteString;
                SortDirection sortDirection3 = sortDirection2;
                return sortable.copy(taxLotSortType, sortDirection, sortDirection3, str, byteString2);
            }

            public final Sortable copy(TaxLotSortType sort_type, SortDirection sort_direction, SortDirection next_sort_direction, String display_name, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(sort_type, "sort_type");
                Intrinsics.checkNotNullParameter(next_sort_direction, "next_sort_direction");
                Intrinsics.checkNotNullParameter(display_name, "display_name");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Sortable(sort_type, sort_direction, next_sort_direction, display_name, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Sortable.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Sortable>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$Header$Sortable$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamTaxLotViewModelsResponse.Header.Sortable value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (value.getSort_type() != TaxLotSortType.TAX_LOT_SORT_TYPE_UNSPECIFIED) {
                            size += TaxLotSortType.ADAPTER.encodedSizeWithTag(1, value.getSort_type());
                        }
                        ProtoAdapter<SortDirection> protoAdapter = SortDirection.ADAPTER;
                        int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getSort_direction());
                        if (value.getNext_sort_direction() != SortDirection.SORT_DIRECTION_UNSPECIFIED) {
                            iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getNext_sort_direction());
                        }
                        return !Intrinsics.areEqual(value.getDisplay_name(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDisplay_name()) : iEncodedSizeWithTag;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.Header.Sortable value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getSort_type() != TaxLotSortType.TAX_LOT_SORT_TYPE_UNSPECIFIED) {
                            TaxLotSortType.ADAPTER.encodeWithTag(writer, 1, (int) value.getSort_type());
                        }
                        ProtoAdapter<SortDirection> protoAdapter = SortDirection.ADAPTER;
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getSort_direction());
                        if (value.getNext_sort_direction() != SortDirection.SORT_DIRECTION_UNSPECIFIED) {
                            protoAdapter.encodeWithTag(writer, 3, (int) value.getNext_sort_direction());
                        }
                        if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisplay_name());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.Header.Sortable value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisplay_name());
                        }
                        if (value.getNext_sort_direction() != SortDirection.SORT_DIRECTION_UNSPECIFIED) {
                            SortDirection.ADAPTER.encodeWithTag(writer, 3, (int) value.getNext_sort_direction());
                        }
                        SortDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getSort_direction());
                        if (value.getSort_type() != TaxLotSortType.TAX_LOT_SORT_TYPE_UNSPECIFIED) {
                            TaxLotSortType.ADAPTER.encodeWithTag(writer, 1, (int) value.getSort_type());
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotViewModelsResponse.Header.Sortable decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        TaxLotSortType taxLotSortTypeDecode = TaxLotSortType.TAX_LOT_SORT_TYPE_UNSPECIFIED;
                        SortDirection sortDirection = SortDirection.SORT_DIRECTION_UNSPECIFIED;
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        SortDirection sortDirectionDecode = null;
                        SortDirection sortDirectionDecode2 = sortDirection;
                        while (true) {
                            TaxLotSortType taxLotSortType = taxLotSortTypeDecode;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new StreamTaxLotViewModelsResponse.Header.Sortable(taxLotSortType, sortDirectionDecode, sortDirectionDecode2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    try {
                                        taxLotSortTypeDecode = TaxLotSortType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                } else if (iNextTag == 2) {
                                    try {
                                        sortDirectionDecode = SortDirection.ADAPTER.decode(reader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    }
                                } else if (iNextTag == 3) {
                                    try {
                                        sortDirectionDecode2 = SortDirection.ADAPTER.decode(reader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    }
                                } else if (iNextTag == 4) {
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotViewModelsResponse.Header.Sortable redact(StreamTaxLotViewModelsResponse.Header.Sortable value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return StreamTaxLotViewModelsResponse.Header.Sortable.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
                    }
                };
            }
        }

        /* compiled from: StreamTaxLotViewModelsResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$NonSortable;", "Lcom/squareup/wire/Message;", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getDisplay_name", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NonSortable extends Message {

            @JvmField
            public static final ProtoAdapter<NonSortable> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 5)
            private final String display_name;

            /* JADX WARN: Multi-variable type inference failed */
            public NonSortable() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29023newBuilder();
            }

            public final String getDisplay_name() {
                return this.display_name;
            }

            public /* synthetic */ NonSortable(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NonSortable(String display_name, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(display_name, "display_name");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.display_name = display_name;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29023newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof NonSortable)) {
                    return false;
                }
                NonSortable nonSortable = (NonSortable) other;
                return Intrinsics.areEqual(unknownFields(), nonSortable.unknownFields()) && Intrinsics.areEqual(this.display_name, nonSortable.display_name);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + this.display_name.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("display_name=" + Internal.sanitize(this.display_name));
                return CollectionsKt.joinToString$default(arrayList, ", ", "NonSortable{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ NonSortable copy$default(NonSortable nonSortable, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = nonSortable.display_name;
                }
                if ((i & 2) != 0) {
                    byteString = nonSortable.unknownFields();
                }
                return nonSortable.copy(str, byteString);
            }

            public final NonSortable copy(String display_name, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(display_name, "display_name");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new NonSortable(display_name, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NonSortable.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<NonSortable>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$Header$NonSortable$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotViewModelsResponse.Header.NonSortable decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamTaxLotViewModelsResponse.Header.NonSortable(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 5) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamTaxLotViewModelsResponse.Header.NonSortable value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return !Intrinsics.areEqual(value.getDisplay_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDisplay_name()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.Header.NonSortable value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisplay_name());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.Header.NonSortable value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (Intrinsics.areEqual(value.getDisplay_name(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisplay_name());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotViewModelsResponse.Header.NonSortable redact(StreamTaxLotViewModelsResponse.Header.NonSortable value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return StreamTaxLotViewModelsResponse.Header.NonSortable.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }
    }

    /* compiled from: StreamTaxLotViewModelsResponse.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001d\u001e\u001fB7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J6\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow;", "Lcom/squareup/wire/Message;", "", "id", "", "cells", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell;", "disabled_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getDisabled_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent;", "getCells", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Cell", "DisabledContent", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TaxLotRow extends Message {

        @JvmField
        public static final ProtoAdapter<TaxLotRow> ADAPTER;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        private final List<Cell> cells;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent#ADAPTER", jsonName = "disabledContent", schemaIndex = 2, tag = 3)
        private final DisabledContent disabled_content;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String id;

        public TaxLotRow() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29025newBuilder();
        }

        public final String getId() {
            return this.id;
        }

        public /* synthetic */ TaxLotRow(String str, List list, DisabledContent disabledContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : disabledContent, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public final DisabledContent getDisabled_content() {
            return this.disabled_content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaxLotRow(String id, List<Cell> cells, DisabledContent disabledContent, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(cells, "cells");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.id = id;
            this.disabled_content = disabledContent;
            this.cells = Internal.immutableCopyOf("cells", cells);
        }

        public final List<Cell> getCells() {
            return this.cells;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29025newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TaxLotRow)) {
                return false;
            }
            TaxLotRow taxLotRow = (TaxLotRow) other;
            return Intrinsics.areEqual(unknownFields(), taxLotRow.unknownFields()) && Intrinsics.areEqual(this.id, taxLotRow.id) && Intrinsics.areEqual(this.cells, taxLotRow.cells) && Intrinsics.areEqual(this.disabled_content, taxLotRow.disabled_content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.cells.hashCode()) * 37;
            DisabledContent disabledContent = this.disabled_content;
            int iHashCode2 = iHashCode + (disabledContent != null ? disabledContent.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("id=" + Internal.sanitize(this.id));
            if (!this.cells.isEmpty()) {
                arrayList.add("cells=" + this.cells);
            }
            DisabledContent disabledContent = this.disabled_content;
            if (disabledContent != null) {
                arrayList.add("disabled_content=" + disabledContent);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLotRow{", "}", 0, null, null, 56, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaxLotRow copy$default(TaxLotRow taxLotRow, String str, List list, DisabledContent disabledContent, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taxLotRow.id;
            }
            if ((i & 2) != 0) {
                list = taxLotRow.cells;
            }
            if ((i & 4) != 0) {
                disabledContent = taxLotRow.disabled_content;
            }
            if ((i & 8) != 0) {
                byteString = taxLotRow.unknownFields();
            }
            return taxLotRow.copy(str, list, disabledContent, byteString);
        }

        public final TaxLotRow copy(String id, List<Cell> cells, DisabledContent disabled_content, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(cells, "cells");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TaxLotRow(id, cells, disabled_content, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotRow.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TaxLotRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(StreamTaxLotViewModelsResponse.TaxLotRow value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                    }
                    return size + StreamTaxLotViewModelsResponse.TaxLotRow.Cell.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getCells()) + StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.ADAPTER.encodedSizeWithTag(3, value.getDisabled_content());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                    }
                    StreamTaxLotViewModelsResponse.TaxLotRow.Cell.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getCells());
                    StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getDisabled_content());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getDisabled_content());
                    StreamTaxLotViewModelsResponse.TaxLotRow.Cell.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getCells());
                    if (Intrinsics.areEqual(value.getId(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamTaxLotViewModelsResponse.TaxLotRow decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent disabledContentDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new StreamTaxLotViewModelsResponse.TaxLotRow(strDecode, arrayList, disabledContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            arrayList.add(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.ADAPTER.decode(reader));
                        } else if (iNextTag == 3) {
                            disabledContentDecode = StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamTaxLotViewModelsResponse.TaxLotRow redact(StreamTaxLotViewModelsResponse.TaxLotRow value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    List listM26823redactElements = Internal.m26823redactElements(value.getCells(), StreamTaxLotViewModelsResponse.TaxLotRow.Cell.ADAPTER);
                    StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent disabled_content = value.getDisabled_content();
                    return StreamTaxLotViewModelsResponse.TaxLotRow.copy$default(value, null, listM26823redactElements, disabled_content != null ? StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.ADAPTER.redact(disabled_content) : null, ByteString.EMPTY, 1, null);
                }
            };
        }

        /* compiled from: StreamTaxLotViewModelsResponse.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006%&'()*BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016JL\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell;", "Lcom/squareup/wire/Message;", "", InquiryField.DateField.TYPE, "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$Date;", "cost_per_unit", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$CostPerUnit;", "gain_loss", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss;", "available_quantity", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$AvailableQuantity;", "selected_quantity", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$Date;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$CostPerUnit;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$AvailableQuantity;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity;Lokio/ByteString;)V", "getDate", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$Date;", "getCost_per_unit", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$CostPerUnit;", "getGain_loss", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss;", "getAvailable_quantity", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$AvailableQuantity;", "getSelected_quantity", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Date", "CostPerUnit", "GainLoss", "AvailableQuantity", "SelectedQuantity", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Cell extends Message {

            @JvmField
            public static final ProtoAdapter<Cell> ADAPTER;

            @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$AvailableQuantity#ADAPTER", jsonName = "availableQuantity", oneofName = "type", schemaIndex = 3, tag = 4)
            private final AvailableQuantity available_quantity;

            @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$CostPerUnit#ADAPTER", jsonName = "costPerUnit", oneofName = "type", schemaIndex = 1, tag = 2)
            private final CostPerUnit cost_per_unit;

            @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$Date#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
            private final Date date;

            @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss#ADAPTER", jsonName = "gainLoss", oneofName = "type", schemaIndex = 2, tag = 3)
            private final GainLoss gain_loss;

            @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity#ADAPTER", jsonName = "selectedQuantity", oneofName = "type", schemaIndex = 4, tag = 5)
            private final SelectedQuantity selected_quantity;

            public Cell() {
                this(null, null, null, null, null, null, 63, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29026newBuilder();
            }

            public final Date getDate() {
                return this.date;
            }

            public final CostPerUnit getCost_per_unit() {
                return this.cost_per_unit;
            }

            public final GainLoss getGain_loss() {
                return this.gain_loss;
            }

            public final AvailableQuantity getAvailable_quantity() {
                return this.available_quantity;
            }

            public final SelectedQuantity getSelected_quantity() {
                return this.selected_quantity;
            }

            public /* synthetic */ Cell(Date date, CostPerUnit costPerUnit, GainLoss gainLoss, AvailableQuantity availableQuantity, SelectedQuantity selectedQuantity, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : date, (i & 2) != 0 ? null : costPerUnit, (i & 4) != 0 ? null : gainLoss, (i & 8) != 0 ? null : availableQuantity, (i & 16) != 0 ? null : selectedQuantity, (i & 32) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Cell(Date date, CostPerUnit costPerUnit, GainLoss gainLoss, AvailableQuantity availableQuantity, SelectedQuantity selectedQuantity, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.date = date;
                this.cost_per_unit = costPerUnit;
                this.gain_loss = gainLoss;
                this.available_quantity = availableQuantity;
                this.selected_quantity = selectedQuantity;
                if (Internal.countNonNull(date, costPerUnit, gainLoss, availableQuantity, selectedQuantity) > 1) {
                    throw new IllegalArgumentException("At most one of date, cost_per_unit, gain_loss, available_quantity, selected_quantity may be non-null");
                }
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29026newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Cell)) {
                    return false;
                }
                Cell cell = (Cell) other;
                return Intrinsics.areEqual(unknownFields(), cell.unknownFields()) && Intrinsics.areEqual(this.date, cell.date) && Intrinsics.areEqual(this.cost_per_unit, cell.cost_per_unit) && Intrinsics.areEqual(this.gain_loss, cell.gain_loss) && Intrinsics.areEqual(this.available_quantity, cell.available_quantity) && Intrinsics.areEqual(this.selected_quantity, cell.selected_quantity);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                Date date = this.date;
                int iHashCode2 = (iHashCode + (date != null ? date.hashCode() : 0)) * 37;
                CostPerUnit costPerUnit = this.cost_per_unit;
                int iHashCode3 = (iHashCode2 + (costPerUnit != null ? costPerUnit.hashCode() : 0)) * 37;
                GainLoss gainLoss = this.gain_loss;
                int iHashCode4 = (iHashCode3 + (gainLoss != null ? gainLoss.hashCode() : 0)) * 37;
                AvailableQuantity availableQuantity = this.available_quantity;
                int iHashCode5 = (iHashCode4 + (availableQuantity != null ? availableQuantity.hashCode() : 0)) * 37;
                SelectedQuantity selectedQuantity = this.selected_quantity;
                int iHashCode6 = iHashCode5 + (selectedQuantity != null ? selectedQuantity.hashCode() : 0);
                this.hashCode = iHashCode6;
                return iHashCode6;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                Date date = this.date;
                if (date != null) {
                    arrayList.add("date=" + date);
                }
                CostPerUnit costPerUnit = this.cost_per_unit;
                if (costPerUnit != null) {
                    arrayList.add("cost_per_unit=" + costPerUnit);
                }
                GainLoss gainLoss = this.gain_loss;
                if (gainLoss != null) {
                    arrayList.add("gain_loss=" + gainLoss);
                }
                AvailableQuantity availableQuantity = this.available_quantity;
                if (availableQuantity != null) {
                    arrayList.add("available_quantity=" + availableQuantity);
                }
                SelectedQuantity selectedQuantity = this.selected_quantity;
                if (selectedQuantity != null) {
                    arrayList.add("selected_quantity=" + selectedQuantity);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Cell{", "}", 0, null, null, 56, null);
            }

            public final Cell copy(Date date, CostPerUnit cost_per_unit, GainLoss gain_loss, AvailableQuantity available_quantity, SelectedQuantity selected_quantity, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Cell(date, cost_per_unit, gain_loss, available_quantity, selected_quantity, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Cell.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Cell>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotViewModelsResponse.TaxLotRow.Cell decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date dateDecode = null;
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit costPerUnitDecode = null;
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss gainLossDecode = null;
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity availableQuantityDecode = null;
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity selectedQuantityDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell(dateDecode, costPerUnitDecode, gainLossDecode, availableQuantityDecode, selectedQuantityDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                dateDecode = StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date.ADAPTER.decode(reader);
                            } else if (iNextTag == 2) {
                                costPerUnitDecode = StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit.ADAPTER.decode(reader);
                            } else if (iNextTag == 3) {
                                gainLossDecode = StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.ADAPTER.decode(reader);
                            } else if (iNextTag == 4) {
                                availableQuantityDecode = StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity.ADAPTER.decode(reader);
                            } else if (iNextTag == 5) {
                                selectedQuantityDecode = StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamTaxLotViewModelsResponse.TaxLotRow.Cell value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size() + StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date.ADAPTER.encodedSizeWithTag(1, value.getDate()) + StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit.ADAPTER.encodedSizeWithTag(2, value.getCost_per_unit()) + StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.ADAPTER.encodedSizeWithTag(3, value.getGain_loss()) + StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity.ADAPTER.encodedSizeWithTag(4, value.getAvailable_quantity()) + StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.ADAPTER.encodedSizeWithTag(5, value.getSelected_quantity());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date.ADAPTER.encodeWithTag(writer, 1, (int) value.getDate());
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit.ADAPTER.encodeWithTag(writer, 2, (int) value.getCost_per_unit());
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.ADAPTER.encodeWithTag(writer, 3, (int) value.getGain_loss());
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity.ADAPTER.encodeWithTag(writer, 4, (int) value.getAvailable_quantity());
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.ADAPTER.encodeWithTag(writer, 5, (int) value.getSelected_quantity());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.ADAPTER.encodeWithTag(writer, 5, (int) value.getSelected_quantity());
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity.ADAPTER.encodeWithTag(writer, 4, (int) value.getAvailable_quantity());
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.ADAPTER.encodeWithTag(writer, 3, (int) value.getGain_loss());
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit.ADAPTER.encodeWithTag(writer, 2, (int) value.getCost_per_unit());
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date.ADAPTER.encodeWithTag(writer, 1, (int) value.getDate());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotViewModelsResponse.TaxLotRow.Cell redact(StreamTaxLotViewModelsResponse.TaxLotRow.Cell value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date date = value.getDate();
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date dateRedact = date != null ? StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date.ADAPTER.redact(date) : null;
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit cost_per_unit = value.getCost_per_unit();
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit costPerUnitRedact = cost_per_unit != null ? StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit.ADAPTER.redact(cost_per_unit) : null;
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss gain_loss = value.getGain_loss();
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss gainLossRedact = gain_loss != null ? StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.ADAPTER.redact(gain_loss) : null;
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity available_quantity = value.getAvailable_quantity();
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity availableQuantityRedact = available_quantity != null ? StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity.ADAPTER.redact(available_quantity) : null;
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity selected_quantity = value.getSelected_quantity();
                        return value.copy(dateRedact, costPerUnitRedact, gainLossRedact, availableQuantityRedact, selected_quantity != null ? StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.ADAPTER.redact(selected_quantity) : null, ByteString.EMPTY);
                    }
                };
            }

            /* compiled from: StreamTaxLotViewModelsResponse.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$Date;", "Lcom/squareup/wire/Message;", "", "display_date", "", "term_type", "Lcbc/service/v1/TermType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcbc/service/v1/TermType;Lokio/ByteString;)V", "getDisplay_date", "()Ljava/lang/String;", "getTerm_type", "()Lcbc/service/v1/TermType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Date extends Message {

                @JvmField
                public static final ProtoAdapter<Date> ADAPTER;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                private final String display_date;

                @WireField(adapter = "cbc.service.v1.TermType#ADAPTER", jsonName = "termType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
                private final TermType term_type;

                public Date() {
                    this(null, null, null, 7, null);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m29029newBuilder();
                }

                public final String getDisplay_date() {
                    return this.display_date;
                }

                public /* synthetic */ Date(String str, TermType termType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TermType.TERM_TYPE_UNSPECIFIED : termType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
                }

                public final TermType getTerm_type() {
                    return this.term_type;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Date(String display_date, TermType term_type, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(display_date, "display_date");
                    Intrinsics.checkNotNullParameter(term_type, "term_type");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.display_date = display_date;
                    this.term_type = term_type;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m29029newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof Date)) {
                        return false;
                    }
                    Date date = (Date) other;
                    return Intrinsics.areEqual(unknownFields(), date.unknownFields()) && Intrinsics.areEqual(this.display_date, date.display_date) && this.term_type == date.term_type;
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = (((unknownFields().hashCode() * 37) + this.display_date.hashCode()) * 37) + this.term_type.hashCode();
                    this.hashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("display_date=" + Internal.sanitize(this.display_date));
                    arrayList.add("term_type=" + this.term_type);
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Date{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ Date copy$default(Date date, String str, TermType termType, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = date.display_date;
                    }
                    if ((i & 2) != 0) {
                        termType = date.term_type;
                    }
                    if ((i & 4) != 0) {
                        byteString = date.unknownFields();
                    }
                    return date.copy(str, termType, byteString);
                }

                public final Date copy(String display_date, TermType term_type, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(display_date, "display_date");
                    Intrinsics.checkNotNullParameter(term_type, "term_type");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new Date(display_date, term_type, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Date.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<Date>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$Date$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            int size = value.unknownFields().size();
                            if (!Intrinsics.areEqual(value.getDisplay_date(), "")) {
                                size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDisplay_date());
                            }
                            return value.getTerm_type() != TermType.TERM_TYPE_UNSPECIFIED ? size + TermType.ADAPTER.encodedSizeWithTag(2, value.getTerm_type()) : size;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            if (!Intrinsics.areEqual(value.getDisplay_date(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDisplay_date());
                            }
                            if (value.getTerm_type() != TermType.TERM_TYPE_UNSPECIFIED) {
                                TermType.ADAPTER.encodeWithTag(writer, 2, (int) value.getTerm_type());
                            }
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            if (value.getTerm_type() != TermType.TERM_TYPE_UNSPECIFIED) {
                                TermType.ADAPTER.encodeWithTag(writer, 2, (int) value.getTerm_type());
                            }
                            if (Intrinsics.areEqual(value.getDisplay_date(), "")) {
                                return;
                            }
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDisplay_date());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            TermType termTypeDecode = TermType.TERM_TYPE_UNSPECIFIED;
                            long jBeginMessage = reader.beginMessage();
                            String strDecode = "";
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date(strDecode, termTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                } else if (iNextTag == 2) {
                                    try {
                                        termTypeDecode = TermType.ADAPTER.decode(reader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date redact(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                        }
                    };
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponse.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$CostPerUnit;", "Lcom/squareup/wire/Message;", "", "cost_per_unit", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getCost_per_unit", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class CostPerUnit extends Message {

                @JvmField
                public static final ProtoAdapter<CostPerUnit> ADAPTER;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "costPerUnit", schemaIndex = 0, tag = 1)
                private final String cost_per_unit;

                /* JADX WARN: Multi-variable type inference failed */
                public CostPerUnit() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m29028newBuilder();
                }

                public final String getCost_per_unit() {
                    return this.cost_per_unit;
                }

                public /* synthetic */ CostPerUnit(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CostPerUnit(String str, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.cost_per_unit = str;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m29028newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof CostPerUnit)) {
                        return false;
                    }
                    CostPerUnit costPerUnit = (CostPerUnit) other;
                    return Intrinsics.areEqual(unknownFields(), costPerUnit.unknownFields()) && Intrinsics.areEqual(this.cost_per_unit, costPerUnit.cost_per_unit);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = unknownFields().hashCode() * 37;
                    String str = this.cost_per_unit;
                    int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
                    this.hashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.cost_per_unit;
                    if (str != null) {
                        arrayList.add("cost_per_unit=" + Internal.sanitize(str));
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "CostPerUnit{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ CostPerUnit copy$default(CostPerUnit costPerUnit, String str, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = costPerUnit.cost_per_unit;
                    }
                    if ((i & 2) != 0) {
                        byteString = costPerUnit.unknownFields();
                    }
                    return costPerUnit.copy(str, byteString);
                }

                public final CostPerUnit copy(String cost_per_unit, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new CostPerUnit(cost_per_unit, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CostPerUnit.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<CostPerUnit>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$CostPerUnit$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            String strDecode = null;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCost_per_unit());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCost_per_unit());
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCost_per_unit());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit redact(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit.copy$default(value, null, ByteString.EMPTY, 1, null);
                        }
                    };
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponse.kt */
            @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss;", "Lcom/squareup/wire/Message;", "", "", "gain_loss", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent;", "gain_loss_content", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent;Lokio/ByteString;)Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss;", "Ljava/lang/String;", "getGain_loss", "getGain_loss$annotations", "()V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent;", "getGain_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent;", "Companion", "GainLossContent", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class GainLoss extends Message {

                @JvmField
                public static final ProtoAdapter<GainLoss> ADAPTER;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "gainLoss", schemaIndex = 0, tag = 1)
                private final String gain_loss;

                @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent#ADAPTER", jsonName = "gainLossContent", schemaIndex = 1, tag = 2)
                private final GainLossContent gain_loss_content;

                public GainLoss() {
                    this(null, null, null, 7, null);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m29030newBuilder();
                }

                public final String getGain_loss() {
                    return this.gain_loss;
                }

                public final GainLossContent getGain_loss_content() {
                    return this.gain_loss_content;
                }

                public /* synthetic */ GainLoss(String str, GainLossContent gainLossContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : gainLossContent, (i & 4) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public GainLoss(String str, GainLossContent gainLossContent, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.gain_loss = str;
                    this.gain_loss_content = gainLossContent;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m29030newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof GainLoss)) {
                        return false;
                    }
                    GainLoss gainLoss = (GainLoss) other;
                    return Intrinsics.areEqual(unknownFields(), gainLoss.unknownFields()) && Intrinsics.areEqual(this.gain_loss, gainLoss.gain_loss) && Intrinsics.areEqual(this.gain_loss_content, gainLoss.gain_loss_content);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = unknownFields().hashCode() * 37;
                    String str = this.gain_loss;
                    int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
                    GainLossContent gainLossContent = this.gain_loss_content;
                    int iHashCode3 = iHashCode2 + (gainLossContent != null ? gainLossContent.hashCode() : 0);
                    this.hashCode = iHashCode3;
                    return iHashCode3;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.gain_loss;
                    if (str != null) {
                        arrayList.add("gain_loss=" + Internal.sanitize(str));
                    }
                    GainLossContent gainLossContent = this.gain_loss_content;
                    if (gainLossContent != null) {
                        arrayList.add("gain_loss_content=" + gainLossContent);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "GainLoss{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ GainLoss copy$default(GainLoss gainLoss, String str, GainLossContent gainLossContent, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = gainLoss.gain_loss;
                    }
                    if ((i & 2) != 0) {
                        gainLossContent = gainLoss.gain_loss_content;
                    }
                    if ((i & 4) != 0) {
                        byteString = gainLoss.unknownFields();
                    }
                    return gainLoss.copy(str, gainLossContent, byteString);
                }

                public final GainLoss copy(String gain_loss, GainLossContent gain_loss_content, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new GainLoss(gain_loss, gain_loss_content, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GainLoss.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<GainLoss>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            String strDecode = null;
                            StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent gainLossContentDecode = null;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss(strDecode, gainLossContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                } else if (iNextTag == 2) {
                                    gainLossContentDecode = StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.ADAPTER.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getGain_loss()) + StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.ADAPTER.encodedSizeWithTag(2, value.getGain_loss_content());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getGain_loss());
                            StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getGain_loss_content());
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getGain_loss_content());
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getGain_loss());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss redact(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent gain_loss_content = value.getGain_loss_content();
                            return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.copy$default(value, null, gain_loss_content != null ? StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.ADAPTER.redact(gain_loss_content) : null, ByteString.EMPTY, 1, null);
                        }
                    };
                }

                /* compiled from: StreamTaxLotViewModelsResponse.kt */
                @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent;", "Lcom/squareup/wire/Message;", "", "gain_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$GainContent;", "loss_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$LossContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$GainContent;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$LossContent;Lokio/ByteString;)V", "getGain_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$GainContent;", "getLoss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$LossContent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "GainContent", "LossContent", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class GainLossContent extends Message {

                    @JvmField
                    public static final ProtoAdapter<GainLossContent> ADAPTER;

                    @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$GainContent#ADAPTER", jsonName = "gainContent", oneofName = "type", schemaIndex = 0, tag = 1)
                    private final GainContent gain_content;

                    @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$LossContent#ADAPTER", jsonName = "lossContent", oneofName = "type", schemaIndex = 1, tag = 2)
                    private final LossContent loss_content;

                    public GainLossContent() {
                        this(null, null, null, 7, null);
                    }

                    @Override // com.squareup.wire.Message
                    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                        return (Message.Builder) m29031newBuilder();
                    }

                    public final GainContent getGain_content() {
                        return this.gain_content;
                    }

                    public final LossContent getLoss_content() {
                        return this.loss_content;
                    }

                    public /* synthetic */ GainLossContent(GainContent gainContent, LossContent lossContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : gainContent, (i & 2) != 0 ? null : lossContent, (i & 4) != 0 ? ByteString.EMPTY : byteString);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public GainLossContent(GainContent gainContent, LossContent lossContent, ByteString unknownFields) {
                        super(ADAPTER, unknownFields);
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        this.gain_content = gainContent;
                        this.loss_content = lossContent;
                        if (Internal.countNonNull(gainContent, lossContent) > 1) {
                            throw new IllegalArgumentException("At most one of gain_content, loss_content may be non-null");
                        }
                    }

                    @Deprecated
                    /* renamed from: newBuilder, reason: collision with other method in class */
                    public /* synthetic */ Void m29031newBuilder() {
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
                        return Intrinsics.areEqual(unknownFields(), gainLossContent.unknownFields()) && Intrinsics.areEqual(this.gain_content, gainLossContent.gain_content) && Intrinsics.areEqual(this.loss_content, gainLossContent.loss_content);
                    }

                    public int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int iHashCode = unknownFields().hashCode() * 37;
                        GainContent gainContent = this.gain_content;
                        int iHashCode2 = (iHashCode + (gainContent != null ? gainContent.hashCode() : 0)) * 37;
                        LossContent lossContent = this.loss_content;
                        int iHashCode3 = iHashCode2 + (lossContent != null ? lossContent.hashCode() : 0);
                        this.hashCode = iHashCode3;
                        return iHashCode3;
                    }

                    @Override // com.squareup.wire.Message
                    public String toString() {
                        ArrayList arrayList = new ArrayList();
                        GainContent gainContent = this.gain_content;
                        if (gainContent != null) {
                            arrayList.add("gain_content=" + gainContent);
                        }
                        LossContent lossContent = this.loss_content;
                        if (lossContent != null) {
                            arrayList.add("loss_content=" + lossContent);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "GainLossContent{", "}", 0, null, null, 56, null);
                    }

                    public final GainLossContent copy(GainContent gain_content, LossContent loss_content, ByteString unknownFields) {
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        return new GainLossContent(gain_content, loss_content, unknownFields);
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GainLossContent.class);
                        final Syntax syntax = Syntax.PROTO_3;
                        ADAPTER = new ProtoAdapter<GainLossContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$Companion$ADAPTER$1
                            @Override // com.squareup.wire.ProtoAdapter
                            public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent decode(ProtoReader reader) throws IOException {
                                Intrinsics.checkNotNullParameter(reader, "reader");
                                long jBeginMessage = reader.beginMessage();
                                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent gainContentDecode = null;
                                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent lossContentDecode = null;
                                while (true) {
                                    int iNextTag = reader.nextTag();
                                    if (iNextTag == -1) {
                                        return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent(gainContentDecode, lossContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                    }
                                    if (iNextTag == 1) {
                                        gainContentDecode = StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent.ADAPTER.decode(reader);
                                    } else if (iNextTag == 2) {
                                        lossContentDecode = StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent.ADAPTER.decode(reader);
                                    } else {
                                        reader.readUnknownField(iNextTag);
                                    }
                                }
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return value.unknownFields().size() + StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent.ADAPTER.encodedSizeWithTag(1, value.getGain_content()) + StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent.ADAPTER.encodedSizeWithTag(2, value.getLoss_content());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getGain_content());
                                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getLoss_content());
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getLoss_content());
                                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getGain_content());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent redact(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent gain_content = value.getGain_content();
                                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent gainContentRedact = gain_content != null ? StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent.ADAPTER.redact(gain_content) : null;
                                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent loss_content = value.getLoss_content();
                                return value.copy(gainContentRedact, loss_content != null ? StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent.ADAPTER.redact(loss_content) : null, ByteString.EMPTY);
                            }
                        };
                    }

                    /* compiled from: StreamTaxLotViewModelsResponse.kt */
                    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$GainContent;", "Lcom/squareup/wire/Message;", "", "gain_quote_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getGain_quote_amount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class GainContent extends Message {

                        @JvmField
                        public static final ProtoAdapter<GainContent> ADAPTER;

                        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "gainQuoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                        private final String gain_quote_amount;

                        /* JADX WARN: Multi-variable type inference failed */
                        public GainContent() {
                            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        }

                        @Override // com.squareup.wire.Message
                        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                            return (Message.Builder) m29032newBuilder();
                        }

                        public final String getGain_quote_amount() {
                            return this.gain_quote_amount;
                        }

                        public /* synthetic */ GainContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public GainContent(String gain_quote_amount, ByteString unknownFields) {
                            super(ADAPTER, unknownFields);
                            Intrinsics.checkNotNullParameter(gain_quote_amount, "gain_quote_amount");
                            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                            this.gain_quote_amount = gain_quote_amount;
                        }

                        @Deprecated
                        /* renamed from: newBuilder, reason: collision with other method in class */
                        public /* synthetic */ Void m29032newBuilder() {
                            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                        }

                        public boolean equals(Object other) {
                            if (other == this) {
                                return true;
                            }
                            if (!(other instanceof GainContent)) {
                                return false;
                            }
                            GainContent gainContent = (GainContent) other;
                            return Intrinsics.areEqual(unknownFields(), gainContent.unknownFields()) && Intrinsics.areEqual(this.gain_quote_amount, gainContent.gain_quote_amount);
                        }

                        public int hashCode() {
                            int i = this.hashCode;
                            if (i != 0) {
                                return i;
                            }
                            int iHashCode = (unknownFields().hashCode() * 37) + this.gain_quote_amount.hashCode();
                            this.hashCode = iHashCode;
                            return iHashCode;
                        }

                        @Override // com.squareup.wire.Message
                        public String toString() {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("gain_quote_amount=" + Internal.sanitize(this.gain_quote_amount));
                            return CollectionsKt.joinToString$default(arrayList, ", ", "GainContent{", "}", 0, null, null, 56, null);
                        }

                        public static /* synthetic */ GainContent copy$default(GainContent gainContent, String str, ByteString byteString, int i, Object obj) {
                            if ((i & 1) != 0) {
                                str = gainContent.gain_quote_amount;
                            }
                            if ((i & 2) != 0) {
                                byteString = gainContent.unknownFields();
                            }
                            return gainContent.copy(str, byteString);
                        }

                        public final GainContent copy(String gain_quote_amount, ByteString unknownFields) {
                            Intrinsics.checkNotNullParameter(gain_quote_amount, "gain_quote_amount");
                            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                            return new GainContent(gain_quote_amount, unknownFields);
                        }

                        static {
                            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GainContent.class);
                            final Syntax syntax = Syntax.PROTO_3;
                            ADAPTER = new ProtoAdapter<GainContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$GainContent$Companion$ADAPTER$1
                                @Override // com.squareup.wire.ProtoAdapter
                                public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent decode(ProtoReader reader) throws IOException {
                                    Intrinsics.checkNotNullParameter(reader, "reader");
                                    long jBeginMessage = reader.beginMessage();
                                    String strDecode = "";
                                    while (true) {
                                        int iNextTag = reader.nextTag();
                                        if (iNextTag == -1) {
                                            return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                        }
                                        if (iNextTag == 1) {
                                            strDecode = ProtoAdapter.STRING.decode(reader);
                                        } else {
                                            reader.readUnknownField(iNextTag);
                                        }
                                    }
                                }

                                @Override // com.squareup.wire.ProtoAdapter
                                public int encodedSize(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent value) {
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    int size = value.unknownFields().size();
                                    return !Intrinsics.areEqual(value.getGain_quote_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getGain_quote_amount()) : size;
                                }

                                @Override // com.squareup.wire.ProtoAdapter
                                public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent value) throws IOException {
                                    Intrinsics.checkNotNullParameter(writer, "writer");
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    if (!Intrinsics.areEqual(value.getGain_quote_amount(), "")) {
                                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getGain_quote_amount());
                                    }
                                    writer.writeBytes(value.unknownFields());
                                }

                                @Override // com.squareup.wire.ProtoAdapter
                                public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent value) throws IOException {
                                    Intrinsics.checkNotNullParameter(writer, "writer");
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    writer.writeBytes(value.unknownFields());
                                    if (Intrinsics.areEqual(value.getGain_quote_amount(), "")) {
                                        return;
                                    }
                                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getGain_quote_amount());
                                }

                                @Override // com.squareup.wire.ProtoAdapter
                                public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent redact(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent value) {
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent.copy$default(value, null, ByteString.EMPTY, 1, null);
                                }
                            };
                        }
                    }

                    /* compiled from: StreamTaxLotViewModelsResponse.kt */
                    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$LossContent;", "Lcom/squareup/wire/Message;", "", "loss_quote_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getLoss_quote_amount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class LossContent extends Message {

                        @JvmField
                        public static final ProtoAdapter<LossContent> ADAPTER;

                        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lossQuoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                        private final String loss_quote_amount;

                        /* JADX WARN: Multi-variable type inference failed */
                        public LossContent() {
                            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        }

                        @Override // com.squareup.wire.Message
                        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                            return (Message.Builder) m29033newBuilder();
                        }

                        public final String getLoss_quote_amount() {
                            return this.loss_quote_amount;
                        }

                        public /* synthetic */ LossContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public LossContent(String loss_quote_amount, ByteString unknownFields) {
                            super(ADAPTER, unknownFields);
                            Intrinsics.checkNotNullParameter(loss_quote_amount, "loss_quote_amount");
                            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                            this.loss_quote_amount = loss_quote_amount;
                        }

                        @Deprecated
                        /* renamed from: newBuilder, reason: collision with other method in class */
                        public /* synthetic */ Void m29033newBuilder() {
                            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                        }

                        public boolean equals(Object other) {
                            if (other == this) {
                                return true;
                            }
                            if (!(other instanceof LossContent)) {
                                return false;
                            }
                            LossContent lossContent = (LossContent) other;
                            return Intrinsics.areEqual(unknownFields(), lossContent.unknownFields()) && Intrinsics.areEqual(this.loss_quote_amount, lossContent.loss_quote_amount);
                        }

                        public int hashCode() {
                            int i = this.hashCode;
                            if (i != 0) {
                                return i;
                            }
                            int iHashCode = (unknownFields().hashCode() * 37) + this.loss_quote_amount.hashCode();
                            this.hashCode = iHashCode;
                            return iHashCode;
                        }

                        @Override // com.squareup.wire.Message
                        public String toString() {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("loss_quote_amount=" + Internal.sanitize(this.loss_quote_amount));
                            return CollectionsKt.joinToString$default(arrayList, ", ", "LossContent{", "}", 0, null, null, 56, null);
                        }

                        public static /* synthetic */ LossContent copy$default(LossContent lossContent, String str, ByteString byteString, int i, Object obj) {
                            if ((i & 1) != 0) {
                                str = lossContent.loss_quote_amount;
                            }
                            if ((i & 2) != 0) {
                                byteString = lossContent.unknownFields();
                            }
                            return lossContent.copy(str, byteString);
                        }

                        public final LossContent copy(String loss_quote_amount, ByteString unknownFields) {
                            Intrinsics.checkNotNullParameter(loss_quote_amount, "loss_quote_amount");
                            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                            return new LossContent(loss_quote_amount, unknownFields);
                        }

                        static {
                            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LossContent.class);
                            final Syntax syntax = Syntax.PROTO_3;
                            ADAPTER = new ProtoAdapter<LossContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$LossContent$Companion$ADAPTER$1
                                @Override // com.squareup.wire.ProtoAdapter
                                public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent decode(ProtoReader reader) throws IOException {
                                    Intrinsics.checkNotNullParameter(reader, "reader");
                                    long jBeginMessage = reader.beginMessage();
                                    String strDecode = "";
                                    while (true) {
                                        int iNextTag = reader.nextTag();
                                        if (iNextTag == -1) {
                                            return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                        }
                                        if (iNextTag == 1) {
                                            strDecode = ProtoAdapter.STRING.decode(reader);
                                        } else {
                                            reader.readUnknownField(iNextTag);
                                        }
                                    }
                                }

                                @Override // com.squareup.wire.ProtoAdapter
                                public int encodedSize(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent value) {
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    int size = value.unknownFields().size();
                                    return !Intrinsics.areEqual(value.getLoss_quote_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLoss_quote_amount()) : size;
                                }

                                @Override // com.squareup.wire.ProtoAdapter
                                public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent value) throws IOException {
                                    Intrinsics.checkNotNullParameter(writer, "writer");
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    if (!Intrinsics.areEqual(value.getLoss_quote_amount(), "")) {
                                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLoss_quote_amount());
                                    }
                                    writer.writeBytes(value.unknownFields());
                                }

                                @Override // com.squareup.wire.ProtoAdapter
                                public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent value) throws IOException {
                                    Intrinsics.checkNotNullParameter(writer, "writer");
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    writer.writeBytes(value.unknownFields());
                                    if (Intrinsics.areEqual(value.getLoss_quote_amount(), "")) {
                                        return;
                                    }
                                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLoss_quote_amount());
                                }

                                @Override // com.squareup.wire.ProtoAdapter
                                public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent redact(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent value) {
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent.copy$default(value, null, ByteString.EMPTY, 1, null);
                                }
                            };
                        }
                    }
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponse.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$AvailableQuantity;", "Lcom/squareup/wire/Message;", "", "available_quantity", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getAvailable_quantity", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class AvailableQuantity extends Message {

                @JvmField
                public static final ProtoAdapter<AvailableQuantity> ADAPTER;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "availableQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                private final String available_quantity;

                /* JADX WARN: Multi-variable type inference failed */
                public AvailableQuantity() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m29027newBuilder();
                }

                public final String getAvailable_quantity() {
                    return this.available_quantity;
                }

                public /* synthetic */ AvailableQuantity(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AvailableQuantity(String available_quantity, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(available_quantity, "available_quantity");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.available_quantity = available_quantity;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m29027newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof AvailableQuantity)) {
                        return false;
                    }
                    AvailableQuantity availableQuantity = (AvailableQuantity) other;
                    return Intrinsics.areEqual(unknownFields(), availableQuantity.unknownFields()) && Intrinsics.areEqual(this.available_quantity, availableQuantity.available_quantity);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = (unknownFields().hashCode() * 37) + this.available_quantity.hashCode();
                    this.hashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("available_quantity=" + Internal.sanitize(this.available_quantity));
                    return CollectionsKt.joinToString$default(arrayList, ", ", "AvailableQuantity{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ AvailableQuantity copy$default(AvailableQuantity availableQuantity, String str, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = availableQuantity.available_quantity;
                    }
                    if ((i & 2) != 0) {
                        byteString = availableQuantity.unknownFields();
                    }
                    return availableQuantity.copy(str, byteString);
                }

                public final AvailableQuantity copy(String available_quantity, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(available_quantity, "available_quantity");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new AvailableQuantity(available_quantity, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AvailableQuantity.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<AvailableQuantity>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$AvailableQuantity$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            String strDecode = "";
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            int size = value.unknownFields().size();
                            return !Intrinsics.areEqual(value.getAvailable_quantity(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAvailable_quantity()) : size;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            if (!Intrinsics.areEqual(value.getAvailable_quantity(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAvailable_quantity());
                            }
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            if (Intrinsics.areEqual(value.getAvailable_quantity(), "")) {
                                return;
                            }
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAvailable_quantity());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity redact(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity.copy$default(value, null, ByteString.EMPTY, 1, null);
                        }
                    };
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponse.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fBG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JF\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006 "}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity;", "Lcom/squareup/wire/Message;", "", "selected_quantity", "", "check_state", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState;", "formatted_selected_quantity", "is_error", "", "hint_quantity", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState;Ljava/lang/String;ZLjava/lang/String;Lokio/ByteString;)V", "getSelected_quantity", "()Ljava/lang/String;", "getCheck_state", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState;", "getFormatted_selected_quantity", "()Z", "getHint_quantity", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "CheckState", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class SelectedQuantity extends Message {

                @JvmField
                public static final ProtoAdapter<SelectedQuantity> ADAPTER;

                @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState#ADAPTER", jsonName = "checkState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
                private final CheckState check_state;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "formattedSelectedQuantity", schemaIndex = 2, tag = 3)
                private final String formatted_selected_quantity;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "hintQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
                private final String hint_quantity;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isError", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
                private final boolean is_error;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedQuantity", schemaIndex = 0, tag = 1)
                private final String selected_quantity;

                public SelectedQuantity() {
                    this(null, null, null, false, null, null, 63, null);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m29034newBuilder();
                }

                public final String getSelected_quantity() {
                    return this.selected_quantity;
                }

                public final CheckState getCheck_state() {
                    return this.check_state;
                }

                public /* synthetic */ SelectedQuantity(String str, CheckState checkState, String str2, boolean z, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CheckState.CHECK_STATE_UNSPECIFIED : checkState, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
                }

                public final String getFormatted_selected_quantity() {
                    return this.formatted_selected_quantity;
                }

                /* renamed from: is_error, reason: from getter */
                public final boolean getIs_error() {
                    return this.is_error;
                }

                public final String getHint_quantity() {
                    return this.hint_quantity;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SelectedQuantity(String str, CheckState check_state, String str2, boolean z, String hint_quantity, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(check_state, "check_state");
                    Intrinsics.checkNotNullParameter(hint_quantity, "hint_quantity");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.selected_quantity = str;
                    this.check_state = check_state;
                    this.formatted_selected_quantity = str2;
                    this.is_error = z;
                    this.hint_quantity = hint_quantity;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m29034newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof SelectedQuantity)) {
                        return false;
                    }
                    SelectedQuantity selectedQuantity = (SelectedQuantity) other;
                    return Intrinsics.areEqual(unknownFields(), selectedQuantity.unknownFields()) && Intrinsics.areEqual(this.selected_quantity, selectedQuantity.selected_quantity) && this.check_state == selectedQuantity.check_state && Intrinsics.areEqual(this.formatted_selected_quantity, selectedQuantity.formatted_selected_quantity) && this.is_error == selectedQuantity.is_error && Intrinsics.areEqual(this.hint_quantity, selectedQuantity.hint_quantity);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = unknownFields().hashCode() * 37;
                    String str = this.selected_quantity;
                    int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.check_state.hashCode()) * 37;
                    String str2 = this.formatted_selected_quantity;
                    int iHashCode3 = ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_error)) * 37) + this.hint_quantity.hashCode();
                    this.hashCode = iHashCode3;
                    return iHashCode3;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.selected_quantity;
                    if (str != null) {
                        arrayList.add("selected_quantity=" + Internal.sanitize(str));
                    }
                    arrayList.add("check_state=" + this.check_state);
                    String str2 = this.formatted_selected_quantity;
                    if (str2 != null) {
                        arrayList.add("formatted_selected_quantity=" + Internal.sanitize(str2));
                    }
                    arrayList.add("is_error=" + this.is_error);
                    arrayList.add("hint_quantity=" + Internal.sanitize(this.hint_quantity));
                    return CollectionsKt.joinToString$default(arrayList, ", ", "SelectedQuantity{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ SelectedQuantity copy$default(SelectedQuantity selectedQuantity, String str, CheckState checkState, String str2, boolean z, String str3, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = selectedQuantity.selected_quantity;
                    }
                    if ((i & 2) != 0) {
                        checkState = selectedQuantity.check_state;
                    }
                    if ((i & 4) != 0) {
                        str2 = selectedQuantity.formatted_selected_quantity;
                    }
                    if ((i & 8) != 0) {
                        z = selectedQuantity.is_error;
                    }
                    if ((i & 16) != 0) {
                        str3 = selectedQuantity.hint_quantity;
                    }
                    if ((i & 32) != 0) {
                        byteString = selectedQuantity.unknownFields();
                    }
                    String str4 = str3;
                    ByteString byteString2 = byteString;
                    return selectedQuantity.copy(str, checkState, str2, z, str4, byteString2);
                }

                public final SelectedQuantity copy(String selected_quantity, CheckState check_state, String formatted_selected_quantity, boolean is_error, String hint_quantity, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(check_state, "check_state");
                    Intrinsics.checkNotNullParameter(hint_quantity, "hint_quantity");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new SelectedQuantity(selected_quantity, check_state, formatted_selected_quantity, is_error, hint_quantity, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SelectedQuantity.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<SelectedQuantity>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            int size = value.unknownFields().size();
                            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                            int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getSelected_quantity());
                            if (value.getCheck_state() != StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.CHECK_STATE_UNSPECIFIED) {
                                iEncodedSizeWithTag += StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.ADAPTER.encodedSizeWithTag(2, value.getCheck_state());
                            }
                            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getFormatted_selected_quantity());
                            if (value.getIs_error()) {
                                iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_error()));
                            }
                            return !Intrinsics.areEqual(value.getHint_quantity(), "") ? iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(5, value.getHint_quantity()) : iEncodedSizeWithTag2;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                            protoAdapter.encodeWithTag(writer, 1, (int) value.getSelected_quantity());
                            if (value.getCheck_state() != StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.CHECK_STATE_UNSPECIFIED) {
                                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.ADAPTER.encodeWithTag(writer, 2, (int) value.getCheck_state());
                            }
                            protoAdapter.encodeWithTag(writer, 3, (int) value.getFormatted_selected_quantity());
                            if (value.getIs_error()) {
                                ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_error()));
                            }
                            if (!Intrinsics.areEqual(value.getHint_quantity(), "")) {
                                protoAdapter.encodeWithTag(writer, 5, (int) value.getHint_quantity());
                            }
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            if (!Intrinsics.areEqual(value.getHint_quantity(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getHint_quantity());
                            }
                            if (value.getIs_error()) {
                                ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_error()));
                            }
                            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                            protoAdapter.encodeWithTag(writer, 3, (int) value.getFormatted_selected_quantity());
                            if (value.getCheck_state() != StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.CHECK_STATE_UNSPECIFIED) {
                                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.ADAPTER.encodeWithTag(writer, 2, (int) value.getCheck_state());
                            }
                            protoAdapter.encodeWithTag(writer, 1, (int) value.getSelected_quantity());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState checkStateDecode = StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.CHECK_STATE_UNSPECIFIED;
                            long jBeginMessage = reader.beginMessage();
                            boolean zBooleanValue = false;
                            String strDecode = "";
                            String strDecode2 = null;
                            String strDecode3 = null;
                            while (true) {
                                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState checkState = checkStateDecode;
                                while (true) {
                                    int iNextTag = reader.nextTag();
                                    if (iNextTag == -1) {
                                        return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity(strDecode2, checkState, strDecode3, zBooleanValue, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                    }
                                    if (iNextTag == 1) {
                                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    } else if (iNextTag == 2) {
                                        try {
                                            checkStateDecode = StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.ADAPTER.decode(reader);
                                            break;
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        }
                                    } else if (iNextTag == 3) {
                                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    } else if (iNextTag == 4) {
                                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    } else if (iNextTag == 5) {
                                        strDecode = ProtoAdapter.STRING.decode(reader);
                                    } else {
                                        reader.readUnknownField(iNextTag);
                                    }
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity redact(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.copy$default(value, null, null, null, false, null, ByteString.EMPTY, 31, null);
                        }
                    };
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: StreamTaxLotViewModelsResponse.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHECK_STATE_UNSPECIFIED", "CHECK_STATE_UNCHECKED", "CHECK_STATE_HALF_CHECKED", "CHECK_STATE_CHECKED", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class CheckState implements WireEnum {
                    private static final /* synthetic */ EnumEntries $ENTRIES;
                    private static final /* synthetic */ CheckState[] $VALUES;

                    @JvmField
                    public static final ProtoAdapter<CheckState> ADAPTER;
                    public static final CheckState CHECK_STATE_CHECKED;
                    public static final CheckState CHECK_STATE_HALF_CHECKED;
                    public static final CheckState CHECK_STATE_UNCHECKED;
                    public static final CheckState CHECK_STATE_UNSPECIFIED;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    private final int value;

                    private static final /* synthetic */ CheckState[] $values() {
                        return new CheckState[]{CHECK_STATE_UNSPECIFIED, CHECK_STATE_UNCHECKED, CHECK_STATE_HALF_CHECKED, CHECK_STATE_CHECKED};
                    }

                    @JvmStatic
                    public static final CheckState fromValue(int i) {
                        return INSTANCE.fromValue(i);
                    }

                    public static EnumEntries<CheckState> getEntries() {
                        return $ENTRIES;
                    }

                    private CheckState(String str, int i, int i2) {
                        this.value = i2;
                    }

                    @Override // com.squareup.wire.WireEnum
                    public int getValue() {
                        return this.value;
                    }

                    static {
                        final CheckState checkState = new CheckState("CHECK_STATE_UNSPECIFIED", 0, 0);
                        CHECK_STATE_UNSPECIFIED = checkState;
                        CHECK_STATE_UNCHECKED = new CheckState("CHECK_STATE_UNCHECKED", 1, 1);
                        CHECK_STATE_HALF_CHECKED = new CheckState("CHECK_STATE_HALF_CHECKED", 2, 2);
                        CHECK_STATE_CHECKED = new CheckState("CHECK_STATE_CHECKED", 3, 3);
                        CheckState[] checkStateArr$values = $values();
                        $VALUES = checkStateArr$values;
                        $ENTRIES = EnumEntries2.enumEntries(checkStateArr$values);
                        INSTANCE = new Companion(null);
                        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckState.class);
                        final Syntax syntax = Syntax.PROTO_3;
                        ADAPTER = new EnumAdapter<CheckState>(orCreateKotlinClass, syntax, checkState) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState$Companion$ADAPTER$1
                            /* JADX INFO: Access modifiers changed from: protected */
                            @Override // com.squareup.wire.EnumAdapter
                            public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState fromValue(int value) {
                                return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.INSTANCE.fromValue(value);
                            }
                        };
                    }

                    /* compiled from: StreamTaxLotViewModelsResponse.kt */
                    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState;", "fromValue", "value", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        @JvmStatic
                        public final CheckState fromValue(int value) {
                            if (value == 0) {
                                return CheckState.CHECK_STATE_UNSPECIFIED;
                            }
                            if (value == 1) {
                                return CheckState.CHECK_STATE_UNCHECKED;
                            }
                            if (value == 2) {
                                return CheckState.CHECK_STATE_HALF_CHECKED;
                            }
                            if (value != 3) {
                                return null;
                            }
                            return CheckState.CHECK_STATE_CHECKED;
                        }
                    }

                    public static CheckState valueOf(String str) {
                        return (CheckState) Enum.valueOf(CheckState.class, str);
                    }

                    public static CheckState[] values() {
                        return (CheckState[]) $VALUES.clone();
                    }
                }
            }
        }

        /* compiled from: StreamTaxLotViewModelsResponse.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent;", "Lcom/squareup/wire/Message;", "", "dismissable_alert", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent$DismissableAlert;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent$DismissableAlert;Lokio/ByteString;)V", "getDismissable_alert", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent$DismissableAlert;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "DismissableAlert", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DisabledContent extends Message {

            @JvmField
            public static final ProtoAdapter<DisabledContent> ADAPTER;

            @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent$DismissableAlert#ADAPTER", jsonName = "dismissableAlert", oneofName = "type", schemaIndex = 0, tag = 1)
            private final DismissableAlert dismissable_alert;

            /* JADX WARN: Multi-variable type inference failed */
            public DisabledContent() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29035newBuilder();
            }

            public final DismissableAlert getDismissable_alert() {
                return this.dismissable_alert;
            }

            public /* synthetic */ DisabledContent(DismissableAlert dismissableAlert, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : dismissableAlert, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisabledContent(DismissableAlert dismissableAlert, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.dismissable_alert = dismissableAlert;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29035newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof DisabledContent)) {
                    return false;
                }
                DisabledContent disabledContent = (DisabledContent) other;
                return Intrinsics.areEqual(unknownFields(), disabledContent.unknownFields()) && Intrinsics.areEqual(this.dismissable_alert, disabledContent.dismissable_alert);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                DismissableAlert dismissableAlert = this.dismissable_alert;
                int iHashCode2 = iHashCode + (dismissableAlert != null ? dismissableAlert.hashCode() : 0);
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                DismissableAlert dismissableAlert = this.dismissable_alert;
                if (dismissableAlert != null) {
                    arrayList.add("dismissable_alert=" + dismissableAlert);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DisabledContent{", "}", 0, null, null, 56, null);
            }

            public final DisabledContent copy(DismissableAlert dismissable_alert, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new DisabledContent(dismissable_alert, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DisabledContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<DisabledContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert dismissableAlertDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent(dismissableAlertDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                dismissableAlertDecode = StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size() + StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert.ADAPTER.encodedSizeWithTag(1, value.getDismissable_alert());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert.ADAPTER.encodeWithTag(writer, 1, (int) value.getDismissable_alert());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert.ADAPTER.encodeWithTag(writer, 1, (int) value.getDismissable_alert());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent redact(StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert dismissable_alert = value.getDismissable_alert();
                        return value.copy(dismissable_alert != null ? StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert.ADAPTER.redact(dismissable_alert) : null, ByteString.EMPTY);
                    }
                };
            }

            /* compiled from: StreamTaxLotViewModelsResponse.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent$DismissableAlert;", "Lcom/squareup/wire/Message;", "", "title", "", CarResultComposable2.BODY, "analytics_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getAnalytics_identifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class DismissableAlert extends Message {

                @JvmField
                public static final ProtoAdapter<DismissableAlert> ADAPTER;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "analyticsIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
                private final String analytics_identifier;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
                private final String body;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                private final String title;

                public DismissableAlert() {
                    this(null, null, null, null, 15, null);
                }

                public /* synthetic */ DismissableAlert(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m29036newBuilder();
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getBody() {
                    return this.body;
                }

                public final String getAnalytics_identifier() {
                    return this.analytics_identifier;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DismissableAlert(String title, String body, String analytics_identifier, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(body, "body");
                    Intrinsics.checkNotNullParameter(analytics_identifier, "analytics_identifier");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.title = title;
                    this.body = body;
                    this.analytics_identifier = analytics_identifier;
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m29036newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof DismissableAlert)) {
                        return false;
                    }
                    DismissableAlert dismissableAlert = (DismissableAlert) other;
                    return Intrinsics.areEqual(unknownFields(), dismissableAlert.unknownFields()) && Intrinsics.areEqual(this.title, dismissableAlert.title) && Intrinsics.areEqual(this.body, dismissableAlert.body) && Intrinsics.areEqual(this.analytics_identifier, dismissableAlert.analytics_identifier);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = (((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.body.hashCode()) * 37) + this.analytics_identifier.hashCode();
                    this.hashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("title=" + Internal.sanitize(this.title));
                    arrayList.add("body=" + Internal.sanitize(this.body));
                    arrayList.add("analytics_identifier=" + Internal.sanitize(this.analytics_identifier));
                    return CollectionsKt.joinToString$default(arrayList, ", ", "DismissableAlert{", "}", 0, null, null, 56, null);
                }

                public static /* synthetic */ DismissableAlert copy$default(DismissableAlert dismissableAlert, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = dismissableAlert.title;
                    }
                    if ((i & 2) != 0) {
                        str2 = dismissableAlert.body;
                    }
                    if ((i & 4) != 0) {
                        str3 = dismissableAlert.analytics_identifier;
                    }
                    if ((i & 8) != 0) {
                        byteString = dismissableAlert.unknownFields();
                    }
                    return dismissableAlert.copy(str, str2, str3, byteString);
                }

                public final DismissableAlert copy(String title, String body, String analytics_identifier, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(body, "body");
                    Intrinsics.checkNotNullParameter(analytics_identifier, "analytics_identifier");
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new DismissableAlert(title, body, analytics_identifier, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DismissableAlert.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<DismissableAlert>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent$DismissableAlert$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            String strDecode = "";
                            String strDecode2 = "";
                            String strDecode3 = strDecode2;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                } else if (iNextTag == 2) {
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                } else if (iNextTag == 3) {
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            int size = value.unknownFields().size();
                            if (!Intrinsics.areEqual(value.getTitle(), "")) {
                                size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                            }
                            if (!Intrinsics.areEqual(value.getBody(), "")) {
                                size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBody());
                            }
                            return !Intrinsics.areEqual(value.getAnalytics_identifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAnalytics_identifier()) : size;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            if (!Intrinsics.areEqual(value.getTitle(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                            }
                            if (!Intrinsics.areEqual(value.getBody(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody());
                            }
                            if (!Intrinsics.areEqual(value.getAnalytics_identifier(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAnalytics_identifier());
                            }
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            if (!Intrinsics.areEqual(value.getAnalytics_identifier(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAnalytics_identifier());
                            }
                            if (!Intrinsics.areEqual(value.getBody(), "")) {
                                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody());
                            }
                            if (Intrinsics.areEqual(value.getTitle(), "")) {
                                return;
                            }
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert redact(StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                        }
                    };
                }
            }
        }
    }
}
