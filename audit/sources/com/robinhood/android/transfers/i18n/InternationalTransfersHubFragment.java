package com.robinhood.android.transfers.i18n;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.history.p082ui.UnifiedHistoryView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.ScreenViewAnalyticables;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.i18n.InternationalTransfersHubDuxo2;
import com.robinhood.android.transfers.i18n.InternationalTransfersHubViewState;
import com.robinhood.android.transfers.i18n.compose.I18nLinkedAccountsComposable;
import com.robinhood.android.transfers.i18n.compose.I18nTransfersHubHeaderComposable;
import com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposable4;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.android.transfers.transferhub.databinding.FragmentI18nTransfersHubBinding;
import com.robinhood.android.transfers.withdrawablecash.WithdrawableCashInfoSdui;
import com.robinhood.android.transfers.withdrawablecash.WithdrawableCashState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InternationalTransfersHubFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002FGB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u00020)2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020)H\u0016J\u0012\u00105\u001a\u00020)2\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0016\u00108\u001a\u00020)2\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:H\u0002J\u001a\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u000103H\u0016J\t\u0010@\u001a\u00020\u0014H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b%\u0010&R\u0018\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BX\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/common/history/ui/UnifiedHistoryView$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "getMicrogramManager", "()Lcom/robinhood/android/microgramsdui/MicrogramManager;", "setMicrogramManager", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/transfers/transferhub/databinding/FragmentI18nTransfersHubBinding;", "getBinding", "()Lcom/robinhood/android/transfers/transferhub/databinding/FragmentI18nTransfersHubBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubDuxo;", "duxo$delegate", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onRecentHistoryShowAllClicked", "bindWithdrawableCashInfo", "state", "Lcom/robinhood/android/transfers/withdrawablecash/WithdrawableCashState;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/i18n/I18nTransfersHubEvent;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InternationalTransfersHubFragment extends BaseFragment implements AutoLoggableFragment, UnifiedHistoryView.Callbacks, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen;
    public MicrogramManager microgramManager;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InternationalTransfersHubFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/transferhub/databinding/FragmentI18nTransfersHubBinding;", 0))};

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

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<InternationalTransfersHubDuxo2> event) {
        EventConsumer<InternationalTransfersHubDuxo2> eventConsumerInvoke;
        EventConsumer<InternationalTransfersHubDuxo2> eventConsumerInvoke2;
        EventConsumer<InternationalTransfersHubDuxo2> eventConsumerInvoke3;
        EventConsumer<InternationalTransfersHubDuxo2> eventConsumerInvoke4;
        if ((event.getData() instanceof InternationalTransfersHubDuxo2.ShowFragment) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19623invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19623invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    InternationalTransfersHubDuxo2.ShowFragment showFragment = (InternationalTransfersHubDuxo2.ShowFragment) event.getData();
                    Navigator navigator = this.getNavigator();
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, showFragment.getFragmentKey(), false, false, false, false, null, false, null, null, 1020, null);
                }
            });
        }
        if ((event.getData() instanceof InternationalTransfersHubDuxo2.StartActivity) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19624invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19624invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    InternationalTransfersHubDuxo2.StartActivity startActivity = (InternationalTransfersHubDuxo2.StartActivity) event.getData();
                    Navigator navigator = this.getNavigator();
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, startActivity.getIntentKey(), null, false, null, null, 60, null);
                }
            });
        }
        if ((event.getData() instanceof InternationalTransfersHubDuxo2.ViewUrl) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19625invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19625invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    InternationalTransfersHubDuxo2.ViewUrl viewUrl = (InternationalTransfersHubDuxo2.ViewUrl) event.getData();
                    Context context = this.getContext();
                    StringResource url = viewUrl.getUrl();
                    Resources resources = this.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    WebUtils.viewUrl$default(context, url.getText(resources).toString(), 0, 4, (Object) null);
                }
            });
        }
        if (!(event.getData() instanceof InternationalTransfersHubDuxo2.LaunchDeeplink) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$handleEvent$$inlined$consumeIfType$4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m19626invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m19626invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                InternationalTransfersHubDuxo2.LaunchDeeplink launchDeeplink = (InternationalTransfersHubDuxo2.LaunchDeeplink) event.getData();
                Navigator navigator = this.getNavigator();
                Context contextRequireContext = this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, launchDeeplink.getUri(), null, null, false, null, 60, null);
            }
        });
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void doOnTransactionDetailRequested(HistoryEvent historyEvent) {
        UnifiedHistoryView.Callbacks.DefaultImpls.doOnTransactionDetailRequested(this, historyEvent);
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void onSummaryBadgeClicked(HistoryEvent historyEvent) {
        UnifiedHistoryView.Callbacks.DefaultImpls.onSummaryBadgeClicked(this, historyEvent);
    }

    public InternationalTransfersHubFragment() {
        super(C30556R.layout.fragment_i18n_transfers_hub);
        this.$$delegate_0 = new RegionGated2(InternationalTransferHubRegionGate.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InternationalTransfersHubFragment.eventScreen_delegate$lambda$0();
            }
        });
        this.binding = ViewBinding5.viewBinding(this, InternationalTransfersHubFragment$binding$2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, InternationalTransfersHubDuxo.class);
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

    public final MicrogramManager getMicrogramManager() {
        MicrogramManager microgramManager = this.microgramManager;
        if (microgramManager != null) {
            return microgramManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("microgramManager");
        return null;
    }

    public final void setMicrogramManager(MicrogramManager microgramManager) {
        Intrinsics.checkNotNullParameter(microgramManager, "<set-?>");
        this.microgramManager = microgramManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0() {
        return new Screen(Screen.Name.TRANSFERS, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentI18nTransfersHubBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentI18nTransfersHubBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternationalTransfersHubDuxo getDuxo() {
        return (InternationalTransfersHubDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C302841(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C302852(null), 1, null);
    }

    /* compiled from: InternationalTransfersHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$onViewCreated$1", m3645f = "InternationalTransfersHubFragment.kt", m3646l = {86}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$onViewCreated$1 */
    static final class C302841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C302841(Continuation<? super C302841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransfersHubFragment.this.new C302841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C302841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InternationalTransfersHubFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ InternationalTransfersHubFragment $tmp0;

            AnonymousClass1(InternationalTransfersHubFragment internationalTransfersHubFragment) {
                this.$tmp0 = internationalTransfersHubFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, InternationalTransfersHubFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<InternationalTransfersHubDuxo2> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C302841.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<InternationalTransfersHubDuxo2>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(InternationalTransfersHubFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternationalTransfersHubFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(InternationalTransfersHubFragment internationalTransfersHubFragment, Event event, Continuation continuation) {
            internationalTransfersHubFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: InternationalTransfersHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$onViewCreated$2", m3645f = "InternationalTransfersHubFragment.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$onViewCreated$2 */
    static final class C302852 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C302852(Continuation<? super C302852> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransfersHubFragment.this.new C302852(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C302852) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<InternationalTransfersHubViewState> stateFlow = InternationalTransfersHubFragment.this.getDuxo().getStateFlow();
                final InternationalTransfersHubFragment internationalTransfersHubFragment = InternationalTransfersHubFragment.this;
                FlowCollector<? super InternationalTransfersHubViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((InternationalTransfersHubViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final InternationalTransfersHubViewState internationalTransfersHubViewState, Continuation<? super Unit> continuation) {
                        FragmentI18nTransfersHubBinding binding = internationalTransfersHubFragment.getBinding();
                        final InternationalTransfersHubFragment internationalTransfersHubFragment2 = internationalTransfersHubFragment;
                        binding.transfersHubHeader.setContent(ComposableLambda3.composableLambdaInstance(670654923, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$onViewCreated$2$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i2) {
                                if ((i2 & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(670654923, i2, -1, "com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternationalTransfersHubFragment.kt:94)");
                                }
                                EventLogger eventLogger = internationalTransfersHubFragment2.getEventLogger();
                                ScarletManager scarletManager = internationalTransfersHubFragment2.getScarletManager();
                                Screen eventScreen = internationalTransfersHubFragment2.getEventScreen();
                                boolean zIsLimitsSubtitleVisible = internationalTransfersHubViewState.isLimitsSubtitleVisible();
                                InternationalTransfersHubDuxo duxo = internationalTransfersHubFragment2.getDuxo();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(duxo);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new InternationalTransfersHubFragment$onViewCreated$2$1$1$1$1$1(duxo);
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                I18nTransfersHubHeaderComposable.TransfersHubHeaderComposable(eventLogger, scarletManager, eventScreen, zIsLimitsSubtitleVisible, null, (Function0) ((KFunction) objRememberedValue), composer, ScarletManager.$stable << 3, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        binding.transfersHubActions.setContent(ComposableLambda3.composableLambdaInstance(2085053570, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$onViewCreated$2$1$1$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i2) {
                                if ((i2 & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2085053570, i2, -1, "com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternationalTransfersHubFragment.kt:104)");
                                }
                                InternationalTransfersHubViewState.TransferHubActionsState actionsState = internationalTransfersHubViewState.getActionsState();
                                InternationalTransfersHubDuxo duxo = internationalTransfersHubFragment2.getDuxo();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(duxo);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new InternationalTransfersHubFragment$onViewCreated$2$1$1$2$1$1(duxo);
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                KFunction kFunction = (KFunction) objRememberedValue;
                                composer.endReplaceGroup();
                                InternationalTransfersHubDuxo duxo2 = internationalTransfersHubFragment2.getDuxo();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer.changedInstance(duxo2);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new InternationalTransfersHubFragment$onViewCreated$2$1$1$2$2$1(duxo2);
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                KFunction kFunction2 = (KFunction) objRememberedValue2;
                                composer.endReplaceGroup();
                                InternationalTransfersHubDuxo duxo3 = internationalTransfersHubFragment2.getDuxo();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance3 = composer.changedInstance(duxo3);
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new InternationalTransfersHubFragment$onViewCreated$2$1$1$2$3$1(duxo3);
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                TransferHubActionsComposable4.TransferHubActionsComposable(actionsState, (Function1) kFunction, (Function1) ((KFunction) objRememberedValue3), (Function0) kFunction2, internationalTransfersHubFragment2.getScarletManager(), internationalTransfersHubFragment2.getEventScreen(), SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), composer, (ScarletManager.$stable << 12) | 1572864, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        ComposeView accountsView = binding.accountsView;
                        Intrinsics.checkNotNullExpressionValue(accountsView, "accountsView");
                        accountsView.setVisibility(internationalTransfersHubViewState.getLinkedAccountsState().isVisible() ? 0 : 8);
                        binding.accountsView.setContent(ComposableLambda3.composableLambdaInstance(1074387523, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$onViewCreated$2$1$1$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i2) {
                                if ((i2 & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1074387523, i2, -1, "com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternationalTransfersHubFragment.kt:119)");
                                }
                                I18nLinkedAccountsComposable.LinkedAccountsComposable(internationalTransfersHubViewState.getLinkedAccountsState(), internationalTransfersHubFragment2.getScarletManager(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, (ScarletManager.$stable << 3) | 384, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        RhTextView moveMoneyPendingHistorySectionHeaderText = binding.moveMoneyPendingHistorySectionHeaderText;
                        Intrinsics.checkNotNullExpressionValue(moveMoneyPendingHistorySectionHeaderText, "moveMoneyPendingHistorySectionHeaderText");
                        moveMoneyPendingHistorySectionHeaderText.setVisibility(internationalTransfersHubViewState.isPendingHistoryTitleVisible() ? 0 : 8);
                        UnifiedHistoryView moveMoneyPendingHistory = binding.moveMoneyPendingHistory;
                        Intrinsics.checkNotNullExpressionValue(moveMoneyPendingHistory, "moveMoneyPendingHistory");
                        moveMoneyPendingHistory.setVisibility(internationalTransfersHubViewState.isPendingHistoryTitleVisible() ? 0 : 8);
                        binding.moveMoneyPendingHistory.bind(internationalTransfersHubViewState.getPendingHistoryItems());
                        binding.moveMoneyPendingHistory.setCallbacks(internationalTransfersHubFragment2);
                        RhTextView moveMoneyHistorySectionHeaderText = binding.moveMoneyHistorySectionHeaderText;
                        Intrinsics.checkNotNullExpressionValue(moveMoneyHistorySectionHeaderText, "moveMoneyHistorySectionHeaderText");
                        moveMoneyHistorySectionHeaderText.setVisibility(internationalTransfersHubViewState.isCompletedHistoryVisible() ? 0 : 8);
                        UnifiedHistoryView moveMoneyHistory = binding.moveMoneyHistory;
                        Intrinsics.checkNotNullExpressionValue(moveMoneyHistory, "moveMoneyHistory");
                        moveMoneyHistory.setVisibility(internationalTransfersHubViewState.isCompletedHistoryVisible() ? 0 : 8);
                        binding.moveMoneyHistory.bind(internationalTransfersHubViewState.getCompletedHistoryItems());
                        binding.moveMoneyHistory.setCallbacks(internationalTransfersHubFragment2);
                        internationalTransfersHubFragment2.bindWithdrawableCashInfo(internationalTransfersHubViewState.getWithdrawableAmountState());
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

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void onRecentHistoryShowAllClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.TRANSFERS, null, null, false, null, 61, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindWithdrawableCashInfo(final WithdrawableCashState state) {
        if (state == null) {
            return;
        }
        FragmentI18nTransfersHubBinding binding = getBinding();
        if (state instanceof WithdrawableCashState.Sdui) {
            ComposeView withdrawableCashInfoView = binding.withdrawableCashInfoView;
            Intrinsics.checkNotNullExpressionValue(withdrawableCashInfoView, "withdrawableCashInfoView");
            withdrawableCashInfoView.setVisibility(0);
            binding.withdrawableCashInfoView.setContent(ComposableLambda3.composableLambdaInstance(243807032, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$bindWithdrawableCashInfo$1$1
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
                        ComposerKt.traceEventStart(243807032, i, -1, "com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment.bindWithdrawableCashInfo.<anonymous>.<anonymous> (InternationalTransfersHubFragment.kt:158)");
                    }
                    Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(this.this$0.getScarletManager());
                    final WithdrawableCashState withdrawableCashState = state;
                    final InternationalTransfersHubFragment internationalTransfersHubFragment = this.this$0;
                    BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-803002426, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment$bindWithdrawableCashInfo$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-803002426, i2, -1, "com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment.bindWithdrawableCashInfo.<anonymous>.<anonymous>.<anonymous> (InternationalTransfersHubFragment.kt:159)");
                            }
                            final WithdrawableCashState withdrawableCashState2 = withdrawableCashState;
                            final InternationalTransfersHubFragment internationalTransfersHubFragment2 = internationalTransfersHubFragment;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1044309477, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment.bindWithdrawableCashInfo.1.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i3) {
                                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1044309477, i3, -1, "com.robinhood.android.transfers.i18n.InternationalTransfersHubFragment.bindWithdrawableCashInfo.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternationalTransfersHubFragment.kt:160)");
                                    }
                                    WithdrawableCashInfoSdui.WithdrawableCashInfoSdui(((WithdrawableCashState.Sdui) withdrawableCashState2).getContent(), ScreenViewAnalyticables.getScreenData(internationalTransfersHubFragment2), internationalTransfersHubFragment2.getNavigator(), composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return;
        }
        ComposeView withdrawableCashInfoView2 = binding.withdrawableCashInfoView;
        Intrinsics.checkNotNullExpressionValue(withdrawableCashInfoView2, "withdrawableCashInfoView");
        withdrawableCashInfoView2.setVisibility(8);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30556R.id.dialog_error_not_available_in_region) {
            requireActivity().onBackPressed();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: InternationalTransfersHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubFragment$Args;", "Landroid/os/Parcelable;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CountryCode.Supported locality;

        /* compiled from: InternationalTransfersHubFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((CountryCode.Supported) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, CountryCode.Supported supported, int i, Object obj) {
            if ((i & 1) != 0) {
                supported = args.locality;
            }
            return args.copy(supported);
        }

        /* renamed from: component1, reason: from getter */
        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        public final Args copy(CountryCode.Supported locality) {
            Intrinsics.checkNotNullParameter(locality, "locality");
            return new Args(locality);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.locality, ((Args) other).locality);
        }

        public int hashCode() {
            return this.locality.hashCode();
        }

        public String toString() {
            return "Args(locality=" + this.locality + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.locality);
        }

        public Args(CountryCode.Supported locality) {
            Intrinsics.checkNotNullParameter(locality, "locality");
            this.locality = locality;
        }

        public final CountryCode.Supported getLocality() {
            return this.locality;
        }
    }

    /* compiled from: InternationalTransfersHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubFragment;", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubFragment$Args;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InternationalTransfersHubFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InternationalTransfersHubFragment internationalTransfersHubFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, internationalTransfersHubFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InternationalTransfersHubFragment newInstance(Args args) {
            return (InternationalTransfersHubFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InternationalTransfersHubFragment internationalTransfersHubFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, internationalTransfersHubFragment, args);
        }
    }
}
