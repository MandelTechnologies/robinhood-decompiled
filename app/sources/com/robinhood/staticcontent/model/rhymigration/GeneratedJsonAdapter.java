package com.robinhood.staticcontent.model.rhymigration;

import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.FancyAgreement;
import com.robinhood.staticcontent.model.MobileContentPage;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyMigrationJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigration;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "resourceLinkOfEntryResourceOfRhyMigrationFeaturePageAdapter", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationFeaturePage;", "resourceLinkOfEntryResourceOfRhyMigrationContrastPageAdapter", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationContrastPage;", "resourceLinkOfEntryResourceOfRhyMigrationReviewPageAdapter", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationReviewPage;", "resourceLinkOfEntryResourceOfRhyMigrationCardPageAdapter", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationCardPage;", "resourceLinkOfEntryResourceOfFancyAgreementAdapter", "Lcom/robinhood/staticcontent/model/FancyAgreement;", "resourceLinkOfEntryResourceOfRhyMigrationLoadingAnimationAdapter", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationLoadingAnimation;", "nullableResourceLinkOfEntryResourceOfRhyMigrationCmShutdownUpsellAdapter", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationCmShutdownUpsell;", "nullableResourceLinkOfEntryResourceOfMobileContentPageAdapter", "Lcom/robinhood/staticcontent/model/MobileContentPage;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.staticcontent.model.rhymigration.RhyMigrationJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<RhyMigration> {
    private final JsonAdapter<ResourceLink<EntryResource<MobileContentPage>>> nullableResourceLinkOfEntryResourceOfMobileContentPageAdapter;
    private final JsonAdapter<ResourceLink<EntryResource<RhyMigrationCmShutdownUpsell>>> nullableResourceLinkOfEntryResourceOfRhyMigrationCmShutdownUpsellAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<ResourceLink<EntryResource<FancyAgreement>>> resourceLinkOfEntryResourceOfFancyAgreementAdapter;
    private final JsonAdapter<ResourceLink<EntryResource<RhyMigrationCardPage>>> resourceLinkOfEntryResourceOfRhyMigrationCardPageAdapter;
    private final JsonAdapter<ResourceLink<EntryResource<RhyMigrationContrastPage>>> resourceLinkOfEntryResourceOfRhyMigrationContrastPageAdapter;
    private final JsonAdapter<ResourceLink<EntryResource<RhyMigrationFeaturePage>>> resourceLinkOfEntryResourceOfRhyMigrationFeaturePageAdapter;
    private final JsonAdapter<ResourceLink<EntryResource<RhyMigrationLoadingAnimation>>> resourceLinkOfEntryResourceOfRhyMigrationLoadingAnimationAdapter;
    private final JsonAdapter<ResourceLink<EntryResource<RhyMigrationReviewPage>>> resourceLinkOfEntryResourceOfRhyMigrationReviewPageAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsM3152of = JsonReader.Options.m3152of("featurePage1", "featurePage2", "featurePage3", "contrastPage", "reviewPage", "cardPageAndroidPhysical", "cardPageAndroidVirtual", "agreement1", "agreement2", "loadingAnimation", "cmShutdownUpsellPage", "optOutPage");
        Intrinsics.checkNotNullExpressionValue(optionsM3152of, "of(...)");
        this.options = optionsM3152of;
        JsonAdapter<ResourceLink<EntryResource<RhyMigrationFeaturePage>>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, RhyMigrationFeaturePage.class)), SetsKt.emptySet(), "featurePage1");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.resourceLinkOfEntryResourceOfRhyMigrationFeaturePageAdapter = jsonAdapterAdapter;
        JsonAdapter<ResourceLink<EntryResource<RhyMigrationContrastPage>>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, RhyMigrationContrastPage.class)), SetsKt.emptySet(), "contrastPage");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.resourceLinkOfEntryResourceOfRhyMigrationContrastPageAdapter = jsonAdapterAdapter2;
        JsonAdapter<ResourceLink<EntryResource<RhyMigrationReviewPage>>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, RhyMigrationReviewPage.class)), SetsKt.emptySet(), "reviewPage");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.resourceLinkOfEntryResourceOfRhyMigrationReviewPageAdapter = jsonAdapterAdapter3;
        JsonAdapter<ResourceLink<EntryResource<RhyMigrationCardPage>>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, RhyMigrationCardPage.class)), SetsKt.emptySet(), "cardPageAndroidPhysical");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.resourceLinkOfEntryResourceOfRhyMigrationCardPageAdapter = jsonAdapterAdapter4;
        JsonAdapter<ResourceLink<EntryResource<FancyAgreement>>> jsonAdapterAdapter5 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, FancyAgreement.class)), SetsKt.emptySet(), "agreement1");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.resourceLinkOfEntryResourceOfFancyAgreementAdapter = jsonAdapterAdapter5;
        JsonAdapter<ResourceLink<EntryResource<RhyMigrationLoadingAnimation>>> jsonAdapterAdapter6 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, RhyMigrationLoadingAnimation.class)), SetsKt.emptySet(), "loadingAnimation");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.resourceLinkOfEntryResourceOfRhyMigrationLoadingAnimationAdapter = jsonAdapterAdapter6;
        JsonAdapter<ResourceLink<EntryResource<RhyMigrationCmShutdownUpsell>>> jsonAdapterAdapter7 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, RhyMigrationCmShutdownUpsell.class)), SetsKt.emptySet(), "cmShutdownUpsellPage");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter7, "adapter(...)");
        this.nullableResourceLinkOfEntryResourceOfRhyMigrationCmShutdownUpsellAdapter = jsonAdapterAdapter7;
        JsonAdapter<ResourceLink<EntryResource<MobileContentPage>>> jsonAdapterAdapter8 = moshi.adapter(Types.newParameterizedType(ResourceLink.class, Types.newParameterizedType(EntryResource.class, MobileContentPage.class)), SetsKt.emptySet(), "optOutPage");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter8, "adapter(...)");
        this.nullableResourceLinkOfEntryResourceOfMobileContentPageAdapter = jsonAdapterAdapter8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RhyMigration");
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public RhyMigration fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ResourceLink<EntryResource<RhyMigrationFeaturePage>> resourceLinkFromJson = null;
        ResourceLink<EntryResource<RhyMigrationFeaturePage>> resourceLinkFromJson2 = null;
        ResourceLink<EntryResource<RhyMigrationFeaturePage>> resourceLinkFromJson3 = null;
        ResourceLink<EntryResource<RhyMigrationContrastPage>> resourceLinkFromJson4 = null;
        ResourceLink<EntryResource<RhyMigrationReviewPage>> resourceLinkFromJson5 = null;
        ResourceLink<EntryResource<RhyMigrationCardPage>> resourceLinkFromJson6 = null;
        ResourceLink<EntryResource<RhyMigrationCardPage>> resourceLinkFromJson7 = null;
        ResourceLink<EntryResource<FancyAgreement>> resourceLinkFromJson8 = null;
        ResourceLink<EntryResource<FancyAgreement>> resourceLinkFromJson9 = null;
        ResourceLink<EntryResource<RhyMigrationLoadingAnimation>> resourceLinkFromJson10 = null;
        ResourceLink<EntryResource<RhyMigrationCmShutdownUpsell>> resourceLinkFromJson11 = null;
        ResourceLink<EntryResource<MobileContentPage>> resourceLinkFromJson12 = null;
        while (true) {
            ResourceLink<EntryResource<RhyMigrationFeaturePage>> resourceLink = resourceLinkFromJson;
            ResourceLink<EntryResource<RhyMigrationFeaturePage>> resourceLink2 = resourceLinkFromJson2;
            ResourceLink<EntryResource<RhyMigrationFeaturePage>> resourceLink3 = resourceLinkFromJson3;
            ResourceLink<EntryResource<RhyMigrationContrastPage>> resourceLink4 = resourceLinkFromJson4;
            ResourceLink<EntryResource<RhyMigrationReviewPage>> resourceLink5 = resourceLinkFromJson5;
            ResourceLink<EntryResource<RhyMigrationCardPage>> resourceLink6 = resourceLinkFromJson6;
            ResourceLink<EntryResource<RhyMigrationCardPage>> resourceLink7 = resourceLinkFromJson7;
            ResourceLink<EntryResource<FancyAgreement>> resourceLink8 = resourceLinkFromJson8;
            if (reader.hasNext()) {
                ResourceLink<EntryResource<FancyAgreement>> resourceLink9 = resourceLinkFromJson9;
                switch (reader.selectName(this.options)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson7 = resourceLink7;
                        resourceLinkFromJson8 = resourceLink8;
                    case 0:
                        resourceLinkFromJson = this.resourceLinkOfEntryResourceOfRhyMigrationFeaturePageAdapter.fromJson(reader);
                        if (resourceLinkFromJson == null) {
                            throw Util.unexpectedNull("featurePage1", "featurePage1", reader);
                        }
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson7 = resourceLink7;
                        resourceLinkFromJson8 = resourceLink8;
                    case 1:
                        resourceLinkFromJson2 = this.resourceLinkOfEntryResourceOfRhyMigrationFeaturePageAdapter.fromJson(reader);
                        if (resourceLinkFromJson2 == null) {
                            throw Util.unexpectedNull("featurePage2", "featurePage2", reader);
                        }
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson7 = resourceLink7;
                        resourceLinkFromJson8 = resourceLink8;
                    case 2:
                        resourceLinkFromJson3 = this.resourceLinkOfEntryResourceOfRhyMigrationFeaturePageAdapter.fromJson(reader);
                        if (resourceLinkFromJson3 == null) {
                            throw Util.unexpectedNull("featurePage3", "featurePage3", reader);
                        }
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson7 = resourceLink7;
                        resourceLinkFromJson8 = resourceLink8;
                    case 3:
                        resourceLinkFromJson4 = this.resourceLinkOfEntryResourceOfRhyMigrationContrastPageAdapter.fromJson(reader);
                        if (resourceLinkFromJson4 == null) {
                            throw Util.unexpectedNull("contrastPage", "contrastPage", reader);
                        }
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson7 = resourceLink7;
                        resourceLinkFromJson8 = resourceLink8;
                    case 4:
                        resourceLinkFromJson5 = this.resourceLinkOfEntryResourceOfRhyMigrationReviewPageAdapter.fromJson(reader);
                        if (resourceLinkFromJson5 == null) {
                            throw Util.unexpectedNull("reviewPage", "reviewPage", reader);
                        }
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson7 = resourceLink7;
                        resourceLinkFromJson8 = resourceLink8;
                    case 5:
                        resourceLinkFromJson6 = this.resourceLinkOfEntryResourceOfRhyMigrationCardPageAdapter.fromJson(reader);
                        if (resourceLinkFromJson6 == null) {
                            throw Util.unexpectedNull("cardPageAndroidPhysical", "cardPageAndroidPhysical", reader);
                        }
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson7 = resourceLink7;
                        resourceLinkFromJson8 = resourceLink8;
                    case 6:
                        resourceLinkFromJson7 = this.resourceLinkOfEntryResourceOfRhyMigrationCardPageAdapter.fromJson(reader);
                        if (resourceLinkFromJson7 == null) {
                            throw Util.unexpectedNull("cardPageAndroidVirtual", "cardPageAndroidVirtual", reader);
                        }
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson8 = resourceLink8;
                    case 7:
                        resourceLinkFromJson8 = this.resourceLinkOfEntryResourceOfFancyAgreementAdapter.fromJson(reader);
                        if (resourceLinkFromJson8 == null) {
                            throw Util.unexpectedNull("agreement1", "agreement1", reader);
                        }
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson7 = resourceLink7;
                    case 8:
                        resourceLinkFromJson9 = this.resourceLinkOfEntryResourceOfFancyAgreementAdapter.fromJson(reader);
                        if (resourceLinkFromJson9 == null) {
                            throw Util.unexpectedNull("agreement2", "agreement2", reader);
                        }
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson7 = resourceLink7;
                        resourceLinkFromJson8 = resourceLink8;
                    case 9:
                        resourceLinkFromJson10 = this.resourceLinkOfEntryResourceOfRhyMigrationLoadingAnimationAdapter.fromJson(reader);
                        if (resourceLinkFromJson10 == null) {
                            throw Util.unexpectedNull("loadingAnimation", "loadingAnimation", reader);
                        }
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson7 = resourceLink7;
                        resourceLinkFromJson8 = resourceLink8;
                    case 10:
                        resourceLinkFromJson11 = this.nullableResourceLinkOfEntryResourceOfRhyMigrationCmShutdownUpsellAdapter.fromJson(reader);
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson7 = resourceLink7;
                        resourceLinkFromJson8 = resourceLink8;
                    case 11:
                        resourceLinkFromJson12 = this.nullableResourceLinkOfEntryResourceOfMobileContentPageAdapter.fromJson(reader);
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson7 = resourceLink7;
                        resourceLinkFromJson8 = resourceLink8;
                    default:
                        resourceLinkFromJson9 = resourceLink9;
                        resourceLinkFromJson = resourceLink;
                        resourceLinkFromJson2 = resourceLink2;
                        resourceLinkFromJson3 = resourceLink3;
                        resourceLinkFromJson4 = resourceLink4;
                        resourceLinkFromJson5 = resourceLink5;
                        resourceLinkFromJson6 = resourceLink6;
                        resourceLinkFromJson7 = resourceLink7;
                        resourceLinkFromJson8 = resourceLink8;
                }
            } else {
                ResourceLink<EntryResource<FancyAgreement>> resourceLink10 = resourceLinkFromJson9;
                reader.endObject();
                if (resourceLink == null) {
                    throw Util.missingProperty("featurePage1", "featurePage1", reader);
                }
                if (resourceLink2 == null) {
                    throw Util.missingProperty("featurePage2", "featurePage2", reader);
                }
                if (resourceLink3 == null) {
                    throw Util.missingProperty("featurePage3", "featurePage3", reader);
                }
                if (resourceLink4 == null) {
                    throw Util.missingProperty("contrastPage", "contrastPage", reader);
                }
                if (resourceLink5 == null) {
                    throw Util.missingProperty("reviewPage", "reviewPage", reader);
                }
                if (resourceLink6 == null) {
                    throw Util.missingProperty("cardPageAndroidPhysical", "cardPageAndroidPhysical", reader);
                }
                if (resourceLink7 == null) {
                    throw Util.missingProperty("cardPageAndroidVirtual", "cardPageAndroidVirtual", reader);
                }
                if (resourceLink8 == null) {
                    throw Util.missingProperty("agreement1", "agreement1", reader);
                }
                if (resourceLink10 == null) {
                    throw Util.missingProperty("agreement2", "agreement2", reader);
                }
                if (resourceLinkFromJson10 != null) {
                    return new RhyMigration(resourceLink, resourceLink2, resourceLink3, resourceLink4, resourceLink5, resourceLink6, resourceLink7, resourceLink8, resourceLink10, resourceLinkFromJson10, resourceLinkFromJson11, resourceLinkFromJson12);
                }
                throw Util.missingProperty("loadingAnimation", "loadingAnimation", reader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, RhyMigration value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("featurePage1");
        this.resourceLinkOfEntryResourceOfRhyMigrationFeaturePageAdapter.toJson(writer, (JsonWriter) value_.getFeaturePage1());
        writer.name("featurePage2");
        this.resourceLinkOfEntryResourceOfRhyMigrationFeaturePageAdapter.toJson(writer, (JsonWriter) value_.getFeaturePage2());
        writer.name("featurePage3");
        this.resourceLinkOfEntryResourceOfRhyMigrationFeaturePageAdapter.toJson(writer, (JsonWriter) value_.getFeaturePage3());
        writer.name("contrastPage");
        this.resourceLinkOfEntryResourceOfRhyMigrationContrastPageAdapter.toJson(writer, (JsonWriter) value_.getContrastPage());
        writer.name("reviewPage");
        this.resourceLinkOfEntryResourceOfRhyMigrationReviewPageAdapter.toJson(writer, (JsonWriter) value_.getReviewPage());
        writer.name("cardPageAndroidPhysical");
        this.resourceLinkOfEntryResourceOfRhyMigrationCardPageAdapter.toJson(writer, (JsonWriter) value_.getCardPageAndroidPhysical());
        writer.name("cardPageAndroidVirtual");
        this.resourceLinkOfEntryResourceOfRhyMigrationCardPageAdapter.toJson(writer, (JsonWriter) value_.getCardPageAndroidVirtual());
        writer.name("agreement1");
        this.resourceLinkOfEntryResourceOfFancyAgreementAdapter.toJson(writer, (JsonWriter) value_.getAgreement1());
        writer.name("agreement2");
        this.resourceLinkOfEntryResourceOfFancyAgreementAdapter.toJson(writer, (JsonWriter) value_.getAgreement2());
        writer.name("loadingAnimation");
        this.resourceLinkOfEntryResourceOfRhyMigrationLoadingAnimationAdapter.toJson(writer, (JsonWriter) value_.getLoadingAnimation());
        writer.name("cmShutdownUpsellPage");
        this.nullableResourceLinkOfEntryResourceOfRhyMigrationCmShutdownUpsellAdapter.toJson(writer, (JsonWriter) value_.getCmShutdownUpsellPage());
        writer.name("optOutPage");
        this.nullableResourceLinkOfEntryResourceOfMobileContentPageAdapter.toJson(writer, (JsonWriter) value_.getOptOutPage());
        writer.endObject();
    }
}
