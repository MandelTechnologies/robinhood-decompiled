package com.robinhood.android.common.onboarding.p085ui;

import androidx.core.text.PrecomputedTextCompat;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BaseAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Landroidx/core/text/PrecomputedTextCompat;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadIdentiMarkdownText$2$precomputedText$1", m3645f = "BaseAgreementFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadIdentiMarkdownText$2$precomputedText$1, reason: use source file name */
/* loaded from: classes2.dex */
final class BaseAgreementFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PrecomputedTextCompat>, Object> {
    final /* synthetic */ UiAgreementWithContent $agreement;
    int label;
    final /* synthetic */ BaseAgreementFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseAgreementFragment2(BaseAgreementFragment baseAgreementFragment, UiAgreementWithContent uiAgreementWithContent, Continuation<? super BaseAgreementFragment2> continuation) {
        super(2, continuation);
        this.this$0 = baseAgreementFragment;
        this.$agreement = uiAgreementWithContent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseAgreementFragment2(this.this$0, this.$agreement, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PrecomputedTextCompat> continuation) {
        return ((BaseAgreementFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PrecomputedTextCompat.create(this.this$0.getMarkwon().toMarkdown(this.$agreement.getContent()), this.this$0.getAgreementView().getTextMetricsParams());
    }
}
