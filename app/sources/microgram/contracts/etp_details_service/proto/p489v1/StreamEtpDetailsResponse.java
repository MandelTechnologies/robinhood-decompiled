package microgram.contracts.etp_details_service.proto.p489v1;

import com.robinhood.rosetta.common.Date;
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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: StreamEtpDetailsResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JJ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lmicrogram/contracts/etp_details_service/proto/v1/StreamEtpDetailsResponse;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", "gross_management_fee_discount", "gross_management_fee", "gross_management_fee_discount_expiration_date", "Lcom/robinhood/rosetta/common/Date;", "gross_expense_ratio", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Date;Ljava/lang/String;Lokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getGross_management_fee_discount", "getGross_management_fee", "getGross_management_fee_discount_expiration_date", "()Lcom/robinhood/rosetta/common/Date;", "getGross_expense_ratio", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "etp_details_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class StreamEtpDetailsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamEtpDetailsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "grossExpenseRatio", schemaIndex = 4, tag = 5)
    private final String gross_expense_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "grossManagementFee", schemaIndex = 2, tag = 3)
    private final String gross_management_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "grossManagementFeeDiscount", schemaIndex = 1, tag = 2)
    private final String gross_management_fee_discount;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "grossManagementFeeDiscountExpirationDate", schemaIndex = 3, tag = 4)
    private final Date gross_management_fee_discount_expiration_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    public StreamEtpDetailsResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29081newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public /* synthetic */ StreamEtpDetailsResponse(String str, String str2, String str3, Date date, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : date, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getGross_management_fee_discount() {
        return this.gross_management_fee_discount;
    }

    public final String getGross_management_fee() {
        return this.gross_management_fee;
    }

    public final Date getGross_management_fee_discount_expiration_date() {
        return this.gross_management_fee_discount_expiration_date;
    }

    public final String getGross_expense_ratio() {
        return this.gross_expense_ratio;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamEtpDetailsResponse(String instrument_id, String str, String str2, Date date, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.gross_management_fee_discount = str;
        this.gross_management_fee = str2;
        this.gross_management_fee_discount_expiration_date = date;
        this.gross_expense_ratio = str3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29081newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamEtpDetailsResponse)) {
            return false;
        }
        StreamEtpDetailsResponse streamEtpDetailsResponse = (StreamEtpDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamEtpDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.instrument_id, streamEtpDetailsResponse.instrument_id) && Intrinsics.areEqual(this.gross_management_fee_discount, streamEtpDetailsResponse.gross_management_fee_discount) && Intrinsics.areEqual(this.gross_management_fee, streamEtpDetailsResponse.gross_management_fee) && Intrinsics.areEqual(this.gross_management_fee_discount_expiration_date, streamEtpDetailsResponse.gross_management_fee_discount_expiration_date) && Intrinsics.areEqual(this.gross_expense_ratio, streamEtpDetailsResponse.gross_expense_ratio);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37;
        String str = this.gross_management_fee_discount;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.gross_management_fee;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Date date = this.gross_management_fee_discount_expiration_date;
        int iHashCode4 = (iHashCode3 + (date != null ? date.hashCode() : 0)) * 37;
        String str3 = this.gross_expense_ratio;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        String str = this.gross_management_fee_discount;
        if (str != null) {
            arrayList.add("gross_management_fee_discount=" + Internal.sanitize(str));
        }
        String str2 = this.gross_management_fee;
        if (str2 != null) {
            arrayList.add("gross_management_fee=" + Internal.sanitize(str2));
        }
        Date date = this.gross_management_fee_discount_expiration_date;
        if (date != null) {
            arrayList.add("gross_management_fee_discount_expiration_date=" + date);
        }
        String str3 = this.gross_expense_ratio;
        if (str3 != null) {
            arrayList.add("gross_expense_ratio=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamEtpDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamEtpDetailsResponse copy$default(StreamEtpDetailsResponse streamEtpDetailsResponse, String str, String str2, String str3, Date date, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamEtpDetailsResponse.instrument_id;
        }
        if ((i & 2) != 0) {
            str2 = streamEtpDetailsResponse.gross_management_fee_discount;
        }
        if ((i & 4) != 0) {
            str3 = streamEtpDetailsResponse.gross_management_fee;
        }
        if ((i & 8) != 0) {
            date = streamEtpDetailsResponse.gross_management_fee_discount_expiration_date;
        }
        if ((i & 16) != 0) {
            str4 = streamEtpDetailsResponse.gross_expense_ratio;
        }
        if ((i & 32) != 0) {
            byteString = streamEtpDetailsResponse.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return streamEtpDetailsResponse.copy(str, str2, str3, date, str5, byteString2);
    }

    public final StreamEtpDetailsResponse copy(String instrument_id, String gross_management_fee_discount, String gross_management_fee, Date gross_management_fee_discount_expiration_date, String gross_expense_ratio, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamEtpDetailsResponse(instrument_id, gross_management_fee_discount, gross_management_fee, gross_management_fee_discount_expiration_date, gross_expense_ratio, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamEtpDetailsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamEtpDetailsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.etp_details_service.proto.v1.StreamEtpDetailsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamEtpDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(2, value.getGross_management_fee_discount()) + protoAdapter.encodedSizeWithTag(3, value.getGross_management_fee()) + Date.ADAPTER.encodedSizeWithTag(4, value.getGross_management_fee_discount_expiration_date()) + protoAdapter.encodedSizeWithTag(5, value.getGross_expense_ratio());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamEtpDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getGross_management_fee_discount());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getGross_management_fee());
                Date.ADAPTER.encodeWithTag(writer, 4, (int) value.getGross_management_fee_discount_expiration_date());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getGross_expense_ratio());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamEtpDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getGross_expense_ratio());
                Date.ADAPTER.encodeWithTag(writer, 4, (int) value.getGross_management_fee_discount_expiration_date());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getGross_management_fee());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getGross_management_fee_discount());
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamEtpDetailsResponse redact(StreamEtpDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Date gross_management_fee_discount_expiration_date = value.getGross_management_fee_discount_expiration_date();
                return StreamEtpDetailsResponse.copy$default(value, null, null, null, gross_management_fee_discount_expiration_date != null ? Date.ADAPTER.redact(gross_management_fee_discount_expiration_date) : null, null, ByteString.EMPTY, 23, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamEtpDetailsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = null;
                Date dateDecode = null;
                String strDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamEtpDetailsResponse(strDecode, strDecode2, strDecode3, dateDecode, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        dateDecode = Date.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
