package com.robinhood.staticcontent.model.directipo;

import android.net.Uri;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOnboarding.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001By\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00030\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/directipo/DirectIpoOnboarding;", "", "mobileIntroImageAsset", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/directipo/MultipleDensityImageAsset;", "mobileIntroForegroundColor", "", "mobileIntroBackgroundColor", "title", "descriptionMarkdown", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "steps", "", "Lcom/robinhood/staticcontent/model/directipo/DirectIpoOnboardingStep;", "viewAvailableIPOsUrl", "Landroid/net/Uri;", "viewAvailableIPOsButtonTitle", "learnMore", "Lcom/robinhood/staticcontent/model/directipo/DirectIpoOnboardingLearnMore;", "<init>", "(Lcom/robinhood/contentful/model/ResourceLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/util/List;Landroid/net/Uri;Ljava/lang/String;Lcom/robinhood/contentful/model/ResourceLink;)V", "getMobileIntroImageAsset", "()Lcom/robinhood/contentful/model/ResourceLink;", "getMobileIntroForegroundColor", "()Ljava/lang/String;", "getMobileIntroBackgroundColor", "getTitle", "getDescriptionMarkdown", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getSteps", "()Ljava/util/List;", "getViewAvailableIPOsUrl", "()Landroid/net/Uri;", "getViewAvailableIPOsButtonTitle", "getLearnMore", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DirectIpoOnboarding {
    private final MarkdownContent descriptionMarkdown;
    private final ResourceLink<EntryResource<DirectIpoOnboardingLearnMore>> learnMore;
    private final String mobileIntroBackgroundColor;
    private final String mobileIntroForegroundColor;
    private final ResourceLink<EntryResource<MultipleDensityImageAsset>> mobileIntroImageAsset;
    private final List<ResourceLink<EntryResource<DirectIpoOnboardingStep>>> steps;
    private final String title;
    private final String viewAvailableIPOsButtonTitle;
    private final Uri viewAvailableIPOsUrl;

    public DirectIpoOnboarding(ResourceLink<EntryResource<MultipleDensityImageAsset>> mobileIntroImageAsset, String mobileIntroForegroundColor, String mobileIntroBackgroundColor, String title, MarkdownContent descriptionMarkdown, List<ResourceLink<EntryResource<DirectIpoOnboardingStep>>> steps, Uri viewAvailableIPOsUrl, String viewAvailableIPOsButtonTitle, ResourceLink<EntryResource<DirectIpoOnboardingLearnMore>> learnMore) {
        Intrinsics.checkNotNullParameter(mobileIntroImageAsset, "mobileIntroImageAsset");
        Intrinsics.checkNotNullParameter(mobileIntroForegroundColor, "mobileIntroForegroundColor");
        Intrinsics.checkNotNullParameter(mobileIntroBackgroundColor, "mobileIntroBackgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(descriptionMarkdown, "descriptionMarkdown");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(viewAvailableIPOsUrl, "viewAvailableIPOsUrl");
        Intrinsics.checkNotNullParameter(viewAvailableIPOsButtonTitle, "viewAvailableIPOsButtonTitle");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        this.mobileIntroImageAsset = mobileIntroImageAsset;
        this.mobileIntroForegroundColor = mobileIntroForegroundColor;
        this.mobileIntroBackgroundColor = mobileIntroBackgroundColor;
        this.title = title;
        this.descriptionMarkdown = descriptionMarkdown;
        this.steps = steps;
        this.viewAvailableIPOsUrl = viewAvailableIPOsUrl;
        this.viewAvailableIPOsButtonTitle = viewAvailableIPOsButtonTitle;
        this.learnMore = learnMore;
    }

    public final ResourceLink<EntryResource<MultipleDensityImageAsset>> getMobileIntroImageAsset() {
        return this.mobileIntroImageAsset;
    }

    public final String getMobileIntroForegroundColor() {
        return this.mobileIntroForegroundColor;
    }

    public final String getMobileIntroBackgroundColor() {
        return this.mobileIntroBackgroundColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getDescriptionMarkdown() {
        return this.descriptionMarkdown;
    }

    public final List<ResourceLink<EntryResource<DirectIpoOnboardingStep>>> getSteps() {
        return this.steps;
    }

    public final Uri getViewAvailableIPOsUrl() {
        return this.viewAvailableIPOsUrl;
    }

    public final String getViewAvailableIPOsButtonTitle() {
        return this.viewAvailableIPOsButtonTitle;
    }

    public final ResourceLink<EntryResource<DirectIpoOnboardingLearnMore>> getLearnMore() {
        return this.learnMore;
    }
}
