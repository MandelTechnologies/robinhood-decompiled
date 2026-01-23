package com.robinhood.android;

import android.os.Build;
import com.robinhood.android.common.util.RhShortcutManager;
import com.robinhood.android.util.RhShortcutManagerImpl;
import com.robinhood.referral.AttributionManager;
import com.robinhood.referral.CombinedAttributionManager;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppProvisionsBinder.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H'¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/AppProvisionsBinder;", "", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "Lcom/robinhood/referral/CombinedAttributionManager;", "Companion", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface AppProvisionsBinder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    AttributionManager attributionManager(CombinedAttributionManager attributionManager);

    /* compiled from: AppProvisionsBinder.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/AppProvisionsBinder$Companion;", "", "<init>", "()V", "shortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "delegate", "Ldagger/Lazy;", "Lcom/robinhood/android/util/RhShortcutManagerImpl;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final RhShortcutManager shortcutManager(Lazy<RhShortcutManagerImpl> delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            if (Build.VERSION.SDK_INT < 25) {
                return RhShortcutManager.Noop.INSTANCE;
            }
            RhShortcutManagerImpl rhShortcutManagerImpl = delegate.get();
            Intrinsics.checkNotNullExpressionValue(rhShortcutManagerImpl, "get(...)");
            return rhShortcutManagerImpl;
        }
    }
}
