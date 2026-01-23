package io.noties.markwon.image;

import android.text.Spanned;
import android.widget.TextView;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import org.commonmark.node.Image;

/* loaded from: classes14.dex */
public class ImagesPlugin extends AbstractMarkwonPlugin {
    private final AsyncDrawableLoaderBuilder builder;

    public interface ErrorHandler {
    }

    public interface ImagesConfigure {
        void configureImages(ImagesPlugin imagesPlugin);
    }

    public static ImagesPlugin create(ImagesConfigure imagesConfigure) {
        ImagesPlugin imagesPlugin = new ImagesPlugin();
        imagesConfigure.configureImages(imagesPlugin);
        return imagesPlugin;
    }

    ImagesPlugin() {
        this(new AsyncDrawableLoaderBuilder());
    }

    ImagesPlugin(AsyncDrawableLoaderBuilder asyncDrawableLoaderBuilder) {
        this.builder = asyncDrawableLoaderBuilder;
    }

    public ImagesPlugin addSchemeHandler(SchemeHandler schemeHandler) {
        this.builder.addSchemeHandler(schemeHandler);
        return this;
    }

    public ImagesPlugin defaultMediaDecoder(MediaDecoder mediaDecoder) {
        this.builder.defaultMediaDecoder(mediaDecoder);
        return this;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureConfiguration(MarkwonConfiguration.Builder builder) {
        builder.asyncDrawableLoader(this.builder.build());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureSpansFactory(MarkwonSpansFactory.Builder builder) {
        builder.setFactory(Image.class, new ImageSpanFactory());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void beforeSetText(TextView textView, Spanned spanned) {
        AsyncDrawableScheduler.unschedule(textView);
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void afterSetText(TextView textView) {
        AsyncDrawableScheduler.schedule(textView);
    }
}
