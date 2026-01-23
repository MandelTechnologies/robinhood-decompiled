package crypto_perpetuals.currency.p437v1;

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
import crypto_perpetuals.currency.p437v1.Currency;
import java.io.IOException;
import java.util.ArrayList;
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
import okio.ByteString;

/* compiled from: Currency.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcrypto_perpetuals/currency/v1/Currency;", "Lcom/squareup/wire/Message;", "", "id", "", "code", "name", "type", "Lcrypto_perpetuals/currency/v1/Currency$CurrencyType;", "increment", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/currency/v1/Currency$CurrencyType;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getCode", "getName", "getType", "()Lcrypto_perpetuals/currency/v1/Currency$CurrencyType;", "getIncrement", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "CurrencyType", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Currency extends Message {

    @JvmField
    public static final ProtoAdapter<Currency> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String increment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String name;

    @WireField(adapter = "crypto_perpetuals.currency.v1.Currency$CurrencyType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CurrencyType type;

    public Currency() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ Currency(String str, String str2, String str3, CurrencyType currencyType, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CurrencyType.CURRENCY_TYPE_UNSPECIFIED : currencyType, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27830newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final CurrencyType getType() {
        return this.type;
    }

    public final String getIncrement() {
        return this.increment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Currency(String id, String code, String name, CurrencyType type2, String increment, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(increment, "increment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.code = code;
        this.name = name;
        this.type = type2;
        this.increment = increment;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27830newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Currency)) {
            return false;
        }
        Currency currency = (Currency) other;
        return Intrinsics.areEqual(unknownFields(), currency.unknownFields()) && Intrinsics.areEqual(this.id, currency.id) && Intrinsics.areEqual(this.code, currency.code) && Intrinsics.areEqual(this.name, currency.name) && this.type == currency.type && Intrinsics.areEqual(this.increment, currency.increment);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.code.hashCode()) * 37) + this.name.hashCode()) * 37) + this.type.hashCode()) * 37) + this.increment.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("code=" + Internal.sanitize(this.code));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("type=" + this.type);
        arrayList.add("increment=" + Internal.sanitize(this.increment));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Currency{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Currency copy$default(Currency currency, String str, String str2, String str3, CurrencyType currencyType, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currency.id;
        }
        if ((i & 2) != 0) {
            str2 = currency.code;
        }
        if ((i & 4) != 0) {
            str3 = currency.name;
        }
        if ((i & 8) != 0) {
            currencyType = currency.type;
        }
        if ((i & 16) != 0) {
            str4 = currency.increment;
        }
        if ((i & 32) != 0) {
            byteString = currency.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return currency.copy(str, str2, str3, currencyType, str5, byteString2);
    }

    public final Currency copy(String id, String code, String name, CurrencyType type2, String increment, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(increment, "increment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Currency(id, code, name, type2, increment, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Currency.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Currency>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.currency.v1.Currency$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Currency value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getCode(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCode());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getName());
                }
                if (value.getType() != Currency.CurrencyType.CURRENCY_TYPE_UNSPECIFIED) {
                    size += Currency.CurrencyType.ADAPTER.encodedSizeWithTag(4, value.getType());
                }
                return !Intrinsics.areEqual(value.getIncrement(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getIncrement()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Currency value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getCode(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCode());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (value.getType() != Currency.CurrencyType.CURRENCY_TYPE_UNSPECIFIED) {
                    Currency.CurrencyType.ADAPTER.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getIncrement(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getIncrement());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Currency value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getIncrement(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getIncrement());
                }
                if (value.getType() != Currency.CurrencyType.CURRENCY_TYPE_UNSPECIFIED) {
                    Currency.CurrencyType.ADAPTER.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getCode(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCode());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Currency decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Currency.CurrencyType currencyTypeDecode = Currency.CurrencyType.CURRENCY_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    Currency.CurrencyType currencyType = currencyTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Currency(strDecode, strDecode2, strDecode3, currencyType, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                currencyTypeDecode = Currency.CurrencyType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 5) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Currency redact(Currency value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Currency.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Currency.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcrypto_perpetuals/currency/v1/Currency$CurrencyType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CURRENCY_TYPE_UNSPECIFIED", "FIAT", "PERPETUAL", "Companion", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class CurrencyType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrencyType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CurrencyType> ADAPTER;
        public static final CurrencyType CURRENCY_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CurrencyType FIAT;
        public static final CurrencyType PERPETUAL;
        private final int value;

        private static final /* synthetic */ CurrencyType[] $values() {
            return new CurrencyType[]{CURRENCY_TYPE_UNSPECIFIED, FIAT, PERPETUAL};
        }

        @JvmStatic
        public static final CurrencyType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CurrencyType> getEntries() {
            return $ENTRIES;
        }

        private CurrencyType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CurrencyType currencyType = new CurrencyType("CURRENCY_TYPE_UNSPECIFIED", 0, 0);
            CURRENCY_TYPE_UNSPECIFIED = currencyType;
            FIAT = new CurrencyType("FIAT", 1, 1);
            PERPETUAL = new CurrencyType("PERPETUAL", 2, 2);
            CurrencyType[] currencyTypeArr$values = $values();
            $VALUES = currencyTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencyTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CurrencyType>(orCreateKotlinClass, syntax, currencyType) { // from class: crypto_perpetuals.currency.v1.Currency$CurrencyType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Currency.CurrencyType fromValue(int value) {
                    return Currency.CurrencyType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Currency.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_perpetuals/currency/v1/Currency$CurrencyType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_perpetuals/currency/v1/Currency$CurrencyType;", "fromValue", "value", "", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CurrencyType fromValue(int value) {
                if (value == 0) {
                    return CurrencyType.CURRENCY_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return CurrencyType.FIAT;
                }
                if (value != 2) {
                    return null;
                }
                return CurrencyType.PERPETUAL;
            }
        }

        public static CurrencyType valueOf(String str) {
            return (CurrencyType) Enum.valueOf(CurrencyType.class, str);
        }

        public static CurrencyType[] values() {
            return (CurrencyType[]) $VALUES.clone();
        }
    }
}
