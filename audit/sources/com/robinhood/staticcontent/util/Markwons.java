package com.robinhood.staticcontent.util;

import android.text.Spanned;
import com.robinhood.android.markdown.RhMarkwonPlugin;
import com.robinhood.contentful.markdown.MarkdownContent;
import io.noties.markwon.Markwon;
import io.noties.markwon.MarkwonPlugin;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Markwons.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006\u001a\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n*\u00020\u0002¨\u0006\u000b"}, m3636d2 = {"toSpanned", "Landroid/text/Spanned;", "Lio/noties/markwon/Markwon;", "markdownContent", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "formatArguments", "", "", "", "linkClicks", "Lio/reactivex/Observable;", "lib-static-content_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.staticcontent.util.MarkwonsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Markwons {
    public static /* synthetic */ Spanned toSpanned$default(Markwon markwon, MarkdownContent markdownContent, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return toSpanned(markwon, markdownContent, map);
    }

    public static final Spanned toSpanned(Markwon markwon, MarkdownContent markdownContent, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(markwon, "<this>");
        Intrinsics.checkNotNullParameter(markdownContent, "markdownContent");
        if (map == null) {
            Spanned markdown = markwon.toMarkdown(markdownContent.getRaw());
            Intrinsics.checkNotNull(markdown);
            return markdown;
        }
        Spanned markdown2 = markwon.toMarkdown(markdownContent.formatWith(map).getRaw());
        Intrinsics.checkNotNull(markdown2);
        return markdown2;
    }

    public static final Observable<String> linkClicks(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<this>");
        MarkwonPlugin plugin = markwon.getPlugin(RhMarkwonPlugin.class);
        Intrinsics.checkNotNull(plugin);
        return ((RhMarkwonPlugin) plugin).linkClicks();
    }
}
