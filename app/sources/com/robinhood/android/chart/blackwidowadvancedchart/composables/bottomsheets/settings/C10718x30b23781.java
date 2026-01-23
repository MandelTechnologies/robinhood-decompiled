package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.Updater;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingChartTypeDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingMultiSelectGroupDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingSectionDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingSelectionOptionDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartTypeDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartSetting;
import com.robinhood.android.chart.blackwidowadvancedchart.SettingsBottomSheetState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BottomSheet;
import com.robinhood.shared.security.deviceattestation.DeviceAttestationConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ChartSettingsBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt$lambda$101484589$1 */
/* loaded from: classes7.dex */
final class C10718x30b23781 implements Function2<Composer, Integer, Unit> {
    public static final C10718x30b23781 INSTANCE = new C10718x30b23781();

    C10718x30b23781() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(101484589, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt.lambda$101484589.<anonymous> (ChartSettingsBottomSheet.kt:163)");
        }
        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(300));
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5174width3ABfNKs);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        SettingsBottomSheetState settingsBottomSheetState = new SettingsBottomSheetState(extensions2.persistentListOf(new ChartSettingSectionDto("Chart type", (List<ChartSettingDto>) CollectionsKt.listOf(new ChartSettingDto(null, null, false, new ChartSettingDto.ValueDto.ChartType(new ChartSettingChartTypeDto(null, CollectionsKt.listOf((Object[]) new ChartTypeDto[]{new ChartTypeDto(null, "Candles", null, 5, null), new ChartTypeDto(null, "Line", null, 5, null), new ChartTypeDto(null, "Bars", null, 5, null)}), 1, null)), 7, null))), new ChartSettingSectionDto("Chart settings", (List<ChartSettingDto>) CollectionsKt.listOf((Object[]) new ChartSettingDto[]{new ChartSettingDto(null, "Y axis auto-scaling", false, new ChartSettingDto.ValueDto.BooleanValue(false), 5, null), new ChartSettingDto(null, "Show extended hours", false, new ChartSettingDto.ValueDto.BooleanValue(true), 5, null), new ChartSettingDto(null, "Trading session highlights", false, new ChartSettingDto.ValueDto.BooleanValue(true), 5, null)})), new ChartSettingSectionDto("Advanced", (List<ChartSettingDto>) CollectionsKt.listOf(new ChartSettingDto(null, "Fit-to-chart", true, new ChartSettingDto.ValueDto.MultiSelectGroup(new ChartSettingMultiSelectGroupDto("Fit-to-Chart", CollectionsKt.listOf((Object[]) new String[]{"Fit all indicators", "Fit all orders"}), CollectionsKt.listOf((Object[]) new ChartSettingSelectionOptionDto[]{new ChartSettingSelectionOptionDto("Fit all indicators", "Fit all indicators"), new ChartSettingSelectionOptionDto("Fit all orders", "Fit all orders"), new ChartSettingSelectionOptionDto("Fit all positions", "Fit all positions"), new ChartSettingSelectionOptionDto("Fit all comparisons", "Fit all comparisons")}))), 1, null)))));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt$lambda$101484589$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C10718x30b23781.invoke$lambda$6$lambda$1$lambda$0((BottomSheet) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt$lambda$101484589$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C10718x30b23781.invoke$lambda$6$lambda$3$lambda$2((SetChartSetting) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function12 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt$lambda$101484589$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C10718x30b23781.invoke$lambda$6$lambda$5$lambda$4(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        ChartSettingsBottomSheetKt.ChartSettingsBottomSheet(settingsBottomSheetState, null, DeviceAttestationConstants.DEVICE_ATTEST_VERSION, function1, function12, (Function1) objRememberedValue3, composer, 224688);
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
    public static final Unit invoke$lambda$6$lambda$1$lambda$0(BottomSheet it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$3$lambda$2(SetChartSetting it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(boolean z) {
        return Unit.INSTANCE;
    }
}
