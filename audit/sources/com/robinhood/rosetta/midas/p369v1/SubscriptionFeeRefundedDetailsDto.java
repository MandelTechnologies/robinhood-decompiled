package com.robinhood.rosetta.midas.p369v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import okio.ByteString;
import p479j$.time.Instant;
import rosetta.midas.p538v1.SubscriptionFeePaymentType;
import rosetta.midas.p538v1.SubscriptionFeePaymentTypeDto;

/* compiled from: SubscriptionFeeRefundedDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0015J]\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto$Surrogate;)V", "Lokio/ByteString;", "subscription_fee_id", "subscription_fee_refund_id", "", "compliance_user_major_oak_email", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "state", "Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;", "payment_type", "(Lokio/ByteString;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;)V", "copy", "(Lokio/ByteString;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;)Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;", "toProto", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto$Surrogate;", "getSubscription_fee_id", "()Lokio/ByteString;", "getSubscription_fee_refund_id", "getCompliance_user_major_oak_email", "getCreated_at", "()Lj$/time/Instant;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getState", "getPayment_type", "()Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class SubscriptionFeeRefundedDetailsDto implements Dto3<SubscriptionFeeRefundedDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SubscriptionFeeRefundedDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SubscriptionFeeRefundedDetailsDto, SubscriptionFeeRefundedDetails>> binaryBase64Serializer$delegate;
    private static final SubscriptionFeeRefundedDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SubscriptionFeeRefundedDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SubscriptionFeeRefundedDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getSubscription_fee_id() {
        return this.surrogate.getSubscription_fee_id();
    }

    public final ByteString getSubscription_fee_refund_id() {
        return this.surrogate.getSubscription_fee_refund_id();
    }

    public final String getCompliance_user_major_oak_email() {
        return this.surrogate.getCompliance_user_major_oak_email();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final String getState() {
        return this.surrogate.getState();
    }

    public final SubscriptionFeePaymentTypeDto getPayment_type() {
        return this.surrogate.getPayment_type();
    }

    public /* synthetic */ SubscriptionFeeRefundedDetailsDto(ByteString byteString, ByteString byteString2, String str, Instant instant, MoneyDto moneyDto, String str2, SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? ByteString.EMPTY : byteString2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : moneyDto, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? SubscriptionFeePaymentTypeDto.INSTANCE.getZeroValue() : subscriptionFeePaymentTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionFeeRefundedDetailsDto(ByteString subscription_fee_id, ByteString subscription_fee_refund_id, String compliance_user_major_oak_email, Instant instant, MoneyDto moneyDto, String state, SubscriptionFeePaymentTypeDto payment_type) {
        this(new Surrogate(subscription_fee_id, subscription_fee_refund_id, compliance_user_major_oak_email, instant, moneyDto, state, payment_type));
        Intrinsics.checkNotNullParameter(subscription_fee_id, "subscription_fee_id");
        Intrinsics.checkNotNullParameter(subscription_fee_refund_id, "subscription_fee_refund_id");
        Intrinsics.checkNotNullParameter(compliance_user_major_oak_email, "compliance_user_major_oak_email");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payment_type, "payment_type");
    }

    public static /* synthetic */ SubscriptionFeeRefundedDetailsDto copy$default(SubscriptionFeeRefundedDetailsDto subscriptionFeeRefundedDetailsDto, ByteString byteString, ByteString byteString2, String str, Instant instant, MoneyDto moneyDto, String str2, SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = subscriptionFeeRefundedDetailsDto.surrogate.getSubscription_fee_id();
        }
        if ((i & 2) != 0) {
            byteString2 = subscriptionFeeRefundedDetailsDto.surrogate.getSubscription_fee_refund_id();
        }
        if ((i & 4) != 0) {
            str = subscriptionFeeRefundedDetailsDto.surrogate.getCompliance_user_major_oak_email();
        }
        if ((i & 8) != 0) {
            instant = subscriptionFeeRefundedDetailsDto.surrogate.getCreated_at();
        }
        if ((i & 16) != 0) {
            moneyDto = subscriptionFeeRefundedDetailsDto.surrogate.getAmount();
        }
        if ((i & 32) != 0) {
            str2 = subscriptionFeeRefundedDetailsDto.surrogate.getState();
        }
        if ((i & 64) != 0) {
            subscriptionFeePaymentTypeDto = subscriptionFeeRefundedDetailsDto.surrogate.getPayment_type();
        }
        String str3 = str2;
        SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto2 = subscriptionFeePaymentTypeDto;
        MoneyDto moneyDto2 = moneyDto;
        String str4 = str;
        return subscriptionFeeRefundedDetailsDto.copy(byteString, byteString2, str4, instant, moneyDto2, str3, subscriptionFeePaymentTypeDto2);
    }

    public final SubscriptionFeeRefundedDetailsDto copy(ByteString subscription_fee_id, ByteString subscription_fee_refund_id, String compliance_user_major_oak_email, Instant created_at, MoneyDto amount, String state, SubscriptionFeePaymentTypeDto payment_type) {
        Intrinsics.checkNotNullParameter(subscription_fee_id, "subscription_fee_id");
        Intrinsics.checkNotNullParameter(subscription_fee_refund_id, "subscription_fee_refund_id");
        Intrinsics.checkNotNullParameter(compliance_user_major_oak_email, "compliance_user_major_oak_email");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payment_type, "payment_type");
        return new SubscriptionFeeRefundedDetailsDto(new Surrogate(subscription_fee_id, subscription_fee_refund_id, compliance_user_major_oak_email, created_at, amount, state, payment_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SubscriptionFeeRefundedDetails toProto() {
        ByteString subscription_fee_id = this.surrogate.getSubscription_fee_id();
        ByteString subscription_fee_refund_id = this.surrogate.getSubscription_fee_refund_id();
        String compliance_user_major_oak_email = this.surrogate.getCompliance_user_major_oak_email();
        Instant created_at = this.surrogate.getCreated_at();
        MoneyDto amount = this.surrogate.getAmount();
        return new SubscriptionFeeRefundedDetails(subscription_fee_id, subscription_fee_refund_id, compliance_user_major_oak_email, created_at, amount != null ? amount.toProto() : null, this.surrogate.getState(), (SubscriptionFeePaymentType) this.surrogate.getPayment_type().toProto(), null, 128, null);
    }

    public String toString() {
        return "[SubscriptionFeeRefundedDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SubscriptionFeeRefundedDetailsDto) && Intrinsics.areEqual(((SubscriptionFeeRefundedDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: SubscriptionFeeRefundedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 L2\u00020\u0001:\u0002MLB\u0093\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Ba\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'J6\u0010(\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b,\u0010'J\u0010\u0010-\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u009c\u0001\u0010/\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\t\u001a\u00020\b2.\b\u0002\u0010\r\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b1\u0010'J\u0010\u00102\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010$R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b=\u0010;\u001a\u0004\b<\u0010$R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\b@\u0010;\u001a\u0004\b?\u0010'RF\u0010\r\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010A\u0012\u0004\bC\u0010;\u001a\u0004\bB\u0010)R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010D\u0012\u0004\bF\u0010;\u001a\u0004\bE\u0010+R \u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010>\u0012\u0004\bH\u0010;\u001a\u0004\bG\u0010'R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010I\u0012\u0004\bK\u0010;\u001a\u0004\bJ\u0010.¨\u0006N"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "subscription_fee_id", "subscription_fee_refund_id", "", "compliance_user_major_oak_email", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "state", "Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;", "payment_type", "<init>", "(Lokio/ByteString;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lokio/ByteString;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lj$/time/Instant;", "component5", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component6", "component7", "()Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;", "copy", "(Lokio/ByteString;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;)Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getSubscription_fee_id", "getSubscription_fee_id$annotations", "()V", "getSubscription_fee_refund_id", "getSubscription_fee_refund_id$annotations", "Ljava/lang/String;", "getCompliance_user_major_oak_email", "getCompliance_user_major_oak_email$annotations", "Lj$/time/Instant;", "getCreated_at", "getCreated_at$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "getAmount$annotations", "getState", "getState$annotations", "Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;", "getPayment_type", "getPayment_type$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto amount;
        private final String compliance_user_major_oak_email;
        private final Instant created_at;
        private final SubscriptionFeePaymentTypeDto payment_type;
        private final String state;
        private final ByteString subscription_fee_id;
        private final ByteString subscription_fee_refund_id;

        public Surrogate() {
            this((ByteString) null, (ByteString) null, (String) null, (Instant) null, (MoneyDto) null, (String) null, (SubscriptionFeePaymentTypeDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, ByteString byteString2, String str, Instant instant, MoneyDto moneyDto, String str2, SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = surrogate.subscription_fee_id;
            }
            if ((i & 2) != 0) {
                byteString2 = surrogate.subscription_fee_refund_id;
            }
            if ((i & 4) != 0) {
                str = surrogate.compliance_user_major_oak_email;
            }
            if ((i & 8) != 0) {
                instant = surrogate.created_at;
            }
            if ((i & 16) != 0) {
                moneyDto = surrogate.amount;
            }
            if ((i & 32) != 0) {
                str2 = surrogate.state;
            }
            if ((i & 64) != 0) {
                subscriptionFeePaymentTypeDto = surrogate.payment_type;
            }
            String str3 = str2;
            SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto2 = subscriptionFeePaymentTypeDto;
            MoneyDto moneyDto2 = moneyDto;
            String str4 = str;
            return surrogate.copy(byteString, byteString2, str4, instant, moneyDto2, str3, subscriptionFeePaymentTypeDto2);
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("complianceUserMajorOakEmail")
        @JsonAnnotations2(names = {"compliance_user_major_oak_email"})
        public static /* synthetic */ void getCompliance_user_major_oak_email$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("paymentType")
        @JsonAnnotations2(names = {"payment_type"})
        public static /* synthetic */ void getPayment_type$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("subscriptionFeeId")
        @JsonAnnotations2(names = {"subscription_fee_id"})
        public static /* synthetic */ void getSubscription_fee_id$annotations() {
        }

        @SerialName("subscriptionFeeRefundId")
        @JsonAnnotations2(names = {"subscription_fee_refund_id"})
        public static /* synthetic */ void getSubscription_fee_refund_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getSubscription_fee_id() {
            return this.subscription_fee_id;
        }

        /* renamed from: component2, reason: from getter */
        public final ByteString getSubscription_fee_refund_id() {
            return this.subscription_fee_refund_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCompliance_user_major_oak_email() {
            return this.compliance_user_major_oak_email;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component5, reason: from getter */
        public final MoneyDto getAmount() {
            return this.amount;
        }

        /* renamed from: component6, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* renamed from: component7, reason: from getter */
        public final SubscriptionFeePaymentTypeDto getPayment_type() {
            return this.payment_type;
        }

        public final Surrogate copy(ByteString subscription_fee_id, ByteString subscription_fee_refund_id, String compliance_user_major_oak_email, Instant created_at, MoneyDto amount, String state, SubscriptionFeePaymentTypeDto payment_type) {
            Intrinsics.checkNotNullParameter(subscription_fee_id, "subscription_fee_id");
            Intrinsics.checkNotNullParameter(subscription_fee_refund_id, "subscription_fee_refund_id");
            Intrinsics.checkNotNullParameter(compliance_user_major_oak_email, "compliance_user_major_oak_email");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(payment_type, "payment_type");
            return new Surrogate(subscription_fee_id, subscription_fee_refund_id, compliance_user_major_oak_email, created_at, amount, state, payment_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.subscription_fee_id, surrogate.subscription_fee_id) && Intrinsics.areEqual(this.subscription_fee_refund_id, surrogate.subscription_fee_refund_id) && Intrinsics.areEqual(this.compliance_user_major_oak_email, surrogate.compliance_user_major_oak_email) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.state, surrogate.state) && this.payment_type == surrogate.payment_type;
        }

        public int hashCode() {
            int iHashCode = ((((this.subscription_fee_id.hashCode() * 31) + this.subscription_fee_refund_id.hashCode()) * 31) + this.compliance_user_major_oak_email.hashCode()) * 31;
            Instant instant = this.created_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            MoneyDto moneyDto = this.amount;
            return ((((iHashCode2 + (moneyDto != null ? moneyDto.hashCode() : 0)) * 31) + this.state.hashCode()) * 31) + this.payment_type.hashCode();
        }

        public String toString() {
            return "Surrogate(subscription_fee_id=" + this.subscription_fee_id + ", subscription_fee_refund_id=" + this.subscription_fee_refund_id + ", compliance_user_major_oak_email=" + this.compliance_user_major_oak_email + ", created_at=" + this.created_at + ", amount=" + this.amount + ", state=" + this.state + ", payment_type=" + this.payment_type + ")";
        }

        /* compiled from: SubscriptionFeeRefundedDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SubscriptionFeeRefundedDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, ByteString byteString2, String str, Instant instant, MoneyDto moneyDto, String str2, SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.subscription_fee_id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.subscription_fee_refund_id = ByteString.EMPTY;
            } else {
                this.subscription_fee_refund_id = byteString2;
            }
            if ((i & 4) == 0) {
                this.compliance_user_major_oak_email = "";
            } else {
                this.compliance_user_major_oak_email = str;
            }
            if ((i & 8) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 16) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 32) == 0) {
                this.state = "";
            } else {
                this.state = str2;
            }
            if ((i & 64) == 0) {
                this.payment_type = SubscriptionFeePaymentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.payment_type = subscriptionFeePaymentTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ByteString byteString = self.subscription_fee_id;
            ByteString byteString2 = ByteString.EMPTY;
            if (!Intrinsics.areEqual(byteString, byteString2)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.subscription_fee_id);
            }
            if (!Intrinsics.areEqual(self.subscription_fee_refund_id, byteString2)) {
                output.encodeSerializableElement(serialDesc, 1, ByteStringSerializer.INSTANCE, self.subscription_fee_refund_id);
            }
            if (!Intrinsics.areEqual(self.compliance_user_major_oak_email, "")) {
                output.encodeStringElement(serialDesc, 2, self.compliance_user_major_oak_email);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.state, "")) {
                output.encodeStringElement(serialDesc, 5, self.state);
            }
            if (self.payment_type != SubscriptionFeePaymentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, SubscriptionFeePaymentTypeDto.Serializer.INSTANCE, self.payment_type);
            }
        }

        public Surrogate(ByteString subscription_fee_id, ByteString subscription_fee_refund_id, String compliance_user_major_oak_email, Instant instant, MoneyDto moneyDto, String state, SubscriptionFeePaymentTypeDto payment_type) {
            Intrinsics.checkNotNullParameter(subscription_fee_id, "subscription_fee_id");
            Intrinsics.checkNotNullParameter(subscription_fee_refund_id, "subscription_fee_refund_id");
            Intrinsics.checkNotNullParameter(compliance_user_major_oak_email, "compliance_user_major_oak_email");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(payment_type, "payment_type");
            this.subscription_fee_id = subscription_fee_id;
            this.subscription_fee_refund_id = subscription_fee_refund_id;
            this.compliance_user_major_oak_email = compliance_user_major_oak_email;
            this.created_at = instant;
            this.amount = moneyDto;
            this.state = state;
            this.payment_type = payment_type;
        }

        public final ByteString getSubscription_fee_id() {
            return this.subscription_fee_id;
        }

        public /* synthetic */ Surrogate(ByteString byteString, ByteString byteString2, String str, Instant instant, MoneyDto moneyDto, String str2, SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? ByteString.EMPTY : byteString2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : moneyDto, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? SubscriptionFeePaymentTypeDto.INSTANCE.getZeroValue() : subscriptionFeePaymentTypeDto);
        }

        public final ByteString getSubscription_fee_refund_id() {
            return this.subscription_fee_refund_id;
        }

        public final String getCompliance_user_major_oak_email() {
            return this.compliance_user_major_oak_email;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final String getState() {
            return this.state;
        }

        public final SubscriptionFeePaymentTypeDto getPayment_type() {
            return this.payment_type;
        }
    }

    /* compiled from: SubscriptionFeeRefundedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SubscriptionFeeRefundedDetailsDto, SubscriptionFeeRefundedDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubscriptionFeeRefundedDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionFeeRefundedDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionFeeRefundedDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) SubscriptionFeeRefundedDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SubscriptionFeeRefundedDetails> getProtoAdapter() {
            return SubscriptionFeeRefundedDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionFeeRefundedDetailsDto getZeroValue() {
            return SubscriptionFeeRefundedDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionFeeRefundedDetailsDto fromProto(SubscriptionFeeRefundedDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ByteString subscription_fee_id = proto.getSubscription_fee_id();
            ByteString subscription_fee_refund_id = proto.getSubscription_fee_refund_id();
            String compliance_user_major_oak_email = proto.getCompliance_user_major_oak_email();
            Instant created_at = proto.getCreated_at();
            Money amount = proto.getAmount();
            return new SubscriptionFeeRefundedDetailsDto(new Surrogate(subscription_fee_id, subscription_fee_refund_id, compliance_user_major_oak_email, created_at, amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null, proto.getState(), SubscriptionFeePaymentTypeDto.INSTANCE.fromProto(proto.getPayment_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.midas.v1.SubscriptionFeeRefundedDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubscriptionFeeRefundedDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SubscriptionFeeRefundedDetailsDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SubscriptionFeeRefundedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SubscriptionFeeRefundedDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.SubscriptionFeeRefundedDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SubscriptionFeeRefundedDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SubscriptionFeeRefundedDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SubscriptionFeeRefundedDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SubscriptionFeeRefundedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeRefundedDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.midas.v1.SubscriptionFeeRefundedDetailsDto";
        }
    }
}
