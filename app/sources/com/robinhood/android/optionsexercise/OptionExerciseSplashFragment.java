package com.robinhood.android.optionsexercise;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment;
import com.robinhood.android.common.onboarding.p085ui.SplashPage;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: OptionExerciseSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0002()B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\t\u0010\"\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseSplashFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseFullscreenInfoFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", OptionExerciseSplashFragment.ARG_CONTRACT_TYPE, "Lcom/robinhood/models/db/OptionContractType;", "getContractType", "()Lcom/robinhood/models/db/OptionContractType;", "contractType$delegate", "Lkotlin/Lazy;", OptionExerciseSplashFragment.ARG_ETF_ENABLED, "", "()Z", "isEtfEnabled$delegate", "splashPage", "Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "getSplashPage", "()Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "primaryButtonLabelRes", "", "getPrimaryButtonLabelRes", "()Ljava/lang/Integer;", "secondaryButtonLabelRes", "getSecondaryButtonLabelRes", "callbacks", "Lcom/robinhood/android/optionsexercise/OptionExerciseSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionsexercise/OptionExerciseSplashFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onPrimaryButtonClicked", "", "onSecondaryButtonClicked", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionExerciseSplashFragment extends BaseFullscreenInfoFragment implements RegionGated {
    private static final String ARG_CONTRACT_TYPE = "contractType";
    private static final String ARG_ETF_ENABLED = "isEtfEnabled";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionExerciseSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsexercise/OptionExerciseSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: contractType$delegate, reason: from kotlin metadata */
    private final Lazy contractType = Fragments2.argument(this, ARG_CONTRACT_TYPE);

    /* renamed from: isEtfEnabled$delegate, reason: from kotlin metadata */
    private final Lazy isEtfEnabled = Fragments2.argument(this, ARG_ETF_ENABLED);
    private final int primaryButtonLabelRes = C11048R.string.general_label_continue;
    private final int secondaryButtonLabelRes = C11048R.string.general_label_dont_show_this_again;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsexercise.OptionExerciseSplashFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: OptionExerciseSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseSplashFragment$Callbacks;", "", "onContinueExerciseSplash", "", "neverShowAgain", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueExerciseSplash(boolean neverShowAgain);
    }

    /* compiled from: OptionExerciseSplashFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    private final OptionContractType getContractType() {
        return (OptionContractType) this.contractType.getValue();
    }

    private final boolean isEtfEnabled() {
        return ((Boolean) this.isEtfEnabled.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public SplashPage getSplashPage() {
        int i;
        SplashPage.Creative.DrawableWithUnscaledText drawableWithUnscaledText = new SplashPage.Creative.DrawableWithUnscaledText(C24704R.drawable.option_exercise_splash);
        String string2 = getString(C24704R.string.exercise_splash_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i2 = WhenMappings.$EnumSwitchMapping$0[getContractType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (isEtfEnabled()) {
                i = C24704R.string.exercise_splash_description_put;
            } else {
                i = C24704R.string.exercise_splash_description_put_without_etf;
            }
        } else if (isEtfEnabled()) {
            i = C24704R.string.exercise_splash_description_call;
        } else {
            i = C24704R.string.exercise_splash_description_call_without_etf;
        }
        String string3 = getString(i);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new SplashPage(drawableWithUnscaledText, null, string2, string3, new Function0() { // from class: com.robinhood.android.optionsexercise.OptionExerciseSplashFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionExerciseSplashFragment._get_splashPage_$lambda$0(this.f$0);
            }
        }, null, 34, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_splashPage_$lambda$0(OptionExerciseSplashFragment optionExerciseSplashFragment) {
        String string2 = optionExerciseSplashFragment.getString(C24704R.string.exercise_splash_learn_more_url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigator navigator = optionExerciseSplashFragment.getNavigator();
        Context contextRequireContext = optionExerciseSplashFragment.requireContext();
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
        getCallbacks().onContinueExerciseSplash(false);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public void onSecondaryButtonClicked() {
        getCallbacks().onContinueExerciseSplash(true);
    }

    /* compiled from: OptionExerciseSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseSplashFragment$Companion;", "", "<init>", "()V", "ARG_CONTRACT_TYPE", "", "ARG_ETF_ENABLED", "newInstance", "Lcom/robinhood/android/optionsexercise/OptionExerciseSplashFragment;", OptionExerciseSplashFragment.ARG_CONTRACT_TYPE, "Lcom/robinhood/models/db/OptionContractType;", OptionExerciseSplashFragment.ARG_ETF_ENABLED, "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionExerciseSplashFragment newInstance(OptionContractType contractType, boolean isEtfEnabled) {
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            OptionExerciseSplashFragment optionExerciseSplashFragment = new OptionExerciseSplashFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(OptionExerciseSplashFragment.ARG_CONTRACT_TYPE, contractType);
            bundle.putBoolean(OptionExerciseSplashFragment.ARG_ETF_ENABLED, isEtfEnabled);
            optionExerciseSplashFragment.setArguments(bundle);
            return optionExerciseSplashFragment;
        }
    }
}
