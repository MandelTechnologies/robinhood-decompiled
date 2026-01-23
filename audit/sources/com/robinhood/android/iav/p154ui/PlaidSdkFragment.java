package com.robinhood.android.iav.p154ui;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.plaid.link.Plaid;
import com.plaid.link.PlaidKotlinFunctionsKt;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkResultHandler;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.iav.C18470R;
import com.robinhood.android.iav.p154ui.PlaidSdkEvent;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.IAVContext;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import java.util.UUID;
import kotlin.Function;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
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

/* compiled from: PlaidSdkFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 O2\u00020\u0001:\u0002NOB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u00107\u001a\u0002022\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0016\u0010<\u001a\u0002022\f\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002J\u0012\u0010@\u001a\u0002022\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\"\u0010A\u001a\u0002022\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020C2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\u0010\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020CH\u0016J\b\u0010I\u001a\u000201H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b+\u0010,R \u0010.\u001a\u0014\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\u000204X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u0010J\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidSdkFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "linkEventListener", "Lcom/robinhood/android/iav/ui/PlaidLinkEventListener;", "getLinkEventListener", "()Lcom/robinhood/android/iav/ui/PlaidLinkEventListener;", "setLinkEventListener", "(Lcom/robinhood/android/iav/ui/PlaidLinkEventListener;)V", "rhProcessLifecycleOwner", "Ldagger/Lazy;", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "getRhProcessLifecycleOwner", "()Ldagger/Lazy;", "setRhProcessLifecycleOwner", "(Ldagger/Lazy;)V", "callbacks", "Lcom/robinhood/android/iav/ui/PlaidSdkFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/iav/ui/PlaidSdkFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/iav/ui/PlaidSdkDuxo;", "getDuxo", "()Lcom/robinhood/android/iav/ui/PlaidSdkDuxo;", "duxo$delegate", "Lkotlin/Lazy;", PlaidSdkFragment.ARG_IAV_SOURCE, "Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "getIavSource", "()Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "iavSource$delegate", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "plaidLinkActivityResultHandler", "Lcom/plaid/link/result/LinkResultHandler;", "getPlaidLinkActivityResultHandler$feature_iav_externalDebug", "()Lcom/plaid/link/result/LinkResultHandler;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/iav/ui/PlaidSdkEvent;", "onCreate", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onDialogDismissed", "id", "onBackPressed", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "Callbacks", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PlaidSdkFragment extends BaseFragment {
    private static final String ARG_IAV_SOURCE = "iavSource";
    public AnalyticsLogger analytics;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: iavSource$delegate, reason: from kotlin metadata */
    private final Lazy iavSource;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    public PlaidLinkEventListener linkEventListener;
    private final LinkResultHandler plaidLinkActivityResultHandler;
    public dagger.Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PlaidSdkFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/iav/ui/PlaidSdkFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PlaidSdkFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidSdkFragment$Callbacks;", "", "onPlaidAccessTokenGranted", "", "plaidAccessToken", "", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "plaidLinkAccounts", "", "Lcom/plaid/link/result/LinkAccount;", "onPlaidIavExited", "onManualLinkingFlowRequested", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onManualLinkingFlowRequested(PlaidIavMetadata plaidIavMetadata);

        void onPlaidAccessTokenGranted(String plaidAccessToken, PlaidIavMetadata plaidIavMetadata, List<LinkAccount> plaidLinkAccounts);

        void onPlaidIavExited();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<PlaidSdkEvent> event) {
        EventConsumer<PlaidSdkEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof PlaidSdkEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.iav.ui.PlaidSdkFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                m15266invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15266invoke(Object it) throws Throwable {
                Intrinsics.checkNotNullParameter(it, "it");
                final PlaidSdkEvent plaidSdkEvent = (PlaidSdkEvent) event.getData();
                if (plaidSdkEvent instanceof PlaidSdkEvent.ErrorEvent) {
                    PlaidSdkEvent.ErrorEvent errorEvent = (PlaidSdkEvent.ErrorEvent) plaidSdkEvent;
                    if (!(errorEvent.getThrowable() instanceof ClassCastException)) {
                        this.getCallbacks().onManualLinkingFlowRequested(null);
                        this.getDuxo().setHasLauchedMicrodepositsFlow(true);
                        return;
                    }
                    throw errorEvent.getThrowable();
                }
                if (plaidSdkEvent instanceof PlaidSdkEvent.LinkTokenEvent) {
                    Application application = this.requireActivity().getApplication();
                    Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                    Plaid.create(application, PlaidKotlinFunctionsKt.linkTokenConfiguration(new Function1<LinkTokenConfiguration.Builder, Unit>() { // from class: com.robinhood.android.iav.ui.PlaidSdkFragment$handleEvent$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LinkTokenConfiguration.Builder builder) {
                            invoke2(builder);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LinkTokenConfiguration.Builder linkTokenConfiguration) {
                            Intrinsics.checkNotNullParameter(linkTokenConfiguration, "$this$linkTokenConfiguration");
                            linkTokenConfiguration.setToken(((PlaidSdkEvent.LinkTokenEvent) plaidSdkEvent).getToken());
                        }
                    })).open(this);
                } else {
                    if (plaidSdkEvent instanceof PlaidSdkEvent.VerificationWorkflowEvent) {
                        PlaidSdkEvent.VerificationWorkflowEvent verificationWorkflowEvent = (PlaidSdkEvent.VerificationWorkflowEvent) plaidSdkEvent;
                        this.launchSuv.invoke(verificationWorkflowEvent.getWorkflowId(), Boolean.valueOf(verificationWorkflowEvent.isMigrated()));
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    public PlaidSdkFragment() {
        super(C18470R.layout.fragment_plaid_sdk);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.iav.ui.PlaidSdkFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = DuxosKt.duxo(this, PlaidSdkDuxo.class);
        this.iavSource = Fragments2.argument(this, ARG_IAV_SOURCE);
        this.launchSuv = SuvLauncher.registerSuvLauncher((Fragment) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.iav.ui.PlaidSdkFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.iav.ui.PlaidSdkFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlaidSdkFragment.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.iav.ui.PlaidSdkFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlaidSdkFragment.launchSuv$lambda$2(this.f$0);
            }
        });
        this.plaidLinkActivityResultHandler = new LinkResultHandler(new Function1() { // from class: com.robinhood.android.iav.ui.PlaidSdkFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidSdkFragment.plaidLinkActivityResultHandler$lambda$3(this.f$0, (LinkSuccess) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.iav.ui.PlaidSdkFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidSdkFragment.plaidLinkActivityResultHandler$lambda$4(this.f$0, (LinkExit) obj);
            }
        });
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

    public final PlaidLinkEventListener getLinkEventListener() {
        PlaidLinkEventListener plaidLinkEventListener = this.linkEventListener;
        if (plaidLinkEventListener != null) {
            return plaidLinkEventListener;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linkEventListener");
        return null;
    }

    public final void setLinkEventListener(PlaidLinkEventListener plaidLinkEventListener) {
        Intrinsics.checkNotNullParameter(plaidLinkEventListener, "<set-?>");
        this.linkEventListener = plaidLinkEventListener;
    }

    public final dagger.Lazy<RhProcessLifecycleOwner> getRhProcessLifecycleOwner() {
        dagger.Lazy<RhProcessLifecycleOwner> lazy = this.rhProcessLifecycleOwner;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhProcessLifecycleOwner");
        return null;
    }

    public final void setRhProcessLifecycleOwner(dagger.Lazy<RhProcessLifecycleOwner> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.rhProcessLifecycleOwner = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlaidSdkDuxo getDuxo() {
        return (PlaidSdkDuxo) this.duxo.getValue();
    }

    private final IavSource getIavSource() {
        return (IavSource) this.iavSource.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(PlaidSdkFragment plaidSdkFragment) {
        plaidSdkFragment.getDuxo().getLinkToken();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(PlaidSdkFragment plaidSdkFragment) {
        plaidSdkFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* renamed from: getPlaidLinkActivityResultHandler$feature_iav_externalDebug, reason: from getter */
    public final LinkResultHandler getPlaidLinkActivityResultHandler() {
        return this.plaidLinkActivityResultHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit plaidLinkActivityResultHandler$lambda$3(PlaidSdkFragment plaidSdkFragment, LinkSuccess linkSuccess) {
        String name;
        String id;
        Intrinsics.checkNotNullParameter(linkSuccess, "linkSuccess");
        LinkSuccessMetadata metadata = linkSuccess.getMetadata();
        EventLogger eventLogger = plaidSdkFragment.getEventLogger();
        String string2 = ExtensionsKt.getSessionId(plaidSdkFragment).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        IAVContext iAVContext = new IAVContext(null, string2, null, null, 13, null);
        PlaidEventData.Event event = PlaidEventData.Event.ON_SUCCESS;
        LinkInstitution institution = metadata.getInstitution();
        String str = (institution == null || (id = institution.getId()) == null) ? "" : id;
        LinkInstitution institution2 = metadata.getInstitution();
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.PLAID_IAV, null, null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.IAV, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PlaidEventData(event, null, null, null, null, null, null, str, (institution2 == null || (name = institution2.getName()) == null) ? "" : name, null, metadata.getLinkSessionId(), null, null, null, null, null, null, plaidSdkFragment.getIavSource().getAnalyticsTag(), null, null, 916094, null), iAVContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -49153, -1, -1, -1, -1, 16383, null), null, null, 110, null), false, false, 6, null);
        AnalyticsLogger analytics = plaidSdkFragment.getAnalytics();
        LinkInstitution institution3 = metadata.getInstitution();
        String id2 = institution3 != null ? institution3.getId() : null;
        LinkInstitution institution4 = metadata.getInstitution();
        analytics.logPlaidLinkConnection(id2, institution4 != null ? institution4.getName() : null, metadata.getLinkSessionId(), plaidSdkFragment.getIavSource().getAnalyticsTag());
        Callbacks callbacks = plaidSdkFragment.getCallbacks();
        String publicToken = linkSuccess.getPublicToken();
        String linkSessionId = metadata.getLinkSessionId();
        LinkInstitution institution5 = metadata.getInstitution();
        String id3 = institution5 != null ? institution5.getId() : null;
        LinkInstitution institution6 = metadata.getInstitution();
        callbacks.onPlaidAccessTokenGranted(publicToken, new PlaidIavMetadata(linkSessionId, id3, institution6 != null ? institution6.getName() : null, plaidSdkFragment.getIavSource().getAnalyticsTag()), metadata.getAccounts());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit plaidLinkActivityResultHandler$lambda$4(PlaidSdkFragment plaidSdkFragment, LinkExit linkExit) {
        LinkErrorCode errorCode;
        String jsonValue;
        String name;
        String id;
        String errorMessage;
        LinkErrorCode errorCode2;
        LinkErrorCode errorCode3;
        String json;
        Intrinsics.checkNotNullParameter(linkExit, "linkExit");
        EventLogger eventLogger = plaidSdkFragment.getEventLogger();
        String string2 = ExtensionsKt.getSessionId(plaidSdkFragment).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        IAVContext iAVContext = new IAVContext(null, string2, null, null, 13, null);
        LinkError error = linkExit.getError();
        String str = (error == null || (errorCode3 = error.getErrorCode()) == null || (json = errorCode3.getJson()) == null) ? "" : json;
        LinkError error2 = linkExit.getError();
        String string3 = (error2 == null || (errorCode2 = error2.getErrorCode()) == null) ? null : errorCode2.toString();
        String str2 = string3 == null ? "" : string3;
        LinkError error3 = linkExit.getError();
        String str3 = (error3 == null || (errorMessage = error3.getErrorMessage()) == null) ? "" : errorMessage;
        PlaidEventData.Event event = PlaidEventData.Event.ON_EXIT;
        LinkInstitution institution = linkExit.getMetadata().getInstitution();
        String str4 = (institution == null || (id = institution.getId()) == null) ? "" : id;
        LinkInstitution institution2 = linkExit.getMetadata().getInstitution();
        String str5 = (institution2 == null || (name = institution2.getName()) == null) ? "" : name;
        String linkSessionId = linkExit.getMetadata().getLinkSessionId();
        String str6 = linkSessionId == null ? "" : linkSessionId;
        String requestId = linkExit.getMetadata().getRequestId();
        String str7 = requestId == null ? "" : requestId;
        LinkExitMetadataStatus status = linkExit.getMetadata().getStatus();
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.PLAID_IAV, null, null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.IAV, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PlaidEventData(event, null, str2, str3, str, null, "", str4, str5, null, str6, null, str7, null, null, (status == null || (jsonValue = status.getJsonValue()) == null) ? "" : jsonValue, null, plaidSdkFragment.getIavSource().getAnalyticsTag(), null, null, 879138, null), iAVContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -49153, -1, -1, -1, -1, 16383, null), null, null, 110, null), false, false, 6, null);
        AnalyticsLogger analytics = plaidSdkFragment.getAnalytics();
        LinkError error4 = linkExit.getError();
        String json2 = (error4 == null || (errorCode = error4.getErrorCode()) == null) ? null : errorCode.getJson();
        LinkError error5 = linkExit.getError();
        String strValueOf = String.valueOf(error5 != null ? error5.getErrorCode() : null);
        LinkError error6 = linkExit.getError();
        String errorMessage2 = error6 != null ? error6.getErrorMessage() : null;
        LinkInstitution institution3 = linkExit.getMetadata().getInstitution();
        String id2 = institution3 != null ? institution3.getId() : null;
        LinkInstitution institution4 = linkExit.getMetadata().getInstitution();
        String name2 = institution4 != null ? institution4.getName() : null;
        String linkSessionId2 = linkExit.getMetadata().getLinkSessionId();
        String requestId2 = linkExit.getMetadata().getRequestId();
        LinkExitMetadataStatus status2 = linkExit.getMetadata().getStatus();
        analytics.logPlaidExitEvent(json2, strValueOf, errorMessage2, null, id2, name2, linkSessionId2, requestId2, status2 != null ? status2.getJsonValue() : null, plaidSdkFragment.getIavSource().getAnalyticsTag());
        if (linkExit.getMetadata().getStatus() instanceof LinkExitMetadataStatus.INSTITUTION_NOT_FOUND) {
            Callbacks callbacks = plaidSdkFragment.getCallbacks();
            String linkSessionId3 = linkExit.getMetadata().getLinkSessionId();
            LinkInstitution institution5 = linkExit.getMetadata().getInstitution();
            String id3 = institution5 != null ? institution5.getId() : null;
            LinkInstitution institution6 = linkExit.getMetadata().getInstitution();
            callbacks.onManualLinkingFlowRequested(new PlaidIavMetadata(linkSessionId3, id3, institution6 != null ? institution6.getName() : null, plaidSdkFragment.getIavSource().getAnalyticsTag()));
        } else if (ExtensionsKt.isInvalidLinkTokenError(linkExit)) {
            plaidSdkFragment.getDuxo().getLinkToken();
        } else {
            plaidSdkFragment.getCallbacks().onPlaidIavExited();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PlaidSdkFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidSdkFragment$onViewCreated$1", m3645f = "PlaidSdkFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.PlaidSdkFragment$onViewCreated$1 */
    static final class C185021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C185021(Continuation<? super C185021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlaidSdkFragment.this.new C185021(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C185021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PlaidSdkFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.iav.ui.PlaidSdkFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ PlaidSdkFragment $tmp0;

            AnonymousClass1(PlaidSdkFragment plaidSdkFragment) {
                this.$tmp0 = plaidSdkFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, PlaidSdkFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<PlaidSdkEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C185021.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<PlaidSdkEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(PlaidSdkFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PlaidSdkFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(PlaidSdkFragment plaidSdkFragment, Event event, Continuation continuation) {
            plaidSdkFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C185021(null), 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLinkEventListener().setIavSource(getIavSource());
        Plaid.setLinkEventListener(getLinkEventListener());
        if (savedInstanceState == null) {
            getRhProcessLifecycleOwner().get().useExtendedTimeout();
            getLinkEventListener().onNewSession(ExtensionsKt.getSessionId(this));
            getDuxo().getLinkToken();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.plaidLinkActivityResultHandler.onActivityResult(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.iav.ui.PlaidConnectionFragment");
        return ((PlaidConnectionFragment) fragmentRequireParentFragment).getProfileId();
    }

    /* compiled from: PlaidSdkFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidSdkFragment$Companion;", "", "<init>", "()V", "ARG_IAV_SOURCE", "", "newInstance", "Lcom/robinhood/android/iav/ui/PlaidSdkFragment;", PlaidSdkFragment.ARG_IAV_SOURCE, "Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlaidSdkFragment newInstance(IavSource iavSource) {
            Intrinsics.checkNotNullParameter(iavSource, "iavSource");
            PlaidSdkFragment plaidSdkFragment = new PlaidSdkFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(PlaidSdkFragment.ARG_IAV_SOURCE, iavSource);
            plaidSdkFragment.setArguments(bundle);
            return plaidSdkFragment;
        }
    }
}
