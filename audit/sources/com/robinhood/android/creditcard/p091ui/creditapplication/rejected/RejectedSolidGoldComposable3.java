package com.robinhood.android.creditcard.p091ui.creditapplication.rejected;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.creditcard.p091ui.creditapplication.rejected.RejectedSolidGoldComposable3;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RejectedSolidGoldComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"RejectedSolidGold", "", "onHelpPress", "Lkotlin/Function0;", "onClose", "claimCashPrize", "isLoading", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "REJECTED_SOLID_GOLD_TITLE_TEST_TAG", "", "REJECTED_SOLID_GOLD_MESSAGE_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedSolidGoldComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RejectedSolidGoldComposable3 {
    public static final String REJECTED_SOLID_GOLD_MESSAGE_TEST_TAG = "rejected-solid-gold-message-test-tag";
    public static final String REJECTED_SOLID_GOLD_TITLE_TEST_TAG = "rejected-solid-gold-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RejectedSolidGold$lambda$0(Function0 function0, Function0 function02, Function0 function03, boolean z, int i, Composer composer, int i2) {
        RejectedSolidGold(function0, function02, function03, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RejectedSolidGold(final Function0<Unit> onHelpPress, final Function0<Unit> onClose, final Function0<Unit> claimCashPrize, final boolean z, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onHelpPress, "onHelpPress");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(claimCashPrize, "claimCashPrize");
        Composer composerStartRestartGroup = composer.startRestartGroup(-908750717);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onHelpPress) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClose) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(claimCashPrize) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-908750717, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedSolidGold (RejectedSolidGoldComposable.kt:40)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_REJECTED, null, null, null, 14, null), null, null, null, null, onHelpPress, null, ComposableLambda3.rememberComposableLambda(1684053534, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedSolidGoldComposableKt.RejectedSolidGold.1

                /* compiled from: RejectedSolidGoldComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedSolidGoldComposableKt$RejectedSolidGold$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Function0<Unit> $claimCashPrize;
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ boolean $isLoading;
                    final /* synthetic */ Function0<Unit> $onClose;

                    AnonymousClass1(EventLogger eventLogger, Function0<Unit> function0, boolean z, Function0<Unit> function02) {
                        this.$eventLogger = eventLogger;
                        this.$claimCashPrize = function0;
                        this.$isLoading = z;
                        this.$onClose = function02;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(972986736, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedSolidGold.<anonymous>.<anonymous> (RejectedSolidGoldComposable.kt:48)");
                        }
                        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_rejected_solid_gold_cta, composer, 0);
                        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$claimCashPrize);
                        final EventLogger eventLogger = this.$eventLogger;
                        final Function0<Unit> function0 = this.$claimCashPrize;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedSolidGoldComposableKt$RejectedSolidGold$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RejectedSolidGoldComposable3.C125351.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, function0);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function02 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        boolean z = this.$isLoading;
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onClose);
                        final EventLogger eventLogger2 = this.$eventLogger;
                        final Function0<Unit> function03 = this.$onClose;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedSolidGoldComposableKt$RejectedSolidGold$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RejectedSolidGoldComposable3.C125351.AnonymousClass1.invoke$lambda$3$lambda$2(eventLogger2, function03);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, function02, strStringResource, z, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, 0, 0, 58942);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
                        loggingUtils.logContinue$default(eventLogger, null, 1, null);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Function0 function0) {
                        loggingUtils.logDismiss$default(eventLogger, null, 1, null);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(1684053534, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedSolidGold.<anonymous> (RejectedSolidGoldComposable.kt:47)");
                    }
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(972986736, true, new AnonymousClass1(current, claimCashPrize, z, onClose), composer2, 54), composer2, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, true, false, RejectedSolidGoldComposable.INSTANCE.getLambda$470153039$feature_credit_card_externalDebug(), composerStartRestartGroup, ((i2 << 15) & 458752) | 12582912, 390, 2910);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedSolidGoldComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RejectedSolidGoldComposable3.RejectedSolidGold$lambda$0(onHelpPress, onClose, claimCashPrize, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
