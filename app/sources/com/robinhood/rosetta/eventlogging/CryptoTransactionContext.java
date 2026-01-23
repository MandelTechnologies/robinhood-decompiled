package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.CryptoTransactionContext;
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

/* compiled from: CryptoTransactionContext.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\bDEFGHIJKBÇ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010;\u001a\u00020\u0002H\u0017J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\b\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020\tH\u0016JÆ\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0016\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0016\u0010\u001a\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006L"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext;", "Lcom/squareup/wire/Message;", "", "selling_currency_id", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "buying_currency_id", "transaction_type", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType;", "session_id", "", "amount", "", "network_fee", "rh_fee", "transaction_hash", "result", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Result;", "error", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;", "input_context", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext;", "swap_provider", "amount_available", "approval_context", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext;", "fee_token", "fee_token_amount_required", "token_holdings", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TokenHoldingsContext;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType;Ljava/lang/String;DDDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Result;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext;Ljava/lang/String;DLcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;DLcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TokenHoldingsContext;Lokio/ByteString;)V", "getSelling_currency_id", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "getBuying_currency_id", "getTransaction_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType;", "getSession_id", "()Ljava/lang/String;", "getAmount", "()D", "getNetwork_fee", "getRh_fee", "getTransaction_hash", "getResult", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Result;", "getError", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;", "getInput_context", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext;", "getSwap_provider", "getAmount_available", "getApproval_context", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext;", "getFee_token", "getFee_token_amount_required", "getToken_holdings", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TokenHoldingsContext;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Error", "Result", "TransactionType", "InputContext", "ApprovalContext", "Holding", "TokenHoldingsContext", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CryptoTransactionContext extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoTransactionContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final double amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "amountAvailable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final double amount_available;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTransactionContext$ApprovalContext#ADAPTER", jsonName = "approvalContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final ApprovalContext approval_context;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoAssetContext#ADAPTER", jsonName = "buyingCurrencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CryptoAssetContext buying_currency_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTransactionContext$Error#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Error error;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoAssetContext#ADAPTER", jsonName = "feeToken", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final CryptoAssetContext fee_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "feeTokenAmountRequired", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final double fee_token_amount_required;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTransactionContext$InputContext#ADAPTER", jsonName = "inputContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final InputContext input_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "networkFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double network_fee;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTransactionContext$Result#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Result result;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "rhFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final double rh_fee;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoAssetContext#ADAPTER", jsonName = "sellingCurrencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CryptoAssetContext selling_currency_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "swapProvider", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String swap_provider;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTransactionContext$TokenHoldingsContext#ADAPTER", jsonName = "tokenHoldings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final TokenHoldingsContext token_holdings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transactionHash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String transaction_hash;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTransactionContext$TransactionType#ADAPTER", jsonName = "transactionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TransactionType transaction_type;

    public CryptoTransactionContext() {
        this(null, null, null, null, 0.0d, 0.0d, 0.0d, null, null, null, null, null, 0.0d, null, null, 0.0d, null, null, 262143, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24166newBuilder();
    }

    public final CryptoAssetContext getSelling_currency_id() {
        return this.selling_currency_id;
    }

    public final CryptoAssetContext getBuying_currency_id() {
        return this.buying_currency_id;
    }

    public final TransactionType getTransaction_type() {
        return this.transaction_type;
    }

    public /* synthetic */ CryptoTransactionContext(CryptoAssetContext cryptoAssetContext, CryptoAssetContext cryptoAssetContext2, TransactionType transactionType, String str, double d, double d2, double d3, String str2, Result result, Error error, InputContext inputContext, String str3, double d4, ApprovalContext approvalContext, CryptoAssetContext cryptoAssetContext3, double d5, TokenHoldingsContext tokenHoldingsContext, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoAssetContext, (i & 2) != 0 ? null : cryptoAssetContext2, (i & 4) != 0 ? TransactionType.TRANSACTION_TYPE_UNSPECIFIED : transactionType, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? 0.0d : d2, (i & 64) != 0 ? 0.0d : d3, (i & 128) != 0 ? "" : str2, (i & 256) != 0 ? Result.RESULT_UNSPECIFIED : result, (i & 512) != 0 ? Error.ERROR_UNSPECIFIED : error, (i & 1024) != 0 ? null : inputContext, (i & 2048) == 0 ? str3 : "", (i & 4096) != 0 ? 0.0d : d4, (i & 8192) != 0 ? null : approvalContext, (i & 16384) != 0 ? null : cryptoAssetContext3, (i & 32768) != 0 ? 0.0d : d5, (i & 65536) != 0 ? null : tokenHoldingsContext, (i & 131072) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getNetwork_fee() {
        return this.network_fee;
    }

    public final double getRh_fee() {
        return this.rh_fee;
    }

    public final String getTransaction_hash() {
        return this.transaction_hash;
    }

    public final Result getResult() {
        return this.result;
    }

    public final Error getError() {
        return this.error;
    }

    public final InputContext getInput_context() {
        return this.input_context;
    }

    public final String getSwap_provider() {
        return this.swap_provider;
    }

    public final double getAmount_available() {
        return this.amount_available;
    }

    public final ApprovalContext getApproval_context() {
        return this.approval_context;
    }

    public final CryptoAssetContext getFee_token() {
        return this.fee_token;
    }

    public final double getFee_token_amount_required() {
        return this.fee_token_amount_required;
    }

    public final TokenHoldingsContext getToken_holdings() {
        return this.token_holdings;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTransactionContext(CryptoAssetContext cryptoAssetContext, CryptoAssetContext cryptoAssetContext2, TransactionType transaction_type, String session_id, double d, double d2, double d3, String transaction_hash, Result result, Error error, InputContext inputContext, String swap_provider, double d4, ApprovalContext approvalContext, CryptoAssetContext cryptoAssetContext3, double d5, TokenHoldingsContext tokenHoldingsContext, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(transaction_type, "transaction_type");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(swap_provider, "swap_provider");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.selling_currency_id = cryptoAssetContext;
        this.buying_currency_id = cryptoAssetContext2;
        this.transaction_type = transaction_type;
        this.session_id = session_id;
        this.amount = d;
        this.network_fee = d2;
        this.rh_fee = d3;
        this.transaction_hash = transaction_hash;
        this.result = result;
        this.error = error;
        this.input_context = inputContext;
        this.swap_provider = swap_provider;
        this.amount_available = d4;
        this.approval_context = approvalContext;
        this.fee_token = cryptoAssetContext3;
        this.fee_token_amount_required = d5;
        this.token_holdings = tokenHoldingsContext;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24166newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoTransactionContext)) {
            return false;
        }
        CryptoTransactionContext cryptoTransactionContext = (CryptoTransactionContext) other;
        return Intrinsics.areEqual(unknownFields(), cryptoTransactionContext.unknownFields()) && Intrinsics.areEqual(this.selling_currency_id, cryptoTransactionContext.selling_currency_id) && Intrinsics.areEqual(this.buying_currency_id, cryptoTransactionContext.buying_currency_id) && this.transaction_type == cryptoTransactionContext.transaction_type && Intrinsics.areEqual(this.session_id, cryptoTransactionContext.session_id) && this.amount == cryptoTransactionContext.amount && this.network_fee == cryptoTransactionContext.network_fee && this.rh_fee == cryptoTransactionContext.rh_fee && Intrinsics.areEqual(this.transaction_hash, cryptoTransactionContext.transaction_hash) && this.result == cryptoTransactionContext.result && this.error == cryptoTransactionContext.error && Intrinsics.areEqual(this.input_context, cryptoTransactionContext.input_context) && Intrinsics.areEqual(this.swap_provider, cryptoTransactionContext.swap_provider) && this.amount_available == cryptoTransactionContext.amount_available && Intrinsics.areEqual(this.approval_context, cryptoTransactionContext.approval_context) && Intrinsics.areEqual(this.fee_token, cryptoTransactionContext.fee_token) && this.fee_token_amount_required == cryptoTransactionContext.fee_token_amount_required && Intrinsics.areEqual(this.token_holdings, cryptoTransactionContext.token_holdings);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CryptoAssetContext cryptoAssetContext = this.selling_currency_id;
        int iHashCode2 = (iHashCode + (cryptoAssetContext != null ? cryptoAssetContext.hashCode() : 0)) * 37;
        CryptoAssetContext cryptoAssetContext2 = this.buying_currency_id;
        int iHashCode3 = (((((((((((((((((iHashCode2 + (cryptoAssetContext2 != null ? cryptoAssetContext2.hashCode() : 0)) * 37) + this.transaction_type.hashCode()) * 37) + this.session_id.hashCode()) * 37) + Double.hashCode(this.amount)) * 37) + Double.hashCode(this.network_fee)) * 37) + Double.hashCode(this.rh_fee)) * 37) + this.transaction_hash.hashCode()) * 37) + this.result.hashCode()) * 37) + this.error.hashCode()) * 37;
        InputContext inputContext = this.input_context;
        int iHashCode4 = (((((iHashCode3 + (inputContext != null ? inputContext.hashCode() : 0)) * 37) + this.swap_provider.hashCode()) * 37) + Double.hashCode(this.amount_available)) * 37;
        ApprovalContext approvalContext = this.approval_context;
        int iHashCode5 = (iHashCode4 + (approvalContext != null ? approvalContext.hashCode() : 0)) * 37;
        CryptoAssetContext cryptoAssetContext3 = this.fee_token;
        int iHashCode6 = (((iHashCode5 + (cryptoAssetContext3 != null ? cryptoAssetContext3.hashCode() : 0)) * 37) + Double.hashCode(this.fee_token_amount_required)) * 37;
        TokenHoldingsContext tokenHoldingsContext = this.token_holdings;
        int iHashCode7 = iHashCode6 + (tokenHoldingsContext != null ? tokenHoldingsContext.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        CryptoAssetContext cryptoAssetContext = this.selling_currency_id;
        if (cryptoAssetContext != null) {
            arrayList.add("selling_currency_id=" + cryptoAssetContext);
        }
        CryptoAssetContext cryptoAssetContext2 = this.buying_currency_id;
        if (cryptoAssetContext2 != null) {
            arrayList.add("buying_currency_id=" + cryptoAssetContext2);
        }
        arrayList.add("transaction_type=" + this.transaction_type);
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        arrayList.add("amount=" + this.amount);
        arrayList.add("network_fee=" + this.network_fee);
        arrayList.add("rh_fee=" + this.rh_fee);
        arrayList.add("transaction_hash=" + Internal.sanitize(this.transaction_hash));
        arrayList.add("result=" + this.result);
        arrayList.add("error=" + this.error);
        InputContext inputContext = this.input_context;
        if (inputContext != null) {
            arrayList.add("input_context=" + inputContext);
        }
        arrayList.add("swap_provider=" + Internal.sanitize(this.swap_provider));
        arrayList.add("amount_available=" + this.amount_available);
        ApprovalContext approvalContext = this.approval_context;
        if (approvalContext != null) {
            arrayList.add("approval_context=" + approvalContext);
        }
        CryptoAssetContext cryptoAssetContext3 = this.fee_token;
        if (cryptoAssetContext3 != null) {
            arrayList.add("fee_token=" + cryptoAssetContext3);
        }
        arrayList.add("fee_token_amount_required=" + this.fee_token_amount_required);
        TokenHoldingsContext tokenHoldingsContext = this.token_holdings;
        if (tokenHoldingsContext != null) {
            arrayList.add("token_holdings=" + tokenHoldingsContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoTransactionContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoTransactionContext copy$default(CryptoTransactionContext cryptoTransactionContext, CryptoAssetContext cryptoAssetContext, CryptoAssetContext cryptoAssetContext2, TransactionType transactionType, String str, double d, double d2, double d3, String str2, Result result, Error error, InputContext inputContext, String str3, double d4, ApprovalContext approvalContext, CryptoAssetContext cryptoAssetContext3, double d5, TokenHoldingsContext tokenHoldingsContext, ByteString byteString, int i, Object obj) {
        CryptoAssetContext cryptoAssetContext4 = (i & 1) != 0 ? cryptoTransactionContext.selling_currency_id : cryptoAssetContext;
        CryptoAssetContext cryptoAssetContext5 = (i & 2) != 0 ? cryptoTransactionContext.buying_currency_id : cryptoAssetContext2;
        return cryptoTransactionContext.copy(cryptoAssetContext4, cryptoAssetContext5, (i & 4) != 0 ? cryptoTransactionContext.transaction_type : transactionType, (i & 8) != 0 ? cryptoTransactionContext.session_id : str, (i & 16) != 0 ? cryptoTransactionContext.amount : d, (i & 32) != 0 ? cryptoTransactionContext.network_fee : d2, (i & 64) != 0 ? cryptoTransactionContext.rh_fee : d3, (i & 128) != 0 ? cryptoTransactionContext.transaction_hash : str2, (i & 256) != 0 ? cryptoTransactionContext.result : result, (i & 512) != 0 ? cryptoTransactionContext.error : error, (i & 1024) != 0 ? cryptoTransactionContext.input_context : inputContext, (i & 2048) != 0 ? cryptoTransactionContext.swap_provider : str3, (i & 4096) != 0 ? cryptoTransactionContext.amount_available : d4, (i & 8192) != 0 ? cryptoTransactionContext.approval_context : approvalContext, (i & 16384) != 0 ? cryptoTransactionContext.fee_token : cryptoAssetContext3, (i & 32768) != 0 ? cryptoTransactionContext.fee_token_amount_required : d5, (i & 65536) != 0 ? cryptoTransactionContext.token_holdings : tokenHoldingsContext, (i & 131072) != 0 ? cryptoTransactionContext.unknownFields() : byteString);
    }

    public final CryptoTransactionContext copy(CryptoAssetContext selling_currency_id, CryptoAssetContext buying_currency_id, TransactionType transaction_type, String session_id, double amount, double network_fee, double rh_fee, String transaction_hash, Result result, Error error, InputContext input_context, String swap_provider, double amount_available, ApprovalContext approval_context, CryptoAssetContext fee_token, double fee_token_amount_required, TokenHoldingsContext token_holdings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(transaction_type, "transaction_type");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(swap_provider, "swap_provider");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoTransactionContext(selling_currency_id, buying_currency_id, transaction_type, session_id, amount, network_fee, rh_fee, transaction_hash, result, error, input_context, swap_provider, amount_available, approval_context, fee_token, fee_token_amount_required, token_holdings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoTransactionContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoTransactionContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoTransactionContext value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSelling_currency_id() != null) {
                    size += CryptoAssetContext.ADAPTER.encodedSizeWithTag(1, value.getSelling_currency_id());
                }
                if (value.getBuying_currency_id() != null) {
                    size += CryptoAssetContext.ADAPTER.encodedSizeWithTag(2, value.getBuying_currency_id());
                }
                if (value.getTransaction_type() != CryptoTransactionContext.TransactionType.TRANSACTION_TYPE_UNSPECIFIED) {
                    size += CryptoTransactionContext.TransactionType.ADAPTER.encodedSizeWithTag(3, value.getTransaction_type());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSession_id());
                }
                if (!Double.valueOf(value.getAmount()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getAmount()));
                }
                if (!Double.valueOf(value.getNetwork_fee()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getNetwork_fee()));
                }
                if (!Double.valueOf(value.getRh_fee()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getRh_fee()));
                }
                if (!Intrinsics.areEqual(value.getTransaction_hash(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getTransaction_hash());
                }
                if (value.getResult() != CryptoTransactionContext.Result.RESULT_UNSPECIFIED) {
                    size += CryptoTransactionContext.Result.ADAPTER.encodedSizeWithTag(9, value.getResult());
                }
                if (value.getError() != CryptoTransactionContext.Error.ERROR_UNSPECIFIED) {
                    size += CryptoTransactionContext.Error.ADAPTER.encodedSizeWithTag(10, value.getError());
                }
                if (value.getInput_context() != null) {
                    size += CryptoTransactionContext.InputContext.ADAPTER.encodedSizeWithTag(11, value.getInput_context());
                }
                if (!Intrinsics.areEqual(value.getSwap_provider(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getSwap_provider());
                }
                if (!Double.valueOf(value.getAmount_available()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(13, Double.valueOf(value.getAmount_available()));
                }
                if (value.getApproval_context() != null) {
                    size += CryptoTransactionContext.ApprovalContext.ADAPTER.encodedSizeWithTag(14, value.getApproval_context());
                }
                if (value.getFee_token() != null) {
                    size += CryptoAssetContext.ADAPTER.encodedSizeWithTag(15, value.getFee_token());
                }
                if (!Double.valueOf(value.getFee_token_amount_required()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(16, Double.valueOf(value.getFee_token_amount_required()));
                }
                return value.getToken_holdings() != null ? size + CryptoTransactionContext.TokenHoldingsContext.ADAPTER.encodedSizeWithTag(17, value.getToken_holdings()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoTransactionContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSelling_currency_id() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 1, (int) value.getSelling_currency_id());
                }
                if (value.getBuying_currency_id() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 2, (int) value.getBuying_currency_id());
                }
                if (value.getTransaction_type() != CryptoTransactionContext.TransactionType.TRANSACTION_TYPE_UNSPECIFIED) {
                    CryptoTransactionContext.TransactionType.ADAPTER.encodeWithTag(writer, 3, (int) value.getTransaction_type());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSession_id());
                }
                if (!Double.valueOf(value.getAmount()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getAmount()));
                }
                if (!Double.valueOf(value.getNetwork_fee()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getNetwork_fee()));
                }
                if (!Double.valueOf(value.getRh_fee()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getRh_fee()));
                }
                if (!Intrinsics.areEqual(value.getTransaction_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getTransaction_hash());
                }
                if (value.getResult() != CryptoTransactionContext.Result.RESULT_UNSPECIFIED) {
                    CryptoTransactionContext.Result.ADAPTER.encodeWithTag(writer, 9, (int) value.getResult());
                }
                if (value.getError() != CryptoTransactionContext.Error.ERROR_UNSPECIFIED) {
                    CryptoTransactionContext.Error.ADAPTER.encodeWithTag(writer, 10, (int) value.getError());
                }
                if (value.getInput_context() != null) {
                    CryptoTransactionContext.InputContext.ADAPTER.encodeWithTag(writer, 11, (int) value.getInput_context());
                }
                if (!Intrinsics.areEqual(value.getSwap_provider(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSwap_provider());
                }
                if (!Double.valueOf(value.getAmount_available()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, (int) Double.valueOf(value.getAmount_available()));
                }
                if (value.getApproval_context() != null) {
                    CryptoTransactionContext.ApprovalContext.ADAPTER.encodeWithTag(writer, 14, (int) value.getApproval_context());
                }
                if (value.getFee_token() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 15, (int) value.getFee_token());
                }
                if (!Double.valueOf(value.getFee_token_amount_required()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 16, (int) Double.valueOf(value.getFee_token_amount_required()));
                }
                if (value.getToken_holdings() != null) {
                    CryptoTransactionContext.TokenHoldingsContext.ADAPTER.encodeWithTag(writer, 17, (int) value.getToken_holdings());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoTransactionContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getToken_holdings() != null) {
                    CryptoTransactionContext.TokenHoldingsContext.ADAPTER.encodeWithTag(writer, 17, (int) value.getToken_holdings());
                }
                if (!Double.valueOf(value.getFee_token_amount_required()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 16, (int) Double.valueOf(value.getFee_token_amount_required()));
                }
                if (value.getFee_token() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 15, (int) value.getFee_token());
                }
                if (value.getApproval_context() != null) {
                    CryptoTransactionContext.ApprovalContext.ADAPTER.encodeWithTag(writer, 14, (int) value.getApproval_context());
                }
                if (!Double.valueOf(value.getAmount_available()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, (int) Double.valueOf(value.getAmount_available()));
                }
                if (!Intrinsics.areEqual(value.getSwap_provider(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSwap_provider());
                }
                if (value.getInput_context() != null) {
                    CryptoTransactionContext.InputContext.ADAPTER.encodeWithTag(writer, 11, (int) value.getInput_context());
                }
                if (value.getError() != CryptoTransactionContext.Error.ERROR_UNSPECIFIED) {
                    CryptoTransactionContext.Error.ADAPTER.encodeWithTag(writer, 10, (int) value.getError());
                }
                if (value.getResult() != CryptoTransactionContext.Result.RESULT_UNSPECIFIED) {
                    CryptoTransactionContext.Result.ADAPTER.encodeWithTag(writer, 9, (int) value.getResult());
                }
                if (!Intrinsics.areEqual(value.getTransaction_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getTransaction_hash());
                }
                if (!Double.valueOf(value.getRh_fee()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getRh_fee()));
                }
                if (!Double.valueOf(value.getNetwork_fee()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getNetwork_fee()));
                }
                if (!Double.valueOf(value.getAmount()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getAmount()));
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSession_id());
                }
                if (value.getTransaction_type() != CryptoTransactionContext.TransactionType.TRANSACTION_TYPE_UNSPECIFIED) {
                    CryptoTransactionContext.TransactionType.ADAPTER.encodeWithTag(writer, 3, (int) value.getTransaction_type());
                }
                if (value.getBuying_currency_id() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 2, (int) value.getBuying_currency_id());
                }
                if (value.getSelling_currency_id() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 1, (int) value.getSelling_currency_id());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoTransactionContext decode(ProtoReader reader) throws IOException {
                CryptoTransactionContext.Result result;
                CryptoTransactionContext.Error error;
                CryptoAssetContext cryptoAssetContext;
                CryptoTransactionContext.Result result2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                CryptoTransactionContext.TransactionType transactionType = CryptoTransactionContext.TransactionType.TRANSACTION_TYPE_UNSPECIFIED;
                CryptoTransactionContext.Result result3 = CryptoTransactionContext.Result.RESULT_UNSPECIFIED;
                CryptoTransactionContext.Error error2 = CryptoTransactionContext.Error.ERROR_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                CryptoTransactionContext.TransactionType transactionTypeDecode = transactionType;
                CryptoTransactionContext.ApprovalContext approvalContextDecode = null;
                CryptoAssetContext cryptoAssetContextDecode = null;
                CryptoTransactionContext.TokenHoldingsContext tokenHoldingsContextDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                double dDoubleValue5 = 0.0d;
                CryptoTransactionContext.Error errorDecode = error2;
                CryptoAssetContext cryptoAssetContextDecode2 = null;
                CryptoAssetContext cryptoAssetContextDecode3 = null;
                CryptoTransactionContext.InputContext inputContextDecode = null;
                CryptoTransactionContext.Result resultDecode = result3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                cryptoAssetContextDecode2 = CryptoAssetContext.ADAPTER.decode(reader);
                                break;
                            case 2:
                                cryptoAssetContextDecode3 = CryptoAssetContext.ADAPTER.decode(reader);
                                break;
                            case 3:
                                result = resultDecode;
                                error = errorDecode;
                                cryptoAssetContext = cryptoAssetContextDecode2;
                                try {
                                    transactionTypeDecode = CryptoTransactionContext.TransactionType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                resultDecode = result;
                                cryptoAssetContextDecode2 = cryptoAssetContext;
                                errorDecode = error;
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                result2 = resultDecode;
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                resultDecode = result2;
                                break;
                            case 6:
                                result2 = resultDecode;
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                resultDecode = result2;
                                break;
                            case 7:
                                result2 = resultDecode;
                                dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                resultDecode = result2;
                                break;
                            case 8:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                result = resultDecode;
                                error = errorDecode;
                                cryptoAssetContext = cryptoAssetContextDecode2;
                                try {
                                    resultDecode = CryptoTransactionContext.Result.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                cryptoAssetContextDecode2 = cryptoAssetContext;
                                errorDecode = error;
                                break;
                            case 10:
                                try {
                                    errorDecode = CryptoTransactionContext.Error.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    result = resultDecode;
                                    error = errorDecode;
                                    cryptoAssetContext = cryptoAssetContextDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 11:
                                inputContextDecode = CryptoTransactionContext.InputContext.ADAPTER.decode(reader);
                                break;
                            case 12:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 14:
                                approvalContextDecode = CryptoTransactionContext.ApprovalContext.ADAPTER.decode(reader);
                                break;
                            case 15:
                                cryptoAssetContextDecode = CryptoAssetContext.ADAPTER.decode(reader);
                                break;
                            case 16:
                                dDoubleValue5 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 17:
                                tokenHoldingsContextDecode = CryptoTransactionContext.TokenHoldingsContext.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                result = resultDecode;
                                error = errorDecode;
                                cryptoAssetContext = cryptoAssetContextDecode2;
                                resultDecode = result;
                                cryptoAssetContextDecode2 = cryptoAssetContext;
                                errorDecode = error;
                                break;
                        }
                    } else {
                        return new CryptoTransactionContext(cryptoAssetContextDecode2, cryptoAssetContextDecode3, transactionTypeDecode, strDecode, dDoubleValue, dDoubleValue2, dDoubleValue3, strDecode2, resultDecode, errorDecode, inputContextDecode, strDecode3, dDoubleValue4, approvalContextDecode, cryptoAssetContextDecode, dDoubleValue5, tokenHoldingsContextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoTransactionContext redact(CryptoTransactionContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CryptoAssetContext selling_currency_id = value.getSelling_currency_id();
                CryptoAssetContext cryptoAssetContextRedact = selling_currency_id != null ? CryptoAssetContext.ADAPTER.redact(selling_currency_id) : null;
                CryptoAssetContext buying_currency_id = value.getBuying_currency_id();
                CryptoAssetContext cryptoAssetContextRedact2 = buying_currency_id != null ? CryptoAssetContext.ADAPTER.redact(buying_currency_id) : null;
                CryptoTransactionContext.InputContext input_context = value.getInput_context();
                CryptoTransactionContext.InputContext inputContextRedact = input_context != null ? CryptoTransactionContext.InputContext.ADAPTER.redact(input_context) : null;
                CryptoTransactionContext.ApprovalContext approval_context = value.getApproval_context();
                CryptoTransactionContext.ApprovalContext approvalContextRedact = approval_context != null ? CryptoTransactionContext.ApprovalContext.ADAPTER.redact(approval_context) : null;
                CryptoAssetContext fee_token = value.getFee_token();
                CryptoAssetContext cryptoAssetContextRedact3 = fee_token != null ? CryptoAssetContext.ADAPTER.redact(fee_token) : null;
                CryptoTransactionContext.TokenHoldingsContext token_holdings = value.getToken_holdings();
                return CryptoTransactionContext.copy$default(value, cryptoAssetContextRedact, cryptoAssetContextRedact2, null, null, 0.0d, 0.0d, 0.0d, null, null, null, inputContextRedact, null, 0.0d, approvalContextRedact, cryptoAssetContextRedact3, 0.0d, token_holdings != null ? CryptoTransactionContext.TokenHoldingsContext.ADAPTER.redact(token_holdings) : null, ByteString.EMPTY, 39932, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTransactionContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ERROR_UNSPECIFIED", "INSUFFICIENT_BALANCE", "QUOTE_FETCHING", "ORDER_FAILED", "NO_LIQUIDITY", "MINIMUM_TRANSACTION_SIZE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Error[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Error> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Error ERROR_UNSPECIFIED;
        public static final Error INSUFFICIENT_BALANCE;
        public static final Error MINIMUM_TRANSACTION_SIZE;
        public static final Error NO_LIQUIDITY;
        public static final Error ORDER_FAILED;
        public static final Error QUOTE_FETCHING;
        private final int value;

        private static final /* synthetic */ Error[] $values() {
            return new Error[]{ERROR_UNSPECIFIED, INSUFFICIENT_BALANCE, QUOTE_FETCHING, ORDER_FAILED, NO_LIQUIDITY, MINIMUM_TRANSACTION_SIZE};
        }

        @JvmStatic
        public static final Error fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Error> getEntries() {
            return $ENTRIES;
        }

        private Error(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Error error = new Error("ERROR_UNSPECIFIED", 0, 0);
            ERROR_UNSPECIFIED = error;
            INSUFFICIENT_BALANCE = new Error("INSUFFICIENT_BALANCE", 1, 1);
            QUOTE_FETCHING = new Error("QUOTE_FETCHING", 2, 2);
            ORDER_FAILED = new Error("ORDER_FAILED", 3, 3);
            NO_LIQUIDITY = new Error("NO_LIQUIDITY", 4, 4);
            MINIMUM_TRANSACTION_SIZE = new Error("MINIMUM_TRANSACTION_SIZE", 5, 5);
            Error[] errorArr$values = $values();
            $VALUES = errorArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Error.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Error>(orCreateKotlinClass, syntax, error) { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContext$Error$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CryptoTransactionContext.Error fromValue(int value) {
                    return CryptoTransactionContext.Error.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CryptoTransactionContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Error fromValue(int value) {
                if (value == 0) {
                    return Error.ERROR_UNSPECIFIED;
                }
                if (value == 1) {
                    return Error.INSUFFICIENT_BALANCE;
                }
                if (value == 2) {
                    return Error.QUOTE_FETCHING;
                }
                if (value == 3) {
                    return Error.ORDER_FAILED;
                }
                if (value == 4) {
                    return Error.NO_LIQUIDITY;
                }
                if (value != 5) {
                    return null;
                }
                return Error.MINIMUM_TRANSACTION_SIZE;
            }
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTransactionContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Result;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RESULT_UNSPECIFIED", "SUCCESS", "CANCELED_BY_USER", "ERROR", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Result implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Result> ADAPTER;
        public static final Result CANCELED_BY_USER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Result ERROR;
        public static final Result RESULT_UNSPECIFIED;
        public static final Result SUCCESS;
        private final int value;

        private static final /* synthetic */ Result[] $values() {
            return new Result[]{RESULT_UNSPECIFIED, SUCCESS, CANCELED_BY_USER, ERROR};
        }

        @JvmStatic
        public static final Result fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Result> getEntries() {
            return $ENTRIES;
        }

        private Result(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Result result = new Result("RESULT_UNSPECIFIED", 0, 0);
            RESULT_UNSPECIFIED = result;
            SUCCESS = new Result("SUCCESS", 1, 1);
            CANCELED_BY_USER = new Result("CANCELED_BY_USER", 2, 2);
            ERROR = new Result("ERROR", 3, 3);
            Result[] resultArr$values = $values();
            $VALUES = resultArr$values;
            $ENTRIES = EnumEntries2.enumEntries(resultArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Result.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Result>(orCreateKotlinClass, syntax, result) { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContext$Result$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CryptoTransactionContext.Result fromValue(int value) {
                    return CryptoTransactionContext.Result.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CryptoTransactionContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Result$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Result;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Result fromValue(int value) {
                if (value == 0) {
                    return Result.RESULT_UNSPECIFIED;
                }
                if (value == 1) {
                    return Result.SUCCESS;
                }
                if (value == 2) {
                    return Result.CANCELED_BY_USER;
                }
                if (value != 3) {
                    return null;
                }
                return Result.ERROR;
            }
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTransactionContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSACTION_TYPE_UNSPECIFIED", "BUY", "SELL", "GAS_SWAP", "GASLESS_SWAP", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransactionType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransactionType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<TransactionType> ADAPTER;

        @Deprecated
        public static final TransactionType BUY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TransactionType GASLESS_SWAP;
        public static final TransactionType GAS_SWAP;

        @Deprecated
        public static final TransactionType SELL;
        public static final TransactionType TRANSACTION_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ TransactionType[] $values() {
            return new TransactionType[]{TRANSACTION_TYPE_UNSPECIFIED, BUY, SELL, GAS_SWAP, GASLESS_SWAP};
        }

        @JvmStatic
        public static final TransactionType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TransactionType> getEntries() {
            return $ENTRIES;
        }

        private TransactionType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TransactionType transactionType = new TransactionType("TRANSACTION_TYPE_UNSPECIFIED", 0, 0);
            TRANSACTION_TYPE_UNSPECIFIED = transactionType;
            BUY = new TransactionType("BUY", 1, 1);
            SELL = new TransactionType("SELL", 2, 2);
            GAS_SWAP = new TransactionType("GAS_SWAP", 3, 3);
            GASLESS_SWAP = new TransactionType("GASLESS_SWAP", 4, 4);
            TransactionType[] transactionTypeArr$values = $values();
            $VALUES = transactionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transactionTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransactionType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TransactionType>(orCreateKotlinClass, syntax, transactionType) { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContext$TransactionType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CryptoTransactionContext.TransactionType fromValue(int value) {
                    return CryptoTransactionContext.TransactionType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CryptoTransactionContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TransactionType fromValue(int value) {
                if (value == 0) {
                    return TransactionType.TRANSACTION_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return TransactionType.BUY;
                }
                if (value == 2) {
                    return TransactionType.SELL;
                }
                if (value == 3) {
                    return TransactionType.GAS_SWAP;
                }
                if (value != 4) {
                    return null;
                }
                return TransactionType.GASLESS_SWAP;
            }
        }

        public static TransactionType valueOf(String str) {
            return (TransactionType) Enum.valueOf(TransactionType.class, str);
        }

        public static TransactionType[] values() {
            return (TransactionType[]) $VALUES.clone();
        }
    }

    /* compiled from: CryptoTransactionContext.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext;", "Lcom/squareup/wire/Message;", "", "input_style", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext$InputStyle;", "anchor_token", "", "custom_token_selected", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext$InputStyle;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getInput_style", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext$InputStyle;", "getAnchor_token", "()Ljava/lang/String;", "getCustom_token_selected", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "InputStyle", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InputContext extends Message {

        @JvmField
        public static final ProtoAdapter<InputContext> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "anchorToken", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String anchor_token;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "customTokenSelected", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String custom_token_selected;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTransactionContext$InputContext$InputStyle#ADAPTER", jsonName = "inputStyle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final InputStyle input_style;

        public InputContext() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24169newBuilder();
        }

        public final InputStyle getInput_style() {
            return this.input_style;
        }

        public /* synthetic */ InputContext(InputStyle inputStyle, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? InputStyle.INPUTSTYLE_UNSPECIFIED : inputStyle, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getAnchor_token() {
            return this.anchor_token;
        }

        public final String getCustom_token_selected() {
            return this.custom_token_selected;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputContext(InputStyle input_style, String anchor_token, String custom_token_selected, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(input_style, "input_style");
            Intrinsics.checkNotNullParameter(anchor_token, "anchor_token");
            Intrinsics.checkNotNullParameter(custom_token_selected, "custom_token_selected");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.input_style = input_style;
            this.anchor_token = anchor_token;
            this.custom_token_selected = custom_token_selected;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24169newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InputContext)) {
                return false;
            }
            InputContext inputContext = (InputContext) other;
            return Intrinsics.areEqual(unknownFields(), inputContext.unknownFields()) && this.input_style == inputContext.input_style && Intrinsics.areEqual(this.anchor_token, inputContext.anchor_token) && Intrinsics.areEqual(this.custom_token_selected, inputContext.custom_token_selected);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.input_style.hashCode()) * 37) + this.anchor_token.hashCode()) * 37) + this.custom_token_selected.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("input_style=" + this.input_style);
            arrayList.add("anchor_token=" + Internal.sanitize(this.anchor_token));
            arrayList.add("custom_token_selected=" + Internal.sanitize(this.custom_token_selected));
            return CollectionsKt.joinToString$default(arrayList, ", ", "InputContext{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ InputContext copy$default(InputContext inputContext, InputStyle inputStyle, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                inputStyle = inputContext.input_style;
            }
            if ((i & 2) != 0) {
                str = inputContext.anchor_token;
            }
            if ((i & 4) != 0) {
                str2 = inputContext.custom_token_selected;
            }
            if ((i & 8) != 0) {
                byteString = inputContext.unknownFields();
            }
            return inputContext.copy(inputStyle, str, str2, byteString);
        }

        public final InputContext copy(InputStyle input_style, String anchor_token, String custom_token_selected, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(input_style, "input_style");
            Intrinsics.checkNotNullParameter(anchor_token, "anchor_token");
            Intrinsics.checkNotNullParameter(custom_token_selected, "custom_token_selected");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new InputContext(input_style, anchor_token, custom_token_selected, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputContext.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<InputContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContext$InputContext$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CryptoTransactionContext.InputContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getInput_style() != CryptoTransactionContext.InputContext.InputStyle.INPUTSTYLE_UNSPECIFIED) {
                        size += CryptoTransactionContext.InputContext.InputStyle.ADAPTER.encodedSizeWithTag(1, value.getInput_style());
                    }
                    if (!Intrinsics.areEqual(value.getAnchor_token(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAnchor_token());
                    }
                    return !Intrinsics.areEqual(value.getCustom_token_selected(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCustom_token_selected()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CryptoTransactionContext.InputContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getInput_style() != CryptoTransactionContext.InputContext.InputStyle.INPUTSTYLE_UNSPECIFIED) {
                        CryptoTransactionContext.InputContext.InputStyle.ADAPTER.encodeWithTag(writer, 1, (int) value.getInput_style());
                    }
                    if (!Intrinsics.areEqual(value.getAnchor_token(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAnchor_token());
                    }
                    if (!Intrinsics.areEqual(value.getCustom_token_selected(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCustom_token_selected());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CryptoTransactionContext.InputContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getCustom_token_selected(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCustom_token_selected());
                    }
                    if (!Intrinsics.areEqual(value.getAnchor_token(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAnchor_token());
                    }
                    if (value.getInput_style() != CryptoTransactionContext.InputContext.InputStyle.INPUTSTYLE_UNSPECIFIED) {
                        CryptoTransactionContext.InputContext.InputStyle.ADAPTER.encodeWithTag(writer, 1, (int) value.getInput_style());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public CryptoTransactionContext.InputContext decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    CryptoTransactionContext.InputContext.InputStyle inputStyleDecode = CryptoTransactionContext.InputContext.InputStyle.INPUTSTYLE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CryptoTransactionContext.InputContext(inputStyleDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                inputStyleDecode = CryptoTransactionContext.InputContext.InputStyle.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CryptoTransactionContext.InputContext redact(CryptoTransactionContext.InputContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return CryptoTransactionContext.InputContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CryptoTransactionContext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext$InputStyle;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INPUTSTYLE_UNSPECIFIED", "USD", "TOKEN", "CUSTOM", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class InputStyle implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ InputStyle[] $VALUES;

            @JvmField
            public static final ProtoAdapter<InputStyle> ADAPTER;
            public static final InputStyle CUSTOM;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final InputStyle INPUTSTYLE_UNSPECIFIED;
            public static final InputStyle TOKEN;
            public static final InputStyle USD;
            private final int value;

            private static final /* synthetic */ InputStyle[] $values() {
                return new InputStyle[]{INPUTSTYLE_UNSPECIFIED, USD, TOKEN, CUSTOM};
            }

            @JvmStatic
            public static final InputStyle fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<InputStyle> getEntries() {
                return $ENTRIES;
            }

            private InputStyle(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final InputStyle inputStyle = new InputStyle("INPUTSTYLE_UNSPECIFIED", 0, 0);
                INPUTSTYLE_UNSPECIFIED = inputStyle;
                USD = new InputStyle("USD", 1, 1);
                TOKEN = new InputStyle("TOKEN", 2, 2);
                CUSTOM = new InputStyle("CUSTOM", 3, 3);
                InputStyle[] inputStyleArr$values = $values();
                $VALUES = inputStyleArr$values;
                $ENTRIES = EnumEntries2.enumEntries(inputStyleArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputStyle.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<InputStyle>(orCreateKotlinClass, syntax, inputStyle) { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContext$InputContext$InputStyle$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public CryptoTransactionContext.InputContext.InputStyle fromValue(int value) {
                        return CryptoTransactionContext.InputContext.InputStyle.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: CryptoTransactionContext.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext$InputStyle$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext$InputStyle;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final InputStyle fromValue(int value) {
                    if (value == 0) {
                        return InputStyle.INPUTSTYLE_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return InputStyle.USD;
                    }
                    if (value == 2) {
                        return InputStyle.TOKEN;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return InputStyle.CUSTOM;
                }
            }

            public static InputStyle valueOf(String str) {
                return (InputStyle) Enum.valueOf(InputStyle.class, str);
            }

            public static InputStyle[] values() {
                return (InputStyle[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: CryptoTransactionContext.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext;", "Lcom/squareup/wire/Message;", "", "status", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status;Lokio/ByteString;)V", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Status", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ApprovalContext extends Message {

        @JvmField
        public static final ProtoAdapter<ApprovalContext> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTransactionContext$ApprovalContext$Status#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Status status;

        /* JADX WARN: Multi-variable type inference failed */
        public ApprovalContext() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24167newBuilder();
        }

        public final Status getStatus() {
            return this.status;
        }

        public /* synthetic */ ApprovalContext(Status status, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Status.STATUS_UNSPECIFIED : status, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApprovalContext(Status status, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.status = status;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24167newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ApprovalContext)) {
                return false;
            }
            ApprovalContext approvalContext = (ApprovalContext) other;
            return Intrinsics.areEqual(unknownFields(), approvalContext.unknownFields()) && this.status == approvalContext.status;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.status.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("status=" + this.status);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ApprovalContext{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ApprovalContext copy$default(ApprovalContext approvalContext, Status status, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                status = approvalContext.status;
            }
            if ((i & 2) != 0) {
                byteString = approvalContext.unknownFields();
            }
            return approvalContext.copy(status, byteString);
        }

        public final ApprovalContext copy(Status status, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ApprovalContext(status, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ApprovalContext.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ApprovalContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContext$ApprovalContext$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CryptoTransactionContext.ApprovalContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getStatus() != CryptoTransactionContext.ApprovalContext.Status.STATUS_UNSPECIFIED ? size + CryptoTransactionContext.ApprovalContext.Status.ADAPTER.encodedSizeWithTag(1, value.getStatus()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CryptoTransactionContext.ApprovalContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getStatus() != CryptoTransactionContext.ApprovalContext.Status.STATUS_UNSPECIFIED) {
                        CryptoTransactionContext.ApprovalContext.Status.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CryptoTransactionContext.ApprovalContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getStatus() != CryptoTransactionContext.ApprovalContext.Status.STATUS_UNSPECIFIED) {
                        CryptoTransactionContext.ApprovalContext.Status.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public CryptoTransactionContext.ApprovalContext decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    CryptoTransactionContext.ApprovalContext.Status statusDecode = CryptoTransactionContext.ApprovalContext.Status.STATUS_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CryptoTransactionContext.ApprovalContext(statusDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                statusDecode = CryptoTransactionContext.ApprovalContext.Status.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CryptoTransactionContext.ApprovalContext redact(CryptoTransactionContext.ApprovalContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return CryptoTransactionContext.ApprovalContext.copy$default(value, null, ByteString.EMPTY, 1, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CryptoTransactionContext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATUS_UNSPECIFIED", "BLOCKING_SWAP", "BATCHING_WITH_SWAP", "NOT_REQUIRED_FOR_SWAP", "COMPLETED_THIS_SESSION", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Status implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Status> ADAPTER;
            public static final Status BATCHING_WITH_SWAP;
            public static final Status BLOCKING_SWAP;
            public static final Status COMPLETED_THIS_SESSION;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Status NOT_REQUIRED_FOR_SWAP;
            public static final Status STATUS_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{STATUS_UNSPECIFIED, BLOCKING_SWAP, BATCHING_WITH_SWAP, NOT_REQUIRED_FOR_SWAP, COMPLETED_THIS_SESSION};
            }

            @JvmStatic
            public static final Status fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Status status = new Status("STATUS_UNSPECIFIED", 0, 0);
                STATUS_UNSPECIFIED = status;
                BLOCKING_SWAP = new Status("BLOCKING_SWAP", 1, 1);
                BATCHING_WITH_SWAP = new Status("BATCHING_WITH_SWAP", 2, 2);
                NOT_REQUIRED_FOR_SWAP = new Status("NOT_REQUIRED_FOR_SWAP", 3, 3);
                COMPLETED_THIS_SESSION = new Status("COMPLETED_THIS_SESSION", 4, 4);
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Status.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Status>(orCreateKotlinClass, syntax, status) { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContext$ApprovalContext$Status$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public CryptoTransactionContext.ApprovalContext.Status fromValue(int value) {
                        return CryptoTransactionContext.ApprovalContext.Status.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: CryptoTransactionContext.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Status fromValue(int value) {
                    if (value == 0) {
                        return Status.STATUS_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Status.BLOCKING_SWAP;
                    }
                    if (value == 2) {
                        return Status.BATCHING_WITH_SWAP;
                    }
                    if (value == 3) {
                        return Status.NOT_REQUIRED_FOR_SWAP;
                    }
                    if (value != 4) {
                        return null;
                    }
                    return Status.COMPLETED_THIS_SESSION;
                }
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: CryptoTransactionContext.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J0\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Holding;", "Lcom/squareup/wire/Message;", "", "token", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "usd_value", "", "token_value", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;DDLokio/ByteString;)V", "getToken", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "getUsd_value", "()D", "getToken_value", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Holding extends Message {

        @JvmField
        public static final ProtoAdapter<Holding> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoAssetContext#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final CryptoAssetContext token;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "tokenValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final double token_value;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "usdValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final double usd_value;

        public Holding() {
            this(null, 0.0d, 0.0d, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24168newBuilder();
        }

        public final CryptoAssetContext getToken() {
            return this.token;
        }

        public final double getUsd_value() {
            return this.usd_value;
        }

        public final double getToken_value() {
            return this.token_value;
        }

        public /* synthetic */ Holding(CryptoAssetContext cryptoAssetContext, double d, double d2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cryptoAssetContext, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holding(CryptoAssetContext cryptoAssetContext, double d, double d2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.token = cryptoAssetContext;
            this.usd_value = d;
            this.token_value = d2;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24168newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Holding)) {
                return false;
            }
            Holding holding = (Holding) other;
            return Intrinsics.areEqual(unknownFields(), holding.unknownFields()) && Intrinsics.areEqual(this.token, holding.token) && this.usd_value == holding.usd_value && this.token_value == holding.token_value;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            CryptoAssetContext cryptoAssetContext = this.token;
            int iHashCode2 = ((((iHashCode + (cryptoAssetContext != null ? cryptoAssetContext.hashCode() : 0)) * 37) + Double.hashCode(this.usd_value)) * 37) + Double.hashCode(this.token_value);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            CryptoAssetContext cryptoAssetContext = this.token;
            if (cryptoAssetContext != null) {
                arrayList.add("token=" + cryptoAssetContext);
            }
            arrayList.add("usd_value=" + this.usd_value);
            arrayList.add("token_value=" + this.token_value);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Holding{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Holding copy$default(Holding holding, CryptoAssetContext cryptoAssetContext, double d, double d2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoAssetContext = holding.token;
            }
            if ((i & 2) != 0) {
                d = holding.usd_value;
            }
            if ((i & 4) != 0) {
                d2 = holding.token_value;
            }
            if ((i & 8) != 0) {
                byteString = holding.unknownFields();
            }
            ByteString byteString2 = byteString;
            return holding.copy(cryptoAssetContext, d, d2, byteString2);
        }

        public final Holding copy(CryptoAssetContext token, double usd_value, double token_value, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Holding(token, usd_value, token_value, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Holding.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Holding>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContext$Holding$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public CryptoTransactionContext.Holding decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    CryptoAssetContext cryptoAssetContextDecode = null;
                    double dDoubleValue = 0.0d;
                    double dDoubleValue2 = 0.0d;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CryptoTransactionContext.Holding(cryptoAssetContextDecode, dDoubleValue, dDoubleValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            cryptoAssetContextDecode = CryptoAssetContext.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 3) {
                            dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CryptoTransactionContext.Holding value) {
                    Double dValueOf = Double.valueOf(0.0d);
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getToken() != null) {
                        size += CryptoAssetContext.ADAPTER.encodedSizeWithTag(1, value.getToken());
                    }
                    if (!Double.valueOf(value.getUsd_value()).equals(dValueOf)) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getUsd_value()));
                    }
                    return !Double.valueOf(value.getToken_value()).equals(dValueOf) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getToken_value())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CryptoTransactionContext.Holding value) throws IOException {
                    Double dValueOf = Double.valueOf(0.0d);
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getToken() != null) {
                        CryptoAssetContext.ADAPTER.encodeWithTag(writer, 1, (int) value.getToken());
                    }
                    if (!Double.valueOf(value.getUsd_value()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getUsd_value()));
                    }
                    if (!Double.valueOf(value.getToken_value()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getToken_value()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CryptoTransactionContext.Holding value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    Double dValueOf = Double.valueOf(value.getToken_value());
                    Double dValueOf2 = Double.valueOf(0.0d);
                    if (!dValueOf.equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getToken_value()));
                    }
                    if (!Double.valueOf(value.getUsd_value()).equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getUsd_value()));
                    }
                    if (value.getToken() != null) {
                        CryptoAssetContext.ADAPTER.encodeWithTag(writer, 1, (int) value.getToken());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CryptoTransactionContext.Holding redact(CryptoTransactionContext.Holding value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    CryptoAssetContext token = value.getToken();
                    return CryptoTransactionContext.Holding.copy$default(value, token != null ? CryptoAssetContext.ADAPTER.redact(token) : null, 0.0d, 0.0d, ByteString.EMPTY, 6, null);
                }
            };
        }
    }

    /* compiled from: CryptoTransactionContext.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J4\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TokenHoldingsContext;", "Lcom/squareup/wire/Message;", "", "sellTokenHolding", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Holding;", "feeTokenHolding", "buyTokenHolding", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Holding;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Holding;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Holding;Lokio/ByteString;)V", "getSellTokenHolding", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Holding;", "getFeeTokenHolding", "getBuyTokenHolding", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TokenHoldingsContext extends Message {

        @JvmField
        public static final ProtoAdapter<TokenHoldingsContext> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTransactionContext$Holding#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final Holding buyTokenHolding;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTransactionContext$Holding#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Holding feeTokenHolding;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTransactionContext$Holding#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Holding sellTokenHolding;

        public TokenHoldingsContext() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24170newBuilder();
        }

        public final Holding getSellTokenHolding() {
            return this.sellTokenHolding;
        }

        public final Holding getFeeTokenHolding() {
            return this.feeTokenHolding;
        }

        public final Holding getBuyTokenHolding() {
            return this.buyTokenHolding;
        }

        public /* synthetic */ TokenHoldingsContext(Holding holding, Holding holding2, Holding holding3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : holding, (i & 2) != 0 ? null : holding2, (i & 4) != 0 ? null : holding3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenHoldingsContext(Holding holding, Holding holding2, Holding holding3, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.sellTokenHolding = holding;
            this.feeTokenHolding = holding2;
            this.buyTokenHolding = holding3;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24170newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TokenHoldingsContext)) {
                return false;
            }
            TokenHoldingsContext tokenHoldingsContext = (TokenHoldingsContext) other;
            return Intrinsics.areEqual(unknownFields(), tokenHoldingsContext.unknownFields()) && Intrinsics.areEqual(this.sellTokenHolding, tokenHoldingsContext.sellTokenHolding) && Intrinsics.areEqual(this.feeTokenHolding, tokenHoldingsContext.feeTokenHolding) && Intrinsics.areEqual(this.buyTokenHolding, tokenHoldingsContext.buyTokenHolding);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Holding holding = this.sellTokenHolding;
            int iHashCode2 = (iHashCode + (holding != null ? holding.hashCode() : 0)) * 37;
            Holding holding2 = this.feeTokenHolding;
            int iHashCode3 = (iHashCode2 + (holding2 != null ? holding2.hashCode() : 0)) * 37;
            Holding holding3 = this.buyTokenHolding;
            int iHashCode4 = iHashCode3 + (holding3 != null ? holding3.hashCode() : 0);
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Holding holding = this.sellTokenHolding;
            if (holding != null) {
                arrayList.add("sellTokenHolding=" + holding);
            }
            Holding holding2 = this.feeTokenHolding;
            if (holding2 != null) {
                arrayList.add("feeTokenHolding=" + holding2);
            }
            Holding holding3 = this.buyTokenHolding;
            if (holding3 != null) {
                arrayList.add("buyTokenHolding=" + holding3);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TokenHoldingsContext{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ TokenHoldingsContext copy$default(TokenHoldingsContext tokenHoldingsContext, Holding holding, Holding holding2, Holding holding3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                holding = tokenHoldingsContext.sellTokenHolding;
            }
            if ((i & 2) != 0) {
                holding2 = tokenHoldingsContext.feeTokenHolding;
            }
            if ((i & 4) != 0) {
                holding3 = tokenHoldingsContext.buyTokenHolding;
            }
            if ((i & 8) != 0) {
                byteString = tokenHoldingsContext.unknownFields();
            }
            return tokenHoldingsContext.copy(holding, holding2, holding3, byteString);
        }

        public final TokenHoldingsContext copy(Holding sellTokenHolding, Holding feeTokenHolding, Holding buyTokenHolding, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TokenHoldingsContext(sellTokenHolding, feeTokenHolding, buyTokenHolding, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenHoldingsContext.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TokenHoldingsContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContext$TokenHoldingsContext$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public CryptoTransactionContext.TokenHoldingsContext decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    CryptoTransactionContext.Holding holdingDecode = null;
                    CryptoTransactionContext.Holding holdingDecode2 = null;
                    CryptoTransactionContext.Holding holdingDecode3 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CryptoTransactionContext.TokenHoldingsContext(holdingDecode, holdingDecode2, holdingDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            holdingDecode = CryptoTransactionContext.Holding.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            holdingDecode2 = CryptoTransactionContext.Holding.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            holdingDecode3 = CryptoTransactionContext.Holding.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CryptoTransactionContext.TokenHoldingsContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getSellTokenHolding() != null) {
                        size += CryptoTransactionContext.Holding.ADAPTER.encodedSizeWithTag(1, value.getSellTokenHolding());
                    }
                    if (value.getFeeTokenHolding() != null) {
                        size += CryptoTransactionContext.Holding.ADAPTER.encodedSizeWithTag(2, value.getFeeTokenHolding());
                    }
                    return value.getBuyTokenHolding() != null ? size + CryptoTransactionContext.Holding.ADAPTER.encodedSizeWithTag(3, value.getBuyTokenHolding()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CryptoTransactionContext.TokenHoldingsContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getSellTokenHolding() != null) {
                        CryptoTransactionContext.Holding.ADAPTER.encodeWithTag(writer, 1, (int) value.getSellTokenHolding());
                    }
                    if (value.getFeeTokenHolding() != null) {
                        CryptoTransactionContext.Holding.ADAPTER.encodeWithTag(writer, 2, (int) value.getFeeTokenHolding());
                    }
                    if (value.getBuyTokenHolding() != null) {
                        CryptoTransactionContext.Holding.ADAPTER.encodeWithTag(writer, 3, (int) value.getBuyTokenHolding());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CryptoTransactionContext.TokenHoldingsContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getBuyTokenHolding() != null) {
                        CryptoTransactionContext.Holding.ADAPTER.encodeWithTag(writer, 3, (int) value.getBuyTokenHolding());
                    }
                    if (value.getFeeTokenHolding() != null) {
                        CryptoTransactionContext.Holding.ADAPTER.encodeWithTag(writer, 2, (int) value.getFeeTokenHolding());
                    }
                    if (value.getSellTokenHolding() != null) {
                        CryptoTransactionContext.Holding.ADAPTER.encodeWithTag(writer, 1, (int) value.getSellTokenHolding());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CryptoTransactionContext.TokenHoldingsContext redact(CryptoTransactionContext.TokenHoldingsContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    CryptoTransactionContext.Holding sellTokenHolding = value.getSellTokenHolding();
                    CryptoTransactionContext.Holding holdingRedact = sellTokenHolding != null ? CryptoTransactionContext.Holding.ADAPTER.redact(sellTokenHolding) : null;
                    CryptoTransactionContext.Holding feeTokenHolding = value.getFeeTokenHolding();
                    CryptoTransactionContext.Holding holdingRedact2 = feeTokenHolding != null ? CryptoTransactionContext.Holding.ADAPTER.redact(feeTokenHolding) : null;
                    CryptoTransactionContext.Holding buyTokenHolding = value.getBuyTokenHolding();
                    return value.copy(holdingRedact, holdingRedact2, buyTokenHolding != null ? CryptoTransactionContext.Holding.ADAPTER.redact(buyTokenHolding) : null, ByteString.EMPTY);
                }
            };
        }
    }
}
