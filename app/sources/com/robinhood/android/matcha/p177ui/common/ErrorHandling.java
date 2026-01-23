package com.robinhood.android.matcha.p177ui.common;

import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericAlertErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorHandling.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"matchaErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "Lcom/robinhood/android/common/ui/BaseActivity;", "getMatchaErrorHandler", "(Lcom/robinhood/android/common/ui/BaseActivity;)Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.common.ErrorHandlingKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ErrorHandling {
    public static final ActivityErrorHandler getMatchaErrorHandler(final BaseActivity baseActivity) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        return new ActivityErrorHandler() { // from class: com.robinhood.android.matcha.ui.common.ErrorHandlingKt$matchaErrorHandler$1
            {
                super(this.$this_matchaErrorHandler, true, 0, null, 12, null);
            }

            @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
            public boolean handleErrorResponse(ErrorResponse errorResponse) {
                Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
                if (errorResponse instanceof GenericAlertErrorResponse) {
                    Navigator.DefaultImpls.createDialogFragment$default(this.$this_matchaErrorHandler.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(((GenericAlertErrorResponse) errorResponse).getAlert(), false, true, 0, 10, (DefaultConstructorMarker) null), null, 2, null).show(this.$this_matchaErrorHandler.getSupportFragmentManager(), "matcha-error");
                    return true;
                }
                return super.handleErrorResponse(errorResponse);
            }
        };
    }
}
