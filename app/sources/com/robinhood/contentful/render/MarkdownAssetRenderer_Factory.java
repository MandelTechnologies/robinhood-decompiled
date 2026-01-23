package com.robinhood.contentful.render;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.parser.Parser;

/* compiled from: MarkdownAssetRenderer_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/contentful/render/MarkdownAssetRenderer_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/contentful/render/MarkdownAssetRenderer;", "parser", "Ljavax/inject/Provider;", "Lorg/commonmark/parser/Parser;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MarkdownAssetRenderer_Factory implements Factory<MarkdownAssetRenderer> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Parser> parser;

    @JvmStatic
    public static final MarkdownAssetRenderer_Factory create(Provider<Parser> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final MarkdownAssetRenderer newInstance(Parser parser) {
        return INSTANCE.newInstance(parser);
    }

    public MarkdownAssetRenderer_Factory(Provider<Parser> parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
    }

    @Override // javax.inject.Provider
    public MarkdownAssetRenderer get() {
        Companion companion = INSTANCE;
        Parser parser = this.parser.get();
        Intrinsics.checkNotNullExpressionValue(parser, "get(...)");
        return companion.newInstance(parser);
    }

    /* compiled from: MarkdownAssetRenderer_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/contentful/render/MarkdownAssetRenderer_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/contentful/render/MarkdownAssetRenderer_Factory;", "parser", "Ljavax/inject/Provider;", "Lorg/commonmark/parser/Parser;", "newInstance", "Lcom/robinhood/contentful/render/MarkdownAssetRenderer;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarkdownAssetRenderer_Factory create(Provider<Parser> parser) {
            Intrinsics.checkNotNullParameter(parser, "parser");
            return new MarkdownAssetRenderer_Factory(parser);
        }

        @JvmStatic
        public final MarkdownAssetRenderer newInstance(Parser parser) {
            Intrinsics.checkNotNullParameter(parser, "parser");
            return new MarkdownAssetRenderer(parser);
        }
    }
}
