package com.robinhood.android.cash.disputes.p070ui.question;

import com.robinhood.android.common.p088ui.view.RhToolbar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: DisputeToolbarSkipText.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DisputeToolbarSkipText;", "", "addToolbarSkipContainer", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "setDisputeSkipButtonText", "skipText", "", "clickAction", "Lkotlin/Function0;", "setDisputeSkipButtonEnabled", "isSkipButtonEnabled", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface DisputeToolbarSkipText {
    void addToolbarSkipContainer(RhToolbar toolbar);

    void setDisputeSkipButtonEnabled(boolean isSkipButtonEnabled);

    void setDisputeSkipButtonText(String skipText, Function0<Unit> clickAction);
}
