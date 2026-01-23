package com.robinhood.android.markdown;

import android.content.Context;
import android.graphics.Typeface;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.markdown.elements.MeasuredImage;
import com.robinhood.android.markdown.elements.MeasuredImageNodeVisitor;
import com.robinhood.android.markdown.elements.RhImageSpanFactory;
import com.robinhood.android.markdown.elements.SecondaryText;
import com.robinhood.android.markdown.elements.SecondaryTextNodeVisitor;
import com.robinhood.android.markdown.elements.Underline;
import com.robinhood.android.markdown.elements.UnderlineNodeVisitor;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.LinkResolverDef;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonPlugin;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.image.ImagesPlugin;
import io.noties.markwon.image.file.FileSchemeHandler;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.commonmark.node.Image;

/* compiled from: RhMarkwonPlugin.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0018H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/markdown/RhMarkwonPlugin;", "Lio/noties/markwon/AbstractMarkwonPlugin;", "codeTypeface", "Landroid/graphics/Typeface;", "headingTypeface", "secondaryTextColor", "", "<init>", "(Landroid/graphics/Typeface;Landroid/graphics/Typeface;I)V", "linkClickRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "configure", "", "registry", "Lio/noties/markwon/MarkwonPlugin$Registry;", "configureConfiguration", "builder", "Lio/noties/markwon/MarkwonConfiguration$Builder;", "configureTheme", "Lio/noties/markwon/core/MarkwonTheme$Builder;", "configureVisitor", "Lio/noties/markwon/MarkwonVisitor$Builder;", "configureSpansFactory", "Lio/noties/markwon/MarkwonSpansFactory$Builder;", "linkClicks", "Lio/reactivex/Observable;", "Companion", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class RhMarkwonPlugin extends AbstractMarkwonPlugin {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Typeface codeTypeface;
    private final Typeface headingTypeface;
    private final PublishRelay<String> linkClickRelay;
    private final int secondaryTextColor;

    public RhMarkwonPlugin(Typeface codeTypeface, Typeface headingTypeface, int i) {
        Intrinsics.checkNotNullParameter(codeTypeface, "codeTypeface");
        Intrinsics.checkNotNullParameter(headingTypeface, "headingTypeface");
        this.codeTypeface = codeTypeface;
        this.headingTypeface = headingTypeface;
        this.secondaryTextColor = i;
        PublishRelay<String> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.linkClickRelay = publishRelayCreate;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configure(MarkwonPlugin.Registry registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        registry.require(ImagesPlugin.class, new MarkwonPlugin.Action() { // from class: com.robinhood.android.markdown.RhMarkwonPlugin.configure.1
            @Override // io.noties.markwon.MarkwonPlugin.Action
            public final void apply(ImagesPlugin it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.addSchemeHandler(FileSchemeHandler.create());
            }
        });
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureConfiguration(MarkwonConfiguration.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.linkResolver(new LinkResolverDef() { // from class: com.robinhood.android.markdown.RhMarkwonPlugin.configureConfiguration.1
            @Override // io.noties.markwon.LinkResolverDef, io.noties.markwon.LinkResolver
            public void resolve(View view, String link) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(link, "link");
                super.resolve(view, link);
                RhMarkwonPlugin.this.linkClickRelay.accept(link);
            }
        });
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureTheme(MarkwonTheme.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.codeTypeface(this.codeTypeface);
        builder.headingBreakHeight(0);
        builder.headingTypeface(this.headingTypeface);
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureVisitor(MarkwonVisitor.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullExpressionValue(builder.mo3341on(MeasuredImage.class, MeasuredImageNodeVisitor.INSTANCE), "on(...)");
        Intrinsics.checkNotNullExpressionValue(builder.mo3341on(SecondaryText.class, SecondaryTextNodeVisitor.INSTANCE), "on(...)");
        Intrinsics.checkNotNullExpressionValue(builder.mo3341on(Underline.class, UnderlineNodeVisitor.INSTANCE), "on(...)");
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureSpansFactory(MarkwonSpansFactory.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        RhImageSpanFactory rhImageSpanFactory = RhImageSpanFactory.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(builder.setFactory(Image.class, rhImageSpanFactory), "setFactory(...)");
        Intrinsics.checkNotNullExpressionValue(builder.setFactory(MeasuredImage.class, rhImageSpanFactory), "setFactory(...)");
        Intrinsics.checkNotNullExpressionValue(builder.setFactory(SecondaryText.class, new SpanFactory() { // from class: com.robinhood.android.markdown.RhMarkwonPlugin$configureSpansFactory$1$1
            @Override // io.noties.markwon.SpanFactory
            public final Object getSpans(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
                Intrinsics.checkNotNullParameter(markwonConfiguration, "<unused var>");
                Intrinsics.checkNotNullParameter(renderProps, "<unused var>");
                return new ForegroundColorSpan(this.this$0.secondaryTextColor);
            }
        }), "setFactory(...)");
        Intrinsics.checkNotNullExpressionValue(builder.setFactory(Underline.class, Underline.INSTANCE), "setFactory(...)");
    }

    public final Observable<String> linkClicks() {
        Observable<String> observableHide = this.linkClickRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    /* compiled from: RhMarkwonPlugin.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/markdown/RhMarkwonPlugin$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/markdown/RhMarkwonPlugin;", "context", "Landroid/content/Context;", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RhMarkwonPlugin create(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new RhMarkwonPlugin(RhTypeface.MONOSPACED.load(context), RhTypeface.MEDIUM.load(context), -7829368);
        }
    }
}
