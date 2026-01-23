package androidx.camera.core.impl.utils.futures;

/* loaded from: classes4.dex */
public interface FutureCallback<V> {
    void onFailure(Throwable th);

    void onSuccess(V v);
}
