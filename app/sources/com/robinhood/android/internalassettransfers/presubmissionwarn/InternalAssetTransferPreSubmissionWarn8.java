package com.robinhood.android.internalassettransfers.presubmissionwarn;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferPreSubmissionWarn.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt$InternalAssetTransferPreSubmissionWarnToolbar$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferPreSubmissionWarn8 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
    final /* synthetic */ InternalAssetTransferPreSubmissionWarn6 $callbacks;

    InternalAssetTransferPreSubmissionWarn8(InternalAssetTransferPreSubmissionWarn6 internalAssetTransferPreSubmissionWarn6) {
        this.$callbacks = internalAssetTransferPreSubmissionWarn6;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
        invoke(bentoAppBarScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
        }
        if ((i & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(634722479, i, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnToolbar.<anonymous>.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:78)");
        }
        Color colorM6701boximpl = Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU());
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$callbacks);
        final InternalAssetTransferPreSubmissionWarn6 internalAssetTransferPreSubmissionWarn6 = this.$callbacks;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.InternalAssetTransferPreSubmissionWarnKt$InternalAssetTransferPreSubmissionWarnToolbar$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InternalAssetTransferPreSubmissionWarn8.invoke$lambda$1$lambda$0(internalAssetTransferPreSubmissionWarn6);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, colorM6701boximpl, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferPreSubmissionWarn6 internalAssetTransferPreSubmissionWarn6) {
        internalAssetTransferPreSubmissionWarn6.onBackNavigationClicked();
        return Unit.INSTANCE;
    }
}
