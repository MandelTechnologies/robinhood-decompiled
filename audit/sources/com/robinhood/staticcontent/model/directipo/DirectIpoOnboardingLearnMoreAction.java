package com.robinhood.staticcontent.model.directipo;

import android.net.Uri;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOnboardingLearnMoreAction.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/directipo/DirectIpoOnboardingLearnMoreAction;", "", "identifier", "", "icon", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/directipo/MultipleDensityImageAsset;", "title", "description", "actionUrl", "Landroid/net/Uri;", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/model/ResourceLink;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "getIdentifier", "()Ljava/lang/String;", "getIcon", "()Lcom/robinhood/contentful/model/ResourceLink;", "getTitle", "getDescription", "getActionUrl", "()Landroid/net/Uri;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DirectIpoOnboardingLearnMoreAction {
    private final Uri actionUrl;
    private final String description;
    private final ResourceLink<EntryResource<MultipleDensityImageAsset>> icon;
    private final String identifier;
    private final String title;

    public DirectIpoOnboardingLearnMoreAction(String identifier, ResourceLink<EntryResource<MultipleDensityImageAsset>> icon, String title, String description, Uri actionUrl) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
        this.identifier = identifier;
        this.icon = icon;
        this.title = title;
        this.description = description;
        this.actionUrl = actionUrl;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final ResourceLink<EntryResource<MultipleDensityImageAsset>> getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Uri getActionUrl() {
        return this.actionUrl;
    }
}
