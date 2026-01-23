package com.robinhood.android.matcha.p177ui.p178qr.amount;

import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.android.models.matcha.api.MatchaTransactionType;
import com.robinhood.models.p320db.matcha.EncryptedUserId;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaQrCodeBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0001¨\u0006\u0005"}, m3636d2 = {"createSendDeeplink", "", "Lcom/robinhood/models/db/matcha/EncryptedUserId;", "amount", "Ljava/math/BigDecimal;", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.qr.amount.MatchaQrCodeBottomSheetDuxoKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaQrCodeBottomSheetDuxo2 {
    public static final String createSendDeeplink(EncryptedUserId encryptedUserId, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(encryptedUserId, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return MatchaQrCodeDuxo6.APPLINK_SCHEME + DeepLinkPath.MATCHA.getPath() + "?user_id=" + encryptedUserId.getValue() + "&amount=" + amount.doubleValue() + "&transaction_type=" + MatchaTransactionType.MATCHA_TRANSFER.getDeeplinkValue();
    }
}
