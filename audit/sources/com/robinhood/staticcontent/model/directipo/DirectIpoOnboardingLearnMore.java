package com.robinhood.staticcontent.model.directipo;

import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOnboardingLearnMore.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00030\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/directipo/DirectIpoOnboardingLearnMore;", "", "icon", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/directipo/MultipleDensityImageAsset;", "title", "", "descriptionMarkdown", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "actions", "", "Lcom/robinhood/staticcontent/model/directipo/DirectIpoOnboardingLearnMoreAction;", "<init>", "(Lcom/robinhood/contentful/model/ResourceLink;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/util/List;)V", "getIcon", "()Lcom/robinhood/contentful/model/ResourceLink;", "getTitle", "()Ljava/lang/String;", "getDescriptionMarkdown", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getActions", "()Ljava/util/List;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DirectIpoOnboardingLearnMore {
    private final List<ResourceLink<EntryResource<DirectIpoOnboardingLearnMoreAction>>> actions;
    private final MarkdownContent descriptionMarkdown;
    private final ResourceLink<EntryResource<MultipleDensityImageAsset>> icon;
    private final String title;

    public DirectIpoOnboardingLearnMore(ResourceLink<EntryResource<MultipleDensityImageAsset>> icon, String title, MarkdownContent descriptionMarkdown, List<ResourceLink<EntryResource<DirectIpoOnboardingLearnMoreAction>>> actions) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(descriptionMarkdown, "descriptionMarkdown");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.icon = icon;
        this.title = title;
        this.descriptionMarkdown = descriptionMarkdown;
        this.actions = actions;
    }

    public final ResourceLink<EntryResource<MultipleDensityImageAsset>> getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getDescriptionMarkdown() {
        return this.descriptionMarkdown;
    }

    public final List<ResourceLink<EntryResource<DirectIpoOnboardingLearnMoreAction>>> getActions() {
        return this.actions;
    }
}
