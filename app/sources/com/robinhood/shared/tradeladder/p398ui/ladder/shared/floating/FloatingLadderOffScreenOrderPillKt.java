package com.robinhood.shared.tradeladder.p398ui.ladder.shared.floating;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.tradeladder.p398ui.ladder.animations.LadderAnimations2;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderPillData;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill.PendingOrderPillKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PillStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FloatingLadderOffScreenOrderPill.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a?\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r¨\u0006\u0015"}, m3636d2 = {"FloatingLadderOffScreenOrderPill", "", "Landroidx/compose/foundation/layout/BoxScope;", "orderPillData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderPillData;", "isVisible", "", "hasFloatingMessageAtTop", "hasFloatingMessageAtBottom", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderPillData;ZZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PreviewFloatingLadderOffScreenOrderPillAnchoredToTopStart", "(Landroidx/compose/runtime/Composer;I)V", "PreviewFloatingLadderOffScreenOrderPillAnchoredToTopEnd", "PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomStart", "PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomEnd", "PreviewFloatingLadderOffScreenOrderPillAnchoredToTopStartOutlined", "PreviewFloatingLadderOffScreenOrderPillAnchoredToTopEndOutlined", "PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomStartOutlined", "PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomEndOutlined", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FloatingLadderOffScreenOrderPillKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingLadderOffScreenOrderPill$lambda$0(BoxScope boxScope, OrderPillData orderPillData, boolean z, boolean z2, boolean z3, Function0 function0, int i, Composer composer, int i2) {
        FloatingLadderOffScreenOrderPill(boxScope, orderPillData, z, z2, z3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomEnd$lambda$4 */
    public static final Unit m2946x905c2116(int i, Composer composer, int i2) {
        PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomEnd(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomEndOutlined$lambda$8 */
    public static final Unit m2948xda9e23d8(int i, Composer composer, int i2) {
        m2947x572ac7(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomStart$lambda$3 */
    public static final Unit m2949xe2620fee(int i, Composer composer, int i2) {
        PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomStart(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomStartOutlined$lambda$7 */
    public static final Unit m2951xa4d829b0(int i, Composer composer, int i2) {
        m2950x7edb7cce(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFloatingLadderOffScreenOrderPillAnchoredToTopEnd$lambda$2(int i, Composer composer, int i2) {
        PreviewFloatingLadderOffScreenOrderPillAnchoredToTopEnd(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PreviewFloatingLadderOffScreenOrderPillAnchoredToTopEndOutlined$lambda$6 */
    public static final Unit m2952x3d187dca(int i, Composer composer, int i2) {
        PreviewFloatingLadderOffScreenOrderPillAnchoredToTopEndOutlined(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PreviewFloatingLadderOffScreenOrderPillAnchoredToTopStart$lambda$1 */
    public static final Unit m2953xde53f0e0(int i, Composer composer, int i2) {
        PreviewFloatingLadderOffScreenOrderPillAnchoredToTopStart(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PreviewFloatingLadderOffScreenOrderPillAnchoredToTopStartOutlined$lambda$5 */
    public static final Unit m2955x5223d6a2(int i, Composer composer, int i2) {
        m2954x556fad5a(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FloatingLadderOffScreenOrderPill(final BoxScope boxScope, final OrderPillData orderPillData, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> onClick, Composer composer, final int i) {
        int i2;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(orderPillData, "orderPillData");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(943278985);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(orderPillData) : composerStartRestartGroup.changedInstance(orderPillData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            z5 = z3;
            i2 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
        } else {
            z5 = z3;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(943278985, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderOffScreenOrderPill (FloatingLadderOffScreenOrderPill.kt:29)");
            }
            composerStartRestartGroup.startMovableGroup(253014726, orderPillData.getSide());
            final boolean z6 = z4;
            final boolean z7 = z5;
            AnimatedVisibilityKt.AnimatedVisibility(z, boxScope.align(Modifier.INSTANCE, orderPillData.getAlignment()), LadderAnimations2.getLadderFadeInAnimation(), LadderAnimations2.getLadderFadeOutAnimation(), (String) null, ComposableLambda3.rememberComposableLambda(-248983026, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderOffScreenOrderPillKt.FloatingLadderOffScreenOrderPill.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-248983026, i4, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderOffScreenOrderPill.<anonymous>.<anonymous> (FloatingLadderOffScreenOrderPill.kt:38)");
                    }
                    Side side = orderPillData.getSide();
                    StringResource label = orderPillData.getLabel();
                    PillStyle.PillVisualState visualState = orderPillData.getVisualState();
                    StringResource bottomLabel = orderPillData.getBottomLabel();
                    PillStyle.PillVisualState visualState2 = orderPillData.getVisualState();
                    Alignment alignment = orderPillData.getAlignment();
                    ServerToBentoAssetMapper2 icon = orderPillData.getIcon();
                    composer2.startReplaceGroup(1245502213);
                    composer2.startReplaceGroup(1245496894);
                    Modifier modifierM5146paddingqDBjuR0$default = Modifier.INSTANCE;
                    Intrinsics.checkNotNull(modifierM5146paddingqDBjuR0$default, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                    boolean z8 = false;
                    if (z6 && orderPillData.isOnTop()) {
                        modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5146paddingqDBjuR0$default, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    }
                    Modifier modifierM5146paddingqDBjuR0$default2 = modifierM5146paddingqDBjuR0$default;
                    composer2.endReplaceGroup();
                    if (z7 && !orderPillData.isOnTop()) {
                        z8 = true;
                    }
                    if (z8) {
                        modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierM5146paddingqDBjuR0$default2, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null);
                    }
                    composer2.endReplaceGroup();
                    BoxScope boxScope2 = boxScope;
                    Function0<Unit> function0 = onClick;
                    int i5 = StringResource.$stable;
                    PendingOrderPillKt.PendingOrderPill(boxScope2, side, label, bottomLabel, modifierM5146paddingqDBjuR0$default2, function0, alignment, icon, false, false, visualState, visualState2, composer2, (i5 << 6) | (i5 << 9), 0, 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 200064, 16);
            composerStartRestartGroup.endMovableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderOffScreenOrderPillKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingLadderOffScreenOrderPillKt.FloatingLadderOffScreenOrderPill$lambda$0(boxScope, orderPillData, z, z2, z3, onClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewFloatingLadderOffScreenOrderPillAnchoredToTopStart(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(37505983);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(37505983, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.PreviewFloatingLadderOffScreenOrderPillAnchoredToTopStart (FloatingLadderOffScreenOrderPill.kt:61)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$FloatingLadderOffScreenOrderPillKt.INSTANCE.getLambda$948568448$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderOffScreenOrderPillKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingLadderOffScreenOrderPillKt.m2953xde53f0e0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewFloatingLadderOffScreenOrderPillAnchoredToTopEnd(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(519808632);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(519808632, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.PreviewFloatingLadderOffScreenOrderPillAnchoredToTopEnd (FloatingLadderOffScreenOrderPill.kt:83)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$FloatingLadderOffScreenOrderPillKt.INSTANCE.m26126getLambda$1861363591$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderOffScreenOrderPillKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingLadderOffScreenOrderPillKt.PreviewFloatingLadderOffScreenOrderPillAnchoredToTopEnd$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomStart(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(918379407);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(918379407, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomStart (FloatingLadderOffScreenOrderPill.kt:105)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$FloatingLadderOffScreenOrderPillKt.INSTANCE.m26125getLambda$1813036498$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderOffScreenOrderPillKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingLadderOffScreenOrderPillKt.m2949xe2620fee(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomEnd(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1360947784);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1360947784, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomEnd (FloatingLadderOffScreenOrderPill.kt:127)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$FloatingLadderOffScreenOrderPillKt.INSTANCE.m26127getLambda$460886873$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderOffScreenOrderPillKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingLadderOffScreenOrderPillKt.m2946x905c2116(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: PreviewFloatingLadderOffScreenOrderPillAnchoredToTopStartOutlined */
    public static final void m2954x556fad5a(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1658512065);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1658512065, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.PreviewFloatingLadderOffScreenOrderPillAnchoredToTopStartOutlined (FloatingLadderOffScreenOrderPill.kt:149)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$FloatingLadderOffScreenOrderPillKt.INSTANCE.getLambda$641419138$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderOffScreenOrderPillKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingLadderOffScreenOrderPillKt.m2955x5223d6a2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewFloatingLadderOffScreenOrderPillAnchoredToTopEndOutlined(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2062257030);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2062257030, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.PreviewFloatingLadderOffScreenOrderPillAnchoredToTopEndOutlined (FloatingLadderOffScreenOrderPill.kt:171)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$FloatingLadderOffScreenOrderPillKt.INSTANCE.m26123getLambda$1223092869$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderOffScreenOrderPillKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingLadderOffScreenOrderPillKt.m2952x3d187dca(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomStartOutlined */
    public static final void m2950x7edb7cce(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(7807633);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(7807633, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomStartOutlined (FloatingLadderOffScreenOrderPill.kt:193)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$FloatingLadderOffScreenOrderPillKt.INSTANCE.getLambda$786692656$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderOffScreenOrderPillKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingLadderOffScreenOrderPillKt.m2951xa4d829b0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomEndOutlined */
    public static final void m2947x572ac7(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(224290890);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(224290890, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.PreviewFloatingLadderOffScreenOrderPillAnchoredToBottomEndOutlined (FloatingLadderOffScreenOrderPill.kt:215)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableSingletons$FloatingLadderOffScreenOrderPillKt.INSTANCE.m26124getLambda$1240818775$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderOffScreenOrderPillKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingLadderOffScreenOrderPillKt.m2948xda9e23d8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
