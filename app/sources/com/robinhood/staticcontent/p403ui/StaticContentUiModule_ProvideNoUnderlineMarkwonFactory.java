package com.robinhood.staticcontent.p403ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StaticContentUiModule_ProvideNoUnderlineMarkwonFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/staticcontent/ui/StaticContentUiModule_ProvideNoUnderlineMarkwonFactory;", "Ldagger/internal/Factory;", "Lio/noties/markwon/Markwon;", "builder", "Ljavax/inject/Provider;", "Lio/noties/markwon/Markwon$Builder;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StaticContentUiModule_ProvideNoUnderlineMarkwonFactory implements Factory<Markwon> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Markwon.Builder> builder;

    @JvmStatic
    public static final StaticContentUiModule_ProvideNoUnderlineMarkwonFactory create(Provider<Markwon.Builder> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final Markwon provideNoUnderlineMarkwon(Markwon.Builder builder) {
        return INSTANCE.provideNoUnderlineMarkwon(builder);
    }

    public StaticContentUiModule_ProvideNoUnderlineMarkwonFactory(Provider<Markwon.Builder> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
    }

    @Override // javax.inject.Provider
    public Markwon get() {
        Companion companion = INSTANCE;
        Markwon.Builder builder = this.builder.get();
        Intrinsics.checkNotNullExpressionValue(builder, "get(...)");
        return companion.provideNoUnderlineMarkwon(builder);
    }

    /* compiled from: StaticContentUiModule_ProvideNoUnderlineMarkwonFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/staticcontent/ui/StaticContentUiModule_ProvideNoUnderlineMarkwonFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/staticcontent/ui/StaticContentUiModule_ProvideNoUnderlineMarkwonFactory;", "builder", "Ljavax/inject/Provider;", "Lio/noties/markwon/Markwon$Builder;", "provideNoUnderlineMarkwon", "Lio/noties/markwon/Markwon;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StaticContentUiModule_ProvideNoUnderlineMarkwonFactory create(Provider<Markwon.Builder> builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new StaticContentUiModule_ProvideNoUnderlineMarkwonFactory(builder);
        }

        @JvmStatic
        public final Markwon provideNoUnderlineMarkwon(Markwon.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            Object objCheckNotNull = Preconditions.checkNotNull(StaticContentUiModule.INSTANCE.provideNoUnderlineMarkwon(builder), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Markwon) objCheckNotNull;
        }
    }
}
