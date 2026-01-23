package com.robinhood.android.mediaservice;

import android.content.Context;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.compose.AsyncImagePainter;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhimage.BaseImageLoader;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.api.annotation.BrokebackOkHttpClient;
import com.robinhood.utils.http.Headers;
import dagger.Lazy;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: RedirectImageLoader.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010JO\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u001bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/RedirectImageLoader;", "", "client", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "context", "Landroid/content/Context;", "<init>", "(Ldagger/Lazy;Landroid/content/Context;)V", "removeRhHeaderInterceptor", "Lokhttp3/Interceptor;", "loader", "Lcom/robinhood/android/rhimage/ImageLoader;", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Lcom/robinhood/android/rhimage/ImageLoader$ImageRequest;", "url", "Lokhttp3/HttpUrl;", "rememberAsyncImagePainter", "Lcoil/compose/AsyncImagePainter;", "model", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "", "(Ljava/lang/Object;Landroidx/compose/ui/layout/ContentScale;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class RedirectImageLoader {
    public static final int $stable = 8;
    private final ImageLoader loader;
    private final Interceptor removeRhHeaderInterceptor;

    public RedirectImageLoader(@BrokebackOkHttpClient final Lazy<OkHttpClient> client, Context context) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(context, "context");
        this.removeRhHeaderInterceptor = new Interceptor() { // from class: com.robinhood.android.mediaservice.RedirectImageLoader$removeRhHeaderInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) throws IOException {
                Intrinsics.checkNotNullParameter(chain, "chain");
                Request request = chain.request();
                Response responseProceed = chain.proceed(request);
                String strHeader$default = Response.header$default(responseProceed, Headers.LOCATION, null, 2, null);
                HttpUrl httpUrl = strHeader$default != null ? HttpUrl.INSTANCE.parse(strHeader$default) : null;
                if (httpUrl == null) {
                    return responseProceed;
                }
                Request.Builder builderUrl = request.newBuilder().url(httpUrl);
                Iterator<T> it = request.getHeaders().names().iterator();
                while (it.hasNext()) {
                    builderUrl.removeHeader((String) it.next());
                }
                return chain.proceed(builderUrl.build());
            }
        };
        this.loader = new BaseImageLoader.Builder(context).okHttpClient(new Function0() { // from class: com.robinhood.android.mediaservice.RedirectImageLoader$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedirectImageLoader.loader$lambda$0(client, this);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient loader$lambda$0(Lazy lazy, RedirectImageLoader redirectImageLoader) {
        return ((OkHttpClient) lazy.get()).newBuilder().addInterceptor(redirectImageLoader.removeRhHeaderInterceptor).build();
    }

    public final ImageLoader.ImageRequest load(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.loader.load(url.getUrl());
    }

    public final AsyncImagePainter rememberAsyncImagePainter(Object obj, ContentScale contentScale, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function12, Composer composer, int i, int i2) {
        composer.startReplaceGroup(538960361);
        if ((i2 & 2) != 0) {
            contentScale = ContentScale.INSTANCE.getFit();
        }
        ContentScale contentScale2 = contentScale;
        if ((i2 & 4) != 0) {
            function1 = AsyncImagePainter.INSTANCE.getDefaultTransform();
        }
        Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function13 = function1;
        if ((i2 & 8) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.mediaservice.RedirectImageLoader$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RedirectImageLoader.rememberAsyncImagePainter$lambda$2$lambda$1((AsyncImagePainter.State) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function12 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        }
        Function1<? super AsyncImagePainter.State, Unit> function14 = function12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(538960361, i, -1, "com.robinhood.android.mediaservice.RedirectImageLoader.rememberAsyncImagePainter (RedirectImageLoader.kt:64)");
        }
        int i3 = i >> 3;
        AsyncImagePainter asyncImagePainterRememberAsyncImagePainter = this.loader.rememberAsyncImagePainter(obj, function13, function14, contentScale2, composer, (i & 14) | (i3 & 112) | (i3 & 896) | ((i << 6) & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return asyncImagePainterRememberAsyncImagePainter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberAsyncImagePainter$lambda$2$lambda$1(AsyncImagePainter.State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
