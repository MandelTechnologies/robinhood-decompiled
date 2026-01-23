package com.robinhood.android.rhymigration.p245ui.card;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.databinding.FragmentRhyCardBinding;
import com.robinhood.android.rhymigration.model.UiRhyMigrationCardPage;
import com.robinhood.android.rhymigration.p245ui.PageDataCallbacks;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoggingUtils;
import com.robinhood.android.rhymigration.p245ui.card.RhyCardFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.models.api.minerva.RhyMigrationVariables;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyCardFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003EFGB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u000202H\u0016J\u0010\u00108\u001a\u0002022\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000202H\u0016J\u0010\u0010<\u001a\u0002022\u0006\u0010=\u001a\u00020>H\u0002J\t\u0010?\u001a\u00020\u0011H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AX\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/card/RhyCardFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenEventLogging", "", "getExcludeFromAutoScreenEventLogging", "()Z", "screenName", "", "getScreenName", "()Ljava/lang/String;", "page", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCardPage;", "getPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCardPage;", "variables", "Lcom/robinhood/models/api/minerva/RhyMigrationVariables;", "getVariables", "()Lcom/robinhood/models/api/minerva/RhyMigrationVariables;", "binding", "Lcom/robinhood/android/rhymigration/databinding/FragmentRhyCardBinding;", "getBinding", "()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyCardBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/rhymigration/ui/card/RhyCardFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhymigration/ui/card/RhyCardFragment$Callbacks;", "callbacks$delegate", "duxo", "Lcom/robinhood/android/rhymigration/ui/card/RhyCardDuxo;", "getDuxo", "()Lcom/robinhood/android/rhymigration/ui/card/RhyCardDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStop", "bindState", "state", "Lcom/robinhood/android/rhymigration/ui/card/RhyCardViewState;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyCardFragment extends BaseFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final boolean excludeFromAutoScreenEventLogging;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyCardFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyCardBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RhyCardFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhymigration/ui/card/RhyCardFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RhyCardFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/card/RhyCardFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "onCardSelected", "", "rhyCardPreference", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RhyCardPreference;", "onCardSelectedError", "throwable", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends PageDataCallbacks {
        void onCardSelected(MinervaAccountStore.RhyCardPreference rhyCardPreference);

        void onCardSelectedError(Throwable throwable);
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

    public RhyCardFragment() {
        super(C27577R.layout.fragment_rhy_card);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.eventScreen = new Screen(Screen.Name.RHY_MIGRATION_SELECT_CARD, null, null, null, 14, null);
        this.excludeFromAutoScreenEventLogging = true;
        this.binding = ViewBinding5.viewBinding(this, RhyCardFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.card.RhyCardFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RhyCardFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, RhyCardDuxo.class);
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return this.excludeFromAutoScreenEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return getEventScreen().getName().name();
    }

    private final UiRhyMigrationCardPage getPage() {
        return getCallbacks().getCardPage();
    }

    private final RhyMigrationVariables getVariables() {
        return getCallbacks().getVariables();
    }

    private final FragmentRhyCardBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyCardBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final RhyCardDuxo getDuxo() {
        return (RhyCardDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getDuxo().setVirtualCardFirst(getVariables().getVirtual_card_first());
        getBinding().rhyCardTitle.setText(getPage().getTitle());
        getBinding().rhyCardSubtitle.setText(getPage().getSubtitle());
        getBinding().rhyCardEta.setText(getVariables().getCard_eta_string());
        getBinding().rhyCardPrimaryBtn.setText(getPage().getPrimaryCtaTitle());
        getBinding().rhyCardSecondaryBtn.setText(getPage().getSecondaryCtaTitle());
        LottieAnimationView lottieAnimationView = getBinding().rhyCardLottie;
        lottieAnimationView.setAnimationFromUrl(getPage().getAnimationAsset());
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.playAnimation();
        requireToolbar().setTitle("");
        BaseFragments2.setContentBelowToolbar(this, view);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, getEventScreen(), null, null, RhyOnboardingLoggingUtils.getEventContext$default(this, (AgreementContext) null, (String) null, 3, (Object) null), 13, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C276051(this));
    }

    /* compiled from: RhyCardFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.card.RhyCardFragment$onStart$1 */
    /* synthetic */ class C276051 extends FunctionReferenceImpl implements Function1<RhyCardViewState, Unit> {
        C276051(Object obj) {
            super(1, obj, RhyCardFragment.class, "bindState", "bindState(Lcom/robinhood/android/rhymigration/ui/card/RhyCardViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RhyCardViewState rhyCardViewState) {
            invoke2(rhyCardViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RhyCardViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhyCardFragment) this.receiver).bindState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (((Args) INSTANCE.getArgs((Fragment) this)).isInCmSunset()) {
            toolbar.getProgressBar().setNumSegments(3);
            RdsSegmentedProgressBar.setProgress$default(toolbar.getProgressBar(), 0, 0.5f, false, 4, null);
            toolbar.getProgressBar().setVisibility(0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logScreenDisappear$default(getEventLogger(), null, getEventScreen(), null, null, RhyOnboardingLoggingUtils.getEventContext$default(this, (AgreementContext) null, (String) null, 3, (Object) null), 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(RhyCardViewState state) {
        MinervaAccountStore.RhyCardPreference rhyCardPreferenceConsume;
        Throwable thConsume;
        RdsButton rdsButton = getBinding().rhyCardPrimaryBtn;
        rdsButton.setLoading(state.getPrimaryButtonLoading());
        rdsButton.setEnabled(!state.getSecondaryButtonLoading());
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.rhymigration.ui.card.RhyCardFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyCardFragment.bindState$lambda$3$lambda$1(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.rhymigration.ui.card.RhyCardFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyCardFragment.bindState$lambda$3$lambda$2(this.f$0);
            }
        });
        RdsButton rdsButton2 = getBinding().rhyCardSecondaryBtn;
        rdsButton2.setLoading(state.getSecondaryButtonLoading());
        rdsButton2.setEnabled(!state.getPrimaryButtonLoading());
        Intrinsics.checkNotNull(rdsButton2);
        ViewsKt.eventData$default(rdsButton2, false, new Function0() { // from class: com.robinhood.android.rhymigration.ui.card.RhyCardFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyCardFragment.bindState$lambda$6$lambda$4(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.android.rhymigration.ui.card.RhyCardFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyCardFragment.bindState$lambda$6$lambda$5(this.f$0);
            }
        });
        UiEvent<Throwable> error = state.getError();
        if (error != null && (thConsume = error.consume()) != null) {
            getCallbacks().onCardSelectedError(thConsume);
        }
        UiEvent<MinervaAccountStore.RhyCardPreference> success = state.getSuccess();
        if (success == null || (rhyCardPreferenceConsume = success.consume()) == null) {
            return;
        }
        getCallbacks().onCardSelected(rhyCardPreferenceConsume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindState$lambda$3$lambda$1(RhyCardFragment rhyCardFragment) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, RhyOnboardingLoggingUtils.getEventContext$default(rhyCardFragment, (AgreementContext) null, (String) null, 3, (Object) null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$3$lambda$2(RhyCardFragment rhyCardFragment) {
        rhyCardFragment.getDuxo().onPrimaryButtonClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindState$lambda$6$lambda$4(RhyCardFragment rhyCardFragment) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, RhyOnboardingLoggingUtils.getEventContext$default(rhyCardFragment, (AgreementContext) null, (String) null, 3, (Object) null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$6$lambda$5(RhyCardFragment rhyCardFragment) {
        rhyCardFragment.getDuxo().onSecondaryButtonClicked();
        return Unit.INSTANCE;
    }

    /* compiled from: RhyCardFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/card/RhyCardFragment$Args;", "Landroid/os/Parcelable;", "isInCmSunset", "", "<init>", "(Z)V", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isInCmSunset;

        /* compiled from: RhyCardFragment.kt */
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

        public static /* synthetic */ Args copy$default(Args args, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.isInCmSunset;
            }
            return args.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsInCmSunset() {
            return this.isInCmSunset;
        }

        public final Args copy(boolean isInCmSunset) {
            return new Args(isInCmSunset);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.isInCmSunset == ((Args) other).isInCmSunset;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isInCmSunset);
        }

        public String toString() {
            return "Args(isInCmSunset=" + this.isInCmSunset + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isInCmSunset ? 1 : 0);
        }

        public Args(boolean z) {
            this.isInCmSunset = z;
        }

        public /* synthetic */ Args(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean isInCmSunset() {
            return this.isInCmSunset;
        }
    }

    /* compiled from: RhyCardFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/card/RhyCardFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhymigration/ui/card/RhyCardFragment;", "Lcom/robinhood/android/rhymigration/ui/card/RhyCardFragment$Args;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhyCardFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhyCardFragment rhyCardFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhyCardFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyCardFragment newInstance(Args args) {
            return (RhyCardFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyCardFragment rhyCardFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhyCardFragment, args);
        }
    }
}
