package contracts.money_movement.crypto_account_selection.proto.p432v1;

import bff_money_movement.service.p019v1.FetchCryptoBillingAccountsResponse;
import com.robinhood.rosetta.common.Money;
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

/* compiled from: GetAccountsResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponse;", "Lcom/squareup/wire/Message;", "", "response", "Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponse;", "minimum_amount", "Lcom/robinhood/rosetta/common/Money;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponse;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getResponse", "()Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponse;", "getMinimum_amount", "()Lcom/robinhood/rosetta/common/Money;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetAccountsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountsResponse> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "minimumAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money minimum_amount;

    @WireField(adapter = "bff_money_movement.service.v1.FetchCryptoBillingAccountsResponse#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FetchCryptoBillingAccountsResponse response;

    public GetAccountsResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27767newBuilder();
    }

    public final FetchCryptoBillingAccountsResponse getResponse() {
        return this.response;
    }

    public final Money getMinimum_amount() {
        return this.minimum_amount;
    }

    public /* synthetic */ GetAccountsResponse(FetchCryptoBillingAccountsResponse fetchCryptoBillingAccountsResponse, Money money, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fetchCryptoBillingAccountsResponse, (i & 2) != 0 ? null : money, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountsResponse(FetchCryptoBillingAccountsResponse fetchCryptoBillingAccountsResponse, Money money, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.response = fetchCryptoBillingAccountsResponse;
        this.minimum_amount = money;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27767newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountsResponse)) {
            return false;
        }
        GetAccountsResponse getAccountsResponse = (GetAccountsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAccountsResponse.unknownFields()) && Intrinsics.areEqual(this.response, getAccountsResponse.response) && Intrinsics.areEqual(this.minimum_amount, getAccountsResponse.minimum_amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FetchCryptoBillingAccountsResponse fetchCryptoBillingAccountsResponse = this.response;
        int iHashCode2 = (iHashCode + (fetchCryptoBillingAccountsResponse != null ? fetchCryptoBillingAccountsResponse.hashCode() : 0)) * 37;
        Money money = this.minimum_amount;
        int iHashCode3 = iHashCode2 + (money != null ? money.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FetchCryptoBillingAccountsResponse fetchCryptoBillingAccountsResponse = this.response;
        if (fetchCryptoBillingAccountsResponse != null) {
            arrayList.add("response=" + fetchCryptoBillingAccountsResponse);
        }
        Money money = this.minimum_amount;
        if (money != null) {
            arrayList.add("minimum_amount=" + money);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountsResponse{", "}", 0, null, null, 56, null);
    }

    public final GetAccountsResponse copy(FetchCryptoBillingAccountsResponse response, Money minimum_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountsResponse(response, minimum_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.money_movement.crypto_account_selection.proto.v1.GetAccountsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getResponse() != null) {
                    size += FetchCryptoBillingAccountsResponse.ADAPTER.encodedSizeWithTag(1, value.getResponse());
                }
                return value.getMinimum_amount() != null ? size + Money.ADAPTER.encodedSizeWithTag(2, value.getMinimum_amount()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getResponse() != null) {
                    FetchCryptoBillingAccountsResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getResponse());
                }
                if (value.getMinimum_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMinimum_amount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMinimum_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMinimum_amount());
                }
                if (value.getResponse() != null) {
                    FetchCryptoBillingAccountsResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getResponse());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountsResponse redact(GetAccountsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FetchCryptoBillingAccountsResponse response = value.getResponse();
                FetchCryptoBillingAccountsResponse fetchCryptoBillingAccountsResponseRedact = response != null ? FetchCryptoBillingAccountsResponse.ADAPTER.redact(response) : null;
                Money minimum_amount = value.getMinimum_amount();
                return value.copy(fetchCryptoBillingAccountsResponseRedact, minimum_amount != null ? Money.ADAPTER.redact(minimum_amount) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FetchCryptoBillingAccountsResponse fetchCryptoBillingAccountsResponseDecode = null;
                Money moneyDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAccountsResponse(fetchCryptoBillingAccountsResponseDecode, moneyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        fetchCryptoBillingAccountsResponseDecode = FetchCryptoBillingAccountsResponse.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
