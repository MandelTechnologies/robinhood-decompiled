package com.truelayer.payments.core.network.mandates.entity.shared;

import com.robinhood.models.api.MarginCall;
import com.truelayer.payments.core.domain.payments.PaymentFailureReason;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MandateFailureReason.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateFailureReason;", "", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;", "reason", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getReason", "()Ljava/lang/String;", "setReason", "(Ljava/lang/String;)V", "intoDomain", "Canceled", "Expired", "AuthorizationFailed", "ProviderRejected", "ProviderError", "InternalServerError", "InvalidRequest", "InvalidSortCode", "UnknownError", "Unknown", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = MandateFailureReason2.class)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class MandateFailureReason implements IntoDomain<PaymentFailureReason> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MandateFailureReason[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private String reason;
    public static final MandateFailureReason Canceled = new MandateFailureReason("Canceled", 0, "canceled");
    public static final MandateFailureReason Expired = new MandateFailureReason("Expired", 1, MarginCall.STATE_EXPIRED);
    public static final MandateFailureReason AuthorizationFailed = new MandateFailureReason("AuthorizationFailed", 2, "authorization_failed");
    public static final MandateFailureReason ProviderRejected = new MandateFailureReason("ProviderRejected", 3, "provider_rejected");
    public static final MandateFailureReason ProviderError = new MandateFailureReason("ProviderError", 4, "provider_error");
    public static final MandateFailureReason InternalServerError = new MandateFailureReason("InternalServerError", 5, "internal_server_error");
    public static final MandateFailureReason InvalidRequest = new MandateFailureReason("InvalidRequest", 6, "invalid_request");
    public static final MandateFailureReason InvalidSortCode = new MandateFailureReason("InvalidSortCode", 7, "invalid_sort_code");
    public static final MandateFailureReason UnknownError = new MandateFailureReason("UnknownError", 8, "unknown_error");
    public static final MandateFailureReason Unknown = new MandateFailureReason("Unknown", 9, "unknown");

    /* compiled from: MandateFailureReason.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MandateFailureReason.values().length];
            try {
                iArr[MandateFailureReason.Canceled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MandateFailureReason.Expired.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MandateFailureReason.AuthorizationFailed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MandateFailureReason.ProviderRejected.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MandateFailureReason.ProviderError.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MandateFailureReason.InternalServerError.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MandateFailureReason.InvalidRequest.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MandateFailureReason.InvalidSortCode.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MandateFailureReason.UnknownError.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MandateFailureReason.Unknown.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ MandateFailureReason[] $values() {
        return new MandateFailureReason[]{Canceled, Expired, AuthorizationFailed, ProviderRejected, ProviderError, InternalServerError, InvalidRequest, InvalidSortCode, UnknownError, Unknown};
    }

    public static EnumEntries<MandateFailureReason> getEntries() {
        return $ENTRIES;
    }

    public static MandateFailureReason valueOf(String str) {
        return (MandateFailureReason) Enum.valueOf(MandateFailureReason.class, str);
    }

    public static MandateFailureReason[] values() {
        return (MandateFailureReason[]) $VALUES.clone();
    }

    /* compiled from: MandateFailureReason.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateFailureReason$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateFailureReason;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MandateFailureReason.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<MandateFailureReason> serializer() {
            return get$cachedSerializer();
        }
    }

    private MandateFailureReason(String str, int i, String str2) {
        this.reason = str2;
    }

    public final String getReason() {
        return this.reason;
    }

    public final void setReason(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reason = str;
    }

    static {
        MandateFailureReason[] mandateFailureReasonArr$values = $values();
        $VALUES = mandateFailureReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(mandateFailureReasonArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.mandates.entity.shared.MandateFailureReason.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return MandateFailureReason2.INSTANCE;
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    public PaymentFailureReason intoDomain() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return PaymentFailureReason.Canceled;
            case 2:
                return PaymentFailureReason.Expired;
            case 3:
                return PaymentFailureReason.AuthorizationFailed;
            case 4:
                return PaymentFailureReason.ProviderRejected;
            case 5:
                return PaymentFailureReason.ProviderError;
            case 6:
                return PaymentFailureReason.InternalServerError;
            case 7:
                return PaymentFailureReason.InvalidRequest;
            case 8:
                return PaymentFailureReason.InvalidSortCode;
            case 9:
                return PaymentFailureReason.UnknownError;
            case 10:
                PaymentFailureReason paymentFailureReason = PaymentFailureReason.Unknown;
                paymentFailureReason.setReason(this.reason);
                return paymentFailureReason;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
