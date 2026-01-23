package crypto_perpetuals.order.p438v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.FXQuote;
import crypto_perpetuals.common.p435v1.MarginMode;
import crypto_perpetuals.common.p435v1.Money;
import crypto_perpetuals.common.p435v1.Side;
import crypto_perpetuals.order.p438v1.MarginAvailable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: MarginAvailable.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)*B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J^\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006+"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailable;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "asset_currency_exchange_rate", "quote_currency_exchange_rate", "margin_details", "", "Lcrypto_perpetuals/order/v1/MarginAvailable$MarginDetail;", "side", "Lcrypto_perpetuals/common/v1/Side;", "fx_quote", "Lcrypto_perpetuals/common/v1/FXQuote;", "default_margin_mode", "Lcrypto_perpetuals/common/v1/MarginMode;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcrypto_perpetuals/common/v1/Side;Lcrypto_perpetuals/common/v1/FXQuote;Lcrypto_perpetuals/common/v1/MarginMode;Lokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getAsset_currency_exchange_rate", "getQuote_currency_exchange_rate", "getSide", "()Lcrypto_perpetuals/common/v1/Side;", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuote;", "getDefault_margin_mode", "()Lcrypto_perpetuals/common/v1/MarginMode;", "getMargin_details", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "MarginDetail", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MarginAvailable extends Message {

    @JvmField
    public static final ProtoAdapter<MarginAvailable> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyExchangeRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String asset_currency_exchange_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "crypto_perpetuals.common.v1.MarginMode#ADAPTER", jsonName = "defaultMarginMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final MarginMode default_margin_mode;

    @WireField(adapter = "crypto_perpetuals.common.v1.FXQuote#ADAPTER", jsonName = "fxQuote", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final FXQuote fx_quote;

    @WireField(adapter = "crypto_perpetuals.order.v1.MarginAvailable$MarginDetail#ADAPTER", jsonName = "marginDetails", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<MarginDetail> margin_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteCurrencyExchangeRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String quote_currency_exchange_rate;

    @WireField(adapter = "crypto_perpetuals.common.v1.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Side side;

    public MarginAvailable() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ MarginAvailable(String str, String str2, String str3, List list, Side side, FXQuote fXQuote, MarginMode marginMode, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 32) != 0 ? null : fXQuote, (i & 64) != 0 ? MarginMode.MARGIN_MODE_UNSPECIFIED : marginMode, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27836newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final String getAsset_currency_exchange_rate() {
        return this.asset_currency_exchange_rate;
    }

    public final String getQuote_currency_exchange_rate() {
        return this.quote_currency_exchange_rate;
    }

    public final Side getSide() {
        return this.side;
    }

    public final FXQuote getFx_quote() {
        return this.fx_quote;
    }

    public final MarginMode getDefault_margin_mode() {
        return this.default_margin_mode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginAvailable(String contract_id, String asset_currency_exchange_rate, String quote_currency_exchange_rate, List<MarginDetail> margin_details, Side side, FXQuote fXQuote, MarginMode default_margin_mode, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(asset_currency_exchange_rate, "asset_currency_exchange_rate");
        Intrinsics.checkNotNullParameter(quote_currency_exchange_rate, "quote_currency_exchange_rate");
        Intrinsics.checkNotNullParameter(margin_details, "margin_details");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(default_margin_mode, "default_margin_mode");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.asset_currency_exchange_rate = asset_currency_exchange_rate;
        this.quote_currency_exchange_rate = quote_currency_exchange_rate;
        this.side = side;
        this.fx_quote = fXQuote;
        this.default_margin_mode = default_margin_mode;
        this.margin_details = Internal.immutableCopyOf("margin_details", margin_details);
    }

    public final List<MarginDetail> getMargin_details() {
        return this.margin_details;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27836newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginAvailable)) {
            return false;
        }
        MarginAvailable marginAvailable = (MarginAvailable) other;
        return Intrinsics.areEqual(unknownFields(), marginAvailable.unknownFields()) && Intrinsics.areEqual(this.contract_id, marginAvailable.contract_id) && Intrinsics.areEqual(this.asset_currency_exchange_rate, marginAvailable.asset_currency_exchange_rate) && Intrinsics.areEqual(this.quote_currency_exchange_rate, marginAvailable.quote_currency_exchange_rate) && Intrinsics.areEqual(this.margin_details, marginAvailable.margin_details) && this.side == marginAvailable.side && Intrinsics.areEqual(this.fx_quote, marginAvailable.fx_quote) && this.default_margin_mode == marginAvailable.default_margin_mode;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.asset_currency_exchange_rate.hashCode()) * 37) + this.quote_currency_exchange_rate.hashCode()) * 37) + this.margin_details.hashCode()) * 37) + this.side.hashCode()) * 37;
        FXQuote fXQuote = this.fx_quote;
        int iHashCode2 = ((iHashCode + (fXQuote != null ? fXQuote.hashCode() : 0)) * 37) + this.default_margin_mode.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("asset_currency_exchange_rate=" + Internal.sanitize(this.asset_currency_exchange_rate));
        arrayList.add("quote_currency_exchange_rate=" + Internal.sanitize(this.quote_currency_exchange_rate));
        if (!this.margin_details.isEmpty()) {
            arrayList.add("margin_details=" + this.margin_details);
        }
        arrayList.add("side=" + this.side);
        FXQuote fXQuote = this.fx_quote;
        if (fXQuote != null) {
            arrayList.add("fx_quote=" + fXQuote);
        }
        arrayList.add("default_margin_mode=" + this.default_margin_mode);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginAvailable{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginAvailable copy$default(MarginAvailable marginAvailable, String str, String str2, String str3, List list, Side side, FXQuote fXQuote, MarginMode marginMode, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginAvailable.contract_id;
        }
        if ((i & 2) != 0) {
            str2 = marginAvailable.asset_currency_exchange_rate;
        }
        if ((i & 4) != 0) {
            str3 = marginAvailable.quote_currency_exchange_rate;
        }
        if ((i & 8) != 0) {
            list = marginAvailable.margin_details;
        }
        if ((i & 16) != 0) {
            side = marginAvailable.side;
        }
        if ((i & 32) != 0) {
            fXQuote = marginAvailable.fx_quote;
        }
        if ((i & 64) != 0) {
            marginMode = marginAvailable.default_margin_mode;
        }
        if ((i & 128) != 0) {
            byteString = marginAvailable.unknownFields();
        }
        MarginMode marginMode2 = marginMode;
        ByteString byteString2 = byteString;
        Side side2 = side;
        FXQuote fXQuote2 = fXQuote;
        return marginAvailable.copy(str, str2, str3, list, side2, fXQuote2, marginMode2, byteString2);
    }

    public final MarginAvailable copy(String contract_id, String asset_currency_exchange_rate, String quote_currency_exchange_rate, List<MarginDetail> margin_details, Side side, FXQuote fx_quote, MarginMode default_margin_mode, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(asset_currency_exchange_rate, "asset_currency_exchange_rate");
        Intrinsics.checkNotNullParameter(quote_currency_exchange_rate, "quote_currency_exchange_rate");
        Intrinsics.checkNotNullParameter(margin_details, "margin_details");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(default_margin_mode, "default_margin_mode");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginAvailable(contract_id, asset_currency_exchange_rate, quote_currency_exchange_rate, margin_details, side, fx_quote, default_margin_mode, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginAvailable.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginAvailable>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.order.v1.MarginAvailable$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginAvailable value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_exchange_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAsset_currency_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_exchange_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getQuote_currency_exchange_rate());
                }
                int iEncodedSizeWithTag = size + MarginAvailable.MarginDetail.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getMargin_details());
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    iEncodedSizeWithTag += Side.ADAPTER.encodedSizeWithTag(5, value.getSide());
                }
                if (value.getFx_quote() != null) {
                    iEncodedSizeWithTag += FXQuote.ADAPTER.encodedSizeWithTag(6, value.getFx_quote());
                }
                return value.getDefault_margin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED ? iEncodedSizeWithTag + MarginMode.ADAPTER.encodedSizeWithTag(7, value.getDefault_margin_mode()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginAvailable value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsset_currency_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuote_currency_exchange_rate());
                }
                MarginAvailable.MarginDetail.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getMargin_details());
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 5, (int) value.getSide());
                }
                if (value.getFx_quote() != null) {
                    FXQuote.ADAPTER.encodeWithTag(writer, 6, (int) value.getFx_quote());
                }
                if (value.getDefault_margin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 7, (int) value.getDefault_margin_mode());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginAvailable value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDefault_margin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 7, (int) value.getDefault_margin_mode());
                }
                if (value.getFx_quote() != null) {
                    FXQuote.ADAPTER.encodeWithTag(writer, 6, (int) value.getFx_quote());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 5, (int) value.getSide());
                }
                MarginAvailable.MarginDetail.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getMargin_details());
                if (!Intrinsics.areEqual(value.getQuote_currency_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuote_currency_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsset_currency_exchange_rate());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarginAvailable decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                Side sideDecode = Side.SIDE_UNSPECIFIED;
                MarginMode marginMode = MarginMode.MARGIN_MODE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                FXQuote fXQuoteDecode = null;
                MarginMode marginModeDecode = marginMode;
                String strDecode3 = strDecode2;
                while (true) {
                    Side side = sideDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    arrayList.add(MarginAvailable.MarginDetail.ADAPTER.decode(reader));
                                    break;
                                case 5:
                                    try {
                                        sideDecode = Side.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 6:
                                    fXQuoteDecode = FXQuote.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    try {
                                        marginModeDecode = MarginMode.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new MarginAvailable(strDecode3, strDecode, strDecode2, arrayList, side, fXQuoteDecode, marginModeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginAvailable redact(MarginAvailable value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getMargin_details(), MarginAvailable.MarginDetail.ADAPTER);
                FXQuote fx_quote = value.getFx_quote();
                return MarginAvailable.copy$default(value, null, null, null, listM26823redactElements, null, fx_quote != null ? FXQuote.ADAPTER.redact(fx_quote) : null, null, ByteString.EMPTY, 87, null);
            }
        };
    }

    /* compiled from: MarginAvailable.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B¯\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010+\u001a\u00020\u0002H\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\fH\u0016J®\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001c¨\u00065"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/MarginAvailable$MarginDetail;", "Lcom/squareup/wire/Message;", "", "margin_mode", "Lcrypto_perpetuals/common/v1/MarginMode;", "margin_available_buying_power", "Lcrypto_perpetuals/common/v1/Money;", "margin_available_venue_usd", "margin_available_venue_eur", "margin_available_venue_total", "margin_available_total", "min_leverage", "", "max_leverage", "default_selected_leverage", "min_margin", "max_margin", "margin_reserved", "margin_status", "Lcrypto_perpetuals/order/v1/MarginStatus;", "margin_available_buying_power_usd", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/common/v1/MarginMode;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/order/v1/MarginStatus;Lcrypto_perpetuals/common/v1/Money;Lokio/ByteString;)V", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginMode;", "getMargin_available_buying_power", "()Lcrypto_perpetuals/common/v1/Money;", "getMargin_available_venue_usd", "getMargin_available_venue_eur", "getMargin_available_venue_total", "getMargin_available_total", "getMin_leverage", "()Ljava/lang/String;", "getMax_leverage", "getDefault_selected_leverage", "getMin_margin", "getMax_margin", "getMargin_reserved", "getMargin_status", "()Lcrypto_perpetuals/order/v1/MarginStatus;", "getMargin_available_buying_power_usd", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MarginDetail extends Message {

        @JvmField
        public static final ProtoAdapter<MarginDetail> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "defaultSelectedLeverage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
        private final String default_selected_leverage;

        @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "marginAvailableBuyingPower", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Money margin_available_buying_power;

        @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "marginAvailableBuyingPowerUsd", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
        private final Money margin_available_buying_power_usd;

        @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "marginAvailableTotal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final Money margin_available_total;

        @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "marginAvailableVenueEur", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final Money margin_available_venue_eur;

        @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "marginAvailableVenueTotal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final Money margin_available_venue_total;

        @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "marginAvailableVenueUsd", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final Money margin_available_venue_usd;

        @WireField(adapter = "crypto_perpetuals.common.v1.MarginMode#ADAPTER", jsonName = "marginMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final MarginMode margin_mode;

        @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "marginReserved", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
        private final Money margin_reserved;

        @WireField(adapter = "crypto_perpetuals.order.v1.MarginStatus#ADAPTER", jsonName = "marginStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
        private final MarginStatus margin_status;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxLeverage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
        private final String max_leverage;

        @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "maxMargin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
        private final Money max_margin;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minLeverage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final String min_leverage;

        @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "minMargin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
        private final Money min_margin;

        public MarginDetail() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27837newBuilder();
        }

        public final MarginMode getMargin_mode() {
            return this.margin_mode;
        }

        public /* synthetic */ MarginDetail(MarginMode marginMode, Money money, Money money2, Money money3, Money money4, Money money5, String str, String str2, String str3, Money money6, Money money7, Money money8, MarginStatus marginStatus, Money money9, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MarginMode.MARGIN_MODE_UNSPECIFIED : marginMode, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? null : money3, (i & 16) != 0 ? null : money4, (i & 32) != 0 ? null : money5, (i & 64) != 0 ? "" : str, (i & 128) != 0 ? "" : str2, (i & 256) == 0 ? str3 : "", (i & 512) != 0 ? null : money6, (i & 1024) != 0 ? null : money7, (i & 2048) != 0 ? null : money8, (i & 4096) != 0 ? MarginStatus.MARGIN_STATUS_UNSPECIFIED : marginStatus, (i & 8192) == 0 ? money9 : null, (i & 16384) != 0 ? ByteString.EMPTY : byteString);
        }

        public final Money getMargin_available_buying_power() {
            return this.margin_available_buying_power;
        }

        public final Money getMargin_available_venue_usd() {
            return this.margin_available_venue_usd;
        }

        public final Money getMargin_available_venue_eur() {
            return this.margin_available_venue_eur;
        }

        public final Money getMargin_available_venue_total() {
            return this.margin_available_venue_total;
        }

        public final Money getMargin_available_total() {
            return this.margin_available_total;
        }

        public final String getMin_leverage() {
            return this.min_leverage;
        }

        public final String getMax_leverage() {
            return this.max_leverage;
        }

        public final String getDefault_selected_leverage() {
            return this.default_selected_leverage;
        }

        public final Money getMin_margin() {
            return this.min_margin;
        }

        public final Money getMax_margin() {
            return this.max_margin;
        }

        public final Money getMargin_reserved() {
            return this.margin_reserved;
        }

        public final MarginStatus getMargin_status() {
            return this.margin_status;
        }

        public final Money getMargin_available_buying_power_usd() {
            return this.margin_available_buying_power_usd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarginDetail(MarginMode margin_mode, Money money, Money money2, Money money3, Money money4, Money money5, String min_leverage, String max_leverage, String default_selected_leverage, Money money6, Money money7, Money money8, MarginStatus margin_status, Money money9, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(min_leverage, "min_leverage");
            Intrinsics.checkNotNullParameter(max_leverage, "max_leverage");
            Intrinsics.checkNotNullParameter(default_selected_leverage, "default_selected_leverage");
            Intrinsics.checkNotNullParameter(margin_status, "margin_status");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.margin_mode = margin_mode;
            this.margin_available_buying_power = money;
            this.margin_available_venue_usd = money2;
            this.margin_available_venue_eur = money3;
            this.margin_available_venue_total = money4;
            this.margin_available_total = money5;
            this.min_leverage = min_leverage;
            this.max_leverage = max_leverage;
            this.default_selected_leverage = default_selected_leverage;
            this.min_margin = money6;
            this.max_margin = money7;
            this.margin_reserved = money8;
            this.margin_status = margin_status;
            this.margin_available_buying_power_usd = money9;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27837newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof MarginDetail)) {
                return false;
            }
            MarginDetail marginDetail = (MarginDetail) other;
            return Intrinsics.areEqual(unknownFields(), marginDetail.unknownFields()) && this.margin_mode == marginDetail.margin_mode && Intrinsics.areEqual(this.margin_available_buying_power, marginDetail.margin_available_buying_power) && Intrinsics.areEqual(this.margin_available_venue_usd, marginDetail.margin_available_venue_usd) && Intrinsics.areEqual(this.margin_available_venue_eur, marginDetail.margin_available_venue_eur) && Intrinsics.areEqual(this.margin_available_venue_total, marginDetail.margin_available_venue_total) && Intrinsics.areEqual(this.margin_available_total, marginDetail.margin_available_total) && Intrinsics.areEqual(this.min_leverage, marginDetail.min_leverage) && Intrinsics.areEqual(this.max_leverage, marginDetail.max_leverage) && Intrinsics.areEqual(this.default_selected_leverage, marginDetail.default_selected_leverage) && Intrinsics.areEqual(this.min_margin, marginDetail.min_margin) && Intrinsics.areEqual(this.max_margin, marginDetail.max_margin) && Intrinsics.areEqual(this.margin_reserved, marginDetail.margin_reserved) && this.margin_status == marginDetail.margin_status && Intrinsics.areEqual(this.margin_available_buying_power_usd, marginDetail.margin_available_buying_power_usd);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.margin_mode.hashCode()) * 37;
            Money money = this.margin_available_buying_power;
            int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.margin_available_venue_usd;
            int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
            Money money3 = this.margin_available_venue_eur;
            int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
            Money money4 = this.margin_available_venue_total;
            int iHashCode5 = (iHashCode4 + (money4 != null ? money4.hashCode() : 0)) * 37;
            Money money5 = this.margin_available_total;
            int iHashCode6 = (((((((iHashCode5 + (money5 != null ? money5.hashCode() : 0)) * 37) + this.min_leverage.hashCode()) * 37) + this.max_leverage.hashCode()) * 37) + this.default_selected_leverage.hashCode()) * 37;
            Money money6 = this.min_margin;
            int iHashCode7 = (iHashCode6 + (money6 != null ? money6.hashCode() : 0)) * 37;
            Money money7 = this.max_margin;
            int iHashCode8 = (iHashCode7 + (money7 != null ? money7.hashCode() : 0)) * 37;
            Money money8 = this.margin_reserved;
            int iHashCode9 = (((iHashCode8 + (money8 != null ? money8.hashCode() : 0)) * 37) + this.margin_status.hashCode()) * 37;
            Money money9 = this.margin_available_buying_power_usd;
            int iHashCode10 = iHashCode9 + (money9 != null ? money9.hashCode() : 0);
            this.hashCode = iHashCode10;
            return iHashCode10;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("margin_mode=" + this.margin_mode);
            Money money = this.margin_available_buying_power;
            if (money != null) {
                arrayList.add("margin_available_buying_power=" + money);
            }
            Money money2 = this.margin_available_venue_usd;
            if (money2 != null) {
                arrayList.add("margin_available_venue_usd=" + money2);
            }
            Money money3 = this.margin_available_venue_eur;
            if (money3 != null) {
                arrayList.add("margin_available_venue_eur=" + money3);
            }
            Money money4 = this.margin_available_venue_total;
            if (money4 != null) {
                arrayList.add("margin_available_venue_total=" + money4);
            }
            Money money5 = this.margin_available_total;
            if (money5 != null) {
                arrayList.add("margin_available_total=" + money5);
            }
            arrayList.add("min_leverage=" + Internal.sanitize(this.min_leverage));
            arrayList.add("max_leverage=" + Internal.sanitize(this.max_leverage));
            arrayList.add("default_selected_leverage=" + Internal.sanitize(this.default_selected_leverage));
            Money money6 = this.min_margin;
            if (money6 != null) {
                arrayList.add("min_margin=" + money6);
            }
            Money money7 = this.max_margin;
            if (money7 != null) {
                arrayList.add("max_margin=" + money7);
            }
            Money money8 = this.margin_reserved;
            if (money8 != null) {
                arrayList.add("margin_reserved=" + money8);
            }
            arrayList.add("margin_status=" + this.margin_status);
            Money money9 = this.margin_available_buying_power_usd;
            if (money9 != null) {
                arrayList.add("margin_available_buying_power_usd=" + money9);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MarginDetail{", "}", 0, null, null, 56, null);
        }

        public final MarginDetail copy(MarginMode margin_mode, Money margin_available_buying_power, Money margin_available_venue_usd, Money margin_available_venue_eur, Money margin_available_venue_total, Money margin_available_total, String min_leverage, String max_leverage, String default_selected_leverage, Money min_margin, Money max_margin, Money margin_reserved, MarginStatus margin_status, Money margin_available_buying_power_usd, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(min_leverage, "min_leverage");
            Intrinsics.checkNotNullParameter(max_leverage, "max_leverage");
            Intrinsics.checkNotNullParameter(default_selected_leverage, "default_selected_leverage");
            Intrinsics.checkNotNullParameter(margin_status, "margin_status");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new MarginDetail(margin_mode, margin_available_buying_power, margin_available_venue_usd, margin_available_venue_eur, margin_available_venue_total, margin_available_total, min_leverage, max_leverage, default_selected_leverage, min_margin, max_margin, margin_reserved, margin_status, margin_available_buying_power_usd, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginDetail.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<MarginDetail>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.order.v1.MarginAvailable$MarginDetail$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MarginAvailable.MarginDetail value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                        size += MarginMode.ADAPTER.encodedSizeWithTag(1, value.getMargin_mode());
                    }
                    if (value.getMargin_available_buying_power() != null) {
                        size += Money.ADAPTER.encodedSizeWithTag(2, value.getMargin_available_buying_power());
                    }
                    if (value.getMargin_available_venue_usd() != null) {
                        size += Money.ADAPTER.encodedSizeWithTag(3, value.getMargin_available_venue_usd());
                    }
                    if (value.getMargin_available_venue_eur() != null) {
                        size += Money.ADAPTER.encodedSizeWithTag(4, value.getMargin_available_venue_eur());
                    }
                    if (value.getMargin_available_venue_total() != null) {
                        size += Money.ADAPTER.encodedSizeWithTag(5, value.getMargin_available_venue_total());
                    }
                    if (value.getMargin_available_total() != null) {
                        size += Money.ADAPTER.encodedSizeWithTag(6, value.getMargin_available_total());
                    }
                    if (!Intrinsics.areEqual(value.getMin_leverage(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getMin_leverage());
                    }
                    if (!Intrinsics.areEqual(value.getMax_leverage(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getMax_leverage());
                    }
                    if (!Intrinsics.areEqual(value.getDefault_selected_leverage(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getDefault_selected_leverage());
                    }
                    if (value.getMin_margin() != null) {
                        size += Money.ADAPTER.encodedSizeWithTag(10, value.getMin_margin());
                    }
                    if (value.getMax_margin() != null) {
                        size += Money.ADAPTER.encodedSizeWithTag(11, value.getMax_margin());
                    }
                    if (value.getMargin_reserved() != null) {
                        size += Money.ADAPTER.encodedSizeWithTag(12, value.getMargin_reserved());
                    }
                    if (value.getMargin_status() != MarginStatus.MARGIN_STATUS_UNSPECIFIED) {
                        size += MarginStatus.ADAPTER.encodedSizeWithTag(13, value.getMargin_status());
                    }
                    return value.getMargin_available_buying_power_usd() != null ? size + Money.ADAPTER.encodedSizeWithTag(14, value.getMargin_available_buying_power_usd()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MarginAvailable.MarginDetail value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                        MarginMode.ADAPTER.encodeWithTag(writer, 1, (int) value.getMargin_mode());
                    }
                    if (value.getMargin_available_buying_power() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMargin_available_buying_power());
                    }
                    if (value.getMargin_available_venue_usd() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getMargin_available_venue_usd());
                    }
                    if (value.getMargin_available_venue_eur() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_available_venue_eur());
                    }
                    if (value.getMargin_available_venue_total() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getMargin_available_venue_total());
                    }
                    if (value.getMargin_available_total() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getMargin_available_total());
                    }
                    if (!Intrinsics.areEqual(value.getMin_leverage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMin_leverage());
                    }
                    if (!Intrinsics.areEqual(value.getMax_leverage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMax_leverage());
                    }
                    if (!Intrinsics.areEqual(value.getDefault_selected_leverage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getDefault_selected_leverage());
                    }
                    if (value.getMin_margin() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 10, (int) value.getMin_margin());
                    }
                    if (value.getMax_margin() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 11, (int) value.getMax_margin());
                    }
                    if (value.getMargin_reserved() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 12, (int) value.getMargin_reserved());
                    }
                    if (value.getMargin_status() != MarginStatus.MARGIN_STATUS_UNSPECIFIED) {
                        MarginStatus.ADAPTER.encodeWithTag(writer, 13, (int) value.getMargin_status());
                    }
                    if (value.getMargin_available_buying_power_usd() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 14, (int) value.getMargin_available_buying_power_usd());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MarginAvailable.MarginDetail value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getMargin_available_buying_power_usd() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 14, (int) value.getMargin_available_buying_power_usd());
                    }
                    if (value.getMargin_status() != MarginStatus.MARGIN_STATUS_UNSPECIFIED) {
                        MarginStatus.ADAPTER.encodeWithTag(writer, 13, (int) value.getMargin_status());
                    }
                    if (value.getMargin_reserved() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 12, (int) value.getMargin_reserved());
                    }
                    if (value.getMax_margin() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 11, (int) value.getMax_margin());
                    }
                    if (value.getMin_margin() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 10, (int) value.getMin_margin());
                    }
                    if (!Intrinsics.areEqual(value.getDefault_selected_leverage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getDefault_selected_leverage());
                    }
                    if (!Intrinsics.areEqual(value.getMax_leverage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMax_leverage());
                    }
                    if (!Intrinsics.areEqual(value.getMin_leverage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMin_leverage());
                    }
                    if (value.getMargin_available_total() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getMargin_available_total());
                    }
                    if (value.getMargin_available_venue_total() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getMargin_available_venue_total());
                    }
                    if (value.getMargin_available_venue_eur() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_available_venue_eur());
                    }
                    if (value.getMargin_available_venue_usd() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getMargin_available_venue_usd());
                    }
                    if (value.getMargin_available_buying_power() != null) {
                        Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMargin_available_buying_power());
                    }
                    if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                        MarginMode.ADAPTER.encodeWithTag(writer, 1, (int) value.getMargin_mode());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public MarginAvailable.MarginDetail decode(ProtoReader reader) throws IOException {
                    MarginStatus marginStatus;
                    Money money;
                    Money money2;
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    MarginMode marginMode = MarginMode.MARGIN_MODE_UNSPECIFIED;
                    MarginStatus marginStatus2 = MarginStatus.MARGIN_STATUS_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    MarginMode marginModeDecode = marginMode;
                    Money moneyDecode = null;
                    Money moneyDecode2 = null;
                    Money moneyDecode3 = null;
                    Money moneyDecode4 = null;
                    Money moneyDecode5 = null;
                    Money moneyDecode6 = null;
                    Money moneyDecode7 = null;
                    Money moneyDecode8 = null;
                    String strDecode = "";
                    String strDecode2 = strDecode;
                    String strDecode3 = strDecode2;
                    MarginStatus marginStatusDecode = marginStatus2;
                    Money moneyDecode9 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    marginStatus = marginStatusDecode;
                                    money = moneyDecode9;
                                    money2 = moneyDecode;
                                    try {
                                        marginModeDecode = MarginMode.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    moneyDecode9 = Money.ADAPTER.decode(reader);
                                    continue;
                                case 3:
                                    moneyDecode = Money.ADAPTER.decode(reader);
                                    continue;
                                case 4:
                                    moneyDecode2 = Money.ADAPTER.decode(reader);
                                    continue;
                                case 5:
                                    moneyDecode3 = Money.ADAPTER.decode(reader);
                                    continue;
                                case 6:
                                    moneyDecode4 = Money.ADAPTER.decode(reader);
                                    continue;
                                case 7:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 8:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 9:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    continue;
                                case 10:
                                    moneyDecode5 = Money.ADAPTER.decode(reader);
                                    continue;
                                case 11:
                                    moneyDecode6 = Money.ADAPTER.decode(reader);
                                    continue;
                                case 12:
                                    moneyDecode7 = Money.ADAPTER.decode(reader);
                                    continue;
                                case 13:
                                    try {
                                        marginStatusDecode = MarginStatus.ADAPTER.decode(reader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        marginStatus = marginStatusDecode;
                                        money = moneyDecode9;
                                        money2 = moneyDecode;
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 14:
                                    moneyDecode8 = Money.ADAPTER.decode(reader);
                                    continue;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    marginStatus = marginStatusDecode;
                                    money = moneyDecode9;
                                    money2 = moneyDecode;
                                    break;
                            }
                            marginStatusDecode = marginStatus;
                            moneyDecode9 = money;
                            moneyDecode = money2;
                        } else {
                            return new MarginAvailable.MarginDetail(marginModeDecode, moneyDecode9, moneyDecode, moneyDecode2, moneyDecode3, moneyDecode4, strDecode, strDecode2, strDecode3, moneyDecode5, moneyDecode6, moneyDecode7, marginStatusDecode, moneyDecode8, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MarginAvailable.MarginDetail redact(MarginAvailable.MarginDetail value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Money margin_available_buying_power = value.getMargin_available_buying_power();
                    Money moneyRedact = margin_available_buying_power != null ? Money.ADAPTER.redact(margin_available_buying_power) : null;
                    Money margin_available_venue_usd = value.getMargin_available_venue_usd();
                    Money moneyRedact2 = margin_available_venue_usd != null ? Money.ADAPTER.redact(margin_available_venue_usd) : null;
                    Money margin_available_venue_eur = value.getMargin_available_venue_eur();
                    Money moneyRedact3 = margin_available_venue_eur != null ? Money.ADAPTER.redact(margin_available_venue_eur) : null;
                    Money margin_available_venue_total = value.getMargin_available_venue_total();
                    Money moneyRedact4 = margin_available_venue_total != null ? Money.ADAPTER.redact(margin_available_venue_total) : null;
                    Money margin_available_total = value.getMargin_available_total();
                    Money moneyRedact5 = margin_available_total != null ? Money.ADAPTER.redact(margin_available_total) : null;
                    Money min_margin = value.getMin_margin();
                    Money moneyRedact6 = min_margin != null ? Money.ADAPTER.redact(min_margin) : null;
                    Money max_margin = value.getMax_margin();
                    Money moneyRedact7 = max_margin != null ? Money.ADAPTER.redact(max_margin) : null;
                    Money margin_reserved = value.getMargin_reserved();
                    Money moneyRedact8 = margin_reserved != null ? Money.ADAPTER.redact(margin_reserved) : null;
                    Money margin_available_buying_power_usd = value.getMargin_available_buying_power_usd();
                    return value.copy((4545 & 1) != 0 ? value.margin_mode : null, (4545 & 2) != 0 ? value.margin_available_buying_power : moneyRedact, (4545 & 4) != 0 ? value.margin_available_venue_usd : moneyRedact2, (4545 & 8) != 0 ? value.margin_available_venue_eur : moneyRedact3, (4545 & 16) != 0 ? value.margin_available_venue_total : moneyRedact4, (4545 & 32) != 0 ? value.margin_available_total : moneyRedact5, (4545 & 64) != 0 ? value.min_leverage : null, (4545 & 128) != 0 ? value.max_leverage : null, (4545 & 256) != 0 ? value.default_selected_leverage : null, (4545 & 512) != 0 ? value.min_margin : moneyRedact6, (4545 & 1024) != 0 ? value.max_margin : moneyRedact7, (4545 & 2048) != 0 ? value.margin_reserved : moneyRedact8, (4545 & 4096) != 0 ? value.margin_status : null, (4545 & 8192) != 0 ? value.margin_available_buying_power_usd : margin_available_buying_power_usd != null ? Money.ADAPTER.redact(margin_available_buying_power_usd) : null, (4545 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
                }
            };
        }
    }
}
