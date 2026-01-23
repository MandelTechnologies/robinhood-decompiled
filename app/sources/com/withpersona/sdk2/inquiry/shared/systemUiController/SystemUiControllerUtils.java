package com.withpersona.sdk2.inquiry.shared.systemUiController;

import com.squareup.workflow1.p415ui.ViewEnvironment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SystemUiControllerUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"updateSystemUiColor", "", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "backgroundColor", "", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class SystemUiControllerUtils {
    public static final void updateSystemUiColor(ViewEnvironment viewEnvironment, int i) {
        Intrinsics.checkNotNullParameter(viewEnvironment, "<this>");
        Object obj = viewEnvironment.getMap().get(SystemUiControllerKey.INSTANCE);
        SystemUiController systemUiController = obj instanceof SystemUiController ? (SystemUiController) obj : null;
        if (systemUiController != null) {
            systemUiController.updateSystemUiColor(i);
        }
    }
}
