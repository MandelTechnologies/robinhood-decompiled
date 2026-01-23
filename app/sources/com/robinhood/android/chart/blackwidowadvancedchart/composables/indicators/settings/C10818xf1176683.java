package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EditIndicatorLineAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EditIndicatorParameterAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorLineDisplayTypeDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorLineDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParamValidationDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterTypeDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterValueDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.LineColorDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: IndicatorSettingsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt$lambda$1782221732$1 */
/* loaded from: classes7.dex */
final class C10818xf1176683 implements Function2<Composer, Integer, Unit> {
    public static final C10818xf1176683 INSTANCE = new C10818xf1176683();

    C10818xf1176683() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Double dValueOf = Double.valueOf(1000.0d);
        Double dValueOf2 = Double.valueOf(1.0d);
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1782221732, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt.lambda$1782221732.<anonymous> (IndicatorSettingsScreen.kt:503)");
        }
        ColorDto colorDto = ColorDto.COLOR_COSMONAUT_LIGHT;
        List listListOf = CollectionsKt.listOf(new LineColorDto(new ThemedColorDto(colorDto, colorDto), null, null, null, 14, null));
        IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto = new IndicatorLineDisplayTypeDto(null, "Line", null, 5, null);
        List listListOf2 = CollectionsKt.listOf((Object[]) new IndicatorLineDisplayTypeDto[]{new IndicatorLineDisplayTypeDto(null, "Line", null, 5, null), new IndicatorLineDisplayTypeDto(null, "Dashed", null, 5, null)});
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        IndicatorStateDto indicatorStateDto = new IndicatorStateDto(null, false, false, null, null, null, "Moving average convergence/divergence", "Measures volatility and price trends using upper and lower bands around a moving average, expanding in high volatility and contracting in low.", false, null, null, null, null, null, null, CollectionsKt.listOf((Object[]) new IndicatorParameterDto[]{new IndicatorParameterDto("Fast Length", IndicatorParameterTypeDto.INDICATOR_PARAMETER_TYPE_INTEGER_RANGE, new IndicatorParameterValueDto(new IndicatorParameterValueDto.ValueDto.NumberValue(1.0d)), null, null, new IndicatorParamValidationDto(dValueOf2, dValueOf, Double.valueOf(0.0d), null, 8, null), null, null, "Fast Length", null, 728, null), new IndicatorParameterDto("Kinda fast length", IndicatorParameterTypeDto.INDICATOR_PARAMETER_TYPE_DOUBLE_RANGE, new IndicatorParameterValueDto(new IndicatorParameterValueDto.ValueDto.NumberValue(-2.5d)), null, null, new IndicatorParamValidationDto(dValueOf2, dValueOf, dValueOf2, null, 8, null), null, null, "Kinda fast length", null, 728, null), new IndicatorParameterDto("Show latest only", null, new IndicatorParameterValueDto(new IndicatorParameterValueDto.ValueDto.BoolValue(false)), null, null, new IndicatorParamValidationDto(dValueOf2, dValueOf, dValueOf2, null, 8, null), null, null, "Show latest only", null, 730, null)}), CollectionsKt.listOf((Object[]) new IndicatorLineDto[]{new IndicatorLineDto("Lower", null, null, bool, null, 1, listListOf, bool2, null, null, null, null, null, false, true, null, null, null, null, null, false, indicatorLineDisplayTypeDto, listListOf2, null, 10469142, null), new IndicatorLineDto("Lower without thickness", null, null, bool2, null, null, CollectionsKt.listOf(new LineColorDto(new ThemedColorDto(colorDto, colorDto), null, null, null, 14, null)), bool2, null, null, null, null, null, false, true, null, null, null, null, null, false, new IndicatorLineDisplayTypeDto(null, "Line", null, 5, null), CollectionsKt.listOf((Object[]) new IndicatorLineDisplayTypeDto[]{new IndicatorLineDisplayTypeDto(null, "Line", null, 5, null), new IndicatorLineDisplayTypeDto(null, "Dashed", null, 5, null)}), null, 10469142, null), new IndicatorLineDto("Lower without display type", null, null, bool, null, 1, CollectionsKt.listOf(new LineColorDto(new ThemedColorDto(colorDto, colorDto), null, null, null, 14, null)), bool2, null, null, null, null, null, false, true, null, null, null, null, null, false, null, null, null, 16760598, null), new IndicatorLineDto("Lower disabled", null, null, bool, null, 1, CollectionsKt.listOf(new LineColorDto(new ThemedColorDto(colorDto, colorDto), null, null, null, 14, null)), bool, null, null, null, null, null, false, true, null, null, null, null, null, false, null, null, null, 16760598, null)}), null, null, null, null, null, null, null, 16678719, null);
        ArrayList arrayList = new ArrayList(30);
        for (int i2 = 0; i2 < 30; i2++) {
            arrayList.add(new ThemedColorDto(ColorDto.COLOR_UV_DARK, ColorDto.COLOR_UV_LIGHT));
        }
        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt$lambda$1782221732$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt$lambda$1782221732$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C10818xf1176683.invoke$lambda$4$lambda$3((IndicatorStateDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function1 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt$lambda$1782221732$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C10818xf1176683.invoke$lambda$6$lambda$5((String) obj, (EditIndicatorParameterAction) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function2 function2 = (Function2) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt$lambda$1782221732$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C10818xf1176683.invoke$lambda$8$lambda$7((String) obj, (EditIndicatorLineAction) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function2 function22 = (Function2) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt$lambda$1782221732$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C10818xf1176683.invoke$lambda$10$lambda$9((String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        IndicatorSettingsScreenKt.IndicatorSettingsScreen(indicatorStateDto, immutableList, function0, function1, function2, function22, (Function1) objRememberedValue5, null, composer, 1797504, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(IndicatorStateDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(String str, EditIndicatorParameterAction editIndicatorParameterAction) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(editIndicatorParameterAction, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(String str, EditIndicatorLineAction editIndicatorLineAction) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(editIndicatorLineAction, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
