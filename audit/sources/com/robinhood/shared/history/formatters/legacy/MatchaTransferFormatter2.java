package com.robinhood.shared.history.formatters.legacy;

import com.robinhood.android.models.matcha.api.MatchaTransferState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MatchaTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"negativeBadgeTextRes", "", "Lcom/robinhood/android/models/matcha/api/MatchaTransferState;", "getNegativeBadgeTextRes", "(Lcom/robinhood/android/models/matcha/api/MatchaTransferState;)Ljava/lang/Integer;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.formatters.legacy.MatchaTransferFormatterKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MatchaTransferFormatter2 {

    /* compiled from: MatchaTransferFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.formatters.legacy.MatchaTransferFormatterKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchaTransferState.values().length];
            try {
                iArr[MatchaTransferState.FAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchaTransferState.DECLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MatchaTransferState.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MatchaTransferState.CANCELED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MatchaTransferState.SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MatchaTransferState.PROCESSING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MatchaTransferState.PENDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MatchaTransferState.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer getNegativeBadgeTextRes(MatchaTransferState matchaTransferState) {
        switch (WhenMappings.$EnumSwitchMapping$0[matchaTransferState.ordinal()]) {
            case 1:
                return Integer.valueOf(C39006R.string.matcha_transfer_state_failed);
            case 2:
                return Integer.valueOf(C39006R.string.matcha_transfer_state_declined);
            case 3:
                return Integer.valueOf(C39006R.string.matcha_transfer_state_expired);
            case 4:
                return Integer.valueOf(C39006R.string.matcha_transfer_state_canceled);
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
