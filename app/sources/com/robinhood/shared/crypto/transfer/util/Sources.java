package com.robinhood.shared.crypto.transfer.util;

import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sources.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"navigationType", "Lcom/robinhood/shared/crypto/transfer/util/NavigationType;", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;", "getNavigationType", "(Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;)Lcom/robinhood/shared/crypto/transfer/util/NavigationType;", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.util.SourcesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class Sources {
    public static final NavigationType getNavigationType(CryptoTransferIntentKey.Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        if (Intrinsics.areEqual(source, CryptoTransferIntentKey.Source.Default.INSTANCE) || (source instanceof CryptoTransferIntentKey.Source.Gateway)) {
            return NavigationType.MODAL;
        }
        if (Intrinsics.areEqual(source, CryptoTransferIntentKey.Source.CryptoFeesDepositIncentive.INSTANCE)) {
            return NavigationType.PUSH;
        }
        throw new NoWhenBranchMatchedException();
    }
}
