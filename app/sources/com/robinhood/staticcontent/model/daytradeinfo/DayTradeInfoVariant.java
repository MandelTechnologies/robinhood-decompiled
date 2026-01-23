package com.robinhood.staticcontent.model.daytradeinfo;

import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayTradeInfoVariant.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b\u0012\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/daytradeinfo/DayTradeInfoVariant;", "", "identifier", "", "name", "descriptionMarkdown", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "mobileImageAssetLight", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "mobileImageAssetDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;)V", "getIdentifier", "()Ljava/lang/String;", "getName", "getDescriptionMarkdown", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getMobileImageAssetLight", "()Lcom/robinhood/contentful/model/ResourceLink;", "getMobileImageAssetDark", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DayTradeInfoVariant {
    private final MarkdownContent descriptionMarkdown;
    private final String identifier;
    private final ResourceLink<AssetResource<?>> mobileImageAssetDark;
    private final ResourceLink<AssetResource<?>> mobileImageAssetLight;
    private final String name;

    public DayTradeInfoVariant(String identifier, String name, MarkdownContent descriptionMarkdown, ResourceLink<AssetResource<?>> mobileImageAssetLight, ResourceLink<AssetResource<?>> mobileImageAssetDark) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptionMarkdown, "descriptionMarkdown");
        Intrinsics.checkNotNullParameter(mobileImageAssetLight, "mobileImageAssetLight");
        Intrinsics.checkNotNullParameter(mobileImageAssetDark, "mobileImageAssetDark");
        this.identifier = identifier;
        this.name = name;
        this.descriptionMarkdown = descriptionMarkdown;
        this.mobileImageAssetLight = mobileImageAssetLight;
        this.mobileImageAssetDark = mobileImageAssetDark;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getName() {
        return this.name;
    }

    public final MarkdownContent getDescriptionMarkdown() {
        return this.descriptionMarkdown;
    }

    public final ResourceLink<AssetResource<?>> getMobileImageAssetLight() {
        return this.mobileImageAssetLight;
    }

    public final ResourceLink<AssetResource<?>> getMobileImageAssetDark() {
        return this.mobileImageAssetDark;
    }
}
