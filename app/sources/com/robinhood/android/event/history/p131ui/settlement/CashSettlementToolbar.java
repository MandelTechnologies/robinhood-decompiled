package com.robinhood.android.event.history.p131ui.settlement;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.event.history.p131ui.settlement.CashSettlementToolbar;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CashSettlementToolbar.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"CashSettlementToolbar", "", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/utils/resource/StringResource;", "onBackClick", "Lkotlin/Function0;", "onCtaClick", "(Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-event-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.history.ui.settlement.CashSettlementToolbarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CashSettlementToolbar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CashSettlementToolbar$lambda$0(StringResource stringResource, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        CashSettlementToolbar(stringResource, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CashSettlementToolbar(final StringResource stringResource, final Function0<Unit> onBackClick, final Function0<Unit> onCtaClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1913362742);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCtaClick) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1913362742, i2, -1, "com.robinhood.android.event.history.ui.settlement.CashSettlementToolbar (CashSettlementToolbar.kt:18)");
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(CashSettlementToolbar2.INSTANCE.m14273getLambda$50610185$feature_event_history_externalDebug(), null, ComposableLambda3.rememberComposableLambda(1090923595, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.settlement.CashSettlementToolbarKt.CashSettlementToolbar.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1090923595, i3, -1, "com.robinhood.android.event.history.ui.settlement.CashSettlementToolbar.<anonymous> (CashSettlementToolbar.kt:22)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBackClick, composer3, (BentoAppBarScope.$stable << 12) | ((i3 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1552595436, true, new C164232(stringResource, onCtaClick), composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.history.ui.settlement.CashSettlementToolbarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CashSettlementToolbar.CashSettlementToolbar$lambda$0(stringResource, onBackClick, onCtaClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CashSettlementToolbar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.history.ui.settlement.CashSettlementToolbarKt$CashSettlementToolbar$2 */
    static final class C164232 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ StringResource $cta;
        final /* synthetic */ Function0<Unit> $onCtaClick;

        C164232(StringResource stringResource, Function0<Unit> function0) {
            this.$cta = stringResource;
            this.$onCtaClick = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1552595436, i, -1, "com.robinhood.android.event.history.ui.settlement.CashSettlementToolbar.<anonymous> (CashSettlementToolbar.kt:25)");
            }
            StringResource stringResource = this.$cta;
            if (stringResource != null) {
                Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String string2 = stringResource.getText(resources).toString();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                FontWeight bold = FontWeight.INSTANCE.getBold();
                long jM21368getAccent0d7_KjU = bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$onCtaClick);
                final Function0<Unit> function0 = this.$onCtaClick;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.event.history.ui.settlement.CashSettlementToolbarKt$CashSettlementToolbar$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CashSettlementToolbar.C164232.invoke$lambda$1$lambda$0(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(string2, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), composer, 0, 0), Color.m6701boximpl(jM21368getAccent0d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8168);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }
}
