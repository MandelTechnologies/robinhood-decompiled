package com.robinhood.android.search.highlights.p249ui.subpages;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.eventcontracts.sharedeventui.navbar.CategoryItem2;
import com.robinhood.android.search.highlights.p249ui.common.UtilsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SearchHighlightSubpageHeader.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aR\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a1\u0010\u000e\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"SearchHighlightSubpageHeader", "", "subpages", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;", "selectedSubpage", "onSubpageChanged", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "subpage", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SubpageHeaderButton", "isSelected", "", "(Lcom/robinhood/android/search/highlights/ui/subpages/SearchHighlightSubpageData;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.subpages.SearchHighlightSubpageHeaderKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SearchHighlightSubpageHeader {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightSubpageHeader$lambda$5(ImmutableList immutableList, SearchHighlightSubpageData searchHighlightSubpageData, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SearchHighlightSubpageHeader(immutableList, searchHighlightSubpageData, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubpageHeaderButton$lambda$8(SearchHighlightSubpageData searchHighlightSubpageData, boolean z, Function1 function1, int i, Composer composer, int i2) {
        SubpageHeaderButton(searchHighlightSubpageData, z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchHighlightSubpageHeader(final ImmutableList<? extends SearchHighlightSubpageData> subpages, final SearchHighlightSubpageData searchHighlightSubpageData, final Function1<? super SearchHighlightSubpageData, Unit> onSubpageChanged, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(subpages, "subpages");
        Intrinsics.checkNotNullParameter(onSubpageChanged, "onSubpageChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(824620890);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(subpages) : composerStartRestartGroup.changedInstance(subpages) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(searchHighlightSubpageData) : composerStartRestartGroup.changedInstance(searchHighlightSubpageData) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSubpageChanged) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(824620890, i3, -1, "com.robinhood.android.search.highlights.ui.subpages.SearchHighlightSubpageHeader (SearchHighlightSubpageHeader.kt:25)");
                }
                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(40)), scrollStateRememberScrollState, false, null, false, 14, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), companion.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                UtilsKt.HorizontalSpacerInRow(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(2093250792);
                for (SearchHighlightSubpageData searchHighlightSubpageData2 : subpages) {
                    boolean zAreEqual = Intrinsics.areEqual(searchHighlightSubpageData2.getId(), searchHighlightSubpageData != null ? searchHighlightSubpageData.getId() : null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z = ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(searchHighlightSubpageData))) | ((i3 & 896) == 256);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.search.highlights.ui.subpages.SearchHighlightSubpageHeaderKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SearchHighlightSubpageHeader.m2468xb445e9(searchHighlightSubpageData, onSubpageChanged, (SearchHighlightSubpageData) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SubpageHeaderButton(searchHighlightSubpageData2, zAreEqual, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                UtilsKt.HorizontalSpacerInRow(composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.subpages.SearchHighlightSubpageHeaderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SearchHighlightSubpageHeader.SearchHighlightSubpageHeader$lambda$5(subpages, searchHighlightSubpageData, onSubpageChanged, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion3.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifierHorizontalScroll$default2 = ScrollKt.horizontalScroll$default(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(40)), scrollStateRememberScrollState2, false, null, false, 14, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), companion3.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    UtilsKt.HorizontalSpacerInRow(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(2093250792);
                    while (r8.hasNext()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    UtilsKt.HorizontalSpacerInRow(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SearchHighlightSubpageHeader$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0 */
    public static final Unit m2468xb445e9(SearchHighlightSubpageData searchHighlightSubpageData, Function1 function1, SearchHighlightSubpageData newSubpage) {
        Intrinsics.checkNotNullParameter(newSubpage, "newSubpage");
        if (!Intrinsics.areEqual(searchHighlightSubpageData, newSubpage)) {
            function1.invoke(newSubpage);
        }
        return Unit.INSTANCE;
    }

    private static final void SubpageHeaderButton(final SearchHighlightSubpageData searchHighlightSubpageData, boolean z, final Function1<? super SearchHighlightSubpageData, Unit> function1, Composer composer, final int i) {
        int i2;
        final boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(805551589);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(searchHighlightSubpageData) : composerStartRestartGroup.changedInstance(searchHighlightSubpageData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(805551589, i2, -1, "com.robinhood.android.search.highlights.ui.subpages.SubpageHeaderButton (SearchHighlightSubpageHeader.kt:63)");
            }
            int i3 = i2 & 14;
            String displayTitle = SearchHighlightSubpageData2.getDisplayTitle(searchHighlightSubpageData, composerStartRestartGroup, i3);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z3 = false;
            boolean z4 = (i2 & 896) == 256;
            if (i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(searchHighlightSubpageData))) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.search.highlights.ui.subpages.SearchHighlightSubpageHeaderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchHighlightSubpageHeader.SubpageHeaderButton$lambda$7$lambda$6(function1, searchHighlightSubpageData);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            z2 = z;
            CategoryItem2.SimpleCategoryItem(displayTitle, (Function0) objRememberedValue, null, false, z2, composerStartRestartGroup, (i2 << 9) & 57344, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.subpages.SearchHighlightSubpageHeaderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchHighlightSubpageHeader.SubpageHeaderButton$lambda$8(searchHighlightSubpageData, z2, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubpageHeaderButton$lambda$7$lambda$6(Function1 function1, SearchHighlightSubpageData searchHighlightSubpageData) {
        function1.invoke(searchHighlightSubpageData);
        return Unit.INSTANCE;
    }
}
