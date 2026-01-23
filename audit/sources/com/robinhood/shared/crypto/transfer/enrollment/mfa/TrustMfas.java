package com.robinhood.shared.crypto.transfer.enrollment.mfa;

import com.robinhood.models.api.transfer.ApiCryptoTransferEnrollment;
import kotlin.Metadata;

/* compiled from: TrustMfas.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0003\u001a\f\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0003¨\u0006\u0005"}, m3636d2 = {"isPhoneVerified", "", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment;", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferEnrollment$TrustMfa;", "isEmailVerified", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.mfa.TrustMfasKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TrustMfas {
    public static final boolean isPhoneVerified(ApiCryptoTransferEnrollment apiCryptoTransferEnrollment) {
        if (apiCryptoTransferEnrollment == null) {
            return false;
        }
        return isPhoneVerified(apiCryptoTransferEnrollment.getMfa());
    }

    public static final boolean isPhoneVerified(ApiCryptoTransferEnrollment.TrustMfa trustMfa) {
        return trustMfa == null || trustMfa.is_phone_verified();
    }

    public static final boolean isEmailVerified(ApiCryptoTransferEnrollment apiCryptoTransferEnrollment) {
        if (apiCryptoTransferEnrollment == null) {
            return false;
        }
        return isEmailVerified(apiCryptoTransferEnrollment.getMfa());
    }

    public static final boolean isEmailVerified(ApiCryptoTransferEnrollment.TrustMfa trustMfa) {
        return trustMfa == null || trustMfa.is_email_verified();
    }
}
