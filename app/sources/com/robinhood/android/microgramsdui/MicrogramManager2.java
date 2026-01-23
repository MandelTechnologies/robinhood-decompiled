package com.robinhood.android.microgramsdui;

import com.robinhood.android.microgramsdui.control.UiInitializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.MicrogramLaunchId;
import microgram.android.inject.MicrogramComponent;

/* compiled from: MicrogramManager.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "", "id", "Lmicrogram/android/MicrogramLaunchId;", "component", "Lmicrogram/android/inject/MicrogramComponent;", "uiInitializer", "Lcom/robinhood/android/microgramsdui/control/UiInitializer;", "<init>", "(Lmicrogram/android/MicrogramLaunchId;Lmicrogram/android/inject/MicrogramComponent;Lcom/robinhood/android/microgramsdui/control/UiInitializer;)V", "getId", "()Lmicrogram/android/MicrogramLaunchId;", "getComponent", "()Lmicrogram/android/inject/MicrogramComponent;", "getUiInitializer", "()Lcom/robinhood/android/microgramsdui/control/UiInitializer;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.MicrogramInstance, reason: use source file name */
/* loaded from: classes8.dex */
public final class MicrogramManager2 {
    public static final int $stable = 8;
    private final MicrogramComponent component;
    private final MicrogramLaunchId id;
    private final UiInitializer uiInitializer;

    public MicrogramManager2(MicrogramLaunchId id, MicrogramComponent component, UiInitializer uiInitializer) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(uiInitializer, "uiInitializer");
        this.id = id;
        this.component = component;
        this.uiInitializer = uiInitializer;
    }

    public final MicrogramLaunchId getId() {
        return this.id;
    }

    public final MicrogramComponent getComponent() {
        return this.component;
    }

    public final UiInitializer getUiInitializer() {
        return this.uiInitializer;
    }
}
