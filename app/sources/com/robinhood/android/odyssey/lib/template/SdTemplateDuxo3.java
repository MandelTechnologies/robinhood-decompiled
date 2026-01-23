package com.robinhood.android.odyssey.lib.template;

import com.robinhood.android.odyssey.lib.template.LoadContentRequest;
import com.robinhood.api.retrofit.GenericService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SdTemplateDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$getMarkdownPrecomputedTextParam$rawText$1", m3645f = "SdTemplateDuxo.kt", m3646l = {344}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$getMarkdownPrecomputedTextParam$rawText$1, reason: use source file name */
/* loaded from: classes10.dex */
final class SdTemplateDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ LoadContentRequest.Markdown $request;
    int label;
    final /* synthetic */ SdTemplateDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdTemplateDuxo3(SdTemplateDuxo sdTemplateDuxo, LoadContentRequest.Markdown markdown, Continuation<? super SdTemplateDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = sdTemplateDuxo;
        this.$request = markdown;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SdTemplateDuxo3(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((SdTemplateDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GenericService genericService = this.this$0.genericService;
            String markdownUrl = this.$request.getMarkdownUrl();
            this.label = 1;
            obj = genericService.getRaw(markdownUrl, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (!this.$request.getShouldAppendTrailingNewline()) {
            return str;
        }
        return str + "\n";
    }
}
