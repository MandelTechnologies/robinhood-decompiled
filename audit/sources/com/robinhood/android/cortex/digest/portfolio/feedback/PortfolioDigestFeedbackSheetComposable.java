package com.robinhood.android.cortex.digest.portfolio.feedback;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposable;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackType;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations6;
import com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackDuxo3;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.result.ObserveResult;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.duxo.DuxosKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: PortfolioDigestFeedbackSheetComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a!\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000bH\u0001¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u008a\u0084\u0002"}, m3636d2 = {"RESULT_KEY_FEEDBACK", "", "PortfolioDigestFeedbackSheetComposable", "", "args", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest$Args;", "duxo", "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackDuxo;", "(Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest$Args;Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackDuxo;Landroidx/compose/runtime/Composer;II)V", "ObserveDigestFeedbackSheetResult", "onResult", "Lkotlin/Function1;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestFeedbackSheetDest$Result;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-cortex-digest-portfolio_externalDebug", "viewState", "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestFeedbackSheetComposable {
    private static final String RESULT_KEY_FEEDBACK = "feedback";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ObserveDigestFeedbackSheetResult$lambda$9(Function1 function1, int i, Composer composer, int i2) {
        ObserveDigestFeedbackSheetResult(function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestFeedbackSheetComposable$lambda$6(PortfolioDigestDestinations6.Args args, PortfolioDigestFeedbackDuxo portfolioDigestFeedbackDuxo, int i, int i2, Composer composer, int i3) {
        PortfolioDigestFeedbackSheetComposable(args, portfolioDigestFeedbackDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioDigestFeedbackSheetComposable(final PortfolioDigestDestinations6.Args args, final PortfolioDigestFeedbackDuxo portfolioDigestFeedbackDuxo, Composer composer, final int i, final int i2) {
        int i3;
        final LifecycleAwareNavigator lifecycleAwareNavigator;
        final Event<PortfolioDigestFeedbackDuxo3> eventPortfolioDigestFeedbackSheetComposable$lambda$1;
        final Event<PortfolioDigestFeedbackDuxo3> eventPortfolioDigestFeedbackSheetComposable$lambda$12;
        Composer composer2;
        boolean z;
        Object objRememberedValue;
        EventConsumer<PortfolioDigestFeedbackDuxo3> eventConsumerInvoke;
        EventConsumer<PortfolioDigestFeedbackDuxo3> eventConsumerInvoke2;
        int i4;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(855649010);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) != 0) {
                i4 = 16;
                i3 |= i4;
            } else {
                if ((i & 64) == 0 ? composerStartRestartGroup.changed(portfolioDigestFeedbackDuxo) : composerStartRestartGroup.changedInstance(portfolioDigestFeedbackDuxo)) {
                    i4 = 32;
                }
                i3 |= i4;
            }
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PortfolioDigestFeedbackDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposableKt$PortfolioDigestFeedbackSheetComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposableKt$PortfolioDigestFeedbackSheetComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    portfolioDigestFeedbackDuxo = (PortfolioDigestFeedbackDuxo) baseDuxo;
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(855649010, i3, -1, "com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposable (PortfolioDigestFeedbackSheetComposable.kt:20)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestFeedbackDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestFeedbackDuxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                eventPortfolioDigestFeedbackSheetComposable$lambda$1 = PortfolioDigestFeedbackSheetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPortfolioDigestFeedbackSheetComposable$lambda$1 != null && (eventPortfolioDigestFeedbackSheetComposable$lambda$1.getData() instanceof PortfolioDigestFeedbackDuxo3.Success) && (eventConsumerInvoke2 = eventPortfolioDigestFeedbackSheetComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventPortfolioDigestFeedbackSheetComposable$lambda$1, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposableKt$PortfolioDigestFeedbackSheetComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12602invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12602invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LifecycleAwareNavigator.setResultAndPop$default(lifecycleAwareNavigator, new PortfolioDigestDestinations6.Result.Success(((PortfolioDigestFeedbackDuxo3.Success) eventPortfolioDigestFeedbackSheetComposable$lambda$1.getData()).getFeedback()), "feedback", false, 4, null);
                        }
                    });
                }
                eventPortfolioDigestFeedbackSheetComposable$lambda$12 = PortfolioDigestFeedbackSheetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPortfolioDigestFeedbackSheetComposable$lambda$12 != null && (eventPortfolioDigestFeedbackSheetComposable$lambda$12.getData() instanceof PortfolioDigestFeedbackDuxo3.Error) && (eventConsumerInvoke = eventPortfolioDigestFeedbackSheetComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventPortfolioDigestFeedbackSheetComposable$lambda$12, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposableKt$PortfolioDigestFeedbackSheetComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12603invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12603invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LifecycleAwareNavigator.setResultAndPop$default(lifecycleAwareNavigator, PortfolioDigestDestinations6.Result.Error.INSTANCE, "feedback", false, 4, null);
                        }
                    });
                }
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null));
                composer2 = composerStartRestartGroup;
                DigestFeedback feedback = args.getFeedback();
                DigestFeedbackType feedbackType = args.getFeedbackType();
                boolean zIsLoading = PortfolioDigestFeedbackSheetComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isLoading();
                composer2.startReplaceGroup(5004770);
                z = (((i3 & 112) ^ 48) <= 32 && composer2.changedInstance(portfolioDigestFeedbackDuxo)) || (i3 & 48) == 32;
                objRememberedValue = composer2.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PortfolioDigestFeedbackSheetComposable.PortfolioDigestFeedbackSheetComposable$lambda$5$lambda$4(portfolioDigestFeedbackDuxo, (DigestFeedback) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                DigestFeedbackSheetComposable.DigestFeedbackSheetComposable(feedback, feedbackType, zIsLoading, (Function1) objRememberedValue, modifierNavigationBarsPadding, composer2, 0, 0);
                composerStartRestartGroup = composer2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestFeedbackDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestFeedbackDuxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                eventPortfolioDigestFeedbackSheetComposable$lambda$1 = PortfolioDigestFeedbackSheetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventPortfolioDigestFeedbackSheetComposable$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventPortfolioDigestFeedbackSheetComposable$lambda$1, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposableKt$PortfolioDigestFeedbackSheetComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12602invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12602invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LifecycleAwareNavigator.setResultAndPop$default(lifecycleAwareNavigator, new PortfolioDigestDestinations6.Result.Success(((PortfolioDigestFeedbackDuxo3.Success) eventPortfolioDigestFeedbackSheetComposable$lambda$1.getData()).getFeedback()), "feedback", false, 4, null);
                        }
                    });
                }
                eventPortfolioDigestFeedbackSheetComposable$lambda$12 = PortfolioDigestFeedbackSheetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventPortfolioDigestFeedbackSheetComposable$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventPortfolioDigestFeedbackSheetComposable$lambda$12, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposableKt$PortfolioDigestFeedbackSheetComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m12603invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m12603invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LifecycleAwareNavigator.setResultAndPop$default(lifecycleAwareNavigator, PortfolioDigestDestinations6.Result.Error.INSTANCE, "feedback", false, 4, null);
                        }
                    });
                }
                Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null));
                composer2 = composerStartRestartGroup;
                DigestFeedback feedback2 = args.getFeedback();
                DigestFeedbackType feedbackType2 = args.getFeedbackType();
                boolean zIsLoading2 = PortfolioDigestFeedbackSheetComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).isLoading();
                composer2.startReplaceGroup(5004770);
                if (((i3 & 112) ^ 48) <= 32) {
                    objRememberedValue = composer2.rememberedValue();
                    if (z) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PortfolioDigestFeedbackSheetComposable.PortfolioDigestFeedbackSheetComposable$lambda$5$lambda$4(portfolioDigestFeedbackDuxo, (DigestFeedback) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                        composer2.endReplaceGroup();
                        DigestFeedbackSheetComposable.DigestFeedbackSheetComposable(feedback2, feedbackType2, zIsLoading2, (Function1) objRememberedValue, modifierNavigationBarsPadding2, composer2, 0, 0);
                        composerStartRestartGroup = composer2;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                } else {
                    objRememberedValue = composer2.rememberedValue();
                    if (z) {
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PortfolioDigestFeedbackSheetComposable.PortfolioDigestFeedbackSheetComposable$lambda$6(args, portfolioDigestFeedbackDuxo, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestFeedbackSheetComposable$lambda$5$lambda$4(PortfolioDigestFeedbackDuxo portfolioDigestFeedbackDuxo, DigestFeedback feedback) {
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        portfolioDigestFeedbackDuxo.submitFeedback(feedback);
        return Unit.INSTANCE;
    }

    public static final void ObserveDigestFeedbackSheetResult(final Function1<? super PortfolioDigestDestinations6.Result, Unit> onResult, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1036661467);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onResult) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1036661467, i2, -1, "com.robinhood.android.cortex.digest.portfolio.feedback.ObserveDigestFeedbackSheetResult (PortfolioDigestFeedbackSheetComposable.kt:56)");
            }
            SavedStateHandle savedStateHandle = ((LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator())).getEntry().getSavedStateHandle();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PortfolioDigestFeedbackSheetComposable.ObserveDigestFeedbackSheetResult$lambda$8$lambda$7(onResult, (PortfolioDigestDestinations6.Result) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ObserveResult.ObserveResult(savedStateHandle, RESULT_KEY_FEEDBACK, (Function1) objRememberedValue, composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PortfolioDigestFeedbackSheetComposable.ObserveDigestFeedbackSheetResult$lambda$9(onResult, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ObserveDigestFeedbackSheetResult$lambda$8$lambda$7(Function1 function1, PortfolioDigestDestinations6.Result it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    private static final PortfolioDigestFeedbackViewState PortfolioDigestFeedbackSheetComposable$lambda$0(SnapshotState4<PortfolioDigestFeedbackViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<PortfolioDigestFeedbackDuxo3> PortfolioDigestFeedbackSheetComposable$lambda$1(SnapshotState4<Event<PortfolioDigestFeedbackDuxo3>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
