package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import com.robinhood.android.chart.blackwidowadvancedchart.IntervalSelectorState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ScrollingIntervalSelector.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$ScrollingIntervalSelectorKt$lambda$1345199145$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ScrollingIntervalSelector2 implements Function2<Composer, Integer, Unit> {
    public static final ScrollingIntervalSelector2 INSTANCE = new ScrollingIntervalSelector2();

    ScrollingIntervalSelector2() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1345199145, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$ScrollingIntervalSelectorKt.lambda$1345199145.<anonymous> (ScrollingIntervalSelector.kt:257)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        IntervalSelectorState intervalSelectorState = new IntervalSelectorState(null, extensions2.persistentListOf(new IntervalDto("30 s", 0.0f, null, 6, null), new IntervalDto("1 min", 0.0f, null, 6, null), new IntervalDto("5 min", 0.0f, null, 6, null), new IntervalDto("10 min", 0.0f, null, 6, null)));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$ScrollingIntervalSelectorKt$lambda$1345199145$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ScrollingIntervalSelector2.invoke$lambda$8$lambda$1$lambda$0((IntervalDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$ScrollingIntervalSelectorKt$lambda$1345199145$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        ScrollingIntervalSelector3.ScrollingIntervalSelector(intervalSelectorState, function1, (Function0) objRememberedValue2, null, composer, 432, 8);
        IntervalSelectorState intervalSelectorState2 = new IntervalSelectorState(new IntervalDto("1 min", 0.0f, null, 6, null), extensions2.persistentListOf(new IntervalDto("30 s", 0.0f, null, 6, null), new IntervalDto("1 min", 0.0f, null, 6, null), new IntervalDto("5 min", 0.0f, null, 6, null), new IntervalDto("10 min", 0.0f, null, 6, null)));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$ScrollingIntervalSelectorKt$lambda$1345199145$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ScrollingIntervalSelector2.invoke$lambda$8$lambda$5$lambda$4((IntervalDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function12 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ComposableSingletons$ScrollingIntervalSelectorKt$lambda$1345199145$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        ScrollingIntervalSelector3.ScrollingIntervalSelector(intervalSelectorState2, function12, (Function0) objRememberedValue4, null, composer, 432, 8);
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
    public static final Unit invoke$lambda$8$lambda$1$lambda$0(IntervalDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$5$lambda$4(IntervalDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
