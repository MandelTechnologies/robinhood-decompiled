package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponentType;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherAllocationsData;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherPerformanceData;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestmentsTrackerSwitcher.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerSwitcherKt$lambda$579806403$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestmentsTrackerSwitcher3 implements Function2<Composer, Integer, Unit> {
    public static final InvestmentsTrackerSwitcher3 INSTANCE = new InvestmentsTrackerSwitcher3();

    InvestmentsTrackerSwitcher3() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Double dValueOf = Double.valueOf(-1.0d);
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(579806403, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerSwitcherKt.lambda$579806403.<anonymous> (InvestmentsTrackerSwitcher.kt:35)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m6727getWhite0d7_KjU(), null, 2, null);
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
        InvestmentsTrackerSwitcherPerformanceData investmentsTrackerSwitcherPerformanceData = new InvestmentsTrackerSwitcherPerformanceData(dValueOf, "$1,000.00", "Today", "last week");
        InvestmentsTrackerComponentType investmentsTrackerComponentType = InvestmentsTrackerComponentType.ALLOCATION_SWITCHER;
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel = new InvestmentsTrackerSwitcherViewModel(investmentsTrackerSwitcherPerformanceData, null, true, investmentsTrackerComponentType, "", new SecurityFilter(false));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerSwitcherKt$lambda$579806403$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerSwitcher3.invoke$lambda$6$lambda$1$lambda$0((InvestmentsTrackerNativeAction) obj, obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerSwitcher4.InvestmentsTrackerSwitcher(investmentsTrackerSwitcherViewModel, (Function2) objRememberedValue, null, composer, 48, 4);
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel2 = new InvestmentsTrackerSwitcherViewModel(new InvestmentsTrackerSwitcherPerformanceData(dValueOf, "$1,000.00", "Today", null), null, true, investmentsTrackerComponentType, "", new SecurityFilter(false));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerSwitcherKt$lambda$579806403$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerSwitcher3.invoke$lambda$6$lambda$3$lambda$2((InvestmentsTrackerNativeAction) obj, obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerSwitcher4.InvestmentsTrackerSwitcher(investmentsTrackerSwitcherViewModel2, (Function2) objRememberedValue2, null, composer, 48, 4);
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel3 = new InvestmentsTrackerSwitcherViewModel(null, new InvestmentsTrackerSwitcherAllocationsData("Asset class"), true, investmentsTrackerComponentType, "", new SecurityFilter(false));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerSwitcherKt$lambda$579806403$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerSwitcher3.invoke$lambda$6$lambda$5$lambda$4((InvestmentsTrackerNativeAction) obj, obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerSwitcher4.InvestmentsTrackerSwitcher(investmentsTrackerSwitcherViewModel3, (Function2) objRememberedValue3, null, composer, 48, 4);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$1$lambda$0(InvestmentsTrackerNativeAction investmentsTrackerNativeAction, Object obj) {
        Intrinsics.checkNotNullParameter(investmentsTrackerNativeAction, "<unused var>");
        Intrinsics.checkNotNullParameter(obj, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$3$lambda$2(InvestmentsTrackerNativeAction investmentsTrackerNativeAction, Object obj) {
        Intrinsics.checkNotNullParameter(investmentsTrackerNativeAction, "<unused var>");
        Intrinsics.checkNotNullParameter(obj, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(InvestmentsTrackerNativeAction investmentsTrackerNativeAction, Object obj) {
        Intrinsics.checkNotNullParameter(investmentsTrackerNativeAction, "<unused var>");
        Intrinsics.checkNotNullParameter(obj, "<unused var>");
        return Unit.INSTANCE;
    }
}
