package com.robinhood.android.microgramsdui.control;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.Message;
import microgram.Message3;
import microgram.p507ui.embeddedSection.EmbeddedSectionReady;

/* compiled from: UiInitializer.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/Message;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.RealUiInitializer$startEmbeddedSection$2$response$1", m3645f = "UiInitializer.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.microgramsdui.control.RealUiInitializer$startEmbeddedSection$2$response$1, reason: use source file name */
/* loaded from: classes8.dex */
final class UiInitializer5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Message>, Object> {
    final /* synthetic */ String $launchArgument;
    int label;
    final /* synthetic */ UiInitializer2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UiInitializer5(UiInitializer2 uiInitializer2, String str, Continuation<? super UiInitializer5> continuation) {
        super(2, continuation);
        this.this$0 = uiInitializer2;
        this.$launchArgument = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UiInitializer5(this.this$0, this.$launchArgument, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Message> continuation) {
        return ((UiInitializer5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Message3.encodeToMessage(this.this$0.json, Reflection.typeOf(EmbeddedSectionReady.class), new EmbeddedSectionReady(this.$launchArgument));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
