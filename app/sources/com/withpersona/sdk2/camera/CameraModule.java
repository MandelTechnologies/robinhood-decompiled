package com.withpersona.sdk2.camera;

import com.withpersona.sdk2.camera.selfie.SelfieFrameInfo;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: CameraModule.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0005H\u0007J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0017¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraModule;", "", "<init>", "()V", "selfiePose", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/withpersona/sdk2/camera/selfie/SelfieFrameInfo;", "parsedSideResult", "Lkotlin/Result;", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone;", "cameraStatsManager", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;", "realCameraStatsManager", "Ldagger/Lazy;", "Lcom/withpersona/sdk2/camera/stats/RealCameraStatsManager;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public class CameraModule {
    public final SharedFlow2<SelfieFrameInfo> selfiePose() {
        return SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public final SharedFlow2<Result<GovernmentIdFeed5>> parsedSideResult() {
        return SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public CameraStatsManager cameraStatsManager(Lazy<RealCameraStatsManager> realCameraStatsManager) {
        Intrinsics.checkNotNullParameter(realCameraStatsManager, "realCameraStatsManager");
        RealCameraStatsManager realCameraStatsManager2 = realCameraStatsManager.get();
        Intrinsics.checkNotNullExpressionValue(realCameraStatsManager2, "get(...)");
        return realCameraStatsManager2;
    }
}
