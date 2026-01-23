package androidx.window.layout.adapter.extensions;

import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExtensionWindowBackendApi6.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi6;", "Landroidx/window/layout/adapter/extensions/ExtensionWindowBackendApi2;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Landroidx/window/core/ConsumerAdapter;", "adapter", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;Landroidx/window/core/ConsumerAdapter;)V", "window_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class ExtensionWindowBackendApi6 extends ExtensionWindowBackendApi2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionWindowBackendApi6(WindowLayoutComponent component, ConsumerAdapter adapter) {
        super(component, adapter);
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }
}
