package androidx.window;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowSdkExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, m3636d2 = {"Landroidx/window/EmptyDecoratorWindowSdk;", "Landroidx/window/WindowSdkExtensionsDecorator;", "()V", "decorate", "Landroidx/window/WindowSdkExtensions;", "windowSdkExtensions", "window_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.window.EmptyDecoratorWindowSdk, reason: use source file name */
/* loaded from: classes16.dex */
final class WindowSdkExtensions2 implements WindowSdkExtensions4 {
    public static final WindowSdkExtensions2 INSTANCE = new WindowSdkExtensions2();

    @Override // androidx.window.WindowSdkExtensions4
    public WindowSdkExtensions decorate(WindowSdkExtensions windowSdkExtensions) {
        Intrinsics.checkNotNullParameter(windowSdkExtensions, "windowSdkExtensions");
        return windowSdkExtensions;
    }

    private WindowSdkExtensions2() {
    }
}
