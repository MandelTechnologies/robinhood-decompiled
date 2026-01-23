package com.robinhood.android.beneficiaries.p067ui.individualflow.finalize;

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
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiarySignedAgreement;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.p067ui.individualflow.finalize.BeneficiaryCreateFinalizeViewState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.regiongate.BeneficiariesRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ExceptionsH;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.LocalDate;

/* compiled from: BeneficiaryCreateFinalizeFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0003&'(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\r\u0010\u001a\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\t\u0010\u001f\u001a\u00020 H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDuxo;", "getDuxo", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onDialogDismissed", "", "id", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "bind", "viewState", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeViewState;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryCreateFinalizeFragment extends GenericComposeFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateFinalizeFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(BeneficiariesRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, BeneficiaryCreateFinalizeDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: BeneficiaryCreateFinalizeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeFragment$Callbacks;", "", "onBeneficiaryCreateFailure", "", "onBeneficiaryCreateSuccess", "postSubmitAlert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBeneficiaryCreateFailure();

        void onBeneficiaryCreateSuccess(GenericAlertContent<? extends GenericAction> postSubmitAlert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(BeneficiaryCreateFinalizeFragment beneficiaryCreateFinalizeFragment, int i, Composer composer, int i2) {
        beneficiaryCreateFinalizeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public final BeneficiaryCreateFinalizeDuxo getDuxo() {
        return (BeneficiaryCreateFinalizeDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            getCallbacks().onBeneficiaryCreateFailure();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C97261(null), 1, null);
    }

    /* compiled from: BeneficiaryCreateFinalizeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeFragment$onViewCreated$1", m3645f = "BeneficiaryCreateFinalizeFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeFragment$onViewCreated$1 */
    static final class C97261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C97261(Continuation<? super C97261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C97261 c97261 = BeneficiaryCreateFinalizeFragment.this.new C97261(continuation);
            c97261.L$0 = obj;
            return c97261;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BeneficiaryCreateFinalizeFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeFragment$onViewCreated$1$1", m3645f = "BeneficiaryCreateFinalizeFragment.kt", m3646l = {50}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BeneficiaryCreateFinalizeFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BeneficiaryCreateFinalizeFragment beneficiaryCreateFinalizeFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = beneficiaryCreateFinalizeFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BeneficiaryCreateFinalizeFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C496381 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ BeneficiaryCreateFinalizeFragment $tmp0;

                C496381(BeneficiaryCreateFinalizeFragment beneficiaryCreateFinalizeFragment) {
                    this.$tmp0 = beneficiaryCreateFinalizeFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, BeneficiaryCreateFinalizeFragment.class, "bind", "bind(Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(BeneficiaryCreateFinalizeViewState beneficiaryCreateFinalizeViewState, Continuation<? super Unit> continuation) throws Throwable {
                    Object objInvokeSuspend$bind = AnonymousClass1.invokeSuspend$bind(this.$tmp0, beneficiaryCreateFinalizeViewState, continuation);
                    return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((BeneficiaryCreateFinalizeViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<BeneficiaryCreateFinalizeViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C496381 c496381 = new C496381(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c496381, this) == coroutine_suspended) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$bind(BeneficiaryCreateFinalizeFragment beneficiaryCreateFinalizeFragment, BeneficiaryCreateFinalizeViewState beneficiaryCreateFinalizeViewState, Continuation continuation) throws Throwable {
                beneficiaryCreateFinalizeFragment.bind(beneficiaryCreateFinalizeViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(BeneficiaryCreateFinalizeFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(589884959);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(589884959, i, -1, "com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeFragment.ComposeContent (BeneficiaryCreateFinalizeFragment.kt:55)");
            }
            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(null, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BeneficiaryCreateFinalizeFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(BeneficiaryCreateFinalizeViewState viewState) throws Throwable {
        if (viewState instanceof BeneficiaryCreateFinalizeViewState.Loading) {
            return;
        }
        if (viewState instanceof BeneficiaryCreateFinalizeViewState.Success) {
            getCallbacks().onBeneficiaryCreateSuccess(((BeneficiaryCreateFinalizeViewState.Success) viewState).getAlert());
        } else {
            if (!(viewState instanceof BeneficiaryCreateFinalizeViewState.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((BeneficiaryCreateFinalizeViewState.Error) viewState).getError(), true, false, 0, null, 56, null);
        }
    }

    /* compiled from: BeneficiaryCreateFinalizeFragment.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010'Jz\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b6\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b7\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b8\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010'R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b?\u0010'¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeFragment$Args;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "email", "firstName", "lastName", "relationship", "j$/time/LocalDate", "dob", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySignedAgreement;", "signedSpousalAgreement", "", "additionalAccounts", "additionalAgreements", "<init>", "(Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySignedAgreement;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lj$/time/LocalDate;", "component7", "()Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySignedAgreement;", "component8", "()Ljava/util/List;", "component9", "copy", "(Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySignedAgreement;Ljava/util/List;Ljava/util/List;)Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeFragment$Args;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "getConfiguration", "Ljava/lang/String;", "getEmail", "getFirstName", "getLastName", "getRelationship", "Lj$/time/LocalDate;", "getDob", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySignedAgreement;", "getSignedSpousalAgreement", "Ljava/util/List;", "getAdditionalAccounts", "getAdditionalAgreements", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<String> additionalAccounts;
        private final List<ApiBeneficiarySignedAgreement> additionalAgreements;
        private final ApiCreateBeneficiaryConfiguration configuration;
        private final LocalDate dob;
        private final String email;
        private final String firstName;
        private final String lastName;
        private final String relationship;
        private final ApiBeneficiarySignedAgreement signedSpousalAgreement;

        /* compiled from: BeneficiaryCreateFinalizeFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration = (ApiCreateBeneficiaryConfiguration) parcel.readParcelable(Args.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                ApiBeneficiarySignedAgreement apiBeneficiarySignedAgreement = (ApiBeneficiarySignedAgreement) parcel.readParcelable(Args.class.getClassLoader());
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(parcel.readParcelable(Args.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Args(apiCreateBeneficiaryConfiguration, string2, string3, string4, string5, localDate, apiBeneficiarySignedAgreement, arrayListCreateStringArrayList, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration, String str, String str2, String str3, String str4, LocalDate localDate, ApiBeneficiarySignedAgreement apiBeneficiarySignedAgreement, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCreateBeneficiaryConfiguration = args.configuration;
            }
            if ((i & 2) != 0) {
                str = args.email;
            }
            if ((i & 4) != 0) {
                str2 = args.firstName;
            }
            if ((i & 8) != 0) {
                str3 = args.lastName;
            }
            if ((i & 16) != 0) {
                str4 = args.relationship;
            }
            if ((i & 32) != 0) {
                localDate = args.dob;
            }
            if ((i & 64) != 0) {
                apiBeneficiarySignedAgreement = args.signedSpousalAgreement;
            }
            if ((i & 128) != 0) {
                list = args.additionalAccounts;
            }
            if ((i & 256) != 0) {
                list2 = args.additionalAgreements;
            }
            List list3 = list;
            List list4 = list2;
            LocalDate localDate2 = localDate;
            ApiBeneficiarySignedAgreement apiBeneficiarySignedAgreement2 = apiBeneficiarySignedAgreement;
            String str5 = str4;
            String str6 = str2;
            return args.copy(apiCreateBeneficiaryConfiguration, str, str6, str3, str5, localDate2, apiBeneficiarySignedAgreement2, list3, list4);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCreateBeneficiaryConfiguration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* renamed from: component5, reason: from getter */
        public final String getRelationship() {
            return this.relationship;
        }

        /* renamed from: component6, reason: from getter */
        public final LocalDate getDob() {
            return this.dob;
        }

        /* renamed from: component7, reason: from getter */
        public final ApiBeneficiarySignedAgreement getSignedSpousalAgreement() {
            return this.signedSpousalAgreement;
        }

        public final List<String> component8() {
            return this.additionalAccounts;
        }

        public final List<ApiBeneficiarySignedAgreement> component9() {
            return this.additionalAgreements;
        }

        public final Args copy(ApiCreateBeneficiaryConfiguration configuration, String email, String firstName, String lastName, String relationship, LocalDate dob, ApiBeneficiarySignedAgreement signedSpousalAgreement, List<String> additionalAccounts, List<ApiBeneficiarySignedAgreement> additionalAgreements) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(lastName, "lastName");
            Intrinsics.checkNotNullParameter(relationship, "relationship");
            Intrinsics.checkNotNullParameter(dob, "dob");
            Intrinsics.checkNotNullParameter(additionalAccounts, "additionalAccounts");
            return new Args(configuration, email, firstName, lastName, relationship, dob, signedSpousalAgreement, additionalAccounts, additionalAgreements);
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
            return Intrinsics.areEqual(this.configuration, args.configuration) && Intrinsics.areEqual(this.email, args.email) && Intrinsics.areEqual(this.firstName, args.firstName) && Intrinsics.areEqual(this.lastName, args.lastName) && Intrinsics.areEqual(this.relationship, args.relationship) && Intrinsics.areEqual(this.dob, args.dob) && Intrinsics.areEqual(this.signedSpousalAgreement, args.signedSpousalAgreement) && Intrinsics.areEqual(this.additionalAccounts, args.additionalAccounts) && Intrinsics.areEqual(this.additionalAgreements, args.additionalAgreements);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.configuration.hashCode() * 31) + this.email.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.relationship.hashCode()) * 31) + this.dob.hashCode()) * 31;
            ApiBeneficiarySignedAgreement apiBeneficiarySignedAgreement = this.signedSpousalAgreement;
            int iHashCode2 = (((iHashCode + (apiBeneficiarySignedAgreement == null ? 0 : apiBeneficiarySignedAgreement.hashCode())) * 31) + this.additionalAccounts.hashCode()) * 31;
            List<ApiBeneficiarySignedAgreement> list = this.additionalAgreements;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Args(configuration=" + this.configuration + ", email=" + this.email + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", relationship=" + this.relationship + ", dob=" + this.dob + ", signedSpousalAgreement=" + this.signedSpousalAgreement + ", additionalAccounts=" + this.additionalAccounts + ", additionalAgreements=" + this.additionalAgreements + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.configuration, flags);
            dest.writeString(this.email);
            dest.writeString(this.firstName);
            dest.writeString(this.lastName);
            dest.writeString(this.relationship);
            dest.writeSerializable(this.dob);
            dest.writeParcelable(this.signedSpousalAgreement, flags);
            dest.writeStringList(this.additionalAccounts);
            List<ApiBeneficiarySignedAgreement> list = this.additionalAgreements;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<ApiBeneficiarySignedAgreement> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public Args(ApiCreateBeneficiaryConfiguration configuration, String email, String firstName, String lastName, String relationship, LocalDate dob, ApiBeneficiarySignedAgreement apiBeneficiarySignedAgreement, List<String> additionalAccounts, List<ApiBeneficiarySignedAgreement> list) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(lastName, "lastName");
            Intrinsics.checkNotNullParameter(relationship, "relationship");
            Intrinsics.checkNotNullParameter(dob, "dob");
            Intrinsics.checkNotNullParameter(additionalAccounts, "additionalAccounts");
            this.configuration = configuration;
            this.email = email;
            this.firstName = firstName;
            this.lastName = lastName;
            this.relationship = relationship;
            this.dob = dob;
            this.signedSpousalAgreement = apiBeneficiarySignedAgreement;
            this.additionalAccounts = additionalAccounts;
            this.additionalAgreements = list;
        }

        public final ApiCreateBeneficiaryConfiguration getConfiguration() {
            return this.configuration;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getRelationship() {
            return this.relationship;
        }

        public final LocalDate getDob() {
            return this.dob;
        }

        public final ApiBeneficiarySignedAgreement getSignedSpousalAgreement() {
            return this.signedSpousalAgreement;
        }

        public final List<String> getAdditionalAccounts() {
            return this.additionalAccounts;
        }

        public final List<ApiBeneficiarySignedAgreement> getAdditionalAgreements() {
            return this.additionalAgreements;
        }
    }

    /* compiled from: BeneficiaryCreateFinalizeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeFragment;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryCreateFinalizeFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(BeneficiaryCreateFinalizeFragment beneficiaryCreateFinalizeFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryCreateFinalizeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryCreateFinalizeFragment newInstance(Args args) {
            return (BeneficiaryCreateFinalizeFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryCreateFinalizeFragment beneficiaryCreateFinalizeFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryCreateFinalizeFragment, args);
        }
    }
}
