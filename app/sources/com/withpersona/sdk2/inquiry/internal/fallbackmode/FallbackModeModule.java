package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import androidx.lifecycle.SavedStateHandle;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.Environment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FallbackModeModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\fH\u0007J\b\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeModule;", "", "fallbackMode", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "environment", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lcom/withpersona/sdk2/inquiry/internal/Environment;Landroidx/lifecycle/SavedStateHandle;)V", "fallbackModeManager", "Lcom/withpersona/sdk2/inquiry/fallbackmode/FallbackModeManager;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/RealFallbackModeManager;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class FallbackModeModule {
    private final Environment environment;
    private final FallbackMode fallbackMode;
    private final SavedStateHandle savedStateHandle;

    public final FallbackModeManager fallbackModeManager(RealFallbackModeManager fallbackModeManager) {
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        return fallbackModeManager;
    }

    public FallbackModeModule(FallbackMode fallbackMode, Environment environment, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(fallbackMode, "fallbackMode");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.fallbackMode = fallbackMode;
        this.environment = environment;
        this.savedStateHandle = savedStateHandle;
    }

    /* renamed from: fallbackMode, reason: from getter */
    public final FallbackMode getFallbackMode() {
        return this.fallbackMode;
    }

    /* renamed from: environment, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    /* renamed from: savedStateHandle, reason: from getter */
    public final SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }
}
