package com.robinhood.android.markdown.elements;

import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.image.ImageProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.Link;

/* compiled from: MeasuredImageNodeVisitor.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/MeasuredImageNodeVisitor;", "Lio/noties/markwon/MarkwonVisitor$NodeVisitor;", "Lcom/robinhood/android/markdown/elements/MeasuredImage;", "<init>", "()V", "visit", "", "visitor", "Lio/noties/markwon/MarkwonVisitor;", "node", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MeasuredImageNodeVisitor implements MarkwonVisitor.NodeVisitor<MeasuredImage> {
    public static final MeasuredImageNodeVisitor INSTANCE = new MeasuredImageNodeVisitor();

    private MeasuredImageNodeVisitor() {
    }

    @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
    public void visit(MarkwonVisitor visitor, MeasuredImage node) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Intrinsics.checkNotNullParameter(node, "node");
        SpanFactory spanFactory = visitor.configuration().spansFactory().get(MeasuredImage.class);
        if (spanFactory == null) {
            visitor.visitChildren(node);
            return;
        }
        int length = visitor.length();
        visitor.visitChildren(node);
        if (length == visitor.length()) {
            visitor.builder().append((char) 65532);
        }
        MarkwonConfiguration markwonConfigurationConfiguration = visitor.configuration();
        Intrinsics.checkNotNullExpressionValue(markwonConfigurationConfiguration, "configuration(...)");
        boolean z = node.getParent() instanceof Link;
        String strProcess = markwonConfigurationConfiguration.imageDestinationProcessor().process(node.getDestination());
        Intrinsics.checkNotNullExpressionValue(strProcess, "process(...)");
        RenderProps renderProps = visitor.renderProps();
        Intrinsics.checkNotNullExpressionValue(renderProps, "renderProps(...)");
        renderProps.set(ImageProps.DESTINATION, strProcess);
        renderProps.set(ImageProps.REPLACEMENT_TEXT_IS_LINK, Boolean.valueOf(z));
        renderProps.set(ImageProps.IMAGE_SIZE, null);
        renderProps.set(RhImageProps.INSTANCE.getIMAGE_DIMENSIONS(), node.getDimensions());
        visitor.setSpans(length, spanFactory.getSpans(markwonConfigurationConfiguration, renderProps));
    }
}
