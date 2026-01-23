package com.robinhood.android.optionsexercise.error;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment;
import com.robinhood.android.common.onboarding.p085ui.SplashPage;
import com.robinhood.android.common.util.extensions.Breadcrumbs2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionExerciseCorpActionFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/error/OptionExerciseCorpActionFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseFullscreenInfoFragment;", "Lcom/robinhood/android/lib/breadcrumbs/AutomaticBreadcrumbProvider;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "breadcrumb", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "getBreadcrumb", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "splashPage", "Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "getSplashPage", "()Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "primaryButtonLabelRes", "", "getPrimaryButtonLabelRes", "()Ljava/lang/Integer;", "onPrimaryButtonClicked", "", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionExerciseCorpActionFragment extends BaseFullscreenInfoFragment implements SupportBreadcrumbTracker2, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
    private final int primaryButtonLabelRes = C11048R.string.general_label_contact_support;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2
    public SupportBreadcrumb getBreadcrumb() {
        return Breadcrumbs2.createBreadcrumb$default(this, SupportBreadcrumbType.INVESTING_STOCKS_CORP_ACTION_WARNING, null, 2, null);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public SplashPage getSplashPage() {
        SplashPage.Creative.DrawableWithUnscaledText drawableWithUnscaledText = new SplashPage.Creative.DrawableWithUnscaledText(C24704R.drawable.svg_paper_airplane);
        String string2 = getString(C24704R.string.option_exercise_corp_action_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(C24704R.string.option_exercise_corp_action_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new SplashPage(drawableWithUnscaledText, null, string2, string3, null, null, 50, null);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public Integer getPrimaryButtonLabelRes() {
        return Integer.valueOf(this.primaryButtonLabelRes);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public void onPrimaryButtonClicked() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showContactSupportTriageFragment$default(navigator, contextRequireContext, null, false, 6, null);
    }

    /* compiled from: OptionExerciseCorpActionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/error/OptionExerciseCorpActionFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/optionsexercise/error/OptionExerciseCorpActionFragment;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionExerciseCorpActionFragment newInstance() {
            return new OptionExerciseCorpActionFragment();
        }
    }
}
