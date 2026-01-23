package com.robinhood.contentful.render;

import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.GenericDetail;
import dispatch.core.Suspend;
import java.io.InputStreamReader;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okio.Okio;
import okio.Source;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;

/* compiled from: MarkdownAssetRenderer.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/contentful/render/MarkdownAssetRenderer;", "Lcom/robinhood/contentful/render/AssetRenderer;", "Lcom/robinhood/contentful/model/GenericDetail;", "parser", "Lorg/commonmark/parser/Parser;", "<init>", "(Lorg/commonmark/parser/Parser;)V", "matches", "", "mediaType", "Lokhttp3/MediaType;", "render", "Lorg/commonmark/node/Node;", "asset", "Lcom/robinhood/contentful/model/AssetResource;", "source", "Lokio/Source;", "(Lcom/robinhood/contentful/model/AssetResource;Lokio/Source;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class MarkdownAssetRenderer implements AssetRenderer<GenericDetail> {
    private static final Set<String> SUPPORTED_TEXT_SUBTYPES = SetsKt.setOf((Object[]) new String[]{InstantRetirementAgreementComponents.MarkdownTag, "x-markdown"});
    private final Parser parser;

    /* compiled from: MarkdownAssetRenderer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.render.MarkdownAssetRenderer", m3645f = "MarkdownAssetRenderer.kt", m3646l = {27}, m3647m = "render")
    /* renamed from: com.robinhood.contentful.render.MarkdownAssetRenderer$render$1 */
    static final class C327531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C327531(Continuation<? super C327531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MarkdownAssetRenderer.this.render(null, null, this);
        }
    }

    public MarkdownAssetRenderer(Parser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
    }

    @Override // com.robinhood.utils.http.MediaTypeMatcher
    public boolean matches(MediaType mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return Intrinsics.areEqual(mediaType.getType(), "text") && SUPPORTED_TEXT_SUBTYPES.contains(mediaType.getSubtype());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.contentful.render.AssetRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object render(AssetResource<GenericDetail> assetResource, Source source, Continuation<? super Node> continuation) {
        C327531 c327531;
        if (continuation instanceof C327531) {
            c327531 = (C327531) continuation;
            int i = c327531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327531.label = i - Integer.MIN_VALUE;
            } else {
                c327531 = new C327531(continuation);
            }
        }
        Object objWithIO$default = c327531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327531.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithIO$default);
            C327542 c327542 = new C327542(source, null);
            c327531.label = 1;
            objWithIO$default = Suspend.withIO$default(null, c327542, c327531, 1, null);
            if (objWithIO$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithIO$default);
        }
        Intrinsics.checkNotNull(objWithIO$default);
        return objWithIO$default;
    }

    /* compiled from: MarkdownAssetRenderer.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lorg/commonmark/node/Node;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.render.MarkdownAssetRenderer$render$2", m3645f = "MarkdownAssetRenderer.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.contentful.render.MarkdownAssetRenderer$render$2 */
    static final class C327542 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Node>, Object> {
        final /* synthetic */ Source $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C327542(Source source, Continuation<? super C327542> continuation) {
            super(2, continuation);
            this.$source = source;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarkdownAssetRenderer.this.new C327542(this.$source, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Node> continuation) {
            return ((C327542) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return MarkdownAssetRenderer.this.parser.parseReader(new InputStreamReader(Okio.buffer(this.$source).inputStream(), Charsets.UTF_8));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public String toString() {
        return MarkdownAssetRenderer.class.getSimpleName() + "(text/markdown,text/x-markdown)";
    }
}
