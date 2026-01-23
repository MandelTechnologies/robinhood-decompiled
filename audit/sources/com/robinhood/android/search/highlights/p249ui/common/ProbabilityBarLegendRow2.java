package com.robinhood.android.search.highlights.p249ui.common;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.search.highlights.model.ProbabilitySegment;
import com.robinhood.android.search.highlights.p249ui.multicontractshero.SearchHighlightMultiContractHeroCardViewState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ProbabilityBarLegendRow.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0015\u001a,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002\u001a:\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¨\u0006 "}, m3636d2 = {"ProbabilityBarLegend", "", "contracts", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardViewState$ContractDisplayInfo;", "fractions", "Lcom/robinhood/android/search/highlights/model/ProbabilitySegment;", "modifier", "Landroidx/compose/ui/Modifier;", "minSpacing", "Landroidx/compose/ui/unit/Dp;", "gapWidthDp", "ProbabilityBarLegend-6PoWaU8", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;FFLandroidx/compose/runtime/Composer;II)V", "LegendItem", "contract", "isFirst", "", "isLast", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "(Lcom/robinhood/android/search/highlights/ui/multicontractshero/SearchHighlightMultiContractHeroCardViewState$ContractDisplayInfo;ZZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "calculateSegmentCenters", "", "", "totalWidth", "gapWidthPx", "calculateItemPlacements", "Lcom/robinhood/android/search/highlights/ui/common/ItemPlacement;", "segmentCenters", "itemWidths", "minSpacingPx", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.common.ProbabilityBarLegendRowKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ProbabilityBarLegendRow2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegendItem$lambda$10(SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo contractDisplayInfo, boolean z, boolean z2, Alignment.Horizontal horizontal, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LegendItem(contractDisplayInfo, z, z2, horizontal, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProbabilityBarLegend_6PoWaU8$lambda$8(ImmutableList immutableList, ImmutableList immutableList2, Modifier modifier, float f, float f2, int i, int i2, Composer composer, int i3) {
        m18630ProbabilityBarLegend6PoWaU8(immutableList, immutableList2, modifier, f, f2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0130  */
    /* renamed from: ProbabilityBarLegend-6PoWaU8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18630ProbabilityBarLegend6PoWaU8(final ImmutableList<SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo> contracts2, final ImmutableList<ProbabilitySegment> fractions, Modifier modifier, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final float fM7995constructorimpl;
        int i5;
        final float fM7995constructorimpl2;
        boolean z;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(contracts2, "contracts");
        Intrinsics.checkNotNullParameter(fractions, "fractions");
        Composer composerStartRestartGroup = composer.startRestartGroup(-556397487);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(contracts2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(fractions) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
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
                    fM7995constructorimpl = f;
                    i3 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        fM7995constructorimpl2 = f2;
                        i3 |= composerStartRestartGroup.changed(fM7995constructorimpl2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(16);
                        }
                        if (i5 != 0) {
                            fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(4);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-556397487, i3, -1, "com.robinhood.android.search.highlights.ui.common.ProbabilityBarLegend (ProbabilityBarLegendRow.kt:27)");
                        }
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        z = ((57344 & i3) != 16384) | ((i3 & 7168) != 2048) | ((i3 & 14) != 4) | ((i3 & 112) == 32);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2() { // from class: com.robinhood.android.search.highlights.ui.common.ProbabilityBarLegendRowKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ProbabilityBarLegendRow2.ProbabilityBarLegend_6PoWaU8$lambda$7$lambda$6(fM7995constructorimpl2, fM7995constructorimpl, contracts2, fractions, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifier2, (Function2) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    final float f3 = fM7995constructorimpl2;
                    final float f4 = fM7995constructorimpl;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.common.ProbabilityBarLegendRowKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ProbabilityBarLegendRow2.ProbabilityBarLegend_6PoWaU8$lambda$8(contracts2, fractions, modifier3, f4, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                fM7995constructorimpl2 = f2;
                if ((i3 & 9363) == 9362) {
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    z = ((57344 & i3) != 16384) | ((i3 & 7168) != 2048) | ((i3 & 14) != 4) | ((i3 & 112) == 32);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function2() { // from class: com.robinhood.android.search.highlights.ui.common.ProbabilityBarLegendRowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ProbabilityBarLegendRow2.ProbabilityBarLegend_6PoWaU8$lambda$7$lambda$6(fM7995constructorimpl2, fM7995constructorimpl, contracts2, fractions, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(modifier2, (Function2) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
                final float f32 = fM7995constructorimpl2;
                final float f42 = fM7995constructorimpl;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fM7995constructorimpl = f;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            fM7995constructorimpl2 = f2;
            if ((i3 & 9363) == 9362) {
            }
            final float f322 = fM7995constructorimpl2;
            final float f422 = fM7995constructorimpl;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        fM7995constructorimpl = f;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        fM7995constructorimpl2 = f2;
        if ((i3 & 9363) == 9362) {
        }
        final float f3222 = fM7995constructorimpl2;
        final float f4222 = fM7995constructorimpl;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ProbabilityBarLegend_6PoWaU8$lambda$7$lambda$6(float f, float f2, final ImmutableList immutableList, ImmutableList immutableList2, SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
        boolean z;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int iM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(constraints.getValue());
        int iMo5010roundToPx0680j_4 = SubcomposeLayout.mo5010roundToPx0680j_4(f);
        int iMo5010roundToPx0680j_42 = SubcomposeLayout.mo5010roundToPx0680j_4(f2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
        Iterator<E> it = immutableList.iterator();
        final int i = 0;
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo contractDisplayInfo = (SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo) next;
            arrayList.add(((Measurable) CollectionsKt.first((List) SubcomposeLayout.subcompose("measure_" + i, ComposableLambda3.composableLambdaInstance(707191849, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.common.ProbabilityBarLegendRowKt$ProbabilityBarLegend$1$1$initialPlaceables$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i3) {
                    if ((i3 & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(707191849, i3, -1, "com.robinhood.android.search.highlights.ui.common.ProbabilityBarLegend.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProbabilityBarLegendRow.kt:36)");
                    }
                    SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo contractDisplayInfo2 = contractDisplayInfo;
                    int i4 = i;
                    ProbabilityBarLegendRow2.LegendItem(contractDisplayInfo2, i4 == 0, i4 == CollectionsKt.getLastIndex(immutableList), Alignment.INSTANCE.getCenterHorizontally(), null, composer, 3072, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            })))).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(constraints.getValue(), 0, iM7975getMaxWidthimpl, 0, 0, 12, null)));
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((Placeable) it2.next()).getWidth()));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf(((Placeable) it3.next()).getHeight()));
        }
        final List<ItemPlacement> listCalculateItemPlacements = calculateItemPlacements(calculateSegmentCenters(immutableList2, iM7975getMaxWidthimpl, iMo5010roundToPx0680j_4), arrayList2, iM7975getMaxWidthimpl, iMo5010roundToPx0680j_42);
        final ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
        final int i3 = 0;
        for (Object obj : immutableList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo contractDisplayInfo2 = (SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo) obj;
            arrayList4.add(((Measurable) CollectionsKt.first((List) SubcomposeLayout.subcompose("final_" + i3, ComposableLambda3.composableLambdaInstance(1082952667, z, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.common.ProbabilityBarLegendRowKt$ProbabilityBarLegend$1$1$finalPlaceables$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i5) {
                    if ((i5 & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1082952667, i5, -1, "com.robinhood.android.search.highlights.ui.common.ProbabilityBarLegend.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProbabilityBarLegendRow.kt:67)");
                    }
                    SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo contractDisplayInfo3 = contractDisplayInfo2;
                    int i6 = i3;
                    ProbabilityBarLegendRow2.LegendItem(contractDisplayInfo3, i6 == 0, i6 == CollectionsKt.getLastIndex(immutableList), listCalculateItemPlacements.get(i3).getAlignment(), null, composer, 0, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            })))).mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(constraints.getValue(), 0, iM7975getMaxWidthimpl, 0, 0, 12, null)));
            i3 = i4;
            z = z;
        }
        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList3);
        return MeasureScope.layout$default(SubcomposeLayout, iM7975getMaxWidthimpl, num != null ? num.intValue() : 0, null, new Function1() { // from class: com.robinhood.android.search.highlights.ui.common.ProbabilityBarLegendRowKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ProbabilityBarLegendRow2.ProbabilityBarLegend_6PoWaU8$lambda$7$lambda$6$lambda$5(arrayList4, listCalculateItemPlacements, (Placeable.PlacementScope) obj2);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProbabilityBarLegend_6PoWaU8$lambda$7$lambda$6$lambda$5(List list, List list2, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, ((ItemPlacement) list2.get(i)).getXPosition(), 0, 0.0f, 4, null);
            i = i2;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LegendItem(SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo contractDisplayInfo, final boolean z, final boolean z2, final Alignment.Horizontal horizontal, Modifier modifier, Composer composer, final int i, final int i2) {
        SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo contractDisplayInfo2;
        int i3;
        Alignment.Horizontal horizontal2;
        int i4;
        Modifier modifier2;
        Alignment.Horizontal start;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-139417888);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            contractDisplayInfo2 = contractDisplayInfo;
        } else if ((i & 6) == 0) {
            contractDisplayInfo2 = contractDisplayInfo;
            i3 = (composerStartRestartGroup.changed(contractDisplayInfo2) ? 4 : 2) | i;
        } else {
            contractDisplayInfo2 = contractDisplayInfo;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                horizontal2 = horizontal;
                i3 |= composerStartRestartGroup.changed(horizontal2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-139417888, i3, -1, "com.robinhood.android.search.highlights.ui.common.LegendItem (ProbabilityBarLegendRow.kt:101)");
                    }
                    if (!z2) {
                        start = Alignment.INSTANCE.getEnd();
                    } else {
                        start = z ? Alignment.INSTANCE.getStart() : horizontal2;
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start, composerStartRestartGroup, 0);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String title = contractDisplayInfo2.getTitle();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                    TextOverflow.Companion companion2 = TextOverflow.INSTANCE;
                    Modifier modifier5 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textS, composer2, 817889280, 0, 7546);
                    BentoText2.m20747BentoText38GnDrw(contractDisplayInfo2.getDisplayValue(), null, Color.m6701boximpl(contractDisplayInfo2.getColor().getColor(composer2, 0)), null, null, null, null, companion2.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 817889280, 0, 7546);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final SearchHighlightMultiContractHeroCardViewState.ContractDisplayInfo contractDisplayInfo3 = contractDisplayInfo2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.common.ProbabilityBarLegendRowKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ProbabilityBarLegendRow2.LegendItem$lambda$10(contractDisplayInfo3, z, z2, horizontal, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!z2) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start, composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    String title2 = contractDisplayInfo2.getTitle();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                    long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                    TextOverflow.Companion companion22 = TextOverflow.INSTANCE;
                    Modifier modifier52 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(title2, null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, companion22.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textS2, composer2, 817889280, 0, 7546);
                    BentoText2.m20747BentoText38GnDrw(contractDisplayInfo2.getDisplayValue(), null, Color.m6701boximpl(contractDisplayInfo2.getColor().getColor(composer2, 0)), null, null, null, null, companion22.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextS(), composer2, 817889280, 0, 7546);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        horizontal2 = horizontal;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final List<Integer> calculateSegmentCenters(List<ProbabilitySegment> list, int i, int i2) {
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        int size = i - ((list.size() - 1) * i2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            int fraction = (int) (size * ((ProbabilitySegment) it.next()).getFraction());
            arrayList.add(Integer.valueOf((fraction / 2) + i3));
            i3 += fraction + i2;
        }
        return arrayList;
    }

    private static final List<ItemPlacement> calculateItemPlacements(List<Integer> list, List<Integer> list2, int i, int i2) {
        Alignment.Horizontal centerHorizontally;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new ItemPlacement(0, Alignment.INSTANCE.getCenterHorizontally()));
        }
        int size2 = list.size();
        if (size2 == 0) {
            return CollectionsKt.emptyList();
        }
        int i4 = 1;
        if (size2 == 1) {
            arrayList.set(0, new ItemPlacement(0, Alignment.INSTANCE.getStart()));
            return arrayList;
        }
        if (size2 == 2) {
            Alignment.Companion companion = Alignment.INSTANCE;
            arrayList.set(0, new ItemPlacement(0, companion.getStart()));
            arrayList.set(1, new ItemPlacement(i - list2.get(1).intValue(), companion.getEnd()));
            return arrayList;
        }
        Alignment.Companion companion2 = Alignment.INSTANCE;
        arrayList.set(0, new ItemPlacement(0, companion2.getStart()));
        int lastIndex = CollectionsKt.getLastIndex(arrayList);
        arrayList.set(lastIndex, new ItemPlacement(i - list2.get(lastIndex).intValue(), companion2.getEnd()));
        while (i4 < lastIndex) {
            int iIntValue = list.get(i4).intValue() - (list2.get(i4).intValue() / 2);
            int i5 = i4 - 1;
            int xPosition = ((ItemPlacement) arrayList.get(i5)).getXPosition() + list2.get(i5).intValue() + i2;
            int i6 = i4 + 1;
            int iCoerceIn = RangesKt.coerceIn(iIntValue, xPosition, (((ItemPlacement) arrayList.get(i6)).getXPosition() - list2.get(i4).intValue()) - i2);
            if (iCoerceIn > iIntValue) {
                centerHorizontally = Alignment.INSTANCE.getStart();
            } else if (iCoerceIn < iIntValue) {
                centerHorizontally = Alignment.INSTANCE.getEnd();
            } else {
                centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            }
            arrayList.set(i4, new ItemPlacement(iCoerceIn, centerHorizontally));
            i4 = i6;
        }
        return arrayList;
    }
}
