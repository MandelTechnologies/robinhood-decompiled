package com.robinhood.contentful.render;

import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.GenericDetail;
import dispatch.core.Suspend;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okio.Okio;
import okio.Source;
import org.commonmark.node.Text;

/* compiled from: PlainTextRenderer.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/contentful/render/PlainTextRenderer;", "Lcom/robinhood/contentful/render/AssetRenderer;", "Lcom/robinhood/contentful/model/GenericDetail;", "<init>", "()V", "matches", "", "mediaType", "Lokhttp3/MediaType;", "render", "Lorg/commonmark/node/Text;", "asset", "Lcom/robinhood/contentful/model/AssetResource;", "source", "Lokio/Source;", "(Lcom/robinhood/contentful/model/AssetResource;Lokio/Source;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PlainTextRenderer implements AssetRenderer<GenericDetail> {
    public static final PlainTextRenderer INSTANCE = new PlainTextRenderer();

    private PlainTextRenderer() {
    }

    @Override // com.robinhood.utils.http.MediaTypeMatcher
    public boolean matches(MediaType mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return Intrinsics.areEqual(mediaType.getType(), "text");
    }

    /* compiled from: PlainTextRenderer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lorg/commonmark/node/Text;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.render.PlainTextRenderer$render$2", m3645f = "PlainTextRenderer.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.contentful.render.PlainTextRenderer$render$2 */
    static final class C327552 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Text>, Object> {
        final /* synthetic */ Source $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C327552(Source source, Continuation<? super C327552> continuation) {
            super(2, continuation);
            this.$source = source;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C327552(this.$source, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Text> continuation) {
            return ((C327552) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Text(Okio.buffer(this.$source).readUtf8());
        }
    }

    @Override // com.robinhood.contentful.render.AssetRenderer
    public Object render(AssetResource<GenericDetail> assetResource, Source source, Continuation<? super Text> continuation) {
        return Suspend.withIO$default(null, new C327552(source, null), continuation, 1, null);
    }

    public String toString() {
        return PlainTextRenderer.class.getSimpleName() + "(text/*)";
    }
}
