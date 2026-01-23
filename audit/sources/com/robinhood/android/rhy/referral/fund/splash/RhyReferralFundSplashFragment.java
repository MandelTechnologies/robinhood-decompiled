package com.robinhood.android.rhy.referral.fund.splash;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashEvent;
import com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashViewState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RhyReferralFundSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001>B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020#H\u0016J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020#H\u0016J\u001a\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\r\u0010/\u001a\u00020#H\u0017¢\u0006\u0002\u00100J\r\u00101\u001a\u00020#H\u0003¢\u0006\u0002\u00100J\r\u00102\u001a\u00020#H\u0003¢\u0006\u0002\u00100J\u0016\u00103\u001a\u00020#2\f\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0002J\t\u00107\u001a\u000208H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?²\u0006\n\u0010@\u001a\u00020AX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "getRhyGlobalLoggingContext", "()Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "setRhyGlobalLoggingContext", "(Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashDuxo;", "getDuxo", "()Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onAttach", "context", "Landroid/content/Context;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "LoadingContent", "PreviewLoadingContent", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashEvent;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "feature-rhy-referral_externalDebug", "viewState", "Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyReferralFundSplashFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyReferralFundSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashFragment$Callbacks;", 0))};
    public static final int $stable = 8;
    public EventLogger eventLogger;
    public RhyGlobalLoggingContext rhyGlobalLoggingContext;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(Screen.Name.RHY_REFERRALS_FUND_LANDING, null, null, null, 14, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RhyReferralFundSplashDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: RhyReferralFundSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/splash/RhyReferralFundSplashFragment$Callbacks;", "", "onIneligibleToFund", "", "onClickContinue", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onClickContinue();

        void onIneligibleToFund();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7(RhyReferralFundSplashFragment rhyReferralFundSplashFragment, int i, Composer composer, int i2) {
        rhyReferralFundSplashFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingContent$lambda$8(RhyReferralFundSplashFragment rhyReferralFundSplashFragment, int i, Composer composer, int i2) {
        rhyReferralFundSplashFragment.LoadingContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingContent$lambda$9(RhyReferralFundSplashFragment rhyReferralFundSplashFragment, int i, Composer composer, int i2) {
        rhyReferralFundSplashFragment.PreviewLoadingContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<RhyReferralFundSplashEvent> event) {
        EventConsumer<RhyReferralFundSplashEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof RhyReferralFundSplashEvent.Error) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18285invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18285invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AbsErrorHandler.handleError$default(this.getActivityErrorHandler(), ((RhyReferralFundSplashEvent.Error) event.getData()).getThrowable(), false, 2, null);
            }
        });
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RhyReferralFundSplashDuxo getDuxo() {
        return (RhyReferralFundSplashDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getRhyGlobalLoggingContext().refresh();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        RhyReferralFundSplashFragment4.setToolbarStyle(this);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        RhyReferralFundSplashFragment4.removeToolbarStyle(this);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    private static final RhyReferralFundSplashViewState ComposeContent$lambda$4(SnapshotState4<? extends RhyReferralFundSplashViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralFundSplashFragment.onResume$lambda$3(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(RhyReferralFundSplashFragment rhyReferralFundSplashFragment, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhyReferralFundSplashFragment4.setToolbarStyle(rhyReferralFundSplashFragment);
        Toolbar toolbar = rhyReferralFundSplashFragment.requireToolbar().getToolbar();
        Drawable drawable = ViewsKt.getDrawable(toolbar, C20690R.drawable.ic_rds_close_24dp);
        drawable.setTint(ContextCompat.getColor(toolbar.getContext(), C11048R.color.text_color_primary));
        toolbar.setNavigationIcon(drawable);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C274671(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C274682(null), 1, null);
    }

    /* compiled from: RhyReferralFundSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment$onViewCreated$1", m3645f = "RhyReferralFundSplashFragment.kt", m3646l = {106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment$onViewCreated$1 */
    static final class C274671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C274671(Continuation<? super C274671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyReferralFundSplashFragment.this.new C274671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C274671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<RhyReferralFundSplashViewState> stateFlow = RhyReferralFundSplashFragment.this.getDuxo().getStateFlow();
                final RhyReferralFundSplashFragment rhyReferralFundSplashFragment = RhyReferralFundSplashFragment.this;
                FlowCollector<? super RhyReferralFundSplashViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((RhyReferralFundSplashViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(RhyReferralFundSplashViewState rhyReferralFundSplashViewState, Continuation<? super Unit> continuation) {
                        if (Intrinsics.areEqual(rhyReferralFundSplashViewState, RhyReferralFundSplashViewState.NoApprovedAccount.INSTANCE)) {
                            rhyReferralFundSplashFragment.getCallbacks().onIneligibleToFund();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* compiled from: RhyReferralFundSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment$onViewCreated$2", m3645f = "RhyReferralFundSplashFragment.kt", m3646l = {114}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment$onViewCreated$2 */
    static final class C274682 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C274682(Continuation<? super C274682> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyReferralFundSplashFragment.this.new C274682(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C274682) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RhyReferralFundSplashFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ RhyReferralFundSplashFragment $tmp0;

            AnonymousClass1(RhyReferralFundSplashFragment rhyReferralFundSplashFragment) {
                this.$tmp0 = rhyReferralFundSplashFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, RhyReferralFundSplashFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<RhyReferralFundSplashEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C274682.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<RhyReferralFundSplashEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(RhyReferralFundSplashFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RhyReferralFundSplashFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(RhyReferralFundSplashFragment rhyReferralFundSplashFragment, Event event, Continuation continuation) {
            rhyReferralFundSplashFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(742520345);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(742520345, i2, -1, "com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment.ComposeContent (RhyReferralFundSplashFragment.kt:118)");
            }
            RhyReferralFundSplashViewState rhyReferralFundSplashViewStateComposeContent$lambda$4 = ComposeContent$lambda$4(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (Intrinsics.areEqual(rhyReferralFundSplashViewStateComposeContent$lambda$4, RhyReferralFundSplashViewState.ApprovedAccount.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(597487535);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhyReferralFundSplashFragment.ComposeContent$lambda$6$lambda$5(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                RhyReferralFundSplashComposable3.RhyReferralFundSplashComposable((Function0) objRememberedValue, null, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(rhyReferralFundSplashViewStateComposeContent$lambda$4, RhyReferralFundSplashViewState.Loading.INSTANCE) && !Intrinsics.areEqual(rhyReferralFundSplashViewStateComposeContent$lambda$4, RhyReferralFundSplashViewState.NoApprovedAccount.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(597485180);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(597507273);
                LoadingContent(composerStartRestartGroup, i2 & 14);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralFundSplashFragment.ComposeContent$lambda$7(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6$lambda$5(RhyReferralFundSplashFragment rhyReferralFundSplashFragment) {
        EventLogger.DefaultImpls.logTap$default(rhyReferralFundSplashFragment.getEventLogger(), UserInteractionEventData.Action.CONTINUE, rhyReferralFundSplashFragment.getEventScreen(), null, null, RhyGlobalLoggingContext.eventContext$default(rhyReferralFundSplashFragment.getRhyGlobalLoggingContext(), RHYContext.ProductArea.REFERRALS, null, null, 6, null), false, 44, null);
        rhyReferralFundSplashFragment.getCallbacks().onClickContinue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void LoadingContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1173272899);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1173272899, i, -1, "com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment.LoadingContent (RhyReferralFundSplashFragment.kt:140)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, RhyReferralFundSplashFragment2.INSTANCE.getLambda$1149034195$feature_rhy_referral_externalDebug(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralFundSplashFragment.LoadingContent$lambda$8(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void PreviewLoadingContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-931065865);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-931065865, i2, -1, "com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment.PreviewLoadingContent (RhyReferralFundSplashFragment.kt:150)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1613490495, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment.PreviewLoadingContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1613490495, i3, -1, "com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment.PreviewLoadingContent.<anonymous> (RhyReferralFundSplashFragment.kt:152)");
                    }
                    RhyReferralFundSplashFragment.this.LoadingContent(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralFundSplashFragment.PreviewLoadingContent$lambda$9(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
