package com.robinhood.android.blackwidow.p068ui.upsell;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.blackwidow.C9859R;
import com.robinhood.android.blackwidow.LocalityStringResources;
import com.robinhood.android.blackwidow.contracts.ExploreLegendUpsellKey;
import com.robinhood.android.blackwidow.p068ui.error.ErrorDialog;
import com.robinhood.android.blackwidow.p068ui.upsell.ExploreLegendUpsellViewEvent;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment2;
import com.robinhood.android.common.p088ui.RhButtonType;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.regiongate.BlackWidowRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.noties.markwon.Markwon;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ExploreLegendUpsellFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0002,-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u001a\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0016\u0010\u001f\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\r\u0010#\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0015H\u0002J\t\u0010&\u001a\u00020\u0011H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "entryPoint", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellFragment$ExploreLegendUpsellEntryPoint;", "getEntryPoint", "()Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellFragment$ExploreLegendUpsellEntryPoint;", "entryPoint$delegate", "Lkotlin/Lazy;", "duxo", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellDuxo;", "getDuxo", "()Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellDuxo;", "duxo$delegate", "hasBottomBar", "", "getHasBottomBar", "()Z", "onStart", "", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "handleDuxoEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellViewEvent;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "showTermsAndConditionsDialog", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "ExploreLegendUpsellEntryPoint", "Companion", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ExploreLegendUpsellFragment extends GenericComposeFragment implements RegionGated {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(BlackWidowRegionGate.INSTANCE);

    /* renamed from: entryPoint$delegate, reason: from kotlin metadata */
    private final Lazy entryPoint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellFragment$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ExploreLegendUpsellFragment.entryPoint_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ExploreLegendUpsellDuxo.class);
    private final boolean hasBottomBar = true;

    /* compiled from: ExploreLegendUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellFragment$ExploreLegendUpsellEntryPoint;", "", "localityStringResources", "Lcom/robinhood/android/blackwidow/LocalityStringResources;", "markwon", "Lio/noties/markwon/Markwon;", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ExploreLegendUpsellEntryPoint {
        LocalityStringResources localityStringResources();

        Markwon markwon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8(ExploreLegendUpsellFragment exploreLegendUpsellFragment, int i, Composer composer, int i2) {
        exploreLegendUpsellFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public final void handleDuxoEvent(final Event<ExploreLegendUpsellViewEvent> event) {
        EventConsumer<ExploreLegendUpsellViewEvent> eventConsumerInvoke;
        EventConsumer<ExploreLegendUpsellViewEvent> eventConsumerInvoke2;
        EventConsumer<ExploreLegendUpsellViewEvent> eventConsumerInvoke3;
        if ((event.getData() instanceof ExploreLegendUpsellViewEvent.Error) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellFragment$handleDuxoEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m11462invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m11462invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ErrorDialog errorDialog = (ErrorDialog) ErrorDialog.INSTANCE.newInstance();
                    FragmentManager childFragmentManager = this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    errorDialog.show(childFragmentManager, "error-dialog");
                }
            });
        }
        if ((event.getData() instanceof ExploreLegendUpsellViewEvent.EmailError) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellFragment$handleDuxoEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m11463invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m11463invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                    View viewRequireView = this.requireView();
                    Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                    String string2 = this.requireContext().getString(C9859R.string.explore_legend_upsell_error_subtitle);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    companion.make(viewRequireView, string2, -1).setLeadingIcon(ServerToBentoAssetMapper2.EMAIL_OUTLINE_24.getResourceId()).show();
                }
            });
        }
        if (!(event.getData() instanceof ExploreLegendUpsellViewEvent.EmailSuccess) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellFragment$handleDuxoEvent$$inlined$consumeIfType$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m11464invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m11464invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                View viewRequireView = this.requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                String string2 = this.requireContext().getString(C9859R.string.explore_legend_upsell_email_sent);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                companion.make(viewRequireView, string2, -1).setLeadingIcon(ServerToBentoAssetMapper2.EMAIL_OUTLINE_24.getResourceId()).show();
            }
        });
    }

    private final ExploreLegendUpsellEntryPoint getEntryPoint() {
        return (ExploreLegendUpsellEntryPoint) this.entryPoint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExploreLegendUpsellEntryPoint entryPoint_delegate$lambda$0(ExploreLegendUpsellFragment exploreLegendUpsellFragment) {
        ComponentCallbacks2 componentCallbacks2;
        Context contextRequireContext = exploreLegendUpsellFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (contextRequireContext instanceof Application) {
            componentCallbacks2 = (Application) contextRequireContext;
        } else {
            Context applicationContext = contextRequireContext.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        return (ExploreLegendUpsellEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExploreLegendUpsellDuxo getDuxo() {
        return (ExploreLegendUpsellDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        requireBaseActivity().overrideSystemBarsStyle(false);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireBaseActivity().resetSystemBarsStyleOverride();
    }

    /* compiled from: ExploreLegendUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellFragment$onViewCreated$1", m3645f = "ExploreLegendUpsellFragment.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellFragment$onViewCreated$1 */
    static final class C99171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C99171(Continuation<? super C99171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExploreLegendUpsellFragment.this.new C99171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C99171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ExploreLegendUpsellFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ ExploreLegendUpsellFragment $tmp0;

            AnonymousClass1(ExploreLegendUpsellFragment exploreLegendUpsellFragment) {
                this.$tmp0 = exploreLegendUpsellFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, ExploreLegendUpsellFragment.class, "handleDuxoEvent", "handleDuxoEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<ExploreLegendUpsellViewEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleDuxoEvent = C99171.invokeSuspend$handleDuxoEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleDuxoEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleDuxoEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<ExploreLegendUpsellViewEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(ExploreLegendUpsellFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ExploreLegendUpsellFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleDuxoEvent(ExploreLegendUpsellFragment exploreLegendUpsellFragment, Event event, Continuation continuation) {
            exploreLegendUpsellFragment.handleDuxoEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C99171(null), 1, null);
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
        Composer composerStartRestartGroup = composer.startRestartGroup(-574621663);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-574621663, i2, -1, "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellFragment.ComposeContent (ExploreLegendUpsellFragment.kt:94)");
            }
            ExploreLegendUpsellDuxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ExploreLegendUpsellFragment.ComposeContent$lambda$5$lambda$4(this.f$0);
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
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ExploreLegendUpsellFragment.ComposeContent$lambda$7$lambda$6(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            ExploreLegendUpsellComposableKt.ExploreLegendUpsellComposable(duxo, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExploreLegendUpsellFragment.ComposeContent$lambda$8(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(ExploreLegendUpsellFragment exploreLegendUpsellFragment) {
        exploreLegendUpsellFragment.requireBaseActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$6(ExploreLegendUpsellFragment exploreLegendUpsellFragment) {
        exploreLegendUpsellFragment.showTermsAndConditionsDialog();
        return Unit.INSTANCE;
    }

    private final void showTermsAndConditionsDialog() {
        int i = 0;
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        RhBottomSheetDialogFragment2 rhBottomSheetDialogFragment2 = null;
        RhButtonType rhButtonType = null;
        CharSequence charSequence3 = null;
        Integer num = null;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        Bundle bundle = null;
        Integer num2 = null;
        boolean z3 = false;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = true;
        Boolean bool = null;
        String str2 = null;
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(i, charSequence, charSequence2, getEntryPoint().markwon().toMarkdown(getEntryPoint().localityStringResources().getTerms_message()), rhBottomSheetDialogFragment2, getString(C11048R.string.general_label_dismiss), rhButtonType, charSequence3, num, z, z2, str, bundle, num2, z3, z4, z5, z6, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), bool, str2, 1671127, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "black-widow-disclosure");
    }

    /* compiled from: ExploreLegendUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellFragment;", "Lcom/robinhood/android/blackwidow/contracts/ExploreLegendUpsellKey;", "<init>", "()V", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ExploreLegendUpsellFragment, ExploreLegendUpsellKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ExploreLegendUpsellKey getArgs(ExploreLegendUpsellFragment exploreLegendUpsellFragment) {
            return (ExploreLegendUpsellKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, exploreLegendUpsellFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ExploreLegendUpsellFragment newInstance(ExploreLegendUpsellKey exploreLegendUpsellKey) {
            return (ExploreLegendUpsellFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, exploreLegendUpsellKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ExploreLegendUpsellFragment exploreLegendUpsellFragment, ExploreLegendUpsellKey exploreLegendUpsellKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, exploreLegendUpsellFragment, exploreLegendUpsellKey);
        }
    }
}
