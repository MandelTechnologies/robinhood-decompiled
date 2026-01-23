package moneytree.p510v1;

import com.robinhood.models.card.p311db.Card;
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

/* compiled from: GetMonthlyInterestHistoryResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lmoneytree/v1/GetMonthlyInterestHistoryResponse;", "Lcom/squareup/wire/Message;", "", Card.Icon.PAYMENT, "Lmoneytree/v1/InterestPayment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmoneytree/v1/InterestPayment;Lokio/ByteString;)V", "getPayment", "()Lmoneytree/v1/InterestPayment;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetMonthlyInterestHistoryResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetMonthlyInterestHistoryResponse> ADAPTER;

    @WireField(adapter = "moneytree.v1.InterestPayment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final InterestPayment payment;

    /* JADX WARN: Multi-variable type inference failed */
    public GetMonthlyInterestHistoryResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29333newBuilder();
    }

    public final InterestPayment getPayment() {
        return this.payment;
    }

    public /* synthetic */ GetMonthlyInterestHistoryResponse(InterestPayment interestPayment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interestPayment, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMonthlyInterestHistoryResponse(InterestPayment interestPayment, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.payment = interestPayment;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29333newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetMonthlyInterestHistoryResponse)) {
            return false;
        }
        GetMonthlyInterestHistoryResponse getMonthlyInterestHistoryResponse = (GetMonthlyInterestHistoryResponse) other;
        return Intrinsics.areEqual(unknownFields(), getMonthlyInterestHistoryResponse.unknownFields()) && Intrinsics.areEqual(this.payment, getMonthlyInterestHistoryResponse.payment);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        InterestPayment interestPayment = this.payment;
        int iHashCode2 = iHashCode + (interestPayment != null ? interestPayment.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        InterestPayment interestPayment = this.payment;
        if (interestPayment != null) {
            arrayList.add("payment=" + interestPayment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMonthlyInterestHistoryResponse{", "}", 0, null, null, 56, null);
    }

    public final GetMonthlyInterestHistoryResponse copy(InterestPayment payment, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetMonthlyInterestHistoryResponse(payment, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetMonthlyInterestHistoryResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetMonthlyInterestHistoryResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: moneytree.v1.GetMonthlyInterestHistoryResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetMonthlyInterestHistoryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getPayment() != null ? size + InterestPayment.ADAPTER.encodedSizeWithTag(1, value.getPayment()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetMonthlyInterestHistoryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPayment() != null) {
                    InterestPayment.ADAPTER.encodeWithTag(writer, 1, (int) value.getPayment());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetMonthlyInterestHistoryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPayment() != null) {
                    InterestPayment.ADAPTER.encodeWithTag(writer, 1, (int) value.getPayment());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMonthlyInterestHistoryResponse redact(GetMonthlyInterestHistoryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                InterestPayment payment = value.getPayment();
                return value.copy(payment != null ? InterestPayment.ADAPTER.redact(payment) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMonthlyInterestHistoryResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                InterestPayment interestPaymentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetMonthlyInterestHistoryResponse(interestPaymentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        interestPaymentDecode = InterestPayment.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
