package com.robinhood.android.eventcontracts.sharedeventui.animation;

import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: DeltaAnimations.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;", "openInterestDelta", "", "isOpenInterestDeltaPositive", "j$/time/Instant", "now", "Lcom/robinhood/android/eventcontracts/sharedeventui/animation/OpenInterestDeltaAnimationState;", "buildOpenInterestDeltaAnimation", "(Lcom/robinhood/android/eventcontracts/sharedeventui/animation/Delta;Ljava/lang/Boolean;Lj$/time/Instant;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/eventcontracts/sharedeventui/animation/OpenInterestDeltaAnimationState;", "Landroidx/compose/ui/graphics/Color;", "animatedTextColor", "", "iconAlpha", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.animation.DeltaAnimationsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class DeltaAnimations {
    public static final OpenInterestDeltaAnimationState buildOpenInterestDeltaAnimation(Delta delta, Boolean bool, Instant now, Composer composer, int i) {
        long jM21426getFg20d7_KjU;
        Intrinsics.checkNotNullParameter(now, "now");
        composer.startReplaceGroup(-1456313947);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1456313947, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.animation.buildOpenInterestDeltaAnimation (DeltaAnimations.kt:24)");
        }
        boolean z = (delta == null || delta.passedDelay(now) || bool == null) ? false : true;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            composer.startReplaceGroup(641649005);
            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
            composer.endReplaceGroup();
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            composer.startReplaceGroup(641650541);
            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        } else {
            if (bool != null) {
                composer.startReplaceGroup(641646780);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(641652040);
            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
            composer.endReplaceGroup();
        }
        composer.startReplaceGroup(641653410);
        if (!z) {
            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
        }
        long j = jM21426getFg20d7_KjU;
        composer.endReplaceGroup();
        OpenInterestDeltaAnimationState openInterestDeltaAnimationState = new OpenInterestDeltaAnimationState(buildOpenInterestDeltaAnimation$lambda$0(SingleValueAnimation.m4805animateColorAsStateeuL9pac(j, null, "deltaTextColor", null, composer, 384, 10)), buildOpenInterestDeltaAnimation$lambda$1(AnimateAsState.animateFloatAsState(z ? 1.0f : 0.0f, null, 0.0f, "deltaIconAlpha", null, composer, 3072, 22)), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return openInterestDeltaAnimationState;
    }

    private static final long buildOpenInterestDeltaAnimation$lambda$0(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float buildOpenInterestDeltaAnimation$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }
}
