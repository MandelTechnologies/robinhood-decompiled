package com.robinhood.android.optionsexercise.error;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment;
import com.robinhood.android.common.onboarding.p085ui.SplashPage;
import com.robinhood.android.common.util.extensions.Breadcrumbs2;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionExerciseMarketDataErrorFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\t\u0010\u001a\u001a\u00020\u0007H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/error/OptionExerciseMarketDataErrorFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseFullscreenInfoFragment;", "Lcom/robinhood/android/lib/breadcrumbs/AutomaticBreadcrumbProvider;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", OptionExerciseMarketDataErrorFragment.ARG_IS_UK, "", "()Z", "isUk$delegate", "Lkotlin/Lazy;", "breadcrumb", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "getBreadcrumb", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "splashPage", "Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "getSplashPage", "()Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "primaryButtonLabelRes", "", "getPrimaryButtonLabelRes", "()Ljava/lang/Integer;", "onPrimaryButtonClicked", "", "onBackPressed", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionExerciseMarketDataErrorFragment extends BaseFullscreenInfoFragment implements SupportBreadcrumbTracker2, RegionGated {
    private static final String ARG_IS_UK = "isUk";
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: isUk$delegate, reason: from kotlin metadata */
    private final Lazy isUk = Fragments2.argument(this, ARG_IS_UK);
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

    private final boolean isUk() {
        return ((Boolean) this.isUk.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2
    public SupportBreadcrumb getBreadcrumb() {
        return Breadcrumbs2.createBreadcrumb$default(this, SupportBreadcrumbType.INVESTING_MARKET_DATA_UNAVAILABLE, null, 2, null);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public SplashPage getSplashPage() {
        String string2;
        SplashPage.Creative.DrawableWithUnscaledText drawableWithUnscaledText = new SplashPage.Creative.DrawableWithUnscaledText(C24704R.drawable.svg_market_data_error);
        String string3 = getString(C24704R.string.exercise_market_data_error_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        if (isUk()) {
            string2 = getString(C24704R.string.exercise_market_data_error_description_gb);
        } else {
            string2 = getString(C24704R.string.exercise_market_data_error_description);
        }
        String str = string2;
        Intrinsics.checkNotNull(str);
        return new SplashPage(drawableWithUnscaledText, null, string3, str, null, null, 50, null);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public Integer getPrimaryButtonLabelRes() {
        return Integer.valueOf(this.primaryButtonLabelRes);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public void onPrimaryButtonClicked() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Navigators3.showContactSupportTriageFragment$default(getNavigator(), fragmentActivityRequireActivity, null, false, 6, null);
        fragmentActivityRequireActivity.finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* compiled from: OptionExerciseMarketDataErrorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/error/OptionExerciseMarketDataErrorFragment$Companion;", "", "<init>", "()V", "ARG_IS_UK", "", "newInstance", "Lcom/robinhood/android/optionsexercise/error/OptionExerciseMarketDataErrorFragment;", OptionExerciseMarketDataErrorFragment.ARG_IS_UK, "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionExerciseMarketDataErrorFragment newInstance(boolean isUk) {
            OptionExerciseMarketDataErrorFragment optionExerciseMarketDataErrorFragment = new OptionExerciseMarketDataErrorFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(OptionExerciseMarketDataErrorFragment.ARG_IS_UK, isUk);
            optionExerciseMarketDataErrorFragment.setArguments(bundle);
            return optionExerciseMarketDataErrorFragment;
        }
    }
}
