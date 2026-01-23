package com.robinhood.contentful.markdown;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.binding.ContentTypeBindingRegistry;
import com.robinhood.contentful.render.AssetRenderer;
import com.robinhood.contentful.render.EntryRenderer;
import com.robinhood.contentful.repository.ContentRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentRenderer_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/contentful/markdown/ContentRenderer_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "repository", "Ljavax/inject/Provider;", "Lcom/robinhood/contentful/repository/ContentRepository;", "contentTypeBindingRegistry", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "entryRendererRegistry", "Lcom/robinhood/contentful/render/EntryRenderer$Registry;", "assetRendererRegistry", "Lcom/robinhood/contentful/render/AssetRenderer$Registry;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ContentRenderer_Factory implements Factory<ContentRenderer> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AssetRenderer.Registry> assetRendererRegistry;
    private final Provider<ContentTypeBindingRegistry> contentTypeBindingRegistry;
    private final Provider<EntryRenderer.Registry> entryRendererRegistry;
    private final Provider<ContentRepository> repository;

    @JvmStatic
    public static final ContentRenderer_Factory create(Provider<ContentRepository> provider, Provider<ContentTypeBindingRegistry> provider2, Provider<EntryRenderer.Registry> provider3, Provider<AssetRenderer.Registry> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final ContentRenderer newInstance(ContentRepository contentRepository, ContentTypeBindingRegistry contentTypeBindingRegistry, EntryRenderer.Registry registry, AssetRenderer.Registry registry2) {
        return INSTANCE.newInstance(contentRepository, contentTypeBindingRegistry, registry, registry2);
    }

    public ContentRenderer_Factory(Provider<ContentRepository> repository, Provider<ContentTypeBindingRegistry> contentTypeBindingRegistry, Provider<EntryRenderer.Registry> entryRendererRegistry, Provider<AssetRenderer.Registry> assetRendererRegistry) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
        Intrinsics.checkNotNullParameter(entryRendererRegistry, "entryRendererRegistry");
        Intrinsics.checkNotNullParameter(assetRendererRegistry, "assetRendererRegistry");
        this.repository = repository;
        this.contentTypeBindingRegistry = contentTypeBindingRegistry;
        this.entryRendererRegistry = entryRendererRegistry;
        this.assetRendererRegistry = assetRendererRegistry;
    }

    @Override // javax.inject.Provider
    public ContentRenderer get() {
        Companion companion = INSTANCE;
        ContentRepository contentRepository = this.repository.get();
        Intrinsics.checkNotNullExpressionValue(contentRepository, "get(...)");
        ContentTypeBindingRegistry contentTypeBindingRegistry = this.contentTypeBindingRegistry.get();
        Intrinsics.checkNotNullExpressionValue(contentTypeBindingRegistry, "get(...)");
        EntryRenderer.Registry registry = this.entryRendererRegistry.get();
        Intrinsics.checkNotNullExpressionValue(registry, "get(...)");
        AssetRenderer.Registry registry2 = this.assetRendererRegistry.get();
        Intrinsics.checkNotNullExpressionValue(registry2, "get(...)");
        return companion.newInstance(contentRepository, contentTypeBindingRegistry, registry, registry2);
    }

    /* compiled from: ContentRenderer_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/contentful/markdown/ContentRenderer_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/contentful/markdown/ContentRenderer_Factory;", "repository", "Ljavax/inject/Provider;", "Lcom/robinhood/contentful/repository/ContentRepository;", "contentTypeBindingRegistry", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "entryRendererRegistry", "Lcom/robinhood/contentful/render/EntryRenderer$Registry;", "assetRendererRegistry", "Lcom/robinhood/contentful/render/AssetRenderer$Registry;", "newInstance", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ContentRenderer_Factory create(Provider<ContentRepository> repository, Provider<ContentTypeBindingRegistry> contentTypeBindingRegistry, Provider<EntryRenderer.Registry> entryRendererRegistry, Provider<AssetRenderer.Registry> assetRendererRegistry) {
            Intrinsics.checkNotNullParameter(repository, "repository");
            Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
            Intrinsics.checkNotNullParameter(entryRendererRegistry, "entryRendererRegistry");
            Intrinsics.checkNotNullParameter(assetRendererRegistry, "assetRendererRegistry");
            return new ContentRenderer_Factory(repository, contentTypeBindingRegistry, entryRendererRegistry, assetRendererRegistry);
        }

        @JvmStatic
        public final ContentRenderer newInstance(ContentRepository repository, ContentTypeBindingRegistry contentTypeBindingRegistry, EntryRenderer.Registry entryRendererRegistry, AssetRenderer.Registry assetRendererRegistry) {
            Intrinsics.checkNotNullParameter(repository, "repository");
            Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
            Intrinsics.checkNotNullParameter(entryRendererRegistry, "entryRendererRegistry");
            Intrinsics.checkNotNullParameter(assetRendererRegistry, "assetRendererRegistry");
            return new ContentRenderer(repository, contentTypeBindingRegistry, entryRendererRegistry, assetRendererRegistry);
        }
    }
}
