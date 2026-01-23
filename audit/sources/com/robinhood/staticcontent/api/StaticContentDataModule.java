package com.robinhood.staticcontent.api;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.ContentConfiguration;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.binding.ContentTypeBindingRegistry;
import com.robinhood.contentful.json.ContentfulMoshi;
import com.robinhood.contentful.json.Moshi2;
import com.robinhood.contentful.render.AssetRenderer;
import com.robinhood.contentful.render.EntryRenderer;
import com.robinhood.contentful.render.ImageAssetRenderer;
import com.robinhood.contentful.render.MarkdownAssetRenderer;
import com.robinhood.contentful.render.PlainTextRenderer;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.Agreement;
import com.robinhood.staticcontent.model.FancyAgreement;
import com.robinhood.staticcontent.model.IdentifiableTitleAndBody;
import com.robinhood.staticcontent.model.MobileContentPage;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.staticcontent.model.ReferenceManual;
import com.robinhood.staticcontent.model.TitleAndBody;
import com.robinhood.staticcontent.model.daytradeinfo.DayTradeInfo;
import com.robinhood.staticcontent.model.daytradeinfo.DayTradeInfoStep;
import com.robinhood.staticcontent.model.daytradeinfo.DayTradeInfoVariant;
import com.robinhood.staticcontent.model.directipo.DirectIpoOnboarding;
import com.robinhood.staticcontent.model.directipo.DirectIpoOnboardingLearnMore;
import com.robinhood.staticcontent.model.directipo.DirectIpoOnboardingLearnMoreAction;
import com.robinhood.staticcontent.model.directipo.DirectIpoOnboardingStep;
import com.robinhood.staticcontent.model.directipo.MultipleDensityImageAsset;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.model.expandablecontent.ApiExpandableContent;
import com.robinhood.staticcontent.model.expandablecontent.ApiExpandableContentSection;
import com.robinhood.staticcontent.model.margin.MarginInterestRateComparison;
import com.robinhood.staticcontent.model.p402cx.CxVoiceContent;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import com.robinhood.staticcontent.model.productupsell.ProductUpsellResource;
import com.robinhood.staticcontent.model.rhymigration.RhyMigration;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationCardPage;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationCmShutdownUpsell;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationContrastPage;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationFeaturePage;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationLoadingAnimation;
import com.robinhood.staticcontent.model.rhymigration.RhyMigrationReviewPage;
import com.robinhood.staticcontent.model.safetylabelslesson.ApiSafetyLabelsLesson;
import com.robinhood.staticcontent.model.safetylabelslesson.ApiSafetyLabelsLessonSection;
import com.robinhood.staticcontent.model.safetylabelslesson.ApiSafetyLabelsLessonSlide;
import com.robinhood.staticcontent.render.AgreementRenderer;
import com.robinhood.staticcontent.render.DisclosureRenderer;
import com.robinhood.utils.Json2;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.jsonadapter.StackAmendingJsonAdapterFactory;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.text.TextContentRenderer;

/* compiled from: StaticContentDataModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/staticcontent/api/StaticContentDataModule;", "", "<init>", "()V", "bindStaticContentManager", "Lcom/robinhood/contentful/repository/ContentRepository;", PlaceTypes.STORE, "Lcom/robinhood/contentful/StaticContentStore;", "Companion", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class StaticContentDataModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract ContentRepository bindStaticContentManager(StaticContentStore store);

    /* compiled from: StaticContentDataModule.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/staticcontent/api/StaticContentDataModule$Companion;", "", "<init>", "()V", "provideConfiguration", "Lcom/robinhood/contentful/ContentConfiguration;", "provideMarkdownParser", "Lorg/commonmark/parser/Parser;", "provideMarkdownTextContentRenderer", "Lorg/commonmark/renderer/text/TextContentRenderer;", "provideContentTypeBindingRegistry", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "provideEntryRendererRegistry", "Lcom/robinhood/contentful/render/EntryRenderer$Registry;", "disclosureRenderer", "Lcom/robinhood/staticcontent/render/DisclosureRenderer;", "provideAssetRendererRegistry", "Lcom/robinhood/contentful/render/AssetRenderer$Registry;", "imageRenderer", "Lcom/robinhood/contentful/render/ImageAssetRenderer;", "markdownRenderer", "Lcom/robinhood/contentful/render/MarkdownAssetRenderer;", "provideContentfulMoshi", "Lcom/squareup/moshi/Moshi;", "contentTypeBindingRegistry", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ContentfulMoshi
        public final Moshi provideContentfulMoshi(ContentTypeBindingRegistry contentTypeBindingRegistry) {
            Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
            Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) StackAmendingJsonAdapterFactory.INSTANCE);
            Moshi2.addContentfulJsonAdapters(builderAdd, contentTypeBindingRegistry);
            Json2.addGenericAdapters$default(builderAdd, null, 1, null);
            Moshi moshiBuild = builderAdd.build();
            Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
            return moshiBuild;
        }

        private Companion() {
        }

        public final ContentConfiguration provideConfiguration() {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            return new ContentConfiguration("5ft2qdzfrz9o", US);
        }

        public final Parser provideMarkdownParser() {
            Parser parserBuild = Parser.builder().build();
            Intrinsics.checkNotNullExpressionValue(parserBuild, "build(...)");
            return parserBuild;
        }

        public final TextContentRenderer provideMarkdownTextContentRenderer() {
            TextContentRenderer textContentRendererBuild = TextContentRenderer.builder().build();
            Intrinsics.checkNotNullExpressionValue(textContentRendererBuild, "build(...)");
            return textContentRendererBuild;
        }

        public final ContentTypeBindingRegistry provideContentTypeBindingRegistry() {
            ContentTypeBindingRegistry.Companion companion = ContentTypeBindingRegistry.INSTANCE;
            ContentTypeBindingRegistry.Builder builder = new ContentTypeBindingRegistry.Builder();
            builder.bind(Agreement.class, "agreement");
            builder.bind(FancyAgreement.class, "fancyAgreement");
            builder.bind(DayTradeInfo.class, "pdtEducationFlow");
            builder.bind(DayTradeInfoStep.class, "pdtEducationFlowStep");
            builder.bind(DayTradeInfoVariant.class, "pdtEducationFlowStepVariant");
            builder.bind(Disclosure.class, OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE);
            builder.bind(DirectIpoOnboarding.class, "directIpoOnboardingV1");
            builder.bind(DirectIpoOnboardingLearnMore.class, "directIpoOnboardingLearnMoreV1");
            builder.bind(DirectIpoOnboardingLearnMoreAction.class, "directIpoOnboardingPageActionV1");
            builder.bind(DirectIpoOnboardingStep.class, "directIpoOnboardingPageV1");
            builder.bind(ApiSafetyLabelsLesson.class, "educationLabelLesson");
            builder.bind(ApiSafetyLabelsLessonSection.class, "educationLabelLessonSection");
            builder.bind(ApiSafetyLabelsLessonSlide.class, "educationLabelLessonSlide");
            builder.bind(ApiExpandableContent.class, "expandableContent");
            builder.bind(ApiExpandableContentSection.class, "expandableContentHeader");
            builder.bind(ReferenceManual.class, "referenceManual");
            builder.bind(ReferenceManual.Section.class, "referenceManualSection");
            builder.bind(RhyMigration.class, "rhyOnboardingMigration");
            builder.bind(RhyMigrationContrastPage.class, "rhyMigrationContrastPage");
            builder.bind(RhyMigrationFeaturePage.class, "rhyMigrationFeaturePage");
            builder.bind(RhyMigrationReviewPage.class, "rhyMigrationReviewPage");
            builder.bind(MobileContentPage.class, "mobileContentPage");
            builder.bind(RhyMigrationCmShutdownUpsell.class, "cmShutdownUpsellPage");
            builder.bind(RhyMigrationCardPage.class, "rhyMigrationCardPage");
            builder.bind(TitleAndBody.class, "titleAndBody");
            builder.bind(IdentifiableTitleAndBody.class, "identifiableValueProp");
            builder.bind(RhyMigrationLoadingAnimation.class, "rhyMigrationLoadingAnimation");
            builder.bind(ProductMarketing.class, "appProductMarketing");
            builder.bind(ProductMarketing.Feature.class, "marketingFeature");
            builder.bind(MultipleDensityImageAsset.class, "multipleDensityImageAsset");
            builder.bind(CxVoiceContent.class, "cxVoiceContent");
            builder.bind(OtherMarkdown.class, "otherMarkdown");
            builder.bind(MarginInterestRateComparison.class, "marginInterestRateComparison");
            builder.bind(MarginInterestRateComparison.BrokerageInterestRateItem.class, "brokerageInterestRateItem");
            builder.bind(ProductUpsellResource.class, ProductUpsellResource.CONTENT_TYPE_ID);
            builder.bind(ProductUpsellResource.CtaButton.class, ProductUpsellResource.CtaButton.CONTENT_TYPE_ID);
            return builder.build();
        }

        public final EntryRenderer.Registry provideEntryRendererRegistry(DisclosureRenderer disclosureRenderer) {
            Intrinsics.checkNotNullParameter(disclosureRenderer, "disclosureRenderer");
            EntryRenderer.Registry.Companion companion = EntryRenderer.Registry.INSTANCE;
            EntryRenderer.Registry.Builder builder = new EntryRenderer.Registry.Builder();
            AgreementRenderer agreementRenderer = AgreementRenderer.INSTANCE;
            Types types = Types.INSTANCE;
            builder.bind(new TypeToken<Agreement>() { // from class: com.robinhood.staticcontent.api.StaticContentDataModule$Companion$provideEntryRendererRegistry$lambda$1$$inlined$bind$1
            }.getType(), agreementRenderer);
            builder.bind(new TypeToken<Disclosure>() { // from class: com.robinhood.staticcontent.api.StaticContentDataModule$Companion$provideEntryRendererRegistry$lambda$1$$inlined$bind$2
            }.getType(), disclosureRenderer);
            return builder.build();
        }

        public final AssetRenderer.Registry provideAssetRendererRegistry(ImageAssetRenderer imageRenderer, MarkdownAssetRenderer markdownRenderer) {
            Intrinsics.checkNotNullParameter(imageRenderer, "imageRenderer");
            Intrinsics.checkNotNullParameter(markdownRenderer, "markdownRenderer");
            return new AssetRenderer.Registry((AssetRenderer<?>[]) new AssetRenderer[]{imageRenderer, markdownRenderer, PlainTextRenderer.INSTANCE});
        }
    }
}
