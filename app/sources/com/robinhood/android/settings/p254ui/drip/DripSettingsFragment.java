package com.robinhood.android.settings.p254ui.drip;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableContent;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.drip.contracts.DripOnboarding;
import com.robinhood.android.drip.contracts.DripSettings;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.settings.p254ui.drip.DripSettingsAdapter;
import com.robinhood.android.settings.p254ui.drip.DripSettingsEvent;
import com.robinhood.android.settings.p254ui.drip.databinding.FragmentDripSettingsBinding;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.UiInstrumentDripSettings;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
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
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DripSettingsFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0018H\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0002J\u0016\u0010$\u001a\u00020\u00182\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0014H\u0016J\u0018\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0014H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/settings/ui/drip/DripSettingsDuxo;", "getDuxo", "()Lcom/robinhood/android/settings/ui/drip/DripSettingsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/settings/ui/drip/databinding/FragmentDripSettingsBinding;", "getBinding", "()Lcom/robinhood/android/settings/ui/drip/databinding/FragmentDripSettingsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "dripSettingsAdapter", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "refreshUI", "state", "Lcom/robinhood/android/settings/ui/drip/DripSettingsViewState;", "handleEvent", "wrappedEvent", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsEvent;", "onAccountToggled", "enabled", "onInstrumentToggled", "instrument", "Lcom/robinhood/models/db/Instrument;", "Companion", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class DripSettingsFragment extends BaseFragment implements DripSettingsAdapter.Callbacks {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final DripSettingsAdapter dripSettingsAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DripSettingsFragment.class, "binding", "getBinding()Lcom/robinhood/android/settings/ui/drip/databinding/FragmentDripSettingsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<DripSettingsEvent> wrappedEvent) {
        EventConsumer<DripSettingsEvent> eventConsumerInvoke;
        if (!(wrappedEvent.getData() instanceof DripSettingsEvent) || (eventConsumerInvoke = wrappedEvent.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(wrappedEvent, new Function1() { // from class: com.robinhood.android.settings.ui.drip.DripSettingsFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18857invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18857invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                DripSettingsEvent dripSettingsEvent = (DripSettingsEvent) wrappedEvent.getData();
                if (Intrinsics.areEqual(dripSettingsEvent, DripSettingsEvent.ShowIneligibleDialog.INSTANCE)) {
                    ComposeView composeView = this.getBinding().composeView;
                    final DripSettingsFragment dripSettingsFragment = this;
                    composeView.setContent(ComposableLambda3.composableLambdaInstance(1472399690, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.settings.ui.drip.DripSettingsFragment$handleEvent$1$1
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
                                ComposerKt.traceEventStart(1472399690, i, -1, "com.robinhood.android.settings.ui.drip.DripSettingsFragment.handleEvent.<anonymous>.<anonymous> (DripSettingsFragment.kt:116)");
                            }
                            Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(dripSettingsFragment.getScarletManager());
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(dripSettingsFragment);
                            final DripSettingsFragment dripSettingsFragment2 = dripSettingsFragment;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.settings.ui.drip.DripSettingsFragment$handleEvent$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Navigator navigator = dripSettingsFragment2.getNavigator();
                                        Context contextRequireContext = dripSettingsFragment2.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, TabLinkIntentKey.Home.Legacy.INSTANCE, null, false, null, null, 60, null);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            AdvisoryFeatureUnavailableContent.AdvisoryFeatureUnavailableDialog(observableThemeChangesForCompose, (Function0) objRememberedValue, composer, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                } else {
                    if (dripSettingsEvent instanceof DripSettingsEvent.ShowOnboardingFlow) {
                        this.getParentFragmentManager().popBackStack();
                        this.requireActivity().finish();
                        Navigator navigator = this.getNavigator();
                        FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        Navigator.DefaultImpls.startActivity$default(navigator, fragmentActivityRequireActivity, new DripOnboarding(((DripSettingsEvent.ShowOnboardingFlow) dripSettingsEvent).getAccountNumber()), null, false, null, null, 60, null);
                        return;
                    }
                    if (!Intrinsics.areEqual(dripSettingsEvent, DripSettingsEvent.SettingsUpdateSuccess.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentActivity fragmentActivityRequireActivity2 = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                    Snackbars.show(fragmentActivityRequireActivity2, C28363R.string.drip_settings_toggle_success, -1);
                }
            }
        });
    }

    public DripSettingsFragment() {
        super(C28363R.layout.fragment_drip_settings);
        this.duxo = DuxosKt.duxo(this, DripSettingsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DripSettingsFragment2.INSTANCE);
        this.dripSettingsAdapter = new DripSettingsAdapter(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DripSettingsDuxo getDuxo() {
        return (DripSettingsDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentDripSettingsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDripSettingsBinding) value;
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
        RecyclerView recyclerView = getBinding().dripSettingsRecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        if (!isInTabFragment()) {
            Intrinsics.checkNotNull(recyclerView);
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(recyclerView, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.dripSettingsAdapter);
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        BaseFragment.collectDuxoState$default(this, null, new C283592(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C283603(null), 1, null);
    }

    /* compiled from: DripSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.drip.DripSettingsFragment$onViewCreated$2", m3645f = "DripSettingsFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.ui.drip.DripSettingsFragment$onViewCreated$2 */
    static final class C283592 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C283592(Continuation<? super C283592> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DripSettingsFragment.this.new C283592(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283592) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<DripSettingsViewState> stateFlow = DripSettingsFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DripSettingsFragment.this);
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

        /* compiled from: DripSettingsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.settings.ui.drip.DripSettingsFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<DripSettingsViewState, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass1(Object obj) {
                super(2, obj, DripSettingsFragment.class, "refreshUI", "refreshUI(Lcom/robinhood/android/settings/ui/drip/DripSettingsViewState;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DripSettingsViewState dripSettingsViewState, Continuation<? super Unit> continuation) {
                return C283592.invokeSuspend$refreshUI((DripSettingsFragment) this.receiver, dripSettingsViewState, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$refreshUI(DripSettingsFragment dripSettingsFragment, DripSettingsViewState dripSettingsViewState, Continuation continuation) throws Resources.NotFoundException {
            dripSettingsFragment.refreshUI(dripSettingsViewState);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DripSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.drip.DripSettingsFragment$onViewCreated$3", m3645f = "DripSettingsFragment.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.ui.drip.DripSettingsFragment$onViewCreated$3 */
    static final class C283603 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C283603(Continuation<? super C283603> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DripSettingsFragment.this.new C283603(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283603) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(DripSettingsFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DripSettingsFragment.this);
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

        /* compiled from: DripSettingsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.settings.ui.drip.DripSettingsFragment$onViewCreated$3$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ DripSettingsFragment $tmp0;

            AnonymousClass1(DripSettingsFragment dripSettingsFragment) {
                this.$tmp0 = dripSettingsFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, DripSettingsFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<DripSettingsEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C283603.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<DripSettingsEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(DripSettingsFragment dripSettingsFragment, Event event, Continuation continuation) {
            dripSettingsFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        ToolbarScrollAnimator toolbarScrollAnimator = new ToolbarScrollAnimator(rhToolbar, getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 48, (DefaultConstructorMarker) null);
        RecyclerView dripSettingsRecyclerView = getBinding().dripSettingsRecyclerView;
        Intrinsics.checkNotNullExpressionValue(dripSettingsRecyclerView, "dripSettingsRecyclerView");
        ToolbarScrollAnimator.subscribe$default(toolbarScrollAnimator, dripSettingsRecyclerView, this, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUI(DripSettingsViewState state) throws Resources.NotFoundException {
        CharSequence text;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            StringResource title = state.getTitle();
            if (title != null) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                text = title.getText(resources);
            } else {
                text = null;
            }
            rhToolbar.setTitle(text);
        }
        List listMutableListOf = CollectionsKt.mutableListOf(new DripSettingsAdapter.DripSettingsRowType.DripOverallHeader(state.isDripEnabled()));
        if (state.isDripEnabled()) {
            List<UiInstrumentDripSettings> instrumentDripSettings = state.getInstrumentDripSettings();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(instrumentDripSettings, 10));
            for (UiInstrumentDripSettings uiInstrumentDripSettings : instrumentDripSettings) {
                arrayList.add(new DripSettingsAdapter.DripSettingsRowType.DripInstrumentToggle(uiInstrumentDripSettings.getInstrument(), uiInstrumentDripSettings.getInstrumentDripSettings().getDripEnabled()));
            }
            listMutableListOf.addAll(arrayList);
            listMutableListOf.add(DripSettingsAdapter.DripSettingsRowType.DripInstrumentDisclaimer.INSTANCE);
        }
        this.dripSettingsAdapter.submitList(listMutableListOf);
    }

    @Override // com.robinhood.android.settings.ui.drip.DripSettingsAdapter.Callbacks
    public void onAccountToggled(boolean enabled) {
        getDuxo().setAccountDripSettings(enabled);
    }

    @Override // com.robinhood.android.settings.ui.drip.DripSettingsAdapter.Callbacks
    public void onInstrumentToggled(Instrument instrument, boolean enabled) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        getDuxo().setInstrumentDripSettings(instrument.getId(), enabled);
    }

    /* compiled from: DripSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsFragment;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsArgs;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/drip/contracts/DripSettings;", "<init>", "()V", "createFragment", "key", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DripSettingsFragment, DripSettingsArgs>, FragmentResolver<DripSettings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DripSettingsArgs getArgs(DripSettingsFragment dripSettingsFragment) {
            return (DripSettingsArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, dripSettingsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DripSettingsFragment newInstance(DripSettingsArgs dripSettingsArgs) {
            return (DripSettingsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, dripSettingsArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DripSettingsFragment dripSettingsFragment, DripSettingsArgs dripSettingsArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, dripSettingsFragment, dripSettingsArgs);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public DripSettingsFragment createFragment(DripSettings key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (DripSettingsFragment) newInstance((Parcelable) new DripSettingsArgs(key.getAccountNumber()));
        }
    }
}
