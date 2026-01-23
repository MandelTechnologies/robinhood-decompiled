package com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotIntState2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: LimitCarouselBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class LimitCarouselBottomSheetKt$DepositPicker$2$2$1$2 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ ImmutableList<Long> $deposits;
    final /* synthetic */ SnapshotIntState2 $itemHeightPixels$delegate;

    LimitCarouselBottomSheetKt$DepositPicker$2$2$1$2(ImmutableList<Long> immutableList, SnapshotIntState2 snapshotIntState2) {
        this.$deposits = immutableList;
        this.$itemHeightPixels$delegate = snapshotIntState2;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if ((i3 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1828148159, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.DepositPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LimitCarouselBottomSheet.kt:314)");
        }
        String dollars = LimitRevealComposable2.toDollars(this.$deposits.get(i).longValue());
        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i4 = BentoTheme.$stable;
        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i4).getDisplayCapsuleMedium();
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(5004770);
        final SnapshotIntState2 snapshotIntState2 = this.$itemHeightPixels$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheetKt$DepositPicker$2$2$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LimitCarouselBottomSheetKt$DepositPicker$2$2$1$2.invoke$lambda$1$lambda$0(snapshotIntState2, (IntSize) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(dollars, OnRemeasuredModifier2.onSizeChanged(modifierFillMaxWidth$default, (Function1) objRememberedValue), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 48, 0, 8120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        return Unit.INSTANCE;
    }
}
