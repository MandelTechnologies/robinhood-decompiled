package com.truelayer.payments.p419ui.screens.providerselection.priming;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.experience.localisation.UserPriming;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.components.CustomDialog;
import com.truelayer.payments.p419ui.components.CustomDialogProperties;
import com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData;
import com.truelayer.payments.p419ui.theme.Spacing;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PrimingDialog.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"PrimingDialog", "", "priming", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data;", "viewData", "Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData;", "onConfirm", "Lkotlin/Function0;", "onAbort", "(Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data;Lcom/truelayer/payments/ui/screens/confirmation/ConfirmationViewData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.providerselection.priming.PrimingDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class PrimingDialog {
    public static final void PrimingDialog(final UserPriming.Data priming, final ConfirmationViewData viewData, final Function0<Unit> onConfirm, final Function0<Unit> onAbort, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(priming, "priming");
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Intrinsics.checkNotNullParameter(onAbort, "onAbort");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1634917929);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1634917929, i, -1, "com.truelayer.payments.ui.screens.providerselection.priming.PrimingDialog (PrimingDialog.kt:20)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Spacing spacing = Spacing.INSTANCE;
        CustomDialog.CustomDialog(null, new CustomDialogProperties(false, PaddingKt.m5143paddingVpY3zN4(companion, spacing.m27175getMEDIUMD9Ej5fM(), spacing.m27174getLARGED9Ej5fM()), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, spacing.m27174getLARGED9Ej5fM(), 0.0f, C2002Dp.m7995constructorimpl(0), 5, null)), onAbort, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -2125949812, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.priming.PrimingDialogKt.PrimingDialog.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2125949812, i2, -1, "com.truelayer.payments.ui.screens.providerselection.priming.PrimingDialog.<anonymous> (PrimingDialog.kt:29)");
                }
                PrimingContainer4.PrimingDetails(null, priming, viewData.getProviderIconUrl(), viewData.getProviderExtendedIconUrl(), viewData.getProviderName(), new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.priming.PrimingDialogKt.PrimingDialog.1.1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.PrimingScreenBankLinkClicked(null, 1, null));
                    }
                }, onConfirm, composer2, 196672, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, ((i >> 3) & 896) | 196608, 25);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.priming.PrimingDialogKt.PrimingDialog.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    PrimingDialog.PrimingDialog(priming, viewData, onConfirm, onAbort, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
