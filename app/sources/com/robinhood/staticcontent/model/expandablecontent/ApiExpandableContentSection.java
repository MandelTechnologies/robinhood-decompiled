package com.robinhood.staticcontent.model.expandablecontent;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiExpandableContentSection.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\t\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/expandablecontent/ApiExpandableContentSection;", "", "header", "", CarResultComposable2.BODY, "Lcom/robinhood/contentful/markdown/MarkdownContent;", "lightModeAsset", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "darkModeAsset", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/markdown/MarkdownContent;)V", "getHeader", "()Ljava/lang/String;", "getBody", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getLightModeAsset", "()Lcom/robinhood/contentful/model/ResourceLink;", "getDarkModeAsset", "getDisclosure", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ApiExpandableContentSection {
    private final MarkdownContent body;
    private final ResourceLink<AssetResource<?>> darkModeAsset;
    private final MarkdownContent disclosure;
    private final String header;
    private final ResourceLink<AssetResource<?>> lightModeAsset;

    public ApiExpandableContentSection(String header, MarkdownContent body, ResourceLink<AssetResource<?>> resourceLink, ResourceLink<AssetResource<?>> resourceLink2, MarkdownContent markdownContent) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        this.header = header;
        this.body = body;
        this.lightModeAsset = resourceLink;
        this.darkModeAsset = resourceLink2;
        this.disclosure = markdownContent;
    }

    public final String getHeader() {
        return this.header;
    }

    public final MarkdownContent getBody() {
        return this.body;
    }

    public final ResourceLink<AssetResource<?>> getLightModeAsset() {
        return this.lightModeAsset;
    }

    public final ResourceLink<AssetResource<?>> getDarkModeAsset() {
        return this.darkModeAsset;
    }

    public final MarkdownContent getDisclosure() {
        return this.disclosure;
    }
}
