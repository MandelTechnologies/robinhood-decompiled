package com.robinhood.android.common.onboarding.p085ui;

import android.text.Spanned;
import androidx.core.text.PrecomputedTextCompat;
import com.plaid.internal.EnumC7081g;
import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.Agreement;
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

/* compiled from: BaseAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Landroidx/core/text/PrecomputedTextCompat;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadMarkdownText$2$precomputedText$1", m3645f = "BaseAgreementFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadMarkdownText$2$precomputedText$1, reason: use source file name */
/* loaded from: classes2.dex */
final class BaseAgreementFragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PrecomputedTextCompat>, Object> {
    final /* synthetic */ Agreement $agreement;
    Object L$0;
    int label;
    final /* synthetic */ BaseAgreementFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseAgreementFragment3(BaseAgreementFragment baseAgreementFragment, Agreement agreement, Continuation<? super BaseAgreementFragment3> continuation) {
        super(2, continuation);
        this.this$0 = baseAgreementFragment;
        this.$agreement = agreement;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseAgreementFragment3(this.this$0, this.$agreement, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PrecomputedTextCompat> continuation) {
        return ((BaseAgreementFragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws IOException {
        BaseAgreementFragment3 baseAgreementFragment3;
        PrecomputedTextCompat.Params params;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PrecomputedTextCompat.Params textMetricsParams = this.this$0.getAgreementView().getTextMetricsParams();
            ContentRenderer contentRenderer = this.this$0.getContentRenderer();
            ResourceLink<AssetResource<?>> markdownContent = this.$agreement.getMarkdownContent();
            this.L$0 = textMetricsParams;
            this.label = 1;
            baseAgreementFragment3 = this;
            Object objRenderAssetLink$default = ContentRenderer.renderAssetLink$default(contentRenderer, markdownContent, null, baseAgreementFragment3, 2, null);
            if (objRenderAssetLink$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            params = textMetricsParams;
            obj = objRenderAssetLink$default;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (PrecomputedTextCompat.Params) this.L$0;
            ResultKt.throwOnFailure(obj);
            baseAgreementFragment3 = this;
        }
        Spanned spannedRender = baseAgreementFragment3.this$0.getMarkwon().render((Node) obj);
        Intrinsics.checkNotNullExpressionValue(spannedRender, "render(...)");
        return PrecomputedTextCompat.create(spannedRender, params);
    }
}
