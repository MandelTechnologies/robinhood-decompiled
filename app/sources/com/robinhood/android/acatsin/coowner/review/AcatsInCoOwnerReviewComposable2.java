package com.robinhood.android.acatsin.coowner.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewState5;
import com.robinhood.android.acatsin.review.ReviewAcatsInComposable3;
import com.robinhood.android.acatsin.review.ReviewAcatsInViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInCoOwnerReviewComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt$AcatsInCoOwnerReviewComposable$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInCoOwnerReviewComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AcatsInCoOwnerReviewState5 $state;

    AcatsInCoOwnerReviewComposable2(AcatsInCoOwnerReviewState5 acatsInCoOwnerReviewState5) {
        this.$state = acatsInCoOwnerReviewState5;
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
            ComposerKt.traceEventStart(158089488, i, -1, "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposable.<anonymous>.<anonymous> (AcatsInCoOwnerReviewComposable.kt:46)");
        }
        ReviewAcatsInViewState loadingState = ((AcatsInCoOwnerReviewState5.Loading) this.$state).getLoadingState();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt$AcatsInCoOwnerReviewComposable$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt$AcatsInCoOwnerReviewComposable$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function02 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewComposableKt$AcatsInCoOwnerReviewComposable$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        ReviewAcatsInComposable3.ReviewAcatsInComposable(loadingState, function0, function02, (Function0) objRememberedValue3, null, composer, ReviewAcatsInViewState.$stable | 3504, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
