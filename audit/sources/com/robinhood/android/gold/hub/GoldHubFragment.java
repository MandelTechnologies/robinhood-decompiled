package com.robinhood.android.gold.hub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.gold.contracts.GoldDowngradeIntentKey;
import com.robinhood.android.gold.contracts.GoldHubFragmentKey;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.moneymovement.checkoutflow.C22205R;
import com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo;
import com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceEvent;
import com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragmentKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: GoldHubFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\r\u00101\u001a\u00020.H\u0017¢\u0006\u0002\u00102J\b\u00103\u001a\u00020.H\u0016J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u00020!H\u0002J\u0010\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u00020=H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR;\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R;\u0010)\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010(\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R\u001c\u00107\u001a\u0010\u0012\f\u0012\n :*\u0004\u0018\u0001090908X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?²\u0006\n\u0010@\u001a\u00020AX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/GoldHubFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/gold/hub/GoldHubDuxo;", "getDuxo", "()Lcom/robinhood/android/gold/hub/GoldHubDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "mmDuxo", "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo;", "getMmDuxo", "()Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo;", "mmDuxo$delegate", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventContext$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "<set-?>", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;", "modal", "getModal", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "setModal", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "modal$delegate", "Landroidx/compose/runtime/MutableState;", "bottomSheet", "getBottomSheet", "setBottomSheet", "bottomSheet$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onStop", "onAction", "", "action", "resultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Companion", "feature-gold-hub_externalDebug", "viewState", "Lcom/robinhood/android/gold/hub/GoldHubViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldHubFragment extends GenericActionHandlingFragment implements AutoLoggableFragment {
    private final ActivityResultLauncher<Intent> resultLauncher;
    public SurveyManager3 userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, GoldHubDuxo.class);

    /* renamed from: mmDuxo$delegate, reason: from kotlin metadata */
    private final Lazy mmDuxo = DuxosKt.duxo(this, MoneyMovementPaymentPreferenceCellDuxo.class);

    /* renamed from: screenEventContext$delegate, reason: from kotlin metadata */
    private final Lazy screenEventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.gold.hub.GoldHubFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GoldHubFragment.screenEventContext_delegate$lambda$0(this.f$0);
        }
    });
    private final Screen eventScreen = new Screen(Screen.Name.GOLD_HUB, null, null, null, 14, null);

    /* renamed from: modal$delegate, reason: from kotlin metadata */
    private final SnapshotState modal = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* renamed from: bottomSheet$delegate, reason: from kotlin metadata */
    private final SnapshotState bottomSheet = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* compiled from: GoldHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
            try {
                iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(GoldHubFragment goldHubFragment, int i, Composer composer, int i2) {
        goldHubFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public GoldHubFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.gold.hub.GoldHubFragment$resultLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.getUserLeapManager().setPendingSurvey(Survey.GOLD_DOWNGRADE);
                    if (((GoldHubFragmentKey) GoldHubFragment.INSTANCE.getArgs((Fragment) this.this$0)).getShownInTab()) {
                        return;
                    }
                    this.this$0.requireActivity().finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.resultLauncher = activityResultLauncherRegisterForActivityResult;
    }

    private final GoldHubDuxo getDuxo() {
        return (GoldHubDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MoneyMovementPaymentPreferenceCellDuxo getMmDuxo() {
        return (MoneyMovementPaymentPreferenceCellDuxo) this.mmDuxo.getValue();
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return (Context) this.screenEventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context screenEventContext_delegate$lambda$0(GoldHubFragment goldHubFragment) {
        Context.ProductTag productTag = Context.ProductTag.GOLD;
        String loggingEntrypoint = ((GoldHubFragmentKey) INSTANCE.getArgs((Fragment) goldHubFragment)).getLoggingEntrypoint();
        if (loggingEntrypoint == null) {
            loggingEntrypoint = "unset";
        }
        return new Context(0, 0, 0, null, null, null, null, productTag, 0, null, loggingEntrypoint, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -1, -1, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final GenericAlertContent<GoldHubAction> getModal() {
        return (GenericAlertContent) this.modal.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setModal(GenericAlertContent<? extends GoldHubAction> genericAlertContent) {
        this.modal.setValue(genericAlertContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final GenericAlertContent<GoldHubAction> getBottomSheet() {
        return (GenericAlertContent) this.bottomSheet.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBottomSheet(GenericAlertContent<? extends GoldHubAction> genericAlertContent) {
        this.bottomSheet.setValue(genericAlertContent);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C177821(null), 3, null);
    }

    /* compiled from: GoldHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.hub.GoldHubFragment$onCreate$1", m3645f = "GoldHubFragment.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.hub.GoldHubFragment$onCreate$1 */
    static final class C177821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C177821(Continuation<? super C177821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldHubFragment.this.new C177821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C177821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<MoneyMovementPaymentPreferenceEvent>> eventFlow = GoldHubFragment.this.getMmDuxo().getEventFlow();
                final GoldHubFragment goldHubFragment = GoldHubFragment.this;
                FlowCollector<? super Event<MoneyMovementPaymentPreferenceEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.gold.hub.GoldHubFragment.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<MoneyMovementPaymentPreferenceEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<MoneyMovementPaymentPreferenceEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<MoneyMovementPaymentPreferenceEvent> eventConsumerInvoke;
                        EventConsumer<MoneyMovementPaymentPreferenceEvent> eventConsumerInvoke2;
                        EventConsumer<MoneyMovementPaymentPreferenceEvent> eventConsumerInvoke3;
                        if (event != null) {
                            final GoldHubFragment goldHubFragment2 = goldHubFragment;
                            if ((event.getData() instanceof MoneyMovementPaymentPreferenceEvent.NavigateToAccountSelection) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.gold.hub.GoldHubFragment$onCreate$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m15042invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m15042invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        MoneyMovementPaymentPreferenceEvent.NavigateToAccountSelection navigateToAccountSelection = (MoneyMovementPaymentPreferenceEvent.NavigateToAccountSelection) event.getData();
                                        Navigator navigator = goldHubFragment2.getNavigator();
                                        android.content.Context contextRequireContext = goldHubFragment2.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new PaymentPreferenceFragmentKey(false, false, navigateToAccountSelection.getAccountToPreselect(), null, 11, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                                    }
                                });
                            }
                        }
                        if (event != null && (event.getData() instanceof MoneyMovementPaymentPreferenceEvent.UnexpectedState) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.gold.hub.GoldHubFragment$onCreate$1$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m15043invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15043invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("Unexpected error occurred showing payment preference cell"), false, null, 4, null);
                                }
                            });
                        }
                        if (event != null) {
                            final GoldHubFragment goldHubFragment3 = goldHubFragment;
                            if ((event.getData() instanceof MoneyMovementPaymentPreferenceEvent.ShowAlert) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.gold.hub.GoldHubFragment$onCreate$1$1$emit$$inlined$consumeIfType$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m15044invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m15044invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        android.content.Context contextRequireContext = goldHubFragment3.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                        RhDialogFragment.Builder positiveButton = new RhDialogFragment.Builder(contextRequireContext).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(goldHubFragment3.getString(C22205R.string.generic_payment_preference_error_alert_header)).setMessage(C22205R.string.generic_payment_preference_error_alert_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
                                        FragmentManager childFragmentManager = goldHubFragment3.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "payment-preference-retrieval-error", false, 4, null);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldHubViewState ComposeContent$lambda$1(SnapshotState4<? extends GoldHubViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1680335804);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1680335804, i2, -1, "com.robinhood.android.gold.hub.GoldHubFragment.ComposeContent (GoldHubFragment.kt:99)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.gold.hub.GoldHubFragment$ComposeContent$actionHandler$1$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(GoldHubAction action) {
                        Intrinsics.checkNotNullParameter(action, "action");
                        return this.this$0.onAction(action);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new SduiActionHandler() { // from class: com.robinhood.android.gold.hub.GoldHubFragment$ComposeContent$genericActionHandler$1$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(GenericAction action) {
                        Intrinsics.checkNotNullParameter(action, "action");
                        return this.this$0.mo15941handle(action);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SduiActionHandler sduiActionHandler2 = (SduiActionHandler) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            GenericAlertContent<GoldHubAction> bottomSheet = getBottomSheet();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(sduiActionHandler);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new GoldHubFragment2(this, sduiActionHandler, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(bottomSheet, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-2082409233, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.GoldHubFragment.ComposeContent.2
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
                        ComposerKt.traceEventStart(-2082409233, i3, -1, "com.robinhood.android.gold.hub.GoldHubFragment.ComposeContent.<anonymous> (GoldHubFragment.kt:127)");
                    }
                    GoldHubViewState goldHubViewStateComposeContent$lambda$1 = GoldHubFragment.ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle);
                    FragmentActivity fragmentActivityRequireActivity = GoldHubFragment.this.requireActivity();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composer2.changedInstance(fragmentActivityRequireActivity);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new GoldHubFragment3(fragmentActivityRequireActivity);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    boolean z = !((GoldHubFragmentKey) GoldHubFragment.INSTANCE.getArgs((Fragment) GoldHubFragment.this)).getShownInTab();
                    MoneyMovementPaymentPreferenceCellDuxo mmDuxo = GoldHubFragment.this.getMmDuxo();
                    FragmentManager childFragmentManager = GoldHubFragment.this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    GoldHubComposableKt.GoldHubComposable(goldHubViewStateComposeContent$lambda$1, sduiActionHandler, sduiActionHandler2, mmDuxo, (Function0) ((KFunction) objRememberedValue4), childFragmentManager, null, z, composer2, MoneyMovementPaymentPreferenceCellDuxo.$stable << 9, 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            GenericAlertContent<GoldHubAction> modal = getModal();
            if (modal != null) {
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-810850018, true, new GoldHubFragment4(modal, sduiActionHandler, this), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.GoldHubFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldHubFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireBaseActivity().resetStatusBarStyleOverride();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onAction(GoldHubAction action) {
        int iHashCode;
        if (action instanceof GoldHubAction.Deeplink) {
            Uri uri = Uri.parse(((GoldHubAction.Deeplink) action).getValue2().getUri());
            String scheme = uri.getScheme();
            if (scheme != null && ((iHashCode = scheme.hashCode()) == -1081572750 ? scheme.equals("mailto") : !(iHashCode != 114009 || !scheme.equals("sms")))) {
                startActivity(new Intent("android.intent.action.SENDTO", uri));
            } else {
                Navigator navigator = getNavigator();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, null, null, false, null, 60, null);
            }
        } else if (action instanceof GoldHubAction.GoldDowngrade) {
            setModal(null);
            setBottomSheet(null);
            ActivityResultLauncher<Intent> activityResultLauncher = this.resultLauncher;
            Navigator navigator2 = getNavigator();
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator2, contextRequireContext2, new GoldDowngradeIntentKey(false, 1, null), null, false, 12, null));
        } else if (action instanceof GoldHubAction.InfoAlert) {
            getDuxo().logDowngradeEnhancementsExperiments();
            GoldHubAction.InfoAlert infoAlert = (GoldHubAction.InfoAlert) action;
            int i = WhenMappings.$EnumSwitchMapping$0[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
            if (i == 1) {
                setModal(infoAlert.getValue2().getAlert());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setBottomSheet(infoAlert.getValue2().getAlert());
            }
        } else {
            if (!(action instanceof GoldHubAction.Dismiss)) {
                throw new NoWhenBranchMatchedException();
            }
            setModal(null);
            setBottomSheet(null);
        }
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* compiled from: GoldHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/GoldHubFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/gold/hub/GoldHubFragment;", "Lcom/robinhood/android/gold/contracts/GoldHubFragmentKey;", "<init>", "()V", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<GoldHubFragment, GoldHubFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(GoldHubFragmentKey goldHubFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, goldHubFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public GoldHubFragmentKey getArgs(GoldHubFragment goldHubFragment) {
            return (GoldHubFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, goldHubFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldHubFragment newInstance(GoldHubFragmentKey goldHubFragmentKey) {
            return (GoldHubFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, goldHubFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldHubFragment goldHubFragment, GoldHubFragmentKey goldHubFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, goldHubFragment, goldHubFragmentKey);
        }
    }
}
