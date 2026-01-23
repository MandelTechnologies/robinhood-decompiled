package com.robinhood.utils.extensions;

import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Disposable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a#\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0006\"\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"isSubscribed", "", "Lio/reactivex/disposables/Disposable;", "disposeSafe", "", "disposables", "", "([Lio/reactivex/disposables/Disposable;)V", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.DisposableKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Disposable4 {
    public static final boolean isSubscribed(Disposable disposable) {
        return (disposable == null || disposable.isDisposed()) ? false : true;
    }

    public static final void disposeSafe(Disposable disposable) {
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        disposable.dispose();
    }

    public static final void disposeSafe(Disposable... disposables) {
        Intrinsics.checkNotNullParameter(disposables, "disposables");
        for (Disposable disposable : disposables) {
            disposeSafe(disposable);
        }
    }
}
