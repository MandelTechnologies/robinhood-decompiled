package com.robinhood.android.transfers.international.p266ui.review;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction2;
import com.robinhood.android.transfers.international.p266ui.actions.TransferSuccessAction;
import com.robinhood.android.transfers.international.p266ui.model.FxData;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount2;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.international.p266ui.model.TransferType3;
import com.robinhood.android.transfers.international.p266ui.review.ReviewTransferEvent;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog2;
import com.robinhood.android.transfers.international.p266ui.util.Moneys3;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Money;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
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

/* compiled from: ReviewTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0002,-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010!\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\"J\u001a\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0016\u0010(\u001a\u00020\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "callbacks", "Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowActionResolver;", "getCallbacks", "()Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowActionResolver;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferEvent;", "Args", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ReviewTransferFragment extends GenericComposeFragment implements AutoLoggableFragment {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReviewTransferFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowActionResolver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(InternationalTransferFlowAction2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof InternationalTransferFlowAction2) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ReviewTransferDuxo.class);
    private final Function2<UUID, Boolean, Unit> launchSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferFragment$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.getNavigator();
        }
    }, new Function0() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferFragment$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReviewTransferFragment.launchSuv$lambda$1(this.f$0);
        }
    }, (Function0) null, 4, (Object) null);
    private final Screen eventScreen = new Screen(Screen.Name.I18N_TRANSFER_REVIEW, null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(ReviewTransferFragment reviewTransferFragment, int i, Composer composer, int i2) {
        reviewTransferFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<ReviewTransferEvent> event) {
        EventConsumer<ReviewTransferEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof ReviewTransferEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m19681invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m19681invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ReviewTransferEvent reviewTransferEvent = (ReviewTransferEvent) event.getData();
                if (reviewTransferEvent instanceof ReviewTransferEvent.Error) {
                    ErrorDialog errorDialog = ((ReviewTransferEvent.Error) reviewTransferEvent).getErrorDialog();
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    RhDialogFragment.Builder builderCreateRhDialogFragment = ErrorDialog2.createRhDialogFragment(errorDialog, contextRequireContext);
                    FragmentManager parentFragmentManager = this.getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(builderCreateRhDialogFragment, parentFragmentManager, "transfer-error", false, 4, null);
                    return;
                }
                if (reviewTransferEvent instanceof ReviewTransferEvent.SduiError) {
                    ReviewTransferEvent.SduiError sduiError = (ReviewTransferEvent.SduiError) reviewTransferEvent;
                    Navigator.DefaultImpls.createDialogFragment$default(this.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(sduiError.getAlert(), false, true, 0, 10, (DefaultConstructorMarker) null), null, 2, null).show(this.getChildFragmentManager(), sduiError.getAlert().getTitle());
                    return;
                }
                if (reviewTransferEvent instanceof ReviewTransferEvent.TransferCreated) {
                    this.getCallbacks().resolve(new TransferSuccessAction(((ReviewTransferEvent.TransferCreated) reviewTransferEvent).getPostTransferFlow()));
                    return;
                }
                if (reviewTransferEvent instanceof ReviewTransferEvent.ShowSduiInfoSheet) {
                    ReviewTransferEvent.ShowSduiInfoSheet showSduiInfoSheet = (ReviewTransferEvent.ShowSduiInfoSheet) reviewTransferEvent;
                    Navigator.DefaultImpls.createDialogFragment$default(this.getNavigator(), showSduiInfoSheet.getKey(), null, 2, null).show(this.getChildFragmentManager(), showSduiInfoSheet.getKey().getSheetId());
                } else {
                    if (reviewTransferEvent instanceof ReviewTransferEvent.VerificationRequired) {
                        ReviewTransferEvent.VerificationRequired verificationRequired = (ReviewTransferEvent.VerificationRequired) reviewTransferEvent;
                        this.launchSuv.invoke(verificationRequired.getWorkflowId(), Boolean.valueOf(verificationRequired.isMigrated()));
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternationalTransferFlowAction2 getCallbacks() {
        return (InternationalTransferFlowAction2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReviewTransferDuxo getDuxo() {
        return (ReviewTransferDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(ReviewTransferFragment reviewTransferFragment) {
        reviewTransferFragment.getDuxo().submitTransfer();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        Companion companion = INSTANCE;
        Money rosettaMoney = Moneys3.toRosettaMoney(((Args) companion.getArgs((Fragment) this)).getAmount());
        MAXTransferContext.TransferMethod transferMethod = TransferType3.toTransferMethod(((Args) companion.getArgs((Fragment) this)).getTransferType());
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(null, rosettaMoney, MultiCurrencyAccount2.toAnalyticsAccount(((Args) companion.getArgs((Fragment) this)).getSourceAccount()), MultiCurrencyAccount2.toAnalyticsAccount(((Args) companion.getArgs((Fragment) this)).getSinkAccount()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, transferMethod, null, 786417, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-652565987);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652565987, i2, -1, "com.robinhood.android.transfers.international.ui.review.ReviewTransferFragment.ComposeContent (ReviewTransferFragment.kt:59)");
            }
            Screen eventScreen = getEventScreen();
            com.robinhood.rosetta.eventlogging.Context screenEventContext = getScreenEventContext();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReviewTransferFragment.ComposeContent$lambda$3$lambda$2(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReviewTransferFragment.ComposeContent$lambda$5$lambda$4(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            ReviewTransferComposable.ReviewTransferComposable(eventScreen, screenEventContext, function0, (Function0) objRememberedValue2, null, composerStartRestartGroup, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.international.ui.review.ReviewTransferFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReviewTransferFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(ReviewTransferFragment reviewTransferFragment) {
        reviewTransferFragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(ReviewTransferFragment reviewTransferFragment) {
        reviewTransferFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* compiled from: ReviewTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.review.ReviewTransferFragment$onViewCreated$1", m3645f = "ReviewTransferFragment.kt", m3646l = {77}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferFragment$onViewCreated$1 */
    static final class C303821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C303821(Continuation<? super C303821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewTransferFragment.this.new C303821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C303821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ReviewTransferFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ ReviewTransferFragment $tmp0;

            AnonymousClass1(ReviewTransferFragment reviewTransferFragment) {
                this.$tmp0 = reviewTransferFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, ReviewTransferFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<ReviewTransferEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C303821.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<ReviewTransferEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(ReviewTransferFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ReviewTransferFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(ReviewTransferFragment reviewTransferFragment, Event event, Continuation continuation) {
            reviewTransferFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C303821(null), 1, null);
    }

    /* compiled from: ReviewTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JI\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\nHÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferFragment$Args;", "Landroid/os/Parcelable;", "amount", "Lcom/robinhood/models/util/Money;", "transferType", "Lcom/robinhood/android/transfers/international/ui/model/TransferType;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, MemoInputActivity.EXTRA_MEMO, "", "fxData", "Lcom/robinhood/android/transfers/international/ui/model/FxData;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/transfers/international/ui/model/TransferType;Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;Ljava/lang/String;Lcom/robinhood/android/transfers/international/ui/model/FxData;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransferType", "()Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "getSourceAccount", "()Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", "getSinkAccount", "getMemo", "()Ljava/lang/String;", "getFxData", "()Lcom/robinhood/android/transfers/international/ui/model/FxData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final com.robinhood.models.util.Money amount;
        private final FxData fxData;
        private final String memo;
        private final MultiCurrencyAccount sinkAccount;
        private final MultiCurrencyAccount sourceAccount;
        private final TransferType transferType;

        /* compiled from: ReviewTransferFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((com.robinhood.models.util.Money) parcel.readParcelable(Args.class.getClassLoader()), TransferType.valueOf(parcel.readString()), (MultiCurrencyAccount) parcel.readParcelable(Args.class.getClassLoader()), (MultiCurrencyAccount) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : FxData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, com.robinhood.models.util.Money money, TransferType transferType, MultiCurrencyAccount multiCurrencyAccount, MultiCurrencyAccount multiCurrencyAccount2, String str, FxData fxData, int i, Object obj) {
            if ((i & 1) != 0) {
                money = args.amount;
            }
            if ((i & 2) != 0) {
                transferType = args.transferType;
            }
            if ((i & 4) != 0) {
                multiCurrencyAccount = args.sourceAccount;
            }
            if ((i & 8) != 0) {
                multiCurrencyAccount2 = args.sinkAccount;
            }
            if ((i & 16) != 0) {
                str = args.memo;
            }
            if ((i & 32) != 0) {
                fxData = args.fxData;
            }
            String str2 = str;
            FxData fxData2 = fxData;
            return args.copy(money, transferType, multiCurrencyAccount, multiCurrencyAccount2, str2, fxData2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.robinhood.models.util.Money getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final TransferType getTransferType() {
            return this.transferType;
        }

        /* renamed from: component3, reason: from getter */
        public final MultiCurrencyAccount getSourceAccount() {
            return this.sourceAccount;
        }

        /* renamed from: component4, reason: from getter */
        public final MultiCurrencyAccount getSinkAccount() {
            return this.sinkAccount;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMemo() {
            return this.memo;
        }

        /* renamed from: component6, reason: from getter */
        public final FxData getFxData() {
            return this.fxData;
        }

        public final Args copy(com.robinhood.models.util.Money amount, TransferType transferType, MultiCurrencyAccount sourceAccount, MultiCurrencyAccount sinkAccount, String memo, FxData fxData) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            return new Args(amount, transferType, sourceAccount, sinkAccount, memo, fxData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.amount, args.amount) && this.transferType == args.transferType && Intrinsics.areEqual(this.sourceAccount, args.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, args.sinkAccount) && Intrinsics.areEqual(this.memo, args.memo) && Intrinsics.areEqual(this.fxData, args.fxData);
        }

        public int hashCode() {
            int iHashCode = ((((((this.amount.hashCode() * 31) + this.transferType.hashCode()) * 31) + this.sourceAccount.hashCode()) * 31) + this.sinkAccount.hashCode()) * 31;
            String str = this.memo;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            FxData fxData = this.fxData;
            return iHashCode2 + (fxData != null ? fxData.hashCode() : 0);
        }

        public String toString() {
            return "Args(amount=" + this.amount + ", transferType=" + this.transferType + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", memo=" + this.memo + ", fxData=" + this.fxData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeString(this.transferType.name());
            dest.writeParcelable(this.sourceAccount, flags);
            dest.writeParcelable(this.sinkAccount, flags);
            dest.writeString(this.memo);
            FxData fxData = this.fxData;
            if (fxData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fxData.writeToParcel(dest, flags);
            }
        }

        public Args(com.robinhood.models.util.Money amount, TransferType transferType, MultiCurrencyAccount sourceAccount, MultiCurrencyAccount sinkAccount, String str, FxData fxData) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            this.amount = amount;
            this.transferType = transferType;
            this.sourceAccount = sourceAccount;
            this.sinkAccount = sinkAccount;
            this.memo = str;
            this.fxData = fxData;
        }

        public final com.robinhood.models.util.Money getAmount() {
            return this.amount;
        }

        public final TransferType getTransferType() {
            return this.transferType;
        }

        public final MultiCurrencyAccount getSourceAccount() {
            return this.sourceAccount;
        }

        public final MultiCurrencyAccount getSinkAccount() {
            return this.sinkAccount;
        }

        public final String getMemo() {
            return this.memo;
        }

        public final FxData getFxData() {
            return this.fxData;
        }
    }

    /* compiled from: ReviewTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferFragment;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferFragment$Args;", "<init>", "()V", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ReviewTransferFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ReviewTransferFragment reviewTransferFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, reviewTransferFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ReviewTransferFragment newInstance(Args args) {
            return (ReviewTransferFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ReviewTransferFragment reviewTransferFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, reviewTransferFragment, args);
        }
    }
}
