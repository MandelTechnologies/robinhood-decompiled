package io.reactivex;

/* loaded from: classes14.dex */
public interface ObservableConverter<T, R> {
    R apply(Observable<T> observable);
}
