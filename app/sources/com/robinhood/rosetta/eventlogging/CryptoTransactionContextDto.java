package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.CryptoAssetContextDto;
import com.robinhood.rosetta.eventlogging.CryptoTransactionContext;
import com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CryptoTransactionContextDto.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000bLMNOPQRSTUVB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B¿\u0001\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0010\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u0006\u0010\"J¼\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!J\b\u0010>\u001a\u00020\u0002H\u0016J\b\u0010?\u001a\u00020\u000eH\u0016J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0096\u0002J\b\u0010D\u001a\u00020EH\u0016J\u0018\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020EH\u0016J\b\u0010K\u001a\u00020EH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b,\u0010+R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u0010\u0013\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b.\u0010)R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u001a\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b5\u0010)R\u0011\u0010\u001b\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b6\u0010+R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b9\u0010$R\u0011\u0010\u001f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b:\u0010+R\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006W"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$Surrogate;)V", "selling_currency_id", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "buying_currency_id", "transaction_type", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "session_id", "", "amount", "", "network_fee", "rh_fee", "transaction_hash", "result", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;", "error", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "input_context", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto;", "swap_provider", "amount_available", "approval_context", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto;", "fee_token", "fee_token_amount_required", "token_holdings", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto;", "(Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;Ljava/lang/String;DDDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto;Ljava/lang/String;DLcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;DLcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto;)V", "getSelling_currency_id", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "getBuying_currency_id", "getTransaction_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "getSession_id", "()Ljava/lang/String;", "getAmount", "()D", "getNetwork_fee", "getRh_fee", "getTransaction_hash", "getResult", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;", "getError", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "getInput_context", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto;", "getSwap_provider", "getAmount_available", "getApproval_context", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto;", "getFee_token", "getFee_token_amount_required", "getToken_holdings", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ErrorDto", "ResultDto", "TransactionTypeDto", "InputContextDto", "ApprovalContextDto", "HoldingDto", "TokenHoldingsContextDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CryptoTransactionContextDto implements Dto3<CryptoTransactionContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoTransactionContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoTransactionContextDto, CryptoTransactionContext>> binaryBase64Serializer$delegate;
    private static final CryptoTransactionContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoTransactionContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoTransactionContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CryptoAssetContextDto getSelling_currency_id() {
        return this.surrogate.getSelling_currency_id();
    }

    public final CryptoAssetContextDto getBuying_currency_id() {
        return this.surrogate.getBuying_currency_id();
    }

    public final TransactionTypeDto getTransaction_type() {
        return this.surrogate.getTransaction_type();
    }

    public final String getSession_id() {
        return this.surrogate.getSession_id();
    }

    public final double getAmount() {
        return this.surrogate.getAmount();
    }

    public final double getNetwork_fee() {
        return this.surrogate.getNetwork_fee();
    }

    public final double getRh_fee() {
        return this.surrogate.getRh_fee();
    }

    public final String getTransaction_hash() {
        return this.surrogate.getTransaction_hash();
    }

    public final ResultDto getResult() {
        return this.surrogate.getResult();
    }

    public final ErrorDto getError() {
        return this.surrogate.getError();
    }

    public final InputContextDto getInput_context() {
        return this.surrogate.getInput_context();
    }

    public final String getSwap_provider() {
        return this.surrogate.getSwap_provider();
    }

    public final double getAmount_available() {
        return this.surrogate.getAmount_available();
    }

    public final ApprovalContextDto getApproval_context() {
        return this.surrogate.getApproval_context();
    }

    public final CryptoAssetContextDto getFee_token() {
        return this.surrogate.getFee_token();
    }

    public final double getFee_token_amount_required() {
        return this.surrogate.getFee_token_amount_required();
    }

    public final TokenHoldingsContextDto getToken_holdings() {
        return this.surrogate.getToken_holdings();
    }

    public /* synthetic */ CryptoTransactionContextDto(CryptoAssetContextDto cryptoAssetContextDto, CryptoAssetContextDto cryptoAssetContextDto2, TransactionTypeDto transactionTypeDto, String str, double d, double d2, double d3, String str2, ResultDto resultDto, ErrorDto errorDto, InputContextDto inputContextDto, String str3, double d4, ApprovalContextDto approvalContextDto, CryptoAssetContextDto cryptoAssetContextDto3, double d5, TokenHoldingsContextDto tokenHoldingsContextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoAssetContextDto, (i & 2) != 0 ? null : cryptoAssetContextDto2, (i & 4) != 0 ? TransactionTypeDto.INSTANCE.getZeroValue() : transactionTypeDto, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? 0.0d : d2, (i & 64) != 0 ? 0.0d : d3, (i & 128) != 0 ? "" : str2, (i & 256) != 0 ? ResultDto.INSTANCE.getZeroValue() : resultDto, (i & 512) != 0 ? ErrorDto.INSTANCE.getZeroValue() : errorDto, (i & 1024) != 0 ? null : inputContextDto, (i & 2048) == 0 ? str3 : "", (i & 4096) != 0 ? 0.0d : d4, (i & 8192) != 0 ? null : approvalContextDto, (i & 16384) != 0 ? null : cryptoAssetContextDto3, (i & 32768) != 0 ? 0.0d : d5, (i & 65536) != 0 ? null : tokenHoldingsContextDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoTransactionContextDto(CryptoAssetContextDto cryptoAssetContextDto, CryptoAssetContextDto cryptoAssetContextDto2, TransactionTypeDto transaction_type, String session_id, double d, double d2, double d3, String transaction_hash, ResultDto result, ErrorDto error, InputContextDto inputContextDto, String swap_provider, double d4, ApprovalContextDto approvalContextDto, CryptoAssetContextDto cryptoAssetContextDto3, double d5, TokenHoldingsContextDto tokenHoldingsContextDto) {
        this(new Surrogate(cryptoAssetContextDto, cryptoAssetContextDto2, transaction_type, session_id, d, d2, d3, transaction_hash, result, error, inputContextDto, swap_provider, d4, approvalContextDto, cryptoAssetContextDto3, d5, tokenHoldingsContextDto));
        Intrinsics.checkNotNullParameter(transaction_type, "transaction_type");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(swap_provider, "swap_provider");
    }

    public final CryptoTransactionContextDto copy(CryptoAssetContextDto selling_currency_id, CryptoAssetContextDto buying_currency_id, TransactionTypeDto transaction_type, String session_id, double amount, double network_fee, double rh_fee, String transaction_hash, ResultDto result, ErrorDto error, InputContextDto input_context, String swap_provider, double amount_available, ApprovalContextDto approval_context, CryptoAssetContextDto fee_token, double fee_token_amount_required, TokenHoldingsContextDto token_holdings) {
        Intrinsics.checkNotNullParameter(transaction_type, "transaction_type");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(swap_provider, "swap_provider");
        return new CryptoTransactionContextDto(new Surrogate(selling_currency_id, buying_currency_id, transaction_type, session_id, amount, network_fee, rh_fee, transaction_hash, result, error, input_context, swap_provider, amount_available, approval_context, fee_token, fee_token_amount_required, token_holdings));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CryptoTransactionContext toProto() {
        CryptoAssetContextDto selling_currency_id = this.surrogate.getSelling_currency_id();
        CryptoAssetContext proto = selling_currency_id != null ? selling_currency_id.toProto() : null;
        CryptoAssetContextDto buying_currency_id = this.surrogate.getBuying_currency_id();
        CryptoAssetContext proto2 = buying_currency_id != null ? buying_currency_id.toProto() : null;
        CryptoTransactionContext.TransactionType transactionType = (CryptoTransactionContext.TransactionType) this.surrogate.getTransaction_type().toProto();
        String session_id = this.surrogate.getSession_id();
        double amount = this.surrogate.getAmount();
        double network_fee = this.surrogate.getNetwork_fee();
        double rh_fee = this.surrogate.getRh_fee();
        String transaction_hash = this.surrogate.getTransaction_hash();
        CryptoTransactionContext.Result result = (CryptoTransactionContext.Result) this.surrogate.getResult().toProto();
        CryptoTransactionContext.Error error = (CryptoTransactionContext.Error) this.surrogate.getError().toProto();
        InputContextDto input_context = this.surrogate.getInput_context();
        CryptoTransactionContext.InputContext proto3 = input_context != null ? input_context.toProto() : null;
        String swap_provider = this.surrogate.getSwap_provider();
        double amount_available = this.surrogate.getAmount_available();
        ApprovalContextDto approval_context = this.surrogate.getApproval_context();
        CryptoTransactionContext.ApprovalContext proto4 = approval_context != null ? approval_context.toProto() : null;
        CryptoAssetContextDto fee_token = this.surrogate.getFee_token();
        CryptoAssetContext proto5 = fee_token != null ? fee_token.toProto() : null;
        double fee_token_amount_required = this.surrogate.getFee_token_amount_required();
        TokenHoldingsContextDto token_holdings = this.surrogate.getToken_holdings();
        return new CryptoTransactionContext(proto, proto2, transactionType, session_id, amount, network_fee, rh_fee, transaction_hash, result, error, proto3, swap_provider, amount_available, proto4, proto5, fee_token_amount_required, token_holdings != null ? token_holdings.toProto() : null, null, 131072, null);
    }

    public String toString() {
        return "[CryptoTransactionContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoTransactionContextDto) && Intrinsics.areEqual(((CryptoTransactionContextDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoTransactionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 r2\u00020\u0001:\u0002qrB\u0088\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0017\b\u0002\u0010\u001c\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 B»\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020\"\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010#\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\u001f\u0010%J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0006HÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\u0018\u0010V\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010W\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010X\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010Y\u001a\u00020\bHÆ\u0003J\t\u0010Z\u001a\u00020\u0012HÆ\u0003J\t\u0010[\u001a\u00020\u0014HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\u0018\u0010^\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0018\u0010a\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u008a\u0002\u0010c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\b2\u0017\b\u0002\u0010\u0018\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0017\b\u0002\u0010\u001c\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001J\u0013\u0010d\u001a\u00020e2\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010g\u001a\u00020\"HÖ\u0001J\t\u0010h\u001a\u00020\bHÖ\u0001J%\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u00002\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020oH\u0001¢\u0006\u0002\bpR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010'\u001a\u0004\b0\u00101R+\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010'\u001a\u0004\b3\u00104R+\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010'\u001a\u0004\b6\u00104R+\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010'\u001a\u0004\b8\u00104R\u001c\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010'\u001a\u0004\b:\u00101R\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010'\u001a\u0004\b<\u0010=R\u001c\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010'\u001a\u0004\b?\u0010@R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010'\u001a\u0004\bB\u0010CR\u001c\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010'\u001a\u0004\bE\u00101R+\u0010\u0018\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010'\u001a\u0004\bG\u00104R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010'\u001a\u0004\bI\u0010JR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010'\u001a\u0004\bL\u0010)R+\u0010\u001c\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010'\u001a\u0004\bN\u00104R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010'\u001a\u0004\bP\u0010Q¨\u0006s"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$Surrogate;", "", "selling_currency_id", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "buying_currency_id", "transaction_type", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "session_id", "", "amount", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "network_fee", "rh_fee", "transaction_hash", "result", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;", "error", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "input_context", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto;", "swap_provider", "amount_available", "approval_context", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto;", "fee_token", "fee_token_amount_required", "token_holdings", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;Ljava/lang/String;DDDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto;Ljava/lang/String;DLcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;DLcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;Ljava/lang/String;DDDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto;Ljava/lang/String;DLcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;DLcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSelling_currency_id$annotations", "()V", "getSelling_currency_id", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "getBuying_currency_id$annotations", "getBuying_currency_id", "getTransaction_type$annotations", "getTransaction_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "getSession_id$annotations", "getSession_id", "()Ljava/lang/String;", "getAmount$annotations", "getAmount", "()D", "getNetwork_fee$annotations", "getNetwork_fee", "getRh_fee$annotations", "getRh_fee", "getTransaction_hash$annotations", "getTransaction_hash", "getResult$annotations", "getResult", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;", "getError$annotations", "getError", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "getInput_context$annotations", "getInput_context", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto;", "getSwap_provider$annotations", "getSwap_provider", "getAmount_available$annotations", "getAmount_available", "getApproval_context$annotations", "getApproval_context", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto;", "getFee_token$annotations", "getFee_token", "getFee_token_amount_required$annotations", "getFee_token_amount_required", "getToken_holdings$annotations", "getToken_holdings", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double amount;
        private final double amount_available;
        private final ApprovalContextDto approval_context;
        private final CryptoAssetContextDto buying_currency_id;
        private final ErrorDto error;
        private final CryptoAssetContextDto fee_token;
        private final double fee_token_amount_required;
        private final InputContextDto input_context;
        private final double network_fee;
        private final ResultDto result;
        private final double rh_fee;
        private final CryptoAssetContextDto selling_currency_id;
        private final String session_id;
        private final String swap_provider;
        private final TokenHoldingsContextDto token_holdings;
        private final String transaction_hash;
        private final TransactionTypeDto transaction_type;

        public Surrogate() {
            this((CryptoAssetContextDto) null, (CryptoAssetContextDto) null, (TransactionTypeDto) null, (String) null, 0.0d, 0.0d, 0.0d, (String) null, (ResultDto) null, (ErrorDto) null, (InputContextDto) null, (String) null, 0.0d, (ApprovalContextDto) null, (CryptoAssetContextDto) null, 0.0d, (TokenHoldingsContextDto) null, 131071, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CryptoAssetContextDto cryptoAssetContextDto, CryptoAssetContextDto cryptoAssetContextDto2, TransactionTypeDto transactionTypeDto, String str, double d, double d2, double d3, String str2, ResultDto resultDto, ErrorDto errorDto, InputContextDto inputContextDto, String str3, double d4, ApprovalContextDto approvalContextDto, CryptoAssetContextDto cryptoAssetContextDto3, double d5, TokenHoldingsContextDto tokenHoldingsContextDto, int i, Object obj) {
            TokenHoldingsContextDto tokenHoldingsContextDto2;
            double d6;
            CryptoAssetContextDto cryptoAssetContextDto4 = (i & 1) != 0 ? surrogate.selling_currency_id : cryptoAssetContextDto;
            CryptoAssetContextDto cryptoAssetContextDto5 = (i & 2) != 0 ? surrogate.buying_currency_id : cryptoAssetContextDto2;
            TransactionTypeDto transactionTypeDto2 = (i & 4) != 0 ? surrogate.transaction_type : transactionTypeDto;
            String str4 = (i & 8) != 0 ? surrogate.session_id : str;
            double d7 = (i & 16) != 0 ? surrogate.amount : d;
            double d8 = (i & 32) != 0 ? surrogate.network_fee : d2;
            double d9 = (i & 64) != 0 ? surrogate.rh_fee : d3;
            String str5 = (i & 128) != 0 ? surrogate.transaction_hash : str2;
            ResultDto resultDto2 = (i & 256) != 0 ? surrogate.result : resultDto;
            ErrorDto errorDto2 = (i & 512) != 0 ? surrogate.error : errorDto;
            InputContextDto inputContextDto2 = (i & 1024) != 0 ? surrogate.input_context : inputContextDto;
            CryptoAssetContextDto cryptoAssetContextDto6 = cryptoAssetContextDto4;
            String str6 = (i & 2048) != 0 ? surrogate.swap_provider : str3;
            CryptoAssetContextDto cryptoAssetContextDto7 = cryptoAssetContextDto5;
            double d10 = (i & 4096) != 0 ? surrogate.amount_available : d4;
            ApprovalContextDto approvalContextDto2 = (i & 8192) != 0 ? surrogate.approval_context : approvalContextDto;
            CryptoAssetContextDto cryptoAssetContextDto8 = (i & 16384) != 0 ? surrogate.fee_token : cryptoAssetContextDto3;
            ApprovalContextDto approvalContextDto3 = approvalContextDto2;
            double d11 = (i & 32768) != 0 ? surrogate.fee_token_amount_required : d5;
            if ((i & 65536) != 0) {
                d6 = d11;
                tokenHoldingsContextDto2 = surrogate.token_holdings;
            } else {
                tokenHoldingsContextDto2 = tokenHoldingsContextDto;
                d6 = d11;
            }
            return surrogate.copy(cryptoAssetContextDto6, cryptoAssetContextDto7, transactionTypeDto2, str4, d7, d8, d9, str5, resultDto2, errorDto2, inputContextDto2, str6, d10, approvalContextDto3, cryptoAssetContextDto8, d6, tokenHoldingsContextDto2);
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("amountAvailable")
        @JsonAnnotations2(names = {"amount_available"})
        public static /* synthetic */ void getAmount_available$annotations() {
        }

        @SerialName("approvalContext")
        @JsonAnnotations2(names = {"approval_context"})
        public static /* synthetic */ void getApproval_context$annotations() {
        }

        @SerialName("buyingCurrencyId")
        @JsonAnnotations2(names = {"buying_currency_id"})
        public static /* synthetic */ void getBuying_currency_id$annotations() {
        }

        @SerialName("error")
        @JsonAnnotations2(names = {"error"})
        public static /* synthetic */ void getError$annotations() {
        }

        @SerialName("feeToken")
        @JsonAnnotations2(names = {"fee_token"})
        public static /* synthetic */ void getFee_token$annotations() {
        }

        @SerialName("feeTokenAmountRequired")
        @JsonAnnotations2(names = {"fee_token_amount_required"})
        public static /* synthetic */ void getFee_token_amount_required$annotations() {
        }

        @SerialName("inputContext")
        @JsonAnnotations2(names = {"input_context"})
        public static /* synthetic */ void getInput_context$annotations() {
        }

        @SerialName("networkFee")
        @JsonAnnotations2(names = {"network_fee"})
        public static /* synthetic */ void getNetwork_fee$annotations() {
        }

        @SerialName("result")
        @JsonAnnotations2(names = {"result"})
        public static /* synthetic */ void getResult$annotations() {
        }

        @SerialName("rhFee")
        @JsonAnnotations2(names = {"rh_fee"})
        public static /* synthetic */ void getRh_fee$annotations() {
        }

        @SerialName("sellingCurrencyId")
        @JsonAnnotations2(names = {"selling_currency_id"})
        public static /* synthetic */ void getSelling_currency_id$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        @SerialName("swapProvider")
        @JsonAnnotations2(names = {"swap_provider"})
        public static /* synthetic */ void getSwap_provider$annotations() {
        }

        @SerialName("tokenHoldings")
        @JsonAnnotations2(names = {"token_holdings"})
        public static /* synthetic */ void getToken_holdings$annotations() {
        }

        @SerialName("transactionHash")
        @JsonAnnotations2(names = {"transaction_hash"})
        public static /* synthetic */ void getTransaction_hash$annotations() {
        }

        @SerialName("transactionType")
        @JsonAnnotations2(names = {"transaction_type"})
        public static /* synthetic */ void getTransaction_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoAssetContextDto getSelling_currency_id() {
            return this.selling_currency_id;
        }

        /* renamed from: component10, reason: from getter */
        public final ErrorDto getError() {
            return this.error;
        }

        /* renamed from: component11, reason: from getter */
        public final InputContextDto getInput_context() {
            return this.input_context;
        }

        /* renamed from: component12, reason: from getter */
        public final String getSwap_provider() {
            return this.swap_provider;
        }

        /* renamed from: component13, reason: from getter */
        public final double getAmount_available() {
            return this.amount_available;
        }

        /* renamed from: component14, reason: from getter */
        public final ApprovalContextDto getApproval_context() {
            return this.approval_context;
        }

        /* renamed from: component15, reason: from getter */
        public final CryptoAssetContextDto getFee_token() {
            return this.fee_token;
        }

        /* renamed from: component16, reason: from getter */
        public final double getFee_token_amount_required() {
            return this.fee_token_amount_required;
        }

        /* renamed from: component17, reason: from getter */
        public final TokenHoldingsContextDto getToken_holdings() {
            return this.token_holdings;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoAssetContextDto getBuying_currency_id() {
            return this.buying_currency_id;
        }

        /* renamed from: component3, reason: from getter */
        public final TransactionTypeDto getTransaction_type() {
            return this.transaction_type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSession_id() {
            return this.session_id;
        }

        /* renamed from: component5, reason: from getter */
        public final double getAmount() {
            return this.amount;
        }

        /* renamed from: component6, reason: from getter */
        public final double getNetwork_fee() {
            return this.network_fee;
        }

        /* renamed from: component7, reason: from getter */
        public final double getRh_fee() {
            return this.rh_fee;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTransaction_hash() {
            return this.transaction_hash;
        }

        /* renamed from: component9, reason: from getter */
        public final ResultDto getResult() {
            return this.result;
        }

        public final Surrogate copy(CryptoAssetContextDto selling_currency_id, CryptoAssetContextDto buying_currency_id, TransactionTypeDto transaction_type, String session_id, double amount, double network_fee, double rh_fee, String transaction_hash, ResultDto result, ErrorDto error, InputContextDto input_context, String swap_provider, double amount_available, ApprovalContextDto approval_context, CryptoAssetContextDto fee_token, double fee_token_amount_required, TokenHoldingsContextDto token_holdings) {
            Intrinsics.checkNotNullParameter(transaction_type, "transaction_type");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(swap_provider, "swap_provider");
            return new Surrogate(selling_currency_id, buying_currency_id, transaction_type, session_id, amount, network_fee, rh_fee, transaction_hash, result, error, input_context, swap_provider, amount_available, approval_context, fee_token, fee_token_amount_required, token_holdings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.selling_currency_id, surrogate.selling_currency_id) && Intrinsics.areEqual(this.buying_currency_id, surrogate.buying_currency_id) && this.transaction_type == surrogate.transaction_type && Intrinsics.areEqual(this.session_id, surrogate.session_id) && Double.compare(this.amount, surrogate.amount) == 0 && Double.compare(this.network_fee, surrogate.network_fee) == 0 && Double.compare(this.rh_fee, surrogate.rh_fee) == 0 && Intrinsics.areEqual(this.transaction_hash, surrogate.transaction_hash) && this.result == surrogate.result && this.error == surrogate.error && Intrinsics.areEqual(this.input_context, surrogate.input_context) && Intrinsics.areEqual(this.swap_provider, surrogate.swap_provider) && Double.compare(this.amount_available, surrogate.amount_available) == 0 && Intrinsics.areEqual(this.approval_context, surrogate.approval_context) && Intrinsics.areEqual(this.fee_token, surrogate.fee_token) && Double.compare(this.fee_token_amount_required, surrogate.fee_token_amount_required) == 0 && Intrinsics.areEqual(this.token_holdings, surrogate.token_holdings);
        }

        public int hashCode() {
            CryptoAssetContextDto cryptoAssetContextDto = this.selling_currency_id;
            int iHashCode = (cryptoAssetContextDto == null ? 0 : cryptoAssetContextDto.hashCode()) * 31;
            CryptoAssetContextDto cryptoAssetContextDto2 = this.buying_currency_id;
            int iHashCode2 = (((((((((((((((((iHashCode + (cryptoAssetContextDto2 == null ? 0 : cryptoAssetContextDto2.hashCode())) * 31) + this.transaction_type.hashCode()) * 31) + this.session_id.hashCode()) * 31) + Double.hashCode(this.amount)) * 31) + Double.hashCode(this.network_fee)) * 31) + Double.hashCode(this.rh_fee)) * 31) + this.transaction_hash.hashCode()) * 31) + this.result.hashCode()) * 31) + this.error.hashCode()) * 31;
            InputContextDto inputContextDto = this.input_context;
            int iHashCode3 = (((((iHashCode2 + (inputContextDto == null ? 0 : inputContextDto.hashCode())) * 31) + this.swap_provider.hashCode()) * 31) + Double.hashCode(this.amount_available)) * 31;
            ApprovalContextDto approvalContextDto = this.approval_context;
            int iHashCode4 = (iHashCode3 + (approvalContextDto == null ? 0 : approvalContextDto.hashCode())) * 31;
            CryptoAssetContextDto cryptoAssetContextDto3 = this.fee_token;
            int iHashCode5 = (((iHashCode4 + (cryptoAssetContextDto3 == null ? 0 : cryptoAssetContextDto3.hashCode())) * 31) + Double.hashCode(this.fee_token_amount_required)) * 31;
            TokenHoldingsContextDto tokenHoldingsContextDto = this.token_holdings;
            return iHashCode5 + (tokenHoldingsContextDto != null ? tokenHoldingsContextDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(selling_currency_id=" + this.selling_currency_id + ", buying_currency_id=" + this.buying_currency_id + ", transaction_type=" + this.transaction_type + ", session_id=" + this.session_id + ", amount=" + this.amount + ", network_fee=" + this.network_fee + ", rh_fee=" + this.rh_fee + ", transaction_hash=" + this.transaction_hash + ", result=" + this.result + ", error=" + this.error + ", input_context=" + this.input_context + ", swap_provider=" + this.swap_provider + ", amount_available=" + this.amount_available + ", approval_context=" + this.approval_context + ", fee_token=" + this.fee_token + ", fee_token_amount_required=" + this.fee_token_amount_required + ", token_holdings=" + this.token_holdings + ")";
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoTransactionContextDto5.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CryptoAssetContextDto cryptoAssetContextDto, CryptoAssetContextDto cryptoAssetContextDto2, TransactionTypeDto transactionTypeDto, String str, double d, double d2, double d3, String str2, ResultDto resultDto, ErrorDto errorDto, InputContextDto inputContextDto, String str3, double d4, ApprovalContextDto approvalContextDto, CryptoAssetContextDto cryptoAssetContextDto3, double d5, TokenHoldingsContextDto tokenHoldingsContextDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.selling_currency_id = null;
            } else {
                this.selling_currency_id = cryptoAssetContextDto;
            }
            if ((i & 2) == 0) {
                this.buying_currency_id = null;
            } else {
                this.buying_currency_id = cryptoAssetContextDto2;
            }
            if ((i & 4) == 0) {
                this.transaction_type = TransactionTypeDto.INSTANCE.getZeroValue();
            } else {
                this.transaction_type = transactionTypeDto;
            }
            if ((i & 8) == 0) {
                this.session_id = "";
            } else {
                this.session_id = str;
            }
            if ((i & 16) == 0) {
                this.amount = 0.0d;
            } else {
                this.amount = d;
            }
            if ((i & 32) == 0) {
                this.network_fee = 0.0d;
            } else {
                this.network_fee = d2;
            }
            if ((i & 64) == 0) {
                this.rh_fee = 0.0d;
            } else {
                this.rh_fee = d3;
            }
            if ((i & 128) == 0) {
                this.transaction_hash = "";
            } else {
                this.transaction_hash = str2;
            }
            if ((i & 256) == 0) {
                this.result = ResultDto.INSTANCE.getZeroValue();
            } else {
                this.result = resultDto;
            }
            this.error = (i & 512) == 0 ? ErrorDto.INSTANCE.getZeroValue() : errorDto;
            if ((i & 1024) == 0) {
                this.input_context = null;
            } else {
                this.input_context = inputContextDto;
            }
            if ((i & 2048) == 0) {
                this.swap_provider = "";
            } else {
                this.swap_provider = str3;
            }
            if ((i & 4096) == 0) {
                this.amount_available = 0.0d;
            } else {
                this.amount_available = d4;
            }
            if ((i & 8192) == 0) {
                this.approval_context = null;
            } else {
                this.approval_context = approvalContextDto;
            }
            if ((i & 16384) == 0) {
                this.fee_token = null;
            } else {
                this.fee_token = cryptoAssetContextDto3;
            }
            if ((32768 & i) == 0) {
                this.fee_token_amount_required = 0.0d;
            } else {
                this.fee_token_amount_required = d5;
            }
            if ((i & 65536) == 0) {
                this.token_holdings = null;
            } else {
                this.token_holdings = tokenHoldingsContextDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            CryptoAssetContextDto cryptoAssetContextDto = self.selling_currency_id;
            if (cryptoAssetContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, CryptoAssetContextDto.Serializer.INSTANCE, cryptoAssetContextDto);
            }
            CryptoAssetContextDto cryptoAssetContextDto2 = self.buying_currency_id;
            if (cryptoAssetContextDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CryptoAssetContextDto.Serializer.INSTANCE, cryptoAssetContextDto2);
            }
            if (self.transaction_type != TransactionTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, TransactionTypeDto.Serializer.INSTANCE, self.transaction_type);
            }
            if (!Intrinsics.areEqual(self.session_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.session_id);
            }
            if (Double.compare(self.amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.amount));
            }
            if (Double.compare(self.network_fee, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.network_fee));
            }
            if (Double.compare(self.rh_fee, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.rh_fee));
            }
            if (!Intrinsics.areEqual(self.transaction_hash, "")) {
                output.encodeStringElement(serialDesc, 7, self.transaction_hash);
            }
            if (self.result != ResultDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, ResultDto.Serializer.INSTANCE, self.result);
            }
            if (self.error != ErrorDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, ErrorDto.Serializer.INSTANCE, self.error);
            }
            InputContextDto inputContextDto = self.input_context;
            if (inputContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, InputContextDto.Serializer.INSTANCE, inputContextDto);
            }
            if (!Intrinsics.areEqual(self.swap_provider, "")) {
                output.encodeStringElement(serialDesc, 11, self.swap_provider);
            }
            if (Double.compare(self.amount_available, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 12, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.amount_available));
            }
            ApprovalContextDto approvalContextDto = self.approval_context;
            if (approvalContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, ApprovalContextDto.Serializer.INSTANCE, approvalContextDto);
            }
            CryptoAssetContextDto cryptoAssetContextDto3 = self.fee_token;
            if (cryptoAssetContextDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, CryptoAssetContextDto.Serializer.INSTANCE, cryptoAssetContextDto3);
            }
            if (Double.compare(self.fee_token_amount_required, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 15, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.fee_token_amount_required));
            }
            TokenHoldingsContextDto tokenHoldingsContextDto = self.token_holdings;
            if (tokenHoldingsContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, TokenHoldingsContextDto.Serializer.INSTANCE, tokenHoldingsContextDto);
            }
        }

        public Surrogate(CryptoAssetContextDto cryptoAssetContextDto, CryptoAssetContextDto cryptoAssetContextDto2, TransactionTypeDto transaction_type, String session_id, double d, double d2, double d3, String transaction_hash, ResultDto result, ErrorDto error, InputContextDto inputContextDto, String swap_provider, double d4, ApprovalContextDto approvalContextDto, CryptoAssetContextDto cryptoAssetContextDto3, double d5, TokenHoldingsContextDto tokenHoldingsContextDto) {
            Intrinsics.checkNotNullParameter(transaction_type, "transaction_type");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(swap_provider, "swap_provider");
            this.selling_currency_id = cryptoAssetContextDto;
            this.buying_currency_id = cryptoAssetContextDto2;
            this.transaction_type = transaction_type;
            this.session_id = session_id;
            this.amount = d;
            this.network_fee = d2;
            this.rh_fee = d3;
            this.transaction_hash = transaction_hash;
            this.result = result;
            this.error = error;
            this.input_context = inputContextDto;
            this.swap_provider = swap_provider;
            this.amount_available = d4;
            this.approval_context = approvalContextDto;
            this.fee_token = cryptoAssetContextDto3;
            this.fee_token_amount_required = d5;
            this.token_holdings = tokenHoldingsContextDto;
        }

        public final CryptoAssetContextDto getSelling_currency_id() {
            return this.selling_currency_id;
        }

        public final CryptoAssetContextDto getBuying_currency_id() {
            return this.buying_currency_id;
        }

        public final TransactionTypeDto getTransaction_type() {
            return this.transaction_type;
        }

        public /* synthetic */ Surrogate(CryptoAssetContextDto cryptoAssetContextDto, CryptoAssetContextDto cryptoAssetContextDto2, TransactionTypeDto transactionTypeDto, String str, double d, double d2, double d3, String str2, ResultDto resultDto, ErrorDto errorDto, InputContextDto inputContextDto, String str3, double d4, ApprovalContextDto approvalContextDto, CryptoAssetContextDto cryptoAssetContextDto3, double d5, TokenHoldingsContextDto tokenHoldingsContextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cryptoAssetContextDto, (i & 2) != 0 ? null : cryptoAssetContextDto2, (i & 4) != 0 ? TransactionTypeDto.INSTANCE.getZeroValue() : transactionTypeDto, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? 0.0d : d2, (i & 64) != 0 ? 0.0d : d3, (i & 128) != 0 ? "" : str2, (i & 256) != 0 ? ResultDto.INSTANCE.getZeroValue() : resultDto, (i & 512) != 0 ? ErrorDto.INSTANCE.getZeroValue() : errorDto, (i & 1024) != 0 ? null : inputContextDto, (i & 2048) == 0 ? str3 : "", (i & 4096) != 0 ? 0.0d : d4, (i & 8192) != 0 ? null : approvalContextDto, (i & 16384) != 0 ? null : cryptoAssetContextDto3, (i & 32768) != 0 ? 0.0d : d5, (i & 65536) != 0 ? null : tokenHoldingsContextDto);
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

        public final ResultDto getResult() {
            return this.result;
        }

        public final ErrorDto getError() {
            return this.error;
        }

        public final InputContextDto getInput_context() {
            return this.input_context;
        }

        public final String getSwap_provider() {
            return this.swap_provider;
        }

        public final double getAmount_available() {
            return this.amount_available;
        }

        public final ApprovalContextDto getApproval_context() {
            return this.approval_context;
        }

        public final CryptoAssetContextDto getFee_token() {
            return this.fee_token;
        }

        public final double getFee_token_amount_required() {
            return this.fee_token_amount_required;
        }

        public final TokenHoldingsContextDto getToken_holdings() {
            return this.token_holdings;
        }
    }

    /* compiled from: CryptoTransactionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CryptoTransactionContextDto, CryptoTransactionContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoTransactionContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoTransactionContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoTransactionContextDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoTransactionContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoTransactionContext> getProtoAdapter() {
            return CryptoTransactionContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoTransactionContextDto getZeroValue() {
            return CryptoTransactionContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoTransactionContextDto fromProto(CryptoTransactionContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CryptoAssetContext selling_currency_id = proto.getSelling_currency_id();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CryptoAssetContextDto cryptoAssetContextDtoFromProto = selling_currency_id != null ? CryptoAssetContextDto.INSTANCE.fromProto(selling_currency_id) : null;
            CryptoAssetContext buying_currency_id = proto.getBuying_currency_id();
            CryptoAssetContextDto cryptoAssetContextDtoFromProto2 = buying_currency_id != null ? CryptoAssetContextDto.INSTANCE.fromProto(buying_currency_id) : null;
            TransactionTypeDto transactionTypeDtoFromProto = TransactionTypeDto.INSTANCE.fromProto(proto.getTransaction_type());
            String session_id = proto.getSession_id();
            double amount = proto.getAmount();
            double network_fee = proto.getNetwork_fee();
            double rh_fee = proto.getRh_fee();
            String transaction_hash = proto.getTransaction_hash();
            ResultDto resultDtoFromProto = ResultDto.INSTANCE.fromProto(proto.getResult());
            ErrorDto errorDtoFromProto = ErrorDto.INSTANCE.fromProto(proto.getError());
            CryptoTransactionContext.InputContext input_context = proto.getInput_context();
            InputContextDto inputContextDtoFromProto = input_context != null ? InputContextDto.INSTANCE.fromProto(input_context) : null;
            String swap_provider = proto.getSwap_provider();
            double amount_available = proto.getAmount_available();
            CryptoTransactionContext.ApprovalContext approval_context = proto.getApproval_context();
            ApprovalContextDto approvalContextDtoFromProto = approval_context != null ? ApprovalContextDto.INSTANCE.fromProto(approval_context) : null;
            CryptoAssetContext fee_token = proto.getFee_token();
            CryptoAssetContextDto cryptoAssetContextDtoFromProto3 = fee_token != null ? CryptoAssetContextDto.INSTANCE.fromProto(fee_token) : null;
            double fee_token_amount_required = proto.getFee_token_amount_required();
            CryptoTransactionContext.TokenHoldingsContext token_holdings = proto.getToken_holdings();
            return new CryptoTransactionContextDto(new Surrogate(cryptoAssetContextDtoFromProto, cryptoAssetContextDtoFromProto2, transactionTypeDtoFromProto, session_id, amount, network_fee, rh_fee, transaction_hash, resultDtoFromProto, errorDtoFromProto, inputContextDtoFromProto, swap_provider, amount_available, approvalContextDtoFromProto, cryptoAssetContextDtoFromProto3, fee_token_amount_required, token_holdings != null ? TokenHoldingsContextDto.INSTANCE.fromProto(token_holdings) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoTransactionContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoTransactionContextDto(null, null, null, null, 0.0d, 0.0d, 0.0d, null, null, null, null, null, 0.0d, null, null, 0.0d, null, 131071, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTransactionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR_UNSPECIFIED", "INSUFFICIENT_BALANCE", "QUOTE_FETCHING", "ORDER_FAILED", "NO_LIQUIDITY", "MINIMUM_TRANSACTION_SIZE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ErrorDto implements Dto2<CryptoTransactionContext.Error>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ErrorDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ErrorDto, CryptoTransactionContext.Error>> binaryBase64Serializer$delegate;
        public static final ErrorDto ERROR_UNSPECIFIED = new ERROR_UNSPECIFIED("ERROR_UNSPECIFIED", 0);
        public static final ErrorDto INSUFFICIENT_BALANCE = new INSUFFICIENT_BALANCE("INSUFFICIENT_BALANCE", 1);
        public static final ErrorDto QUOTE_FETCHING = new QUOTE_FETCHING("QUOTE_FETCHING", 2);
        public static final ErrorDto ORDER_FAILED = new ORDER_FAILED("ORDER_FAILED", 3);
        public static final ErrorDto NO_LIQUIDITY = new NO_LIQUIDITY("NO_LIQUIDITY", 4);
        public static final ErrorDto MINIMUM_TRANSACTION_SIZE = new MINIMUM_TRANSACTION_SIZE("MINIMUM_TRANSACTION_SIZE", 5);

        private static final /* synthetic */ ErrorDto[] $values() {
            return new ErrorDto[]{ERROR_UNSPECIFIED, INSUFFICIENT_BALANCE, QUOTE_FETCHING, ORDER_FAILED, NO_LIQUIDITY, MINIMUM_TRANSACTION_SIZE};
        }

        public /* synthetic */ ErrorDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ErrorDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ErrorDto.ERROR_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR_UNSPECIFIED extends ErrorDto {
            ERROR_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.Error toProto() {
                return CryptoTransactionContext.Error.ERROR_UNSPECIFIED;
            }
        }

        private ErrorDto(String str, int i) {
        }

        static {
            ErrorDto[] errorDtoArr$values = $values();
            $VALUES = errorDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$ErrorDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTransactionContextDto.ErrorDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ErrorDto.INSUFFICIENT_BALANCE", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INSUFFICIENT_BALANCE extends ErrorDto {
            INSUFFICIENT_BALANCE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.Error toProto() {
                return CryptoTransactionContext.Error.INSUFFICIENT_BALANCE;
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ErrorDto.QUOTE_FETCHING", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QUOTE_FETCHING extends ErrorDto {
            QUOTE_FETCHING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.Error toProto() {
                return CryptoTransactionContext.Error.QUOTE_FETCHING;
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ErrorDto.ORDER_FAILED", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_FAILED extends ErrorDto {
            ORDER_FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.Error toProto() {
                return CryptoTransactionContext.Error.ORDER_FAILED;
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ErrorDto.NO_LIQUIDITY", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NO_LIQUIDITY extends ErrorDto {
            NO_LIQUIDITY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.Error toProto() {
                return CryptoTransactionContext.Error.NO_LIQUIDITY;
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ErrorDto.MINIMUM_TRANSACTION_SIZE", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MINIMUM_TRANSACTION_SIZE extends ErrorDto {
            MINIMUM_TRANSACTION_SIZE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.Error toProto() {
                return CryptoTransactionContext.Error.MINIMUM_TRANSACTION_SIZE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Error;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ErrorDto, CryptoTransactionContext.Error> {

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CryptoTransactionContext.Error.values().length];
                    try {
                        iArr[CryptoTransactionContext.Error.ERROR_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CryptoTransactionContext.Error.INSUFFICIENT_BALANCE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CryptoTransactionContext.Error.QUOTE_FETCHING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CryptoTransactionContext.Error.ORDER_FAILED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CryptoTransactionContext.Error.NO_LIQUIDITY.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CryptoTransactionContext.Error.MINIMUM_TRANSACTION_SIZE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ErrorDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorDto> getBinaryBase64Serializer() {
                return (KSerializer) ErrorDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoTransactionContext.Error> getProtoAdapter() {
                return CryptoTransactionContext.Error.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorDto getZeroValue() {
                return ErrorDto.ERROR_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorDto fromProto(CryptoTransactionContext.Error proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ErrorDto.ERROR_UNSPECIFIED;
                    case 2:
                        return ErrorDto.INSUFFICIENT_BALANCE;
                    case 3:
                        return ErrorDto.QUOTE_FETCHING;
                    case 4:
                        return ErrorDto.ORDER_FAILED;
                    case 5:
                        return ErrorDto.NO_LIQUIDITY;
                    case 6:
                        return ErrorDto.MINIMUM_TRANSACTION_SIZE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ErrorDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ErrorDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ErrorDto, CryptoTransactionContext.Error> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CryptoTransactionContext.Error", ErrorDto.getEntries(), ErrorDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ErrorDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ErrorDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ErrorDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ErrorDto valueOf(String str) {
            return (ErrorDto) Enum.valueOf(ErrorDto.class, str);
        }

        public static ErrorDto[] values() {
            return (ErrorDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTransactionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Result;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "RESULT_UNSPECIFIED", "SUCCESS", "CANCELED_BY_USER", "ERROR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ResultDto implements Dto2<CryptoTransactionContext.Result>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ResultDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ResultDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ResultDto, CryptoTransactionContext.Result>> binaryBase64Serializer$delegate;
        public static final ResultDto RESULT_UNSPECIFIED = new RESULT_UNSPECIFIED("RESULT_UNSPECIFIED", 0);
        public static final ResultDto SUCCESS = new SUCCESS("SUCCESS", 1);
        public static final ResultDto CANCELED_BY_USER = new CANCELED_BY_USER("CANCELED_BY_USER", 2);
        public static final ResultDto ERROR = new ERROR("ERROR", 3);

        private static final /* synthetic */ ResultDto[] $values() {
            return new ResultDto[]{RESULT_UNSPECIFIED, SUCCESS, CANCELED_BY_USER, ERROR};
        }

        public /* synthetic */ ResultDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ResultDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ResultDto.RESULT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Result;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RESULT_UNSPECIFIED extends ResultDto {
            RESULT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.Result toProto() {
                return CryptoTransactionContext.Result.RESULT_UNSPECIFIED;
            }
        }

        private ResultDto(String str, int i) {
        }

        static {
            ResultDto[] resultDtoArr$values = $values();
            $VALUES = resultDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(resultDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$ResultDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTransactionContextDto.ResultDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ResultDto.SUCCESS", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Result;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUCCESS extends ResultDto {
            SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.Result toProto() {
                return CryptoTransactionContext.Result.SUCCESS;
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ResultDto.CANCELED_BY_USER", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Result;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCELED_BY_USER extends ResultDto {
            CANCELED_BY_USER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.Result toProto() {
                return CryptoTransactionContext.Result.CANCELED_BY_USER;
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ResultDto.ERROR", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Result;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR extends ResultDto {
            ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.Result toProto() {
                return CryptoTransactionContext.Result.ERROR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Result;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ResultDto, CryptoTransactionContext.Result> {

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CryptoTransactionContext.Result.values().length];
                    try {
                        iArr[CryptoTransactionContext.Result.RESULT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CryptoTransactionContext.Result.SUCCESS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CryptoTransactionContext.Result.CANCELED_BY_USER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CryptoTransactionContext.Result.ERROR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ResultDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ResultDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ResultDto> getBinaryBase64Serializer() {
                return (KSerializer) ResultDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoTransactionContext.Result> getProtoAdapter() {
                return CryptoTransactionContext.Result.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ResultDto getZeroValue() {
                return ResultDto.RESULT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ResultDto fromProto(CryptoTransactionContext.Result proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ResultDto.RESULT_UNSPECIFIED;
                }
                if (i == 2) {
                    return ResultDto.SUCCESS;
                }
                if (i == 3) {
                    return ResultDto.CANCELED_BY_USER;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return ResultDto.ERROR;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ResultDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ResultDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ResultDto, CryptoTransactionContext.Result> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CryptoTransactionContext.Result", ResultDto.getEntries(), ResultDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ResultDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ResultDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ResultDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ResultDto valueOf(String str) {
            return (ResultDto) Enum.valueOf(ResultDto.class, str);
        }

        public static ResultDto[] values() {
            return (ResultDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTransactionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSACTION_TYPE_UNSPECIFIED", "BUY", "SELL", "GAS_SWAP", "GASLESS_SWAP", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TransactionTypeDto implements Dto2<CryptoTransactionContext.TransactionType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransactionTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TransactionTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TransactionTypeDto, CryptoTransactionContext.TransactionType>> binaryBase64Serializer$delegate;
        public static final TransactionTypeDto TRANSACTION_TYPE_UNSPECIFIED = new TRANSACTION_TYPE_UNSPECIFIED("TRANSACTION_TYPE_UNSPECIFIED", 0);
        public static final TransactionTypeDto BUY = new BUY("BUY", 1);
        public static final TransactionTypeDto SELL = new SELL("SELL", 2);
        public static final TransactionTypeDto GAS_SWAP = new GAS_SWAP("GAS_SWAP", 3);
        public static final TransactionTypeDto GASLESS_SWAP = new GASLESS_SWAP("GASLESS_SWAP", 4);

        private static final /* synthetic */ TransactionTypeDto[] $values() {
            return new TransactionTypeDto[]{TRANSACTION_TYPE_UNSPECIFIED, BUY, SELL, GAS_SWAP, GASLESS_SWAP};
        }

        public /* synthetic */ TransactionTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TransactionTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TransactionTypeDto(String str, int i) {
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.TransactionTypeDto.TRANSACTION_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSACTION_TYPE_UNSPECIFIED extends TransactionTypeDto {
            TRANSACTION_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.TransactionType toProto() {
                return CryptoTransactionContext.TransactionType.TRANSACTION_TYPE_UNSPECIFIED;
            }
        }

        static {
            TransactionTypeDto[] transactionTypeDtoArr$values = $values();
            $VALUES = transactionTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transactionTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$TransactionTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTransactionContextDto.TransactionTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.TransactionTypeDto.BUY", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUY extends TransactionTypeDto {
            BUY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.TransactionType toProto() {
                return CryptoTransactionContext.TransactionType.BUY;
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.TransactionTypeDto.SELL", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELL extends TransactionTypeDto {
            SELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.TransactionType toProto() {
                return CryptoTransactionContext.TransactionType.SELL;
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.TransactionTypeDto.GAS_SWAP", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GAS_SWAP extends TransactionTypeDto {
            GAS_SWAP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.TransactionType toProto() {
                return CryptoTransactionContext.TransactionType.GAS_SWAP;
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.TransactionTypeDto.GASLESS_SWAP", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GASLESS_SWAP extends TransactionTypeDto {
            GASLESS_SWAP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoTransactionContext.TransactionType toProto() {
                return CryptoTransactionContext.TransactionType.GASLESS_SWAP;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TransactionType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TransactionTypeDto, CryptoTransactionContext.TransactionType> {

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CryptoTransactionContext.TransactionType.values().length];
                    try {
                        iArr[CryptoTransactionContext.TransactionType.TRANSACTION_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CryptoTransactionContext.TransactionType.BUY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CryptoTransactionContext.TransactionType.SELL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CryptoTransactionContext.TransactionType.GAS_SWAP.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CryptoTransactionContext.TransactionType.GASLESS_SWAP.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TransactionTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransactionTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TransactionTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) TransactionTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoTransactionContext.TransactionType> getProtoAdapter() {
                return CryptoTransactionContext.TransactionType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransactionTypeDto getZeroValue() {
                return TransactionTypeDto.TRANSACTION_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransactionTypeDto fromProto(CryptoTransactionContext.TransactionType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TransactionTypeDto.TRANSACTION_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return TransactionTypeDto.BUY;
                }
                if (i == 3) {
                    return TransactionTypeDto.SELL;
                }
                if (i == 4) {
                    return TransactionTypeDto.GAS_SWAP;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return TransactionTypeDto.GASLESS_SWAP;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TransactionTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TransactionTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TransactionTypeDto, CryptoTransactionContext.TransactionType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CryptoTransactionContext.TransactionType", TransactionTypeDto.getEntries(), TransactionTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TransactionTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TransactionTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TransactionTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TransactionTypeDto valueOf(String str) {
            return (TransactionTypeDto) Enum.valueOf(TransactionTypeDto.class, str);
        }

        public static TransactionTypeDto[] values() {
            return (TransactionTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CryptoTransactionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\"#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$Surrogate;)V", "input_style", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;", "anchor_token", "", "custom_token_selected", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;Ljava/lang/String;Ljava/lang/String;)V", "getInput_style", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;", "getAnchor_token", "()Ljava/lang/String;", "getCustom_token_selected", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "InputStyleDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class InputContextDto implements Dto3<CryptoTransactionContext.InputContext>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<InputContextDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<InputContextDto, CryptoTransactionContext.InputContext>> binaryBase64Serializer$delegate;
        private static final InputContextDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ InputContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private InputContextDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final InputStyleDto getInput_style() {
            return this.surrogate.getInput_style();
        }

        public final String getAnchor_token() {
            return this.surrogate.getAnchor_token();
        }

        public final String getCustom_token_selected() {
            return this.surrogate.getCustom_token_selected();
        }

        public /* synthetic */ InputContextDto(InputStyleDto inputStyleDto, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? InputStyleDto.INSTANCE.getZeroValue() : inputStyleDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public InputContextDto(InputStyleDto input_style, String anchor_token, String custom_token_selected) {
            this(new Surrogate(input_style, anchor_token, custom_token_selected));
            Intrinsics.checkNotNullParameter(input_style, "input_style");
            Intrinsics.checkNotNullParameter(anchor_token, "anchor_token");
            Intrinsics.checkNotNullParameter(custom_token_selected, "custom_token_selected");
        }

        public static /* synthetic */ InputContextDto copy$default(InputContextDto inputContextDto, InputStyleDto inputStyleDto, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                inputStyleDto = inputContextDto.surrogate.getInput_style();
            }
            if ((i & 2) != 0) {
                str = inputContextDto.surrogate.getAnchor_token();
            }
            if ((i & 4) != 0) {
                str2 = inputContextDto.surrogate.getCustom_token_selected();
            }
            return inputContextDto.copy(inputStyleDto, str, str2);
        }

        public final InputContextDto copy(InputStyleDto input_style, String anchor_token, String custom_token_selected) {
            Intrinsics.checkNotNullParameter(input_style, "input_style");
            Intrinsics.checkNotNullParameter(anchor_token, "anchor_token");
            Intrinsics.checkNotNullParameter(custom_token_selected, "custom_token_selected");
            return new InputContextDto(new Surrogate(input_style, anchor_token, custom_token_selected));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public CryptoTransactionContext.InputContext toProto() {
            return new CryptoTransactionContext.InputContext((CryptoTransactionContext.InputContext.InputStyle) this.surrogate.getInput_style().toProto(), this.surrogate.getAnchor_token(), this.surrogate.getCustom_token_selected(), null, 8, null);
        }

        public String toString() {
            return "[InputContextDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof InputContextDto) && Intrinsics.areEqual(((InputContextDto) other).surrogate, this.surrogate);
            }
            return true;
        }

        public int hashCode() {
            return this.surrogate.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$Surrogate;", "", "input_style", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;", "anchor_token", "", "custom_token_selected", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getInput_style$annotations", "()V", "getInput_style", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;", "getAnchor_token$annotations", "getAnchor_token", "()Ljava/lang/String;", "getCustom_token_selected$annotations", "getCustom_token_selected", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String anchor_token;
            private final String custom_token_selected;
            private final InputStyleDto input_style;

            public Surrogate() {
                this((InputStyleDto) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, InputStyleDto inputStyleDto, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    inputStyleDto = surrogate.input_style;
                }
                if ((i & 2) != 0) {
                    str = surrogate.anchor_token;
                }
                if ((i & 4) != 0) {
                    str2 = surrogate.custom_token_selected;
                }
                return surrogate.copy(inputStyleDto, str, str2);
            }

            @SerialName("anchorToken")
            @JsonAnnotations2(names = {"anchor_token"})
            public static /* synthetic */ void getAnchor_token$annotations() {
            }

            @SerialName("customTokenSelected")
            @JsonAnnotations2(names = {"custom_token_selected"})
            public static /* synthetic */ void getCustom_token_selected$annotations() {
            }

            @SerialName("inputStyle")
            @JsonAnnotations2(names = {"input_style"})
            public static /* synthetic */ void getInput_style$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final InputStyleDto getInput_style() {
                return this.input_style;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAnchor_token() {
                return this.anchor_token;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCustom_token_selected() {
                return this.custom_token_selected;
            }

            public final Surrogate copy(InputStyleDto input_style, String anchor_token, String custom_token_selected) {
                Intrinsics.checkNotNullParameter(input_style, "input_style");
                Intrinsics.checkNotNullParameter(anchor_token, "anchor_token");
                Intrinsics.checkNotNullParameter(custom_token_selected, "custom_token_selected");
                return new Surrogate(input_style, anchor_token, custom_token_selected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.input_style == surrogate.input_style && Intrinsics.areEqual(this.anchor_token, surrogate.anchor_token) && Intrinsics.areEqual(this.custom_token_selected, surrogate.custom_token_selected);
            }

            public int hashCode() {
                return (((this.input_style.hashCode() * 31) + this.anchor_token.hashCode()) * 31) + this.custom_token_selected.hashCode();
            }

            public String toString() {
                return "Surrogate(input_style=" + this.input_style + ", anchor_token=" + this.anchor_token + ", custom_token_selected=" + this.custom_token_selected + ")";
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return CryptoTransactionContextDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, InputStyleDto inputStyleDto, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                this.input_style = (i & 1) == 0 ? InputStyleDto.INSTANCE.getZeroValue() : inputStyleDto;
                if ((i & 2) == 0) {
                    this.anchor_token = "";
                } else {
                    this.anchor_token = str;
                }
                if ((i & 4) == 0) {
                    this.custom_token_selected = "";
                } else {
                    this.custom_token_selected = str2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.input_style != InputStyleDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, InputStyleDto.Serializer.INSTANCE, self.input_style);
                }
                if (!Intrinsics.areEqual(self.anchor_token, "")) {
                    output.encodeStringElement(serialDesc, 1, self.anchor_token);
                }
                if (Intrinsics.areEqual(self.custom_token_selected, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 2, self.custom_token_selected);
            }

            public Surrogate(InputStyleDto input_style, String anchor_token, String custom_token_selected) {
                Intrinsics.checkNotNullParameter(input_style, "input_style");
                Intrinsics.checkNotNullParameter(anchor_token, "anchor_token");
                Intrinsics.checkNotNullParameter(custom_token_selected, "custom_token_selected");
                this.input_style = input_style;
                this.anchor_token = anchor_token;
                this.custom_token_selected = custom_token_selected;
            }

            public final InputStyleDto getInput_style() {
                return this.input_style;
            }

            public /* synthetic */ Surrogate(InputStyleDto inputStyleDto, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? InputStyleDto.INSTANCE.getZeroValue() : inputStyleDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
            }

            public final String getAnchor_token() {
                return this.anchor_token;
            }

            public final String getCustom_token_selected() {
                return this.custom_token_selected;
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<InputContextDto, CryptoTransactionContext.InputContext> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<InputContextDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InputContextDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InputContextDto> getBinaryBase64Serializer() {
                return (KSerializer) InputContextDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoTransactionContext.InputContext> getProtoAdapter() {
                return CryptoTransactionContext.InputContext.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InputContextDto getZeroValue() {
                return InputContextDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InputContextDto fromProto(CryptoTransactionContext.InputContext proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new InputContextDto(new Surrogate(InputStyleDto.INSTANCE.fromProto(proto.getInput_style()), proto.getAnchor_token(), proto.getCustom_token_selected()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$InputContextDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTransactionContextDto.InputContextDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new InputContextDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext$InputStyle;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "INPUTSTYLE_UNSPECIFIED", "USD", "TOKEN", "CUSTOM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class InputStyleDto implements Dto2<CryptoTransactionContext.InputContext.InputStyle>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ InputStyleDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<InputStyleDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<InputStyleDto, CryptoTransactionContext.InputContext.InputStyle>> binaryBase64Serializer$delegate;
            public static final InputStyleDto INPUTSTYLE_UNSPECIFIED = new INPUTSTYLE_UNSPECIFIED("INPUTSTYLE_UNSPECIFIED", 0);
            public static final InputStyleDto USD = new USD("USD", 1);
            public static final InputStyleDto TOKEN = new TOKEN("TOKEN", 2);
            public static final InputStyleDto CUSTOM = new CUSTOM("CUSTOM", 3);

            private static final /* synthetic */ InputStyleDto[] $values() {
                return new InputStyleDto[]{INPUTSTYLE_UNSPECIFIED, USD, TOKEN, CUSTOM};
            }

            public /* synthetic */ InputStyleDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<InputStyleDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private InputStyleDto(String str, int i) {
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.InputContextDto.InputStyleDto.INPUTSTYLE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext$InputStyle;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class INPUTSTYLE_UNSPECIFIED extends InputStyleDto {
                INPUTSTYLE_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public CryptoTransactionContext.InputContext.InputStyle toProto() {
                    return CryptoTransactionContext.InputContext.InputStyle.INPUTSTYLE_UNSPECIFIED;
                }
            }

            static {
                InputStyleDto[] inputStyleDtoArr$values = $values();
                $VALUES = inputStyleDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(inputStyleDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$InputContextDto$InputStyleDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransactionContextDto.InputContextDto.InputStyleDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.InputContextDto.InputStyleDto.USD", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext$InputStyle;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class USD extends InputStyleDto {
                USD(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public CryptoTransactionContext.InputContext.InputStyle toProto() {
                    return CryptoTransactionContext.InputContext.InputStyle.USD;
                }
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.InputContextDto.InputStyleDto.TOKEN", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext$InputStyle;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class TOKEN extends InputStyleDto {
                TOKEN(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public CryptoTransactionContext.InputContext.InputStyle toProto() {
                    return CryptoTransactionContext.InputContext.InputStyle.TOKEN;
                }
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.InputContextDto.InputStyleDto.CUSTOM", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext$InputStyle;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class CUSTOM extends InputStyleDto {
                CUSTOM(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public CryptoTransactionContext.InputContext.InputStyle toProto() {
                    return CryptoTransactionContext.InputContext.InputStyle.CUSTOM;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$InputContext$InputStyle;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<InputStyleDto, CryptoTransactionContext.InputContext.InputStyle> {

                /* compiled from: CryptoTransactionContextDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes26.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[CryptoTransactionContext.InputContext.InputStyle.values().length];
                        try {
                            iArr[CryptoTransactionContext.InputContext.InputStyle.INPUTSTYLE_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CryptoTransactionContext.InputContext.InputStyle.USD.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[CryptoTransactionContext.InputContext.InputStyle.TOKEN.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[CryptoTransactionContext.InputContext.InputStyle.CUSTOM.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<InputStyleDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<InputStyleDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<InputStyleDto> getBinaryBase64Serializer() {
                    return (KSerializer) InputStyleDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<CryptoTransactionContext.InputContext.InputStyle> getProtoAdapter() {
                    return CryptoTransactionContext.InputContext.InputStyle.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public InputStyleDto getZeroValue() {
                    return InputStyleDto.INPUTSTYLE_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public InputStyleDto fromProto(CryptoTransactionContext.InputContext.InputStyle proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return InputStyleDto.INPUTSTYLE_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return InputStyleDto.USD;
                    }
                    if (i == 3) {
                        return InputStyleDto.TOKEN;
                    }
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return InputStyleDto.CUSTOM;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$InputStyleDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<InputStyleDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<InputStyleDto, CryptoTransactionContext.InputContext.InputStyle> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CryptoTransactionContext.InputContext.InputStyle", InputStyleDto.getEntries(), InputStyleDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public InputStyleDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (InputStyleDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, InputStyleDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static InputStyleDto valueOf(String str) {
                return (InputStyleDto) Enum.valueOf(InputStyleDto.class, str);
            }

            public static InputStyleDto[] values() {
                return (InputStyleDto[]) $VALUES.clone();
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<InputContextDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoTransactionContext.InputContext", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, InputContextDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public InputContextDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new InputContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$InputContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$InputContextDto";
            }
        }
    }

    /* compiled from: CryptoTransactionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\u001d\u001e\u001f !B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$Surrogate;)V", "status", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;)V", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "StatusDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ApprovalContextDto implements Dto3<CryptoTransactionContext.ApprovalContext>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ApprovalContextDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ApprovalContextDto, CryptoTransactionContext.ApprovalContext>> binaryBase64Serializer$delegate;
        private static final ApprovalContextDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ApprovalContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ApprovalContextDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final StatusDto getStatus() {
            return this.surrogate.getStatus();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ApprovalContextDto(StatusDto status) {
            this(new Surrogate(status));
            Intrinsics.checkNotNullParameter(status, "status");
        }

        public /* synthetic */ ApprovalContextDto(StatusDto statusDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? StatusDto.INSTANCE.getZeroValue() : statusDto);
        }

        public static /* synthetic */ ApprovalContextDto copy$default(ApprovalContextDto approvalContextDto, StatusDto statusDto, int i, Object obj) {
            if ((i & 1) != 0) {
                statusDto = approvalContextDto.surrogate.getStatus();
            }
            return approvalContextDto.copy(statusDto);
        }

        public final ApprovalContextDto copy(StatusDto status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new ApprovalContextDto(new Surrogate(status));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public CryptoTransactionContext.ApprovalContext toProto() {
            return new CryptoTransactionContext.ApprovalContext((CryptoTransactionContext.ApprovalContext.Status) this.surrogate.getStatus().toProto(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[ApprovalContextDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ApprovalContextDto) && Intrinsics.areEqual(((ApprovalContextDto) other).surrogate, this.surrogate);
            }
            return true;
        }

        public int hashCode() {
            return this.surrogate.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$Surrogate;", "", "status", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStatus$annotations", "()V", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final StatusDto status;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((StatusDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, StatusDto statusDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    statusDto = surrogate.status;
                }
                return surrogate.copy(statusDto);
            }

            @SerialName("status")
            @JsonAnnotations2(names = {"status"})
            public static /* synthetic */ void getStatus$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final StatusDto getStatus() {
                return this.status;
            }

            public final Surrogate copy(StatusDto status) {
                Intrinsics.checkNotNullParameter(status, "status");
                return new Surrogate(status);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && this.status == ((Surrogate) other).status;
            }

            public int hashCode() {
                return this.status.hashCode();
            }

            public String toString() {
                return "Surrogate(status=" + this.status + ")";
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return CryptoTransactionContextDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, StatusDto statusDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.status = StatusDto.INSTANCE.getZeroValue();
                } else {
                    this.status = statusDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.status != StatusDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, StatusDto.Serializer.INSTANCE, self.status);
                }
            }

            public Surrogate(StatusDto status) {
                Intrinsics.checkNotNullParameter(status, "status");
                this.status = status;
            }

            public final StatusDto getStatus() {
                return this.status;
            }

            public /* synthetic */ Surrogate(StatusDto statusDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? StatusDto.INSTANCE.getZeroValue() : statusDto);
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<ApprovalContextDto, CryptoTransactionContext.ApprovalContext> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ApprovalContextDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ApprovalContextDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ApprovalContextDto> getBinaryBase64Serializer() {
                return (KSerializer) ApprovalContextDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoTransactionContext.ApprovalContext> getProtoAdapter() {
                return CryptoTransactionContext.ApprovalContext.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ApprovalContextDto getZeroValue() {
                return ApprovalContextDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ApprovalContextDto fromProto(CryptoTransactionContext.ApprovalContext proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new ApprovalContextDto(new Surrogate(StatusDto.INSTANCE.fromProto(proto.getStatus())), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$ApprovalContextDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTransactionContextDto.ApprovalContextDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ApprovalContextDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_UNSPECIFIED", "BLOCKING_SWAP", "BATCHING_WITH_SWAP", "NOT_REQUIRED_FOR_SWAP", "COMPLETED_THIS_SESSION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class StatusDto implements Dto2<CryptoTransactionContext.ApprovalContext.Status>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ StatusDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<StatusDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<StatusDto, CryptoTransactionContext.ApprovalContext.Status>> binaryBase64Serializer$delegate;
            public static final StatusDto STATUS_UNSPECIFIED = new STATUS_UNSPECIFIED("STATUS_UNSPECIFIED", 0);
            public static final StatusDto BLOCKING_SWAP = new BLOCKING_SWAP("BLOCKING_SWAP", 1);
            public static final StatusDto BATCHING_WITH_SWAP = new BATCHING_WITH_SWAP("BATCHING_WITH_SWAP", 2);
            public static final StatusDto NOT_REQUIRED_FOR_SWAP = new NOT_REQUIRED_FOR_SWAP("NOT_REQUIRED_FOR_SWAP", 3);
            public static final StatusDto COMPLETED_THIS_SESSION = new COMPLETED_THIS_SESSION("COMPLETED_THIS_SESSION", 4);

            private static final /* synthetic */ StatusDto[] $values() {
                return new StatusDto[]{STATUS_UNSPECIFIED, BLOCKING_SWAP, BATCHING_WITH_SWAP, NOT_REQUIRED_FOR_SWAP, COMPLETED_THIS_SESSION};
            }

            public /* synthetic */ StatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<StatusDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private StatusDto(String str, int i) {
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ApprovalContextDto.StatusDto.STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class STATUS_UNSPECIFIED extends StatusDto {
                STATUS_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public CryptoTransactionContext.ApprovalContext.Status toProto() {
                    return CryptoTransactionContext.ApprovalContext.Status.STATUS_UNSPECIFIED;
                }
            }

            static {
                StatusDto[] statusDtoArr$values = $values();
                $VALUES = statusDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(statusDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$ApprovalContextDto$StatusDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransactionContextDto.ApprovalContextDto.StatusDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ApprovalContextDto.StatusDto.BLOCKING_SWAP", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class BLOCKING_SWAP extends StatusDto {
                BLOCKING_SWAP(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public CryptoTransactionContext.ApprovalContext.Status toProto() {
                    return CryptoTransactionContext.ApprovalContext.Status.BLOCKING_SWAP;
                }
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ApprovalContextDto.StatusDto.BATCHING_WITH_SWAP", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class BATCHING_WITH_SWAP extends StatusDto {
                BATCHING_WITH_SWAP(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public CryptoTransactionContext.ApprovalContext.Status toProto() {
                    return CryptoTransactionContext.ApprovalContext.Status.BATCHING_WITH_SWAP;
                }
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ApprovalContextDto.StatusDto.NOT_REQUIRED_FOR_SWAP", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class NOT_REQUIRED_FOR_SWAP extends StatusDto {
                NOT_REQUIRED_FOR_SWAP(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public CryptoTransactionContext.ApprovalContext.Status toProto() {
                    return CryptoTransactionContext.ApprovalContext.Status.NOT_REQUIRED_FOR_SWAP;
                }
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoTransactionContextDto.ApprovalContextDto.StatusDto.COMPLETED_THIS_SESSION", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class COMPLETED_THIS_SESSION extends StatusDto {
                COMPLETED_THIS_SESSION(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public CryptoTransactionContext.ApprovalContext.Status toProto() {
                    return CryptoTransactionContext.ApprovalContext.Status.COMPLETED_THIS_SESSION;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$ApprovalContext$Status;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<StatusDto, CryptoTransactionContext.ApprovalContext.Status> {

                /* compiled from: CryptoTransactionContextDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes26.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[CryptoTransactionContext.ApprovalContext.Status.values().length];
                        try {
                            iArr[CryptoTransactionContext.ApprovalContext.Status.STATUS_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CryptoTransactionContext.ApprovalContext.Status.BLOCKING_SWAP.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[CryptoTransactionContext.ApprovalContext.Status.BATCHING_WITH_SWAP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[CryptoTransactionContext.ApprovalContext.Status.NOT_REQUIRED_FOR_SWAP.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[CryptoTransactionContext.ApprovalContext.Status.COMPLETED_THIS_SESSION.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<StatusDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<StatusDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<StatusDto> getBinaryBase64Serializer() {
                    return (KSerializer) StatusDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<CryptoTransactionContext.ApprovalContext.Status> getProtoAdapter() {
                    return CryptoTransactionContext.ApprovalContext.Status.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public StatusDto getZeroValue() {
                    return StatusDto.STATUS_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public StatusDto fromProto(CryptoTransactionContext.ApprovalContext.Status proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return StatusDto.STATUS_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return StatusDto.BLOCKING_SWAP;
                    }
                    if (i == 3) {
                        return StatusDto.BATCHING_WITH_SWAP;
                    }
                    if (i == 4) {
                        return StatusDto.NOT_REQUIRED_FOR_SWAP;
                    }
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return StatusDto.COMPLETED_THIS_SESSION;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$StatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<StatusDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<StatusDto, CryptoTransactionContext.ApprovalContext.Status> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CryptoTransactionContext.ApprovalContext.Status", StatusDto.getEntries(), StatusDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public StatusDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (StatusDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, StatusDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static StatusDto valueOf(String str) {
                return (StatusDto) Enum.valueOf(StatusDto.class, str);
            }

            public static StatusDto[] values() {
                return (StatusDto[]) $VALUES.clone();
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ApprovalContextDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoTransactionContext.ApprovalContext", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ApprovalContextDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ApprovalContextDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ApprovalContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$ApprovalContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4189_5)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$ApprovalContextDto";
            }
        }
    }

    /* compiled from: CryptoTransactionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Holding;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto$Surrogate;)V", "token", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "usd_value", "", "token_value", "(Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;DD)V", "getToken", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "getUsd_value", "()D", "getToken_value", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class HoldingDto implements Dto3<CryptoTransactionContext.Holding>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<HoldingDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<HoldingDto, CryptoTransactionContext.Holding>> binaryBase64Serializer$delegate;
        private static final HoldingDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ HoldingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private HoldingDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final CryptoAssetContextDto getToken() {
            return this.surrogate.getToken();
        }

        public final double getUsd_value() {
            return this.surrogate.getUsd_value();
        }

        public final double getToken_value() {
            return this.surrogate.getToken_value();
        }

        public /* synthetic */ HoldingDto(CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cryptoAssetContextDto, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2);
        }

        public HoldingDto(CryptoAssetContextDto cryptoAssetContextDto, double d, double d2) {
            this(new Surrogate(cryptoAssetContextDto, d, d2));
        }

        public static /* synthetic */ HoldingDto copy$default(HoldingDto holdingDto, CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoAssetContextDto = holdingDto.surrogate.getToken();
            }
            if ((i & 2) != 0) {
                d = holdingDto.surrogate.getUsd_value();
            }
            if ((i & 4) != 0) {
                d2 = holdingDto.surrogate.getToken_value();
            }
            return holdingDto.copy(cryptoAssetContextDto, d, d2);
        }

        public final HoldingDto copy(CryptoAssetContextDto token, double usd_value, double token_value) {
            return new HoldingDto(new Surrogate(token, usd_value, token_value));
        }

        @Override // com.robinhood.idl.Dto
        public CryptoTransactionContext.Holding toProto() {
            CryptoAssetContextDto token = this.surrogate.getToken();
            return new CryptoTransactionContext.Holding(token != null ? token.toProto() : null, this.surrogate.getUsd_value(), this.surrogate.getToken_value(), null, 8, null);
        }

        public String toString() {
            return "[HoldingDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof HoldingDto) && Intrinsics.areEqual(((HoldingDto) other).surrogate, this.surrogate);
            }
            return true;
        }

        public int hashCode() {
            return this.surrogate.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002,-BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\n\u0010\u000bB5\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0018\u0010\u001b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010\u001c\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\rHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R+\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0017¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto$Surrogate;", "", "token", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "usd_value", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "token_value", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;DD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;DDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getToken$annotations", "()V", "getToken", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "getUsd_value$annotations", "getUsd_value", "()D", "getToken_value$annotations", "getToken_value", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final CryptoAssetContextDto token;
            private final double token_value;
            private final double usd_value;

            public Surrogate() {
                this((CryptoAssetContextDto) null, 0.0d, 0.0d, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, int i, Object obj) {
                if ((i & 1) != 0) {
                    cryptoAssetContextDto = surrogate.token;
                }
                if ((i & 2) != 0) {
                    d = surrogate.usd_value;
                }
                if ((i & 4) != 0) {
                    d2 = surrogate.token_value;
                }
                return surrogate.copy(cryptoAssetContextDto, d, d2);
            }

            @SerialName("token")
            @JsonAnnotations2(names = {"token"})
            public static /* synthetic */ void getToken$annotations() {
            }

            @SerialName("tokenValue")
            @JsonAnnotations2(names = {"token_value"})
            public static /* synthetic */ void getToken_value$annotations() {
            }

            @SerialName("usdValue")
            @JsonAnnotations2(names = {"usd_value"})
            public static /* synthetic */ void getUsd_value$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final CryptoAssetContextDto getToken() {
                return this.token;
            }

            /* renamed from: component2, reason: from getter */
            public final double getUsd_value() {
                return this.usd_value;
            }

            /* renamed from: component3, reason: from getter */
            public final double getToken_value() {
                return this.token_value;
            }

            public final Surrogate copy(CryptoAssetContextDto token, double usd_value, double token_value) {
                return new Surrogate(token, usd_value, token_value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.token, surrogate.token) && Double.compare(this.usd_value, surrogate.usd_value) == 0 && Double.compare(this.token_value, surrogate.token_value) == 0;
            }

            public int hashCode() {
                CryptoAssetContextDto cryptoAssetContextDto = this.token;
                return ((((cryptoAssetContextDto == null ? 0 : cryptoAssetContextDto.hashCode()) * 31) + Double.hashCode(this.usd_value)) * 31) + Double.hashCode(this.token_value);
            }

            public String toString() {
                return "Surrogate(token=" + this.token + ", usd_value=" + this.usd_value + ", token_value=" + this.token_value + ")";
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return CryptoTransactionContextDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
                this.token = (i & 1) == 0 ? null : cryptoAssetContextDto;
                if ((i & 2) == 0) {
                    this.usd_value = 0.0d;
                } else {
                    this.usd_value = d;
                }
                if ((i & 4) == 0) {
                    this.token_value = 0.0d;
                } else {
                    this.token_value = d2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                CryptoAssetContextDto cryptoAssetContextDto = self.token;
                if (cryptoAssetContextDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, CryptoAssetContextDto.Serializer.INSTANCE, cryptoAssetContextDto);
                }
                if (Double.compare(self.usd_value, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.usd_value));
                }
                if (Double.compare(self.token_value, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.token_value));
                }
            }

            public Surrogate(CryptoAssetContextDto cryptoAssetContextDto, double d, double d2) {
                this.token = cryptoAssetContextDto;
                this.usd_value = d;
                this.token_value = d2;
            }

            public /* synthetic */ Surrogate(CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : cryptoAssetContextDto, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2);
            }

            public final CryptoAssetContextDto getToken() {
                return this.token;
            }

            public final double getUsd_value() {
                return this.usd_value;
            }

            public final double getToken_value() {
                return this.token_value;
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$Holding;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<HoldingDto, CryptoTransactionContext.Holding> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<HoldingDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<HoldingDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<HoldingDto> getBinaryBase64Serializer() {
                return (KSerializer) HoldingDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoTransactionContext.Holding> getProtoAdapter() {
                return CryptoTransactionContext.Holding.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public HoldingDto getZeroValue() {
                return HoldingDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public HoldingDto fromProto(CryptoTransactionContext.Holding proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                CryptoAssetContext token = proto.getToken();
                return new HoldingDto(new Surrogate(token != null ? CryptoAssetContextDto.INSTANCE.fromProto(token) : null, proto.getUsd_value(), proto.getToken_value()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$HoldingDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTransactionContextDto.HoldingDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new HoldingDto(null, 0.0d, 0.0d, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<HoldingDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoTransactionContext.Holding", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, HoldingDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public HoldingDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new HoldingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$HoldingDto";
            }
        }
    }

    /* compiled from: CryptoTransactionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\fJ*\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TokenHoldingsContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto$Surrogate;)V", "sellTokenHolding", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;", "feeTokenHolding", "buyTokenHolding", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;)V", "getSellTokenHolding", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;", "getFeeTokenHolding", "getBuyTokenHolding", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TokenHoldingsContextDto implements Dto3<CryptoTransactionContext.TokenHoldingsContext>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TokenHoldingsContextDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TokenHoldingsContextDto, CryptoTransactionContext.TokenHoldingsContext>> binaryBase64Serializer$delegate;
        private static final TokenHoldingsContextDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TokenHoldingsContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TokenHoldingsContextDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final HoldingDto getSellTokenHolding() {
            return this.surrogate.getSellTokenHolding();
        }

        public final HoldingDto getFeeTokenHolding() {
            return this.surrogate.getFeeTokenHolding();
        }

        public final HoldingDto getBuyTokenHolding() {
            return this.surrogate.getBuyTokenHolding();
        }

        public /* synthetic */ TokenHoldingsContextDto(HoldingDto holdingDto, HoldingDto holdingDto2, HoldingDto holdingDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : holdingDto, (i & 2) != 0 ? null : holdingDto2, (i & 4) != 0 ? null : holdingDto3);
        }

        public TokenHoldingsContextDto(HoldingDto holdingDto, HoldingDto holdingDto2, HoldingDto holdingDto3) {
            this(new Surrogate(holdingDto, holdingDto2, holdingDto3));
        }

        public static /* synthetic */ TokenHoldingsContextDto copy$default(TokenHoldingsContextDto tokenHoldingsContextDto, HoldingDto holdingDto, HoldingDto holdingDto2, HoldingDto holdingDto3, int i, Object obj) {
            if ((i & 1) != 0) {
                holdingDto = tokenHoldingsContextDto.surrogate.getSellTokenHolding();
            }
            if ((i & 2) != 0) {
                holdingDto2 = tokenHoldingsContextDto.surrogate.getFeeTokenHolding();
            }
            if ((i & 4) != 0) {
                holdingDto3 = tokenHoldingsContextDto.surrogate.getBuyTokenHolding();
            }
            return tokenHoldingsContextDto.copy(holdingDto, holdingDto2, holdingDto3);
        }

        public final TokenHoldingsContextDto copy(HoldingDto sellTokenHolding, HoldingDto feeTokenHolding, HoldingDto buyTokenHolding) {
            return new TokenHoldingsContextDto(new Surrogate(sellTokenHolding, feeTokenHolding, buyTokenHolding));
        }

        @Override // com.robinhood.idl.Dto
        public CryptoTransactionContext.TokenHoldingsContext toProto() {
            HoldingDto sellTokenHolding = this.surrogate.getSellTokenHolding();
            CryptoTransactionContext.Holding proto = sellTokenHolding != null ? sellTokenHolding.toProto() : null;
            HoldingDto feeTokenHolding = this.surrogate.getFeeTokenHolding();
            CryptoTransactionContext.Holding proto2 = feeTokenHolding != null ? feeTokenHolding.toProto() : null;
            HoldingDto buyTokenHolding = this.surrogate.getBuyTokenHolding();
            return new CryptoTransactionContext.TokenHoldingsContext(proto, proto2, buyTokenHolding != null ? buyTokenHolding.toProto() : null, null, 8, null);
        }

        public String toString() {
            return "[TokenHoldingsContextDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TokenHoldingsContextDto) && Intrinsics.areEqual(((TokenHoldingsContextDto) other).surrogate, this.surrogate);
            }
            return true;
        }

        public int hashCode() {
            return this.surrogate.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002'(B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto$Surrogate;", "", "sellTokenHolding", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;", "feeTokenHolding", "buyTokenHolding", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSellTokenHolding$annotations", "()V", "getSellTokenHolding", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$HoldingDto;", "getFeeTokenHolding$annotations", "getFeeTokenHolding", "getBuyTokenHolding$annotations", "getBuyTokenHolding", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final HoldingDto buyTokenHolding;
            private final HoldingDto feeTokenHolding;
            private final HoldingDto sellTokenHolding;

            public Surrogate() {
                this((HoldingDto) null, (HoldingDto) null, (HoldingDto) null, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, HoldingDto holdingDto, HoldingDto holdingDto2, HoldingDto holdingDto3, int i, Object obj) {
                if ((i & 1) != 0) {
                    holdingDto = surrogate.sellTokenHolding;
                }
                if ((i & 2) != 0) {
                    holdingDto2 = surrogate.feeTokenHolding;
                }
                if ((i & 4) != 0) {
                    holdingDto3 = surrogate.buyTokenHolding;
                }
                return surrogate.copy(holdingDto, holdingDto2, holdingDto3);
            }

            @SerialName("buyTokenHolding")
            @JsonAnnotations2(names = {"buyTokenHolding"})
            public static /* synthetic */ void getBuyTokenHolding$annotations() {
            }

            @SerialName("feeTokenHolding")
            @JsonAnnotations2(names = {"feeTokenHolding"})
            public static /* synthetic */ void getFeeTokenHolding$annotations() {
            }

            @SerialName("sellTokenHolding")
            @JsonAnnotations2(names = {"sellTokenHolding"})
            public static /* synthetic */ void getSellTokenHolding$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final HoldingDto getSellTokenHolding() {
                return this.sellTokenHolding;
            }

            /* renamed from: component2, reason: from getter */
            public final HoldingDto getFeeTokenHolding() {
                return this.feeTokenHolding;
            }

            /* renamed from: component3, reason: from getter */
            public final HoldingDto getBuyTokenHolding() {
                return this.buyTokenHolding;
            }

            public final Surrogate copy(HoldingDto sellTokenHolding, HoldingDto feeTokenHolding, HoldingDto buyTokenHolding) {
                return new Surrogate(sellTokenHolding, feeTokenHolding, buyTokenHolding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.sellTokenHolding, surrogate.sellTokenHolding) && Intrinsics.areEqual(this.feeTokenHolding, surrogate.feeTokenHolding) && Intrinsics.areEqual(this.buyTokenHolding, surrogate.buyTokenHolding);
            }

            public int hashCode() {
                HoldingDto holdingDto = this.sellTokenHolding;
                int iHashCode = (holdingDto == null ? 0 : holdingDto.hashCode()) * 31;
                HoldingDto holdingDto2 = this.feeTokenHolding;
                int iHashCode2 = (iHashCode + (holdingDto2 == null ? 0 : holdingDto2.hashCode())) * 31;
                HoldingDto holdingDto3 = this.buyTokenHolding;
                return iHashCode2 + (holdingDto3 != null ? holdingDto3.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(sellTokenHolding=" + this.sellTokenHolding + ", feeTokenHolding=" + this.feeTokenHolding + ", buyTokenHolding=" + this.buyTokenHolding + ")";
            }

            /* compiled from: CryptoTransactionContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return CryptoTransactionContextDto7.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, HoldingDto holdingDto, HoldingDto holdingDto2, HoldingDto holdingDto3, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.sellTokenHolding = null;
                } else {
                    this.sellTokenHolding = holdingDto;
                }
                if ((i & 2) == 0) {
                    this.feeTokenHolding = null;
                } else {
                    this.feeTokenHolding = holdingDto2;
                }
                if ((i & 4) == 0) {
                    this.buyTokenHolding = null;
                } else {
                    this.buyTokenHolding = holdingDto3;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                HoldingDto holdingDto = self.sellTokenHolding;
                if (holdingDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, HoldingDto.Serializer.INSTANCE, holdingDto);
                }
                HoldingDto holdingDto2 = self.feeTokenHolding;
                if (holdingDto2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, HoldingDto.Serializer.INSTANCE, holdingDto2);
                }
                HoldingDto holdingDto3 = self.buyTokenHolding;
                if (holdingDto3 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, HoldingDto.Serializer.INSTANCE, holdingDto3);
                }
            }

            public Surrogate(HoldingDto holdingDto, HoldingDto holdingDto2, HoldingDto holdingDto3) {
                this.sellTokenHolding = holdingDto;
                this.feeTokenHolding = holdingDto2;
                this.buyTokenHolding = holdingDto3;
            }

            public /* synthetic */ Surrogate(HoldingDto holdingDto, HoldingDto holdingDto2, HoldingDto holdingDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : holdingDto, (i & 2) != 0 ? null : holdingDto2, (i & 4) != 0 ? null : holdingDto3);
            }

            public final HoldingDto getSellTokenHolding() {
                return this.sellTokenHolding;
            }

            public final HoldingDto getFeeTokenHolding() {
                return this.feeTokenHolding;
            }

            public final HoldingDto getBuyTokenHolding() {
                return this.buyTokenHolding;
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContext$TokenHoldingsContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<TokenHoldingsContextDto, CryptoTransactionContext.TokenHoldingsContext> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TokenHoldingsContextDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TokenHoldingsContextDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TokenHoldingsContextDto> getBinaryBase64Serializer() {
                return (KSerializer) TokenHoldingsContextDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoTransactionContext.TokenHoldingsContext> getProtoAdapter() {
                return CryptoTransactionContext.TokenHoldingsContext.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TokenHoldingsContextDto getZeroValue() {
                return TokenHoldingsContextDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TokenHoldingsContextDto fromProto(CryptoTransactionContext.TokenHoldingsContext proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                CryptoTransactionContext.Holding sellTokenHolding = proto.getSellTokenHolding();
                DefaultConstructorMarker defaultConstructorMarker = null;
                HoldingDto holdingDtoFromProto = sellTokenHolding != null ? HoldingDto.INSTANCE.fromProto(sellTokenHolding) : null;
                CryptoTransactionContext.Holding feeTokenHolding = proto.getFeeTokenHolding();
                HoldingDto holdingDtoFromProto2 = feeTokenHolding != null ? HoldingDto.INSTANCE.fromProto(feeTokenHolding) : null;
                CryptoTransactionContext.Holding buyTokenHolding = proto.getBuyTokenHolding();
                return new TokenHoldingsContextDto(new Surrogate(holdingDtoFromProto, holdingDtoFromProto2, buyTokenHolding != null ? HoldingDto.INSTANCE.fromProto(buyTokenHolding) : null), defaultConstructorMarker);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$TokenHoldingsContextDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTransactionContextDto.TokenHoldingsContextDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TokenHoldingsContextDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TokenHoldingsContextDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoTransactionContext.TokenHoldingsContext", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TokenHoldingsContextDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TokenHoldingsContextDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TokenHoldingsContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: CryptoTransactionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$TokenHoldingsContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4185_1)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto$TokenHoldingsContextDto";
            }
        }
    }

    /* compiled from: CryptoTransactionContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CryptoTransactionContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoTransactionContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoTransactionContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoTransactionContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoTransactionContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoTransactionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransactionContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CryptoTransactionContextDto";
        }
    }
}
