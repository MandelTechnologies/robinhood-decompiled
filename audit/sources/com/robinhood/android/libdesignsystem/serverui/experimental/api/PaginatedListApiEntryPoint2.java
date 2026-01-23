package com.robinhood.android.libdesignsystem.serverui.experimental.api;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaginatedListApiEntryPoint.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"rememberPaginatedListPageApi", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/api/PaginatedListPageApi;", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/libdesignsystem/serverui/experimental/api/PaginatedListPageApi;", "rememberMoshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/utils/moshi/LazyMoshi;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.api.PaginatedListApiEntryPointKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PaginatedListApiEntryPoint2 {
    public static final PaginatedListPageApi rememberPaginatedListPageApi(Composer composer, int i) {
        ComponentCallbacks2 componentCallbacks2;
        composer.startReplaceGroup(-196434847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-196434847, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.api.rememberPaginatedListPageApi (PaginatedListApiEntryPoint.kt:11)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            if (context instanceof Application) {
                componentCallbacks2 = (Application) context;
            } else {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                componentCallbacks2 = (Application) applicationContext;
            }
            objRememberedValue = ((PaginatedListApiEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).paginatedListPageApi();
            composer.updateRememberedValue(objRememberedValue);
        }
        PaginatedListPageApi paginatedListPageApi = (PaginatedListPageApi) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return paginatedListPageApi;
    }

    public static final LazyMoshi rememberMoshi(Composer composer, int i) {
        ComponentCallbacks2 componentCallbacks2;
        composer.startReplaceGroup(-1391423145);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1391423145, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.api.rememberMoshi (PaginatedListApiEntryPoint.kt:19)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            if (context instanceof Application) {
                componentCallbacks2 = (Application) context;
            } else {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                componentCallbacks2 = (Application) applicationContext;
            }
            objRememberedValue = ((PaginatedListApiEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).moshi();
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyMoshi lazyMoshi = (LazyMoshi) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return lazyMoshi;
    }
}
