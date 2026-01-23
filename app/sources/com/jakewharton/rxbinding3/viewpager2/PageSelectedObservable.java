package com.jakewharton.rxbinding3.viewpager2;

import androidx.viewpager2.widget.ViewPager2;
import com.jakewharton.rxbinding3.InitialValueObservable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PageSelectedObservable.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\fH\u0014R\u0014\u0010\u0006\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/jakewharton/rxbinding3/viewpager2/PageSelectedObservable;", "Lcom/jakewharton/rxbinding3/InitialValueObservable;", "", "viewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "(Landroidx/viewpager2/widget/ViewPager2;)V", "initialValue", "getInitialValue", "()Ljava/lang/Integer;", "subscribeListener", "", "observer", "Lio/reactivex/Observer;", "RxPageChangeCallback", "rxbinding-viewpager2_release"}, m3637k = 1, m3638mv = {1, 1, 15})
/* loaded from: classes27.dex */
final class PageSelectedObservable extends InitialValueObservable<Integer> {
    private final ViewPager2 viewPager2;

    public PageSelectedObservable(ViewPager2 viewPager2) {
        Intrinsics.checkParameterIsNotNull(viewPager2, "viewPager2");
        this.viewPager2 = viewPager2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    public Integer getInitialValue() {
        return Integer.valueOf(this.viewPager2.getCurrentItem());
    }

    @Override // com.jakewharton.rxbinding3.InitialValueObservable
    protected void subscribeListener(Observer<? super Integer> observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        RxPageChangeCallback rxPageChangeCallback = new RxPageChangeCallback(this.viewPager2, observer);
        observer.onSubscribe(rxPageChangeCallback.getDisposable());
        this.viewPager2.registerOnPageChangeCallback(rxPageChangeCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PageSelectedObservable.kt */
    @Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/jakewharton/rxbinding3/viewpager2/PageSelectedObservable$RxPageChangeCallback;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "viewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "observer", "Lio/reactivex/Observer;", "", "(Landroidx/viewpager2/widget/ViewPager2;Lio/reactivex/Observer;)V", "disposable", "Lio/reactivex/android/MainThreadDisposable;", "getDisposable", "()Lio/reactivex/android/MainThreadDisposable;", "onPageSelected", "", "position", "rxbinding-viewpager2_release"}, m3637k = 1, m3638mv = {1, 1, 15})
    static final class RxPageChangeCallback extends ViewPager2.OnPageChangeCallback {
        private final MainThreadDisposable disposable;
        private final Observer<? super Integer> observer;
        private final ViewPager2 viewPager2;

        public RxPageChangeCallback(ViewPager2 viewPager2, Observer<? super Integer> observer) {
            Intrinsics.checkParameterIsNotNull(viewPager2, "viewPager2");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.viewPager2 = viewPager2;
            this.observer = observer;
            this.disposable = new MainThreadDisposable() { // from class: com.jakewharton.rxbinding3.viewpager2.PageSelectedObservable$RxPageChangeCallback$disposable$1
                @Override // io.reactivex.android.MainThreadDisposable
                protected void onDispose() {
                    this.this$0.viewPager2.unregisterOnPageChangeCallback(this.this$0);
                }
            };
        }

        public final MainThreadDisposable getDisposable() {
            return this.disposable;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            if (this.disposable.isDisposed()) {
                return;
            }
            this.observer.onNext(Integer.valueOf(position));
        }
    }
}
