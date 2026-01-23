package nummus.p512v1;

import com.plaid.internal.EnumC7081g;
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
import p479j$.time.Instant;

/* compiled from: CorpActionCashDividendsPayment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u009f\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J¥\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010#R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010#R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b)\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b-\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b.\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\"\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\"\u0010\u0012\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b8\u00107R\"\u0010\u0013\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b9\u00107¨\u0006;"}, m3636d2 = {"Lnummus/v1/CorpActionCashDividendsPayment;", "Lcom/squareup/wire/Message;", "", "", "id", "account_id", "position", "Lcom/robinhood/rosetta/common/Money;", "gross_amount", "withholding_amount", "net_amount", "Lnummus/v1/CorpActionCashDividends;", "dividends", "Lnummus/v1/CorpActionPaymentState;", "corp_action_payment_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "paid_at", "updated_at", "created_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lnummus/v1/CorpActionCashDividends;Lnummus/v1/CorpActionPaymentState;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lnummus/v1/CorpActionCashDividends;Lnummus/v1/CorpActionPaymentState;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lnummus/v1/CorpActionCashDividendsPayment;", "Ljava/lang/String;", "getId", "getAccount_id", "getPosition", "Lcom/robinhood/rosetta/common/Money;", "getGross_amount", "()Lcom/robinhood/rosetta/common/Money;", "getWithholding_amount", "getNet_amount", "Lnummus/v1/CorpActionCashDividends;", "getDividends", "()Lnummus/v1/CorpActionCashDividends;", "Lnummus/v1/CorpActionPaymentState;", "getCorp_action_payment_state", "()Lnummus/v1/CorpActionPaymentState;", "Lj$/time/Instant;", "getPaid_at", "()Lj$/time/Instant;", "getUpdated_at", "getCreated_at", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CorpActionCashDividendsPayment extends Message {

    @JvmField
    public static final ProtoAdapter<CorpActionCashDividendsPayment> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "nummus.v1.CorpActionPaymentState#ADAPTER", jsonName = "corpActionPaymentState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final CorpActionPaymentState corp_action_payment_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Instant created_at;

    @WireField(adapter = "nummus.v1.CorpActionCashDividends#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final CorpActionCashDividends dividends;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "grossAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money gross_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "netAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money net_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "paidAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Instant paid_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Instant updated_at;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "withholdingAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money withholding_amount;

    public CorpActionCashDividendsPayment() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public /* synthetic */ CorpActionCashDividendsPayment(String str, String str2, String str3, Money money, Money money2, Money money3, CorpActionCashDividends corpActionCashDividends, CorpActionPaymentState corpActionPaymentState, Instant instant, Instant instant2, Instant instant3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : money, (i & 16) != 0 ? null : money2, (i & 32) != 0 ? null : money3, (i & 64) != 0 ? null : corpActionCashDividends, (i & 128) != 0 ? CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED : corpActionPaymentState, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : instant2, (i & 1024) != 0 ? null : instant3, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29397newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getPosition() {
        return this.position;
    }

    public final Money getGross_amount() {
        return this.gross_amount;
    }

    public final Money getWithholding_amount() {
        return this.withholding_amount;
    }

    public final Money getNet_amount() {
        return this.net_amount;
    }

    public final CorpActionCashDividends getDividends() {
        return this.dividends;
    }

    public final CorpActionPaymentState getCorp_action_payment_state() {
        return this.corp_action_payment_state;
    }

    public final Instant getPaid_at() {
        return this.paid_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorpActionCashDividendsPayment(String id, String account_id, String position, Money money, Money money2, Money money3, CorpActionCashDividends corpActionCashDividends, CorpActionPaymentState corp_action_payment_state, Instant instant, Instant instant2, Instant instant3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(corp_action_payment_state, "corp_action_payment_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_id = account_id;
        this.position = position;
        this.gross_amount = money;
        this.withholding_amount = money2;
        this.net_amount = money3;
        this.dividends = corpActionCashDividends;
        this.corp_action_payment_state = corp_action_payment_state;
        this.paid_at = instant;
        this.updated_at = instant2;
        this.created_at = instant3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29397newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CorpActionCashDividendsPayment)) {
            return false;
        }
        CorpActionCashDividendsPayment corpActionCashDividendsPayment = (CorpActionCashDividendsPayment) other;
        return Intrinsics.areEqual(unknownFields(), corpActionCashDividendsPayment.unknownFields()) && Intrinsics.areEqual(this.id, corpActionCashDividendsPayment.id) && Intrinsics.areEqual(this.account_id, corpActionCashDividendsPayment.account_id) && Intrinsics.areEqual(this.position, corpActionCashDividendsPayment.position) && Intrinsics.areEqual(this.gross_amount, corpActionCashDividendsPayment.gross_amount) && Intrinsics.areEqual(this.withholding_amount, corpActionCashDividendsPayment.withholding_amount) && Intrinsics.areEqual(this.net_amount, corpActionCashDividendsPayment.net_amount) && Intrinsics.areEqual(this.dividends, corpActionCashDividendsPayment.dividends) && this.corp_action_payment_state == corpActionCashDividendsPayment.corp_action_payment_state && Intrinsics.areEqual(this.paid_at, corpActionCashDividendsPayment.paid_at) && Intrinsics.areEqual(this.updated_at, corpActionCashDividendsPayment.updated_at) && Intrinsics.areEqual(this.created_at, corpActionCashDividendsPayment.created_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.position.hashCode()) * 37;
        Money money = this.gross_amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.withholding_amount;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.net_amount;
        int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        CorpActionCashDividends corpActionCashDividends = this.dividends;
        int iHashCode5 = (((iHashCode4 + (corpActionCashDividends != null ? corpActionCashDividends.hashCode() : 0)) * 37) + this.corp_action_payment_state.hashCode()) * 37;
        Instant instant = this.paid_at;
        int iHashCode6 = (iHashCode5 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode7 = (iHashCode6 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.created_at;
        int iHashCode8 = iHashCode7 + (instant3 != null ? instant3.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("position=" + Internal.sanitize(this.position));
        Money money = this.gross_amount;
        if (money != null) {
            arrayList.add("gross_amount=" + money);
        }
        Money money2 = this.withholding_amount;
        if (money2 != null) {
            arrayList.add("withholding_amount=" + money2);
        }
        Money money3 = this.net_amount;
        if (money3 != null) {
            arrayList.add("net_amount=" + money3);
        }
        CorpActionCashDividends corpActionCashDividends = this.dividends;
        if (corpActionCashDividends != null) {
            arrayList.add("dividends=" + corpActionCashDividends);
        }
        arrayList.add("corp_action_payment_state=" + this.corp_action_payment_state);
        Instant instant = this.paid_at;
        if (instant != null) {
            arrayList.add("paid_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        Instant instant3 = this.created_at;
        if (instant3 != null) {
            arrayList.add("created_at=" + instant3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CorpActionCashDividendsPayment{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CorpActionCashDividendsPayment copy$default(CorpActionCashDividendsPayment corpActionCashDividendsPayment, String str, String str2, String str3, Money money, Money money2, Money money3, CorpActionCashDividends corpActionCashDividends, CorpActionPaymentState corpActionPaymentState, Instant instant, Instant instant2, Instant instant3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = corpActionCashDividendsPayment.id;
        }
        if ((i & 2) != 0) {
            str2 = corpActionCashDividendsPayment.account_id;
        }
        if ((i & 4) != 0) {
            str3 = corpActionCashDividendsPayment.position;
        }
        if ((i & 8) != 0) {
            money = corpActionCashDividendsPayment.gross_amount;
        }
        if ((i & 16) != 0) {
            money2 = corpActionCashDividendsPayment.withholding_amount;
        }
        if ((i & 32) != 0) {
            money3 = corpActionCashDividendsPayment.net_amount;
        }
        if ((i & 64) != 0) {
            corpActionCashDividends = corpActionCashDividendsPayment.dividends;
        }
        if ((i & 128) != 0) {
            corpActionPaymentState = corpActionCashDividendsPayment.corp_action_payment_state;
        }
        if ((i & 256) != 0) {
            instant = corpActionCashDividendsPayment.paid_at;
        }
        if ((i & 512) != 0) {
            instant2 = corpActionCashDividendsPayment.updated_at;
        }
        if ((i & 1024) != 0) {
            instant3 = corpActionCashDividendsPayment.created_at;
        }
        if ((i & 2048) != 0) {
            byteString = corpActionCashDividendsPayment.unknownFields();
        }
        Instant instant4 = instant3;
        ByteString byteString2 = byteString;
        Instant instant5 = instant;
        Instant instant6 = instant2;
        CorpActionCashDividends corpActionCashDividends2 = corpActionCashDividends;
        CorpActionPaymentState corpActionPaymentState2 = corpActionPaymentState;
        Money money4 = money2;
        Money money5 = money3;
        return corpActionCashDividendsPayment.copy(str, str2, str3, money, money4, money5, corpActionCashDividends2, corpActionPaymentState2, instant5, instant6, instant4, byteString2);
    }

    public final CorpActionCashDividendsPayment copy(String id, String account_id, String position, Money gross_amount, Money withholding_amount, Money net_amount, CorpActionCashDividends dividends, CorpActionPaymentState corp_action_payment_state, Instant paid_at, Instant updated_at, Instant created_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(corp_action_payment_state, "corp_action_payment_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CorpActionCashDividendsPayment(id, account_id, position, gross_amount, withholding_amount, net_amount, dividends, corp_action_payment_state, paid_at, updated_at, created_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CorpActionCashDividendsPayment.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CorpActionCashDividendsPayment>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.CorpActionCashDividendsPayment$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CorpActionCashDividendsPayment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getPosition(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPosition());
                }
                if (value.getGross_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getGross_amount());
                }
                if (value.getWithholding_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getWithholding_amount());
                }
                if (value.getNet_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getNet_amount());
                }
                if (value.getDividends() != null) {
                    size += CorpActionCashDividends.ADAPTER.encodedSizeWithTag(7, value.getDividends());
                }
                if (value.getCorp_action_payment_state() != CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED) {
                    size += CorpActionPaymentState.ADAPTER.encodedSizeWithTag(8, value.getCorp_action_payment_state());
                }
                if (value.getPaid_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getPaid_at());
                }
                if (value.getUpdated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(10, value.getUpdated_at());
                }
                return value.getCreated_at() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getCreated_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CorpActionCashDividendsPayment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getPosition(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPosition());
                }
                if (value.getGross_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getGross_amount());
                }
                if (value.getWithholding_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getWithholding_amount());
                }
                if (value.getNet_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getNet_amount());
                }
                if (value.getDividends() != null) {
                    CorpActionCashDividends.ADAPTER.encodeWithTag(writer, 7, (int) value.getDividends());
                }
                if (value.getCorp_action_payment_state() != CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED) {
                    CorpActionPaymentState.ADAPTER.encodeWithTag(writer, 8, (int) value.getCorp_action_payment_state());
                }
                if (value.getPaid_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getPaid_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 10, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getCreated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CorpActionCashDividendsPayment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 10, (int) value.getUpdated_at());
                }
                if (value.getPaid_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getPaid_at());
                }
                if (value.getCorp_action_payment_state() != CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED) {
                    CorpActionPaymentState.ADAPTER.encodeWithTag(writer, 8, (int) value.getCorp_action_payment_state());
                }
                if (value.getDividends() != null) {
                    CorpActionCashDividends.ADAPTER.encodeWithTag(writer, 7, (int) value.getDividends());
                }
                if (value.getNet_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getNet_amount());
                }
                if (value.getWithholding_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getWithholding_amount());
                }
                if (value.getGross_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getGross_amount());
                }
                if (!Intrinsics.areEqual(value.getPosition(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPosition());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CorpActionCashDividendsPayment decode(ProtoReader reader) throws IOException {
                CorpActionPaymentState corpActionPaymentState;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                CorpActionPaymentState corpActionPaymentState2 = CorpActionPaymentState.CORP_ACTION_PAYMENT_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                CorpActionCashDividends corpActionCashDividendsDecode = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                CorpActionPaymentState corpActionPaymentStateDecode = corpActionPaymentState2;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 6:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                continue;
                            case 7:
                                corpActionCashDividendsDecode = CorpActionCashDividends.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                try {
                                    corpActionPaymentStateDecode = CorpActionPaymentState.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    corpActionPaymentState = corpActionPaymentStateDecode;
                                    str = strDecode3;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 9:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 10:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 11:
                                instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                corpActionPaymentState = corpActionPaymentStateDecode;
                                str = strDecode3;
                                str2 = strDecode;
                                break;
                        }
                        corpActionPaymentStateDecode = corpActionPaymentState;
                        strDecode3 = str;
                        strDecode = str2;
                    } else {
                        return new CorpActionCashDividendsPayment(strDecode3, strDecode, strDecode2, moneyDecode, moneyDecode2, moneyDecode3, corpActionCashDividendsDecode, corpActionPaymentStateDecode, instantDecode, instantDecode2, instantDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CorpActionCashDividendsPayment redact(CorpActionCashDividendsPayment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money gross_amount = value.getGross_amount();
                Money moneyRedact = gross_amount != null ? Money.ADAPTER.redact(gross_amount) : null;
                Money withholding_amount = value.getWithholding_amount();
                Money moneyRedact2 = withholding_amount != null ? Money.ADAPTER.redact(withholding_amount) : null;
                Money net_amount = value.getNet_amount();
                Money moneyRedact3 = net_amount != null ? Money.ADAPTER.redact(net_amount) : null;
                CorpActionCashDividends dividends = value.getDividends();
                CorpActionCashDividends corpActionCashDividendsRedact = dividends != null ? CorpActionCashDividends.ADAPTER.redact(dividends) : null;
                Instant paid_at = value.getPaid_at();
                Instant instantRedact = paid_at != null ? ProtoAdapter.INSTANT.redact(paid_at) : null;
                Instant updated_at = value.getUpdated_at();
                Instant instantRedact2 = updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null;
                Instant created_at = value.getCreated_at();
                return CorpActionCashDividendsPayment.copy$default(value, null, null, null, moneyRedact, moneyRedact2, moneyRedact3, corpActionCashDividendsRedact, null, instantRedact, instantRedact2, created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, null);
            }
        };
    }
}
