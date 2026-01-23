package com.robinhood.android.common.options.upsell.plchart;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.databinding.FragmentProfitAndLossEducationBinding;
import com.robinhood.android.common.options.extensions.Analytics3;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import io.noties.markwon.Markwon;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ProfitAndLossChartEducationFragment.kt */
@Metadata(m3635d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\"\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u001a\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0014\u0010-\u001a\u00020%*\u00020.2\u0006\u0010/\u001a\u000200H\u0002J\t\u00101\u001a\u000202H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/plchart/ProfitAndLossChartEducationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "getBrokerageResourceManager", "()Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "setBrokerageResourceManager", "(Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "binding", "Lcom/robinhood/android/common/options/databinding/FragmentProfitAndLossEducationBinding;", "getBinding", "()Lcom/robinhood/android/common/options/databinding/FragmentProfitAndLossEducationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "fontAssetDelegate", "com/robinhood/android/common/options/upsell/plchart/ProfitAndLossChartEducationFragment$fontAssetDelegate$1", "Lcom/robinhood/android/common/options/upsell/plchart/ProfitAndLossChartEducationFragment$fontAssetDelegate$1;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setAnimation", "Lcom/airbnb/lottie/LottieAnimationView;", "overlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ProfitAndLossChartEducationFragment extends BaseFragment implements RegionGated {
    private static final String SCREEN_NAME = "options_pl_learn_more";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public BrokerageResourceManager brokerageResourceManager;
    private final ProfitAndLossChartEducationFragment3 fontAssetDelegate;
    public Markwon markwon;
    private final String screenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ProfitAndLossChartEducationFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/options/databinding/FragmentProfitAndLossEducationBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ProfitAndLossChartEducationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
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

    /* JADX WARN: Type inference failed for: r0v5, types: [com.robinhood.android.common.options.upsell.plchart.ProfitAndLossChartEducationFragment$fontAssetDelegate$1] */
    public ProfitAndLossChartEducationFragment() {
        super(C11303R.layout.fragment_profit_and_loss_education);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.screenName = SCREEN_NAME;
        this.binding = ViewBinding5.viewBinding(this, ProfitAndLossChartEducationFragment2.INSTANCE);
        this.fontAssetDelegate = new FontAssetDelegate() { // from class: com.robinhood.android.common.options.upsell.plchart.ProfitAndLossChartEducationFragment$fontAssetDelegate$1
            @Override // com.airbnb.lottie.FontAssetDelegate
            public Typeface fetchFont(String fontFamily) {
                if (!Intrinsics.areEqual(fontFamily, "Capsule Sans Text")) {
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(fontFamily);
                    throw new ExceptionsH();
                }
                int i = C16915R.font.capsule_sans_text_book;
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                return ContextsUiExtensions.requireFont(contextRequireContext, i);
            }
        };
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final BrokerageResourceManager getBrokerageResourceManager() {
        BrokerageResourceManager brokerageResourceManager = this.brokerageResourceManager;
        if (brokerageResourceManager != null) {
            return brokerageResourceManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("brokerageResourceManager");
        return null;
    }

    public final void setBrokerageResourceManager(BrokerageResourceManager brokerageResourceManager) {
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "<set-?>");
        this.brokerageResourceManager = brokerageResourceManager;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    private final FragmentProfitAndLossEducationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentProfitAndLossEducationBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            RhTextView profitLossEducationDisclosure = getBinding().profitLossEducationDisclosure;
            Intrinsics.checkNotNullExpressionValue(profitLossEducationDisclosure, "profitLossEducationDisclosure");
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(profitLossEducationDisclosure, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        Analytics3.logScreenAppear$default(getAnalytics(), getScreenName(), null, 2, null);
        getBinding().profitLossEducationLottie.setFontAssetDelegate(this.fontAssetDelegate);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.options.upsell.plchart.ProfitAndLossChartEducationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossChartEducationFragment.onViewCreated$lambda$1(this.f$0, (DayNightOverlay) obj);
            }
        });
        Single map = getBrokerageResourceManager().loadResource(BrokerageDisclosure.OPTIONS_PROFIT_LOSS_DISCLOSURE).map(new Function() { // from class: com.robinhood.android.common.options.upsell.plchart.ProfitAndLossChartEducationFragment.onViewCreated.2
            @Override // io.reactivex.functions.Function
            public final Spanned apply(Disclosure it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Markwons.toSpanned$default(ProfitAndLossChartEducationFragment.this.getMarkwon(), it.getContent(), null, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C115093(getBinding().profitLossEducationDisclosure));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(ProfitAndLossChartEducationFragment profitAndLossChartEducationFragment, DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        LottieAnimationView profitLossEducationLottie = profitAndLossChartEducationFragment.getBinding().profitLossEducationLottie;
        Intrinsics.checkNotNullExpressionValue(profitLossEducationLottie, "profitLossEducationLottie");
        profitAndLossChartEducationFragment.setAnimation(profitLossEducationLottie, overlay);
        return Unit.INSTANCE;
    }

    /* compiled from: ProfitAndLossChartEducationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.upsell.plchart.ProfitAndLossChartEducationFragment$onViewCreated$3 */
    /* synthetic */ class C115093 extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        C115093(Object obj) {
            super(1, obj, RhTextView.class, "setText", "setText(Ljava/lang/CharSequence;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            ((RhTextView) this.receiver).setText(charSequence);
        }
    }

    private final void setAnimation(LottieAnimationView lottieAnimationView, DayNightOverlay dayNightOverlay) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
        if (i2 == 1) {
            i = C11303R.raw.lottie_profit_loss_learn_more_day;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C11303R.raw.lottie_profit_loss_learn_more_night;
        }
        lottieAnimationView.setAnimation(i);
        lottieAnimationView.playAnimation();
    }

    /* compiled from: ProfitAndLossChartEducationFragment.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/plchart/ProfitAndLossChartEducationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OptionsProfitLossChartEducation;", "<init>", "()V", "SCREEN_NAME", "", "createFragment", "Lcom/robinhood/android/common/options/upsell/plchart/ProfitAndLossChartEducationFragment;", "key", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.OptionsProfitLossChartEducation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public ProfitAndLossChartEducationFragment createFragment(LegacyFragmentKey.OptionsProfitLossChartEducation key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new ProfitAndLossChartEducationFragment();
        }

        public final Intent getIntent(Context context, Navigator navigator) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, LegacyFragmentKey.OptionsProfitLossChartEducation.INSTANCE, false, false, false, null, false, true, false, false, false, null, false, 8052, null);
        }
    }
}
