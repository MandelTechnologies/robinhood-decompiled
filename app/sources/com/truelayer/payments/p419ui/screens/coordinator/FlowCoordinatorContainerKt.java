package com.truelayer.payments.p419ui.screens.coordinator;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.view.compose.BackHandler;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.UserAccount;
import com.truelayer.payments.core.logger.Logger6;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.components.LoadingDialog4;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.screens.Screen;
import com.truelayer.payments.p419ui.screens.account.AccountSelectionKt;
import com.truelayer.payments.p419ui.screens.components.CancelPaymentDialog;
import com.truelayer.payments.p419ui.screens.components.FailureScreen;
import com.truelayer.payments.p419ui.screens.components.NetworkErrorView;
import com.truelayer.payments.p419ui.screens.coordinator.FlowCoordinatorViewModel;
import com.truelayer.payments.p419ui.screens.coordinator.FlowState;
import com.truelayer.payments.p419ui.screens.formflows.FormCoordinator;
import com.truelayer.payments.p419ui.screens.formflows.FormViewData;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionKt;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionResult;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionViewData;
import com.truelayer.payments.p419ui.screens.result.ResultContainer;
import com.truelayer.payments.p419ui.screens.result.ResultContext;
import com.truelayer.payments.p419ui.screens.wait.WaitContainer3;
import com.truelayer.payments.p419ui.utils.AnalyticsExtensions3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FlowCoordinatorContainer.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {"FlowCoordinatorContainer", "", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", "state", "Lcom/truelayer/payments/ui/screens/Screen;", "loadingDialog", "Lcom/truelayer/payments/ui/screens/coordinator/FlowCoordinatorViewModel$LoadingMessage;", "error", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "actions", "Lcom/truelayer/payments/ui/screens/coordinator/FlowCoordinatorActions;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/truelayer/payments/ui/models/PaymentContext;Lcom/truelayer/payments/ui/screens/Screen;Lcom/truelayer/payments/ui/screens/coordinator/FlowCoordinatorViewModel$LoadingMessage;Lcom/truelayer/payments/core/domain/errors/CoreError;Lcom/truelayer/payments/ui/screens/coordinator/FlowCoordinatorActions;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release", "abortDialog", ""}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FlowCoordinatorContainerKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:373:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowCoordinatorContainer(final PaymentContext paymentContext, Screen screen, FlowCoordinatorViewModel.LoadingMessage loadingMessage, CoreError coreError, FlowCoordinatorActions flowCoordinatorActions, CoroutineDispatcher coroutineDispatcher, Composer composer, final int i, final int i2) {
        int i3;
        Screen screen2;
        int i4;
        FlowCoordinatorViewModel.LoadingMessage loadingMessage2;
        int i5;
        final FlowCoordinatorActions flowCoordinatorActions2;
        int i6;
        CoroutineDispatcher io2;
        Screen screen3;
        CoreError coreError2;
        FlowCoordinatorViewModel.LoadingMessage loadingMessage3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        boolean z;
        Object objRememberedValue3;
        boolean z2;
        Object objRememberedValue4;
        boolean z3;
        Object objRememberedValue5;
        Function1 function1;
        Composer composer2;
        CoreError coreError3;
        int i7;
        SnapshotState snapshotState;
        FlowCoordinatorActions flowCoordinatorActions3;
        CoroutineDispatcher coroutineDispatcher2;
        int i8;
        final Function1 function12;
        Screen screen4;
        ProcessorResult.PaymentStep paymentStep;
        final SnapshotState snapshotState2;
        boolean z4;
        boolean z5;
        Continuation continuation;
        final CoreError coreError4;
        final FlowCoordinatorActions flowCoordinatorActions4;
        CoreError coreError5;
        final FlowCoordinatorActions flowCoordinatorActions5;
        final Screen screen5;
        final FlowCoordinatorViewModel.LoadingMessage loadingMessage4;
        final CoroutineDispatcher coroutineDispatcher3;
        final CoreError coreError6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        PaymentContext paymentContext2 = paymentContext;
        Intrinsics.checkNotNullParameter(paymentContext2, "paymentContext");
        Composer composerStartRestartGroup = composer.startRestartGroup(-731437221);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(paymentContext2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                screen2 = screen;
                i3 |= composerStartRestartGroup.changed(screen2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    loadingMessage2 = loadingMessage;
                    i3 |= composerStartRestartGroup.changed(loadingMessage2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 1024;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        flowCoordinatorActions2 = flowCoordinatorActions;
                        int i10 = composerStartRestartGroup.changed(flowCoordinatorActions2) ? 16384 : 8192;
                        i3 |= i10;
                    } else {
                        flowCoordinatorActions2 = flowCoordinatorActions;
                    }
                    i3 |= i10;
                } else {
                    flowCoordinatorActions2 = flowCoordinatorActions;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 65536;
                }
                if ((i2 & 40) != 40 || (374491 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Screen screen6 = i9 == 0 ? Screen.Init.INSTANCE : screen2;
                        if (i4 != 0) {
                            loadingMessage2 = null;
                        }
                        CoreError coreError7 = i5 == 0 ? null : coreError;
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            flowCoordinatorActions2 = new FlowCoordinatorActions(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
                        }
                        if (i6 == 0) {
                            i3 &= -458753;
                            screen3 = screen6;
                            coreError2 = coreError7;
                            io2 = Dispatchers.getIO();
                        } else {
                            io2 = coroutineDispatcher;
                            screen3 = screen6;
                            coreError2 = coreError7;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            i3 &= -458753;
                        }
                        coreError2 = coreError;
                        io2 = coroutineDispatcher;
                        screen3 = screen2;
                    }
                    loadingMessage3 = loadingMessage2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-731437221, i3, -1, "com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainer (FlowCoordinatorContainer.kt:43)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1899803084);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(1899803136);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$1$1
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
                                FlowCoordinatorContainerKt.FlowCoordinatorContainer$lambda$2(snapshotState3, true);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BackHandler.BackHandler(false, (Function0) objRememberedValue2, composerStartRestartGroup, 48, 1);
                    composerStartRestartGroup.startReplaceableGroup(1899803234);
                    int i11 = (i3 & 57344) ^ 24576;
                    z = (i11 <= 16384 && composerStartRestartGroup.changed(flowCoordinatorActions2)) || (i3 & 24576) == 16384;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1<ProcessorResult.Failure, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$onFailureWrapper$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult.Failure failure) {
                                invoke2(failure);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ProcessorResult.Failure it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.SDKReturnToHostApp(null, it.getReason().toAnalyticsReturnToHostAppReason$payments_ui_release(), 1, null));
                                flowCoordinatorActions2.getOnFailure().invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    final Function1 function13 = (Function1) objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(1899803492);
                    z2 = (i11 <= 16384 && composerStartRestartGroup.changed(flowCoordinatorActions2)) || (i3 & 24576) == 16384;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1<PaymentCancellationReason, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$onAbortWrapper$1$1
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
                                TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.PaymentCancelled(null, 1, null));
                                flowCoordinatorActions2.getOnAbort().invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function14 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(1899803753);
                    z3 = (i11 <= 16384 && composerStartRestartGroup.changed(flowCoordinatorActions2)) || (i3 & 24576) == 16384;
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function1<ProcessorResult.Successful, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$onSuccessWrapper$1$1

                            /* compiled from: FlowCoordinatorContainer.kt */
                            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                            /* renamed from: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$onSuccessWrapper$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[ProcessorResult.PaymentStep.values().length];
                                    try {
                                        iArr[ProcessorResult.PaymentStep.Redirect.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[ProcessorResult.PaymentStep.Authorized.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[ProcessorResult.PaymentStep.Successful.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    try {
                                        iArr[ProcessorResult.PaymentStep.Wait.ordinal()] = 4;
                                    } catch (NoSuchFieldError unused4) {
                                    }
                                    try {
                                        iArr[ProcessorResult.PaymentStep.Settled.ordinal()] = 5;
                                    } catch (NoSuchFieldError unused5) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

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
                                int i12 = WhenMappings.$EnumSwitchMapping$0[it.getStep().ordinal()];
                                if (i12 == 1) {
                                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.RedirectFlowCompleted(null, 1, null));
                                } else if (i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5) {
                                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.EmbeddedFlowCompleted(null, 1, null));
                                }
                                TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.SDKReturnToHostApp(null, AnalyticsEvents.SDKReturnToHostApp.Reason.Success, 1, null));
                                flowCoordinatorActions2.getOnSuccess().invoke(it);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    final Function1 function15 = (Function1) objRememberedValue5;
                    composerStartRestartGroup.endReplaceableGroup();
                    Logger6.v$default(Logger6.INSTANCE, "FlowCoordinatorContainer state: " + screen3.getClass().getSimpleName(), null, null, 6, null);
                    if (!(screen3 instanceof Screen.Init)) {
                        composerStartRestartGroup.startReplaceableGroup(1899804764);
                        Boolean bool = Boolean.TRUE;
                        composerStartRestartGroup.startReplaceableGroup(1899804785);
                        boolean z6 = (i11 > 16384 && composerStartRestartGroup.changed(flowCoordinatorActions2)) || (i3 & 24576) == 16384;
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (z6 || objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new FlowCoordinatorContainerKt$FlowCoordinatorContainer$2$1(flowCoordinatorActions2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 70);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (screen3 instanceof Screen.Failure) {
                        composerStartRestartGroup.startReplaceableGroup(1899804892);
                        EffectsKt.LaunchedEffect(screen3, new C430393(screen3, null), composerStartRestartGroup, ((i3 >> 3) & 14) | 64);
                        FlowState.Failure flowState = ((Screen.Failure) screen3).getFlowState();
                        composerStartRestartGroup.startReplaceableGroup(1899805198);
                        boolean zChanged = composerStartRestartGroup.changed(function13);
                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = new Function1<ProcessorResult.Failure, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult.Failure failure) {
                                    invoke2(failure);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ProcessorResult.Failure it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    function13.invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        FailureScreen.FailureScreen(flowState, (Function1) objRememberedValue7, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (screen3 instanceof Screen.UserCancelled) {
                        composerStartRestartGroup.startReplaceableGroup(1899805363);
                        composerStartRestartGroup.endReplaceableGroup();
                        function13.invoke(new ProcessorResult.Failure(((Screen.UserCancelled) screen3).getFailureReason()));
                    } else if (screen3 instanceof Screen.SuccessfulRedirect) {
                        composerStartRestartGroup.startReplaceableGroup(1899805491);
                        composerStartRestartGroup.endReplaceableGroup();
                        function15.invoke(new ProcessorResult.Successful(ProcessorResult.PaymentStep.Redirect));
                    } else {
                        if (screen3 instanceof Screen.AccountSelection) {
                            composerStartRestartGroup.startReplaceableGroup(1899805636);
                            EffectsKt.LaunchedEffect(screen3, new C430405(screen3, null), composerStartRestartGroup, ((i3 >> 3) & 14) | 64);
                            List<UserAccount> accounts2 = ((Screen.AccountSelection) screen3).getAccounts();
                            composerStartRestartGroup.startReplaceableGroup(1899806110);
                            boolean z7 = (i11 > 16384 && composerStartRestartGroup.changed(flowCoordinatorActions2)) || (i3 & 24576) == 16384;
                            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (z7 || objRememberedValue8 == companion.getEmpty()) {
                                objRememberedValue8 = new Function1<UserAccount, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$6$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(UserAccount userAccount) {
                                        invoke2(userAccount);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(UserAccount it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.UserAccountSelected(null, it.getProvider().getId(), it.getId(), 1, null));
                                        flowCoordinatorActions2.getOnUserAccountSelect().invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            }
                            Function1 function16 = (Function1) objRememberedValue8;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1899806475);
                            boolean z8 = (i11 > 16384 && composerStartRestartGroup.changed(flowCoordinatorActions2)) || (i3 & 24576) == 16384;
                            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                            if (z8 || objRememberedValue9 == companion.getEmpty()) {
                                objRememberedValue9 = new Function1<UserAccount, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$7$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(UserAccount userAccount) {
                                        invoke2(userAccount);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(UserAccount it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.UserAccountDeleteAccountSelected(null, it.getProvider().getId(), it.getId(), 1, null));
                                        flowCoordinatorActions2.getOnUserAccountDelete().invoke(it);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                            }
                            Function1 function17 = (Function1) objRememberedValue9;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1899806857);
                            boolean z9 = (i11 > 16384 && composerStartRestartGroup.changed(flowCoordinatorActions2)) || (i3 & 24576) == 16384;
                            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                            if (z9 || objRememberedValue10 == companion.getEmpty()) {
                                objRememberedValue10 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$8$1
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
                                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.UserAccountNewAccountSelected(null, 1, null));
                                        flowCoordinatorActions2.getOnUseNewAccount().invoke();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                            }
                            Function0 function0 = (Function0) objRememberedValue10;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1899807093);
                            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue11 == companion.getEmpty()) {
                                objRememberedValue11 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$9$1
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
                                        FlowCoordinatorContainerKt.FlowCoordinatorContainer$lambda$2(snapshotState3, true);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                            function1 = function14;
                            AccountSelectionKt.AccountSelection(accounts2, function16, function17, function0, (Function0) objRememberedValue11, composer2, 24584, 0);
                            composer2.endReplaceableGroup();
                            snapshotState = snapshotState3;
                            coreError3 = coreError2;
                            screen4 = screen3;
                            i8 = i3;
                            function12 = function13;
                            coroutineDispatcher2 = io2;
                            i7 = i11;
                            flowCoordinatorActions3 = flowCoordinatorActions2;
                            paymentContext2 = paymentContext;
                        } else {
                            int i12 = i3;
                            function1 = function14;
                            if (screen3 instanceof Screen.ProviderSelection) {
                                composerStartRestartGroup.startReplaceableGroup(1899807193);
                                Screen.ProviderSelection providerSelection = (Screen.ProviderSelection) screen3;
                                final FlowCoordinatorActions flowCoordinatorActions6 = flowCoordinatorActions2;
                                i7 = i11;
                                Screen screen7 = screen3;
                                coreError3 = coreError2;
                                ProviderSelectionViewData providerSelectionViewData = new ProviderSelectionViewData(paymentContext, providerSelection.getProviders(), providerSelection.getRecommendedProviders(), providerSelection.getPreferredCountryCode(), providerSelection.getPayment(), providerSelection.getPreselectedProvider(), null, providerSelection.getMerchantConfig(), providerSelection.getPayment().isUserSelectedScheme(), 64, null);
                                composerStartRestartGroup.startReplaceableGroup(1899807813);
                                boolean z10 = (i7 > 16384 && composerStartRestartGroup.changed(flowCoordinatorActions6)) || (i12 & 24576) == 16384;
                                Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                if (z10 || objRememberedValue12 == companion.getEmpty()) {
                                    objRememberedValue12 = new Function1<ProviderSelectionResult, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$10$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ProviderSelectionResult providerSelectionResult) {
                                            invoke2(providerSelectionResult);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(ProviderSelectionResult result) {
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            flowCoordinatorActions6.getOnSelectProvider().invoke(result);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                }
                                Function1 function18 = (Function1) objRememberedValue12;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(1899807997);
                                Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue13 == companion.getEmpty()) {
                                    snapshotState2 = snapshotState3;
                                    objRememberedValue13 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$11$1
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
                                            FlowCoordinatorContainerKt.FlowCoordinatorContainer$lambda$2(snapshotState2, true);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                                } else {
                                    snapshotState2 = snapshotState3;
                                }
                                Function0 function02 = (Function0) objRememberedValue13;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(1899807923);
                                boolean zChanged2 = composerStartRestartGroup.changed(function13);
                                Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2 || objRememberedValue14 == companion.getEmpty()) {
                                    objRememberedValue14 = new Function1<CoreError, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$12$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(CoreError coreError8) {
                                            invoke2(coreError8);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(CoreError it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            function13.invoke(NetworkErrorView.intoProcessorResult(it));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ProviderSelectionKt.ProviderSelection(providerSelectionViewData, function18, function02, (Function1) objRememberedValue14, null, null, composerStartRestartGroup, 392, 48);
                                composer2 = composerStartRestartGroup;
                                composer2.endReplaceableGroup();
                                paymentContext2 = paymentContext;
                                screen4 = screen7;
                                snapshotState = snapshotState2;
                                i8 = i12;
                                coroutineDispatcher2 = io2;
                                function12 = function13;
                                flowCoordinatorActions3 = flowCoordinatorActions6;
                            } else {
                                composer2 = composerStartRestartGroup;
                                coreError3 = coreError2;
                                Screen screen8 = screen3;
                                final FlowCoordinatorActions flowCoordinatorActions7 = flowCoordinatorActions2;
                                i7 = i11;
                                if (screen8 instanceof Screen.Form) {
                                    composer2.startReplaceableGroup(1899808085);
                                    Screen.Form form = (Screen.Form) screen8;
                                    FormViewData formViewData = new FormViewData(form.getSelectedProvider(), form.getSelectedBranch(), form.isSignupPlus(), form.getInputs(), form.getPreviouslyUsedValues());
                                    composer2.startReplaceableGroup(1899808536);
                                    Object objRememberedValue15 = composer2.rememberedValue();
                                    if (objRememberedValue15 == companion.getEmpty()) {
                                        objRememberedValue15 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$13$1
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
                                                FlowCoordinatorContainerKt.FlowCoordinatorContainer$lambda$2(snapshotState3, true);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue15);
                                    }
                                    Function0 function03 = (Function0) objRememberedValue15;
                                    composer2.endReplaceableGroup();
                                    composer2.startReplaceableGroup(1899808633);
                                    boolean z11 = (i7 > 16384 && composer2.changed(flowCoordinatorActions7)) || (i12 & 24576) == 16384;
                                    Object objRememberedValue16 = composer2.rememberedValue();
                                    if (z11 || objRememberedValue16 == companion.getEmpty()) {
                                        objRememberedValue16 = new Function1<Map<String, ? extends String>, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$14$1
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
                                                flowCoordinatorActions7.getOnSubmitForm().invoke(it);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue16);
                                    }
                                    composer2.endReplaceableGroup();
                                    CoroutineDispatcher coroutineDispatcher4 = io2;
                                    paymentContext2 = paymentContext;
                                    FormCoordinator.FormCoordinator(paymentContext2, formViewData, (Function0<Unit>) function03, (Function1<? super ProcessorResult.Failure, Unit>) function13, (Function1<? super Map<String, String>, Unit>) objRememberedValue16, coroutineDispatcher4, composer2, (i12 & 14) | 262592, 0);
                                    composer2 = composer2;
                                    composer2.endReplaceableGroup();
                                    snapshotState = snapshotState3;
                                    flowCoordinatorActions3 = flowCoordinatorActions7;
                                    coroutineDispatcher2 = coroutineDispatcher4;
                                    i8 = i12;
                                    function12 = function13;
                                    screen4 = screen8;
                                } else {
                                    CoroutineDispatcher coroutineDispatcher5 = io2;
                                    if (screen8 instanceof Screen.Wait) {
                                        composer2.startReplaceableGroup(1899808767);
                                        Screen.Wait wait = (Screen.Wait) screen8;
                                        Payment payment = wait.getPayment();
                                        Legals legals = wait.getLegals();
                                        PaymentProvider paymentProvider = wait.getPaymentProvider();
                                        Map<String, LocalisedText> translations = wait.getTranslations();
                                        Network api = wait.getApi();
                                        composer2.startReplaceableGroup(1899809085);
                                        boolean z12 = (i7 > 16384 && composer2.changed(flowCoordinatorActions7)) || (i12 & 24576) == 16384;
                                        Object objRememberedValue17 = composer2.rememberedValue();
                                        if (z12 || objRememberedValue17 == companion.getEmpty()) {
                                            objRememberedValue17 = new Function1<ProcessorResult, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$15$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult processorResult) {
                                                    invoke2(processorResult);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(ProcessorResult it) {
                                                    Intrinsics.checkNotNullParameter(it, "it");
                                                    if (it instanceof ProcessorResult.Failure) {
                                                        flowCoordinatorActions7.getOnFailure().invoke(it);
                                                    } else if (it instanceof ProcessorResult.Successful) {
                                                        flowCoordinatorActions7.getOnSuccess().invoke(it);
                                                    }
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue17);
                                        }
                                        Function1 function19 = (Function1) objRememberedValue17;
                                        composer2.endReplaceableGroup();
                                        composer2.startReplaceableGroup(1899809345);
                                        boolean z13 = (i7 > 16384 && composer2.changed(flowCoordinatorActions7)) || (i12 & 24576) == 16384;
                                        Object objRememberedValue18 = composer2.rememberedValue();
                                        if (z13 || objRememberedValue18 == companion.getEmpty()) {
                                            objRememberedValue18 = new Function1<ProcessorResult, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$16$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult processorResult) {
                                                    invoke2(processorResult);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(ProcessorResult it) {
                                                    Intrinsics.checkNotNullParameter(it, "it");
                                                    if (it instanceof ProcessorResult.Failure) {
                                                        flowCoordinatorActions7.getOnFailure().invoke(it);
                                                    } else if (it instanceof ProcessorResult.Successful) {
                                                        flowCoordinatorActions7.getOnSuccess().invoke(it);
                                                    }
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue18);
                                        }
                                        Function1 function110 = (Function1) objRememberedValue18;
                                        composer2.endReplaceableGroup();
                                        composer2.startReplaceableGroup(1899809616);
                                        boolean z14 = (i7 > 16384 && composer2.changed(flowCoordinatorActions7)) || (i12 & 24576) == 16384;
                                        Object objRememberedValue19 = composer2.rememberedValue();
                                        if (z14 || objRememberedValue19 == companion.getEmpty()) {
                                            objRememberedValue19 = new Function1<Payment, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$17$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Payment payment2) {
                                                    invoke2(payment2);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Payment it) {
                                                    Intrinsics.checkNotNullParameter(it, "it");
                                                    flowCoordinatorActions7.getOnNotifyPaymentStateChanged().invoke(it);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue19);
                                        }
                                        composer2.endReplaceableGroup();
                                        int i13 = (i12 & 14) | 299584;
                                        snapshotState = snapshotState3;
                                        flowCoordinatorActions3 = flowCoordinatorActions7;
                                        i8 = i12;
                                        function12 = function13;
                                        paymentContext2 = paymentContext;
                                        coroutineDispatcher2 = coroutineDispatcher5;
                                        screen4 = screen8;
                                        WaitContainer3.WaitContainer(paymentContext2, payment, legals, paymentProvider, translations, api, (CoroutineDispatcher) null, (Function1<? super ProcessorResult, Unit>) function19, (Function1<? super ProcessorResult, Unit>) function110, (Function1<? super Payment, Unit>) objRememberedValue19, composer2, i13, 64);
                                        composer2 = composer2;
                                        composer2.endReplaceableGroup();
                                    } else {
                                        paymentContext2 = paymentContext;
                                        snapshotState = snapshotState3;
                                        flowCoordinatorActions3 = flowCoordinatorActions7;
                                        coroutineDispatcher2 = coroutineDispatcher5;
                                        i8 = i12;
                                        function12 = function13;
                                        screen4 = screen8;
                                        if (screen4 instanceof Screen.Redirect) {
                                            composer2.startReplaceableGroup(1899809768);
                                            flowCoordinatorActions3.getOnRedirect().invoke(((Screen.Redirect) screen4).getRedirectUrl(), (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                                            composer2.endReplaceableGroup();
                                        } else if (screen4 instanceof Screen.Success) {
                                            composer2.startReplaceableGroup(1899809971);
                                            composer2.endReplaceableGroup();
                                            Payment payment2 = ((Screen.Success) screen4).getPayment();
                                            if (payment2 instanceof Payment.Authorized) {
                                                paymentStep = ProcessorResult.PaymentStep.Authorized;
                                            } else {
                                                paymentStep = (!(payment2 instanceof Payment.Executed) && (payment2 instanceof Payment.Settled)) ? ProcessorResult.PaymentStep.Settled : ProcessorResult.PaymentStep.Successful;
                                            }
                                            function15.invoke(new ProcessorResult.Successful(paymentStep));
                                        } else if (screen4 instanceof Screen.SuccessfulWait) {
                                            composer2.startReplaceableGroup(1899810515);
                                            composer2.endReplaceableGroup();
                                            function15.invoke(new ProcessorResult.Successful(ProcessorResult.PaymentStep.Wait));
                                        } else if (screen4 instanceof Screen.Result) {
                                            composer2.startReplaceableGroup(1899810646);
                                            Screen.Result result = (Screen.Result) screen4;
                                            String id = result.getPaymentContext().getId();
                                            PaymentContext paymentContext3 = result.getPaymentContext();
                                            Payment payment3 = result.getPayment();
                                            MerchantConfig merchantConfig = result.getMerchantConfig();
                                            PaymentProvider paymentProvider2 = result.getPaymentProvider();
                                            PaymentContext.Preferences preferences = result.getPaymentContext().getPreferences();
                                            ResultContext resultContext = new ResultContext(id, preferences != null ? Long.valueOf(preferences.getWaitTimeMillis()) : null, false, null, paymentContext3, payment3, merchantConfig, paymentProvider2, 12, null);
                                            composer2.startReplaceableGroup(1899811123);
                                            boolean zChanged3 = composer2.changed(function15);
                                            Object objRememberedValue20 = composer2.rememberedValue();
                                            if (zChanged3 || objRememberedValue20 == companion.getEmpty()) {
                                                objRememberedValue20 = new Function1<ProcessorResult.Successful, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$18$1
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
                                                        function15.invoke(it);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue20);
                                            }
                                            Function1 function111 = (Function1) objRememberedValue20;
                                            composer2.endReplaceableGroup();
                                            composer2.startReplaceableGroup(1899811213);
                                            boolean zChanged4 = composer2.changed(function12);
                                            Object objRememberedValue21 = composer2.rememberedValue();
                                            if (zChanged4 || objRememberedValue21 == companion.getEmpty()) {
                                                objRememberedValue21 = new Function1<ProcessorResult.Failure, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$19$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult.Failure failure) {
                                                        invoke2(failure);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(ProcessorResult.Failure it) {
                                                        Intrinsics.checkNotNullParameter(it, "it");
                                                        function12.invoke(it);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue21);
                                            }
                                            composer2.endReplaceableGroup();
                                            ResultContainer.ResultContainer(resultContext, function111, (Function1) objRememberedValue21, null, null, null, composer2, 8, 56);
                                            composer2 = composer2;
                                            composer2.endReplaceableGroup();
                                        } else {
                                            composer2.startReplaceableGroup(1899811303);
                                            composer2.endReplaceableGroup();
                                        }
                                    }
                                }
                            }
                        }
                        composer2.startReplaceableGroup(1899811324);
                        if (loadingMessage3 == null) {
                            z4 = false;
                            z5 = true;
                            continuation = null;
                        } else {
                            z4 = false;
                            z5 = true;
                            continuation = null;
                            LoadingDialog4.LoadingDialog(null, composer2, 0, 1);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer2.endReplaceableGroup();
                        coreError4 = coreError3;
                        EffectsKt.LaunchedEffect(coreError4, new C4303721(coreError4, paymentContext2, continuation), composer2, 72);
                        composer2.startReplaceableGroup(1899811605);
                        if (coreError4 == null) {
                            coreError5 = coreError4;
                            flowCoordinatorActions4 = flowCoordinatorActions3;
                        } else {
                            Function0<Unit> function04 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$22$1
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
                                    function12.invoke(NetworkErrorView.intoProcessorResult(coreError4));
                                }
                            };
                            composer2.startReplaceableGroup(-283140760);
                            flowCoordinatorActions4 = flowCoordinatorActions3;
                            boolean z15 = ((i7 <= 16384 || !composer2.changed(flowCoordinatorActions4)) && (i8 & 24576) != 16384) ? z4 : z5;
                            Object objRememberedValue22 = composer2.rememberedValue();
                            if (z15 || objRememberedValue22 == companion.getEmpty()) {
                                objRememberedValue22 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$22$2$1
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
                                        flowCoordinatorActions4.getOnInit().invoke(Boolean.TRUE);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue22);
                            }
                            composer2.endReplaceableGroup();
                            NetworkErrorView.NetworkErrorView(coreError4, function04, (Function0) objRememberedValue22, composer2, 8, 0);
                            coreError5 = coreError4;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer2.endReplaceableGroup();
                        if (FlowCoordinatorContainer$lambda$1(snapshotState)) {
                            PaymentContext.PaymentType paymentType = paymentContext2.getPaymentType();
                            composer2.startReplaceableGroup(1899811954);
                            Object objRememberedValue23 = composer2.rememberedValue();
                            if (objRememberedValue23 == companion.getEmpty()) {
                                final SnapshotState snapshotState4 = snapshotState;
                                objRememberedValue23 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$23$1
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
                                        FlowCoordinatorContainerKt.FlowCoordinatorContainer$lambda$2(snapshotState4, false);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue23);
                            }
                            Function0 function05 = (Function0) objRememberedValue23;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(1899812001);
                            final Function1 function112 = function1;
                            boolean zChanged5 = composer2.changed(function112);
                            Object objRememberedValue24 = composer2.rememberedValue();
                            if (zChanged5 || objRememberedValue24 == companion.getEmpty()) {
                                objRememberedValue24 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$24$1
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
                                        function112.invoke(PaymentCancellationReason.NormalCancellation);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue24);
                            }
                            composer2.endReplaceableGroup();
                            CancelPaymentDialog.CancelPaymentDialog(paymentType, function05, (Function0) objRememberedValue24, composer2, 48, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        flowCoordinatorActions5 = flowCoordinatorActions4;
                        screen5 = screen4;
                        loadingMessage4 = loadingMessage3;
                        coroutineDispatcher3 = coroutineDispatcher2;
                        coreError6 = coreError5;
                    }
                    snapshotState = snapshotState3;
                    i8 = i3;
                    i7 = i11;
                    function12 = function13;
                    composer2 = composerStartRestartGroup;
                    function1 = function14;
                    coreError3 = coreError2;
                    screen4 = screen3;
                    coroutineDispatcher2 = io2;
                    flowCoordinatorActions3 = flowCoordinatorActions2;
                    composer2.startReplaceableGroup(1899811324);
                    if (loadingMessage3 == null) {
                    }
                    composer2.endReplaceableGroup();
                    coreError4 = coreError3;
                    EffectsKt.LaunchedEffect(coreError4, new C4303721(coreError4, paymentContext2, continuation), composer2, 72);
                    composer2.startReplaceableGroup(1899811605);
                    if (coreError4 == null) {
                    }
                    composer2.endReplaceableGroup();
                    if (FlowCoordinatorContainer$lambda$1(snapshotState)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    flowCoordinatorActions5 = flowCoordinatorActions4;
                    screen5 = screen4;
                    loadingMessage4 = loadingMessage3;
                    coroutineDispatcher3 = coroutineDispatcher2;
                    coreError6 = coreError5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    coreError6 = coreError;
                    coroutineDispatcher3 = coroutineDispatcher;
                    screen5 = screen2;
                    loadingMessage4 = loadingMessage2;
                    composer2 = composerStartRestartGroup;
                    flowCoordinatorActions5 = flowCoordinatorActions2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt.FlowCoordinatorContainer.25
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i14) {
                            FlowCoordinatorContainerKt.FlowCoordinatorContainer(paymentContext, screen5, loadingMessage4, coreError6, flowCoordinatorActions5, coroutineDispatcher3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            loadingMessage2 = loadingMessage;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((i & 57344) == 0) {
            }
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            if ((i2 & 40) != 40) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i6 == 0) {
                    }
                    loadingMessage3 = loadingMessage2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(1899803084);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    final SnapshotState<Boolean> snapshotState32 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(1899803136);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BackHandler.BackHandler(false, (Function0) objRememberedValue2, composerStartRestartGroup, 48, 1);
                    composerStartRestartGroup.startReplaceableGroup(1899803234);
                    int i112 = (i3 & 57344) ^ 24576;
                    if (i112 <= 16384) {
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z) {
                            objRememberedValue3 = new Function1<ProcessorResult.Failure, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$onFailureWrapper$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult.Failure failure) {
                                    invoke2(failure);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ProcessorResult.Failure it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.SDKReturnToHostApp(null, it.getReason().toAnalyticsReturnToHostAppReason$payments_ui_release(), 1, null));
                                    flowCoordinatorActions2.getOnFailure().invoke(it);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            final Function1<? super ProcessorResult.Failure, Unit> function132 = (Function1) objRememberedValue3;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(1899803492);
                            if (i112 <= 16384) {
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (z2) {
                                    objRememberedValue4 = new Function1<PaymentCancellationReason, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$onAbortWrapper$1$1
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
                                            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.PaymentCancelled(null, 1, null));
                                            flowCoordinatorActions2.getOnAbort().invoke(it);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    Function1 function142 = (Function1) objRememberedValue4;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(1899803753);
                                    if (i112 <= 16384) {
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (z3) {
                                            objRememberedValue5 = new Function1<ProcessorResult.Successful, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$onSuccessWrapper$1$1

                                                /* compiled from: FlowCoordinatorContainer.kt */
                                                @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                                                /* renamed from: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$onSuccessWrapper$1$1$WhenMappings */
                                                public /* synthetic */ class WhenMappings {
                                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                    static {
                                                        int[] iArr = new int[ProcessorResult.PaymentStep.values().length];
                                                        try {
                                                            iArr[ProcessorResult.PaymentStep.Redirect.ordinal()] = 1;
                                                        } catch (NoSuchFieldError unused) {
                                                        }
                                                        try {
                                                            iArr[ProcessorResult.PaymentStep.Authorized.ordinal()] = 2;
                                                        } catch (NoSuchFieldError unused2) {
                                                        }
                                                        try {
                                                            iArr[ProcessorResult.PaymentStep.Successful.ordinal()] = 3;
                                                        } catch (NoSuchFieldError unused3) {
                                                        }
                                                        try {
                                                            iArr[ProcessorResult.PaymentStep.Wait.ordinal()] = 4;
                                                        } catch (NoSuchFieldError unused4) {
                                                        }
                                                        try {
                                                            iArr[ProcessorResult.PaymentStep.Settled.ordinal()] = 5;
                                                        } catch (NoSuchFieldError unused5) {
                                                        }
                                                        $EnumSwitchMapping$0 = iArr;
                                                    }
                                                }

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
                                                    int i122 = WhenMappings.$EnumSwitchMapping$0[it.getStep().ordinal()];
                                                    if (i122 == 1) {
                                                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.RedirectFlowCompleted(null, 1, null));
                                                    } else if (i122 == 2 || i122 == 3 || i122 == 4 || i122 == 5) {
                                                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.EmbeddedFlowCompleted(null, 1, null));
                                                    }
                                                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.SDKReturnToHostApp(null, AnalyticsEvents.SDKReturnToHostApp.Reason.Success, 1, null));
                                                    flowCoordinatorActions2.getOnSuccess().invoke(it);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                            final Function1<? super ProcessorResult.Successful, Unit> function152 = (Function1) objRememberedValue5;
                                            composerStartRestartGroup.endReplaceableGroup();
                                            Logger6.v$default(Logger6.INSTANCE, "FlowCoordinatorContainer state: " + screen3.getClass().getSimpleName(), null, null, 6, null);
                                            if (!(screen3 instanceof Screen.Init)) {
                                            }
                                            snapshotState = snapshotState32;
                                            i8 = i3;
                                            i7 = i112;
                                            function12 = function132;
                                            composer2 = composerStartRestartGroup;
                                            function1 = function142;
                                            coreError3 = coreError2;
                                            screen4 = screen3;
                                            coroutineDispatcher2 = io2;
                                            flowCoordinatorActions3 = flowCoordinatorActions2;
                                            composer2.startReplaceableGroup(1899811324);
                                            if (loadingMessage3 == null) {
                                            }
                                            composer2.endReplaceableGroup();
                                            coreError4 = coreError3;
                                            EffectsKt.LaunchedEffect(coreError4, new C4303721(coreError4, paymentContext2, continuation), composer2, 72);
                                            composer2.startReplaceableGroup(1899811605);
                                            if (coreError4 == null) {
                                            }
                                            composer2.endReplaceableGroup();
                                            if (FlowCoordinatorContainer$lambda$1(snapshotState)) {
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            flowCoordinatorActions5 = flowCoordinatorActions4;
                                            screen5 = screen4;
                                            loadingMessage4 = loadingMessage3;
                                            coroutineDispatcher3 = coroutineDispatcher2;
                                            coreError6 = coreError5;
                                        }
                                    } else {
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (z3) {
                                        }
                                    }
                                }
                            } else {
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (z2) {
                                }
                            }
                        }
                    } else {
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        screen2 = screen;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        loadingMessage2 = loadingMessage;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i & 57344) == 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        if ((i2 & 40) != 40) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlowCoordinatorContainer$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: FlowCoordinatorContainer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$3", m3645f = "FlowCoordinatorContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$3 */
    static final class C430393 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Screen $screen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C430393(Screen screen, Continuation<? super C430393> continuation) {
            super(2, continuation);
            this.$screen = screen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C430393(this.$screen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430393) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.ErrorScreenLoaded(null, ((Screen.Failure) this.$screen).getFlowState().toAnalyticsError(), 1, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FlowCoordinatorContainer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$5", m3645f = "FlowCoordinatorContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$5 */
    static final class C430405 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Screen $screen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C430405(Screen screen, Continuation<? super C430405> continuation) {
            super(2, continuation);
            this.$screen = screen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C430405(this.$screen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430405) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrueLayerAnalytics analytics$payments_ui_release = TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release();
            int size = ((Screen.AccountSelection) this.$screen).getAccounts().size();
            List<UserAccount> accounts2 = ((Screen.AccountSelection) this.$screen).getAccounts();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : accounts2) {
                if (!((UserAccount) obj2).getProvider().isAvailable()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UserAccount) it.next()).getId());
            }
            analytics$payments_ui_release.track(new AnalyticsEvents.UserAccountSelectionLoaded(null, size, arrayList2, 1, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FlowCoordinatorContainer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$21", m3645f = "FlowCoordinatorContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorContainerKt$FlowCoordinatorContainer$21 */
    static final class C4303721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoreError $error;
        final /* synthetic */ PaymentContext $paymentContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4303721(CoreError coreError, PaymentContext paymentContext, Continuation<? super C4303721> continuation) {
            super(2, continuation);
            this.$error = coreError;
            this.$paymentContext = paymentContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C4303721(this.$error, this.$paymentContext, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4303721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$error != null) {
                TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.ErrorScreenLoaded(null, AnalyticsExtensions3.toAnalyticsError(this.$error, this.$paymentContext), 1, null));
            }
            return Unit.INSTANCE;
        }
    }

    private static final boolean FlowCoordinatorContainer$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
