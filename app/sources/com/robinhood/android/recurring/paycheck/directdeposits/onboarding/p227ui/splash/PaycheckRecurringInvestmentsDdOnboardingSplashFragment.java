package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.splash;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.directdeposit.DirectDepositConstants;
import com.robinhood.android.common.directdeposit.DirectDepositSource;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.C26245R;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.databinding.FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.utils.extensions.Intents;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003QRSB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020,H\u0016J\u001a\u00100\u001a\u00020,2\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020,2\u0006\u00108\u001a\u000209H\u0016J1\u0010:\u001a\u00020,2\b\b\u0002\u0010;\u001a\u00020<2\u0018\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020@0?0>H\u0003¢\u0006\u0002\u0010AJ=\u0010B\u001a\u00020,2\b\b\u0002\u0010;\u001a\u00020<2\b\u0010C\u001a\u0004\u0018\u00010@2\b\u0010D\u001a\u0004\u0018\u00010E2\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010GH\u0003¢\u0006\u0002\u0010HJ\u0010\u0010I\u001a\u00020,2\u0006\u0010C\u001a\u00020JH\u0002J\t\u0010K\u001a\u000206H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b$\u0010%R\u001c\u0010'\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010)0)0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MX\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006T²\u0006\n\u0010U\u001a\u00020VX\u008a\u0084\u0002²\u0006\n\u0010U\u001a\u00020VX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "paycheckInvestmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;", "getPaycheckInvestmentScheduleStore", "()Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;", "setPaycheckInvestmentScheduleStore", "(Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;)V", "duxo", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashDuxo;", "getDuxo", "()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/databinding/FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding;", "getBinding", "()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/databinding/FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashFragment$Callbacks;", "callbacks$delegate", "directDepositLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onAttach", "", "context", "Landroid/content/Context;", "onDetach", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Bullets", "modifier", "Landroidx/compose/ui/Modifier;", "bullets", "", "Lkotlin/Pair;", "Lcom/robinhood/utils/resource/StringResource;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "Disclosure", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "disclosureLeadingIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "showDisclosureSheet", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-recurring-paycheck-dd-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PaycheckRecurringInvestmentsDdOnboardingSplashFragment extends BaseFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final ActivityResultLauncher<Intent> directDepositLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    public PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PaycheckRecurringInvestmentsDdOnboardingSplashFragment.class, "binding", "getBinding()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/databinding/FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding;", 0)), Reflection.property1(new PropertyReference1Impl(PaycheckRecurringInvestmentsDdOnboardingSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashFragment$Callbacks;", "", "onSetUpDirectDeposits", "", "directDepositSource", "Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "onContinuePastSplashScreen", "skipDirectDepositRelationshipSelection", "", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinuePastSplashScreen(boolean skipDirectDepositRelationshipSelection);

        void onSetUpDirectDeposits(DirectDepositSource directDepositSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Bullets$lambda$14(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment, Modifier modifier, List list, int i, int i2, Composer composer, int i3) {
        paycheckRecurringInvestmentsDdOnboardingSplashFragment.Bullets(modifier, list, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Disclosure$lambda$20(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment, Modifier modifier, StringResource stringResource, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Function0 function0, int i, int i2, Composer composer, int i3) {
        paycheckRecurringInvestmentsDdOnboardingSplashFragment.Disclosure(modifier, stringResource, serverToBentoAssetMapper2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public PaycheckRecurringInvestmentsDdOnboardingSplashFragment() {
        super(C26245R.layout.fragment_paycheck_recurring_investments_dd_onboarding_splash);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.eventScreen = new Screen(Screen.Name.SYP_LEARN_MORE, null, null, null, 14, null);
        this.duxo = DuxosKt.duxo(this, PaycheckRecurringInvestmentsDdOnboardingSplashDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, PaycheckRecurringInvestmentsDdOnboardingSplashFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$directDepositLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Callbacks callbacks = this.this$0.getCallbacks();
                    Intent data = result.getData();
                    Intrinsics.checkNotNull(data);
                    callbacks.onSetUpDirectDeposits((DirectDepositSource) Intents.getSerializable(data, DirectDepositConstants.directDepositTypeResultKey));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.directDepositLauncher = activityResultLauncherRegisterForActivityResult;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
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

    public final PaycheckInvestmentScheduleStore getPaycheckInvestmentScheduleStore() {
        PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore = this.paycheckInvestmentScheduleStore;
        if (paycheckInvestmentScheduleStore != null) {
            return paycheckInvestmentScheduleStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paycheckInvestmentScheduleStore");
        return null;
    }

    public final void setPaycheckInvestmentScheduleStore(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore) {
        Intrinsics.checkNotNullParameter(paycheckInvestmentScheduleStore, "<set-?>");
        this.paycheckInvestmentScheduleStore = paycheckInvestmentScheduleStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaycheckRecurringInvestmentsDdOnboardingSplashDuxo getDuxo() {
        return (PaycheckRecurringInvestmentsDdOnboardingSplashDuxo) this.duxo.getValue();
    }

    private final FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        ScarletManager.removeOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE.getPriority(), null, 2, null);
        super.onDetach();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, null, 29, null);
        getPaycheckInvestmentScheduleStore().refresh(false);
        FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding binding = getBinding();
        RhTextView paycheckRecurringInvestmentDisclosureCta = binding.paycheckRecurringInvestmentDisclosureCta;
        Intrinsics.checkNotNullExpressionValue(paycheckRecurringInvestmentDisclosureCta, "paycheckRecurringInvestmentDisclosureCta");
        OnClickListeners.onClick(paycheckRecurringInvestmentDisclosureCta, new Function0() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated$lambda$10$lambda$0(this.f$0);
            }
        });
        RdsButton rdsButton = binding.setUpDdButton;
        Intrinsics.checkNotNull(rdsButton);
        Companion companion = INSTANCE;
        rdsButton.setVisibility(!((Args) companion.getArgs((Fragment) this)).getHasDirectDepositRelationships() ? 0 : 8);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated$lambda$10$lambda$3$lambda$1(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated$lambda$10$lambda$3$lambda$2(this.f$0);
            }
        });
        RdsButton rdsButton2 = binding.alreadySetUpDdButton;
        Intrinsics.checkNotNull(rdsButton2);
        rdsButton2.setVisibility(!((Args) companion.getArgs((Fragment) this)).getHasDirectDepositRelationships() ? 0 : 8);
        ViewsKt.eventData$default(rdsButton2, false, new Function0() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated$lambda$10$lambda$6$lambda$4(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated$lambda$10$lambda$6$lambda$5(this.f$0);
            }
        });
        RdsButton rdsButton3 = binding.continueButton;
        Intrinsics.checkNotNull(rdsButton3);
        rdsButton3.setVisibility(((Args) companion.getArgs((Fragment) this)).getHasDirectDepositRelationships() ? 0 : 8);
        ViewsKt.eventData$default(rdsButton3, false, new Function0() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated$lambda$10$lambda$9$lambda$7(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton3, new Function0() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated$lambda$10$lambda$9$lambda$8(this.f$0);
            }
        });
        binding.paycheckRecurringSteps.setContent(ComposableLambda3.composableLambdaInstance(-1981850376, true, new PaycheckRecurringInvestmentsDdOnboardingSplashFragment4(this)));
        binding.paycheckRecurringDisclosure.setContent(ComposableLambda3.composableLambdaInstance(1908484591, true, new PaycheckRecurringInvestmentsDdOnboardingSplashFragment5(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10$lambda$0(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = paycheckRecurringInvestmentsDdOnboardingSplashFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder message = companion.create(contextRequireContext).setId(C26245R.id.dialog_id_paycheck_recurring_investment_disclosure).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setMessage(C26245R.string.paycheck_investment_disclosure, new Object[0]);
        FragmentManager parentFragmentManager = paycheckRecurringInvestmentsDdOnboardingSplashFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, parentFragmentManager, "paycheckRecurringInvestmentDisclosure", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$10$lambda$3$lambda$1(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment) {
        return new UserInteractionEventDescriptor(null, paycheckRecurringInvestmentsDdOnboardingSplashFragment.getEventScreen(), UserInteractionEventData.Action.SET_UP_DIRECT_DEPOSIT, null, null, null, 57, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10$lambda$3$lambda$2(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment) {
        Navigator navigator = paycheckRecurringInvestmentsDdOnboardingSplashFragment.getNavigator();
        android.content.Context contextRequireContext = paycheckRecurringInvestmentsDdOnboardingSplashFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        paycheckRecurringInvestmentsDdOnboardingSplashFragment.directDepositLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new DirectDepositShimKey(false, false, false, true, false, false, false, false, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null), null, false, 12, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$10$lambda$6$lambda$4(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment) {
        return new UserInteractionEventDescriptor(null, paycheckRecurringInvestmentsDdOnboardingSplashFragment.getEventScreen(), UserInteractionEventData.Action.ALREADY_SET_UP_DIRECT_DEPOSIT, null, null, null, 57, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10$lambda$6$lambda$5(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment) {
        paycheckRecurringInvestmentsDdOnboardingSplashFragment.getCallbacks().onContinuePastSplashScreen(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$10$lambda$9$lambda$7(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment) {
        return new UserInteractionEventDescriptor(null, paycheckRecurringInvestmentsDdOnboardingSplashFragment.getEventScreen(), UserInteractionEventData.Action.CONTINUE, null, null, null, 57, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10$lambda$9$lambda$8(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment) {
        paycheckRecurringInvestmentsDdOnboardingSplashFragment.getCallbacks().onContinuePastSplashScreen(false);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.ALREADY_SET_UP_DIRECT_DEPOSIT, getEventScreen(), null, null, null, false, 60, null);
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setBackgroundColor(0);
        toolbar.setBackgroundAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Bullets(Modifier modifier, final List<? extends Tuples2<? extends StringResource, ? extends StringResource>> list, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1752857803);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1752857803, i3, -1, "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Bullets (PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt:231)");
            }
            int i5 = 0;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1231315118);
            for (Object obj : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Tuples2 tuples2 = (Tuples2) obj;
                StringResource stringResource = (StringResource) tuples2.getFirst();
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String string2 = stringResource.getText(resources).toString();
                StringResource stringResource2 = (StringResource) tuples2.getSecond();
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                BentoValuePropRow3.BentoValuePropRow(string2, stringResource2.getText(resources2).toString(), new BentoValuePropRow2.Number(i6), BentoValuePropRow.Center, (Modifier) null, composerStartRestartGroup, (BentoValuePropRow2.Number.$stable << 6) | 3072, 16);
                i5 = i6;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Bullets$lambda$14(this.f$0, modifier2, list, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Disclosure(Modifier modifier, final StringResource stringResource, final ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Function0<Unit> function02;
        Modifier modifier3;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1149850661);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(serverToBentoAssetMapper2 == null ? -1 : serverToBentoAssetMapper2.ordinal()) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    final Function0<Unit> function04 = i5 == 0 ? null : function02;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1149850661, i3, -1, "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Disclosure (PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt:252)");
                    }
                    if (stringResource != null) {
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean z = (i3 & 7168) == 2048;
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Disclosure$lambda$19$lambda$16$lambda$15(function04);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null);
                        modifier3 = modifier4;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-400563912);
                        if (serverToBentoAssetMapper2 != null) {
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper2), null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM());
                        Resources resources = getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        BentoText2.m20747BentoText38GnDrw(stringResource.getText(resources).toString(), modifierM5142padding3ABfNKs, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    function03 = function04;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function03 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Disclosure$lambda$20(this.f$0, modifier2, stringResource, serverToBentoAssetMapper2, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            if ((i3 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (stringResource != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
                function03 = function04;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Disclosure$lambda$19$lambda$16$lambda$15(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDisclosureSheet(DisclosureContent disclosure) {
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(C26245R.id.dialog_id_paycheck_recurring_investment_limitations_disclosure, disclosure.getTitle(), null, disclosure.getContent(), null, disclosure.getButton(), null, null, null, false, false, null, null, 8388611, false, true, false, false, null, null, null, 2056148, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "sypRetirementDisclosureBottomSheet");
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashFragment$Args;", "Landroid/os/Parcelable;", "hasDirectDepositRelationships", "", "<init>", "(Z)V", "getHasDirectDepositRelationships", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean hasDirectDepositRelationships;

        /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args() {
            this(false, 1, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.hasDirectDepositRelationships ? 1 : 0);
        }

        public Args(boolean z) {
            this.hasDirectDepositRelationships = z;
        }

        public /* synthetic */ Args(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getHasDirectDepositRelationships() {
            return this.hasDirectDepositRelationships;
        }
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashFragment;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashFragment$Args;", "<init>", "()V", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PaycheckRecurringInvestmentsDdOnboardingSplashFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, paycheckRecurringInvestmentsDdOnboardingSplashFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PaycheckRecurringInvestmentsDdOnboardingSplashFragment newInstance(Args args) {
            return (PaycheckRecurringInvestmentsDdOnboardingSplashFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, paycheckRecurringInvestmentsDdOnboardingSplashFragment, args);
        }
    }
}
