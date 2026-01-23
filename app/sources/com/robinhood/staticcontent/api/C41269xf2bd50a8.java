package com.robinhood.staticcontent.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.render.EntryRenderer;
import com.robinhood.staticcontent.render.DisclosureRenderer;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StaticContentDataModule_Companion_ProvideEntryRendererRegistryFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/staticcontent/api/StaticContentDataModule_Companion_ProvideEntryRendererRegistryFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/contentful/render/EntryRenderer$Registry;", "disclosureRenderer", "Ljavax/inject/Provider;", "Lcom/robinhood/staticcontent/render/DisclosureRenderer;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.staticcontent.api.StaticContentDataModule_Companion_ProvideEntryRendererRegistryFactory */
/* loaded from: classes21.dex */
public final class C41269xf2bd50a8 implements Factory<EntryRenderer.Registry> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DisclosureRenderer> disclosureRenderer;

    @JvmStatic
    public static final C41269xf2bd50a8 create(Provider<DisclosureRenderer> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final EntryRenderer.Registry provideEntryRendererRegistry(DisclosureRenderer disclosureRenderer) {
        return INSTANCE.provideEntryRendererRegistry(disclosureRenderer);
    }

    public C41269xf2bd50a8(Provider<DisclosureRenderer> disclosureRenderer) {
        Intrinsics.checkNotNullParameter(disclosureRenderer, "disclosureRenderer");
        this.disclosureRenderer = disclosureRenderer;
    }

    @Override // javax.inject.Provider
    public EntryRenderer.Registry get() {
        Companion companion = INSTANCE;
        DisclosureRenderer disclosureRenderer = this.disclosureRenderer.get();
        Intrinsics.checkNotNullExpressionValue(disclosureRenderer, "get(...)");
        return companion.provideEntryRendererRegistry(disclosureRenderer);
    }

    /* compiled from: StaticContentDataModule_Companion_ProvideEntryRendererRegistryFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/staticcontent/api/StaticContentDataModule_Companion_ProvideEntryRendererRegistryFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/staticcontent/api/StaticContentDataModule_Companion_ProvideEntryRendererRegistryFactory;", "disclosureRenderer", "Ljavax/inject/Provider;", "Lcom/robinhood/staticcontent/render/DisclosureRenderer;", "provideEntryRendererRegistry", "Lcom/robinhood/contentful/render/EntryRenderer$Registry;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.staticcontent.api.StaticContentDataModule_Companion_ProvideEntryRendererRegistryFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C41269xf2bd50a8 create(Provider<DisclosureRenderer> disclosureRenderer) {
            Intrinsics.checkNotNullParameter(disclosureRenderer, "disclosureRenderer");
            return new C41269xf2bd50a8(disclosureRenderer);
        }

        @JvmStatic
        public final EntryRenderer.Registry provideEntryRendererRegistry(DisclosureRenderer disclosureRenderer) {
            Intrinsics.checkNotNullParameter(disclosureRenderer, "disclosureRenderer");
            Object objCheckNotNull = Preconditions.checkNotNull(StaticContentDataModule.INSTANCE.provideEntryRendererRegistry(disclosureRenderer), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (EntryRenderer.Registry) objCheckNotNull;
        }
    }
}
