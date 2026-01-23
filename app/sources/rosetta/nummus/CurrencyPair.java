package rosetta.nummus;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
import rosetta.nummus.CurrencyPair;

/* compiled from: CurrencyPair.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000201B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010'\u001a\u00020\u0002H\u0017J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\tH\u0016J\u0088\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00062"}, m3636d2 = {"Lrosetta/nummus/CurrencyPair;", "Lcom/squareup/wire/Message;", "", "id", "Lokio/ByteString;", "asset_currency", "Lrosetta/nummus/Currency;", "quote_currency", "min_order_price_increment", "", "max_order_size", "min_order_size", "min_order_quantity_increment", "min_order_quote_amount", "min_fee_order_quote_amount", "type", "Lrosetta/nummus/CurrencyPair$Type;", "features", "", "Lrosetta/nummus/CurrencyPairFeature;", "unknownFields", "<init>", "(Lokio/ByteString;Lrosetta/nummus/Currency;Lrosetta/nummus/Currency;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/nummus/CurrencyPair$Type;Ljava/util/List;Lokio/ByteString;)V", "getId", "()Lokio/ByteString;", "getAsset_currency", "()Lrosetta/nummus/Currency;", "getQuote_currency", "getMin_order_price_increment", "()Ljava/lang/String;", "getMax_order_size", "getMin_order_size", "getMin_order_quantity_increment", "getMin_order_quote_amount", "getMin_fee_order_quote_amount", "getType", "()Lrosetta/nummus/CurrencyPair$Type;", "getFeatures", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Type", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class CurrencyPair extends Message {

    @JvmField
    public static final ProtoAdapter<CurrencyPair> ADAPTER;

    @WireField(adapter = "rosetta.nummus.Currency#ADAPTER", jsonName = "assetCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Currency asset_currency;

    @WireField(adapter = "rosetta.nummus.CurrencyPairFeature#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 10, tag = 11)
    private final List<CurrencyPairFeature> features;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxOrderSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String max_order_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minFeeOrderQuoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String min_fee_order_quote_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minOrderPriceIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String min_order_price_increment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minOrderQuantityIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String min_order_quantity_increment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minOrderQuoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String min_order_quote_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minOrderSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String min_order_size;

    @WireField(adapter = "rosetta.nummus.Currency#ADAPTER", jsonName = "quoteCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Currency quote_currency;

    @WireField(adapter = "rosetta.nummus.CurrencyPair$Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Type type;

    public CurrencyPair() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29912newBuilder();
    }

    public final ByteString getId() {
        return this.id;
    }

    public /* synthetic */ CurrencyPair(ByteString byteString, Currency currency, Currency currency2, String str, String str2, String str3, String str4, String str5, String str6, Type type2, List list, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? null : currency, (i & 4) != 0 ? null : currency2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? Type.TYPE_UNSPECIFIED : type2, (i & 1024) != 0 ? CollectionsKt.emptyList() : list, (i & 2048) != 0 ? ByteString.EMPTY : byteString2);
    }

    public final Currency getAsset_currency() {
        return this.asset_currency;
    }

    public final Currency getQuote_currency() {
        return this.quote_currency;
    }

    public final String getMin_order_price_increment() {
        return this.min_order_price_increment;
    }

    public final String getMax_order_size() {
        return this.max_order_size;
    }

    public final String getMin_order_size() {
        return this.min_order_size;
    }

    public final String getMin_order_quantity_increment() {
        return this.min_order_quantity_increment;
    }

    public final String getMin_order_quote_amount() {
        return this.min_order_quote_amount;
    }

    public final String getMin_fee_order_quote_amount() {
        return this.min_fee_order_quote_amount;
    }

    public final Type getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyPair(ByteString id, Currency currency, Currency currency2, String min_order_price_increment, String max_order_size, String min_order_size, String min_order_quantity_increment, String min_order_quote_amount, String min_fee_order_quote_amount, Type type2, List<? extends CurrencyPairFeature> features, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
        Intrinsics.checkNotNullParameter(max_order_size, "max_order_size");
        Intrinsics.checkNotNullParameter(min_order_size, "min_order_size");
        Intrinsics.checkNotNullParameter(min_order_quantity_increment, "min_order_quantity_increment");
        Intrinsics.checkNotNullParameter(min_order_quote_amount, "min_order_quote_amount");
        Intrinsics.checkNotNullParameter(min_fee_order_quote_amount, "min_fee_order_quote_amount");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.asset_currency = currency;
        this.quote_currency = currency2;
        this.min_order_price_increment = min_order_price_increment;
        this.max_order_size = max_order_size;
        this.min_order_size = min_order_size;
        this.min_order_quantity_increment = min_order_quantity_increment;
        this.min_order_quote_amount = min_order_quote_amount;
        this.min_fee_order_quote_amount = min_fee_order_quote_amount;
        this.type = type2;
        this.features = Internal.immutableCopyOf("features", features);
    }

    public final List<CurrencyPairFeature> getFeatures() {
        return this.features;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29912newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CurrencyPair)) {
            return false;
        }
        CurrencyPair currencyPair = (CurrencyPair) other;
        return Intrinsics.areEqual(unknownFields(), currencyPair.unknownFields()) && Intrinsics.areEqual(this.id, currencyPair.id) && Intrinsics.areEqual(this.asset_currency, currencyPair.asset_currency) && Intrinsics.areEqual(this.quote_currency, currencyPair.quote_currency) && Intrinsics.areEqual(this.min_order_price_increment, currencyPair.min_order_price_increment) && Intrinsics.areEqual(this.max_order_size, currencyPair.max_order_size) && Intrinsics.areEqual(this.min_order_size, currencyPair.min_order_size) && Intrinsics.areEqual(this.min_order_quantity_increment, currencyPair.min_order_quantity_increment) && Intrinsics.areEqual(this.min_order_quote_amount, currencyPair.min_order_quote_amount) && Intrinsics.areEqual(this.min_fee_order_quote_amount, currencyPair.min_fee_order_quote_amount) && this.type == currencyPair.type && Intrinsics.areEqual(this.features, currencyPair.features);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        Currency currency = this.asset_currency;
        int iHashCode2 = (iHashCode + (currency != null ? currency.hashCode() : 0)) * 37;
        Currency currency2 = this.quote_currency;
        int iHashCode3 = ((((((((((((((((iHashCode2 + (currency2 != null ? currency2.hashCode() : 0)) * 37) + this.min_order_price_increment.hashCode()) * 37) + this.max_order_size.hashCode()) * 37) + this.min_order_size.hashCode()) * 37) + this.min_order_quantity_increment.hashCode()) * 37) + this.min_order_quote_amount.hashCode()) * 37) + this.min_fee_order_quote_amount.hashCode()) * 37) + this.type.hashCode()) * 37) + this.features.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        Currency currency = this.asset_currency;
        if (currency != null) {
            arrayList.add("asset_currency=" + currency);
        }
        Currency currency2 = this.quote_currency;
        if (currency2 != null) {
            arrayList.add("quote_currency=" + currency2);
        }
        arrayList.add("min_order_price_increment=" + Internal.sanitize(this.min_order_price_increment));
        arrayList.add("max_order_size=" + Internal.sanitize(this.max_order_size));
        arrayList.add("min_order_size=" + Internal.sanitize(this.min_order_size));
        arrayList.add("min_order_quantity_increment=" + Internal.sanitize(this.min_order_quantity_increment));
        arrayList.add("min_order_quote_amount=" + Internal.sanitize(this.min_order_quote_amount));
        arrayList.add("min_fee_order_quote_amount=" + Internal.sanitize(this.min_fee_order_quote_amount));
        arrayList.add("type=" + this.type);
        if (!this.features.isEmpty()) {
            arrayList.add("features=" + this.features);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CurrencyPair{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CurrencyPair copy$default(CurrencyPair currencyPair, ByteString byteString, Currency currency, Currency currency2, String str, String str2, String str3, String str4, String str5, String str6, Type type2, List list, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = currencyPair.id;
        }
        if ((i & 2) != 0) {
            currency = currencyPair.asset_currency;
        }
        if ((i & 4) != 0) {
            currency2 = currencyPair.quote_currency;
        }
        if ((i & 8) != 0) {
            str = currencyPair.min_order_price_increment;
        }
        if ((i & 16) != 0) {
            str2 = currencyPair.max_order_size;
        }
        if ((i & 32) != 0) {
            str3 = currencyPair.min_order_size;
        }
        if ((i & 64) != 0) {
            str4 = currencyPair.min_order_quantity_increment;
        }
        if ((i & 128) != 0) {
            str5 = currencyPair.min_order_quote_amount;
        }
        if ((i & 256) != 0) {
            str6 = currencyPair.min_fee_order_quote_amount;
        }
        if ((i & 512) != 0) {
            type2 = currencyPair.type;
        }
        if ((i & 1024) != 0) {
            list = currencyPair.features;
        }
        if ((i & 2048) != 0) {
            byteString2 = currencyPair.unknownFields();
        }
        List list2 = list;
        ByteString byteString3 = byteString2;
        String str7 = str6;
        Type type3 = type2;
        String str8 = str4;
        String str9 = str5;
        String str10 = str2;
        String str11 = str3;
        return currencyPair.copy(byteString, currency, currency2, str, str10, str11, str8, str9, str7, type3, list2, byteString3);
    }

    public final CurrencyPair copy(ByteString id, Currency asset_currency, Currency quote_currency, String min_order_price_increment, String max_order_size, String min_order_size, String min_order_quantity_increment, String min_order_quote_amount, String min_fee_order_quote_amount, Type type2, List<? extends CurrencyPairFeature> features, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
        Intrinsics.checkNotNullParameter(max_order_size, "max_order_size");
        Intrinsics.checkNotNullParameter(min_order_size, "min_order_size");
        Intrinsics.checkNotNullParameter(min_order_quantity_increment, "min_order_quantity_increment");
        Intrinsics.checkNotNullParameter(min_order_quote_amount, "min_order_quote_amount");
        Intrinsics.checkNotNullParameter(min_fee_order_quote_amount, "min_fee_order_quote_amount");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CurrencyPair(id, asset_currency, quote_currency, min_order_price_increment, max_order_size, min_order_size, min_order_quantity_increment, min_order_quote_amount, min_fee_order_quote_amount, type2, features, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyPair.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CurrencyPair>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.nummus.CurrencyPair$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CurrencyPair value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), ByteString.EMPTY)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getId());
                }
                if (value.getAsset_currency() != null) {
                    size += Currency.ADAPTER.encodedSizeWithTag(2, value.getAsset_currency());
                }
                if (value.getQuote_currency() != null) {
                    size += Currency.ADAPTER.encodedSizeWithTag(3, value.getQuote_currency());
                }
                if (!Intrinsics.areEqual(value.getMin_order_price_increment(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getMin_order_price_increment());
                }
                if (!Intrinsics.areEqual(value.getMax_order_size(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getMax_order_size());
                }
                if (!Intrinsics.areEqual(value.getMin_order_size(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getMin_order_size());
                }
                if (!Intrinsics.areEqual(value.getMin_order_quantity_increment(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getMin_order_quantity_increment());
                }
                if (!Intrinsics.areEqual(value.getMin_order_quote_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getMin_order_quote_amount());
                }
                if (!Intrinsics.areEqual(value.getMin_fee_order_quote_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getMin_fee_order_quote_amount());
                }
                if (value.getType() != CurrencyPair.Type.TYPE_UNSPECIFIED) {
                    size += CurrencyPair.Type.ADAPTER.encodedSizeWithTag(10, value.getType());
                }
                return size + CurrencyPairFeature.ADAPTER.asRepeated().encodedSizeWithTag(11, value.getFeatures());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CurrencyPair value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getAsset_currency() != null) {
                    Currency.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_currency());
                }
                if (value.getQuote_currency() != null) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuote_currency());
                }
                if (!Intrinsics.areEqual(value.getMin_order_price_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMin_order_price_increment());
                }
                if (!Intrinsics.areEqual(value.getMax_order_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMax_order_size());
                }
                if (!Intrinsics.areEqual(value.getMin_order_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMin_order_size());
                }
                if (!Intrinsics.areEqual(value.getMin_order_quantity_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMin_order_quantity_increment());
                }
                if (!Intrinsics.areEqual(value.getMin_order_quote_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMin_order_quote_amount());
                }
                if (!Intrinsics.areEqual(value.getMin_fee_order_quote_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getMin_fee_order_quote_amount());
                }
                if (value.getType() != CurrencyPair.Type.TYPE_UNSPECIFIED) {
                    CurrencyPair.Type.ADAPTER.encodeWithTag(writer, 10, (int) value.getType());
                }
                CurrencyPairFeature.ADAPTER.asRepeated().encodeWithTag(writer, 11, (int) value.getFeatures());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CurrencyPair value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                CurrencyPairFeature.ADAPTER.asRepeated().encodeWithTag(writer, 11, (int) value.getFeatures());
                if (value.getType() != CurrencyPair.Type.TYPE_UNSPECIFIED) {
                    CurrencyPair.Type.ADAPTER.encodeWithTag(writer, 10, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getMin_fee_order_quote_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getMin_fee_order_quote_amount());
                }
                if (!Intrinsics.areEqual(value.getMin_order_quote_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMin_order_quote_amount());
                }
                if (!Intrinsics.areEqual(value.getMin_order_quantity_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMin_order_quantity_increment());
                }
                if (!Intrinsics.areEqual(value.getMin_order_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMin_order_size());
                }
                if (!Intrinsics.areEqual(value.getMax_order_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMax_order_size());
                }
                if (!Intrinsics.areEqual(value.getMin_order_price_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMin_order_price_increment());
                }
                if (value.getQuote_currency() != null) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuote_currency());
                }
                if (value.getAsset_currency() != null) {
                    Currency.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_currency());
                }
                if (Intrinsics.areEqual(value.getId(), ByteString.EMPTY)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getId());
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0028. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public rosetta.nummus.CurrencyPair decode(com.squareup.wire.ProtoReader r20) {
                /*
                    Method dump skipped, instructions count: 318
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: rosetta.nummus.CurrencyPair3.decode(com.squareup.wire.ProtoReader):rosetta.nummus.CurrencyPair");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CurrencyPair redact(CurrencyPair value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Currency asset_currency = value.getAsset_currency();
                Currency currencyRedact = asset_currency != null ? Currency.ADAPTER.redact(asset_currency) : null;
                Currency quote_currency = value.getQuote_currency();
                return CurrencyPair.copy$default(value, null, currencyRedact, quote_currency != null ? Currency.ADAPTER.redact(quote_currency) : null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 2041, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyPair.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrosetta/nummus/CurrencyPair$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "CRYPTOCURRENCY", "PERPETUAL", "TOKENIZED_STOCK", "FIAT", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Type> ADAPTER;
        public static final Type CRYPTOCURRENCY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type FIAT;
        public static final Type PERPETUAL;
        public static final Type TOKENIZED_STOCK;
        public static final Type TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TYPE_UNSPECIFIED, CRYPTOCURRENCY, PERPETUAL, TOKENIZED_STOCK, FIAT};
        }

        @JvmStatic
        public static final Type fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Type type2 = new Type("TYPE_UNSPECIFIED", 0, 0);
            TYPE_UNSPECIFIED = type2;
            CRYPTOCURRENCY = new Type("CRYPTOCURRENCY", 1, 1);
            PERPETUAL = new Type("PERPETUAL", 2, 2);
            TOKENIZED_STOCK = new Type("TOKENIZED_STOCK", 3, 3);
            FIAT = new Type("FIAT", 4, 4);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: rosetta.nummus.CurrencyPair$Type$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CurrencyPair.Type fromValue(int value) {
                    return CurrencyPair.Type.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CurrencyPair.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/nummus/CurrencyPair$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/nummus/CurrencyPair$Type;", "fromValue", "value", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Type fromValue(int value) {
                if (value == 0) {
                    return Type.TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Type.CRYPTOCURRENCY;
                }
                if (value == 2) {
                    return Type.PERPETUAL;
                }
                if (value == 3) {
                    return Type.TOKENIZED_STOCK;
                }
                if (value != 4) {
                    return null;
                }
                return Type.FIAT;
            }
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
