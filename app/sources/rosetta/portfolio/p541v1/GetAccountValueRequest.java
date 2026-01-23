package rosetta.portfolio.p541v1;

import com.robinhood.rosetta.common.Currency;
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

/* compiled from: GetAccountValueRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lrosetta/portfolio/v1/GetAccountValueRequest;", "Lcom/squareup/wire/Message;", "", "account", "", "bounds", "display_currency", "Lcom/robinhood/rosetta/common/Currency;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Lokio/ByteString;)V", "getAccount", "()Ljava/lang/String;", "getBounds", "getDisplay_currency", "()Lcom/robinhood/rosetta/common/Currency;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class GetAccountValueRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountValueRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String bounds;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", jsonName = "displayCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Currency display_currency;

    public GetAccountValueRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29923newBuilder();
    }

    public final String getAccount() {
        return this.account;
    }

    public /* synthetic */ GetAccountValueRequest(String str, String str2, Currency currency, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getBounds() {
        return this.bounds;
    }

    public final Currency getDisplay_currency() {
        return this.display_currency;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountValueRequest(String account, String str, Currency display_currency, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(display_currency, "display_currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account = account;
        this.bounds = str;
        this.display_currency = display_currency;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29923newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountValueRequest)) {
            return false;
        }
        GetAccountValueRequest getAccountValueRequest = (GetAccountValueRequest) other;
        return Intrinsics.areEqual(unknownFields(), getAccountValueRequest.unknownFields()) && Intrinsics.areEqual(this.account, getAccountValueRequest.account) && Intrinsics.areEqual(this.bounds, getAccountValueRequest.bounds) && this.display_currency == getAccountValueRequest.display_currency;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account.hashCode()) * 37;
        String str = this.bounds;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.display_currency.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account=" + Internal.sanitize(this.account));
        String str = this.bounds;
        if (str != null) {
            arrayList.add("bounds=" + Internal.sanitize(str));
        }
        arrayList.add("display_currency=" + this.display_currency);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountValueRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAccountValueRequest copy$default(GetAccountValueRequest getAccountValueRequest, String str, String str2, Currency currency, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAccountValueRequest.account;
        }
        if ((i & 2) != 0) {
            str2 = getAccountValueRequest.bounds;
        }
        if ((i & 4) != 0) {
            currency = getAccountValueRequest.display_currency;
        }
        if ((i & 8) != 0) {
            byteString = getAccountValueRequest.unknownFields();
        }
        return getAccountValueRequest.copy(str, str2, currency, byteString);
    }

    public final GetAccountValueRequest copy(String account, String bounds, Currency display_currency, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(display_currency, "display_currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountValueRequest(account, bounds, display_currency, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountValueRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountValueRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.portfolio.v1.GetAccountValueRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountValueRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBounds());
                return value.getDisplay_currency() != Currency.CURRENCY_UNSPECIFIED ? iEncodedSizeWithTag + Currency.ADAPTER.encodedSizeWithTag(3, value.getDisplay_currency()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountValueRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBounds());
                if (value.getDisplay_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getDisplay_currency());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountValueRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDisplay_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getDisplay_currency());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getBounds());
                if (Intrinsics.areEqual(value.getAccount(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountValueRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAccountValueRequest(strDecode, strDecode2, currencyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            currencyDecode = Currency.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountValueRequest redact(GetAccountValueRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAccountValueRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
