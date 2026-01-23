package io.noties.markwon;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import io.noties.markwon.Markwon;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;

/* loaded from: classes14.dex */
class MarkwonImpl extends Markwon {
    private final TextView.BufferType bufferType;
    private final MarkwonConfiguration configuration;
    private final boolean fallbackToRawInputWhenEmpty;
    private final Parser parser;
    private final List<MarkwonPlugin> plugins;
    private final MarkwonVisitorFactory visitorFactory;

    MarkwonImpl(TextView.BufferType bufferType, Markwon.TextSetter textSetter, Parser parser, MarkwonVisitorFactory markwonVisitorFactory, MarkwonConfiguration markwonConfiguration, List<MarkwonPlugin> list, boolean z) {
        this.bufferType = bufferType;
        this.parser = parser;
        this.visitorFactory = markwonVisitorFactory;
        this.configuration = markwonConfiguration;
        this.plugins = list;
        this.fallbackToRawInputWhenEmpty = z;
    }

    @Override // io.noties.markwon.Markwon
    /* renamed from: parse */
    public Node mo17577parse(String str) {
        Iterator<MarkwonPlugin> it = this.plugins.iterator();
        while (it.hasNext()) {
            str = it.next().processMarkdown(str);
        }
        return this.parser.parse(str);
    }

    @Override // io.noties.markwon.Markwon
    public Spanned render(Node node) {
        Iterator<MarkwonPlugin> it = this.plugins.iterator();
        while (it.hasNext()) {
            it.next().beforeRender(node);
        }
        MarkwonVisitor markwonVisitorCreate = this.visitorFactory.create();
        node.accept(markwonVisitorCreate);
        Iterator<MarkwonPlugin> it2 = this.plugins.iterator();
        while (it2.hasNext()) {
            it2.next().afterRender(node, markwonVisitorCreate);
        }
        return markwonVisitorCreate.builder().spannableStringBuilder();
    }

    @Override // io.noties.markwon.Markwon
    public Spanned toMarkdown(String str) {
        Spanned spannedRender = render(mo17577parse(str));
        return (TextUtils.isEmpty(spannedRender) && this.fallbackToRawInputWhenEmpty && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : spannedRender;
    }

    @Override // io.noties.markwon.Markwon
    /* renamed from: setMarkdown */
    public void mo17580setMarkdown(TextView textView, String str) {
        setParsedMarkdown(textView, toMarkdown(str));
    }

    @Override // io.noties.markwon.Markwon
    public void setParsedMarkdown(TextView textView, Spanned spanned) {
        Iterator<MarkwonPlugin> it = this.plugins.iterator();
        while (it.hasNext()) {
            it.next().beforeSetText(textView, spanned);
        }
        textView.setText(spanned, this.bufferType);
        Iterator<MarkwonPlugin> it2 = this.plugins.iterator();
        while (it2.hasNext()) {
            it2.next().afterSetText(textView);
        }
    }

    @Override // io.noties.markwon.Markwon
    /* renamed from: hasPlugin */
    public boolean mo17576hasPlugin(Class<? extends MarkwonPlugin> cls) {
        return getPlugin(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [io.noties.markwon.MarkwonPlugin, java.lang.Object] */
    @Override // io.noties.markwon.Markwon
    public <P extends MarkwonPlugin> P getPlugin(Class<P> cls) {
        P p = null;
        for (MarkwonPlugin markwonPlugin : this.plugins) {
            if (cls.isAssignableFrom(markwonPlugin.getClass())) {
                p = markwonPlugin;
            }
        }
        return p;
    }

    @Override // io.noties.markwon.Markwon
    public <P extends MarkwonPlugin> P requirePlugin(Class<P> cls) {
        P p = (P) getPlugin(cls);
        if (p != null) {
            return p;
        }
        throw new IllegalStateException(String.format(Locale.US, "Requested plugin `%s` is not registered with this Markwon instance", cls.getName()));
    }

    @Override // io.noties.markwon.Markwon
    /* renamed from: getPlugins */
    public List<? extends MarkwonPlugin> mo17575getPlugins() {
        return Collections.unmodifiableList(this.plugins);
    }

    @Override // io.noties.markwon.Markwon
    public MarkwonConfiguration configuration() {
        return this.configuration;
    }
}
