package nummus.p512v1;

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

/* compiled from: TaxlotabilityRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lnummus/v1/TaxlotabilityRequest;", "Lcom/squareup/wire/Message;", "", "currency_pair_id", "", "account_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency_pair_id", "()Ljava/lang/String;", "getAccount_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TaxlotabilityRequest extends Message {

    @JvmField
    public static final ProtoAdapter<TaxlotabilityRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String currency_pair_id;

    public TaxlotabilityRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29440newBuilder();
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public /* synthetic */ TaxlotabilityRequest(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxlotabilityRequest(String currency_pair_id, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_pair_id = currency_pair_id;
        this.account_id = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29440newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxlotabilityRequest)) {
            return false;
        }
        TaxlotabilityRequest taxlotabilityRequest = (TaxlotabilityRequest) other;
        return Intrinsics.areEqual(unknownFields(), taxlotabilityRequest.unknownFields()) && Intrinsics.areEqual(this.currency_pair_id, taxlotabilityRequest.currency_pair_id) && Intrinsics.areEqual(this.account_id, taxlotabilityRequest.account_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.currency_pair_id.hashCode()) * 37;
        String str = this.account_id;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        String str = this.account_id;
        if (str != null) {
            arrayList.add("account_id=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxlotabilityRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxlotabilityRequest copy$default(TaxlotabilityRequest taxlotabilityRequest, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxlotabilityRequest.currency_pair_id;
        }
        if ((i & 2) != 0) {
            str2 = taxlotabilityRequest.account_id;
        }
        if ((i & 4) != 0) {
            byteString = taxlotabilityRequest.unknownFields();
        }
        return taxlotabilityRequest.copy(str, str2, byteString);
    }

    public final TaxlotabilityRequest copy(String currency_pair_id, String account_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxlotabilityRequest(currency_pair_id, account_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxlotabilityRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxlotabilityRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.TaxlotabilityRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxlotabilityRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_pair_id());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxlotabilityRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxlotabilityRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount_id());
                if (Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxlotabilityRequest redact(TaxlotabilityRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TaxlotabilityRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxlotabilityRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TaxlotabilityRequest(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
