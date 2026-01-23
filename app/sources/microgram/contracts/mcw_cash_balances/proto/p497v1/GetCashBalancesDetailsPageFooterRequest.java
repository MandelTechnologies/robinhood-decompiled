package microgram.contracts.mcw_cash_balances.proto.p497v1;

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

/* compiled from: GetCashBalancesDetailsPageFooterRequest.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetCashBalancesDetailsPageFooterRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetCashBalancesDetailsPageFooterRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    /* JADX WARN: Multi-variable type inference failed */
    public GetCashBalancesDetailsPageFooterRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29154newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetCashBalancesDetailsPageFooterRequest(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCashBalancesDetailsPageFooterRequest(String account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29154newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCashBalancesDetailsPageFooterRequest)) {
            return false;
        }
        GetCashBalancesDetailsPageFooterRequest getCashBalancesDetailsPageFooterRequest = (GetCashBalancesDetailsPageFooterRequest) other;
        return Intrinsics.areEqual(unknownFields(), getCashBalancesDetailsPageFooterRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, getCashBalancesDetailsPageFooterRequest.account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.account_number.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCashBalancesDetailsPageFooterRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCashBalancesDetailsPageFooterRequest copy$default(GetCashBalancesDetailsPageFooterRequest getCashBalancesDetailsPageFooterRequest, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCashBalancesDetailsPageFooterRequest.account_number;
        }
        if ((i & 2) != 0) {
            byteString = getCashBalancesDetailsPageFooterRequest.unknownFields();
        }
        return getCashBalancesDetailsPageFooterRequest.copy(str, byteString);
    }

    public final GetCashBalancesDetailsPageFooterRequest copy(String account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCashBalancesDetailsPageFooterRequest(account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCashBalancesDetailsPageFooterRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCashBalancesDetailsPageFooterRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.mcw_cash_balances.proto.v1.GetCashBalancesDetailsPageFooterRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCashBalancesDetailsPageFooterRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return !Intrinsics.areEqual(value.getAccount_number(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCashBalancesDetailsPageFooterRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCashBalancesDetailsPageFooterRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCashBalancesDetailsPageFooterRequest redact(GetCashBalancesDetailsPageFooterRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetCashBalancesDetailsPageFooterRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCashBalancesDetailsPageFooterRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCashBalancesDetailsPageFooterRequest(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
