package com.robinhood.android.referral.fractionalRewards.instrumentSelection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FractionalRewardInstrumentSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.fractionalRewards.instrumentSelection.ComposableSingletons$FractionalRewardInstrumentSelectionComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class FractionalRewardInstrumentSelectionComposable {
    public static final FractionalRewardInstrumentSelectionComposable INSTANCE = new FractionalRewardInstrumentSelectionComposable();
    private static Function2<Composer, Integer, Unit> lambda$1307300897 = ComposableLambda3.composableLambdaInstance(1307300897, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.ComposableSingletons$FractionalRewardInstrumentSelectionComposableKt$lambda$1307300897$1
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
                ComposerKt.traceEventStart(1307300897, i, -1, "com.robinhood.android.referral.fractionalRewards.instrumentSelection.ComposableSingletons$FractionalRewardInstrumentSelectionComposableKt.lambda$1307300897.<anonymous> (FractionalRewardInstrumentSelectionComposable.kt:133)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.ARROW_RIGHT_16), null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), TestTag3.testTag(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), FractionalRewardInstrumentSelectionComposable3.FractionalInstrumentsArrowIndicator), null, false, composer, BentoIcon4.Size16.$stable | 3120, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1307300897$feature_referral_externalDebug() {
        return lambda$1307300897;
    }
}
