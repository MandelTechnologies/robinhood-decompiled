package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;

/* loaded from: classes21.dex */
public interface ResettableConnectable {
    void resetIf(Disposable disposable);
}
