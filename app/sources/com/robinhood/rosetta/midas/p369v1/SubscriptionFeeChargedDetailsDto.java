package com.robinhood.rosetta.midas.p369v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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

/* compiled from: SubscriptionFeeChargedDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004BACDB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008f\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0006\u0010\u001aJ\u0093\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020&H\u0016¢\u0006\u0004\b/\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u00102R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b8\u00107R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b;\u0010:R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b=\u0010 R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b>\u0010 R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006E"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto$Surrogate;)V", "Lokio/ByteString;", "subscription_id", "subscription_fee_id", "Lcom/robinhood/rosetta/common/DateDto;", InquiryField.DateField.TYPE, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "credit", "carry_forward_credit", "", "state", "reference_id", "Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;", "payment_type", "(Lokio/ByteString;Lokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;)V", "copy", "(Lokio/ByteString;Lokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;)Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;", "toProto", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto$Surrogate;", "getSubscription_id", "()Lokio/ByteString;", "getSubscription_fee_id", "getDate", "()Lcom/robinhood/rosetta/common/DateDto;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getCredit", "getCarry_forward_credit", "getState", "getReference_id", "getPayment_type", "()Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class SubscriptionFeeChargedDetailsDto implements Dto3<SubscriptionFeeChargedDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SubscriptionFeeChargedDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SubscriptionFeeChargedDetailsDto, SubscriptionFeeChargedDetails>> binaryBase64Serializer$delegate;
    private static final SubscriptionFeeChargedDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SubscriptionFeeChargedDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SubscriptionFeeChargedDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getSubscription_id() {
        return this.surrogate.getSubscription_id();
    }

    public final ByteString getSubscription_fee_id() {
        return this.surrogate.getSubscription_fee_id();
    }

    public final DateDto getDate() {
        return this.surrogate.getDate();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final Instant getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final MoneyDto getCredit() {
        return this.surrogate.getCredit();
    }

    public final MoneyDto getCarry_forward_credit() {
        return this.surrogate.getCarry_forward_credit();
    }

    public final String getState() {
        return this.surrogate.getState();
    }

    public final String getReference_id() {
        return this.surrogate.getReference_id();
    }

    public final SubscriptionFeePaymentTypeDto getPayment_type() {
        return this.surrogate.getPayment_type();
    }

    public /* synthetic */ SubscriptionFeeChargedDetailsDto(ByteString byteString, ByteString byteString2, DateDto dateDto, Instant instant, Instant instant2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, String str, String str2, SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? ByteString.EMPTY : byteString2, (i & 4) != 0 ? null : dateDto, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : moneyDto2, (i & 128) != 0 ? null : moneyDto3, (i & 256) != 0 ? "" : str, (i & 512) != 0 ? "" : str2, (i & 1024) != 0 ? SubscriptionFeePaymentTypeDto.INSTANCE.getZeroValue() : subscriptionFeePaymentTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionFeeChargedDetailsDto(ByteString subscription_id, ByteString subscription_fee_id, DateDto dateDto, Instant instant, Instant instant2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, String state, String reference_id, SubscriptionFeePaymentTypeDto payment_type) {
        this(new Surrogate(subscription_id, subscription_fee_id, dateDto, instant, instant2, moneyDto, moneyDto2, moneyDto3, state, reference_id, payment_type));
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        Intrinsics.checkNotNullParameter(subscription_fee_id, "subscription_fee_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
        Intrinsics.checkNotNullParameter(payment_type, "payment_type");
    }

    public static /* synthetic */ SubscriptionFeeChargedDetailsDto copy$default(SubscriptionFeeChargedDetailsDto subscriptionFeeChargedDetailsDto, ByteString byteString, ByteString byteString2, DateDto dateDto, Instant instant, Instant instant2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, String str, String str2, SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = subscriptionFeeChargedDetailsDto.surrogate.getSubscription_id();
        }
        if ((i & 2) != 0) {
            byteString2 = subscriptionFeeChargedDetailsDto.surrogate.getSubscription_fee_id();
        }
        if ((i & 4) != 0) {
            dateDto = subscriptionFeeChargedDetailsDto.surrogate.getDate();
        }
        if ((i & 8) != 0) {
            instant = subscriptionFeeChargedDetailsDto.surrogate.getCreated_at();
        }
        if ((i & 16) != 0) {
            instant2 = subscriptionFeeChargedDetailsDto.surrogate.getUpdated_at();
        }
        if ((i & 32) != 0) {
            moneyDto = subscriptionFeeChargedDetailsDto.surrogate.getAmount();
        }
        if ((i & 64) != 0) {
            moneyDto2 = subscriptionFeeChargedDetailsDto.surrogate.getCredit();
        }
        if ((i & 128) != 0) {
            moneyDto3 = subscriptionFeeChargedDetailsDto.surrogate.getCarry_forward_credit();
        }
        if ((i & 256) != 0) {
            str = subscriptionFeeChargedDetailsDto.surrogate.getState();
        }
        if ((i & 512) != 0) {
            str2 = subscriptionFeeChargedDetailsDto.surrogate.getReference_id();
        }
        if ((i & 1024) != 0) {
            subscriptionFeePaymentTypeDto = subscriptionFeeChargedDetailsDto.surrogate.getPayment_type();
        }
        String str3 = str2;
        SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto2 = subscriptionFeePaymentTypeDto;
        MoneyDto moneyDto4 = moneyDto3;
        String str4 = str;
        MoneyDto moneyDto5 = moneyDto;
        MoneyDto moneyDto6 = moneyDto2;
        Instant instant3 = instant2;
        DateDto dateDto2 = dateDto;
        return subscriptionFeeChargedDetailsDto.copy(byteString, byteString2, dateDto2, instant, instant3, moneyDto5, moneyDto6, moneyDto4, str4, str3, subscriptionFeePaymentTypeDto2);
    }

    public final SubscriptionFeeChargedDetailsDto copy(ByteString subscription_id, ByteString subscription_fee_id, DateDto date, Instant created_at, Instant updated_at, MoneyDto amount, MoneyDto credit, MoneyDto carry_forward_credit, String state, String reference_id, SubscriptionFeePaymentTypeDto payment_type) {
        Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
        Intrinsics.checkNotNullParameter(subscription_fee_id, "subscription_fee_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
        Intrinsics.checkNotNullParameter(payment_type, "payment_type");
        return new SubscriptionFeeChargedDetailsDto(new Surrogate(subscription_id, subscription_fee_id, date, created_at, updated_at, amount, credit, carry_forward_credit, state, reference_id, payment_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SubscriptionFeeChargedDetails toProto() {
        ByteString subscription_id = this.surrogate.getSubscription_id();
        ByteString subscription_fee_id = this.surrogate.getSubscription_fee_id();
        DateDto date = this.surrogate.getDate();
        Date proto = date != null ? date.toProto() : null;
        Instant created_at = this.surrogate.getCreated_at();
        Instant updated_at = this.surrogate.getUpdated_at();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto2 = amount != null ? amount.toProto() : null;
        MoneyDto credit = this.surrogate.getCredit();
        Money proto3 = credit != null ? credit.toProto() : null;
        MoneyDto carry_forward_credit = this.surrogate.getCarry_forward_credit();
        return new SubscriptionFeeChargedDetails(subscription_id, subscription_fee_id, proto, created_at, updated_at, proto2, proto3, carry_forward_credit != null ? carry_forward_credit.toProto() : null, this.surrogate.getState(), this.surrogate.getReference_id(), (SubscriptionFeePaymentType) this.surrogate.getPayment_type().toProto(), null, 2048, null);
    }

    public String toString() {
        return "[SubscriptionFeeChargedDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SubscriptionFeeChargedDetailsDto) && Intrinsics.areEqual(((SubscriptionFeeChargedDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: SubscriptionFeeChargedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\"\b\u0083\b\u0018\u0000 _2\u00020\u0001:\u0002`_Bç\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f\u0012.\b\u0002\u0010\u000e\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0089\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010,J6\u0010-\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b-\u0010.J6\u0010/\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b3\u00101J\u0010\u00104\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b6\u00105J\u0010\u00107\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b7\u00108Jð\u0001\u00109\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2.\b\u0002\u0010\r\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f2.\b\u0002\u0010\u000e\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b;\u00105J\u0010\u0010<\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010B\u0012\u0004\bD\u0010E\u001a\u0004\bC\u0010)R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010B\u0012\u0004\bG\u0010E\u001a\u0004\bF\u0010)R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010H\u0012\u0004\bJ\u0010E\u001a\u0004\bI\u0010,RF\u0010\r\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010K\u0012\u0004\bM\u0010E\u001a\u0004\bL\u0010.RF\u0010\u000e\u001a(\u0018\u00010\nj\u0013\u0018\u0001`\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010K\u0012\u0004\bO\u0010E\u001a\u0004\bN\u0010.R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010P\u0012\u0004\bR\u0010E\u001a\u0004\bQ\u00101R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010P\u0012\u0004\bT\u0010E\u001a\u0004\bS\u00101R\"\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010P\u0012\u0004\bV\u0010E\u001a\u0004\bU\u00101R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010W\u0012\u0004\bY\u0010E\u001a\u0004\bX\u00105R \u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010W\u0012\u0004\b[\u0010E\u001a\u0004\bZ\u00105R \u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\\\u0012\u0004\b^\u0010E\u001a\u0004\b]\u00108¨\u0006a"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto$Surrogate;", "", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "subscription_id", "subscription_fee_id", "Lcom/robinhood/rosetta/common/DateDto;", InquiryField.DateField.TYPE, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "updated_at", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "credit", "carry_forward_credit", "", "state", "reference_id", "Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;", "payment_type", "<init>", "(Lokio/ByteString;Lokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILokio/ByteString;Lokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lokio/ByteString;", "component2", "component3", "()Lcom/robinhood/rosetta/common/DateDto;", "component4", "()Lj$/time/Instant;", "component5", "component6", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component7", "component8", "component9", "()Ljava/lang/String;", "component10", "component11", "()Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;", "copy", "(Lokio/ByteString;Lokio/ByteString;Lcom/robinhood/rosetta/common/DateDto;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;)Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokio/ByteString;", "getSubscription_id", "getSubscription_id$annotations", "()V", "getSubscription_fee_id", "getSubscription_fee_id$annotations", "Lcom/robinhood/rosetta/common/DateDto;", "getDate", "getDate$annotations", "Lj$/time/Instant;", "getCreated_at", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "getAmount$annotations", "getCredit", "getCredit$annotations", "getCarry_forward_credit", "getCarry_forward_credit$annotations", "Ljava/lang/String;", "getState", "getState$annotations", "getReference_id", "getReference_id$annotations", "Lrosetta/midas/v1/SubscriptionFeePaymentTypeDto;", "getPayment_type", "getPayment_type$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto amount;
        private final MoneyDto carry_forward_credit;
        private final Instant created_at;
        private final MoneyDto credit;
        private final DateDto date;
        private final SubscriptionFeePaymentTypeDto payment_type;
        private final String reference_id;
        private final String state;
        private final ByteString subscription_fee_id;
        private final ByteString subscription_id;
        private final Instant updated_at;

        public Surrogate() {
            this((ByteString) null, (ByteString) null, (DateDto) null, (Instant) null, (Instant) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (String) null, (String) null, (SubscriptionFeePaymentTypeDto) null, 2047, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ByteString byteString, ByteString byteString2, DateDto dateDto, Instant instant, Instant instant2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, String str, String str2, SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = surrogate.subscription_id;
            }
            if ((i & 2) != 0) {
                byteString2 = surrogate.subscription_fee_id;
            }
            if ((i & 4) != 0) {
                dateDto = surrogate.date;
            }
            if ((i & 8) != 0) {
                instant = surrogate.created_at;
            }
            if ((i & 16) != 0) {
                instant2 = surrogate.updated_at;
            }
            if ((i & 32) != 0) {
                moneyDto = surrogate.amount;
            }
            if ((i & 64) != 0) {
                moneyDto2 = surrogate.credit;
            }
            if ((i & 128) != 0) {
                moneyDto3 = surrogate.carry_forward_credit;
            }
            if ((i & 256) != 0) {
                str = surrogate.state;
            }
            if ((i & 512) != 0) {
                str2 = surrogate.reference_id;
            }
            if ((i & 1024) != 0) {
                subscriptionFeePaymentTypeDto = surrogate.payment_type;
            }
            String str3 = str2;
            SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto2 = subscriptionFeePaymentTypeDto;
            MoneyDto moneyDto4 = moneyDto3;
            String str4 = str;
            MoneyDto moneyDto5 = moneyDto;
            MoneyDto moneyDto6 = moneyDto2;
            Instant instant3 = instant2;
            DateDto dateDto2 = dateDto;
            return surrogate.copy(byteString, byteString2, dateDto2, instant, instant3, moneyDto5, moneyDto6, moneyDto4, str4, str3, subscriptionFeePaymentTypeDto2);
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("carryForwardCredit")
        @JsonAnnotations2(names = {"carry_forward_credit"})
        public static /* synthetic */ void getCarry_forward_credit$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("credit")
        @JsonAnnotations2(names = {"credit"})
        public static /* synthetic */ void getCredit$annotations() {
        }

        @SerialName(InquiryField.DateField.TYPE)
        @JsonAnnotations2(names = {InquiryField.DateField.TYPE})
        public static /* synthetic */ void getDate$annotations() {
        }

        @SerialName("paymentType")
        @JsonAnnotations2(names = {"payment_type"})
        public static /* synthetic */ void getPayment_type$annotations() {
        }

        @SerialName("referenceId")
        @JsonAnnotations2(names = {"reference_id"})
        public static /* synthetic */ void getReference_id$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("subscriptionFeeId")
        @JsonAnnotations2(names = {"subscription_fee_id"})
        public static /* synthetic */ void getSubscription_fee_id$annotations() {
        }

        @SerialName("subscriptionId")
        @JsonAnnotations2(names = {"subscription_id"})
        public static /* synthetic */ void getSubscription_id$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getSubscription_id() {
            return this.subscription_id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getReference_id() {
            return this.reference_id;
        }

        /* renamed from: component11, reason: from getter */
        public final SubscriptionFeePaymentTypeDto getPayment_type() {
            return this.payment_type;
        }

        /* renamed from: component2, reason: from getter */
        public final ByteString getSubscription_fee_id() {
            return this.subscription_fee_id;
        }

        /* renamed from: component3, reason: from getter */
        public final DateDto getDate() {
            return this.date;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component6, reason: from getter */
        public final MoneyDto getAmount() {
            return this.amount;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyDto getCredit() {
            return this.credit;
        }

        /* renamed from: component8, reason: from getter */
        public final MoneyDto getCarry_forward_credit() {
            return this.carry_forward_credit;
        }

        /* renamed from: component9, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final Surrogate copy(ByteString subscription_id, ByteString subscription_fee_id, DateDto date, Instant created_at, Instant updated_at, MoneyDto amount, MoneyDto credit, MoneyDto carry_forward_credit, String state, String reference_id, SubscriptionFeePaymentTypeDto payment_type) {
            Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
            Intrinsics.checkNotNullParameter(subscription_fee_id, "subscription_fee_id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(reference_id, "reference_id");
            Intrinsics.checkNotNullParameter(payment_type, "payment_type");
            return new Surrogate(subscription_id, subscription_fee_id, date, created_at, updated_at, amount, credit, carry_forward_credit, state, reference_id, payment_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.subscription_id, surrogate.subscription_id) && Intrinsics.areEqual(this.subscription_fee_id, surrogate.subscription_fee_id) && Intrinsics.areEqual(this.date, surrogate.date) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.credit, surrogate.credit) && Intrinsics.areEqual(this.carry_forward_credit, surrogate.carry_forward_credit) && Intrinsics.areEqual(this.state, surrogate.state) && Intrinsics.areEqual(this.reference_id, surrogate.reference_id) && this.payment_type == surrogate.payment_type;
        }

        public int hashCode() {
            int iHashCode = ((this.subscription_id.hashCode() * 31) + this.subscription_fee_id.hashCode()) * 31;
            DateDto dateDto = this.date;
            int iHashCode2 = (iHashCode + (dateDto == null ? 0 : dateDto.hashCode())) * 31;
            Instant instant = this.created_at;
            int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.updated_at;
            int iHashCode4 = (iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode5 = (iHashCode4 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.credit;
            int iHashCode6 = (iHashCode5 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.carry_forward_credit;
            return ((((((iHashCode6 + (moneyDto3 != null ? moneyDto3.hashCode() : 0)) * 31) + this.state.hashCode()) * 31) + this.reference_id.hashCode()) * 31) + this.payment_type.hashCode();
        }

        public String toString() {
            return "Surrogate(subscription_id=" + this.subscription_id + ", subscription_fee_id=" + this.subscription_fee_id + ", date=" + this.date + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", amount=" + this.amount + ", credit=" + this.credit + ", carry_forward_credit=" + this.carry_forward_credit + ", state=" + this.state + ", reference_id=" + this.reference_id + ", payment_type=" + this.payment_type + ")";
        }

        /* compiled from: SubscriptionFeeChargedDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SubscriptionFeeChargedDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, ByteString byteString2, DateDto dateDto, Instant instant, Instant instant2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, String str, String str2, SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.subscription_id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.subscription_fee_id = ByteString.EMPTY;
            } else {
                this.subscription_fee_id = byteString2;
            }
            if ((i & 4) == 0) {
                this.date = null;
            } else {
                this.date = dateDto;
            }
            if ((i & 8) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 16) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant2;
            }
            if ((i & 32) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 64) == 0) {
                this.credit = null;
            } else {
                this.credit = moneyDto2;
            }
            if ((i & 128) == 0) {
                this.carry_forward_credit = null;
            } else {
                this.carry_forward_credit = moneyDto3;
            }
            if ((i & 256) == 0) {
                this.state = "";
            } else {
                this.state = str;
            }
            if ((i & 512) == 0) {
                this.reference_id = "";
            } else {
                this.reference_id = str2;
            }
            if ((i & 1024) == 0) {
                this.payment_type = SubscriptionFeePaymentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.payment_type = subscriptionFeePaymentTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ByteString byteString = self.subscription_id;
            ByteString byteString2 = ByteString.EMPTY;
            if (!Intrinsics.areEqual(byteString, byteString2)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.subscription_id);
            }
            if (!Intrinsics.areEqual(self.subscription_fee_id, byteString2)) {
                output.encodeSerializableElement(serialDesc, 1, ByteStringSerializer.INSTANCE, self.subscription_fee_id);
            }
            DateDto dateDto = self.date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DateDto.Serializer.INSTANCE, dateDto);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.updated_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant2);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.credit;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.carry_forward_credit;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            if (!Intrinsics.areEqual(self.state, "")) {
                output.encodeStringElement(serialDesc, 8, self.state);
            }
            if (!Intrinsics.areEqual(self.reference_id, "")) {
                output.encodeStringElement(serialDesc, 9, self.reference_id);
            }
            if (self.payment_type != SubscriptionFeePaymentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, SubscriptionFeePaymentTypeDto.Serializer.INSTANCE, self.payment_type);
            }
        }

        public Surrogate(ByteString subscription_id, ByteString subscription_fee_id, DateDto dateDto, Instant instant, Instant instant2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, String state, String reference_id, SubscriptionFeePaymentTypeDto payment_type) {
            Intrinsics.checkNotNullParameter(subscription_id, "subscription_id");
            Intrinsics.checkNotNullParameter(subscription_fee_id, "subscription_fee_id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(reference_id, "reference_id");
            Intrinsics.checkNotNullParameter(payment_type, "payment_type");
            this.subscription_id = subscription_id;
            this.subscription_fee_id = subscription_fee_id;
            this.date = dateDto;
            this.created_at = instant;
            this.updated_at = instant2;
            this.amount = moneyDto;
            this.credit = moneyDto2;
            this.carry_forward_credit = moneyDto3;
            this.state = state;
            this.reference_id = reference_id;
            this.payment_type = payment_type;
        }

        public final ByteString getSubscription_id() {
            return this.subscription_id;
        }

        public /* synthetic */ Surrogate(ByteString byteString, ByteString byteString2, DateDto dateDto, Instant instant, Instant instant2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, String str, String str2, SubscriptionFeePaymentTypeDto subscriptionFeePaymentTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? ByteString.EMPTY : byteString2, (i & 4) != 0 ? null : dateDto, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : moneyDto2, (i & 128) != 0 ? null : moneyDto3, (i & 256) != 0 ? "" : str, (i & 512) != 0 ? "" : str2, (i & 1024) != 0 ? SubscriptionFeePaymentTypeDto.INSTANCE.getZeroValue() : subscriptionFeePaymentTypeDto);
        }

        public final ByteString getSubscription_fee_id() {
            return this.subscription_fee_id;
        }

        public final DateDto getDate() {
            return this.date;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final MoneyDto getCredit() {
            return this.credit;
        }

        public final MoneyDto getCarry_forward_credit() {
            return this.carry_forward_credit;
        }

        public final String getState() {
            return this.state;
        }

        public final String getReference_id() {
            return this.reference_id;
        }

        public final SubscriptionFeePaymentTypeDto getPayment_type() {
            return this.payment_type;
        }
    }

    /* compiled from: SubscriptionFeeChargedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SubscriptionFeeChargedDetailsDto, SubscriptionFeeChargedDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubscriptionFeeChargedDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionFeeChargedDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubscriptionFeeChargedDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) SubscriptionFeeChargedDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SubscriptionFeeChargedDetails> getProtoAdapter() {
            return SubscriptionFeeChargedDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionFeeChargedDetailsDto getZeroValue() {
            return SubscriptionFeeChargedDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubscriptionFeeChargedDetailsDto fromProto(SubscriptionFeeChargedDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ByteString subscription_id = proto.getSubscription_id();
            ByteString subscription_fee_id = proto.getSubscription_fee_id();
            Date date = proto.getDate();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DateDto dateDtoFromProto = date != null ? DateDto.INSTANCE.fromProto(date) : null;
            Instant created_at = proto.getCreated_at();
            Instant updated_at = proto.getUpdated_at();
            Money amount = proto.getAmount();
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            Money credit = proto.getCredit();
            MoneyDto moneyDtoFromProto2 = credit != null ? MoneyDto.INSTANCE.fromProto(credit) : null;
            Money carry_forward_credit = proto.getCarry_forward_credit();
            return new SubscriptionFeeChargedDetailsDto(new Surrogate(subscription_id, subscription_fee_id, dateDtoFromProto, created_at, updated_at, moneyDtoFromProto, moneyDtoFromProto2, carry_forward_credit != null ? MoneyDto.INSTANCE.fromProto(carry_forward_credit) : null, proto.getState(), proto.getReference_id(), SubscriptionFeePaymentTypeDto.INSTANCE.fromProto(proto.getPayment_type())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.midas.v1.SubscriptionFeeChargedDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubscriptionFeeChargedDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SubscriptionFeeChargedDetailsDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SubscriptionFeeChargedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SubscriptionFeeChargedDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.SubscriptionFeeChargedDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SubscriptionFeeChargedDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SubscriptionFeeChargedDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SubscriptionFeeChargedDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SubscriptionFeeChargedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/midas/v1/SubscriptionFeeChargedDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.midas.v1.SubscriptionFeeChargedDetailsDto";
        }
    }
}
