package com.robinhood.android.cash.merchantrewards.p073ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.merchantrewards.C10127R;
import com.robinhood.android.cash.merchantrewards.databinding.FragmentMerchantrewardsWelcomeBinding;
import com.robinhood.android.cash.merchantrewards.p073ui.MerchantRewardsWelcomeFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhyonboarding.contracts.RhyUpgradeKey;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.staticcontent.util.Markwons;
import io.noties.markwon.Markwon;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MerchantRewardsWelcomeFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\u001a\u00104\u001a\u0002012\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u000201H\u0016J\b\u0010:\u001a\u000201H\u0016J\t\u0010;\u001a\u00020\u0006H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "excludeFromSourceLogging", "getExcludeFromSourceLogging", "excludeFromAnalyticsLogging", "getExcludeFromAnalyticsLogging", "binding", "Lcom/robinhood/android/cash/merchantrewards/databinding/FragmentMerchantrewardsWelcomeBinding;", "getBinding", "()Lcom/robinhood/android/cash/merchantrewards/databinding/FragmentMerchantrewardsWelcomeBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "duxo", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragmentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "merchantRewardWelcomePref", "Lcom/robinhood/prefs/BooleanPreference;", "getMerchantRewardWelcomePref", "()Lcom/robinhood/prefs/BooleanPreference;", "setMerchantRewardWelcomePref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MerchantRewardsWelcomeFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final boolean excludeFromAnalyticsLogging;
    private final boolean excludeFromSourceLogging;
    private final Context loggingContext;
    private final Screen loggingScreen;
    public Markwon markwon;

    @MerchantRewardWelcomePref
    public BooleanPreference merchantRewardWelcomePref;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MerchantRewardsWelcomeFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/merchantrewards/databinding/FragmentMerchantrewardsWelcomeBinding;", 0))};

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

    /* JADX WARN: Multi-variable type inference failed */
    public MerchantRewardsWelcomeFragment() {
        super(C10127R.layout.fragment_merchantrewards_welcome);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.excludeFromSourceLogging = true;
        this.excludeFromAnalyticsLogging = true;
        this.binding = ViewBinding5.viewBinding(this, MerchantRewardsWelcomeFragment2.INSTANCE);
        this.loggingScreen = new Screen(Screen.Name.MERCHANT_REWARDS_INTRO, null, null, null, 14, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        this.loggingContext = new Context(0, 0, 0, null, objArr2, objArr3, objArr4, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RHYContext(RHYContext.ProductArea.REWARDS, "merchant_rewards_intro", "unknown", objArr, null, null, 56, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2049, -1, -1, -1, 16383, null);
        this.duxo = DuxosKt.duxo(this, MerchantRewardsWelcomeFragmentDuxo.class);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromSourceLogging() {
        return this.excludeFromSourceLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentMerchantrewardsWelcomeBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMerchantrewardsWelcomeBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MerchantRewardsWelcomeFragmentDuxo getDuxo() {
        return (MerchantRewardsWelcomeFragmentDuxo) this.duxo.getValue();
    }

    public final BooleanPreference getMerchantRewardWelcomePref() {
        BooleanPreference booleanPreference = this.merchantRewardWelcomePref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("merchantRewardWelcomePref");
        return null;
    }

    public final void setMerchantRewardWelcomePref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.merchantRewardWelcomePref = booleanPreference;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(getScarletManager(), MerchantRewardsOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getMerchantRewardWelcomePref().set(false);
        BaseFragment.collectDuxoState$default(this, null, new C101701(null), 1, null);
    }

    /* compiled from: MerchantRewardsWelcomeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragment$onViewCreated$1", m3645f = "MerchantRewardsWelcomeFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragment$onViewCreated$1 */
    static final class C101701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C101701(Continuation<? super C101701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MerchantRewardsWelcomeFragment.this.new C101701(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C101701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<MerchantRewardsWelcomeFragmentViewState> stateFlow = MerchantRewardsWelcomeFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MerchantRewardsWelcomeFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* compiled from: MerchantRewardsWelcomeFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ MerchantRewardsWelcomeFragment this$0;

            AnonymousClass1(MerchantRewardsWelcomeFragment merchantRewardsWelcomeFragment) {
                this.this$0 = merchantRewardsWelcomeFragment;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((MerchantRewardsWelcomeFragmentViewState) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(MerchantRewardsWelcomeFragmentViewState merchantRewardsWelcomeFragmentViewState, Continuation<? super Unit> continuation) {
                ShimmerLoadingView rewardsOnboardingSplashLoading = this.this$0.getBinding().rewardsOnboardingSplashLoading;
                Intrinsics.checkNotNullExpressionValue(rewardsOnboardingSplashLoading, "rewardsOnboardingSplashLoading");
                rewardsOnboardingSplashLoading.setVisibility(merchantRewardsWelcomeFragmentViewState.isLoadingVisible() ? 0 : 8);
                if (!Intrinsics.areEqual(merchantRewardsWelcomeFragmentViewState.getShouldShowRhyUpsell(), boxing.boxBoolean(true))) {
                    RdsButtonBarView rdsButtonBarView = this.this$0.getBinding().bottomButtonBar;
                    final MerchantRewardsWelcomeFragment merchantRewardsWelcomeFragment = this.this$0;
                    rdsButtonBarView.setPrimaryButtonText(merchantRewardsWelcomeFragment.getString(C11048R.string.general_label_continue));
                    rdsButtonBarView.onPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragment$onViewCreated$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MerchantRewardsWelcomeFragment.C101701.AnonymousClass1.emit$lambda$6$lambda$5(merchantRewardsWelcomeFragment);
                        }
                    });
                } else {
                    String welcomeTitle = merchantRewardsWelcomeFragmentViewState.getWelcomeTitle();
                    if (welcomeTitle != null) {
                        this.this$0.getBinding().rewardsOnboardingConfirmationTitle.setText(welcomeTitle);
                    }
                    MarkdownContent welcomeBody = merchantRewardsWelcomeFragmentViewState.getWelcomeBody();
                    if (welcomeBody != null) {
                        MerchantRewardsWelcomeFragment merchantRewardsWelcomeFragment2 = this.this$0;
                        merchantRewardsWelcomeFragment2.getBinding().rewardsOnboardingConfirmationDescription.setText(Markwons.toSpanned$default(merchantRewardsWelcomeFragment2.getMarkwon(), welcomeBody, null, 2, null));
                    }
                    RdsButtonBarView rdsButtonBarView2 = this.this$0.getBinding().bottomButtonBar;
                    final MerchantRewardsWelcomeFragment merchantRewardsWelcomeFragment3 = this.this$0;
                    rdsButtonBarView2.setPrimaryButtonText(merchantRewardsWelcomeFragment3.getString(C10127R.string.cash_merchant_rhy_upsell_get_card));
                    rdsButtonBarView2.onPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragment$onViewCreated$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MerchantRewardsWelcomeFragment.C101701.AnonymousClass1.emit$lambda$4$lambda$2(merchantRewardsWelcomeFragment3);
                        }
                    });
                    rdsButtonBarView2.setSecondaryButtonText(merchantRewardsWelcomeFragment3.getString(C10127R.string.cash_merchant_rhy_upsell_view_offers));
                    rdsButtonBarView2.onSecondaryButtonClick(new Function0() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsWelcomeFragment$onViewCreated$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MerchantRewardsWelcomeFragment.C101701.AnonymousClass1.emit$lambda$4$lambda$3(merchantRewardsWelcomeFragment3);
                        }
                    });
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public static final Unit emit$lambda$4$lambda$2(MerchantRewardsWelcomeFragment merchantRewardsWelcomeFragment) {
                Navigator navigator = merchantRewardsWelcomeFragment.getNavigator();
                android.content.Context contextRequireContext = merchantRewardsWelcomeFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RhyUpgradeKey(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), null, false, null, null, 60, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit emit$lambda$4$lambda$3(MerchantRewardsWelcomeFragment merchantRewardsWelcomeFragment) {
                EventLogger.DefaultImpls.logTap$default(merchantRewardsWelcomeFragment.getEventLogger(), UserInteractionEventData.Action.CONTINUE, merchantRewardsWelcomeFragment.loggingScreen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
                Companion companion = MerchantRewardsWelcomeFragment.INSTANCE;
                if (!((LegacyFragmentKey.RhyMerchantRewardsWelcome) companion.getArgs((Fragment) merchantRewardsWelcomeFragment)).getFromOverviewPage()) {
                    Navigator navigator = merchantRewardsWelcomeFragment.getNavigator();
                    android.content.Context contextRequireContext = merchantRewardsWelcomeFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.RhyMerchantRewardsOverview(((LegacyFragmentKey.RhyMerchantRewardsWelcome) companion.getArgs((Fragment) merchantRewardsWelcomeFragment)).getOfferId()), false, false, false, null, false, null, false, false, null, null, 4092, null);
                }
                merchantRewardsWelcomeFragment.requireActivity().finish();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit emit$lambda$6$lambda$5(MerchantRewardsWelcomeFragment merchantRewardsWelcomeFragment) {
                EventLogger.DefaultImpls.logTap$default(merchantRewardsWelcomeFragment.getEventLogger(), UserInteractionEventData.Action.CONTINUE, merchantRewardsWelcomeFragment.loggingScreen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
                Companion companion = MerchantRewardsWelcomeFragment.INSTANCE;
                if (!((LegacyFragmentKey.RhyMerchantRewardsWelcome) companion.getArgs((Fragment) merchantRewardsWelcomeFragment)).getFromOverviewPage()) {
                    Navigator navigator = merchantRewardsWelcomeFragment.getNavigator();
                    android.content.Context contextRequireContext = merchantRewardsWelcomeFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.RhyMerchantRewardsOverview(((LegacyFragmentKey.RhyMerchantRewardsWelcome) companion.getArgs((Fragment) merchantRewardsWelcomeFragment)).getOfferId()), false, false, false, null, false, null, false, false, null, null, 4092, null);
                }
                merchantRewardsWelcomeFragment.requireActivity().finish();
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, this.loggingScreen, null, null, this.loggingContext, 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logScreenDisappear$default(getEventLogger(), null, this.loggingScreen, null, null, this.loggingContext, 13, null);
    }

    /* compiled from: MerchantRewardsWelcomeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsWelcomeFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyMerchantRewardsWelcome;", "<init>", "()V", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<MerchantRewardsWelcomeFragment, LegacyFragmentKey.RhyMerchantRewardsWelcome> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.RhyMerchantRewardsWelcome rhyMerchantRewardsWelcome) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, rhyMerchantRewardsWelcome);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.RhyMerchantRewardsWelcome getArgs(MerchantRewardsWelcomeFragment merchantRewardsWelcomeFragment) {
            return (LegacyFragmentKey.RhyMerchantRewardsWelcome) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, merchantRewardsWelcomeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MerchantRewardsWelcomeFragment newInstance(LegacyFragmentKey.RhyMerchantRewardsWelcome rhyMerchantRewardsWelcome) {
            return (MerchantRewardsWelcomeFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, rhyMerchantRewardsWelcome);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MerchantRewardsWelcomeFragment merchantRewardsWelcomeFragment, LegacyFragmentKey.RhyMerchantRewardsWelcome rhyMerchantRewardsWelcome) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, merchantRewardsWelcomeFragment, rhyMerchantRewardsWelcome);
        }
    }
}
