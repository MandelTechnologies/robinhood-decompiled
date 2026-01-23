package com.robinhood.android.optionsexercise.assignment;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment;
import com.robinhood.android.common.onboarding.p085ui.SplashPage;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EarlyAssignmentSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0002\u001f B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentSplashFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseFullscreenInfoFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "splashPage", "Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "getSplashPage", "()Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "primaryButtonLabelRes", "", "getPrimaryButtonLabelRes", "()Ljava/lang/Integer;", "secondaryButtonLabelRes", "getSecondaryButtonLabelRes", "callbacks", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentSplashFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onPrimaryButtonClicked", "", "onSecondaryButtonClicked", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class EarlyAssignmentSplashFragment extends BaseFullscreenInfoFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EarlyAssignmentSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
    private final int primaryButtonLabelRes = C11048R.string.general_label_continue;
    private final int secondaryButtonLabelRes = C11048R.string.general_label_dont_show_this_again;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentSplashFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: EarlyAssignmentSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentSplashFragment$Callbacks;", "", "onContinueAssignmentSplash", "", "neverShowAgain", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueAssignmentSplash(boolean neverShowAgain);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public SplashPage getSplashPage() {
        SplashPage.Creative.DrawableWithUnscaledText drawableWithUnscaledText = new SplashPage.Creative.DrawableWithUnscaledText(C24704R.drawable.early_assignment_splash_svg);
        String string2 = getString(C24704R.string.early_assignment_splash_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(C24704R.string.early_assignment_splash_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new SplashPage(drawableWithUnscaledText, null, string2, string3, new Function0() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentSplashFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EarlyAssignmentSplashFragment._get_splashPage_$lambda$0(this.f$0);
            }
        }, null, 34, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_splashPage_$lambda$0(EarlyAssignmentSplashFragment earlyAssignmentSplashFragment) {
        String string2 = earlyAssignmentSplashFragment.getString(C24704R.string.exercise_splash_learn_more_url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigator navigator = earlyAssignmentSplashFragment.getNavigator();
        Context contextRequireContext = earlyAssignmentSplashFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public Integer getPrimaryButtonLabelRes() {
        return Integer.valueOf(this.primaryButtonLabelRes);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public Integer getSecondaryButtonLabelRes() {
        return Integer.valueOf(this.secondaryButtonLabelRes);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public void onPrimaryButtonClicked() {
        getCallbacks().onContinueAssignmentSplash(false);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public void onSecondaryButtonClicked() {
        getCallbacks().onContinueAssignmentSplash(true);
    }

    /* compiled from: EarlyAssignmentSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentSplashFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentSplashFragment;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EarlyAssignmentSplashFragment newInstance() {
            return new EarlyAssignmentSplashFragment();
        }
    }
}
