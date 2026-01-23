package com.robinhood.android.optionsupgrade;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertViewState2;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.notification.NotificationUtils;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import options_product.service.UpsellAlertRequestMetadataDto;

/* compiled from: OptionOnboardingUpsellAlertFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\r\u0010)\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010*J\u0015\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-H\u0003¢\u0006\u0002\u0010.J\u0015\u0010/\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-H\u0003¢\u0006\u0002\u0010.J\u0010\u00100\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-H\u0002J\b\u00101\u001a\u00020\u001dH\u0002J\t\u00102\u001a\u00020\u0011H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "duxo", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertDuxo;", "getDuxo", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "setLoading", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "NewOptionUpsellAlert", "state", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertViewState;", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertViewState;Landroidx/compose/runtime/Composer;I)V", "OldOptionUpsellAlert", "positiveButtonOnClick", "negativeButtonOnClick", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingUpsellAlertFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOnboardingUpsellAlertFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof OptionOnboardingScreens2) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, OptionOnboardingUpsellAlertDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment, int i, Composer composer, int i2) {
        optionOnboardingUpsellAlertFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewOptionUpsellAlert$lambda$6(OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment, OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState, int i, Composer composer, int i2) {
        optionOnboardingUpsellAlertFragment.NewOptionUpsellAlert(optionOnboardingUpsellAlertViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OldOptionUpsellAlert$lambda$13(OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment, OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState, int i, Composer composer, int i2) {
        optionOnboardingUpsellAlertFragment.OldOptionUpsellAlert(optionOnboardingUpsellAlertViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return OptionOnboardingScreens.DefaultImpls.getEventScreen(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return (ScreenArgs) INSTANCE.getArgs((Fragment) this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionOnboardingUpsellAlertDuxo getDuxo() {
        return (OptionOnboardingUpsellAlertDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        getDuxo().setLoadingNextScreens(isLoading, ((ScreenRequest.UpsellAlert) currentScreenRequest).getAction());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C250541(null), 1, null);
    }

    /* compiled from: OptionOnboardingUpsellAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$onViewCreated$1", m3645f = "OptionOnboardingUpsellAlertFragment.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$onViewCreated$1 */
    static final class C250541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C250541(Continuation<? super C250541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingUpsellAlertFragment.this.new C250541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C250541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(OptionOnboardingUpsellAlertFragment.this.getDuxo().getEventFlow());
                final OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment = OptionOnboardingUpsellAlertFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<OptionOnboardingUpsellAlertViewState2>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<OptionOnboardingUpsellAlertViewState2> event, Continuation<? super Unit> continuation) {
                        EventConsumer<OptionOnboardingUpsellAlertViewState2> eventConsumerInvoke;
                        EventConsumer<OptionOnboardingUpsellAlertViewState2> eventConsumerInvoke2;
                        final OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment2 = optionOnboardingUpsellAlertFragment;
                        if ((event.getData() instanceof OptionOnboardingUpsellAlertViewState2.Success) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m17435invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m17435invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    OptionOnboardingScreens2 callbacks = optionOnboardingUpsellAlertFragment2.getCallbacks();
                                    UpsellAlertRequestMetadataDto.ActionDto actionDto = UpsellAlertRequestMetadataDto.ActionDto.ENABLE;
                                    OptionOnboardingUpsellAlertFragment.Companion companion = OptionOnboardingUpsellAlertFragment.INSTANCE;
                                    callbacks.goToNextScreen(new ScreenRequest.UpsellAlert(actionDto, ((ScreenArgs.UpsellAlert) companion.getArgs((Fragment) optionOnboardingUpsellAlertFragment2)).getScreenId()), (ScreenArgs) companion.getArgs((Fragment) optionOnboardingUpsellAlertFragment2));
                                }
                            });
                        }
                        final OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment3 = optionOnboardingUpsellAlertFragment;
                        if ((event.getData() instanceof OptionOnboardingUpsellAlertViewState2.Failure) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m17436invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m17436invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if (AbsErrorHandler.handleError$default(optionOnboardingUpsellAlertFragment3.getActivityErrorHandler(), ((OptionOnboardingUpsellAlertViewState2.Failure) event.getData()).getThrowable(), false, 2, null)) {
                                        return;
                                    }
                                    RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                                    Context contextRequireContext = optionOnboardingUpsellAlertFragment3.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setId(C11303R.id.alert_onboarding_error).setTitle(C11303R.string.option_alert_onboarding_error_dialog_title, new Object[0]).setMessage(C11303R.string.option_alert_onboarding_error_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
                                    FragmentManager supportFragmentManager = optionOnboardingUpsellAlertFragment3.requireActivity().getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                    RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "alert-onboarding-error", false, 4, null);
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        OptionOnboardingStyles2.setupStatusBarStyle(this, ((ScreenArgs.UpsellAlert) INSTANCE.getArgs((Fragment) this)).getStyle());
    }

    private static final OptionOnboardingUpsellAlertViewState ComposeContent$lambda$0(SnapshotState4<OptionOnboardingUpsellAlertViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        getDuxo().setSystemSettingsEnabled(NotificationUtils.isSystemNotificationOrChannelSettingsEnabled(ContextSystemServices.getNotificationManager(contextRequireContext), OptionOnboardingUpsellAlertViewState3.getOptionsAlertChannelId()));
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        OptionOnboardingStyles2.removeStatusBarStyle(this);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1207197049);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1207197049, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment.ComposeContent (OptionOnboardingUpsellAlertFragment.kt:98)");
            }
            SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1);
            boolean zIsPostEnablementMember = ((ScreenArgs.UpsellAlert) INSTANCE.getArgs((Fragment) this)).isPostEnablementMember();
            if (zIsPostEnablementMember) {
                composerStartRestartGroup.startReplaceGroup(-475188830);
                NewOptionUpsellAlert(ComposeContent$lambda$0(snapshotState4CollectAsState), composerStartRestartGroup, (i2 << 3) & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (zIsPostEnablementMember) {
                    composerStartRestartGroup.startReplaceGroup(-475190538);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-475187262);
                OldOptionUpsellAlert(ComposeContent$lambda$0(snapshotState4CollectAsState), composerStartRestartGroup, (i2 << 3) & 112);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingUpsellAlertFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void NewOptionUpsellAlert(final OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState, Composer composer, final int i) {
        int i2;
        LottieUrl lottieUrl;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1153473249);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(optionOnboardingUpsellAlertViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1153473249, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment.NewOptionUpsellAlert (OptionOnboardingUpsellAlertFragment.kt:107)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU();
            String strStringResource = StringResources_androidKt.stringResource(C11303R.string.option_alert_onboarding_title_new, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C11303R.string.option_alert_onboarding_summary_new, composerStartRestartGroup, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(optionOnboardingUpsellAlertViewState.getPositiveButtonTextResId(), composerStartRestartGroup, 0);
            boolean isPositiveButtonLoading = optionOnboardingUpsellAlertViewState.getIsPositiveButtonLoading();
            String strStringResource4 = StringResources_androidKt.stringResource(C11303R.string.option_alert_onboarding_negative_button_new, composerStartRestartGroup, 0);
            boolean isNegativeButtonLoading = optionOnboardingUpsellAlertViewState.getIsNegativeButtonLoading();
            boolean isDay = bentoTheme.getColors(composerStartRestartGroup, i3).getIsDay();
            if (isDay) {
                lottieUrl = LottieUrl.OPTIONS_ONBOARDING_ALERT_NOTIFICATIONS_DAY;
            } else {
                if (isDay) {
                    throw new NoWhenBranchMatchedException();
                }
                lottieUrl = LottieUrl.OPTIONS_ONBOARDING_ALERT_NOTIFICATIONS_NIGHT;
            }
            LottieUrl lottieUrl2 = lottieUrl;
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | ((i2 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingUpsellAlertFragment.NewOptionUpsellAlert$lambda$3$lambda$2(this.f$0, optionOnboardingUpsellAlertViewState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingUpsellAlertFragment.NewOptionUpsellAlert$lambda$5$lambda$4(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            OptionOnboardingUpsellComposableKt.m17447OptionOnboardingUpsellComposableDY_cekU(jM21371getBg0d7_KjU, strStringResource2, null, function0, false, strStringResource3, isPositiveButtonLoading, strStringResource, textAlignM7912boximpl, true, null, lottieUrl2, null, null, strStringResource4, isNegativeButtonLoading, (Function0) objRememberedValue2, composer2, 805306368, 0, 13332);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingUpsellAlertFragment.NewOptionUpsellAlert$lambda$6(this.f$0, optionOnboardingUpsellAlertViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewOptionUpsellAlert$lambda$3$lambda$2(OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment, OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState) {
        optionOnboardingUpsellAlertFragment.positiveButtonOnClick(optionOnboardingUpsellAlertViewState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewOptionUpsellAlert$lambda$5$lambda$4(OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment) {
        optionOnboardingUpsellAlertFragment.negativeButtonOnClick();
        return Unit.INSTANCE;
    }

    private final void OldOptionUpsellAlert(final OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1737545560);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(optionOnboardingUpsellAlertViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1737545560, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment.OldOptionUpsellAlert (OptionOnboardingUpsellAlertFragment.kt:129)");
            }
            Companion companion = INSTANCE;
            long jM17424getComposeColorWaAFU9c = ((ScreenArgs.UpsellAlert) companion.getArgs((Fragment) this)).getStyle().m17424getComposeColorWaAFU9c(composerStartRestartGroup, 0);
            int optionOnboardingUpsellAlertImageResId = OptionOnboardingUpsellAlertFragment2.getOptionOnboardingUpsellAlertImageResId(((ScreenArgs.UpsellAlert) companion.getArgs((Fragment) this)).getStyle());
            String strStringResource = StringResources_androidKt.stringResource(C11303R.string.option_alert_retirement_onboarding_title, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C11303R.string.option_alert_retirement_onboarding_summary, composerStartRestartGroup, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(optionOnboardingUpsellAlertViewState.getPositiveButtonTextResId(), composerStartRestartGroup, 0);
            String strStringResource4 = StringResources_androidKt.stringResource(C11303R.string.option_alert_onboarding_negative_button, composerStartRestartGroup, 0);
            boolean isPositiveButtonLoading = optionOnboardingUpsellAlertViewState.getIsPositiveButtonLoading();
            boolean isNegativeButtonLoading = optionOnboardingUpsellAlertViewState.getIsNegativeButtonLoading();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | ((i2 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingUpsellAlertFragment.OldOptionUpsellAlert$lambda$8$lambda$7(this.f$0, optionOnboardingUpsellAlertViewState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Integer numValueOf = Integer.valueOf(optionOnboardingUpsellAlertImageResId);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingUpsellAlertFragment.OldOptionUpsellAlert$lambda$10$lambda$9(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingUpsellAlertFragment.OldOptionUpsellAlert$lambda$12$lambda$11(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            OptionOnboardingUpsellComposableKt.m17447OptionOnboardingUpsellComposableDY_cekU(jM17424getComposeColorWaAFU9c, strStringResource2, null, function0, false, strStringResource3, isPositiveButtonLoading, strStringResource, null, false, numValueOf, null, null, function02, strStringResource4, isNegativeButtonLoading, (Function0) objRememberedValue3, composer2, 0, 0, 6932);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAlertFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingUpsellAlertFragment.OldOptionUpsellAlert$lambda$13(this.f$0, optionOnboardingUpsellAlertViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OldOptionUpsellAlert$lambda$10$lambda$9(OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment) {
        String string2 = optionOnboardingUpsellAlertFragment.getString(C11303R.string.option_alert_onboarding_learn_more_url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigator navigator = optionOnboardingUpsellAlertFragment.getNavigator();
        Context contextRequireContext = optionOnboardingUpsellAlertFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OldOptionUpsellAlert$lambda$8$lambda$7(OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment, OptionOnboardingUpsellAlertViewState optionOnboardingUpsellAlertViewState) {
        optionOnboardingUpsellAlertFragment.positiveButtonOnClick(optionOnboardingUpsellAlertViewState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OldOptionUpsellAlert$lambda$12$lambda$11(OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment) {
        optionOnboardingUpsellAlertFragment.negativeButtonOnClick();
        return Unit.INSTANCE;
    }

    private final void positiveButtonOnClick(OptionOnboardingUpsellAlertViewState state) {
        if (!state.isSystemSettingsEnabled()) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Intent disabledSystemNotificationOrChannelSettingsIntent = NotificationUtils.getDisabledSystemNotificationOrChannelSettingsIntent(contextRequireContext, OptionOnboardingUpsellAlertViewState3.getOptionsAlertChannelId());
            disabledSystemNotificationOrChannelSettingsIntent.addFlags(268435456);
            startActivity(disabledSystemNotificationOrChannelSettingsIntent);
            return;
        }
        getDuxo().markOptionAlertOnboardingShown();
        getDuxo().turnOnOptionAlert();
    }

    private final void negativeButtonOnClick() {
        OptionOnboardingScreens2 callbacks = getCallbacks();
        UpsellAlertRequestMetadataDto.ActionDto actionDto = UpsellAlertRequestMetadataDto.ActionDto.NOT_NOW;
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.UpsellAlert(actionDto, ((ScreenArgs.UpsellAlert) companion.getArgs((Fragment) this)).getScreenId()), (ScreenArgs) companion.getArgs((Fragment) this));
    }

    /* compiled from: OptionOnboardingUpsellAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellAlertFragment;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UpsellAlert;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOnboardingUpsellAlertFragment, ScreenArgs.UpsellAlert> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ScreenArgs.UpsellAlert getArgs(OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment) {
            return (ScreenArgs.UpsellAlert) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOnboardingUpsellAlertFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOnboardingUpsellAlertFragment newInstance(ScreenArgs.UpsellAlert upsellAlert) {
            return (OptionOnboardingUpsellAlertFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, upsellAlert);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOnboardingUpsellAlertFragment optionOnboardingUpsellAlertFragment, ScreenArgs.UpsellAlert upsellAlert) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOnboardingUpsellAlertFragment, upsellAlert);
        }
    }
}
