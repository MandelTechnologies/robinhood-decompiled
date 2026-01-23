package com.withpersona.sdk2.camera;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Result;
import kotlinx.coroutines.flow.SharedFlow2;

/* loaded from: classes26.dex */
public final class CameraModule_ParsedSideResultFactory implements Factory<SharedFlow2<Result<GovernmentIdFeed5>>> {
    private final CameraModule module;

    public CameraModule_ParsedSideResultFactory(CameraModule cameraModule) {
        this.module = cameraModule;
    }

    @Override // javax.inject.Provider
    public SharedFlow2<Result<GovernmentIdFeed5>> get() {
        return parsedSideResult(this.module);
    }

    public static CameraModule_ParsedSideResultFactory create(CameraModule cameraModule) {
        return new CameraModule_ParsedSideResultFactory(cameraModule);
    }

    public static SharedFlow2<Result<GovernmentIdFeed5>> parsedSideResult(CameraModule cameraModule) {
        return (SharedFlow2) Preconditions.checkNotNullFromProvides(cameraModule.parsedSideResult());
    }
}
