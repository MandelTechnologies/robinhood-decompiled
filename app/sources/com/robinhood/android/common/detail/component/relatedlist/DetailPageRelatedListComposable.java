package com.robinhood.android.common.detail.component.relatedlist;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridCells2;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import coil.Coil;
import coil.ImageLoader;
import coil.compose.AsyncImage;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.detail.component.C11117R;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.lists.models.shared.p298db.SizedUrlHolder;
import com.robinhood.rosetta.eventlogging.Component;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.HttpUrl;

/* compiled from: DetailPageRelatedListComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a5\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a%\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0015\u001a\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u0006X\u008a\u0084\u0002"}, m3636d2 = {"DetailPageRelatedListComposable", "", "T", "", "duxo", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/detail/component/relatedlist/DetailPageRelatedListViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/udf/BaseDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChipPadding", "", "ChipBorder", "IconHeight", "RelatedListChipGrid", "chipList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CuratedListChip", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Lcom/robinhood/android/common/ui/CuratedListChipItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getRowCount", "chipCount", "feature-lib-detail-component_externalDebug", "viewState"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DetailPageRelatedListComposable {
    private static final int ChipBorder = 1;
    private static final int ChipPadding = 10;
    private static final int IconHeight = 24;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListChip$lambda$13(CuratedListChipItem curatedListChipItem, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CuratedListChip(curatedListChipItem, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailPageRelatedListComposable$lambda$3(BaseDuxo baseDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DetailPageRelatedListComposable(baseDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RelatedListChipGrid$lambda$7(ImmutableList immutableList, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RelatedListChipGrid(immutableList, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final int getRowCount(int i) {
        if (i < 3) {
            return 1;
        }
        return i < 6 ? 2 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void DetailPageRelatedListComposable(final BaseDuxo<T, DetailPageRelatedListViewState> duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1581568224);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(duxo) : composerStartRestartGroup.changedInstance(duxo) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1581568224, i3, -1, "com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListComposable (DetailPageRelatedListComposable.kt:50)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                if (DetailPageRelatedListComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowThisSection()) {
                    modifier3 = modifier4;
                } else {
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 1, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    modifier3 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11117R.string.detail_page_related_list_section_title, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    ImmutableList<CuratedListChipItem> relatedIndustryLists = DetailPageRelatedListComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getRelatedIndustryLists();
                    composerStartRestartGroup.startReplaceGroup(89923634);
                    if (relatedIndustryLists != null) {
                        composerStartRestartGroup.startReplaceGroup(89924302);
                        if (!relatedIndustryLists.isEmpty()) {
                            RelatedListChipGrid(relatedIndustryLists, null, composerStartRestartGroup, 0, 2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DetailPageRelatedListComposable.DetailPageRelatedListComposable$lambda$3(duxo, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup = composerStartRestartGroup;
            if (DetailPageRelatedListComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowThisSection()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RelatedListChipGrid(final ImmutableList<CuratedListChipItem> chipList, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chipList, "chipList");
        Composer composerStartRestartGroup = composer.startRestartGroup(-569550228);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chipList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-569550228, i3, -1, "com.robinhood.android.common.detail.component.relatedlist.RelatedListChipGrid (DetailPageRelatedListComposable.kt:80)");
                }
                int rowCount = getRowCount(chipList.size());
                int i5 = rowCount * 46;
                LazyStaggeredGridCells2.Fixed fixed = new LazyStaggeredGridCells2.Fixed(rowCount);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM());
                float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(i5)), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(chipList);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DetailPageRelatedListComposable.RelatedListChipGrid$lambda$6$lambda$5(chipList, (LazyStaggeredGridScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                LazyStaggeredGridDslKt.m5275LazyHorizontalStaggeredGrid121YqSk(fixed, modifierFillMaxWidth$default, null, paddingValuesM5137PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM5089spacedBy0680j_4, fM21593getSmallD9Ej5fM, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 0, 916);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DetailPageRelatedListComposable.RelatedListChipGrid$lambda$7(chipList, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int rowCount2 = getRowCount(chipList.size());
            int i52 = rowCount2 * 46;
            LazyStaggeredGridCells2.Fixed fixed2 = new LazyStaggeredGridCells2.Fixed(rowCount2);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default2 = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM());
            float fM21593getSmallD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(i52)), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(chipList);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DetailPageRelatedListComposable.RelatedListChipGrid$lambda$6$lambda$5(chipList, (LazyStaggeredGridScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                LazyStaggeredGridDslKt.m5275LazyHorizontalStaggeredGrid121YqSk(fixed2, modifierFillMaxWidth$default2, null, paddingValuesM5137PaddingValuesYgX7TsA$default2, false, horizontalOrVerticalM5089spacedBy0680j_42, fM21593getSmallD9Ej5fM2, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 0, 916);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final DetailPageRelatedListViewState DetailPageRelatedListComposable$lambda$0(SnapshotState4<DetailPageRelatedListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CuratedListChip(final CuratedListChipItem item, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Context context;
        final Navigator navigator;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChangedInstance;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        HttpUrl sizedUrl;
        URL url;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer composerStartRestartGroup = composer.startRestartGroup(910740956);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(item) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(910740956, i3, -1, "com.robinhood.android.common.detail.component.relatedlist.CuratedListChip (DetailPageRelatedListComposable.kt:105)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Modifier modifierClip = Clip.clip(modifier3, RoundedCornerShape2.getCircleShape());
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(modifierClip, fM7995constructorimpl, bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), RoundedCornerShape2.getCircleShape()), bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), RoundedCornerShape2.getCircleShape()), C2002Dp.m7995constructorimpl(10));
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int iM7479getButtono7Vup1c = Role.INSTANCE.m7479getButtono7Vup1c();
                IndicationNodeFactory indicationNodeFactoryM5624rippleH2RKhps$default = RippleKt.m5624rippleH2RKhps$default(false, C2002Dp.INSTANCE.m8003getInfinityD9Ej5fM(), 0L, 4, null);
                Role roleM7472boximpl = Role.m7472boximpl(iM7479getButtono7Vup1c);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(item) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DetailPageRelatedListComposable.CuratedListChip$lambda$11$lambda$10(item, navigator, context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifierM5142padding3ABfNKs, interactionSource3, indicationNodeFactoryM5624rippleH2RKhps$default, false, null, roleM7472boximpl, (Function0) objRememberedValue2, 12, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.LIST_CHIP, item.getDisplayName(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                SizedUrlHolder circleSizedUrlHolder = item.getCircleSizedUrlHolder();
                String string2 = (circleSizedUrlHolder != null || (sizedUrl = circleSizedUrlHolder.getSizedUrl(context)) == null || (url = sizedUrl.url()) == null) ? null : url.toString();
                String displayName = item.getDisplayName();
                ImageLoader imageLoader = Coil.imageLoader((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                ContentScale crop = ContentScale.INSTANCE.getCrop();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifier4 = modifier3;
                AsyncImage.m9101AsyncImageQgsmV_s(string2, displayName, imageLoader, Clip.clip(SizeKt.m5169size3ABfNKs(companion3, C2002Dp.m7995constructorimpl(24)), RoundedCornerShape2.getCircleShape()), null, null, null, crop, 0.0f, null, 0, false, null, composerStartRestartGroup, 12582912, 0, 8048);
                BentoText2.m20747BentoText38GnDrw(item.getDisplayName(), PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DetailPageRelatedListComposable.CuratedListChip$lambda$13(item, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierClip2 = Clip.clip(modifier3, RoundedCornerShape2.getCircleShape());
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(modifierClip2, fM7995constructorimpl2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), RoundedCornerShape2.getCircleShape()), bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), RoundedCornerShape2.getCircleShape()), C2002Dp.m7995constructorimpl(10));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int iM7479getButtono7Vup1c2 = Role.INSTANCE.m7479getButtono7Vup1c();
            IndicationNodeFactory indicationNodeFactoryM5624rippleH2RKhps$default2 = RippleKt.m5624rippleH2RKhps$default(false, C2002Dp.INSTANCE.m8003getInfinityD9Ej5fM(), 0L, 4, null);
            Role roleM7472boximpl2 = Role.m7472boximpl(iM7479getButtono7Vup1c2);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(item) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DetailPageRelatedListComposable.CuratedListChip$lambda$11$lambda$10(item, navigator, context);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifierM5142padding3ABfNKs2, interactionSource32, indicationNodeFactoryM5624rippleH2RKhps$default2, false, null, roleM7472boximpl2, (Function0) objRememberedValue2, 12, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(Component.ComponentType.LIST_CHIP, item.getDisplayName(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    SizedUrlHolder circleSizedUrlHolder2 = item.getCircleSizedUrlHolder();
                    if (circleSizedUrlHolder2 != null) {
                        String displayName2 = item.getDisplayName();
                        ImageLoader imageLoader2 = Coil.imageLoader((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                        ContentScale crop2 = ContentScale.INSTANCE.getCrop();
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifier42 = modifier3;
                        AsyncImage.m9101AsyncImageQgsmV_s(string2, displayName2, imageLoader2, Clip.clip(SizeKt.m5169size3ABfNKs(companion32, C2002Dp.m7995constructorimpl(24)), RoundedCornerShape2.getCircleShape()), null, null, null, crop2, 0.0f, null, 0, false, null, composerStartRestartGroup, 12582912, 0, 8048);
                        BentoText2.m20747BentoText38GnDrw(item.getDisplayName(), PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                        composer2 = composerStartRestartGroup;
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier42;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListChip$lambda$11$lambda$10(CuratedListChipItem curatedListChipItem, Navigator navigator, Context context) {
        FragmentKey fragmentKey = curatedListChipItem.getFragmentKey();
        if (fragmentKey != null) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, fragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RelatedListChipGrid$lambda$6$lambda$5(final ImmutableList immutableList, LazyStaggeredGridScope LazyHorizontalStaggeredGrid) {
        Intrinsics.checkNotNullParameter(LazyHorizontalStaggeredGrid, "$this$LazyHorizontalStaggeredGrid");
        LazyHorizontalStaggeredGrid.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListComposableKt$RelatedListChipGrid$lambda$6$lambda$5$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                immutableList.get(i);
                return null;
            }
        }, null, ComposableLambda3.composableLambdaInstance(-886456479, true, new Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.detail.component.relatedlist.DetailPageRelatedListComposableKt$RelatedListChipGrid$lambda$6$lambda$5$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-886456479, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:408)");
                }
                CuratedListChipItem curatedListChipItem = (CuratedListChipItem) immutableList.get(i);
                composer.startReplaceGroup(-263318698);
                DetailPageRelatedListComposable.CuratedListChip(curatedListChipItem, null, composer, 0, 2);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
