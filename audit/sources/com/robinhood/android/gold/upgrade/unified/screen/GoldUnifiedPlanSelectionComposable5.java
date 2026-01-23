package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.selection.SelectableGroup;
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
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.GoldPlanSelectionOption;
import gold_flow.proto.p466v1.StreamPlanSelectionContentResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldUnifiedPlanSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$Loaded$1$3, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldUnifiedPlanSelectionComposable5 implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ Function1<Action, Unit> $onAction;
    final /* synthetic */ StreamPlanSelectionContentResponse $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    GoldUnifiedPlanSelectionComposable5(StreamPlanSelectionContentResponse streamPlanSelectionContentResponse, Function1<? super Action, Unit> function1) {
        this.$this_with = streamPlanSelectionContentResponse;
        this.$onAction = function1;
    }

    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
        Modifier.Companion companion;
        StreamPlanSelectionContentResponse streamPlanSelectionContentResponse;
        Arrangement arrangement;
        BentoTheme bentoTheme;
        int i2;
        Function1<Action, Unit> function1;
        int i3;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        int i4 = (i & 6) == 0 ? i | (composer2.changed(paddingValues) ? 4 : 2) : i;
        if ((i4 & 19) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(103846406, i4, -1, "com.robinhood.android.gold.upgrade.unified.screen.Loaded.<anonymous>.<anonymous> (GoldUnifiedPlanSelectionComposable.kt:124)");
        }
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(companion2, paddingValues), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
        int i5 = BentoTheme.$stable;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierVerticalScroll$default, bentoTheme2.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), composer2, 0, 0);
        StreamPlanSelectionContentResponse streamPlanSelectionContentResponse2 = this.$this_with;
        Function1<Action, Unit> function12 = this.$onAction;
        Arrangement arrangement2 = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement2.getTop();
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        Alignment.Horizontal centerHorizontally = Intrinsics.areEqual(streamPlanSelectionContentResponse2.getIs_header_centered(), Boolean.TRUE) ? companion3.getCenterHorizontally() : companion3.getStart();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally, composer2, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor2);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
        String title = streamPlanSelectionContentResponse2.getTitle();
        composer2.startReplaceGroup(-1091038316);
        if (title == null) {
            companion = companion2;
            bentoTheme = bentoTheme2;
            i2 = i5;
            streamPlanSelectionContentResponse = streamPlanSelectionContentResponse2;
            function1 = function12;
            arrangement = arrangement2;
        } else {
            companion = companion2;
            streamPlanSelectionContentResponse = streamPlanSelectionContentResponse2;
            arrangement = arrangement2;
            bentoTheme = bentoTheme2;
            i2 = i5;
            function1 = function12;
            BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i5).getDisplayCapsuleMedium(), composer2, 0, 0, 8190);
            Unit unit = Unit.INSTANCE;
        }
        composer2.endReplaceGroup();
        String subtitle = streamPlanSelectionContentResponse.getSubtitle();
        composer2.startReplaceGroup(-1091030357);
        if (subtitle == null) {
            i3 = i2;
        } else {
            int i6 = i2;
            i3 = i6;
            BentoText2.m20747BentoText38GnDrw(subtitle, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 0, 0, 8190);
            Unit unit2 = Unit.INSTANCE;
        }
        composer2.endReplaceGroup();
        composer2.endNode();
        int i7 = i3;
        Modifier.Companion companion5 = companion;
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM()), composer2, 0);
        Modifier modifierSelectableGroup = SelectableGroup.selectableGroup(companion5);
        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM()), companion3.getStart(), composer2, 0);
        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierSelectableGroup);
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor3);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
        composer2.startReplaceGroup(-1723201372);
        for (final GoldPlanSelectionOption goldPlanSelectionOption : streamPlanSelectionContentResponse.getPlans()) {
            composer2.startReplaceGroup(-1633490746);
            final Function1<Action, Unit> function13 = function1;
            boolean zChanged = composer2.changed(function13) | composer2.changedInstance(goldPlanSelectionOption);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposableKt$Loaded$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldUnifiedPlanSelectionComposable5.invoke$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(function13, goldPlanSelectionOption);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            GoldUnifiedPlanSelectionComposable.PlanOption(goldPlanSelectionOption, (Function0) objRememberedValue, null, composer2, 0, 4);
            composer2 = composer;
            function1 = function13;
        }
        composer.endReplaceGroup();
        composer.endNode();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(Function1 function1, GoldPlanSelectionOption goldPlanSelectionOption) {
        function1.invoke(goldPlanSelectionOption.getOn_select_action());
        return Unit.INSTANCE;
    }
}
