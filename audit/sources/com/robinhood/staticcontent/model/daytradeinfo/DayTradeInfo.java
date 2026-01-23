package com.robinhood.staticcontent.model.daytradeinfo;

import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayTradeInfo.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b\u0012\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b0\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/daytradeinfo/DayTradeInfo;", "", "identifier", "", "introTitle", "introDescriptionMarkdown", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "mobileIntroImageAssetLight", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "mobileIntroImageAssetDark", "steps", "", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/daytradeinfo/DayTradeInfoStep;", "cashManagementStep", "cashManagementInterestStep", "recommendProtectionStep", "protectionEnabledStep", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Ljava/util/List;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;)V", "getIdentifier", "()Ljava/lang/String;", "getIntroTitle", "getIntroDescriptionMarkdown", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getMobileIntroImageAssetLight", "()Lcom/robinhood/contentful/model/ResourceLink;", "getMobileIntroImageAssetDark", "getSteps", "()Ljava/util/List;", "getCashManagementStep", "getCashManagementInterestStep", "getRecommendProtectionStep", "getProtectionEnabledStep", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DayTradeInfo {
    private final ResourceLink<EntryResource<DayTradeInfoStep>> cashManagementInterestStep;
    private final ResourceLink<EntryResource<DayTradeInfoStep>> cashManagementStep;
    private final String identifier;
    private final MarkdownContent introDescriptionMarkdown;
    private final String introTitle;
    private final ResourceLink<AssetResource<?>> mobileIntroImageAssetDark;
    private final ResourceLink<AssetResource<?>> mobileIntroImageAssetLight;
    private final ResourceLink<EntryResource<DayTradeInfoStep>> protectionEnabledStep;
    private final ResourceLink<EntryResource<DayTradeInfoStep>> recommendProtectionStep;
    private final List<ResourceLink<EntryResource<DayTradeInfoStep>>> steps;

    public DayTradeInfo(String identifier, String introTitle, MarkdownContent introDescriptionMarkdown, ResourceLink<AssetResource<?>> mobileIntroImageAssetLight, ResourceLink<AssetResource<?>> mobileIntroImageAssetDark, List<ResourceLink<EntryResource<DayTradeInfoStep>>> steps, ResourceLink<EntryResource<DayTradeInfoStep>> cashManagementStep, ResourceLink<EntryResource<DayTradeInfoStep>> cashManagementInterestStep, ResourceLink<EntryResource<DayTradeInfoStep>> recommendProtectionStep, ResourceLink<EntryResource<DayTradeInfoStep>> protectionEnabledStep) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(introTitle, "introTitle");
        Intrinsics.checkNotNullParameter(introDescriptionMarkdown, "introDescriptionMarkdown");
        Intrinsics.checkNotNullParameter(mobileIntroImageAssetLight, "mobileIntroImageAssetLight");
        Intrinsics.checkNotNullParameter(mobileIntroImageAssetDark, "mobileIntroImageAssetDark");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(cashManagementStep, "cashManagementStep");
        Intrinsics.checkNotNullParameter(cashManagementInterestStep, "cashManagementInterestStep");
        Intrinsics.checkNotNullParameter(recommendProtectionStep, "recommendProtectionStep");
        Intrinsics.checkNotNullParameter(protectionEnabledStep, "protectionEnabledStep");
        this.identifier = identifier;
        this.introTitle = introTitle;
        this.introDescriptionMarkdown = introDescriptionMarkdown;
        this.mobileIntroImageAssetLight = mobileIntroImageAssetLight;
        this.mobileIntroImageAssetDark = mobileIntroImageAssetDark;
        this.steps = steps;
        this.cashManagementStep = cashManagementStep;
        this.cashManagementInterestStep = cashManagementInterestStep;
        this.recommendProtectionStep = recommendProtectionStep;
        this.protectionEnabledStep = protectionEnabledStep;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getIntroTitle() {
        return this.introTitle;
    }

    public final MarkdownContent getIntroDescriptionMarkdown() {
        return this.introDescriptionMarkdown;
    }

    public final ResourceLink<AssetResource<?>> getMobileIntroImageAssetLight() {
        return this.mobileIntroImageAssetLight;
    }

    public final ResourceLink<AssetResource<?>> getMobileIntroImageAssetDark() {
        return this.mobileIntroImageAssetDark;
    }

    public final List<ResourceLink<EntryResource<DayTradeInfoStep>>> getSteps() {
        return this.steps;
    }

    public final ResourceLink<EntryResource<DayTradeInfoStep>> getCashManagementStep() {
        return this.cashManagementStep;
    }

    public final ResourceLink<EntryResource<DayTradeInfoStep>> getCashManagementInterestStep() {
        return this.cashManagementInterestStep;
    }

    public final ResourceLink<EntryResource<DayTradeInfoStep>> getRecommendProtectionStep() {
        return this.recommendProtectionStep;
    }

    public final ResourceLink<EntryResource<DayTradeInfoStep>> getProtectionEnabledStep() {
        return this.protectionEnabledStep;
    }
}
