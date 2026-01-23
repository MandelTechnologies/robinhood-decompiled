package androidx.camera.core.internal.utils;

/* loaded from: classes4.dex */
public interface RingBuffer<T> {

    public interface OnRemoveCallback<T> {
        void onRemove(T t);
    }

    T dequeue();

    void enqueue(T t);

    boolean isEmpty();
}
