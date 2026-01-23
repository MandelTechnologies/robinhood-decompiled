package crypto_perpetuals.contract.p436v1;

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

/* compiled from: CurrencyInput.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/CurrencyInput;", "Lcom/squareup/wire/Message;", "", "id", "", "code", "increment", "min_size", "max_size", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getCode", "getIncrement", "getMin_size", "getMax_size", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CurrencyInput extends Message {

    @JvmField
    public static final ProtoAdapter<CurrencyInput> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String increment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String max_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String min_size;

    public CurrencyInput() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ CurrencyInput(String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27829newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getIncrement() {
        return this.increment;
    }

    public final String getMin_size() {
        return this.min_size;
    }

    public final String getMax_size() {
        return this.max_size;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyInput(String id, String code, String increment, String min_size, String max_size, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(increment, "increment");
        Intrinsics.checkNotNullParameter(min_size, "min_size");
        Intrinsics.checkNotNullParameter(max_size, "max_size");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.code = code;
        this.increment = increment;
        this.min_size = min_size;
        this.max_size = max_size;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27829newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CurrencyInput)) {
            return false;
        }
        CurrencyInput currencyInput = (CurrencyInput) other;
        return Intrinsics.areEqual(unknownFields(), currencyInput.unknownFields()) && Intrinsics.areEqual(this.id, currencyInput.id) && Intrinsics.areEqual(this.code, currencyInput.code) && Intrinsics.areEqual(this.increment, currencyInput.increment) && Intrinsics.areEqual(this.min_size, currencyInput.min_size) && Intrinsics.areEqual(this.max_size, currencyInput.max_size);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.code.hashCode()) * 37) + this.increment.hashCode()) * 37) + this.min_size.hashCode()) * 37) + this.max_size.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("code=" + Internal.sanitize(this.code));
        arrayList.add("increment=" + Internal.sanitize(this.increment));
        arrayList.add("min_size=" + Internal.sanitize(this.min_size));
        arrayList.add("max_size=" + Internal.sanitize(this.max_size));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CurrencyInput{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CurrencyInput copy$default(CurrencyInput currencyInput, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currencyInput.id;
        }
        if ((i & 2) != 0) {
            str2 = currencyInput.code;
        }
        if ((i & 4) != 0) {
            str3 = currencyInput.increment;
        }
        if ((i & 8) != 0) {
            str4 = currencyInput.min_size;
        }
        if ((i & 16) != 0) {
            str5 = currencyInput.max_size;
        }
        if ((i & 32) != 0) {
            byteString = currencyInput.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        return currencyInput.copy(str, str2, str3, str4, str6, byteString2);
    }

    public final CurrencyInput copy(String id, String code, String increment, String min_size, String max_size, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(increment, "increment");
        Intrinsics.checkNotNullParameter(min_size, "min_size");
        Intrinsics.checkNotNullParameter(max_size, "max_size");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CurrencyInput(id, code, increment, min_size, max_size, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyInput.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CurrencyInput>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.contract.v1.CurrencyInput$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CurrencyInput value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getCode(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCode());
                }
                if (!Intrinsics.areEqual(value.getIncrement(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getIncrement());
                }
                if (!Intrinsics.areEqual(value.getMin_size(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getMin_size());
                }
                return !Intrinsics.areEqual(value.getMax_size(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getMax_size()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CurrencyInput value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getCode(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCode());
                }
                if (!Intrinsics.areEqual(value.getIncrement(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIncrement());
                }
                if (!Intrinsics.areEqual(value.getMin_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMin_size());
                }
                if (!Intrinsics.areEqual(value.getMax_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMax_size());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CurrencyInput value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMax_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMax_size());
                }
                if (!Intrinsics.areEqual(value.getMin_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMin_size());
                }
                if (!Intrinsics.areEqual(value.getIncrement(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIncrement());
                }
                if (!Intrinsics.areEqual(value.getCode(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCode());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CurrencyInput redact(CurrencyInput value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CurrencyInput.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CurrencyInput decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CurrencyInput(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
