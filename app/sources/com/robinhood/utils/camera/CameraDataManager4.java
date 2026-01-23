package com.robinhood.utils.camera;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraDataManager.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0004\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t \n*\u0015\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0018\u00010\u00060\u00060\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\fH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/camera/TestCameraDataManager;", "Lcom/robinhood/utils/camera/CameraDataManager;", "<init>", "()V", "processData", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Landroid/graphics/Bitmap;", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "callable", "Lkotlin/Function0;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.camera.TestCameraDataManager, reason: use source file name */
/* loaded from: classes12.dex */
public final class CameraDataManager4 implements CameraDataManager {
    @Override // com.robinhood.utils.camera.CameraDataManager
    public Observable<Tuples2<Boolean, Bitmap>> processData(Function0<Tuples2<Boolean, Bitmap>> callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Observable<Tuples2<Boolean, Bitmap>> observableJust = Observable.just(Tuples4.m3642to(Boolean.FALSE, Bitmap.createBitmap(5, 5, Bitmap.Config.ARGB_8888)));
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }
}
