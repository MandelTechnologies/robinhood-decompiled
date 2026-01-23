package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
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

/* compiled from: CryptoTransferContext.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000223B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010)\u001a\u00020\u0002H\u0017J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0004H\u0016J\u0094\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContext;", "Lcom/squareup/wire/Message;", "", "currency_id", "", "session_id", "withdrawal_id", "amount", "", ErrorResponse.ERROR_CODE, "title", "completed_kyc", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "completed_mfa", "security_context", "Lcom/robinhood/rosetta/eventlogging/CryptoTransferContext$SecurityContext;", MatchSelectionActivity.TRANSFER_ID_EXTRA, "party_selection", "wallet_selection", "error_message", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/CryptoTransferContext$SecurityContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency_id", "()Ljava/lang/String;", "getSession_id", "getWithdrawal_id", "getAmount", "()D", "getError_code", "getTitle", "getCompleted_kyc", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getCompleted_mfa", "getSecurity_context", "()Lcom/robinhood/rosetta/eventlogging/CryptoTransferContext$SecurityContext;", "getTransfer_id", "getParty_selection", "getWallet_selection", "getError_message", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "SecurityContext", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CryptoTransferContext extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoTransferContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double amount;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "completedKyc", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Boolean completed_kyc;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "completedMfa", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Boolean completed_mfa;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String currency_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String error_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String error_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "partySelection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String party_selection;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTransferContext$SecurityContext#ADAPTER", jsonName = "securityContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final SecurityContext security_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transferId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String transfer_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "walletSelection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String wallet_selection;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "withdrawalId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String withdrawal_id;

    public CryptoTransferContext() {
        this(null, null, null, 0.0d, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public /* synthetic */ CryptoTransferContext(String str, String str2, String str3, double d, String str4, String str5, Boolean r24, Boolean r25, SecurityContext securityContext, String str6, String str7, String str8, String str9, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r24, (i & 128) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r25, (i & 256) != 0 ? null : securityContext, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) == 0 ? str9 : "", (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24174newBuilder();
    }

    public final String getCurrency_id() {
        return this.currency_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getWithdrawal_id() {
        return this.withdrawal_id;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getError_code() {
        return this.error_code;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean getCompleted_kyc() {
        return this.completed_kyc;
    }

    public final Boolean getCompleted_mfa() {
        return this.completed_mfa;
    }

    public final SecurityContext getSecurity_context() {
        return this.security_context;
    }

    public final String getTransfer_id() {
        return this.transfer_id;
    }

    public final String getParty_selection() {
        return this.party_selection;
    }

    public final String getWallet_selection() {
        return this.wallet_selection;
    }

    public final String getError_message() {
        return this.error_message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTransferContext(String currency_id, String session_id, String withdrawal_id, double d, String error_code, String title, Boolean completed_kyc, Boolean completed_mfa, SecurityContext securityContext, String transfer_id, String party_selection, String wallet_selection, String error_message, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(withdrawal_id, "withdrawal_id");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(completed_kyc, "completed_kyc");
        Intrinsics.checkNotNullParameter(completed_mfa, "completed_mfa");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(party_selection, "party_selection");
        Intrinsics.checkNotNullParameter(wallet_selection, "wallet_selection");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_id = currency_id;
        this.session_id = session_id;
        this.withdrawal_id = withdrawal_id;
        this.amount = d;
        this.error_code = error_code;
        this.title = title;
        this.completed_kyc = completed_kyc;
        this.completed_mfa = completed_mfa;
        this.security_context = securityContext;
        this.transfer_id = transfer_id;
        this.party_selection = party_selection;
        this.wallet_selection = wallet_selection;
        this.error_message = error_message;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24174newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoTransferContext)) {
            return false;
        }
        CryptoTransferContext cryptoTransferContext = (CryptoTransferContext) other;
        return Intrinsics.areEqual(unknownFields(), cryptoTransferContext.unknownFields()) && Intrinsics.areEqual(this.currency_id, cryptoTransferContext.currency_id) && Intrinsics.areEqual(this.session_id, cryptoTransferContext.session_id) && Intrinsics.areEqual(this.withdrawal_id, cryptoTransferContext.withdrawal_id) && this.amount == cryptoTransferContext.amount && Intrinsics.areEqual(this.error_code, cryptoTransferContext.error_code) && Intrinsics.areEqual(this.title, cryptoTransferContext.title) && this.completed_kyc == cryptoTransferContext.completed_kyc && this.completed_mfa == cryptoTransferContext.completed_mfa && Intrinsics.areEqual(this.security_context, cryptoTransferContext.security_context) && Intrinsics.areEqual(this.transfer_id, cryptoTransferContext.transfer_id) && Intrinsics.areEqual(this.party_selection, cryptoTransferContext.party_selection) && Intrinsics.areEqual(this.wallet_selection, cryptoTransferContext.wallet_selection) && Intrinsics.areEqual(this.error_message, cryptoTransferContext.error_message);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((unknownFields().hashCode() * 37) + this.currency_id.hashCode()) * 37) + this.session_id.hashCode()) * 37) + this.withdrawal_id.hashCode()) * 37) + Double.hashCode(this.amount)) * 37) + this.error_code.hashCode()) * 37) + this.title.hashCode()) * 37) + this.completed_kyc.hashCode()) * 37) + this.completed_mfa.hashCode()) * 37;
        SecurityContext securityContext = this.security_context;
        int iHashCode2 = ((((((((iHashCode + (securityContext != null ? securityContext.hashCode() : 0)) * 37) + this.transfer_id.hashCode()) * 37) + this.party_selection.hashCode()) * 37) + this.wallet_selection.hashCode()) * 37) + this.error_message.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_id=" + Internal.sanitize(this.currency_id));
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        arrayList.add("withdrawal_id=" + Internal.sanitize(this.withdrawal_id));
        arrayList.add("amount=" + this.amount);
        arrayList.add("error_code=" + Internal.sanitize(this.error_code));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("completed_kyc=" + this.completed_kyc);
        arrayList.add("completed_mfa=" + this.completed_mfa);
        SecurityContext securityContext = this.security_context;
        if (securityContext != null) {
            arrayList.add("security_context=" + securityContext);
        }
        arrayList.add("transfer_id=" + Internal.sanitize(this.transfer_id));
        arrayList.add("party_selection=" + Internal.sanitize(this.party_selection));
        arrayList.add("wallet_selection=" + Internal.sanitize(this.wallet_selection));
        arrayList.add("error_message=" + Internal.sanitize(this.error_message));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoTransferContext{", "}", 0, null, null, 56, null);
    }

    public final CryptoTransferContext copy(String currency_id, String session_id, String withdrawal_id, double amount, String error_code, String title, Boolean completed_kyc, Boolean completed_mfa, SecurityContext security_context, String transfer_id, String party_selection, String wallet_selection, String error_message, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(withdrawal_id, "withdrawal_id");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(completed_kyc, "completed_kyc");
        Intrinsics.checkNotNullParameter(completed_mfa, "completed_mfa");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(party_selection, "party_selection");
        Intrinsics.checkNotNullParameter(wallet_selection, "wallet_selection");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoTransferContext(currency_id, session_id, withdrawal_id, amount, error_code, title, completed_kyc, completed_mfa, security_context, transfer_id, party_selection, wallet_selection, error_message, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoTransferContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoTransferContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoTransferContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoTransferContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_id());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSession_id());
                }
                if (!Intrinsics.areEqual(value.getWithdrawal_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getWithdrawal_id());
                }
                if (!Double.valueOf(value.getAmount()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getAmount()));
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getError_code());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getTitle());
                }
                Boolean completed_kyc = value.getCompleted_kyc();
                Boolean r3 = Boolean.BOOLEAN_UNSPECIFIED;
                if (completed_kyc != r3) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(7, value.getCompleted_kyc());
                }
                if (value.getCompleted_mfa() != r3) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(8, value.getCompleted_mfa());
                }
                if (value.getSecurity_context() != null) {
                    size += CryptoTransferContext.SecurityContext.ADAPTER.encodedSizeWithTag(9, value.getSecurity_context());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getTransfer_id());
                }
                if (!Intrinsics.areEqual(value.getParty_selection(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getParty_selection());
                }
                if (!Intrinsics.areEqual(value.getWallet_selection(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getWallet_selection());
                }
                return !Intrinsics.areEqual(value.getError_message(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(13, value.getError_message()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoTransferContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_id());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSession_id());
                }
                if (!Intrinsics.areEqual(value.getWithdrawal_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getWithdrawal_id());
                }
                if (!Double.valueOf(value.getAmount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getAmount()));
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getError_code());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTitle());
                }
                Boolean completed_kyc = value.getCompleted_kyc();
                Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                if (completed_kyc != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 7, (int) value.getCompleted_kyc());
                }
                if (value.getCompleted_mfa() != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 8, (int) value.getCompleted_mfa());
                }
                if (value.getSecurity_context() != null) {
                    CryptoTransferContext.SecurityContext.ADAPTER.encodeWithTag(writer, 9, (int) value.getSecurity_context());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getTransfer_id());
                }
                if (!Intrinsics.areEqual(value.getParty_selection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getParty_selection());
                }
                if (!Intrinsics.areEqual(value.getWallet_selection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getWallet_selection());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getError_message());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoTransferContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getError_message());
                }
                if (!Intrinsics.areEqual(value.getWallet_selection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getWallet_selection());
                }
                if (!Intrinsics.areEqual(value.getParty_selection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getParty_selection());
                }
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getTransfer_id());
                }
                if (value.getSecurity_context() != null) {
                    CryptoTransferContext.SecurityContext.ADAPTER.encodeWithTag(writer, 9, (int) value.getSecurity_context());
                }
                Boolean completed_mfa = value.getCompleted_mfa();
                Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                if (completed_mfa != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 8, (int) value.getCompleted_mfa());
                }
                if (value.getCompleted_kyc() != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 7, (int) value.getCompleted_kyc());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getError_code());
                }
                if (!Double.valueOf(value.getAmount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getAmount()));
                }
                if (!Intrinsics.areEqual(value.getWithdrawal_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getWithdrawal_id());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSession_id());
                }
                if (Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoTransferContext decode(ProtoReader reader) throws IOException {
                Boolean r17;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean r0 = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Boolean booleanDecode = r0;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                double dDoubleValue = 0.0d;
                CryptoTransferContext.SecurityContext securityContextDecode = null;
                Boolean booleanDecode2 = booleanDecode;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                booleanDecode2 = booleanDecode2;
                                continue;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                r17 = booleanDecode2;
                                str = strDecode8;
                                str2 = strDecode9;
                                try {
                                    booleanDecode = Boolean.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 8:
                                try {
                                    booleanDecode2 = Boolean.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    r17 = booleanDecode2;
                                    str = strDecode8;
                                    str2 = strDecode9;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 9:
                                securityContextDecode = CryptoTransferContext.SecurityContext.ADAPTER.decode(reader);
                                continue;
                            case 10:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                r17 = booleanDecode2;
                                str = strDecode8;
                                str2 = strDecode9;
                                break;
                        }
                        booleanDecode2 = r17;
                        strDecode8 = str;
                        strDecode9 = str2;
                    } else {
                        return new CryptoTransferContext(strDecode8, strDecode9, strDecode, dDoubleValue, strDecode2, strDecode3, booleanDecode, booleanDecode2, securityContextDecode, strDecode4, strDecode5, strDecode6, strDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoTransferContext redact(CryptoTransferContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CryptoTransferContext.SecurityContext security_context = value.getSecurity_context();
                return value.copy((16367 & 1) != 0 ? value.currency_id : null, (16367 & 2) != 0 ? value.session_id : null, (16367 & 4) != 0 ? value.withdrawal_id : null, (16367 & 8) != 0 ? value.amount : 0.0d, (16367 & 16) != 0 ? value.error_code : null, (16367 & 32) != 0 ? value.title : null, (16367 & 64) != 0 ? value.completed_kyc : null, (16367 & 128) != 0 ? value.completed_mfa : null, (16367 & 256) != 0 ? value.security_context : security_context != null ? CryptoTransferContext.SecurityContext.ADAPTER.redact(security_context) : null, (16367 & 512) != 0 ? value.transfer_id : null, (16367 & 1024) != 0 ? value.party_selection : null, (16367 & 2048) != 0 ? value.wallet_selection : null, (16367 & 4096) != 0 ? value.error_message : null, (16367 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* compiled from: CryptoTransferContext.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTransferContext$SecurityContext;", "Lcom/squareup/wire/Message;", "", "phone_number_verified", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "auth_app_setup", "email_verified", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "getPhone_number_verified", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getAuth_app_setup", "getEmail_verified", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SecurityContext extends Message {

        @JvmField
        public static final ProtoAdapter<SecurityContext> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "authAppSetup", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Boolean auth_app_setup;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "emailVerified", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final Boolean email_verified;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "phoneNumberVerified", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Boolean phone_number_verified;

        public SecurityContext() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24175newBuilder();
        }

        public final Boolean getPhone_number_verified() {
            return this.phone_number_verified;
        }

        public /* synthetic */ SecurityContext(Boolean r1, Boolean r2, Boolean r3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r1, (i & 2) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r2, (i & 4) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public final Boolean getAuth_app_setup() {
            return this.auth_app_setup;
        }

        public final Boolean getEmail_verified() {
            return this.email_verified;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecurityContext(Boolean phone_number_verified, Boolean auth_app_setup, Boolean email_verified, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(phone_number_verified, "phone_number_verified");
            Intrinsics.checkNotNullParameter(auth_app_setup, "auth_app_setup");
            Intrinsics.checkNotNullParameter(email_verified, "email_verified");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.phone_number_verified = phone_number_verified;
            this.auth_app_setup = auth_app_setup;
            this.email_verified = email_verified;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24175newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SecurityContext)) {
                return false;
            }
            SecurityContext securityContext = (SecurityContext) other;
            return Intrinsics.areEqual(unknownFields(), securityContext.unknownFields()) && this.phone_number_verified == securityContext.phone_number_verified && this.auth_app_setup == securityContext.auth_app_setup && this.email_verified == securityContext.email_verified;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.phone_number_verified.hashCode()) * 37) + this.auth_app_setup.hashCode()) * 37) + this.email_verified.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("phone_number_verified=" + this.phone_number_verified);
            arrayList.add("auth_app_setup=" + this.auth_app_setup);
            arrayList.add("email_verified=" + this.email_verified);
            return CollectionsKt.joinToString$default(arrayList, ", ", "SecurityContext{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ SecurityContext copy$default(SecurityContext securityContext, Boolean r1, Boolean r2, Boolean r3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                r1 = securityContext.phone_number_verified;
            }
            if ((i & 2) != 0) {
                r2 = securityContext.auth_app_setup;
            }
            if ((i & 4) != 0) {
                r3 = securityContext.email_verified;
            }
            if ((i & 8) != 0) {
                byteString = securityContext.unknownFields();
            }
            return securityContext.copy(r1, r2, r3, byteString);
        }

        public final SecurityContext copy(Boolean phone_number_verified, Boolean auth_app_setup, Boolean email_verified, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(phone_number_verified, "phone_number_verified");
            Intrinsics.checkNotNullParameter(auth_app_setup, "auth_app_setup");
            Intrinsics.checkNotNullParameter(email_verified, "email_verified");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new SecurityContext(phone_number_verified, auth_app_setup, email_verified, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SecurityContext.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<SecurityContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoTransferContext$SecurityContext$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CryptoTransferContext.SecurityContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    Boolean phone_number_verified = value.getPhone_number_verified();
                    Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                    if (phone_number_verified != r2) {
                        size += Boolean.ADAPTER.encodedSizeWithTag(1, value.getPhone_number_verified());
                    }
                    if (value.getAuth_app_setup() != r2) {
                        size += Boolean.ADAPTER.encodedSizeWithTag(2, value.getAuth_app_setup());
                    }
                    return value.getEmail_verified() != r2 ? size + Boolean.ADAPTER.encodedSizeWithTag(3, value.getEmail_verified()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CryptoTransferContext.SecurityContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Boolean phone_number_verified = value.getPhone_number_verified();
                    Boolean r1 = Boolean.BOOLEAN_UNSPECIFIED;
                    if (phone_number_verified != r1) {
                        Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getPhone_number_verified());
                    }
                    if (value.getAuth_app_setup() != r1) {
                        Boolean.ADAPTER.encodeWithTag(writer, 2, (int) value.getAuth_app_setup());
                    }
                    if (value.getEmail_verified() != r1) {
                        Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getEmail_verified());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CryptoTransferContext.SecurityContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    Boolean email_verified = value.getEmail_verified();
                    Boolean r1 = Boolean.BOOLEAN_UNSPECIFIED;
                    if (email_verified != r1) {
                        Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getEmail_verified());
                    }
                    if (value.getAuth_app_setup() != r1) {
                        Boolean.ADAPTER.encodeWithTag(writer, 2, (int) value.getAuth_app_setup());
                    }
                    if (value.getPhone_number_verified() != r1) {
                        Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getPhone_number_verified());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public CryptoTransferContext.SecurityContext decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Boolean booleanDecode = Boolean.BOOLEAN_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    Boolean booleanDecode2 = booleanDecode;
                    Boolean booleanDecode3 = booleanDecode2;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CryptoTransferContext.SecurityContext(booleanDecode, booleanDecode2, booleanDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                booleanDecode = Boolean.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                booleanDecode2 = Boolean.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                booleanDecode3 = Boolean.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CryptoTransferContext.SecurityContext redact(CryptoTransferContext.SecurityContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return CryptoTransferContext.SecurityContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }
            };
        }
    }
}
