package com.robinhood.contentful.markdown;

import com.plaid.internal.EnumC7081g;
import com.robinhood.contentful.model.RichNode;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.commonmark.node.Node;

/* compiled from: ContentRenderer.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "Lorg/commonmark/node/Node;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer$appendChildrenFrom$childContentAsync$1$1", m3645f = "ContentRenderer.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.contentful.markdown.ContentRenderer$appendChildrenFrom$childContentAsync$1$1, reason: use source file name */
/* loaded from: classes15.dex */
final class ContentRenderer2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Deferred<? extends Node>>, Object> {
    final /* synthetic */ RichNode $childNode;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentRenderer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentRenderer2(ContentRenderer contentRenderer, RichNode richNode, Continuation<? super ContentRenderer2> continuation) {
        super(2, continuation);
        this.this$0 = contentRenderer;
        this.$childNode = richNode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContentRenderer2 contentRenderer2 = new ContentRenderer2(this.this$0, this.$childNode, continuation);
        contentRenderer2.L$0 = obj;
        return contentRenderer2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Deferred<? extends Node>> continuation) {
        return ((ContentRenderer2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: ContentRenderer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lorg/commonmark/node/Node;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.markdown.ContentRenderer$appendChildrenFrom$childContentAsync$1$1$1", m3645f = "ContentRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.contentful.markdown.ContentRenderer$appendChildrenFrom$childContentAsync$1$1$1 */
    static final class C327361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Node>, Object> {
        final /* synthetic */ RichNode $childNode;
        int label;
        final /* synthetic */ ContentRenderer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C327361(ContentRenderer contentRenderer, RichNode richNode, Continuation<? super C327361> continuation) {
            super(2, continuation);
            this.this$0 = contentRenderer;
            this.$childNode = richNode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C327361(this.this$0, this.$childNode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Node> continuation) {
            return ((C327361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ContentRenderer contentRenderer = this.this$0;
            RichNode richNode = this.$childNode;
            this.label = 1;
            Object objRender = contentRenderer.render(richNode, this);
            return objRender == coroutine_suspended ? coroutine_suspended : objRender;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new C327361(this.this$0, this.$childNode, null), 3, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
