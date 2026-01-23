package com.robinhood.staticcontent.model.daytradeinfo;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayTradeInfoStep.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00060\n¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001f\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/daytradeinfo/DayTradeInfoStep;", "", "identifier", "", "title", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "variants", "", "Lcom/robinhood/staticcontent/model/daytradeinfo/DayTradeInfoVariant;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/model/ResourceLink;Ljava/util/List;)V", "getIdentifier", "()Ljava/lang/String;", "getTitle", "getDisclosure", "()Lcom/robinhood/contentful/model/ResourceLink;", "getVariants", "()Ljava/util/List;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DayTradeInfoStep {
    private final ResourceLink<EntryResource<Disclosure>> disclosure;
    private final String identifier;
    private final String title;
    private final List<ResourceLink<EntryResource<DayTradeInfoVariant>>> variants;

    public DayTradeInfoStep(String identifier, String title, ResourceLink<EntryResource<Disclosure>> resourceLink, List<ResourceLink<EntryResource<DayTradeInfoVariant>>> variants) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(variants, "variants");
        this.identifier = identifier;
        this.title = title;
        this.disclosure = resourceLink;
        this.variants = variants;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ResourceLink<EntryResource<Disclosure>> getDisclosure() {
        return this.disclosure;
    }

    public final List<ResourceLink<EntryResource<DayTradeInfoVariant>>> getVariants() {
        return this.variants;
    }
}
