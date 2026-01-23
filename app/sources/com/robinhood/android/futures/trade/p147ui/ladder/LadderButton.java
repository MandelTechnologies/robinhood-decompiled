package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.sharedfuturesui.animations.CustomOutlineLoadingAnimatedButton;
import com.robinhood.android.futures.trade.p147ui.ladder.LadderButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ButtonStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderButton.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\u0010\u0016\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0017"}, m3636d2 = {"LadderButtonShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getLadderButtonShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "LadderButton", "", "text", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "isLoading", "", "enabled", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "LadderButton-OadGlvw", "(Ljava/lang/String;JZZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewLadderButton", "parameters", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderButtonPreviewParameterProvider$Parameters;", "(Lcom/robinhood/android/futures/trade/ui/ladder/LadderButtonPreviewParameterProvider$Parameters;Landroidx/compose/runtime/Composer;I)V", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderButtonKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LadderButton {
    private static final RoundedCornerShape LadderButtonShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(24));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderButton_OadGlvw$lambda$0(String str, long j, boolean z, boolean z2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14797LadderButtonOadGlvw(str, j, z, z2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderButton$lambda$1(LadderButton2.Parameters parameters, int i, Composer composer, int i2) {
        PreviewLadderButton(parameters, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final RoundedCornerShape getLadderButtonShape() {
        return LadderButtonShape;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: LadderButton-OadGlvw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14797LadderButtonOadGlvw(final String text, final long j, final boolean z, final boolean z2, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(501040597);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
                }
                i4 = i2 & 32;
                if (i4 == 0) {
                    if ((196608 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(501040597, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderButton (LadderButton.kt:29)");
                        }
                        Modifier modifier5 = modifier4;
                        composer2 = composerStartRestartGroup;
                        CustomOutlineLoadingAnimatedButton.m14739CustomOutlineLoadingAnimatedButtonbQD1wOU(text, j, z3, z4, onClick, modifier5, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary(), LadderButtonShape, ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getPillOutlineGradiantBrush(), 0.0f, 0.0f, ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m14817getButtonNonLoadingBorderColor0d7_KjU(), null, 0, composer2, (i3 & 458752) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (ButtonStyle.Style.$stable << 18), 0, 13824);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LadderButton.LadderButton_OadGlvw$lambda$0(text, j, z, z2, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((74899 & i3) == 74898) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier52 = modifier4;
                    composer2 = composerStartRestartGroup;
                    CustomOutlineLoadingAnimatedButton.m14739CustomOutlineLoadingAnimatedButtonbQD1wOU(text, j, z3, z4, onClick, modifier52, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary(), LadderButtonShape, ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getPillOutlineGradiantBrush(), 0.0f, 0.0f, ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m14817getButtonNonLoadingBorderColor0d7_KjU(), null, 0, composer2, (i3 & 458752) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (ButtonStyle.Style.$stable << 18), 0, 13824);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z2;
            if ((i2 & 16) != 0) {
            }
            i4 = i2 & 32;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z3 = z;
        if ((i2 & 8) == 0) {
        }
        z4 = z2;
        if ((i2 & 16) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void PreviewLadderButton(final LadderButton2.Parameters parameters, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Composer composerStartRestartGroup = composer.startRestartGroup(961731720);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(parameters) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(961731720, i2, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewLadderButton (LadderButton.kt:100)");
            }
            PreviewLadderBentoTheme.PreviewLadderBentoTheme(false, ComposableLambda3.rememberComposableLambda(-1366738137, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderButtonKt.PreviewLadderButton.1
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
                        ComposerKt.traceEventStart(-1366738137, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewLadderButton.<anonymous> (LadderButton.kt:104)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    SurfaceKt.m5967SurfaceT9BRK9s(null, null, bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU(), 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(1481974018, true, new AnonymousClass1(parameters), composer2, 54), composer2, 12582912, 115);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: LadderButton.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderButtonKt$PreviewLadderButton$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ LadderButton2.Parameters $parameters;

                    AnonymousClass1(LadderButton2.Parameters parameters) {
                        this.$parameters = parameters;
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
                            ComposerKt.traceEventStart(1481974018, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewLadderButton.<anonymous>.<anonymous> (LadderButton.kt:108)");
                        }
                        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(150));
                        String text = this.$parameters.getText();
                        long textColor = this.$parameters.getTextColor(composer, 0);
                        boolean zIsLoading = this.$parameters.isLoading();
                        boolean enabled = this.$parameters.getEnabled();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderButtonKt$PreviewLadderButton$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        LadderButton.m14797LadderButtonOadGlvw(text, textColor, zIsLoading, enabled, (Function0) objRememberedValue, modifierM5174width3ABfNKs, composer, 221184, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderButton.PreviewLadderButton$lambda$1(parameters, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
