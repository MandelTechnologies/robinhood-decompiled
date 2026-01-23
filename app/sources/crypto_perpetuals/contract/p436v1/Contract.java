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

/* compiled from: Contract.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016Jx\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u0006*"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/Contract;", "Lcom/squareup/wire/Message;", "", "id", "", "name", "symbol", "base_input", "Lcrypto_perpetuals/contract/v1/CurrencyInput;", "quote_input", "min_order_price_increment", "supports_bracket_orders", "", "supports_fixed_quantity_position_tpsl", "min_display_price_increment", "dxfeed_symbol", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/contract/v1/CurrencyInput;Lcrypto_perpetuals/contract/v1/CurrencyInput;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getName", "getSymbol", "getBase_input", "()Lcrypto_perpetuals/contract/v1/CurrencyInput;", "getQuote_input", "getMin_order_price_increment", "getSupports_bracket_orders", "()Z", "getSupports_fixed_quantity_position_tpsl", "getMin_display_price_increment", "getDxfeed_symbol", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Contract extends Message {

    @JvmField
    public static final ProtoAdapter<Contract> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.contract.v1.CurrencyInput#ADAPTER", jsonName = "baseInput", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CurrencyInput base_input;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dxfeedSymbol", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 31)
    private final String dxfeed_symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minDisplayPriceIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 30)
    private final String min_display_price_increment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minOrderPriceIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String min_order_price_increment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "crypto_perpetuals.contract.v1.CurrencyInput#ADAPTER", jsonName = "quoteInput", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CurrencyInput quote_input;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsBracketOrders", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean supports_bracket_orders;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsFixedQuantityPositionTpsl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean supports_fixed_quantity_position_tpsl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String symbol;

    public Contract() {
        this(null, null, null, null, null, null, false, false, null, null, null, 2047, null);
    }

    public /* synthetic */ Contract(String str, String str2, String str3, CurrencyInput currencyInput, CurrencyInput currencyInput2, String str4, boolean z, boolean z2, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : currencyInput, (i & 16) != 0 ? null : currencyInput2, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27823newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final CurrencyInput getBase_input() {
        return this.base_input;
    }

    public final CurrencyInput getQuote_input() {
        return this.quote_input;
    }

    public final String getMin_order_price_increment() {
        return this.min_order_price_increment;
    }

    public final boolean getSupports_bracket_orders() {
        return this.supports_bracket_orders;
    }

    public final boolean getSupports_fixed_quantity_position_tpsl() {
        return this.supports_fixed_quantity_position_tpsl;
    }

    public final String getMin_display_price_increment() {
        return this.min_display_price_increment;
    }

    public final String getDxfeed_symbol() {
        return this.dxfeed_symbol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Contract(String id, String name, String symbol, CurrencyInput currencyInput, CurrencyInput currencyInput2, String min_order_price_increment, boolean z, boolean z2, String min_display_price_increment, String dxfeed_symbol, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
        Intrinsics.checkNotNullParameter(min_display_price_increment, "min_display_price_increment");
        Intrinsics.checkNotNullParameter(dxfeed_symbol, "dxfeed_symbol");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.base_input = currencyInput;
        this.quote_input = currencyInput2;
        this.min_order_price_increment = min_order_price_increment;
        this.supports_bracket_orders = z;
        this.supports_fixed_quantity_position_tpsl = z2;
        this.min_display_price_increment = min_display_price_increment;
        this.dxfeed_symbol = dxfeed_symbol;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27823newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Contract)) {
            return false;
        }
        Contract contract = (Contract) other;
        return Intrinsics.areEqual(unknownFields(), contract.unknownFields()) && Intrinsics.areEqual(this.id, contract.id) && Intrinsics.areEqual(this.name, contract.name) && Intrinsics.areEqual(this.symbol, contract.symbol) && Intrinsics.areEqual(this.base_input, contract.base_input) && Intrinsics.areEqual(this.quote_input, contract.quote_input) && Intrinsics.areEqual(this.min_order_price_increment, contract.min_order_price_increment) && this.supports_bracket_orders == contract.supports_bracket_orders && this.supports_fixed_quantity_position_tpsl == contract.supports_fixed_quantity_position_tpsl && Intrinsics.areEqual(this.min_display_price_increment, contract.min_display_price_increment) && Intrinsics.areEqual(this.dxfeed_symbol, contract.dxfeed_symbol);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.name.hashCode()) * 37) + this.symbol.hashCode()) * 37;
        CurrencyInput currencyInput = this.base_input;
        int iHashCode2 = (iHashCode + (currencyInput != null ? currencyInput.hashCode() : 0)) * 37;
        CurrencyInput currencyInput2 = this.quote_input;
        int iHashCode3 = ((((((((((iHashCode2 + (currencyInput2 != null ? currencyInput2.hashCode() : 0)) * 37) + this.min_order_price_increment.hashCode()) * 37) + Boolean.hashCode(this.supports_bracket_orders)) * 37) + Boolean.hashCode(this.supports_fixed_quantity_position_tpsl)) * 37) + this.min_display_price_increment.hashCode()) * 37) + this.dxfeed_symbol.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        CurrencyInput currencyInput = this.base_input;
        if (currencyInput != null) {
            arrayList.add("base_input=" + currencyInput);
        }
        CurrencyInput currencyInput2 = this.quote_input;
        if (currencyInput2 != null) {
            arrayList.add("quote_input=" + currencyInput2);
        }
        arrayList.add("min_order_price_increment=" + Internal.sanitize(this.min_order_price_increment));
        arrayList.add("supports_bracket_orders=" + this.supports_bracket_orders);
        arrayList.add("supports_fixed_quantity_position_tpsl=" + this.supports_fixed_quantity_position_tpsl);
        arrayList.add("min_display_price_increment=" + Internal.sanitize(this.min_display_price_increment));
        arrayList.add("dxfeed_symbol=" + Internal.sanitize(this.dxfeed_symbol));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Contract{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Contract copy$default(Contract contract, String str, String str2, String str3, CurrencyInput currencyInput, CurrencyInput currencyInput2, String str4, boolean z, boolean z2, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contract.id;
        }
        if ((i & 2) != 0) {
            str2 = contract.name;
        }
        if ((i & 4) != 0) {
            str3 = contract.symbol;
        }
        if ((i & 8) != 0) {
            currencyInput = contract.base_input;
        }
        if ((i & 16) != 0) {
            currencyInput2 = contract.quote_input;
        }
        if ((i & 32) != 0) {
            str4 = contract.min_order_price_increment;
        }
        if ((i & 64) != 0) {
            z = contract.supports_bracket_orders;
        }
        if ((i & 128) != 0) {
            z2 = contract.supports_fixed_quantity_position_tpsl;
        }
        if ((i & 256) != 0) {
            str5 = contract.min_display_price_increment;
        }
        if ((i & 512) != 0) {
            str6 = contract.dxfeed_symbol;
        }
        if ((i & 1024) != 0) {
            byteString = contract.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        boolean z3 = z2;
        String str8 = str5;
        String str9 = str4;
        boolean z4 = z;
        CurrencyInput currencyInput3 = currencyInput2;
        String str10 = str3;
        return contract.copy(str, str2, str10, currencyInput, currencyInput3, str9, z4, z3, str8, str7, byteString2);
    }

    public final Contract copy(String id, String name, String symbol, CurrencyInput base_input, CurrencyInput quote_input, String min_order_price_increment, boolean supports_bracket_orders, boolean supports_fixed_quantity_position_tpsl, String min_display_price_increment, String dxfeed_symbol, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
        Intrinsics.checkNotNullParameter(min_display_price_increment, "min_display_price_increment");
        Intrinsics.checkNotNullParameter(dxfeed_symbol, "dxfeed_symbol");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Contract(id, name, symbol, base_input, quote_input, min_order_price_increment, supports_bracket_orders, supports_fixed_quantity_position_tpsl, min_display_price_increment, dxfeed_symbol, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Contract.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Contract>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.contract.v1.Contract$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Contract value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSymbol());
                }
                if (value.getBase_input() != null) {
                    size += CurrencyInput.ADAPTER.encodedSizeWithTag(4, value.getBase_input());
                }
                if (value.getQuote_input() != null) {
                    size += CurrencyInput.ADAPTER.encodedSizeWithTag(5, value.getQuote_input());
                }
                if (!Intrinsics.areEqual(value.getMin_order_price_increment(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getMin_order_price_increment());
                }
                if (value.getSupports_bracket_orders()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getSupports_bracket_orders()));
                }
                if (value.getSupports_fixed_quantity_position_tpsl()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getSupports_fixed_quantity_position_tpsl()));
                }
                if (!Intrinsics.areEqual(value.getMin_display_price_increment(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(30, value.getMin_display_price_increment());
                }
                return !Intrinsics.areEqual(value.getDxfeed_symbol(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(31, value.getDxfeed_symbol()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Contract value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (value.getBase_input() != null) {
                    CurrencyInput.ADAPTER.encodeWithTag(writer, 4, (int) value.getBase_input());
                }
                if (value.getQuote_input() != null) {
                    CurrencyInput.ADAPTER.encodeWithTag(writer, 5, (int) value.getQuote_input());
                }
                if (!Intrinsics.areEqual(value.getMin_order_price_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMin_order_price_increment());
                }
                if (value.getSupports_bracket_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getSupports_bracket_orders()));
                }
                if (value.getSupports_fixed_quantity_position_tpsl()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getSupports_fixed_quantity_position_tpsl()));
                }
                if (!Intrinsics.areEqual(value.getMin_display_price_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 30, (int) value.getMin_display_price_increment());
                }
                if (!Intrinsics.areEqual(value.getDxfeed_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 31, (int) value.getDxfeed_symbol());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Contract value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDxfeed_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 31, (int) value.getDxfeed_symbol());
                }
                if (!Intrinsics.areEqual(value.getMin_display_price_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 30, (int) value.getMin_display_price_increment());
                }
                if (value.getSupports_fixed_quantity_position_tpsl()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getSupports_fixed_quantity_position_tpsl()));
                }
                if (value.getSupports_bracket_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getSupports_bracket_orders()));
                }
                if (!Intrinsics.areEqual(value.getMin_order_price_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMin_order_price_increment());
                }
                if (value.getQuote_input() != null) {
                    CurrencyInput.ADAPTER.encodeWithTag(writer, 5, (int) value.getQuote_input());
                }
                if (value.getBase_input() != null) {
                    CurrencyInput.ADAPTER.encodeWithTag(writer, 4, (int) value.getBase_input());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Contract redact(Contract value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CurrencyInput base_input = value.getBase_input();
                CurrencyInput currencyInputRedact = base_input != null ? CurrencyInput.ADAPTER.redact(base_input) : null;
                CurrencyInput quote_input = value.getQuote_input();
                return Contract.copy$default(value, null, null, null, currencyInputRedact, quote_input != null ? CurrencyInput.ADAPTER.redact(quote_input) : null, null, false, false, null, null, ByteString.EMPTY, 999, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Contract decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                CurrencyInput currencyInputDecode = null;
                CurrencyInput currencyInputDecode2 = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Contract(strDecode, strDecode5, strDecode6, currencyInputDecode, currencyInputDecode2, strDecode2, zBooleanValue, zBooleanValue2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 30) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 31) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                currencyInputDecode = CurrencyInput.ADAPTER.decode(reader);
                                break;
                            case 5:
                                currencyInputDecode2 = CurrencyInput.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 8:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }
        };
    }
}
