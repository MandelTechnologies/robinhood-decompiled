package com.robinhood.android.advisory.dashboard.overview;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcher4;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryChartSwitcher.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.ComposableSingletons$AdvisoryChartSwitcherKt$lambda$303887508$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryChartSwitcher6 implements Function2<Composer, Integer, Unit> {
    public static final AdvisoryChartSwitcher6 INSTANCE = new AdvisoryChartSwitcher6();

    AdvisoryChartSwitcher6() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(303887508, i, -1, "com.robinhood.android.advisory.dashboard.overview.ComposableSingletons$AdvisoryChartSwitcherKt.lambda$303887508.<anonymous> (AdvisoryChartSwitcher.kt:326)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
        composer.endReplaceGroup();
        EnumEntries<AdvisoryChartSwitcher> entries = AdvisoryChartSwitcher.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        Iterator<AdvisoryChartSwitcher> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(new AdvisoryChartSwitcher4.Chart(it.next(), false, 2, null));
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
        int intValue = snapshotIntState2.getIntValue();
        composer.startReplaceGroup(5004770);
        Object objRememberedValue3 = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.ComposableSingletons$AdvisoryChartSwitcherKt$lambda$303887508$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdvisoryChartSwitcher6.invoke$lambda$11$lambda$8$lambda$7(snapshotIntState2, ((Integer) obj).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        AdvisoryChartSwitcher2.AdvisoryDashboardSwitcher(persistentList, intValue, (Function1) objRememberedValue3, null, false, composer, 384, 24);
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new AdvisoryChartSwitcher4.Value("%", "Allocation percentage"), new AdvisoryChartSwitcher4.Value("$", "Allocation value"));
        int intValue2 = snapshotIntState22.getIntValue();
        composer.startReplaceGroup(5004770);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.ComposableSingletons$AdvisoryChartSwitcherKt$lambda$303887508$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdvisoryChartSwitcher6.invoke$lambda$11$lambda$10$lambda$9(snapshotIntState22, ((Integer) obj).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Modifier.Companion companion4 = Modifier.INSTANCE;
        AdvisoryChartSwitcher2.AdvisoryDashboardSwitcher(immutableList3PersistentListOf, intValue2, (Function1) objRememberedValue4, PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), false, composer, 384, 16);
        Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$8$lambda$7(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10$lambda$9(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
        return Unit.INSTANCE;
    }
}
