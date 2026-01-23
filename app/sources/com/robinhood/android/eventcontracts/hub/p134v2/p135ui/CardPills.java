package com.robinhood.android.eventcontracts.hub.p134v2.p135ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills7;
import com.robinhood.android.eventcontracts.sharedeventui.StringUtil2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.compose.extensions.Colors8;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardPills.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u000e\u001a9\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0016"}, m3636d2 = {"ContractPill", "", "state", "Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState;", "modifier", "Landroidx/compose/ui/Modifier;", "allowPillClick", "", "onPillClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "QuoteWithNoPositionPill", "quoteText", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "QuoteWithPositionPill", "Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState$QuoteWithPositionPillState;", "(Lcom/robinhood/android/eventcontracts/hub/v2/ui/ContractPillState$QuoteWithPositionPillState;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "QuoteWithYesPositionPillPreview", "(Landroidx/compose/runtime/Composer;I)V", "QuoteWithNoPositionPillPreview", "QuotePillPreview", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CardPills {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractPill$lambda$2(CardPills7 cardPills7, Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        ContractPill(cardPills7, modifier, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuotePillPreview$lambda$16(int i, Composer composer, int i2) {
        QuotePillPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuoteWithNoPositionPill$lambda$8(String str, Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        QuoteWithNoPositionPill(str, modifier, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuoteWithNoPositionPillPreview$lambda$15(int i, Composer composer, int i2) {
        QuoteWithNoPositionPillPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuoteWithPositionPill$lambda$13(CardPills7.QuoteWithPositionPillState quoteWithPositionPillState, Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        QuoteWithPositionPill(quoteWithPositionPillState, modifier, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuoteWithYesPositionPillPreview$lambda$14(int i, Composer composer, int i2) {
        QuoteWithYesPositionPillPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContractPill(final CardPills7 state, Modifier modifier, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Function0<Unit> function03;
        final Modifier modifier2;
        final boolean z2;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-774927872);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                z2 = z;
                function04 = function02;
            } else {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                Modifier modifier3 = modifier;
                if (i5 != 0) {
                    z = false;
                }
                boolean z3 = z;
                if (i6 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function03 = (Function0) objRememberedValue;
                } else {
                    function03 = function02;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-774927872, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.ui.ContractPill (CardPills.kt:41)");
                }
                if (!(state instanceof CardPills7.QuoteWithNoPositionPillState)) {
                    composerStartRestartGroup.startReplaceGroup(-1676334592);
                    QuoteWithNoPositionPill(((CardPills7.QuoteWithNoPositionPillState) state).getQuoteText(), modifier3, z3, function03, composerStartRestartGroup, i3 & 8176, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(state instanceof CardPills7.QuoteWithPositionPillState)) {
                        composerStartRestartGroup.startReplaceGroup(-1676336706);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1676326544);
                    QuoteWithPositionPill((CardPills7.QuoteWithPositionPillState) state, modifier3, z3, function03, composerStartRestartGroup, StringResource.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                z2 = z3;
                function04 = function03;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CardPills.ContractPill$lambda$2(state, modifier2, z2, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        function02 = function0;
        if ((i3 & 1171) != 1170) {
            if (i4 != 0) {
            }
            Modifier modifier32 = modifier;
            if (i5 != 0) {
            }
            boolean z32 = z;
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(state instanceof CardPills7.QuoteWithNoPositionPillState)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier32;
            z2 = z32;
            function04 = function03;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuoteWithNoPositionPill(final String str, Modifier modifier, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function02;
        boolean z3;
        final Function0<Unit> function03;
        Composer composer2;
        final Function0<Unit> function04;
        final Modifier modifier3;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2012249643);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        z3 = i4 == 0 ? false : z2;
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function03 = (Function0) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function03 = function02;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2012249643, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.ui.QuoteWithNoPositionPill (CardPills.kt:64)");
                        }
                        composerStartRestartGroup.startReplaceGroup(-1036607738);
                        float f = 20;
                        Modifier modifierClip = Clip.clip(SizeKt.m5166requiredWidth3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(92)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f)));
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierClip, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), !bentoTheme.getColors(composerStartRestartGroup, i7).getIsDay() ? 0.4f : 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        if (z3) {
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean z5 = (i3 & 7168) == 2048;
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CardPills.QuoteWithNoPositionPill$lambda$7$lambda$6$lambda$5(function03);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            modifierM4872backgroundbw27NRU$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue2, 7, null);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        Function0<Unit> function05 = function03;
                        BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(modifierM4872backgroundbw27NRU$default, C2002Dp.m7995constructorimpl(1), Colors8.m26601blendWithjxsXWHM(bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), 0.5f), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM()), null, null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), composer2, (i3 & 14) | 24576, 0, 8108);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function04 = function05;
                        modifier3 = modifier4;
                        z4 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        z4 = z2;
                        function04 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CardPills.QuoteWithNoPositionPill$lambda$8(str, modifier3, z4, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function02 = function0;
                if ((i3 & 1171) == 1170) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-1036607738);
                    float f2 = 20;
                    Modifier modifierClip2 = Clip.clip(SizeKt.m5166requiredWidth3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(92)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2)));
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifierClip2, Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i72).m21371getBg0d7_KjU(), !bentoTheme2.getColors(composerStartRestartGroup, i72).getIsDay() ? 0.4f : 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    if (z3) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    Function0<Unit> function052 = function03;
                    BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(modifierM4872backgroundbw27NRU$default2, C2002Dp.m7995constructorimpl(1), Colors8.m26601blendWithjxsXWHM(bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i72).m21371getBg0d7_KjU(), 0.5f), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2))), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM()), null, null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextS(), composer2, (i3 & 14) | 24576, 0, 8108);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function04 = function052;
                    modifier3 = modifier4;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuoteWithNoPositionPill$lambda$7$lambda$6$lambda$5(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuoteWithPositionPill(final CardPills7.QuoteWithPositionPillState quoteWithPositionPillState, Modifier modifier, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function02;
        Function0<Unit> function03;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1900043288);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(quoteWithPositionPillState) : composerStartRestartGroup.changedInstance(quoteWithPositionPillState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                        z3 = z2;
                        function04 = function02;
                    } else {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z4 = i4 == 0 ? false : z2;
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function03 = (Function0) objRememberedValue2;
                        } else {
                            function03 = function02;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1900043288, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.ui.QuoteWithPositionPill (CardPills.kt:99)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = CardPills2.INSTANCE;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Modifier modifierM4872backgroundbw27NRU$default = Modifier.INSTANCE;
                        Modifier modifierClip = Clip.clip(modifierM4872backgroundbw27NRU$default, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(25)));
                        composerStartRestartGroup.startReplaceGroup(-572661387);
                        if (quoteWithPositionPillState.getDayNightColor() != null) {
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM4872backgroundbw27NRU$default, Colors8.m26601blendWithjxsXWHM(quoteWithPositionPillState.getDayNightColor().getColor(composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i7).getIsDay() ? 0.4f : 0.2f), null, 2, null);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(PaddingKt.m5144paddingVpY3zN4$default(modifierClip.then(modifierM4872backgroundbw27NRU$default), C2002Dp.m7995constructorimpl(4), 0.0f, 2, null), C2002Dp.m7995constructorimpl(32), 0.0f, 2, null);
                        String text = StringUtil2.getText(quoteWithPositionPillState.getPositionQuantity(), composerStartRestartGroup, StringResource.$stable);
                        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier5 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(text, modifierM5176widthInVpY3zN4$default, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i8).getTextAnnotation(), composer2, 24576, 0, 8104);
                        boolean z5 = z4;
                        Function0<Unit> function05 = function03;
                        QuoteWithNoPositionPill(quoteWithPositionPillState.getQuoteText(), null, z5, function05, composer2, i3 & 8064, 2);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        z3 = z5;
                        function04 = function05;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CardPills.QuoteWithPositionPill$lambda$13(quoteWithPositionPillState, modifier3, z3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function02 = function0;
                if ((i3 & 1171) != 1170) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        Modifier modifierM4872backgroundbw27NRU$default2 = Modifier.INSTANCE;
                        Modifier modifierClip2 = Clip.clip(modifierM4872backgroundbw27NRU$default2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(25)));
                        composerStartRestartGroup.startReplaceGroup(-572661387);
                        if (quoteWithPositionPillState.getDayNightColor() != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM5176widthInVpY3zN4$default2 = SizeKt.m5176widthInVpY3zN4$default(PaddingKt.m5144paddingVpY3zN4$default(modifierClip2.then(modifierM4872backgroundbw27NRU$default2), C2002Dp.m7995constructorimpl(4), 0.0f, 2, null), C2002Dp.m7995constructorimpl(32), 0.0f, 2, null);
                        String text2 = StringUtil2.getText(quoteWithPositionPillState.getPositionQuantity(), composerStartRestartGroup, StringResource.$stable);
                        int iM7919getCentere0LSkKk2 = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i82 = BentoTheme.$stable;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier52 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(text2, modifierM5176widthInVpY3zN4$default2, Color.m6701boximpl(bentoTheme22.getColors(composerStartRestartGroup, i82).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composerStartRestartGroup, i82).getTextAnnotation(), composer2, 24576, 0, 8104);
                        boolean z52 = z4;
                        Function0<Unit> function052 = function03;
                        QuoteWithNoPositionPill(quoteWithPositionPillState.getQuoteText(), null, z52, function052, composer2, i3 & 8064, 2);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        z3 = z52;
                        function04 = function052;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((i3 & 1171) != 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void QuoteWithYesPositionPillPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-503408063);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-503408063, i, -1, "com.robinhood.android.eventcontracts.hub.v2.ui.QuoteWithYesPositionPillPreview (CardPills.kt:154)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CardPills3.INSTANCE.getLambda$2018439561$feature_hub_v2_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CardPills.QuoteWithYesPositionPillPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void QuoteWithNoPositionPillPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(452716099);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(452716099, i, -1, "com.robinhood.android.eventcontracts.hub.v2.ui.QuoteWithNoPositionPillPreview (CardPills.kt:171)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CardPills3.INSTANCE.getLambda$1226802683$feature_hub_v2_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CardPills.QuoteWithNoPositionPillPreview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void QuotePillPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(161926963);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(161926963, i, -1, "com.robinhood.android.eventcontracts.hub.v2.ui.QuotePillPreview (CardPills.kt:188)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CardPills3.INSTANCE.m14353getLambda$1016344341$feature_hub_v2_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.CardPillsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CardPills.QuotePillPreview$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
