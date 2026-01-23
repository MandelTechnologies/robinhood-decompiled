package com.robinhood.android.investmentstracker.composables.components;

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
import bff_money_movement.service.p019v1.InvestmentsTrackerCategoryPercentageLinePositionDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerCategoryPercentageViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponentType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestmentsTrackerCategoryPercentage.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerCategoryPercentageKt$lambda$1407880995$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestmentsTrackerCategoryPercentage3 implements Function2<Composer, Integer, Unit> {
    public static final InvestmentsTrackerCategoryPercentage3 INSTANCE = new InvestmentsTrackerCategoryPercentage3();

    InvestmentsTrackerCategoryPercentage3() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$1$lambda$0(InvestmentsTrackerNativeAction investmentsTrackerNativeAction, Object obj) {
        Intrinsics.checkNotNullParameter(investmentsTrackerNativeAction, "<unused var>");
        Intrinsics.checkNotNullParameter(obj, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$3$lambda$2(InvestmentsTrackerNativeAction investmentsTrackerNativeAction, Object obj) {
        Intrinsics.checkNotNullParameter(investmentsTrackerNativeAction, "<unused var>");
        Intrinsics.checkNotNullParameter(obj, "<unused var>");
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Double dValueOf = Double.valueOf(0.45d);
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1407880995, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerCategoryPercentageKt.lambda$1407880995.<anonymous> (InvestmentsTrackerCategoryPercentage.kt:36)");
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
        InvestmentsTrackerComponentCategoryPercentageCellDetailsDto investmentsTrackerComponentCategoryPercentageCellDetailsDto = new InvestmentsTrackerComponentCategoryPercentageCellDetailsDto("Stocks", "5 accounts", null, 45.0d, "#34D399", "45%", null, null, null, null, 964, null);
        InvestmentsTrackerComponentType investmentsTrackerComponentType = InvestmentsTrackerComponentType.CATEGORY_PERCENTAGE;
        InvestmentsTrackerCategoryPercentageViewModel investmentsTrackerCategoryPercentageViewModel = new InvestmentsTrackerCategoryPercentageViewModel(investmentsTrackerComponentType, investmentsTrackerComponentCategoryPercentageCellDetailsDto, false, false, "", new SecurityFilter(false), 12, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerCategoryPercentageKt$lambda$1407880995$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerCategoryPercentage3.invoke$lambda$8$lambda$1$lambda$0((InvestmentsTrackerNativeAction) obj, obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerCategoryPercentage4.InvestmentsTrackerCategoryPercentage(investmentsTrackerCategoryPercentageViewModel, (Function2) objRememberedValue, null, composer, 48, 4);
        InvestmentsTrackerCategoryPercentageViewModel investmentsTrackerCategoryPercentageViewModel2 = new InvestmentsTrackerCategoryPercentageViewModel(investmentsTrackerComponentType, new InvestmentsTrackerComponentCategoryPercentageCellDetailsDto("Stocks", "5 accounts", null, 45.0d, "#34D399", "45%", null, null, null, null, 964, null), true, false, "", new SecurityFilter(false), 8, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerCategoryPercentageKt$lambda$1407880995$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerCategoryPercentage3.invoke$lambda$8$lambda$3$lambda$2((InvestmentsTrackerNativeAction) obj, obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerCategoryPercentage4.InvestmentsTrackerCategoryPercentage(investmentsTrackerCategoryPercentageViewModel2, (Function2) objRememberedValue2, null, composer, 48, 4);
        InvestmentsTrackerCategoryPercentageViewModel investmentsTrackerCategoryPercentageViewModel3 = new InvestmentsTrackerCategoryPercentageViewModel(investmentsTrackerComponentType, new InvestmentsTrackerComponentCategoryPercentageCellDetailsDto("Stocks", "5 accounts", null, 0.3d, "#34D399", "45%", null, null, InvestmentsTrackerCategoryPercentageLinePositionDto.LEFT, dValueOf, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, null), true, false, "", new SecurityFilter(false), 8, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerCategoryPercentageKt$lambda$1407880995$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerCategoryPercentage3.invoke$lambda$8$lambda$5$lambda$4((InvestmentsTrackerNativeAction) obj, obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerCategoryPercentage4.InvestmentsTrackerCategoryPercentage(investmentsTrackerCategoryPercentageViewModel3, (Function2) objRememberedValue3, null, composer, 48, 4);
        InvestmentsTrackerCategoryPercentageViewModel investmentsTrackerCategoryPercentageViewModel4 = new InvestmentsTrackerCategoryPercentageViewModel(investmentsTrackerComponentType, new InvestmentsTrackerComponentCategoryPercentageCellDetailsDto("Stocks", "5 accounts", null, 0.3d, "#34D399", "45%", null, null, InvestmentsTrackerCategoryPercentageLinePositionDto.RIGHT, dValueOf, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, null), true, false, "", new SecurityFilter(false), 8, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerCategoryPercentageKt$lambda$1407880995$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerCategoryPercentage3.invoke$lambda$8$lambda$7$lambda$6((InvestmentsTrackerNativeAction) obj, obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerCategoryPercentage4.InvestmentsTrackerCategoryPercentage(investmentsTrackerCategoryPercentageViewModel4, (Function2) objRememberedValue4, null, composer, 48, 4);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$5$lambda$4(InvestmentsTrackerNativeAction investmentsTrackerNativeAction, Object obj) {
        Intrinsics.checkNotNullParameter(investmentsTrackerNativeAction, "<unused var>");
        Intrinsics.checkNotNullParameter(obj, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$6(InvestmentsTrackerNativeAction investmentsTrackerNativeAction, Object obj) {
        Intrinsics.checkNotNullParameter(investmentsTrackerNativeAction, "<unused var>");
        Intrinsics.checkNotNullParameter(obj, "<unused var>");
        return Unit.INSTANCE;
    }
}
