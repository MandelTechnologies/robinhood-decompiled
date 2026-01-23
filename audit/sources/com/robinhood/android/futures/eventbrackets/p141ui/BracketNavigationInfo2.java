package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BracketNavigationInfo.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"rememberBracketNavigationState", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;", "navigationInfo", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;", "(Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketNavigationInfoKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BracketNavigationInfo2 {
    public static final BracketNavigationInfo3 rememberBracketNavigationState(BracketNavigationInfo navigationInfo, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(navigationInfo, "navigationInfo");
        composer.startReplaceGroup(1290364610);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1290364610, i, -1, "com.robinhood.android.futures.eventbrackets.ui.rememberBracketNavigationState (BracketNavigationInfo.kt:157)");
        }
        composer.startReplaceGroup(5004770);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(navigationInfo)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new BracketNavigationInfo3(navigationInfo);
            composer.updateRememberedValue(objRememberedValue);
        }
        BracketNavigationInfo3 bracketNavigationInfo3 = (BracketNavigationInfo3) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bracketNavigationInfo3;
    }
}
