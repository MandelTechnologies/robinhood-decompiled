package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

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
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingSelectionOptionDto;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MultiSelectGroup.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$MultiSelectGroupKt$lambda$1170729441$1, reason: use source file name */
/* loaded from: classes7.dex */
final class MultiSelectGroup3 implements Function2<Composer, Integer, Unit> {
    public static final MultiSelectGroup3 INSTANCE = new MultiSelectGroup3();

    MultiSelectGroup3() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$1$lambda$0(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$3$lambda$2(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1170729441, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$MultiSelectGroupKt.lambda$1170729441.<anonymous> (MultiSelectGroup.kt:66)");
        }
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM());
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 0);
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
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf("Option 1", "Option 3");
        ImmutableList3 immutableList3PersistentListOf2 = extensions2.persistentListOf(new ChartSettingSelectionOptionDto("Option 1", "Option 1"), new ChartSettingSelectionOptionDto("Option 2", "Option 2"), new ChartSettingSelectionOptionDto("Option 3", "Option 3"), new ChartSettingSelectionOptionDto("Option 4", "Option 4"));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$MultiSelectGroupKt$lambda$1170729441$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiSelectGroup3.invoke$lambda$6$lambda$1$lambda$0((String) obj, ((Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        MultiSelectGroup4.MultiSelectGroup("MultiSelect group enabled", immutableList3PersistentListOf, immutableList3PersistentListOf2, true, (Function2) objRememberedValue, composer, 27702);
        ImmutableList3 immutableList3PersistentListOf3 = extensions2.persistentListOf("Option 1", "Option 3");
        ImmutableList3 immutableList3PersistentListOf4 = extensions2.persistentListOf(new ChartSettingSelectionOptionDto("Option 1", "Option 1"), new ChartSettingSelectionOptionDto("Option 2", "Option 2"), new ChartSettingSelectionOptionDto("Option 3", "Option 3"), new ChartSettingSelectionOptionDto("Option 4", "Option 4"));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$MultiSelectGroupKt$lambda$1170729441$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiSelectGroup3.invoke$lambda$6$lambda$3$lambda$2((String) obj, ((Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        MultiSelectGroup4.MultiSelectGroup("MultiSelect group disabled", immutableList3PersistentListOf3, immutableList3PersistentListOf4, false, (Function2) objRememberedValue2, composer, 27702);
        ImmutableList3 immutableList3PersistentListOf5 = extensions2.persistentListOf("Option 1", "Option 3");
        ImmutableList3 immutableList3PersistentListOf6 = extensions2.persistentListOf(new ChartSettingSelectionOptionDto("Option 1", "Option 1"), new ChartSettingSelectionOptionDto("Option 2", "Option 2"), new ChartSettingSelectionOptionDto("Option 3", "Option 3"), new ChartSettingSelectionOptionDto("Option 4", "Option 4"));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$MultiSelectGroupKt$lambda$1170729441$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiSelectGroup3.invoke$lambda$6$lambda$5$lambda$4((String) obj, ((Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        MultiSelectGroup4.MultiSelectGroup("", immutableList3PersistentListOf5, immutableList3PersistentListOf6, false, (Function2) objRememberedValue3, composer, 27702);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }
}
