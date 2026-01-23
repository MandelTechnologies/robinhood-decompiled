package com.robinhood.android.plt;

import androidx.fragment.app.FragmentManager;
import com.robinhood.android.plt.contract.PltManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PltModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/plt/PltModule;", "", "<init>", "()V", "bindPltScreenLifecycleCallbacks", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "callbacks", "Lcom/robinhood/android/plt/PltScreenLifecycleCallbacks;", "Companion", "lib-perceived-loading-time_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class PltModule {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract FragmentManager.FragmentLifecycleCallbacks bindPltScreenLifecycleCallbacks(PltScreenLifecycleCallbacks callbacks);

    /* compiled from: PltModule.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/plt/PltModule$Companion;", "", "<init>", "()V", "providePltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "pltManager", "Lcom/robinhood/android/plt/RealPltManager;", "lib-perceived-loading-time_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PltManager providePltManager(RealPltManager pltManager) {
            Intrinsics.checkNotNullParameter(pltManager, "pltManager");
            return pltManager;
        }

        private Companion() {
        }
    }
}
