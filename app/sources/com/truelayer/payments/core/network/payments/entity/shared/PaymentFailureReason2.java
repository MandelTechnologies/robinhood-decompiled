package com.truelayer.payments.core.network.payments.entity.shared;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.descriptors.SerialKinds2;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* compiled from: PaymentFailureReason.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentFailureReasonSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentFailureReason;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.network.payments.entity.shared.PaymentFailureReasonSerializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class PaymentFailureReason2 implements KSerializer<PaymentFailureReason> {
    public static final PaymentFailureReason2 INSTANCE = new PaymentFailureReason2();
    private static final SerialDescriptor descriptor = SerialDescriptors3.PrimitiveSerialDescriptor("PaymentFailureReason", SerialKinds2.STRING.INSTANCE);

    private PaymentFailureReason2() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, PaymentFailureReason value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.getReason());
    }

    @Override // kotlinx.serialization.KSerializer2
    public PaymentFailureReason deserialize(Decoding2 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        PaymentFailureReason paymentFailureReason = PaymentFailureReason.AuthorizationFailed;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason.getReason())) {
            return paymentFailureReason;
        }
        PaymentFailureReason paymentFailureReason2 = PaymentFailureReason.Blocked;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason2.getReason())) {
            return paymentFailureReason2;
        }
        PaymentFailureReason paymentFailureReason3 = PaymentFailureReason.Canceled;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason3.getReason())) {
            return paymentFailureReason3;
        }
        PaymentFailureReason paymentFailureReason4 = PaymentFailureReason.ConstraintViolation;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason4.getReason())) {
            return paymentFailureReason4;
        }
        PaymentFailureReason paymentFailureReason5 = PaymentFailureReason.Expired;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason5.getReason())) {
            return paymentFailureReason5;
        }
        PaymentFailureReason paymentFailureReason6 = PaymentFailureReason.InsufficientFunds;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason6.getReason())) {
            return paymentFailureReason6;
        }
        PaymentFailureReason paymentFailureReason7 = PaymentFailureReason.InternalServerError;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason7.getReason())) {
            return paymentFailureReason7;
        }
        PaymentFailureReason paymentFailureReason8 = PaymentFailureReason.InvalidAccountDetails;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason8.getReason())) {
            return paymentFailureReason8;
        }
        PaymentFailureReason paymentFailureReason9 = PaymentFailureReason.InvalidAccountHolderName;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason9.getReason())) {
            return paymentFailureReason9;
        }
        PaymentFailureReason paymentFailureReason10 = PaymentFailureReason.InvalidBeneficiaryAccount;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason10.getReason())) {
            return paymentFailureReason10;
        }
        PaymentFailureReason paymentFailureReason11 = PaymentFailureReason.InvalidCredentials;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason11.getReason())) {
            return paymentFailureReason11;
        }
        PaymentFailureReason paymentFailureReason12 = PaymentFailureReason.InvalidMandateState;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason12.getReason())) {
            return paymentFailureReason12;
        }
        PaymentFailureReason paymentFailureReason13 = PaymentFailureReason.InvalidOtp;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason13.getReason())) {
            return paymentFailureReason13;
        }
        PaymentFailureReason paymentFailureReason14 = PaymentFailureReason.InvalidRemitterAccount;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason14.getReason())) {
            return paymentFailureReason14;
        }
        PaymentFailureReason paymentFailureReason15 = PaymentFailureReason.InvalidRequest;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason15.getReason())) {
            return paymentFailureReason15;
        }
        PaymentFailureReason paymentFailureReason16 = PaymentFailureReason.InvalidSortCode;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason16.getReason())) {
            return paymentFailureReason16;
        }
        PaymentFailureReason paymentFailureReason17 = PaymentFailureReason.MandateRevoked;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason17.getReason())) {
            return paymentFailureReason17;
        }
        PaymentFailureReason paymentFailureReason18 = PaymentFailureReason.NotAuthorized;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason18.getReason())) {
            return paymentFailureReason18;
        }
        PaymentFailureReason paymentFailureReason19 = PaymentFailureReason.PaymentLimitExceeded;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason19.getReason())) {
            return paymentFailureReason19;
        }
        PaymentFailureReason paymentFailureReason20 = PaymentFailureReason.ProviderError;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason20.getReason())) {
            return paymentFailureReason20;
        }
        PaymentFailureReason paymentFailureReason21 = PaymentFailureReason.ProviderExpired;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason21.getReason())) {
            return paymentFailureReason21;
        }
        PaymentFailureReason paymentFailureReason22 = PaymentFailureReason.ProviderRejected;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason22.getReason())) {
            return paymentFailureReason22;
        }
        PaymentFailureReason paymentFailureReason23 = PaymentFailureReason.Rejected;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason23.getReason())) {
            return paymentFailureReason23;
        }
        PaymentFailureReason paymentFailureReason24 = PaymentFailureReason.SchemeUnavailable;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason24.getReason())) {
            return paymentFailureReason24;
        }
        PaymentFailureReason paymentFailureReason25 = PaymentFailureReason.UnknownError;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason25.getReason())) {
            return paymentFailureReason25;
        }
        PaymentFailureReason paymentFailureReason26 = PaymentFailureReason.UserCanceledAtProvider;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason26.getReason())) {
            return paymentFailureReason26;
        }
        PaymentFailureReason paymentFailureReason27 = PaymentFailureReason.VerificationDeclined;
        if (Intrinsics.areEqual(strDecodeString, paymentFailureReason27.getReason())) {
            return paymentFailureReason27;
        }
        PaymentFailureReason paymentFailureReason28 = PaymentFailureReason.Unknown;
        paymentFailureReason28.setReason(strDecodeString);
        return paymentFailureReason28;
    }
}
