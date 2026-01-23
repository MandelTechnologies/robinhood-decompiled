package com.robinhood.android.gold.upgrade.legacy;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.gold.upgrade.C18003R;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanState;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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

/* compiled from: LegacyGoldUpgradeLoadPlanFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0003%&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\r\u0010\u001c\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanDuxo;", "getDuxo", "()Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "PreviewLoadingContent", "handleState", "state", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState;", "onDialogDismissed", "id", "", "Callbacks", "Args", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeLoadPlanFragment extends GenericComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LegacyGoldUpgradeLoadPlanFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, LegacyGoldUpgradeLoadPlanDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof LegacyGoldUpgradeLoadPlanFragment.Callbacks)) {
                parentFragment = null;
            }
            LegacyGoldUpgradeLoadPlanFragment.Callbacks callbacks = (LegacyGoldUpgradeLoadPlanFragment.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof LegacyGoldUpgradeLoadPlanFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: LegacyGoldUpgradeLoadPlanFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanFragment$Callbacks;", "", "onLoadPlanSuccess", "", "dynamicContext", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeDynamicContext;", "onLoadPlanFailed", "onAccountDeficit", "onAlreadyGold", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountDeficit();

        void onAlreadyGold();

        void onLoadPlanFailed();

        void onLoadPlanSuccess(LegacyGoldUpgradeDynamicContext dynamicContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(LegacyGoldUpgradeLoadPlanFragment legacyGoldUpgradeLoadPlanFragment, int i, Composer composer, int i2) {
        legacyGoldUpgradeLoadPlanFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingContent$lambda$1(LegacyGoldUpgradeLoadPlanFragment legacyGoldUpgradeLoadPlanFragment, int i, Composer composer, int i2) {
        legacyGoldUpgradeLoadPlanFragment.PreviewLoadingContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LegacyGoldUpgradeLoadPlanDuxo getDuxo() {
        return (LegacyGoldUpgradeLoadPlanDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "MarginUpgrade24kgLoadPlanFragment";
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return requireBaseActivity().getScreenDescription();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C181131(null), 1, null);
    }

    /* compiled from: LegacyGoldUpgradeLoadPlanFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment$onViewCreated$1", m3645f = "LegacyGoldUpgradeLoadPlanFragment.kt", m3646l = {75}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment$onViewCreated$1 */
    static final class C181131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C181131(Continuation<? super C181131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LegacyGoldUpgradeLoadPlanFragment.this.new C181131(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C181131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<LegacyGoldUpgradeLoadPlanState> stateFlow = LegacyGoldUpgradeLoadPlanFragment.this.getDuxo().getStateFlow();
                Flow flowTake = FlowKt.take(FlowKt.sample(new Flow<LegacyGoldUpgradeLoadPlanState>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment$onViewCreated$1$invokeSuspend$$inlined$filterNot$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment$onViewCreated$1$invokeSuspend$$inlined$filterNot$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment$onViewCreated$1$invokeSuspend$$inlined$filterNot$1$2", m3645f = "LegacyGoldUpgradeLoadPlanFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment$onViewCreated$1$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
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
                                if (!(((LegacyGoldUpgradeLoadPlanState) obj) instanceof LegacyGoldUpgradeLoadPlanState.Loading)) {
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
                    public Object collect(FlowCollector<? super LegacyGoldUpgradeLoadPlanState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, 1000L), 1);
                final LegacyGoldUpgradeLoadPlanFragment legacyGoldUpgradeLoadPlanFragment = LegacyGoldUpgradeLoadPlanFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment.onViewCreated.1.2
                    public final Object emit(LegacyGoldUpgradeLoadPlanState legacyGoldUpgradeLoadPlanState, Continuation<? super Unit> continuation) {
                        legacyGoldUpgradeLoadPlanFragment.handleState(legacyGoldUpgradeLoadPlanState);
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((LegacyGoldUpgradeLoadPlanState) obj2, (Continuation<? super Unit>) continuation);
                    }
                };
                this.label = 1;
                if (flowTake.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1081337780);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1081337780, i, -1, "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment.ComposeContent (LegacyGoldUpgradeLoadPlanFragment.kt:79)");
            }
            LocalShowPlaceholder.Loadable(true, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(TestTag3.testTag(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), LoadingScreenComposablesKt.GenericLoadingScreenTestTag), 0.0f, composerStartRestartGroup, 6, 1), null, LegacyGoldUpgradeLoadPlanFragment2.INSTANCE.getLambda$540612644$feature_gold_upgrade_externalRelease(), composerStartRestartGroup, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeLoadPlanFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void PreviewLoadingContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-745072362);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-745072362, i2, -1, "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment.PreviewLoadingContent (LegacyGoldUpgradeLoadPlanFragment.kt:123)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2039326002, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment.PreviewLoadingContent.1
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
                        ComposerKt.traceEventStart(-2039326002, i3, -1, "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment.PreviewLoadingContent.<anonymous> (LegacyGoldUpgradeLoadPlanFragment.kt:125)");
                    }
                    LegacyGoldUpgradeLoadPlanFragment.this.ComposeContent(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeLoadPlanFragment.PreviewLoadingContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState(LegacyGoldUpgradeLoadPlanState state) {
        Throwable thConsume;
        if (state instanceof LegacyGoldUpgradeLoadPlanState.Loading) {
            return;
        }
        if (state instanceof LegacyGoldUpgradeLoadPlanState.AccountDeficit) {
            getCallbacks().onAccountDeficit();
            return;
        }
        if (state instanceof LegacyGoldUpgradeLoadPlanState.Failed) {
            LegacyGoldUpgradeLoadPlanState.Failed failed = (LegacyGoldUpgradeLoadPlanState.Failed) state;
            UiEvent<Throwable> errorEvent = failed.getErrorEvent();
            if (errorEvent != null && (thConsume = errorEvent.consume()) != null) {
                getActivityErrorHandler().invoke((ActivityErrorHandler) thConsume);
            }
            if (failed.getShowErrorDialog()) {
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                RhDialogFragment.Builder cancelable = companion.create(contextRequireContext).setId(C11048R.id.dialog_id_generic_error).setTitle(C18003R.string.gold_upgrade_something_went_wrong, new Object[0]).setMessage(C18003R.string.gold_upgrade_loading_error_description, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setCancelable(false);
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                RhDialogFragment.Builder.show$default(cancelable, childFragmentManager, "loadPlanFailedDialog", false, 4, null);
                return;
            }
            getCallbacks().onLoadPlanFailed();
            return;
        }
        if (state instanceof LegacyGoldUpgradeLoadPlanState.AlreadyGold) {
            getCallbacks().onAlreadyGold();
        } else {
            if (!(state instanceof LegacyGoldUpgradeLoadPlanState.Loaded)) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onLoadPlanSuccess(((LegacyGoldUpgradeLoadPlanState.Loaded) state).getDynamicContext());
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            getCallbacks().onLoadPlanFailed();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* compiled from: LegacyGoldUpgradeLoadPlanFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanFragment$Args;", "Landroid/os/Parcelable;", "feature", "", "exitDeeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeature", "()Ljava/lang/String;", "getExitDeeplink", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String exitDeeplink;
        private final String feature;

        /* compiled from: LegacyGoldUpgradeLoadPlanFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.feature;
            }
            if ((i & 2) != 0) {
                str2 = args.exitDeeplink;
            }
            return args.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFeature() {
            return this.feature;
        }

        /* renamed from: component2, reason: from getter */
        public final String getExitDeeplink() {
            return this.exitDeeplink;
        }

        public final Args copy(String feature, String exitDeeplink) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            return new Args(feature, exitDeeplink);
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
            return Intrinsics.areEqual(this.feature, args.feature) && Intrinsics.areEqual(this.exitDeeplink, args.exitDeeplink);
        }

        public int hashCode() {
            int iHashCode = this.feature.hashCode() * 31;
            String str = this.exitDeeplink;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(feature=" + this.feature + ", exitDeeplink=" + this.exitDeeplink + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.feature);
            dest.writeString(this.exitDeeplink);
        }

        public Args(String feature, String str) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            this.feature = feature;
            this.exitDeeplink = str;
        }

        public /* synthetic */ Args(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String getFeature() {
            return this.feature;
        }

        public final String getExitDeeplink() {
            return this.exitDeeplink;
        }
    }

    /* compiled from: LegacyGoldUpgradeLoadPlanFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanFragment;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanFragment$Args;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<LegacyGoldUpgradeLoadPlanFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(LegacyGoldUpgradeLoadPlanFragment legacyGoldUpgradeLoadPlanFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, legacyGoldUpgradeLoadPlanFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LegacyGoldUpgradeLoadPlanFragment newInstance(Args args) {
            return (LegacyGoldUpgradeLoadPlanFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LegacyGoldUpgradeLoadPlanFragment legacyGoldUpgradeLoadPlanFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, legacyGoldUpgradeLoadPlanFragment, args);
        }
    }
}
