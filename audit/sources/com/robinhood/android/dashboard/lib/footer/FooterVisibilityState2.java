package com.robinhood.android.dashboard.lib.footer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FooterVisibilityState.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"rememberFooterVisibilityState", "Lcom/robinhood/android/dashboard/lib/footer/FooterVisibilityState;", "showFooterButton", "", "(ZLandroidx/compose/runtime/Composer;II)Lcom/robinhood/android/dashboard/lib/footer/FooterVisibilityState;", "lib-account-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.footer.FooterVisibilityStateKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class FooterVisibilityState2 {
    public static final FooterVisibilityState rememberFooterVisibilityState(final boolean z, Composer composer, int i, int i2) {
        composer.startReplaceGroup(1392870163);
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1392870163, i, -1, "com.robinhood.android.dashboard.lib.footer.rememberFooterVisibilityState (FooterVisibilityState.kt:45)");
        }
        Object[] objArr = new Object[0];
        Saver<FooterVisibilityState, ?> saver = FooterVisibilityState.INSTANCE.getSaver();
        composer.startReplaceGroup(5004770);
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(z)) && (i & 6) != 4) {
            z2 = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.lib.footer.FooterVisibilityStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FooterVisibilityState2.rememberFooterVisibilityState$lambda$1$lambda$0(z);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        FooterVisibilityState footerVisibilityState = (FooterVisibilityState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return footerVisibilityState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FooterVisibilityState rememberFooterVisibilityState$lambda$1$lambda$0(boolean z) {
        return new FooterVisibilityState(z);
    }
}
