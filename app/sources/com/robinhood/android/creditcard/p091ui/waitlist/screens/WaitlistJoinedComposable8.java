package com.robinhood.android.creditcard.p091ui.waitlist.screens;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoColor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WaitlistJoinedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2$1$2$2$2, reason: use source file name */
/* loaded from: classes2.dex */
final class WaitlistJoinedComposable8 implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $audioOn$delegate;

    WaitlistJoinedComposable8(SnapshotState<Boolean> snapshotState) {
        this.$audioOn$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1067557526, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoined.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WaitlistJoinedComposable.kt:184)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, WaitlistJoinedComposable4.WAITLIST_JOINED_VOLUME_CTA_TEST_TAG);
        long jM21143getCCGoldFG0d7_KjU = BentoColor.INSTANCE.m21143getCCGoldFG0d7_KjU();
        long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
        BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(WaitlistJoinedComposable4.WaitlistJoined$lambda$10(this.$audioOn$delegate) ? ServerToBentoAssetMapper2.SOUND_ON_24 : ServerToBentoAssetMapper2.SOUND_OFF_24);
        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.candlestick_volume, composer, 0);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$audioOn$delegate);
        final SnapshotState<Boolean> snapshotState = this.$audioOn$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2$1$2$2$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WaitlistJoinedComposable8.invoke$lambda$1$lambda$0(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue, heroSize24, strStringResource, modifierTestTag, null, false, Color.m6701boximpl(jM21143getCCGoldFG0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU), null, null, false, composer, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 12585984, 0, 1840);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
        WaitlistJoinedComposable4.WaitlistJoined$lambda$11(snapshotState, !WaitlistJoinedComposable4.WaitlistJoined$lambda$10(snapshotState));
        return Unit.INSTANCE;
    }
}
