package com.robinhood.android.microgramsdui;

import kotlin.Metadata;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.MicrogramLaunchId;

/* compiled from: MicrogramManager.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/MicrogramManager;", "", "getInstance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "id", "Lmicrogram/android/MicrogramLaunchId;", "shutDownDebounce", "Lkotlin/time/Duration;", "getInstance-moChb0s", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MicrogramManager {
    /* renamed from: getInstance-moChb0s, reason: not valid java name */
    MicrogramManager2 mo16548getInstancemoChb0s(CoroutineScope lifecycleScope, MicrogramLaunchId id, Duration shutDownDebounce);

    /* compiled from: MicrogramManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* renamed from: getInstance-moChb0s$default, reason: not valid java name */
        public static /* synthetic */ MicrogramManager2 m16549getInstancemoChb0s$default(MicrogramManager microgramManager, CoroutineScope coroutineScope, MicrogramLaunchId microgramLaunchId, Duration duration, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInstance-moChb0s");
            }
            if ((i & 4) != 0) {
                duration = null;
            }
            return microgramManager.mo16548getInstancemoChb0s(coroutineScope, microgramLaunchId, duration);
        }
    }
}
