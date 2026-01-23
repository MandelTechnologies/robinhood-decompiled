package com.robinhood.android.common.p088ui.reference;

import android.text.Spanned;
import com.robinhood.android.common.p088ui.reference.ReferenceManualActivity;
import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.contentful.model.RichNode;
import com.robinhood.staticcontent.model.ReferenceManual;
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

/* compiled from: ReferenceManualActivity.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/ui/reference/ReferenceManualActivity$Adapter$Section;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.ui.reference.ReferenceManualActivity$onCreate$1$1$adapterSections$1$1", m3645f = "ReferenceManualActivity.kt", m3646l = {88}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.ui.reference.ReferenceManualActivity$onCreate$1$1$adapterSections$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class ReferenceManualActivity3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ReferenceManualActivity.Adapter.Section>, Object> {
    final /* synthetic */ ReferenceManual.Section $section;
    int label;
    final /* synthetic */ ReferenceManualActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReferenceManualActivity3(ReferenceManualActivity referenceManualActivity, ReferenceManual.Section section, Continuation<? super ReferenceManualActivity3> continuation) {
        super(2, continuation);
        this.this$0 = referenceManualActivity;
        this.$section = section;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferenceManualActivity3(this.this$0, this.$section, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ReferenceManualActivity.Adapter.Section> continuation) {
        return ((ReferenceManualActivity3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws IOException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ContentRenderer contentRenderer = this.this$0.getContentRenderer();
            RichNode content = this.$section.getContent();
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
        return new ReferenceManualActivity.Adapter.Section(this.$section.getDisplayTitle(), spannedRender);
    }
}
