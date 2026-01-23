package cashier_protos.payment_hub.p046v1;

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

/* compiled from: FXTransferDetails.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016J~\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcashier_protos/payment_hub/v1/FXTransferDetails;", "Lcom/squareup/wire/Message;", "", "state", "Lcashier_protos/payment_hub/v1/FXTransferState;", "fx_trade_time", "", "expected_settlement_date", "base_amount", "base_currency", "Lcom/robinhood/rosetta/common/Currency;", "target_amount", "target_currency", "target_fx_rate", "target_fx_rate_id", "actual_target_amount", "actual_target_fx_rate", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcashier_protos/payment_hub/v1/FXTransferState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getState", "()Lcashier_protos/payment_hub/v1/FXTransferState;", "getFx_trade_time", "()Ljava/lang/String;", "getExpected_settlement_date", "getBase_amount", "getBase_currency", "()Lcom/robinhood/rosetta/common/Currency;", "getTarget_amount", "getTarget_currency", "getTarget_fx_rate", "getTarget_fx_rate_id", "getActual_target_amount", "getActual_target_fx_rate", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "cashier_protos.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class FXTransferDetails extends Message {

    @JvmField
    public static final ProtoAdapter<FXTransferDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "actualTargetAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String actual_target_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "actualTargetFxRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String actual_target_fx_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "baseAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String base_amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", jsonName = "baseCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Currency base_currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "expectedSettlementDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String expected_settlement_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fxTradeTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String fx_trade_time;

    @WireField(adapter = "cashier_protos.payment_hub.v1.FXTransferState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FXTransferState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String target_amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", jsonName = "targetCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Currency target_currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetFxRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String target_fx_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetFxRateId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String target_fx_rate_id;

    public FXTransferDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9084newBuilder();
    }

    public final FXTransferState getState() {
        return this.state;
    }

    public /* synthetic */ FXTransferDetails(FXTransferState fXTransferState, String str, String str2, String str3, Currency currency, String str4, Currency currency2, String str5, String str6, String str7, String str8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FXTransferState.FX_TRANSFER_STATE_UNSPECIFIED : fXTransferState, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency2, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getFx_trade_time() {
        return this.fx_trade_time;
    }

    public final String getExpected_settlement_date() {
        return this.expected_settlement_date;
    }

    public final String getBase_amount() {
        return this.base_amount;
    }

    public final Currency getBase_currency() {
        return this.base_currency;
    }

    public final String getTarget_amount() {
        return this.target_amount;
    }

    public final Currency getTarget_currency() {
        return this.target_currency;
    }

    public final String getTarget_fx_rate() {
        return this.target_fx_rate;
    }

    public final String getTarget_fx_rate_id() {
        return this.target_fx_rate_id;
    }

    public final String getActual_target_amount() {
        return this.actual_target_amount;
    }

    public final String getActual_target_fx_rate() {
        return this.actual_target_fx_rate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FXTransferDetails(FXTransferState state, String fx_trade_time, String expected_settlement_date, String base_amount, Currency base_currency, String target_amount, Currency target_currency, String target_fx_rate, String target_fx_rate_id, String actual_target_amount, String actual_target_fx_rate, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(fx_trade_time, "fx_trade_time");
        Intrinsics.checkNotNullParameter(expected_settlement_date, "expected_settlement_date");
        Intrinsics.checkNotNullParameter(base_amount, "base_amount");
        Intrinsics.checkNotNullParameter(base_currency, "base_currency");
        Intrinsics.checkNotNullParameter(target_amount, "target_amount");
        Intrinsics.checkNotNullParameter(target_currency, "target_currency");
        Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
        Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
        Intrinsics.checkNotNullParameter(actual_target_amount, "actual_target_amount");
        Intrinsics.checkNotNullParameter(actual_target_fx_rate, "actual_target_fx_rate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.state = state;
        this.fx_trade_time = fx_trade_time;
        this.expected_settlement_date = expected_settlement_date;
        this.base_amount = base_amount;
        this.base_currency = base_currency;
        this.target_amount = target_amount;
        this.target_currency = target_currency;
        this.target_fx_rate = target_fx_rate;
        this.target_fx_rate_id = target_fx_rate_id;
        this.actual_target_amount = actual_target_amount;
        this.actual_target_fx_rate = actual_target_fx_rate;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9084newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FXTransferDetails)) {
            return false;
        }
        FXTransferDetails fXTransferDetails = (FXTransferDetails) other;
        return Intrinsics.areEqual(unknownFields(), fXTransferDetails.unknownFields()) && this.state == fXTransferDetails.state && Intrinsics.areEqual(this.fx_trade_time, fXTransferDetails.fx_trade_time) && Intrinsics.areEqual(this.expected_settlement_date, fXTransferDetails.expected_settlement_date) && Intrinsics.areEqual(this.base_amount, fXTransferDetails.base_amount) && this.base_currency == fXTransferDetails.base_currency && Intrinsics.areEqual(this.target_amount, fXTransferDetails.target_amount) && this.target_currency == fXTransferDetails.target_currency && Intrinsics.areEqual(this.target_fx_rate, fXTransferDetails.target_fx_rate) && Intrinsics.areEqual(this.target_fx_rate_id, fXTransferDetails.target_fx_rate_id) && Intrinsics.areEqual(this.actual_target_amount, fXTransferDetails.actual_target_amount) && Intrinsics.areEqual(this.actual_target_fx_rate, fXTransferDetails.actual_target_fx_rate);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((unknownFields().hashCode() * 37) + this.state.hashCode()) * 37) + this.fx_trade_time.hashCode()) * 37) + this.expected_settlement_date.hashCode()) * 37) + this.base_amount.hashCode()) * 37) + this.base_currency.hashCode()) * 37) + this.target_amount.hashCode()) * 37) + this.target_currency.hashCode()) * 37) + this.target_fx_rate.hashCode()) * 37) + this.target_fx_rate_id.hashCode()) * 37) + this.actual_target_amount.hashCode()) * 37) + this.actual_target_fx_rate.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("state=" + this.state);
        arrayList.add("fx_trade_time=" + Internal.sanitize(this.fx_trade_time));
        arrayList.add("expected_settlement_date=" + Internal.sanitize(this.expected_settlement_date));
        arrayList.add("base_amount=" + Internal.sanitize(this.base_amount));
        arrayList.add("base_currency=" + this.base_currency);
        arrayList.add("target_amount=" + Internal.sanitize(this.target_amount));
        arrayList.add("target_currency=" + this.target_currency);
        arrayList.add("target_fx_rate=" + Internal.sanitize(this.target_fx_rate));
        arrayList.add("target_fx_rate_id=" + Internal.sanitize(this.target_fx_rate_id));
        arrayList.add("actual_target_amount=" + Internal.sanitize(this.actual_target_amount));
        arrayList.add("actual_target_fx_rate=" + Internal.sanitize(this.actual_target_fx_rate));
        return CollectionsKt.joinToString$default(arrayList, ", ", "FXTransferDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FXTransferDetails copy$default(FXTransferDetails fXTransferDetails, FXTransferState fXTransferState, String str, String str2, String str3, Currency currency, String str4, Currency currency2, String str5, String str6, String str7, String str8, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            fXTransferState = fXTransferDetails.state;
        }
        if ((i & 2) != 0) {
            str = fXTransferDetails.fx_trade_time;
        }
        if ((i & 4) != 0) {
            str2 = fXTransferDetails.expected_settlement_date;
        }
        if ((i & 8) != 0) {
            str3 = fXTransferDetails.base_amount;
        }
        if ((i & 16) != 0) {
            currency = fXTransferDetails.base_currency;
        }
        if ((i & 32) != 0) {
            str4 = fXTransferDetails.target_amount;
        }
        if ((i & 64) != 0) {
            currency2 = fXTransferDetails.target_currency;
        }
        if ((i & 128) != 0) {
            str5 = fXTransferDetails.target_fx_rate;
        }
        if ((i & 256) != 0) {
            str6 = fXTransferDetails.target_fx_rate_id;
        }
        if ((i & 512) != 0) {
            str7 = fXTransferDetails.actual_target_amount;
        }
        if ((i & 1024) != 0) {
            str8 = fXTransferDetails.actual_target_fx_rate;
        }
        if ((i & 2048) != 0) {
            byteString = fXTransferDetails.unknownFields();
        }
        String str9 = str8;
        ByteString byteString2 = byteString;
        String str10 = str6;
        String str11 = str7;
        Currency currency3 = currency2;
        String str12 = str5;
        Currency currency4 = currency;
        String str13 = str4;
        return fXTransferDetails.copy(fXTransferState, str, str2, str3, currency4, str13, currency3, str12, str10, str11, str9, byteString2);
    }

    public final FXTransferDetails copy(FXTransferState state, String fx_trade_time, String expected_settlement_date, String base_amount, Currency base_currency, String target_amount, Currency target_currency, String target_fx_rate, String target_fx_rate_id, String actual_target_amount, String actual_target_fx_rate, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(fx_trade_time, "fx_trade_time");
        Intrinsics.checkNotNullParameter(expected_settlement_date, "expected_settlement_date");
        Intrinsics.checkNotNullParameter(base_amount, "base_amount");
        Intrinsics.checkNotNullParameter(base_currency, "base_currency");
        Intrinsics.checkNotNullParameter(target_amount, "target_amount");
        Intrinsics.checkNotNullParameter(target_currency, "target_currency");
        Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
        Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
        Intrinsics.checkNotNullParameter(actual_target_amount, "actual_target_amount");
        Intrinsics.checkNotNullParameter(actual_target_fx_rate, "actual_target_fx_rate");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FXTransferDetails(state, fx_trade_time, expected_settlement_date, base_amount, base_currency, target_amount, target_currency, target_fx_rate, target_fx_rate_id, actual_target_amount, actual_target_fx_rate, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FXTransferDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FXTransferDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: cashier_protos.payment_hub.v1.FXTransferDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FXTransferDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getState() != FXTransferState.FX_TRANSFER_STATE_UNSPECIFIED) {
                    size += FXTransferState.ADAPTER.encodedSizeWithTag(1, value.getState());
                }
                if (!Intrinsics.areEqual(value.getFx_trade_time(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFx_trade_time());
                }
                if (!Intrinsics.areEqual(value.getExpected_settlement_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getExpected_settlement_date());
                }
                if (!Intrinsics.areEqual(value.getBase_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getBase_amount());
                }
                Currency base_currency = value.getBase_currency();
                Currency currency = Currency.CURRENCY_UNSPECIFIED;
                if (base_currency != currency) {
                    size += Currency.ADAPTER.encodedSizeWithTag(5, value.getBase_currency());
                }
                if (!Intrinsics.areEqual(value.getTarget_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getTarget_amount());
                }
                if (value.getTarget_currency() != currency) {
                    size += Currency.ADAPTER.encodedSizeWithTag(7, value.getTarget_currency());
                }
                if (!Intrinsics.areEqual(value.getTarget_fx_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getTarget_fx_rate());
                }
                if (!Intrinsics.areEqual(value.getTarget_fx_rate_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getTarget_fx_rate_id());
                }
                if (!Intrinsics.areEqual(value.getActual_target_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getActual_target_amount());
                }
                return !Intrinsics.areEqual(value.getActual_target_fx_rate(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(11, value.getActual_target_fx_rate()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FXTransferDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getState() != FXTransferState.FX_TRANSFER_STATE_UNSPECIFIED) {
                    FXTransferState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getFx_trade_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFx_trade_time());
                }
                if (!Intrinsics.areEqual(value.getExpected_settlement_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getExpected_settlement_date());
                }
                if (!Intrinsics.areEqual(value.getBase_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBase_amount());
                }
                Currency base_currency = value.getBase_currency();
                Currency currency = Currency.CURRENCY_UNSPECIFIED;
                if (base_currency != currency) {
                    Currency.ADAPTER.encodeWithTag(writer, 5, (int) value.getBase_currency());
                }
                if (!Intrinsics.areEqual(value.getTarget_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTarget_amount());
                }
                if (value.getTarget_currency() != currency) {
                    Currency.ADAPTER.encodeWithTag(writer, 7, (int) value.getTarget_currency());
                }
                if (!Intrinsics.areEqual(value.getTarget_fx_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getTarget_fx_rate());
                }
                if (!Intrinsics.areEqual(value.getTarget_fx_rate_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getTarget_fx_rate_id());
                }
                if (!Intrinsics.areEqual(value.getActual_target_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getActual_target_amount());
                }
                if (!Intrinsics.areEqual(value.getActual_target_fx_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getActual_target_fx_rate());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FXTransferDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getActual_target_fx_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getActual_target_fx_rate());
                }
                if (!Intrinsics.areEqual(value.getActual_target_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getActual_target_amount());
                }
                if (!Intrinsics.areEqual(value.getTarget_fx_rate_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getTarget_fx_rate_id());
                }
                if (!Intrinsics.areEqual(value.getTarget_fx_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getTarget_fx_rate());
                }
                Currency target_currency = value.getTarget_currency();
                Currency currency = Currency.CURRENCY_UNSPECIFIED;
                if (target_currency != currency) {
                    Currency.ADAPTER.encodeWithTag(writer, 7, (int) value.getTarget_currency());
                }
                if (!Intrinsics.areEqual(value.getTarget_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTarget_amount());
                }
                if (value.getBase_currency() != currency) {
                    Currency.ADAPTER.encodeWithTag(writer, 5, (int) value.getBase_currency());
                }
                if (!Intrinsics.areEqual(value.getBase_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBase_amount());
                }
                if (!Intrinsics.areEqual(value.getExpected_settlement_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getExpected_settlement_date());
                }
                if (!Intrinsics.areEqual(value.getFx_trade_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFx_trade_time());
                }
                if (value.getState() != FXTransferState.FX_TRANSFER_STATE_UNSPECIFIED) {
                    FXTransferState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FXTransferDetails decode(ProtoReader reader) throws IOException {
                FXTransferState fXTransferState;
                Currency currency;
                Currency currency2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                FXTransferState fXTransferState2 = FXTransferState.FX_TRANSFER_STATE_UNSPECIFIED;
                Currency currency3 = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Currency currencyDecode = currency3;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                FXTransferState fXTransferStateDecode = fXTransferState2;
                Currency currencyDecode2 = currencyDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                fXTransferState = fXTransferStateDecode;
                                currency = currencyDecode2;
                                currency2 = currencyDecode;
                                try {
                                    fXTransferStateDecode = FXTransferState.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                currencyDecode2 = currency;
                                currencyDecode = currency2;
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                fXTransferState = fXTransferStateDecode;
                                currency = currencyDecode2;
                                currency2 = currencyDecode;
                                try {
                                    currencyDecode2 = Currency.ADAPTER.decode(reader);
                                    fXTransferStateDecode = fXTransferState;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                currencyDecode = currency2;
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                try {
                                    currencyDecode = Currency.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    fXTransferState = fXTransferStateDecode;
                                    currency = currencyDecode2;
                                    currency2 = currencyDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                fXTransferState = fXTransferStateDecode;
                                currency = currencyDecode2;
                                currency2 = currencyDecode;
                                fXTransferStateDecode = fXTransferState;
                                currencyDecode2 = currency;
                                currencyDecode = currency2;
                                break;
                        }
                    } else {
                        return new FXTransferDetails(fXTransferStateDecode, strDecode, strDecode2, strDecode3, currencyDecode2, strDecode4, currencyDecode, strDecode5, strDecode6, strDecode7, strDecode8, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FXTransferDetails redact(FXTransferDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FXTransferDetails.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 2047, null);
            }
        };
    }
}
