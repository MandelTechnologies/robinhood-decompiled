package com.robinhood.microgram.sdui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramAppUtilsViewModel_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramAppUtilsViewModel_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/microgram/sdui/MicrogramAppUtilsViewModel;", "microgramManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MicrogramAppUtilsViewModel_Factory implements Factory<MicrogramParentFragment2> {
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MicrogramAppUtilsViewModel_Factory create(Provider<MicrogramManager> provider, Provider<SavedStateHandle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final MicrogramParentFragment2 newInstance(MicrogramManager microgramManager, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(microgramManager, savedStateHandle);
    }

    public MicrogramAppUtilsViewModel_Factory(Provider<MicrogramManager> microgramManager, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.microgramManager = microgramManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public MicrogramParentFragment2 get() {
        Companion companion = INSTANCE;
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(microgramManager, savedStateHandle);
    }

    /* compiled from: MicrogramAppUtilsViewModel_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramAppUtilsViewModel_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/microgram/sdui/MicrogramAppUtilsViewModel_Factory;", "microgramManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/microgram/sdui/MicrogramAppUtilsViewModel;", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MicrogramAppUtilsViewModel_Factory create(Provider<MicrogramManager> microgramManager, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MicrogramAppUtilsViewModel_Factory(microgramManager, savedStateHandle);
        }

        @JvmStatic
        public final MicrogramParentFragment2 newInstance(MicrogramManager microgramManager, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MicrogramParentFragment2(microgramManager, savedStateHandle);
        }
    }
}
