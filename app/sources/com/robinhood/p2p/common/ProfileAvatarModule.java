package com.robinhood.p2p.common;

import android.app.Application;
import coil.ImageLoader;
import com.robinhood.api.annotation.BrokebackOkHttpClient;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* compiled from: ProfileAvatarModule.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/p2p/common/ProfileAvatarModule;", "", "<init>", "()V", "provideImageLoader", "Lcoil/ImageLoader;", "application", "Landroid/app/Application;", "okHttpClient", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "lib-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class ProfileAvatarModule {
    public static final int $stable = 0;
    public static final ProfileAvatarModule INSTANCE = new ProfileAvatarModule();

    private ProfileAvatarModule() {
    }

    public final ImageLoader provideImageLoader(Application application, @BrokebackOkHttpClient final Lazy<OkHttpClient> okHttpClient) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        return new ImageLoader.Builder(application).okHttpClient(new Function0() { // from class: com.robinhood.p2p.common.ProfileAvatarModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileAvatarModule.provideImageLoader$lambda$0(okHttpClient);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient provideImageLoader$lambda$0(Lazy lazy) {
        Object obj = lazy.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (OkHttpClient) obj;
    }
}
