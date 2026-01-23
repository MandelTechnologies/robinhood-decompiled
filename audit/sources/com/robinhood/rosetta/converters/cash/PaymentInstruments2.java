package com.robinhood.rosetta.converters.cash;

import com.robinhood.models.api.bonfire.paymentinstruments.UserStatusWithExternalProviders;
import com.robinhood.rosetta.eventlogging.DcfKycContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PaymentInstruments.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/DcfKycContext$Status;", "Lcom/robinhood/models/api/bonfire/paymentinstruments/UserStatusWithExternalProviders;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.cash.PaymentInstrumentsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class PaymentInstruments2 {

    /* compiled from: PaymentInstruments.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.cash.PaymentInstrumentsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserStatusWithExternalProviders.values().length];
            try {
                iArr[UserStatusWithExternalProviders.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserStatusWithExternalProviders.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserStatusWithExternalProviders.MANUAL_REVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserStatusWithExternalProviders.PENDING_KYC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UserStatusWithExternalProviders.PENDING_KYC_UNDER_REVIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UserStatusWithExternalProviders.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DcfKycContext.Status toProtobuf(UserStatusWithExternalProviders userStatusWithExternalProviders) {
        switch (userStatusWithExternalProviders == null ? -1 : WhenMappings.$EnumSwitchMapping$0[userStatusWithExternalProviders.ordinal()]) {
            case -1:
            case 6:
                return DcfKycContext.Status.STATUS_UNSPECIFIED;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return DcfKycContext.Status.ACTIVE;
            case 2:
                return DcfKycContext.Status.DISABLED;
            case 3:
                return DcfKycContext.Status.MANUAL_REVIEW;
            case 4:
                return DcfKycContext.Status.PENDING_KYC;
            case 5:
                return DcfKycContext.Status.PENDING_KYC_UNDER_REVIEW;
        }
    }
}
