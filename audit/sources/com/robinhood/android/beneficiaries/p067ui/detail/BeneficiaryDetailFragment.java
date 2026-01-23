package com.robinhood.android.beneficiaries.p067ui.detail;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.contracts.BeneficiariesFragmentKey;
import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryDetail;
import com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailEvent;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.regiongate.BeneficiariesRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
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
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BeneficiaryDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u000267B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010!H\u0016J\r\u0010*\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010+J\b\u0010,\u001a\u00020\u001dH\u0002J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/H\u0002J\t\u00100\u001a\u00020&H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002²\u0006\u0012\u00109\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onPrimaryButtonClicked", "", "dialogId", "", "passthroughArgs", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "showDeleteConfirmationBottomSheetDialog", "setViewState", "viewState", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailViewState;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-beneficiaries_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryDetailFragment extends GenericActionHandlingFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(BeneficiariesRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, BeneficiaryDetailDuxo.class);
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryDetailFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BeneficiaryDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailFragment$Callbacks;", "", "onUpdateBeneficiary", "", "accountNumber", "", "beneficiaryId", "Ljava/util/UUID;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onUpdateBeneficiary(String accountNumber, UUID beneficiaryId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(BeneficiaryDetailFragment beneficiaryDetailFragment, int i, Composer composer, int i2) {
        beneficiaryDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.BENEFICIARY_DETAIL;
        Companion companion = INSTANCE;
        return new Screen(name, null, ((BeneficiariesFragmentKey.Detail) companion.getArgs((Fragment) this)).getAccountNumber() + "_" + ((BeneficiariesFragmentKey.Detail) companion.getArgs((Fragment) this)).getBeneficiaryId(), null, 10, null);
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BeneficiaryDetailDuxo getDuxo() {
        return (BeneficiaryDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C96941(null), 1, null);
    }

    /* compiled from: BeneficiaryDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$onViewCreated$1", m3645f = "BeneficiaryDetailFragment.kt", m3646l = {62}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$onViewCreated$1 */
    static final class C96941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C96941(Continuation<? super C96941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryDetailFragment.this.new C96941(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C96941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BeneficiaryDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<BeneficiaryDetailViewState, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass1(Object obj) {
                super(2, obj, BeneficiaryDetailFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailViewState;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BeneficiaryDetailViewState beneficiaryDetailViewState, Continuation<? super Unit> continuation) {
                return C96941.invokeSuspend$setViewState((BeneficiaryDetailFragment) this.receiver, beneficiaryDetailViewState, continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<BeneficiaryDetailViewState> stateFlow = BeneficiaryDetailFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BeneficiaryDetailFragment.this);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
        public static final /* synthetic */ Object invokeSuspend$setViewState(BeneficiaryDetailFragment beneficiaryDetailFragment, BeneficiaryDetailViewState beneficiaryDetailViewState, Continuation continuation) {
            beneficiaryDetailFragment.setViewState(beneficiaryDetailViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        View viewFindViewById = RhToolbar.addCustomView$default(toolbar, C9637R.layout.include_beneficiary_detail_edit, false, 0, 6, null).findViewById(C9637R.id.fragment_beneficiary_detail_edit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        OnClickListeners.onClick(viewFindViewById, new Function0() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryDetailFragment.configureToolbar$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$0(BeneficiaryDetailFragment beneficiaryDetailFragment) {
        EventLogger.DefaultImpls.logTap$default(beneficiaryDetailFragment.getEventLogger(), UserInteractionEventData.Action.EDIT_BENEFICIARY, beneficiaryDetailFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        Callbacks callbacks = beneficiaryDetailFragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.onUpdateBeneficiary(((BeneficiariesFragmentKey.Detail) companion.getArgs((Fragment) beneficiaryDetailFragment)).getAccountNumber(), ((BeneficiariesFragmentKey.Detail) companion.getArgs((Fragment) beneficiaryDetailFragment)).getBeneficiaryId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryDetailViewState ComposeContent$lambda$1(SnapshotState4<BeneficiaryDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<BeneficiaryDetailEvent> ComposeContent$lambda$2(SnapshotState4<Event<BeneficiaryDetailEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == C9637R.id.bottom_sheet_remove_beneficiary) {
            BeneficiaryDetailDuxo duxo = getDuxo();
            Companion companion = INSTANCE;
            duxo.deleteBeneficiary(((BeneficiariesFragmentKey.Detail) companion.getArgs((Fragment) this)).getAccountNumber(), ((BeneficiariesFragmentKey.Detail) companion.getArgs((Fragment) this)).getBeneficiaryId());
            return true;
        }
        return super.onPrimaryButtonClicked(dialogId, passthroughArgs);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<BeneficiaryDetailEvent> eventConsumerInvoke;
        EventConsumer<BeneficiaryDetailEvent> eventConsumerInvoke2;
        EventConsumer<BeneficiaryDetailEvent> eventConsumerInvoke3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-573853109);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-573853109, i2, -1, "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment.ComposeContent (BeneficiaryDetailFragment.kt:94)");
            }
            final SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1);
            final StateFlow<Event<BeneficiaryDetailEvent>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "BeneficiaryDetailFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof BeneficiaryDetailEvent) {
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
            Event<BeneficiaryDetailEvent> value = eventFlow.getValue();
            Event<BeneficiaryDetailEvent> event = value;
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, (event != null ? event.getData() : null) instanceof BeneficiaryDetailEvent ? value : null, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            final Event<BeneficiaryDetailEvent> eventComposeContent$lambda$2 = ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$2 != null && (eventComposeContent$lambda$2.getData() instanceof BeneficiaryDetailEvent.DeleteSuccess) && (eventConsumerInvoke3 = eventComposeContent$lambda$2.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke3.consume(eventComposeContent$lambda$2, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m11390invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m11390invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.requireActivity().onBackPressed();
                    }
                });
            }
            final Event<BeneficiaryDetailEvent> eventComposeContent$lambda$22 = ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$22 != null && (eventComposeContent$lambda$22.getData() instanceof BeneficiaryDetailEvent.Error) && (eventConsumerInvoke2 = eventComposeContent$lambda$22.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke2.consume(eventComposeContent$lambda$22, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$ComposeContent$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m11391invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m11391invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        AbsErrorHandler.handleError$default(this.getActivityErrorHandler(), ((BeneficiaryDetailEvent.Error) eventComposeContent$lambda$22.getData()).getThrowable(), false, 2, null);
                    }
                });
            }
            final Event<BeneficiaryDetailEvent> eventComposeContent$lambda$23 = ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$23 != null && (eventComposeContent$lambda$23.getData() instanceof BeneficiaryDetailEvent.ShowDeleteConfirmationDialog) && (eventConsumerInvoke = eventComposeContent$lambda$23.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$23, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$ComposeContent$$inlined$consumeIfType$3
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m11392invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m11392invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.showDeleteConfirmationBottomSheetDialog();
                    }
                });
            }
            Screen screen = new Screen(Screen.Name.BENEFICIARY_DETAIL, null, null, null, 14, null);
            Companion companion = INSTANCE;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(((BeneficiariesFragmentKey.Detail) companion.getArgs((Fragment) this)).getAccountNumber() + "_" + ((BeneficiariesFragmentKey.Detail) companion.getArgs((Fragment) this)).getBeneficiaryId(), screen, null, null, null, null, 60, null), ComposableLambda3.rememberComposableLambda(-1232174656, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment.ComposeContent.4
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
                        ComposerKt.traceEventStart(-1232174656, i3, -1, "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment.ComposeContent.<anonymous> (BeneficiaryDetailFragment.kt:116)");
                    }
                    final BeneficiaryDetailFragment beneficiaryDetailFragment = BeneficiaryDetailFragment.this;
                    final SnapshotState4<BeneficiaryDetailViewState> snapshotState4 = snapshotState4CollectAsState;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1565592779, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment.ComposeContent.4.1
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
                                ComposerKt.traceEventStart(1565592779, i4, -1, "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment.ComposeContent.<anonymous>.<anonymous> (BeneficiaryDetailFragment.kt:117)");
                            }
                            final BeneficiaryDetailFragment beneficiaryDetailFragment2 = beneficiaryDetailFragment;
                            final SnapshotState4<BeneficiaryDetailViewState> snapshotState42 = snapshotState4;
                            ActionHandlingFragment2.ContentWithDialog(beneficiaryDetailFragment2, ComposableLambda3.rememberComposableLambda(269091239, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment.ComposeContent.4.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(269091239, i5, -1, "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (BeneficiaryDetailFragment.kt:118)");
                                    }
                                    BeneficiaryDetailViewState beneficiaryDetailViewStateComposeContent$lambda$1 = BeneficiaryDetailFragment.ComposeContent$lambda$1(snapshotState42);
                                    final BeneficiaryDetailFragment beneficiaryDetailFragment3 = beneficiaryDetailFragment2;
                                    BeneficiaryDetailCompose2.BeneficiaryDetailCompose(beneficiaryDetailViewStateComposeContent$lambda$1, new BeneficiaryDetailCompose() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment.ComposeContent.4.1.1.1
                                        @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
                                        public void onClickDeleteBeneficiary() {
                                            beneficiaryDetailFragment3.getDuxo().onClickDeleteBeneficiary();
                                        }

                                        @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
                                        public void onRemoveConfirmationDialogDismiss() {
                                            beneficiaryDetailFragment3.getDuxo().onRemoveConfirmationDialogDismiss();
                                        }

                                        @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
                                        public void onRemoveConfirmationDialogConfirm() {
                                            beneficiaryDetailFragment3.getDuxo().onRemoveConfirmationDialogConfirm();
                                        }

                                        @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
                                        public void onRemoveConfirmationDialogCancel() {
                                            beneficiaryDetailFragment3.getDuxo().onRemoveConfirmationDialogDismiss();
                                        }

                                        @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
                                        public void onRemoveAllAlertDialogDismiss() {
                                            beneficiaryDetailFragment3.getDuxo().onRemoveAllAlertDialogDismiss();
                                        }

                                        @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
                                        public void onRemoveAllAlertDialogCancel() {
                                            beneficiaryDetailFragment3.getDuxo().onRemoveAllAlertDialogDismiss();
                                        }

                                        @Override // com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose
                                        public void onRemoveAllAlertDialogConfirm() {
                                            beneficiaryDetailFragment3.getDuxo().onRemoveAllAlertDialogConfirm();
                                        }
                                    }, null, composer4, 0, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
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
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BeneficiaryDetailFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDeleteConfirmationBottomSheetDialog() {
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(C9637R.id.bottom_sheet_remove_beneficiary, getResources().getString(C9637R.string.beneficiary_delete_title), null, null, null, getResources().getString(C9637R.string.beneficiary_remove), null, getResources().getString(C9637R.string.beneficiary_cancel), null, false, false, null, null, null, false, false, false, false, null, null, null, 2096988, null));
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        rhBottomSheetDialogFragment.show(parentFragmentManager, "deleteBeneficiary");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(BeneficiaryDetailViewState viewState) {
        View viewFindViewById;
        TextView textView;
        BeneficiaryDetail.ViewModel viewModel;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(viewState.getIsLoading());
        }
        RhToolbar rhToolbar2 = getRhToolbar();
        if (rhToolbar2 != null && (textView = (TextView) rhToolbar2.findViewById(C9637R.id.fragment_beneficiary_detail_title)) != null) {
            BeneficiaryDetail beneficiaryDetail = viewState.getBeneficiaryDetail();
            textView.setText((beneficiaryDetail == null || (viewModel = beneficiaryDetail.getViewModel()) == null) ? null : viewModel.getTitle());
        }
        RhToolbar rhToolbar3 = getRhToolbar();
        if (rhToolbar3 == null || (viewFindViewById = rhToolbar3.findViewById(C9637R.id.fragment_beneficiary_detail_edit)) == null) {
            return;
        }
        viewFindViewById.setEnabled(!viewState.getIsLoading());
    }

    /* compiled from: BeneficiaryDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailFragment;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$Detail;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryDetailFragment, BeneficiariesFragmentKey.Detail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public BeneficiariesFragmentKey.Detail getArgs(BeneficiaryDetailFragment beneficiaryDetailFragment) {
            return (BeneficiariesFragmentKey.Detail) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryDetailFragment newInstance(BeneficiariesFragmentKey.Detail detail) {
            return (BeneficiaryDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, detail);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryDetailFragment beneficiaryDetailFragment, BeneficiariesFragmentKey.Detail detail) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryDetailFragment, detail);
        }
    }
}
