package com.robinhood.android.safetylabels.p247ui;

import com.robinhood.android.safetylabels.p247ui.SafetyLabelsLessonDataState;
import com.robinhood.shared.models.p387db.bonfire.education.safetylabels.SafetyLabelsLesson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SafetyLabelsLessonDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.safetylabels.ui.SafetyLabelsLessonDuxo$onStart$1$1", m3645f = "SafetyLabelsLessonDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.safetylabels.ui.SafetyLabelsLessonDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SafetyLabelsLessonDuxo2 extends ContinuationImpl7 implements Function2<SafetyLabelsLessonDataState, Continuation<? super SafetyLabelsLessonDataState>, Object> {
    final /* synthetic */ SafetyLabelsLesson $lesson;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SafetyLabelsLessonDuxo2(SafetyLabelsLesson safetyLabelsLesson, Continuation<? super SafetyLabelsLessonDuxo2> continuation) {
        super(2, continuation);
        this.$lesson = safetyLabelsLesson;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SafetyLabelsLessonDuxo2 safetyLabelsLessonDuxo2 = new SafetyLabelsLessonDuxo2(this.$lesson, continuation);
        safetyLabelsLessonDuxo2.L$0 = obj;
        return safetyLabelsLessonDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SafetyLabelsLessonDataState safetyLabelsLessonDataState, Continuation<? super SafetyLabelsLessonDataState> continuation) {
        return ((SafetyLabelsLessonDuxo2) create(safetyLabelsLessonDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SafetyLabelsLessonDataState.copy$default((SafetyLabelsLessonDataState) this.L$0, new SafetyLabelsLessonDataState.Status.Success(this.$lesson), false, 2, null);
    }
}
