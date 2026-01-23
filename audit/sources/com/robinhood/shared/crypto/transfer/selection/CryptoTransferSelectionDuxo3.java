package com.robinhood.shared.crypto.transfer.selection;

import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CryptoTransferSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"localAction", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action;", "getLocalAction", "(Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action;)Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxoKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferSelectionDuxo3 {

    /* compiled from: CryptoTransferSelectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoTransferIntentKey.Action.values().length];
            try {
                iArr[CryptoTransferIntentKey.Action.ENROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoTransferIntentKey.Action.RECEIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoTransferIntentKey.Action.SEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoTransferIntentKey.Action.SAVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTransferAction getLocalAction(CryptoTransferIntentKey.Action action) {
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            return CryptoTransferAction.ENROLL;
        }
        if (i == 2) {
            return CryptoTransferAction.RECEIVE;
        }
        if (i == 3) {
            return CryptoTransferAction.SEND;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return CryptoTransferAction.SAVE;
    }
}
