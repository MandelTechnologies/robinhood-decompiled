package com.robinhood.android.paycheckhub.p213ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.android.paycheckhub.databinding.FragmentPaycheckHubBinding;
import com.robinhood.android.paycheckhub.p213ui.PaycheckDistributionView;
import com.robinhood.android.paycheckhub.p213ui.PaycheckHubViewState3;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.contracts.RetirementSignUp;
import com.robinhood.android.rhy.contracts.PaycheckRecurringInvestmentsOnboardingIntentKey;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.models.p320db.bonfire.PaycheckV2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.userleap.SurveyManager;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PaycheckHubFragment.kt */
@Metadata(m3635d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 c2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002bcB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J\u0012\u0010?\u001a\u00020<2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u001a\u0010B\u001a\u00020<2\u0006\u0010C\u001a\u00020D2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010E\u001a\u00020<H\u0016J\b\u0010F\u001a\u00020<H\u0016J\u0010\u0010G\u001a\u00020<2\u0006\u0010H\u001a\u00020IH\u0016J\u0018\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0014J\u0010\u0010O\u001a\u0002082\u0006\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u00020<H\u0016J\u0010\u0010S\u001a\u00020<2\u0006\u0010T\u001a\u00020UH\u0002J\u0012\u0010V\u001a\u00020<2\b\u0010W\u001a\u0004\u0018\u00010XH\u0002J\b\u0010Y\u001a\u00020<H\u0002J/\u0010Z\u001a\u00020<2\b\b\u0002\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020<0`H\u0003¢\u0006\u0002\u0010aR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u00101\u001a\u000602j\u0002`38BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u000208X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006d"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckHubFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckDistributionView$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "getRhyGlobalLoggingContext", "()Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "setRhyGlobalLoggingContext", "(Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;)V", "duxo", "Lcom/robinhood/android/paycheckhub/ui/PaycheckHubDuxo;", "getDuxo", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckHubDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/paycheckhub/databinding/FragmentPaycheckHubBinding;", "getBinding", "()Lcom/robinhood/android/paycheckhub/databinding/FragmentPaycheckHubBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/paycheckhub/ui/PaycheckHubFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckHubFragment$Callbacks;", "callbacks$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/models/db/bonfire/PaycheckV2;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventContext$delegate", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onNetDepositInfoIconClicked", "bind", "state", "Lcom/robinhood/android/paycheckhub/ui/PaycheckHubViewState;", "bindSubtitleState", "paycheckHubSubtitleState", "Lcom/robinhood/android/paycheckhub/ui/PaycheckHubSubtitleState;", "launchPaycheckRecurringInvestmentSetup", "RetirementSetUpCard", "modifier", "Landroidx/compose/ui/Modifier;", "retirementMatchRate", "Ljava/math/BigDecimal;", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/math/BigDecimal;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Callbacks", "Companion", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PaycheckHubFragment extends BaseFragment implements PaycheckDistributionView.Callbacks, AutoLoggableFragment {
    private final GenericListAdapter<RdsRowView, PaycheckV2> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: eventContext$delegate, reason: from kotlin metadata */
    private final Lazy eventContext;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    public RhyGlobalLoggingContext rhyGlobalLoggingContext;
    private final boolean useDesignSystemToolbar;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PaycheckHubFragment.class, "binding", "getBinding()Lcom/robinhood/android/paycheckhub/databinding/FragmentPaycheckHubBinding;", 0)), Reflection.property1(new PropertyReference1Impl(PaycheckHubFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/paycheckhub/ui/PaycheckHubFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PaycheckHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckHubFragment$Callbacks;", "", "onSettingsClicked", "", "onPaycheckClicked", "receivedAchTransferId", "Ljava/util/UUID;", "onManagedPaycheckRecurringInvestmentsClicked", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onManagedPaycheckRecurringInvestmentsClicked(Screen screen);

        void onPaycheckClicked(UUID receivedAchTransferId);

        void onSettingsClicked();
    }

    /* compiled from: PaycheckHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaycheckHubViewState3.ButtonAction.values().length];
            try {
                iArr[PaycheckHubViewState3.ButtonAction.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaycheckHubViewState3.ButtonAction.MANAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaycheckHubViewState3.ButtonAction.REDIRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementSetUpCard$lambda$14(PaycheckHubFragment paycheckHubFragment, Modifier modifier, BigDecimal bigDecimal, Function0 function0, int i, int i2, Composer composer, int i3) {
        paycheckHubFragment.RetirementSetUpCard(modifier, bigDecimal, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
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

    public PaycheckHubFragment() {
        super(C25434R.layout.fragment_paycheck_hub);
        this.eventScreen = new Screen(Screen.Name.PAYCHECK_HUB, null, null, null, 14, null);
        this.duxo = OldDuxos.oldDuxo(this, PaycheckHubDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, PaycheckHubFragment4.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.adapter = GenericListAdapter.INSTANCE.m2987of(RdsRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PaycheckHubFragment.adapter$lambda$1(this.f$0, (RdsRowView) obj, (PaycheckV2) obj2);
            }
        });
        this.eventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckHubFragment.eventContext_delegate$lambda$2(this.f$0);
            }
        });
        this.useDesignSystemToolbar = true;
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

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    public final RhyGlobalLoggingContext getRhyGlobalLoggingContext() {
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext;
        if (rhyGlobalLoggingContext != null) {
            return rhyGlobalLoggingContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyGlobalLoggingContext");
        return null;
    }

    public final void setRhyGlobalLoggingContext(RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "<set-?>");
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
    }

    private final PaycheckHubDuxo getDuxo() {
        return (PaycheckHubDuxo) this.duxo.getValue();
    }

    private final FragmentPaycheckHubBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPaycheckHubBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(final PaycheckHubFragment paycheckHubFragment, RdsRowView of, final PaycheckV2 paycheck) {
        int i;
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(paycheck, "paycheck");
        of.setPrimaryText(LocalDateFormatter.MEDIUM.format(paycheck.getGrantDate()));
        int i2 = C25434R.string.paycheck_row_secondary_text_format;
        String originatorName = paycheck.getOriginatorName();
        if (paycheck.isEarlyPay()) {
            i = C25434R.string.early_direct_deposit;
        } else {
            i = C25434R.string.direct_deposit;
        }
        of.setSecondaryText(paycheckHubFragment.getString(i2, originatorName, paycheckHubFragment.getString(i)));
        of.setMetadataPrimaryText(Money.format$default(Money3.toMoney(paycheck.getDollarAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckHubFragment.adapter$lambda$1$lambda$0(this.f$0, paycheck);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1$lambda$0(PaycheckHubFragment paycheckHubFragment, PaycheckV2 paycheckV2) {
        paycheckHubFragment.getCallbacks().onPaycheckClicked(paycheckV2.getReceivedAchTransferId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getEventContext() {
        return (Context) this.eventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context eventContext_delegate$lambda$2(PaycheckHubFragment paycheckHubFragment) {
        return RhyGlobalLoggingContext.eventContext$default(paycheckHubFragment.getRhyGlobalLoggingContext(), RHYContext.ProductArea.CASH_ACCOUNTS, null, null, 6, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, getEventContext(), 13, null);
        FragmentPaycheckHubBinding binding = getBinding();
        binding.paycheckDistributionView.setCallbacks(this);
        RdsButton showAllPaychecksButton = binding.showAllPaychecksButton;
        Intrinsics.checkNotNullExpressionValue(showAllPaychecksButton, "showAllPaychecksButton");
        OnClickListeners.onClick(showAllPaychecksButton, new PaycheckHubFragment5(getDuxo()));
        RdsButton setupDirectDepositButton = binding.setupDirectDepositButton;
        Intrinsics.checkNotNullExpressionValue(setupDirectDepositButton, "setupDirectDepositButton");
        OnClickListeners.onClick(setupDirectDepositButton, new Function0() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckHubFragment.onViewCreated$lambda$5$lambda$4(this.f$0);
            }
        });
        binding.paycheckRecyclerView.setAdapter(this.adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4(PaycheckHubFragment paycheckHubFragment) {
        Navigator navigator = paycheckHubFragment.getNavigator();
        android.content.Context contextRequireContext = paycheckHubFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new DirectDepositShimKey(false, false, false, false, false, false, false, false, 255, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C254481(this));
    }

    /* compiled from: PaycheckHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$onStart$1 */
    /* synthetic */ class C254481 extends FunctionReferenceImpl implements Function1<PaycheckHubViewState, Unit> {
        C254481(Object obj) {
            super(1, obj, PaycheckHubFragment.class, "bind", "bind(Lcom/robinhood/android/paycheckhub/ui/PaycheckHubViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaycheckHubViewState paycheckHubViewState) throws Resources.NotFoundException {
            invoke2(paycheckHubViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PaycheckHubViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PaycheckHubFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SurveyManager.DefaultImpls.presentSurveyIfNecessary$default(getUserLeapManager(), this, Survey.FIVE_SEC_PAYCHECK_HUB.getServerValue(), null, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(C25434R.menu.menu_paycheck_hub, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C25434R.id.action_paycheck_hub_settings) {
            getCallbacks().onSettingsClicked();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.paycheckhub.ui.PaycheckDistributionView.Callbacks
    public void onNetDepositInfoIconClicked() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setId(C25434R.id.dialog_id_paycheck_net_deposit_info).setTitle(C25434R.string.net_deposit, new Object[0]).setMessage(C25434R.string.net_deposit_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "paycheckNetDepositInfoDialog", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final PaycheckHubViewState state) throws Resources.NotFoundException {
        CharSequence text;
        FragmentPaycheckHubBinding binding = getBinding();
        binding.lastPaycheckAmount.setText(state.getLastPaycheckAmountText());
        bindSubtitleState(state.getPaycheckHubSubtitleState());
        RdsButton setupDirectDepositButton = binding.setupDirectDepositButton;
        Intrinsics.checkNotNullExpressionValue(setupDirectDepositButton, "setupDirectDepositButton");
        setupDirectDepositButton.setVisibility(state.getIsSetupDirectDepositButtonVisible() ? 0 : 8);
        Integer setupDirectDepositButtonTextRes = state.getSetupDirectDepositButtonTextRes();
        if (setupDirectDepositButtonTextRes != null) {
            binding.setupDirectDepositButton.setText(setupDirectDepositButtonTextRes.intValue());
        }
        PaycheckHubViewState3 paycheckRecurringInvestmentsContent = state.getPaycheckRecurringInvestmentsContent();
        PaycheckDistributionView paycheckDistributionView = binding.paycheckDistributionView;
        Intrinsics.checkNotNullExpressionValue(paycheckDistributionView, "paycheckDistributionView");
        paycheckDistributionView.setVisibility(paycheckRecurringInvestmentsContent.getIsPaycheckDistributionViewVisible() ? 0 : 8);
        if (paycheckRecurringInvestmentsContent instanceof PaycheckHubViewState3.PaycheckDistributionView) {
            binding.paycheckDistributionView.setPaycheck(((PaycheckHubViewState3.PaycheckDistributionView) paycheckRecurringInvestmentsContent).getPaycheck());
        }
        RdsInfoBannerView rdsInfoBannerView = binding.paycheckHubBanner;
        Intrinsics.checkNotNull(rdsInfoBannerView);
        rdsInfoBannerView.setVisibility(paycheckRecurringInvestmentsContent.getIsBannerVisible() ? 0 : 8);
        StringResource bannerText = paycheckRecurringInvestmentsContent.getBannerText();
        if (bannerText != null) {
            Resources resources = rdsInfoBannerView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = bannerText.getText(resources);
        } else {
            text = null;
        }
        rdsInfoBannerView.setText(text);
        RdsTextButton rdsTextButton = binding.paycheckRecurringInvestmentsButton;
        Intrinsics.checkNotNull(rdsTextButton);
        rdsTextButton.setVisibility(!Intrinsics.areEqual(paycheckRecurringInvestmentsContent, PaycheckHubViewState3.None.INSTANCE) ? 0 : 8);
        final PaycheckHubViewState3.ButtonAction buttonAction = paycheckRecurringInvestmentsContent.getButtonAction();
        if (buttonAction != null) {
            rdsTextButton.setText(getString(buttonAction.getLabelRes()));
            OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaycheckHubFragment.bind$lambda$11$lambda$9$lambda$8$lambda$7(buttonAction, this);
                }
            });
        }
        List<PaycheckV2> shownPaychecks = state.getShownPaychecks();
        RhTextView paycheckHistoryTitle = binding.paycheckHistoryTitle;
        Intrinsics.checkNotNullExpressionValue(paycheckHistoryTitle, "paycheckHistoryTitle");
        paycheckHistoryTitle.setVisibility(!shownPaychecks.isEmpty() ? 0 : 8);
        this.adapter.submitList(shownPaychecks);
        RdsButton showAllPaychecksButton = binding.showAllPaychecksButton;
        Intrinsics.checkNotNullExpressionValue(showAllPaychecksButton, "showAllPaychecksButton");
        showAllPaychecksButton.setVisibility(state.isShowAllPaychecksButtonVisible() ? 0 : 8);
        final ComposeView composeView = binding.setUpIraCard;
        if (state.getShowRetirementSetUpCard()) {
            Intrinsics.checkNotNull(composeView);
            if (composeView.getVisibility() != 0) {
                EventLogger.DefaultImpls.logAppear$default(getEventLogger(), UserInteractionEventData.Action.SET_UP_IRA, getEventScreen(), null, null, getEventContext(), 12, null);
            }
        }
        Intrinsics.checkNotNull(composeView);
        composeView.setVisibility(state.getShowRetirementSetUpCard() ? 0 : 8);
        composeView.setContent(ComposableLambda3.composableLambdaInstance(1133259093, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$bind$1$4$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* compiled from: PaycheckHubFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$bind$1$4$1$1 */
            static final class C254471 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ PaycheckHubViewState $state;
                final /* synthetic */ PaycheckHubFragment this$0;

                C254471(PaycheckHubFragment paycheckHubFragment, PaycheckHubViewState paycheckHubViewState) {
                    this.this$0 = paycheckHubFragment;
                    this.$state = paycheckHubViewState;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(727453283, i, -1, "com.robinhood.android.paycheckhub.ui.PaycheckHubFragment.bind.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaycheckHubFragment.kt:269)");
                    }
                    PaycheckHubFragment paycheckHubFragment = this.this$0;
                    BigDecimal retirementMatchRate = this.$state.getRetirementMatchRate();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(this.this$0);
                    final PaycheckHubFragment paycheckHubFragment2 = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0045: CONSTRUCTOR (r1v2 'objRememberedValue' java.lang.Object) = (r0v2 'paycheckHubFragment2' com.robinhood.android.paycheckhub.ui.PaycheckHubFragment A[DONT_INLINE]) A[MD:(com.robinhood.android.paycheckhub.ui.PaycheckHubFragment):void (m)] (LINE:272) call: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$bind$1$4$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.paycheckhub.ui.PaycheckHubFragment):void type: CONSTRUCTOR in method: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$bind$1$4$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes11.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$bind$1$4$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r0 = r12 & 3
                            r1 = 2
                            if (r0 != r1) goto L10
                            boolean r0 = r11.getSkipping()
                            if (r0 != 0) goto Lc
                            goto L10
                        Lc:
                            r11.skipToGroupEnd()
                            return
                        L10:
                            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r0 == 0) goto L1f
                            r0 = -1
                            java.lang.String r1 = "com.robinhood.android.paycheckhub.ui.PaycheckHubFragment.bind.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaycheckHubFragment.kt:269)"
                            r2 = 727453283(0x2b5c0e63, float:7.8179667E-13)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r12, r0, r1)
                        L1f:
                            com.robinhood.android.paycheckhub.ui.PaycheckHubFragment r3 = r10.this$0
                            com.robinhood.android.paycheckhub.ui.PaycheckHubViewState r12 = r10.$state
                            java.math.BigDecimal r5 = r12.getRetirementMatchRate()
                            r12 = 5004770(0x4c5de2, float:7.013177E-39)
                            r11.startReplaceGroup(r12)
                            com.robinhood.android.paycheckhub.ui.PaycheckHubFragment r12 = r10.this$0
                            boolean r12 = r11.changedInstance(r12)
                            com.robinhood.android.paycheckhub.ui.PaycheckHubFragment r0 = r10.this$0
                            java.lang.Object r1 = r11.rememberedValue()
                            if (r12 != 0) goto L43
                            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r12 = r12.getEmpty()
                            if (r1 != r12) goto L4b
                        L43:
                            com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$bind$1$4$1$1$$ExternalSyntheticLambda0 r1 = new com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$bind$1$4$1$1$$ExternalSyntheticLambda0
                            r1.<init>(r0)
                            r11.updateRememberedValue(r1)
                        L4b:
                            r6 = r1
                            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                            r11.endReplaceGroup()
                            r8 = 0
                            r9 = 1
                            r4 = 0
                            r7 = r11
                            com.robinhood.android.paycheckhub.p213ui.PaycheckHubFragment.access$RetirementSetUpCard(r3, r4, r5, r6, r7, r8, r9)
                            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r11 == 0) goto L61
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        L61:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.paycheckhub.p213ui.PaycheckHubFragment3.C254471.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(PaycheckHubFragment paycheckHubFragment) {
                        RetirementLastKnownEntryPointManager.INSTANCE.setLastKnownEntryPoint(RetirementLastKnownEntryPointManager.SYP_UPSELL);
                        EventLogger.DefaultImpls.logTap$default(paycheckHubFragment.getEventLogger(), UserInteractionEventData.Action.SET_UP_IRA, paycheckHubFragment.getEventScreen(), null, null, paycheckHubFragment.getEventContext(), false, 44, null);
                        Navigator navigator = paycheckHubFragment.getNavigator();
                        android.content.Context contextRequireContext = paycheckHubFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RetirementSignUp(null, null, false, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), null, false, null, null, 60, null);
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer, int i) {
                    ScarletManager scarletManager;
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1133259093, i, -1, "com.robinhood.android.paycheckhub.ui.PaycheckHubFragment.bind.<anonymous>.<anonymous>.<anonymous> (PaycheckHubFragment.kt:266)");
                    }
                    ScarletContextWrapper scarletContextWrapper = this.this$0.getScarletContextWrapper();
                    if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
                        ComposeView composeView2 = composeView;
                        Intrinsics.checkNotNull(composeView2);
                        scarletManager = ScarletManager2.getScarletManager(composeView2);
                    }
                    BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(scarletManager), null, ComposableLambda3.rememberComposableLambda(727453283, true, new C254471(this.this$0, state), composer, 54), composer, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$11$lambda$9$lambda$8$lambda$7(PaycheckHubViewState3.ButtonAction buttonAction, PaycheckHubFragment paycheckHubFragment) {
            int i = WhenMappings.$EnumSwitchMapping$0[buttonAction.ordinal()];
            if (i == 1) {
                paycheckHubFragment.launchPaycheckRecurringInvestmentSetup();
            } else if (i == 2) {
                paycheckHubFragment.getCallbacks().onManagedPaycheckRecurringInvestmentsClicked(paycheckHubFragment.getEventScreen());
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Navigator navigator = paycheckHubFragment.getNavigator();
                android.content.Context contextRequireContext = paycheckHubFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new DirectDepositShimKey(false, false, false, false, false, false, false, false, 255, null), null, false, null, null, 60, null);
            }
            return Unit.INSTANCE;
        }

        private final void bindSubtitleState(PaycheckHubViewState2 paycheckHubSubtitleState) {
            if (paycheckHubSubtitleState != null) {
                FragmentPaycheckHubBinding binding = getBinding();
                ImageView paycheckHubSubtitleEarlyPayIcon = binding.paycheckHubSubtitleEarlyPayIcon;
                Intrinsics.checkNotNullExpressionValue(paycheckHubSubtitleEarlyPayIcon, "paycheckHubSubtitleEarlyPayIcon");
                paycheckHubSubtitleEarlyPayIcon.setVisibility(paycheckHubSubtitleState.getIsEarlyPayIconVisible() ? 0 : 8);
                RhTextView rhTextView = binding.paycheckHubSubtitle;
                List<StringResource> content = paycheckHubSubtitleState.getContent();
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                rhTextView.setText(StringResources6.toSpannedString$default(content, resources, null, 2, null));
            }
        }

        private final void launchPaycheckRecurringInvestmentSetup() {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.CREATE_PAYCHECK_INVESTMENT, getEventScreen(), null, null, null, false, 60, null);
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new PaycheckRecurringInvestmentsOnboardingIntentKey.General(null, false, false, 7, null), null, false, null, null, 60, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void RetirementSetUpCard(Modifier modifier, final BigDecimal bigDecimal, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
            Modifier modifier2;
            int i3;
            final Modifier modifier3;
            Composer composerStartRestartGroup = composer.startRestartGroup(-1854113145);
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
                i3 |= composerStartRestartGroup.changedInstance(bigDecimal) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1854113145, i3, -1, "com.robinhood.android.paycheckhub.ui.PaycheckHubFragment.RetirementSetUpCard (PaycheckHubFragment.kt:317)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, i3 & 14, 0);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                CardKt.m5548CardFjzlyU(null, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), 0L, null, C2002Dp.m7995constructorimpl(2), ComposableLambda3.rememberComposableLambda(-2128477776, true, new PaycheckHubFragment2(function0, bigDecimal), composerStartRestartGroup, 54), composerStartRestartGroup, 1769472, 25);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PaycheckHubFragment.RetirementSetUpCard$lambda$14(this.f$0, modifier3, bigDecimal, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* compiled from: PaycheckHubFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckHubFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/paycheckhub/ui/PaycheckHubFragment;", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final PaycheckHubFragment newInstance() {
                return new PaycheckHubFragment();
            }
        }
    }
