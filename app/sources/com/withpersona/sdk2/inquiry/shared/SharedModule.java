package com.withpersona.sdk2.inquiry.shared;

import android.view.Window;
import com.withpersona.sdk2.inquiry.shared.image.ImageHelper;
import com.withpersona.sdk2.inquiry.shared.image.ImageHelper2;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharedModule.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/SharedModule;", "", "controlNavigationBar", "", "controlStatusBar", "<init>", "(ZZ)V", "imageHelper", "Lcom/withpersona/sdk2/inquiry/shared/image/ImageHelper;", "Lcom/withpersona/sdk2/inquiry/shared/image/RealImageHelper;", "fileHelper", "Lcom/withpersona/sdk2/inquiry/shared/FileHelper;", "Lcom/withpersona/sdk2/inquiry/shared/RealFileHelper;", "systemUiController", "Lcom/withpersona/sdk2/inquiry/shared/systemUiController/SystemUiController;", "window", "Landroid/view/Window;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SharedModule {
    private final boolean controlNavigationBar;
    private final boolean controlStatusBar;

    /* JADX WARN: Illegal instructions before constructor call */
    public SharedModule() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public final FileHelper fileHelper(FileHelper2 fileHelper) {
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        return fileHelper;
    }

    public final ImageHelper imageHelper(ImageHelper2 imageHelper) {
        Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
        return imageHelper;
    }

    public SharedModule(boolean z, boolean z2) {
        this.controlNavigationBar = z;
        this.controlStatusBar = z2;
    }

    public /* synthetic */ SharedModule(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    public final SystemUiController systemUiController(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        return new SystemUiController(window, this.controlNavigationBar, this.controlStatusBar);
    }
}
