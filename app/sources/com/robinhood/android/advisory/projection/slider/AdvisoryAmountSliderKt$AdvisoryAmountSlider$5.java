package com.robinhood.android.advisory.projection.slider;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvisoryAmountSlider.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class AdvisoryAmountSliderKt$AdvisoryAmountSlider$5 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $alreadyAligned$delegate;
    final /* synthetic */ ImmutableList<Money> $amountList;
    final /* synthetic */ SnapshotState4<Money> $currentAmount$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ float $spacing;

    AdvisoryAmountSliderKt$AdvisoryAmountSlider$5(LazyListState lazyListState, ImmutableList<Money> immutableList, SnapshotState4<Money> snapshotState4, float f, SnapshotState<Boolean> snapshotState) {
        this.$listState = lazyListState;
        this.$amountList = immutableList;
        this.$currentAmount$delegate = snapshotState4;
        this.$spacing = f;
        this.$alreadyAligned$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
        invoke(boxWithConstraints4, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(final ImmutableList immutableList, final float f, final float f2, final SnapshotState4 snapshotState4, final SnapshotState snapshotState, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.item$default(LazyRow, null, null, ComposableLambda3.composableLambdaInstance(1753711879, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$5$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1753711879, i, -1, "com.robinhood.android.advisory.projection.slider.AdvisoryAmountSlider.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryAmountSlider.kt:139)");
                }
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.items$default(LazyRow, immutableList.size(), null, null, ComposableLambda3.composableLambdaInstance(762317406, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$5$1$1$2
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 48) == 0) {
                    i2 |= composer.changed(i) ? 32 : 16;
                }
                if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(762317406, i2, -1, "com.robinhood.android.advisory.projection.slider.AdvisoryAmountSlider.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryAmountSlider.kt:146)");
                }
                ImmutableList<Money> immutableList2 = immutableList;
                AdvisoryAmountSliderKt.m11235TickSetQ1bl1hc(f2, null, AdvisoryAmountSliderKt.toKFormat(((i < 0 || i >= immutableList2.size()) ? new Money(Currencies.USD, new BigDecimal(0)) : immutableList2.get(i)).getDecimalValue()), (Intrinsics.areEqual(immutableList.get(i), AdvisoryAmountSliderKt.AdvisoryAmountSlider_TN_CM5M$lambda$10(snapshotState4)) && AdvisoryAmountSliderKt.AdvisoryAmountSlider_TN_CM5M$lambda$2(snapshotState)) ? false : true, i == 0, i == immutableList.size() - 1, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, null);
        LazyListScope.item$default(LazyRow, null, null, ComposableLambda3.composableLambdaInstance(-431730640, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$5$1$1$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-431730640, i, -1, "com.robinhood.android.advisory.projection.slider.AdvisoryAmountSlider.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryAmountSlider.kt:159)");
                }
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
        int i2;
        LazyListState lazyListState;
        Object obj;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2064898954, i2, -1, "com.robinhood.android.advisory.projection.slider.AdvisoryAmountSlider.<anonymous> (AdvisoryAmountSlider.kt:129)");
        }
        final float fM7995constructorimpl = C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM() / 2);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Modifier modifierAlign = BoxWithConstraints.align(modifierFillMaxWidth$default, companion2.getBottomCenter());
        Alignment.Vertical bottom = companion2.getBottom();
        LazyListState lazyListState2 = this.$listState;
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(fM7995constructorimpl) | composer.changedInstance(this.$amountList) | composer.changed(this.$currentAmount$delegate) | composer.changed(this.$spacing);
        final ImmutableList<Money> immutableList = this.$amountList;
        final float f = this.$spacing;
        final SnapshotState4<Money> snapshotState4 = this.$currentAmount$delegate;
        final SnapshotState<Boolean> snapshotState = this.$alreadyAligned$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            lazyListState = lazyListState2;
            obj = new Function1() { // from class: com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AdvisoryAmountSliderKt$AdvisoryAmountSlider$5.invoke$lambda$1$lambda$0(immutableList, fM7995constructorimpl, f, snapshotState4, snapshotState, (LazyListScope) obj2);
                }
            };
            composer.updateRememberedValue(obj);
        } else {
            lazyListState = lazyListState2;
            obj = objRememberedValue;
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyRow(modifierAlign, lazyListState, null, false, null, bottom, null, false, null, (Function1) obj, composer, 196608, 476);
        Modifier modifierAlign2 = BoxWithConstraints.align(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), companion2.getTopCenter());
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        SnapshotState4<Money> snapshotState42 = this.$currentAmount$delegate;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAlign2);
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
        String str = AdvisoryAmountSliderKt.AdvisoryAmountSlider_TN_CM5M$lambda$10(snapshotState42).getCurrency().getSymbol() + AdvisoryAmountSliderKt.toKFormat(AdvisoryAmountSliderKt.AdvisoryAmountSlider_TN_CM5M$lambda$10(snapshotState42).getDecimalValue());
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(companion, bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4))), bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21595getXsmallD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 24576, 0, 8168);
        BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Column5.weight$default(column6, SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(1)), 1.0f, false, 2, null), bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), null, 2, null), composer, 0);
        composer.endNode();
        AdvisoryAmountSliderKt.DialEndGradient(true, BoxWithConstraints.align(companion, companion2.getBottomStart()), composer, 6, 0);
        AdvisoryAmountSliderKt.DialEndGradient(false, BoxWithConstraints.align(companion, companion2.getBottomEnd()), composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
