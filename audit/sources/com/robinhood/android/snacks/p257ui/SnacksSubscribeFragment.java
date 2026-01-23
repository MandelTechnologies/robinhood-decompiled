package com.robinhood.android.snacks.p257ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SnacksRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.snacks.C28692R;
import com.robinhood.android.snacks.databinding.FragmentSnacksSubscribeBinding;
import com.robinhood.android.snacks.p257ui.SnacksSubscribeViewState;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SnacksSubscribeFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0002-.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\t\u0010'\u001a\u00020\u0019H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSubscribeFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeDuxo;", "getDuxo", "()Lcom/robinhood/android/snacks/ui/SnacksSubscribeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/robinhood/android/snacks/databinding/FragmentSnacksSubscribeBinding;", "getViewBinding", "()Lcom/robinhood/android/snacks/databinding/FragmentSnacksSubscribeBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/snacks/ui/SnacksSubscribeFragment$Callbacks;", "callbacks$delegate", "state", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "setViewState", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SnacksSubscribeFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private SnacksSubscribeViewState state;
    private final boolean toolbarVisible;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SnacksSubscribeFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/snacks/databinding/FragmentSnacksSubscribeBinding;", 0)), Reflection.property1(new PropertyReference1Impl(SnacksSubscribeFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/snacks/ui/SnacksSubscribeFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SnacksSubscribeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSubscribeFragment$Callbacks;", "", "onDoneClicked", "", "onSubscribeError", "throwable", "", "onUpdateEmail", "onDisclosuresLinkClicked", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDisclosuresLinkClicked();

        void onDoneClicked();

        void onSubscribeError(Throwable throwable);

        void onUpdateEmail();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public SnacksSubscribeFragment() {
        super(C28692R.layout.fragment_snacks_subscribe);
        this.$$delegate_0 = new RegionGated2(SnacksRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, SnacksSubscribeDuxo.class);
        this.viewBinding = ViewBinding5.viewBinding(this, SnacksSubscribeFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SnacksSubscribeDuxo getDuxo() {
        return (SnacksSubscribeDuxo) this.duxo.getValue();
    }

    private final FragmentSnacksSubscribeBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSnacksSubscribeBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View viewFindViewById = view.findViewById(C28692R.id.snacks_subscribe_done_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        OnClickListeners.onClick(viewFindViewById, new Function0() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SnacksSubscribeFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        View viewFindViewById2 = view.findViewById(C28692R.id.snacks_subscribe_update_email);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        OnClickListeners.onClick(viewFindViewById2, new Function0() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SnacksSubscribeFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        View viewFindViewById3 = view.findViewById(C28692R.id.snacks_disclosures_link_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        OnClickListeners.onClick(viewFindViewById3, new Function0() { // from class: com.robinhood.android.snacks.ui.SnacksSubscribeFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SnacksSubscribeFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C286984(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SnacksSubscribeFragment snacksSubscribeFragment) {
        snacksSubscribeFragment.getCallbacks().onDoneClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(SnacksSubscribeFragment snacksSubscribeFragment) {
        snacksSubscribeFragment.getCallbacks().onUpdateEmail();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(SnacksSubscribeFragment snacksSubscribeFragment) {
        snacksSubscribeFragment.getCallbacks().onDisclosuresLinkClicked();
        return Unit.INSTANCE;
    }

    /* compiled from: SnacksSubscribeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.snacks.ui.SnacksSubscribeFragment$onViewCreated$4", m3645f = "SnacksSubscribeFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.snacks.ui.SnacksSubscribeFragment$onViewCreated$4 */
    static final class C286984 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C286984(Continuation<? super C286984> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SnacksSubscribeFragment.this.new C286984(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C286984) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SnacksSubscribeFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.snacks.ui.SnacksSubscribeFragment$onViewCreated$4$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ SnacksSubscribeFragment $tmp0;

            AnonymousClass1(SnacksSubscribeFragment snacksSubscribeFragment) {
                this.$tmp0 = snacksSubscribeFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, SnacksSubscribeFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/snacks/ui/SnacksSubscribeViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(SnacksSubscribeViewState snacksSubscribeViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$setViewState = C286984.invokeSuspend$setViewState(this.$tmp0, snacksSubscribeViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((SnacksSubscribeViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<SnacksSubscribeViewState> stateFlow = SnacksSubscribeFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SnacksSubscribeFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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
        public static final /* synthetic */ Object invokeSuspend$setViewState(SnacksSubscribeFragment snacksSubscribeFragment, SnacksSubscribeViewState snacksSubscribeViewState, Continuation continuation) {
            snacksSubscribeFragment.setViewState(snacksSubscribeViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        SnacksSubscribeViewState snacksSubscribeViewState = this.state;
        if (!Intrinsics.areEqual(snacksSubscribeViewState != null ? snacksSubscribeViewState.getStatus() : null, SnacksSubscribeViewState.Status.Subscribed.INSTANCE)) {
            SnacksSubscribeViewState snacksSubscribeViewState2 = this.state;
            if (!Intrinsics.areEqual(snacksSubscribeViewState2 != null ? snacksSubscribeViewState2.getStatus() : null, SnacksSubscribeViewState.Status.AlreadySubscribed.INSTANCE)) {
                return true;
            }
        }
        getCallbacks().onDoneClicked();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(SnacksSubscribeViewState state) {
        this.state = state;
        SnacksSubscribeViewState.Status status = state.getStatus();
        if (Intrinsics.areEqual(status, SnacksSubscribeViewState.Status.Loading.INSTANCE)) {
            ShimmerLoadingView loadingView = getViewBinding().loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
            loadingView.setVisibility(0);
            return;
        }
        if (Intrinsics.areEqual(status, SnacksSubscribeViewState.Status.Subscribed.INSTANCE)) {
            if (state.getEmail() == null) {
                ShimmerLoadingView loadingView2 = getViewBinding().loadingView;
                Intrinsics.checkNotNullExpressionValue(loadingView2, "loadingView");
                loadingView2.setVisibility(0);
                return;
            } else {
                ShimmerLoadingView loadingView3 = getViewBinding().loadingView;
                Intrinsics.checkNotNullExpressionValue(loadingView3, "loadingView");
                loadingView3.setVisibility(8);
                getViewBinding().snacksSubscribeSummary.setText(getString(C28692R.string.snacks_subscribe_summary, state.getEmail()));
                return;
            }
        }
        if (!Intrinsics.areEqual(status, SnacksSubscribeViewState.Status.AlreadySubscribed.INSTANCE)) {
            if (!(status instanceof SnacksSubscribeViewState.Status.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onSubscribeError(((SnacksSubscribeViewState.Status.Failure) state.getStatus()).getThrowable());
        } else {
            ShimmerLoadingView loadingView4 = getViewBinding().loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView4, "loadingView");
            loadingView4.setVisibility(8);
            getViewBinding().snacksSubscribeSummary.setText(getString(C28692R.string.snacks_subscribe_already_subscribed));
        }
    }

    /* compiled from: SnacksSubscribeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSubscribeFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeFragment;", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SnacksSubscribeFragment newInstance() {
            return new SnacksSubscribeFragment();
        }
    }
}
