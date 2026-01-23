package com.robinhood.android.tradingtrends.p264ui.details.table;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.tradingtrends.p264ui.details.table.TradingTrendsGenericCell;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Container;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.RenderableText;
import com.robinhood.models.serverdriven.experimental.api.TableColumnHeader;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TradingTrendsGenericCell.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001au\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0019\b\u0002\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010!\u001a\u00020\u000b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a9\u0010'\u001a\u00020\u000b2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0000H\u0003¢\u0006\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Landroidx/compose/ui/unit/Dp;", "width", "height", "Landroidx/compose/ui/Modifier;", "modifier", "", "selected", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Lkotlin/ExtensionFunctionType;", "bottomDivider", "content", "TradingTrendsBaseCell-bT65zuQ", "(Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TradingTrendsBaseCell", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsGenericCell;", "tradingTrendsCell", "Lcom/robinhood/android/generic/table/DisplayDetails;", "displayDetails", "Lkotlinx/coroutines/CoroutineScope;", "scope", "DisplayTradingTrendsCell-HdNWosM", "(Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsGenericCell;Lcom/robinhood/android/generic/table/DisplayDetails;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/Composer;I)V", "DisplayTradingTrendsCell", "DisplayStickyColumnHeader", "(Lcom/robinhood/android/generic/table/DisplayDetails;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/models/serverdriven/experimental/api/Container;", "container", "DisplayContainer-q2EtPuw", "(Lcom/robinhood/models/serverdriven/experimental/api/Container;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DisplayContainer", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "component", "maxWidth", "DisplaySdui-UQcCkZw", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/ui/unit/Dp;Lcom/robinhood/android/generic/table/DisplayDetails;Landroidx/compose/ui/unit/Dp;Landroidx/compose/runtime/Composer;II)V", "DisplaySdui", "lib-trading-trends_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsGenericCellKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingTrendsGenericCell2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayContainer_q2EtPuw$lambda$12(Container container, C2002Dp c2002Dp, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m19522DisplayContainerq2EtPuw(container, c2002Dp, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySdui_UQcCkZw$lambda$15(UIComponent uIComponent, C2002Dp c2002Dp, DisplayDetails displayDetails, C2002Dp c2002Dp2, int i, int i2, Composer composer, int i3) {
        m19523DisplaySduiUQcCkZw(uIComponent, c2002Dp, displayDetails, c2002Dp2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayStickyColumnHeader$lambda$8(DisplayDetails displayDetails, CoroutineScope coroutineScope, int i, Composer composer, int i2) {
        DisplayStickyColumnHeader(displayDetails, coroutineScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayTradingTrendsCell_HdNWosM$lambda$4(TradingTrendsGenericCell tradingTrendsGenericCell, DisplayDetails displayDetails, C2002Dp c2002Dp, C2002Dp c2002Dp2, CoroutineScope coroutineScope, int i, Composer composer, int i2) {
        m19524DisplayTradingTrendsCellHdNWosM(tradingTrendsGenericCell, displayDetails, c2002Dp, c2002Dp2, coroutineScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingTrendsBaseCell_bT65zuQ$lambda$3(C2002Dp c2002Dp, C2002Dp c2002Dp2, Modifier modifier, boolean z, Alignment alignment, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        m19525TradingTrendsBaseCellbT65zuQ(c2002Dp, c2002Dp2, modifier, z, alignment, function3, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /* renamed from: TradingTrendsBaseCell-bT65zuQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m19525TradingTrendsBaseCellbT65zuQ(final C2002Dp c2002Dp, final C2002Dp c2002Dp2, Modifier modifier, boolean z, Alignment alignment, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        int i5;
        Alignment centerStart;
        int i6;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3RememberComposableLambda;
        Modifier modifierM4872backgroundbw27NRU$default;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BoxScopeInstance boxScopeInstance;
        Modifier modifierM5156height3ABfNKs;
        Modifier modifierM5174width3ABfNKs;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1782311001);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(c2002Dp) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp2) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        centerStart = alignment;
                        i3 |= composerStartRestartGroup.changed(centerStart) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            function3RememberComposableLambda = function3;
                            i3 |= composerStartRestartGroup.changedInstance(function3RememberComposableLambda) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if (i5 != 0) {
                                centerStart = Alignment.INSTANCE.getCenterStart();
                            }
                            if (i6 != 0) {
                                function3RememberComposableLambda = ComposableLambda3.rememberComposableLambda(612207008, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsGenericCellKt$TradingTrendsBaseCell$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                                        invoke(boxScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxScope boxScope, Composer composer2, int i8) {
                                        long jM21373getBg30d7_KjU;
                                        Intrinsics.checkNotNullParameter(boxScope, "<this>");
                                        if ((i8 & 6) == 0) {
                                            i8 |= composer2.changed(boxScope) ? 4 : 2;
                                        }
                                        if ((i8 & 19) == 18 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(612207008, i8, -1, "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsBaseCell.<anonymous> (TradingTrendsGenericCell.kt:62)");
                                        }
                                        Modifier modifierAlign = boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter());
                                        if (z2) {
                                            composer2.startReplaceGroup(1827968078);
                                            jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                                            composer2.endReplaceGroup();
                                        } else {
                                            composer2.startReplaceGroup(1828025645);
                                            jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU();
                                            composer2.endReplaceGroup();
                                        }
                                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(modifierAlign, jM21373getBg30d7_KjU, 0.0f, composer2, 0, 4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1782311001, i3, -1, "com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsBaseCell (TradingTrendsGenericCell.kt:72)");
                            }
                            modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier3, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                            if (c2002Dp != null && (modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifierM4872backgroundbw27NRU$default, c2002Dp.getValue())) != null) {
                                modifierM4872backgroundbw27NRU$default = modifierM5174width3ABfNKs;
                            }
                            if (c2002Dp2 != null && (modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierM4872backgroundbw27NRU$default, c2002Dp2.getValue())) != null) {
                                modifierM4872backgroundbw27NRU$default = modifierM5156height3ABfNKs;
                            }
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            content.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | 6));
                            composerStartRestartGroup.startReplaceGroup(-1247251655);
                            if (c2002Dp != null && c2002Dp2 != null) {
                                function3RememberComposableLambda.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 12) & 112) | 6));
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                        }
                        final boolean z3 = z2;
                        final Alignment alignment2 = centerStart;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function32 = function3RememberComposableLambda;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsGenericCellKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TradingTrendsGenericCell2.TradingTrendsBaseCell_bT65zuQ$lambda$3(c2002Dp, c2002Dp2, modifier4, z3, alignment2, function32, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    function3RememberComposableLambda = function3;
                    if ((i2 & 64) != 0) {
                    }
                    if ((599187 & i3) != 599186) {
                        if (i7 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier3, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                        if (c2002Dp != null) {
                            modifierM4872backgroundbw27NRU$default = modifierM5174width3ABfNKs;
                        }
                        if (c2002Dp2 != null) {
                            modifierM4872backgroundbw27NRU$default = modifierM5156height3ABfNKs;
                        }
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            content.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | 6));
                            composerStartRestartGroup.startReplaceGroup(-1247251655);
                            if (c2002Dp != null) {
                                function3RememberComposableLambda.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 12) & 112) | 6));
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier3;
                        }
                    }
                    final boolean z32 = z2;
                    final Alignment alignment22 = centerStart;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                centerStart = alignment;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                function3RememberComposableLambda = function3;
                if ((i2 & 64) != 0) {
                }
                if ((599187 & i3) != 599186) {
                }
                final boolean z322 = z2;
                final Alignment alignment222 = centerStart;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            centerStart = alignment;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            function3RememberComposableLambda = function3;
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) != 599186) {
            }
            final boolean z3222 = z2;
            final Alignment alignment2222 = centerStart;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        centerStart = alignment;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function3RememberComposableLambda = function3;
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) != 599186) {
        }
        final boolean z32222 = z2;
        final Alignment alignment22222 = centerStart;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: DisplayTradingTrendsCell-HdNWosM, reason: not valid java name */
    public static final void m19524DisplayTradingTrendsCellHdNWosM(final TradingTrendsGenericCell tradingTrendsCell, final DisplayDetails displayDetails, final C2002Dp c2002Dp, final C2002Dp c2002Dp2, final CoroutineScope scope, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(tradingTrendsCell, "tradingTrendsCell");
        Intrinsics.checkNotNullParameter(displayDetails, "displayDetails");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1701502180);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(tradingTrendsCell) : composerStartRestartGroup.changedInstance(tradingTrendsCell) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(displayDetails) : composerStartRestartGroup.changedInstance(displayDetails) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(c2002Dp) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(c2002Dp2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(scope) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1701502180, i2, -1, "com.robinhood.android.tradingtrends.ui.details.table.DisplayTradingTrendsCell (TradingTrendsGenericCell.kt:98)");
            }
            if (!(tradingTrendsCell instanceof TradingTrendsGenericCell.Sdui)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = i2 >> 6;
            m19525TradingTrendsBaseCellbT65zuQ(c2002Dp, c2002Dp2, null, false, ((TradingTrendsGenericCell.Sdui) tradingTrendsCell).getAlignment(), null, ComposableLambda3.rememberComposableLambda(1005289378, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsGenericCellKt$DisplayTradingTrendsCell$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(BoxScope TradingTrendsBaseCell, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(TradingTrendsBaseCell, "$this$TradingTrendsBaseCell");
                    if ((i4 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1005289378, i4, -1, "com.robinhood.android.tradingtrends.ui.details.table.DisplayTradingTrendsCell.<anonymous> (TradingTrendsGenericCell.kt:107)");
                    }
                    if (displayDetails.getColumnIndex() == 0 && (((TradingTrendsGenericCell.Sdui) tradingTrendsCell).getComponent() instanceof Container)) {
                        composer2.startReplaceGroup(-230957151);
                        TradingTrendsGenericCell2.m19522DisplayContainerq2EtPuw((Container) ((TradingTrendsGenericCell.Sdui) tradingTrendsCell).getComponent(), c2002Dp, null, composer2, 0, 4);
                        composer2.endReplaceGroup();
                    } else if (displayDetails.getColumnIndex() == 0 && (((TradingTrendsGenericCell.Sdui) tradingTrendsCell).getComponent() instanceof TableColumnHeader)) {
                        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(80);
                        C2002Dp c2002Dp3 = c2002Dp;
                        if (c2002Dp3 == null ? false : C2002Dp.m7997equalsimpl0(c2002Dp3.getValue(), fM7995constructorimpl)) {
                            composer2.startReplaceGroup(-230581896);
                            TradingTrendsGenericCell2.DisplayStickyColumnHeader(displayDetails, scope, composer2, DisplayDetails.$stable);
                            composer2.endReplaceGroup();
                        }
                    } else {
                        composer2.startReplaceGroup(-230437250);
                        TradingTrendsGenericCell2.m19523DisplaySduiUQcCkZw(((TradingTrendsGenericCell.Sdui) tradingTrendsCell).getComponent(), c2002Dp, displayDetails, ((TradingTrendsGenericCell.Sdui) tradingTrendsCell).m19520getMaxWidthlTKBWiU(), composer2, DisplayDetails.$stable << 6, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 1575936 | (i3 & 112), 36);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsGenericCellKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingTrendsGenericCell2.DisplayTradingTrendsCell_HdNWosM$lambda$4(tradingTrendsCell, displayDetails, c2002Dp, c2002Dp2, scope, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisplayStickyColumnHeader(final DisplayDetails displayDetails, final CoroutineScope coroutineScope, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(473941757);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(displayDetails) : composerStartRestartGroup.changedInstance(displayDetails) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(coroutineScope) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(473941757, i2, -1, "com.robinhood.android.tradingtrends.ui.details.table.DisplayStickyColumnHeader (TradingTrendsGenericCell.kt:139)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(80));
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            boolean z = false;
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5174width3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
            int i4 = i2;
            BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.ARROW_LEFT_12);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope);
            if ((i4 & 14) == 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(displayDetails))) {
                z = true;
            }
            boolean z2 = zChangedInstance | z;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsGenericCellKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradingTrendsGenericCell2.DisplayStickyColumnHeader$lambda$7$lambda$6$lambda$5(coroutineScope, displayDetails);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21425getFg0d7_KjU, modifierM5146paddingqDBjuR0$default, (Function0) objRememberedValue, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 32);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsGenericCellKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingTrendsGenericCell2.DisplayStickyColumnHeader$lambda$8(displayDetails, coroutineScope, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayStickyColumnHeader$lambda$7$lambda$6$lambda$5(CoroutineScope coroutineScope, DisplayDetails displayDetails) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TradingTrendsGenericCell3(displayDetails, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: DisplayContainer-q2EtPuw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m19522DisplayContainerq2EtPuw(Container<?> container, final C2002Dp c2002Dp, Modifier modifier, Composer composer, final int i, final int i2) {
        final Container<?> container2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        Modifier modifier4;
        int i4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1024997684);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            container2 = container;
        } else if ((i & 6) == 0) {
            container2 = container;
            i3 = (composerStartRestartGroup.changedInstance(container2) ? 4 : 2) | i;
        } else {
            container2 = container;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1024997684, i3, -1, "com.robinhood.android.tradingtrends.ui.details.table.DisplayContainer (TradingTrendsGenericCell.kt:165)");
                }
                composerStartRestartGroup.startReplaceGroup(-1475253103);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifier5, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                int i7 = 0;
                if (c2002Dp != null) {
                    modifierM5142padding3ABfNKs = PaddingKt.m5144paddingVpY3zN4$default(modifierM5142padding3ABfNKs, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21597getXxsmallD9Ej5fM(), 0.0f, 2, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(container2.getItem_spacing().getMobile())), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1899345146);
                for (UIComponent uIComponent : container2.getContent()) {
                    if (uIComponent instanceof Text) {
                        composerStartRestartGroup.startReplaceGroup(62612494);
                        Text text = (Text) uIComponent;
                        RenderableText text2 = text.getText();
                        if (text2 instanceof PlainText) {
                            composerStartRestartGroup.startReplaceGroup(62700782);
                            String text3 = ((PlainText) text2).getText();
                            TextStyle composeTextStyle = UtilKt.getComposeTextStyle(text.getStyle(), composerStartRestartGroup, i7);
                            int composeTextAlign = UtilKt.getComposeTextAlign(text.getAlignment());
                            Color composeColor = SduiColors2.toComposeColor(text.getColor(), composerStartRestartGroup, i7);
                            composerStartRestartGroup.startReplaceGroup(-1937631316);
                            long jM21425getFg0d7_KjU = composeColor == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : composeColor.getValue();
                            composerStartRestartGroup.endReplaceGroup();
                            Composer composer2 = composerStartRestartGroup;
                            i4 = i7;
                            modifier4 = modifier5;
                            BentoText2.m20747BentoText38GnDrw(text3, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(composeTextAlign), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, composeTextStyle, composer2, 817889280, 0, 7482);
                            composerStartRestartGroup = composer2;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            modifier4 = modifier5;
                            i4 = i7;
                            composerStartRestartGroup.startReplaceGroup(63229177);
                            SduiComponent3.SduiComponent(uIComponent, null, null, composerStartRestartGroup, 0, 6);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        modifier4 = modifier5;
                        i4 = i7;
                        composerStartRestartGroup.startReplaceGroup(63378473);
                        SduiComponent3.SduiComponent(uIComponent, null, null, composerStartRestartGroup, 0, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    modifier5 = modifier4;
                    i7 = i4;
                }
                modifier3 = modifier5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsGenericCellKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradingTrendsGenericCell2.DisplayContainer_q2EtPuw$lambda$12(container2, c2002Dp, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1475253103);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(modifier5, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM());
            int i72 = 0;
            if (c2002Dp != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(container2.getItem_spacing().getMobile())), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1899345146);
                while (r0.hasNext()) {
                }
                modifier3 = modifier5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: DisplaySdui-UQcCkZw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m19523DisplaySduiUQcCkZw(final UIComponent<?> uIComponent, final C2002Dp c2002Dp, final DisplayDetails displayDetails, C2002Dp c2002Dp2, Composer composer, final int i, final int i2) {
        UIComponent<?> uIComponent2;
        int i3;
        C2002Dp c2002Dp3;
        float fM21593getSmallD9Ej5fM;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final C2002Dp c2002Dp4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-42753101);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            uIComponent2 = uIComponent;
        } else if ((i & 6) == 0) {
            uIComponent2 = uIComponent;
            i3 = (composerStartRestartGroup.changedInstance(uIComponent2) ? 4 : 2) | i;
        } else {
            uIComponent2 = uIComponent;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(displayDetails) : composerStartRestartGroup.changedInstance(displayDetails) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                c2002Dp3 = c2002Dp2;
                i3 |= composerStartRestartGroup.changed(c2002Dp3) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                c2002Dp4 = c2002Dp3;
            } else {
                C2002Dp c2002Dp5 = i4 == 0 ? null : c2002Dp3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-42753101, i3, -1, "com.robinhood.android.tradingtrends.ui.details.table.DisplaySdui (TradingTrendsGenericCell.kt:210)");
                }
                composerStartRestartGroup.startReplaceGroup(1863964695);
                Modifier modifierM5173sizeInqDBjuR0$default = SizeKt.m5173sizeInqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, c2002Dp5 == null ? c2002Dp5.getValue() : C2002Dp.INSTANCE.m8003getInfinityD9Ej5fM(), 0.0f, 11, null);
                if (displayDetails.getColumnIndex() != 0) {
                    composerStartRestartGroup.startReplaceGroup(1948019149);
                    fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1948090511);
                    fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                    composerStartRestartGroup.endReplaceGroup();
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM5173sizeInqDBjuR0$default, fM21593getSmallD9Ej5fM, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                if (c2002Dp != null) {
                    modifierM5143paddingVpY3zN4 = PaddingKt.m5144paddingVpY3zN4$default(modifierM5143paddingVpY3zN4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 2, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                SduiComponent3.SduiComponent(uIComponent2, null, null, composerStartRestartGroup, i3 & 14, 6);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                c2002Dp4 = c2002Dp5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.details.table.TradingTrendsGenericCellKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradingTrendsGenericCell2.DisplaySdui_UQcCkZw$lambda$15(uIComponent, c2002Dp, displayDetails, c2002Dp4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        c2002Dp3 = c2002Dp2;
        if ((i3 & 1171) != 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1863964695);
            Modifier modifierM5173sizeInqDBjuR0$default2 = SizeKt.m5173sizeInqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, c2002Dp5 == null ? c2002Dp5.getValue() : C2002Dp.INSTANCE.m8003getInfinityD9Ej5fM(), 0.0f, 11, null);
            if (displayDetails.getColumnIndex() != 0) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifierM5173sizeInqDBjuR0$default2, fM21593getSmallD9Ej5fM, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM());
            if (c2002Dp != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                SduiComponent3.SduiComponent(uIComponent2, null, null, composerStartRestartGroup, i3 & 14, 6);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                c2002Dp4 = c2002Dp5;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
