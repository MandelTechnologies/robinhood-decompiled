package com.robinhood.android.support.call.survey;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.support.ContactSupportDeeplinkTarget;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyContactRedirectFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyContactRedirectFragment;", "Lcom/robinhood/android/support/call/survey/BaseSurveyFragment;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SurveyContactRedirectFragment extends BaseSurveyFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SurveyContactRedirectFragment() {
        super(0);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri uriBuild = new Uri.Builder().scheme(DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD()).authority(ContactSupportDeeplinkTarget.INSTANCE.getPath()).appendQueryParameter("inquiry_id", ((UserViewStatePageContext.SurveyContactRedirect) ((LegacyFragmentKey.SurveyContactRedirect) INSTANCE.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext().getInquiryId()).build();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uriBuild, null, null, false, null, 60, null);
        getCallbacks().dismissFlow();
    }

    /* compiled from: SurveyContactRedirectFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyContactRedirectFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/support/call/survey/SurveyContactRedirectFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyContactRedirect;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SurveyContactRedirectFragment, LegacyFragmentKey.SurveyContactRedirect> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.SurveyContactRedirect surveyContactRedirect) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, surveyContactRedirect);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.SurveyContactRedirect getArgs(SurveyContactRedirectFragment surveyContactRedirectFragment) {
            return (LegacyFragmentKey.SurveyContactRedirect) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, surveyContactRedirectFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SurveyContactRedirectFragment newInstance(LegacyFragmentKey.SurveyContactRedirect surveyContactRedirect) {
            return (SurveyContactRedirectFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, surveyContactRedirect);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SurveyContactRedirectFragment surveyContactRedirectFragment, LegacyFragmentKey.SurveyContactRedirect surveyContactRedirect) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, surveyContactRedirectFragment, surveyContactRedirect);
        }
    }
}
