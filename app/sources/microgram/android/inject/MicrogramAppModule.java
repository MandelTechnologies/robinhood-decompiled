package microgram.android.inject;

import com.robinhood.android.tracing.RhTrace;
import com.robinhood.android.tracing.RhTrace6;
import com.robinhood.networking.OkHttpClientFactory;
import com.robinhood.networking.util.OkHttpClients;
import com.robinhood.utils.dagger.annotation.CacheDirectory;
import dagger.Lazy;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import microgram.serialization.SerializationComponent;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okio.Path;

/* compiled from: MicrogramAppModule.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H\u0007J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u000fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u000e\b\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019H\u0007¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramAppModule;", "", "<init>", "()V", "provideMicrogramCacheDirectory", "Lokio/Path;", "cacheDirectory", "Ljava/io/File;", "provideMicrogramJson", "Lkotlinx/serialization/json/Json;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "provideMicrogramTrackTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "providePackageManagementHttpCache", "Lokhttp3/Cache;", "directory", "providePackageManagementOkHttpClient", "Lokhttp3/OkHttpClient;", "factory", "Lcom/robinhood/networking/OkHttpClientFactory;", "httpCache", "provideCallFactory", "Lokhttp3/Call$Factory;", "client", "Ldagger/Lazy;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class MicrogramAppModule {
    public static final MicrogramAppModule INSTANCE = new MicrogramAppModule();

    private MicrogramAppModule() {
    }

    public final Path provideMicrogramCacheDirectory(@CacheDirectory File cacheDirectory) {
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        return Path.Companion.get$default(Path.INSTANCE, cacheDirectory, false, 1, (Object) null).resolve("microgram");
    }

    public final Json provideMicrogramJson(SerializersModule serializersModule) {
        Intrinsics.checkNotNullParameter(serializersModule, "serializersModule");
        return SerializationComponent.INSTANCE.defaultJson(serializersModule);
    }

    public final RhTrace6 provideMicrogramTrackTrace() {
        return RhTrace.INSTANCE.getApp().forTrack("Microgram");
    }

    public final Cache providePackageManagementHttpCache(Path directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        File file = directory.resolve("pm-http").toFile();
        file.mkdirs();
        return new Cache(file, 5242880L);
    }

    public final OkHttpClient providePackageManagementOkHttpClient(OkHttpClientFactory factory, Cache httpCache) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(httpCache, "httpCache");
        return OkHttpClientFactory.newClient$default(factory, httpCache, false, null, 6, null);
    }

    public final Call.Factory provideCallFactory(Lazy<OkHttpClient> client) {
        Intrinsics.checkNotNullParameter(client, "client");
        return OkHttpClients.asCallFactory(client);
    }
}
