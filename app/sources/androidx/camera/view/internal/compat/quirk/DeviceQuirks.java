package androidx.camera.view.internal.compat.quirk;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Consumer;

/* loaded from: classes4.dex */
public class DeviceQuirks {
    private static volatile Quirks sQuirks;

    static {
        QuirkSettingsHolder.instance().observe(CameraXExecutors.directExecutor(), new Consumer() { // from class: androidx.camera.view.internal.compat.quirk.DeviceQuirks$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DeviceQuirks.m4732$r8$lambda$NiGkkN8ebQ4MBL2bY7z8GWT1Lc((QuirkSettings) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$NiG-kkN8ebQ4MBL2bY7z8GWT1Lc, reason: not valid java name */
    public static /* synthetic */ void m4732$r8$lambda$NiGkkN8ebQ4MBL2bY7z8GWT1Lc(QuirkSettings quirkSettings) {
        sQuirks = new Quirks(DeviceQuirksLoader.loadQuirks(quirkSettings));
        Logger.m45d("DeviceQuirks", "view DeviceQuirks = " + Quirks.toString(sQuirks));
    }

    public static <T extends Quirk> T get(Class<T> cls) {
        return (T) sQuirks.get(cls);
    }
}
