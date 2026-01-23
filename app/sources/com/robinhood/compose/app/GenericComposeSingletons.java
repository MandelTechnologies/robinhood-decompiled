package com.robinhood.compose.app;

import com.robinhood.android.plt.contract.PltManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericComposeSingletons.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/app/GenericComposeSingletons;", "", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "<init>", "(Lcom/robinhood/android/plt/contract/PltManager;)V", "getPltManager$lib_compose_app_externalDebug", "()Lcom/robinhood/android/plt/contract/PltManager;", "lib-compose-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GenericComposeSingletons {
    public static final int $stable = 8;
    private final PltManager pltManager;

    public GenericComposeSingletons(PltManager pltManager) {
        Intrinsics.checkNotNullParameter(pltManager, "pltManager");
        this.pltManager = pltManager;
    }

    /* renamed from: getPltManager$lib_compose_app_externalDebug, reason: from getter */
    public final PltManager getPltManager() {
        return this.pltManager;
    }
}
