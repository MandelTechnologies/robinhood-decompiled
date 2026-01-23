package com.robinhood.security.screenprotect;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScreenProtectManager.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"isScreenShareActive", "", "Landroid/content/Context;", "(Landroid/content/Context;)Z", "displayManager", "Landroid/hardware/display/DisplayManager;", "getDisplayManager", "(Landroid/content/Context;)Landroid/hardware/display/DisplayManager;", "lib-security_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.security.screenprotect.ScreenProtectManagerKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class ScreenProtectManager2 {
    public static final boolean isScreenShareActive(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Display[] displays = getDisplayManager(context).getDisplays();
        Intrinsics.checkNotNullExpressionValue(displays, "getDisplays(...)");
        ArrayList<Display> arrayList = new ArrayList();
        for (Display display : displays) {
            if (display.getDisplayId() != 0) {
                arrayList.add(display);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Display display2 : arrayList) {
            arrayList2.add(Boolean.valueOf((display2.getFlags() & 8) == 8 && (display2.getFlags() & 2) != 2));
        }
        return arrayList2.contains(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayManager getDisplayManager(Context context) {
        Object systemService = context.getSystemService("display");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        return (DisplayManager) systemService;
    }
}
