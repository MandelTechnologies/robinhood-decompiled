package com.robinhood.rosetta.mainst;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.CurrencyPairType;
import rosetta.mainst.InstrumentState;
import rosetta.mainst.Tradability;

/* compiled from: CurrencyPairDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000U\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R-\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R-\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000f\u0010\u0007R-\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\u0007R-\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0017\u0010\u0007¨\u0006%"}, m3636d2 = {"com/robinhood/rosetta/mainst/CurrencyPairDetails$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/mainst/CurrencyPairDetails;", "crypto_metadataAdapter", "", "", "getCrypto_metadataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "crypto_metadataAdapter$delegate", "Lkotlin/Lazy;", "venue_symbolsAdapter", "getVenue_symbolsAdapter", "venue_symbolsAdapter$delegate", "state_by_regionAdapter", "Lrosetta/mainst/InstrumentState;", "getState_by_regionAdapter", "state_by_regionAdapter$delegate", "tradability_by_regionAdapter", "Lrosetta/mainst/Tradability;", "getTradability_by_regionAdapter", "tradability_by_regionAdapter$delegate", "third_party_router_coin_specAdapter", "Lcom/robinhood/rosetta/mainst/ThirdPartyRouterCoinSpec;", "getThird_party_router_coin_specAdapter", "third_party_router_coin_specAdapter$delegate", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.rosetta.mainst.CurrencyPairDetails$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes21.dex */
public final class CurrencyPairDetails2 extends ProtoAdapter<CurrencyPairDetails> {

    /* renamed from: crypto_metadataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy crypto_metadataAdapter;

    /* renamed from: state_by_regionAdapter$delegate, reason: from kotlin metadata */
    private final Lazy state_by_regionAdapter;

    /* renamed from: third_party_router_coin_specAdapter$delegate, reason: from kotlin metadata */
    private final Lazy third_party_router_coin_specAdapter;

    /* renamed from: tradability_by_regionAdapter$delegate, reason: from kotlin metadata */
    private final Lazy tradability_by_regionAdapter;

    /* renamed from: venue_symbolsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy venue_symbolsAdapter;

    CurrencyPairDetails2(FieldEncoding fieldEncoding, KClass<CurrencyPairDetails> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/rosetta.mainst.CurrencyPairDetails", syntax, (Object) null, "rosetta/rosetta/mainst/mainst.proto");
        this.crypto_metadataAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyPairDetails$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyPairDetails2.crypto_metadataAdapter_delegate$lambda$0();
            }
        });
        this.venue_symbolsAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyPairDetails$Companion$ADAPTER$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyPairDetails2.venue_symbolsAdapter_delegate$lambda$1();
            }
        });
        this.state_by_regionAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyPairDetails$Companion$ADAPTER$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyPairDetails2.state_by_regionAdapter_delegate$lambda$2();
            }
        });
        this.tradability_by_regionAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyPairDetails$Companion$ADAPTER$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyPairDetails2.tradability_by_regionAdapter_delegate$lambda$3();
            }
        });
        this.third_party_router_coin_specAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyPairDetails$Companion$ADAPTER$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyPairDetails2.third_party_router_coin_specAdapter_delegate$lambda$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter crypto_metadataAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    private final ProtoAdapter<Map<String, String>> getCrypto_metadataAdapter() {
        return (ProtoAdapter) this.crypto_metadataAdapter.getValue();
    }

    private final ProtoAdapter<Map<String, String>> getVenue_symbolsAdapter() {
        return (ProtoAdapter) this.venue_symbolsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter venue_symbolsAdapter_delegate$lambda$1() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    private final ProtoAdapter<Map<String, InstrumentState>> getState_by_regionAdapter() {
        return (ProtoAdapter) this.state_by_regionAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter state_by_regionAdapter_delegate$lambda$2() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, InstrumentState.ADAPTER);
    }

    private final ProtoAdapter<Map<String, Tradability>> getTradability_by_regionAdapter() {
        return (ProtoAdapter) this.tradability_by_regionAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter tradability_by_regionAdapter_delegate$lambda$3() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, Tradability.ADAPTER);
    }

    private final ProtoAdapter<Map<String, ThirdPartyRouterCoinSpec>> getThird_party_router_coin_specAdapter() {
        return (ProtoAdapter) this.third_party_router_coin_specAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter third_party_router_coin_specAdapter_delegate$lambda$4() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, ThirdPartyRouterCoinSpec.ADAPTER);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(CurrencyPairDetails value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (!Intrinsics.areEqual(value.getName(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
        }
        if (!Intrinsics.areEqual(value.getSymbol(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getSymbol());
        }
        if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
            size += InstrumentState.ADAPTER.encodedSizeWithTag(15, value.getState());
        }
        if (value.getMin_tick_size() != null) {
            size += Decimal.ADAPTER.encodedSizeWithTag(16, value.getMin_tick_size());
        }
        if (value.getAsset_currency() != null) {
            size += UUID.ADAPTER.encodedSizeWithTag(2, value.getAsset_currency());
        }
        if (value.getQuote_currency() != null) {
            size += UUID.ADAPTER.encodedSizeWithTag(3, value.getQuote_currency());
        }
        if (value.getMin_order_size() != null) {
            size += Decimal.ADAPTER.encodedSizeWithTag(4, value.getMin_order_size());
        }
        if (value.getMax_order_size() != null) {
            size += Decimal.ADAPTER.encodedSizeWithTag(5, value.getMax_order_size());
        }
        if (value.getMin_order_price_increment() != null) {
            size += Decimal.ADAPTER.encodedSizeWithTag(6, value.getMin_order_price_increment());
        }
        if (value.getMin_order_quantity_increment() != null) {
            size += Decimal.ADAPTER.encodedSizeWithTag(7, value.getMin_order_quantity_increment());
        }
        if (value.getMin_quote_price_increment() != null) {
            size += Decimal.ADAPTER.encodedSizeWithTag(8, value.getMin_quote_price_increment());
        }
        if (value.getMin_quote_quantity_increment() != null) {
            size += Decimal.ADAPTER.encodedSizeWithTag(9, value.getMin_quote_quantity_increment());
        }
        if (value.getRhc_tradability() != Tradability.TRADABILITY_UNSPECIFIED) {
            size += Tradability.ADAPTER.encodedSizeWithTag(10, value.getRhc_tradability());
        }
        if (value.getFundamentals_enabled()) {
            size += ProtoAdapter.BOOL.encodedSizeWithTag(11, Boolean.valueOf(value.getFundamentals_enabled()));
        }
        int iEncodedSizeWithTag = size + getCrypto_metadataAdapter().encodedSizeWithTag(12, value.getCrypto_metadata()) + getVenue_symbolsAdapter().encodedSizeWithTag(13, value.getVenue_symbols());
        if (value.getCreated_at() != null) {
            iEncodedSizeWithTag += Time.ADAPTER.encodedSizeWithTag(17, value.getCreated_at());
        }
        if (value.getUpdated_at() != null) {
            iEncodedSizeWithTag += Time.ADAPTER.encodedSizeWithTag(18, value.getUpdated_at());
        }
        int iEncodedSizeWithTag2 = iEncodedSizeWithTag + getState_by_regionAdapter().encodedSizeWithTag(20, value.getState_by_region());
        if (value.getCurrency_pair_type() != CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED) {
            iEncodedSizeWithTag2 += CurrencyPairType.ADAPTER.encodedSizeWithTag(21, value.getCurrency_pair_type());
        }
        int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + getTradability_by_regionAdapter().encodedSizeWithTag(22, value.getTradability_by_region()) + getThird_party_router_coin_specAdapter().encodedSizeWithTag(23, value.getThird_party_router_coin_spec());
        if (value.getSpot_currency_pair() != null) {
            iEncodedSizeWithTag3 += UUID.ADAPTER.encodedSizeWithTag(24, value.getSpot_currency_pair());
        }
        if (value.getUnderlying_equity_instrument_id() != null) {
            iEncodedSizeWithTag3 += UUID.ADAPTER.encodedSizeWithTag(25, value.getUnderlying_equity_instrument_id());
        }
        return !Intrinsics.areEqual(value.getDescription(), "") ? iEncodedSizeWithTag3 + ProtoAdapter.STRING.encodedSizeWithTag(26, value.getDescription()) : iEncodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, CurrencyPairDetails value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
        }
        if (!Intrinsics.areEqual(value.getSymbol(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getSymbol());
        }
        if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
            InstrumentState.ADAPTER.encodeWithTag(writer, 15, (int) value.getState());
        }
        if (value.getMin_tick_size() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 16, (int) value.getMin_tick_size());
        }
        if (value.getAsset_currency() != null) {
            UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_currency());
        }
        if (value.getQuote_currency() != null) {
            UUID.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuote_currency());
        }
        if (value.getMin_order_size() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getMin_order_size());
        }
        if (value.getMax_order_size() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getMax_order_size());
        }
        if (value.getMin_order_price_increment() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 6, (int) value.getMin_order_price_increment());
        }
        if (value.getMin_order_quantity_increment() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getMin_order_quantity_increment());
        }
        if (value.getMin_quote_price_increment() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getMin_quote_price_increment());
        }
        if (value.getMin_quote_quantity_increment() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getMin_quote_quantity_increment());
        }
        if (value.getRhc_tradability() != Tradability.TRADABILITY_UNSPECIFIED) {
            Tradability.ADAPTER.encodeWithTag(writer, 10, (int) value.getRhc_tradability());
        }
        if (value.getFundamentals_enabled()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) Boolean.valueOf(value.getFundamentals_enabled()));
        }
        getCrypto_metadataAdapter().encodeWithTag(writer, 12, (int) value.getCrypto_metadata());
        getVenue_symbolsAdapter().encodeWithTag(writer, 13, (int) value.getVenue_symbols());
        if (value.getCreated_at() != null) {
            Time.ADAPTER.encodeWithTag(writer, 17, (int) value.getCreated_at());
        }
        if (value.getUpdated_at() != null) {
            Time.ADAPTER.encodeWithTag(writer, 18, (int) value.getUpdated_at());
        }
        getState_by_regionAdapter().encodeWithTag(writer, 20, (int) value.getState_by_region());
        if (value.getCurrency_pair_type() != CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED) {
            CurrencyPairType.ADAPTER.encodeWithTag(writer, 21, (int) value.getCurrency_pair_type());
        }
        getTradability_by_regionAdapter().encodeWithTag(writer, 22, (int) value.getTradability_by_region());
        getThird_party_router_coin_specAdapter().encodeWithTag(writer, 23, (int) value.getThird_party_router_coin_spec());
        if (value.getSpot_currency_pair() != null) {
            UUID.ADAPTER.encodeWithTag(writer, 24, (int) value.getSpot_currency_pair());
        }
        if (value.getUnderlying_equity_instrument_id() != null) {
            UUID.ADAPTER.encodeWithTag(writer, 25, (int) value.getUnderlying_equity_instrument_id());
        }
        if (!Intrinsics.areEqual(value.getDescription(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 26, (int) value.getDescription());
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, CurrencyPairDetails value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        if (!Intrinsics.areEqual(value.getDescription(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 26, (int) value.getDescription());
        }
        if (value.getUnderlying_equity_instrument_id() != null) {
            UUID.ADAPTER.encodeWithTag(writer, 25, (int) value.getUnderlying_equity_instrument_id());
        }
        if (value.getSpot_currency_pair() != null) {
            UUID.ADAPTER.encodeWithTag(writer, 24, (int) value.getSpot_currency_pair());
        }
        getThird_party_router_coin_specAdapter().encodeWithTag(writer, 23, (int) value.getThird_party_router_coin_spec());
        getTradability_by_regionAdapter().encodeWithTag(writer, 22, (int) value.getTradability_by_region());
        if (value.getCurrency_pair_type() != CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED) {
            CurrencyPairType.ADAPTER.encodeWithTag(writer, 21, (int) value.getCurrency_pair_type());
        }
        getState_by_regionAdapter().encodeWithTag(writer, 20, (int) value.getState_by_region());
        if (value.getUpdated_at() != null) {
            Time.ADAPTER.encodeWithTag(writer, 18, (int) value.getUpdated_at());
        }
        if (value.getCreated_at() != null) {
            Time.ADAPTER.encodeWithTag(writer, 17, (int) value.getCreated_at());
        }
        getVenue_symbolsAdapter().encodeWithTag(writer, 13, (int) value.getVenue_symbols());
        getCrypto_metadataAdapter().encodeWithTag(writer, 12, (int) value.getCrypto_metadata());
        if (value.getFundamentals_enabled()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) Boolean.valueOf(value.getFundamentals_enabled()));
        }
        if (value.getRhc_tradability() != Tradability.TRADABILITY_UNSPECIFIED) {
            Tradability.ADAPTER.encodeWithTag(writer, 10, (int) value.getRhc_tradability());
        }
        if (value.getMin_quote_quantity_increment() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getMin_quote_quantity_increment());
        }
        if (value.getMin_quote_price_increment() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getMin_quote_price_increment());
        }
        if (value.getMin_order_quantity_increment() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getMin_order_quantity_increment());
        }
        if (value.getMin_order_price_increment() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 6, (int) value.getMin_order_price_increment());
        }
        if (value.getMax_order_size() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getMax_order_size());
        }
        if (value.getMin_order_size() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getMin_order_size());
        }
        if (value.getQuote_currency() != null) {
            UUID.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuote_currency());
        }
        if (value.getAsset_currency() != null) {
            UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_currency());
        }
        if (value.getMin_tick_size() != null) {
            Decimal.ADAPTER.encodeWithTag(writer, 16, (int) value.getMin_tick_size());
        }
        if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
            InstrumentState.ADAPTER.encodeWithTag(writer, 15, (int) value.getState());
        }
        if (!Intrinsics.areEqual(value.getSymbol(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getSymbol());
        }
        if (Intrinsics.areEqual(value.getName(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public CurrencyPairDetails decode(ProtoReader reader) throws IOException {
        Tradability tradability;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Intrinsics.checkNotNullParameter(reader, "reader");
        InstrumentState instrumentState = InstrumentState.INSTRUMENT_STATE_UNSPECIFIED;
        Tradability tradability2 = Tradability.TRADABILITY_UNSPECIFIED;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        CurrencyPairType currencyPairType = CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED;
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        InstrumentState instrumentStateDecode = instrumentState;
        String strDecode = "";
        Decimal decimalDecode = null;
        UUID uuidDecode = null;
        UUID uuidDecode2 = null;
        Decimal decimalDecode2 = null;
        Decimal decimalDecode3 = null;
        Decimal decimalDecode4 = null;
        Decimal decimalDecode5 = null;
        Decimal decimalDecode6 = null;
        Decimal decimalDecode7 = null;
        Time timeDecode = null;
        Time timeDecode2 = null;
        UUID uuidDecode3 = null;
        UUID uuidDecode4 = null;
        boolean zBooleanValue = false;
        CurrencyPairType currencyPairTypeDecode = currencyPairType;
        String strDecode2 = strDecode;
        String strDecode3 = strDecode2;
        Tradability tradabilityDecode = tradability2;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new CurrencyPairDetails(strDecode2, strDecode3, instrumentStateDecode, decimalDecode, uuidDecode, uuidDecode2, decimalDecode2, decimalDecode3, decimalDecode4, decimalDecode5, decimalDecode6, decimalDecode7, tradabilityDecode, zBooleanValue, linkedHashMap3, linkedHashMap4, timeDecode, timeDecode2, linkedHashMap5, currencyPairTypeDecode, linkedHashMap6, linkedHashMap7, uuidDecode3, uuidDecode4, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 2:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    uuidDecode = UUID.ADAPTER.decode(reader);
                    break;
                case 3:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    uuidDecode2 = UUID.ADAPTER.decode(reader);
                    break;
                case 4:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    decimalDecode2 = Decimal.ADAPTER.decode(reader);
                    break;
                case 5:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    decimalDecode3 = Decimal.ADAPTER.decode(reader);
                    break;
                case 6:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    decimalDecode4 = Decimal.ADAPTER.decode(reader);
                    break;
                case 7:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    decimalDecode5 = Decimal.ADAPTER.decode(reader);
                    break;
                case 8:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    decimalDecode6 = Decimal.ADAPTER.decode(reader);
                    break;
                case 9:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    decimalDecode7 = Decimal.ADAPTER.decode(reader);
                    break;
                case 10:
                    tradability = tradabilityDecode;
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    try {
                        tradabilityDecode = Tradability.ADAPTER.decode(reader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 11:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    break;
                case 12:
                    tradability = tradabilityDecode;
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    linkedHashMap3.putAll(getCrypto_metadataAdapter().decode(reader));
                    tradabilityDecode = tradability;
                    break;
                case 13:
                    tradability = tradabilityDecode;
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    linkedHashMap4.putAll(getVenue_symbolsAdapter().decode(reader));
                    tradabilityDecode = tradability;
                    break;
                case 14:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 15:
                    tradability = tradabilityDecode;
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    try {
                        instrumentStateDecode = InstrumentState.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                    tradabilityDecode = tradability;
                    break;
                case 16:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    decimalDecode = Decimal.ADAPTER.decode(reader);
                    break;
                case 17:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    timeDecode = Time.ADAPTER.decode(reader);
                    break;
                case 18:
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    timeDecode2 = Time.ADAPTER.decode(reader);
                    break;
                case 19:
                default:
                    reader.readUnknownField(iNextTag);
                    tradability = tradabilityDecode;
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    tradabilityDecode = tradability;
                    break;
                case 20:
                    tradability = tradabilityDecode;
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    linkedHashMap5.putAll(getState_by_regionAdapter().decode(reader));
                    tradabilityDecode = tradability;
                    break;
                case 21:
                    try {
                        currencyPairTypeDecode = CurrencyPairType.ADAPTER.decode(reader);
                        linkedHashMap = linkedHashMap6;
                        linkedHashMap2 = linkedHashMap7;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        tradability = tradabilityDecode;
                        linkedHashMap = linkedHashMap6;
                        linkedHashMap2 = linkedHashMap7;
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 22:
                    linkedHashMap6.putAll(getTradability_by_regionAdapter().decode(reader));
                    tradability = tradabilityDecode;
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    tradabilityDecode = tradability;
                    break;
                case 23:
                    linkedHashMap7.putAll(getThird_party_router_coin_specAdapter().decode(reader));
                    tradability = tradabilityDecode;
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    tradabilityDecode = tradability;
                    break;
                case 24:
                    uuidDecode3 = UUID.ADAPTER.decode(reader);
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    break;
                case 25:
                    uuidDecode4 = UUID.ADAPTER.decode(reader);
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    break;
                case 26:
                    strDecode = ProtoAdapter.STRING.decode(reader);
                    linkedHashMap = linkedHashMap6;
                    linkedHashMap2 = linkedHashMap7;
                    break;
            }
            linkedHashMap6 = linkedHashMap;
            linkedHashMap7 = linkedHashMap2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public CurrencyPairDetails redact(CurrencyPairDetails value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Decimal min_tick_size = value.getMin_tick_size();
        Decimal decimalRedact = min_tick_size != null ? Decimal.ADAPTER.redact(min_tick_size) : null;
        UUID asset_currency = value.getAsset_currency();
        UUID uuidRedact = asset_currency != null ? UUID.ADAPTER.redact(asset_currency) : null;
        UUID quote_currency = value.getQuote_currency();
        UUID uuidRedact2 = quote_currency != null ? UUID.ADAPTER.redact(quote_currency) : null;
        Decimal min_order_size = value.getMin_order_size();
        Decimal decimalRedact2 = min_order_size != null ? Decimal.ADAPTER.redact(min_order_size) : null;
        Decimal max_order_size = value.getMax_order_size();
        Decimal decimalRedact3 = max_order_size != null ? Decimal.ADAPTER.redact(max_order_size) : null;
        Decimal min_order_price_increment = value.getMin_order_price_increment();
        Decimal decimalRedact4 = min_order_price_increment != null ? Decimal.ADAPTER.redact(min_order_price_increment) : null;
        Decimal min_order_quantity_increment = value.getMin_order_quantity_increment();
        Decimal decimalRedact5 = min_order_quantity_increment != null ? Decimal.ADAPTER.redact(min_order_quantity_increment) : null;
        Decimal min_quote_price_increment = value.getMin_quote_price_increment();
        Decimal decimalRedact6 = min_quote_price_increment != null ? Decimal.ADAPTER.redact(min_quote_price_increment) : null;
        Decimal min_quote_quantity_increment = value.getMin_quote_quantity_increment();
        Decimal decimalRedact7 = min_quote_quantity_increment != null ? Decimal.ADAPTER.redact(min_quote_quantity_increment) : null;
        Time created_at = value.getCreated_at();
        Time timeRedact = created_at != null ? Time.ADAPTER.redact(created_at) : null;
        Time updated_at = value.getUpdated_at();
        Time timeRedact2 = updated_at != null ? Time.ADAPTER.redact(updated_at) : null;
        Map mapM26824redactElements = Internal.m26824redactElements(value.getThird_party_router_coin_spec(), ThirdPartyRouterCoinSpec.ADAPTER);
        UUID spot_currency_pair = value.getSpot_currency_pair();
        UUID uuidRedact3 = spot_currency_pair != null ? UUID.ADAPTER.redact(spot_currency_pair) : null;
        UUID underlying_equity_instrument_id = value.getUnderlying_equity_instrument_id();
        return value.copy((18673671 & 1) != 0 ? value.name : null, (18673671 & 2) != 0 ? value.symbol : null, (18673671 & 4) != 0 ? value.state : null, (18673671 & 8) != 0 ? value.min_tick_size : decimalRedact, (18673671 & 16) != 0 ? value.asset_currency : uuidRedact, (18673671 & 32) != 0 ? value.quote_currency : uuidRedact2, (18673671 & 64) != 0 ? value.min_order_size : decimalRedact2, (18673671 & 128) != 0 ? value.max_order_size : decimalRedact3, (18673671 & 256) != 0 ? value.min_order_price_increment : decimalRedact4, (18673671 & 512) != 0 ? value.min_order_quantity_increment : decimalRedact5, (18673671 & 1024) != 0 ? value.min_quote_price_increment : decimalRedact6, (18673671 & 2048) != 0 ? value.min_quote_quantity_increment : decimalRedact7, (18673671 & 4096) != 0 ? value.rhc_tradability : null, (18673671 & 8192) != 0 ? value.fundamentals_enabled : false, (18673671 & 16384) != 0 ? value.crypto_metadata : null, (18673671 & 32768) != 0 ? value.venue_symbols : null, (18673671 & 65536) != 0 ? value.created_at : timeRedact, (18673671 & 131072) != 0 ? value.updated_at : timeRedact2, (18673671 & 262144) != 0 ? value.state_by_region : null, (18673671 & 524288) != 0 ? value.currency_pair_type : null, (18673671 & 1048576) != 0 ? value.tradability_by_region : null, (18673671 & 2097152) != 0 ? value.third_party_router_coin_spec : mapM26824redactElements, (18673671 & 4194304) != 0 ? value.spot_currency_pair : uuidRedact3, (18673671 & 8388608) != 0 ? value.underlying_equity_instrument_id : underlying_equity_instrument_id != null ? UUID.ADAPTER.redact(underlying_equity_instrument_id) : null, (18673671 & 16777216) != 0 ? value.description : null, (18673671 & 33554432) != 0 ? value.unknownFields() : ByteString.EMPTY);
    }
}
