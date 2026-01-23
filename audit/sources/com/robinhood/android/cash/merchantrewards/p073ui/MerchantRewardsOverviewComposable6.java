package com.robinhood.android.cash.merchantrewards.p073ui;

import android.content.res.Resources;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutModifier4;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: MerchantRewardsOverviewComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$1$1$3, reason: use source file name */
/* loaded from: classes7.dex */
final class MerchantRewardsOverviewComposable6 implements Function3<LazyGridItemScope, Composer, Integer, Unit> {
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ Function1<Instant, Unit> $onViewHistory;
    final /* synthetic */ MerchantRewardsOverviewViewState $state;

    /* JADX WARN: Multi-variable type inference failed */
    MerchantRewardsOverviewComposable6(float f, MerchantRewardsOverviewViewState merchantRewardsOverviewViewState, Function1<? super Instant, Unit> function1) {
        this.$edgePadding = f;
        this.$state = merchantRewardsOverviewViewState;
        this.$onViewHistory = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Placeable placeable, MeasureScope measureScope, float f, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, placeable, measureScope.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(f / 2)), 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(lazyGridItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyGridItemScope item, Composer composer, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1417804565, i, -1, "com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MerchantRewardsOverviewComposable.kt:89)");
        }
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$edgePadding);
        final float f = this.$edgePadding;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function3() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$1$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MerchantRewardsOverviewComposable6.invoke$lambda$2$lambda$1(f, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        MerchantRewardsOverviewComposable4.Header(LayoutModifier4.layout(modifierM5146paddingqDBjuR0$default, (Function3) objRememberedValue), this.$state, this.$onViewHistory, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult invoke$lambda$2$lambda$1(final float f, final MeasureScope layout, Measurable measurable, Constraints constraints) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(Constraints.m7967copyZbe2FdA$default(constraints.getValue(), 0, Constraints.m7975getMaxWidthimpl(constraints.getValue()) + layout.mo5010roundToPx0680j_4(f), 0, 0, 13, null));
        return MeasureScope.layout$default(layout, placeableMo7239measureBRTryo0.getWidth(), placeableMo7239measureBRTryo0.getHeight(), null, new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$1$1$3$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantRewardsOverviewComposable6.invoke$lambda$2$lambda$1$lambda$0(placeableMo7239measureBRTryo0, layout, f, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }
}
