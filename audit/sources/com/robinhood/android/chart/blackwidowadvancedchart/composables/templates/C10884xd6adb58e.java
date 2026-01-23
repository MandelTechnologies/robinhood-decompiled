package com.robinhood.android.chart.blackwidowadvancedchart.composables.templates;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SelectTemplateBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt$lambda$-367486715$1 */
/* loaded from: classes7.dex */
final class C10884xd6adb58e implements Function2<Composer, Integer, Unit> {
    public static final C10884xd6adb58e INSTANCE = new C10884xd6adb58e();

    C10884xd6adb58e() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-367486715, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt.lambda$-367486715.<anonymous> (SelectTemplateBottomSheet.kt:169)");
        }
        TemplateDto templateDto = new TemplateDto(Constants.SdidMigrationStatusCodes.ALREADY_SDID, CollectionsKt.listOf((Object[]) new IndicatorStateDto[]{new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, "BB", null, null, null, null, null, null, null, null, null, null, "(-2,2)", null, null, 14679039, null), new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, "EMA", null, null, null, null, null, null, null, null, null, null, "(50)", null, null, 14679039, null), new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, "BB", null, null, null, null, null, null, null, null, null, null, "(-2,2)", null, null, 14679039, null), new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, "BB", null, null, null, null, null, null, null, null, null, null, "(-2,2)", null, null, 14679039, null), new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, "BB", null, null, null, null, null, null, null, null, null, null, "(-2,2)", null, null, 14679039, null)}), "Momentum trading");
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new TemplateDto(Constants.SdidMigrationStatusCodes.ALREADY_SDID, CollectionsKt.listOf((Object[]) new IndicatorStateDto[]{new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, "BB", null, null, null, null, null, null, null, null, null, null, "(-2,2)", null, null, 14679039, null), new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, "EMA", null, null, null, null, null, null, null, null, null, null, "(50)", null, null, 14679039, null), new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, "BB", null, null, null, null, null, null, null, null, null, null, "(-2,2)", null, null, 14679039, null), new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, "BB", null, null, null, null, null, null, null, null, null, null, "(-2,2)", null, null, 14679039, null), new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, "BB", null, null, null, null, null, null, null, null, null, null, "(-2,2)", null, null, 14679039, null)}), "Momentum trading"), new TemplateDto(null, CollectionsKt.listOf((Object[]) new IndicatorStateDto[]{new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, "RSI", null, null, null, null, null, null, null, null, null, null, null, null, null, 16776191, null), new IndicatorStateDto(null, false, false, null, null, null, null, null, false, null, "EMA", null, null, null, null, null, null, null, null, null, null, "(50)", null, null, 14679039, null)}), "Swing trading", 1, null));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt$lambda$-367486715$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C10884xd6adb58e.invoke$lambda$1$lambda$0((TemplateDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt$lambda$-367486715$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C10884xd6adb58e.invoke$lambda$3$lambda$2((TemplateDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function12 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt$lambda$-367486715$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C10884xd6adb58e.invoke$lambda$5$lambda$4((TemplateDto) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function13 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt$lambda$-367486715$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function0 function0 = (Function0) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt$lambda$-367486715$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        SelectTemplateBottomSheetKt.SelectTemplateBottomSheet(templateDto, immutableList3PersistentListOf, function1, function12, function13, function0, (Function0) objRememberedValue5, null, composer, 1797504, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TemplateDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(TemplateDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(TemplateDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
