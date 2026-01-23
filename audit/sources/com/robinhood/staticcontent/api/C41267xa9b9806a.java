package com.robinhood.staticcontent.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.render.AssetRenderer;
import com.robinhood.contentful.render.ImageAssetRenderer;
import com.robinhood.contentful.render.MarkdownAssetRenderer;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StaticContentDataModule_Companion_ProvideAssetRendererRegistryFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/staticcontent/api/StaticContentDataModule_Companion_ProvideAssetRendererRegistryFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/contentful/render/AssetRenderer$Registry;", "imageRenderer", "Ljavax/inject/Provider;", "Lcom/robinhood/contentful/render/ImageAssetRenderer;", "markdownRenderer", "Lcom/robinhood/contentful/render/MarkdownAssetRenderer;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.staticcontent.api.StaticContentDataModule_Companion_ProvideAssetRendererRegistryFactory */
/* loaded from: classes21.dex */
public final class C41267xa9b9806a implements Factory<AssetRenderer.Registry> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ImageAssetRenderer> imageRenderer;
    private final Provider<MarkdownAssetRenderer> markdownRenderer;

    @JvmStatic
    public static final C41267xa9b9806a create(Provider<ImageAssetRenderer> provider, Provider<MarkdownAssetRenderer> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final AssetRenderer.Registry provideAssetRendererRegistry(ImageAssetRenderer imageAssetRenderer, MarkdownAssetRenderer markdownAssetRenderer) {
        return INSTANCE.provideAssetRendererRegistry(imageAssetRenderer, markdownAssetRenderer);
    }

    public C41267xa9b9806a(Provider<ImageAssetRenderer> imageRenderer, Provider<MarkdownAssetRenderer> markdownRenderer) {
        Intrinsics.checkNotNullParameter(imageRenderer, "imageRenderer");
        Intrinsics.checkNotNullParameter(markdownRenderer, "markdownRenderer");
        this.imageRenderer = imageRenderer;
        this.markdownRenderer = markdownRenderer;
    }

    @Override // javax.inject.Provider
    public AssetRenderer.Registry get() {
        Companion companion = INSTANCE;
        ImageAssetRenderer imageAssetRenderer = this.imageRenderer.get();
        Intrinsics.checkNotNullExpressionValue(imageAssetRenderer, "get(...)");
        MarkdownAssetRenderer markdownAssetRenderer = this.markdownRenderer.get();
        Intrinsics.checkNotNullExpressionValue(markdownAssetRenderer, "get(...)");
        return companion.provideAssetRendererRegistry(imageAssetRenderer, markdownAssetRenderer);
    }

    /* compiled from: StaticContentDataModule_Companion_ProvideAssetRendererRegistryFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/staticcontent/api/StaticContentDataModule_Companion_ProvideAssetRendererRegistryFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/staticcontent/api/StaticContentDataModule_Companion_ProvideAssetRendererRegistryFactory;", "imageRenderer", "Ljavax/inject/Provider;", "Lcom/robinhood/contentful/render/ImageAssetRenderer;", "markdownRenderer", "Lcom/robinhood/contentful/render/MarkdownAssetRenderer;", "provideAssetRendererRegistry", "Lcom/robinhood/contentful/render/AssetRenderer$Registry;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.staticcontent.api.StaticContentDataModule_Companion_ProvideAssetRendererRegistryFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C41267xa9b9806a create(Provider<ImageAssetRenderer> imageRenderer, Provider<MarkdownAssetRenderer> markdownRenderer) {
            Intrinsics.checkNotNullParameter(imageRenderer, "imageRenderer");
            Intrinsics.checkNotNullParameter(markdownRenderer, "markdownRenderer");
            return new C41267xa9b9806a(imageRenderer, markdownRenderer);
        }

        @JvmStatic
        public final AssetRenderer.Registry provideAssetRendererRegistry(ImageAssetRenderer imageRenderer, MarkdownAssetRenderer markdownRenderer) {
            Intrinsics.checkNotNullParameter(imageRenderer, "imageRenderer");
            Intrinsics.checkNotNullParameter(markdownRenderer, "markdownRenderer");
            Object objCheckNotNull = Preconditions.checkNotNull(StaticContentDataModule.INSTANCE.provideAssetRendererRegistry(imageRenderer, markdownRenderer), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (AssetRenderer.Registry) objCheckNotNull;
        }
    }
}
