package com.robinhood.android.lib.pathfinder;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.prefs.Installation;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/pathfinder/PathfinderDuxo;", "pathfinderStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "pathfinderStateRegistry", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry;", "installation", "Lcom/robinhood/prefs/Installation;", "pathfinderStateProvider", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PathfinderDuxo_Factory implements Factory<PathfinderDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<Installation> installation;
    private final Provider<PathfinderStateProvider> pathfinderStateProvider;
    private final Provider<PathfinderStateRegistry> pathfinderStateRegistry;
    private final Provider<PathfinderStore> pathfinderStore;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PathfinderDuxo_Factory create(Provider<PathfinderStore> provider, Provider<PathfinderStateRegistry> provider2, Provider<Installation> provider3, Provider<PathfinderStateProvider> provider4, Provider<DuxoBundle> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final PathfinderDuxo newInstance(PathfinderStore pathfinderStore, PathfinderStateRegistry pathfinderStateRegistry, Installation installation, PathfinderStateProvider pathfinderStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(pathfinderStore, pathfinderStateRegistry, installation, pathfinderStateProvider, duxoBundle, savedStateHandle);
    }

    public PathfinderDuxo_Factory(Provider<PathfinderStore> pathfinderStore, Provider<PathfinderStateRegistry> pathfinderStateRegistry, Provider<Installation> installation, Provider<PathfinderStateProvider> pathfinderStateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(pathfinderStateRegistry, "pathfinderStateRegistry");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(pathfinderStateProvider, "pathfinderStateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.pathfinderStateRegistry = pathfinderStateRegistry;
        this.installation = installation;
        this.pathfinderStateProvider = pathfinderStateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public PathfinderDuxo get() {
        Companion companion = INSTANCE;
        PathfinderStore pathfinderStore = this.pathfinderStore.get();
        Intrinsics.checkNotNullExpressionValue(pathfinderStore, "get(...)");
        PathfinderStateRegistry pathfinderStateRegistry = this.pathfinderStateRegistry.get();
        Intrinsics.checkNotNullExpressionValue(pathfinderStateRegistry, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        PathfinderStateProvider pathfinderStateProvider = this.pathfinderStateProvider.get();
        Intrinsics.checkNotNullExpressionValue(pathfinderStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(pathfinderStore, pathfinderStateRegistry, installation, pathfinderStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: PathfinderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/pathfinder/PathfinderDuxo_Factory;", "pathfinderStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "pathfinderStateRegistry", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry;", "installation", "Lcom/robinhood/prefs/Installation;", "pathfinderStateProvider", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/lib/pathfinder/PathfinderDuxo;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PathfinderDuxo_Factory create(Provider<PathfinderStore> pathfinderStore, Provider<PathfinderStateRegistry> pathfinderStateRegistry, Provider<Installation> installation, Provider<PathfinderStateProvider> pathfinderStateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
            Intrinsics.checkNotNullParameter(pathfinderStateRegistry, "pathfinderStateRegistry");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(pathfinderStateProvider, "pathfinderStateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new PathfinderDuxo_Factory(pathfinderStore, pathfinderStateRegistry, installation, pathfinderStateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final PathfinderDuxo newInstance(PathfinderStore pathfinderStore, PathfinderStateRegistry pathfinderStateRegistry, Installation installation, PathfinderStateProvider pathfinderStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
            Intrinsics.checkNotNullParameter(pathfinderStateRegistry, "pathfinderStateRegistry");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(pathfinderStateProvider, "pathfinderStateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new PathfinderDuxo(pathfinderStore, pathfinderStateRegistry, installation, pathfinderStateProvider, duxoBundle, savedStateHandle);
        }
    }
}
