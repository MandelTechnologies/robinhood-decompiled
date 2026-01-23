package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.CatpayFundingSource;
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

/* compiled from: CatpayFundingSource.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource;", "Lcom/squareup/wire/Message;", "", "currency_type", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource$CurrencyType;", "currency_code", "", "available_balance", "remaining_daily_limit_in_asset_currency", "remaining_daily_limit_in_quote_currency", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource$CurrencyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency_type", "()Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource$CurrencyType;", "getCurrency_code", "()Ljava/lang/String;", "getAvailable_balance", "getRemaining_daily_limit_in_asset_currency", "getRemaining_daily_limit_in_quote_currency", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "CurrencyType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CatpayFundingSource extends Message {

    @JvmField
    public static final ProtoAdapter<CatpayFundingSource> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "availableBalance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String available_balance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String currency_code;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayFundingSource$CurrencyType#ADAPTER", jsonName = "currencyType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CurrencyType currency_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "remainingDailyLimitInAssetCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String remaining_daily_limit_in_asset_currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "remainingDailyLimitInQuoteCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String remaining_daily_limit_in_quote_currency;

    public CatpayFundingSource() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24050newBuilder();
    }

    public final CurrencyType getCurrency_type() {
        return this.currency_type;
    }

    public /* synthetic */ CatpayFundingSource(CurrencyType currencyType, String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CurrencyType.CURRENCY_TYPE_UNSPECIFIED : currencyType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getCurrency_code() {
        return this.currency_code;
    }

    public final String getAvailable_balance() {
        return this.available_balance;
    }

    public final String getRemaining_daily_limit_in_asset_currency() {
        return this.remaining_daily_limit_in_asset_currency;
    }

    public final String getRemaining_daily_limit_in_quote_currency() {
        return this.remaining_daily_limit_in_quote_currency;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatpayFundingSource(CurrencyType currency_type, String currency_code, String available_balance, String remaining_daily_limit_in_asset_currency, String remaining_daily_limit_in_quote_currency, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_type, "currency_type");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(available_balance, "available_balance");
        Intrinsics.checkNotNullParameter(remaining_daily_limit_in_asset_currency, "remaining_daily_limit_in_asset_currency");
        Intrinsics.checkNotNullParameter(remaining_daily_limit_in_quote_currency, "remaining_daily_limit_in_quote_currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_type = currency_type;
        this.currency_code = currency_code;
        this.available_balance = available_balance;
        this.remaining_daily_limit_in_asset_currency = remaining_daily_limit_in_asset_currency;
        this.remaining_daily_limit_in_quote_currency = remaining_daily_limit_in_quote_currency;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24050newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CatpayFundingSource)) {
            return false;
        }
        CatpayFundingSource catpayFundingSource = (CatpayFundingSource) other;
        return Intrinsics.areEqual(unknownFields(), catpayFundingSource.unknownFields()) && this.currency_type == catpayFundingSource.currency_type && Intrinsics.areEqual(this.currency_code, catpayFundingSource.currency_code) && Intrinsics.areEqual(this.available_balance, catpayFundingSource.available_balance) && Intrinsics.areEqual(this.remaining_daily_limit_in_asset_currency, catpayFundingSource.remaining_daily_limit_in_asset_currency) && Intrinsics.areEqual(this.remaining_daily_limit_in_quote_currency, catpayFundingSource.remaining_daily_limit_in_quote_currency);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.currency_type.hashCode()) * 37) + this.currency_code.hashCode()) * 37) + this.available_balance.hashCode()) * 37) + this.remaining_daily_limit_in_asset_currency.hashCode()) * 37) + this.remaining_daily_limit_in_quote_currency.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_type=" + this.currency_type);
        arrayList.add("currency_code=" + Internal.sanitize(this.currency_code));
        arrayList.add("available_balance=" + Internal.sanitize(this.available_balance));
        arrayList.add("remaining_daily_limit_in_asset_currency=" + Internal.sanitize(this.remaining_daily_limit_in_asset_currency));
        arrayList.add("remaining_daily_limit_in_quote_currency=" + Internal.sanitize(this.remaining_daily_limit_in_quote_currency));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CatpayFundingSource{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CatpayFundingSource copy$default(CatpayFundingSource catpayFundingSource, CurrencyType currencyType, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            currencyType = catpayFundingSource.currency_type;
        }
        if ((i & 2) != 0) {
            str = catpayFundingSource.currency_code;
        }
        if ((i & 4) != 0) {
            str2 = catpayFundingSource.available_balance;
        }
        if ((i & 8) != 0) {
            str3 = catpayFundingSource.remaining_daily_limit_in_asset_currency;
        }
        if ((i & 16) != 0) {
            str4 = catpayFundingSource.remaining_daily_limit_in_quote_currency;
        }
        if ((i & 32) != 0) {
            byteString = catpayFundingSource.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return catpayFundingSource.copy(currencyType, str, str2, str3, str5, byteString2);
    }

    public final CatpayFundingSource copy(CurrencyType currency_type, String currency_code, String available_balance, String remaining_daily_limit_in_asset_currency, String remaining_daily_limit_in_quote_currency, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_type, "currency_type");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(available_balance, "available_balance");
        Intrinsics.checkNotNullParameter(remaining_daily_limit_in_asset_currency, "remaining_daily_limit_in_asset_currency");
        Intrinsics.checkNotNullParameter(remaining_daily_limit_in_quote_currency, "remaining_daily_limit_in_quote_currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CatpayFundingSource(currency_type, currency_code, available_balance, remaining_daily_limit_in_asset_currency, remaining_daily_limit_in_quote_currency, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CatpayFundingSource.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CatpayFundingSource>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CatpayFundingSource$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CatpayFundingSource value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCurrency_type() != CatpayFundingSource.CurrencyType.CURRENCY_TYPE_UNSPECIFIED) {
                    size += CatpayFundingSource.CurrencyType.ADAPTER.encodedSizeWithTag(1, value.getCurrency_type());
                }
                if (!Intrinsics.areEqual(value.getCurrency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCurrency_code());
                }
                if (!Intrinsics.areEqual(value.getAvailable_balance(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAvailable_balance());
                }
                if (!Intrinsics.areEqual(value.getRemaining_daily_limit_in_asset_currency(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRemaining_daily_limit_in_asset_currency());
                }
                return !Intrinsics.areEqual(value.getRemaining_daily_limit_in_quote_currency(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getRemaining_daily_limit_in_quote_currency()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CatpayFundingSource value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCurrency_type() != CatpayFundingSource.CurrencyType.CURRENCY_TYPE_UNSPECIFIED) {
                    CatpayFundingSource.CurrencyType.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency_type());
                }
                if (!Intrinsics.areEqual(value.getCurrency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCurrency_code());
                }
                if (!Intrinsics.areEqual(value.getAvailable_balance(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAvailable_balance());
                }
                if (!Intrinsics.areEqual(value.getRemaining_daily_limit_in_asset_currency(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRemaining_daily_limit_in_asset_currency());
                }
                if (!Intrinsics.areEqual(value.getRemaining_daily_limit_in_quote_currency(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRemaining_daily_limit_in_quote_currency());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CatpayFundingSource value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRemaining_daily_limit_in_quote_currency(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRemaining_daily_limit_in_quote_currency());
                }
                if (!Intrinsics.areEqual(value.getRemaining_daily_limit_in_asset_currency(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRemaining_daily_limit_in_asset_currency());
                }
                if (!Intrinsics.areEqual(value.getAvailable_balance(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAvailable_balance());
                }
                if (!Intrinsics.areEqual(value.getCurrency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCurrency_code());
                }
                if (value.getCurrency_type() != CatpayFundingSource.CurrencyType.CURRENCY_TYPE_UNSPECIFIED) {
                    CatpayFundingSource.CurrencyType.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CatpayFundingSource decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CatpayFundingSource.CurrencyType currencyTypeDecode = CatpayFundingSource.CurrencyType.CURRENCY_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    CatpayFundingSource.CurrencyType currencyType = currencyTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CatpayFundingSource(currencyType, strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                currencyTypeDecode = CatpayFundingSource.CurrencyType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CatpayFundingSource redact(CatpayFundingSource value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CatpayFundingSource.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatpayFundingSource.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource$CurrencyType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CURRENCY_TYPE_UNSPECIFIED", "FIAT", "CRYPTO", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CurrencyType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrencyType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CurrencyType> ADAPTER;
        public static final CurrencyType CRYPTO;
        public static final CurrencyType CURRENCY_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CurrencyType FIAT;
        private final int value;

        private static final /* synthetic */ CurrencyType[] $values() {
            return new CurrencyType[]{CURRENCY_TYPE_UNSPECIFIED, FIAT, CRYPTO};
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
            CRYPTO = new CurrencyType("CRYPTO", 2, 2);
            CurrencyType[] currencyTypeArr$values = $values();
            $VALUES = currencyTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencyTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CurrencyType>(orCreateKotlinClass, syntax, currencyType) { // from class: com.robinhood.rosetta.eventlogging.CatpayFundingSource$CurrencyType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CatpayFundingSource.CurrencyType fromValue(int value) {
                    return CatpayFundingSource.CurrencyType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CatpayFundingSource.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource$CurrencyType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CatpayFundingSource$CurrencyType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                return CurrencyType.CRYPTO;
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
