package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.api.ApiOptionCancelExerciseRequest;
import com.robinhood.models.api.ApiOptionEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionExerciseStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionEvent;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionExerciseStore$cancelOptionExercise$1", m3645f = "OptionExerciseStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionExerciseStore$cancelOptionExercise$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionExerciseStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends String>, Continuation<? super ApiOptionEvent>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionExerciseStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionExerciseStore2(OptionExerciseStore optionExerciseStore, Continuation<? super OptionExerciseStore2> continuation) {
        super(2, continuation);
        this.this$0 = optionExerciseStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionExerciseStore2 optionExerciseStore2 = new OptionExerciseStore2(this.this$0, continuation);
        optionExerciseStore2.L$0 = obj;
        return optionExerciseStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends String> tuples2, Continuation<? super ApiOptionEvent> continuation) {
        return invoke2((Tuples2<UUID, String>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, String> tuples2, Continuation<? super ApiOptionEvent> continuation) {
        return ((OptionExerciseStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        UUID uuid = (UUID) tuples2.component1();
        String str = (String) tuples2.component2();
        OptionsApi optionsApi = this.this$0.getOptionsApi();
        ApiOptionCancelExerciseRequest apiOptionCancelExerciseRequest = new ApiOptionCancelExerciseRequest(str);
        this.label = 1;
        Object objCancelOptionExercise = optionsApi.cancelOptionExercise(uuid, apiOptionCancelExerciseRequest, this);
        return objCancelOptionExercise == coroutine_suspended ? coroutine_suspended : objCancelOptionExercise;
    }
}
