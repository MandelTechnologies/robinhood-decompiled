package com.robinhood.android.blackwidow.p068ui.upsell;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExploreLegendUpsellComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ExploreLegendUpsellComposableKt$CarouselNavigation$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ boolean $leftButtonEnabled;
    final /* synthetic */ int $maxSize;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ boolean $rightButtonEnabled;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ int $selectedPageIndex;

    ExploreLegendUpsellComposableKt$CarouselNavigation$1$1(CoroutineScope coroutineScope, PagerState pagerState, int i, boolean z, int i2, boolean z2) {
        this.$scope = coroutineScope;
        this.$pagerState = pagerState;
        this.$selectedPageIndex = i;
        this.$leftButtonEnabled = z;
        this.$maxSize = i2;
        this.$rightButtonEnabled = z2;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1245169209, i, -1, "com.robinhood.android.blackwidow.ui.upsell.CarouselNavigation.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:924)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 5, null);
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        final CoroutineScope coroutineScope = this.$scope;
        final PagerState pagerState = this.$pagerState;
        final int i3 = this.$selectedPageIndex;
        boolean z = this.$leftButtonEnabled;
        final int i4 = this.$maxSize;
        boolean z2 = this.$rightButtonEnabled;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        final HapticFeedback hapticFeedback = (HapticFeedback) composer.consume(CompositionLocalsKt.getLocalHapticFeedback());
        BentoIconButton4.Icon.StandardSize16 standardSize16 = new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.CARET_LEFT_24);
        BentoIconButton4.Type type2 = BentoIconButton4.Type.Secondary;
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(hapticFeedback) | composer.changedInstance(coroutineScope) | composer.changed(pagerState) | composer.changed(i3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$CarouselNavigation$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ExploreLegendUpsellComposableKt$CarouselNavigation$1$1.invoke$lambda$4$lambda$1$lambda$0(hapticFeedback, coroutineScope, pagerState, i3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Color colorM6701boximpl = Color.m6701boximpl(jM21425getFg0d7_KjU);
        int i5 = BentoIconButton4.Icon.StandardSize16.$stable;
        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue, standardSize16, "Left", null, type2, z, null, null, colorM6701boximpl, null, false, composer, (i5 << 3) | 24960, 0, 1736);
        BentoIconButton4.Icon.StandardSize16 standardSize162 = new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.CARET_RIGHT_24);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance2 = composer.changedInstance(hapticFeedback) | composer.changedInstance(coroutineScope) | composer.changed(pagerState) | composer.changed(i3) | composer.changed(i4);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$CarouselNavigation$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ExploreLegendUpsellComposableKt$CarouselNavigation$1$1.invoke$lambda$4$lambda$3$lambda$2(hapticFeedback, coroutineScope, pagerState, i3, i4);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue2 = obj;
        }
        composer.endReplaceGroup();
        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue2, standardSize162, "Right", null, type2, z2, null, null, null, null, false, composer, (i5 << 3) | 24960, 0, 1992);
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
    public static final Unit invoke$lambda$4$lambda$1$lambda$0(HapticFeedback hapticFeedback, CoroutineScope coroutineScope, PagerState pagerState, int i) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ExploreLegendUpsellComposableKt$CarouselNavigation$1$1$1$1$1$1(pagerState, i, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(HapticFeedback hapticFeedback, CoroutineScope coroutineScope, PagerState pagerState, int i, int i2) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ExploreLegendUpsellComposableKt$CarouselNavigation$1$1$1$2$1$1(pagerState, i, i2, null), 3, null);
        return Unit.INSTANCE;
    }
}
