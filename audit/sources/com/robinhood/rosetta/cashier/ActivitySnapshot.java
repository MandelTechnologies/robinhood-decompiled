package com.robinhood.rosetta.cashier;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;
import com.robinhood.rosetta.cashier.ActivitySnapshot;
import com.robinhood.rosetta.common.RequestContext;
import com.robinhood.rosetta.i18n.Locality;
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
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: ActivitySnapshot.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bJ\u0018\u0000 \u0083\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0083\u0001\u0084\u0001B§\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00101\u001a\u00020\u0003¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0002H\u0017¢\u0006\u0004\b4\u00105J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0007H\u0016¢\u0006\u0004\b>\u0010?J\u00ad\u0002\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\b\b\u0002\u00101\u001a\u00020\u0003¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010H\u001a\u0004\bI\u0010?R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bK\u0010LR\"\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bP\u0010?R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bQ\u0010GR\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bR\u0010DR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\\\u001a\u0004\b]\u0010^R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010b\u001a\u0004\bc\u0010dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010e\u001a\u0004\bf\u0010gR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010h\u001a\u0004\bi\u0010jR\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010k\u001a\u0004\bl\u0010mR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010n\u001a\u0004\bo\u0010pR\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010q\u001a\u0004\br\u0010sR\u001c\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010t\u001a\u0004\bu\u0010vR\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010w\u001a\u0004\bx\u0010yR\u001c\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010z\u001a\u0004\b{\u0010|R\u001c\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010}\u001a\u0004\b~\u0010\u007fR\u001f\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b0\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0085\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshot;", "Lcom/squareup/wire/Message;", "", "Lokio/ByteString;", "object_id", "", "account_number", "", "account_id", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "context", "ordering_id", MatchaQrCodeDuxo6.USER_ID_KEY, "Lcom/robinhood/rosetta/common/RequestContext;", "request_context", "Lcom/robinhood/rosetta/i18n/Locality;", PlaceTypes.COUNTRY, "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails;", "ach_relationship_details", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails;", "ach_transfer_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails;", "checkout_card_relationship_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails;", "checkout_card_deposit_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails;", "checkout_card_withdrawal_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails;", "checkout_card_dispute_details", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails;", "checkout_card_dispute_fee_details", "Lcom/robinhood/rosetta/cashier/BankBalanceDetails;", "bank_balance_details", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails;", "iav_queued_deposit_details", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails;", "received_ach_transfer_details", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails;", "received_instant_bank_transfer_details", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetails;", "plaid_signal_details", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails;", "ach_deposit_schedule_details", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetails;", "plaid_identity_update_details", "unknownFields", "<init>", "(Lokio/ByteString;JLjava/lang/String;Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;Lj$/time/Instant;Ljava/lang/String;JLokio/ByteString;Lcom/robinhood/rosetta/common/RequestContext;Lcom/robinhood/rosetta/i18n/Locality;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails;Lcom/robinhood/rosetta/cashier/ACHTransferDetails;Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails;Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails;Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails;Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails;Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails;Lcom/robinhood/rosetta/cashier/BankBalanceDetails;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails;Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails;Lcom/robinhood/rosetta/cashier/PlaidSignalDetails;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails;Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetails;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;JLjava/lang/String;Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;Lj$/time/Instant;Ljava/lang/String;JLokio/ByteString;Lcom/robinhood/rosetta/common/RequestContext;Lcom/robinhood/rosetta/i18n/Locality;Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails;Lcom/robinhood/rosetta/cashier/ACHTransferDetails;Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails;Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails;Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails;Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails;Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails;Lcom/robinhood/rosetta/cashier/BankBalanceDetails;Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails;Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails;Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails;Lcom/robinhood/rosetta/cashier/PlaidSignalDetails;Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails;Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetails;Lokio/ByteString;)Lcom/robinhood/rosetta/cashier/ActivitySnapshot;", "Lokio/ByteString;", "getObject_id", "()Lokio/ByteString;", "J", "getAccount_number", "()J", "Ljava/lang/String;", "getAccount_id", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "getType", "()Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getContext", "getOrdering_id", "getUser_id", "Lcom/robinhood/rosetta/common/RequestContext;", "getRequest_context", "()Lcom/robinhood/rosetta/common/RequestContext;", "Lcom/robinhood/rosetta/i18n/Locality;", "getCountry", "()Lcom/robinhood/rosetta/i18n/Locality;", "Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails;", "getAch_relationship_details", "()Lcom/robinhood/rosetta/cashier/ACHRelationshipDetails;", "Lcom/robinhood/rosetta/cashier/ACHTransferDetails;", "getAch_transfer_details", "()Lcom/robinhood/rosetta/cashier/ACHTransferDetails;", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails;", "getCheckout_card_relationship_details", "()Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails;", "getCheckout_card_deposit_details", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDepositDetails;", "Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails;", "getCheckout_card_withdrawal_details", "()Lcom/robinhood/rosetta/cashier/CheckoutCardWithdrawalDetails;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails;", "getCheckout_card_dispute_details", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeDetails;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails;", "getCheckout_card_dispute_fee_details", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails;", "Lcom/robinhood/rosetta/cashier/BankBalanceDetails;", "getBank_balance_details", "()Lcom/robinhood/rosetta/cashier/BankBalanceDetails;", "Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails;", "getIav_queued_deposit_details", "()Lcom/robinhood/rosetta/cashier/IAVQueuedDepositDetails;", "Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails;", "getReceived_ach_transfer_details", "()Lcom/robinhood/rosetta/cashier/ReceivedACHTransferDetails;", "Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails;", "getReceived_instant_bank_transfer_details", "()Lcom/robinhood/rosetta/cashier/ReceivedInstantBankTransferDetails;", "Lcom/robinhood/rosetta/cashier/PlaidSignalDetails;", "getPlaid_signal_details", "()Lcom/robinhood/rosetta/cashier/PlaidSignalDetails;", "Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails;", "getAch_deposit_schedule_details", "()Lcom/robinhood/rosetta/cashier/ACHDepositScheduleDetails;", "Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetails;", "getPlaid_identity_update_details", "()Lcom/robinhood/rosetta/cashier/PlaidIdentityUpdateDetails;", "Companion", "Type", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ActivitySnapshot extends Message {

    @JvmField
    public static final ProtoAdapter<ActivitySnapshot> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 9)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long account_number;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHDepositScheduleDetails#ADAPTER", jsonName = "achDepositScheduleDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 22, tag = 28)
    private final ACHDepositScheduleDetails ach_deposit_schedule_details;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHRelationshipDetails#ADAPTER", jsonName = "achRelationshipDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 10, tag = 16)
    private final ACHRelationshipDetails ach_relationship_details;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ACHTransferDetails#ADAPTER", jsonName = "achTransferDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 11, tag = 23)
    private final ACHTransferDetails ach_transfer_details;

    @WireField(adapter = "com.robinhood.rosetta.cashier.BankBalanceDetails#ADAPTER", jsonName = "bankBalanceDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 17, tag = 20)
    private final BankBalanceDetails bank_balance_details;

    @WireField(adapter = "com.robinhood.rosetta.cashier.CheckoutCardDepositDetails#ADAPTER", jsonName = "checkoutCardDepositDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 13, tag = 18)
    private final CheckoutCardDepositDetails checkout_card_deposit_details;

    @WireField(adapter = "com.robinhood.rosetta.cashier.CheckoutCardDisputeDetails#ADAPTER", jsonName = "checkoutCardDisputeDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 15, tag = 21)
    private final CheckoutCardDisputeDetails checkout_card_dispute_details;

    @WireField(adapter = "com.robinhood.rosetta.cashier.CheckoutCardDisputeFeeDetails#ADAPTER", jsonName = "checkoutCardDisputeFeeDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 16, tag = 22)
    private final CheckoutCardDisputeFeeDetails checkout_card_dispute_fee_details;

    @WireField(adapter = "com.robinhood.rosetta.cashier.CheckoutCardRelationshipDetails#ADAPTER", jsonName = "checkoutCardRelationshipDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 12, tag = 17)
    private final CheckoutCardRelationshipDetails checkout_card_relationship_details;

    @WireField(adapter = "com.robinhood.rosetta.cashier.CheckoutCardWithdrawalDetails#ADAPTER", jsonName = "checkoutCardWithdrawalDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 14, tag = 19)
    private final CheckoutCardWithdrawalDetails checkout_card_withdrawal_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 5)
    private final String context;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Locality country;

    @WireField(adapter = "com.robinhood.rosetta.cashier.IAVQueuedDepositDetails#ADAPTER", jsonName = "iavQueuedDepositDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 18, tag = 24)
    private final IAVQueuedDepositDetails iav_queued_deposit_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "objectId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString object_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "orderingId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 6)
    private final long ordering_id;

    @WireField(adapter = "com.robinhood.rosetta.cashier.PlaidIdentityUpdateDetails#ADAPTER", jsonName = "plaidIdentityUpdateDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 23, tag = 29)
    private final PlaidIdentityUpdateDetails plaid_identity_update_details;

    @WireField(adapter = "com.robinhood.rosetta.cashier.PlaidSignalDetails#ADAPTER", jsonName = "plaidSignalDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 21, tag = 27)
    private final PlaidSignalDetails plaid_signal_details;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ReceivedACHTransferDetails#ADAPTER", jsonName = "receivedAchTransferDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 19, tag = 25)
    private final ReceivedACHTransferDetails received_ach_transfer_details;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ReceivedInstantBankTransferDetails#ADAPTER", jsonName = "receivedInstantBankTransferDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 20, tag = 26)
    private final ReceivedInstantBankTransferDetails received_instant_bank_transfer_details;

    @WireField(adapter = "com.robinhood.rosetta.common.RequestContext#ADAPTER", jsonName = "requestContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 8)
    private final RequestContext request_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final Instant timestamp;

    @WireField(adapter = "com.robinhood.rosetta.cashier.ActivitySnapshot$Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final Type type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 7)
    private final ByteString user_id;

    public ActivitySnapshot() {
        this(null, 0L, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23959newBuilder();
    }

    public final ByteString getObject_id() {
        return this.object_id;
    }

    public /* synthetic */ ActivitySnapshot(ByteString byteString, long j, String str, Type type2, Instant instant, String str2, long j2, ByteString byteString2, RequestContext requestContext, Locality locality, ACHRelationshipDetails aCHRelationshipDetails, ACHTransferDetails aCHTransferDetails, CheckoutCardRelationshipDetails checkoutCardRelationshipDetails, CheckoutCardDepositDetails checkoutCardDepositDetails, CheckoutCardWithdrawalDetails checkoutCardWithdrawalDetails, CheckoutCardDisputeDetails checkoutCardDisputeDetails, CheckoutCardDisputeFeeDetails checkoutCardDisputeFeeDetails, BankBalanceDetails bankBalanceDetails, IAVQueuedDepositDetails iAVQueuedDepositDetails, ReceivedACHTransferDetails receivedACHTransferDetails, ReceivedInstantBankTransferDetails receivedInstantBankTransferDetails, PlaidSignalDetails plaidSignalDetails, ACHDepositScheduleDetails aCHDepositScheduleDetails, PlaidIdentityUpdateDetails plaidIdentityUpdateDetails, ByteString byteString3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? Type.TYPE_UNSPECIFIED : type2, (i & 16) != 0 ? null : instant, (i & 32) == 0 ? str2 : "", (i & 64) == 0 ? j2 : 0L, (i & 128) != 0 ? ByteString.EMPTY : byteString2, (i & 256) != 0 ? null : requestContext, (i & 512) != 0 ? Locality.LOCALITY_UNSPECIFIED : locality, (i & 1024) != 0 ? null : aCHRelationshipDetails, (i & 2048) != 0 ? null : aCHTransferDetails, (i & 4096) != 0 ? null : checkoutCardRelationshipDetails, (i & 8192) != 0 ? null : checkoutCardDepositDetails, (i & 16384) != 0 ? null : checkoutCardWithdrawalDetails, (i & 32768) != 0 ? null : checkoutCardDisputeDetails, (i & 65536) != 0 ? null : checkoutCardDisputeFeeDetails, (i & 131072) != 0 ? null : bankBalanceDetails, (i & 262144) != 0 ? null : iAVQueuedDepositDetails, (i & 524288) != 0 ? null : receivedACHTransferDetails, (i & 1048576) != 0 ? null : receivedInstantBankTransferDetails, (i & 2097152) != 0 ? null : plaidSignalDetails, (i & 4194304) != 0 ? null : aCHDepositScheduleDetails, (i & 8388608) != 0 ? null : plaidIdentityUpdateDetails, (i & 16777216) != 0 ? ByteString.EMPTY : byteString3);
    }

    public final long getAccount_number() {
        return this.account_number;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final Type getType() {
        return this.type;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getContext() {
        return this.context;
    }

    public final long getOrdering_id() {
        return this.ordering_id;
    }

    public final ByteString getUser_id() {
        return this.user_id;
    }

    public final RequestContext getRequest_context() {
        return this.request_context;
    }

    public final Locality getCountry() {
        return this.country;
    }

    public final ACHRelationshipDetails getAch_relationship_details() {
        return this.ach_relationship_details;
    }

    public final ACHTransferDetails getAch_transfer_details() {
        return this.ach_transfer_details;
    }

    public final CheckoutCardRelationshipDetails getCheckout_card_relationship_details() {
        return this.checkout_card_relationship_details;
    }

    public final CheckoutCardDepositDetails getCheckout_card_deposit_details() {
        return this.checkout_card_deposit_details;
    }

    public final CheckoutCardWithdrawalDetails getCheckout_card_withdrawal_details() {
        return this.checkout_card_withdrawal_details;
    }

    public final CheckoutCardDisputeDetails getCheckout_card_dispute_details() {
        return this.checkout_card_dispute_details;
    }

    public final CheckoutCardDisputeFeeDetails getCheckout_card_dispute_fee_details() {
        return this.checkout_card_dispute_fee_details;
    }

    public final BankBalanceDetails getBank_balance_details() {
        return this.bank_balance_details;
    }

    public final IAVQueuedDepositDetails getIav_queued_deposit_details() {
        return this.iav_queued_deposit_details;
    }

    public final ReceivedACHTransferDetails getReceived_ach_transfer_details() {
        return this.received_ach_transfer_details;
    }

    public final ReceivedInstantBankTransferDetails getReceived_instant_bank_transfer_details() {
        return this.received_instant_bank_transfer_details;
    }

    public final PlaidSignalDetails getPlaid_signal_details() {
        return this.plaid_signal_details;
    }

    public final ACHDepositScheduleDetails getAch_deposit_schedule_details() {
        return this.ach_deposit_schedule_details;
    }

    public final PlaidIdentityUpdateDetails getPlaid_identity_update_details() {
        return this.plaid_identity_update_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySnapshot(ByteString object_id, long j, String account_id, Type type2, Instant instant, String context, long j2, ByteString user_id, RequestContext requestContext, Locality country, ACHRelationshipDetails aCHRelationshipDetails, ACHTransferDetails aCHTransferDetails, CheckoutCardRelationshipDetails checkoutCardRelationshipDetails, CheckoutCardDepositDetails checkoutCardDepositDetails, CheckoutCardWithdrawalDetails checkoutCardWithdrawalDetails, CheckoutCardDisputeDetails checkoutCardDisputeDetails, CheckoutCardDisputeFeeDetails checkoutCardDisputeFeeDetails, BankBalanceDetails bankBalanceDetails, IAVQueuedDepositDetails iAVQueuedDepositDetails, ReceivedACHTransferDetails receivedACHTransferDetails, ReceivedInstantBankTransferDetails receivedInstantBankTransferDetails, PlaidSignalDetails plaidSignalDetails, ACHDepositScheduleDetails aCHDepositScheduleDetails, PlaidIdentityUpdateDetails plaidIdentityUpdateDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(object_id, "object_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.object_id = object_id;
        this.account_number = j;
        this.account_id = account_id;
        this.type = type2;
        this.timestamp = instant;
        this.context = context;
        this.ordering_id = j2;
        this.user_id = user_id;
        this.request_context = requestContext;
        this.country = country;
        this.ach_relationship_details = aCHRelationshipDetails;
        this.ach_transfer_details = aCHTransferDetails;
        this.checkout_card_relationship_details = checkoutCardRelationshipDetails;
        this.checkout_card_deposit_details = checkoutCardDepositDetails;
        this.checkout_card_withdrawal_details = checkoutCardWithdrawalDetails;
        this.checkout_card_dispute_details = checkoutCardDisputeDetails;
        this.checkout_card_dispute_fee_details = checkoutCardDisputeFeeDetails;
        this.bank_balance_details = bankBalanceDetails;
        this.iav_queued_deposit_details = iAVQueuedDepositDetails;
        this.received_ach_transfer_details = receivedACHTransferDetails;
        this.received_instant_bank_transfer_details = receivedInstantBankTransferDetails;
        this.plaid_signal_details = plaidSignalDetails;
        this.ach_deposit_schedule_details = aCHDepositScheduleDetails;
        this.plaid_identity_update_details = plaidIdentityUpdateDetails;
        if (Internal.countNonNull(aCHRelationshipDetails, aCHTransferDetails, checkoutCardRelationshipDetails, checkoutCardDepositDetails, checkoutCardWithdrawalDetails, checkoutCardDisputeDetails, checkoutCardDisputeFeeDetails, bankBalanceDetails, iAVQueuedDepositDetails, receivedACHTransferDetails, receivedInstantBankTransferDetails, plaidSignalDetails, aCHDepositScheduleDetails, plaidIdentityUpdateDetails) > 1) {
            throw new IllegalArgumentException("At most one of ach_relationship_details, ach_transfer_details, checkout_card_relationship_details, checkout_card_deposit_details, checkout_card_withdrawal_details, checkout_card_dispute_details, checkout_card_dispute_fee_details, bank_balance_details, iav_queued_deposit_details, received_ach_transfer_details, received_instant_bank_transfer_details, plaid_signal_details, ach_deposit_schedule_details, plaid_identity_update_details may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23959newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ActivitySnapshot)) {
            return false;
        }
        ActivitySnapshot activitySnapshot = (ActivitySnapshot) other;
        return Intrinsics.areEqual(unknownFields(), activitySnapshot.unknownFields()) && Intrinsics.areEqual(this.object_id, activitySnapshot.object_id) && this.account_number == activitySnapshot.account_number && Intrinsics.areEqual(this.account_id, activitySnapshot.account_id) && this.type == activitySnapshot.type && Intrinsics.areEqual(this.timestamp, activitySnapshot.timestamp) && Intrinsics.areEqual(this.context, activitySnapshot.context) && this.ordering_id == activitySnapshot.ordering_id && Intrinsics.areEqual(this.user_id, activitySnapshot.user_id) && Intrinsics.areEqual(this.request_context, activitySnapshot.request_context) && this.country == activitySnapshot.country && Intrinsics.areEqual(this.ach_relationship_details, activitySnapshot.ach_relationship_details) && Intrinsics.areEqual(this.ach_transfer_details, activitySnapshot.ach_transfer_details) && Intrinsics.areEqual(this.checkout_card_relationship_details, activitySnapshot.checkout_card_relationship_details) && Intrinsics.areEqual(this.checkout_card_deposit_details, activitySnapshot.checkout_card_deposit_details) && Intrinsics.areEqual(this.checkout_card_withdrawal_details, activitySnapshot.checkout_card_withdrawal_details) && Intrinsics.areEqual(this.checkout_card_dispute_details, activitySnapshot.checkout_card_dispute_details) && Intrinsics.areEqual(this.checkout_card_dispute_fee_details, activitySnapshot.checkout_card_dispute_fee_details) && Intrinsics.areEqual(this.bank_balance_details, activitySnapshot.bank_balance_details) && Intrinsics.areEqual(this.iav_queued_deposit_details, activitySnapshot.iav_queued_deposit_details) && Intrinsics.areEqual(this.received_ach_transfer_details, activitySnapshot.received_ach_transfer_details) && Intrinsics.areEqual(this.received_instant_bank_transfer_details, activitySnapshot.received_instant_bank_transfer_details) && Intrinsics.areEqual(this.plaid_signal_details, activitySnapshot.plaid_signal_details) && Intrinsics.areEqual(this.ach_deposit_schedule_details, activitySnapshot.ach_deposit_schedule_details) && Intrinsics.areEqual(this.plaid_identity_update_details, activitySnapshot.plaid_identity_update_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.object_id.hashCode()) * 37) + Long.hashCode(this.account_number)) * 37) + this.account_id.hashCode()) * 37) + this.type.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.context.hashCode()) * 37) + Long.hashCode(this.ordering_id)) * 37) + this.user_id.hashCode()) * 37;
        RequestContext requestContext = this.request_context;
        int iHashCode3 = (((iHashCode2 + (requestContext != null ? requestContext.hashCode() : 0)) * 37) + this.country.hashCode()) * 37;
        ACHRelationshipDetails aCHRelationshipDetails = this.ach_relationship_details;
        int iHashCode4 = (iHashCode3 + (aCHRelationshipDetails != null ? aCHRelationshipDetails.hashCode() : 0)) * 37;
        ACHTransferDetails aCHTransferDetails = this.ach_transfer_details;
        int iHashCode5 = (iHashCode4 + (aCHTransferDetails != null ? aCHTransferDetails.hashCode() : 0)) * 37;
        CheckoutCardRelationshipDetails checkoutCardRelationshipDetails = this.checkout_card_relationship_details;
        int iHashCode6 = (iHashCode5 + (checkoutCardRelationshipDetails != null ? checkoutCardRelationshipDetails.hashCode() : 0)) * 37;
        CheckoutCardDepositDetails checkoutCardDepositDetails = this.checkout_card_deposit_details;
        int iHashCode7 = (iHashCode6 + (checkoutCardDepositDetails != null ? checkoutCardDepositDetails.hashCode() : 0)) * 37;
        CheckoutCardWithdrawalDetails checkoutCardWithdrawalDetails = this.checkout_card_withdrawal_details;
        int iHashCode8 = (iHashCode7 + (checkoutCardWithdrawalDetails != null ? checkoutCardWithdrawalDetails.hashCode() : 0)) * 37;
        CheckoutCardDisputeDetails checkoutCardDisputeDetails = this.checkout_card_dispute_details;
        int iHashCode9 = (iHashCode8 + (checkoutCardDisputeDetails != null ? checkoutCardDisputeDetails.hashCode() : 0)) * 37;
        CheckoutCardDisputeFeeDetails checkoutCardDisputeFeeDetails = this.checkout_card_dispute_fee_details;
        int iHashCode10 = (iHashCode9 + (checkoutCardDisputeFeeDetails != null ? checkoutCardDisputeFeeDetails.hashCode() : 0)) * 37;
        BankBalanceDetails bankBalanceDetails = this.bank_balance_details;
        int iHashCode11 = (iHashCode10 + (bankBalanceDetails != null ? bankBalanceDetails.hashCode() : 0)) * 37;
        IAVQueuedDepositDetails iAVQueuedDepositDetails = this.iav_queued_deposit_details;
        int iHashCode12 = (iHashCode11 + (iAVQueuedDepositDetails != null ? iAVQueuedDepositDetails.hashCode() : 0)) * 37;
        ReceivedACHTransferDetails receivedACHTransferDetails = this.received_ach_transfer_details;
        int iHashCode13 = (iHashCode12 + (receivedACHTransferDetails != null ? receivedACHTransferDetails.hashCode() : 0)) * 37;
        ReceivedInstantBankTransferDetails receivedInstantBankTransferDetails = this.received_instant_bank_transfer_details;
        int iHashCode14 = (iHashCode13 + (receivedInstantBankTransferDetails != null ? receivedInstantBankTransferDetails.hashCode() : 0)) * 37;
        PlaidSignalDetails plaidSignalDetails = this.plaid_signal_details;
        int iHashCode15 = (iHashCode14 + (plaidSignalDetails != null ? plaidSignalDetails.hashCode() : 0)) * 37;
        ACHDepositScheduleDetails aCHDepositScheduleDetails = this.ach_deposit_schedule_details;
        int iHashCode16 = (iHashCode15 + (aCHDepositScheduleDetails != null ? aCHDepositScheduleDetails.hashCode() : 0)) * 37;
        PlaidIdentityUpdateDetails plaidIdentityUpdateDetails = this.plaid_identity_update_details;
        int iHashCode17 = iHashCode16 + (plaidIdentityUpdateDetails != null ? plaidIdentityUpdateDetails.hashCode() : 0);
        this.hashCode = iHashCode17;
        return iHashCode17;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("object_id=" + this.object_id);
        arrayList.add("account_number=" + this.account_number);
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("type=" + this.type);
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("context=" + Internal.sanitize(this.context));
        arrayList.add("ordering_id=" + this.ordering_id);
        arrayList.add("user_id=" + this.user_id);
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            arrayList.add("request_context=" + requestContext);
        }
        arrayList.add("country=" + this.country);
        ACHRelationshipDetails aCHRelationshipDetails = this.ach_relationship_details;
        if (aCHRelationshipDetails != null) {
            arrayList.add("ach_relationship_details=" + aCHRelationshipDetails);
        }
        ACHTransferDetails aCHTransferDetails = this.ach_transfer_details;
        if (aCHTransferDetails != null) {
            arrayList.add("ach_transfer_details=" + aCHTransferDetails);
        }
        CheckoutCardRelationshipDetails checkoutCardRelationshipDetails = this.checkout_card_relationship_details;
        if (checkoutCardRelationshipDetails != null) {
            arrayList.add("checkout_card_relationship_details=" + checkoutCardRelationshipDetails);
        }
        CheckoutCardDepositDetails checkoutCardDepositDetails = this.checkout_card_deposit_details;
        if (checkoutCardDepositDetails != null) {
            arrayList.add("checkout_card_deposit_details=" + checkoutCardDepositDetails);
        }
        CheckoutCardWithdrawalDetails checkoutCardWithdrawalDetails = this.checkout_card_withdrawal_details;
        if (checkoutCardWithdrawalDetails != null) {
            arrayList.add("checkout_card_withdrawal_details=" + checkoutCardWithdrawalDetails);
        }
        CheckoutCardDisputeDetails checkoutCardDisputeDetails = this.checkout_card_dispute_details;
        if (checkoutCardDisputeDetails != null) {
            arrayList.add("checkout_card_dispute_details=" + checkoutCardDisputeDetails);
        }
        CheckoutCardDisputeFeeDetails checkoutCardDisputeFeeDetails = this.checkout_card_dispute_fee_details;
        if (checkoutCardDisputeFeeDetails != null) {
            arrayList.add("checkout_card_dispute_fee_details=" + checkoutCardDisputeFeeDetails);
        }
        BankBalanceDetails bankBalanceDetails = this.bank_balance_details;
        if (bankBalanceDetails != null) {
            arrayList.add("bank_balance_details=" + bankBalanceDetails);
        }
        IAVQueuedDepositDetails iAVQueuedDepositDetails = this.iav_queued_deposit_details;
        if (iAVQueuedDepositDetails != null) {
            arrayList.add("iav_queued_deposit_details=" + iAVQueuedDepositDetails);
        }
        ReceivedACHTransferDetails receivedACHTransferDetails = this.received_ach_transfer_details;
        if (receivedACHTransferDetails != null) {
            arrayList.add("received_ach_transfer_details=" + receivedACHTransferDetails);
        }
        ReceivedInstantBankTransferDetails receivedInstantBankTransferDetails = this.received_instant_bank_transfer_details;
        if (receivedInstantBankTransferDetails != null) {
            arrayList.add("received_instant_bank_transfer_details=" + receivedInstantBankTransferDetails);
        }
        PlaidSignalDetails plaidSignalDetails = this.plaid_signal_details;
        if (plaidSignalDetails != null) {
            arrayList.add("plaid_signal_details=" + plaidSignalDetails);
        }
        ACHDepositScheduleDetails aCHDepositScheduleDetails = this.ach_deposit_schedule_details;
        if (aCHDepositScheduleDetails != null) {
            arrayList.add("ach_deposit_schedule_details=" + aCHDepositScheduleDetails);
        }
        PlaidIdentityUpdateDetails plaidIdentityUpdateDetails = this.plaid_identity_update_details;
        if (plaidIdentityUpdateDetails != null) {
            arrayList.add("plaid_identity_update_details=" + plaidIdentityUpdateDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySnapshot{", "}", 0, null, null, 56, null);
    }

    public final ActivitySnapshot copy(ByteString object_id, long account_number, String account_id, Type type2, Instant timestamp, String context, long ordering_id, ByteString user_id, RequestContext request_context, Locality country, ACHRelationshipDetails ach_relationship_details, ACHTransferDetails ach_transfer_details, CheckoutCardRelationshipDetails checkout_card_relationship_details, CheckoutCardDepositDetails checkout_card_deposit_details, CheckoutCardWithdrawalDetails checkout_card_withdrawal_details, CheckoutCardDisputeDetails checkout_card_dispute_details, CheckoutCardDisputeFeeDetails checkout_card_dispute_fee_details, BankBalanceDetails bank_balance_details, IAVQueuedDepositDetails iav_queued_deposit_details, ReceivedACHTransferDetails received_ach_transfer_details, ReceivedInstantBankTransferDetails received_instant_bank_transfer_details, PlaidSignalDetails plaid_signal_details, ACHDepositScheduleDetails ach_deposit_schedule_details, PlaidIdentityUpdateDetails plaid_identity_update_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(object_id, "object_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ActivitySnapshot(object_id, account_number, account_id, type2, timestamp, context, ordering_id, user_id, request_context, country, ach_relationship_details, ach_transfer_details, checkout_card_relationship_details, checkout_card_deposit_details, checkout_card_withdrawal_details, checkout_card_dispute_details, checkout_card_dispute_fee_details, bank_balance_details, iav_queued_deposit_details, received_ach_transfer_details, received_instant_bank_transfer_details, plaid_signal_details, ach_deposit_schedule_details, plaid_identity_update_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivitySnapshot.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ActivitySnapshot>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.cashier.ActivitySnapshot$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ActivitySnapshot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ByteString object_id = value.getObject_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(object_id, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getObject_id());
                }
                if (value.getAccount_number() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.getAccount_number()));
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getAccount_id());
                }
                if (value.getType() != ActivitySnapshot.Type.TYPE_UNSPECIFIED) {
                    size += ActivitySnapshot.Type.ADAPTER.encodedSizeWithTag(3, value.getType());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getContext(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getContext());
                }
                if (value.getOrdering_id() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(6, Long.valueOf(value.getOrdering_id()));
                }
                if (!Intrinsics.areEqual(value.getUser_id(), byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(7, value.getUser_id());
                }
                if (value.getRequest_context() != null) {
                    size += RequestContext.ADAPTER.encodedSizeWithTag(8, value.getRequest_context());
                }
                if (value.getCountry() != Locality.LOCALITY_UNSPECIFIED) {
                    size += Locality.ADAPTER.encodedSizeWithTag(10, value.getCountry());
                }
                return size + ACHRelationshipDetails.ADAPTER.encodedSizeWithTag(16, value.getAch_relationship_details()) + ACHTransferDetails.ADAPTER.encodedSizeWithTag(23, value.getAch_transfer_details()) + CheckoutCardRelationshipDetails.ADAPTER.encodedSizeWithTag(17, value.getCheckout_card_relationship_details()) + CheckoutCardDepositDetails.ADAPTER.encodedSizeWithTag(18, value.getCheckout_card_deposit_details()) + CheckoutCardWithdrawalDetails.ADAPTER.encodedSizeWithTag(19, value.getCheckout_card_withdrawal_details()) + CheckoutCardDisputeDetails.ADAPTER.encodedSizeWithTag(21, value.getCheckout_card_dispute_details()) + CheckoutCardDisputeFeeDetails.ADAPTER.encodedSizeWithTag(22, value.getCheckout_card_dispute_fee_details()) + BankBalanceDetails.ADAPTER.encodedSizeWithTag(20, value.getBank_balance_details()) + IAVQueuedDepositDetails.ADAPTER.encodedSizeWithTag(24, value.getIav_queued_deposit_details()) + ReceivedACHTransferDetails.ADAPTER.encodedSizeWithTag(25, value.getReceived_ach_transfer_details()) + ReceivedInstantBankTransferDetails.ADAPTER.encodedSizeWithTag(26, value.getReceived_instant_bank_transfer_details()) + PlaidSignalDetails.ADAPTER.encodedSizeWithTag(27, value.getPlaid_signal_details()) + ACHDepositScheduleDetails.ADAPTER.encodedSizeWithTag(28, value.getAch_deposit_schedule_details()) + PlaidIdentityUpdateDetails.ADAPTER.encodedSizeWithTag(29, value.getPlaid_identity_update_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ActivitySnapshot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ByteString object_id = value.getObject_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(object_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getObject_id());
                }
                if (value.getAccount_number() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getAccount_number()));
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getAccount_id());
                }
                if (value.getType() != ActivitySnapshot.Type.TYPE_UNSPECIFIED) {
                    ActivitySnapshot.Type.ADAPTER.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getContext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getContext());
                }
                if (value.getOrdering_id() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 6, (int) Long.valueOf(value.getOrdering_id()));
                }
                if (!Intrinsics.areEqual(value.getUser_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 7, (int) value.getUser_id());
                }
                if (value.getRequest_context() != null) {
                    RequestContext.ADAPTER.encodeWithTag(writer, 8, (int) value.getRequest_context());
                }
                if (value.getCountry() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 10, (int) value.getCountry());
                }
                ACHRelationshipDetails.ADAPTER.encodeWithTag(writer, 16, (int) value.getAch_relationship_details());
                ACHTransferDetails.ADAPTER.encodeWithTag(writer, 23, (int) value.getAch_transfer_details());
                CheckoutCardRelationshipDetails.ADAPTER.encodeWithTag(writer, 17, (int) value.getCheckout_card_relationship_details());
                CheckoutCardDepositDetails.ADAPTER.encodeWithTag(writer, 18, (int) value.getCheckout_card_deposit_details());
                CheckoutCardWithdrawalDetails.ADAPTER.encodeWithTag(writer, 19, (int) value.getCheckout_card_withdrawal_details());
                CheckoutCardDisputeDetails.ADAPTER.encodeWithTag(writer, 21, (int) value.getCheckout_card_dispute_details());
                CheckoutCardDisputeFeeDetails.ADAPTER.encodeWithTag(writer, 22, (int) value.getCheckout_card_dispute_fee_details());
                BankBalanceDetails.ADAPTER.encodeWithTag(writer, 20, (int) value.getBank_balance_details());
                IAVQueuedDepositDetails.ADAPTER.encodeWithTag(writer, 24, (int) value.getIav_queued_deposit_details());
                ReceivedACHTransferDetails.ADAPTER.encodeWithTag(writer, 25, (int) value.getReceived_ach_transfer_details());
                ReceivedInstantBankTransferDetails.ADAPTER.encodeWithTag(writer, 26, (int) value.getReceived_instant_bank_transfer_details());
                PlaidSignalDetails.ADAPTER.encodeWithTag(writer, 27, (int) value.getPlaid_signal_details());
                ACHDepositScheduleDetails.ADAPTER.encodeWithTag(writer, 28, (int) value.getAch_deposit_schedule_details());
                PlaidIdentityUpdateDetails.ADAPTER.encodeWithTag(writer, 29, (int) value.getPlaid_identity_update_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ActivitySnapshot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PlaidIdentityUpdateDetails.ADAPTER.encodeWithTag(writer, 29, (int) value.getPlaid_identity_update_details());
                ACHDepositScheduleDetails.ADAPTER.encodeWithTag(writer, 28, (int) value.getAch_deposit_schedule_details());
                PlaidSignalDetails.ADAPTER.encodeWithTag(writer, 27, (int) value.getPlaid_signal_details());
                ReceivedInstantBankTransferDetails.ADAPTER.encodeWithTag(writer, 26, (int) value.getReceived_instant_bank_transfer_details());
                ReceivedACHTransferDetails.ADAPTER.encodeWithTag(writer, 25, (int) value.getReceived_ach_transfer_details());
                IAVQueuedDepositDetails.ADAPTER.encodeWithTag(writer, 24, (int) value.getIav_queued_deposit_details());
                BankBalanceDetails.ADAPTER.encodeWithTag(writer, 20, (int) value.getBank_balance_details());
                CheckoutCardDisputeFeeDetails.ADAPTER.encodeWithTag(writer, 22, (int) value.getCheckout_card_dispute_fee_details());
                CheckoutCardDisputeDetails.ADAPTER.encodeWithTag(writer, 21, (int) value.getCheckout_card_dispute_details());
                CheckoutCardWithdrawalDetails.ADAPTER.encodeWithTag(writer, 19, (int) value.getCheckout_card_withdrawal_details());
                CheckoutCardDepositDetails.ADAPTER.encodeWithTag(writer, 18, (int) value.getCheckout_card_deposit_details());
                CheckoutCardRelationshipDetails.ADAPTER.encodeWithTag(writer, 17, (int) value.getCheckout_card_relationship_details());
                ACHTransferDetails.ADAPTER.encodeWithTag(writer, 23, (int) value.getAch_transfer_details());
                ACHRelationshipDetails.ADAPTER.encodeWithTag(writer, 16, (int) value.getAch_relationship_details());
                if (value.getCountry() != Locality.LOCALITY_UNSPECIFIED) {
                    Locality.ADAPTER.encodeWithTag(writer, 10, (int) value.getCountry());
                }
                if (value.getRequest_context() != null) {
                    RequestContext.ADAPTER.encodeWithTag(writer, 8, (int) value.getRequest_context());
                }
                ByteString user_id = value.getUser_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(user_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 7, (int) value.getUser_id());
                }
                if (value.getOrdering_id() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 6, (int) Long.valueOf(value.getOrdering_id()));
                }
                if (!Intrinsics.areEqual(value.getContext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getContext());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getTimestamp());
                }
                if (value.getType() != ActivitySnapshot.Type.TYPE_UNSPECIFIED) {
                    ActivitySnapshot.Type.ADAPTER.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getAccount_id());
                }
                if (value.getAccount_number() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getAccount_number()));
                }
                if (Intrinsics.areEqual(value.getObject_id(), byteString)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getObject_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ActivitySnapshot decode(ProtoReader reader) throws IOException {
                ByteString byteString;
                ActivitySnapshot.Type type2;
                Locality locality;
                ByteString byteString2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteString3 = ByteString.EMPTY;
                ActivitySnapshot.Type type3 = ActivitySnapshot.Type.TYPE_UNSPECIFIED;
                Locality locality2 = Locality.LOCALITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ByteString byteStringDecode = byteString3;
                long jLongValue = 0;
                long jLongValue2 = 0;
                Instant instantDecode = null;
                RequestContext requestContextDecode = null;
                ACHRelationshipDetails aCHRelationshipDetailsDecode = null;
                ACHTransferDetails aCHTransferDetailsDecode = null;
                CheckoutCardRelationshipDetails checkoutCardRelationshipDetailsDecode = null;
                CheckoutCardDepositDetails checkoutCardDepositDetailsDecode = null;
                CheckoutCardWithdrawalDetails checkoutCardWithdrawalDetailsDecode = null;
                CheckoutCardDisputeDetails checkoutCardDisputeDetailsDecode = null;
                CheckoutCardDisputeFeeDetails checkoutCardDisputeFeeDetailsDecode = null;
                BankBalanceDetails bankBalanceDetailsDecode = null;
                IAVQueuedDepositDetails iAVQueuedDepositDetailsDecode = null;
                ReceivedACHTransferDetails receivedACHTransferDetailsDecode = null;
                ReceivedInstantBankTransferDetails receivedInstantBankTransferDetailsDecode = null;
                PlaidSignalDetails plaidSignalDetailsDecode = null;
                ACHDepositScheduleDetails aCHDepositScheduleDetailsDecode = null;
                PlaidIdentityUpdateDetails plaidIdentityUpdateDetailsDecode = null;
                ActivitySnapshot.Type typeDecode = type3;
                Locality localityDecode = locality2;
                String strDecode2 = "";
                ByteString byteStringDecode2 = byteStringDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 2:
                                byteString2 = byteStringDecode2;
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                byteStringDecode2 = byteString2;
                                break;
                            case 3:
                                byteString = byteStringDecode2;
                                type2 = typeDecode;
                                locality = localityDecode;
                                try {
                                    typeDecode = ActivitySnapshot.Type.ADAPTER.decode(reader);
                                    byteStringDecode2 = byteString;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                localityDecode = locality;
                                break;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                byteString2 = byteStringDecode2;
                                jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                                byteStringDecode2 = byteString2;
                                break;
                            case 7:
                                byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 8:
                                requestContextDecode = RequestContext.ADAPTER.decode(reader);
                                break;
                            case 9:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                try {
                                    localityDecode = Locality.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    byteString = byteStringDecode2;
                                    type2 = typeDecode;
                                    locality = localityDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            default:
                                switch (iNextTag) {
                                    case 16:
                                        aCHRelationshipDetailsDecode = ACHRelationshipDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 17:
                                        checkoutCardRelationshipDetailsDecode = CheckoutCardRelationshipDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 18:
                                        checkoutCardDepositDetailsDecode = CheckoutCardDepositDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 19:
                                        checkoutCardWithdrawalDetailsDecode = CheckoutCardWithdrawalDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 20:
                                        bankBalanceDetailsDecode = BankBalanceDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 21:
                                        checkoutCardDisputeDetailsDecode = CheckoutCardDisputeDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 22:
                                        checkoutCardDisputeFeeDetailsDecode = CheckoutCardDisputeFeeDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 23:
                                        aCHTransferDetailsDecode = ACHTransferDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 24:
                                        iAVQueuedDepositDetailsDecode = IAVQueuedDepositDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 25:
                                        receivedACHTransferDetailsDecode = ReceivedACHTransferDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 26:
                                        receivedInstantBankTransferDetailsDecode = ReceivedInstantBankTransferDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 27:
                                        plaidSignalDetailsDecode = PlaidSignalDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 28:
                                        aCHDepositScheduleDetailsDecode = ACHDepositScheduleDetails.ADAPTER.decode(reader);
                                        continue;
                                    case 29:
                                        plaidIdentityUpdateDetailsDecode = PlaidIdentityUpdateDetails.ADAPTER.decode(reader);
                                        continue;
                                    default:
                                        reader.readUnknownField(iNextTag);
                                        byteString = byteStringDecode2;
                                        type2 = typeDecode;
                                        locality = localityDecode;
                                        break;
                                }
                                byteStringDecode2 = byteString;
                                typeDecode = type2;
                                localityDecode = locality;
                                break;
                        }
                    } else {
                        return new ActivitySnapshot(byteStringDecode, jLongValue, strDecode, typeDecode, instantDecode, strDecode2, jLongValue2, byteStringDecode2, requestContextDecode, localityDecode, aCHRelationshipDetailsDecode, aCHTransferDetailsDecode, checkoutCardRelationshipDetailsDecode, checkoutCardDepositDetailsDecode, checkoutCardWithdrawalDetailsDecode, checkoutCardDisputeDetailsDecode, checkoutCardDisputeFeeDetailsDecode, bankBalanceDetailsDecode, iAVQueuedDepositDetailsDecode, receivedACHTransferDetailsDecode, receivedInstantBankTransferDetailsDecode, plaidSignalDetailsDecode, aCHDepositScheduleDetailsDecode, plaidIdentityUpdateDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ActivitySnapshot redact(ActivitySnapshot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                RequestContext request_context = value.getRequest_context();
                RequestContext requestContextRedact = request_context != null ? RequestContext.ADAPTER.redact(request_context) : null;
                ACHRelationshipDetails ach_relationship_details = value.getAch_relationship_details();
                ACHRelationshipDetails aCHRelationshipDetailsRedact = ach_relationship_details != null ? ACHRelationshipDetails.ADAPTER.redact(ach_relationship_details) : null;
                ACHTransferDetails ach_transfer_details = value.getAch_transfer_details();
                ACHTransferDetails aCHTransferDetailsRedact = ach_transfer_details != null ? ACHTransferDetails.ADAPTER.redact(ach_transfer_details) : null;
                CheckoutCardRelationshipDetails checkout_card_relationship_details = value.getCheckout_card_relationship_details();
                CheckoutCardRelationshipDetails checkoutCardRelationshipDetailsRedact = checkout_card_relationship_details != null ? CheckoutCardRelationshipDetails.ADAPTER.redact(checkout_card_relationship_details) : null;
                CheckoutCardDepositDetails checkout_card_deposit_details = value.getCheckout_card_deposit_details();
                CheckoutCardDepositDetails checkoutCardDepositDetailsRedact = checkout_card_deposit_details != null ? CheckoutCardDepositDetails.ADAPTER.redact(checkout_card_deposit_details) : null;
                CheckoutCardWithdrawalDetails checkout_card_withdrawal_details = value.getCheckout_card_withdrawal_details();
                CheckoutCardWithdrawalDetails checkoutCardWithdrawalDetailsRedact = checkout_card_withdrawal_details != null ? CheckoutCardWithdrawalDetails.ADAPTER.redact(checkout_card_withdrawal_details) : null;
                CheckoutCardDisputeDetails checkout_card_dispute_details = value.getCheckout_card_dispute_details();
                CheckoutCardDisputeDetails checkoutCardDisputeDetailsRedact = checkout_card_dispute_details != null ? CheckoutCardDisputeDetails.ADAPTER.redact(checkout_card_dispute_details) : null;
                CheckoutCardDisputeFeeDetails checkout_card_dispute_fee_details = value.getCheckout_card_dispute_fee_details();
                CheckoutCardDisputeFeeDetails checkoutCardDisputeFeeDetailsRedact = checkout_card_dispute_fee_details != null ? CheckoutCardDisputeFeeDetails.ADAPTER.redact(checkout_card_dispute_fee_details) : null;
                BankBalanceDetails bank_balance_details = value.getBank_balance_details();
                BankBalanceDetails bankBalanceDetailsRedact = bank_balance_details != null ? BankBalanceDetails.ADAPTER.redact(bank_balance_details) : null;
                IAVQueuedDepositDetails iav_queued_deposit_details = value.getIav_queued_deposit_details();
                IAVQueuedDepositDetails iAVQueuedDepositDetailsRedact = iav_queued_deposit_details != null ? IAVQueuedDepositDetails.ADAPTER.redact(iav_queued_deposit_details) : null;
                ReceivedACHTransferDetails received_ach_transfer_details = value.getReceived_ach_transfer_details();
                ReceivedACHTransferDetails receivedACHTransferDetailsRedact = received_ach_transfer_details != null ? ReceivedACHTransferDetails.ADAPTER.redact(received_ach_transfer_details) : null;
                ReceivedInstantBankTransferDetails received_instant_bank_transfer_details = value.getReceived_instant_bank_transfer_details();
                ReceivedInstantBankTransferDetails receivedInstantBankTransferDetailsRedact = received_instant_bank_transfer_details != null ? ReceivedInstantBankTransferDetails.ADAPTER.redact(received_instant_bank_transfer_details) : null;
                PlaidSignalDetails plaid_signal_details = value.getPlaid_signal_details();
                PlaidSignalDetails plaidSignalDetailsRedact = plaid_signal_details != null ? PlaidSignalDetails.ADAPTER.redact(plaid_signal_details) : null;
                ACHDepositScheduleDetails ach_deposit_schedule_details = value.getAch_deposit_schedule_details();
                ACHDepositScheduleDetails aCHDepositScheduleDetailsRedact = ach_deposit_schedule_details != null ? ACHDepositScheduleDetails.ADAPTER.redact(ach_deposit_schedule_details) : null;
                PlaidIdentityUpdateDetails plaid_identity_update_details = value.getPlaid_identity_update_details();
                return value.copy((751 & 1) != 0 ? value.object_id : null, (751 & 2) != 0 ? value.account_number : 0L, (751 & 4) != 0 ? value.account_id : null, (751 & 8) != 0 ? value.type : null, (751 & 16) != 0 ? value.timestamp : instantRedact, (751 & 32) != 0 ? value.context : null, (751 & 64) != 0 ? value.ordering_id : 0L, (751 & 128) != 0 ? value.user_id : null, (751 & 256) != 0 ? value.request_context : requestContextRedact, (751 & 512) != 0 ? value.country : null, (751 & 1024) != 0 ? value.ach_relationship_details : aCHRelationshipDetailsRedact, (751 & 2048) != 0 ? value.ach_transfer_details : aCHTransferDetailsRedact, (751 & 4096) != 0 ? value.checkout_card_relationship_details : checkoutCardRelationshipDetailsRedact, (751 & 8192) != 0 ? value.checkout_card_deposit_details : checkoutCardDepositDetailsRedact, (751 & 16384) != 0 ? value.checkout_card_withdrawal_details : checkoutCardWithdrawalDetailsRedact, (751 & 32768) != 0 ? value.checkout_card_dispute_details : checkoutCardDisputeDetailsRedact, (751 & 65536) != 0 ? value.checkout_card_dispute_fee_details : checkoutCardDisputeFeeDetailsRedact, (751 & 131072) != 0 ? value.bank_balance_details : bankBalanceDetailsRedact, (751 & 262144) != 0 ? value.iav_queued_deposit_details : iAVQueuedDepositDetailsRedact, (751 & 524288) != 0 ? value.received_ach_transfer_details : receivedACHTransferDetailsRedact, (751 & 1048576) != 0 ? value.received_instant_bank_transfer_details : receivedInstantBankTransferDetailsRedact, (751 & 2097152) != 0 ? value.plaid_signal_details : plaidSignalDetailsRedact, (751 & 4194304) != 0 ? value.ach_deposit_schedule_details : aCHDepositScheduleDetailsRedact, (751 & 8388608) != 0 ? value.plaid_identity_update_details : plaid_identity_update_details != null ? PlaidIdentityUpdateDetails.ADAPTER.redact(plaid_identity_update_details) : null, (751 & 16777216) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActivitySnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "ACH_RELATIONSHIP", "ACH_TRANSFER", "BANK_BALANCE_DETAILS", "CHECKOUT_CARD_RELATIONSHIP", "CHECKOUT_CARD_DEPOSIT", "CHECKOUT_CARD_WITHDRAWAL", "CHECKOUT_CARD_DISPUTE", "CHECKOUT_CARD_DISPUTE_FEE", TransferContext3.QUEUED_DEPOSIT, "RECEIVED_ACH_TRANSFER", "PLAID_SIGNAL_DETAILS", "INSTANT_BANK_TRANSFER_DETAILS", "ACH_DEPOSIT_SCHEDULE", "PLAID_IDENTITY_UPDATE_DETAILS", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ACH_DEPOSIT_SCHEDULE;
        public static final Type ACH_RELATIONSHIP;
        public static final Type ACH_TRANSFER;

        @JvmField
        public static final ProtoAdapter<Type> ADAPTER;
        public static final Type BANK_BALANCE_DETAILS;
        public static final Type CHECKOUT_CARD_DEPOSIT;
        public static final Type CHECKOUT_CARD_DISPUTE;
        public static final Type CHECKOUT_CARD_DISPUTE_FEE;
        public static final Type CHECKOUT_CARD_RELATIONSHIP;
        public static final Type CHECKOUT_CARD_WITHDRAWAL;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type INSTANT_BANK_TRANSFER_DETAILS;
        public static final Type PLAID_IDENTITY_UPDATE_DETAILS;
        public static final Type PLAID_SIGNAL_DETAILS;
        public static final Type QUEUED_DEPOSIT;
        public static final Type RECEIVED_ACH_TRANSFER;
        public static final Type TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TYPE_UNSPECIFIED, ACH_RELATIONSHIP, ACH_TRANSFER, BANK_BALANCE_DETAILS, CHECKOUT_CARD_RELATIONSHIP, CHECKOUT_CARD_DEPOSIT, CHECKOUT_CARD_WITHDRAWAL, CHECKOUT_CARD_DISPUTE, CHECKOUT_CARD_DISPUTE_FEE, QUEUED_DEPOSIT, RECEIVED_ACH_TRANSFER, PLAID_SIGNAL_DETAILS, INSTANT_BANK_TRANSFER_DETAILS, ACH_DEPOSIT_SCHEDULE, PLAID_IDENTITY_UPDATE_DETAILS};
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
            ACH_RELATIONSHIP = new Type("ACH_RELATIONSHIP", 1, 1);
            ACH_TRANSFER = new Type("ACH_TRANSFER", 2, 8);
            BANK_BALANCE_DETAILS = new Type("BANK_BALANCE_DETAILS", 3, 5);
            CHECKOUT_CARD_RELATIONSHIP = new Type("CHECKOUT_CARD_RELATIONSHIP", 4, 2);
            CHECKOUT_CARD_DEPOSIT = new Type("CHECKOUT_CARD_DEPOSIT", 5, 3);
            CHECKOUT_CARD_WITHDRAWAL = new Type("CHECKOUT_CARD_WITHDRAWAL", 6, 4);
            CHECKOUT_CARD_DISPUTE = new Type("CHECKOUT_CARD_DISPUTE", 7, 6);
            CHECKOUT_CARD_DISPUTE_FEE = new Type("CHECKOUT_CARD_DISPUTE_FEE", 8, 7);
            QUEUED_DEPOSIT = new Type(TransferContext3.QUEUED_DEPOSIT, 9, 9);
            RECEIVED_ACH_TRANSFER = new Type("RECEIVED_ACH_TRANSFER", 10, 10);
            PLAID_SIGNAL_DETAILS = new Type("PLAID_SIGNAL_DETAILS", 11, 11);
            INSTANT_BANK_TRANSFER_DETAILS = new Type("INSTANT_BANK_TRANSFER_DETAILS", 12, 12);
            ACH_DEPOSIT_SCHEDULE = new Type("ACH_DEPOSIT_SCHEDULE", 13, 13);
            PLAID_IDENTITY_UPDATE_DETAILS = new Type("PLAID_IDENTITY_UPDATE_DETAILS", 14, 14);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: com.robinhood.rosetta.cashier.ActivitySnapshot$Type$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ActivitySnapshot.Type fromValue(int value) {
                    return ActivitySnapshot.Type.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ActivitySnapshot.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/cashier/ActivitySnapshot$Type;", "fromValue", "value", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Type fromValue(int value) {
                switch (value) {
                    case 0:
                        return Type.TYPE_UNSPECIFIED;
                    case 1:
                        return Type.ACH_RELATIONSHIP;
                    case 2:
                        return Type.CHECKOUT_CARD_RELATIONSHIP;
                    case 3:
                        return Type.CHECKOUT_CARD_DEPOSIT;
                    case 4:
                        return Type.CHECKOUT_CARD_WITHDRAWAL;
                    case 5:
                        return Type.BANK_BALANCE_DETAILS;
                    case 6:
                        return Type.CHECKOUT_CARD_DISPUTE;
                    case 7:
                        return Type.CHECKOUT_CARD_DISPUTE_FEE;
                    case 8:
                        return Type.ACH_TRANSFER;
                    case 9:
                        return Type.QUEUED_DEPOSIT;
                    case 10:
                        return Type.RECEIVED_ACH_TRANSFER;
                    case 11:
                        return Type.PLAID_SIGNAL_DETAILS;
                    case 12:
                        return Type.INSTANT_BANK_TRANSFER_DETAILS;
                    case 13:
                        return Type.ACH_DEPOSIT_SCHEDULE;
                    case 14:
                        return Type.PLAID_IDENTITY_UPDATE_DETAILS;
                    default:
                        return null;
                }
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
