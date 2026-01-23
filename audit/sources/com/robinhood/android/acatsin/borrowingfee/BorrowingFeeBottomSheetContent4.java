package com.robinhood.android.acatsin.borrowingfee;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BorrowingFeeBottomSheetContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.borrowingfee.ComposableSingletons$BorrowingFeeBottomSheetContentKt$lambda$-1368997368$1, reason: use source file name */
/* loaded from: classes24.dex */
final class BorrowingFeeBottomSheetContent4 implements Function2<Composer, Integer, Unit> {
    public static final BorrowingFeeBottomSheetContent4 INSTANCE = new BorrowingFeeBottomSheetContent4();

    BorrowingFeeBottomSheetContent4() {
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
            ComposerKt.traceEventStart(-1368997368, i, -1, "com.robinhood.android.acatsin.borrowingfee.ComposableSingletons$BorrowingFeeBottomSheetContentKt.lambda$-1368997368.<anonymous> (BorrowingFeeBottomSheetContent.kt:87)");
        }
        ImmutableList immutableList = extensions2.toImmutableList(CollectionsKt.listOf((Object[]) new UiShortPositionFeeData[]{new UiShortPositionFeeData("TSLA", new BigDecimal("2.15")), new UiShortPositionFeeData("AAPL", new BigDecimal("1.85")), new UiShortPositionFeeData("NVDA", new BigDecimal("3.45"))}));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.borrowingfee.ComposableSingletons$BorrowingFeeBottomSheetContentKt$lambda$-1368997368$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BorrowingFeeBottomSheetContent.BorrowingFeeBottomSheetContent(immutableList, (Function0) objRememberedValue, composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
