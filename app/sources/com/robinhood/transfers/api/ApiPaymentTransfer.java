package com.robinhood.transfers.api;

import com.robinhood.android.models.transfer.shared.AccountType;
import com.squareup.moshi.JsonClass;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: ApiPaymentTransfer.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b=\b\u0007\u0018\u00002\u00020\u0001:\u0001fB÷\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u00106R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\b\u0011\u0010DR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\b\u0012\u0010FR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\bG\u00103R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\bH\u0010<R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010:\u001a\u0004\bO\u0010<R\u0017\u0010\u001a\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010:\u001a\u0004\bP\u0010<R\u0017\u0010\u001b\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010I\u001a\u0004\bQ\u0010KR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010L\u001a\u0004\bR\u0010NR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\bV\u0010<R\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u00101\u001a\u0004\bW\u00103R\u001f\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b#\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010$\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b[\u00103R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010)\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\bb\u00106R\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b+\u0010c\u001a\u0004\bd\u0010e¨\u0006g"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransfer;", "", "Ljava/util/UUID;", "id", "Ljava/math/BigDecimal;", "amount", "j$/time/Instant", "created_at", "Lcom/robinhood/transfers/api/Currency;", "currency", "", "description", "Lcom/robinhood/transfers/api/Direction;", "direction", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", ErrorBundle.DETAIL_ENTRY, "", "is_owner", "is_visible_in_history", "net_amount", "originating_account_id", "Lcom/robinhood/android/models/transfer/shared/AccountType;", "originating_account_type", "Lcom/robinhood/transfers/api/ApiPaymentTransfer$TransferAccountInfo;", "originating_transfer_account_info", "owner_name", "receiving_account_id", "receiving_account_type", "receiving_transfer_account_info", "j$/time/LocalDate", "record_date", "ref_id", "service_fee", "", "Lcom/robinhood/transfers/api/ServiceFeeDiscount;", "service_fee_discount_details", "service_fee_discount_amount", "Lcom/robinhood/transfers/api/TransferState;", "state", "Lcom/robinhood/transfers/api/TransferType;", "transfer_type", "updated_at", "Lcom/robinhood/transfers/api/ApiManagedAccountTransferDetails;", "managed_account_transfer_details", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;Lj$/time/Instant;Lcom/robinhood/transfers/api/Currency;Ljava/lang/String;Lcom/robinhood/transfers/api/Direction;Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;ZLjava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/android/models/transfer/shared/AccountType;Lcom/robinhood/transfers/api/ApiPaymentTransfer$TransferAccountInfo;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/models/transfer/shared/AccountType;Lcom/robinhood/transfers/api/ApiPaymentTransfer$TransferAccountInfo;Lj$/time/LocalDate;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/transfers/api/TransferState;Lcom/robinhood/transfers/api/TransferType;Lj$/time/Instant;Lcom/robinhood/transfers/api/ApiManagedAccountTransferDetails;)V", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "Lcom/robinhood/transfers/api/Currency;", "getCurrency", "()Lcom/robinhood/transfers/api/Currency;", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "Lcom/robinhood/transfers/api/Direction;", "getDirection", "()Lcom/robinhood/transfers/api/Direction;", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "getDetails", "()Lcom/robinhood/transfers/api/ApiPaymentTransferDetails;", "Z", "()Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getNet_amount", "getOriginating_account_id", "Lcom/robinhood/android/models/transfer/shared/AccountType;", "getOriginating_account_type", "()Lcom/robinhood/android/models/transfer/shared/AccountType;", "Lcom/robinhood/transfers/api/ApiPaymentTransfer$TransferAccountInfo;", "getOriginating_transfer_account_info", "()Lcom/robinhood/transfers/api/ApiPaymentTransfer$TransferAccountInfo;", "getOwner_name", "getReceiving_account_id", "getReceiving_account_type", "getReceiving_transfer_account_info", "Lj$/time/LocalDate;", "getRecord_date", "()Lj$/time/LocalDate;", "getRef_id", "getService_fee", "Ljava/util/List;", "getService_fee_discount_details", "()Ljava/util/List;", "getService_fee_discount_amount", "Lcom/robinhood/transfers/api/TransferState;", "getState", "()Lcom/robinhood/transfers/api/TransferState;", "Lcom/robinhood/transfers/api/TransferType;", "getTransfer_type", "()Lcom/robinhood/transfers/api/TransferType;", "getUpdated_at", "Lcom/robinhood/transfers/api/ApiManagedAccountTransferDetails;", "getManaged_account_transfer_details", "()Lcom/robinhood/transfers/api/ApiManagedAccountTransferDetails;", "TransferAccountInfo", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ApiPaymentTransfer {
    private final BigDecimal amount;
    private final Instant created_at;
    private final Currency currency;
    private final String description;
    private final ApiPaymentTransferDetails details;
    private final Direction direction;
    private final UUID id;
    private final boolean is_owner;
    private final Boolean is_visible_in_history;
    private final ApiManagedAccountTransferDetails managed_account_transfer_details;
    private final BigDecimal net_amount;
    private final String originating_account_id;
    private final AccountType originating_account_type;
    private final TransferAccountInfo originating_transfer_account_info;
    private final String owner_name;
    private final String receiving_account_id;
    private final AccountType receiving_account_type;
    private final TransferAccountInfo receiving_transfer_account_info;
    private final LocalDate record_date;
    private final String ref_id;
    private final BigDecimal service_fee;
    private final BigDecimal service_fee_discount_amount;
    private final List<ServiceFeeDiscount> service_fee_discount_details;
    private final TransferState state;
    private final TransferType transfer_type;
    private final Instant updated_at;

    public ApiPaymentTransfer(UUID id, BigDecimal amount, Instant created_at, Currency currency, String str, Direction direction, ApiPaymentTransferDetails apiPaymentTransferDetails, boolean z, Boolean bool, BigDecimal net_amount, String originating_account_id, AccountType originating_account_type, TransferAccountInfo transferAccountInfo, String str2, String receiving_account_id, AccountType receiving_account_type, TransferAccountInfo transferAccountInfo2, LocalDate localDate, String str3, BigDecimal service_fee, List<ServiceFeeDiscount> list, BigDecimal bigDecimal, TransferState state, TransferType transfer_type, Instant instant, ApiManagedAccountTransferDetails apiManagedAccountTransferDetails) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(net_amount, "net_amount");
        Intrinsics.checkNotNullParameter(originating_account_id, "originating_account_id");
        Intrinsics.checkNotNullParameter(originating_account_type, "originating_account_type");
        Intrinsics.checkNotNullParameter(receiving_account_id, "receiving_account_id");
        Intrinsics.checkNotNullParameter(receiving_account_type, "receiving_account_type");
        Intrinsics.checkNotNullParameter(service_fee, "service_fee");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        this.id = id;
        this.amount = amount;
        this.created_at = created_at;
        this.currency = currency;
        this.description = str;
        this.direction = direction;
        this.details = apiPaymentTransferDetails;
        this.is_owner = z;
        this.is_visible_in_history = bool;
        this.net_amount = net_amount;
        this.originating_account_id = originating_account_id;
        this.originating_account_type = originating_account_type;
        this.originating_transfer_account_info = transferAccountInfo;
        this.owner_name = str2;
        this.receiving_account_id = receiving_account_id;
        this.receiving_account_type = receiving_account_type;
        this.receiving_transfer_account_info = transferAccountInfo2;
        this.record_date = localDate;
        this.ref_id = str3;
        this.service_fee = service_fee;
        this.service_fee_discount_details = list;
        this.service_fee_discount_amount = bigDecimal;
        this.state = state;
        this.transfer_type = transfer_type;
        this.updated_at = instant;
        this.managed_account_transfer_details = apiManagedAccountTransferDetails;
    }

    public /* synthetic */ ApiPaymentTransfer(UUID uuid, BigDecimal bigDecimal, Instant instant, Currency currency, String str, Direction direction, ApiPaymentTransferDetails apiPaymentTransferDetails, boolean z, Boolean bool, BigDecimal bigDecimal2, String str2, AccountType accountType, TransferAccountInfo transferAccountInfo, String str3, String str4, AccountType accountType2, TransferAccountInfo transferAccountInfo2, LocalDate localDate, String str5, BigDecimal bigDecimal3, List list, BigDecimal bigDecimal4, TransferState transferState, TransferType transferType, Instant instant2, ApiManagedAccountTransferDetails apiManagedAccountTransferDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, bigDecimal, instant, currency, str, direction, apiPaymentTransferDetails, z, bool, bigDecimal2, str2, accountType, transferAccountInfo, str3, str4, accountType2, transferAccountInfo2, localDate, str5, bigDecimal3, list, bigDecimal4, transferState, transferType, instant2, (i & 33554432) != 0 ? null : apiManagedAccountTransferDetails);
    }

    public final UUID getId() {
        return this.id;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final ApiPaymentTransferDetails getDetails() {
        return this.details;
    }

    /* renamed from: is_owner, reason: from getter */
    public final boolean getIs_owner() {
        return this.is_owner;
    }

    /* renamed from: is_visible_in_history, reason: from getter */
    public final Boolean getIs_visible_in_history() {
        return this.is_visible_in_history;
    }

    public final BigDecimal getNet_amount() {
        return this.net_amount;
    }

    public final String getOriginating_account_id() {
        return this.originating_account_id;
    }

    public final AccountType getOriginating_account_type() {
        return this.originating_account_type;
    }

    public final TransferAccountInfo getOriginating_transfer_account_info() {
        return this.originating_transfer_account_info;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getReceiving_account_id() {
        return this.receiving_account_id;
    }

    public final AccountType getReceiving_account_type() {
        return this.receiving_account_type;
    }

    public final TransferAccountInfo getReceiving_transfer_account_info() {
        return this.receiving_transfer_account_info;
    }

    public final LocalDate getRecord_date() {
        return this.record_date;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final BigDecimal getService_fee() {
        return this.service_fee;
    }

    public final List<ServiceFeeDiscount> getService_fee_discount_details() {
        return this.service_fee_discount_details;
    }

    public final BigDecimal getService_fee_discount_amount() {
        return this.service_fee_discount_amount;
    }

    public final TransferState getState() {
        return this.state;
    }

    public final TransferType getTransfer_type() {
        return this.transfer_type;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public final ApiManagedAccountTransferDetails getManaged_account_transfer_details() {
        return this.managed_account_transfer_details;
    }

    /* compiled from: ApiPaymentTransfer.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransfer$TransferAccountInfo;", "", "account_name_title", "", "account_name_inline", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccount_name_title", "()Ljava/lang/String;", "getAccount_name_inline", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransferAccountInfo {
        private final String account_name_inline;
        private final String account_name_title;

        public TransferAccountInfo(String str, String str2) {
            this.account_name_title = str;
            this.account_name_inline = str2;
        }

        public final String getAccount_name_title() {
            return this.account_name_title;
        }

        public final String getAccount_name_inline() {
            return this.account_name_inline;
        }
    }
}
