package com.truelayer.payments.p419ui.screens.confirmation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.view.compose.BackHandler;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.screens.confirmation.mandate.MandateConfirmationContainer3;
import com.truelayer.payments.p419ui.screens.confirmation.singlepayment.PaymentConfirmationContainer3;
import com.truelayer.payments.p419ui.screens.coordinator.PaymentCancellationReason;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConfirmationContainer.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aZ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032#\b\u0002\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"ConfirmationContainer", "", "viewData", "Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData;", "onAbort", "Lkotlin/Function1;", "Lcom/truelayer/payments/ui/screens/coordinator/PaymentCancellationReason;", "Lkotlin/ParameterName;", "name", "reason", "onConfirm", "Lkotlin/Function0;", "onBack", "(Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.confirmation.ConfirmationContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ConfirmationContainer {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmationContainer(final ConfirmationViewData viewData, Function1<? super PaymentCancellationReason, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super PaymentCancellationReason, Unit> function12;
        int i4;
        Function0<Unit> function03;
        int i5;
        Function0<Unit> function04;
        final Function0<Unit> function05;
        boolean z;
        Object objRememberedValue;
        Function1<? super PaymentCancellationReason, Unit> function13;
        Function0<Unit> function06;
        final Function1<? super PaymentCancellationReason, Unit> function14;
        final Function0<Unit> function07;
        final Function0<Unit> function08;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        Composer composerStartRestartGroup = composer.startRestartGroup(1878659952);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(viewData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    function03 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function03) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 7168) == 0) {
                        function04 = function02;
                        i3 |= composerStartRestartGroup.changedInstance(function04) ? 2048 : 1024;
                    }
                    if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Function1<? super PaymentCancellationReason, Unit> function15 = i6 == 0 ? new Function1<PaymentCancellationReason, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.ConfirmationContainerKt.ConfirmationContainer.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(PaymentCancellationReason it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PaymentCancellationReason paymentCancellationReason) {
                                invoke2(paymentCancellationReason);
                                return Unit.INSTANCE;
                            }
                        } : function12;
                        Function0<Unit> function09 = i4 == 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.ConfirmationContainerKt.ConfirmationContainer.2
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        } : function03;
                        function05 = i5 == 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.ConfirmationContainerKt.ConfirmationContainer.3
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        } : function04;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1878659952, i3, -1, "com.truelayer.payments.ui.screens.confirmation.ConfirmationContainer (ConfirmationContainer.kt:23)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1152977441);
                        z = (i3 & 7168) != 2048;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.ConfirmationContainerKt$ConfirmationContainer$4$1
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
                                    function05.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandler.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
                        if (!(viewData instanceof PaymentConfirmationViewData)) {
                            composerStartRestartGroup.startReplaceableGroup(-1152977331);
                            function13 = function15;
                            function06 = function09;
                            PaymentConfirmationContainer3.PaymentConfirmationContainer((PaymentConfirmationViewData) viewData, function13, function06, new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.ConfirmationContainerKt.ConfirmationContainer.5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                    invoke2(str);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(String url) {
                                    Intrinsics.checkNotNullParameter(url, "url");
                                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.LegalsOpened(url, null, 2, null));
                                }
                            }, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.ConfirmationContainerKt.ConfirmationContainer.6
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.InfoHowDoesThisWorkOpened(null, 1, null));
                                }
                            }, composerStartRestartGroup, (i3 & 112) | 27656 | (i3 & 896), 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            function13 = function15;
                            function06 = function09;
                            if (viewData instanceof MandateConfirmationViewData) {
                                composerStartRestartGroup.startReplaceableGroup(-1152976806);
                                MandateConfirmationContainer3.MandateConfirmationContainer((MandateConfirmationViewData) viewData, function13, function06, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.ConfirmationContainerKt.ConfirmationContainer.7
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
                                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.InfoSecureConnectionOpened(((MandateConfirmationViewData) viewData).getProviderId(), null, 2, null));
                                    }
                                }, new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.ConfirmationContainerKt.ConfirmationContainer.8
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                        invoke2(str);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(String url) {
                                        Intrinsics.checkNotNullParameter(url, "url");
                                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.LegalsOpened(url, null, 2, null));
                                    }
                                }, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.ConfirmationContainerKt.ConfirmationContainer.9
                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.MandateDetailsOpened(null, 1, null));
                                    }
                                }, composerStartRestartGroup, 221192 | (i3 & 112) | (i3 & 896), 0);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-1152976122);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function14 = function13;
                        function07 = function06;
                        function08 = function05;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function14 = function12;
                        function07 = function03;
                        function08 = function04;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.ConfirmationContainerKt.ConfirmationContainer.10
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
                                ConfirmationContainer.ConfirmationContainer(viewData, function14, function07, function08, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function04 = function02;
                if ((i3 & 5851) == 1170) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1152977441);
                    if ((i3 & 7168) != 2048) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.ConfirmationContainerKt$ConfirmationContainer$4$1
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
                                function05.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceableGroup();
                        BackHandler.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
                        if (!(viewData instanceof PaymentConfirmationViewData)) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function14 = function13;
                        function07 = function06;
                        function08 = function05;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function03 = function0;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function04 = function02;
            if ((i3 & 5851) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function12 = function1;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function04 = function02;
        if ((i3 & 5851) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
