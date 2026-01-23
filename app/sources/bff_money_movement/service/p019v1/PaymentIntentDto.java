package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import cashier_protos.payment_hub.p046v1.FXTransferDetails;
import cashier_protos.payment_hub.p046v1.FXTransferDetailsDto;
import cashier_protos.payment_intents.p047v1.Direction;
import cashier_protos.payment_intents.p047v1.DirectionDto;
import cashier_protos.payment_intents.p047v1.Purpose;
import cashier_protos.payment_intents.p047v1.PurposeDto;
import cashier_protos.payment_intents.p047v1.State;
import cashier_protos.payment_intents.p047v1.StateDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.AccountType;
import com.robinhood.rosetta.common.AccountTypeDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: PaymentIntentDto.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004IHJKB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B©\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020(H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020(H\u0016¢\u0006\u0004\b1\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b<\u0010\"R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b?\u0010\"R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b@\u0010>R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010\u0019\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bC\u0010\"R\u0011\u0010\u001a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bD\u0010\"R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bE\u00105R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bF\u00105R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bG\u00105¨\u0006L"}, m3636d2 = {"Lbff_money_movement/service/v1/PaymentIntentDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/PaymentIntent;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/PaymentIntentDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/PaymentIntentDto$Surrogate;)V", "", "id", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "Lcashier_protos/payment_intents/v1/StateDto;", "state", "Lcashier_protos/payment_intents/v1/DirectionDto;", "direction", "Lcashier_protos/payment_intents/v1/PurposeDto;", "purpose", "rh_account_id", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "rh_account_type", "payment_instrument_id", "payment_instrument_type", "Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;", "fx_transfer_details", "created_at", "updated_at", "received_amount", "service_fee", "tax_amount", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcashier_protos/payment_intents/v1/StateDto;Lcashier_protos/payment_intents/v1/DirectionDto;Lcashier_protos/payment_intents/v1/PurposeDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "toProto", "()Lbff_money_movement/service/v1/PaymentIntent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/PaymentIntentDto$Surrogate;", "getId", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getState", "()Lcashier_protos/payment_intents/v1/StateDto;", "getDirection", "()Lcashier_protos/payment_intents/v1/DirectionDto;", "getPurpose", "()Lcashier_protos/payment_intents/v1/PurposeDto;", "getRh_account_id", "getRh_account_type", "()Lcom/robinhood/rosetta/common/AccountTypeDto;", "getPayment_instrument_id", "getPayment_instrument_type", "getFx_transfer_details", "()Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;", "getCreated_at", "getUpdated_at", "getReceived_amount", "getService_fee", "getTax_amount", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class PaymentIntentDto implements Dto3<PaymentIntent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PaymentIntentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PaymentIntentDto, PaymentIntent>> binaryBase64Serializer$delegate;
    private static final PaymentIntentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PaymentIntentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PaymentIntentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final StateDto getState() {
        return this.surrogate.getState();
    }

    public final DirectionDto getDirection() {
        return this.surrogate.getDirection();
    }

    public final PurposeDto getPurpose() {
        return this.surrogate.getPurpose();
    }

    public final String getRh_account_id() {
        return this.surrogate.getRh_account_id();
    }

    public final AccountTypeDto getRh_account_type() {
        return this.surrogate.getRh_account_type();
    }

    public final String getPayment_instrument_id() {
        return this.surrogate.getPayment_instrument_id();
    }

    public final AccountTypeDto getPayment_instrument_type() {
        return this.surrogate.getPayment_instrument_type();
    }

    public final FXTransferDetailsDto getFx_transfer_details() {
        return this.surrogate.getFx_transfer_details();
    }

    public final String getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final MoneyDto getReceived_amount() {
        return this.surrogate.getReceived_amount();
    }

    public final MoneyDto getService_fee() {
        return this.surrogate.getService_fee();
    }

    public final MoneyDto getTax_amount() {
        return this.surrogate.getTax_amount();
    }

    public /* synthetic */ PaymentIntentDto(String str, MoneyDto moneyDto, StateDto stateDto, DirectionDto directionDto, PurposeDto purposeDto, String str2, AccountTypeDto accountTypeDto, String str3, AccountTypeDto accountTypeDto2, FXTransferDetailsDto fXTransferDetailsDto, String str4, String str5, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 8) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 16) != 0 ? PurposeDto.INSTANCE.getZeroValue() : purposeDto, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto2, (i & 512) != 0 ? null : fXTransferDetailsDto, (i & 1024) != 0 ? "" : str4, (i & 2048) == 0 ? str5 : "", (i & 4096) != 0 ? null : moneyDto2, (i & 8192) != 0 ? null : moneyDto3, (i & 16384) != 0 ? null : moneyDto4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentIntentDto(String id, MoneyDto moneyDto, StateDto state, DirectionDto direction, PurposeDto purpose, String rh_account_id, AccountTypeDto rh_account_type, String payment_instrument_id, AccountTypeDto payment_instrument_type, FXTransferDetailsDto fXTransferDetailsDto, String created_at, String updated_at, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4) {
        this(new Surrogate(id, moneyDto, state, direction, purpose, rh_account_id, rh_account_type, payment_instrument_id, payment_instrument_type, fXTransferDetailsDto, created_at, updated_at, moneyDto2, moneyDto3, moneyDto4));
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PaymentIntent toProto() {
        String id = this.surrogate.getId();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        State state = (State) this.surrogate.getState().toProto();
        Direction direction = (Direction) this.surrogate.getDirection().toProto();
        Purpose purpose = (Purpose) this.surrogate.getPurpose().toProto();
        String rh_account_id = this.surrogate.getRh_account_id();
        AccountType accountType = (AccountType) this.surrogate.getRh_account_type().toProto();
        String payment_instrument_id = this.surrogate.getPayment_instrument_id();
        AccountType accountType2 = (AccountType) this.surrogate.getPayment_instrument_type().toProto();
        FXTransferDetailsDto fx_transfer_details = this.surrogate.getFx_transfer_details();
        FXTransferDetails proto2 = fx_transfer_details != null ? fx_transfer_details.toProto() : null;
        String created_at = this.surrogate.getCreated_at();
        String updated_at = this.surrogate.getUpdated_at();
        MoneyDto received_amount = this.surrogate.getReceived_amount();
        Money proto3 = received_amount != null ? received_amount.toProto() : null;
        MoneyDto service_fee = this.surrogate.getService_fee();
        Money proto4 = service_fee != null ? service_fee.toProto() : null;
        MoneyDto tax_amount = this.surrogate.getTax_amount();
        return new PaymentIntent(id, proto, state, direction, purpose, rh_account_id, accountType, payment_instrument_id, accountType2, proto2, created_at, updated_at, proto3, proto4, tax_amount != null ? tax_amount.toProto() : null, null, 32768, null);
    }

    public String toString() {
        return "[PaymentIntentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PaymentIntentDto) && Intrinsics.areEqual(((PaymentIntentDto) other).surrogate, this.surrogate);
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
    /* compiled from: PaymentIntentDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b1\b\u0083\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019B±\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010)R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b7\u00103\u001a\u0004\b5\u00106R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b;\u00103\u001a\u0004\b9\u0010:R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b?\u00103\u001a\u0004\b=\u0010>R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bC\u00103\u001a\u0004\bA\u0010BR \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00100\u0012\u0004\bE\u00103\u001a\u0004\bD\u0010)R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010F\u0012\u0004\bI\u00103\u001a\u0004\bG\u0010HR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00100\u0012\u0004\bK\u00103\u001a\u0004\bJ\u0010)R \u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010F\u0012\u0004\bM\u00103\u001a\u0004\bL\u0010HR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010N\u0012\u0004\bQ\u00103\u001a\u0004\bO\u0010PR \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00100\u0012\u0004\bS\u00103\u001a\u0004\bR\u0010)R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00100\u0012\u0004\bU\u00103\u001a\u0004\bT\u0010)R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u00104\u0012\u0004\bW\u00103\u001a\u0004\bV\u00106R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00104\u0012\u0004\bY\u00103\u001a\u0004\bX\u00106R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00104\u0012\u0004\b[\u00103\u001a\u0004\bZ\u00106¨\u0006^"}, m3636d2 = {"Lbff_money_movement/service/v1/PaymentIntentDto$Surrogate;", "", "", "id", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "Lcashier_protos/payment_intents/v1/StateDto;", "state", "Lcashier_protos/payment_intents/v1/DirectionDto;", "direction", "Lcashier_protos/payment_intents/v1/PurposeDto;", "purpose", "rh_account_id", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "rh_account_type", "payment_instrument_id", "payment_instrument_type", "Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;", "fx_transfer_details", "created_at", "updated_at", "received_amount", "service_fee", "tax_amount", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcashier_protos/payment_intents/v1/StateDto;Lcashier_protos/payment_intents/v1/DirectionDto;Lcashier_protos/payment_intents/v1/PurposeDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcashier_protos/payment_intents/v1/StateDto;Lcashier_protos/payment_intents/v1/DirectionDto;Lcashier_protos/payment_intents/v1/PurposeDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountTypeDto;Ljava/lang/String;Lcom/robinhood/rosetta/common/AccountTypeDto;Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/PaymentIntentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount$annotations", "Lcashier_protos/payment_intents/v1/StateDto;", "getState", "()Lcashier_protos/payment_intents/v1/StateDto;", "getState$annotations", "Lcashier_protos/payment_intents/v1/DirectionDto;", "getDirection", "()Lcashier_protos/payment_intents/v1/DirectionDto;", "getDirection$annotations", "Lcashier_protos/payment_intents/v1/PurposeDto;", "getPurpose", "()Lcashier_protos/payment_intents/v1/PurposeDto;", "getPurpose$annotations", "getRh_account_id", "getRh_account_id$annotations", "Lcom/robinhood/rosetta/common/AccountTypeDto;", "getRh_account_type", "()Lcom/robinhood/rosetta/common/AccountTypeDto;", "getRh_account_type$annotations", "getPayment_instrument_id", "getPayment_instrument_id$annotations", "getPayment_instrument_type", "getPayment_instrument_type$annotations", "Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;", "getFx_transfer_details", "()Lcashier_protos/payment_hub/v1/FXTransferDetailsDto;", "getFx_transfer_details$annotations", "getCreated_at", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "getReceived_amount", "getReceived_amount$annotations", "getService_fee", "getService_fee$annotations", "getTax_amount", "getTax_amount$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto amount;
        private final String created_at;
        private final DirectionDto direction;
        private final FXTransferDetailsDto fx_transfer_details;
        private final String id;
        private final String payment_instrument_id;
        private final AccountTypeDto payment_instrument_type;
        private final PurposeDto purpose;
        private final MoneyDto received_amount;
        private final String rh_account_id;
        private final AccountTypeDto rh_account_type;
        private final MoneyDto service_fee;
        private final StateDto state;
        private final MoneyDto tax_amount;
        private final String updated_at;

        public Surrogate() {
            this((String) null, (MoneyDto) null, (StateDto) null, (DirectionDto) null, (PurposeDto) null, (String) null, (AccountTypeDto) null, (String) null, (AccountTypeDto) null, (FXTransferDetailsDto) null, (String) null, (String) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, 32767, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.amount, surrogate.amount) && this.state == surrogate.state && this.direction == surrogate.direction && this.purpose == surrogate.purpose && Intrinsics.areEqual(this.rh_account_id, surrogate.rh_account_id) && this.rh_account_type == surrogate.rh_account_type && Intrinsics.areEqual(this.payment_instrument_id, surrogate.payment_instrument_id) && this.payment_instrument_type == surrogate.payment_instrument_type && Intrinsics.areEqual(this.fx_transfer_details, surrogate.fx_transfer_details) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.received_amount, surrogate.received_amount) && Intrinsics.areEqual(this.service_fee, surrogate.service_fee) && Intrinsics.areEqual(this.tax_amount, surrogate.tax_amount);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (((((((((((((((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.state.hashCode()) * 31) + this.direction.hashCode()) * 31) + this.purpose.hashCode()) * 31) + this.rh_account_id.hashCode()) * 31) + this.rh_account_type.hashCode()) * 31) + this.payment_instrument_id.hashCode()) * 31) + this.payment_instrument_type.hashCode()) * 31;
            FXTransferDetailsDto fXTransferDetailsDto = this.fx_transfer_details;
            int iHashCode3 = (((((iHashCode2 + (fXTransferDetailsDto == null ? 0 : fXTransferDetailsDto.hashCode())) * 31) + this.created_at.hashCode()) * 31) + this.updated_at.hashCode()) * 31;
            MoneyDto moneyDto2 = this.received_amount;
            int iHashCode4 = (iHashCode3 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.service_fee;
            int iHashCode5 = (iHashCode4 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            MoneyDto moneyDto4 = this.tax_amount;
            return iHashCode5 + (moneyDto4 != null ? moneyDto4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", amount=" + this.amount + ", state=" + this.state + ", direction=" + this.direction + ", purpose=" + this.purpose + ", rh_account_id=" + this.rh_account_id + ", rh_account_type=" + this.rh_account_type + ", payment_instrument_id=" + this.payment_instrument_id + ", payment_instrument_type=" + this.payment_instrument_type + ", fx_transfer_details=" + this.fx_transfer_details + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", received_amount=" + this.received_amount + ", service_fee=" + this.service_fee + ", tax_amount=" + this.tax_amount + ")";
        }

        /* compiled from: PaymentIntentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/PaymentIntentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/PaymentIntentDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PaymentIntentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, MoneyDto moneyDto, StateDto stateDto, DirectionDto directionDto, PurposeDto purposeDto, String str2, AccountTypeDto accountTypeDto, String str3, AccountTypeDto accountTypeDto2, FXTransferDetailsDto fXTransferDetailsDto, String str4, String str5, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 4) == 0) {
                this.state = StateDto.INSTANCE.getZeroValue();
            } else {
                this.state = stateDto;
            }
            if ((i & 8) == 0) {
                this.direction = DirectionDto.INSTANCE.getZeroValue();
            } else {
                this.direction = directionDto;
            }
            if ((i & 16) == 0) {
                this.purpose = PurposeDto.INSTANCE.getZeroValue();
            } else {
                this.purpose = purposeDto;
            }
            if ((i & 32) == 0) {
                this.rh_account_id = "";
            } else {
                this.rh_account_id = str2;
            }
            if ((i & 64) == 0) {
                this.rh_account_type = AccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.rh_account_type = accountTypeDto;
            }
            if ((i & 128) == 0) {
                this.payment_instrument_id = "";
            } else {
                this.payment_instrument_id = str3;
            }
            if ((i & 256) == 0) {
                this.payment_instrument_type = AccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.payment_instrument_type = accountTypeDto2;
            }
            if ((i & 512) == 0) {
                this.fx_transfer_details = null;
            } else {
                this.fx_transfer_details = fXTransferDetailsDto;
            }
            if ((i & 1024) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str4;
            }
            if ((i & 2048) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str5;
            }
            if ((i & 4096) == 0) {
                this.received_amount = null;
            } else {
                this.received_amount = moneyDto2;
            }
            if ((i & 8192) == 0) {
                this.service_fee = null;
            } else {
                this.service_fee = moneyDto3;
            }
            if ((i & 16384) == 0) {
                this.tax_amount = null;
            } else {
                this.tax_amount = moneyDto4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (self.state != StateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, StateDto.Serializer.INSTANCE, self.state);
            }
            if (self.direction != DirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, DirectionDto.Serializer.INSTANCE, self.direction);
            }
            if (self.purpose != PurposeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, PurposeDto.Serializer.INSTANCE, self.purpose);
            }
            if (!Intrinsics.areEqual(self.rh_account_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.rh_account_id);
            }
            AccountTypeDto accountTypeDto = self.rh_account_type;
            AccountTypeDto.Companion companion = AccountTypeDto.INSTANCE;
            if (accountTypeDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, AccountTypeDto.Serializer.INSTANCE, self.rh_account_type);
            }
            if (!Intrinsics.areEqual(self.payment_instrument_id, "")) {
                output.encodeStringElement(serialDesc, 7, self.payment_instrument_id);
            }
            if (self.payment_instrument_type != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, AccountTypeDto.Serializer.INSTANCE, self.payment_instrument_type);
            }
            FXTransferDetailsDto fXTransferDetailsDto = self.fx_transfer_details;
            if (fXTransferDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, FXTransferDetailsDto.Serializer.INSTANCE, fXTransferDetailsDto);
            }
            if (!Intrinsics.areEqual(self.created_at, "")) {
                output.encodeStringElement(serialDesc, 10, self.created_at);
            }
            if (!Intrinsics.areEqual(self.updated_at, "")) {
                output.encodeStringElement(serialDesc, 11, self.updated_at);
            }
            MoneyDto moneyDto2 = self.received_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.service_fee;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            MoneyDto moneyDto4 = self.tax_amount;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
        }

        public Surrogate(String id, MoneyDto moneyDto, StateDto state, DirectionDto direction, PurposeDto purpose, String rh_account_id, AccountTypeDto rh_account_type, String payment_instrument_id, AccountTypeDto payment_instrument_type, FXTransferDetailsDto fXTransferDetailsDto, String created_at, String updated_at, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4) {
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
            this.id = id;
            this.amount = moneyDto;
            this.state = state;
            this.direction = direction;
            this.purpose = purpose;
            this.rh_account_id = rh_account_id;
            this.rh_account_type = rh_account_type;
            this.payment_instrument_id = payment_instrument_id;
            this.payment_instrument_type = payment_instrument_type;
            this.fx_transfer_details = fXTransferDetailsDto;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.received_amount = moneyDto2;
            this.service_fee = moneyDto3;
            this.tax_amount = moneyDto4;
        }

        public /* synthetic */ Surrogate(String str, MoneyDto moneyDto, StateDto stateDto, DirectionDto directionDto, PurposeDto purposeDto, String str2, AccountTypeDto accountTypeDto, String str3, AccountTypeDto accountTypeDto2, FXTransferDetailsDto fXTransferDetailsDto, String str4, String str5, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 8) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 16) != 0 ? PurposeDto.INSTANCE.getZeroValue() : purposeDto, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto2, (i & 512) != 0 ? null : fXTransferDetailsDto, (i & 1024) != 0 ? "" : str4, (i & 2048) == 0 ? str5 : "", (i & 4096) != 0 ? null : moneyDto2, (i & 8192) != 0 ? null : moneyDto3, (i & 16384) != 0 ? null : moneyDto4);
        }

        public final String getId() {
            return this.id;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final StateDto getState() {
            return this.state;
        }

        public final DirectionDto getDirection() {
            return this.direction;
        }

        public final PurposeDto getPurpose() {
            return this.purpose;
        }

        public final String getRh_account_id() {
            return this.rh_account_id;
        }

        public final AccountTypeDto getRh_account_type() {
            return this.rh_account_type;
        }

        public final String getPayment_instrument_id() {
            return this.payment_instrument_id;
        }

        public final AccountTypeDto getPayment_instrument_type() {
            return this.payment_instrument_type;
        }

        public final FXTransferDetailsDto getFx_transfer_details() {
            return this.fx_transfer_details;
        }

        public final String getCreated_at() {
            return this.created_at;
        }

        public final String getUpdated_at() {
            return this.updated_at;
        }

        public final MoneyDto getReceived_amount() {
            return this.received_amount;
        }

        public final MoneyDto getService_fee() {
            return this.service_fee;
        }

        public final MoneyDto getTax_amount() {
            return this.tax_amount;
        }
    }

    /* compiled from: PaymentIntentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/PaymentIntentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/PaymentIntentDto;", "Lbff_money_movement/service/v1/PaymentIntent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/PaymentIntentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PaymentIntentDto, PaymentIntent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PaymentIntentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PaymentIntentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PaymentIntentDto> getBinaryBase64Serializer() {
            return (KSerializer) PaymentIntentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PaymentIntent> getProtoAdapter() {
            return PaymentIntent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PaymentIntentDto getZeroValue() {
            return PaymentIntentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PaymentIntentDto fromProto(PaymentIntent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            Money amount = proto.getAmount();
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            StateDto stateDtoFromProto = StateDto.INSTANCE.fromProto(proto.getState());
            DirectionDto directionDtoFromProto = DirectionDto.INSTANCE.fromProto(proto.getDirection());
            PurposeDto purposeDtoFromProto = PurposeDto.INSTANCE.fromProto(proto.getPurpose());
            String rh_account_id = proto.getRh_account_id();
            AccountTypeDto.Companion companion = AccountTypeDto.INSTANCE;
            AccountTypeDto accountTypeDtoFromProto = companion.fromProto(proto.getRh_account_type());
            String payment_instrument_id = proto.getPayment_instrument_id();
            AccountTypeDto accountTypeDtoFromProto2 = companion.fromProto(proto.getPayment_instrument_type());
            FXTransferDetails fx_transfer_details = proto.getFx_transfer_details();
            FXTransferDetailsDto fXTransferDetailsDtoFromProto = fx_transfer_details != null ? FXTransferDetailsDto.INSTANCE.fromProto(fx_transfer_details) : null;
            String created_at = proto.getCreated_at();
            String updated_at = proto.getUpdated_at();
            Money received_amount = proto.getReceived_amount();
            MoneyDto moneyDtoFromProto2 = received_amount != null ? MoneyDto.INSTANCE.fromProto(received_amount) : null;
            Money service_fee = proto.getService_fee();
            MoneyDto moneyDtoFromProto3 = service_fee != null ? MoneyDto.INSTANCE.fromProto(service_fee) : null;
            Money tax_amount = proto.getTax_amount();
            return new PaymentIntentDto(new Surrogate(id, moneyDtoFromProto, stateDtoFromProto, directionDtoFromProto, purposeDtoFromProto, rh_account_id, accountTypeDtoFromProto, payment_instrument_id, accountTypeDtoFromProto2, fXTransferDetailsDtoFromProto, created_at, updated_at, moneyDtoFromProto2, moneyDtoFromProto3, tax_amount != null ? MoneyDto.INSTANCE.fromProto(tax_amount) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.PaymentIntentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentIntentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PaymentIntentDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PaymentIntentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/PaymentIntentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/PaymentIntentDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/PaymentIntentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PaymentIntentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.PaymentIntent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PaymentIntentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PaymentIntentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PaymentIntentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PaymentIntentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/PaymentIntentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.PaymentIntentDto";
        }
    }
}
