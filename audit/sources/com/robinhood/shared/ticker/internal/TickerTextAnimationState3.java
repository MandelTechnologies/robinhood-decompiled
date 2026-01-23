package com.robinhood.shared.ticker.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.ticker.TextType;
import com.robinhood.shared.ticker.config.TickerLocaleConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TickerTextAnimationState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u00068\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, m3636d2 = {"ANIMATION_DURATION_MS", "", "FAST_ANIMATION_DURATION_MS", "getFAST_ANIMATION_DURATION_MS$annotations", "()V", "FRAME_DURATION_MS", "", "getFRAME_DURATION_MS$annotations", "rememberTickerTextAnimationState", "Lcom/robinhood/shared/ticker/internal/TickerTextAnimationState;", "initialText", "", "localeConfig", "Lcom/robinhood/shared/ticker/config/TickerLocaleConfig;", "textType", "Lcom/robinhood/shared/ticker/TextType;", "(Ljava/lang/String;Lcom/robinhood/shared/ticker/config/TickerLocaleConfig;Lcom/robinhood/shared/ticker/TextType;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/shared/ticker/internal/TickerTextAnimationState;", "lib-ticker-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.ticker.internal.TickerTextAnimationStateKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TickerTextAnimationState3 {
    public static final int ANIMATION_DURATION_MS = 250;
    public static final int FAST_ANIMATION_DURATION_MS = 75;
    public static final long FRAME_DURATION_MS = 16;

    public static /* synthetic */ void getFAST_ANIMATION_DURATION_MS$annotations() {
    }

    public static /* synthetic */ void getFRAME_DURATION_MS$annotations() {
    }

    public static final TickerTextAnimationState rememberTickerTextAnimationState(String initialText, TickerLocaleConfig localeConfig, TextType textType, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialText, "initialText");
        Intrinsics.checkNotNullParameter(localeConfig, "localeConfig");
        composer.startReplaceGroup(350394118);
        if ((i2 & 4) != 0) {
            textType = TextType.DEFAULT;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(350394118, i, -1, "com.robinhood.shared.ticker.internal.rememberTickerTextAnimationState (TickerTextAnimationState.kt:340)");
        }
        composer.startReplaceGroup(-1633490746);
        boolean z = ((((i & 896) ^ 384) > 256 && composer.changed(textType.ordinal())) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && composer.changed(localeConfig)) || (i & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new TickerTextAnimationState(initialText, textType, localeConfig);
            composer.updateRememberedValue(objRememberedValue);
        }
        TickerTextAnimationState tickerTextAnimationState = (TickerTextAnimationState) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tickerTextAnimationState;
    }
}
