package io.bitdrift.capture.common;

import android.view.View;
import android.view.Window;
import java.util.List;
import kotlin.Metadata;

/* compiled from: IWindowManager.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, m3636d2 = {"Lio/bitdrift/capture/common/IWindowManager;", "", "getAllRootViews", "", "Landroid/view/View;", "getCurrentWindow", "Landroid/view/Window;", "getFirstRootView", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface IWindowManager {
    List<View> getAllRootViews();

    Window getCurrentWindow();

    View getFirstRootView();
}
