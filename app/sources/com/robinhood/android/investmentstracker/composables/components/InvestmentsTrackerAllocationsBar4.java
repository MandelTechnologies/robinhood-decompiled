package com.robinhood.android.investmentstracker.composables.components;

import android.annotation.SuppressLint;
import android.graphics.Color;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentAllocationsBarSectionDetailsDto;
import com.robinhood.android.designsystem.chart.BlockRegion;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAllocationsBarViewModel;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InvestmentsTrackerAllocationsBar.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00060\u0004\u001a;\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"InvestmentsTrackerAllocationsBarPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "toBlockRegions", "", "Lcom/robinhood/android/designsystem/chart/BlockRegion;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarSectionDetailsDto;", "InvestmentsTrackerAllocationsBar", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAllocationsBarViewModel;", "nativeActionHandler", "Lkotlin/Function2;", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerNativeAction;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAllocationsBarViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAllocationsBarKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerAllocationsBar4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerAllocationsBar$lambda$5(InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestmentsTrackerAllocationsBar(investmentsTrackerAllocationsBarViewModel, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerAllocationsBarPreview$lambda$0(int i, Composer composer, int i2) {
        InvestmentsTrackerAllocationsBarPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final void InvestmentsTrackerAllocationsBarPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1273370310);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1273370310, i, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAllocationsBarPreview (InvestmentsTrackerAllocationsBar.kt:21)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, InvestmentsTrackerAllocationsBar.INSTANCE.m15593getLambda$1539326450$feature_investments_tracker_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAllocationsBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerAllocationsBar4.InvestmentsTrackerAllocationsBarPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final List<BlockRegion> toBlockRegions(List<InvestmentsTrackerComponentAllocationsBarSectionDetailsDto> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<InvestmentsTrackerComponentAllocationsBarSectionDetailsDto> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (InvestmentsTrackerComponentAllocationsBarSectionDetailsDto investmentsTrackerComponentAllocationsBarSectionDetailsDto : list2) {
            arrayList.add(new BlockRegion(investmentsTrackerComponentAllocationsBarSectionDetailsDto.getId(), (float) investmentsTrackerComponentAllocationsBarSectionDetailsDto.getPercentage(), investmentsTrackerComponentAllocationsBarSectionDetailsDto.getId(), Integer.valueOf(Color.parseColor(investmentsTrackerComponentAllocationsBarSectionDetailsDto.getColor())), CollectionsKt.emptyList(), investmentsTrackerComponentAllocationsBarSectionDetailsDto.getId()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8 A[LOOP:0: B:47:0x00a2->B:49:0x00a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentsTrackerAllocationsBar(final InvestmentsTrackerAllocationsBarViewModel item, final Function2<? super InvestmentsTrackerNativeAction, Object, Unit> nativeActionHandler, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(nativeActionHandler, "nativeActionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(1705145451);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(nativeActionHandler) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1705145451, i3, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAllocationsBar (InvestmentsTrackerAllocationsBar.kt:82)");
                }
                List<InvestmentsTrackerComponentAllocationsBarSectionDetailsDto> sections = item.getDetails().getSections();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
                for (InvestmentsTrackerComponentAllocationsBarSectionDetailsDto investmentsTrackerComponentAllocationsBarSectionDetailsDto : sections) {
                    arrayList.add(new AllocationSection(investmentsTrackerComponentAllocationsBarSectionDetailsDto.getId(), (float) investmentsTrackerComponentAllocationsBarSectionDetailsDto.getPercentage(), Color2.Color(Color.parseColor(investmentsTrackerComponentAllocationsBarSectionDetailsDto.getColor())), null));
                }
                ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
                String activeId = item.getActiveId();
                long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 112) != 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAllocationsBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InvestmentsTrackerAllocationsBar4.InvestmentsTrackerAllocationsBar$lambda$4$lambda$3(nativeActionHandler, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AllocationBarKt.m15574AllocationsIsometricBarwC_cr3g(persistentList, activeId, jM21371getBg0d7_KjU, (Function1) objRememberedValue, modifier4, 0.0f, composerStartRestartGroup, (i3 << 6) & 57344, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAllocationsBarKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestmentsTrackerAllocationsBar4.InvestmentsTrackerAllocationsBar$lambda$5(item, nativeActionHandler, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            List<InvestmentsTrackerComponentAllocationsBarSectionDetailsDto> sections2 = item.getDetails().getSections();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections2, 10));
            while (r0.hasNext()) {
            }
            ImmutableList3 persistentList2 = extensions2.toPersistentList(arrayList2);
            String activeId2 = item.getActiveId();
            long jM21371getBg0d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 112) != 32) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAllocationsBarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestmentsTrackerAllocationsBar4.InvestmentsTrackerAllocationsBar$lambda$4$lambda$3(nativeActionHandler, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                AllocationBarKt.m15574AllocationsIsometricBarwC_cr3g(persistentList2, activeId2, jM21371getBg0d7_KjU2, (Function1) objRememberedValue, modifier4, 0.0f, composerStartRestartGroup, (i3 << 6) & 57344, 32);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerAllocationsBar$lambda$4$lambda$3(Function2 function2, String str) {
        function2.invoke(InvestmentsTrackerNativeAction.ALLOCATION_BAR_TOP_SELECTED, str);
        return Unit.INSTANCE;
    }
}
