package yoda.service.withdrawal;

import com.robinhood.rosetta.common.Money;
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

/* compiled from: GetAccountTransferSummaryResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\bH\u0016Jx\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006'"}, m3636d2 = {"Lyoda/service/withdrawal/GetAccountTransferSummaryResponse;", "Lcom/squareup/wire/Message;", "", "account_balance", "Lcom/robinhood/rosetta/common/Money;", "min_withdrawable_amount", "min_account_value", "disclosure_warning_percentage", "", "full_withdrawal_alert_percentage", "withdrawable_amount", "outstanding_fees", "withdrawable_amount_after_clawback_applied", "clawback_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getAccount_balance", "()Lcom/robinhood/rosetta/common/Money;", "getMin_withdrawable_amount", "getMin_account_value", "getDisclosure_warning_percentage", "()Ljava/lang/String;", "getFull_withdrawal_alert_percentage", "getWithdrawable_amount", "getOutstanding_fees", "getWithdrawable_amount_after_clawback_applied", "getClawback_amount", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "yoda.v1.withdrawal_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetAccountTransferSummaryResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountTransferSummaryResponse> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "accountBalance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money account_balance;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "clawbackAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Money clawback_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureWarningPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String disclosure_warning_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fullWithdrawalAlertPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String full_withdrawal_alert_percentage;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "minAccountValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money min_account_value;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "minWithdrawableAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money min_withdrawable_amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "outstandingFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Money outstanding_fees;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "withdrawableAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money withdrawable_amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "withdrawableAmountAfterClawbackApplied", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Money withdrawable_amount_after_clawback_applied;

    public GetAccountTransferSummaryResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ GetAccountTransferSummaryResponse(Money money, Money money2, Money money3, String str, String str2, Money money4, Money money5, Money money6, Money money7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : money4, (i & 64) != 0 ? null : money5, (i & 128) != 0 ? null : money6, (i & 256) != 0 ? null : money7, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30122newBuilder();
    }

    public final Money getAccount_balance() {
        return this.account_balance;
    }

    public final Money getMin_withdrawable_amount() {
        return this.min_withdrawable_amount;
    }

    public final Money getMin_account_value() {
        return this.min_account_value;
    }

    public final String getDisclosure_warning_percentage() {
        return this.disclosure_warning_percentage;
    }

    public final String getFull_withdrawal_alert_percentage() {
        return this.full_withdrawal_alert_percentage;
    }

    public final Money getWithdrawable_amount() {
        return this.withdrawable_amount;
    }

    public final Money getOutstanding_fees() {
        return this.outstanding_fees;
    }

    public final Money getWithdrawable_amount_after_clawback_applied() {
        return this.withdrawable_amount_after_clawback_applied;
    }

    public final Money getClawback_amount() {
        return this.clawback_amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountTransferSummaryResponse(Money money, Money money2, Money money3, String disclosure_warning_percentage, String full_withdrawal_alert_percentage, Money money4, Money money5, Money money6, Money money7, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(disclosure_warning_percentage, "disclosure_warning_percentage");
        Intrinsics.checkNotNullParameter(full_withdrawal_alert_percentage, "full_withdrawal_alert_percentage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_balance = money;
        this.min_withdrawable_amount = money2;
        this.min_account_value = money3;
        this.disclosure_warning_percentage = disclosure_warning_percentage;
        this.full_withdrawal_alert_percentage = full_withdrawal_alert_percentage;
        this.withdrawable_amount = money4;
        this.outstanding_fees = money5;
        this.withdrawable_amount_after_clawback_applied = money6;
        this.clawback_amount = money7;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30122newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountTransferSummaryResponse)) {
            return false;
        }
        GetAccountTransferSummaryResponse getAccountTransferSummaryResponse = (GetAccountTransferSummaryResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAccountTransferSummaryResponse.unknownFields()) && Intrinsics.areEqual(this.account_balance, getAccountTransferSummaryResponse.account_balance) && Intrinsics.areEqual(this.min_withdrawable_amount, getAccountTransferSummaryResponse.min_withdrawable_amount) && Intrinsics.areEqual(this.min_account_value, getAccountTransferSummaryResponse.min_account_value) && Intrinsics.areEqual(this.disclosure_warning_percentage, getAccountTransferSummaryResponse.disclosure_warning_percentage) && Intrinsics.areEqual(this.full_withdrawal_alert_percentage, getAccountTransferSummaryResponse.full_withdrawal_alert_percentage) && Intrinsics.areEqual(this.withdrawable_amount, getAccountTransferSummaryResponse.withdrawable_amount) && Intrinsics.areEqual(this.outstanding_fees, getAccountTransferSummaryResponse.outstanding_fees) && Intrinsics.areEqual(this.withdrawable_amount_after_clawback_applied, getAccountTransferSummaryResponse.withdrawable_amount_after_clawback_applied) && Intrinsics.areEqual(this.clawback_amount, getAccountTransferSummaryResponse.clawback_amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.account_balance;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.min_withdrawable_amount;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.min_account_value;
        int iHashCode4 = (((((iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37) + this.disclosure_warning_percentage.hashCode()) * 37) + this.full_withdrawal_alert_percentage.hashCode()) * 37;
        Money money4 = this.withdrawable_amount;
        int iHashCode5 = (iHashCode4 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.outstanding_fees;
        int iHashCode6 = (iHashCode5 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.withdrawable_amount_after_clawback_applied;
        int iHashCode7 = (iHashCode6 + (money6 != null ? money6.hashCode() : 0)) * 37;
        Money money7 = this.clawback_amount;
        int iHashCode8 = iHashCode7 + (money7 != null ? money7.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.account_balance;
        if (money != null) {
            arrayList.add("account_balance=" + money);
        }
        Money money2 = this.min_withdrawable_amount;
        if (money2 != null) {
            arrayList.add("min_withdrawable_amount=" + money2);
        }
        Money money3 = this.min_account_value;
        if (money3 != null) {
            arrayList.add("min_account_value=" + money3);
        }
        arrayList.add("disclosure_warning_percentage=" + Internal.sanitize(this.disclosure_warning_percentage));
        arrayList.add("full_withdrawal_alert_percentage=" + Internal.sanitize(this.full_withdrawal_alert_percentage));
        Money money4 = this.withdrawable_amount;
        if (money4 != null) {
            arrayList.add("withdrawable_amount=" + money4);
        }
        Money money5 = this.outstanding_fees;
        if (money5 != null) {
            arrayList.add("outstanding_fees=" + money5);
        }
        Money money6 = this.withdrawable_amount_after_clawback_applied;
        if (money6 != null) {
            arrayList.add("withdrawable_amount_after_clawback_applied=" + money6);
        }
        Money money7 = this.clawback_amount;
        if (money7 != null) {
            arrayList.add("clawback_amount=" + money7);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountTransferSummaryResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAccountTransferSummaryResponse copy$default(GetAccountTransferSummaryResponse getAccountTransferSummaryResponse, Money money, Money money2, Money money3, String str, String str2, Money money4, Money money5, Money money6, Money money7, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = getAccountTransferSummaryResponse.account_balance;
        }
        if ((i & 2) != 0) {
            money2 = getAccountTransferSummaryResponse.min_withdrawable_amount;
        }
        if ((i & 4) != 0) {
            money3 = getAccountTransferSummaryResponse.min_account_value;
        }
        if ((i & 8) != 0) {
            str = getAccountTransferSummaryResponse.disclosure_warning_percentage;
        }
        if ((i & 16) != 0) {
            str2 = getAccountTransferSummaryResponse.full_withdrawal_alert_percentage;
        }
        if ((i & 32) != 0) {
            money4 = getAccountTransferSummaryResponse.withdrawable_amount;
        }
        if ((i & 64) != 0) {
            money5 = getAccountTransferSummaryResponse.outstanding_fees;
        }
        if ((i & 128) != 0) {
            money6 = getAccountTransferSummaryResponse.withdrawable_amount_after_clawback_applied;
        }
        if ((i & 256) != 0) {
            money7 = getAccountTransferSummaryResponse.clawback_amount;
        }
        if ((i & 512) != 0) {
            byteString = getAccountTransferSummaryResponse.unknownFields();
        }
        Money money8 = money7;
        ByteString byteString2 = byteString;
        Money money9 = money5;
        Money money10 = money6;
        String str3 = str2;
        Money money11 = money4;
        return getAccountTransferSummaryResponse.copy(money, money2, money3, str, str3, money11, money9, money10, money8, byteString2);
    }

    public final GetAccountTransferSummaryResponse copy(Money account_balance, Money min_withdrawable_amount, Money min_account_value, String disclosure_warning_percentage, String full_withdrawal_alert_percentage, Money withdrawable_amount, Money outstanding_fees, Money withdrawable_amount_after_clawback_applied, Money clawback_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(disclosure_warning_percentage, "disclosure_warning_percentage");
        Intrinsics.checkNotNullParameter(full_withdrawal_alert_percentage, "full_withdrawal_alert_percentage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountTransferSummaryResponse(account_balance, min_withdrawable_amount, min_account_value, disclosure_warning_percentage, full_withdrawal_alert_percentage, withdrawable_amount, outstanding_fees, withdrawable_amount_after_clawback_applied, clawback_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountTransferSummaryResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountTransferSummaryResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: yoda.service.withdrawal.GetAccountTransferSummaryResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountTransferSummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAccount_balance() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getAccount_balance());
                }
                if (value.getMin_withdrawable_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getMin_withdrawable_amount());
                }
                if (value.getMin_account_value() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getMin_account_value());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_warning_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDisclosure_warning_percentage());
                }
                if (!Intrinsics.areEqual(value.getFull_withdrawal_alert_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getFull_withdrawal_alert_percentage());
                }
                if (value.getWithdrawable_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getWithdrawable_amount());
                }
                if (value.getOutstanding_fees() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(7, value.getOutstanding_fees());
                }
                if (value.getWithdrawable_amount_after_clawback_applied() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(8, value.getWithdrawable_amount_after_clawback_applied());
                }
                return value.getClawback_amount() != null ? size + Money.ADAPTER.encodedSizeWithTag(9, value.getClawback_amount()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountTransferSummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAccount_balance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_balance());
                }
                if (value.getMin_withdrawable_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMin_withdrawable_amount());
                }
                if (value.getMin_account_value() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getMin_account_value());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_warning_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclosure_warning_percentage());
                }
                if (!Intrinsics.areEqual(value.getFull_withdrawal_alert_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getFull_withdrawal_alert_percentage());
                }
                if (value.getWithdrawable_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getWithdrawable_amount());
                }
                if (value.getOutstanding_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getOutstanding_fees());
                }
                if (value.getWithdrawable_amount_after_clawback_applied() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getWithdrawable_amount_after_clawback_applied());
                }
                if (value.getClawback_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 9, (int) value.getClawback_amount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountTransferSummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getClawback_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 9, (int) value.getClawback_amount());
                }
                if (value.getWithdrawable_amount_after_clawback_applied() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getWithdrawable_amount_after_clawback_applied());
                }
                if (value.getOutstanding_fees() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getOutstanding_fees());
                }
                if (value.getWithdrawable_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getWithdrawable_amount());
                }
                if (!Intrinsics.areEqual(value.getFull_withdrawal_alert_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getFull_withdrawal_alert_percentage());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_warning_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclosure_warning_percentage());
                }
                if (value.getMin_account_value() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getMin_account_value());
                }
                if (value.getMin_withdrawable_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMin_withdrawable_amount());
                }
                if (value.getAccount_balance() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getAccount_balance());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountTransferSummaryResponse redact(GetAccountTransferSummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money account_balance = value.getAccount_balance();
                Money moneyRedact = account_balance != null ? Money.ADAPTER.redact(account_balance) : null;
                Money min_withdrawable_amount = value.getMin_withdrawable_amount();
                Money moneyRedact2 = min_withdrawable_amount != null ? Money.ADAPTER.redact(min_withdrawable_amount) : null;
                Money min_account_value = value.getMin_account_value();
                Money moneyRedact3 = min_account_value != null ? Money.ADAPTER.redact(min_account_value) : null;
                Money withdrawable_amount = value.getWithdrawable_amount();
                Money moneyRedact4 = withdrawable_amount != null ? Money.ADAPTER.redact(withdrawable_amount) : null;
                Money outstanding_fees = value.getOutstanding_fees();
                Money moneyRedact5 = outstanding_fees != null ? Money.ADAPTER.redact(outstanding_fees) : null;
                Money withdrawable_amount_after_clawback_applied = value.getWithdrawable_amount_after_clawback_applied();
                Money moneyRedact6 = withdrawable_amount_after_clawback_applied != null ? Money.ADAPTER.redact(withdrawable_amount_after_clawback_applied) : null;
                Money clawback_amount = value.getClawback_amount();
                return GetAccountTransferSummaryResponse.copy$default(value, moneyRedact, moneyRedact2, moneyRedact3, null, null, moneyRedact4, moneyRedact5, moneyRedact6, clawback_amount != null ? Money.ADAPTER.redact(clawback_amount) : null, ByteString.EMPTY, 24, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountTransferSummaryResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                Money moneyDecode5 = null;
                Money moneyDecode6 = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                Money moneyDecode7 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 2:
                                moneyDecode7 = Money.ADAPTER.decode(reader);
                                break;
                            case 3:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                break;
                            case 8:
                                moneyDecode5 = Money.ADAPTER.decode(reader);
                                break;
                            case 9:
                                moneyDecode6 = Money.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetAccountTransferSummaryResponse(moneyDecode, moneyDecode7, moneyDecode2, strDecode, strDecode2, moneyDecode3, moneyDecode4, moneyDecode5, moneyDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
