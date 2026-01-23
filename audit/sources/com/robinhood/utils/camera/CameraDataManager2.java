package com.robinhood.utils.camera;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraDataManager.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0004\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b \t*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060\u00060\u00052\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u000bH\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/utils/camera/DefaultCameraDataManager;", "Lcom/robinhood/utils/camera/CameraDataManager;", "<init>", "()V", "processData", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "callable", "Lkotlin/Function0;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.camera.DefaultCameraDataManager, reason: use source file name */
/* loaded from: classes12.dex */
public final class CameraDataManager2 implements CameraDataManager {
    @Override // com.robinhood.utils.camera.CameraDataManager
    public Observable<Tuples2<Boolean, Bitmap>> processData(final Function0<Tuples2<Boolean, Bitmap>> callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Observable<Tuples2<Boolean, Bitmap>> observableFromCallable = Observable.fromCallable(new Callable(callable) { // from class: com.robinhood.utils.camera.DefaultCameraDataManager$sam$java_util_concurrent_Callable$0
            private final /* synthetic */ Function0 function;

            {
                Intrinsics.checkNotNullParameter(callable, "function");
                this.function = callable;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.function.invoke();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFromCallable, "fromCallable(...)");
        return observableFromCallable;
    }
}
