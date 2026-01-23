package com.robinhood.android.event.detail.contractselector;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import com.robinhood.android.cortex.digest.common.LocalClock;
import com.robinhood.android.cortex.digest.common.LocalClock3;
import com.robinhood.android.event.detail.builders.ContractSelectorRowTreatmentViewState;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.animation.Delta;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: ContractSelectorCenterAlignedVariant.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.contractselector.ComposableSingletons$ContractSelectorCenterAlignedVariantKt$lambda$-1739203970$1 */
/* loaded from: classes3.dex */
final class C16122x64e79eeb implements Function2<Composer, Integer, Unit> {
    public static final C16122x64e79eeb INSTANCE = new C16122x64e79eeb();

    C16122x64e79eeb() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1739203970, i, -1, "com.robinhood.android.event.detail.contractselector.ComposableSingletons$ContractSelectorCenterAlignedVariantKt.lambda$-1739203970.<anonymous> (ContractSelectorCenterAlignedVariant.kt:168)");
        }
        Clock current = LocalClock3.getLocalClock().getCurrent(composer, LocalClock.$stable);
        ContractSelectorButton2 contractSelectorButton2 = ContractSelectorButton2.YES;
        StringResource.Companion companion = StringResource.INSTANCE;
        ContractSelectorButtonViewState contractSelectorButtonViewState = new ContractSelectorButtonViewState(contractSelectorButton2, companion.invoke("Yes 94¢"), new ContractSelectorButtonViewState.PositionState.WithoutPosition(null), "", false, false, 48, null);
        ContractSelectorButtonViewState contractSelectorButtonViewState2 = new ContractSelectorButtonViewState(ContractSelectorButton2.f4140NO, companion.invoke("No 6¢"), new ContractSelectorButtonViewState.PositionState.WithoutPosition(null), "", false, false, 48, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        DayNightColor dayNightColor = new DayNightColor(bentoTheme.getColors(composer, i2).getHydroLight(), bentoTheme.getColors(composer, i2).getHydroDark(), null);
        Delta delta = new Delta(2, null, 2, null);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewState = new ContractSelectorRowTreatmentViewState(uuidRandomUUID, "O. Piastri", "2,642,040", dayNightColor, delta, contractSelectorButtonViewState2, contractSelectorButtonViewState);
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
        Instant instantNow = Instant.now(current);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ComposableSingletons$ContractSelectorCenterAlignedVariantKt$lambda$-1739203970$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16122x64e79eeb.invoke$lambda$12$lambda$1$lambda$0((ContractSelectorButtonViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ContractSelectorCenterAlignedVariantKt.ContractSelectorCenterAlignedVariant(contractSelectorRowTreatmentViewState, instantNow, null, (Function2) objRememberedValue, composer, 3072, 4);
        ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewStateCopy$default = ContractSelectorRowTreatmentViewState.copy$default(contractSelectorRowTreatmentViewState, null, "M. Verstappen", "1,530,890", new DayNightColor(bentoTheme.getColors(composer, i2).getBiomeLight(), bentoTheme.getColors(composer, i2).getBiomeDark(), null), new Delta(-2, null, 2, null), null, null, 97, null);
        Instant instantNow2 = Instant.now(current);
        Intrinsics.checkNotNullExpressionValue(instantNow2, "now(...)");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ComposableSingletons$ContractSelectorCenterAlignedVariantKt$lambda$-1739203970$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16122x64e79eeb.invoke$lambda$12$lambda$3$lambda$2((ContractSelectorButtonViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        ContractSelectorCenterAlignedVariantKt.ContractSelectorCenterAlignedVariant(contractSelectorRowTreatmentViewStateCopy$default, instantNow2, null, (Function2) objRememberedValue2, composer, 3072, 4);
        ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewStateCopy$default2 = ContractSelectorRowTreatmentViewState.copy$default(contractSelectorRowTreatmentViewState, null, null, null, null, null, ContractSelectorButtonViewState.copy$default(contractSelectorButtonViewState2, null, companion.invoke("7¢"), null, null, false, false, 61, null), ContractSelectorButtonViewState.copy$default(contractSelectorButtonViewState, null, companion.invoke("93¢"), null, null, false, false, 61, null), 31, null);
        Instant instantNow3 = Instant.now(current);
        Intrinsics.checkNotNullExpressionValue(instantNow3, "now(...)");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ComposableSingletons$ContractSelectorCenterAlignedVariantKt$lambda$-1739203970$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16122x64e79eeb.invoke$lambda$12$lambda$5$lambda$4((ContractSelectorButtonViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        ContractSelectorCenterAlignedVariantKt.ContractSelectorCenterAlignedVariant(contractSelectorRowTreatmentViewStateCopy$default2, instantNow3, null, (Function2) objRememberedValue3, composer, 3072, 4);
        ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewStateCopy$default3 = ContractSelectorRowTreatmentViewState.copy$default(contractSelectorRowTreatmentViewState, null, "This is some long name to test overflow stuff", null, null, null, null, null, 125, null);
        Instant instantNow4 = Instant.now(current);
        Intrinsics.checkNotNullExpressionValue(instantNow4, "now(...)");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ComposableSingletons$ContractSelectorCenterAlignedVariantKt$lambda$-1739203970$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16122x64e79eeb.invoke$lambda$12$lambda$7$lambda$6((ContractSelectorButtonViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        ContractSelectorCenterAlignedVariantKt.ContractSelectorCenterAlignedVariant(contractSelectorRowTreatmentViewStateCopy$default3, instantNow4, null, (Function2) objRememberedValue4, composer, 3072, 4);
        ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewStateCopy$default4 = ContractSelectorRowTreatmentViewState.copy$default(contractSelectorRowTreatmentViewState, null, null, null, null, null, null, null, 119, null);
        Instant instantNow5 = Instant.now(current);
        Intrinsics.checkNotNullExpressionValue(instantNow5, "now(...)");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion3.getEmpty()) {
            objRememberedValue5 = new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ComposableSingletons$ContractSelectorCenterAlignedVariantKt$lambda$-1739203970$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16122x64e79eeb.invoke$lambda$12$lambda$9$lambda$8((ContractSelectorButtonViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        ContractSelectorCenterAlignedVariantKt.ContractSelectorCenterAlignedVariant(contractSelectorRowTreatmentViewStateCopy$default4, instantNow5, null, (Function2) objRememberedValue5, composer, 3072, 4);
        ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewStateCopy$default5 = ContractSelectorRowTreatmentViewState.copy$default(contractSelectorRowTreatmentViewState, null, null, null, null, null, null, null, 107, null);
        Instant instantNow6 = Instant.now(current);
        Intrinsics.checkNotNullExpressionValue(instantNow6, "now(...)");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion3.getEmpty()) {
            objRememberedValue6 = new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ComposableSingletons$ContractSelectorCenterAlignedVariantKt$lambda$-1739203970$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16122x64e79eeb.invoke$lambda$12$lambda$11$lambda$10((ContractSelectorButtonViewState) obj, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        ContractSelectorCenterAlignedVariantKt.ContractSelectorCenterAlignedVariant(contractSelectorRowTreatmentViewStateCopy$default5, instantNow6, null, (Function2) objRememberedValue6, composer, 3072, 4);
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
    public static final Unit invoke$lambda$12$lambda$1$lambda$0(ContractSelectorButtonViewState contractSelectorButtonViewState, int i) {
        Intrinsics.checkNotNullParameter(contractSelectorButtonViewState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$3$lambda$2(ContractSelectorButtonViewState contractSelectorButtonViewState, int i) {
        Intrinsics.checkNotNullParameter(contractSelectorButtonViewState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$5$lambda$4(ContractSelectorButtonViewState contractSelectorButtonViewState, int i) {
        Intrinsics.checkNotNullParameter(contractSelectorButtonViewState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$7$lambda$6(ContractSelectorButtonViewState contractSelectorButtonViewState, int i) {
        Intrinsics.checkNotNullParameter(contractSelectorButtonViewState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$9$lambda$8(ContractSelectorButtonViewState contractSelectorButtonViewState, int i) {
        Intrinsics.checkNotNullParameter(contractSelectorButtonViewState, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10(ContractSelectorButtonViewState contractSelectorButtonViewState, int i) {
        Intrinsics.checkNotNullParameter(contractSelectorButtonViewState, "<unused var>");
        return Unit.INSTANCE;
    }
}
