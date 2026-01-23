package com.robinhood.android.markdown;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import io.noties.markwon.Markwon;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.SpanFactory;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;
import kotlin.p481io.ReadWrite2;
import kotlin.text.Charsets;
import org.commonmark.node.Node;

/* compiled from: Markwon.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001aV\u0010\n\u001a\u00020\u000b\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\r*\u00020\u000b28\b\u0004\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u000fH\u0086\bø\u0001\u0000\u001a)\u0010\u0016\u001a\u00020\u000b\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\r*\u00020\u000b2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\f0\u0017H\u0086\b\u001a#\u0010\u0018\u001a\u00020\u0019\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\r*\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0086\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, m3636d2 = {"loadRawResource", "Lio/reactivex/Single;", "Landroid/text/Spanned;", "Lio/noties/markwon/Markwon;", "context", "Landroid/content/Context;", "resId", "", "charset", "Ljava/nio/charset/Charset;", "on", "Lio/noties/markwon/MarkwonVisitor$Builder;", "N", "Lorg/commonmark/node/Node;", "visit", "Lkotlin/Function2;", "Lio/noties/markwon/MarkwonVisitor;", "Lkotlin/ParameterName;", "name", "visitor", "node", "", "register", "Lio/noties/markwon/MarkwonVisitor$NodeVisitor;", "setFactory", "Lio/noties/markwon/MarkwonSpansFactory$Builder;", "factory", "Lio/noties/markwon/SpanFactory;", "lib-markdown_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.markdown.MarkwonKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Markwon2 {
    @JvmOverloads
    public static final Single<Spanned> loadRawResource(Markwon markwon, Context context, int i) {
        Intrinsics.checkNotNullParameter(markwon, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return loadRawResource$default(markwon, context, i, null, 4, null);
    }

    public static /* synthetic */ Single loadRawResource$default(Markwon markwon, Context context, int i, Charset charset, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return loadRawResource(markwon, context, i, charset);
    }

    @JvmOverloads
    public static final Single<Spanned> loadRawResource(final Markwon markwon, final Context context, final int i, final Charset charset) {
        Intrinsics.checkNotNullParameter(markwon, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Single<Spanned> map = Single.fromCallable(new Callable() { // from class: com.robinhood.android.markdown.MarkwonKt.loadRawResource.1
            @Override // java.util.concurrent.Callable
            public final String call() throws Resources.NotFoundException {
                InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, charset), 8192);
                try {
                    String text = ReadWrite2.readText(bufferedReader);
                    Closeable.closeFinally(bufferedReader, null);
                    return text;
                } finally {
                }
            }
        }).subscribeOn(Schedulers.m3346io()).observeOn(Schedulers.computation()).map(new Function() { // from class: com.robinhood.android.markdown.MarkwonKt.loadRawResource.2
            @Override // io.reactivex.functions.Function
            public final Spanned apply(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                Markwon markwon2 = markwon;
                return markwon2.render(markwon2.mo17577parse(text));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* renamed from: on */
    public static final /* synthetic */ <N extends Node> MarkwonVisitor.Builder m2163on(MarkwonVisitor.Builder builder, final Function2<? super MarkwonVisitor, ? super Node, Unit> visit) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(visit, "visit");
        Intrinsics.reifiedOperationMarker(4, "N");
        MarkwonVisitor.Builder builderMo3341on = builder.mo3341on(Node.class, new MarkwonVisitor.NodeVisitor() { // from class: com.robinhood.android.markdown.MarkwonKt.on.1
            @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
            public final void visit(MarkwonVisitor visitor, N node) {
                Intrinsics.checkNotNullParameter(visitor, "visitor");
                Intrinsics.checkNotNullParameter(node, "node");
                visit.invoke(visitor, node);
            }
        });
        Intrinsics.checkNotNullExpressionValue(builderMo3341on, "on(...)");
        return builderMo3341on;
    }

    public static final /* synthetic */ <N extends Node> MarkwonVisitor.Builder register(MarkwonVisitor.Builder builder, MarkwonVisitor.NodeVisitor<? super N> visitor) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Intrinsics.reifiedOperationMarker(4, "N");
        MarkwonVisitor.Builder builderMo3341on = builder.mo3341on(Node.class, visitor);
        Intrinsics.checkNotNullExpressionValue(builderMo3341on, "on(...)");
        return builderMo3341on;
    }

    public static final /* synthetic */ <N extends Node> MarkwonSpansFactory.Builder setFactory(MarkwonSpansFactory.Builder builder, SpanFactory spanFactory) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.reifiedOperationMarker(4, "N");
        MarkwonSpansFactory.Builder factory = builder.setFactory(Node.class, spanFactory);
        Intrinsics.checkNotNullExpressionValue(factory, "setFactory(...)");
        return factory;
    }
}
