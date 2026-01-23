package com.withpersona.sdk2.inquiry.fallbackmode;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.navigation.compose.NavTransition2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;

/* compiled from: FallbackModeManager.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/fallbackmode/FallbackModeManager;", "", "", "sessionToken", CarResultComposable2.BODY, "Lretrofit2/Response;", NavTransition2.KEY_TRANSITION, "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isFallbackModeActive", "()Z", "fallback-mode_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface FallbackModeManager {
    boolean isFallbackModeActive();

    Object transition(String str, Object obj, Continuation<? super Response<?>> continuation);
}
