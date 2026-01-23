package com.robinhood.android.markdown.util;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import com.robinhood.android.markdown.Markwon2;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.utils.extensions.SinglesAndroid;
import io.noties.markwon.Markwon;
import io.reactivex.Completable;
import io.reactivex.functions.Consumer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* compiled from: TextViews.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"loadMarkdownFromRawResource", "Lio/reactivex/Completable;", "Landroid/widget/TextView;", "resId", "", "charset", "Ljava/nio/charset/Charset;", "lib-markdown_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TextViewsKt {
    public static /* synthetic */ Completable loadMarkdownFromRawResource$default(TextView textView, int i, Charset charset, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        return loadMarkdownFromRawResource(textView, i, charset);
    }

    public static final Completable loadMarkdownFromRawResource(final TextView textView, int i, Charset charset) {
        ComponentCallbacks2 componentCallbacks2;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        final Markwon markwon = ((MarkwonEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).getMarkwon();
        Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Completable completableIgnoreElement = SinglesAndroid.observeOnMainThread(Markwon2.loadRawResource(markwon, context2, i, charset)).doOnSuccess(new Consumer() { // from class: com.robinhood.android.markdown.util.TextViewsKt.loadMarkdownFromRawResource.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Spanned spanned) {
                markwon.setParsedMarkdown(textView, spanned);
            }
        }).ignoreElement();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElement, "ignoreElement(...)");
        return completableIgnoreElement;
    }
}
