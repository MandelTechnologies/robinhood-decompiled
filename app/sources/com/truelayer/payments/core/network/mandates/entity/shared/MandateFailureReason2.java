package com.truelayer.payments.core.network.mandates.entity.shared;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.descriptors.SerialKinds2;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* compiled from: MandateFailureReason.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateFailureReasonSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateFailureReason;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.network.mandates.entity.shared.MandateFailureReasonSerializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class MandateFailureReason2 implements KSerializer<MandateFailureReason> {
    public static final MandateFailureReason2 INSTANCE = new MandateFailureReason2();
    private static final SerialDescriptor descriptor = SerialDescriptors3.PrimitiveSerialDescriptor("PaymentFailureReason", SerialKinds2.STRING.INSTANCE);

    private MandateFailureReason2() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, MandateFailureReason value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.getReason());
    }

    @Override // kotlinx.serialization.KSerializer2
    public MandateFailureReason deserialize(Decoding2 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        MandateFailureReason mandateFailureReason = MandateFailureReason.Canceled;
        if (Intrinsics.areEqual(strDecodeString, mandateFailureReason.getReason())) {
            return mandateFailureReason;
        }
        MandateFailureReason mandateFailureReason2 = MandateFailureReason.Expired;
        if (Intrinsics.areEqual(strDecodeString, mandateFailureReason2.getReason())) {
            return mandateFailureReason2;
        }
        MandateFailureReason mandateFailureReason3 = MandateFailureReason.AuthorizationFailed;
        if (Intrinsics.areEqual(strDecodeString, mandateFailureReason3.getReason())) {
            return mandateFailureReason3;
        }
        MandateFailureReason mandateFailureReason4 = MandateFailureReason.ProviderRejected;
        if (Intrinsics.areEqual(strDecodeString, mandateFailureReason4.getReason())) {
            return mandateFailureReason4;
        }
        MandateFailureReason mandateFailureReason5 = MandateFailureReason.ProviderError;
        if (Intrinsics.areEqual(strDecodeString, mandateFailureReason5.getReason())) {
            return mandateFailureReason5;
        }
        MandateFailureReason mandateFailureReason6 = MandateFailureReason.InternalServerError;
        if (Intrinsics.areEqual(strDecodeString, mandateFailureReason6.getReason())) {
            return mandateFailureReason6;
        }
        MandateFailureReason mandateFailureReason7 = MandateFailureReason.InvalidRequest;
        if (Intrinsics.areEqual(strDecodeString, mandateFailureReason7.getReason())) {
            return mandateFailureReason7;
        }
        MandateFailureReason mandateFailureReason8 = MandateFailureReason.InvalidSortCode;
        if (Intrinsics.areEqual(strDecodeString, mandateFailureReason8.getReason())) {
            return mandateFailureReason8;
        }
        MandateFailureReason mandateFailureReason9 = MandateFailureReason.UnknownError;
        if (Intrinsics.areEqual(strDecodeString, mandateFailureReason9.getReason())) {
            return mandateFailureReason9;
        }
        MandateFailureReason mandateFailureReason10 = MandateFailureReason.Unknown;
        mandateFailureReason10.setReason(strDecodeString);
        return mandateFailureReason10;
    }
}
