package com.robinhood.android.odyssey.lib.template;

import androidx.core.text.PrecomputedTextCompat;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.odyssey.lib.template.LoadContentRequest;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SdTemplateDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/core/text/PrecomputedTextCompat;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$getContentPrecomputedTextParams$1$1$1", m3645f = "SdTemplateDuxo.kt", m3646l = {EnumC7081g.f2781x2ba65ba3, EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.odyssey.lib.template.SdTemplateDuxo$getContentPrecomputedTextParams$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class SdTemplateDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends PrecomputedTextCompat, ? extends String>>, Object> {
    final /* synthetic */ LoadContentRequest $request;
    int label;
    final /* synthetic */ SdTemplateDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdTemplateDuxo2(LoadContentRequest loadContentRequest, SdTemplateDuxo sdTemplateDuxo, Continuation<? super SdTemplateDuxo2> continuation) {
        super(2, continuation);
        this.$request = loadContentRequest;
        this.this$0 = sdTemplateDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SdTemplateDuxo2(this.$request, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends PrecomputedTextCompat, ? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Tuples2<? extends PrecomputedTextCompat, String>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends PrecomputedTextCompat, String>> continuation) {
        return ((SdTemplateDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r5 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r5 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        PrecomputedTextCompat precomputedTextCompat;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LoadContentRequest loadContentRequest = this.$request;
            if (loadContentRequest instanceof LoadContentRequest.FancyAgreement) {
                this.label = 1;
                obj = this.this$0.getRichNodePrecomputedTextParam((LoadContentRequest.FancyAgreement) loadContentRequest, this);
            } else {
                if (!(loadContentRequest instanceof LoadContentRequest.Markdown)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.label = 2;
                obj = this.this$0.getMarkdownPrecomputedTextParam((LoadContentRequest.Markdown) loadContentRequest, this);
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            precomputedTextCompat = (PrecomputedTextCompat) obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            precomputedTextCompat = (PrecomputedTextCompat) obj;
        }
        return Tuples4.m3642to(precomputedTextCompat, this.$request.getComponentTag());
    }
}
