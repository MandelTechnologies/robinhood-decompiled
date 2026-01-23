package bff_money_movement.service.p019v1;

import cashier_protos.payment_hub.p046v1.FXTransferDetails;
import cashier_protos.payment_intents.p047v1.Direction;
import cashier_protos.payment_intents.p047v1.Purpose;
import cashier_protos.payment_intents.p047v1.State;
import com.robinhood.rosetta.common.AccountType;
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
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: PaymentIntent.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u00103\u001a\u00020\u0002H\u0017J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J°\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001aR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 ¨\u0006="}, m3636d2 = {"Lbff_money_movement/service/v1/PaymentIntent;", "Lcom/squareup/wire/Message;", "", "id", "", "amount", "Lcom/robinhood/rosetta/common/Money;", "state", "Lcashier_protos/payment_intents/v1/State;", "direction", "Lcashier_protos/payment_intents/v1/Direction;", "purpose", "Lcashier_protos/payment_intents/v1/Purpose;", "rh_account_id", "rh_account_type", "Lcom/robinhood/rosetta/common/AccountType;", "payment_instrument_id", "payment_instrument_type", "fx_transfer_details", "Lcashier_protos/payment_hub/v1/FXTransferDetails;", "created_at", "updated_at", "received_amount", "service_fee", "tax_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcashier_protos/payment_intents/v1/State;Lcashier_protos/payment_intents/v1/Direction;Lcashier_protos/payment_intents/v1/Purpose;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountType;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountType;Lcashier_protos/payment_hub/v1/FXTransferDetails;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "getState", "()Lcashier_protos/payment_intents/v1/State;", "getDirection", "()Lcashier_protos/payment_intents/v1/Direction;", "getPurpose", "()Lcashier_protos/payment_intents/v1/Purpose;", "getRh_account_id", "getRh_account_type", "()Lcom/robinhood/rosetta/common/AccountType;", "getPayment_instrument_id", "getPayment_instrument_type", "getFx_transfer_details", "()Lcashier_protos/payment_hub/v1/FXTransferDetails;", "getCreated_at", "getUpdated_at", "getReceived_amount", "getService_fee", "getTax_amount", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class PaymentIntent extends Message {

    @JvmField
    public static final ProtoAdapter<PaymentIntent> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String created_at;

    @WireField(adapter = "cashier_protos.payment_intents.v1.Direction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Direction direction;

    @WireField(adapter = "cashier_protos.payment_hub.v1.FXTransferDetails#ADAPTER", jsonName = "fxTransferDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final FXTransferDetails fx_transfer_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "paymentInstrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String payment_instrument_id;

    @WireField(adapter = "com.robinhood.rosetta.common.AccountType#ADAPTER", jsonName = "paymentInstrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final AccountType payment_instrument_type;

    @WireField(adapter = "cashier_protos.payment_intents.v1.Purpose#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Purpose purpose;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "receivedAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Money received_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhAccountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String rh_account_id;

    @WireField(adapter = "com.robinhood.rosetta.common.AccountType#ADAPTER", jsonName = "rhAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final AccountType rh_account_type;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "serviceFee", schemaIndex = 13, tag = 14)
    private final Money service_fee;

    @WireField(adapter = "cashier_protos.payment_intents.v1.State#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final State state;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "taxAmount", schemaIndex = 14, tag = 15)
    private final Money tax_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String updated_at;

    public PaymentIntent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    public /* synthetic */ PaymentIntent(String str, Money money, State state, Direction direction, Purpose purpose, String str2, AccountType accountType, String str3, AccountType accountType2, FXTransferDetails fXTransferDetails, String str4, String str5, Money money2, Money money3, Money money4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? State.STATE_UNSPECIFIED : state, (i & 8) != 0 ? Direction.DIRECTION_UNSPECIFIED : direction, (i & 16) != 0 ? Purpose.PURPOSE_UNSPECIFIED : purpose, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType2, (i & 512) != 0 ? null : fXTransferDetails, (i & 1024) != 0 ? "" : str4, (i & 2048) == 0 ? str5 : "", (i & 4096) != 0 ? null : money2, (i & 8192) != 0 ? null : money3, (i & 16384) != 0 ? null : money4, (i & 32768) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8498newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final State getState() {
        return this.state;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final Purpose getPurpose() {
        return this.purpose;
    }

    public final String getRh_account_id() {
        return this.rh_account_id;
    }

    public final AccountType getRh_account_type() {
        return this.rh_account_type;
    }

    public final String getPayment_instrument_id() {
        return this.payment_instrument_id;
    }

    public final AccountType getPayment_instrument_type() {
        return this.payment_instrument_type;
    }

    public final FXTransferDetails getFx_transfer_details() {
        return this.fx_transfer_details;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public final Money getReceived_amount() {
        return this.received_amount;
    }

    public final Money getService_fee() {
        return this.service_fee;
    }

    public final Money getTax_amount() {
        return this.tax_amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIntent(String id, Money money, State state, Direction direction, Purpose purpose, String rh_account_id, AccountType rh_account_type, String payment_instrument_id, AccountType payment_instrument_type, FXTransferDetails fXTransferDetails, String created_at, String updated_at, Money money2, Money money3, Money money4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(rh_account_id, "rh_account_id");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(payment_instrument_id, "payment_instrument_id");
        Intrinsics.checkNotNullParameter(payment_instrument_type, "payment_instrument_type");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.amount = money;
        this.state = state;
        this.direction = direction;
        this.purpose = purpose;
        this.rh_account_id = rh_account_id;
        this.rh_account_type = rh_account_type;
        this.payment_instrument_id = payment_instrument_id;
        this.payment_instrument_type = payment_instrument_type;
        this.fx_transfer_details = fXTransferDetails;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.received_amount = money2;
        this.service_fee = money3;
        this.tax_amount = money4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8498newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PaymentIntent)) {
            return false;
        }
        PaymentIntent paymentIntent = (PaymentIntent) other;
        return Intrinsics.areEqual(unknownFields(), paymentIntent.unknownFields()) && Intrinsics.areEqual(this.id, paymentIntent.id) && Intrinsics.areEqual(this.amount, paymentIntent.amount) && this.state == paymentIntent.state && this.direction == paymentIntent.direction && this.purpose == paymentIntent.purpose && Intrinsics.areEqual(this.rh_account_id, paymentIntent.rh_account_id) && this.rh_account_type == paymentIntent.rh_account_type && Intrinsics.areEqual(this.payment_instrument_id, paymentIntent.payment_instrument_id) && this.payment_instrument_type == paymentIntent.payment_instrument_type && Intrinsics.areEqual(this.fx_transfer_details, paymentIntent.fx_transfer_details) && Intrinsics.areEqual(this.created_at, paymentIntent.created_at) && Intrinsics.areEqual(this.updated_at, paymentIntent.updated_at) && Intrinsics.areEqual(this.received_amount, paymentIntent.received_amount) && Intrinsics.areEqual(this.service_fee, paymentIntent.service_fee) && Intrinsics.areEqual(this.tax_amount, paymentIntent.tax_amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (((((((((((((((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.state.hashCode()) * 37) + this.direction.hashCode()) * 37) + this.purpose.hashCode()) * 37) + this.rh_account_id.hashCode()) * 37) + this.rh_account_type.hashCode()) * 37) + this.payment_instrument_id.hashCode()) * 37) + this.payment_instrument_type.hashCode()) * 37;
        FXTransferDetails fXTransferDetails = this.fx_transfer_details;
        int iHashCode3 = (((((iHashCode2 + (fXTransferDetails != null ? fXTransferDetails.hashCode() : 0)) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode()) * 37;
        Money money2 = this.received_amount;
        int iHashCode4 = (iHashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.service_fee;
        int iHashCode5 = (iHashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.tax_amount;
        int iHashCode6 = iHashCode5 + (money4 != null ? money4.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        arrayList.add("state=" + this.state);
        arrayList.add("direction=" + this.direction);
        arrayList.add("purpose=" + this.purpose);
        arrayList.add("rh_account_id=" + Internal.sanitize(this.rh_account_id));
        arrayList.add("rh_account_type=" + this.rh_account_type);
        arrayList.add("payment_instrument_id=" + Internal.sanitize(this.payment_instrument_id));
        arrayList.add("payment_instrument_type=" + this.payment_instrument_type);
        FXTransferDetails fXTransferDetails = this.fx_transfer_details;
        if (fXTransferDetails != null) {
            arrayList.add("fx_transfer_details=" + fXTransferDetails);
        }
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        Money money2 = this.received_amount;
        if (money2 != null) {
            arrayList.add("received_amount=" + money2);
        }
        Money money3 = this.service_fee;
        if (money3 != null) {
            arrayList.add("service_fee=" + money3);
        }
        Money money4 = this.tax_amount;
        if (money4 != null) {
            arrayList.add("tax_amount=" + money4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentIntent{", "}", 0, null, null, 56, null);
    }

    public final PaymentIntent copy(String id, Money amount, State state, Direction direction, Purpose purpose, String rh_account_id, AccountType rh_account_type, String payment_instrument_id, AccountType payment_instrument_type, FXTransferDetails fx_transfer_details, String created_at, String updated_at, Money received_amount, Money service_fee, Money tax_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(rh_account_id, "rh_account_id");
        Intrinsics.checkNotNullParameter(rh_account_type, "rh_account_type");
        Intrinsics.checkNotNullParameter(payment_instrument_id, "payment_instrument_id");
        Intrinsics.checkNotNullParameter(payment_instrument_type, "payment_instrument_type");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PaymentIntent(id, amount, state, direction, purpose, rh_account_id, rh_account_type, payment_instrument_id, payment_instrument_type, fx_transfer_details, created_at, updated_at, received_amount, service_fee, tax_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PaymentIntent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PaymentIntent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.PaymentIntent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentIntent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getAmount());
                }
                if (value.getState() != State.STATE_UNSPECIFIED) {
                    size += State.ADAPTER.encodedSizeWithTag(3, value.getState());
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    size += Direction.ADAPTER.encodedSizeWithTag(4, value.getDirection());
                }
                if (value.getPurpose() != Purpose.PURPOSE_UNSPECIFIED) {
                    size += Purpose.ADAPTER.encodedSizeWithTag(5, value.getPurpose());
                }
                if (!Intrinsics.areEqual(value.getRh_account_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getRh_account_id());
                }
                AccountType rh_account_type = value.getRh_account_type();
                AccountType accountType = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                if (rh_account_type != accountType) {
                    size += AccountType.ADAPTER.encodedSizeWithTag(7, value.getRh_account_type());
                }
                if (!Intrinsics.areEqual(value.getPayment_instrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getPayment_instrument_id());
                }
                if (value.getPayment_instrument_type() != accountType) {
                    size += AccountType.ADAPTER.encodedSizeWithTag(9, value.getPayment_instrument_type());
                }
                if (value.getFx_transfer_details() != null) {
                    size += FXTransferDetails.ADAPTER.encodedSizeWithTag(10, value.getFx_transfer_details());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getUpdated_at());
                }
                if (value.getReceived_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(13, value.getReceived_amount());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                return size + protoAdapter.encodedSizeWithTag(14, value.getService_fee()) + protoAdapter.encodedSizeWithTag(15, value.getTax_amount());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentIntent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (value.getState() != State.STATE_UNSPECIFIED) {
                    State.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    Direction.ADAPTER.encodeWithTag(writer, 4, (int) value.getDirection());
                }
                if (value.getPurpose() != Purpose.PURPOSE_UNSPECIFIED) {
                    Purpose.ADAPTER.encodeWithTag(writer, 5, (int) value.getPurpose());
                }
                if (!Intrinsics.areEqual(value.getRh_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getRh_account_id());
                }
                AccountType rh_account_type = value.getRh_account_type();
                AccountType accountType = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                if (rh_account_type != accountType) {
                    AccountType.ADAPTER.encodeWithTag(writer, 7, (int) value.getRh_account_type());
                }
                if (!Intrinsics.areEqual(value.getPayment_instrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPayment_instrument_id());
                }
                if (value.getPayment_instrument_type() != accountType) {
                    AccountType.ADAPTER.encodeWithTag(writer, 9, (int) value.getPayment_instrument_type());
                }
                if (value.getFx_transfer_details() != null) {
                    FXTransferDetails.ADAPTER.encodeWithTag(writer, 10, (int) value.getFx_transfer_details());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getUpdated_at());
                }
                if (value.getReceived_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 13, (int) value.getReceived_amount());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 14, (int) value.getService_fee());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getTax_amount());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentIntent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 15, (int) value.getTax_amount());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getService_fee());
                if (value.getReceived_amount() != null) {
                    protoAdapter.encodeWithTag(writer, 13, (int) value.getReceived_amount());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getCreated_at());
                }
                if (value.getFx_transfer_details() != null) {
                    FXTransferDetails.ADAPTER.encodeWithTag(writer, 10, (int) value.getFx_transfer_details());
                }
                AccountType payment_instrument_type = value.getPayment_instrument_type();
                AccountType accountType = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                if (payment_instrument_type != accountType) {
                    AccountType.ADAPTER.encodeWithTag(writer, 9, (int) value.getPayment_instrument_type());
                }
                if (!Intrinsics.areEqual(value.getPayment_instrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPayment_instrument_id());
                }
                if (value.getRh_account_type() != accountType) {
                    AccountType.ADAPTER.encodeWithTag(writer, 7, (int) value.getRh_account_type());
                }
                if (!Intrinsics.areEqual(value.getRh_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getRh_account_id());
                }
                if (value.getPurpose() != Purpose.PURPOSE_UNSPECIFIED) {
                    Purpose.ADAPTER.encodeWithTag(writer, 5, (int) value.getPurpose());
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    Direction.ADAPTER.encodeWithTag(writer, 4, (int) value.getDirection());
                }
                if (value.getState() != State.STATE_UNSPECIFIED) {
                    State.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getAmount() != null) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getAmount());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentIntent decode(ProtoReader reader) throws IOException {
                Direction direction;
                AccountType accountType;
                AccountType accountType2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                State state = State.STATE_UNSPECIFIED;
                Direction direction2 = Direction.DIRECTION_UNSPECIFIED;
                Purpose purpose = Purpose.PURPOSE_UNSPECIFIED;
                AccountType accountType3 = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                State stateDecode = state;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                Money moneyDecode = null;
                FXTransferDetails fXTransferDetailsDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                AccountType accountTypeDecode = accountType3;
                AccountType accountTypeDecode2 = accountTypeDecode;
                Purpose purposeDecode = purpose;
                Direction directionDecode = direction2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 3:
                                direction = directionDecode;
                                accountType = accountTypeDecode;
                                accountType2 = accountTypeDecode2;
                                try {
                                    stateDecode = State.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                directionDecode = direction;
                                accountTypeDecode = accountType;
                                accountTypeDecode2 = accountType2;
                                break;
                            case 4:
                                direction = directionDecode;
                                accountType = accountTypeDecode;
                                accountType2 = accountTypeDecode2;
                                try {
                                    directionDecode = Direction.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                accountTypeDecode = accountType;
                                accountTypeDecode2 = accountType2;
                                break;
                            case 5:
                                direction = directionDecode;
                                accountType = accountTypeDecode;
                                accountType2 = accountTypeDecode2;
                                try {
                                    purposeDecode = Purpose.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                                directionDecode = direction;
                                accountTypeDecode = accountType;
                                accountTypeDecode2 = accountType2;
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                direction = directionDecode;
                                accountType = accountTypeDecode;
                                accountType2 = accountTypeDecode2;
                                try {
                                    accountTypeDecode = AccountType.ADAPTER.decode(reader);
                                    directionDecode = direction;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                                accountTypeDecode2 = accountType2;
                                break;
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                try {
                                    accountTypeDecode2 = AccountType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    direction = directionDecode;
                                    accountType = accountTypeDecode;
                                    accountType2 = accountTypeDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            case 10:
                                fXTransferDetailsDecode = FXTransferDetails.ADAPTER.decode(reader);
                                break;
                            case 11:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 14:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            case 15:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                direction = directionDecode;
                                accountType = accountTypeDecode;
                                accountType2 = accountTypeDecode2;
                                directionDecode = direction;
                                accountTypeDecode = accountType;
                                accountTypeDecode2 = accountType2;
                                break;
                        }
                    } else {
                        return new PaymentIntent(strDecode, moneyDecode, stateDecode, directionDecode, purposeDecode, strDecode2, accountTypeDecode, strDecode3, accountTypeDecode2, fXTransferDetailsDecode, strDecode4, strDecode5, moneyDecode2, moneyDecode3, moneyDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentIntent redact(PaymentIntent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                FXTransferDetails fx_transfer_details = value.getFx_transfer_details();
                FXTransferDetails fXTransferDetailsRedact = fx_transfer_details != null ? FXTransferDetails.ADAPTER.redact(fx_transfer_details) : null;
                Money received_amount = value.getReceived_amount();
                Money moneyRedact2 = received_amount != null ? Money.ADAPTER.redact(received_amount) : null;
                Money service_fee = value.getService_fee();
                Money moneyRedact3 = service_fee != null ? Money.ADAPTER.redact(service_fee) : null;
                Money tax_amount = value.getTax_amount();
                return value.copy((3581 & 1) != 0 ? value.id : null, (3581 & 2) != 0 ? value.amount : moneyRedact, (3581 & 4) != 0 ? value.state : null, (3581 & 8) != 0 ? value.direction : null, (3581 & 16) != 0 ? value.purpose : null, (3581 & 32) != 0 ? value.rh_account_id : null, (3581 & 64) != 0 ? value.rh_account_type : null, (3581 & 128) != 0 ? value.payment_instrument_id : null, (3581 & 256) != 0 ? value.payment_instrument_type : null, (3581 & 512) != 0 ? value.fx_transfer_details : fXTransferDetailsRedact, (3581 & 1024) != 0 ? value.created_at : null, (3581 & 2048) != 0 ? value.updated_at : null, (3581 & 4096) != 0 ? value.received_amount : moneyRedact2, (3581 & 8192) != 0 ? value.service_fee : moneyRedact3, (3581 & 16384) != 0 ? value.tax_amount : tax_amount != null ? Money.ADAPTER.redact(tax_amount) : null, (3581 & 32768) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
