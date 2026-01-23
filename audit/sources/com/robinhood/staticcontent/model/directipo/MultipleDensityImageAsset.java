package com.robinhood.staticcontent.model.directipo;

import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultipleDensityImageAsset.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001b\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001b\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/directipo/MultipleDensityImageAsset;", "", "image1x", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "image1Dot5x", "image2x", "image3x", "<init>", "(Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;)V", "getImage1x", "()Lcom/robinhood/contentful/model/ResourceLink;", "getImage1Dot5x", "getImage2x", "getImage3x", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MultipleDensityImageAsset {
    private final ResourceLink<AssetResource<?>> image1Dot5x;
    private final ResourceLink<AssetResource<?>> image1x;
    private final ResourceLink<AssetResource<?>> image2x;
    private final ResourceLink<AssetResource<?>> image3x;

    public MultipleDensityImageAsset(ResourceLink<AssetResource<?>> image1x, ResourceLink<AssetResource<?>> image1Dot5x, ResourceLink<AssetResource<?>> image2x, ResourceLink<AssetResource<?>> image3x) {
        Intrinsics.checkNotNullParameter(image1x, "image1x");
        Intrinsics.checkNotNullParameter(image1Dot5x, "image1Dot5x");
        Intrinsics.checkNotNullParameter(image2x, "image2x");
        Intrinsics.checkNotNullParameter(image3x, "image3x");
        this.image1x = image1x;
        this.image1Dot5x = image1Dot5x;
        this.image2x = image2x;
        this.image3x = image3x;
    }

    public final ResourceLink<AssetResource<?>> getImage1x() {
        return this.image1x;
    }

    public final ResourceLink<AssetResource<?>> getImage1Dot5x() {
        return this.image1Dot5x;
    }

    public final ResourceLink<AssetResource<?>> getImage2x() {
        return this.image2x;
    }

    public final ResourceLink<AssetResource<?>> getImage3x() {
        return this.image3x;
    }
}
