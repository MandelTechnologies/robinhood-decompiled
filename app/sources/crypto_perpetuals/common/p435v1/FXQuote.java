package crypto_perpetuals.common.p435v1;

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

/* compiled from: FXQuote.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/FXQuote;", "Lcom/squareup/wire/Message;", "", "from_currency_code", "", "to_currency_code", "exchange_rate", "haircut", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getFrom_currency_code", "()Ljava/lang/String;", "getTo_currency_code", "getExchange_rate", "getHaircut", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FXQuote extends Message {

    @JvmField
    public static final ProtoAdapter<FXQuote> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exchangeRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String exchange_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fromCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String from_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String haircut;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "toCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String to_currency_code;

    public FXQuote() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ FXQuote(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27813newBuilder();
    }

    public final String getFrom_currency_code() {
        return this.from_currency_code;
    }

    public final String getTo_currency_code() {
        return this.to_currency_code;
    }

    public final String getExchange_rate() {
        return this.exchange_rate;
    }

    public final String getHaircut() {
        return this.haircut;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FXQuote(String from_currency_code, String to_currency_code, String exchange_rate, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(from_currency_code, "from_currency_code");
        Intrinsics.checkNotNullParameter(to_currency_code, "to_currency_code");
        Intrinsics.checkNotNullParameter(exchange_rate, "exchange_rate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.from_currency_code = from_currency_code;
        this.to_currency_code = to_currency_code;
        this.exchange_rate = exchange_rate;
        this.haircut = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27813newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FXQuote)) {
            return false;
        }
        FXQuote fXQuote = (FXQuote) other;
        return Intrinsics.areEqual(unknownFields(), fXQuote.unknownFields()) && Intrinsics.areEqual(this.from_currency_code, fXQuote.from_currency_code) && Intrinsics.areEqual(this.to_currency_code, fXQuote.to_currency_code) && Intrinsics.areEqual(this.exchange_rate, fXQuote.exchange_rate) && Intrinsics.areEqual(this.haircut, fXQuote.haircut);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.from_currency_code.hashCode()) * 37) + this.to_currency_code.hashCode()) * 37) + this.exchange_rate.hashCode()) * 37;
        String str = this.haircut;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("from_currency_code=" + Internal.sanitize(this.from_currency_code));
        arrayList.add("to_currency_code=" + Internal.sanitize(this.to_currency_code));
        arrayList.add("exchange_rate=" + Internal.sanitize(this.exchange_rate));
        String str = this.haircut;
        if (str != null) {
            arrayList.add("haircut=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FXQuote{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FXQuote copy$default(FXQuote fXQuote, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fXQuote.from_currency_code;
        }
        if ((i & 2) != 0) {
            str2 = fXQuote.to_currency_code;
        }
        if ((i & 4) != 0) {
            str3 = fXQuote.exchange_rate;
        }
        if ((i & 8) != 0) {
            str4 = fXQuote.haircut;
        }
        if ((i & 16) != 0) {
            byteString = fXQuote.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return fXQuote.copy(str, str2, str5, str4, byteString2);
    }

    public final FXQuote copy(String from_currency_code, String to_currency_code, String exchange_rate, String haircut, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(from_currency_code, "from_currency_code");
        Intrinsics.checkNotNullParameter(to_currency_code, "to_currency_code");
        Intrinsics.checkNotNullParameter(exchange_rate, "exchange_rate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FXQuote(from_currency_code, to_currency_code, exchange_rate, haircut, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FXQuote.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FXQuote>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.common.v1.FXQuote$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FXQuote value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getFrom_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFrom_currency_code());
                }
                if (!Intrinsics.areEqual(value.getTo_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTo_currency_code());
                }
                if (!Intrinsics.areEqual(value.getExchange_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getExchange_rate());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getHaircut());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FXQuote value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getFrom_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFrom_currency_code());
                }
                if (!Intrinsics.areEqual(value.getTo_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTo_currency_code());
                }
                if (!Intrinsics.areEqual(value.getExchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getExchange_rate());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getHaircut());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FXQuote value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getHaircut());
                if (!Intrinsics.areEqual(value.getExchange_rate(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getExchange_rate());
                }
                if (!Intrinsics.areEqual(value.getTo_currency_code(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTo_currency_code());
                }
                if (Intrinsics.areEqual(value.getFrom_currency_code(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getFrom_currency_code());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FXQuote redact(FXQuote value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FXQuote.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FXQuote decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = null;
                String strDecode4 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FXQuote(strDecode, strDecode4, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
