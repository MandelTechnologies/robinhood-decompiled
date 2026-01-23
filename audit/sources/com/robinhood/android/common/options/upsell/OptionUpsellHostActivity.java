package com.robinhood.android.common.options.upsell;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.upsell.OptionSettingsConfirmationFragment;
import com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingFragment;
import com.robinhood.android.common.options.upsell.alert.OptionAlertRetirementOnboardingFragment;
import com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationRetirementUpsellFragment;
import com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.accounts.MultipleIndividualAccountsExperiment3;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.options.contracts.OptionAlertOnboardingSource;
import com.robinhood.android.options.contracts.OptionUpsellHost;
import com.robinhood.android.options.contracts.OptionUpsellHostLaunchMode;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: OptionUpsellHostActivity.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001(B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\t\u0010\"\u001a\u00020\u000eH\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/OptionUpsellHostActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingFragment$Callbacks;", "Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationUpsellFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "inMibOptionsEnablementExperiment", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "getInitialFragment", "Landroidx/fragment/app/Fragment;", "goToAllSetFragment", "onOptionAlertOnboardingFinished", "isFailure", "onContinueTradeOnExpiration", "getOptionsAlertsOnboarding", "Lcom/robinhood/android/common/ui/BaseFragment;", "analyticsSource", "Lcom/robinhood/android/options/contracts/OptionAlertOnboardingSource;", "getTradeOnExpirationUpsell", "getOptionsSettingsConfirmation", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionUpsellHostActivity extends BaseActivity implements OptionAlertOnboardingFragment.Callbacks, TradeOnExpirationUpsellFragment.Callbacks, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public ExperimentsStore experimentsStore;
    private boolean inMibOptionsEnablementExperiment;

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

    public OptionUpsellHostActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C114721(null));
        if (!((OptionUpsellHost) INSTANCE.getExtras((Activity) this)).getIsRetirement()) {
            getWindow().getDecorView().setBackgroundTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(this, C13997R.attr.paletteColorStratos)));
            ScarletManager2.getScarletManager(this).putOverlay(OptionUpsellOverlay.INSTANCE, Boolean.FALSE);
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, getInitialFragment());
        }
    }

    /* compiled from: OptionUpsellHostActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.upsell.OptionUpsellHostActivity$onCreate$1", m3645f = "OptionUpsellHostActivity.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.upsell.OptionUpsellHostActivity$onCreate$1 */
    static final class C114721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C114721(Continuation<? super C114721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionUpsellHostActivity.this.new C114721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(OptionUpsellHostActivity.this.getExperimentsStore(), new Experiment[]{MultipleIndividualAccountsExperiment3.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionUpsellHostActivity.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionUpsellHostActivity.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.upsell.OptionUpsellHostActivity$onCreate$1$1", m3645f = "OptionUpsellHostActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.upsell.OptionUpsellHostActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionUpsellHostActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionUpsellHostActivity optionUpsellHostActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionUpsellHostActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.inMibOptionsEnablementExperiment = this.Z$0;
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        toolbar.setUseDesignSystemTheme(true);
        toolbar.setBackgroundColor(0);
    }

    private final Fragment getInitialFragment() {
        OptionUpsellHostLaunchMode launchMode = ((OptionUpsellHost) INSTANCE.getExtras((Activity) this)).getLaunchMode();
        if (launchMode instanceof OptionUpsellHostLaunchMode.AlertOnboarding) {
            return getOptionsAlertsOnboarding(((OptionUpsellHostLaunchMode.AlertOnboarding) launchMode).getAnalyticsSource());
        }
        if (launchMode instanceof OptionUpsellHostLaunchMode.AlertOnboardingThenTradeOnExpiration) {
            return getOptionsAlertsOnboarding(((OptionUpsellHostLaunchMode.AlertOnboardingThenTradeOnExpiration) launchMode).getAlertOnboardingAnalyticsSource());
        }
        if (launchMode instanceof OptionUpsellHostLaunchMode.TradeOnExpiration) {
            return getTradeOnExpirationUpsell();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void goToAllSetFragment() {
        replaceFragment(getOptionsSettingsConfirmation());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
        }
    }

    @Override // com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingFragment.Callbacks
    public void onOptionAlertOnboardingFinished(boolean isFailure) {
        if (((OptionUpsellHost) INSTANCE.getExtras((Activity) this)).getLaunchMode() instanceof OptionUpsellHostLaunchMode.AlertOnboardingThenTradeOnExpiration) {
            replaceFragment(getTradeOnExpirationUpsell());
        } else if (isFailure) {
            setResult(-1);
            finish();
        } else {
            goToAllSetFragment();
        }
    }

    @Override // com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment.Callbacks
    public void onContinueTradeOnExpiration() {
        goToAllSetFragment();
    }

    private final BaseFragment getOptionsAlertsOnboarding(OptionAlertOnboardingSource analyticsSource) {
        Companion companion = INSTANCE;
        OptionAlertOnboardingFragment.Args args = new OptionAlertOnboardingFragment.Args(analyticsSource, ((OptionUpsellHost) companion.getExtras((Activity) this)).getEligibilitySource(), ((OptionUpsellHost) companion.getExtras((Activity) this)).getRefId());
        if (((OptionUpsellHost) companion.getExtras((Activity) this)).getIsRetirement()) {
            return (BaseFragment) OptionAlertRetirementOnboardingFragment.INSTANCE.newInstance((Parcelable) args);
        }
        return (BaseFragment) OptionAlertOnboardingFragment.INSTANCE.newInstance((Parcelable) args);
    }

    private final BaseFragment getTradeOnExpirationUpsell() {
        Companion companion = INSTANCE;
        if (((OptionUpsellHost) companion.getExtras((Activity) this)).getIsRetirement()) {
            return (BaseFragment) TradeOnExpirationRetirementUpsellFragment.INSTANCE.newInstance((Parcelable) new TradeOnExpirationRetirementUpsellFragment.Args(((OptionUpsellHost) companion.getExtras((Activity) this)).getAccountNumber(), ((OptionUpsellHost) companion.getExtras((Activity) this)).getEligibilitySource(), ((OptionUpsellHost) companion.getExtras((Activity) this)).getRefId()));
        }
        return (BaseFragment) TradeOnExpirationUpsellFragment.INSTANCE.newInstance((Parcelable) new TradeOnExpirationUpsellFragment.Args(((OptionUpsellHost) companion.getExtras((Activity) this)).getAccountNumber(), ((OptionUpsellHost) companion.getExtras((Activity) this)).getEligibilitySource(), ((OptionUpsellHost) companion.getExtras((Activity) this)).getRefId()));
    }

    private final BaseFragment getOptionsSettingsConfirmation() {
        Companion companion = INSTANCE;
        OptionSettingsConfirmationFragment.Args args = new OptionSettingsConfirmationFragment.Args(((OptionUpsellHost) companion.getExtras((Activity) this)).getAccountNumber(), ((OptionUpsellHost) companion.getExtras((Activity) this)).getEligibilitySource(), ((OptionUpsellHost) companion.getExtras((Activity) this)).getRefId(), this.inMibOptionsEnablementExperiment);
        if (((OptionUpsellHost) companion.getExtras((Activity) this)).getIsRetirement()) {
            return (BaseFragment) OptionSettingsRetirementConfirmationFragment.INSTANCE.newInstance((Parcelable) args);
        }
        return (BaseFragment) OptionSettingsConfirmationFragment.INSTANCE.newInstance((Parcelable) args);
    }

    /* compiled from: OptionUpsellHostActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/OptionUpsellHostActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/common/options/upsell/OptionUpsellHostActivity;", "Lcom/robinhood/android/options/contracts/OptionUpsellHost;", "<init>", "()V", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<OptionUpsellHostActivity, OptionUpsellHost> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public OptionUpsellHost getExtras(OptionUpsellHostActivity optionUpsellHostActivity) {
            return (OptionUpsellHost) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, optionUpsellHostActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, OptionUpsellHost optionUpsellHost) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, optionUpsellHost);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, OptionUpsellHost optionUpsellHost) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, optionUpsellHost);
        }
    }
}
