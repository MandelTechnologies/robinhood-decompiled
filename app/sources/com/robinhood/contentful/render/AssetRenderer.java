package com.robinhood.contentful.render;

import com.robinhood.contentful.model.AssetDetail;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.utils.http.MediaTypeMatcher;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.MediaType;
import okio.Source;
import org.commonmark.node.Node;

/* compiled from: AssetRenderer.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u000bJ$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/contentful/render/AssetRenderer;", "T", "Lcom/robinhood/contentful/model/AssetDetail;", "Lcom/robinhood/utils/http/MediaTypeMatcher;", "render", "Lorg/commonmark/node/Node;", "asset", "Lcom/robinhood/contentful/model/AssetResource;", "source", "Lokio/Source;", "(Lcom/robinhood/contentful/model/AssetResource;Lokio/Source;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Registry", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface AssetRenderer<T extends AssetDetail> extends MediaTypeMatcher {
    Object render(AssetResource<T> assetResource, Source source, Continuation<? super Node> continuation);

    /* compiled from: AssetRenderer.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0016\u0012\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0007\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0005\u0010\bJ!\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0001\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086\u0002R\u0018\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/contentful/render/AssetRenderer$Registry;", "", "renderers", "", "Lcom/robinhood/contentful/render/AssetRenderer;", "<init>", "(Ljava/util/List;)V", "", "([Lcom/robinhood/contentful/render/AssetRenderer;)V", "get", "T", "Lcom/robinhood/contentful/model/AssetDetail;", "mediaType", "Lokhttp3/MediaType;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Registry {
        private final List<AssetRenderer<?>> renderers;

        /* JADX WARN: Multi-variable type inference failed */
        public Registry(List<? extends AssetRenderer<?>> renderers) {
            Intrinsics.checkNotNullParameter(renderers, "renderers");
            this.renderers = renderers;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Registry(AssetRenderer<?>... renderers) {
            this((List<? extends AssetRenderer<?>>) ArraysKt.asList(renderers));
            Intrinsics.checkNotNullParameter(renderers, "renderers");
        }

        public final <T extends AssetDetail> AssetRenderer<T> get(MediaType mediaType) {
            Object next;
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            Iterator<T> it = this.renderers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AssetRenderer) next).matches(mediaType)) {
                    break;
                }
            }
            AssetRenderer<T> assetRenderer = (AssetRenderer) next;
            if (assetRenderer != null) {
                return assetRenderer;
            }
            throw new NoSuchElementException("No renderer for media type \"" + mediaType + "\"; options are: " + this.renderers);
        }
    }
}
