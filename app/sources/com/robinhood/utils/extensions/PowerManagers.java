package com.robinhood.utils.extensions;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.robinhood.utils.system.BroadcastReceivers2;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PowerManagers.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"powerSaveModeChanges", "Lio/reactivex/Observable;", "", "Landroid/os/PowerManager;", "context", "Landroid/content/Context;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.PowerManagersKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class PowerManagers {
    public static final Observable<Boolean> powerSaveModeChanges(final PowerManager powerManager, Context context) {
        Intrinsics.checkNotNullParameter(powerManager, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Observable<Boolean> observableStartWith = BroadcastReceivers2.broadcasts(context, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), 2).map(new Function() { // from class: com.robinhood.utils.extensions.PowerManagersKt.powerSaveModeChanges.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Intent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(powerManager.isPowerSaveMode());
            }
        }).startWith((Observable<R>) Boolean.valueOf(powerManager.isPowerSaveMode()));
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        return observableStartWith;
    }
}
