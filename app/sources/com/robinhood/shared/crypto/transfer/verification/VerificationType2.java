package com.robinhood.shared.crypto.transfer.verification;

import com.robinhood.models.api.transfer.ApiCryptoTransferHistoryDetailResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationType.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"serverType", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferHistoryDetailResponse$Type;", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "getServerType", "(Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;)Lcom/robinhood/models/api/transfer/ApiCryptoTransferHistoryDetailResponse$Type;", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationTypeKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class VerificationType2 {

    /* compiled from: VerificationType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationTypeKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationType.values().length];
            try {
                iArr[VerificationType.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationType.WITHDRAWAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ApiCryptoTransferHistoryDetailResponse.Type getServerType(VerificationType verificationType) {
        Intrinsics.checkNotNullParameter(verificationType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
        if (i == 1) {
            return ApiCryptoTransferHistoryDetailResponse.Type.DEPOSIT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return ApiCryptoTransferHistoryDetailResponse.Type.WITHDRAWAL;
    }
}
