package androidx.window.layout.adapter.extensions;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExtensionWindowBackendApi1.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1, reason: use source file name */
/* loaded from: classes16.dex */
/* synthetic */ class ExtensionWindowBackendApi12 extends FunctionReferenceImpl implements Function1<WindowLayoutInfo, Unit> {
    ExtensionWindowBackendApi12(Object obj) {
        super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WindowLayoutInfo windowLayoutInfo) {
        invoke2(windowLayoutInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WindowLayoutInfo p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((MulticastConsumer) this.receiver).accept(p0);
    }
}
