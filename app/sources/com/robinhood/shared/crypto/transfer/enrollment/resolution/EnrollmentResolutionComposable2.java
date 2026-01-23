package com.robinhood.shared.crypto.transfer.enrollment.resolution;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.enrollment.resolution.EnrollmentResolutionState;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EnrollmentResolutionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.resolution.ComposableSingletons$EnrollmentResolutionComposableKt$lambda$-847450214$1, reason: use source file name */
/* loaded from: classes6.dex */
final class EnrollmentResolutionComposable2 implements Function2<Composer, Integer, Unit> {
    public static final EnrollmentResolutionComposable2 INSTANCE = new EnrollmentResolutionComposable2();

    EnrollmentResolutionComposable2() {
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
            ComposerKt.traceEventStart(-847450214, i, -1, "com.robinhood.shared.crypto.transfer.enrollment.resolution.ComposableSingletons$EnrollmentResolutionComposableKt.lambda$-847450214.<anonymous> (EnrollmentResolutionComposable.kt:128)");
        }
        EnrollmentResolutionState enrollmentResolutionState = new EnrollmentResolutionState(AppType.TRADER, "Title", "Subtitle", new EnrollmentResolutionState.LottieAsset.Url(LottieUrl.RHC_TRANSFER_COMPLETED_REBRAND_LIGHT, LottieUrl.RHC_TRANSFER_COMPLETED_REBRAND_DARK));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.resolution.ComposableSingletons$EnrollmentResolutionComposableKt$lambda$-847450214$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EnrollmentResolutionComposable5.EnrollmentResolutionContent(enrollmentResolutionState, (Function0) objRememberedValue, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
