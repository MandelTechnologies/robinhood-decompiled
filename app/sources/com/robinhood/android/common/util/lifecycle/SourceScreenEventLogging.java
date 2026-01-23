package com.robinhood.android.common.util.lifecycle;

import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.extensions.ScreenViewAnalyticables;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SourceScreenEventLogging.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/util/lifecycle/SourceScreenEventLogging;", "", "<init>", "()V", "sourceDataMap", "", "", "Lcom/robinhood/android/common/util/lifecycle/SourceScreenEventLogging$SourceData;", "pendingSourceData", "onScreenStarted", "Lcom/robinhood/rosetta/eventlogging/Screen;", "fragment", "Landroidx/fragment/app/Fragment;", "onScreenStarted$lib_common_externalRelease", "onScreenStopped", "onScreenStopped$lib_common_externalRelease", "canProvideSourceScreenEvent", "", "SourceData", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SourceScreenEventLogging {
    public static final int $stable = 8;
    private SourceData pendingSourceData;
    private final Map<Integer, SourceData> sourceDataMap = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public final Screen onScreenStarted$lib_common_externalRelease(Fragment fragment) {
        Screen screenData;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (!canProvideSourceScreenEvent(fragment)) {
            return null;
        }
        SourceData sourceData = this.pendingSourceData;
        if (sourceData != null) {
            this.sourceDataMap.put(Integer.valueOf(fragment.hashCode()), sourceData);
        }
        if (fragment instanceof AutoLoggableFragment) {
            screenData = ((AutoLoggableFragment) fragment).getEventScreen();
        } else {
            screenData = ScreenViewAnalyticables.getScreenData((UiCallbacks.ScreenViewAnalyticable) fragment);
        }
        this.pendingSourceData = new SourceData(screenData);
        SourceData sourceData2 = this.sourceDataMap.get(Integer.valueOf(fragment.hashCode()));
        if (sourceData2 != null) {
            return sourceData2.getSourceScreen();
        }
        return null;
    }

    public final Screen onScreenStopped$lib_common_externalRelease(Fragment fragment) {
        SourceData sourceDataRemove;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (canProvideSourceScreenEvent(fragment) && (sourceDataRemove = this.sourceDataMap.remove(Integer.valueOf(fragment.hashCode()))) != null) {
            return sourceDataRemove.getSourceScreen();
        }
        return null;
    }

    /* compiled from: SourceScreenEventLogging.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/util/lifecycle/SourceScreenEventLogging$SourceData;", "", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class SourceData {
        private final Screen sourceScreen;

        public SourceData(Screen sourceScreen) {
            Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
            this.sourceScreen = sourceScreen;
        }

        public final Screen getSourceScreen() {
            return this.sourceScreen;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean canProvideSourceScreenEvent(Fragment fragment) {
        return ((fragment instanceof AutoLoggableFragment) && !((AutoLoggableFragment) fragment).getExcludeFromAutoScreenSourceEventLogging()) || ((fragment instanceof UiCallbacks.ScreenViewAnalyticable) && !((UiCallbacks.ScreenViewAnalyticable) fragment).getExcludeFromSourceLogging());
    }
}
