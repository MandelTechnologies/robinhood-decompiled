package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiControllerParams;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.OfflineModeApiController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiController.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiControllerModule;", "", "params", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiControllerParams;", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiControllerParams;)V", "apiController", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiController;", "fallbackModeApiController", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeApiController;", "offlineModeApiController", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/OfflineModeApiController$Factory;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ApiControllerModule {
    private final ApiControllerParams params;

    public ApiControllerModule(ApiControllerParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
    }

    public final ApiController apiController(FallbackModeApiController fallbackModeApiController, OfflineModeApiController.Factory offlineModeApiController) {
        Intrinsics.checkNotNullParameter(fallbackModeApiController, "fallbackModeApiController");
        Intrinsics.checkNotNullParameter(offlineModeApiController, "offlineModeApiController");
        ApiControllerParams apiControllerParams = this.params;
        if (apiControllerParams instanceof ApiControllerParams.Offline) {
            return offlineModeApiController.create(((ApiControllerParams.Offline) apiControllerParams).getStaticTemplateResourceId());
        }
        if (apiControllerParams instanceof ApiControllerParams.Fallback) {
            return fallbackModeApiController;
        }
        throw new NoWhenBranchMatchedException();
    }
}
