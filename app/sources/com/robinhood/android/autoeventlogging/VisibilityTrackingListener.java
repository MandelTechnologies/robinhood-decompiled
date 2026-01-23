package com.robinhood.android.autoeventlogging;

import android.graphics.Rect;
import android.view.View;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VisibilityTrackingListener.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/VisibilityTrackingListener;", "Landroid/view/View$OnAttachStateChangeListener;", "<init>", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "wasVisible", "", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "Companion", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class VisibilityTrackingListener implements View.OnAttachStateChangeListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Rect clipRect = new Rect();
    private Disposable disposable;
    private boolean wasVisible;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewAttachedToWindow$lambda$0() {
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(final View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.disposable = RxView.preDraws(v, new Function0() { // from class: com.robinhood.android.autoeventlogging.VisibilityTrackingListener$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(VisibilityTrackingListener.onViewAttachedToWindow$lambda$0());
            }
        }).throttleLatest(100L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread()).takeWhile(new Predicate() { // from class: com.robinhood.android.autoeventlogging.VisibilityTrackingListener.onViewAttachedToWindow.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AutoLoggingConfig loggingConfig = ViewsKt.getLoggingConfig(v);
                return (loggingConfig == null || loggingConfig.getExcludeFromAutomaticAppearLogging()) ? false : true;
            }
        }).subscribe(new Consumer() { // from class: com.robinhood.android.autoeventlogging.VisibilityTrackingListener.onViewAttachedToWindow.3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Unit unit) {
                boolean zIsCurrentlyVisible = VisibilityTrackingListener.INSTANCE.isCurrentlyVisible(v);
                if (zIsCurrentlyVisible && !this.wasVisible) {
                    ViewsKt.logAppear$default(v, null, false, 3, null);
                }
                this.wasVisible = zIsCurrentlyVisible;
            }
        }, new Consumer() { // from class: com.robinhood.android.autoeventlogging.VisibilityTrackingListener.onViewAttachedToWindow.4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                CrashReporter.Companion companion = CrashReporter.INSTANCE;
                Intrinsics.checkNotNull(th);
                CrashReporter.DefaultImpls.reportNonFatal$default(companion, new VisibilityTrackingListener2(th), false, null, 6, null);
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.wasVisible = false;
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* compiled from: VisibilityTrackingListener.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/VisibilityTrackingListener$Companion;", "", "<init>", "()V", "clipRect", "Landroid/graphics/Rect;", "isCurrentlyVisible", "", "Landroid/view/View;", "(Landroid/view/View;)Z", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isCurrentlyVisible(View view) {
            return view.getVisibility() == 0 && view.getGlobalVisibleRect(VisibilityTrackingListener.clipRect);
        }
    }
}
