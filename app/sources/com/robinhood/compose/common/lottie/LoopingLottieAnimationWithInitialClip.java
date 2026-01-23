package com.robinhood.compose.common.lottie;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LoopingLottieAnimationWithInitialClip.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"LoopingLottieAnimationWithInitialClip", "", "modifier", "Landroidx/compose/ui/Modifier;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "initialClipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "loopingClipSpec", "(Landroidx/compose/ui/Modifier;Lcom/airbnb/lottie/LottieComposition;Landroidx/compose/ui/layout/ContentScale;Lcom/airbnb/lottie/compose/LottieClipSpec;Lcom/airbnb/lottie/compose/LottieClipSpec;Landroidx/compose/runtime/Composer;I)V", "lib-compose-common_externalDebug", "loopingProgress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.lottie.LoopingLottieAnimationWithInitialClipKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class LoopingLottieAnimationWithInitialClip {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoopingLottieAnimationWithInitialClip$lambda$3(Modifier modifier, LottieComposition lottieComposition, ContentScale contentScale, LottieClipSpec lottieClipSpec, LottieClipSpec lottieClipSpec2, int i, Composer composer, int i2) {
        LoopingLottieAnimationWithInitialClip(modifier, lottieComposition, contentScale, lottieClipSpec, lottieClipSpec2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LoopingLottieAnimationWithInitialClip(final Modifier modifier, final LottieComposition lottieComposition, final ContentScale contentScale, final LottieClipSpec initialClipSpec, final LottieClipSpec loopingClipSpec, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(initialClipSpec, "initialClipSpec");
        Intrinsics.checkNotNullParameter(loopingClipSpec, "loopingClipSpec");
        Composer composerStartRestartGroup = composer.startRestartGroup(1429607656);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(lottieComposition) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(contentScale) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(initialClipSpec) : composerStartRestartGroup.changedInstance(initialClipSpec) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(loopingClipSpec) : composerStartRestartGroup.changedInstance(loopingClipSpec) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1429607656, i2, -1, "com.robinhood.compose.common.lottie.LoopingLottieAnimationWithInitialClip (LoopingLottieAnimationWithInitialClip.kt:19)");
            }
            int i3 = (i2 >> 3) & 14;
            int i4 = 1572864 | i3;
            int i5 = LottieClipSpec.$stable;
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieComposition, false, false, false, initialClipSpec, 0.0f, 1, null, false, false, composerStartRestartGroup, (i5 << 12) | i4 | ((i2 << 3) & 57344), 942);
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState2 = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieComposition, !lottieAnimationStateAnimateLottieCompositionAsState.isPlaying(), false, false, loopingClipSpec, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, i4 | (i5 << 12) | (i2 & 57344), 940);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState) | composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.lottie.LoopingLottieAnimationWithInitialClipKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(LoopingLottieAnimationWithInitialClip.LoopingLottieAnimationWithInitialClip$lambda$2$lambda$1(lottieAnimationStateAnimateLottieCompositionAsState, lottieAnimationStateAnimateLottieCompositionAsState2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LottieAnimation2.LottieAnimation(lottieComposition, (Function0) objRememberedValue, modifier, false, false, false, null, false, null, null, contentScale, false, false, null, null, false, composer2, i3 | ((i2 << 6) & 896), (i2 >> 6) & 14, 64504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.lottie.LoopingLottieAnimationWithInitialClipKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoopingLottieAnimationWithInitialClip.LoopingLottieAnimationWithInitialClip$lambda$3(modifier, lottieComposition, contentScale, initialClipSpec, loopingClipSpec, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LoopingLottieAnimationWithInitialClip$lambda$2$lambda$1(LottieAnimationState lottieAnimationState, LottieAnimationState lottieAnimationState2) {
        if (lottieAnimationState.isPlaying()) {
            return lottieAnimationState.getProgress();
        }
        return LoopingLottieAnimationWithInitialClip$lambda$0(lottieAnimationState2);
    }

    private static final float LoopingLottieAnimationWithInitialClip$lambda$0(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }
}
