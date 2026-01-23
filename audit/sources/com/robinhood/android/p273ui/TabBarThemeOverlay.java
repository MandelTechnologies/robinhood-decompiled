package com.robinhood.android.p273ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.lib.creditcard.CreditCardTabStyle;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.bento.theme.BentoColors2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TabBarThemeOverlay.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/creditcard/CreditCardTabStyle;", "creditCardTabStyle", "Lkotlin/Function0;", "", "content", "TabBarThemeOverlay", "(Lcom/robinhood/android/lib/creditcard/CreditCardTabStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "feature-tab-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.ui.TabBarThemeOverlayKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TabBarThemeOverlay {

    /* compiled from: TabBarThemeOverlay.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.ui.TabBarThemeOverlayKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreditCardTabStyle.values().length];
            try {
                iArr[CreditCardTabStyle.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreditCardTabStyle.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabBarThemeOverlay$lambda$2(CreditCardTabStyle creditCardTabStyle, Function2 function2, int i, Composer composer, int i2) {
        TabBarThemeOverlay(creditCardTabStyle, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabBarThemeOverlay$lambda$3(CreditCardTabStyle creditCardTabStyle, Function2 function2, int i, Composer composer, int i2) {
        TabBarThemeOverlay(creditCardTabStyle, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TabBarThemeOverlay(final CreditCardTabStyle creditCardTabStyle, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        BentoColors bentoColors;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> content = function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1563436788);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(creditCardTabStyle == null ? -1 : creditCardTabStyle.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1563436788, i2, -1, "com.robinhood.android.ui.TabBarThemeOverlay (TabBarThemeOverlay.kt:13)");
            }
            int i3 = creditCardTabStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[creditCardTabStyle.ordinal()];
            if (i3 == -1) {
                composerStartRestartGroup.startReplaceGroup(-1719671578);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.ui.TabBarThemeOverlayKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TabBarThemeOverlay.TabBarThemeOverlay$lambda$2(creditCardTabStyle, content, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(-1719793036);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = BentoColors2.creditCardDayColors();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                bentoColors = (BentoColors) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 2) {
                    composerStartRestartGroup.startReplaceGroup(775804987);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1719722573);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = BentoColors2.creditCardGoldColors();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                bentoColors = (BentoColors) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            BentoColors bentoColors2 = bentoColors;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoColors.m21368getAccent0d7_KjU(), bentoColors.m21425getFg0d7_KjU(), bentoColors2.m21426getFg20d7_KjU(), 0L, bentoColors2.m21371getBg0d7_KjU(), bentoColors2.m21372getBg20d7_KjU(), 0L, 0L, 0L, function2, composerStartRestartGroup, (i2 << 24) & 1879048192, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
            content = function2;
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.ui.TabBarThemeOverlayKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TabBarThemeOverlay.TabBarThemeOverlay$lambda$3(creditCardTabStyle, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
