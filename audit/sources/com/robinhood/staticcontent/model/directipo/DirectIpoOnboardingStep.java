package com.robinhood.staticcontent.model.directipo;

import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOnboardingStep.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/directipo/DirectIpoOnboardingStep;", "", "identifier", "", "title", "descriptionMarkdown", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "animation", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Lcom/robinhood/contentful/model/ResourceLink;)V", "getIdentifier", "()Ljava/lang/String;", "getTitle", "getDescriptionMarkdown", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getAnimation", "()Lcom/robinhood/contentful/model/ResourceLink;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DirectIpoOnboardingStep {
    private final ResourceLink<AssetResource<?>> animation;
    private final MarkdownContent descriptionMarkdown;
    private final String identifier;
    private final String title;

    public DirectIpoOnboardingStep(String identifier, String title, MarkdownContent descriptionMarkdown, ResourceLink<AssetResource<?>> animation) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(descriptionMarkdown, "descriptionMarkdown");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.identifier = identifier;
        this.title = title;
        this.descriptionMarkdown = descriptionMarkdown;
        this.animation = animation;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getDescriptionMarkdown() {
        return this.descriptionMarkdown;
    }

    public final ResourceLink<AssetResource<?>> getAnimation() {
        return this.animation;
    }
}
