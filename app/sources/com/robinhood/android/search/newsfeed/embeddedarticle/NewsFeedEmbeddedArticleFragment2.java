package com.robinhood.android.search.newsfeed.embeddedarticle;

import android.text.Spanned;
import androidx.core.text.PrecomputedTextCompat;
import com.plaid.internal.EnumC7081g;
import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.contentful.model.RichNode;
import com.robinhood.models.newsfeed.p334db.NewsFeedEmbeddedContent;
import dispatch.core.Suspend;
import java.io.IOException;
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
import org.commonmark.node.Node;

/* compiled from: NewsFeedEmbeddedArticleFragment.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Landroidx/core/text/PrecomputedTextCompat;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$onViewCreated$3$1$precomputedText$1", m3645f = "NewsFeedEmbeddedArticleFragment.kt", m3646l = {136}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$onViewCreated$3$1$precomputedText$1, reason: use source file name */
/* loaded from: classes5.dex */
final class NewsFeedEmbeddedArticleFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PrecomputedTextCompat>, Object> {
    final /* synthetic */ NewsFeedEmbeddedContent $content;
    final /* synthetic */ PrecomputedTextCompat.Params $precomputedTextParams;
    int label;
    final /* synthetic */ NewsFeedEmbeddedArticleFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewsFeedEmbeddedArticleFragment2(NewsFeedEmbeddedArticleFragment newsFeedEmbeddedArticleFragment, NewsFeedEmbeddedContent newsFeedEmbeddedContent, PrecomputedTextCompat.Params params, Continuation<? super NewsFeedEmbeddedArticleFragment2> continuation) {
        super(2, continuation);
        this.this$0 = newsFeedEmbeddedArticleFragment;
        this.$content = newsFeedEmbeddedContent;
        this.$precomputedTextParams = params;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewsFeedEmbeddedArticleFragment2(this.this$0, this.$content, this.$precomputedTextParams, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PrecomputedTextCompat> continuation) {
        return ((NewsFeedEmbeddedArticleFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: NewsFeedEmbeddedArticleFragment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Landroidx/core/text/PrecomputedTextCompat;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$onViewCreated$3$1$precomputedText$1$1", m3645f = "NewsFeedEmbeddedArticleFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.newsfeed.embeddedarticle.NewsFeedEmbeddedArticleFragment$onViewCreated$3$1$precomputedText$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PrecomputedTextCompat>, Object> {
        final /* synthetic */ NewsFeedEmbeddedContent $content;
        final /* synthetic */ PrecomputedTextCompat.Params $precomputedTextParams;
        int label;
        final /* synthetic */ NewsFeedEmbeddedArticleFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewsFeedEmbeddedArticleFragment newsFeedEmbeddedArticleFragment, NewsFeedEmbeddedContent newsFeedEmbeddedContent, PrecomputedTextCompat.Params params, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = newsFeedEmbeddedArticleFragment;
            this.$content = newsFeedEmbeddedContent;
            this.$precomputedTextParams = params;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$content, this.$precomputedTextParams, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PrecomputedTextCompat> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ContentRenderer contentRenderer = this.this$0.getContentRenderer();
                RichNode content = this.$content.getContent();
                this.label = 1;
                obj = contentRenderer.render(content, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Intrinsics.checkNotNull(obj);
            Spanned spannedRender = this.this$0.getMarkwon().render((Node) obj);
            Intrinsics.checkNotNullExpressionValue(spannedRender, "render(...)");
            return PrecomputedTextCompat.create(spannedRender, this.$precomputedTextParams);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$content, this.$precomputedTextParams, null);
        this.label = 1;
        Object objWithDefault$default = Suspend.withDefault$default(null, anonymousClass1, this, 1, null);
        return objWithDefault$default == coroutine_suspended ? coroutine_suspended : objWithDefault$default;
    }
}
