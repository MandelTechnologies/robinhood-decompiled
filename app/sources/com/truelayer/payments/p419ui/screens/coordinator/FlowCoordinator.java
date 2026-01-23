package com.truelayer.payments.p419ui.screens.coordinator;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.UserAccount;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.screens.Screen;
import com.truelayer.payments.p419ui.screens.coordinator.FlowCoordinatorViewModel;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionResult;
import com.truelayer.payments.p419ui.theme.Theme5;
import java.util.Map;
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

/* compiled from: FlowCoordinator.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002"}, m3636d2 = {"FlowCoordinator", "", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", "onSuccess", "Lkotlin/Function1;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Successful;", "onFailure", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/truelayer/payments/ui/models/PaymentContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release", "screen", "Lcom/truelayer/payments/ui/screens/Screen;", "loadingDialog", "Lcom/truelayer/payments/ui/screens/coordinator/FlowCoordinatorViewModel$LoadingMessage;", "networkErrorDialog", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FlowCoordinator {
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowCoordinator(final PaymentContext paymentContext, final Function1<? super ProcessorResult.Successful, Unit> onSuccess, final Function1<? super ProcessorResult.Failure, Unit> onFailure, CoroutineDispatcher coroutineDispatcher, Composer composer, final int i, final int i2) {
        int i3;
        CoroutineDispatcher io2;
        ViewModelStoreOwner current;
        CreationExtras defaultViewModelCreationExtras;
        final CoroutineDispatcher coroutineDispatcher2;
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1364846430);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(paymentContext) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSuccess) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFailure) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 1024;
        }
        if (i4 != 8 || (i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i4 != 0) {
                    i3 &= -7169;
                }
            } else {
                if (i4 != 0) {
                    io2 = Dispatchers.getIO();
                    i3 &= -7169;
                }
                int i5 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1364846430, i5, -1, "com.truelayer.payments.ui.screens.coordinator.FlowCoordinator (FlowCoordinator.kt:22)");
                }
                ViewModelProvider.Factory factoryFlowCoordinatorViewModel$default = FlowCoordinatorViewModel2.flowCoordinatorViewModel$default(paymentContext, null, null, io2, 6, null);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) FlowCoordinatorViewModel.class, current, (String) null, factoryFlowCoordinatorViewModel$default, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
                composerStartRestartGroup.endReplaceableGroup();
                final FlowCoordinatorViewModel flowCoordinatorViewModel = (FlowCoordinatorViewModel) viewModel;
                final SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(flowCoordinatorViewModel.getScreen(), null, composerStartRestartGroup, 8, 1);
                final SnapshotState4 snapshotState4CollectAsState2 = SnapshotStateKt.collectAsState(flowCoordinatorViewModel.getLoadingDialog(), null, composerStartRestartGroup, 8, 1);
                final SnapshotState4 snapshotState4CollectAsState3 = SnapshotStateKt.collectAsState(flowCoordinatorViewModel.getError(), null, composerStartRestartGroup, 8, 1);
                SnapshotState4 snapshotState4CollectAsState4 = SnapshotStateKt.collectAsState(flowCoordinatorViewModel.getMerchantConfig(), null, composerStartRestartGroup, 8, 1);
                composerStartRestartGroup.startReplaceableGroup(1151047387);
                int i6 = i5 & 14;
                boolean z = i6 == 4;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new FlowCoordinator2(paymentContext, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(paymentContext, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i6 | 64);
                final CoroutineDispatcher coroutineDispatcher3 = io2;
                Theme5.ConfigurableTheme(FlowCoordinator$lambda$3(snapshotState4CollectAsState4), false, ComposableLambda3.composableLambda(composerStartRestartGroup, 861927483, true, new Function3<Map<String, String>, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt.FlowCoordinator.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* compiled from: FlowCoordinator.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt$FlowCoordinator$2$1", m3645f = "FlowCoordinator.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt$FlowCoordinator$2$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Map<String, String> $customisations;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Map<String, String> map, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$customisations = map;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$customisations, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            if (!this.$customisations.isEmpty()) {
                                TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.UICustomised(this.$customisations, null, 2, 0 == true ? 1 : 0));
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map, Composer composer2, Integer num) {
                        invoke(map, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Map<String, String> customisations, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(customisations, "customisations");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(861927483, i7, -1, "com.truelayer.payments.ui.screens.coordinator.FlowCoordinator.<anonymous> (FlowCoordinator.kt:48)");
                        }
                        EffectsKt.LaunchedEffect(customisations, new AnonymousClass1(customisations, null), composer2, 72);
                        PaymentContext paymentContext2 = paymentContext;
                        Screen screenFlowCoordinator$lambda$0 = FlowCoordinator.FlowCoordinator$lambda$0(snapshotState4CollectAsState);
                        FlowCoordinatorViewModel.LoadingMessage loadingMessageFlowCoordinator$lambda$1 = FlowCoordinator.FlowCoordinator$lambda$1(snapshotState4CollectAsState2);
                        CoreError coreErrorFlowCoordinator$lambda$2 = FlowCoordinator.FlowCoordinator$lambda$2(snapshotState4CollectAsState3);
                        final FlowCoordinatorViewModel flowCoordinatorViewModel2 = flowCoordinatorViewModel;
                        Function1<Boolean, Unit> function1 = new Function1<Boolean, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt.FlowCoordinator.2.2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z2) {
                                flowCoordinatorViewModel2.initialize(z2);
                            }
                        };
                        final FlowCoordinatorViewModel flowCoordinatorViewModel3 = flowCoordinatorViewModel;
                        Function1<UserAccount, Unit> function12 = new Function1<UserAccount, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt.FlowCoordinator.2.3
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(UserAccount userAccount) {
                                invoke2(userAccount);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(UserAccount account) {
                                Intrinsics.checkNotNullParameter(account, "account");
                                flowCoordinatorViewModel3.selectUserAccount(account);
                            }
                        };
                        final FlowCoordinatorViewModel flowCoordinatorViewModel4 = flowCoordinatorViewModel;
                        Function1<UserAccount, Unit> function13 = new Function1<UserAccount, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt.FlowCoordinator.2.4
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(UserAccount userAccount) {
                                invoke2(userAccount);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(UserAccount account) {
                                Intrinsics.checkNotNullParameter(account, "account");
                                flowCoordinatorViewModel4.deleteUserAccount(account);
                            }
                        };
                        final FlowCoordinatorViewModel flowCoordinatorViewModel5 = flowCoordinatorViewModel;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt.FlowCoordinator.2.5
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
                                flowCoordinatorViewModel5.useNewAccount();
                            }
                        };
                        final FlowCoordinatorViewModel flowCoordinatorViewModel6 = flowCoordinatorViewModel;
                        Function1<ProviderSelectionResult, Unit> function14 = new Function1<ProviderSelectionResult, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt.FlowCoordinator.2.6
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ProviderSelectionResult providerSelectionResult) {
                                invoke2(providerSelectionResult);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ProviderSelectionResult it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                flowCoordinatorViewModel6.selectProvider(it);
                            }
                        };
                        final FlowCoordinatorViewModel flowCoordinatorViewModel7 = flowCoordinatorViewModel;
                        Function1<CoreError, Unit> function15 = new Function1<CoreError, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt.FlowCoordinator.2.7
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(CoreError coreError) {
                                invoke2(coreError);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(CoreError it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                flowCoordinatorViewModel7.onError(it);
                            }
                        };
                        final FlowCoordinatorViewModel flowCoordinatorViewModel8 = flowCoordinatorViewModel;
                        Function1<Map<String, ? extends String>, Unit> function16 = new Function1<Map<String, ? extends String>, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt.FlowCoordinator.2.8
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
                                invoke2((Map<String, String>) map);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Map<String, String> it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                flowCoordinatorViewModel8.submitAdditionalInputs(it);
                            }
                        };
                        final FlowCoordinatorViewModel flowCoordinatorViewModel9 = flowCoordinatorViewModel;
                        Function2<String, Context, Unit> function2 = new Function2<String, Context, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt.FlowCoordinator.2.9
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(String str, Context context) {
                                invoke2(str, context);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String url, Context context) {
                                Intrinsics.checkNotNullParameter(url, "url");
                                Intrinsics.checkNotNullParameter(context, "context");
                                flowCoordinatorViewModel9.redirect(url, context);
                            }
                        };
                        final FlowCoordinatorViewModel flowCoordinatorViewModel10 = flowCoordinatorViewModel;
                        Function1<PaymentCancellationReason, Unit> function17 = new Function1<PaymentCancellationReason, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt.FlowCoordinator.2.10
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PaymentCancellationReason paymentCancellationReason) {
                                invoke2(paymentCancellationReason);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(PaymentCancellationReason it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                flowCoordinatorViewModel10.cancelPayment(it);
                            }
                        };
                        composer2.startReplaceableGroup(-1772195389);
                        boolean zChanged = composer2.changed(onSuccess);
                        final Function1<ProcessorResult.Successful, Unit> function18 = onSuccess;
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<ProcessorResult.Successful, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt$FlowCoordinator$2$11$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult.Successful successful) {
                                    invoke2(successful);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ProcessorResult.Successful it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    function18.invoke(it);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Function1<ProcessorResult.Failure, Unit> function19 = onFailure;
                        final FlowCoordinatorViewModel flowCoordinatorViewModel11 = flowCoordinatorViewModel;
                        FlowCoordinatorContainerKt.FlowCoordinatorContainer(paymentContext2, screenFlowCoordinator$lambda$0, loadingMessageFlowCoordinator$lambda$1, coreErrorFlowCoordinator$lambda$2, new FlowCoordinatorActions(function1, function12, function13, function0, function14, function15, function16, function2, function17, (Function1) objRememberedValue2, function19, new Function1<Payment, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt.FlowCoordinator.2.12
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Payment payment) {
                                invoke2(payment);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Payment it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                flowCoordinatorViewModel11.notifyPaymentStateChanged(it);
                            }
                        }), coroutineDispatcher3, composer2, 266240, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 392, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                coroutineDispatcher2 = coroutineDispatcher3;
            }
            io2 = coroutineDispatcher;
            int i52 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ViewModelProvider.Factory factoryFlowCoordinatorViewModel$default2 = FlowCoordinatorViewModel2.flowCoordinatorViewModel$default(paymentContext, null, null, io2, 6, null);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current != null) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            coroutineDispatcher2 = coroutineDispatcher;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorKt.FlowCoordinator.3
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

                public final void invoke(Composer composer2, int i7) {
                    FlowCoordinator.FlowCoordinator(paymentContext, onSuccess, onFailure, coroutineDispatcher2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen FlowCoordinator$lambda$0(SnapshotState4<? extends Screen> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlowCoordinatorViewModel.LoadingMessage FlowCoordinator$lambda$1(SnapshotState4<FlowCoordinatorViewModel.LoadingMessage> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoreError FlowCoordinator$lambda$2(SnapshotState4<? extends CoreError> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final MerchantConfig FlowCoordinator$lambda$3(SnapshotState4<MerchantConfig> snapshotState4) {
        return snapshotState4.getValue();
    }
}
