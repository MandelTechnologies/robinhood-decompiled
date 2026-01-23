package com.truelayer.payments.p419ui.screens.result;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.compose.BackHandler;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.analytics.utils.ResourceType;
import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.payments.PaymentFailureReason;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.store.Store;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ResultContainer.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, m3636d2 = {"ResultContainer", "", "resultContext", "Lcom/truelayer/payments/ui/screens/result/ResultContext;", "onSuccess", "Lkotlin/Function1;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Successful;", "onFailure", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "api", "Lcom/truelayer/payments/core/network/Network;", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/truelayer/payments/ui/screens/result/ResultContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/truelayer/payments/core/network/Network;Lcom/truelayer/payments/core/store/Store;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release", "screen", "Lcom/truelayer/payments/ui/screens/result/ResultScreen;"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.result.ResultContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ResultContainer {
    public static final void ResultContainer(final ResultContext resultContext, final Function1<? super ProcessorResult.Successful, Unit> onSuccess, final Function1<? super ProcessorResult.Failure, Unit> onFailure, Network network, Store store, CoroutineDispatcher coroutineDispatcher, Composer composer, final int i, final int i2) {
        final Network network2;
        int i3;
        int i4;
        final Store store2;
        int i5;
        final CoroutineDispatcher io2;
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(resultContext, "resultContext");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Composer composerStartRestartGroup = composer.startRestartGroup(357758801);
        if ((i2 & 8) != 0) {
            network2 = TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork();
            i3 = i & (-7169);
        } else {
            network2 = network;
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            i4 = i3 & (-57345);
            store2 = TrueLayerUI.INSTANCE.getCore$payments_ui_release().getStore();
        } else {
            i4 = i3;
            store2 = store;
        }
        if ((i2 & 32) != 0) {
            i5 = i4 & (-458753);
            io2 = Dispatchers.getIO();
        } else {
            i5 = i4;
            io2 = coroutineDispatcher;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357758801, i5, -1, "com.truelayer.payments.ui.screens.result.ResultContainer (ResultContainer.kt:38)");
        }
        ViewModelProvider.Factory factoryResultViewModel = ResultContainerViewModel8.resultViewModel(resultContext, network2, store2, io2);
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) ResultContainerViewModel.class, current, (String) null, factoryResultViewModel, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        final ResultContainerViewModel resultContainerViewModel = (ResultContainerViewModel) viewModel;
        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final String strStringResource = StringResources_androidKt.stringResource(C42830R.string.wait_screen_back_button_message, composerStartRestartGroup, 0);
        SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(resultContainerViewModel.getScreen(), null, composerStartRestartGroup, 8, 1);
        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        EffectsKt.DisposableEffect(lifecycle, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerKt.ResultContainer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                lifecycle.addObserver(resultContainerViewModel);
                final Lifecycle lifecycle2 = lifecycle;
                final ResultContainerViewModel resultContainerViewModel2 = resultContainerViewModel;
                return new DisposableEffectResult() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerKt$ResultContainer$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        lifecycle2.removeObserver(resultContainerViewModel2);
                    }
                };
            }
        }, composerStartRestartGroup, 8);
        BackHandler.BackHandler(true, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerKt.ResultContainer.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Toast.makeText(context, strStringResource, 1).show();
            }
        }, composerStartRestartGroup, 6, 0);
        EffectsKt.LaunchedEffect(Boolean.TRUE, new C432373(resultContext, resultContainerViewModel, null), composerStartRestartGroup, 70);
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getBackground(), null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM4872backgroundbw27NRU$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ResultScreen resultScreenResultContainer$lambda$0 = ResultContainer$lambda$0(snapshotState4CollectAsState);
        if (resultScreenResultContainer$lambda$0 instanceof Loading) {
            composerStartRestartGroup.startReplaceableGroup(-924909510);
            ResultLoading3.ResultLoading(((Loading) resultScreenResultContainer$lambda$0).getProvider(), composerStartRestartGroup, 8, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (resultScreenResultContainer$lambda$0 instanceof InProgress) {
            composerStartRestartGroup.startReplaceableGroup(-924909406);
            InProgress inProgress = (InProgress) resultScreenResultContainer$lambda$0;
            Currency currency = inProgress.getCurrency();
            long amountInMinor = inProgress.getAmountInMinor();
            String reference = inProgress.getReference();
            String clientName = inProgress.getClientName();
            ResultScreen8 type2 = inProgress.getType();
            composerStartRestartGroup.startReplaceableGroup(-924909100);
            boolean z = (((i & 112) ^ 48) > 32 && composerStartRestartGroup.changed(onSuccess)) || (i & 48) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerKt$ResultContainer$4$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.PaymentResultContinueClicked(null, 1, null));
                        onSuccess.invoke(new ProcessorResult.Successful(ProcessorResult.PaymentStep.Authorized));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ResultKt.ResultInProgress(currency, amountInMinor, reference, clientName, type2, (Function0) objRememberedValue, composerStartRestartGroup, 8, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceableGroup();
        } else if (resultScreenResultContainer$lambda$0 instanceof Success) {
            composerStartRestartGroup.startReplaceableGroup(-924908797);
            Success success = (Success) resultScreenResultContainer$lambda$0;
            Currency currency2 = success.getCurrency();
            long amountInMinor2 = success.getAmountInMinor();
            String reference2 = success.getReference();
            String clientName2 = success.getClientName();
            PaymentProvider provider = success.getProvider();
            ResultScreen8 type3 = success.getType();
            composerStartRestartGroup.startReplaceableGroup(-924908446);
            boolean z2 = (((i & 112) ^ 48) > 32 && composerStartRestartGroup.changed(onSuccess)) || (i & 48) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerKt$ResultContainer$4$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.PaymentResultContinueClicked(null, 1, null));
                        onSuccess.invoke(new ProcessorResult.Successful(ProcessorResult.PaymentStep.Successful));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ResultKt.ResultSuccess(currency2, amountInMinor2, reference2, clientName2, provider, type3, (Function0) objRememberedValue2, composerStartRestartGroup, 32776, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceableGroup();
        } else if (resultScreenResultContainer$lambda$0 instanceof Failed) {
            composerStartRestartGroup.startReplaceableGroup(-924908144);
            Failed failed = (Failed) resultScreenResultContainer$lambda$0;
            PaymentFailureReason failureReason = failed.getFailureReason();
            String clientName3 = failed.getClientName();
            String reference3 = failed.getReference();
            PaymentProvider provider2 = failed.getProvider();
            ResultScreen8 type4 = failed.getType();
            composerStartRestartGroup.startReplaceableGroup(-924907842);
            boolean z3 = (((i & 896) ^ 384) > 256 && composerStartRestartGroup.changed(onFailure)) || (i & 384) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerKt$ResultContainer$4$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.PaymentResultContinueClicked(null, 1, null));
                        onFailure.invoke(new ProcessorResult.Failure(ProcessorResult.FailureReason.PaymentFailed));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ResultKt.ResultFailed(failureReason, clientName3, reference3, provider2, type4, (Function0) objRememberedValue3, composerStartRestartGroup, 4096, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceableGroup();
        } else if (resultScreenResultContainer$lambda$0 instanceof ResultError) {
            composerStartRestartGroup.startReplaceableGroup(-924907533);
            EffectsKt.LaunchedEffect(resultScreenResultContainer$lambda$0, new ResultContainer5(resultContext, resultScreenResultContainer$lambda$0, onFailure, null), composerStartRestartGroup, 64);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            if (resultScreenResultContainer$lambda$0 instanceof NeedsFurtherProcessing ? true : resultScreenResultContainer$lambda$0 instanceof ResultScreen4) {
                composerStartRestartGroup.startReplaceableGroup(-924906695);
                EffectsKt.LaunchedEffect(resultScreenResultContainer$lambda$0, new ResultContainer6(resultContext, onFailure, null), composerStartRestartGroup, 64);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-924906128);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultContainerKt.ResultContainer.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    ResultContainer.ResultContainer(resultContext, onSuccess, onFailure, network2, store2, io2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* compiled from: ResultContainer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.result.ResultContainerKt$ResultContainer$3", m3645f = "ResultContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.result.ResultContainerKt$ResultContainer$3 */
    static final class C432373 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ResultContext $resultContext;
        final /* synthetic */ ResultContainerViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C432373(ResultContext resultContext, ResultContainerViewModel resultContainerViewModel, Continuation<? super C432373> continuation) {
            super(2, continuation);
            this.$resultContext = resultContext;
            this.$viewModel = resultContainerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C432373(this.$resultContext, this.$viewModel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C432373) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrueLayerAnalytics.INSTANCE.setAnalyticsContext(new TrueLayerAnalytics.AnalyticsContext(this.$resultContext.getId(), null, this.$resultContext.getPaymentContext().getResourceToken(), ResourceType.PAYMENT, null, null, null, this.$resultContext.getIsReactNative() ? TrueLayerAnalytics.IntegrationType.ReactNative : TrueLayerAnalytics.IntegrationType.Native, this.$resultContext.getIntegrationVersion(), 114, null));
            this.$viewModel.init();
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.PaymentResultLoaderDisplayed(null, 1, null));
            return Unit.INSTANCE;
        }
    }

    private static final ResultScreen ResultContainer$lambda$0(SnapshotState4<? extends ResultScreen> snapshotState4) {
        return snapshotState4.getValue();
    }
}
