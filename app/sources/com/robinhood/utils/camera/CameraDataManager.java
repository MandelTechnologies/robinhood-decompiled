package com.robinhood.utils.camera;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function0;

/* compiled from: CameraDataManager.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/camera/CameraDataManager;", "", "processData", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Landroid/graphics/Bitmap;", "callable", "Lkotlin/Function0;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface CameraDataManager {
    Observable<Tuples2<Boolean, Bitmap>> processData(Function0<Tuples2<Boolean, Bitmap>> callable);
}
