package com.robinhood.android.microgramsdui;

import com.robinhood.android.microgramsdui.EmbeddedSectionDuxo4;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.EmbeddedSectionContent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.p507ui.p508v1.EmbeddedSectionContentDto;

/* compiled from: EmbeddedSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$init$2$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$init$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class EmbeddedSectionDuxo2 extends ContinuationImpl7 implements Function2<EmbeddedSectionDuxo4, Continuation<? super EmbeddedSectionDuxo4>, Object> {
    final /* synthetic */ UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> $content;
    final /* synthetic */ MicrogramManager2 $instance;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmbeddedSectionDuxo2(UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> uiObject, MicrogramManager2 microgramManager2, Continuation<? super EmbeddedSectionDuxo2> continuation) {
        super(2, continuation);
        this.$content = uiObject;
        this.$instance = microgramManager2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmbeddedSectionDuxo2(this.$content, this.$instance, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EmbeddedSectionDuxo4 embeddedSectionDuxo4, Continuation<? super EmbeddedSectionDuxo4> continuation) {
        return ((EmbeddedSectionDuxo2) create(embeddedSectionDuxo4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new EmbeddedSectionDuxo4.Success(this.$content, this.$instance.getComponent().getResourceLoader());
    }
}
