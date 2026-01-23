package com.robinhood.android.moneymovement.checkoutflow;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceEvent;
import com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.transfers.contracts.LinkingOptionsIntentKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: PaymentPreferenceFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0016J\r\u0010!\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\"R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "duxo", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDuxo;", "getDuxo", "()Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "lib-money-movements-checkout-flow_externalDebug", "viewState", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PaymentPreferenceFragment extends GenericComposeFragment implements RhDialogFragment.OnClickListener {
    public static final String FUND_ACCOUNT_DEEPLINK = "robinhood://transfer_funds?entry_point=gold_deficit_switch_payment_method_error_alert";
    public static final long SNACKBAR_DURATION_IN_MILLIS = 1500;
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PaymentPreferenceDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(PaymentPreferenceFragment paymentPreferenceFragment, int i, Composer composer, int i2) {
        paymentPreferenceFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentPreferenceDuxo getDuxo() {
        return (PaymentPreferenceDuxo) this.duxo.getValue();
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C222041(null), 3, null);
    }

    /* compiled from: PaymentPreferenceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment$onCreate$1", m3645f = "PaymentPreferenceFragment.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment$onCreate$1 */
    static final class C222041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C222041(Continuation<? super C222041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentPreferenceFragment.this.new C222041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C222041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<PaymentPreferenceEvent>> eventFlow = PaymentPreferenceFragment.this.getDuxo().getEventFlow();
                final PaymentPreferenceFragment paymentPreferenceFragment = PaymentPreferenceFragment.this;
                FlowCollector<? super Event<PaymentPreferenceEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<PaymentPreferenceEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<PaymentPreferenceEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<PaymentPreferenceEvent> eventConsumerInvoke;
                        EventConsumer<PaymentPreferenceEvent> eventConsumerInvoke2;
                        EventConsumer<PaymentPreferenceEvent> eventConsumerInvoke3;
                        EventConsumer<PaymentPreferenceEvent> eventConsumerInvoke4;
                        if (event != null) {
                            final PaymentPreferenceFragment paymentPreferenceFragment2 = paymentPreferenceFragment;
                            if ((event.getData() instanceof PaymentPreferenceEvent.NavigateToAddAccount) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment$onCreate$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m16719invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m16719invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        Navigator navigator = paymentPreferenceFragment2.getNavigator();
                                        Context contextRequireContext = paymentPreferenceFragment2.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LinkingOptionsIntentKey(PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, true), null, false, null, null, 60, null);
                                    }
                                });
                            }
                        }
                        if (event != null) {
                            final PaymentPreferenceFragment paymentPreferenceFragment3 = paymentPreferenceFragment;
                            if ((event.getData() instanceof PaymentPreferenceEvent.Succeed) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment$onCreate$1$1$emit$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m16720invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m16720invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if (((PaymentPreferenceFragmentKey) PaymentPreferenceFragment.INSTANCE.getArgs((Fragment) paymentPreferenceFragment3)).getAutoProceed()) {
                                            RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                                            Snackbars snackbars = Snackbars.INSTANCE;
                                            FragmentActivity fragmentActivityRequireActivity = paymentPreferenceFragment3.requireActivity();
                                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                            companion.make(snackbars.findRoot(fragmentActivityRequireActivity), C22205R.string.generic_payment_preference_auto_update_success_message, -1).setLeadingIcon(C20690R.drawable.ic_rds_checkmark_24dp).show();
                                            BuildersKt__Builders_commonKt.launch$default(paymentPreferenceFragment3.getLifecycleScope(), null, null, new PaymentPreferenceFragment5(paymentPreferenceFragment3, null), 3, null);
                                            return;
                                        }
                                        paymentPreferenceFragment3.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                                    }
                                });
                            }
                        }
                        if (event != null) {
                            final PaymentPreferenceFragment paymentPreferenceFragment4 = paymentPreferenceFragment;
                            if ((event.getData() instanceof PaymentPreferenceEvent.CloseScreen) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment$onCreate$1$1$emit$$inlined$consumeIfType$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m16721invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m16721invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        paymentPreferenceFragment4.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                                    }
                                });
                            }
                        }
                        if (event != null) {
                            final PaymentPreferenceFragment paymentPreferenceFragment5 = paymentPreferenceFragment;
                            if ((event.getData() instanceof PaymentPreferenceEvent.Error) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment$onCreate$1$1$emit$$inlined$consumeIfType$4
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m16722invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m16722invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if (((PaymentPreferenceFragmentKey) PaymentPreferenceFragment.INSTANCE.getArgs((Fragment) paymentPreferenceFragment5)).isDeficitImprovement()) {
                                            Context contextRequireContext = paymentPreferenceFragment5.requireContext();
                                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                            RhDialogFragment.Builder negativeButton = new RhDialogFragment.Builder(contextRequireContext).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C22205R.id.deficit_improvement_error_dialog).setTitle(paymentPreferenceFragment5.getString(C22205R.string.generic_payment_preference_error_alert_header)).setMessage(C22205R.string.gated_gold_payment_preference_deficit_case_error_alert_message, new Object[0]).setPositiveButton(C22205R.string.f4693x1226451b, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
                                            FragmentManager childFragmentManager = paymentPreferenceFragment5.getChildFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                            RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "payment-preference-retrieval-error-deficit-improvement", false, 4, null);
                                            return;
                                        }
                                        Context contextRequireContext2 = paymentPreferenceFragment5.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                        RhDialogFragment.Builder positiveButton = new RhDialogFragment.Builder(contextRequireContext2).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C22205R.id.payment_preference_error_dialog).setTitle(paymentPreferenceFragment5.getString(C22205R.string.generic_payment_preference_error_alert_header)).setMessage(C22205R.string.generic_payment_preference_error_alert_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
                                        FragmentManager childFragmentManager2 = paymentPreferenceFragment5.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager2, "payment-preference-retrieval-error", false, 4, null);
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C22205R.id.deficit_improvement_error_dialog) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(FUND_ACCOUNT_DEEPLINK), null, null, false, null, 60, null);
            requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return true;
        }
        if (id == C22205R.id.payment_preference_error_dialog) {
            if (((PaymentPreferenceFragmentKey) INSTANCE.getArgs((Fragment) this)).getAutoProceed()) {
                requireActivity().getOnBackPressedDispatcher().onBackPressed();
            } else {
                super.onPositiveButtonClicked(id, passthroughArgs);
            }
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C22205R.id.deficit_improvement_error_dialog) {
            requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1489705496);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1489705496, i2, -1, "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent (PaymentPreferenceFragment.kt:174)");
            }
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), null, ComposableLambda3.rememberComposableLambda(-838286390, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-838286390, i3, -1, "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent.<anonymous> (PaymentPreferenceFragment.kt:176)");
                    }
                    ProvidedValue<UserInteractionEventDescriptor> providedValueProvides = AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.GOLD_BILLING_PAYMENT_PREFERENCE, null, null, null, 14, null), null, null, null, null, 61, null));
                    final PaymentPreferenceFragment paymentPreferenceFragment = PaymentPreferenceFragment.this;
                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(441026698, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(441026698, i4, -1, "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent.<anonymous>.<anonymous> (PaymentPreferenceFragment.kt:183)");
                            }
                            final PaymentPreferenceFragment paymentPreferenceFragment2 = paymentPreferenceFragment;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-662167595, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent.1.1.1
                                public final void invoke(Composer composer4, int i5) {
                                    SnapshotState4 snapshotState4;
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-662167595, i5, -1, "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (PaymentPreferenceFragment.kt:184)");
                                    }
                                    Composer composer5 = composer4;
                                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(paymentPreferenceFragment2.getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer5, 0, 7);
                                    composer5.startReplaceGroup(-687889158);
                                    if (((PaymentPreferenceFragmentKey) PaymentPreferenceFragment.INSTANCE.getArgs((Fragment) paymentPreferenceFragment2)).getAutoProceed()) {
                                        snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                    } else {
                                        Modifier modifierAlpha = Alpha.alpha(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), invoke$lambda$0(snapshotState4CollectAsStateWithLifecycle).getPageLoading() ? 0.0f : 1.0f);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i6 = BentoTheme.$stable;
                                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer5, i6).m21371getBg0d7_KjU();
                                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer5, i6).m21425getFg0d7_KjU();
                                        final PaymentPreferenceFragment paymentPreferenceFragment3 = paymentPreferenceFragment2;
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(491232500, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent.1.1.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                invoke(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer6, int i7) {
                                                if ((i7 & 3) == 2 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(491232500, i7, -1, "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentPreferenceFragment.kt:188)");
                                                }
                                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(PaymentPreferenceFragment2.INSTANCE.m2213xf741452c(), null, ComposableLambda3.rememberComposableLambda(1706987765, true, new C503041(paymentPreferenceFragment3), composer6, 54), null, null, false, false, null, null, 0L, null, composer6, 390, 0, 2042);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            /* compiled from: PaymentPreferenceFragment.kt */
                                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                            @SourceDebugExtension
                                            /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment$ComposeContent$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                            static final class C503041 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                                final /* synthetic */ PaymentPreferenceFragment this$0;

                                                C503041(PaymentPreferenceFragment paymentPreferenceFragment) {
                                                    this.this$0 = paymentPreferenceFragment;
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                                    invoke(bentoAppBarScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                    if ((i & 6) == 0) {
                                                        i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                                    }
                                                    if ((i & 19) == 18 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1706987765, i, -1, "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentPreferenceFragment.kt:191)");
                                                    }
                                                    composer.startReplaceGroup(5004770);
                                                    boolean zChangedInstance = composer.changedInstance(this.this$0);
                                                    final PaymentPreferenceFragment paymentPreferenceFragment = this.this$0;
                                                    Object objRememberedValue = composer.rememberedValue();
                                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment$ComposeContent$1$1$1$1$1$$ExternalSyntheticLambda0
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return PaymentPreferenceFragment.C222031.AnonymousClass1.C503021.C503031.C503041.invoke$lambda$1$lambda$0(paymentPreferenceFragment);
                                                            }
                                                        };
                                                        composer.updateRememberedValue(objRememberedValue);
                                                    }
                                                    composer.endReplaceGroup();
                                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                /* JADX INFO: Access modifiers changed from: private */
                                                public static final Unit invoke$lambda$1$lambda$0(PaymentPreferenceFragment paymentPreferenceFragment) {
                                                    EventLogger.DefaultImpls.logTap$default(paymentPreferenceFragment.getEventLogger(), UserInteractionEventData.Action.BACK, new Screen(Screen.Name.GOLD_BILLING_PAYMENT_PREFERENCE, null, null, null, 14, null), new Component(null, TestTags.BACK, null, 5, null), null, null, false, 56, null);
                                                    paymentPreferenceFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }, composer5, 54);
                                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1408683979, true, new AnonymousClass2(paymentPreferenceFragment2, snapshotState4CollectAsStateWithLifecycle), composer5, 54);
                                        final PaymentPreferenceFragment paymentPreferenceFragment4 = paymentPreferenceFragment2;
                                        snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierAlpha, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(793503103, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent.1.1.1.3
                                            public final void invoke(PaddingValues paddingValues, Composer composer6, int i7) {
                                                int i8;
                                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                                if ((i7 & 6) == 0) {
                                                    i8 = i7 | (composer6.changed(paddingValues) ? 4 : 2);
                                                } else {
                                                    i8 = i7;
                                                }
                                                if ((i8 & 19) == 18 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(793503103, i8, -1, "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentPreferenceFragment.kt:219)");
                                                }
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                                                SnapshotState4<PaymentPreferenceViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                                                PaymentPreferenceFragment paymentPreferenceFragment5 = paymentPreferenceFragment4;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierPadding);
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                if (composer6.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                Column6 column6 = Column6.INSTANCE;
                                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                                int i9 = BentoTheme.$stable;
                                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C503021.invoke$lambda$0(snapshotState42).getTitleResId(), composer6, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme2.getSpacing(composer6, i9).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer6, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer6, i9).m21592getMediumD9Ej5fM(), 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer6, i9).getDisplayCapsuleSmall(), composer6, 0, 0, 8188);
                                                RemoteMicrogramApplication accountSelectorMicrogramSource = C503021.invoke$lambda$0(snapshotState42).getAccountSelectorMicrogramSource();
                                                composer6.startReplaceGroup(1404818858);
                                                if (accountSelectorMicrogramSource != null) {
                                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), bentoTheme2.getSpacing(composer6, i9).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer6, i9).m21592getMediumD9Ej5fM(), 0.0f, 10, null);
                                                    FragmentManager childFragmentManager = paymentPreferenceFragment5.getChildFragmentManager();
                                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                                    MicrogramEmbeddedSection3.MicrogramEmbeddedSection(accountSelectorMicrogramSource, childFragmentManager, modifierM5146paddingqDBjuR0$default, "be_embedded", PaymentPreferenceFragment2.INSTANCE.m2212xd7febb2e(), null, null, false, null, composer6, 27648, 480);
                                                }
                                                composer6.endReplaceGroup();
                                                composer6.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer6, Integer num) {
                                                invoke(paddingValues, composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }
                                        }, composer5, 54), composer4, 805306800, EnumC7081g.f2774x74902ae0);
                                        composer5 = composer4;
                                    }
                                    composer5.endReplaceGroup();
                                    if (invoke$lambda$0(snapshotState4).getPageLoading()) {
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierSystemBarsPadding);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 3, composer5, 3504, 1);
                                        composer4.endNode();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final PaymentPreferenceViewState invoke$lambda$0(SnapshotState4<PaymentPreferenceViewState> snapshotState4) {
                                    return snapshotState4.getValue();
                                }

                                /* compiled from: PaymentPreferenceFragment.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment$ComposeContent$1$1$1$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ SnapshotState4<PaymentPreferenceViewState> $viewState$delegate;
                                    final /* synthetic */ PaymentPreferenceFragment this$0;

                                    AnonymousClass2(PaymentPreferenceFragment paymentPreferenceFragment, SnapshotState4<PaymentPreferenceViewState> snapshotState4) {
                                        this.this$0 = paymentPreferenceFragment;
                                        this.$viewState$delegate = snapshotState4;
                                    }

                                    public final void invoke(Composer composer, int i) {
                                        if ((i & 3) == 2 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1408683979, i, -1, "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentPreferenceFragment.kt:249)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i2 = BentoTheme.$stable;
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 10, null);
                                        final PaymentPreferenceFragment paymentPreferenceFragment = this.this$0;
                                        SnapshotState4<PaymentPreferenceViewState> snapshotState4 = this.$viewState$delegate;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        if (composer.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer.startReusableNode();
                                        if (composer.getInserting()) {
                                            composer.createNode(constructor);
                                        } else {
                                            composer.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        final UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
                                        String strStringResource = StringResources_androidKt.stringResource(C22205R.string.payment_preference_disclosure, composer, 0);
                                        MarkdownStyle markdownStyleM16260copyR0sFphs$default = MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer, BentoMarkdownText.$stable), null, null, null, null, null, null, null, 0L, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), null, 1535, null);
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance = composer.changedInstance(uriHandler) | composer.changedInstance(paymentPreferenceFragment);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment$ComposeContent$1$1$1$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return PaymentPreferenceFragment.C222031.AnonymousClass1.C503021.AnonymousClass2.invoke$lambda$4$lambda$1$lambda$0(uriHandler, paymentPreferenceFragment, (String) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        BentoMarkdownText2.BentoMarkdownText(strStringResource, (Modifier) null, markdownStyleM16260copyR0sFphs$default, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer, MarkdownStyle.$stable << 6, 10);
                                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 5, null);
                                        String strStringResource2 = StringResources_androidKt.stringResource(C503021.invoke$lambda$0(snapshotState4).getCtaTextResId(), composer, 0);
                                        boolean showLoadingOnButton = C503021.invoke$lambda$0(snapshotState4).getShowLoadingOnButton();
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer.changedInstance(paymentPreferenceFragment);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment$ComposeContent$1$1$1$2$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return PaymentPreferenceFragment.C222031.AnonymousClass1.C503021.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2(paymentPreferenceFragment);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierM5146paddingqDBjuR0$default2, null, null, false, showLoadingOnButton, null, null, null, null, false, null, composer, 0, 0, 8120);
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$4$lambda$1$lambda$0(UriHandler uriHandler, PaymentPreferenceFragment paymentPreferenceFragment, String uri) {
                                        Intrinsics.checkNotNullParameter(uri, "uri");
                                        uriHandler.openUri(uri);
                                        EventLogger.DefaultImpls.logTap$default(paymentPreferenceFragment.getEventLogger(), UserInteractionEventData.Action.VIEW_GOLD_BILLING_DISCLOSURES_STATEMENT, new Screen(Screen.Name.GOLD_BILLING_PAYMENT_PREFERENCE, null, null, null, 14, null), new Component(null, OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, null, 5, null), null, null, false, 56, null);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$4$lambda$3$lambda$2(PaymentPreferenceFragment paymentPreferenceFragment) {
                                        paymentPreferenceFragment.getDuxo().onCtaClicked();
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentPreferenceFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PaymentPreferenceFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceFragment;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceFragmentKey;", "<init>", "()V", "SNACKBAR_DURATION_IN_MILLIS", "", "FUND_ACCOUNT_DEEPLINK", "", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PaymentPreferenceFragment, PaymentPreferenceFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(PaymentPreferenceFragmentKey paymentPreferenceFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, paymentPreferenceFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PaymentPreferenceFragmentKey getArgs(PaymentPreferenceFragment paymentPreferenceFragment) {
            return (PaymentPreferenceFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, paymentPreferenceFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PaymentPreferenceFragment newInstance(PaymentPreferenceFragmentKey paymentPreferenceFragmentKey) {
            return (PaymentPreferenceFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, paymentPreferenceFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PaymentPreferenceFragment paymentPreferenceFragment, PaymentPreferenceFragmentKey paymentPreferenceFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, paymentPreferenceFragment, paymentPreferenceFragmentKey);
        }
    }
}
