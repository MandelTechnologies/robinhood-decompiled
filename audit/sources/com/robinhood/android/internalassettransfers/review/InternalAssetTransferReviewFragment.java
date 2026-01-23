package com.robinhood.android.internalassettransfers.review;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PresubmissionChecksAlertSheet;
import com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewEvent;
import com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InternalAssetTransferReviewFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0003\"#$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0015\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\b\u0010!\u001a\u00020\u0016H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006%²\u0006\u0012\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewCallbacks;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "duxo", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDuxo;", "getDuxo", "()Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onNavigationBackClick", "onSubmitButtonClick", "viewState", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState;", "onAssetsRowClick", "onInfoBannerClick", "onErrorDialogDismiss", "onContinueFromWarningAlerts", "onTryAgainSubmitWarning", "onEditTransferSelectionClick", "Callbacks", "Args", "Companion", "feature-internal-asset-transfers_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferReviewFragment extends GenericComposeFragment implements InternalAssetTransferReview4 {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InternalAssetTransferReviewFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, InternalAssetTransferReviewDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof InternalAssetTransferReviewFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: InternalAssetTransferReviewFragment.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewFragment$Callbacks;", "", "onAssetsRowClick", "", "transferableAssets", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "onInfoBannerClick", "nonTransferableAssets", "onSubmitButtonClick", "assetTransferUuid", "", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "onEditTransferSelectionClick", "navigateToPreSubmissionWarnsScreen", "alerts", "", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PresubmissionChecksAlertSheet;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void navigateToPreSubmissionWarnsScreen(List<PresubmissionChecksAlertSheet> alerts);

        void onAssetsRowClick(UiAssets transferableAssets);

        void onEditTransferSelectionClick();

        void onInfoBannerClick(UiAssets nonTransferableAssets);

        void onSubmitButtonClick(String assetTransferUuid, UiIatAccount sinkAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8(InternalAssetTransferReviewFragment internalAssetTransferReviewFragment, int i, Composer composer, int i2) {
        internalAssetTransferReviewFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final InternalAssetTransferReviewDuxo getDuxo() {
        return (InternalAssetTransferReviewDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<InternalAssetTransferReviewEvent> eventConsumerInvoke;
        EventConsumer<InternalAssetTransferReviewEvent> eventConsumerInvoke2;
        EventConsumer<InternalAssetTransferReviewEvent> eventConsumerInvoke3;
        EventConsumer<InternalAssetTransferReviewEvent> eventConsumerInvoke4;
        Composer composerStartRestartGroup = composer.startRestartGroup(460163644);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(460163644, i2, -1, "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment.ComposeContent (InternalAssetTransferReviewFragment.kt:35)");
            }
            Navigator navigator = getNavigator();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferReviewFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final Function2<UUID, Boolean, Unit> function2RememberSuvLauncher = SuvLauncher.rememberSuvLauncher(navigator, (Function0) objRememberedValue, null, composerStartRestartGroup, 0, 4);
            final StateFlow<Event<InternalAssetTransferReviewEvent>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "InternalAssetTransferReviewFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof InternalAssetTransferReviewEvent) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<InternalAssetTransferReviewEvent> value = eventFlow.getValue();
            Event<InternalAssetTransferReviewEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof InternalAssetTransferReviewEvent)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceGroup();
            final Event<InternalAssetTransferReviewEvent> eventComposeContent$lambda$2 = ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$2 != null) {
                if ((eventComposeContent$lambda$2.getData() instanceof InternalAssetTransferReviewEvent.NavigateToConfirmationScreen) && (eventConsumerInvoke4 = eventComposeContent$lambda$2.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke4.consume(eventComposeContent$lambda$2, new Function1() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment$ComposeContent$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15448invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15448invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            this.getCallbacks().onSubmitButtonClick(((InternalAssetTransferReviewEvent.NavigateToConfirmationScreen) eventComposeContent$lambda$2.getData()).getAssetTransferUuid(), ((InternalAssetTransferReviewFragment.Args) InternalAssetTransferReviewFragment.INSTANCE.getArgs((Fragment) this)).getSinkAccount());
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
            }
            final Event<InternalAssetTransferReviewEvent> eventComposeContent$lambda$22 = ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$22 != null) {
                if ((eventComposeContent$lambda$22.getData() instanceof InternalAssetTransferReviewEvent.VerificationWorkflow) && (eventConsumerInvoke3 = eventComposeContent$lambda$22.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke3.consume(eventComposeContent$lambda$22, new Function1() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment$ComposeContent$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15449invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15449invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            InternalAssetTransferReviewEvent.VerificationWorkflow verificationWorkflow = (InternalAssetTransferReviewEvent.VerificationWorkflow) eventComposeContent$lambda$22.getData();
                            function2RememberSuvLauncher.invoke(verificationWorkflow.getWorkflowId(), Boolean.valueOf(verificationWorkflow.isMigrated()));
                        }
                    });
                }
                Unit unit2 = Unit.INSTANCE;
            }
            final Event<InternalAssetTransferReviewEvent> eventComposeContent$lambda$23 = ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$23 != null) {
                if ((eventComposeContent$lambda$23.getData() instanceof InternalAssetTransferReviewEvent.NavigateToCustomSelectionScreen) && (eventConsumerInvoke2 = eventComposeContent$lambda$23.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventComposeContent$lambda$23, new Function1() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment$ComposeContent$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15450invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15450invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            this.getCallbacks().onEditTransferSelectionClick();
                        }
                    });
                }
                Unit unit3 = Unit.INSTANCE;
            }
            final Event<InternalAssetTransferReviewEvent> eventComposeContent$lambda$24 = ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$24 != null) {
                if ((eventComposeContent$lambda$24.getData() instanceof InternalAssetTransferReviewEvent.NavigateToPreSubmissionWarnsScreen) && (eventConsumerInvoke = eventComposeContent$lambda$24.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventComposeContent$lambda$24, new Function1() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment$ComposeContent$$inlined$consumeIfType$4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15451invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15451invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            this.getCallbacks().navigateToPreSubmissionWarnsScreen(((InternalAssetTransferReviewEvent.NavigateToPreSubmissionWarnsScreen) eventComposeContent$lambda$24.getData()).getAlerts());
                        }
                    });
                }
                Unit unit4 = Unit.INSTANCE;
            }
            final SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.INTERNAL_ASSET_TRANSFER_REVIEW, null, null, null, 14, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, ((Args) INSTANCE.getArgs((Fragment) this)).getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1682456945, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment.ComposeContent.5
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
                        ComposerKt.traceEventStart(1682456945, i3, -1, "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment.ComposeContent.<anonymous> (InternalAssetTransferReviewFragment.kt:64)");
                    }
                    final InternalAssetTransferReviewFragment internalAssetTransferReviewFragment = InternalAssetTransferReviewFragment.this;
                    final SnapshotState4<InternalAssetTransferReviewViewState> snapshotState4 = snapshotState4CollectAsState;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1222720324, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment.ComposeContent.5.1
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
                                ComposerKt.traceEventStart(-1222720324, i4, -1, "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment.ComposeContent.<anonymous>.<anonymous> (InternalAssetTransferReviewFragment.kt:65)");
                            }
                            InternalAssetTransferReview5.InternalAssetTransferReview(InternalAssetTransferReviewFragment.ComposeContent$lambda$7(snapshotState4), internalAssetTransferReviewFragment, ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferReviewFragment.ComposeContent$lambda$8(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(InternalAssetTransferReviewFragment internalAssetTransferReviewFragment) {
        internalAssetTransferReviewFragment.getDuxo().submitWithoutPresubmitCheck();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReview4
    public void onNavigationBackClick() {
        requireBaseActivity().onBackPressed();
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReview4
    public void onSubmitButtonClick(InternalAssetTransferReviewViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        getDuxo().submitWithPresubmitCheck();
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReview4
    public void onAssetsRowClick(InternalAssetTransferReviewViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        getCallbacks().onAssetsRowClick(viewState.getAssetsToTransfer());
    }

    private static final Event<InternalAssetTransferReviewEvent> ComposeContent$lambda$2(SnapshotState4<Event<InternalAssetTransferReviewEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InternalAssetTransferReviewViewState ComposeContent$lambda$7(SnapshotState4<InternalAssetTransferReviewViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReview4
    public void onInfoBannerClick(InternalAssetTransferReviewViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        getCallbacks().onInfoBannerClick(viewState.getNonTransferableAssetsToDisplay());
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReview4
    public void onErrorDialogDismiss() {
        getDuxo().dismissErrorDialog();
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReview4
    public void onContinueFromWarningAlerts() {
        getDuxo().submitWithoutPresubmitCheck();
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReview4
    public void onTryAgainSubmitWarning() {
        getDuxo().submitWithPresubmitCheck();
    }

    @Override // com.robinhood.android.internalassettransfers.review.InternalAssetTransferReview4
    public void onEditTransferSelectionClick() {
        getDuxo().navigateToCustomSelection();
    }

    /* compiled from: InternalAssetTransferReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewFragment$Args;", "Landroid/os/Parcelable;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "assetsToTransfer", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "nonTransferableAssetsToDisplay", "source", "", "<init>", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Ljava/lang/String;)V", "getSourceAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSinkAccount", "getAssetsToTransfer", "()Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "getNonTransferableAssetsToDisplay", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiAssets assetsToTransfer;
        private final UiAssets nonTransferableAssetsToDisplay;
        private final UiIatAccount sinkAccount;
        private final String source;
        private final UiIatAccount sourceAccount;

        /* compiled from: InternalAssetTransferReviewFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable.Creator<UiIatAccount> creator = UiIatAccount.CREATOR;
                UiIatAccount uiIatAccountCreateFromParcel = creator.createFromParcel(parcel);
                UiIatAccount uiIatAccountCreateFromParcel2 = creator.createFromParcel(parcel);
                Parcelable.Creator<UiAssets> creator2 = UiAssets.CREATOR;
                return new Args(uiIatAccountCreateFromParcel, uiIatAccountCreateFromParcel2, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, UiAssets uiAssets, UiAssets uiAssets2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uiIatAccount = args.sourceAccount;
            }
            if ((i & 2) != 0) {
                uiIatAccount2 = args.sinkAccount;
            }
            if ((i & 4) != 0) {
                uiAssets = args.assetsToTransfer;
            }
            if ((i & 8) != 0) {
                uiAssets2 = args.nonTransferableAssetsToDisplay;
            }
            if ((i & 16) != 0) {
                str = args.source;
            }
            String str2 = str;
            UiAssets uiAssets3 = uiAssets;
            return args.copy(uiIatAccount, uiIatAccount2, uiAssets3, uiAssets2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final UiIatAccount getSourceAccount() {
            return this.sourceAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final UiAssets getAssetsToTransfer() {
            return this.assetsToTransfer;
        }

        /* renamed from: component4, reason: from getter */
        public final UiAssets getNonTransferableAssetsToDisplay() {
            return this.nonTransferableAssetsToDisplay;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Args copy(UiIatAccount sourceAccount, UiIatAccount sinkAccount, UiAssets assetsToTransfer, UiAssets nonTransferableAssetsToDisplay, String source) {
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(assetsToTransfer, "assetsToTransfer");
            Intrinsics.checkNotNullParameter(nonTransferableAssetsToDisplay, "nonTransferableAssetsToDisplay");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(sourceAccount, sinkAccount, assetsToTransfer, nonTransferableAssetsToDisplay, source);
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
            return Intrinsics.areEqual(this.sourceAccount, args.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, args.sinkAccount) && Intrinsics.areEqual(this.assetsToTransfer, args.assetsToTransfer) && Intrinsics.areEqual(this.nonTransferableAssetsToDisplay, args.nonTransferableAssetsToDisplay) && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            return (((((((this.sourceAccount.hashCode() * 31) + this.sinkAccount.hashCode()) * 31) + this.assetsToTransfer.hashCode()) * 31) + this.nonTransferableAssetsToDisplay.hashCode()) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Args(sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", assetsToTransfer=" + this.assetsToTransfer + ", nonTransferableAssetsToDisplay=" + this.nonTransferableAssetsToDisplay + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.sourceAccount.writeToParcel(dest, flags);
            this.sinkAccount.writeToParcel(dest, flags);
            this.assetsToTransfer.writeToParcel(dest, flags);
            this.nonTransferableAssetsToDisplay.writeToParcel(dest, flags);
            dest.writeString(this.source);
        }

        public Args(UiIatAccount sourceAccount, UiIatAccount sinkAccount, UiAssets assetsToTransfer, UiAssets nonTransferableAssetsToDisplay, String source) {
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(assetsToTransfer, "assetsToTransfer");
            Intrinsics.checkNotNullParameter(nonTransferableAssetsToDisplay, "nonTransferableAssetsToDisplay");
            Intrinsics.checkNotNullParameter(source, "source");
            this.sourceAccount = sourceAccount;
            this.sinkAccount = sinkAccount;
            this.assetsToTransfer = assetsToTransfer;
            this.nonTransferableAssetsToDisplay = nonTransferableAssetsToDisplay;
            this.source = source;
        }

        public final UiIatAccount getSourceAccount() {
            return this.sourceAccount;
        }

        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        public final UiAssets getAssetsToTransfer() {
            return this.assetsToTransfer;
        }

        public final UiAssets getNonTransferableAssetsToDisplay() {
            return this.nonTransferableAssetsToDisplay;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: InternalAssetTransferReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewFragment;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InternalAssetTransferReviewFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InternalAssetTransferReviewFragment internalAssetTransferReviewFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, internalAssetTransferReviewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InternalAssetTransferReviewFragment newInstance(Args args) {
            return (InternalAssetTransferReviewFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InternalAssetTransferReviewFragment internalAssetTransferReviewFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, internalAssetTransferReviewFragment, args);
        }
    }
}
