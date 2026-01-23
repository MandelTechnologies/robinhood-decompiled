package io.noties.markwon;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import io.noties.markwon.core.CorePlugin;
import java.util.List;
import org.commonmark.node.Node;

/* loaded from: classes14.dex */
public abstract class Markwon {

    public interface Builder {
        Markwon build();

        Builder usePlugin(MarkwonPlugin markwonPlugin);
    }

    public interface TextSetter {
    }

    public abstract MarkwonConfiguration configuration();

    public abstract <P extends MarkwonPlugin> P getPlugin(Class<P> cls);

    /* renamed from: getPlugins */
    public abstract List<? extends MarkwonPlugin> mo17575getPlugins();

    /* renamed from: hasPlugin */
    public abstract boolean mo17576hasPlugin(Class<? extends MarkwonPlugin> cls);

    /* renamed from: parse */
    public abstract Node mo17577parse(String str);

    public abstract Spanned render(Node node);

    public abstract <P extends MarkwonPlugin> P requirePlugin(Class<P> cls);

    /* renamed from: setMarkdown */
    public abstract void mo17580setMarkdown(TextView textView, String str);

    public abstract void setParsedMarkdown(TextView textView, Spanned spanned);

    public abstract Spanned toMarkdown(String str);

    public static Markwon create(Context context) {
        return builder(context).usePlugin(CorePlugin.create()).build();
    }

    public static Builder builder(Context context) {
        return new MarkwonBuilderImpl(context).usePlugin(CorePlugin.create());
    }

    public static Builder builderNoCore(Context context) {
        return new MarkwonBuilderImpl(context);
    }
}
