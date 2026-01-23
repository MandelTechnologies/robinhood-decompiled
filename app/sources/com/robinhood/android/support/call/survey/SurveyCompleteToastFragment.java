package com.robinhood.android.support.call.survey;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.support.call.PendingSnackbarManager;
import com.robinhood.models.p355ui.pathfinder.contexts.SurveyCompleteToastContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyCompleteToastFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyCompleteToastFragment;", "Lcom/robinhood/android/support/call/survey/BaseSurveyFragment;", "<init>", "()V", "onStart", "", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SurveyCompleteToastFragment extends BaseSurveyFragment {
    private final String screenName;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SurveyCompleteToastFragment() {
        super(0);
        this.screenName = "CX_SURVEY_COMPLETE_TOAST";
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        SurveyCompleteToastContext context = ((UserViewStatePageContext.SurveyCompleteToast) ((LegacyFragmentKey.SurveyCompleteToast) INSTANCE.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext();
        PendingSnackbarManager pendingSnackbarManager = getPendingSnackbarManager();
        RichText displayDescription = context.getDisplayDescription();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        pendingSnackbarManager.pushPendingSnackbar(new PendingSnackbarManager.Config(RichTexts.toSpannableString$default(displayDescription, contextRequireContext, null, false, null, 14, null), 0, ContextCompat.getDrawable(requireContext(), context.getIcon().getResourceId()), null, 10, null));
        getCallbacks().dismissFlow();
    }

    @Override // com.robinhood.android.support.call.survey.BaseSurveyFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.support.call.survey.BaseSurveyFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        String string2 = ((LegacyFragmentKey.SurveyCompleteToast) INSTANCE.getArgs((Fragment) this)).getInquiryId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* compiled from: SurveyCompleteToastFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyCompleteToastFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/support/call/survey/SurveyCompleteToastFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyCompleteToast;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SurveyCompleteToastFragment, LegacyFragmentKey.SurveyCompleteToast> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.SurveyCompleteToast surveyCompleteToast) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, surveyCompleteToast);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.SurveyCompleteToast getArgs(SurveyCompleteToastFragment surveyCompleteToastFragment) {
            return (LegacyFragmentKey.SurveyCompleteToast) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, surveyCompleteToastFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SurveyCompleteToastFragment newInstance(LegacyFragmentKey.SurveyCompleteToast surveyCompleteToast) {
            return (SurveyCompleteToastFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, surveyCompleteToast);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SurveyCompleteToastFragment surveyCompleteToastFragment, LegacyFragmentKey.SurveyCompleteToast surveyCompleteToast) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, surveyCompleteToastFragment, surveyCompleteToast);
        }
    }
}
