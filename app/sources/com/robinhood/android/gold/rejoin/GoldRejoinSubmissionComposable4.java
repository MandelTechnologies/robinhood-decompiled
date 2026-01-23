package com.robinhood.android.gold.rejoin;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposable4;
import com.robinhood.android.gold.rejoin.GoldRejoinSubmissionEvent;
import com.robinhood.android.gold.rejoin.GoldRejoinSubmissionViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: GoldRejoinSubmissionComposable.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a¢\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u000528\u0010\u0006\u001a4\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00010\u00072!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\u0012\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, m3636d2 = {"GoldRejoinSubmissionComposable", "", "enableSweep", "", "onOutcomeComplete", "Lkotlin/Function0;", "onRejoinLoaded", "Lkotlin/Function2;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "Lkotlin/ParameterName;", "name", "outcome", "onRejoinFailed", "Lkotlin/Function1;", "", "error", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionDuxo;", "rhToolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "(Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionDuxo;Lcom/robinhood/android/common/ui/view/RhToolbar;Landroidx/compose/runtime/Composer;II)V", "Loading", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-gold-rejoin_externalRelease", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionEvent;", "viewState", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldRejoinSubmissionComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldRejoinSubmissionComposable$lambda$3(Boolean bool, Function0 function0, Function2 function2, Function1 function1, Modifier modifier, GoldRejoinSubmissionDuxo goldRejoinSubmissionDuxo, RhToolbar rhToolbar, int i, int i2, Composer composer, int i3) {
        GoldRejoinSubmissionComposable(bool, function0, function2, function1, modifier, goldRejoinSubmissionDuxo, rhToolbar, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$4(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loading(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd A[PHI: r11
      0x00bd: PHI (r11v41 int) = (r11v0 int), (r11v6 int), (r11v7 int) binds: [B:66:0x00bb, B:76:0x00d5, B:75:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldRejoinSubmissionComposable(final Boolean bool, final Function0<Unit> onOutcomeComplete, final Function2<? super GoldUpgradeOutcome, ? super Boolean, Unit> onRejoinLoaded, final Function1<? super Throwable, Unit> onRejoinFailed, Modifier modifier, GoldRejoinSubmissionDuxo goldRejoinSubmissionDuxo, RhToolbar rhToolbar, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        GoldRejoinSubmissionDuxo goldRejoinSubmissionDuxo2;
        int i4;
        Modifier modifier3;
        RhToolbar rhToolbar2;
        GoldRejoinSubmissionDuxo goldRejoinSubmissionDuxo3;
        final Event<GoldRejoinSubmissionEvent> eventGoldRejoinSubmissionComposable$lambda$0;
        final RhToolbar rhToolbar3;
        final Modifier modifier4;
        final GoldRejoinSubmissionDuxo goldRejoinSubmissionDuxo4;
        EventConsumer<GoldRejoinSubmissionEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onOutcomeComplete, "onOutcomeComplete");
        Intrinsics.checkNotNullParameter(onRejoinLoaded, "onRejoinLoaded");
        Intrinsics.checkNotNullParameter(onRejoinFailed, "onRejoinFailed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1167222391);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(bool) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOutcomeComplete) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRejoinLoaded) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRejoinFailed) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    goldRejoinSubmissionDuxo2 = goldRejoinSubmissionDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(goldRejoinSubmissionDuxo2) ? 131072 : 65536;
                    i3 |= i6;
                } else {
                    goldRejoinSubmissionDuxo2 = goldRejoinSubmissionDuxo;
                }
                i3 |= i6;
            } else {
                goldRejoinSubmissionDuxo2 = goldRejoinSubmissionDuxo;
            }
            i4 = i2 & 64;
            int i7 = 1572864;
            if (i4 != 0) {
                i3 |= i7;
            } else if ((1572864 & i) == 0) {
                i7 = (2097152 & i) == 0 ? composerStartRestartGroup.changed(rhToolbar) : composerStartRestartGroup.changedInstance(rhToolbar) ? 1048576 : 524288;
                i3 |= i7;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) != 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldRejoinSubmissionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 &= -458753;
                        goldRejoinSubmissionDuxo2 = (GoldRejoinSubmissionDuxo) baseDuxo;
                    }
                    if (i4 == 0) {
                        goldRejoinSubmissionDuxo3 = goldRejoinSubmissionDuxo2;
                        rhToolbar2 = null;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1167222391, i3, -1, "com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposable (GoldRejoinSubmissionComposable.kt:40)");
                        }
                        final StateFlow<Event<GoldRejoinSubmissionEvent>> eventFlow = goldRejoinSubmissionDuxo3.getEventFlow();
                        composerStartRestartGroup.startReplaceGroup(-523522313);
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        Lifecycle.State state = Lifecycle.State.STARTED;
                        CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                        Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$$inlined$collectEventAsStateWithLifecycle$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "GoldRejoinSubmissionComposable.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                        if ((event != null ? event.getData() : null) instanceof GoldRejoinSubmissionEvent) {
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
                        Event<GoldRejoinSubmissionEvent> value = eventFlow.getValue();
                        Event<GoldRejoinSubmissionEvent> event = value;
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, (event == null ? event.getData() : null) instanceof GoldRejoinSubmissionEvent ? value : null, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldRejoinSubmissionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        eventGoldRejoinSubmissionComposable$lambda$0 = GoldRejoinSubmissionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (eventGoldRejoinSubmissionComposable$lambda$0 != null && (eventGoldRejoinSubmissionComposable$lambda$0.getData() instanceof GoldRejoinSubmissionEvent.Loaded) && (eventConsumerInvoke = eventGoldRejoinSubmissionComposable$lambda$0.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventGoldRejoinSubmissionComposable$lambda$0, new Function1() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m15067invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15067invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    GoldRejoinSubmissionEvent.Loaded loaded = (GoldRejoinSubmissionEvent.Loaded) eventGoldRejoinSubmissionComposable$lambda$0.getData();
                                    if (loaded.getOutcome().isComplete()) {
                                        onOutcomeComplete.invoke();
                                    }
                                    onRejoinLoaded.invoke(loaded.getOutcome(), bool);
                                }
                            });
                        }
                        final AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                        ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(553762629, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt.GoldRejoinSubmissionComposable.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i8) {
                                if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(553762629, i8, -1, "com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposable.<anonymous> (GoldRejoinSubmissionComposable.kt:55)");
                                }
                                Function2<Composer, Integer, Unit> lambda$2134505976$feature_gold_rejoin_externalRelease = GoldRejoinSubmissionComposable.INSTANCE.getLambda$2134505976$feature_gold_rejoin_externalRelease();
                                final AppCompatActivity appCompatActivity = appCompatActivityRequireActivityBaseContext;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$2134505976$feature_gold_rejoin_externalRelease, null, ComposableLambda3.rememberComposableLambda(1376983332, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt.GoldRejoinSubmissionComposable.2.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                        invoke(bentoAppBarScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i9) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i9 & 6) == 0) {
                                            i9 |= (i9 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1376983332, i9, -1, "com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposable.<anonymous>.<anonymous> (GoldRejoinSubmissionComposable.kt:58)");
                                        }
                                        AppCompatActivity appCompatActivity2 = appCompatActivity;
                                        composer3.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer3.changedInstance(appCompatActivity2);
                                        Object objRememberedValue2 = composer3.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new GoldRejoinSubmissionComposable5(appCompatActivity2);
                                            composer3.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer3.endReplaceGroup();
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue2), composer3, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1617837914, true, new C178613(modifier3, rhToolbar2, onRejoinFailed, snapshotState4CollectAsStateWithLifecycle2), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Modifier modifier5 = modifier3;
                        rhToolbar3 = rhToolbar2;
                        modifier4 = modifier5;
                        goldRejoinSubmissionDuxo4 = goldRejoinSubmissionDuxo3;
                    } else {
                        rhToolbar2 = rhToolbar;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    rhToolbar2 = rhToolbar;
                    modifier3 = modifier2;
                }
                goldRejoinSubmissionDuxo3 = goldRejoinSubmissionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Flow eventFlow2 = goldRejoinSubmissionDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "GoldRejoinSubmissionComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof GoldRejoinSubmissionEvent) {
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
                        Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<GoldRejoinSubmissionEvent> value2 = eventFlow2.getValue();
                Event<GoldRejoinSubmissionEvent> event2 = value2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(flow2, (event2 == null ? event2.getData() : null) instanceof GoldRejoinSubmissionEvent ? value2 : null, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(goldRejoinSubmissionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                eventGoldRejoinSubmissionComposable$lambda$0 = GoldRejoinSubmissionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3);
                if (eventGoldRejoinSubmissionComposable$lambda$0 != null) {
                    eventConsumerInvoke.consume(eventGoldRejoinSubmissionComposable$lambda$0, new Function1() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15067invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15067invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            GoldRejoinSubmissionEvent.Loaded loaded = (GoldRejoinSubmissionEvent.Loaded) eventGoldRejoinSubmissionComposable$lambda$0.getData();
                            if (loaded.getOutcome().isComplete()) {
                                onOutcomeComplete.invoke();
                            }
                            onRejoinLoaded.invoke(loaded.getOutcome(), bool);
                        }
                    });
                }
                final AppCompatActivity appCompatActivityRequireActivityBaseContext2 = BaseContexts.requireActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(553762629, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt.GoldRejoinSubmissionComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(553762629, i8, -1, "com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposable.<anonymous> (GoldRejoinSubmissionComposable.kt:55)");
                        }
                        Function2<Composer, Integer, Unit> lambda$2134505976$feature_gold_rejoin_externalRelease = GoldRejoinSubmissionComposable.INSTANCE.getLambda$2134505976$feature_gold_rejoin_externalRelease();
                        final AppCompatActivity appCompatActivity = appCompatActivityRequireActivityBaseContext2;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$2134505976$feature_gold_rejoin_externalRelease, null, ComposableLambda3.rememberComposableLambda(1376983332, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt.GoldRejoinSubmissionComposable.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i9) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i9 & 6) == 0) {
                                    i9 |= (i9 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1376983332, i9, -1, "com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposable.<anonymous>.<anonymous> (GoldRejoinSubmissionComposable.kt:58)");
                                }
                                AppCompatActivity appCompatActivity2 = appCompatActivity;
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer3.changedInstance(appCompatActivity2);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new GoldRejoinSubmissionComposable5(appCompatActivity2);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue2), composer3, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1617837914, true, new C178613(modifier3, rhToolbar2, onRejoinFailed, snapshotState4CollectAsStateWithLifecycle22), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                rhToolbar3 = rhToolbar2;
                modifier4 = modifier52;
                goldRejoinSubmissionDuxo4 = goldRejoinSubmissionDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                rhToolbar3 = rhToolbar;
                modifier4 = modifier2;
                goldRejoinSubmissionDuxo4 = goldRejoinSubmissionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldRejoinSubmissionComposable4.GoldRejoinSubmissionComposable$lambda$3(bool, onOutcomeComplete, onRejoinLoaded, onRejoinFailed, modifier4, goldRejoinSubmissionDuxo4, rhToolbar3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        int i72 = 1572864;
        if (i4 != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i4 == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: GoldRejoinSubmissionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$3 */
    static final class C178613 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Throwable, Unit> $onRejoinFailed;
        final /* synthetic */ RhToolbar $rhToolbar;
        final /* synthetic */ SnapshotState4<GoldRejoinSubmissionViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C178613(Modifier modifier, RhToolbar rhToolbar, Function1<? super Throwable, Unit> function1, SnapshotState4<? extends GoldRejoinSubmissionViewState> snapshotState4) {
            this.$modifier = modifier;
            this.$rhToolbar = rhToolbar;
            this.$onRejoinFailed = function1;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1617837914, i, -1, "com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposable.<anonymous> (GoldRejoinSubmissionComposable.kt:65)");
            }
            final GoldRejoinSubmissionViewState goldRejoinSubmissionViewStateGoldRejoinSubmissionComposable$lambda$1 = GoldRejoinSubmissionComposable4.GoldRejoinSubmissionComposable$lambda$1(this.$viewState$delegate);
            if (Intrinsics.areEqual(goldRejoinSubmissionViewStateGoldRejoinSubmissionComposable$lambda$1, GoldRejoinSubmissionViewState.Loading.INSTANCE)) {
                composer.startReplaceGroup(-1113587392);
                GoldRejoinSubmissionComposable4.Loading(PaddingKt.padding(this.$modifier, paddingValues), composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                if (!(goldRejoinSubmissionViewStateGoldRejoinSubmissionComposable$lambda$1 instanceof GoldRejoinSubmissionViewState.Failed)) {
                    composer.startReplaceGroup(-35924354);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1113450589);
                Unit unit = Unit.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.$rhToolbar);
                RhToolbar rhToolbar = this.$rhToolbar;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new GoldRejoinSubmissionComposable6(rhToolbar, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 6);
                Modifier modifierPadding = PaddingKt.padding(this.$modifier, paddingValues);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(this.$onRejoinFailed) | composer.changed(goldRejoinSubmissionViewStateGoldRejoinSubmissionComposable$lambda$1);
                final Function1<Throwable, Unit> function1 = this.$onRejoinFailed;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldRejoinSubmissionComposable4.C178613.invoke$lambda$2$lambda$1(function1, goldRejoinSubmissionViewStateGoldRejoinSubmissionComposable$lambda$1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                ErrorScreenComposable.ErrorScreenComposable(modifierPadding, (Function0) objRememberedValue2, 0, null, null, null, null, false, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(Function1 function1, GoldRejoinSubmissionViewState goldRejoinSubmissionViewState) {
            function1.invoke(((GoldRejoinSubmissionViewState.Failed) goldRejoinSubmissionViewState).getError());
            return Unit.INSTANCE;
        }
    }

    private static final Event<GoldRejoinSubmissionEvent> GoldRejoinSubmissionComposable$lambda$0(SnapshotState4<Event<GoldRejoinSubmissionEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldRejoinSubmissionViewState GoldRejoinSubmissionComposable$lambda$1(SnapshotState4<? extends GoldRejoinSubmissionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loading(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1500430436);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1500430436, i3, -1, "com.robinhood.android.gold.rejoin.Loading (GoldRejoinSubmissionComposable.kt:87)");
            }
            LocalShowPlaceholder.Loadable(true, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), null, GoldRejoinSubmissionComposable.INSTANCE.getLambda$1763470348$feature_gold_rejoin_externalRelease(), composerStartRestartGroup, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldRejoinSubmissionComposable4.Loading$lambda$4(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
