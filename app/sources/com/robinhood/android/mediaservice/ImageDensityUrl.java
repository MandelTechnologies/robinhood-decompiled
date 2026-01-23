package com.robinhood.android.mediaservice;

import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.extensions.ContextsUiExtensions2;
import com.robinhood.utils.extensions.DensitySpecs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: ImageDensityUrl.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/ImageDensityUrl;", "", "imageFolderPath", "", "imageNamePrefix", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageDensityUrl", "Lokhttp3/HttpUrl;", "density", "Lcom/robinhood/utils/extensions/DensitySpec;", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ImageDensityUrl {
    public static final int $stable = 0;
    private final String imageFolderPath;
    private final String imageNamePrefix;

    public ImageDensityUrl(String imageFolderPath, String str) {
        Intrinsics.checkNotNullParameter(imageFolderPath, "imageFolderPath");
        this.imageFolderPath = imageFolderPath;
        this.imageNamePrefix = str;
    }

    public /* synthetic */ ImageDensityUrl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final HttpUrl getImageDensityUrl(ContextsUiExtensions2 density) {
        Intrinsics.checkNotNullParameter(density, "density");
        HttpUrl.Builder builderAddPathSegments = Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegments(this.imageFolderPath);
        String str = this.imageNamePrefix;
        if (str == null) {
            str = "";
        }
        return builderAddPathSegments.addPathSegment(str + DensitySpecs.getMultiplierString(density) + ".png").build();
    }
}
