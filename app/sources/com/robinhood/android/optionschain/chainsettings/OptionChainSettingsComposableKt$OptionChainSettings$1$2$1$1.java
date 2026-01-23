package com.robinhood.android.optionschain.chainsettings;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainSettingsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
final class OptionChainSettingsComposableKt$OptionChainSettings$1$2$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $onToggleSideBySideChain;
    final /* synthetic */ SnapshotFloatState2 $overlayStartY$delegate;
    final /* synthetic */ SnapshotState<C2002Dp> $sbsNewTagHeightDp$delegate;
    final /* synthetic */ Function0<Unit> $switchToSbsTooltipOnAppear;
    final /* synthetic */ Function0<Unit> $switchToSbsTooltipOnClick;
    final /* synthetic */ OptionChainSettingsViewState $viewState;

    /* JADX WARN: Multi-variable type inference failed */
    OptionChainSettingsComposableKt$OptionChainSettings$1$2$1$1(SnapshotFloatState2 snapshotFloatState2, OptionChainSettingsViewState optionChainSettingsViewState, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Boolean, Unit> function1, SnapshotState<C2002Dp> snapshotState) {
        this.$overlayStartY$delegate = snapshotFloatState2;
        this.$viewState = optionChainSettingsViewState;
        this.$switchToSbsTooltipOnClick = function0;
        this.$switchToSbsTooltipOnAppear = function02;
        this.$onToggleSideBySideChain = function1;
        this.$sbsNewTagHeightDp$delegate = snapshotState;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-446320672, i, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettings.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionChainSettingsComposable.kt:128)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(5004770);
        final SnapshotFloatState2 snapshotFloatState2 = this.$overlayStartY$delegate;
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$OptionChainSettings$1$2$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainSettingsComposableKt$OptionChainSettings$1$2$1$1.invoke$lambda$1$lambda$0(snapshotFloatState2, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue);
        OptionChainSettingsViewState optionChainSettingsViewState = this.$viewState;
        Function0<Unit> function0 = this.$switchToSbsTooltipOnClick;
        Function0<Unit> function02 = this.$switchToSbsTooltipOnAppear;
        Function1<Boolean, Unit> function1 = this.$onToggleSideBySideChain;
        final SnapshotState<C2002Dp> snapshotState = this.$sbsNewTagHeightDp$delegate;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierOnGloballyPositioned);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        boolean showSbsNewTag = optionChainSettingsViewState.getShowSbsNewTag();
        float fOptionChainSettings$lambda$4 = OptionChainSettingsComposableKt.OptionChainSettings$lambda$4(snapshotState);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$OptionChainSettings$1$2$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainSettingsComposableKt$OptionChainSettings$1$2$1$1.invoke$lambda$4$lambda$3$lambda$2(snapshotState, (C2002Dp) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        OptionChainSettingsComposableKt.m17189DisplaySettingsSectionHYR8e34(optionChainSettingsViewState, function0, function02, function1, showSbsNewTag, fOptionChainSettings$lambda$4, (Function1) objRememberedValue2, composer, 1572864);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), 0.0f, composer, 0, 4);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotFloatState2 snapshotFloatState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotFloatState2.setFloatValue(LayoutCoordinates2.boundsInWindow(coordinates).getBottom());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(SnapshotState snapshotState, C2002Dp c2002Dp) {
        OptionChainSettingsComposableKt.OptionChainSettings$lambda$5(snapshotState, c2002Dp.getValue());
        return Unit.INSTANCE;
    }
}
