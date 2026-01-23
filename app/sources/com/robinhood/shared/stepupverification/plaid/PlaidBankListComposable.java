package com.robinhood.shared.stepupverification.plaid;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
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
import com.robinhood.android.ach.format.BankAccountTypes;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.p355ui.pathfinder.contexts.PlaidBankListContext;
import com.robinhood.shared.stepupverification.plaid.PlaidBankListComposable;
import java.util.List;
import kotlin.Metadata;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PlaidBankListComposable.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\u0012\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u008a\u0084\u0002"}, m3636d2 = {"PlaidBankListComposable", "", "pathfinderContext", "Lcom/robinhood/models/ui/pathfinder/contexts/PlaidBankListContext;", "onContinueClicked", "Lkotlin/Function0;", "onUseFallback", "activityErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/stepupverification/plaid/PlaidBankListDuxo;", "(Lcom/robinhood/models/ui/pathfinder/contexts/PlaidBankListContext;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/stepupverification/plaid/PlaidBankListDuxo;Landroidx/compose/runtime/Composer;II)V", "Header", "heading", "", "subheading", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "BankAccountRow", "account", "Lcom/robinhood/models/ui/pathfinder/contexts/PlaidBankListContext$BankAccount;", "(Lcom/robinhood/models/ui/pathfinder/contexts/PlaidBankListContext$BankAccount;Landroidx/compose/runtime/Composer;I)V", "feature-step-up-verification_externalDebug", "viewState", "Lcom/robinhood/shared/stepupverification/plaid/PlaidBankListViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PlaidBankListComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BankAccountRow$lambda$6(PlaidBankListContext.BankAccount bankAccount, int i, Composer composer, int i2) {
        BankAccountRow(bankAccount, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$5(String str, String str2, int i, Composer composer, int i2) {
        Header(str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaidBankListComposable$lambda$3(PlaidBankListContext plaidBankListContext, Function0 function0, Function0 function02, ActivityErrorHandler activityErrorHandler, Modifier modifier, PlaidBankListDuxo plaidBankListDuxo, int i, int i2, Composer composer, int i3) {
        PlaidBankListComposable(plaidBankListContext, function0, function02, activityErrorHandler, modifier, plaidBankListDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlaidBankListComposable(final PlaidBankListContext pathfinderContext, final Function0<Unit> onContinueClicked, final Function0<Unit> onUseFallback, final ActivityErrorHandler activityErrorHandler, Modifier modifier, PlaidBankListDuxo plaidBankListDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PlaidBankListDuxo plaidBankListDuxo2;
        Modifier modifier3;
        Composer composer2;
        PlaidBankListDuxo plaidBankListDuxo3;
        Event<Throwable> event;
        final Event<Throwable> eventPlaidBankListComposable$lambda$1;
        Composer composer3;
        final Modifier modifier4;
        final PlaidBankListDuxo plaidBankListDuxo4;
        EventConsumer<Throwable> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pathfinderContext, "pathfinderContext");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(onUseFallback, "onUseFallback");
        Intrinsics.checkNotNullParameter(activityErrorHandler, "activityErrorHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(197637279);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(pathfinderContext) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onUseFallback) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(activityErrorHandler) : composerStartRestartGroup.changedInstance(activityErrorHandler) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    plaidBankListDuxo2 = plaidBankListDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(plaidBankListDuxo2) ? 131072 : 65536;
                    i3 |= i5;
                } else {
                    plaidBankListDuxo2 = plaidBankListDuxo;
                }
                i3 |= i5;
            } else {
                plaidBankListDuxo2 = plaidBankListDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PlaidBankListDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                        composer2.endReplaceGroup();
                        plaidBankListDuxo3 = (PlaidBankListDuxo) baseDuxo;
                        i3 &= -458753;
                    } else {
                        composer2 = composerStartRestartGroup;
                        plaidBankListDuxo3 = plaidBankListDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier3 = modifier2;
                    plaidBankListDuxo3 = plaidBankListDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(197637279, i3, -1, "com.robinhood.shared.stepupverification.plaid.PlaidBankListComposable (PlaidBankListComposable.kt:38)");
                }
                Composer composer4 = composer2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(plaidBankListDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                final StateFlow<Event<Throwable>> eventFlow = plaidBankListDuxo3.getEventFlow();
                composer4.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer4.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PlaidBankListComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof Throwable) {
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
                Event<Throwable> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof Throwable)) {
                    value = null;
                }
                PlaidBankListDuxo plaidBankListDuxo5 = plaidBankListDuxo3;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer4, 0, 0);
                composer4.endReplaceGroup();
                eventPlaidBankListComposable$lambda$1 = PlaidBankListComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPlaidBankListComposable$lambda$1 != null && (eventPlaidBankListComposable$lambda$1.getData() instanceof Throwable) && (eventConsumerInvoke = eventPlaidBankListComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventPlaidBankListComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25735invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25735invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(activityErrorHandler, (Throwable) eventPlaidBankListComposable$lambda$1.getData(), false, 2, null);
                        }
                    });
                }
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(-319131126, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt.PlaidBankListComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer5, Integer num) {
                        invoke(bentoButtonBar3, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer5, int i6) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i6 & 17) == 16 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-319131126, i6, -1, "com.robinhood.shared.stepupverification.plaid.PlaidBankListComposable.<anonymous> (PlaidBankListComposable.kt:49)");
                        }
                        BentoButtonBar2.BentoButtonBar(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, null, null, onContinueClicked, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer5, 0), PlaidBankListComposable.PlaidBankListComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isLoading(), null, false, onUseFallback, pathfinderContext.getFallbackCtaText(), PlaidBankListComposable.PlaidBankListComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isLoading(), null, false, composer5, 0, 0, 50750);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer4, 54), ComposableLambda3.rememberComposableLambda(1545116343, true, new C399183(pathfinderContext), composer4, 54), composer4, 3456, 2);
                composer3 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                plaidBankListDuxo4 = plaidBankListDuxo5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                plaidBankListDuxo4 = plaidBankListDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PlaidBankListComposable.PlaidBankListComposable$lambda$3(pathfinderContext, onContinueClicked, onUseFallback, activityErrorHandler, modifier4, plaidBankListDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                final SnapshotState4<PlaidBankListViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(plaidBankListDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                final Flow eventFlow2 = plaidBankListDuxo3.getEventFlow();
                composer42.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer42.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PlaidBankListComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof Throwable) {
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
                Event<Throwable> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof Throwable)) {
                }
                PlaidBankListDuxo plaidBankListDuxo52 = plaidBankListDuxo3;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composer42, 0, 0);
                composer42.endReplaceGroup();
                eventPlaidBankListComposable$lambda$1 = PlaidBankListComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventPlaidBankListComposable$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventPlaidBankListComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25735invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25735invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(activityErrorHandler, (Throwable) eventPlaidBankListComposable$lambda$1.getData(), false, 2, null);
                        }
                    });
                }
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(-319131126, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt.PlaidBankListComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer5, Integer num) {
                        invoke(bentoButtonBar3, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer5, int i6) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i6 & 17) == 16 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-319131126, i6, -1, "com.robinhood.shared.stepupverification.plaid.PlaidBankListComposable.<anonymous> (PlaidBankListComposable.kt:49)");
                        }
                        BentoButtonBar2.BentoButtonBar(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, null, null, onContinueClicked, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer5, 0), PlaidBankListComposable.PlaidBankListComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).isLoading(), null, false, onUseFallback, pathfinderContext.getFallbackCtaText(), PlaidBankListComposable.PlaidBankListComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).isLoading(), null, false, composer5, 0, 0, 50750);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer42, 54), ComposableLambda3.rememberComposableLambda(1545116343, true, new C399183(pathfinderContext), composer42, 54), composer42, 3456, 2);
                composer3 = composer42;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                plaidBankListDuxo4 = plaidBankListDuxo52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: PlaidBankListComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$3 */
    static final class C399183 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ PlaidBankListContext $pathfinderContext;

        C399183(PlaidBankListContext plaidBankListContext) {
            this.$pathfinderContext = plaidBankListContext;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1545116343, i, -1, "com.robinhood.shared.stepupverification.plaid.PlaidBankListComposable.<anonymous> (PlaidBankListComposable.kt:60)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$pathfinderContext);
            final PlaidBankListContext plaidBankListContext = this.$pathfinderContext;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PlaidBankListComposable.C399183.invoke$lambda$2$lambda$1(plaidBankListContext, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 6, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(final PlaidBankListContext plaidBankListContext, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1368842302, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$3$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1368842302, i, -1, "com.robinhood.shared.stepupverification.plaid.PlaidBankListComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PlaidBankListComposable.kt:62)");
                    }
                    PlaidBankListComposable.Header(plaidBankListContext.getHeading(), plaidBankListContext.getSubheading(), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            final List<PlaidBankListContext.BankAccount> bankList = plaidBankListContext.getBankList();
            final C39913xe9c9a758 c39913xe9c9a758 = new Function1() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$3$invoke$lambda$2$lambda$1$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(PlaidBankListContext.BankAccount bankAccount) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((PlaidBankListContext.BankAccount) obj);
                }
            };
            LazyColumn.items(bankList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$3$invoke$lambda$2$lambda$1$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c39913xe9c9a758.invoke(bankList.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$PlaidBankListComposable$3$invoke$lambda$2$lambda$1$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    PlaidBankListContext.BankAccount bankAccount = (PlaidBankListContext.BankAccount) bankList.get(i);
                    composer.startReplaceGroup(-423868523);
                    PlaidBankListComposable.BankAccountRow(bankAccount, composer, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Header(final String str, String str2, Composer composer, final int i) {
        int i2;
        final String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-952450472);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-952450472, i2, -1, "com.robinhood.shared.stepupverification.plaid.Header (PlaidBankListComposable.kt:77)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, i2 & 14, 0, 8126);
            str3 = str2;
            BentoText2.m20747BentoText38GnDrw(str3, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, (i2 >> 3) & 14, 0, 8126);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PlaidBankListComposable.Header$lambda$5(str, str3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlaidBankListViewState PlaidBankListComposable$lambda$0(SnapshotState4<PlaidBankListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<Throwable> PlaidBankListComposable$lambda$1(SnapshotState4<Event<Throwable>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BankAccountRow(final PlaidBankListContext.BankAccount bankAccount, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2009444631);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bankAccount) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2009444631, i2, -1, "com.robinhood.shared.stepupverification.plaid.BankAccountRow (PlaidBankListComposable.kt:99)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BANKING_24, null, null, 6, null);
            String nickname = bankAccount.getNickname();
            ApiAchRelationship.BankAccountType type2 = bankAccount.getType();
            Intrinsics.checkNotNull(resources);
            composer2 = composerStartRestartGroup;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, icon, nickname, BankAccountTypes.getTypeAndLastFourDisplayString(type2, resources, bankAccount.getLastFourNumbers()), null, null, null, false, false, false, 0L, null, composer2, BentoBaseRowState.Start.Icon.$stable << 3, 0, 4081);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidBankListComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PlaidBankListComposable.BankAccountRow$lambda$6(bankAccount, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
