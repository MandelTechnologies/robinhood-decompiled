package com.robinhood.android.futures.trade.extensions;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.robinhood.android.common.util.Compat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Vibrate.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m3636d2 = {"vibrate", "", "Landroid/content/Context;", "duration", "", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.extensions.VibrateKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class Vibrate2 {
    @TargetApi(26)
    public static final void vibrate(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator == null) {
            return;
        }
        if (Compat.INSTANCE.isApiSupported(26)) {
            vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
        } else {
            vibrator.vibrate(j);
        }
    }
}
