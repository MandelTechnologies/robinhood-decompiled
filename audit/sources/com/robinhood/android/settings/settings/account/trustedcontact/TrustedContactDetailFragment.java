package com.robinhood.android.settings.settings.account.trustedcontact;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.settings.settings.C28321R;
import com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailEvent;
import com.robinhood.android.settings.settings.databinding.FragmentTrustedContactDetailBinding;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: TrustedContactDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0016J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0014J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u000200H\u0002J\u0016\u00101\u001a\u00020\u001a2\f\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0002J\b\u00105\u001a\u00020\u001aH\u0002J\u001a\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "binding", "Lcom/robinhood/android/settings/settings/databinding/FragmentTrustedContactDetailBinding;", "getBinding", "()Lcom/robinhood/android/settings/settings/databinding/FragmentTrustedContactDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "bindViewState", "viewState", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailViewState;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailEvent;", "showDeleteConfirmDialog", "onPositiveButtonClicked", "id", "", "passthroughArgs", "setLoading", "loading", "Companion", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class TrustedContactDetailFragment extends BaseFragment {
    private static final String DELETE_TAG = "deleteTrustedContact";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TrustedContactDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/settings/settings/databinding/FragmentTrustedContactDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public TrustedContactDetailFragment() {
        super(C28321R.layout.fragment_trusted_contact_detail);
        this.useDesignSystemToolbar = true;
        this.binding = ViewBinding5.viewBinding(this, TrustedContactDetailFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, TrustedContactDetailDuxo.class);
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrustedContactDetailFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<TrustedContactDetailEvent> event) {
        EventConsumer<TrustedContactDetailEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof TrustedContactDetailEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18841invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18841invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TrustedContactDetailEvent trustedContactDetailEvent = (TrustedContactDetailEvent) event.getData();
                if (Intrinsics.areEqual(trustedContactDetailEvent, TrustedContactDetailEvent.Error.INSTANCE)) {
                    RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                    RdsButton trustedContactDeleteCta = this.getBinding().trustedContactDeleteCta;
                    Intrinsics.checkNotNullExpressionValue(trustedContactDeleteCta, "trustedContactDeleteCta");
                    companion.make(trustedContactDeleteCta, C28321R.string.trusted_contact_delete_error, 0).show();
                    return;
                }
                if (trustedContactDetailEvent instanceof TrustedContactDetailEvent.StartUpdateFlow) {
                    Navigator navigator = this.getNavigator();
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new LegacyFragmentKey.TrustedContactUpdate(((TrustedContactDetailEvent.StartUpdateFlow) trustedContactDetailEvent).getTrustedContact()), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, null, null, 60, null);
                    return;
                }
                if (!Intrinsics.areEqual(trustedContactDetailEvent, TrustedContactDetailEvent.SuccessfulDelete.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.getParentFragmentManager().popBackStack();
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentTrustedContactDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTrustedContactDetailBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrustedContactDetailDuxo getDuxo() {
        return (TrustedContactDetailDuxo) this.duxo.getValue();
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(TrustedContactDetailFragment trustedContactDetailFragment) {
        return new ToolbarScrollAnimator(trustedContactDetailFragment.requireToolbar(), trustedContactDetailFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 52, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        ScrollView trustedAccountScrollView = getBinding().trustedAccountScrollView;
        Intrinsics.checkNotNullExpressionValue(trustedAccountScrollView, "trustedAccountScrollView");
        toolbarScrollAnimator.subscribe(trustedAccountScrollView, this);
        BaseFragment.collectDuxoState$default(this, null, new C283361(null), 1, null);
        RdsButton trustedContactDeleteCta = getBinding().trustedContactDeleteCta;
        Intrinsics.checkNotNullExpressionValue(trustedContactDeleteCta, "trustedContactDeleteCta");
        OnClickListeners.onClick(trustedContactDeleteCta, new C283372(this));
    }

    /* compiled from: TrustedContactDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailFragment$onViewCreated$1", m3645f = "TrustedContactDetailFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailFragment$onViewCreated$1 */
    static final class C283361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C283361(Continuation<? super C283361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C283361 c283361 = TrustedContactDetailFragment.this.new C283361(continuation);
            c283361.L$0 = obj;
            return c283361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TrustedContactDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailFragment$onViewCreated$1$1", m3645f = "TrustedContactDetailFragment.kt", m3646l = {61}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TrustedContactDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TrustedContactDetailFragment trustedContactDetailFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = trustedContactDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: TrustedContactDetailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C505411 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ TrustedContactDetailFragment $tmp0;

                C505411(TrustedContactDetailFragment trustedContactDetailFragment) {
                    this.$tmp0 = trustedContactDetailFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, TrustedContactDetailFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(TrustedContactDetailViewState trustedContactDetailViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bindViewState = AnonymousClass1.invokeSuspend$bindViewState(this.$tmp0, trustedContactDetailViewState, continuation);
                    return objInvokeSuspend$bindViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindViewState : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((TrustedContactDetailViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<TrustedContactDetailViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C505411 c505411 = new C505411(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c505411, this) == coroutine_suspended) {
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
            public static final /* synthetic */ Object invokeSuspend$bindViewState(TrustedContactDetailFragment trustedContactDetailFragment, TrustedContactDetailViewState trustedContactDetailViewState, Continuation continuation) {
                trustedContactDetailFragment.bindViewState(trustedContactDetailViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(TrustedContactDetailFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(TrustedContactDetailFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: TrustedContactDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailFragment$onViewCreated$1$2", m3645f = "TrustedContactDetailFragment.kt", m3646l = {64}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TrustedContactDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TrustedContactDetailFragment trustedContactDetailFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = trustedContactDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: TrustedContactDetailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailFragment$onViewCreated$1$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ TrustedContactDetailFragment $tmp0;

                AnonymousClass1(TrustedContactDetailFragment trustedContactDetailFragment) {
                    this.$tmp0 = trustedContactDetailFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, TrustedContactDetailFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(Event<TrustedContactDetailEvent> event, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleEvent = AnonymousClass2.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                    return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Event<TrustedContactDetailEvent>) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
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
            public static final /* synthetic */ Object invokeSuspend$handleEvent(TrustedContactDetailFragment trustedContactDetailFragment, Event event, Continuation continuation) {
                trustedContactDetailFragment.handleEvent(event);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: TrustedContactDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactDetailFragment$onViewCreated$2 */
    /* synthetic */ class C283372 extends FunctionReferenceImpl implements Function0<Unit> {
        C283372(Object obj) {
            super(0, obj, TrustedContactDetailFragment.class, "showDeleteConfirmDialog", "showDeleteConfirmDialog()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((TrustedContactDetailFragment) this.receiver).showDeleteConfirmDialog();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        ScrollView trustedAccountScrollView = getBinding().trustedAccountScrollView;
        Intrinsics.checkNotNullExpressionValue(trustedAccountScrollView, "trustedAccountScrollView");
        toolbarScrollAnimator.dispatchScroll(trustedAccountScrollView);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C28321R.string.trusted_contact_title);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C28321R.menu.menu_trusted_contact, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C28321R.id.action_edit_trusted_contact) {
            getDuxo().startUpdateFlow();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(TrustedContactDetailViewState viewState) {
        setLoading(viewState.getLoading());
        FragmentTrustedContactDetailBinding binding = getBinding();
        binding.trustedContactRowName.setValueText(viewState.getFullName());
        binding.trustedContactRowEmail.setValueText(viewState.getEmail());
        binding.trustedContactRowPhoneNumber.setValueText(viewState.getPhoneNumber());
        binding.trustedContactRowAddress.setValueText(viewState.getAddress());
        RdsDataRowView trustedContactRowAddress = binding.trustedContactRowAddress;
        Intrinsics.checkNotNullExpressionValue(trustedContactRowAddress, "trustedContactRowAddress");
        trustedContactRowAddress.setVisibility(viewState.isAddressRowVisible() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDeleteConfirmDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C28321R.id.dialog_id_trusted_contact_delete).setUseDesignSystemOverlay(true).setTitle(C28321R.string.trusted_contact_delete_title, new Object[0]).setMessage(C28321R.string.trusted_contact_delete_message, new Object[0]).setPositiveButton(C28321R.string.trusted_contact_delete_action, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, DELETE_TAG, false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C28321R.id.dialog_id_trusted_contact_delete) {
            getDuxo().deleteTrustedContact();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    private final void setLoading(boolean loading) {
        requireBaseActivity().showProgressBar(loading);
        getBinding().trustedContactDeleteCta.setLoading(loading);
    }

    /* compiled from: TrustedContactDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TrustedContactDetail;", "<init>", "()V", "DELETE_TAG", "", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.TrustedContactDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.TrustedContactDetail key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new TrustedContactDetailFragment();
        }
    }
}
