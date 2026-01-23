package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserLeapManagers.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"presentGoldWelcomeSurveyAndReturnToMainIfNeeded", "", "Lcom/robinhood/userleap/UserLeapManager;", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.UserLeapManagersKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UserLeapManagers {
    public static final void presentGoldWelcomeSurveyAndReturnToMainIfNeeded(SurveyManager3 surveyManager3, BaseActivity activity, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        if (entryPoint == MAXTransferContext.EntryPoint.GOLD_OPT_IN_UPGRADE_WELCOME) {
            surveyManager3.setPendingSurvey(Survey.GOLD_DEFAULT_OPT_IN_SUBSCRIBERS);
            Navigator.DefaultImpls.startActivity$default(activity.getNavigator(), activity, MainActivityIntentKey.INSTANCE, null, false, null, null, 60, null);
        }
    }
}
