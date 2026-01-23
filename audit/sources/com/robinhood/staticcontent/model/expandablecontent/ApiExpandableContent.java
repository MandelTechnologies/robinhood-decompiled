package com.robinhood.staticcontent.model.expandablecontent;

import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiExpandableContent.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/expandablecontent/ApiExpandableContent;", "", "title", "", "subtitle", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "content", "", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/expandablecontent/ApiExpandableContentSection;", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getContent", "()Ljava/util/List;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ApiExpandableContent {
    private final List<ResourceLink<EntryResource<ApiExpandableContentSection>>> content;
    private final MarkdownContent subtitle;
    private final String title;

    public ApiExpandableContent(String title, MarkdownContent subtitle, List<ResourceLink<EntryResource<ApiExpandableContentSection>>> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.content = list;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getSubtitle() {
        return this.subtitle;
    }

    public final List<ResourceLink<EntryResource<ApiExpandableContentSection>>> getContent() {
        return this.content;
    }
}
