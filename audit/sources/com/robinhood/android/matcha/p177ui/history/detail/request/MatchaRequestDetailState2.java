package com.robinhood.android.matcha.p177ui.history.detail.request;

import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailState4;
import com.robinhood.android.models.matcha.api.MatchaRequestState;
import com.robinhood.models.p320db.matcha.MatchaRequest;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaRequestDetailState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u000b"}, m3636d2 = {"isUnaccepted", "", "Lcom/robinhood/models/db/matcha/MatchaRequest;", "(Lcom/robinhood/models/db/matcha/MatchaRequest;)Z", "getConfirmationText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/matcha/ui/history/detail/request/RequestState$Action;", "transactorName", "", "amount", "Lcom/robinhood/models/util/Money;", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailStateKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaRequestDetailState2 {

    /* compiled from: MatchaRequestDetailState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.detail.request.MatchaRequestDetailStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchaRequestDetailState4.Action.values().length];
            try {
                iArr[MatchaRequestDetailState4.Action.ACCEPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchaRequestDetailState4.Action.DECLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MatchaRequestDetailState4.Action.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isUnaccepted(MatchaRequest matchaRequest) {
        return matchaRequest.getState() == MatchaRequestState.UNACCEPTED;
    }

    public static final StringResource getConfirmationText(MatchaRequestDetailState4.Action action, String transactorName, Money amount) {
        Intrinsics.checkNotNullParameter(action, "<this>");
        Intrinsics.checkNotNullParameter(transactorName, "transactorName");
        Intrinsics.checkNotNullParameter(amount, "amount");
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_transaction_accept_request_success, transactorName, Money.format$default(amount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_transaction_decline_request_success, transactorName);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C21284R.string.matcha_transaction_cancel_request_success, transactorName);
    }
}
