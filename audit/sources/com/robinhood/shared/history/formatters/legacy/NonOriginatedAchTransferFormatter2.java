package com.robinhood.shared.history.formatters.legacy;

import com.robinhood.android.common.C11048R;
import com.robinhood.transfers.api.NonOriginatedAchTransferState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NonOriginatedAchTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/transfers/api/NonOriginatedAchTransferState;", "getLabelResId", "(Lcom/robinhood/transfers/api/NonOriginatedAchTransferState;)I", "lib-history-formatters-legacy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.formatters.legacy.NonOriginatedAchTransferFormatterKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class NonOriginatedAchTransferFormatter2 {

    /* compiled from: NonOriginatedAchTransferFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.formatters.legacy.NonOriginatedAchTransferFormatterKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NonOriginatedAchTransferState.values().length];
            try {
                iArr[NonOriginatedAchTransferState.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NonOriginatedAchTransferState.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NonOriginatedAchTransferState.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NonOriginatedAchTransferState.REVERSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NonOriginatedAchTransferState.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getLabelResId(NonOriginatedAchTransferState nonOriginatedAchTransferState) {
        int i = WhenMappings.$EnumSwitchMapping$0[nonOriginatedAchTransferState.ordinal()];
        if (i == 1) {
            return C39006R.string.minerva_non_orig_ach_transfer_state_pending;
        }
        if (i == 2) {
            return C39006R.string.minerva_non_orig_ach_transfer_state_completed;
        }
        if (i == 3) {
            return C39006R.string.minerva_non_orig_ach_transfer_state_rejected;
        }
        if (i == 4) {
            return C39006R.string.minerva_non_orig_ach_transfer_state_reversed;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C11048R.string.general_label_unknown;
    }
}
