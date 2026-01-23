package com.robinhood.utils.p409ui.animation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.robinhood.utils.extensions.ContextSystemServices;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: Animators.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/ui/animation/Animators;", "", "<init>", "()V", "areValueAnimatorsEnabled", "", "getAnimatorDurationScale", "", "context", "Landroid/content/Context;", "animationsEnabled", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Animators {
    public static final int $stable = 0;
    public static final Animators INSTANCE = new Animators();

    private Animators() {
    }

    private final boolean areValueAnimatorsEnabled() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ValueAnimator.areAnimatorsEnabled();
        }
        return true;
    }

    public final float getAnimatorDurationScale(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (ContextSystemServices.getPowerManager(context).isPowerSaveMode() || !areValueAnimatorsEnabled()) {
            return 0.0f;
        }
        try {
            return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale");
        } catch (Settings.SettingNotFoundException e) {
            Timber.INSTANCE.mo3351d(e);
            return 1.0f;
        }
    }

    public final boolean animationsEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !(getAnimatorDurationScale(context) == 0.0f);
    }
}
