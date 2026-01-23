package com.robinhood.android.transfers.ach.p265ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewRecurringDepositComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.ComposableSingletons$ReviewRecurringDepositComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ReviewRecurringDepositComposable {
    public static final ReviewRecurringDepositComposable INSTANCE = new ReviewRecurringDepositComposable();

    /* renamed from: lambda$-418014805, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9278lambda$418014805 = ComposableLambda3.composableLambdaInstance(-418014805, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ach.ui.ComposableSingletons$ReviewRecurringDepositComposableKt$lambda$-418014805$1
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
                ComposerKt.traceEventStart(-418014805, i, -1, "com.robinhood.android.transfers.ach.ui.ComposableSingletons$ReviewRecurringDepositComposableKt.lambda$-418014805.<anonymous> (ReviewRecurringDepositComposable.kt:56)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30082R.string.recurring_deposit_transfer_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BoxScope, Composer, Integer, Unit> lambda$427560432 = ComposableLambda3.composableLambdaInstance(427560432, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ach.ui.ComposableSingletons$ReviewRecurringDepositComposableKt$lambda$427560432$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(427560432, i, -1, "com.robinhood.android.transfers.ach.ui.ComposableSingletons$ReviewRecurringDepositComposableKt.lambda$427560432.<anonymous> (ReviewRecurringDepositComposable.kt:68)");
            }
            OnboardingProgress onboardingProgress = OnboardingProgress.RECURRING_AUTOMATIC_DEPOSIT_REVIEW_TRANSFER;
            BentoProgressBar2.m20699BentoProgressBarnBX6wN0(onboardingProgress.getSegmentIdx(), onboardingProgress.getProgress(), 5, null, 0L, 0L, false, composer, 384, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-418014805$feature_legacy_ach_transfers_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19558getLambda$418014805$feature_legacy_ach_transfers_externalDebug() {
        return f9278lambda$418014805;
    }

    public final Function3<BoxScope, Composer, Integer, Unit> getLambda$427560432$feature_legacy_ach_transfers_externalDebug() {
        return lambda$427560432;
    }
}
